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
// Generated on: 2020.12.07 at 11:48:34 AM EST 
//


package com.tremolosecurity.config.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines an approval step that must be completed before
 * 				executing sub tasks
 * 
 * <p>Java class for approvalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="approvalType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tremolosecurity.com/tremoloConfig}workflowChoiceTaskType">
 *       &lt;sequence>
 *         &lt;element name="emailTemplate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="approvers" type="{http://www.tremolosecurity.com/tremoloConfig}azRulesType"/>
 *         &lt;element name="mailAttr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="failureEmailSubject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="failureEmailMsg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="escalationPolicy" type="{http://www.tremolosecurity.com/tremoloConfig}escalationPolicyType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "approvalType", propOrder = {
    "emailTemplate",
    "approvers",
    "mailAttr",
    "failureEmailSubject",
    "failureEmailMsg",
    "escalationPolicy"
})
public class ApprovalType
    extends WorkflowChoiceTaskType
{

    @XmlElement(required = true)
    protected String emailTemplate;
    @XmlElement(required = true)
    protected AzRulesType approvers;
    @XmlElement(required = true)
    protected String mailAttr;
    @XmlElement(required = true)
    protected String failureEmailSubject;
    @XmlElement(required = true)
    protected String failureEmailMsg;
    protected EscalationPolicyType escalationPolicy;
    @XmlAttribute(name = "label")
    protected String label;

    /**
     * Gets the value of the emailTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailTemplate() {
        return emailTemplate;
    }

    /**
     * Sets the value of the emailTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailTemplate(String value) {
        this.emailTemplate = value;
    }

    /**
     * Gets the value of the approvers property.
     * 
     * @return
     *     possible object is
     *     {@link AzRulesType }
     *     
     */
    public AzRulesType getApprovers() {
        return approvers;
    }

    /**
     * Sets the value of the approvers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AzRulesType }
     *     
     */
    public void setApprovers(AzRulesType value) {
        this.approvers = value;
    }

    /**
     * Gets the value of the mailAttr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailAttr() {
        return mailAttr;
    }

    /**
     * Sets the value of the mailAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailAttr(String value) {
        this.mailAttr = value;
    }

    /**
     * Gets the value of the failureEmailSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailureEmailSubject() {
        return failureEmailSubject;
    }

    /**
     * Sets the value of the failureEmailSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailureEmailSubject(String value) {
        this.failureEmailSubject = value;
    }

    /**
     * Gets the value of the failureEmailMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailureEmailMsg() {
        return failureEmailMsg;
    }

    /**
     * Sets the value of the failureEmailMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailureEmailMsg(String value) {
        this.failureEmailMsg = value;
    }

    /**
     * Gets the value of the escalationPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link EscalationPolicyType }
     *     
     */
    public EscalationPolicyType getEscalationPolicy() {
        return escalationPolicy;
    }

    /**
     * Sets the value of the escalationPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscalationPolicyType }
     *     
     */
    public void setEscalationPolicy(EscalationPolicyType value) {
        this.escalationPolicy = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

}
