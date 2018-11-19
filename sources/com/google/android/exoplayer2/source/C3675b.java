package com.google.android.exoplayer2.source;

import android.os.Handler;
import android.support.annotation.Nullable;
import com.google.android.exoplayer2.C2165q;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.source.MediaSource.C2166a;
import com.google.android.exoplayer2.source.MediaSource.SourceInfoRefreshListener;
import com.google.android.exoplayer2.source.MediaSourceEventListener.C2177a;
import com.google.android.exoplayer2.util.C2289a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.exoplayer2.source.b */
public abstract class C3675b implements MediaSource {
    /* renamed from: a */
    private final ArrayList<SourceInfoRefreshListener> f11368a = new ArrayList(1);
    /* renamed from: b */
    private final C2177a f11369b = new C2177a();
    /* renamed from: c */
    private ExoPlayer f11370c;
    /* renamed from: d */
    private C2165q f11371d;
    /* renamed from: e */
    private Object f11372e;

    /* renamed from: a */
    protected abstract void mo3493a();

    /* renamed from: a */
    protected abstract void mo3495a(ExoPlayer exoPlayer, boolean z);

    /* renamed from: a */
    protected final void m13916a(C2165q c2165q, @Nullable Object obj) {
        this.f11371d = c2165q;
        this.f11372e = obj;
        Iterator it = this.f11368a.iterator();
        while (it.hasNext()) {
            ((SourceInfoRefreshListener) it.next()).onSourceInfoRefreshed(this, c2165q, obj);
        }
    }

    /* renamed from: a */
    protected final C2177a m13913a(@Nullable C2166a c2166a) {
        return this.f11369b.m7824a(0, c2166a, 0);
    }

    /* renamed from: a */
    protected final C2177a m13912a(int i, @Nullable C2166a c2166a, long j) {
        return this.f11369b.m7824a(i, c2166a, j);
    }

    public final void addEventListener(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
        this.f11369b.m7828a(handler, mediaSourceEventListener);
    }

    public final void removeEventListener(MediaSourceEventListener mediaSourceEventListener) {
        this.f11369b.m7832a(mediaSourceEventListener);
    }

    public final void prepareSource(ExoPlayer exoPlayer, boolean z, SourceInfoRefreshListener sourceInfoRefreshListener) {
        boolean z2;
        if (this.f11370c != null) {
            if (this.f11370c != exoPlayer) {
                z2 = false;
                C2289a.m8311a(z2);
                this.f11368a.add(sourceInfoRefreshListener);
                if (this.f11370c == null) {
                    this.f11370c = exoPlayer;
                    mo3495a(exoPlayer, z);
                } else if (this.f11371d != null) {
                    sourceInfoRefreshListener.onSourceInfoRefreshed(this, this.f11371d, this.f11372e);
                }
            }
        }
        z2 = true;
        C2289a.m8311a(z2);
        this.f11368a.add(sourceInfoRefreshListener);
        if (this.f11370c == null) {
            this.f11370c = exoPlayer;
            mo3495a(exoPlayer, z);
        } else if (this.f11371d != null) {
            sourceInfoRefreshListener.onSourceInfoRefreshed(this, this.f11371d, this.f11372e);
        }
    }

    public final void releaseSource(SourceInfoRefreshListener sourceInfoRefreshListener) {
        this.f11368a.remove(sourceInfoRefreshListener);
        if (this.f11368a.isEmpty() != null) {
            this.f11370c = null;
            this.f11371d = null;
            this.f11372e = null;
            mo3493a();
        }
    }
}
