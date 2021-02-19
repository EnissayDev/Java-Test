package fr.enissay.i;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target(ElementType.TYPE)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface AnimalInfo {

	/**
	 * 
	 * Check if the animal is the Favourite
	 * 
	 * @return false
	 */
	boolean isFavourite() default false;
	
	/**
	 * 
	 * Check the ID of the Animal
	 * 
	 * @return 0
	 */
	int id();
	
}
