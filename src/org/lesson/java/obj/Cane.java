package org.lesson.java.obj;

public class Cane  extends Animale{

	@Override
	public String verso() { return "Abbaia"; }

	@Override
	public String mangia() { return "Croccantini"; }
	
	@Override
	public String toString() {
		return "(Cane)";
	}
	
}
