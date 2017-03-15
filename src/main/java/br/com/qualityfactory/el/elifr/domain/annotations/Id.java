package br.com.qualityfactory.el.elifr.domain.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import br.com.qualityfactory.el.elifr.domain.enums.GenerateType;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Id {
	GenerateType value() default GenerateType.AUTO;
}
