package com.ui.models.pojo.KYC.WrapperClasses;
import java.util.List;

import com.ui.models.pojo.KYC.KycQuestionPojo;

public class KycWrapperQuestionsPojo {

    protected List<KycQuestionPojo> questions;


    public  List<KycQuestionPojo> getQuestions() {
        return questions;
    }


    public void setQuestions(List<KycQuestionPojo> questions) {
        this.questions = questions;
    }


}
