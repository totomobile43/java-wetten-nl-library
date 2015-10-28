//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.21 at 02:36:24 PM CEST 
//


package nl.wetten.bwbng.toestand;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}inf"/>
 *         &lt;element ref="{}meta-data"/>
 *         &lt;element ref="{}nadruk"/>
 *         &lt;element ref="{}omissie"/>
 *         &lt;element ref="{}ovl"/>
 *         &lt;element ref="{}sup"/>
 *         &lt;element ref="{}unl"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{}attlist.citeertitel"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "citeertitel")
public class Citeertitel {

    @XmlElementRefs({
        @XmlElementRef(name = "nadruk", type = Nadruk.class, required = false),
        @XmlElementRef(name = "omissie", type = Omissie.class, required = false),
        @XmlElementRef(name = "sup", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "meta-data", type = MetaData.class, required = false),
        @XmlElementRef(name = "unl", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ovl", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "inf", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Object> content;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "anySimpleType")
    protected String id;
    @XmlAttribute(name = "status")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String status;
    @XmlAttribute(name = "terugwerking")
    @XmlSchemaType(name = "anySimpleType")
    protected String terugwerking;
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
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Nadruk }
     * {@link Omissie }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link MetaData }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link String }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        if (status == null) {
            return "officieel";
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
