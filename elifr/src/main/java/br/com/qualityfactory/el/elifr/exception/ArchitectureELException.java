package br.com.qualityfactory.el.elifr.exception;

/**
 * Exception para erros durante a obtenção de dados via reflection
 * 
 * @author eduardodicarte
 *
 */

public class ArchitectureELException extends GenericELException {

	private static final long serialVersionUID = 1L;

	public ArchitectureELException(Exception originalException) {
		super(originalException);
	}

	public ArchitectureELException(String message) {
		super(message);
	}
}
