
package com.ridango.rebus2gtfs.rebus;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Almadag_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Almadag_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Datum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="Dagtyp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="DagKlartext" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="TabPeriods" type="{}TabPeriod_TYP" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Almadag_TYP", propOrder = {
    "datum",
    "dagtyp",
    "dagKlartext",
    "tabPeriods"
})
public class AlmadagTYP {

    @XmlElement(name = "Datum", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datum;
    @XmlElement(name = "Dagtyp")
    protected int dagtyp;
    /**
     * Tex Måndag eller Påskdagen
     * 
     */
    @XmlElement(name = "DagKlartext", required = true)
    protected String dagKlartext;
    @XmlElement(name = "TabPeriods")
    protected List<TabPeriodTYP> tabPeriods;

    /**
     * Gets the value of the datum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatum() {
        return datum;
    }

    /**
     * Sets the value of the datum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatum(XMLGregorianCalendar value) {
        this.datum = value;
    }

    /**
     * Gets the value of the dagtyp property.
     * 
     */
    public int getDagtyp() {
        return dagtyp;
    }

    /**
     * Sets the value of the dagtyp property.
     * 
     */
    public void setDagtyp(int value) {
        this.dagtyp = value;
    }

    /**
     * Tex Måndag eller Påskdagen
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDagKlartext() {
        return dagKlartext;
    }

    /**
     * Sets the value of the dagKlartext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDagKlartext()
     */
    public void setDagKlartext(String value) {
        this.dagKlartext = value;
    }

    /**
     * Gets the value of the tabPeriods property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tabPeriods property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTabPeriods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TabPeriodTYP }
     * </p>
     * 
     * 
     * @return
     *     The value of the tabPeriods property.
     */
    public List<TabPeriodTYP> getTabPeriods() {
        if (tabPeriods == null) {
            tabPeriods = new ArrayList<>();
        }
        return this.tabPeriods;
    }

}
