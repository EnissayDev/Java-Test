package fr.enissay.animals;

import fr.enissay.i.Animal;
import fr.enissay.i.AnimalInfo;

@AnimalInfo(ID = 5, isFavourite = true)
public class Goat implements Animal {

	@Override
	public String name() {
		return "Goat";
	}

	@Override
	public void sendCall() {
		System.out.println("The animal " + name() + " has been added to the List");
	}
}
