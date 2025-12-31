package com.ui.models.pojo.KYC.WrapperClasses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KycLabelNestedPojo {


    
    @JsonProperty("ar")
    private String ar;
    @JsonProperty("en")
    private String en;

    public String getAr() {
        return ar;
    }
    public void setAr(String ar) {
        this.ar = ar;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }
    public KycLabelNestedPojo getLabel() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLabel'");
    }

    

}
