package com.snapchat.kit.sdk.core.metrics.model;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface KitEventBaseOrBuilder extends MessageOrBuilder {
    String getIpAddress();

    ByteString getIpAddressBytes();

    long getKitClientTimestampMillis();

    String getKitUserAgent();

    ByteString getKitUserAgentBytes();

    KitType getKitVariant();

    int getKitVariantValue();

    String getKitVariantVersion();

    ByteString getKitVariantVersionBytes();

    String getLocale();

    ByteString getLocaleBytes();

    String getOauthClientId();

    ByteString getOauthClientIdBytes();

    String getOsMinorVersion();

    ByteString getOsMinorVersionBytes();
}
