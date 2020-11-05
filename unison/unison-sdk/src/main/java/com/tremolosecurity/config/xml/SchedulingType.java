/*******************************************************************************
 * Copyright 2020 Tremolo Security, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.04 at 12:55:54 PM EST 
//


package com.tremolosecurity.config.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Unison uses an internal scheduler to be able to
 * 				perform jobs at specific times
 * 
 * <p>Java class for schedulingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="schedulingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dynamicJobs" type="{http://www.tremolosecurity.com/tremoloConfig}dynamicPortalUrlsType" minOccurs="0"/>
 *         &lt;element name="scheduleDB" type="{http://www.tremolosecurity.com/tremoloConfig}scheduleDBType" minOccurs="0"/>
 *         &lt;element name="job" type="{http://www.tremolosecurity.com/tremoloConfig}jobType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="useDB" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="threadCount" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="instanceLabel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="instanceIPMask" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "schedulingType", propOrder = {
    "dynamicJobs",
    "scheduleDB",
    "job"
})
public class SchedulingType {

    protected DynamicPortalUrlsType dynamicJobs;
    protected ScheduleDBType scheduleDB;
    protected List<JobType> job;
    @XmlAttribute(name = "useDB")
    protected Boolean useDB;
    @XmlAttribute(name = "threadCount")
    protected Integer threadCount;
    @XmlAttribute(name = "instanceLabel")
    protected String instanceLabel;
    @XmlAttribute(name = "instanceIPMask")
    protected String instanceIPMask;

    /**
     * Gets the value of the dynamicJobs property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicPortalUrlsType }
     *     
     */
    public DynamicPortalUrlsType getDynamicJobs() {
        return dynamicJobs;
    }

    /**
     * Sets the value of the dynamicJobs property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicPortalUrlsType }
     *     
     */
    public void setDynamicJobs(DynamicPortalUrlsType value) {
        this.dynamicJobs = value;
    }

    /**
     * Gets the value of the scheduleDB property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleDBType }
     *     
     */
    public ScheduleDBType getScheduleDB() {
        return scheduleDB;
    }

    /**
     * Sets the value of the scheduleDB property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleDBType }
     *     
     */
    public void setScheduleDB(ScheduleDBType value) {
        this.scheduleDB = value;
    }

    /**
     * Gets the value of the job property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the job property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJob().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobType }
     * 
     * 
     */
    public List<JobType> getJob() {
        if (job == null) {
            job = new ArrayList<JobType>();
        }
        return this.job;
    }

    /**
     * Gets the value of the useDB property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUseDB() {
        if (useDB == null) {
            return false;
        } else {
            return useDB;
        }
    }

    /**
     * Sets the value of the useDB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseDB(Boolean value) {
        this.useDB = value;
    }

    /**
     * Gets the value of the threadCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getThreadCount() {
        return threadCount;
    }

    /**
     * Sets the value of the threadCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setThreadCount(Integer value) {
        this.threadCount = value;
    }

    /**
     * Gets the value of the instanceLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceLabel() {
        return instanceLabel;
    }

    /**
     * Sets the value of the instanceLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceLabel(String value) {
        this.instanceLabel = value;
    }

    /**
     * Gets the value of the instanceIPMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceIPMask() {
        return instanceIPMask;
    }

    /**
     * Sets the value of the instanceIPMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceIPMask(String value) {
        this.instanceIPMask = value;
    }

}
