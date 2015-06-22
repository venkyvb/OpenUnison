/*
Copyright 2015 Tremolo Security, Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/


//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.13 at 09:56:21 PM EDT 
//


package com.tremolosecurity.config.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for provisioningType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="provisioningType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="targets" type="{http://www.tremolosecurity.com/tremoloConfig}targetsType"/>
 *         &lt;element name="workflows" type="{http://www.tremolosecurity.com/tremoloConfig}workflowsType"/>
 *         &lt;element name="approvalDB" type="{http://www.tremolosecurity.com/tremoloConfig}approvalDBType" minOccurs="0"/>
 *         &lt;element name="org" type="{http://www.tremolosecurity.com/tremoloConfig}orgType"/>
 *         &lt;element name="queueConfig" type="{http://www.tremolosecurity.com/tremoloConfig}queueConfigType" minOccurs="0"/>
 *         &lt;element name="portal" type="{http://www.tremolosecurity.com/tremoloConfig}portalUrlsType" minOccurs="0"/>
 *         &lt;element name="scheduler" type="{http://www.tremolosecurity.com/tremoloConfig}schedulingType" minOccurs="0"/>
 *         &lt;element name="listeners" type="{http://www.tremolosecurity.com/tremoloConfig}messageListenersType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "provisioningType", propOrder = {
    "targets",
    "workflows",
    "approvalDB",
    "org",
    "queueConfig",
    "portal",
    "scheduler",
    "listeners"
})
public class ProvisioningType {

    @XmlElement(required = true)
    protected TargetsType targets;
    @XmlElement(required = true)
    protected WorkflowsType workflows;
    protected ApprovalDBType approvalDB;
    @XmlElement(required = true)
    protected OrgType org;
    protected QueueConfigType queueConfig;
    protected PortalUrlsType portal;
    protected SchedulingType scheduler;
    protected MessageListenersType listeners;

    /**
     * Gets the value of the targets property.
     * 
     * @return
     *     possible object is
     *     {@link TargetsType }
     *     
     */
    public TargetsType getTargets() {
        return targets;
    }

    /**
     * Sets the value of the targets property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetsType }
     *     
     */
    public void setTargets(TargetsType value) {
        this.targets = value;
    }

    /**
     * Gets the value of the workflows property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowsType }
     *     
     */
    public WorkflowsType getWorkflows() {
        return workflows;
    }

    /**
     * Sets the value of the workflows property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowsType }
     *     
     */
    public void setWorkflows(WorkflowsType value) {
        this.workflows = value;
    }

    /**
     * Gets the value of the approvalDB property.
     * 
     * @return
     *     possible object is
     *     {@link ApprovalDBType }
     *     
     */
    public ApprovalDBType getApprovalDB() {
        return approvalDB;
    }

    /**
     * Sets the value of the approvalDB property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovalDBType }
     *     
     */
    public void setApprovalDB(ApprovalDBType value) {
        this.approvalDB = value;
    }

    /**
     * Gets the value of the org property.
     * 
     * @return
     *     possible object is
     *     {@link OrgType }
     *     
     */
    public OrgType getOrg() {
        return org;
    }

    /**
     * Sets the value of the org property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgType }
     *     
     */
    public void setOrg(OrgType value) {
        this.org = value;
    }

    /**
     * Gets the value of the queueConfig property.
     * 
     * @return
     *     possible object is
     *     {@link QueueConfigType }
     *     
     */
    public QueueConfigType getQueueConfig() {
        return queueConfig;
    }

    /**
     * Sets the value of the queueConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueueConfigType }
     *     
     */
    public void setQueueConfig(QueueConfigType value) {
        this.queueConfig = value;
    }

    /**
     * Gets the value of the portal property.
     * 
     * @return
     *     possible object is
     *     {@link PortalUrlsType }
     *     
     */
    public PortalUrlsType getPortal() {
        return portal;
    }

    /**
     * Sets the value of the portal property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortalUrlsType }
     *     
     */
    public void setPortal(PortalUrlsType value) {
        this.portal = value;
    }

    /**
     * Gets the value of the scheduler property.
     * 
     * @return
     *     possible object is
     *     {@link SchedulingType }
     *     
     */
    public SchedulingType getScheduler() {
        return scheduler;
    }

    /**
     * Sets the value of the scheduler property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchedulingType }
     *     
     */
    public void setScheduler(SchedulingType value) {
        this.scheduler = value;
    }

    /**
     * Gets the value of the listeners property.
     * 
     * @return
     *     possible object is
     *     {@link MessageListenersType }
     *     
     */
    public MessageListenersType getListeners() {
        return listeners;
    }

    /**
     * Sets the value of the listeners property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageListenersType }
     *     
     */
    public void setListeners(MessageListenersType value) {
        this.listeners = value;
    }

}
