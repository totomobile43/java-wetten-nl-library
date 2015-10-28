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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{}colspec" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}spanspec" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}thead" minOccurs="0"/>
 *         &lt;element ref="{}tbody"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}attlist.entrytbl"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "colspec",
    "spanspec",
    "thead",
    "tbody"
})
@XmlRootElement(name = "entrytbl")
public class Entrytbl {

    protected List<Colspec> colspec;
    protected List<Spanspec> spanspec;
    protected Thead thead;
    @XmlElement(required = true)
    protected Tbody tbody;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "anySimpleType")
    protected String id;
    @XmlAttribute(name = "char")
    @XmlSchemaType(name = "anySimpleType")
    protected String _char;
    @XmlAttribute(name = "charoff")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String charoff;
    @XmlAttribute(name = "colname")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String colname;
    @XmlAttribute(name = "cols", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String cols;
    @XmlAttribute(name = "colsep")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String colsep;
    @XmlAttribute(name = "nameend")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String nameend;
    @XmlAttribute(name = "namest")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String namest;
    @XmlAttribute(name = "rowsep")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String rowsep;
    @XmlAttribute(name = "spanname")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String spanname;
    @XmlAttribute(name = "tgroupstyle")
    @XmlSchemaType(name = "anySimpleType")
    protected String tgroupstyle;
    @XmlAttribute(name = "align")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String align;

    /**
     * Gets the value of the colspec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colspec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColspec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Colspec }
     * 
     * 
     */
    public List<Colspec> getColspec() {
        if (colspec == null) {
            colspec = new ArrayList<Colspec>();
        }
        return this.colspec;
    }

    /**
     * Gets the value of the spanspec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spanspec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpanspec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Spanspec }
     * 
     * 
     */
    public List<Spanspec> getSpanspec() {
        if (spanspec == null) {
            spanspec = new ArrayList<Spanspec>();
        }
        return this.spanspec;
    }

    /**
     * Gets the value of the thead property.
     * 
     * @return
     *     possible object is
     *     {@link Thead }
     *     
     */
    public Thead getThead() {
        return thead;
    }

    /**
     * Sets the value of the thead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Thead }
     *     
     */
    public void setThead(Thead value) {
        this.thead = value;
    }

    /**
     * Gets the value of the tbody property.
     * 
     * @return
     *     possible object is
     *     {@link Tbody }
     *     
     */
    public Tbody getTbody() {
        return tbody;
    }

    /**
     * Sets the value of the tbody property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tbody }
     *     
     */
    public void setTbody(Tbody value) {
        this.tbody = value;
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
     * Gets the value of the char property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChar() {
        return _char;
    }

    /**
     * Sets the value of the char property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChar(String value) {
        this._char = value;
    }

    /**
     * Gets the value of the charoff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharoff() {
        return charoff;
    }

    /**
     * Sets the value of the charoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharoff(String value) {
        this.charoff = value;
    }

    /**
     * Gets the value of the colname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColname() {
        return colname;
    }

    /**
     * Sets the value of the colname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColname(String value) {
        this.colname = value;
    }

    /**
     * Gets the value of the cols property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCols() {
        return cols;
    }

    /**
     * Sets the value of the cols property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCols(String value) {
        this.cols = value;
    }

    /**
     * Gets the value of the colsep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColsep() {
        return colsep;
    }

    /**
     * Sets the value of the colsep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColsep(String value) {
        this.colsep = value;
    }

    /**
     * Gets the value of the nameend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameend() {
        return nameend;
    }

    /**
     * Sets the value of the nameend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameend(String value) {
        this.nameend = value;
    }

    /**
     * Gets the value of the namest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamest() {
        return namest;
    }

    /**
     * Sets the value of the namest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamest(String value) {
        this.namest = value;
    }

    /**
     * Gets the value of the rowsep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowsep() {
        return rowsep;
    }

    /**
     * Sets the value of the rowsep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowsep(String value) {
        this.rowsep = value;
    }

    /**
     * Gets the value of the spanname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpanname() {
        return spanname;
    }

    /**
     * Sets the value of the spanname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpanname(String value) {
        this.spanname = value;
    }

    /**
     * Gets the value of the tgroupstyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTgroupstyle() {
        return tgroupstyle;
    }

    /**
     * Sets the value of the tgroupstyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTgroupstyle(String value) {
        this.tgroupstyle = value;
    }

    /**
     * Gets the value of the align property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlign() {
        return align;
    }

    /**
     * Sets the value of the align property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlign(String value) {
        this.align = value;
    }

}
