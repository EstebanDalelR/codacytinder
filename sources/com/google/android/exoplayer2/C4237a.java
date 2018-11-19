package com.google.android.exoplayer2;

import android.support.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.MediaClock;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.a */
public abstract class C4237a implements Renderer, RendererCapabilities {
    /* renamed from: a */
    private final int f13564a;
    /* renamed from: b */
    private C2154o f13565b;
    /* renamed from: c */
    private int f13566c;
    /* renamed from: d */
    private int f13567d;
    /* renamed from: e */
    private SampleStream f13568e;
    /* renamed from: f */
    private Format[] f13569f;
    /* renamed from: g */
    private long f13570g;
    /* renamed from: h */
    private boolean f13571h = true;
    /* renamed from: i */
    private boolean f13572i;

    /* renamed from: a */
    protected void mo3717a() throws ExoPlaybackException {
    }

    /* renamed from: a */
    protected void mo3718a(long j, boolean z) throws ExoPlaybackException {
    }

    /* renamed from: a */
    protected void mo3719a(boolean z) throws ExoPlaybackException {
    }

    /* renamed from: a */
    protected void mo3726a(Format[] formatArr, long j) throws ExoPlaybackException {
    }

    /* renamed from: b */
    protected void mo3720b() throws ExoPlaybackException {
    }

    /* renamed from: c */
    protected void mo3721c() {
    }

    public final RendererCapabilities getCapabilities() {
        return this;
    }

    public MediaClock getMediaClock() {
        return null;
    }

    public void handleMessage(int i, Object obj) throws ExoPlaybackException {
    }

    public int supportsMixedMimeTypeAdaptation() throws ExoPlaybackException {
        return 0;
    }

    public C4237a(int i) {
        this.f13564a = i;
    }

    public final int getTrackType() {
        return this.f13564a;
    }

    public final void setIndex(int i) {
        this.f13566c = i;
    }

    public final int getState() {
        return this.f13567d;
    }

    public final void enable(C2154o c2154o, Format[] formatArr, SampleStream sampleStream, long j, boolean z, long j2) throws ExoPlaybackException {
        C2289a.m8313b(this.f13567d == 0);
        this.f13565b = c2154o;
        this.f13567d = 1;
        mo3719a(z);
        replaceStream(formatArr, sampleStream, j2);
        mo3718a(j, z);
    }

    public final void start() throws ExoPlaybackException {
        boolean z = true;
        if (this.f13567d != 1) {
            z = false;
        }
        C2289a.m8313b(z);
        this.f13567d = 2;
        mo3717a();
    }

    public final void replaceStream(Format[] formatArr, SampleStream sampleStream, long j) throws ExoPlaybackException {
        C2289a.m8313b(this.f13572i ^ 1);
        this.f13568e = sampleStream;
        this.f13571h = null;
        this.f13569f = formatArr;
        this.f13570g = j;
        mo3726a(formatArr, j);
    }

    public final SampleStream getStream() {
        return this.f13568e;
    }

    public final boolean hasReadStreamToEnd() {
        return this.f13571h;
    }

    public final void setCurrentStreamFinal() {
        this.f13572i = true;
    }

    public final boolean isCurrentStreamFinal() {
        return this.f13572i;
    }

    public final void maybeThrowStreamError() throws IOException {
        this.f13568e.maybeThrowError();
    }

    public final void resetPosition(long j) throws ExoPlaybackException {
        this.f13572i = false;
        this.f13571h = false;
        mo3718a(j, false);
    }

    public final void stop() throws ExoPlaybackException {
        C2289a.m8313b(this.f13567d == 2);
        this.f13567d = 1;
        mo3720b();
    }

    public final void disable() {
        boolean z = true;
        if (this.f13567d != 1) {
            z = false;
        }
        C2289a.m8313b(z);
        this.f13567d = 0;
        this.f13568e = null;
        this.f13569f = null;
        this.f13572i = false;
        mo3721c();
    }

    /* renamed from: d */
    protected final Format[] m16846d() {
        return this.f13569f;
    }

    /* renamed from: e */
    protected final C2154o m16847e() {
        return this.f13565b;
    }

    /* renamed from: f */
    protected final int m16848f() {
        return this.f13566c;
    }

    /* renamed from: a */
    protected final int m16839a(C2122i c2122i, DecoderInputBuffer decoderInputBuffer, boolean z) {
        z = this.f13568e.readData(c2122i, decoderInputBuffer, z);
        int i = -4;
        if (z) {
            if (decoderInputBuffer.m7344c() != null) {
                this.f13571h = true;
                if (this.f13572i == null) {
                    i = -3;
                }
                return i;
            }
            decoderInputBuffer.f10831c += this.f13570g;
        } else if (z) {
            decoderInputBuffer = c2122i.f6062a;
            if (decoderInputBuffer.subsampleOffsetUs != Format.OFFSET_SAMPLE_RELATIVE) {
                c2122i.f6062a = decoderInputBuffer.copyWithSubsampleOffsetUs(decoderInputBuffer.subsampleOffsetUs + this.f13570g);
            }
        }
        return z;
    }

    /* renamed from: a */
    protected int m16838a(long j) {
        return this.f13568e.skipData(j - this.f13570g);
    }

    /* renamed from: g */
    protected final boolean m16849g() {
        return this.f13571h ? this.f13572i : this.f13568e.isReady();
    }

    /* renamed from: a */
    protected static boolean m16837a(@Nullable DrmSessionManager<?> drmSessionManager, @Nullable DrmInitData drmInitData) {
        if (drmInitData == null) {
            return true;
        }
        return drmSessionManager == null ? null : drmSessionManager.canAcquireSession(drmInitData);
    }
}
