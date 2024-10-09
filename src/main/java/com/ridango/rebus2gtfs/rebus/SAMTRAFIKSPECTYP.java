
package com.ridango.rebus2gtfs.rebus;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SAMTRAFIKSPEC_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SAMTRAFIKSPEC_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ftp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="ftpind" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="flinje" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="ftur" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="fDagtyp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="ttp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="ttpind" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="tlinje" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="ttur" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="tDagtyp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Anktid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Avgtid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Maxvantetid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="hplnr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Startdatum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="masks" type="{}MASK_TYP"/>
 *         <element name="GroupDepTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="GroupArrTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SAMTRAFIKSPEC_TYP", propOrder = {
    "ftp",
    "ftpind",
    "flinje",
    "ftur",
    "fDagtyp",
    "ttp",
    "ttpind",
    "tlinje",
    "ttur",
    "tDagtyp",
    "anktid",
    "avgtid",
    "maxvantetid",
    "hplnr",
    "startdatum",
    "masks",
    "groupDepTime",
    "groupArrTime"
})
public class SAMTRAFIKSPECTYP {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer ftp;
    protected int ftpind;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer flinje;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer ftur;
    protected int fDagtyp;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer ttp;
    protected int ttpind;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer tlinje;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer ttur;
    protected int tDagtyp;
    /**
     * Ankommande liinjes tid vid byteshållplats i sekunder
     * 
     */
    @XmlElement(name = "Anktid")
    protected int anktid;
    /**
     * Avgående liinjes tid vid byteshållplats i sekunder
     * 
     */
    @XmlElement(name = "Avgtid")
    protected int avgtid;
    @XmlElement(name = "Maxvantetid")
    protected int maxvantetid;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer hplnr;
    /**
     * Startdatum för samtrafikmasken
     * 
     */
    @XmlElement(name = "Startdatum", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startdatum;
    /**
     * Masken är beräknad som snittet mellan de ingående turerna
     * 
     */
    @XmlElement(required = true)
    protected MASKTYP masks;
    /**
     * Gruppering av samtrafik på avgångstid
     * 
     */
    @XmlElement(name = "GroupDepTime")
    protected int groupDepTime;
    /**
     * Gruppering av samtrafik på ankomsttid
     * 
     */
    @XmlElement(name = "GroupArrTime")
    protected int groupArrTime;

    /**
     * Gets the value of the ftp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFtp() {
        return ftp;
    }

    /**
     * Sets the value of the ftp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFtp(Integer value) {
        this.ftp = value;
    }

    /**
     * Gets the value of the ftpind property.
     * 
     */
    public int getFtpind() {
        return ftpind;
    }

    /**
     * Sets the value of the ftpind property.
     * 
     */
    public void setFtpind(int value) {
        this.ftpind = value;
    }

    /**
     * Gets the value of the flinje property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlinje() {
        return flinje;
    }

    /**
     * Sets the value of the flinje property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlinje(Integer value) {
        this.flinje = value;
    }

    /**
     * Gets the value of the ftur property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFtur() {
        return ftur;
    }

    /**
     * Sets the value of the ftur property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFtur(Integer value) {
        this.ftur = value;
    }

    /**
     * Gets the value of the fDagtyp property.
     * 
     */
    public int getFDagtyp() {
        return fDagtyp;
    }

    /**
     * Sets the value of the fDagtyp property.
     * 
     */
    public void setFDagtyp(int value) {
        this.fDagtyp = value;
    }

    /**
     * Gets the value of the ttp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTtp() {
        return ttp;
    }

    /**
     * Sets the value of the ttp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTtp(Integer value) {
        this.ttp = value;
    }

    /**
     * Gets the value of the ttpind property.
     * 
     */
    public int getTtpind() {
        return ttpind;
    }

    /**
     * Sets the value of the ttpind property.
     * 
     */
    public void setTtpind(int value) {
        this.ttpind = value;
    }

    /**
     * Gets the value of the tlinje property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTlinje() {
        return tlinje;
    }

    /**
     * Sets the value of the tlinje property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTlinje(Integer value) {
        this.tlinje = value;
    }

    /**
     * Gets the value of the ttur property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTtur() {
        return ttur;
    }

    /**
     * Sets the value of the ttur property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTtur(Integer value) {
        this.ttur = value;
    }

    /**
     * Gets the value of the tDagtyp property.
     * 
     */
    public int getTDagtyp() {
        return tDagtyp;
    }

    /**
     * Sets the value of the tDagtyp property.
     * 
     */
    public void setTDagtyp(int value) {
        this.tDagtyp = value;
    }

    /**
     * Ankommande liinjes tid vid byteshållplats i sekunder
     * 
     */
    public int getAnktid() {
        return anktid;
    }

    /**
     * Sets the value of the anktid property.
     * 
     */
    public void setAnktid(int value) {
        this.anktid = value;
    }

    /**
     * Avgående liinjes tid vid byteshållplats i sekunder
     * 
     */
    public int getAvgtid() {
        return avgtid;
    }

    /**
     * Sets the value of the avgtid property.
     * 
     */
    public void setAvgtid(int value) {
        this.avgtid = value;
    }

    /**
     * Gets the value of the maxvantetid property.
     * 
     */
    public int getMaxvantetid() {
        return maxvantetid;
    }

    /**
     * Sets the value of the maxvantetid property.
     * 
     */
    public void setMaxvantetid(int value) {
        this.maxvantetid = value;
    }

    /**
     * Gets the value of the hplnr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHplnr() {
        return hplnr;
    }

    /**
     * Sets the value of the hplnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHplnr(Integer value) {
        this.hplnr = value;
    }

    /**
     * Startdatum för samtrafikmasken
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartdatum() {
        return startdatum;
    }

    /**
     * Sets the value of the startdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getStartdatum()
     */
    public void setStartdatum(XMLGregorianCalendar value) {
        this.startdatum = value;
    }

    /**
     * Masken är beräknad som snittet mellan de ingående turerna
     * 
     * @return
     *     possible object is
     *     {@link MASKTYP }
     *     
     */
    public MASKTYP getMasks() {
        return masks;
    }

    /**
     * Sets the value of the masks property.
     * 
     * @param value
     *     allowed object is
     *     {@link MASKTYP }
     *     
     * @see #getMasks()
     */
    public void setMasks(MASKTYP value) {
        this.masks = value;
    }

    /**
     * Gruppering av samtrafik på avgångstid
     * 
     */
    public int getGroupDepTime() {
        return groupDepTime;
    }

    /**
     * Sets the value of the groupDepTime property.
     * 
     */
    public void setGroupDepTime(int value) {
        this.groupDepTime = value;
    }

    /**
     * Gruppering av samtrafik på ankomsttid
     * 
     */
    public int getGroupArrTime() {
        return groupArrTime;
    }

    /**
     * Sets the value of the groupArrTime property.
     * 
     */
    public void setGroupArrTime(int value) {
        this.groupArrTime = value;
    }

}
