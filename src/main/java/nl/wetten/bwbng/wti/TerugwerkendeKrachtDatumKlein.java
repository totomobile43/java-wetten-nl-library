//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.21 at 02:36:51 PM CEST 
//


package nl.wetten.bwbng.wti;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for terugwerkende-kracht-datum-klein complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="terugwerkende-kracht-datum-klein">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="datum-scope" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="waarde" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "terugwerkende-kracht-datum-klein")
@XmlSeeAlso({
    TerugwerkendeKrachtDatumGroot.class
})
public class TerugwerkendeKrachtDatumKlein {

    @XmlAttribute(name = "datum-scope", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String datumScope;
    @XmlAttribute(name = "waarde", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar waarde;

    /**
     * Gets the value of the datumScope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatumScope() {
        return datumScope;
    }

    /**
     * Sets the value of the datumScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumScope(String value) {
        this.datumScope = value;
    }

    /**
     * Gets the value of the waarde property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWaarde() {
        return waarde;
    }

    /**
     * Sets the value of the waarde property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWaarde(XMLGregorianCalendar value) {
        this.waarde = value;
    }

}