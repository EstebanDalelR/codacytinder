package com.google.android.exoplayer2.extractor.p061b;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.C2302k;
import com.google.android.exoplayer2.util.C2314v;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.extractor.b.e */
final class C2058e {
    /* renamed from: k */
    private static final int f5646k = C2314v.m8499g("OggS");
    /* renamed from: a */
    public int f5647a;
    /* renamed from: b */
    public int f5648b;
    /* renamed from: c */
    public long f5649c;
    /* renamed from: d */
    public long f5650d;
    /* renamed from: e */
    public long f5651e;
    /* renamed from: f */
    public long f5652f;
    /* renamed from: g */
    public int f5653g;
    /* renamed from: h */
    public int f5654h;
    /* renamed from: i */
    public int f5655i;
    /* renamed from: j */
    public final int[] f5656j = new int[255];
    /* renamed from: l */
    private final C2302k f5657l = new C2302k(255);

    C2058e() {
    }

    /* renamed from: a */
    public void m7382a() {
        this.f5647a = 0;
        this.f5648b = 0;
        this.f5649c = 0;
        this.f5650d = 0;
        this.f5651e = 0;
        this.f5652f = 0;
        this.f5653g = 0;
        this.f5654h = 0;
        this.f5655i = 0;
    }

    /* renamed from: a */
    public boolean m7383a(ExtractorInput extractorInput, boolean z) throws IOException, InterruptedException {
        Object obj;
        this.f5657l.m8380a();
        m7382a();
        int i = 0;
        if (extractorInput.getLength() != -1) {
            if (extractorInput.getLength() - extractorInput.getPeekPosition() < 27) {
                obj = null;
                if (obj != null) {
                    if (!extractorInput.peekFully(this.f5657l.f6929a, 0, 27, true)) {
                        if (this.f5657l.m8401m() != ((long) f5646k)) {
                            this.f5647a = this.f5657l.m8395g();
                            if (this.f5647a != 0) {
                                this.f5648b = this.f5657l.m8395g();
                                this.f5649c = this.f5657l.m8406r();
                                this.f5650d = this.f5657l.m8402n();
                                this.f5651e = this.f5657l.m8402n();
                                this.f5652f = this.f5657l.m8402n();
                                this.f5653g = this.f5657l.m8395g();
                                this.f5654h = this.f5653g + true;
                                this.f5657l.m8380a();
                                extractorInput.peekFully(this.f5657l.f6929a, 0, this.f5653g);
                                while (i < this.f5653g) {
                                    this.f5656j[i] = this.f5657l.m8395g();
                                    this.f5655i += this.f5656j[i];
                                    i++;
                                }
                                return true;
                            } else if (z) {
                                return false;
                            } else {
                                throw new ParserException("unsupported bit stream revision");
                            }
                        } else if (z) {
                            return false;
                        } else {
                            throw new ParserException("expected OggS capture pattern at begin of page");
                        }
                    }
                }
                if (z) {
                    return false;
                }
                throw new EOFException();
            }
        }
        obj = 1;
        if (obj != null) {
            if (!extractorInput.peekFully(this.f5657l.f6929a, 0, 27, true)) {
                if (this.f5657l.m8401m() != ((long) f5646k)) {
                    this.f5647a = this.f5657l.m8395g();
                    if (this.f5647a != 0) {
                        this.f5648b = this.f5657l.m8395g();
                        this.f5649c = this.f5657l.m8406r();
                        this.f5650d = this.f5657l.m8402n();
                        this.f5651e = this.f5657l.m8402n();
                        this.f5652f = this.f5657l.m8402n();
                        this.f5653g = this.f5657l.m8395g();
                        this.f5654h = this.f5653g + true;
                        this.f5657l.m8380a();
                        extractorInput.peekFully(this.f5657l.f6929a, 0, this.f5653g);
                        while (i < this.f5653g) {
                            this.f5656j[i] = this.f5657l.m8395g();
                            this.f5655i += this.f5656j[i];
                            i++;
                        }
                        return true;
                    } else if (z) {
                        return false;
                    } else {
                        throw new ParserException("unsupported bit stream revision");
                    }
                } else if (z) {
                    return false;
                } else {
                    throw new ParserException("expected OggS capture pattern at begin of page");
                }
            }
        }
        if (z) {
            return false;
        }
        throw new EOFException();
    }
}
