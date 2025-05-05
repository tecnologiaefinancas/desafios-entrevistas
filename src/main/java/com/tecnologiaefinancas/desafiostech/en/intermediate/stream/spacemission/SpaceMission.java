package com.tecnologiaefinancas.desafiostech.en.intermediate.stream.spacemission;

public class SpaceMission {
    private String name;
    private String destination;
    private int year;
    private String agency;
    private boolean success;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public SpaceMission() {
    }

    public SpaceMission(String name, String destination, int year, String agency, boolean success) {
        this.name = name;
        this.destination = destination;
        this.year = year;
        this.agency = agency;
        this.success = success;
    }

    @Override
    public String toString() {
        return "SpaceMission{" +
                "name='" + name + '\'' +
                ", destination='" + destination + '\'' +
                ", year=" + year +
                ", agency='" + agency + '\'' +
                ", success=" + success +
                '}';
    }
}
