package com.topak.springapp;

public class Автомобиль {
    String Двигатель;
    String Трансмиссия;
    String Колесо;
    String Кузов;
    Double Стоимость;
    String Бренд;
    String Название;
    Integer Наценка;

    public Автомобиль() {
        Двигатель = "NoName";
        Трансмиссия = "NoName";
        Колесо = "NoName";
        Кузов = "NoName";
        Стоимость=0.00;
        Бренд = "NoName";
        Название = "NoName";
        Наценка=0;
    }

    public Автомобиль (String Двигатель, String Трансмиссия, String Колесо, String Кузов, double Стоимость, String Бренд, String Название , Integer Наценка) {
        this.Двигатель = Двигатель;
        this.Трансмиссия = Трансмиссия;
        this.Колесо = Колесо;
        this.Кузов = Кузов;
        this.Стоимость=Стоимость;
        this.Бренд = Бренд;
        this.Название = Название;
        this.Наценка=Наценка;
    }

    public String getДвигатель() {
        return Двигатель;
    }

    public String getТрансмиссия() {
        return Трансмиссия;
    }

    public String getКолесо() {
        return Колесо;
    }

    public String getКузов() {
        return Кузов;
    }

    public Double getСтоимость() {
        return Стоимость;
    }

    public String getБренд() {
        return Бренд;
    }

    public String getНазвание() {
        return Название;
    }

    public Integer getНаценка() {
        return Наценка;
    }



    public void setДвигатель(String двигатель) {
        Двигатель = двигатель;
    }

    public void setТрансмиссия(String трансмиссия) {
        Трансмиссия = трансмиссия;
    }

    public void setКолесо(String колесо) {
        Колесо = колесо;
    }

    public void setКузов(String кузов) {
        Кузов = кузов;
    }

    public void setСтоимость(Double стоимость) {
        Стоимость = стоимость;
    }

    public void setБренд(String бренд) {
        Бренд = бренд;
    }

    public void setНазвание(String название) {
        Название = название;
    }

    public void setНаценка(Integer наценка) {
        Наценка = наценка;
    }


    @Override
    public  String toString() {
        return this.Бренд + "|" + this.Название + "|" + this.Двигатель + "|" + this.Трансмиссия + "|" + this.Колесо + " | " + this.Кузов + " | " + this.Стоимость + " | " + this.Наценка;
    }

}
