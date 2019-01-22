package org.robins.io.pubnub.api.domain;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Agent {
	 
    @SerializedName("agent_id")
    @Expose
    public String agentId;
 
    @SerializedName("agent_name")
    @Expose
    public String agentName;
 
    @SerializedName("account_type")
    @Expose
    public String accountType;
 
    @SerializedName("tenant_id")
    @Expose
    public String tenantId;
 
}