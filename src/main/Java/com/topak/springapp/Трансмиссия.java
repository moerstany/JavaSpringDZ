package com.topak.springapp;

public class Трансмиссия extends Автомобиль{

    String Тип;
    Integer КолПередач;
    Integer Вес;
    Double Цена;


    public Трансмиссия() {
        Тип = "NoName";
        КолПередач = 0;
        Вес=0;
        Цена=0.00;
    }

    public Трансмиссия (String  Тип, Integer КолПередач, Integer Вес, Double Цена) {
        this. Тип =  Тип;
        this.КолПередач = КолПередач;
        this.Вес = Вес;
        this.Цена=Цена;

    }

    public void setТип(String тип) {
        Тип = тип;
    }

    public void setКолПередач(Integer колПередач) {
        КолПередач = колПередач;
    }

    public void setВес(Integer вес) {
        Вес = вес;
    }

    public void setЦена(Double цена) {
        Цена = цена;
    }

    public String getТип() {
        return Тип;
    }

    public Integer getКолПередач() {
        return КолПередач;
    }

    public Integer getВес() {
        return Вес;
    }

    public Double getЦена() {
        return Цена;
    }




}
