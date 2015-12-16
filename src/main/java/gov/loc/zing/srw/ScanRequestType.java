//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.15 at 10:14:31 PM CET 
//


package gov.loc.zing.srw;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for scanRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="scanRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.loc.gov/zing/srw/}requestType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}scanClause"/>
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}responsePosition" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}maximumTerms" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}stylesheet" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}extraRequestData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scanRequestType", propOrder = {
    "scanClause",
    "responsePosition",
    "maximumTerms",
    "stylesheet",
    "extraRequestData"
})
public class ScanRequestType
    extends RequestType
{

    @XmlElement(required = true)
    protected String scanClause;
    @XmlElement(defaultValue = "1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger responsePosition;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximumTerms;
    @XmlSchemaType(name = "anyURI")
    protected String stylesheet;
    protected ExtraDataType extraRequestData;

    /**
     * Gets the value of the scanClause property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScanClause() {
        return scanClause;
    }

    /**
     * Sets the value of the scanClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScanClause(String value) {
        this.scanClause = value;
    }

    /**
     * Gets the value of the responsePosition property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResponsePosition() {
        return responsePosition;
    }

    /**
     * Sets the value of the responsePosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResponsePosition(BigInteger value) {
        this.responsePosition = value;
    }

    /**
     * Gets the value of the maximumTerms property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumTerms() {
        return maximumTerms;
    }

    /**
     * Sets the value of the maximumTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumTerms(BigInteger value) {
        this.maximumTerms = value;
    }

    /**
     * Gets the value of the stylesheet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStylesheet() {
        return stylesheet;
    }

    /**
     * Sets the value of the stylesheet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStylesheet(String value) {
        this.stylesheet = value;
    }

    /**
     * Gets the value of the extraRequestData property.
     * 
     * @return
     *     possible object is
     *     {@link ExtraDataType }
     *     
     */
    public ExtraDataType getExtraRequestData() {
        return extraRequestData;
    }

    /**
     * Sets the value of the extraRequestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtraDataType }
     *     
     */
    public void setExtraRequestData(ExtraDataType value) {
        this.extraRequestData = value;
    }

}
