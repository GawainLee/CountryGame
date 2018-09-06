package com.gawainli.countryevolution.country;

import com.gawainli.countryevolution.selfCountryElement.People;

import java.util.ArrayList;
import java.util.HashMap;

public class Country {

    private int countryID;

    private People people;

    private HashMap<Integer,OtherCountry> otherCountries;

    private HashMap<Integer,Alliance> allianceHashMap;

    public Country(int countryID, ArrayList<Integer> otherCountriesID) {
        this.countryID = countryID;
        this.people = new People();
        this.otherCountries = new HashMap<>();
        this.allianceHashMap = new HashMap<>();
        this.setOtherCountriesNumber(otherCountriesID);
    }

    private void setOtherCountriesNumber(ArrayList<Integer> otherCountriesID){
        for(int i = 0; i < otherCountriesID.size(); i++){
            OtherCountry otherCountry = new OtherCountry(otherCountriesID.get(i));
            this.otherCountries.put(otherCountriesID.get(i),otherCountry);
        }
    }


    public int getCountryID() {
        return countryID;
    }

    public void setCountryID(int countryID) {
        this.countryID = countryID;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    public HashMap<Integer, OtherCountry> getOtherCountries() {
        return otherCountries;
    }

    public void setOtherCountries(HashMap<Integer, OtherCountry> otherCountries) {
        this.otherCountries = otherCountries;
    }

    public HashMap<Integer, Alliance> getAllianceHashMap() {
        return allianceHashMap;
    }

    public void setAllianceHashMap(HashMap<Integer, Alliance> allianceHashMap) {
        this.allianceHashMap = allianceHashMap;
    }
}
