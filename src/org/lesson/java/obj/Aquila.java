package org.lesson.java.obj;

public class Aquila extends Animale{

	@Override
	public String verso() { return "Strido"; }

	@Override
	public String mangia() { return "Piccoli animali"; }
	
	@Override
	public String toString() {
		return "(Aquila)";
	}

}
