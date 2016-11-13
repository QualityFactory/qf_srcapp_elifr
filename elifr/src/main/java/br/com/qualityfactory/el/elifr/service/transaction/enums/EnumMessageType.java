/**
 * Status da Mensagem 
 * 
 * Success - Requisição foi atendida com sucesso, conforme request
 * 
 * Error -   Ocorreu um erro na solicitação
 * 
 * Warning - Requisição foi atendida, porém com um informativo para o usuário
 * 
 * Alert   - Não foi possível atender a requisição com sucesso, devido a alguma restrição de regra de negócio ou mesmo se o dado não foi encontrado
 * na base de dados
 * 
 * @author eduardodicarte
 *
 */

package br.com.qualityfactory.el.elifr.service.transaction.enums;

public enum EnumMessageType {
	SUCCESS, ERROR, WARNING, ALERT;
}
