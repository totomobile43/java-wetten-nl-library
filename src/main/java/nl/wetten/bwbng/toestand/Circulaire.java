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
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element ref="{}circulaire.aanhef" minOccurs="0"/>
 *         &lt;element ref="{}circulaire-tekst"/>
 *         &lt;element ref="{}circulaire-sluiting" minOccurs="0"/>
 *         &lt;element ref="{}bijlage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}attlist.circulaire"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "circulaireAanhef",
    "circulaireTekst",
    "circulaireSluiting",
    "bijlage"
})
@XmlRootElement(name = "circulaire")
public class Circulaire {

    @XmlElement(name = "circulaire.aanhef")
    protected CirculaireAanhef circulaireAanhef;
    @XmlElement(name = "circulaire-tekst", required = true)
    protected CirculaireTekst circulaireTekst;
    @XmlElement(name = "circulaire-sluiting")
    protected CirculaireSluiting circulaireSluiting;
    protected List<Bijlage> bijlage;

    /**
     * Gets the value of the circulaireAanhef property.
     * 
     * @return
     *     possible object is
     *     {@link CirculaireAanhef }
     *     
     */
    public CirculaireAanhef getCirculaireAanhef() {
        return circulaireAanhef;
    }

    /**
     * Sets the value of the circulaireAanhef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CirculaireAanhef }
     *     
     */
    public void setCirculaireAanhef(CirculaireAanhef value) {
        this.circulaireAanhef = value;
    }

    /**
     * Gets the value of the circulaireTekst property.
     * 
     * @return
     *     possible object is
     *     {@link CirculaireTekst }
     *     
     */
    public CirculaireTekst getCirculaireTekst() {
        return circulaireTekst;
    }

    /**
     * Sets the value of the circulaireTekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link CirculaireTekst }
     *     
     */
    public void setCirculaireTekst(CirculaireTekst value) {
        this.circulaireTekst = value;
    }

    /**
     * Gets the value of the circulaireSluiting property.
     * 
     * @return
     *     possible object is
     *     {@link CirculaireSluiting }
     *     
     */
    public CirculaireSluiting getCirculaireSluiting() {
        return circulaireSluiting;
    }

    /**
     * Sets the value of the circulaireSluiting property.
     * 
     * @param value
     *     allowed object is
     *     {@link CirculaireSluiting }
     *     
     */
    public void setCirculaireSluiting(CirculaireSluiting value) {
        this.circulaireSluiting = value;
    }

    /**
     * Gets the value of the bijlage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bijlage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBijlage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Bijlage }
     * 
     * 
     */
    public List<Bijlage> getBijlage() {
        if (bijlage == null) {
            bijlage = new ArrayList<Bijlage>();
        }
        return this.bijlage;
    }

}
