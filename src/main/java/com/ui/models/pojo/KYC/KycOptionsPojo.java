package com.ui.models.pojo.KYC;


import java.util.List;

import com.ui.models.pojo.KYC.WrapperClasses.KycLabelNestedPojo;
import com.ui.models.pojo.KYC.WrapperClasses.kycQuestionsNestedPojo;

public class KycOptionsPojo {

    
    private String optionId;
    private KycLabelNestedPojo label;
    private List<kycQuestionsNestedPojo> questions;


    public List<kycQuestionsNestedPojo> getQuestions() {
        return questions;
    }

    public void setQuestions(List<kycQuestionsNestedPojo> questions) {
        this.questions = questions;
    }


    public KycLabelNestedPojo getLabel() {
        return label;
    }

    public void setLabel(KycLabelNestedPojo label) {
        this.label = label;
    }

    public String getOptionId_() {
        return optionId;
    }

    public void setOptionId(String optionId) {
        this.optionId = optionId;
    }

  

    
}
