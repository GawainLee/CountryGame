package com.gawainli.countryevolution.otherCountryElement;

import com.gawainli.countryevolution.countryElement.CountryElementName;
import com.gawainli.countryevolution.countryElement.CountryElementSetting;

public class OtherPeople extends OtherCountryElementBase{

    public OtherPeople() {
        setName(CountryElementName.PEOPLE);
        setnCurvature(CountryElementSetting.PEOPLEINVESTIGATIONRATE);
    }
}
