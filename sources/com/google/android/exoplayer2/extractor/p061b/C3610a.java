package com.google.android.exoplayer2.extractor.p061b;

import android.support.v7.widget.RecyclerView.ItemAnimator;
import com.google.android.exoplayer2.extractor.C2076i;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekMap.C2054a;
import com.google.android.exoplayer2.util.C2289a;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.extractor.b.a */
final class C3610a implements C2059f {
    /* renamed from: a */
    private final C2058e f10907a = new C2058e();
    /* renamed from: b */
    private final long f10908b;
    /* renamed from: c */
    private final long f10909c;
    /* renamed from: d */
    private final C2062h f10910d;
    /* renamed from: e */
    private int f10911e;
    /* renamed from: f */
    private long f10912f;
    /* renamed from: g */
    private long f10913g;
    /* renamed from: h */
    private long f10914h;
    /* renamed from: i */
    private long f10915i;
    /* renamed from: j */
    private long f10916j;
    /* renamed from: k */
    private long f10917k;
    /* renamed from: l */
    private long f10918l;

    /* renamed from: com.google.android.exoplayer2.extractor.b.a$a */
    private class C3609a implements SeekMap {
        /* renamed from: a */
        final /* synthetic */ C3610a f10906a;

        public boolean isSeekable() {
            return true;
        }

        private C3609a(C3610a c3610a) {
            this.f10906a = c3610a;
        }

        public C2054a getSeekPoints(long j) {
            if (j == 0) {
                return new C2054a(new C2076i(0, this.f10906a.f10908b));
            }
            return new C2054a(new C2076i(j, this.f10906a.m13577a(this.f10906a.f10908b, this.f10906a.f10910d.m7395b(j), 30000)));
        }

        public long getDurationUs() {
            return this.f10906a.f10910d.m7390a(this.f10906a.f10912f);
        }
    }

    /* renamed from: c */
    public /* synthetic */ SeekMap mo2252c() {
        return m13586a();
    }

    public C3610a(long j, long j2, C2062h c2062h, int i, long j3) {
        boolean z = j >= 0 && j2 > j;
        C2289a.m8311a(z);
        this.f10910d = c2062h;
        this.f10908b = j;
        this.f10909c = j2;
        if (((long) i) == j2 - j) {
            this.f10912f = j3;
            this.f10911e = 3;
            return;
        }
        this.f10911e = 0;
    }

    /* renamed from: a */
    public long mo2251a(ExtractorInput extractorInput) throws IOException, InterruptedException {
        long j;
        switch (this.f10911e) {
            case 0:
                this.f10913g = extractorInput.getPosition();
                this.f10911e = 1;
                j = this.f10909c - 65307;
                if (j > this.f10913g) {
                    return j;
                }
                break;
            case 1:
                break;
            case 2:
                long j2 = 0;
                if (this.f10914h != 0) {
                    j = m13583a(this.f10914h, extractorInput);
                    if (j >= 0) {
                        return j;
                    }
                    j2 = m13585a(extractorInput, this.f10914h, -(j + 2));
                }
                this.f10911e = 3;
                return -(j2 + 2);
            case 3:
                return -1;
            default:
                throw new IllegalStateException();
        }
        this.f10912f = m13590c(extractorInput);
        this.f10911e = 3;
        return this.f10913g;
    }

    /* renamed from: a */
    public long mo2250a(long j) {
        boolean z;
        long j2;
        if (this.f10911e != 3) {
            if (this.f10911e != 2) {
                z = false;
                C2289a.m8311a(z);
                j2 = 0;
                if (j == 0) {
                    j2 = this.f10910d.m7395b(j);
                }
                this.f10914h = j2;
                this.f10911e = 2;
                m13588b();
                return this.f10914h;
            }
        }
        z = true;
        C2289a.m8311a(z);
        j2 = 0;
        if (j == 0) {
            j2 = this.f10910d.m7395b(j);
        }
        this.f10914h = j2;
        this.f10911e = 2;
        m13588b();
        return this.f10914h;
    }

    /* renamed from: a */
    public C3609a m13586a() {
        return this.f10912f != 0 ? new C3609a() : null;
    }

    /* renamed from: b */
    public void m13588b() {
        this.f10915i = this.f10908b;
        this.f10916j = this.f10909c;
        this.f10917k = 0;
        this.f10918l = this.f10912f;
    }

