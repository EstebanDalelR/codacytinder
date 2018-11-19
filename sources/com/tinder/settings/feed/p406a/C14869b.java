package com.tinder.settings.feed.p406a;

import com.tinder.domain.settings.feed.model.FeedSharingType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.settings.feed.a.b */
public final /* synthetic */ class C14869b {
    /* renamed from: a */
    public static final /* synthetic */ int[] f46547a = new int[FeedSharingType.values().length];

    static {
        f46547a[FeedSharingType.INSTAGRAM.ordinal()] = 1;
        f46547a[FeedSharingType.SPOTIFY_TOP_ARTISTS.ordinal()] = 2;
        f46547a[FeedSharingType.SPOTIFY_ANTHEM.ordinal()] = 3;
        f46547a[FeedSharingType.PROFILE_PHOTOS.ordinal()] = 4;
    }
}
