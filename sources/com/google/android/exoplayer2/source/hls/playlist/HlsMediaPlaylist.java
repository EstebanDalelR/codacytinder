package com.google.android.exoplayer2.source.hls.playlist;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;

public final class HlsMediaPlaylist extends C3695b {
    /* renamed from: a */
    public final int f13740a;
    /* renamed from: b */
    public final long f13741b;
    /* renamed from: c */
    public final long f13742c;
    /* renamed from: d */
    public final boolean f13743d;
    /* renamed from: e */
    public final int f13744e;
    /* renamed from: f */
    public final long f13745f;
    /* renamed from: g */
    public final int f13746g;
    /* renamed from: h */
    public final long f13747h;
    /* renamed from: i */
    public final boolean f13748i;
    /* renamed from: j */
    public final boolean f13749j;
    /* renamed from: k */
    public final boolean f13750k;
    /* renamed from: l */
    public final DrmInitData f13751l;
    /* renamed from: m */
    public final List<C2209a> f13752m;
    /* renamed from: n */
    public final long f13753n;

    @Retention(RetentionPolicy.SOURCE)
    public @interface PlaylistType {
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$a */
    public static final class C2209a implements Comparable<Long> {
        /* renamed from: a */
        public final String f6375a;
        @Nullable
        /* renamed from: b */
        public final C2209a f6376b;
        /* renamed from: c */
        public final long f6377c;
        /* renamed from: d */
        public final int f6378d;
        /* renamed from: e */
        public final long f6379e;
        /* renamed from: f */
        public final String f6380f;
        /* renamed from: g */
        public final String f6381g;
        /* renamed from: h */
        public final long f6382h;
        /* renamed from: i */
        public final long f6383i;
        /* renamed from: j */
        public final boolean f6384j;

        public /* synthetic */ int compareTo(@NonNull Object obj) {
            return m7891a((Long) obj);
        }

        /* renamed from: a */
        public int m7891a(@NonNull Long l) {
            if (this.f6379e > l.longValue()) {
                return 1;
            }
            return this.f6379e < l.longValue() ? -1 : null;
        }
    }

    /* renamed from: a */
    public HlsMediaPlaylist m16996a(List<RenditionKey> list) {
        return this;
    }

    public /* synthetic */ Object copy(List list) {
        return m16996a(list);
    }

    public HlsMediaPlaylist(int i, String str, List<String> list, long j, long j2, boolean z, int i2, long j3, int i3, long j4, boolean z2, boolean z3, boolean z4, DrmInitData drmInitData, List<C2209a> list2) {
        super(str, list);
        this.f13740a = i;
        this.f13742c = j2;
        this.f13743d = z;
        this.f13744e = i2;
        this.f13745f = j3;
        this.f13746g = i3;
        this.f13747h = j4;
        this.f13748i = z2;
        this.f13749j = z3;
        this.f13750k = z4;
        this.f13751l = drmInitData;
        this.f13752m = Collections.unmodifiableList(list2);
        if (list2.isEmpty()) {
            r0.f13753n = 0;
        } else {
            C2209a c2209a = (C2209a) list2.get(list2.size() - 1);
            r0.f13753n = c2209a.f6379e + c2209a.f6377c;
        }
        long j5 = j == -9223372036854775807L ? -9223372036854775807L : j >= 0 ? j : r0.f13753n + j;
        r0.f13741b = j5;
    }

    /* renamed from: a */
    public boolean m16997a(HlsMediaPlaylist hlsMediaPlaylist) {
        boolean z = true;
        if (hlsMediaPlaylist != null) {
            if (this.f13745f <= hlsMediaPlaylist.f13745f) {
                if (this.f13745f < hlsMediaPlaylist.f13745f) {
                    return false;
                }
                int size = this.f13752m.size();
                int size2 = hlsMediaPlaylist.f13752m.size();
                if (size <= size2) {
                    if (size != size2 || !this.f13749j || hlsMediaPlaylist.f13749j != null) {
                        z = false;
                    }
                }
                return z;
            }
        }
        return true;
    }

    /* renamed from: a */
    public long m16994a() {
        return this.f13742c + this.f13753n;
    }

    /* renamed from: a */
    public HlsMediaPlaylist m16995a(long j, int i) {
        int i2 = this.f13740a;
        String str = this.o;
        List list = this.p;
        long j2 = this.f13741b;
        long j3 = this.f13745f;
        int i3 = this.f13746g;
        long j4 = this.f13747h;
        boolean z = this.f13748i;
        boolean z2 = this.f13749j;
        boolean z3 = this.f13750k;
        boolean z4 = z3;
        boolean z5 = z2;
        boolean z6 = z;
        return new HlsMediaPlaylist(i2, str, list, j2, j, true, i, j3, i3, j4, z6, z5, z4, this.f13751l, this.f13752m);
    }

    /* renamed from: b */
    public HlsMediaPlaylist m16998b() {
        if (this.f13749j) {
            return r0;
        }
        int i = r0.f13740a;
        String str = r0.o;
        List list = r0.p;
        long j = r0.f13741b;
        long j2 = r0.f13742c;
        boolean z = r0.f13743d;
        int i2 = r0.f13744e;
        long j3 = r0.f13745f;
        int i3 = r0.f13746g;
        long j4 = r0.f13747h;
        boolean z2 = r0.f13748i;
        long j5 = j4;
        boolean z3 = r0.f13750k;
        boolean z4 = z3;
        long j6 = j5;
        return new HlsMediaPlaylist(i, str, list, j, j2, z, i2, j3, i3, j6, z2, true, z4, r0.f13751l, r0.f13752m);
    }
}
