package fr.enissay.animals;

import fr.enissay.i.Animal;
import fr.enissay.i.AnimalInfo;

@AnimalInfo(ID = 4)
public class Dog implements Animal {

	@Override
	public String name() {
		return "Dog";
	}
	
	@Override
	public void sendCall() {
		System.out.println("The animal " + name() + " has been added to the List");
	}
}
