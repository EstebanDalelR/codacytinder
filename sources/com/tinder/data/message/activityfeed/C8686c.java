package com.tinder.data.message.activityfeed;

import com.tinder.domain.feed.ActivityEvent;
import com.tinder.domain.feed.ActivityEventNewMatch;
import com.tinder.domain.feed.InstagramConnect;
import com.tinder.domain.feed.InstagramNewMedia;
import com.tinder.domain.feed.ProfileAddLoop;
import com.tinder.domain.feed.ProfileAddPhoto;
import com.tinder.domain.feed.ProfileChangeAnthem;
import com.tinder.domain.feed.ProfileChangeBio;
import com.tinder.domain.feed.ProfileChangeSchool;
import com.tinder.domain.feed.ProfileChangeWork;
import com.tinder.domain.feed.ProfileSpotifyTopArtist;
import com.tinder.domain.feed.UnknownActivityEvent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"type", "Lcom/tinder/data/message/activityfeed/ActivityEventType;", "Lcom/tinder/domain/feed/ActivityEvent;", "getType", "(Lcom/tinder/domain/feed/ActivityEvent;)Lcom/tinder/data/message/activityfeed/ActivityEventType;", "data_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.activityfeed.c */
public final class C8686c {
    /* renamed from: b */
    private static final ActivityEventType m37042b(@NotNull ActivityEvent activityEvent) {
        if (activityEvent instanceof InstagramNewMedia) {
            return ActivityEventType.INSTAGRAM_NEW_MEDIA;
        }
        if (activityEvent instanceof ActivityEventNewMatch) {
            return ActivityEventType.MATCH;
        }
        if (activityEvent instanceof InstagramConnect) {
            return ActivityEventType.INSTAGRAM_CONNECT;
        }
        if (activityEvent instanceof ProfileAddPhoto) {
            return ActivityEventType.PROFILE_ADD_PHOTO;
        }
        if (activityEvent instanceof ProfileSpotifyTopArtist) {
            return ActivityEventType.PROFILE_SPOTIFY_TOP_ARTIST;
        }
        if (activityEvent instanceof ProfileChangeAnthem) {
            return ActivityEventType.PROFILE_CHANGE_ANTHEM;
        }
        if (activityEvent instanceof ProfileAddLoop) {
            return ActivityEventType.PROFILE_ADD_LOOP;
        }
        if (activityEvent instanceof ProfileChangeBio) {
            return ActivityEventType.PROFILE_CHANGE_BIO;
        }
        if (activityEvent instanceof ProfileChangeWork) {
            return ActivityEventType.PROFILE_CHANGE_WORK;
        }
        if (activityEvent instanceof ProfileChangeSchool) {
            return ActivityEventType.PROFILE_CHANGE_SCHOOL;
        }
        if (C2668g.a(activityEvent, UnknownActivityEvent.INSTANCE) != null) {
            throw ((Throwable) new IllegalStateException("No ActivityEventType defined for UnknownActivityEvent"));
        }
        throw new NoWhenBranchMatchedException();
    }
}
