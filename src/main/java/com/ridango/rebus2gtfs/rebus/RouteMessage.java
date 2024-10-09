
package com.ridango.rebus2gtfs.rebus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RouteMessage complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RouteMessage">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RouteMessageId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="aktlistid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="aktlistaelemid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="metersbeforeafter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Relation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="DestinationSign" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Layout" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Texts" type="{}RouteMessageText" maxOccurs="2"/>
 *         <element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteMessage", propOrder = {
    "routeMessageId",
    "aktlistid",
    "aktlistaelemid",
    "metersbeforeafter",
    "relation",
    "destinationSign",
    "layout",
    "texts",
    "sequence"
})
public class RouteMessage {

    @XmlElement(name = "RouteMessageId")
    protected int routeMessageId;
    protected int aktlistid;
    protected int aktlistaelemid;
    protected int metersbeforeafter;
    @XmlElement(name = "Relation", required = true)
    protected String relation;
    @XmlElement(name = "DestinationSign", required = true)
    protected String destinationSign;
    @XmlElement(name = "Layout", required = true)
    protected String layout;
    @XmlElement(name = "Texts", required = true)
    protected List<RouteMessageText> texts;
    @XmlElement(name = "Sequence")
    protected int sequence;

    /**
     * Gets the value of the routeMessageId property.
     * 
     */
    public int getRouteMessageId() {
        return routeMessageId;
    }

    /**
     * Sets the value of the routeMessageId property.
     * 
     */
    public void setRouteMessageId(int value) {
        this.routeMessageId = value;
    }

    /**
     * Gets the value of the aktlistid property.
     * 
     */
    public int getAktlistid() {
        return aktlistid;
    }

    /**
     * Sets the value of the aktlistid property.
     * 
     */
    public void setAktlistid(int value) {
        this.aktlistid = value;
    }

    /**
     * Gets the value of the aktlistaelemid property.
     * 
     */
    public int getAktlistaelemid() {
        return aktlistaelemid;
    }

    /**
     * Sets the value of the aktlistaelemid property.
     * 
     */
    public void setAktlistaelemid(int value) {
        this.aktlistaelemid = value;
    }

    /**
     * Gets the value of the metersbeforeafter property.
     * 
     */
    public int getMetersbeforeafter() {
        return metersbeforeafter;
    }

    /**
     * Sets the value of the metersbeforeafter property.
     * 
     */
    public void setMetersbeforeafter(int value) {
        this.metersbeforeafter = value;
    }

    /**
     * Gets the value of the relation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelation() {
        return relation;
    }

    /**
     * Sets the value of the relation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelation(String value) {
        this.relation = value;
    }

    /**
     * Gets the value of the destinationSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationSign() {
        return destinationSign;
    }

    /**
     * Sets the value of the destinationSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationSign(String value) {
        this.destinationSign = value;
    }

    /**
     * Gets the value of the layout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayout() {
        return layout;
    }

    /**
     * Sets the value of the layout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayout(String value) {
        this.layout = value;
    }

    /**
     * Gets the value of the texts property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the texts property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTexts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteMessageText }
     * </p>
     * 
     * 
     * @return
     *     The value of the texts property.
     */
    public List<RouteMessageText> getTexts() {
        if (texts == null) {
            texts = new ArrayList<>();
        }
        return this.texts;
    }

    /**
     * Gets the value of the sequence property.
     * 
     */
    public int getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     */
    public void setSequence(int value) {
        this.sequence = value;
    }

}
