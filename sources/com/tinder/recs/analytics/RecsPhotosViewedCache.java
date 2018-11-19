package com.tinder.recs.analytics;

import android.util.LruCache;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0013\u0014\u0015\u0016\u0017B+\u0012\u0016\u0010\u0002\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\u0010\tJ\u0014\u0010\n\u001a\u00020\u00062\n\u0010\u000b\u001a\u00060\u0004j\u0002`\u0005H\u0002J$\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\u0010\u000b\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u001c\u0010\u0012\u001a\u00020\u000f2\n\u0010\u000b\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0007R\u001e\u0010\u0002\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/tinder/recs/analytics/RecsPhotosViewedCache;", "", "lruCache", "Lcom/tinder/recs/analytics/RecsPhotosViewedCache$RecyclerLruCache;", "", "Lcom/tinder/recs/analytics/RecId;", "Lcom/tinder/recs/analytics/RecsPhotosViewedCache$PhotosViewed;", "recycler", "Lcom/tinder/recs/analytics/RecsPhotosViewedCache$Recycler;", "(Lcom/tinder/recs/analytics/RecsPhotosViewedCache$RecyclerLruCache;Lcom/tinder/recs/analytics/RecsPhotosViewedCache$Recycler;)V", "getPhotoViewed", "recId", "notifyPhotoViewed", "", "position", "", "source", "Lcom/tinder/recs/analytics/RecsPhotoSource;", "uniquePhotosViewed", "PhotosViewed", "RecyclableItem", "RecyclableItemFactory", "Recycler", "RecyclerLruCache", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RecsPhotosViewedCache {
    private final RecyclerLruCache<String, PhotosViewed> lruCache;
    private final Recycler<PhotosViewed> recycler;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/tinder/recs/analytics/RecsPhotosViewedCache$RecyclableItem;", "", "clear", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public interface RecyclableItem {
        void clear();
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/recs/analytics/RecsPhotosViewedCache$RecyclableItemFactory;", "V", "", "create", "size", "", "(I)Ljava/lang/Object;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public interface RecyclableItemFactory<V> {
        V create(int i);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B3\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0002\u0010\u000bJ\u000b\u0010\f\u001a\u00028\u0000¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u000fH\u0002R\u000e\u0010\b\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/recs/analytics/RecsPhotosViewedCache$Recycler;", "V", "Lcom/tinder/recs/analytics/RecsPhotosViewedCache$RecyclableItem;", "", "poolMaxSize", "", "recyclableItemFactory", "Lcom/tinder/recs/analytics/RecsPhotosViewedCache$RecyclableItemFactory;", "maxPhotoCountForRec", "recyclerPool", "Ljava/util/Queue;", "(ILcom/tinder/recs/analytics/RecsPhotosViewedCache$RecyclableItemFactory;ILjava/util/Queue;)V", "get", "()Lcom/tinder/recs/analytics/RecsPhotosViewedCache$RecyclableItem;", "recycle", "", "value", "(Lcom/tinder/recs/analytics/RecsPhotosViewedCache$RecyclableItem;)V", "trim", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class Recycler<V extends RecyclableItem> {
        private final int maxPhotoCountForRec;
        private final int poolMaxSize;
        private final RecyclableItemFactory<V> recyclableItemFactory;
        private final Queue<V> recyclerPool;

        public Recycler(int i, @NotNull RecyclableItemFactory<? extends V> recyclableItemFactory, int i2, @NotNull Queue<V> queue) {
            C2668g.b(recyclableItemFactory, "recyclableItemFactory");
            C2668g.b(queue, "recyclerPool");
            this.poolMaxSize = i;
            this.recyclableItemFactory = recyclableItemFactory;
            this.maxPhotoCountForRec = i2;
            this.recyclerPool = queue;
        }

        public /* synthetic */ Recycler(int i, RecyclableItemFactory recyclableItemFactory, int i2, Queue queue, int i3, C15823e c15823e) {
            if ((i3 & 8) != 0) {
                queue = new LinkedList();
            }
            this(i, recyclableItemFactory, i2, queue);
        }

        public final void recycle(@NotNull V v) {
            C2668g.b(v, "value");
            v.clear();
            this.recyclerPool.add(v);
            trim();
        }

        @NotNull
        public final V get() {
            RecyclableItem recyclableItem = (RecyclableItem) this.recyclerPool.poll();
            if (recyclableItem != null) {
                return recyclableItem;
            }
            return (RecyclableItem) this.recyclableItemFactory.create(this.maxPhotoCountForRec);
        }

        private final void trim() {
            while (this.recyclerPool.size() > this.poolMaxSize) {
                this.recyclerPool.poll();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0002\u0010\tJ3\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00018\u00002\b\u0010\u000f\u001a\u0004\u0018\u00018\u00012\b\u0010\u0010\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0002\u0010\u0011R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/recs/analytics/RecsPhotosViewedCache$RecyclerLruCache;", "K", "V", "Lcom/tinder/recs/analytics/RecsPhotosViewedCache$RecyclableItem;", "Landroid/util/LruCache;", "cacheSize", "", "recycler", "Lcom/tinder/recs/analytics/RecsPhotosViewedCache$Recycler;", "(ILcom/tinder/recs/analytics/RecsPhotosViewedCache$Recycler;)V", "entryRemoved", "", "evicted", "", "key", "oldValue", "newValue", "(ZLjava/lang/Object;Lcom/tinder/recs/analytics/RecsPhotosViewedCache$RecyclableItem;Lcom/tinder/recs/analytics/RecsPhotosViewedCache$RecyclableItem;)V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class RecyclerLruCache<K, V extends RecyclableItem> extends LruCache<K, V> {
        private final Recycler<V> recycler;

        public RecyclerLruCache(int i, @NotNull Recycler<V> recycler) {
            C2668g.b(recycler, "recycler");
            super(i);
            this.recycler = recycler;
        }

        protected void entryRemoved(boolean z, @Nullable K k, @Nullable V v, @Nullable V v2) {
            super.entryRemoved(z, k, v, v2);
            if (z && v != null) {
                this.recycler.recycle(v);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B5\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0019\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÂ\u0003J\u0019\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÂ\u0003J=\u0010\f\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0004J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0002\u001a\u00020\u0004R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/tinder/recs/analytics/RecsPhotosViewedCache$PhotosViewed;", "Lcom/tinder/recs/analytics/RecsPhotosViewedCache$RecyclableItem;", "uniqueProfilePhotosViewed", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "uniqueCardPhotosViewed", "(Ljava/util/HashSet;Ljava/util/HashSet;)V", "clear", "", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "setPhotoViewedCard", "position", "setPhotoViewedProfile", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class PhotosViewed implements RecyclableItem {
        private final HashSet<Integer> uniqueCardPhotosViewed;
        private final HashSet<Integer> uniqueProfilePhotosViewed;

        private final HashSet<Integer> component1() {
            return this.uniqueProfilePhotosViewed;
        }

        private final HashSet<Integer> component2() {
            return this.uniqueCardPhotosViewed;
        }

        @NotNull
        public static /* synthetic */ PhotosViewed copy$default(PhotosViewed photosViewed, HashSet hashSet, HashSet hashSet2, int i, Object obj) {
            if ((i & 1) != 0) {
                hashSet = photosViewed.uniqueProfilePhotosViewed;
            }
            if ((i & 2) != 0) {
                hashSet2 = photosViewed.uniqueCardPhotosViewed;
            }
            return photosViewed.copy(hashSet, hashSet2);
        }

        @NotNull
        public final PhotosViewed copy(@NotNull HashSet<Integer> hashSet, @NotNull HashSet<Integer> hashSet2) {
            C2668g.b(hashSet, "uniqueProfilePhotosViewed");
            C2668g.b(hashSet2, "uniqueCardPhotosViewed");
            return new PhotosViewed(hashSet, hashSet2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof PhotosViewed) {
                    PhotosViewed photosViewed = (PhotosViewed) obj;
                    if (C2668g.a(this.uniqueProfilePhotosViewed, photosViewed.uniqueProfilePhotosViewed) && C2668g.a(this.uniqueCardPhotosViewed, photosViewed.uniqueCardPhotosViewed)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            HashSet hashSet = this.uniqueProfilePhotosViewed;
            int i = 0;
            int hashCode = (hashSet != null ? hashSet.hashCode() : 0) * 31;
            HashSet hashSet2 = this.uniqueCardPhotosViewed;
            if (hashSet2 != null) {
                i = hashSet2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("PhotosViewed(uniqueProfilePhotosViewed=");
            stringBuilder.append(this.uniqueProfilePhotosViewed);
            stringBuilder.append(", uniqueCardPhotosViewed=");
            stringBuilder.append(this.uniqueCardPhotosViewed);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public PhotosViewed(@NotNull HashSet<Integer> hashSet, @NotNull HashSet<Integer> hashSet2) {
            C2668g.b(hashSet, "uniqueProfilePhotosViewed");
            C2668g.b(hashSet2, "uniqueCardPhotosViewed");
            this.uniqueProfilePhotosViewed = hashSet;
            this.uniqueCardPhotosViewed = hashSet2;
        }

        public final int uniqueProfilePhotosViewed() {
            return this.uniqueProfilePhotosViewed.size();
        }

        public final int uniqueCardPhotosViewed() {
            return this.uniqueCardPhotosViewed.size();
        }

        public final void setPhotoViewedProfile(int i) {
            this.uniqueProfilePhotosViewed.add(Integer.valueOf(i));
        }

        public final void setPhotoViewedCard(int i) {
            this.uniqueCardPhotosViewed.add(Integer.valueOf(i));
        }

        public void clear() {
            this.uniqueCardPhotosViewed.clear();
            this.uniqueProfilePhotosViewed.clear();
        }
    }

    public RecsPhotosViewedCache(@NotNull RecyclerLruCache<String, PhotosViewed> recyclerLruCache, @NotNull Recycler<PhotosViewed> recycler) {
        C2668g.b(recyclerLruCache, "lruCache");
        C2668g.b(recycler, "recycler");
        this.lruCache = recyclerLruCache;
        this.recycler = recycler;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int uniquePhotosViewed(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull com.tinder.recs.analytics.RecsPhotoSource r3) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = "recId";
        kotlin.jvm.internal.C2668g.b(r2, r0);	 Catch:{ all -> 0x0035 }
        r0 = "source";
        kotlin.jvm.internal.C2668g.b(r3, r0);	 Catch:{ all -> 0x0035 }
        r0 = r1.lruCache;	 Catch:{ all -> 0x0035 }
        r2 = r0.get(r2);	 Catch:{ all -> 0x0035 }
        r2 = (com.tinder.recs.analytics.RecsPhotosViewedCache.PhotosViewed) r2;	 Catch:{ all -> 0x0035 }
        if (r2 == 0) goto L_0x0032;
    L_0x0015:
        r0 = com.tinder.recs.analytics.RecsPhotosViewedCache.WhenMappings.$EnumSwitchMapping$0;	 Catch:{ all -> 0x0035 }
        r3 = r3.ordinal();	 Catch:{ all -> 0x0035 }
        r3 = r0[r3];	 Catch:{ all -> 0x0035 }
        switch(r3) {
            case 1: goto L_0x0028;
            case 2: goto L_0x0023;
            default: goto L_0x0020;
        };	 Catch:{ all -> 0x0035 }
    L_0x0020:
        r2 = new kotlin.NoWhenBranchMatchedException;	 Catch:{ all -> 0x0035 }
        goto L_0x002e;
    L_0x0023:
        r2 = r2.uniqueProfilePhotosViewed();	 Catch:{ all -> 0x0035 }
        goto L_0x002c;
    L_0x0028:
        r2 = r2.uniqueCardPhotosViewed();	 Catch:{ all -> 0x0035 }
    L_0x002c:
        monitor-exit(r1);
        return r2;
    L_0x002e:
        r2.<init>();	 Catch:{ all -> 0x0035 }
        throw r2;	 Catch:{ all -> 0x0035 }
    L_0x0032:
        r2 = 0;
        monitor-exit(r1);
        return r2;
    L_0x0035:
        r2 = move-exception;
        monitor-exit(r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.recs.analytics.RecsPhotosViewedCache.uniquePhotosViewed(java.lang.String, com.tinder.recs.analytics.RecsPhotoSource):int");
    }

    public final synchronized void notifyPhotoViewed(int i, @NotNull String str, @NotNull RecsPhotoSource recsPhotoSource) {
        C2668g.b(str, "recId");
        C2668g.b(recsPhotoSource, "source");
        str = getPhotoViewed(str);
        switch (recsPhotoSource) {
            case CARD:
                str.setPhotoViewedCard(i);
                break;
            case PROFILE:
                str.setPhotoViewedProfile(i);
                break;
            default:
                break;
        }
    }

    private final PhotosViewed getPhotoViewed(String str) {
        PhotosViewed photosViewed = (PhotosViewed) this.lruCache.get(str);
        if (photosViewed != null) {
            return photosViewed;
        }
        photosViewed = (PhotosViewed) this.recycler.get();
        this.lruCache.put(str, photosViewed);
        return photosViewed;
    }
}
