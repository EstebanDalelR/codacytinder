package com.google.android.exoplayer2.extractor.p061b;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2302k;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.extractor.b.d */
final class C2057d {
    /* renamed from: a */
    private final C2058e f5641a = new C2058e();
    /* renamed from: b */
    private final C2302k f5642b = new C2302k(new byte[65025], 0);
    /* renamed from: c */
    private int f5643c = -1;
    /* renamed from: d */
    private int f5644d;
    /* renamed from: e */
    private boolean f5645e;

    C2057d() {
    }

    /* renamed from: a */
    public void m7377a() {
        this.f5641a.m7382a();
        this.f5642b.m8380a();
        this.f5643c = -1;
        this.f5645e = false;
    }

    /* renamed from: a */
    public boolean m7378a(ExtractorInput extractorInput) throws IOException, InterruptedException {
        C2289a.m8313b(extractorInput != null);
        if (this.f5645e) {
            this.f5645e = false;
            this.f5642b.m8380a();
        }
        while (!this.f5645e) {
            int i;
            int i2;
            if (this.f5643c < 0) {
                if (!this.f5641a.m7383a(extractorInput, true)) {
                    return false;
                }
                i = this.f5641a.f5654h;
                if ((this.f5641a.f5648b & 1) == 1 && this.f5642b.m8387c() == 0) {
                    i += m7376a(0);
                    i2 = this.f5644d + 0;
                } else {
                    i2 = 0;
                }
                extractorInput.skipFully(i);
                this.f5643c = i2;
            }
            i = m7376a(this.f5643c);
            i2 = this.f5643c + this.f5644d;
            if (i > 0) {
                if (this.f5642b.m8391e() < this.f5642b.m8387c() + i) {
                    this.f5642b.f6929a = Arrays.copyOf(this.f5642b.f6929a, this.f5642b.m8387c() + i);
                }
                extractorInput.readFully(this.f5642b.f6929a, this.f5642b.m8387c(), i);
                this.f5642b.m8386b(this.f5642b.m8387c() + i);
                this.f5645e = this.f5641a.f5656j[i2 + -1] != 255;
            }
            if (i2 == this.f5641a.f5653g) {
                i2 = -1;
            }
            this.f5643c = i2;
        }
        return true;
    }

    /* renamed from: b */
    public C2058e m7379b() {
        return this.f5641a;
    }

    /* renamed from: c */
    public C2302k m7380c() {
        return this.f5642b;
    }

    /* renamed from: d */
    public void m7381d() {
        if (this.f5642b.f6929a.length != 65025) {
            this.f5642b.f6929a = Arrays.copyOf(this.f5642b.f6929a, Math.max(65025, this.f5642b.m8387c()));
        }
    }

    /* renamed from: a */
    private int m7376a(int i) {
        int i2 = 0;
        this.f5644d = 0;
        while (this.f5644d + i < this.f5641a.f5653g) {
            int[] iArr = this.f5641a.f5656j;
            int i3 = this.f5644d;
            this.f5644d = i3 + 1;
            int i4 = iArr[i3 + i];
            i2 += i4;
            if (i4 != 255) {
                break;
            }
        }
        return i2;
    }
}
