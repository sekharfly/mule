package org.robins.io.pubnub.api.domain;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class AgentMessage {
 
    @SerializedName("agent")
    @Expose
    public Agent agent;
 
    @SerializedName("integration")
    @Expose
    public Integration integration;
 
    @SerializedName("session_id")
    @Expose
    public String sessionId;
 
    @SerializedName("direction")
    @Expose
    public String direction;
 
    @SerializedName("timestamp")
    @Expose
    public long timestamp;
 
    @SerializedName("timestamp_utc")
    @Expose
    public String timestampUtc;
 
    @SerializedName("conversation")
    @Expose
    public AgentConversation agentConversation;
 
}
 