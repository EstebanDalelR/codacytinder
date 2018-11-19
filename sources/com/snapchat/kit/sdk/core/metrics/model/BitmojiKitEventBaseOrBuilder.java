package com.snapchat.kit.sdk.core.metrics.model;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface BitmojiKitEventBaseOrBuilder extends MessageOrBuilder {
    KitEventBase getKitEventBase();

    KitEventBaseOrBuilder getKitEventBaseOrBuilder();

    String getStickerPickerSessionId();

    ByteString getStickerPickerSessionIdBytes();

    boolean hasKitEventBase();
}
