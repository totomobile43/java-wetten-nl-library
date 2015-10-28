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
 *       &lt;group ref="{}structuur.maximaal" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;attGroup ref="{}attlist.artikel.toelichting"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "structuurMaximaal"
})
@XmlRootElement(name = "artikel.toelichting")
public class ArtikelToelichting {

    @XmlElementRefs({
        @XmlElementRef(name = "structuur.algemeen", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "table", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> structuurMaximaal;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "anySimpleType")
    protected String id;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lang;

    /**
     * Gets the value of the structuurMaximaal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structuurMaximaal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStructuurMaximaal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Formule }{@code >}
     * {@link JAXBElement }{@code <}{@link Lijst }{@code >}
     * {@link JAXBElement }{@code <}{@link Plaatje }{@code >}
     * {@link JAXBElement }{@code <}{@link Al }{@code >}
     * {@link JAXBElement }{@code <}{@link Specificatielijst }{@code >}
     * {@link JAXBElement }{@code <}{@link Citaat }{@code >}
     * {@link JAXBElement }{@code <}{@link Adres }{@code >}
     * {@link JAXBElement }{@code <}{@link LokaalStructuurLiType }{@code >}
     * {@link JAXBElement }{@code <}{@link Definitielijst }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Adreslijst }{@code >}
     * {@link JAXBElement }{@code <}{@link Tussenkop }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getStructuurMaximaal() {
        if (structuurMaximaal == null) {
            structuurMaximaal = new ArrayList<JAXBElement<?>>();
        }
        return this.structuurMaximaal;
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
