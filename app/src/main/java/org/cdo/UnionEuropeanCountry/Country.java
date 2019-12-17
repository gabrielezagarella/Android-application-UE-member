package org.cdo.UnionEuropeanCountry;
import java.io.Serializable;
import java.util.UUID;

public class Country implements Serializable {

    private UUID id;
    private int nameCountry;
    private int flag;
    private int flagShape;
    private int surface;
    private int population;

    public Country(int nameCountry, int flag, int flagShape, int surface, int population) {
        this.id = UUID.randomUUID();
        this.nameCountry = nameCountry;
        this.flag = flag;
        this.flagShape = flagShape;
        this.surface = surface;
        this.population = population;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(int nameCountry) {
        this.nameCountry = nameCountry;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public int getFlagShape() { return flagShape; }

    public void setFlagShape(int flagShape) { this.flagShape = flagShape; }

    public int getSurface() {
        return surface;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
