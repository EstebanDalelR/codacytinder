package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.audio.Ac3Util.SyncFrameInfo;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader.C2106c;
import com.google.android.exoplayer2.util.C2301j;
import com.google.android.exoplayer2.util.C2302k;
import com.tinder.domain.config.model.ProfileEditingConfig;

/* renamed from: com.google.android.exoplayer2.extractor.ts.b */
public final class C3646b implements ElementaryStreamReader {
    /* renamed from: a */
    private final C2301j f11168a;
    /* renamed from: b */
    private final C2302k f11169b;
    /* renamed from: c */
    private final String f11170c;
    /* renamed from: d */
    private String f11171d;
    /* renamed from: e */
    private TrackOutput f11172e;
    /* renamed from: f */
    private int f11173f;
    /* renamed from: g */
    private int f11174g;
    /* renamed from: h */
    private boolean f11175h;
    /* renamed from: i */
    private long f11176i;
    /* renamed from: j */
    private Format f11177j;
    /* renamed from: k */
    private int f11178k;
    /* renamed from: l */
    private long f11179l;

    public void packetFinished() {
    }

    public C3646b() {
        this(null);
    }

    public C3646b(String str) {
        this.f11168a = new C2301j(new byte[ProfileEditingConfig.DEFAULT_MAX_LENGTH]);
        this.f11169b = new C2302k(this.f11168a.f6925a);
        this.f11173f = 0;
        this.f11170c = str;
    }

    public void seek() {
        this.f11173f = 0;
        this.f11174g = 0;
        this.f11175h = false;
    }

    public void createTracks(ExtractorOutput extractorOutput, C2106c c2106c) {
        c2106c.m7534a();
        this.f11171d = c2106c.m7536c();
        this.f11172e = extractorOutput.track(c2106c.m7535b(), 1);
    }

    public void packetStarted(long j, boolean z) {
        this.f11179l = j;
    }

    public void consume(C2302k c2302k) {
        while (c2302k.m8385b() > 0) {
            switch (this.f11173f) {
                case 0:
                    if (!m13781a(c2302k)) {
                        break;
                    }
                    this.f11173f = 1;
                    this.f11169b.f6929a[0] = (byte) 11;
                    this.f11169b.f6929a[1] = (byte) 119;
                    this.f11174g = 2;
                    break;
                case 1:
                    if (!m13782a(c2302k, this.f11169b.f6929a, ProfileEditingConfig.DEFAULT_MAX_LENGTH)) {
                        break;
                    }
                    m13780a();
                    this.f11169b.m8388c(0);
                    this.f11172e.sampleData(this.f11169b, ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                    this.f11173f = 2;
                    break;
                case 2:
                    int min = Math.min(c2302k.m8385b(), this.f11178k - this.f11174g);
                    this.f11172e.sampleData(c2302k, min);
                    this.f11174g += min;
                    if (this.f11174g != this.f11178k) {
                        break;
                    }
                    this.f11172e.sampleMetadata(this.f11179l, 1, this.f11178k, 0, null);
                    this.f11179l += this.f11176i;
                    this.f11173f = 0;
                    break;
                default:
                    break;
            }
        }
    }

    /* renamed from: a */
    private boolean m13782a(C2302k c2302k, byte[] bArr, int i) {
        int min = Math.min(c2302k.m8385b(), i - this.f11174g);
        c2302k.m8384a(bArr, this.f11174g, min);
        this.f11174g += min;
        return this.f11174g == i ? true : null;
    }

    /* renamed from: a */
    private boolean m13781a(C2302k c2302k) {
        while (true) {
            boolean z = false;
            if (c2302k.m8385b() <= 0) {
                return false;
            }
            if (this.f11175h) {
                int g = c2302k.m8395g();
                if (g == 119) {
                    this.f11175h = false;
                    return true;
                }
                if (g == 11) {
                    z = true;
                }
                this.f11175h = z;
            } else {
                if (c2302k.m8395g() == 11) {
                    z = true;
                }
                this.f11175h = z;
            }
        }
    }

    /* renamed from: a */
    private void m13780a() {
        this.f11168a.m8364a(0);
        SyncFrameInfo a = Ac3Util.m7259a(this.f11168a);
        if (!(this.f11177j != null && a.f5488d == this.f11177j.channelCount && a.f5487c == this.f11177j.sampleRate && a.f5485a == this.f11177j.sampleMimeType)) {
            this.f11177j = Format.createAudioSampleFormat(this.f11171d, a.f5485a, null, -1, -1, a.f5488d, a.f5487c, null, null, 0, this.f11170c);
            this.f11172e.format(this.f11177j);
        }
        this.f11178k = a.f5489e;
        this.f11176i = (((long) a.f5490f) * 1000000) / ((long) this.f11177j.sampleRate);
    }
}
