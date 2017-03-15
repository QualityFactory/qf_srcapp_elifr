package br.com.qualityfactory.el.elifr.domain.annotations;

public @interface ListModel {
	public String value();
	
	public boolean column() default false;
}
