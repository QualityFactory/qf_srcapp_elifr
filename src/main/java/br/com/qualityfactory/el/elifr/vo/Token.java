/**
 * Token para implementa��o de seguran�a entre as transa��es e valida��o de sess�o
 * 
 * @author eduardodicarte
 *
 */

package br.com.qualityfactory.el.elifr.vo;

import lombok.Data;

@Data
public class Token {

	/**
	 * Chave que dever� ser convertida em array de bytes e vinculada ao Request
	 * e Response
	 */
	private byte[] key;
}