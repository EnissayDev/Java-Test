package fr.enissay.i;

import java.util.ArrayList;
import java.util.List;

public class Animals {

	/**
	 * List of all the Animals
	 */
	public List<Animal> animals = new ArrayList<>();

	/**
	 * 
	 * Add animals and check if the animal
	 * is null or not
	 * 
	 * @param animal
	 * @return this
	 */
	public Animals addAnimal(Animal animal) {
		if (animal != null 
		&& !(animals.contains(animal))) {
			
			animals.add(animal);
			return this;
		}
		return this;
	}

	/**
	 * 
	 * Add multiple animals in only
	 * one function
	 * 
	 * @param animal
	 * @return this
	 */
	public Animals addAnimal(Animal... animal) {
		for (Animal animal2 : animal)
			addAnimal(animal2);
		return this;
	}

	/**
	 * 
	 * Get the Animal informations with index of a List
	 * 
	 * @param index
	 * @return Animal
	 */
	public Animal getAnimalInfo(int index) {
		return getAnimals().get(index);
	}

	/**
	 * 
	 * To get the annotation {@code AnimalInfo} of an 
	 * impletemented class with its informations by an Index of a List
	 * 
	 * @param animal
	 * @return info
	 */
	public AnimalInfo getAnimalAnnotationInfo(int index) {

		AnimalInfo info = null;
		Class<? extends Animal> classe = getAnimals().get(index).getClass();
		info = (AnimalInfo) classe.getAnnotation(AnimalInfo.class);
		
		if (info != null) 
			return info;
		else return null;
	}
	
	/**
	 * 
	 * To get the annotation {@code AnimalInfo} of an 
	 * impletemented class with its informations by an Animal
	 * 
	 * @param animal
	 * @return info
	 */
	public AnimalInfo getAnimalAnnotationInfo(Animal animal) {

		AnimalInfo info = null;
		Class<? extends Animal> classe = animal.getClass();
		info = (AnimalInfo) classe.getAnnotation(AnimalInfo.class);
		
		if (info != null) 
			return info;
		else return null;
	}
	
	/**
	 * 
	 * @return list of Animals
	 */
	public List<Animal> getAnimals(){
		return animals;
	}
}
