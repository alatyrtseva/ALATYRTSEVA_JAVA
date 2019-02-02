package ru.alatyrtseva;

public class Aircraft extends Transport implements Flies{
    public boolean fly;
    public int maxAltitude;
    public Aircraft(String identity, int maxAltitude) {
        super(identity);
        this.maxAltitude = maxAltitude;
    }

    @Override
    public void takeOff() {
        this.fly = true;
        System.out.println(this.identity + " взлетел");
    }

    @Override
    public void embarcation() {
        this.fly = false;
        System.out.println(this.identity + " приземлился");
    }
}
