package com.gawainli.countryevolution.manager;

import com.gawainli.countryevolution.country.Country;
import com.gawainli.countryevolution.country.OtherCountry;

import java.util.ArrayList;

public class Manager {

    private ArrayList<Country> allCountries;

    private ArrayList<OtherCountry> tempCountries;

    public Manager(ArrayList<Integer> allCountriesID) {
        this.allCountries = new ArrayList<Country>();
        for(int i = 0; i < allCountriesID.size(); i++)
        {
            ArrayList<Integer> otherCountriesID = (ArrayList<Integer>)allCountriesID.clone();
            otherCountriesID.remove(i);
            Country country = new Country(allCountriesID.get(i),otherCountriesID);
            this.allCountries.add(country);
        }

        Country country = this.allCountries.get(0);
        country.getPeople().develop(0.8);

        Country country1 = this.allCountries.get(1);
        tempCountries = country1.getOtherCountries();

        for (OtherCountry otherCountry: tempCountries
             ) {
            if (otherCountry.getCountryID() == 123){
                otherCountry.getOtherPeople().investigation(0.9,country.getPeople().getRealData());
            }
        }
        Country country2 = this.allCountries.get(2);
        tempCountries = country2.getOtherCountries();

        for (OtherCountry otherCountry: tempCountries
                ) {
            if (otherCountry.getCountryID() == 123){
                otherCountry.getOtherPeople().investigation(0.99,country.getPeople().getRealData());
            }
        }
        System.out.print("ok");

    }
}
