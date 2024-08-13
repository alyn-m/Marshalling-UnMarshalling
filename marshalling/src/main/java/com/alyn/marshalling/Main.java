package com.alyn.marshalling;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Main {
	private static final String taskConfig = "/home/aliyanm/Downloads/workspace/Marshalling-UnMarshalling/Marshalling-UnMarshalling/marshalling/src/main/java/com/alyn/marshalling/task-config.xml"; 
	public static void main(String[] args) throws JAXBException {
		
		TaskMetaData taskMetaData = getTaskMetaData();
		convertJavaToXml_marshalling(taskMetaData);
		//File f = new File(taskConfig);
		//System.out.println(f.exists());
	}

	static TaskMetaData getTaskMetaData() {
		TaskMetaData taskMetaData = new TaskMetaData();

		List<Task> tasks = new ArrayList<Task>();

		Task t1 = new Task();
		t1.setTaskId(102);
		t1.setTaskContent("Avidia");
		tasks.add(t1);

		Task t2 = new Task();
		t2.setTaskId(103);
		t2.setTaskContent("forbright");
		tasks.add(t2);

		taskMetaData.setTask(tasks);
		
		return taskMetaData;
	}

	static void convertJavaToXml_marshalling(TaskMetaData taskMetaData) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(TaskMetaData.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		
		marshaller.marshal(taskMetaData, System.out);
		
		marshaller.marshal(taskMetaData, new File(taskConfig));
	}

}
