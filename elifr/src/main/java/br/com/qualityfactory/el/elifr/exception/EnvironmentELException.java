/**
 * 
 * @author eduardodicarte
 *
 */

package br.com.qualityfactory.el.elifr.exception;

public class EnvironmentELException extends GenericELException {

	private static final long serialVersionUID = 1L;

	public EnvironmentELException(Exception originalException) {
		super(originalException);
	}

	public EnvironmentELException(String message) {
		super(message);
	}
}
