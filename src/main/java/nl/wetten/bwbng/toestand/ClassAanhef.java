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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for class.aanhef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="class.aanhef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}context" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{}wie" maxOccurs="unbounded"/>
 *           &lt;element ref="{}wij" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{}considerans"/>
 *           &lt;element ref="{}preambule"/>
 *         &lt;/choice>
 *         &lt;element ref="{}afkondiging" minOccurs="0"/>
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
@XmlType(name = "class.aanhef", propOrder = {
    "context",
    "wie",
    "wij",
    "considerans",
    "preambule",
    "afkondiging",
    "metaData"
})
@XmlSeeAlso({
    Aanhef.class
})
public class ClassAanhef {

    protected Context context;
    protected List<String> wie;
    protected List<String> wij;
    protected Considerans considerans;
    protected Preambule preambule;
    protected Afkondiging afkondiging;
    @XmlElement(name = "meta-data")
    protected MetaData metaData;

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link Context }
     *     
     */
    public Context getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link Context }
     *     
     */
    public void setContext(Context value) {
        this.context = value;
    }

    /**
     * Gets the value of the wie property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wie property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWie().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWie() {
        if (wie == null) {
            wie = new ArrayList<String>();
        }
        return this.wie;
    }

    /**
     * Gets the value of the wij property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wij property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWij().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWij() {
        if (wij == null) {
            wij = new ArrayList<String>();
        }
        return this.wij;
    }

    /**
     * Gets the value of the considerans property.
     * 
     * @return
     *     possible object is
     *     {@link Considerans }
     *     
     */
    public Considerans getConsiderans() {
        return considerans;
    }

    /**
     * Sets the value of the considerans property.
     * 
     * @param value
     *     allowed object is
     *     {@link Considerans }
     *     
     */
    public void setConsiderans(Considerans value) {
        this.considerans = value;
    }

    /**
     * Gets the value of the preambule property.
     * 
     * @return
     *     possible object is
     *     {@link Preambule }
     *     
     */
    public Preambule getPreambule() {
        return preambule;
    }

    /**
     * Sets the value of the preambule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Preambule }
     *     
     */
    public void setPreambule(Preambule value) {
        this.preambule = value;
    }

    /**
     * Gets the value of the afkondiging property.
     * 
     * @return
     *     possible object is
     *     {@link Afkondiging }
     *     
     */
    public Afkondiging getAfkondiging() {
        return afkondiging;
    }

    /**
     * Sets the value of the afkondiging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Afkondiging }
     *     
     */
    public void setAfkondiging(Afkondiging value) {
        this.afkondiging = value;
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