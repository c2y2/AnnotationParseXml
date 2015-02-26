package org.c2y2.xml.entity;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="XmlEntity")
public class XmlEntity {
	
	@XmlAttribute
	public String namespace;
	
	@XmlElement(name = "element")
	public List<org.c2y2.xml.entity.XmlElement> elements = new ArrayList<org.c2y2.xml.entity.XmlElement>();
}
