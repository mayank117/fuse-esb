package com.mycompany.cxf.transform.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.ws.WebFault;

@WebFault(name="PersonException")
@XmlAccessorType(XmlAccessType.FIELD)
public class PersonException extends RuntimeException {
    private final String personid;
    public PersonException(String message, String personId){
        super(message);
        this.personid = personId;
    }

    public String getPersonid(){
        return this.personid;
    }


}
