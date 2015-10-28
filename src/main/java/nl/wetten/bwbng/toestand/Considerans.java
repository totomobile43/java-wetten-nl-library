//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.21 at 02:36:24 PM CEST 
//


package nl.wetten.bwbng.toestand;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{}considerans.al"/>
 *         &lt;element ref="{}considerans.lijst"/>
 *         &lt;element ref="{}tussenkop"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{}attlist.considerans"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "consideransAlOrConsideransLijstOrTussenkop"
})
@XmlRootElement(name = "considerans")
public class Considerans {

    @XmlElements({
        @XmlElement(name = "considerans.al", type = ConsideransAl.class),
        @XmlElement(name = "considerans.lijst", type = ConsideransLijst.class),
        @XmlElement(name = "tussenkop", type = Tussenkop.class)
    })
    protected List<Object> consideransAlOrConsideransLijstOrTussenkop;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "anySimpleType")
    protected String id;

    /**
     * Gets the value of the consideransAlOrConsideransLijstOrTussenkop property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consideransAlOrConsideransLijstOrTussenkop property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsideransAlOrConsideransLijstOrTussenkop().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsideransAl }
     * {@link ConsideransLijst }
     * {@link Tussenkop }
     * 
     * 
     */
    public List<Object> getConsideransAlOrConsideransLijstOrTussenkop() {
        if (consideransAlOrConsideransLijstOrTussenkop == null) {
            consideransAlOrConsideransLijstOrTussenkop = new ArrayList<Object>();
        }
        return this.consideransAlOrConsideransLijstOrTussenkop;
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

}
