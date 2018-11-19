package com.snapchat.kit.sdk.core.metrics.model;

import com.google.protobuf.MessageOrBuilder;

public interface BitmojiKitStickerPickerCloseOrBuilder extends MessageOrBuilder {
    BitmojiKitEventBase getBitmojiKitEventBase();

    BitmojiKitEventBaseOrBuilder getBitmojiKitEventBaseOrBuilder();

    long getStickerPickerSessionDurationMillis();

    boolean hasBitmojiKitEventBase();
}
