package br.com.qualityfactory.el.elifr.service.session;

/**
 * Service que manterá a segurança para as sessões de todas as camadas
 * 
 * @author eduardodicarte
 *
 */
public interface SessionService {
	
	/**
	 * Implementação do service
	 * @return Retorna a implementação do service
	 */
	public default SessionService getInstance() {
		return new SessionServiceImpl();
	}
}
