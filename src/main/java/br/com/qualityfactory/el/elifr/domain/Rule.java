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
@Entity(tableName = "rule", schemaName = "el")
public class Rule implements Model {

	private static final long serialVersionUID = 3717429806944722633L;

	@Id
	private Short id;

	@Column
	private String code;

	@Column
	private String name;

	@Column
	private String val;
	
	@ListModel("RulesWD")
	private List<Word> words;
}