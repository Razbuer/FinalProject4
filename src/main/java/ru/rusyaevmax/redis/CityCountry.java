package ru.rusyaevmax.redis;

import lombok.Data;
import ru.rusyaevmax.domain.Continent;

import java.math.BigDecimal;
import java.util.Set;

@Data
public class CityCountry {
    private Integer id;
    private String name;
    private String district;
    private Integer population;
    private String countryCode;
    private String alternativeCountryCode;
    private String countryName;
    private Continent continent;
    private String countryRegion;
    private BigDecimal countrySurfaceArea;
    private Integer countryPopulation;
    private Set<Language> languages;
}
