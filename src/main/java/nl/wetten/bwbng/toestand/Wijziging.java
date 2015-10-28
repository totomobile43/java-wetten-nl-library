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
 *         &lt;element ref="{}nr" minOccurs="0"/>
 *         &lt;element ref="{}wat" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;group ref="{}structuur.maximaal"/>
 *           &lt;element ref="{}artikeltekst"/>
 *           &lt;element ref="{}artikel"/>
 *           &lt;element ref="{}artikelkop"/>
 *           &lt;element ref="{}wijzig-artikel"/>
 *           &lt;element ref="{}wijzig-lid"/>
 *           &lt;element ref="{}wijzig-divisie"/>
 *         &lt;/choice>
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
    "nr",
    "wat",
    "structuurAlgemeenOrTableOrArtikeltekst"
})
@XmlRootElement(name = "wijziging")
public class Wijziging {

    protected Nr nr;
    protected Wat wat;
    @XmlElementRefs({
        @XmlElementRef(name = "wijzig-divisie", type = WijzigDivisie.class, required = false),
        @XmlElementRef(name = "wijzig-lid", type = WijzigLid.class, required = false),
        @XmlElementRef(name = "artikel", type = Artikel.class, required = false),
        @XmlElementRef(name = "structuur.algemeen", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "artikeltekst", type = Artikeltekst.class, required = false),
        @XmlElementRef(name = "artikelkop", type = Artikelkop.class, required = false),
        @XmlElementRef(name = "table", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "wijzig-artikel", type = JAXBElement.class, required = false)
    })
    protected List<Object> structuurAlgemeenOrTableOrArtikeltekst;

    /**
     * Gets the value of the nr property.
     * 
     * @return
     *     possible object is
     *     {@link Nr }
     *     
     */
    public Nr getNr() {
        return nr;
    }

    /**
     * Sets the value of the nr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Nr }
     *     
     */
    public void setNr(Nr value) {
        this.nr = value;
    }

    /**
     * Gets the value of the wat property.
     * 
     * @return
     *     possible object is
     *     {@link Wat }
     *     
     */
    public Wat getWat() {
        return wat;
    }

    /**
     * Sets the value of the wat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Wat }
     *     
     */
    public void setWat(Wat value) {
        this.wat = value;
    }

    /**
     * Gets the value of the structuurAlgemeenOrTableOrArtikeltekst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structuurAlgemeenOrTableOrArtikeltekst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStructuurAlgemeenOrTableOrArtikeltekst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Formule }{@code >}
     * {@link JAXBElement }{@code <}{@link Lijst }{@code >}
     * {@link WijzigDivisie }
     * {@link WijzigLid }
     * {@link JAXBElement }{@code <}{@link Plaatje }{@code >}
     * {@link Artikel }
     * {@link JAXBElement }{@code <}{@link Al }{@code >}
     * {@link Artikeltekst }
     * {@link JAXBElement }{@code <}{@link Specificatielijst }{@code >}
     * {@link Artikelkop }
     * {@link JAXBElement }{@code <}{@link Citaat }{@code >}
     * {@link JAXBElement }{@code <}{@link Adres }{@code >}
     * {@link JAXBElement }{@code <}{@link LokaalStructuurLiType }{@code >}
     * {@link JAXBElement }{@code <}{@link Definitielijst }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Adreslijst }{@code >}
     * {@link JAXBElement }{@code <}{@link Tussenkop }{@code >}
     * {@link JAXBElement }{@code <}{@link LokaalStructuurWetgeving }{@code >}
     * 
     * 
     */
    public List<Object> getStructuurAlgemeenOrTableOrArtikeltekst() {
        if (structuurAlgemeenOrTableOrArtikeltekst == null) {
            structuurAlgemeenOrTableOrArtikeltekst = new ArrayList<Object>();
        }
        return this.structuurAlgemeenOrTableOrArtikeltekst;
    }

}
