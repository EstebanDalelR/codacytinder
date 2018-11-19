package com.snapchat.kit.sdk.core.metrics.model;

import com.google.protobuf.MessageOrBuilder;

public interface LoginKitAuthStartOrBuilder extends MessageOrBuilder {
    LoginKitEventBase getLogKitEventBase();

    LoginKitEventBaseOrBuilder getLogKitEventBaseOrBuilder();

    boolean hasLogKitEventBase();
}
