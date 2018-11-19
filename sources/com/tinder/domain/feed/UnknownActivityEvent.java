package com.tinder.domain.feed;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/domain/feed/UnknownActivityEvent;", "Lcom/tinder/domain/feed/ActivityEvent;", "()V", "timestamp", "", "getTimestamp", "()J", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class UnknownActivityEvent extends ActivityEvent {
    public static final UnknownActivityEvent INSTANCE = new UnknownActivityEvent();
    private static final long timestamp = -1;

    private UnknownActivityEvent() {
        super();
    }

    public long getTimestamp() {
        return timestamp;
    }
}
