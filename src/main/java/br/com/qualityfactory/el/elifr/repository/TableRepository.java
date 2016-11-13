/**
 * 
 * @author eduardodicarte
 *
 */

package br.com.qualityfactory.el.elifr.repository;

import java.util.Collection;

import br.com.qualityfactory.el.elifr.domain.Model;
import br.com.qualityfactory.el.elifr.exception.ArchitectureELException;
import br.com.qualityfactory.el.elifr.exception.DataBaseELException;

public interface TableRepository {
	public Collection<Model> listAllModels(Model model);

	public Model findModelByParam(Model model) throws DataBaseELException, ArchitectureELException;
}
