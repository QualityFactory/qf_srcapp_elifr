package br.com.qualityfactory.el.elifr.domain;

import br.com.qualityfactory.el.elifr.domain.annotations.Column;
import br.com.qualityfactory.el.elifr.domain.annotations.Id;

/**
 * 
 * @author eduardodicarte
 * Classe utilizada para recuperar os valores no estilo muitos para muitos
 *
 */
public class RulesWD implements Model {

	private static final long serialVersionUID = -4101106522249884567L;
	
	@Id
	private Short id;
	
	@Column
	private String code;
	
	@Column("id_rule")
	private Rule rule;
	
	@Column("id_word")
	private Word word;
}