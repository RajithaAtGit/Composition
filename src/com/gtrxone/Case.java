package com.gtrxone;

import javax.swing.tree.AbstractLayoutCache;
import java.awt.*;

public class Case {
    private String model;
    private String manufacture;
    private String powerSupply;
    private Dimensions dimensions;

    public Case(String model, String manufacture, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacture = manufacture;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton() {

    }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}