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
import javax.xml.bind.annotation.XmlID;
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
 *     &lt;extension base="{}class.enig-artikel">
 *       &lt;attGroup ref="{}attlist.enig-artikel"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "enig-artikel")
public class EnigArtikel
    extends ClassEnigArtikel
{

    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "terugwerking")
    @XmlSchemaType(name = "anySimpleType")
    protected String terugwerking;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lang;
    @XmlAttribute(name = "status")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String status;
    @XmlAttribute(name = "code")
    @XmlSchemaType(name = "anySimpleType")
    protected String code;
    @XmlAttribute(name = "type")
    @XmlSchemaType(name = "anySimpleType")
    protected String type;
    @XmlAttribute(name = "label-id")
    @XmlSchemaType(name = "anySimpleType")
    protected String labelId;
    @XmlAttribute(name = "stam-id")
    @XmlSchemaType(name = "anySimpleType")
    protected String stamId;
    @XmlAttribute(name = "versie-id")
    @XmlSchemaType(name = "anySimpleType")
    protected String versieId;
    @XmlAttribute(name = "publicatie")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String publicatie;

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
     * Gets the value of the terugwerking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerugwerking() {
        return terugwerking;
    }

    /**
     * Sets the value of the terugwerking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerugwerking(String value) {
        this.terugwerking = value;
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

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        if (status == null) {
            return "goed";
        } else {
            return status;
        }
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the labelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelId() {
        return labelId;
    }

    /**
     * Sets the value of the labelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelId(String value) {
        this.labelId = value;
    }

    /**
     * Gets the value of the stamId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStamId() {
        return stamId;
    }

    /**
     * Sets the value of the stamId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStamId(String value) {
        this.stamId = value;
    }

    /**
     * Gets the value of the versieId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersieId() {
        return versieId;
    }

    /**
     * Sets the value of the versieId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersieId(String value) {
        this.versieId = value;
    }

    /**
     * Gets the value of the publicatie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicatie() {
        return publicatie;
    }

    /**
     * Sets the value of the publicatie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicatie(String value) {
        this.publicatie = value;
    }

}
