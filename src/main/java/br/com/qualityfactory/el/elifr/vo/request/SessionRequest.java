package br.com.qualityfactory.el.elifr.vo.request;

import br.com.qualityfactory.el.elifr.vo.Session;
import br.com.qualityfactory.el.elifr.vo.Token;
import lombok.Data;

@Data
public class SessionRequest {
	private Token token;
	private Session session;
}