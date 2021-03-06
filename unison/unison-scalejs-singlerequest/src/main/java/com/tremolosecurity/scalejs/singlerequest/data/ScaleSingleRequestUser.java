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
package com.tremolosecurity.scalejs.singlerequest.data;

import com.tremolosecurity.scalejs.singlerequest.cfg.ScaleSingleRequestConfig;

public class ScaleSingleRequestUser {
	ScaleSingleRequestConfig config;
	String displayName;
	String logoutURL;
	String homeURL;
	
	public ScaleSingleRequestUser() {
		
	}

	public ScaleSingleRequestConfig getConfig() {
		return config;
	}

	public void setConfig(ScaleSingleRequestConfig config) {
		this.config = config;
	}

	
	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getLogoutURL() {
		return logoutURL;
	}

	public void setLogoutURL(String logoutURL) {
		this.logoutURL = logoutURL;
	}

	public String getHomeURL() {
		return homeURL;
	}

	public void setHomeURL(String homeURL) {
		this.homeURL = homeURL;
	}
	
	
	
}
