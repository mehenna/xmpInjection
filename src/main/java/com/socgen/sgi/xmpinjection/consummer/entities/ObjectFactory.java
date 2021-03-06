//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.22 at 12:13:42 PM CEST 
//


package com.socgen.sgi.xmpinjection.consummer.entities;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the in.benchresources.entities.sgi package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Metadonnees_QNAME = new QName("http://benchresources.in/entities/sgi", "metadonnees");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: in.benchresources.entities.sgi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MetadonneesType }
     * 
     */
    public MetadonneesType createMetadonneesType() {
        return new MetadonneesType();
    }

    /**
     * Create an instance of {@link MetadonneesEnsembleType }
     * 
     */
    public MetadonneesEnsembleType createMetadonneesEnsembleType() {
        return new MetadonneesEnsembleType();
    }

    /**
     * Create an instance of {@link MetadonneeType }
     * 
     */
    public MetadonneeType createMetadonneeType() {
        return new MetadonneeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadonneesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://benchresources.in/entities/sgi", name = "metadonnees")
    public JAXBElement<MetadonneesType> createMetadonnees(MetadonneesType value) {
        return new JAXBElement<MetadonneesType>(_Metadonnees_QNAME, MetadonneesType.class, null, value);
    }

}
