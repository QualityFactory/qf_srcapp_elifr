package br.com.qualityfactory.el.elifr.domain;

import br.com.qualityfactory.el.elifr.domain.annotations.Column;
import br.com.qualityfactory.el.elifr.domain.annotations.Entity;
import br.com.qualityfactory.el.elifr.domain.annotations.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Entity(tableName = "codest", schemaName = "el")
public class Codest implements Model {

	private static final long serialVersionUID = -2084310855273559587L;

	@Id
	private Short id;
	
	@Column
	private String code;
	
	@Column
	private String tableName;
}
