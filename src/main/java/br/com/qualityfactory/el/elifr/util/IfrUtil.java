/**
 * 
 * @author eduardodicarte
 *
 */

package br.com.qualityfactory.el.elifr.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;

import br.com.qualityfactory.el.elifr.domain.Model;
import br.com.qualityfactory.el.elifr.exception.ArchitectureELException;

public class IfrUtil {
	public static Collection<Field> getFieldsModel(Model model) throws ArchitectureELException {
		Collection<Field> fields = new ArrayList<>();
		try {
			for (Field field : model.getClass().getDeclaredFields()) {
				field.setAccessible(true);

				if (!field.getName().contains("serialVersion") && field.get(model) != null) {
					fields.add(field);
				}
			}
		} catch (IllegalArgumentException | IllegalAccessException illegalException) {
			throw new ArchitectureELException(illegalException);
		}

		return fields;
	}
}
