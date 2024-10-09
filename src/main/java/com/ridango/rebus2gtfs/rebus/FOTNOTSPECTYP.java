
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FOTNOTSPEC_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FOTNOTSPEC_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="fotnot">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="FotnotId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="tp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="tpind" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="linje">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Rikt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="turnr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Notetype">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Styr">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Notetext" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Scase" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="MedElmer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="MedTidtabell" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="MedStolpe" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="MedHastus" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="MedPubtrans" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <sequence minOccurs="0">
 *           <element name="Anropinfo" type="{}ANROPINFO_TYP"/>
 *         </sequence>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FOTNOTSPEC_TYP", propOrder = {
    "fotnot",
    "fotnotId",
    "tp",
    "tpind",
    "linje",
    "rikt",
    "turnr",
    "notetype",
    "styr",
    "notetext",
    "scase",
    "medElmer",
    "medTidtabell",
    "medStolpe",
    "medHastus",
    "medPubtrans",
    "anropinfo"
})
public class FOTNOTSPECTYP {

    @XmlElement(required = true, nillable = true)
    protected String fotnot;
    @XmlElement(name = "FotnotId")
    protected int fotnotId;
    /**
     * Om Global finns det ingen tabellperiod
     * 
     */
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer tp;
    protected int tpind;
    /**
     * Om Global eller fast finns det inget Linjenummer här
     * 
     */
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer linje;
    @XmlElement(name = "Rikt")
    protected int rikt;
    protected int turnr;
    /**
     *  0:Global                      1:Fast                          2:Lös
     * 
     */
    @XmlElement(name = "Notetype")
    protected int notetype;
    /**
     *  0:ej styrd         1:Periodstyrd         2:Trafiktypstyrd
     * 
     */
    @XmlElement(name = "Styr")
    protected int styr;
    @XmlElement(name = "Notetext", required = true)
    protected String notetext;
    /**
     * True Om stor bokstav
     * 
     */
    @XmlElement(name = "Scase")
    protected boolean scase;
    @XmlElement(name = "MedElmer")
    protected boolean medElmer;
    @XmlElement(name = "MedTidtabell")
    protected boolean medTidtabell;
    @XmlElement(name = "MedStolpe")
    protected boolean medStolpe;
    @XmlElement(name = "MedHastus")
    protected boolean medHastus;
    @XmlElement(name = "MedPubtrans")
    protected boolean medPubtrans;
    @XmlElement(name = "Anropinfo")
    protected ANROPINFOTYP anropinfo;

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
     * Gets the value of the fotnotId property.
     * 
     */
    public int getFotnotId() {
        return fotnotId;
    }

    /**
     * Sets the value of the fotnotId property.
     * 
     */
    public void setFotnotId(int value) {
        this.fotnotId = value;
    }

    /**
     * Om Global finns det ingen tabellperiod
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getTp()
     */
    public void setTp(Integer value) {
        this.tp = value;
    }

    /**
     * Gets the value of the tpind property.
     * 
     */
    public int getTpind() {
        return tpind;
    }

    /**
     * Sets the value of the tpind property.
     * 
     */
    public void setTpind(int value) {
        this.tpind = value;
    }

    /**
     * Om Global eller fast finns det inget Linjenummer här
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLinje() {
        return linje;
    }

    /**
     * Sets the value of the linje property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getLinje()
     */
    public void setLinje(Integer value) {
        this.linje = value;
    }

    /**
     * Gets the value of the rikt property.
     * 
     */
    public int getRikt() {
        return rikt;
    }

    /**
     * Sets the value of the rikt property.
     * 
     */
    public void setRikt(int value) {
        this.rikt = value;
    }

    /**
     * Gets the value of the turnr property.
     * 
     */
    public int getTurnr() {
        return turnr;
    }

    /**
     * Sets the value of the turnr property.
     * 
     */
    public void setTurnr(int value) {
        this.turnr = value;
    }

    /**
     *  0:Global                      1:Fast                          2:Lös
     * 
     */
    public int getNotetype() {
        return notetype;
    }

    /**
     * Sets the value of the notetype property.
     * 
     */
    public void setNotetype(int value) {
        this.notetype = value;
    }

    /**
     *  0:ej styrd         1:Periodstyrd         2:Trafiktypstyrd
     * 
     */
    public int getStyr() {
        return styr;
    }

    /**
     * Sets the value of the styr property.
     * 
     */
    public void setStyr(int value) {
        this.styr = value;
    }

    /**
     * Gets the value of the notetext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotetext() {
        return notetext;
    }

    /**
     * Sets the value of the notetext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotetext(String value) {
        this.notetext = value;
    }

    /**
     * True Om stor bokstav
     * 
     */
    public boolean isScase() {
        return scase;
    }

    /**
     * Sets the value of the scase property.
     * 
     */
    public void setScase(boolean value) {
        this.scase = value;
    }

    /**
     * Gets the value of the medElmer property.
     * 
     */
    public boolean isMedElmer() {
        return medElmer;
    }

    /**
     * Sets the value of the medElmer property.
     * 
     */
    public void setMedElmer(boolean value) {
        this.medElmer = value;
    }

    /**
     * Gets the value of the medTidtabell property.
     * 
     */
    public boolean isMedTidtabell() {
        return medTidtabell;
    }

    /**
     * Sets the value of the medTidtabell property.
     * 
     */
    public void setMedTidtabell(boolean value) {
        this.medTidtabell = value;
    }

    /**
     * Gets the value of the medStolpe property.
     * 
     */
    public boolean isMedStolpe() {
        return medStolpe;
    }

    /**
     * Sets the value of the medStolpe property.
     * 
     */
    public void setMedStolpe(boolean value) {
        this.medStolpe = value;
    }

    /**
     * Gets the value of the medHastus property.
     * 
     */
    public boolean isMedHastus() {
        return medHastus;
    }

    /**
     * Sets the value of the medHastus property.
     * 
     */
    public void setMedHastus(boolean value) {
        this.medHastus = value;
    }

    /**
     * Gets the value of the medPubtrans property.
     * 
     */
    public boolean isMedPubtrans() {
        return medPubtrans;
    }

    /**
     * Sets the value of the medPubtrans property.
     * 
     */
    public void setMedPubtrans(boolean value) {
        this.medPubtrans = value;
    }

    /**
     * Gets the value of the anropinfo property.
     * 
     * @return
     *     possible object is
     *     {@link ANROPINFOTYP }
     *     
     */
    public ANROPINFOTYP getAnropinfo() {
        return anropinfo;
    }

    /**
     * Sets the value of the anropinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ANROPINFOTYP }
     *     
     */
    public void setAnropinfo(ANROPINFOTYP value) {
        this.anropinfo = value;
    }

}
