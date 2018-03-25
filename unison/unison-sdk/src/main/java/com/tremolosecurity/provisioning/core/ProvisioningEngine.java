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


package com.tremolosecurity.provisioning.core;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

import javax.jms.JMSException;
import javax.jms.MessageProducer;

import org.hibernate.SessionFactory;

import com.tremolosecurity.provisioning.core.ProvisioningUtil.ActionType;
import com.tremolosecurity.provisioning.util.EncryptedMessage;


public interface ProvisioningEngine {

	/**
	 * Initializes the configured workflows from their XML source
	 * @throws ProvisioningException
	 */
	public abstract void initWorkFlows() throws ProvisioningException;

	/**
	 * Retrieves a provisioning target by its name as configured in the administration system
	 * @param name The name of the target
	 * @return The target implementation class
	 * @throws ProvisioningException Thrown if no target exists with that name
	 */
	public abstract ProvisioningTarget getTarget(String name)
			throws ProvisioningException;

	/**
	 * 
	 * @param name
	 * @param user
	 * @return
	 * @throws ProvisioningException
	 */
	public abstract Workflow getWorkFlow(String name, User user)
			throws ProvisioningException;

	public abstract Workflow getWorkFlow(String name)
			throws ProvisioningException;

	

	public abstract void doApproval(int id, String userID, boolean approved,
			String reason) throws ProvisioningException;

	public abstract String getUserIDAttribute();

	public abstract ArrayList<String> getApproverAttributes();

	public abstract ArrayList<String> getUserAttrbiutes();

	public abstract void logAction(String target, boolean isEntry,
			ActionType actionType, int approval, Workflow wf, String attribute,
			String val) throws ProvisioningException;

	public abstract void sendNotification(String email, String msgTxt, User user)
			throws Exception;

	public abstract void sendNotification(String email, String msgTxt, User user,String contentType)
			throws Exception;

	public abstract void sendNotification(String email, String msgTxt,
			String subject, User user) throws Exception;

			public abstract void sendNotification(String email, String msgTxt,
			String subject, User user,String contentType) throws Exception;

	public abstract String getSmtpHost();

	public abstract int getSmtpPort();

	public abstract String getSmtpUser();

	public abstract String getSmtpPassword();

	public abstract String getSmtpSubject();

	public abstract String getSmtpFrom();

	public abstract boolean isSmtpTLS();

	public abstract boolean isUseSOCKSProxy();

	public abstract String getSocksProxyHost();

	public abstract String getLocalhost();

	public abstract int getSocksProxyPort();


	
	public abstract javax.jms.Connection getQueueConnection() throws ProvisioningException, JMSException;
	
	public abstract void returnQueueConnection(javax.jms.Connection con);
	
	public abstract boolean isInternalQueue();

	public abstract void initMessageConsumers() throws ProvisioningException;

	public abstract EncryptedMessage encryptObject(Object o) throws ProvisioningException;
	
	public abstract Object decryptObject(EncryptedMessage msg) throws ProvisioningException;

	public abstract void initScheduler() throws ProvisioningException;
	
	public abstract void initListeners() throws ProvisioningException;
	
	public void clearDLQ() throws ProvisioningException;
	
	public abstract SessionFactory getHibernateSessionFactory() throws ProvisioningException;
	
	public void rebuildHibernate();
	

}