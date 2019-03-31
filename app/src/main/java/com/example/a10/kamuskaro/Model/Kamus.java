package com.example.a10.kamuskaro.Model;

public class Kamus {
    public int id;
    public String bahasaindonesia , bahasakaro;

    public Kamus(int id, String bahasaindonesia, String bahasakaro) {
        this.id = id;
        this.bahasaindonesia = bahasaindonesia;
        this.bahasakaro = bahasakaro;
    }

    public Kamus() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBahasaindonesia() {
        return bahasaindonesia;
    }

    public void setBahasaindonesia(String bahasaindonesia) {
        this.bahasaindonesia = bahasaindonesia;
    }

    public String getBahasakaro() {
        return bahasakaro;
    }

    public void setBahasakaro(String bahasakaro) {
        this.bahasakaro = bahasakaro;
    }
}
