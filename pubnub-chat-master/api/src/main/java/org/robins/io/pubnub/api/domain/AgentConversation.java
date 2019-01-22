package org.robins.io.pubnub.api.domain;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AgentConversation {
	 
    @SerializedName("source")
    @Expose
    public String source;
 
    @SerializedName("text")
    @Expose
    public String text;
 
    @SerializedName("parse_markdown")
    @Expose
    public boolean parseMarkdown;
 
    @SerializedName("has_attachment")
    @Expose
    public boolean hasAttachment;
 
    @SerializedName("from")
    @Expose
    public FromSource fromSource;
 
    @SerializedName("receipient")
    @Expose
    public ReceipentSource receipentSource;
}