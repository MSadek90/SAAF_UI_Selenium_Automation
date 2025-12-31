package com.ui.models.pojo.KYC.WrapperClasses;
import java.util.List;

import com.ui.models.pojo.KYC.KycQuestionPojo;

public class kycQuestionsNestedPojo {

    protected List<KycQuestionPojo> questions;


    public  List<KycQuestionPojo> getQuestions() {
        return questions;
    }


    public void setQuestions(List<KycQuestionPojo> questions) {
        this.questions = questions;
    }


    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }
}
