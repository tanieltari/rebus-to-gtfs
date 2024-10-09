
package com.ridango.rebus2gtfs.rebus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Entreprenor_typ complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Entreprenor_typ">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HuvudEntrepID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="HuvudEntrepNr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="HuvudEntrepNamn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="HuvudKortNamn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="HuvudAdress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="HuvudTelenr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="UnderEntreprenor" type="{}UnderEntreprenor_TYP" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Entreprenor_typ", propOrder = {
    "huvudEntrepID",
    "huvudEntrepNr",
    "huvudEntrepNamn",
    "huvudKortNamn",
    "huvudAdress",
    "huvudTelenr",
    "underEntreprenor"
})
public class EntreprenorTyp {

    @XmlElement(name = "HuvudEntrepID")
    protected int huvudEntrepID;
    @XmlElement(name = "HuvudEntrepNr")
    protected int huvudEntrepNr;
    @XmlElement(name = "HuvudEntrepNamn", required = true)
    protected String huvudEntrepNamn;
    @XmlElement(name = "HuvudKortNamn", required = true)
    protected String huvudKortNamn;
    @XmlElement(name = "HuvudAdress", required = true)
    protected String huvudAdress;
    @XmlElement(name = "HuvudTelenr", required = true)
    protected String huvudTelenr;
    @XmlElement(name = "UnderEntreprenor")
    protected List<UnderEntreprenorTYP> underEntreprenor;

    /**
     * Gets the value of the huvudEntrepID property.
     * 
     */
    public int getHuvudEntrepID() {
        return huvudEntrepID;
    }

    /**
     * Sets the value of the huvudEntrepID property.
     * 
     */
    public void setHuvudEntrepID(int value) {
        this.huvudEntrepID = value;
    }

    /**
     * Gets the value of the huvudEntrepNr property.
     * 
     */
    public int getHuvudEntrepNr() {
        return huvudEntrepNr;
    }

    /**
     * Sets the value of the huvudEntrepNr property.
     * 
     */
    public void setHuvudEntrepNr(int value) {
        this.huvudEntrepNr = value;
    }

    /**
     * Gets the value of the huvudEntrepNamn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuvudEntrepNamn() {
        return huvudEntrepNamn;
    }

    /**
     * Sets the value of the huvudEntrepNamn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuvudEntrepNamn(String value) {
        this.huvudEntrepNamn = value;
    }

    /**
     * Gets the value of the huvudKortNamn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuvudKortNamn() {
        return huvudKortNamn;
    }

    /**
     * Sets the value of the huvudKortNamn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuvudKortNamn(String value) {
        this.huvudKortNamn = value;
    }

    /**
     * Gets the value of the huvudAdress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuvudAdress() {
        return huvudAdress;
    }

    /**
     * Sets the value of the huvudAdress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuvudAdress(String value) {
        this.huvudAdress = value;
    }

    /**
     * Gets the value of the huvudTelenr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuvudTelenr() {
        return huvudTelenr;
    }

    /**
     * Sets the value of the huvudTelenr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuvudTelenr(String value) {
        this.huvudTelenr = value;
    }

    /**
     * Gets the value of the underEntreprenor property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the underEntreprenor property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getUnderEntreprenor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnderEntreprenorTYP }
     * </p>
     * 
     * 
     * @return
     *     The value of the underEntreprenor property.
     */
    public List<UnderEntreprenorTYP> getUnderEntreprenor() {
        if (underEntreprenor == null) {
            underEntreprenor = new ArrayList<>();
        }
        return this.underEntreprenor;
    }

}
