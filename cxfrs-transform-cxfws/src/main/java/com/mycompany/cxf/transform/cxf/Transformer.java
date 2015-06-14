package com.mycompany.cxf.transform.cxf;

import org.apache.camel.Exchange;
import org.apache.cxf.message.MessageContentsList;


public class Transformer {

	public void transform(Person person , Exchange exch)  {
		person.setName("nameFromTransformer");
		exch.getOut().setBody(person);
	}
	
	public void transformResponse(Exchange ex){
		MessageContentsList mcl = ex.getIn().getBody(MessageContentsList.class);
		Person response = (Person) mcl.get(0);
		ex.getOut().setBody(response);
	}

}
