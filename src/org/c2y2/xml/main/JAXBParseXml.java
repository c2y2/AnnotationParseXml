package org.c2y2.xml.main;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.c2y2.xml.entity.XmlEntity;

public class JAXBParseXml {
	public static void main(String[] args) {
		File file = new File("resource/xmlEntity.xml");
	    try {
			 Unmarshaller unmarshaller	= JAXBContext.newInstance(XmlEntity.class).createUnmarshaller();
			 XmlEntity xmlEntity = (XmlEntity)unmarshaller.unmarshal(file);
			 System.out.println(xmlEntity.elements.get(1).value);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
