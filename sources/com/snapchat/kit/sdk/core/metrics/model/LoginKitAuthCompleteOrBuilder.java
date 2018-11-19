package com.snapchat.kit.sdk.core.metrics.model;

import com.google.protobuf.MessageOrBuilder;

public interface LoginKitAuthCompleteOrBuilder extends MessageOrBuilder {
    boolean getIsSuccess();

    LoginKitEventBase getLogKitEventBase();

    LoginKitEventBaseOrBuilder getLogKitEventBaseOrBuilder();

    boolean hasLogKitEventBase();
}
