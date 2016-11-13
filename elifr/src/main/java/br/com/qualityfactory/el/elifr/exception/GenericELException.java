/**
 * 
 * @author eduardodicarte
 *
 */

package br.com.qualityfactory.el.elifr.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
class GenericELException extends Exception {

	private static final long serialVersionUID = 1L;

	private Exception originalException;
	private String message;

	GenericELException(Exception originalException) {
		this.message = originalException.getMessage();
		this.originalException = originalException;
	}

	GenericELException(String message) {
		this.message = message;
	}
}
