package com.tinder.data.feed;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.data.feed.l */
public final /* synthetic */ class C8661l {
    /* renamed from: a */
    public static final /* synthetic */ int[] f30512a = new int[FeedEventBitMask.values().length];

    static {
        f30512a[FeedEventBitMask.BIT_NEW_MATCH.ordinal()] = 1;
        f30512a[FeedEventBitMask.BIT_PROFILE_ADD_PHOTO.ordinal()] = 2;
        f30512a[FeedEventBitMask.BIT_INSTAGRAM_NEW_MEDIA.ordinal()] = 3;
        f30512a[FeedEventBitMask.BIT_INSTAGRAM_CONNECT.ordinal()] = 4;
        f30512a[FeedEventBitMask.BIT_PROFILE_CHANGE_ANTHEM.ordinal()] = 5;
        f30512a[FeedEventBitMask.BIT_PROFILE_SPOTIFY_TOP_ARTIST.ordinal()] = 6;
        f30512a[FeedEventBitMask.BIT_PROFILE_CHANGE_BIO.ordinal()] = 7;
        f30512a[FeedEventBitMask.BIT_PROFILE_CHANGE_WORK.ordinal()] = 8;
        f30512a[FeedEventBitMask.BIT_PROFILE_CHANGE_SCHOOL.ordinal()] = 9;
        f30512a[FeedEventBitMask.BIT_PROFILE_ADD_LOOP.ordinal()] = 10;
    }
}
