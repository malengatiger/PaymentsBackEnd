
package com.oneconnect.payments.payu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getLookupTransactionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getLookupTransactionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{https://www.payu.co.za/LookupTransactionResponseMessage}LookupTransactionResponseMessage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLookupTransactionResponse", propOrder = {
    "_return"
})
public class GetLookupTransactionResponse {

    @XmlElement(name = "return")
    protected LookupTransactionResponseMessage _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link LookupTransactionResponseMessage }
     *     
     */
    public LookupTransactionResponseMessage getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link LookupTransactionResponseMessage }
     *     
     */
    public void setReturn(LookupTransactionResponseMessage value) {
        this._return = value;
    }

}
