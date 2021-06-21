package model;

public interface Motorizzata {
	final String RUMORE="vehicle goes brum brum";
	
	public default void move() {
		System.out.println(RUMORE);
	}
}
