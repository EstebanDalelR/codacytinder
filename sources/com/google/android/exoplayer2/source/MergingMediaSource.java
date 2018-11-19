package com.google.android.exoplayer2.source;

import android.support.annotation.Nullable;
import com.google.android.exoplayer2.C2165q;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.source.MediaSource.C2166a;
import com.google.android.exoplayer2.upstream.Allocator;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;

public final class MergingMediaSource extends C4250d<Integer> {
    /* renamed from: a */
    private final MediaSource[] f14415a;
    /* renamed from: b */
    private final ArrayList<MediaSource> f14416b;
    /* renamed from: c */
    private final CompositeSequenceableLoaderFactory f14417c;
    /* renamed from: d */
    private C2165q f14418d;
    /* renamed from: e */
    private Object f14419e;
    /* renamed from: f */
    private int f14420f;
    /* renamed from: g */
    private IllegalMergeException f14421g;

    public static final class IllegalMergeException extends IOException {
        /* renamed from: a */
        public final int f6274a;

        @Retention(RetentionPolicy.SOURCE)
        public @interface Reason {
        }

        public IllegalMergeException(int i) {
            this.f6274a = i;
        }
    }

    /* renamed from: a */
    public void mo3495a(ExoPlayer exoPlayer, boolean z) {
        super.mo3495a(exoPlayer, z);
        for (exoPlayer = null; exoPlayer < this.f14415a.length; exoPlayer++) {
            m16958a((Object) Integer.valueOf(exoPlayer), this.f14415a[exoPlayer]);
        }
    }

    public void maybeThrowSourceInfoRefreshError() throws IOException {
        if (this.f14421g != null) {
            throw this.f14421g;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    public MediaPeriod createPeriod(C2166a c2166a, Allocator allocator) {
        MediaPeriod[] mediaPeriodArr = new MediaPeriod[this.f14415a.length];
        for (int i = 0; i < mediaPeriodArr.length; i++) {
            mediaPeriodArr[i] = this.f14415a[i].createPeriod(c2166a, allocator);
        }
        return new C4255j(this.f14417c, mediaPeriodArr);
    }

    public void releasePeriod(MediaPeriod mediaPeriod) {
        C4255j c4255j = (C4255j) mediaPeriod;
        for (int i = 0; i < this.f14415a.length; i++) {
            this.f14415a[i].releasePeriod(c4255j.f13763a[i]);
        }
    }

    /* renamed from: a */
    public void mo3493a() {
        super.mo3493a();
        this.f14418d = null;
        this.f14419e = null;
        this.f14420f = -1;
        this.f14421g = null;
        this.f14416b.clear();
        Collections.addAll(this.f14416b, this.f14415a);
    }

    /* renamed from: a */
    protected void m17994a(Integer num, MediaSource mediaSource, C2165q c2165q, @Nullable Object obj) {
        if (this.f14421g == null) {
            this.f14421g = m17991a(c2165q);
        }
        if (this.f14421g == null) {
            this.f14416b.remove(mediaSource);
            if (mediaSource == this.f14415a[0]) {
                this.f14418d = c2165q;
                this.f14419e = obj;
            }
            if (this.f14416b.isEmpty() != null) {
                m13916a((C2165q) this.f14418d, (Object) this.f14419e);
            }
        }
    }

    /* renamed from: a */
    private IllegalMergeException m17991a(C2165q c2165q) {
        if (this.f14420f == -1) {
            this.f14420f = c2165q.mo2319c();
        } else if (c2165q.mo2319c() != this.f14420f) {
            return new IllegalMergeException(0);
        }
        return null;
    }
}
