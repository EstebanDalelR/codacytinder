package com.snapchat.kit.sdk.bitmoji.models;

public class TagTile {
    private final int mColor;
    private final String mTag;

    public TagTile(String str, int i) {
        this.mTag = str;
        this.mColor = i;
    }

    public String getTag() {
        return this.mTag;
    }

    public int getColor() {
        return this.mColor;
    }
}
