package com.tinder.data.message;

import com.tinder.data.message.activityfeed.ActivityEventType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.b */
public final /* synthetic */ class C8692b {
    /* renamed from: a */
    public static final /* synthetic */ int[] f30645a = new int[ActivityEventType.values().length];

    static {
        f30645a[ActivityEventType.INSTAGRAM_NEW_MEDIA.ordinal()] = 1;
        f30645a[ActivityEventType.MATCH.ordinal()] = 2;
        f30645a[ActivityEventType.INSTAGRAM_CONNECT.ordinal()] = 3;
        f30645a[ActivityEventType.PROFILE_ADD_PHOTO.ordinal()] = 4;
        f30645a[ActivityEventType.PROFILE_ADD_LOOP.ordinal()] = 5;
        f30645a[ActivityEventType.PROFILE_SPOTIFY_TOP_ARTIST.ordinal()] = 6;
        f30645a[ActivityEventType.PROFILE_CHANGE_ANTHEM.ordinal()] = 7;
        f30645a[ActivityEventType.PROFILE_CHANGE_BIO.ordinal()] = 8;
        f30645a[ActivityEventType.PROFILE_CHANGE_WORK.ordinal()] = 9;
        f30645a[ActivityEventType.PROFILE_CHANGE_SCHOOL.ordinal()] = 10;
    }
}
