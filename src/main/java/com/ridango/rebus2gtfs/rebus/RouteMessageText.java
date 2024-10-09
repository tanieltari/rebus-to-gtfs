
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RouteMessageText complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RouteMessageText">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RouteMessageTextId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Scrolling" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Stationary" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteMessageText", propOrder = {
    "routeMessageTextId",
    "text",
    "type",
    "scrolling",
    "stationary"
})
public class RouteMessageText {

    @XmlElement(name = "RouteMessageTextId")
    protected int routeMessageTextId;
    @XmlElement(name = "Text", required = true)
    protected String text;
    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "Scrolling", defaultValue = "1")
    protected int scrolling;
    @XmlElement(name = "Stationary", required = true, defaultValue = "Left")
    protected String stationary;

    /**
     * Gets the value of the routeMessageTextId property.
     * 
     */
    public int getRouteMessageTextId() {
        return routeMessageTextId;
    }

    /**
     * Sets the value of the routeMessageTextId property.
     * 
     */
    public void setRouteMessageTextId(int value) {
        this.routeMessageTextId = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
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

    /**
     * Gets the value of the scrolling property.
     * 
     */
    public int getScrolling() {
        return scrolling;
    }

    /**
     * Sets the value of the scrolling property.
     * 
     */
    public void setScrolling(int value) {
        this.scrolling = value;
    }

    /**
     * Gets the value of the stationary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationary() {
        return stationary;
    }

    /**
     * Sets the value of the stationary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationary(String value) {
        this.stationary = value;
    }

}
