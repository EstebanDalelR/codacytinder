package com.snapchat.kit.sdk.core.metrics.model;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface BitmojiKitSearchTermOrBuilder extends MessageOrBuilder {
    BitmojiKitSearchCategory getCategory();

    int getCategoryValue();

    String getValue();

    ByteString getValueBytes();
}
