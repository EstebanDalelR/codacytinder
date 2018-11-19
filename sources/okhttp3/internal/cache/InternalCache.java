package okhttp3.internal.cache;

import java.io.IOException;
import okhttp3.C15963q;
import okhttp3.C15966s;

public interface InternalCache {
    C15966s get(C15963q c15963q) throws IOException;

    CacheRequest put(C15966s c15966s) throws IOException;

    void remove(C15963q c15963q) throws IOException;

    void trackConditionalCacheHit();

    void trackResponse(C15910b c15910b);

    void update(C15966s c15966s, C15966s c15966s2);
}
