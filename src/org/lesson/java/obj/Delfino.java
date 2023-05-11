package org.lesson.java.obj;

public class Delfino extends Animale{

	@Override
	public String verso() { return "Ultrasuono"; }

	@Override
	public String mangia() { return "Pesci"; }
	
	@Override
	public String toString() {
		return "(Delfino)";
	}

}
