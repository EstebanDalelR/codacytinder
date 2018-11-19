package com.tinder.model;

public class FacebookPhoto {
    public String id;
    public String sourceUrl;
    public String thumbnailUrl;

    public FacebookPhoto(String str, String str2, String str3) {
        this.thumbnailUrl = str;
        this.id = str2;
        this.sourceUrl = str3;
    }
}
