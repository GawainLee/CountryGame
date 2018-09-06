package com.gawainli.countryevolution.country;

import java.util.ArrayList;
import java.util.HashMap;

public class Alliance {

    private HashMap<Integer,Country> allianceList;

    private String allianceName;

    private int allianceID;

    private HashMap<Integer,Country> allianceManagerList;

    public Alliance(int allianceID, String allianceName,Country joinCountry){
        this.allianceID = allianceID;
        this.allianceName = allianceName;
        this.allianceList = new HashMap<Integer, Country>();
        this.allianceList.put(joinCountry.getCountryID(),joinCountry);
        this.allianceManagerList = new HashMap<Integer, Country>();
        this.allianceManagerList.put(joinCountry.getCountryID(),joinCountry);
    }

    public boolean joinAlliance(Country countryManager, Country joinCountry){
        Boolean isJoinCountry = false;
        if(this.allianceManagerList.get(countryManager.getCountryID()) != null){
            Country country = this.allianceList.put(joinCountry.getCountryID(),joinCountry);
            if (country != null){
                isJoinCountry = true;
            }
        }
        return isJoinCountry;
    }


    public boolean removeFromAlliance(Country countryManager, Country removeCountry){
        Boolean isRemoveFromAlliance = false;
        if(this.allianceManagerList.get(countryManager.getCountryID()) != null){
            Country country = this.allianceList.remove(removeCountry.getCountryID());
            if (country != null){
                isRemoveFromAlliance = true;
                this.allianceManagerList.remove(removeCountry.getCountryID());
            }
        }
        return isRemoveFromAlliance;
    }


    public boolean joinAllianceManager(Country countryManager, Country joinCountry){
        Boolean isIncludeCountry = false;
        if(this.allianceManagerList.get(countryManager.getCountryID()) != null){
            Country country = this.allianceManagerList.put(joinCountry.getCountryID(),joinCountry);
            if (country != null){
                isIncludeCountry = true;
            }
        }
        return isIncludeCountry;
    }

    public boolean removeFromAllianceManager(Country countryManager, Country removeCountry){
        Boolean isRemoveFromAlliance = false;
        if(this.allianceManagerList.get(countryManager.getCountryID()) != null){
            Country country = this.allianceManagerList.remove(removeCountry.getCountryID());
            if (country != null){
                isRemoveFromAlliance = true;
            }
        }
        return isRemoveFromAlliance;
    }

    public String getAllianceName() {
        return allianceName;
    }

    public void setAllianceName(String allianceName) {
        this.allianceName = allianceName;
    }

    public HashMap<Integer, Country> getAllianceList() {
        return allianceList;
    }

    public HashMap<Integer, Country> getAllianceManagerList() {
        return allianceManagerList;
    }

    public int getAllianceID() {
        return allianceID;
    }
}
