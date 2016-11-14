/**
 * Classe que deve ser utilizada para fazer o request para o serviço
 * 
 * @author eduardodicarte
 *
 */

package br.com.qualityfactory.el.elifr.vo.request;

import br.com.qualityfactory.el.elifr.domain.Codest;
import br.com.qualityfactory.el.elifr.vo.Token;
import lombok.Data;

@Data
public class CodestRequest {
	private Token token;
	private Codest codest;
}
