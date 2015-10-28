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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for class.citaat-artikel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="class.citaat-artikel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}kop"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{}lid"/>
 *           &lt;group ref="{}structuur.maximaal"/>
 *           &lt;element ref="{}citaat-artikel"/>
 *           &lt;element ref="{}omissie"/>
 *           &lt;group ref="{}lokaal.structuur.artikel"/>
 *         &lt;/choice>
 *         &lt;element ref="{}artikel.toelichting" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}attlist.citaat-artikel"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "class.citaat-artikel", propOrder = {
    "kop",
    "lidOrStructuurAlgemeenOrTable",
    "artikelToelichting"
})
@XmlSeeAlso({
    CitaatArtikel.class
})
public class ClassCitaatArtikel {

    @XmlElement(required = true)
    protected Kop kop;
    @XmlElementRefs({
        @XmlElementRef(name = "omissie", type = Omissie.class, required = false),
        @XmlElementRef(name = "citaat-artikel", type = CitaatArtikel.class, required = false),
        @XmlElementRef(name = "lid", type = Lid.class, required = false),
        @XmlElementRef(name = "binnenwet", type = Binnenwet.class, required = false),
        @XmlElementRef(name = "structuur.algemeen", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "table", type = JAXBElement.class, required = false)
    })
    protected List<Object> lidOrStructuurAlgemeenOrTable;
    @XmlElement(name = "artikel.toelichting")
    protected ArtikelToelichting artikelToelichting;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "anySimpleType")
    protected String id;
    @XmlAttribute(name = "doc")
    @XmlSchemaType(name = "anySimpleType")
    protected String doc;
    @XmlAttribute(name = "anker")
    protected String anker;
    @XmlAttribute(name = "struct")
    @XmlSchemaType(name = "anySimpleType")
    protected String struct;

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
     * Gets the value of the lidOrStructuurAlgemeenOrTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lidOrStructuurAlgemeenOrTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLidOrStructuurAlgemeenOrTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Formule }{@code >}
     * {@link JAXBElement }{@code <}{@link Lijst }{@code >}
     * {@link CitaatArtikel }
     * {@link JAXBElement }{@code <}{@link Plaatje }{@code >}
     * {@link Lid }
     * {@link JAXBElement }{@code <}{@link Al }{@code >}
     * {@link JAXBElement }{@code <}{@link Specificatielijst }{@code >}
     * {@link JAXBElement }{@code <}{@link Citaat }{@code >}
     * {@link JAXBElement }{@code <}{@link Adres }{@code >}
     * {@link JAXBElement }{@code <}{@link LokaalStructuurLiType }{@code >}
     * {@link Omissie }
     * {@link Binnenwet }
     * {@link JAXBElement }{@code <}{@link Definitielijst }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Adreslijst }{@code >}
     * {@link JAXBElement }{@code <}{@link Tussenkop }{@code >}
     * 
     * 
     */
    public List<Object> getLidOrStructuurAlgemeenOrTable() {
        if (lidOrStructuurAlgemeenOrTable == null) {
            lidOrStructuurAlgemeenOrTable = new ArrayList<Object>();
        }
        return this.lidOrStructuurAlgemeenOrTable;
    }

    /**
     * Gets the value of the artikelToelichting property.
     * 
     * @return
     *     possible object is
     *     {@link ArtikelToelichting }
     *     
     */
    public ArtikelToelichting getArtikelToelichting() {
        return artikelToelichting;
    }

    /**
     * Sets the value of the artikelToelichting property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArtikelToelichting }
     *     
     */
    public void setArtikelToelichting(ArtikelToelichting value) {
        this.artikelToelichting = value;
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

}
