package com.gawainli.countryevolution.otherCountryElement;

import com.gawainli.countryevolution.countryElement.CountryElementName;

public class OtherCountryElementBase {

    //
    private CountryElementName name;

    //
    private Double investigationDataDouble;

    // y = x ^ n
    // 0 <= x <= 1
    // y is deviation 发现准确率
    // x is input research 投入成本
    // n is curvature 曲率
    private Double yDeviation, xInputResearch, nCurvature;

    public void investigation(Double xInputResearch, Double realData) {
        yDeviation = Math.pow(xInputResearch, nCurvature);
        Double max = (1 - yDeviation) * realData;
        Double min = (2 - yDeviation) * realData;
        investigationDataDouble = min + (Double) (Math.random() * max);
    }

    public CountryElementName getName() {
        return name;
    }

    public void setName(CountryElementName name) {
        this.name = name;
    }

    public Double getInvestigationDataDouble() {
        return investigationDataDouble;
    }

    public void setInvestigationDataDouble(Double investigationDataDouble) {
        this.investigationDataDouble = investigationDataDouble;
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
