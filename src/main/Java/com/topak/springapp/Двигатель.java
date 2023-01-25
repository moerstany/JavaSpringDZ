package com.topak.springapp;

public class Двигатель extends Автомобиль{
    String Название;
    Integer Мощность;
    Double Объем;
    Integer Вес;
    Double Цена;

    public Двигатель() {
        Название = "NoName";
        Мощность = 0;
        Объем=0.00;
        Вес=0;
        Цена=0.00;
    }

    public Двигатель (String Название, Integer Мощность, Double Объем, Integer Вес, Double Цена) {
        this.Название = Название;
        this.Мощность = Мощность;
        this.Объем = Объем;
        this.Вес = Вес;
        this.Цена=Цена;

    }

    @Override
    public void setНазвание(String название) {
        Название = название;
    }

    public void setМощность(Integer мощность) {
        Мощность = мощность;
    }

    public void setОбъем(Double объем) {
        Объем = объем;
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

    public Integer getМощность() {
        return Мощность;
    }

    public Double getОбъем() {
        return Объем;
    }

    public Integer getВес() {
        return Вес;
    }

    public Double getЦена() {
        return Цена;
    }


}

