package com.snapchat.kit.sdk.core.metrics.model;

import com.google.protobuf.MessageOrBuilder;
import com.snapchat.kit.sdk.core.metrics.model.ServerEventData.EventTypeCase;

public interface ServerEventDataOrBuilder extends MessageOrBuilder {
    BitmojiKitCreateAvatarTap getBitmojiKitCreateAvatarTap();

    BitmojiKitCreateAvatarTapOrBuilder getBitmojiKitCreateAvatarTapOrBuilder();

    BitmojiKitSearch getBitmojiKitSearch();

    BitmojiKitSearchOrBuilder getBitmojiKitSearchOrBuilder();

    BitmojiKitShare getBitmojiKitShare();

    BitmojiKitShareOrBuilder getBitmojiKitShareOrBuilder();

    BitmojiKitSnapchatLinkSuccess getBitmojiKitSnapchatLinkSuccess();

    BitmojiKitSnapchatLinkSuccessOrBuilder getBitmojiKitSnapchatLinkSuccessOrBuilder();

    BitmojiKitSnapchatLinkTap getBitmojiKitSnapchatLinkTap();

    BitmojiKitSnapchatLinkTapOrBuilder getBitmojiKitSnapchatLinkTapOrBuilder();

    BitmojiKitStickerPickerClose getBitmojiKitStickerPickerClose();

    BitmojiKitStickerPickerCloseOrBuilder getBitmojiKitStickerPickerCloseOrBuilder();

    BitmojiKitStickerPickerOpen getBitmojiKitStickerPickerOpen();

    BitmojiKitStickerPickerOpenOrBuilder getBitmojiKitStickerPickerOpenOrBuilder();

    CreativeKitShareComplete getCreativeKitShareComplete();

    CreativeKitShareCompleteOrBuilder getCreativeKitShareCompleteOrBuilder();

    CreativeKitShareStart getCreativeKitShareStart();

    CreativeKitShareStartOrBuilder getCreativeKitShareStartOrBuilder();

    EventTypeCase getEventTypeCase();

    LoginKitAuthComplete getLoginKitAuthComplete();

    LoginKitAuthCompleteOrBuilder getLoginKitAuthCompleteOrBuilder();

    LoginKitAuthStart getLoginKitAuthStart();

    LoginKitAuthStartOrBuilder getLoginKitAuthStartOrBuilder();

    boolean hasBitmojiKitCreateAvatarTap();

    boolean hasBitmojiKitSearch();

    boolean hasBitmojiKitShare();

    boolean hasBitmojiKitSnapchatLinkSuccess();

    boolean hasBitmojiKitSnapchatLinkTap();

    boolean hasBitmojiKitStickerPickerClose();

    boolean hasBitmojiKitStickerPickerOpen();

    boolean hasCreativeKitShareComplete();

    boolean hasCreativeKitShareStart();

    boolean hasLoginKitAuthComplete();

    boolean hasLoginKitAuthStart();
}
