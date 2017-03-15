package br.com.qualityfactory.el.elifr.domain;

import java.util.List;

import br.com.qualityfactory.el.elifr.domain.annotations.Column;
import br.com.qualityfactory.el.elifr.domain.annotations.Entity;
import br.com.qualityfactory.el.elifr.domain.annotations.Id;
import br.com.qualityfactory.el.elifr.domain.annotations.ListModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Entity(tableName = "word", schemaName = "el")
public class Word implements Model {

	private static final long serialVersionUID = -2971041377048729538L;

	@Id
	private Short id;
	
	@Column
	private String code;
	
	@Column
	private String val;
	
	@ListModel("RulesWD")
	private List<Rule> rules;
}