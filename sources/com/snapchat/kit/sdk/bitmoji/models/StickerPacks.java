package com.snapchat.kit.sdk.bitmoji.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

public class StickerPacks implements Serializable {
    @SerializedName("packs")
    @Expose
    private List<StickerPack> mStickerPacks;

    public List<StickerPack> get() {
        return this.mStickerPacks;
    }
}
