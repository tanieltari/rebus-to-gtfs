
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LINJENATSTYPSPEC_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LINJENATSTYPSPEC_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="linjenattyp">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="24"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="text">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="80"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="ejpris" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="ejbock" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="naromrade" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="sekvens" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="layout" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LINJENATSTYPSPEC_TYP", propOrder = {
    "linjenattyp",
    "text",
    "ejpris",
    "ejbock",
    "naromrade",
    "sekvens",
    "layout"
})
public class LINJENATSTYPSPECTYP {

    @XmlElement(required = true, nillable = true)
    protected String linjenattyp;
    @XmlElement(required = true, nillable = true)
    protected String text;
    protected boolean ejpris;
    protected boolean ejbock;
    protected boolean naromrade;
    protected int sekvens;
    protected int layout;

    /**
     * Gets the value of the linjenattyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinjenattyp() {
        return linjenattyp;
    }

    /**
     * Sets the value of the linjenattyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinjenattyp(String value) {
        this.linjenattyp = value;
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
     * Gets the value of the ejpris property.
     * 
     */
    public boolean isEjpris() {
        return ejpris;
    }

    /**
     * Sets the value of the ejpris property.
     * 
     */
    public void setEjpris(boolean value) {
        this.ejpris = value;
    }

    /**
     * Gets the value of the ejbock property.
     * 
     */
    public boolean isEjbock() {
        return ejbock;
    }

    /**
     * Sets the value of the ejbock property.
     * 
     */
    public void setEjbock(boolean value) {
        this.ejbock = value;
    }

    /**
     * Gets the value of the naromrade property.
     * 
     */
    public boolean isNaromrade() {
        return naromrade;
    }

    /**
     * Sets the value of the naromrade property.
     * 
     */
    public void setNaromrade(boolean value) {
        this.naromrade = value;
    }

    /**
     * Gets the value of the sekvens property.
     * 
     */
    public int getSekvens() {
        return sekvens;
    }

    /**
     * Sets the value of the sekvens property.
     * 
     */
    public void setSekvens(int value) {
        this.sekvens = value;
    }

    /**
     * Gets the value of the layout property.
     * 
     */
    public int getLayout() {
        return layout;
    }

    /**
     * Sets the value of the layout property.
     * 
     */
    public void setLayout(int value) {
        this.layout = value;
    }

}
