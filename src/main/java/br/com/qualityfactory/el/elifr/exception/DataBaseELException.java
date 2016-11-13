package br.com.qualityfactory.el.elifr.exception;

/**
 * Exception para erros de banco de dados capturados pelo JPA
 * @author eduardodicarte
 *
 */

public class DataBaseELException extends GenericELException {

	private static final long serialVersionUID = 1L;

	public DataBaseELException(Exception originalException) {
		super(originalException);
	}
	
	public DataBaseELException(String message) {
		super(message);
	}
}
