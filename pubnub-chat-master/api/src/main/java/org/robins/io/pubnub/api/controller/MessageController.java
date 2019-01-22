package org.robins.io.pubnub.api.controller;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.pubnub.api.PNConfiguration;
import com.pubnub.api.PubNub;
import com.pubnub.api.callbacks.PNCallback;
import com.pubnub.api.models.consumer.PNPublishResult;
import com.pubnub.api.models.consumer.PNStatus;

/**
 * ************************************************************************************
 * Author: sekhar v
 * *************************************************************************************
 */

@Controller
@EnableAutoConfiguration
@ComponentScan(basePackages = { "org.robins.io.pubnub.api.web" })

public class MessageController {

	public static Type mapType = new TypeToken<Map<String, Object>>() {
	}.getType();

	@RequestMapping(value = "/publish", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> pubnubPublish(@RequestBody String body) {
		Optional<String> opResponse = Optional.empty();

		PNConfiguration pnConfiguration = new PNConfiguration();
		pnConfiguration.setSubscribeKey("sub-c-93ac4a0a-f45a-11e8-86f0-9a6b1c0db2e9");
		pnConfiguration.setPublishKey("pub-c-69086909-bf0e-4bdc-9e43-5983164334b9");
		pnConfiguration.setSecure(false);

		PubNub pubnub = new PubNub(pnConfiguration);

		Gson gson = new Gson();

		Object object = gson.fromJson(body, mapType);

		pubnub.publish().message(object).channel("my_channel").async(new PNCallback<PNPublishResult>() {
			@Override
			public void onResponse(PNPublishResult result, PNStatus status) {
			}
		});

		String response = opResponse.orElse("");
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@RequestMapping(value = "/comman", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> comman(@RequestBody String json) {
		return new ResponseEntity<String>(json, HttpStatus.OK);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(MessageController.class, args);
	}
}
