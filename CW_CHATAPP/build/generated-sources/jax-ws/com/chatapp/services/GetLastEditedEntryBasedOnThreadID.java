
package com.chatapp.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getLastEditedEntryBasedOnThreadID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getLastEditedEntryBasedOnThreadID">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="threadID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLastEditedEntryBasedOnThreadID", propOrder = {
    "threadID"
})
public class GetLastEditedEntryBasedOnThreadID {

    protected int threadID;

    /**
     * Gets the value of the threadID property.
     * 
     */
    public int getThreadID() {
        return threadID;
    }

    /**
     * Sets the value of the threadID property.
     * 
     */
    public void setThreadID(int value) {
        this.threadID = value;
    }

}
