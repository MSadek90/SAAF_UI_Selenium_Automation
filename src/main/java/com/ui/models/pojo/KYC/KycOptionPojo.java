package com.ui.models.pojo.KYC;
import java.util.List;

import com.ui.models.pojo.KYC.WrapperClasses.KycLabelNestedPojo;


public class KycOptionPojo {

    
    private String optionId;
    private KycLabelNestedPojo label;
    private List<KycQuestionPojo> questions;


    public List<KycQuestionPojo> getQuestions() {
        return questions;
    }

    public void setQuestions(List<KycQuestionPojo> questions) {
        this.questions = questions;
    }


    public KycLabelNestedPojo getLabel() {
        return label;
    }

    public void setLabel(KycLabelNestedPojo label) {
        this.label = label;
    }

    public String getOptionId() {
        return optionId;
    }

    public void setOptionId(String optionId) {
        this.optionId = optionId;
    }

  

    
}
