package com.google.android.exoplayer2.source;

import android.os.Handler;
import android.support.annotation.Nullable;
import com.google.android.exoplayer2.C2165q;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.upstream.Allocator;
import java.io.IOException;

public interface MediaSource {

    public interface SourceInfoRefreshListener {
        void onSourceInfoRefreshed(MediaSource mediaSource, C2165q c2165q, @Nullable Object obj);
    }

    /* renamed from: com.google.android.exoplayer2.source.MediaSource$a */
    public static final class C2166a {
        /* renamed from: a */
        public final int f6223a;
        /* renamed from: b */
        public final int f6224b;
        /* renamed from: c */
        public final int f6225c;
        /* renamed from: d */
        public final long f6226d;

        public C2166a(int i) {
            this(i, -1);
        }

        public C2166a(int i, long j) {
            this(i, -1, -1, j);
        }

        public C2166a(int i, int i2, int i3, long j) {
            this.f6223a = i;
            this.f6224b = i2;
            this.f6225c = i3;
            this.f6226d = j;
        }

        /* renamed from: a */
        public C2166a m7820a(int i) {
            if (this.f6223a == i) {
                return this;
            }
            return new C2166a(i, this.f6224b, this.f6225c, this.f6226d);
        }

        /* renamed from: a */
        public boolean m7821a() {
            return this.f6224b != -1;
        }

        public boolean equals(@Nullable Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    C2166a c2166a = (C2166a) obj;
                    if (this.f6223a != c2166a.f6223a || this.f6224b != c2166a.f6224b || this.f6225c != c2166a.f6225c || this.f6226d != c2166a.f6226d) {
                        z = false;
                    }
                    return z;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((((527 + this.f6223a) * 31) + this.f6224b) * 31) + this.f6225c) * 31) + ((int) this.f6226d);
        }
    }

    void addEventListener(Handler handler, MediaSourceEventListener mediaSourceEventListener);

    MediaPeriod createPeriod(C2166a c2166a, Allocator allocator);

    void maybeThrowSourceInfoRefreshError() throws IOException;

    void prepareSource(ExoPlayer exoPlayer, boolean z, SourceInfoRefreshListener sourceInfoRefreshListener);

    void releasePeriod(MediaPeriod mediaPeriod);

    void releaseSource(SourceInfoRefreshListener sourceInfoRefreshListener);

    void removeEventListener(MediaSourceEventListener mediaSourceEventListener);
}
