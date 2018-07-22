package com.socgen.sgi.xmpinjection.consummer;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Component;

import com.socgen.sgi.xmpinjection.consummer.entities.MetadonneeType;
import com.socgen.sgi.xmpinjection.consummer.entities.MetadonneesEnsembleType;
import com.socgen.sgi.xmpinjection.consummer.entities.MetadonneesType;

@Component 
public class ConsummingInputDataImpl implements IConsummingInputData {
	/**
	 * logger 
	 */
	private static final Logger logger = LoggerFactory.getLogger(ConsummingInputDataImpl.class);
	/**	
	 * Consuming input data
	 * @param strings
	 */
	public void consum(String ...strings){
		Arrays.asList(strings).stream().forEach(System.out::println);
		 logger.info("------------------------------");
		Arrays.asList(strings).stream().forEach( s -> System.out.println(s) );
	}
	/**
	 * 
	 */
	public void consumfils(String ...strings) throws Exception {
		if (Arrays.asList(strings)!=null && strings.length > 0 ) {
			byte[] file = Files.readAllBytes(Paths.get(strings[1]));
			 logger.info("file  ------------------------------>  " + file.length);
		}else {
			 logger.info("------------------------------ NO DATA FOUNDED ");
		}

	}
	@Override
	public void consumXml(String xml) throws Exception {
	    JAXBContext jaxbContext = JAXBContext.newInstance(MetadonneesEnsembleType.class);
	    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	    StringReader reader = new StringReader(xml);
	    MetadonneesEnsembleType  metadonnes = (MetadonneesEnsembleType) jaxbUnmarshaller.unmarshal(reader);
	    Marshaller marchaller = jaxbContext.createMarshaller();
	    
	    logger.info("metadonnes ----------> " + metadonnes.toString());
	}
	
	public void consumXml() throws Exception {
		MetadonneesType metadonnes = new MetadonneesType();
		MetadonneesEnsembleType  metadonnesSet = new MetadonneesEnsembleType();
		
		MetadonneeType metadata = new MetadonneeType();
		metadata.setName("entite1");
		metadata.setValue("value1");
		metadonnesSet.getMetadonnee().add(metadata);
		metadata.setName("entite2");
		metadata.setValue("value2");
		metadonnesSet.getMetadonnee().add(metadata);
		metadata.setName("entite3");
		metadata.setValue("value3");
		metadonnesSet.getMetadonnee().add(metadata);
		metadata.setName("entite4");
		metadata.setValue("value4");
		metadonnesSet.getMetadonnee().add(metadata);
		metadata.setName("entite5");
		metadata.setValue("value5");
		metadonnesSet.getMetadonnee().add(metadata);
		metadonnesSet.setId("SGI");
		metadonnesSet.setName("http://test.in/space/namespaces");
		metadonnes.getMetadonneesEnsemble().add(metadonnesSet);
		
	    JAXBContext jaxbContext = JAXBContext.newInstance(MetadonneesEnsembleType.class);
		Marshaller marchaller = jaxbContext.createMarshaller();
		StringWriter sw = new StringWriter();
		marchaller.marshal(metadonnes, sw);
		String xmlString = sw.toString();
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println(xmlString);
		System.out.println("--------------------------------------------------------------------------------");
	}
}
