
package com.chatapp.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="threadTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addedTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendMessage", propOrder = {
    "threadTypeID",
    "message",
    "userID",
    "addedDate",
    "addedTime"
})
public class SendMessage {

    protected int threadTypeID;
    protected String message;
    protected String userID;
    protected String addedDate;
    protected String addedTime;

    /**
     * Gets the value of the threadTypeID property.
     * 
     */
    public int getThreadTypeID() {
        return threadTypeID;
    }

    /**
     * Sets the value of the threadTypeID property.
     * 
     */
    public void setThreadTypeID(int value) {
        this.threadTypeID = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the addedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddedDate() {
        return addedDate;
    }

    /**
     * Sets the value of the addedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddedDate(String value) {
        this.addedDate = value;
    }

    /**
     * Gets the value of the addedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddedTime() {
        return addedTime;
    }

    /**
     * Sets the value of the addedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddedTime(String value) {
        this.addedTime = value;
    }

}
