package com.tinder.data.feed;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/tinder/data/feed/FeedEventBitMask;", "", "bitMask", "", "(Ljava/lang/String;IJ)V", "getBitMask", "()J", "BIT_NEW_MATCH", "BIT_PROFILE_ADD_PHOTO", "BIT_PROFILE_CHANGE_ANTHEM", "BIT_INSTAGRAM_NEW_MEDIA", "BIT_INSTAGRAM_CONNECT", "BIT_PROFILE_SPOTIFY_TOP_ARTIST", "BIT_PROFILE_CHANGE_BIO", "BIT_PROFILE_CHANGE_WORK", "BIT_PROFILE_CHANGE_SCHOOL", "BIT_PROFILE_ADD_LOOP", "data_release"}, k = 1, mv = {1, 1, 10})
public enum FeedEventBitMask {
    ;
    
    private final long bitMask;

    protected FeedEventBitMask(long j) {
        this.bitMask = j;
    }

    public final long getBitMask() {
        return this.bitMask;
    }
}
