package org.robins.io.pubnub.api.domain;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Integration {
	 
    @SerializedName("type")
    @Expose
    public String type;
    
    @SerializedName("source")
    @Expose
    public String source;
    
    @SerializedName("channel")
    @Expose
    public String channel;
    
    @SerializedName("channel_id")
    @Expose
    public String channelId;
 
}