package com.snapchat.kit.sdk.bitmoji.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import org.apache.commons.lang3.builder.C17715c;

public class StickerPack implements Serializable {
    @SerializedName("color")
    @Expose
    private String mColor;
    @SerializedName("id")
    @Expose
    private String mId;
    @SerializedName("stickers")
    @Expose
    private List<Sticker> mStickers;
    @SerializedName("title")
    @Expose
    private String mTitle;
    @SerializedName("visible")
    @Expose
    private boolean mVisible;

    public String getId() {
        return this.mId;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public boolean isVisible() {
        return this.mVisible;
    }

    public String getColor() {
        return this.mColor;
    }

    public List<Sticker> getStickers() {
        return this.mStickers;
    }

    public StickerPack(String str, String str2, boolean z, List<Sticker> list) {
        this.mId = str;
        this.mTitle = str2;
        this.mVisible = z;
        this.mStickers = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StickerPack)) {
            return null;
        }
        StickerPack stickerPack = (StickerPack) obj;
        return new C17715c().a(this.mTitle, stickerPack.getTitle()).a(this.mStickers, stickerPack.getStickers()).a();
    }

    public int hashCode() {
        return this.mTitle.hashCode();
    }
}
