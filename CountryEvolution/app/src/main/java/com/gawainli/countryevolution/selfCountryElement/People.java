package com.gawainli.countryevolution.selfCountryElement;

import com.gawainli.countryevolution.countryElement.CountryElementName;
import com.gawainli.countryevolution.countryElement.CountryElementSetting;

public class People extends SelfCountryElementBase {

    public People(){
        setName(CountryElementName.PEOPLE);
        setnCurvature(CountryElementSetting.PEOPLEINCREASERATE);
        setRealData(CountryElementSetting.PEOPLEBEGINNUMBER);
    }
}