    /* renamed from: a */
    public long m13583a(long j, ExtractorInput extractorInput) throws IOException, InterruptedException {
        ExtractorInput extractorInput2 = extractorInput;
        long j2 = 2;
        if (this.f10915i == this.f10916j) {
            return -(r0.f10917k + 2);
        }
        long position = extractorInput.getPosition();
        if (m13587a(extractorInput2, r0.f10916j)) {
            r0.f10907a.m7383a(extractorInput2, false);
            extractorInput.resetPeekPosition();
            long j3 = j - r0.f10907a.f5649c;
            int i = r0.f10907a.f5654h + r0.f10907a.f5655i;
            if (j3 >= 0) {
                if (j3 <= 72000) {
                    extractorInput2.skipFully(i);
                    return -(r0.f10907a.f5649c + 2);
                }
            }
            if (j3 < 0) {
                r0.f10916j = position;
                r0.f10918l = r0.f10907a.f5649c;
            } else {
                long j4 = (long) i;
                r0.f10915i = extractorInput.getPosition() + j4;
                r0.f10917k = r0.f10907a.f5649c;
                if ((r0.f10916j - r0.f10915i) + j4 < 100000) {
                    extractorInput2.skipFully(i);
                    return -(r0.f10917k + 2);
                }
            }
            if (r0.f10916j - r0.f10915i < 100000) {
                r0.f10916j = r0.f10915i;
                return r0.f10915i;
            }
            position = (long) i;
            if (j3 > 0) {
                j2 = 1;
            }
            return Math.min(Math.max((extractorInput.getPosition() - (position * j2)) + ((j3 * (r0.f10916j - r0.f10915i)) / (r0.f10918l - r0.f10917k)), r0.f10915i), r0.f10916j - 1);
        } else if (r0.f10915i != position) {
            return r0.f10915i;
        } else {
            throw new IOException("No ogg page can be found.");
        }
    }

    /* renamed from: a */
    private long m13577a(long j, long j2, long j3) {
        j2 = j + (((j2 * (this.f10909c - this.f10908b)) / this.f10912f) - j3);
        if (j2 < this.f10908b) {
            j2 = this.f10908b;
        }
        return j2 >= this.f10909c ? this.f10909c - 1 : j2;
    }

    /* renamed from: b */
    void m13589b(ExtractorInput extractorInput) throws IOException, InterruptedException {
        if (m13587a(extractorInput, this.f10909c) == null) {
            throw new EOFException();
        }
    }

    /* renamed from: a */
    boolean m13587a(ExtractorInput extractorInput, long j) throws IOException, InterruptedException {
        j = Math.min(j + 3, this.f10909c);
        byte[] bArr = new byte[ItemAnimator.FLAG_MOVED];
        int length = bArr.length;
        while (true) {
            int i;
            int i2 = 0;
            if (extractorInput.getPosition() + ((long) length) > j) {
                length = (int) (j - extractorInput.getPosition());
                if (length < 4) {
                    return false;
                }
            }
            extractorInput.peekFully(bArr, 0, length, false);
            while (true) {
                i = length - 3;
                if (i2 >= i) {
                    break;
                } else if (bArr[i2] == (byte) 79 && bArr[i2 + 1] == (byte) 103 && bArr[i2 + 2] == (byte) 103 && bArr[i2 + 3] == (byte) 83) {
                    extractorInput.skipFully(i2);
                    return true;
                } else {
                    i2++;
                }
            }
            extractorInput.skipFully(i);
        }
    }

    /* renamed from: c */
    long m13590c(ExtractorInput extractorInput) throws IOException, InterruptedException {
        m13589b(extractorInput);
        this.f10907a.m7382a();
        while ((this.f10907a.f5648b & 4) != 4 && extractorInput.getPosition() < this.f10909c) {
            this.f10907a.m7383a(extractorInput, false);
            extractorInput.skipFully(this.f10907a.f5654h + this.f10907a.f5655i);
        }
        return this.f10907a.f5649c;
    }

    /* renamed from: a */
    long m13585a(ExtractorInput extractorInput, long j, long j2) throws IOException, InterruptedException {
        this.f10907a.m7383a(extractorInput, false);
        while (this.f10907a.f5649c < j) {
            extractorInput.skipFully(this.f10907a.f5654h + this.f10907a.f5655i);
            j2 = this.f10907a.f5649c;
            this.f10907a.m7383a(extractorInput, false);
        }
        extractorInput.resetPeekPosition();
        return j2;
    }
}
