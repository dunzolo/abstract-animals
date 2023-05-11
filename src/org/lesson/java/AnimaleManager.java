package org.lesson.java;

import org.lesson.java.interf.iNuotante;
import org.lesson.java.interf.iVolante;

public class AnimaleManager {
	public String faiVolare(iVolante animale) {
		return animale.vola();
	}
	
	public void faiNuotare(iNuotante animale) {
		animale.nuota();
	}
}
