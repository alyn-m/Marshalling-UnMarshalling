package com.alyn.jaxb.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="OnusRouteRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class OnusRouteRequest {
	
	@XmlElement(name="GrpHdr")
	private GrpHdr groupHeader;
	@XmlElement(name="AgtInf")
	private AgtInf agentInfo;
	
	public GrpHdr getGroupHeader() {
		return groupHeader;
	}
	public void setGroupHeader(GrpHdr groupHeader) {
		this.groupHeader = groupHeader;
	}
	public AgtInf getAgentInfo() {
		return agentInfo;
	}
	public void setAgentInfo(AgtInf agentInfo) {
		this.agentInfo = agentInfo;
	}
}
