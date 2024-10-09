
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SynonymSPEC_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SynonymSPEC_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="SearchText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="NewText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Type" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Version" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SynonymSPEC_TYP", propOrder = {
    "id",
    "searchText",
    "newText",
    "type",
    "version"
})
public class SynonymSPECTYP {

    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "SearchText", required = true)
    protected String searchText;
    @XmlElement(name = "NewText", required = true)
    protected String newText;
    @XmlElement(name = "Type")
    protected int type;
    @XmlElement(name = "Version")
    protected int version;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the searchText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchText() {
        return searchText;
    }

    /**
     * Sets the value of the searchText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchText(String value) {
        this.searchText = value;
    }

    /**
     * Gets the value of the newText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewText() {
        return newText;
    }

    /**
     * Sets the value of the newText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewText(String value) {
        this.newText = value;
    }

    /**
     * Gets the value of the type property.
     * 
     */
    public int getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     */
    public void setType(int value) {
        this.type = value;
    }

    /**
     * Gets the value of the version property.
     * 
     */
    public int getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     */
    public void setVersion(int value) {
        this.version = value;
    }

}
