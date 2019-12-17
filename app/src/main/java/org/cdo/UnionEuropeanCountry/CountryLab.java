package org.cdo.UnionEuropeanCountry;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class CountryLab {

    private static CountryLab instance;
    private List<Country> countryList;

    public static CountryLab getInstance(Context context) {
        if (instance == null)
            instance = new CountryLab(context);
        return instance;
    }

    public List<Country> getCountryList() {
        return countryList;
    }

    public Country getCountry(UUID id) {
        for (Country country : countryList) {
            if (country.getId().equals(id))
                return country;
        }
        return null;
    }

    private CountryLab(Context context) {
        countryList = new ArrayList<>();

        Country country1 = new Country(R.string.romania, R.drawable.romania, R.drawable.romania_ter, R.string.surface_romania, R.string.population_romania);

        Country country2 = new Country(R.string.slovenia, R.drawable.slovenia, R.drawable.slovenia_ter, R.string.surface_slovenia, R.string.population_slovenia);

        Country country3 = new Country(R.string.danimarca, R.drawable.danimarca, R.drawable.danimarca_ter, R.string.surface_danimarca, R.string.population_danimarca);

        Country country4 = new Country( R.string.grecia, R.drawable.grecia, R.drawable.grecia_ter, R.string.surface_grecia, R.string.population_grecia);

        Country country5 = new Country( R.string.croazia, R.drawable.croazia, R.drawable.croazia_ter, R.string.surface_croazia, R.string.population_croazia);

        Country country6 = new Country(R.string.lituania, R.drawable.lituania, R.drawable.lituania_ter, R.string.surface_lituania, R.string.population_lituania);

        Country country7 = new Country(R.string.belgio, R.drawable.belgio, R.drawable.belgio_ter, R.string.surface_belgio, R.string.population_belgio);

        Country country8 = new Country(R.string.polonia, R.drawable.polonia, R.drawable.polonia_ter, R.string.surface_polonia, R.string.population_polonia);

        Country country9 = new Country(R.string.spangna, R.drawable.spagna, R.drawable.spagna_ter, R.string.surface_spagna, R.string.population_spagna);

        Country country10 = new Country(R.string.austria, R.drawable.austria, R.drawable.austria_ter, R.string.surface_austria, R.string.population_austria);

        countryList = Arrays.asList( country1, country2, country3, country4, country5, country6, country7, country8, country9, country10 );

    }
}
