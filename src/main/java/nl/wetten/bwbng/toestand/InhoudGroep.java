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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{}inhoud-groep"/>
 *         &lt;element ref="{}inhoud"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "inhoudGroepOrInhoud"
})
@XmlRootElement(name = "inhoud-groep")
public class InhoudGroep {

    @XmlElements({
        @XmlElement(name = "inhoud-groep", type = InhoudGroep.class),
        @XmlElement(name = "inhoud", type = Inhoud.class)
    })
    protected List<Object> inhoudGroepOrInhoud;

    /**
     * Gets the value of the inhoudGroepOrInhoud property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inhoudGroepOrInhoud property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInhoudGroepOrInhoud().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InhoudGroep }
     * {@link Inhoud }
     * 
     * 
     */
    public List<Object> getInhoudGroepOrInhoud() {
        if (inhoudGroepOrInhoud == null) {
            inhoudGroepOrInhoud = new ArrayList<Object>();
        }
        return this.inhoudGroepOrInhoud;
    }

}
