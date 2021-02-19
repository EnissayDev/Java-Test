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
	 * To look if the animal is stupid lol
	 * 
	 * @return false
	 */
	boolean isStupid() default false;
	
	/**
	 * 
	 * To setup the age of the animal
	 * 
	 * @return 0
	 */
	int age();
	
}
