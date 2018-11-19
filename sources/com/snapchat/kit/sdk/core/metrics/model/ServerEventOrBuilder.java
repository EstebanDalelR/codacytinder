package com.snapchat.kit.sdk.core.metrics.model;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface ServerEventOrBuilder extends MessageOrBuilder {
    String getAppBuild();

    ByteString getAppBuildBytes();

    String getAppVersion();

    ByteString getAppVersionBytes();

    String getCity();

    ByteString getCityBytes();

    String getCountry();

    ByteString getCountryBytes();

    ServerEventData getEventData();

    ServerEventDataOrBuilder getEventDataOrBuilder();

    String getEventId();

    ByteString getEventIdBytes();

    String getEventName();

    ByteString getEventNameBytes();

    String getInstanceId();

    ByteString getInstanceIdBytes();

    String getOsType();

    ByteString getOsTypeBytes();

    String getOsVersion();

    ByteString getOsVersionBytes();

    String getRegion();

    ByteString getRegionBytes();

    String getRequestId();

    ByteString getRequestIdBytes();

    long getSequenceId();

    double getServerTs();

    String getUserAgent();

    ByteString getUserAgentBytes();

    String getUserId();

    ByteString getUserIdBytes();

    boolean hasEventData();
}
