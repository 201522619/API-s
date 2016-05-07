package br.com.webservice_cep;

import java.util.HashMap;

import br.com.webservice_cep.WebServiceCep.Xml;

public final class XmlEnums {
	
	private HashMap<String, Xml> enumsMap;

	public XmlEnums() {
		initializeEnums();
	}

	private void initializeEnums() {
		Xml[] enums = Xml.class.getEnumConstants();
		enumsMap = new HashMap<String, Xml>();
		for (int i = 0; i < enums.length; i++) {
			enumsMap.put(enums[i].name().toLowerCase(), enums[i]);
		}
	}

	public Xml getXml(String xmlName) {
		return enumsMap.get(xmlName.toLowerCase());
	}
}
