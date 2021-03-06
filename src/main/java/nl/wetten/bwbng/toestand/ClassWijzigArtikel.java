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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for class.wijzig-artikel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="class.wijzig-artikel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}kop"/>
 *         &lt;element ref="{}wat" minOccurs="0"/>
 *         &lt;sequence>
 *           &lt;choice maxOccurs="unbounded" minOccurs="0">
 *             &lt;element ref="{}al"/>
 *             &lt;element ref="{}lijst"/>
 *           &lt;/choice>
 *           &lt;choice minOccurs="0">
 *             &lt;choice maxOccurs="unbounded">
 *               &lt;element ref="{}wijzig-lid-groep"/>
 *               &lt;element ref="{}wijzig-lid"/>
 *             &lt;/choice>
 *             &lt;element ref="{}wijziging" maxOccurs="unbounded"/>
 *           &lt;/choice>
 *           &lt;group ref="{}lokaal.structuur.formeel"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "class.wijzig-artikel", propOrder = {
    "kop",
    "wat",
    "alOrLijst",
    "wijzigLidGroepOrWijzigLid",
    "wijziging",
    "metaData"
})
@XmlSeeAlso({
    LokaalStructuurWetgeving.class
})
public class ClassWijzigArtikel {

    @XmlElement(required = true)
    protected Kop kop;
    protected Wat wat;
    @XmlElements({
        @XmlElement(name = "al", type = Al.class),
        @XmlElement(name = "lijst", type = Lijst.class)
    })
    protected List<Object> alOrLijst;
    @XmlElements({
        @XmlElement(name = "wijzig-lid-groep", type = WijzigLidGroep.class),
        @XmlElement(name = "wijzig-lid", type = WijzigLid.class)
    })
    protected List<Object> wijzigLidGroepOrWijzigLid;
    protected List<Wijziging> wijziging;
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
     * Gets the value of the alOrLijst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alOrLijst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlOrLijst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Al }
     * {@link Lijst }
     * 
     * 
     */
    public List<Object> getAlOrLijst() {
        if (alOrLijst == null) {
            alOrLijst = new ArrayList<Object>();
        }
        return this.alOrLijst;
    }

    /**
     * Gets the value of the wijzigLidGroepOrWijzigLid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wijzigLidGroepOrWijzigLid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWijzigLidGroepOrWijzigLid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WijzigLidGroep }
     * {@link WijzigLid }
     * 
     * 
     */
    public List<Object> getWijzigLidGroepOrWijzigLid() {
        if (wijzigLidGroepOrWijzigLid == null) {
            wijzigLidGroepOrWijzigLid = new ArrayList<Object>();
        }
        return this.wijzigLidGroepOrWijzigLid;
    }

    /**
     * Gets the value of the wijziging property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wijziging property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWijziging().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Wijziging }
     * 
     * 
     */
    public List<Wijziging> getWijziging() {
        if (wijziging == null) {
            wijziging = new ArrayList<Wijziging>();
        }
        return this.wijziging;
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
