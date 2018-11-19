package com.tinder.recs.analytics.dedupe;

import android.util.LruCache;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0002\u0010\u000bR\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/recs/analytics/dedupe/DuplicateEventsChecker;", "T", "", "eventsCacheSize", "", "(I)V", "lruCache", "Landroid/util/LruCache;", "", "isDuplicate", "request", "(Ljava/lang/Object;)Z", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public abstract class DuplicateEventsChecker<T> {
    private final LruCache<T, Boolean> lruCache;

    public DuplicateEventsChecker() {
        this(0, 1, null);
    }

    public DuplicateEventsChecker(int i) {
        this.lruCache = new LruCache(i);
    }

    public /* synthetic */ DuplicateEventsChecker(int i, int i2, C15823e c15823e) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        this(i);
    }

    public final boolean isDuplicate(T t) {
        boolean z = this.lruCache.get(t) != null;
        if (!z) {
            this.lruCache.put(t, Boolean.valueOf(true));
        }
        return z;
    }
}
