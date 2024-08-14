package com.alyn.jaxb.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="AgtInf")
@XmlAccessorType(XmlAccessType.FIELD)
public class AgtInf {
	
	@XmlElement(name="DbtrAgt")
	private DbtrAgt dbtrAgt;
	@XmlElement(name="CdtrAgt")
	private CdtrAgt cdtrAgt;
	
	
	public DbtrAgt getDbtrAgt() {
		return dbtrAgt;
	}
	public void setDbtrAgt(DbtrAgt dbtrAgt) {
		this.dbtrAgt = dbtrAgt;
	}
	public CdtrAgt getCdtrAgt() {
		return cdtrAgt;
	}
	public void setCdtrAgt(CdtrAgt cdtrAgt) {
		this.cdtrAgt = cdtrAgt;
	}
}
