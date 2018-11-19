package com.snapchat.kit.sdk.core.metrics.model;

import com.google.protobuf.MessageOrBuilder;

public interface LoginKitEventBaseOrBuilder extends MessageOrBuilder {
    KitEventBase getKitEventBase();

    KitEventBaseOrBuilder getKitEventBaseOrBuilder();

    boolean hasKitEventBase();
}
