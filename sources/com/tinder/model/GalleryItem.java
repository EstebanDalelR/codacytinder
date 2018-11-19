package com.tinder.model;

public class GalleryItem {
    public int count;
    public String filePath;
    public String name;
    public Source source;
    public String url;

    public enum Source {
        Device,
        Facebook
    }
}
