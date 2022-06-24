package com.company.Main;

import com.example.domain.City;

import java.util.List;

public abstract class CityDAO {

    public abstract List<City> getCityList();

    public abstract void saveCity(City city);

    public abstract void updateCity(City city);
}
