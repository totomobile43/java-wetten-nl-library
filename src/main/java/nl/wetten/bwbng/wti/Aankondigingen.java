//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.21 at 02:36:51 PM CEST 
//


package nl.wetten.bwbng.wti;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="aankondiging" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="label-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="opschrift" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ingangsdatum" maxOccurs="2">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
 *                           &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="terugwerkend.datum" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
 *                           &lt;attribute name="datum-scope" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="hierarchy">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="self-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="parent-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="previous-sibling-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="effect" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "aankondiging"
})
@XmlRootElement(name = "aankondigingen")
public class Aankondigingen {

    protected List<Aankondigingen.Aankondiging> aankondiging;

    /**
     * Gets the value of the aankondiging property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aankondiging property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAankondiging().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Aankondigingen.Aankondiging }
     * 
     * 
     */
    public List<Aankondigingen.Aankondiging> getAankondiging() {
        if (aankondiging == null) {
            aankondiging = new ArrayList<Aankondigingen.Aankondiging>();
        }
        return this.aankondiging;
    }


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
     *         &lt;element name="label-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="opschrift" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ingangsdatum" maxOccurs="2">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
     *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="terugwerkend.datum" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
     *                 &lt;attribute name="datum-scope" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="hierarchy">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="self-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="parent-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="previous-sibling-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="effect" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "labelId",
        "opschrift",
        "ingangsdatum",
        "terugwerkendDatum",
        "hierarchy"
    })
    public static class Aankondiging {

        @XmlElement(name = "label-id", required = true)
        protected String labelId;
        protected String opschrift;
        @XmlElement(required = true)
        protected List<Aankondigingen.Aankondiging.Ingangsdatum> ingangsdatum;
        @XmlElement(name = "terugwerkend.datum")
        protected Aankondigingen.Aankondiging.TerugwerkendDatum terugwerkendDatum;
        @XmlElement(required = true)
        protected Aankondigingen.Aankondiging.Hierarchy hierarchy;
        @XmlAttribute(name = "effect", required = true)
        protected String effect;

        /**
         * Gets the value of the labelId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLabelId() {
            return labelId;
        }

        /**
         * Sets the value of the labelId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLabelId(String value) {
            this.labelId = value;
        }

        /**
         * Gets the value of the opschrift property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOpschrift() {
            return opschrift;
        }

        /**
         * Sets the value of the opschrift property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOpschrift(String value) {
            this.opschrift = value;
        }

        /**
         * Gets the value of the ingangsdatum property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ingangsdatum property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIngangsdatum().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Aankondigingen.Aankondiging.Ingangsdatum }
         * 
         * 
         */
        public List<Aankondigingen.Aankondiging.Ingangsdatum> getIngangsdatum() {
            if (ingangsdatum == null) {
                ingangsdatum = new ArrayList<Aankondigingen.Aankondiging.Ingangsdatum>();
            }
            return this.ingangsdatum;
        }

        /**
         * Gets the value of the terugwerkendDatum property.
         * 
         * @return
         *     possible object is
         *     {@link Aankondigingen.Aankondiging.TerugwerkendDatum }
         *     
         */
        public Aankondigingen.Aankondiging.TerugwerkendDatum getTerugwerkendDatum() {
            return terugwerkendDatum;
        }

        /**
         * Sets the value of the terugwerkendDatum property.
         * 
         * @param value
         *     allowed object is
         *     {@link Aankondigingen.Aankondiging.TerugwerkendDatum }
         *     
         */
        public void setTerugwerkendDatum(Aankondigingen.Aankondiging.TerugwerkendDatum value) {
            this.terugwerkendDatum = value;
        }

        /**
         * Gets the value of the hierarchy property.
         * 
         * @return
         *     possible object is
         *     {@link Aankondigingen.Aankondiging.Hierarchy }
         *     
         */
        public Aankondigingen.Aankondiging.Hierarchy getHierarchy() {
            return hierarchy;
        }

        /**
         * Sets the value of the hierarchy property.
         * 
         * @param value
         *     allowed object is
         *     {@link Aankondigingen.Aankondiging.Hierarchy }
         *     
         */
        public void setHierarchy(Aankondigingen.Aankondiging.Hierarchy value) {
            this.hierarchy = value;
        }

        /**
         * Gets the value of the effect property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEffect() {
            return effect;
        }

        /**
         * Sets the value of the effect property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEffect(String value) {
            this.effect = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;all>
         *         &lt;element name="self-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="parent-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="previous-sibling-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class Hierarchy {

            @XmlElement(name = "self-id", required = true)
            protected String selfId;
            @XmlElement(name = "parent-id")
            protected String parentId;
            @XmlElement(name = "previous-sibling-id")
            protected String previousSiblingId;

            /**
             * Gets the value of the selfId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSelfId() {
                return selfId;
            }

            /**
             * Sets the value of the selfId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSelfId(String value) {
                this.selfId = value;
            }

            /**
             * Gets the value of the parentId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getParentId() {
                return parentId;
            }

            /**
             * Sets the value of the parentId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setParentId(String value) {
                this.parentId = value;
            }

            /**
             * Gets the value of the previousSiblingId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPreviousSiblingId() {
                return previousSiblingId;
            }

            /**
             * Sets the value of the previousSiblingId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPreviousSiblingId(String value) {
                this.previousSiblingId = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
         *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Ingangsdatum {

            @XmlValue
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar value;
            @XmlAttribute(name = "type", required = true)
            protected String type;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setValue(XMLGregorianCalendar value) {
                this.value = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
         *       &lt;attribute name="datum-scope" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class TerugwerkendDatum {

            @XmlValue
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar value;
            @XmlAttribute(name = "datum-scope", required = true)
            protected String datumScope;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setValue(XMLGregorianCalendar value) {
                this.value = value;
            }

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

        }

    }

}
