package com.ui.models.pojo.KYC;
import com.ui.models.pojo.KYC.WrapperClasses.KycLabelNestedPojo;



public class KycPagePojo {
  
    private String id;

    private String type;


    private KycLabelNestedPojo title;

    private KycLabelNestedPojo description;



    public KycLabelNestedPojo getTitle() {
        return title;
    }

    public void setTitle(KycLabelNestedPojo title) {
        this.title = title;
    }

    public KycLabelNestedPojo getDescription() {
        return description;
    }

    public void setDescription(KycLabelNestedPojo description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


   
   
}
