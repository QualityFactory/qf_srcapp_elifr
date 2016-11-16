/**
 * Classe que gera uma resposta para o serviço solicitado.
 * 
 * @author eduardodicarte
 *
 */

package br.com.qualityfactory.el.elifr.vo;

import java.io.Serializable;
import java.util.Collection;

import br.com.qualityfactory.el.elifr.domain.Model;
import lombok.Data;

@Data
public class Response implements Serializable {

	private static final long serialVersionUID = 1L;

	private Collection<Model> response;
	private Token token;
	private Message message;
}
