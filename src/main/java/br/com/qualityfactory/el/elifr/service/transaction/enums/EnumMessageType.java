/**
 * Status da Mensagem 
 * 
 * Success - Requisi��o foi atendida com sucesso, conforme request
 * 
 * Error -   Ocorreu um erro na solicita��o
 * 
 * Warning - Requisi��o foi atendida, por�m com um informativo para o usu�rio
 * 
 * Alert   - N�o foi poss�vel atender a requisi��o com sucesso, devido a alguma restri��o de regra de neg�cio ou mesmo se o dado n�o foi encontrado
 * na base de dados
 * 
 * @author eduardodicarte
 *
 */

package br.com.qualityfactory.el.elifr.service.transaction.enums;

public enum EnumMessageType {
	SUCCESS, ERROR, WARNING, ALERT;
}
