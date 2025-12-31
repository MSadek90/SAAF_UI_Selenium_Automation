package com.ui.models.pojo.KYC;

import java.util.List;

import com.ui.models.pojo.KYC.WrapperClasses.KycLabelNestedPojo;


public class KycQuestionPojo {
    

    private String questionId;
    private List<KycOptionsPojo> options;
    private String type;
    private KycLabelNestedPojo label;




    public KycLabelNestedPojo getLabel() {
        return label;
    }

    public void setLabel(KycLabelNestedPojo label) {
        this.label = label;
    }



    public String getQuestionId() {
        return questionId;
    }
    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }




    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



    public List<KycOptionsPojo> getOptions() {
        return options;
    }


    public void setOptions(List<KycOptionsPojo> options) {
        this.options = options;
    }

  

}
