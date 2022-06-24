package com.example.domain;

public class City {
    private int id;
    private String name;
    private String countrycode;
    private int population;

    public City(){}
     public City(int id, String name, String countrycode, int population) {
         this.name = name;
         this.id = id;
         this.population = population;
         this.countrycode = countrycode;
     }
     @Override
    public String toString(){
         return "City [id=" + id + ", name=" + name + ", population=" + population + ", countryCode=" + countrycode + "]";
     };



     }

