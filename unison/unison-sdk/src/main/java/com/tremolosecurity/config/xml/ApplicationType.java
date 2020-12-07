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
 * A combination of URLs grouped into a single
 * 				application
 * 
 * <p>Java class for applicationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="applicationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="results" type="{http://www.tremolosecurity.com/tremoloConfig}resultRefType" minOccurs="0"/>
 *         &lt;element name="urls" type="{http://www.tremolosecurity.com/tremoloConfig}urlsType"/>
 *         &lt;element name="cookieConfig" type="{http://www.tremolosecurity.com/tremoloConfig}cookieConfigType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isApp" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="azTimeoutMillis" type="{http://www.w3.org/2001/XMLSchema}long" default="30000" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applicationType", propOrder = {
    "results",
    "urls",
    "cookieConfig"
})
public class ApplicationType {

    protected ResultRefType results;
    @XmlElement(required = true)
    protected UrlsType urls;
    protected CookieConfigType cookieConfig;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "isApp")
    protected Boolean isApp;
    @XmlAttribute(name = "azTimeoutMillis")
    protected Long azTimeoutMillis;

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link ResultRefType }
     *     
     */
    public ResultRefType getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultRefType }
     *     
     */
    public void setResults(ResultRefType value) {
        this.results = value;
    }

    /**
     * Gets the value of the urls property.
     * 
     * @return
     *     possible object is
     *     {@link UrlsType }
     *     
     */
    public UrlsType getUrls() {
        return urls;
    }

    /**
     * Sets the value of the urls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlsType }
     *     
     */
    public void setUrls(UrlsType value) {
        this.urls = value;
    }

    /**
     * Gets the value of the cookieConfig property.
     * 
     * @return
     *     possible object is
     *     {@link CookieConfigType }
     *     
     */
    public CookieConfigType getCookieConfig() {
        return cookieConfig;
    }

    /**
     * Sets the value of the cookieConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link CookieConfigType }
     *     
     */
    public void setCookieConfig(CookieConfigType value) {
        this.cookieConfig = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the isApp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsApp() {
        if (isApp == null) {
            return true;
        } else {
            return isApp;
        }
    }

    /**
     * Sets the value of the isApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsApp(Boolean value) {
        this.isApp = value;
    }

    /**
     * Gets the value of the azTimeoutMillis property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getAzTimeoutMillis() {
        if (azTimeoutMillis == null) {
            return  30000L;
        } else {
            return azTimeoutMillis;
        }
    }

    /**
     * Sets the value of the azTimeoutMillis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAzTimeoutMillis(Long value) {
        this.azTimeoutMillis = value;
    }

}
