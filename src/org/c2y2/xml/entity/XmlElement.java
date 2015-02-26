package org.c2y2.xml.entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement
public class XmlElement {
	
	@XmlAttribute
	public String element;
	
	@XmlValue
	public String value;
	
}
