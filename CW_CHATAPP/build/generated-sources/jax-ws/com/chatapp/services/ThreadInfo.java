
package com.chatapp.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for threadInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="threadInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addedTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="threadTypeID" type="{http://services.chatapp.com/}threadTypeInfo" minOccurs="0"/>
 *         &lt;element name="usserID" type="{http://services.chatapp.com/}userInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "threadInfo", propOrder = {
    "addedDate",
    "addedTime",
    "id",
    "message",
    "threadTypeID",
    "usserID"
})
public class ThreadInfo {

    protected String addedDate;
    protected String addedTime;
    protected int id;
    protected String message;
    protected ThreadTypeInfo threadTypeID;
    protected UserInfo usserID;

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

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
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
     * Gets the value of the threadTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link ThreadTypeInfo }
     *     
     */
    public ThreadTypeInfo getThreadTypeID() {
        return threadTypeID;
    }

    /**
     * Sets the value of the threadTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThreadTypeInfo }
     *     
     */
    public void setThreadTypeID(ThreadTypeInfo value) {
        this.threadTypeID = value;
    }

    /**
     * Gets the value of the usserID property.
     * 
     * @return
     *     possible object is
     *     {@link UserInfo }
     *     
     */
    public UserInfo getUsserID() {
        return usserID;
    }

    /**
     * Sets the value of the usserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInfo }
     *     
     */
    public void setUsserID(UserInfo value) {
        this.usserID = value;
    }

}
