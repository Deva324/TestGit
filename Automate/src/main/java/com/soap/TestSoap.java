package com.soap;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.google.gson.Gson;

public class TestSoap {
	public static final String xPathExpression = "//*[local-name()='request']//*[local-name()='request']";
	public static final String soapProjectXML = "C:\\Users\\dgadiam\\Desktop\\smapples\\";

	public static void main(String[] args)
			throws ParserConfigurationException, SAXException, IOException, XPathExpressionException,
			TransformerFactoryConfigurationError, TransformerException, InstantiationException, IllegalAccessException {
		System.out.println("-------------Main method Started-----------");
		String fileName = getFileName();
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(soapProjectXML + fileName + ".xml");
		NodeList nodes = getRequest(doc, xPathExpression);
		modifyDom(nodes);
		writeToOutFile(doc, fileName);
		System.out.println("-----------Exit of the main method-------");

	}

	private static void writeToOutFile(Document doc, String fileName)
			throws TransformerFactoryConfigurationError, TransformerException {
		Transformer transformer = TransformerFactory.newInstance().newTransformer();
		Result output = new StreamResult(new File(soapProjectXML + fileName + "-test.xml"));
		Source input = new DOMSource(doc);
		transformer.transform(input, output);

	}

	private static String getFileName() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("------Enter File Name:--------");
		String fileName = br.readLine();
		return fileName;
	}

	private static NodeList getRequest(Document doc, String xPathExpression) throws XPathExpressionException {
		XPathFactory xpathfactory = XPathFactory.newInstance();
		XPath xpath = xpathfactory.newXPath();
		XPathExpression expr = xpath.compile(xPathExpression);
		NodeList nodes = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
		return nodes;
	}

	private static void modifyDom(NodeList nodes) throws InstantiationException, IllegalAccessException {
		for (int i = 0; i < nodes.getLength(); i++) {
			Customer customer = covertJsonToObject(nodes.item(i).getTextContent(), Customer.class);
			Student s = convertToServiceContract(customer);
			nodes.item(i).setTextContent(convertFromObjectToJson(s));

		}
	}

	private static <T> T covertJsonToObject(String payload, Class<T> class1) {
		Gson g = new Gson();
		T p = g.fromJson(payload, class1);
		return p;

	}

	private static Student convertToServiceContract(Customer c) throws InstantiationException, IllegalAccessException {
		Student student = createGenericInstance(Student.class);
		student.setId(c.getId());
		student.setName(c.getCustomerName());
		return student;
	}

	private static <T> T createGenericInstance(Class<T> class1) throws InstantiationException, IllegalAccessException {
		return class1.newInstance();

	}

	private static <T> String convertFromObjectToJson(T s) {
		Gson g = new Gson();
		return g.toJson(s);

	}
}
