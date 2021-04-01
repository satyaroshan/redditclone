package com.reddit.redditclone;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("springit")
public class UserdefinedProperties {
	private String welMssg="Hello World!";

	public String getWelMssg() {
		return welMssg;
	}

	public void setWelMssg(String welMssg) {
		this.welMssg = welMssg;
	}
	

}
