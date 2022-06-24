package com.company.Main;


import com.example.domain.Country;

import java.util.List;

public abstract class CountryDAO {

    public abstract List<Country> getCountryList();

    public abstract void saveCountry(Country country);

    public abstract void updateCountry(Country country);
}

