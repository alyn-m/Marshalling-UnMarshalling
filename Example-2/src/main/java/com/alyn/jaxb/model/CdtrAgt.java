package com.alyn.jaxb.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="CdtrAgt")
@XmlAccessorType(XmlAccessType.FIELD)
public class CdtrAgt {
	
	@XmlElement(name="FinInstnId")
	private FinInstnId finInstnId;

	public FinInstnId getFinInstnId() {
		return finInstnId;
	}

	public void setFinInstnId(FinInstnId finInstnId) {
		this.finInstnId = finInstnId;
	}
}
