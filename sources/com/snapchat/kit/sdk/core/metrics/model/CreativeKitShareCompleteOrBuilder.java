package com.snapchat.kit.sdk.core.metrics.model;

import com.google.protobuf.MessageOrBuilder;

public interface CreativeKitShareCompleteOrBuilder extends MessageOrBuilder {
    CreativeKitEventBase getCreativeKitEventBase();

    CreativeKitEventBaseOrBuilder getCreativeKitEventBaseOrBuilder();

    boolean getIsSuccess();

    boolean hasCreativeKitEventBase();
}
