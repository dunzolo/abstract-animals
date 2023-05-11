package org.lesson.java.obj;

public class Passerotto extends Animale{

	@Override
	public String verso() { return "Cinguetta"; }

	@Override
	public String mangia() { return "Foglie"; }
	
	@Override
	public String toString() {
		return "(Passerotto)";
	}

}
