package ru.alatyrtseva;

public class Main {

    public static void main(String[] args) {
	Parking parking = new Parking ();

	Aircraft tu154 = new Aircraft("Ту 154",9000);

	tu154.embarcation();
	parking.park(tu154);
	parking.showCurrentState();

	Tank t34 = new Tank("Т-34");

	parking.park(t34);
	parking.showCurrentState();

	Tank tiger = new Tank("Tiger");

	parking.park(tiger);
	parking.showCurrentState();

	parking.unpark(t34.identity);

	String offRoadPlace = t34.pullOffRoad();
	System.out.println(t34.identity + " съехал с дороги: " + offRoadPlace);

	t34.aim( 5, 6, 7);
	t34.shoot();
	t34.shoot();
	parking.showCurrentState();
    }
}
