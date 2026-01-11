package com.ui.pages.KYC.NewPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.ui.base.BasePage;
import com.ui.models.pojo.KYC.WrapperClasses.KycLabelNestedPojo;
import com.ui.utils.ClickAction;
import com.ui.utils.Scrolling;
import com.ui.utils.SendKeys;


public class KYCAddNewPage  extends BasePage {

    public KYCAddNewPage(WebDriver driver) {
        super(driver);
    }


    // Add KYC Page Form Locators
    private final By pageTypeDropdown =        By.xpath("//select[contains(@name,'type') or contains(@id,'type')] | //div[contains(text(),'Select page type')]");
    private final By customerTypeOption =      By.xpath("//option[contains(text(),'Customer')] | //div[contains(text(),'Customer')]");
    private final By companyTypeOption =       By.xpath("//option[contains(text(),'Company')] | //div[contains(text(),'Company')]");
    private final By englishPageTitleField =   By.xpath("//input[contains(@placeholder,'page title in English')]");
    private final By arabicPageTitleField =    By.xpath("//input[contains(@placeholder,'page title in Arabic')]");
    private final By englishDescriptionField = By.xpath("//textarea[contains(@placeholder,'page description in English') or contains(@name,'description_en')]");
    private final By arabicDescriptionField =  By.xpath("//textarea[contains(@placeholder,'page description in Arabic') or contains(@name,'description_ar')]");
    private final By addByNewInputButton = By.cssSelector("button[class='add-input']");
    private final By addNestedInOption = By.xpath("(//img[@alt='nested'])[1]");
    

//(
/// //

    /*
           To use them when pass Ids from json files
     */
    
      public KYCAddNewPage getPageId(String kycPageId) {
        return this;
       }


    
       public KYCAddNewPage getQuestionId(String questionId) {
        return this;
       }


       public KYCAddNewPage getOptionId(String optionId) {
        return this;
       }


    /*
         Select Page Type from Dropdown
     */
    public KYCAddNewPage selectPageType(String pageType) {
        ClickAction.click(driver, pageTypeDropdown);
        if (pageType.equalsIgnoreCase("Customer")) {
            ClickAction.click(driver, customerTypeOption);
        }
        else if (pageType.equalsIgnoreCase("Company")) {
            ClickAction.click(driver, companyTypeOption);
        }
        return this;
    }



    /*
       Fill KYC Page Form
     */

       public KYCAddNewPage fillEnglishName(KycLabelNestedPojo englishName) {
        SendKeys.sendKeysBySequenceCharacters(driver, englishPageTitleField, englishName.getEn());
        return this;
       }

         public KYCAddNewPage fillArabicName(KycLabelNestedPojo arabicName) {
          SendKeys.sendKeysBySequenceCharacters(driver, arabicPageTitleField, arabicName.getAr());
          return this;
         }


            public KYCAddNewPage fillEnglishDescription(KycLabelNestedPojo englishDescription) {
            SendKeys.sendKeysBySequenceCharacters(driver, englishDescriptionField, englishDescription.getEn());
            return this;
            }

            public KYCAddNewPage fillArabicDescription(KycLabelNestedPojo arabicDescription) {
            SendKeys.sendKeysBySequenceCharacters(driver, arabicDescriptionField, arabicDescription.getAr());
            return this;
            }



            /*
                 First (Question) >> Default 
             */

            public KYCAddNewPage fillEnglishQuestion(int index, String englishQuestion) {
                SendKeys.sendKeys(driver, By.xpath("(//input[@placeholder='Enter English Input Title'])[" + index + "]"), englishQuestion);
                return this;
            }

            public KYCAddNewPage fillArabicQuestion(int index,  String arabicQuestion) {
                SendKeys.sendKeys(driver, By.xpath("(//input[@placeholder='Enter Arabic Input Title'])[" + index + "]"), arabicQuestion);
                return this;
            }





            /*
            Options
             */

            public KYCAddNewPage fillEnglishOption(int Index, String englishOption) {
                SendKeys.sendKeys(driver, By.xpath("(//input[@placeholder='Enter English Option'])[" + Index + "]"), englishOption);
                return this;
            }

            public KYCAddNewPage fillArabicOption(int Index, String arabicOption) {
                SendKeys.sendKeys(driver, By.xpath("(//input[@placeholder='Enter Arabic Option'])[" + Index + "]"), arabicOption);
                return this;
            }


            /*
              click icon to open Nested Options
            */

            public KYCAddNewPage clickAddNestedQuestionsInOption(int index) {
                ClickAction.clickUsingJavaScript(driver, By.xpath("(//img[@alt='nested'])["+index+"]"));
                return this;
            }

            /*
              click Add Option Button
            */

            public KYCAddNewPage clickAddOptionButtonForMultiQuestions(int index) {
                Scrolling.scrollToElement(driver, By.xpath("(//span[contains(text(),'Add Option')])[" + index + "]"));
                ClickAction.clickUsingJavaScript(driver, By.xpath("(//span[contains(text(),'Add Option')])[" + index + "]"));
                return this;
            }

            /*
            Select Dropdown List Type Question
             */
            public KYCAddNewPage DropdownListTypeQuestion(int index) throws InterruptedException {
                ClickAction.clickUsingJavaScript(driver, By.xpath("(//div[contains(@class,'align-items-center gap-3')]//div[@class='choices__inner'])[" + index + "]"));
                ClickAction.click(driver, By.xpath("(//div[contains(@id,'type-item-choice-2')])[" + index + "]"));
                return this;
            }

            /*
            Add new input field
            */
            public KYCAddNewPage clickAddByNewInputButton() {
                ClickAction.clickUsingJavaScript(driver, addByNewInputButton);
                return this;
            }
            

            /*
               Click on Eye Icon
             */

               public KYCAddNewPage clickOnEyeIcon(int index) {
                ClickAction.clickUsingJavaScript(driver, By.xpath("(//img[@alt='show'])[" + index + "]"));
                return this;
               }
}