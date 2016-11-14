package br.com.qualityfactory.el.elifr.vo;

import br.com.qualityfactory.el.elifr.vo.enums.EnumMessageType;
import lombok.Data;

/**
 * Classe que irá mostrar a mensagem de status da request
 * 
 * @author eduardodicarte
 *
 */

@Data
public class Message {
	/**
	 * Tipo da mensagem
	 */
	private EnumMessageType messageType;

	/**
	 * Nome da exceção lançada
	 */
	private String exceptionName;

	/**
	 * Nome da exceção original que foi capturada pela exceção do projeto
	 */
	private String originalExceptionName;

	/**
	 * Conteúdo da exceção
	 */
	private String value;
}
