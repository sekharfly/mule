package org.robins.io.pubnub.api.domain;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FromSource {
	 
    @SerializedName("id")
    @Expose
    public String id;
 
    @SerializedName("name")
    @Expose
    public String name;
 
}