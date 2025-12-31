package com.ui.actions.KYC;



import java.util.List;
import org.openqa.selenium.WebDriver;
import com.ui.models.pojo.KYC.KycOptionsPojo;
import com.ui.models.pojo.KYC.KycQuestionPojo;
import com.ui.models.pojo.KYC.WrapperClasses.kycQuestionsNestedPojo;
import com.ui.pages.KYC.NewPage.KYCAddNewPage;

public class KYCQuestionActions {
    

    WebDriver driver;
    KYCAddNewPage kycAddNewPage = new KYCAddNewPage(driver);

    public KYCQuestionActions(KYCAddNewPage Page) {
        this.kycAddNewPage = Page;
    }

   

    public void addNewQuestion(kycQuestionsNestedPojo kycQuestionsNestedPojo) throws InterruptedException {

       List <KycQuestionPojo> questionPojos = kycQuestionsNestedPojo.getQuestions();
       int temp = 1;


       //Select Drop Down List 
       // Then Fill First Question

        for(int index = 0, index2= index + 1; index < questionPojos.size(); index++,index2++) {

            
            KycQuestionPojo questionPojo = questionPojos.get(index);
            kycAddNewPage
                    .DropdownListTypeQuestion(index2)
                    .fillEnglishQuestion(index2, questionPojo.getLabel().getEn())
                    .fillArabicQuestion(index2, questionPojo.getLabel().getAr());




                  // Add options buttons
                       for (int j = 0; j < questionPojos.get(index).getOptions().size()-1; j++) {
                          kycAddNewPage.clickAddOptionButtonForMultiQuestions(index2);
                           //if questions added we will update the index
                           //i = i + 4;
        
                        }



        
                        // Fill options
        
                        if (questionPojo.getType().equals("Dropdown List")) {
            
                            if (questionPojo.getOptions() != null) {
                
                                for (KycOptionsPojo option : questionPojo.getOptions()) {
                    
                                    kycAddNewPage
                    
                                    .fillEnglishOption(temp, option.getLabel().getEn())
                    
                                    .fillArabicOption(temp, option.getLabel().getAr());
                        
                                    temp++;
                                    if (questionPojo.getOptions().getQuestions().get(index2).size() > 0) {

                                    }
                                    addNewQuestion(kycQuestionsNestedPojo);
                
                                }
            
                            } else {
             
                                throw new IllegalArgumentException("Options cannot be null for DropdownList type questions.");
            
                            }
                        }
                        //to add new question and appear it
                        kycAddNewPage
                                     .clickAddByNewInputButton()
                                     .clickOnEyeIcon(index2);
                    }
        
                }                    
}                
