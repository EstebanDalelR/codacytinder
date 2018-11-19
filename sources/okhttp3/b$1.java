package okhttp3;

import java.io.IOException;
import okhttp3.internal.cache.C15910b;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.InternalCache;

class b$1 implements InternalCache {
    /* renamed from: a */
    final /* synthetic */ C2670b f54833a;

    b$1(C2670b c2670b) {
        this.f54833a = c2670b;
    }

    public C15966s get(C15963q c15963q) throws IOException {
        return this.f54833a.a(c15963q);
    }

    public CacheRequest put(C15966s c15966s) throws IOException {
        return this.f54833a.a(c15966s);
    }

    public void remove(C15963q c15963q) throws IOException {
        this.f54833a.b(c15963q);
    }

    public void update(C15966s c15966s, C15966s c15966s2) {
        this.f54833a.a(c15966s, c15966s2);
    }

    public void trackConditionalCacheHit() {
        this.f54833a.b();
    }

    public void trackResponse(C15910b c15910b) {
        this.f54833a.a(c15910b);
    }
}
