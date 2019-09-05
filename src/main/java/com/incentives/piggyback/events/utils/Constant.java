package com.incentives.piggyback.events.utils;

public interface Constant {
	Integer SUCCESS_STATUS = 200;
	Integer FAILURE_STATUS = 101;

	String EVENT_SERVICE_LOCATION_SUBSCRIBER = "locationSubscriber";
	String EVENT_SERVICE_USER_SUBSCRIBER = "userSubscriber";
	String EVENT_SERVICE_PARTNER_SUBSCRIBER = "partnerSubscriber";
	String EVENT_SERVICE_OFFERS_SUBSCRIBER = "offersSubscriber";
	String EVENT_SERVICE_NOTIFICATION_SUBSCRIBER = "notificationSubscriber";

	String LOCATION_PUBLISHER_TOPIC = "locationEvents";
	String USER_PUBLISHER_TOPIC = "userEvents";
	String PARTNER_PUBLISHER_TOPIC = "partnerEvents";
	String OFFERS_PUBLISHER_TOPIC = "offersEvents";
	String NOTIFICATION_PUBLISHER_TOPIC = "notificationEvents";
}