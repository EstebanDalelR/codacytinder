package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader.C2106c;
import com.google.android.exoplayer2.util.C2302k;
import com.google.android.exoplayer2.util.C2310s;
import com.google.android.exoplayer2.util.C2314v;
import com.tinder.domain.config.model.ProfileEditingConfig;

/* renamed from: com.google.android.exoplayer2.extractor.ts.p */
public final class C3661p implements TsPayloadReader {
    /* renamed from: a */
    private final SectionPayloadReader f11321a;
    /* renamed from: b */
    private final C2302k f11322b = new C2302k(32);
    /* renamed from: c */
    private int f11323c;
    /* renamed from: d */
    private int f11324d;
    /* renamed from: e */
    private boolean f11325e;
    /* renamed from: f */
    private boolean f11326f;

    public C3661p(SectionPayloadReader sectionPayloadReader) {
        this.f11321a = sectionPayloadReader;
    }

    public void init(C2310s c2310s, ExtractorOutput extractorOutput, C2106c c2106c) {
        this.f11321a.init(c2310s, extractorOutput, c2106c);
        this.f11326f = true;
    }

    public void seek() {
        this.f11326f = true;
    }

    public void consume(C2302k c2302k, boolean z) {
        int g = z ? c2302k.m8395g() + c2302k.m8389d() : -1;
        if (this.f11326f) {
            if (z) {
                this.f11326f = false;
                c2302k.m8388c(g);
                this.f11324d = 0;
            } else {
                return;
            }
        }
        while (c2302k.m8385b() <= false) {
            boolean z2 = true;
            if (this.f11324d < true) {
                if (!this.f11324d) {
                    z = c2302k.m8395g();
                    c2302k.m8388c(c2302k.m8389d() - 1);
                    if (z) {
                        this.f11326f = true;
                        return;
                    }
                }
                z = Math.min(c2302k.m8385b(), 3 - this.f11324d);
                c2302k.m8384a(this.f11322b.f6929a, this.f11324d, z);
                this.f11324d += z;
                if (this.f11324d) {
                    this.f11322b.m8381a(3);
                    this.f11322b.m8390d(1);
                    z = this.f11322b.m8395g();
                    int g2 = this.f11322b.m8395g();
                    if ((z & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
                        z2 = false;
                    }
                    this.f11325e = z2;
                    this.f11323c = (((z & 15) << 8) | g2) + true;
                    if (this.f11322b.m8391e() < this.f11323c) {
                        z = this.f11322b.f6929a;
                        this.f11322b.m8381a(Math.min(4098, Math.max(this.f11323c, z.length * 2)));
                        System.arraycopy(z, 0, this.f11322b.f6929a, 0, 3);
                    }
                }
            } else {
                z = Math.min(c2302k.m8385b(), this.f11323c - this.f11324d);
                c2302k.m8384a(this.f11322b.f6929a, this.f11324d, z);
                this.f11324d += z;
                if (this.f11324d != this.f11323c) {
                    continue;
                } else {
                    if (!this.f11325e) {
                        this.f11322b.m8381a(this.f11323c);
                    } else if (C2314v.m8459a(this.f11322b.f6929a, 0, this.f11323c, -1)) {
                        this.f11326f = true;
                        return;
                    } else {
                        this.f11322b.m8381a(this.f11323c - 4);
                    }
                    this.f11321a.consume(this.f11322b);
                    this.f11324d = 0;
                }
            }
        }
    }
}
