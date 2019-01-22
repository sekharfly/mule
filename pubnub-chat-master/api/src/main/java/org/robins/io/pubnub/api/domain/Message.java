package org.robins.io.pubnub.api.domain;

/**
 * ************************************************************************************
 * Author: sekhar v
 * *************************************************************************************
 */
public class Message {

	private String text;
	private String channel;
	private String name;
	private String accountId;
	private String integrationId;
	private String direction;
	private String source;
	private String timestamp;
	private String timestampUtc;
	public String fromId;
	public String fromName;

	public String getFromId() {
		return fromId;
	}

	public void setFromId(String fromId) {
		this.fromId = fromId;
	}

	public String getFromName() {
		return fromName;
	}

	public void setFromName(String fromName) {
		this.fromName = fromName;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getIntegrationId() {
		return integrationId;
	}

	public void setIntegrationId(String integrationId) {
		this.integrationId = integrationId;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getTimestampUtc() {
		return timestampUtc;
	}

	public void setTimestampUtc(String timestampUtc) {
		this.timestampUtc = timestampUtc;
	}
}
