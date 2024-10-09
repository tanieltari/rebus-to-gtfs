
package com.ridango.rebus2gtfs.rebus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UTRUSTNING_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="UTRUSTNING_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ficka">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="cykelskydd">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="pendlarpark">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="klocka">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="belysning">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="betongvarme">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="reklamskap">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="anslag">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="hallplatskur">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="48"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="uentre">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="48"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="tsthpl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="tsphpl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="realtid">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="hogtalare">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="biljettautomat">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="funkar">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="24"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <sequence maxOccurs="unbounded" minOccurs="0">
 *           <element name="Skaplst" type="{}SKAP_TYP"/>
 *         </sequence>
 *         <sequence maxOccurs="unbounded" minOccurs="0">
 *           <element name="Stolpelst" type="{}STOLPE_TYP"/>
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
@XmlType(name = "UTRUSTNING_TYP", propOrder = {
    "ficka",
    "cykelskydd",
    "pendlarpark",
    "klocka",
    "belysning",
    "betongvarme",
    "reklamskap",
    "anslag",
    "hallplatskur",
    "uentre",
    "tsthpl",
    "tsphpl",
    "realtid",
    "hogtalare",
    "biljettautomat",
    "funkar",
    "skaplst",
    "stolpelst"
})
public class UTRUSTNINGTYP {

    @XmlElement(required = true, nillable = true)
    protected String ficka;
    @XmlElement(required = true, nillable = true)
    protected String cykelskydd;
    @XmlElement(required = true, nillable = true)
    protected String pendlarpark;
    @XmlElement(required = true, nillable = true)
    protected String klocka;
    @XmlElement(required = true, nillable = true)
    protected String belysning;
    @XmlElement(required = true, nillable = true)
    protected String betongvarme;
    @XmlElement(required = true, nillable = true)
    protected String reklamskap;
    @XmlElement(required = true, nillable = true)
    protected String anslag;
    @XmlElement(required = true, nillable = true)
    protected String hallplatskur;
    @XmlElement(required = true, nillable = true)
    protected String uentre;
    @XmlElement(required = true, nillable = true)
    protected String tsthpl;
    @XmlElement(required = true, nillable = true)
    protected String tsphpl;
    @XmlElement(required = true, nillable = true)
    protected String realtid;
    @XmlElement(required = true, nillable = true)
    protected String hogtalare;
    @XmlElement(required = true, nillable = true)
    protected String biljettautomat;
    @XmlElement(required = true, nillable = true)
    protected String funkar;
    @XmlElement(name = "Skaplst")
    protected List<SKAPTYP> skaplst;
    @XmlElement(name = "Stolpelst")
    protected List<STOLPETYP> stolpelst;

    /**
     * Gets the value of the ficka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFicka() {
        return ficka;
    }

    /**
     * Sets the value of the ficka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFicka(String value) {
        this.ficka = value;
    }

    /**
     * Gets the value of the cykelskydd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCykelskydd() {
        return cykelskydd;
    }

    /**
     * Sets the value of the cykelskydd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCykelskydd(String value) {
        this.cykelskydd = value;
    }

    /**
     * Gets the value of the pendlarpark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPendlarpark() {
        return pendlarpark;
    }

    /**
     * Sets the value of the pendlarpark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPendlarpark(String value) {
        this.pendlarpark = value;
    }

    /**
     * Gets the value of the klocka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKlocka() {
        return klocka;
    }

    /**
     * Sets the value of the klocka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKlocka(String value) {
        this.klocka = value;
    }

    /**
     * Gets the value of the belysning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBelysning() {
        return belysning;
    }

    /**
     * Sets the value of the belysning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBelysning(String value) {
        this.belysning = value;
    }

    /**
     * Gets the value of the betongvarme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBetongvarme() {
        return betongvarme;
    }

    /**
     * Sets the value of the betongvarme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBetongvarme(String value) {
        this.betongvarme = value;
    }

    /**
     * Gets the value of the reklamskap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReklamskap() {
        return reklamskap;
    }

    /**
     * Sets the value of the reklamskap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReklamskap(String value) {
        this.reklamskap = value;
    }

    /**
     * Gets the value of the anslag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnslag() {
        return anslag;
    }

    /**
     * Sets the value of the anslag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnslag(String value) {
        this.anslag = value;
    }

    /**
     * Gets the value of the hallplatskur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHallplatskur() {
        return hallplatskur;
    }

    /**
     * Sets the value of the hallplatskur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHallplatskur(String value) {
        this.hallplatskur = value;
    }

    /**
     * Gets the value of the uentre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUentre() {
        return uentre;
    }

    /**
     * Sets the value of the uentre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUentre(String value) {
        this.uentre = value;
    }

    /**
     * Gets the value of the tsthpl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTsthpl() {
        return tsthpl;
    }

    /**
     * Sets the value of the tsthpl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTsthpl(String value) {
        this.tsthpl = value;
    }

    /**
     * Gets the value of the tsphpl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTsphpl() {
        return tsphpl;
    }

    /**
     * Sets the value of the tsphpl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTsphpl(String value) {
        this.tsphpl = value;
    }

    /**
     * Gets the value of the realtid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRealtid() {
        return realtid;
    }

    /**
     * Sets the value of the realtid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealtid(String value) {
        this.realtid = value;
    }

    /**
     * Gets the value of the hogtalare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHogtalare() {
        return hogtalare;
    }

    /**
     * Sets the value of the hogtalare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHogtalare(String value) {
        this.hogtalare = value;
    }

    /**
     * Gets the value of the biljettautomat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBiljettautomat() {
        return biljettautomat;
    }

    /**
     * Sets the value of the biljettautomat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiljettautomat(String value) {
        this.biljettautomat = value;
    }

    /**
     * Gets the value of the funkar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunkar() {
        return funkar;
    }

    /**
     * Sets the value of the funkar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunkar(String value) {
        this.funkar = value;
    }

    /**
     * Gets the value of the skaplst property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the skaplst property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSkaplst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SKAPTYP }
     * </p>
     * 
     * 
     * @return
     *     The value of the skaplst property.
     */
    public List<SKAPTYP> getSkaplst() {
        if (skaplst == null) {
            skaplst = new ArrayList<>();
        }
        return this.skaplst;
    }

    /**
     * Gets the value of the stolpelst property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stolpelst property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getStolpelst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STOLPETYP }
     * </p>
     * 
     * 
     * @return
     *     The value of the stolpelst property.
     */
    public List<STOLPETYP> getStolpelst() {
        if (stolpelst == null) {
            stolpelst = new ArrayList<>();
        }
        return this.stolpelst;
    }

}
