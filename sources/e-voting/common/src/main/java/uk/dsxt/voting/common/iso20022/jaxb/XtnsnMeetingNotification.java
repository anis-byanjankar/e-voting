//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.25 at 03:58:45 PM GMT+03:00 
//


package uk.dsxt.voting.common.iso20022.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for XtnsnMeetingNotification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XtnsnMeetingNotification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XtnsnDt">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SctyDtls" type="{}FinancialInstrumentAttributes34" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="RegnPrtcptnMktStrt" type="{}DateFormat2Choice" minOccurs="0"/>
 *                   &lt;element name="CorpActnDtls" type="{}CorporateAction10" minOccurs="0"/>
 *                   &lt;element name="CorpActnOptnDtls" type="{}CorporateActionOption51" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="AddtlInf" type="{}CorporateActionNarrative11" minOccurs="0"/>
 *                   &lt;element name="Attch" type="{}XtnsnAttachment" maxOccurs="30" minOccurs="0"/>
 *                   &lt;element name="EvtsLkg" type="{}CorporateActionEventReference1" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="AddtlDcmnttnAdr" type="{}PostalAddress1" maxOccurs="20" minOccurs="0"/>
 *                   &lt;element name="VtAddRqrmnts" type="{}XtnsnVoteAdditionalRequirements" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ShrDnomntr" type="{}XtnsnSharesDenominator" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XtnsnMeetingNotification", propOrder = {
    "xtnsnDt"
})
public class XtnsnMeetingNotification {

    @XmlElement(name = "XtnsnDt", required = true)
    protected XtnsnMeetingNotification.XtnsnDt xtnsnDt;

    /**
     * Gets the value of the xtnsnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XtnsnMeetingNotification.XtnsnDt }
     *     
     */
    public XtnsnMeetingNotification.XtnsnDt getXtnsnDt() {
        return xtnsnDt;
    }

