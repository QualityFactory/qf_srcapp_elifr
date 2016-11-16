package br.com.qualityfactory.el.elifr.service.session;

/**
 * Service que manter� a seguran�a para as sess�es de todas as camadas
 * 
 * @author eduardodicarte
 *
 */
public interface SessionService {
	
	/**
	 * Implementa��o do service
	 * @return Retorna a implementa��o do service
	 */
	public default SessionService getInstance() {
		return new SessionServiceImpl();
	}
}
