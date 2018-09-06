package com.gawainli.countryevolution.country;

import com.gawainli.countryevolution.otherCountryElement.OtherPeople;

public class OtherCountry {

    private int countryID;
    private OtherPeople otherPeople;

    public OtherCountry(int countryID) {
        this.countryID = countryID;
        this.otherPeople = new OtherPeople();
    }

    public int getCountryID() {
        return countryID;
    }

    public void setCountryID(int countryID) {
        this.countryID = countryID;
    }

    public OtherPeople getOtherPeople() {
        return otherPeople;
    }

    public void setOtherPeople(OtherPeople otherPeople) {
        this.otherPeople = otherPeople;
    }
}