    /**
     * Sets the value of the xtnsnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XtnsnMeetingNotification.XtnsnDt }
     *     
     */
    public void setXtnsnDt(XtnsnMeetingNotification.XtnsnDt value) {
        this.xtnsnDt = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SctyDtls" type="{}FinancialInstrumentAttributes34" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="RegnPrtcptnMktStrt" type="{}DateFormat2Choice" minOccurs="0"/>
     *         &lt;element name="CorpActnDtls" type="{}CorporateAction10" minOccurs="0"/>
     *         &lt;element name="CorpActnOptnDtls" type="{}CorporateActionOption51" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="AddtlInf" type="{}CorporateActionNarrative11" minOccurs="0"/>
     *         &lt;element name="Attch" type="{}XtnsnAttachment" maxOccurs="30" minOccurs="0"/>
     *         &lt;element name="EvtsLkg" type="{}CorporateActionEventReference1" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="AddtlDcmnttnAdr" type="{}PostalAddress1" maxOccurs="20" minOccurs="0"/>
     *         &lt;element name="VtAddRqrmnts" type="{}XtnsnVoteAdditionalRequirements" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ShrDnomntr" type="{}XtnsnSharesDenominator" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sctyDtls",
        "regnPrtcptnMktStrt",
        "corpActnDtls",
        "corpActnOptnDtls",
        "addtlInf",
        "attch",
        "evtsLkg",
        "addtlDcmnttnAdr",
        "vtAddRqrmnts",
        "shrDnomntr"
    })
    public static class XtnsnDt {

        @XmlElement(name = "SctyDtls")
        protected List<FinancialInstrumentAttributes34> sctyDtls;
        @XmlElement(name = "RegnPrtcptnMktStrt")
        protected DateFormat2Choice regnPrtcptnMktStrt;
        @XmlElement(name = "CorpActnDtls")
        protected CorporateAction10 corpActnDtls;
        @XmlElement(name = "CorpActnOptnDtls")
        protected List<CorporateActionOption51> corpActnOptnDtls;
        @XmlElement(name = "AddtlInf")
        protected CorporateActionNarrative11 addtlInf;
        @XmlElement(name = "Attch")
        protected List<XtnsnAttachment> attch;
        @XmlElement(name = "EvtsLkg")
        protected List<CorporateActionEventReference1> evtsLkg;
        @XmlElement(name = "AddtlDcmnttnAdr")
        protected List<PostalAddress1> addtlDcmnttnAdr;
        @XmlElement(name = "VtAddRqrmnts")
        protected List<XtnsnVoteAdditionalRequirements> vtAddRqrmnts;
        @XmlElement(name = "ShrDnomntr")
        protected List<XtnsnSharesDenominator> shrDnomntr;

        /**
         * Gets the value of the sctyDtls property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sctyDtls property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSctyDtls().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FinancialInstrumentAttributes34 }
         * 
         * 
         */
        public List<FinancialInstrumentAttributes34> getSctyDtls() {
            if (sctyDtls == null) {
                sctyDtls = new ArrayList<FinancialInstrumentAttributes34>();
            }
            return this.sctyDtls;
        }

        /**
         * Gets the value of the regnPrtcptnMktStrt property.
         * 
         * @return
         *     possible object is
         *     {@link DateFormat2Choice }
         *     
         */
        public DateFormat2Choice getRegnPrtcptnMktStrt() {
            return regnPrtcptnMktStrt;
        }

        /**
         * Sets the value of the regnPrtcptnMktStrt property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateFormat2Choice }
         *     
         */
        public void setRegnPrtcptnMktStrt(DateFormat2Choice value) {
            this.regnPrtcptnMktStrt = value;
        }

        /**
         * Gets the value of the corpActnDtls property.
         * 
         * @return
         *     possible object is
         *     {@link CorporateAction10 }
         *     
         */
        public CorporateAction10 getCorpActnDtls() {
            return corpActnDtls;
        }

        /**
         * Sets the value of the corpActnDtls property.
         * 
         * @param value
         *     allowed object is
         *     {@link CorporateAction10 }
         *     
         */
        public void setCorpActnDtls(CorporateAction10 value) {
            this.corpActnDtls = value;
        }

        /**
         * Gets the value of the corpActnOptnDtls property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the corpActnOptnDtls property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCorpActnOptnDtls().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CorporateActionOption51 }
         * 
         * 
         */
        public List<CorporateActionOption51> getCorpActnOptnDtls() {
            if (corpActnOptnDtls == null) {
                corpActnOptnDtls = new ArrayList<CorporateActionOption51>();
            }
            return this.corpActnOptnDtls;
        }

        /**
         * Gets the value of the addtlInf property.
         * 
         * @return
         *     possible object is
         *     {@link CorporateActionNarrative11 }
         *     
         */
        public CorporateActionNarrative11 getAddtlInf() {
            return addtlInf;
        }

        /**
         * Sets the value of the addtlInf property.
         * 
         * @param value
         *     allowed object is
         *     {@link CorporateActionNarrative11 }
         *     
         */
        public void setAddtlInf(CorporateActionNarrative11 value) {
            this.addtlInf = value;
        }

        /**
         * Gets the value of the attch property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attch property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttch().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XtnsnAttachment }
         * 
         * 
         */
        public List<XtnsnAttachment> getAttch() {
            if (attch == null) {
                attch = new ArrayList<XtnsnAttachment>();
            }
            return this.attch;
        }

        /**
         * Gets the value of the evtsLkg property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the evtsLkg property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEvtsLkg().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CorporateActionEventReference1 }
         * 
         * 
         */
        public List<CorporateActionEventReference1> getEvtsLkg() {
            if (evtsLkg == null) {
                evtsLkg = new ArrayList<CorporateActionEventReference1>();
            }
            return this.evtsLkg;
        }

        /**
         * Gets the value of the addtlDcmnttnAdr property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the addtlDcmnttnAdr property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddtlDcmnttnAdr().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PostalAddress1 }
         * 
         * 
         */
        public List<PostalAddress1> getAddtlDcmnttnAdr() {
            if (addtlDcmnttnAdr == null) {
                addtlDcmnttnAdr = new ArrayList<PostalAddress1>();
            }
            return this.addtlDcmnttnAdr;
        }

        /**
         * Gets the value of the vtAddRqrmnts property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vtAddRqrmnts property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVtAddRqrmnts().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XtnsnVoteAdditionalRequirements }
         * 
         * 
         */
        public List<XtnsnVoteAdditionalRequirements> getVtAddRqrmnts() {
            if (vtAddRqrmnts == null) {
                vtAddRqrmnts = new ArrayList<XtnsnVoteAdditionalRequirements>();
            }
            return this.vtAddRqrmnts;
        }

        /**
         * Gets the value of the shrDnomntr property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the shrDnomntr property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getShrDnomntr().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XtnsnSharesDenominator }
         * 
         * 
         */
        public List<XtnsnSharesDenominator> getShrDnomntr() {
            if (shrDnomntr == null) {
                shrDnomntr = new ArrayList<XtnsnSharesDenominator>();
            }
            return this.shrDnomntr;
        }

    }

}