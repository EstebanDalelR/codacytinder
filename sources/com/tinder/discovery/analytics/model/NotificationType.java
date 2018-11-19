package com.tinder.discovery.analytics.model;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/tinder/discovery/analytics/model/NotificationType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "BADGE", "TOOLTIP", "discovery_release"}, k = 1, mv = {1, 1, 10})
public enum NotificationType {
    ;
    
    private final int value;

    protected NotificationType(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
