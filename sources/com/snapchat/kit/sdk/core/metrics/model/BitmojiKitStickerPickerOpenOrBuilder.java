package com.snapchat.kit.sdk.core.metrics.model;

import com.google.protobuf.MessageOrBuilder;

public interface BitmojiKitStickerPickerOpenOrBuilder extends MessageOrBuilder {
    BitmojiKitEventBase getBitmojiKitEventBase();

    BitmojiKitEventBaseOrBuilder getBitmojiKitEventBaseOrBuilder();

    BitmojiKitStickerPickerView getStickerPickerView();

    int getStickerPickerViewValue();

    boolean hasBitmojiKitEventBase();
}
