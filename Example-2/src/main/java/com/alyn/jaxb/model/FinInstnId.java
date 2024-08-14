package com.alyn.jaxb.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="FinInstnId")
@XmlAccessorType(XmlAccessType.FIELD)
public class FinInstnId {
	
	@XmlElement(name="ClrSysMmbId")
	private ClrSysMmbId clrSysMmbId;

	public ClrSysMmbId getClrSysMmbId() {
		return clrSysMmbId;
	}

	public void setClrSysMmbId(ClrSysMmbId clrSysMmbId) {
		this.clrSysMmbId = clrSysMmbId;
	}
}
