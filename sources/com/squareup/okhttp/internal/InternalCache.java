package com.squareup.okhttp.internal;

import com.squareup.okhttp.C6071q;
import com.squareup.okhttp.C6075s;
import com.squareup.okhttp.internal.http.C6044b;
import com.squareup.okhttp.internal.http.CacheRequest;
import java.io.IOException;

public interface InternalCache {
    C6075s get(C6071q c6071q) throws IOException;

    CacheRequest put(C6075s c6075s) throws IOException;

    void remove(C6071q c6071q) throws IOException;

    void trackConditionalCacheHit();

    void trackResponse(C6044b c6044b);

    void update(C6075s c6075s, C6075s c6075s2) throws IOException;
}
