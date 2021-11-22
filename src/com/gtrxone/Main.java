package com.gtrxone;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220b", "MSI", "920", dimensions);
//        Resolution  resolution = new Resolution(1920,1080);
        Monitor monitor = new Monitor("Msi Optix G24 Series", "MSI", 21, new Resolution(1920, 1080));
        Motherboard motherboard = new Motherboard("Msi zZS", "Msi", 4, 1, "v2.44");

        PC thePc = new PC(theCase, monitor, motherboard);
        thePc.powerUp();
    }

}

