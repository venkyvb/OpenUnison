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
// Generated on: 2020.07.22 at 01:49:24 PM EDT 
//


package com.tremolosecurity.config.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines an identity provider for a URL
 * 
 * <p>Java class for idpType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="idpType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="params" type="{http://www.tremolosecurity.com/tremoloConfig}paramType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mappings" type="{http://www.tremolosecurity.com/tremoloConfig}idpMappingType"/>
 *         &lt;element name="trusts" type="{http://www.tremolosecurity.com/tremoloConfig}trustsType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="className" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "idpType", propOrder = {
    "params",
    "mappings",
    "trusts"
})
public class IdpType {

    protected List<ParamType> params;
    @XmlElement(required = true)
    protected IdpMappingType mappings;
    @XmlElement(required = true)
    protected TrustsType trusts;
    @XmlAttribute(name = "className")
    protected String className;

    /**
     * Gets the value of the params property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the params property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParamType }
     * 
     * 
     */
    public List<ParamType> getParams() {
        if (params == null) {
            params = new ArrayList<ParamType>();
        }
        return this.params;
    }

    /**
     * Gets the value of the mappings property.
     * 
     * @return
     *     possible object is
     *     {@link IdpMappingType }
     *     
     */
    public IdpMappingType getMappings() {
        return mappings;
    }

    /**
     * Sets the value of the mappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdpMappingType }
     *     
     */
    public void setMappings(IdpMappingType value) {
        this.mappings = value;
    }

    /**
     * Gets the value of the trusts property.
     * 
     * @return
     *     possible object is
     *     {@link TrustsType }
     *     
     */
    public TrustsType getTrusts() {
        return trusts;
    }

    /**
     * Sets the value of the trusts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrustsType }
     *     
     */
    public void setTrusts(TrustsType value) {
        this.trusts = value;
    }

    /**
     * Gets the value of the className property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassName(String value) {
        this.className = value;
    }

}
