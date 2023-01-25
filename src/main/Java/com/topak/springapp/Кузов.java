package com.topak.springapp;

public class Кузов extends Автомобиль{
    String Название;
    String Тип;
    Integer Вес;
    Double Цена;

    public Кузов() {
        Название = "NoName";
        Тип="NoName";
        Вес=0;
        Цена=0.00;
    }

    public Кузов (String Название,  String Тип, Integer Вес, Double Цена) {
        this.Название = Название;
        this.Тип = Тип;
        this.Вес = Вес;
        this.Цена=Цена;

    }

    @Override
    public String getНазвание() {
        return Название;
    }

    @Override
    public void setНазвание(String название) {
        Название = название;
    }

    public String getТип() {
        return Тип;
    }

    public void setТип(String тип) {
        Тип = тип;
    }

    public Integer getВес() {
        return Вес;
    }

    public void setВес(Integer вес) {
        Вес = вес;
    }

    public Double getЦена() {
        return Цена;
    }

    public void setЦена(Double цена) {
        Цена = цена;
    }


}
