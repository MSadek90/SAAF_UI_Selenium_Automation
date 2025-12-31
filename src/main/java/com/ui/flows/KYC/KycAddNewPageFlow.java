package com.ui.flows.KYC;




import com.ui.actions.KYC.KYCPageActions;
import com.ui.actions.KYC.KYCQuestionActions;
import com.ui.models.pojo.KYC.KycPagePojo;
import com.ui.models.pojo.KYC.WrapperClasses.kycQuestionsNestedPojo;


public class KycAddNewPageFlow {

    KYCPageActions kycPageActions;
    KYCQuestionActions kycQuestionActions;

    public KycAddNewPageFlow(KYCPageActions kycPageActions, KYCQuestionActions kycQuestionActions) {
        this.kycPageActions = kycPageActions;
        this.kycQuestionActions = kycQuestionActions;
 
    }

    public KycAddNewPageFlow() {
    }

    public void addNewKYCPageFlow(KycPagePojo kycPagePojo , kycQuestionsNestedPojo kycQuestionPojo) throws InterruptedException {


        kycPageActions.AddNewKYCPage(kycPagePojo);
        kycQuestionActions.addNewQuestion(kycQuestionPojo);

}

}
