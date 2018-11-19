package com.tinder.domain.settings.feed.model;

import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0012J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/tinder/domain/settings/feed/model/FeedSettings;", "", "options", "", "Lcom/tinder/domain/settings/feed/model/FeedSharingOption;", "(Ljava/util/Set;)V", "enabled", "", "getEnabled", "()Z", "getOptions", "()Ljava/util/Set;", "component1", "copy", "equals", "other", "getOption", "feedSharingType", "Lcom/tinder/domain/settings/feed/model/FeedSharingType;", "getOptionOrNull", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class FeedSettings {
    @NotNull
    private final Set<FeedSharingOption> options;

    @NotNull
    public static /* synthetic */ FeedSettings copy$default(FeedSettings feedSettings, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            set = feedSettings.options;
        }
        return feedSettings.copy(set);
    }

    @NotNull
    public final Set<FeedSharingOption> component1() {
        return this.options;
    }

    @NotNull
    public final FeedSettings copy(@NotNull Set<FeedSharingOption> set) {
        C2668g.b(set, "options");
        return new FeedSettings(set);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedSettings) {
                if (C2668g.a(this.options, ((FeedSettings) obj).options)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Set set = this.options;
        return set != null ? set.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FeedSettings(options=");
        stringBuilder.append(this.options);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public FeedSettings(@NotNull Set<FeedSharingOption> set) {
        C2668g.b(set, "options");
        this.options = set;
    }

    @NotNull
    public final Set<FeedSharingOption> getOptions() {
        return this.options;
    }

    public final boolean getEnabled() {
        Iterable<FeedSharingOption> iterable = this.options;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (FeedSharingOption enabled : iterable) {
            if (enabled.getEnabled()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final FeedSharingOption getOption(@NotNull FeedSharingType feedSharingType) {
        C2668g.b(feedSharingType, "feedSharingType");
        for (FeedSharingOption feedSharingOption : this.options) {
            Object obj;
            if (feedSharingOption.getFeedSharingType() == feedSharingType) {
                obj = 1;
                continue;
            } else {
                obj = null;
                continue;
            }
            if (obj != null) {
                return feedSharingOption;
            }
        }
        throw ((Throwable) new NoSuchElementException("Collection contains no element matching the predicate."));
    }

    @Nullable
    public final FeedSharingOption getOptionOrNull(@NotNull FeedSharingType feedSharingType) {
        C2668g.b(feedSharingType, "feedSharingType");
        for (Object next : this.options) {
            Object obj;
            if (feedSharingType == ((FeedSharingOption) next).getFeedSharingType()) {
                obj = 1;
                continue;
            } else {
                obj = null;
                continue;
            }
            if (obj != null) {
                break;
            }
        }
        Object next2 = null;
        return (FeedSharingOption) next2;
    }
}
