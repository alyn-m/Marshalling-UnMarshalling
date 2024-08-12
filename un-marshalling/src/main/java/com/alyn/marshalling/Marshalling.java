package com.alyn.marshalling;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Marshalling {
	private static final String TaskFile = "/home/aliyanm/Downloads/workspace/Marshalling-UnMarshalling/Marshalling-UnMarshalling/marshalling/src/main/java/com/alyn/marshalling/configuration.xml";

	public static void main(String[] args) {
		
		TaskMetaData metaData = convertXmlToObject();
		
		System.out.println(metaData.getTask().get(0).getTaskId());
		System.out.println(metaData.getTask().get(0).getTaskName());
		
	}
	
	static TaskMetaData convertXmlToObject() {
		
		TaskMetaData taskData = null;
		try {
			File f = new File(TaskFile);
			
			JAXBContext context = JAXBContext.newInstance(TaskMetaData.class);
			Unmarshaller unMarshaller = context.createUnmarshaller();
			taskData = (TaskMetaData)unMarshaller.unmarshal(f);
			
			
		}
		catch(JAXBException e) {
			e.printStackTrace();
		}
		return taskData;
	}

}
