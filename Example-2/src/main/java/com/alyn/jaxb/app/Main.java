package com.alyn.jaxb.app;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.alyn.jaxb.model.Document;

public class Main {
	
	private static final String xmlFilLoc = "/home/aliyanm/Downloads/workspace/Marshalling-UnMarshalling/Marshalling-UnMarshalling/Example-2/src/main/resources/onus.xml";
	
	static File getFile() {
		File f = new File(xmlFilLoc);
		return f;
	}
	
	static Document unMarshal(File f) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Document.class);
		Unmarshaller unMarshaller = context.createUnmarshaller();
		return (Document)unMarshaller.unmarshal(f);
	}
	
	public static void main(String[] args) throws JAXBException {
		
		File f = getFile();
		Document doc = unMarshal(f);
		System.out.println(doc.getOnusRequest().getAgentInfo().getCdtrAgt().getFinInstnId().getClrSysMmbId().getMemberId());
	}
}
