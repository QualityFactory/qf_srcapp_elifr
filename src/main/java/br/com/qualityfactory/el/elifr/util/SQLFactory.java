package br.com.qualityfactory.el.elifr.util;
/**
 * 
 * @author eduardodicarte
 *
 */

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import br.com.qualityfactory.el.elifr.domain.Model;

public class SQLFactory {
	private static CriteriaBuilder builder;

	@SuppressWarnings("unchecked")
	public static CriteriaQuery<Model> getQuery(EntityManager manager, Model model) {
		return (CriteriaQuery<Model>) getBuilder(manager).createQuery(model.getClass());
	}

	public static CriteriaBuilder getBuilder(EntityManager manager) {
		if (builder == null) {
			builder = manager.getCriteriaBuilder();
		}

		return builder;
	}
	
	public static Collection<Model> doSelect(EntityManager manager, CriteriaQuery<Model> query, Root<Model> variableRoot) {
		query.select(variableRoot);
		return (Collection<Model>) manager.createQuery(query).getResultList();
	}
	
	
	@SuppressWarnings("unchecked")
	public static Root<Model> doFrom(Model model, CriteriaQuery<Model> query) {
		return (Root<Model>) query.from(model.getClass());
	}
}
