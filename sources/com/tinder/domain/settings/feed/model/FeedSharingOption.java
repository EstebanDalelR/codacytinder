package com.tinder.domain.settings.feed.model;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/domain/settings/feed/model/FeedSharingOption;", "", "feedSharingType", "Lcom/tinder/domain/settings/feed/model/FeedSharingType;", "enabled", "", "(Lcom/tinder/domain/settings/feed/model/FeedSharingType;Z)V", "getEnabled", "()Z", "getFeedSharingType", "()Lcom/tinder/domain/settings/feed/model/FeedSharingType;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class FeedSharingOption {
    private final boolean enabled;
    @NotNull
    private final FeedSharingType feedSharingType;

    @NotNull
    public static /* synthetic */ FeedSharingOption copy$default(FeedSharingOption feedSharingOption, FeedSharingType feedSharingType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            feedSharingType = feedSharingOption.feedSharingType;
        }
        if ((i & 2) != 0) {
            z = feedSharingOption.enabled;
        }
        return feedSharingOption.copy(feedSharingType, z);
    }

    @NotNull
    public final FeedSharingType component1() {
        return this.feedSharingType;
    }

    public final boolean component2() {
        return this.enabled;
    }

    @NotNull
    public final FeedSharingOption copy(@NotNull FeedSharingType feedSharingType, boolean z) {
        C2668g.b(feedSharingType, "feedSharingType");
        return new FeedSharingOption(feedSharingType, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FeedSharingOption) {
            FeedSharingOption feedSharingOption = (FeedSharingOption) obj;
            if (C2668g.a(this.feedSharingType, feedSharingOption.feedSharingType)) {
                if ((this.enabled == feedSharingOption.enabled ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        FeedSharingType feedSharingType = this.feedSharingType;
        int hashCode = (feedSharingType != null ? feedSharingType.hashCode() : 0) * 31;
        int i = this.enabled;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FeedSharingOption(feedSharingType=");
        stringBuilder.append(this.feedSharingType);
        stringBuilder.append(", enabled=");
        stringBuilder.append(this.enabled);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public FeedSharingOption(@NotNull FeedSharingType feedSharingType, boolean z) {
        C2668g.b(feedSharingType, "feedSharingType");
        this.feedSharingType = feedSharingType;
        this.enabled = z;
    }

    @NotNull
    public final FeedSharingType getFeedSharingType() {
        return this.feedSharingType;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }
}
