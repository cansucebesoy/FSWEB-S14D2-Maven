package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {

        Bedroom bedroom = new Bedroom("Cansu",
                new Wall("North"),
                        new Wall("South"),
                              new Wall("East"),
                                   new Wall("West"),
                                        new Ceiling(123, PaintColor.RED),
                                                new Bed("Old", 1,2,3,4),
                                                        new Lamp(LampType.NEON, true, 5),
                                                                new Wardrobe(1,2,3),
                                                                        new Carpet(1,2,PaintColor.GREEN));






        System.out.println("Bedroom name: " + bedroom.getName());
        System.out.println("Wall 1 direction: " + bedroom.getWall1().getDirection());
        System.out.println("Ceiling height: " + bedroom.getCeiling().getHeight());
        System.out.println("Bed style: " + bedroom.getBed().getStyle());
        System.out.println("Lamp style: " + bedroom.getLamp().getStyle());
        System.out.println("Wardrobe width: " + bedroom.getWardrobe().getWidth());
        System.out.println("Carpet color: " + bedroom.getCarpet().getColor());

        bedroom.getBed().make();
        bedroom.getLamp().turnOn();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();
        bedroom.getCeiling().create();
        bedroom.getWall1().create();
        bedroom.getBed().getQuilts();
    }



}