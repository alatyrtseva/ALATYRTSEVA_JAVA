package ru.alatyrtseva;

import java.util.Random;

public class Tank extends Transport implements OffRoad, Shoots{
    public static final String offRoadPlaces[] = {"Поле", "Овраг", "Лес", "Болото", "Здание", "Метро"};
    private int aimpoint[];

    public Tank(String identity) {
        super(identity);
        aimpoint = new int[3];
        for (int i = 0; i < 3; i++) {
            aimpoint[i] = -1;
        }
    }

    @Override
    public String pullOffRoad() {
        Random random = new Random();
        int i = random.nextInt(5);
        return offRoadPlaces[i];
    }

    @Override
    public void aim(int x, int y, int z) {
        aimpoint[0] = x;
        aimpoint[1] = y;
        aimpoint[2] = z;
    }

    @Override
    public void shoot() {
        System.out.println(this.identity);
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
