package com.tinder.feed.view.model;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\r\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/feed/view/model/FeedViewModelWithPosition;", "", "activityFeedViewModel", "Lcom/tinder/feed/view/model/ActivityFeedViewModel;", "position", "", "(Lcom/tinder/feed/view/model/ActivityFeedViewModel;I)V", "getActivityFeedViewModel", "()Lcom/tinder/feed/view/model/ActivityFeedViewModel;", "getPosition", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.model.f */
public final class C9540f {
    @NotNull
    /* renamed from: a */
    private final ActivityFeedViewModel<?> f31918a;
    /* renamed from: b */
    private final int f31919b;

    @NotNull
    /* renamed from: c */
    public final ActivityFeedViewModel<?> m39812c() {
        return this.f31918a;
    }

    /* renamed from: d */
    public final int m39813d() {
        return this.f31919b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9540f) {
            C9540f c9540f = (C9540f) obj;
            if (C2668g.a(this.f31918a, c9540f.f31918a)) {
                if ((this.f31919b == c9540f.f31919b ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        ActivityFeedViewModel activityFeedViewModel = this.f31918a;
        return ((activityFeedViewModel != null ? activityFeedViewModel.hashCode() : 0) * 31) + this.f31919b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FeedViewModelWithPosition(activityFeedViewModel=");
        stringBuilder.append(this.f31918a);
        stringBuilder.append(", position=");
        stringBuilder.append(this.f31919b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C9540f(@NotNull ActivityFeedViewModel<?> activityFeedViewModel, int i) {
        C2668g.b(activityFeedViewModel, "activityFeedViewModel");
        this.f31918a = activityFeedViewModel;
        this.f31919b = i;
    }

    @NotNull
    /* renamed from: a */
    public final ActivityFeedViewModel<?> m39810a() {
        return this.f31918a;
    }

    /* renamed from: b */
    public final int m39811b() {
        return this.f31919b;
    }
}
