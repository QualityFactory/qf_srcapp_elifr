/**
 * Service para interação com o banco de dados
 * 
 * @author eduardodicarte
 *
 */

package br.com.qualityfactory.el.elifr.service.database.table;

import java.util.Collection;

import br.com.qualityfactory.el.elifr.domain.Model;
import br.com.qualityfactory.el.elifr.exception.ArchitectureELException;
import br.com.qualityfactory.el.elifr.exception.DataBaseELException;

public interface TableService {

	/**
	 * Recupera todos os registros no banco de dados da entidade passada via
	 * parametro
	 * 
	 * @param model
	 *            Implementação da entidade da qual se quer recuperar os dados
	 * @return Retorna uma coleção dos models recuperados do banco de dados
	 */
	public Collection<Model> listAll(Model model);

	/**
	 * Recupera o registro no banco de dados da entidade passada via parametro
	 * 
	 * @param model
	 *            Implementação da entidade
	 * @return Retorna o model com os registros encontrados
	 * @throws DataBaseELException
	 *             Exception gerada durante a recuperação de dados via banco
	 * @throws ArchitectureELException
	 *             Exception gerada durante a recuperação de dados via
	 *             reflection
	 */
	public Model findByParam(Model model) throws DataBaseELException, ArchitectureELException;
}
