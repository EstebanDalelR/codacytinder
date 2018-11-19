package com.snapchat.kit.sdk.bitmoji.ui.controller;

import android.support.annotation.NonNull;
import com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerView;

public interface FullScreenViewController extends Hideable {
    @NonNull
    BitmojiKitStickerPickerView getViewType();
}
