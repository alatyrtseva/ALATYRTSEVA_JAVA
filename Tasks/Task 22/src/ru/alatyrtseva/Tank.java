package ru.alatyrtseva;

import java.util.Random;

public class Tank extends Transport implements OffRoad, Shoots{
    private String offRoadPlaces[];
    private int aimpoint[];

    public Tank(String identity) {
        super(identity);
        aimpoint = new int[3];
        for (int i = 0; i < 3; i++) {
            aimpoint[i] = -1;
        }
        offRoadPlaces = new String[100];
    }

    @Override
    public String pullOffRoad() {
        Random random = new Random();
        int i = random.nextInt(5);
        return offRoadPlaces[i];
    }

    @Override
    public void addOffRoadPlace(String offRoadPlace) {
        int i = 0;
        while (offRoadPlaces[i] != null) {
            i++;
        }
        offRoadPlaces[i] = offRoadPlace;
    }

    @Override
    public String[] getOffRoadPlaces() {
        return offRoadPlaces;
    }

    @Override
    public void aim(int x, int y, int z) {
        System.out.println(this.identity + " целится");
        aimpoint[0] = x;
        aimpoint[1] = y;
        aimpoint[2] = z;
    }

    @Override
    public void shoot() {
        System.out.println(this.identity + " стреляет...");
        if (aimpoint[0] > -1 && aimpoint[1] > -1 && aimpoint[2] > -1) {
            System.out.println("БУМ!");
        }
        else
        {
            System.out.println("Не прицелились");
        }
        for (int i = 0; i < 3; i++) {
            aimpoint[i] = -1;
        }
    }
}
