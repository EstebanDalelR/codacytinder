package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import javax.annotation.Nullable;

/* renamed from: okio.p */
final class C15981p {
    @Nullable
    /* renamed from: a */
    static C15980o f49618a;
    /* renamed from: b */
    static long f49619b;

    private C15981p() {
    }

    /* renamed from: a */
    static C15980o m60631a() {
        synchronized (C15981p.class) {
            if (f49618a != null) {
                C15980o c15980o = f49618a;
                f49618a = c15980o.f49616f;
                c15980o.f49616f = null;
                f49619b -= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                return c15980o;
            }
            return new C15980o();
        }
    }

    /* renamed from: a */
    static void m60632a(C15980o c15980o) {
        if (c15980o.f49616f == null) {
            if (c15980o.f49617g == null) {
                if (!c15980o.f49614d) {
                    synchronized (C15981p.class) {
                        if (f49619b + PlaybackStateCompat.ACTION_PLAY_FROM_URI > PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                            return;
                        }
                        f49619b += PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                        c15980o.f49616f = f49618a;
                        c15980o.f49613c = 0;
                        c15980o.f49612b = 0;
                        f49618a = c15980o;
                        return;
                    }
                }
                return;
            }
        }
        throw new IllegalArgumentException();
    }
}
