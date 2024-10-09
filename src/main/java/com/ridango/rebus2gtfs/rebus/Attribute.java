
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Attribute complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Attribute">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="TypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="TypeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="DataTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Attribute", propOrder = {
    "id",
    "typeId",
    "typeName",
    "value",
    "dataTypeId"
})
public class Attribute {

    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "TypeId")
    protected int typeId;
    @XmlElement(name = "TypeName", required = true)
    protected String typeName;
    @XmlElement(name = "Value", required = true)
    protected String value;
    @XmlElement(name = "DataTypeId")
    protected int dataTypeId;

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
     * Gets the value of the typeId property.
     * 
     */
    public int getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     */
    public void setTypeId(int value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the typeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * Sets the value of the typeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeName(String value) {
        this.typeName = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the dataTypeId property.
     * 
     */
    public int getDataTypeId() {
        return dataTypeId;
    }

    /**
     * Sets the value of the dataTypeId property.
     * 
     */
    public void setDataTypeId(int value) {
        this.dataTypeId = value;
    }

}
