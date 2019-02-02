package ru.alatyrtseva;

public class Parking {
        private ParkingPlace places[];

	public Parking() {
        this.places = new ParkingPlace[10];
        for (int i = 0; i < places.length; i++) {
            this.places[i] = new ParkingPlace();
        }
    }

	public void park(Transport transport) {
        for (int i = 0; i < places.length; i++) {
            if (places[i].getTransportIdentity() == null) {
                this.places[i].setTransport(transport);
                this.places[i].setTransportIdentity(transport.getIdentity());
                return;
            }
        }
        System.err.println("Нет мест");
    }

	public void unpark(String number) {
        for (int i = 0; i < places.length; i++) {
            if (places[i].getTransportIdentity().equals(number)) {
                places[i].setTransportIdentity(null);
                places[i].setTransport(null);
                return;
            }
        }
        System.err.println("Такой машины нет");
    }

    public void showCurrentState() {
	    System.out.println("Текущее состояние парковки:");
	    for (int i = 0; i < places.length; i++) {
	        if (places[i].getTransportIdentity() != null)
                System.out.println(i + " : " + places[i].getTransportIdentity());
        }
    }

}
