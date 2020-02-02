package com.example.taulaperiodica;

import java.io.Serializable;

public class cElement implements Serializable {
    
    private String number;
    private String symbol;
    private String name;
    private String mass;
    private String electronConfiguration;
    private String electronNegativity;
    private String radius;
    private String ionRadius;
    private String vanDelWaalsRadius;
    private String ionizationEnergy;
    private String electronAffinity;
    private String oxidationStates;
    private String standardState;
    private String bondingType;
    private String meltingPoint;
    private String boilingPoint;
    private String density;
    private String family;
    private String yearDiscovered;

    public cElement(String number, String symbol, String name, String mass, String electronConfiguration, String electronNegativity, String radius, String ionRadius, String vanDelWaalsRadius, String ionizationEnergy, String electronAffinity, String oxidationStates, String standardState, String bondingType, String meltingPoint, String boilingPoint, String density, String family, String yearDiscovered) {
        this.number = number;
        this.symbol = symbol;
        this.name = name;
        this.mass = mass;
        this.electronConfiguration = electronConfiguration;
        this.electronNegativity = electronNegativity;
        this.radius = radius;
        this.ionRadius = ionRadius;
        this.vanDelWaalsRadius = vanDelWaalsRadius;
        this.ionizationEnergy = ionizationEnergy;
        this.electronAffinity = electronAffinity;
        this.oxidationStates = oxidationStates;
        this.standardState = standardState;
        this.bondingType = bondingType;
        this.meltingPoint = meltingPoint;
        this.boilingPoint = boilingPoint;
        this.density = density;
        this.family = family;
        this.yearDiscovered = yearDiscovered;
    }

    public String getNumber() {
        return this.number;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public String getName() {
        return this.name;
    }

    public String getMass() {
        return this.mass;
    }

    public String getElectronConfiguration() {
        return this.electronConfiguration;
    }

    public String getElectronNegativity() {
        return this.electronNegativity;
    }

    public String getRadius() {
        return this.radius;
    }

    public String getIonRadius() {
        return this.ionRadius;
    }

    public String getVanDelWaalsRadius() {
        return this.vanDelWaalsRadius;
    }

    public String getIonizationEnergy() {
        return this.ionizationEnergy;
    }

    public String getElectronAffinity() {
        return this.electronAffinity;
    }

    public String getOxidationStates() {
        return this.oxidationStates;
    }

    public String getStandardState() {
        return this.standardState;
    }

    public String getBondingType() {
        return this.bondingType;
    }

    public String getMeltingPoint() {
        return this.meltingPoint;
    }

    public String getBoilingPoint() {
        return this.boilingPoint;
    }

    public String getDensity() {
        return this.density;
    }

    public String getFamily() {
        return this.family;
    }

    public String getYearDiscovered() {
        return this.yearDiscovered;
    }
}