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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
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
 *       &lt;sequence>
 *         &lt;element ref="{}kop" minOccurs="0"/>
 *         &lt;group ref="{}structuur.maximaal" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "kop",
    "structuurMaximaal"
})
@XmlRootElement(name = "model")
public class Model {

    protected Kop kop;
    @XmlElementRefs({
        @XmlElementRef(name = "structuur.algemeen", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "table", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> structuurMaximaal;

    /**
     * Gets the value of the kop property.
     * 
     * @return
     *     possible object is
     *     {@link Kop }
     *     
     */
    public Kop getKop() {
        return kop;
    }

    /**
     * Sets the value of the kop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Kop }
     *     
     */
    public void setKop(Kop value) {
        this.kop = value;
    }

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

}
