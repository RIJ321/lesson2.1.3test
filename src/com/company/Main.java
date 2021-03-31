package com.company;

public class Main {

    public static void main(String[] args) {
        House house = new House(12, Color.WHITE, "Concrete", 200, "Manas");
        house.getInfo();

        House house1 = new House(12, Color.BLACK, "Brick", 50, "7 Microdistrict");
        house1.getInfo();

        house1.finalHouse(184, 6, "Chiskaya 93");
        house1.finalHouse();

        Room room = new Room(31, Color.WHITE, "Concrete", 123, "Kievskaya 55",
                "Papers", 5, 4);
        room.getInfo();
    }
}
