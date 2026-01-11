package com.ui.actions.KYC;



import java.util.List;

import org.openqa.selenium.WebDriver;
import com.ui.models.pojo.KYC.KycOptionPojo;
import com.ui.models.pojo.KYC.KycQuestionPojo;
import com.ui.pages.KYC.NewPage.KYCAddNewPage;


public class KYCQuestionActions {
    

   
    //For Questions Locators
    int questionTemp = 1, questionTemp2 = 0 ;
    //For Options Locators
    int optionTemp = 1, optionTemp2 = 0 ;
    // For Nested Options
    int optionFlag = 0 ;


    WebDriver driver;
    KYCAddNewPage kycAddNewPage = new KYCAddNewPage(driver);


    /*
      Constructor
     */
    
    public KYCQuestionActions(KYCAddNewPage Page) {
        this.kycAddNewPage = Page;
    }



    /*

    private helper functions 
    
    */
    private void fillOneQuestionMainFields(KycQuestionPojo kycQuestionPojo, int questionIndex) throws InterruptedException{
    
          kycAddNewPage
                    .DropdownListTypeQuestion(questionIndex)
                    .fillEnglishQuestion(questionIndex, kycQuestionPojo.getLabel().getEn())
                    .fillArabicQuestion(questionIndex, kycQuestionPojo.getLabel().getAr());

    }

    
    private void addOptions(KycOptionPojo kycOptionPojo, int optionIndex){

        kycAddNewPage
        .fillEnglishOption(optionIndex, kycOptionPojo.getLabel().getEn())
        .fillArabicOption(optionIndex, kycOptionPojo.getLabel().getAr());
    }


    private void clickEyeIcon(int questionTemp){
        kycAddNewPage
        .clickOnEyeIcon(questionTemp);
    }


    private void addNewoption(int optionIndex)
    {
        kycAddNewPage
        .clickAddOptionButtonForMultiQuestions(optionIndex);
    }


    private void addNewQuestionbutton(){
        kycAddNewPage
        .clickAddByNewInputButton();
    }

    private void clickAddNestedQuestionsInOptions(int index){
        kycAddNewPage
        .clickAddNestedQuestionsInOption(index);
    }



    
   


    /*

     Main Function To add Questions Per page 

    */
    
        

    public void addQuestionsPerPage(List<KycQuestionPojo>questions) throws InterruptedException{
        

        System.out.println("question_Temp is: " + questionTemp);
        System.out.println("option_Temp is: " + optionTemp);

       
      


        
        

        // Loop on questions with questionTemp (Locators Start from 1)
           
        for( KycQuestionPojo question : questions){
            

            System.out.println("Number of Options of question[" +question.getQuestionId()+"] is: " + question.getOptions().size());

            //Fill Label en/ar for each question
            fillOneQuestionMainFields(question, questionTemp);             
               
            


            //Loop on Options
            for(KycOptionPojo option : question.getOptions()){


            
                //Fill Label en/ar for each option
                addOptions(option, optionTemp);


                

                //Nested questions in Options
                if (option.getQuestions() != null) {
                    
                    optionFlag = 1;
                    questionTemp2 = questionTemp;// to fill exact options
                    
                    
                    clickAddNestedQuestionsInOptions(optionTemp);



                    optionTemp2 = option.getQuestions().get(questionTemp - 1).getOptions().size();
                    System.out.println("Number of options in question["+questionTemp+"] is: " + optionTemp2);
                    
                    
                    optionTemp++;
                    System.out.println("option Temp is: " + optionTemp);
                    
                    
                    questionTemp++;
                    System.out.println("question Temp is: " + questionTemp);
                   
                    addQuestionsPerPage(option.getQuestions());
                }


                if(optionFlag == 1){
                    
                    System.out.println("optionTemp2 before loop is: " + optionTemp2);
                    
                    for(int index =0 ; index < optionTemp2 ;index++){
                        
                        addNewoption(questionTemp2);
                
                    }
                    optionFlag=0;
                }
                
                    else{
                
                        addNewoption(questionTemp);
                
                    }
                    
                optionTemp++;
            }

          
                //addNewQuestionbutton();
                //clickEyeIcon(questionTemp);
                //questionTemp++;
            
        }    
        

    }              
}                
