package com.company;

public class Building {

    private int height;
    private Color color;
    private String material;

    public Building(int height, Color color, String material) {
        this.height = height;
        this.color = color;
        this.material = material;
    }

    public void getInfo() {
        System.out.println("\n" +
                "Height: " + height +
                "\nColor: " + color + "" +
                "\nMaterial: " + material + "\n");
    }

    public String getMaterial() {
        return material;
    }

    public Color getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

}
