package br.com.qualityfactory.el.elifr.domain;

import br.com.qualityfactory.el.elifr.domain.annotations.Column;
import br.com.qualityfactory.el.elifr.domain.annotations.Entity;
import br.com.qualityfactory.el.elifr.domain.annotations.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Entity(tableName = "translation", schemaName = "el")
public class Translation implements Model{

	private static final long serialVersionUID = -632609840492157641L;
	
	@Id
	private Short id;
	
	@Column
	private String code;
	
	@Column
	private String val;
}
