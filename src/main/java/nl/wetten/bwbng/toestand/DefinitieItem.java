//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.21 at 02:36:24 PM CEST 
//


package nl.wetten.bwbng.toestand;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}li.nr" minOccurs="0"/>
 *         &lt;element ref="{}term"/>
 *         &lt;element ref="{}definitie"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}attlist.definitie-item"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "liNr",
    "term",
    "definitie"
})
@XmlRootElement(name = "definitie-item")
public class DefinitieItem {

    @XmlElement(name = "li.nr")
    protected String liNr;
    @XmlElement(required = true)
    protected ClassTerm term;
    @XmlElement(required = true)
    protected Definitie definitie;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "anySimpleType")
    protected String id;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lang;

    /**
     * Gets the value of the liNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiNr() {
        return liNr;
    }

    /**
     * Sets the value of the liNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiNr(String value) {
        this.liNr = value;
    }

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link ClassTerm }
     *     
     */
    public ClassTerm getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassTerm }
     *     
     */
    public void setTerm(ClassTerm value) {
        this.term = value;
    }

    /**
     * Gets the value of the definitie property.
     * 
     * @return
     *     possible object is
     *     {@link Definitie }
     *     
     */
    public Definitie getDefinitie() {
        return definitie;
    }

    /**
     * Sets the value of the definitie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Definitie }
     *     
     */
    public void setDefinitie(Definitie value) {
        this.definitie = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

}
