//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.15 at 10:14:31 PM CET 
//


package gov.loc.zing.cql.xcql;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for operandType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="operandType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.loc.gov/zing/cql/xcql/}prefixes" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.loc.gov/zing/cql/xcql/}triple"/>
 *           &lt;element ref="{http://www.loc.gov/zing/cql/xcql/}searchClause"/>
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
@XmlType(name = "operandType", propOrder = {
    "prefixes",
    "triple",
    "searchClause"
})
public class OperandType {

    protected PrefixesType prefixes;
    protected TripleType triple;
    protected SearchClauseType searchClause;

    /**
     * Gets the value of the prefixes property.
     * 
     * @return
     *     possible object is
     *     {@link PrefixesType }
     *     
     */
    public PrefixesType getPrefixes() {
        return prefixes;
    }

    /**
     * Sets the value of the prefixes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefixesType }
     *     
     */
    public void setPrefixes(PrefixesType value) {
        this.prefixes = value;
    }

    /**
     * Gets the value of the triple property.
     * 
     * @return
     *     possible object is
     *     {@link TripleType }
     *     
     */
    public TripleType getTriple() {
        return triple;
    }

    /**
     * Sets the value of the triple property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripleType }
     *     
     */
    public void setTriple(TripleType value) {
        this.triple = value;
    }

    /**
     * Gets the value of the searchClause property.
     * 
     * @return
     *     possible object is
     *     {@link SearchClauseType }
     *     
     */
    public SearchClauseType getSearchClause() {
        return searchClause;
    }

    /**
     * Sets the value of the searchClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchClauseType }
     *     
     */
    public void setSearchClause(SearchClauseType value) {
        this.searchClause = value;
    }

}