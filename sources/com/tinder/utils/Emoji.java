package com.tinder.utils;

import android.text.Html;

public enum Emoji {
    COLLISION("&#x1F4A5"),
    VICTORY_HAND("&#x270C"),
    BALLOON("&#x1F388"),
    PARTY_POPPER("&#x1F389"),
    GRAPES("&#x1F347"),
    FIRE("&#x1F525"),
    PALM_TREE("&#x1F334");
    
    private final String mHtmlHex;

    private Emoji(String str) {
        this.mHtmlHex = str;
    }

    public String toString() {
        return Html.fromHtml(this.mHtmlHex).toString();
    }
}
