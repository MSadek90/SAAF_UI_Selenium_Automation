package com.ui.domains.KYC;
import com.ui.domains.KYC.QuestionsTypeHandler.CheckboxHandler;
import com.ui.domains.KYC.QuestionsTypeHandler.DDLHandler;
import com.ui.domains.KYC.QuestionsTypeHandler.MultiOptionsHandler;
import com.ui.domains.KYC.QuestionsTypeHandler.ParagraphHandler;
import com.ui.domains.KYC.QuestionsTypeHandler.ShortAnswerHandler;
import com.ui.domains.KYC.QuestionsTypeHandler.StaticDDLHandler;
import com.ui.enums.questionType;


public class KycQuestionsFactory {

    public static KycQuestionsInterface getHandler(questionType type) {
        switch (type) {
            case PARAGRAPGH:
                return new ParagraphHandler();
            case SHORTANSWER:
                return new ShortAnswerHandler();
            case STATICDROPDOWN:
                return new StaticDDLHandler();
            case MULTIPLE_OPTIONS:
                return new MultiOptionsHandler();
            case DROPDOWN:
                return new DDLHandler();
            case CHECKBOX:
                return new CheckboxHandler();
            default:
                throw new IllegalArgumentException("Unknown question type: " + type);
        }
    }
    
}
