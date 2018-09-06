package com.gawainli.countryevolution.selfCountryElement;

import com.gawainli.countryevolution.countryElement.CountryElementName;

public class SelfCountryElementBase {

    private CountryElementName name;

    private Double realData;

    private Double showOtherData;

    // y = x ^ n
    // 0 <= x <= 1
    // y is deviation 发展率
    // x is input research 投入成本
    // n is curvature 曲率
    private Double yDeviation, xInputResearch, nCurvature;

    public void develop(Double xInputResearch) {
        this.xInputResearch = xInputResearch;
        yDeviation = Math.pow(this.xInputResearch, this.nCurvature);
        this.realData = (1 + yDeviation) * this.realData;
    }

    public CountryElementName getName() {
        return name;
    }

    public void setName(CountryElementName name) {
        this.name = name;
    }

    public Double getRealData() {
        return realData;
    }

    public void setRealData(Double realData) {
        this.realData = realData;
    }

    public Double getShowOtherData() {
        return showOtherData;
    }

    public void setShowOtherData(Double showOtherData) {
        this.showOtherData = showOtherData;
    }

    public Double getyDeviation() {
        return yDeviation;
    }

    public void setyDeviation(Double yDeviation) {
        this.yDeviation = yDeviation;
    }

    public Double getxInputResearch() {
        return xInputResearch;
    }

    public void setxInputResearch(Double xInputResearch) {
        this.xInputResearch = xInputResearch;
    }

    public Double getnCurvature() {
        return nCurvature;
    }

    public void setnCurvature(Double nCurvature) {
        this.nCurvature = nCurvature;
    }
}
