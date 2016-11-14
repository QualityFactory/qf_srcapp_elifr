package br.com.qualityfactory.el.elifr.vo;

import br.com.qualityfactory.el.elifr.vo.enums.EnumMessageType;
import lombok.Data;

/**
 * Classe que ir� mostrar a mensagem de status da request
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
	 * Nome da exce��o lan�ada
	 */
	private String exceptionName;

	/**
	 * Nome da exce��o original que foi capturada pela exce��o do projeto
	 */
	private String originalExceptionName;

	/**
	 * Conte�do da exce��o
	 */
	private String value;
}
