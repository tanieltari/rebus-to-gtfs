
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ACTWHEELLUBE_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ACTWHEELLUBE_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="WheelLubeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="AktListElemId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Amount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="DayType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="FromTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="ToTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Sekv" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Dirty" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="Delete" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="DeleteFromList" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACTWHEELLUBE_TYP", propOrder = {
    "wheelLubeId",
    "aktListElemId",
    "amount",
    "dayType",
    "fromTime",
    "toTime",
    "sekv",
    "dirty",
    "delete",
    "deleteFromList"
})
public class ACTWHEELLUBETYP {

    @XmlElement(name = "WheelLubeId")
    protected int wheelLubeId;
    @XmlElement(name = "AktListElemId")
    protected int aktListElemId;
    @XmlElement(name = "Amount")
    protected int amount;
    @XmlElement(name = "DayType")
    protected int dayType;
    @XmlElement(name = "FromTime")
    protected int fromTime;
    @XmlElement(name = "ToTime")
    protected int toTime;
    @XmlElement(name = "Sekv")
    protected int sekv;
    @XmlElement(name = "Dirty")
    protected boolean dirty;
    @XmlElement(name = "Delete", defaultValue = "false")
    protected boolean delete;
    @XmlElement(name = "DeleteFromList", defaultValue = "false")
    protected boolean deleteFromList;

    /**
     * Gets the value of the wheelLubeId property.
     * 
     */
    public int getWheelLubeId() {
        return wheelLubeId;
    }

    /**
     * Sets the value of the wheelLubeId property.
     * 
     */
    public void setWheelLubeId(int value) {
        this.wheelLubeId = value;
    }

    /**
     * Gets the value of the aktListElemId property.
     * 
     */
    public int getAktListElemId() {
        return aktListElemId;
    }

    /**
     * Sets the value of the aktListElemId property.
     * 
     */
    public void setAktListElemId(int value) {
        this.aktListElemId = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(int value) {
        this.amount = value;
    }

    /**
     * Gets the value of the dayType property.
     * 
     */
    public int getDayType() {
        return dayType;
    }

    /**
     * Sets the value of the dayType property.
     * 
     */
    public void setDayType(int value) {
        this.dayType = value;
    }

    /**
     * Gets the value of the fromTime property.
     * 
     */
    public int getFromTime() {
        return fromTime;
    }

    /**
     * Sets the value of the fromTime property.
     * 
     */
    public void setFromTime(int value) {
        this.fromTime = value;
    }

    /**
     * Gets the value of the toTime property.
     * 
     */
    public int getToTime() {
        return toTime;
    }

    /**
     * Sets the value of the toTime property.
     * 
     */
    public void setToTime(int value) {
        this.toTime = value;
    }

    /**
     * Gets the value of the sekv property.
     * 
     */
    public int getSekv() {
        return sekv;
    }

    /**
     * Sets the value of the sekv property.
     * 
     */
    public void setSekv(int value) {
        this.sekv = value;
    }

    /**
     * Gets the value of the dirty property.
     * 
     */
    public boolean isDirty() {
        return dirty;
    }

    /**
     * Sets the value of the dirty property.
     * 
     */
    public void setDirty(boolean value) {
        this.dirty = value;
    }

    /**
     * Gets the value of the delete property.
     * 
     */
    public boolean isDelete() {
        return delete;
    }

    /**
     * Sets the value of the delete property.
     * 
     */
    public void setDelete(boolean value) {
        this.delete = value;
    }

    /**
     * Gets the value of the deleteFromList property.
     * 
     */
    public boolean isDeleteFromList() {
        return deleteFromList;
    }

    /**
     * Sets the value of the deleteFromList property.
     * 
     */
    public void setDeleteFromList(boolean value) {
        this.deleteFromList = value;
    }

}
