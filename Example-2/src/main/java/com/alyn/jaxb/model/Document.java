package com.alyn.jaxb.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Document")
@XmlAccessorType(XmlAccessType.FIELD)
public class Document {
	
	@XmlElement(name="OnusRouteRequest")
	private OnusRouteRequest onusRequest;

	public OnusRouteRequest getOnusRequest() {
		return onusRequest;
	}

	public void setOnusRequest(OnusRouteRequest onusRequest) {
		this.onusRequest = onusRequest;
	}
}
