package br.com.qualityfactory.el.elifr.domain;

import br.com.qualityfactory.el.elifr.domain.annotations.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Entity(tableName = "rulesvb", schemaName = "el")
public class RulesVB implements Model {
	
	private static final long serialVersionUID = 4891368856206243200L;

}
