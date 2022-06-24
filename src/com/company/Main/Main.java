package com.company.Main;

import com.example.dao.CityDao;
import com.example.dao.CountryDao;
import com.example.dao.MemoryWorldDao;
import com.example.domain.City;
import com.example.domain.Country;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static java.lang.System.out;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.maxBy;

public class Main {

    public static void main(String[] args) {
        CountryDao countryDao = MemoryWorldDao.getInstance();
        CityDao cityDao = MemoryWorldDao.getInstance();
        Optional<City> capital = countryDao.findAllCountries()
                .stream()
                .map(Country::getCapital)
                .map(cityDao::findCityById)
                .filter(Objects::nonNull)
                .collect(maxBy(comparing(City::getPopulation)));
        capital.ifPresent(out::println);
    }

}
