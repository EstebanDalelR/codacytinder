package com.tinder.feed.analytics;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/tinder/feed/analytics/ActivityType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "INSTAGRAM_POST", "CONNECT_INSTAGRAM", "NEW_MATCH", "NEW_PROFILE_PHOTO", "NEW_TOP_SPOTIFY_ARTIST", "NEW_ANTHEM", "NEW_PROFILE_LOOP", "NEW_PROFILE_BIO", "NEW_PROFILE_WORK", "NEW_PROFILE_SCHOOL", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public enum ActivityType {
    ;
    
    @NotNull
    private final String value;

    protected ActivityType(String str) {
        C2668g.b(str, "value");
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
