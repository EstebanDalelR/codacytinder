package com.snapchat.kit.sdk.core.metrics.model;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface BitmojiKitSearchOrBuilder extends MessageOrBuilder {
    BitmojiKitEventBase getBitmojiKitEventBase();

    BitmojiKitEventBaseOrBuilder getBitmojiKitEventBaseOrBuilder();

    BitmojiKitSearchTerm getSearchTerms(int i);

    int getSearchTermsCount();

    List<BitmojiKitSearchTerm> getSearchTermsList();

    BitmojiKitSearchTermOrBuilder getSearchTermsOrBuilder(int i);

    List<? extends BitmojiKitSearchTermOrBuilder> getSearchTermsOrBuilderList();

    boolean hasBitmojiKitEventBase();
}
