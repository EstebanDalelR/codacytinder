package com.snapchat.kit.sdk.core.metrics.model;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface BitmojiKitShareOrBuilder extends MessageOrBuilder {
    BitmojiKitEventBase getBitmojiKitEventBase();

    BitmojiKitEventBaseOrBuilder getBitmojiKitEventBaseOrBuilder();

    BitmojiKitSearchCategory getSearchCategory();

    int getSearchCategoryValue();

    String getSearchTerm();

    ByteString getSearchTermBytes();

    BitmojiKitShareCategory getShareCategory();

    int getShareCategoryValue();

    String getStickerId();

    ByteString getStickerIdBytes();

    String getSubjectUserIds(int i);

    ByteString getSubjectUserIdsBytes(int i);

    int getSubjectUserIdsCount();

    List<String> getSubjectUserIdsList();

    boolean hasBitmojiKitEventBase();
}
