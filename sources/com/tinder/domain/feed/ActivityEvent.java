package com.tinder.domain.feed;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0001\u000b\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/tinder/domain/feed/ActivityEvent;", "", "()V", "timestamp", "", "getTimestamp", "()J", "Lcom/tinder/domain/feed/InstagramNewMedia;", "Lcom/tinder/domain/feed/ProfileSpotifyTopArtist;", "Lcom/tinder/domain/feed/ProfileAddPhoto;", "Lcom/tinder/domain/feed/InstagramConnect;", "Lcom/tinder/domain/feed/ProfileChangeAnthem;", "Lcom/tinder/domain/feed/ActivityEventNewMatch;", "Lcom/tinder/domain/feed/ProfileAddLoop;", "Lcom/tinder/domain/feed/ProfileChangeBio;", "Lcom/tinder/domain/feed/ProfileChangeWork;", "Lcom/tinder/domain/feed/ProfileChangeSchool;", "Lcom/tinder/domain/feed/UnknownActivityEvent;", "domain_release"}, k = 1, mv = {1, 1, 10})
public abstract class ActivityEvent {
    public abstract long getTimestamp();

    private ActivityEvent() {
    }
}
