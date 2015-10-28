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
 *       &lt;attGroup ref="{}attlist.ref-item"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ref-item")
public class RefItem {

    @XmlAttribute(name = "doc", required = true)
    protected String doc;
    @XmlAttribute(name = "struct")
    @XmlSchemaType(name = "anySimpleType")
    protected String struct;
    @XmlAttribute(name = "anker")
    protected String anker;
    @XmlAttribute(name = "reeks")
    protected Reeks reeks;
    @XmlAttribute(name = "rol")
    @XmlSchemaType(name = "anySimpleType")
    protected String rol;
    @XmlAttribute(name = "beschrijving")
    @XmlSchemaType(name = "anySimpleType")
    protected String beschrijving;
    @XmlAttribute(name = "label")
    @XmlSchemaType(name = "anySimpleType")
    protected String label;
    @XmlAttribute(name = "status")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String status;

    /**
     * Gets the value of the doc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoc() {
        return doc;
    }

    /**
     * Sets the value of the doc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoc(String value) {
        this.doc = value;
    }

    /**
     * Gets the value of the struct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStruct() {
        return struct;
    }

    /**
     * Sets the value of the struct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStruct(String value) {
        this.struct = value;
    }

    /**
     * Gets the value of the anker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnker() {
        return anker;
    }

    /**
     * Sets the value of the anker property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnker(String value) {
        this.anker = value;
    }

    /**
     * Gets the value of the reeks property.
     * 
     * @return
     *     possible object is
     *     {@link Reeks }
     *     
     */
    public Reeks getReeks() {
        return reeks;
    }

    /**
     * Sets the value of the reeks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reeks }
     *     
     */
    public void setReeks(Reeks value) {
        this.reeks = value;
    }

    /**
     * Gets the value of the rol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRol() {
        return rol;
    }

    /**
     * Sets the value of the rol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRol(String value) {
        this.rol = value;
    }

    /**
     * Gets the value of the beschrijving property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeschrijving() {
        return beschrijving;
    }

    /**
     * Sets the value of the beschrijving property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeschrijving(String value) {
        this.beschrijving = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
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
            return "actief";
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

}
