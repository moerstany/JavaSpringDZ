package com.topak.springapp;

public class Колесо extends Автомобиль{
    //диаметр, вес, цена
    String Название;
    Double Диаметр;
    Integer Вес;
    Double Цена;


    public Колесо() {
        Название = "NoName";
        Диаметр=0.00;
        Вес=0;
        Цена=0.00;
    }

    public Колесо (String Название,  Double Диаметр, Integer Вес, Double Цена) {
        this.Название = Название;
        this.Диаметр = Диаметр;
        this.Вес = Вес;
        this.Цена=Цена;

    }

    @Override
    public void setНазвание(String название) {
        Название = название;
    }

    public void setДиаметр(Double диаметр) {
        Диаметр = диаметр;
    }

    public void setВес(Integer вес) {
        Вес = вес;
    }

    public void setЦена(Double цена) {
        Цена = цена;
    }

    @Override
    public String getНазвание() {
        return Название;
    }

    public Double getДиаметр() {
        return Диаметр;
    }

    public Integer getВес() {
        return Вес;
    }

    public Double getЦена() {
        return Цена;
    }



}
