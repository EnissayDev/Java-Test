package fr.enissay.animals;

import fr.enissay.i.Animal;
import fr.enissay.i.AnimalInfo;

@AnimalInfo(ID = 1)
public class Bird implements Animal {

	@Override
	public String name() {
		return "Bird";
	}

	@Override
	public void sendCall() {
		System.out.println("The animal " + name() + " has been added to the List");
	}
}
