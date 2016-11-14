/**
 * Implementação do service para as transações com o banco de dados
 * 
 * @author eduardodicarte
 *
 */

package br.com.qualityfactory.el.elifr.service.table;

import java.util.Collection;

import javax.inject.Inject;

import br.com.qualityfactory.el.elifr.domain.Model;
import br.com.qualityfactory.el.elifr.exception.ArchitectureELException;
import br.com.qualityfactory.el.elifr.exception.DataBaseELException;
import br.com.qualityfactory.el.elifr.repository.TableRepository;

class TableServiceImpl implements TableService {

	@Inject
	private TableRepository repository;

	@Override
	public Collection<Model> listAll(Model model) {
		return repository.listAllModels(model);
	}

	@Override
	public Model findByParam(Model model) throws DataBaseELException, ArchitectureELException {
		return repository.findModelByParam(model);
	}
}
