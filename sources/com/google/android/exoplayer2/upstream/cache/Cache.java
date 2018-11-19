package com.google.android.exoplayer2.upstream.cache;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.util.NavigableSet;
import java.util.Set;

public interface Cache {

    public static class CacheException extends IOException {
        public CacheException(String str) {
            super(str);
        }

        public CacheException(Throwable th) {
            super(th);
        }
    }

    public interface Listener {
        void onSpanAdded(Cache cache, C2280a c2280a);

        void onSpanRemoved(Cache cache, C2280a c2280a);

        void onSpanTouched(Cache cache, C2280a c2280a, C2280a c2280a2);
    }

    @NonNull
    NavigableSet<C2280a> addListener(String str, Listener listener);

    void applyContentMetadataMutations(String str, C2285f c2285f) throws CacheException;

    void commitFile(File file) throws CacheException;

    long getCacheSpace();

    long getCachedLength(String str, long j, long j2);

    @NonNull
    NavigableSet<C2280a> getCachedSpans(String str);

    long getContentLength(String str);

    ContentMetadata getContentMetadata(String str);

    Set<String> getKeys();

    boolean isCached(String str, long j, long j2);

    void release() throws CacheException;

    void releaseHoleSpan(C2280a c2280a);

    void removeListener(String str, Listener listener);

    void removeSpan(C2280a c2280a) throws CacheException;

    void setContentLength(String str, long j) throws CacheException;

    File startFile(String str, long j, long j2) throws CacheException;

    C2280a startReadWrite(String str, long j) throws InterruptedException, CacheException;

    @Nullable
    C2280a startReadWriteNonBlocking(String str, long j) throws CacheException;
}
