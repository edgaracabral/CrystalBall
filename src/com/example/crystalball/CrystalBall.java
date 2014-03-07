package com.example.crystalball;

import java.util.Random;

public class CrystalBall {
	// Member variables (properties about the object)
	String[] mAnswers = {
			"It is certain",
			"It is decidedly so",
			"All signs say YES",
			"The starts are not aligned",
			"My reply is no",
			"It is doubtful",
			"Better not tell you now",
			"Concentrate and ask again",
			"Unable to answer now"
		};

	
	// Methods (abilities: things the object can do)
	public String getAnAnswer() {
		String answer = "";
			
		Random randomGenerator = new Random();
		int randomNumber = randomGenerator.nextInt(mAnswers.length);

		answer = mAnswers[randomNumber];
		return answer;
	}
}
