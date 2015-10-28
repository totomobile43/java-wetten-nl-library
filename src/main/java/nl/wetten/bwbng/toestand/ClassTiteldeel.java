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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for class.titeldeel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="class.titeldeel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}kop"/>
 *         &lt;element ref="{}structuurtekst" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{}hoofdstuk"/>
 *           &lt;element ref="{}afdeling"/>
 *           &lt;element ref="{}paragraaf"/>
 *           &lt;element ref="{}artikel"/>
 *           &lt;element ref="{}lokaal.structuur.wetgeving"/>
 *         &lt;/choice>
 *         &lt;group ref="{}lokaal.structuur.formeel"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "class.titeldeel", propOrder = {
    "kop",
    "structuurtekst",
    "hoofdstukOrAfdelingOrParagraaf",
    "metaData"
})
@XmlSeeAlso({
    Titeldeel.class
})
public class ClassTiteldeel {

    @XmlElement(required = true)
    protected Kop kop;
    protected Structuurtekst structuurtekst;
    @XmlElementRefs({
        @XmlElementRef(name = "hoofdstuk", type = Hoofdstuk.class, required = false),
        @XmlElementRef(name = "afdeling", type = Afdeling.class, required = false),
        @XmlElementRef(name = "paragraaf", type = Paragraaf.class, required = false),
        @XmlElementRef(name = "artikel", type = Artikel.class, required = false),
        @XmlElementRef(name = "lokaal.structuur.wetgeving", type = JAXBElement.class, required = false)
    })
    protected List<Object> hoofdstukOrAfdelingOrParagraaf;
    @XmlElement(name = "meta-data")
    protected MetaData metaData;

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
     * Gets the value of the structuurtekst property.
     * 
     * @return
     *     possible object is
     *     {@link Structuurtekst }
     *     
     */
    public Structuurtekst getStructuurtekst() {
        return structuurtekst;
    }

    /**
     * Sets the value of the structuurtekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Structuurtekst }
     *     
     */
    public void setStructuurtekst(Structuurtekst value) {
        this.structuurtekst = value;
    }

    /**
     * Gets the value of the hoofdstukOrAfdelingOrParagraaf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hoofdstukOrAfdelingOrParagraaf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHoofdstukOrAfdelingOrParagraaf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Hoofdstuk }
     * {@link JAXBElement }{@code <}{@link LokaalStructuurWetgeving }{@code >}
     * {@link Afdeling }
     * {@link Paragraaf }
     * {@link Artikel }
     * {@link JAXBElement }{@code <}{@link LokaalStructuurWetgeving }{@code >}
     * 
     * 
     */
    public List<Object> getHoofdstukOrAfdelingOrParagraaf() {
        if (hoofdstukOrAfdelingOrParagraaf == null) {
            hoofdstukOrAfdelingOrParagraaf = new ArrayList<Object>();
        }
        return this.hoofdstukOrAfdelingOrParagraaf;
    }

    /**
     * Gets the value of the metaData property.
     * 
     * @return
     *     possible object is
     *     {@link MetaData }
     *     
     */
    public MetaData getMetaData() {
        return metaData;
    }

    /**
     * Sets the value of the metaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaData }
     *     
     */
    public void setMetaData(MetaData value) {
        this.metaData = value;
    }

}
