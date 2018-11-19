package com.tinder.model;

public class FacebookAlbum {
    public int count;
    public String id;
    public String name;
    public String thumbnailId;
    public String thumbnailUrl;

    public FacebookAlbum(String str, String str2, String str3, String str4, int i) {
        this.id = str;
        this.name = str2;
        this.thumbnailId = str3;
        this.thumbnailUrl = str4;
        this.count = i;
    }
}
