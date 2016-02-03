//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.15 at 10:14:31 PM CET 
//


package gov.loc.zing.srw;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;

import com.google.common.base.Preconditions;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;


/**
 * <p>Java class for stringOrXmlFragment complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="stringOrXmlFragment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stringOrXmlFragment", propOrder = {
        "content"
})
public class StringOrXmlFragment {

    @XmlMixed
    @XmlAnyElement(lax = true)
    protected List<Object> content;

    /**
     * Gets the value of the content property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * {@link String }
     */

    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<>();
        }
        return this.content;
    }

    public Element getElement() {
        List<Element> els = getElements();
        if (els.size() != 1) {
            throw new IllegalStateException("List of elements is not 1");
        }
        return els.get(0);
    }

    public List<Element> getElements() {
        List<Object> gzds = getContent();
        List<Element> els = new ArrayList<>(gzds.size());
        for (Object gzd : gzds) {
            if (gzd instanceof Element) {
                els.add((Element) gzd);
            }
        }
        return els;
    }

    public String getIdentifier() {
        return getTextContentFromOneElement("dcterms:identifier");
    }

    public String getTitle() {
        return getTextContentFromOneElement("dcterms:title");
    }

    public String getLanguage() {
        return getTextContentFromOneElement("dcterms:language");
    }

    public String getModified() {
        return getTextContentFromOneElement("dcterms:modified");
    }

    public String getAuthority() {
        return getTextContentFromOneElement("overheid:authority");
    }

    public String getCreator() {
        return getTextContentFromOneElement("dcterms:creator");
    }

    public String[] getLegalAreas() {
        return getTextContentFromAllElements("overheidbwb:rechtsgebied");
    }

    public String getType(){
        return getTextContentFromOneElement("dcterms:type");
    }

    public String getGovernmentalDomain() {
        return getTextContentFromOneElement("overheidbwb:overheidsdomein");
    }

    public String getValidStart() {
        return getTextContentFromOneElement("overheidbwb:geldigheidsperiode_startdatum");
    }

    public String getValidEnd() {
        return getTextContentFromOneElement("overheidbwb:geldigheidsperiode_einddatum");
    }

    public String getVisibleStart() {
        return getTextContentFromOneElement("overheidbwb:zichtperiode_startdatum");
    }
    public String getVisibleEnd() {
        return getTextContentFromOneElement("overheidbwb:zichtperiode_einddatum");
    }

    private String[] getTextContentFromAllElements(String tagName) {
        Element e = getElement();
        NodeList ids = e.getElementsByTagName(tagName);
        String[] strings = new String[ids.getLength()];
        for (int i = 0; i < ids.getLength(); i++) {
            strings[i] = ids.item(i).getTextContent().trim();
        }
        return strings;
    }

    private String getTextContentFromOneElement(String tagName) {
        Element e = getElement();
        NodeList ids = e.getElementsByTagName(tagName);
        Preconditions.checkState(ids.getLength() == 1, "Found " + ids.getLength() + " identifiers.");
        return ids.item(0).getTextContent().trim();
    }
}