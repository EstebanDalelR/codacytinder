package com.tinder.analytics.chat;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/tinder/analytics/chat/Origin;", "", "key", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;I)V", "getKey", "()Ljava/lang/String;", "getValue", "()I", "UNKNOWN", "MATCH_SCREEN", "MESSAGES", "NEW_MATCHES", "PROFILE", "IN_APP_NOTIFICATION", "PUSH_NOTIFICATION", "FEED", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public enum Origin {
    ;
    
    @NotNull
    private final String key;
    private final int value;

    protected Origin(String str, int i) {
        C2668g.b(str, "key");
        this.key = str;
        this.value = i;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public final int getValue() {
        return this.value;
    }
}
