
package com.ridango.rebus2gtfs.rebus;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WALKLINK_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="WALKLINK_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence maxOccurs="unbounded" minOccurs="0">
 *         <element name="WALKLINKSPEC">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="StopPointGid1" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   <element name="Hplnr1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="lage1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="Northing1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   <element name="Easting1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   <element name="StopPointGid2" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   <element name="Hplnr2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="lage2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="Northing2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   <element name="Easting2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   <element name="Tid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="TidR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="TidS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="TidH" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="TidTxt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="AktDatum" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="RebusVersion" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       <attribute name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WALKLINK_TYP", propOrder = {
    "walklinkspec"
})
public class WALKLINKTYP {

    @XmlElement(name = "WALKLINKSPEC")
    protected List<WALKLINKTYP.WALKLINKSPEC> walklinkspec;
    @XmlAttribute(name = "RebusVersion")
    @XmlSchemaType(name = "anySimpleType")
    protected String rebusVersion;
    @XmlAttribute(name = "CreatedDate")
    @XmlSchemaType(name = "anySimpleType")
    protected String createdDate;

    /**
     * Gets the value of the walklinkspec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the walklinkspec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getWALKLINKSPEC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WALKLINKTYP.WALKLINKSPEC }
     * </p>
     * 
     * 
     * @return
     *     The value of the walklinkspec property.
     */
    public List<WALKLINKTYP.WALKLINKSPEC> getWALKLINKSPEC() {
        if (walklinkspec == null) {
            walklinkspec = new ArrayList<>();
        }
        return this.walklinkspec;
    }

    /**
     * Gets the value of the rebusVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRebusVersion() {
        return rebusVersion;
    }

    /**
     * Sets the value of the rebusVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRebusVersion(String value) {
        this.rebusVersion = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedDate(String value) {
        this.createdDate = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="StopPointGid1" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         <element name="Hplnr1" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="lage1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="Northing1" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         <element name="Easting1" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         <element name="StopPointGid2" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         <element name="Hplnr2" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="lage2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="Northing2" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         <element name="Easting2" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         <element name="Tid" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="TidR" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="TidS" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="TidH" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="TidTxt" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="AktDatum" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "stopPointGid1",
        "hplnr1",
        "lage1",
        "northing1",
        "easting1",
        "stopPointGid2",
        "hplnr2",
        "lage2",
        "northing2",
        "easting2",
        "tid",
        "tidR",
        "tidS",
        "tidH",
        "tidTxt",
        "aktDatum"
    })
    public static class WALKLINKSPEC {

        @XmlElement(name = "StopPointGid1")
        protected long stopPointGid1;
        @XmlElement(name = "Hplnr1")
        protected int hplnr1;
        @XmlElement(required = true)
        protected String lage1;
        @XmlElement(name = "Northing1")
        protected double northing1;
        @XmlElement(name = "Easting1")
        protected double easting1;
        @XmlElement(name = "StopPointGid2")
        protected long stopPointGid2;
        @XmlElement(name = "Hplnr2")
        protected int hplnr2;
        @XmlElement(required = true)
        protected String lage2;
        @XmlElement(name = "Northing2")
        protected double northing2;
        @XmlElement(name = "Easting2")
        protected double easting2;
        @XmlElement(name = "Tid")
        protected int tid;
        @XmlElement(name = "TidR")
        protected int tidR;
        @XmlElement(name = "TidS")
        protected int tidS;
        @XmlElement(name = "TidH")
        protected int tidH;
        @XmlElement(name = "TidTxt", required = true)
        protected String tidTxt;
        @XmlElement(name = "AktDatum", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar aktDatum;

        /**
         * Gets the value of the stopPointGid1 property.
         * 
         */
        public long getStopPointGid1() {
            return stopPointGid1;
        }

        /**
         * Sets the value of the stopPointGid1 property.
         * 
         */
        public void setStopPointGid1(long value) {
            this.stopPointGid1 = value;
        }

        /**
         * Gets the value of the hplnr1 property.
         * 
         */
        public int getHplnr1() {
            return hplnr1;
        }

        /**
         * Sets the value of the hplnr1 property.
         * 
         */
        public void setHplnr1(int value) {
            this.hplnr1 = value;
        }

        /**
         * Gets the value of the lage1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLage1() {
            return lage1;
        }

        /**
         * Sets the value of the lage1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLage1(String value) {
            this.lage1 = value;
        }

        /**
         * Gets the value of the northing1 property.
         * 
         */
        public double getNorthing1() {
            return northing1;
        }

        /**
         * Sets the value of the northing1 property.
         * 
         */
        public void setNorthing1(double value) {
            this.northing1 = value;
        }

        /**
         * Gets the value of the easting1 property.
         * 
         */
        public double getEasting1() {
            return easting1;
        }

        /**
         * Sets the value of the easting1 property.
         * 
         */
        public void setEasting1(double value) {
            this.easting1 = value;
        }

        /**
         * Gets the value of the stopPointGid2 property.
         * 
         */
        public long getStopPointGid2() {
            return stopPointGid2;
        }

        /**
         * Sets the value of the stopPointGid2 property.
         * 
         */
        public void setStopPointGid2(long value) {
            this.stopPointGid2 = value;
        }

        /**
         * Gets the value of the hplnr2 property.
         * 
         */
        public int getHplnr2() {
            return hplnr2;
        }

        /**
         * Sets the value of the hplnr2 property.
         * 
         */
        public void setHplnr2(int value) {
            this.hplnr2 = value;
        }

        /**
         * Gets the value of the lage2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLage2() {
            return lage2;
        }

        /**
         * Sets the value of the lage2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLage2(String value) {
            this.lage2 = value;
        }

        /**
         * Gets the value of the northing2 property.
         * 
         */
        public double getNorthing2() {
            return northing2;
        }

        /**
         * Sets the value of the northing2 property.
         * 
         */
        public void setNorthing2(double value) {
            this.northing2 = value;
        }

        /**
         * Gets the value of the easting2 property.
         * 
         */
        public double getEasting2() {
            return easting2;
        }

        /**
         * Sets the value of the easting2 property.
         * 
         */
        public void setEasting2(double value) {
            this.easting2 = value;
        }

        /**
         * Gets the value of the tid property.
         * 
         */
        public int getTid() {
            return tid;
        }

        /**
         * Sets the value of the tid property.
         * 
         */
        public void setTid(int value) {
            this.tid = value;
        }

        /**
         * Gets the value of the tidR property.
         * 
         */
        public int getTidR() {
            return tidR;
        }

        /**
         * Sets the value of the tidR property.
         * 
         */
        public void setTidR(int value) {
            this.tidR = value;
        }

        /**
         * Gets the value of the tidS property.
         * 
         */
        public int getTidS() {
            return tidS;
        }

        /**
         * Sets the value of the tidS property.
         * 
         */
        public void setTidS(int value) {
            this.tidS = value;
        }

        /**
         * Gets the value of the tidH property.
         * 
         */
        public int getTidH() {
            return tidH;
        }

        /**
         * Sets the value of the tidH property.
         * 
         */
        public void setTidH(int value) {
            this.tidH = value;
        }

        /**
         * Gets the value of the tidTxt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTidTxt() {
            return tidTxt;
        }

        /**
         * Sets the value of the tidTxt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTidTxt(String value) {
            this.tidTxt = value;
        }

        /**
         * Gets the value of the aktDatum property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getAktDatum() {
            return aktDatum;
        }

        /**
         * Sets the value of the aktDatum property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setAktDatum(XMLGregorianCalendar value) {
            this.aktDatum = value;
        }

    }

}
