/**
 * 
 * @author eduardodicarte
 * 
 */

package br.com.qualityfactory.el.elifr.repository;

import java.lang.reflect.Field;
import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import br.com.qualityfactory.el.elifr.domain.Model;
import br.com.qualityfactory.el.elifr.exception.ArchitectureELException;
import br.com.qualityfactory.el.elifr.exception.DataBaseELException;
import br.com.qualityfactory.el.elifr.util.IfrUtil;
import br.com.qualityfactory.el.elifr.util.SQLFactory;


class TableRepositoryImpl implements TableRepository {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Collection<Model> listAllModels(Model model) {
		CriteriaQuery<Model> query = SQLFactory.getQuery(manager, model);
		Root<Model> variableRoot = SQLFactory.doFrom(model, query);

		return SQLFactory.doSelect(manager, query, variableRoot);
	}

	@Override
	public Model findModelByParam(Model model) throws DataBaseELException, ArchitectureELException {
		CriteriaBuilder builder = SQLFactory.getBuilder(manager);

		Collection<Field> fields = IfrUtil.getFieldsModel(model);

		CriteriaQuery<Model> query = SQLFactory.getQuery(manager, model);

		Root<Model> variableRoot = SQLFactory.doFrom(model, query);

		try {

			for (Field field : fields) {
				query.select(variableRoot).where(builder.equal(variableRoot.get(field.getName()), field.get(model)));
			}

			return manager.createQuery(query).getSingleResult();

		} catch (IllegalArgumentException | IllegalAccessException illegalException) {
			throw new ArchitectureELException(illegalException);
		} catch (NoResultException noResultException) {
			throw new DataBaseELException(noResultException);
		}
	}
}
