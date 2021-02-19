package fr.enissay.animals;

import fr.enissay.i.Animal;
import fr.enissay.i.AnimalInfo;

@AnimalInfo(ID = 3, isFavourite = true)
public class Cow implements Animal {

	@Override
	public String name() {
		return "Cow";
	}

	@Override
	public void sendCall() {
		System.out.println("The animal " + name() + " has been added to the List");
	}
}