package de.unistuttgart.iste.sqa.pse.sheet02.homework;

import de.hamstersimulator.objectsfirst.external.model.Hamster;

/**
 *
 * Mysterious hamsters are a mystery, their actions are very mysterious.
 *
 * Class for exercise 3 on sheet 02.
 *
 * @author (Your name)
 *
 */
public final class MysteriousHamster {
	private Integer stepCounter = 0;
	private Hamster hamster;

	/**
	 * This constructor allows to access methods of a mysterous hamster on a specified hamster.
	 * @param hamster A mysterioshamster-object will be created from this hamster.
	 */
	public MysteriousHamster(final Hamster hamster) {
		this.hamster = hamster;
	}

	/**
	 * der Hamster dreht sich nach links
	 */
	void turnLeft2() {
		hamster.turnLeft();
	}

	/**
	 * der Hamsterl läuft einmal und gibt dann an wieviel schritte er schon gemacht hat
	 */
	void moveAndCount() {
		hamster.move();
		stepCounter++;
		hamster.write("I have already walked " + stepCounter + " steps.");
	}

	/**
	 * Der Hamster dreht sich um 180 Grad
	 */
	void turnBack() {
		hamster.turnLeft();
		hamster.turnLeft();
	}

	/**
	 * Der Hamster dreht sich nach rechts
	 */
	void turnRight() {
		hamster.turnLeft();
		hamster.turnLeft();
		hamster.turnLeft();
	}

	/**
	 * Gibt die anzahl der bisher gelaufenen Schritte aus/returnt sie
	 */
	int countedSteps() {
		return stepCounter;
	}

	/**
	 * Gibt die Anzahl gelaufener Schritte als Text aus
	 */
	void writeCountedSteps() {
		hamster.write(stepCounter.toString());
	}

	/**
	 * Hebt ein Gain auf
	 */
	void pickUpGain2() {
		hamster.pickGrain();
	}

	/**
	 * gibt den Text"I'm done" aus
	 */
	void sayImDone() {
		hamster.write("I'm done! :)");
	}

	/**
	 *Läuft so lange vorwehrts und versucht ein Gain aufzuheben, bis sein Mund nichtmehr leer ist, er ein Gain hat, läuft bis zum nächsten Gain
	 */
	void moveUntilGain() {
		hamster.move();
		stepCounter++;
		while (!hamster.mouthEmpty()) {
			hamster.putGrain();
		}
		hamster.move();
		stepCounter++;
	}
	/**
	 * This method is used to grant mysterioushamster-objects access the {@link Hamster#write(String)} method.
	 * @param text This text will be printed out in the game log.
	 */
	void write(final String text) {
		hamster.write(text);
	}
}
