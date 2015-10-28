//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.21 at 02:37:27 PM CEST 
//


package nl.wetten.bwbng.manifest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WorkMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkMetadata">
 *   &lt;complexContent>
 *     &lt;extension base="{}WorkMetadata">
 *       &lt;redefine>
 *         &lt;complexType name="WorkMetadata">
 *           &lt;complexContent>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *               &lt;all>
 *               &lt;/all>
 *             &lt;/restriction>
 *           &lt;/complexContent>
 *         &lt;/complexType>
 *       &lt;/redefine>
 *       &lt;all>
 *         &lt;element name="wti_locatie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datum_totstandkoming" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="datum_voorlopige_toepassing" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="datum_inwerkingtreding" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="datum_materiele_uitwerking" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="datum_intrekking" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="datum_terugwerking_vt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="scope_terugwerking_vt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datum_terugwerking_iwt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="scope_terugwerking_iwt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datum_terugwerking_int" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="scope_terugwerking_int" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tijdstip_wti_toegevoegd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tijdstip_laatste_wijziging_wti" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkMetadata", propOrder = {
    "wtiLocatie",
    "datumTotstandkoming",
    "datumVoorlopigeToepassing",
    "datumInwerkingtreding",
    "datumMaterieleUitwerking",
    "datumIntrekking",
    "datumTerugwerkingVt",
    "scopeTerugwerkingVt",
    "datumTerugwerkingIwt",
    "scopeTerugwerkingIwt",
    "datumTerugwerkingInt",
    "scopeTerugwerkingInt",
    "tijdstipWtiToegevoegd",
    "tijdstipLaatsteWijzigingWti"
})
public class WorkMetadata
    extends OriginalWorkMetadata
{

    @XmlElement(name = "wti_locatie")
    protected String wtiLocatie;
    @XmlElement(name = "datum_totstandkoming")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumTotstandkoming;
    @XmlElement(name = "datum_voorlopige_toepassing")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumVoorlopigeToepassing;
    @XmlElement(name = "datum_inwerkingtreding")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumInwerkingtreding;
    @XmlElement(name = "datum_materiele_uitwerking")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumMaterieleUitwerking;
    @XmlElement(name = "datum_intrekking")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumIntrekking;
    @XmlElement(name = "datum_terugwerking_vt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumTerugwerkingVt;
    @XmlElement(name = "scope_terugwerking_vt", defaultValue = "tot-en-met")
    protected String scopeTerugwerkingVt;
    @XmlElement(name = "datum_terugwerking_iwt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumTerugwerkingIwt;
    @XmlElement(name = "scope_terugwerking_iwt", defaultValue = "tot-en-met")
    protected String scopeTerugwerkingIwt;
    @XmlElement(name = "datum_terugwerking_int")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumTerugwerkingInt;
    @XmlElement(name = "scope_terugwerking_int", defaultValue = "tot-en-met")
    protected String scopeTerugwerkingInt;
    @XmlElement(name = "tijdstip_wti_toegevoegd")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tijdstipWtiToegevoegd;
    @XmlElement(name = "tijdstip_laatste_wijziging_wti")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tijdstipLaatsteWijzigingWti;

    /**
     * Gets the value of the wtiLocatie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWtiLocatie() {
        return wtiLocatie;
    }

    /**
     * Sets the value of the wtiLocatie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWtiLocatie(String value) {
        this.wtiLocatie = value;
    }

    /**
     * Gets the value of the datumTotstandkoming property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumTotstandkoming() {
        return datumTotstandkoming;
    }

    /**
     * Sets the value of the datumTotstandkoming property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumTotstandkoming(XMLGregorianCalendar value) {
        this.datumTotstandkoming = value;
    }

    /**
     * Gets the value of the datumVoorlopigeToepassing property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumVoorlopigeToepassing() {
        return datumVoorlopigeToepassing;
    }

    /**
     * Sets the value of the datumVoorlopigeToepassing property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumVoorlopigeToepassing(XMLGregorianCalendar value) {
        this.datumVoorlopigeToepassing = value;
    }

    /**
     * Gets the value of the datumInwerkingtreding property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumInwerkingtreding() {
        return datumInwerkingtreding;
    }

    /**
     * Sets the value of the datumInwerkingtreding property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumInwerkingtreding(XMLGregorianCalendar value) {
        this.datumInwerkingtreding = value;
    }

    /**
     * Gets the value of the datumMaterieleUitwerking property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumMaterieleUitwerking() {
        return datumMaterieleUitwerking;
    }

    /**
     * Sets the value of the datumMaterieleUitwerking property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumMaterieleUitwerking(XMLGregorianCalendar value) {
        this.datumMaterieleUitwerking = value;
    }

    /**
     * Gets the value of the datumIntrekking property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumIntrekking() {
        return datumIntrekking;
    }

    /**
     * Sets the value of the datumIntrekking property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumIntrekking(XMLGregorianCalendar value) {
        this.datumIntrekking = value;
    }

    /**
     * Gets the value of the datumTerugwerkingVt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumTerugwerkingVt() {
        return datumTerugwerkingVt;
    }

    /**
     * Sets the value of the datumTerugwerkingVt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumTerugwerkingVt(XMLGregorianCalendar value) {
        this.datumTerugwerkingVt = value;
    }

    /**
     * Gets the value of the scopeTerugwerkingVt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScopeTerugwerkingVt() {
        return scopeTerugwerkingVt;
    }

    /**
     * Sets the value of the scopeTerugwerkingVt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScopeTerugwerkingVt(String value) {
        this.scopeTerugwerkingVt = value;
    }

    /**
     * Gets the value of the datumTerugwerkingIwt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumTerugwerkingIwt() {
        return datumTerugwerkingIwt;
    }

    /**
     * Sets the value of the datumTerugwerkingIwt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumTerugwerkingIwt(XMLGregorianCalendar value) {
        this.datumTerugwerkingIwt = value;
    }

    /**
     * Gets the value of the scopeTerugwerkingIwt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScopeTerugwerkingIwt() {
        return scopeTerugwerkingIwt;
    }

    /**
     * Sets the value of the scopeTerugwerkingIwt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScopeTerugwerkingIwt(String value) {
        this.scopeTerugwerkingIwt = value;
    }

    /**
     * Gets the value of the datumTerugwerkingInt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumTerugwerkingInt() {
        return datumTerugwerkingInt;
    }

    /**
     * Sets the value of the datumTerugwerkingInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumTerugwerkingInt(XMLGregorianCalendar value) {
        this.datumTerugwerkingInt = value;
    }

    /**
     * Gets the value of the scopeTerugwerkingInt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScopeTerugwerkingInt() {
        return scopeTerugwerkingInt;
    }

    /**
     * Sets the value of the scopeTerugwerkingInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScopeTerugwerkingInt(String value) {
        this.scopeTerugwerkingInt = value;
    }

    /**
     * Gets the value of the tijdstipWtiToegevoegd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTijdstipWtiToegevoegd() {
        return tijdstipWtiToegevoegd;
    }

    /**
     * Sets the value of the tijdstipWtiToegevoegd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTijdstipWtiToegevoegd(XMLGregorianCalendar value) {
        this.tijdstipWtiToegevoegd = value;
    }

    /**
     * Gets the value of the tijdstipLaatsteWijzigingWti property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTijdstipLaatsteWijzigingWti() {
        return tijdstipLaatsteWijzigingWti;
    }

    /**
     * Sets the value of the tijdstipLaatsteWijzigingWti property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTijdstipLaatsteWijzigingWti(XMLGregorianCalendar value) {
        this.tijdstipLaatsteWijzigingWti = value;
    }

}
