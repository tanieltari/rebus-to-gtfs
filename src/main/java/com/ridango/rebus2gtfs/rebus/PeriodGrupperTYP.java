
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PeriodGrupper_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PeriodGrupper_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PeriodGruppId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="TabperId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="PeriodGrupp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Namn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="PgKod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="FotnotID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Fotnot" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="FotnotText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodGrupper_TYP", propOrder = {
    "periodGruppId",
    "tabperId",
    "periodGrupp",
    "namn",
    "pgKod",
    "fotnotID",
    "fotnot",
    "fotnotText"
})
public class PeriodGrupperTYP {

    @XmlElement(name = "PeriodGruppId")
    protected int periodGruppId;
    @XmlElement(name = "TabperId")
    protected int tabperId;
    @XmlElement(name = "PeriodGrupp")
    protected int periodGrupp;
    @XmlElement(name = "Namn", required = true)
    protected String namn;
    /**
     * tex 100,120!,-200 Betyder går period 100,dessutom period 120 oasett dagtyp, går ej 200
     * 
     */
    @XmlElement(name = "PgKod", required = true)
    protected String pgKod;
    @XmlElement(name = "FotnotID")
    protected int fotnotID;
    @XmlElement(name = "Fotnot", required = true)
    protected String fotnot;
    @XmlElement(name = "FotnotText", required = true)
    protected String fotnotText;

    /**
     * Gets the value of the periodGruppId property.
     * 
     */
    public int getPeriodGruppId() {
        return periodGruppId;
    }

    /**
     * Sets the value of the periodGruppId property.
     * 
     */
    public void setPeriodGruppId(int value) {
        this.periodGruppId = value;
    }

    /**
     * Gets the value of the tabperId property.
     * 
     */
    public int getTabperId() {
        return tabperId;
    }

    /**
     * Sets the value of the tabperId property.
     * 
     */
    public void setTabperId(int value) {
        this.tabperId = value;
    }

    /**
     * Gets the value of the periodGrupp property.
     * 
     */
    public int getPeriodGrupp() {
        return periodGrupp;
    }

    /**
     * Sets the value of the periodGrupp property.
     * 
     */
    public void setPeriodGrupp(int value) {
        this.periodGrupp = value;
    }

    /**
     * Gets the value of the namn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamn() {
        return namn;
    }

    /**
     * Sets the value of the namn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamn(String value) {
        this.namn = value;
    }

    /**
     * tex 100,120!,-200 Betyder går period 100,dessutom period 120 oasett dagtyp, går ej 200
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgKod() {
        return pgKod;
    }

    /**
     * Sets the value of the pgKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPgKod()
     */
    public void setPgKod(String value) {
        this.pgKod = value;
    }

    /**
     * Gets the value of the fotnotID property.
     * 
     */
    public int getFotnotID() {
        return fotnotID;
    }

    /**
     * Sets the value of the fotnotID property.
     * 
     */
    public void setFotnotID(int value) {
        this.fotnotID = value;
    }

    /**
     * Gets the value of the fotnot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFotnot() {
        return fotnot;
    }

    /**
     * Sets the value of the fotnot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFotnot(String value) {
        this.fotnot = value;
    }

    /**
     * Gets the value of the fotnotText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFotnotText() {
        return fotnotText;
    }

    /**
     * Sets the value of the fotnotText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFotnotText(String value) {
        this.fotnotText = value;
    }

}
