/**
 * Token para implementação de segurança entre as transações e validação de sessão
 * 
 * @author eduardodicarte
 *
 */

package br.com.qualityfactory.el.elifr.vo;

import lombok.Data;

@Data
public class Token {

	/**
	 * Chave que deverá ser convertida em array de bytes e vinculada ao Request
	 * e Response
	 */
	private byte[] key;
}