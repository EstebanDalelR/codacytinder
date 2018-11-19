package com.google.android.exoplayer2.metadata;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.C2122i;
import com.google.android.exoplayer2.C4237a;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.util.C2289a;
import java.util.Arrays;

public final class MetadataRenderer extends C4237a implements Callback {
    /* renamed from: a */
    private final MetadataDecoderFactory f14391a;
    /* renamed from: b */
    private final MetadataOutput f14392b;
    /* renamed from: c */
    private final Handler f14393c;
    /* renamed from: d */
    private final C2122i f14394d;
    /* renamed from: e */
    private final C4243a f14395e;
    /* renamed from: f */
    private final Metadata[] f14396f;
    /* renamed from: g */
    private final long[] f14397g;
    /* renamed from: h */
    private int f14398h;
    /* renamed from: i */
    private int f14399i;
    /* renamed from: j */
    private MetadataDecoder f14400j;
    /* renamed from: k */
    private boolean f14401k;

    @Deprecated
    public interface Output extends MetadataOutput {
    }

    public boolean isReady() {
        return true;
    }

    public MetadataRenderer(MetadataOutput metadataOutput, Looper looper) {
        this(metadataOutput, looper, MetadataDecoderFactory.f6129a);
    }

    public MetadataRenderer(MetadataOutput metadataOutput, Looper looper, MetadataDecoderFactory metadataDecoderFactory) {
        super(4);
        this.f14392b = (MetadataOutput) C2289a.m8309a((Object) metadataOutput);
        if (looper == null) {
            metadataOutput = null;
        } else {
            metadataOutput = new Handler(looper, this);
        }
        this.f14393c = metadataOutput;
        this.f14391a = (MetadataDecoderFactory) C2289a.m8309a((Object) metadataDecoderFactory);
        this.f14394d = new C2122i();
        this.f14395e = new C4243a();
        this.f14396f = new Metadata[5];
        this.f14397g = new long[5];
    }

    public int supportsFormat(Format format) {
        if (!this.f14391a.supportsFormat(format)) {
            return null;
        }
        return C4237a.m16837a(null, (DrmInitData) format.drmInitData) != null ? 4 : 2;
    }

    /* renamed from: a */
    protected void mo3726a(Format[] formatArr, long j) throws ExoPlaybackException {
        this.f14400j = this.f14391a.createDecoder(formatArr[0]);
    }

    /* renamed from: a */
    protected void mo3718a(long j, boolean z) {
        m17980h();
        this.f14401k = 0;
    }

    public void render(long j, long j2) throws ExoPlaybackException {
        if (this.f14401k == null && this.f14399i < 5) {
            this.f14395e.mo2221a();
            if (m16839a(this.f14394d, this.f14395e, false) == -4) {
                if (this.f14395e.m7344c() != null) {
                    this.f14401k = true;
                } else if (this.f14395e.m7342b() == null) {
                    this.f14395e.f13638d = this.f14394d.f6062a.subsampleOffsetUs;
                    this.f14395e.m13521h();
                    try {
                        j2 = (this.f14398h + this.f14399i) % 5;
                        this.f14396f[j2] = this.f14400j.decode(this.f14395e);
                        this.f14397g[j2] = this.f14395e.c;
                        this.f14399i++;
                    } catch (long j3) {
                        throw ExoPlaybackException.m7218a(j3, m16848f());
                    }
                }
            }
        }
        if (this.f14399i > null && this.f14397g[this.f14398h] <= j3) {
            m17978a(this.f14396f[this.f14398h]);
            this.f14396f[this.f14398h] = 0;
            this.f14398h = (this.f14398h + 1) % 5;
            this.f14399i--;
        }
    }

    /* renamed from: c */
    protected void mo3721c() {
        m17980h();
        this.f14400j = null;
    }

    public boolean isEnded() {
        return this.f14401k;
    }

    /* renamed from: a */
    private void m17978a(Metadata metadata) {
        if (this.f14393c != null) {
            this.f14393c.obtainMessage(0, metadata).sendToTarget();
        } else {
            m17979b(metadata);
        }
    }

    /* renamed from: h */
    private void m17980h() {
        Arrays.fill(this.f14396f, null);
        this.f14398h = 0;
        this.f14399i = 0;
    }

    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        m17979b((Metadata) message.obj);
        return true;
    }

    /* renamed from: b */
    private void m17979b(Metadata metadata) {
        this.f14392b.onMetadata(metadata);
    }
}
