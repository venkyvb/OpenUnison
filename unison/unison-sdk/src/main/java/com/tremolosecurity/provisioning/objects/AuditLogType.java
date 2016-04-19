/*******************************************************************************
 * Copyright 2016 Tremolo Security, Inc.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.tremolosecurity.provisioning.objects;
// Generated Apr 7, 2016 3:31:46 PM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * AuditLogType generated by hbm2java
 */
@Entity
@Table(name = "auditLogType")
public class AuditLogType implements java.io.Serializable {

	
	
	private int id;
	private String name;
	private Set<AuditLogs> auditLogses = new HashSet<AuditLogs>(0);

	public AuditLogType() {
	}

	public AuditLogType(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public AuditLogType(int id, String name, Set<AuditLogs> auditLogses) {
		this.id = id;
		this.name = name;
		this.auditLogses = auditLogses;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "auditLogType")
	public Set<AuditLogs> getAuditLogses() {
		return this.auditLogses;
	}

	public void setAuditLogses(Set<AuditLogs> auditLogses) {
		this.auditLogses = auditLogses;
	}

}