package com.google.android.exoplayer2.extractor.mp4;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.C2302k;
import com.google.android.exoplayer2.util.C2314v;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.extractor.mp4.g */
final class C2100g {
    /* renamed from: a */
    private static final int[] f5932a = new int[]{C2314v.m8499g("isom"), C2314v.m8499g("iso2"), C2314v.m8499g("iso3"), C2314v.m8499g("iso4"), C2314v.m8499g("iso5"), C2314v.m8499g("iso6"), C2314v.m8499g("avc1"), C2314v.m8499g("hvc1"), C2314v.m8499g("hev1"), C2314v.m8499g("mp41"), C2314v.m8499g("mp42"), C2314v.m8499g("3g2a"), C2314v.m8499g("3g2b"), C2314v.m8499g("3gr6"), C2314v.m8499g("3gs6"), C2314v.m8499g("3ge6"), C2314v.m8499g("3gg6"), C2314v.m8499g("M4V "), C2314v.m8499g("M4A "), C2314v.m8499g("f4v "), C2314v.m8499g("kddi"), C2314v.m8499g("M4VP"), C2314v.m8499g("qt  "), C2314v.m8499g("MSNV")};

    /* renamed from: a */
    public static boolean m7521a(ExtractorInput extractorInput) throws IOException, InterruptedException {
        return C2100g.m7522a(extractorInput, true);
    }

    /* renamed from: b */
    public static boolean m7523b(ExtractorInput extractorInput) throws IOException, InterruptedException {
        return C2100g.m7522a(extractorInput, false);
    }

    /* renamed from: a */
    private static boolean m7522a(ExtractorInput extractorInput, boolean z) throws IOException, InterruptedException {
        boolean z2;
        ExtractorInput extractorInput2 = extractorInput;
        long length = extractorInput.getLength();
        long j = -1;
        if (length == -1 || length > PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            length = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        }
        int i = (int) length;
        C2302k c2302k = new C2302k(64);
        boolean z3 = false;
        int i2 = 0;
        Object obj = null;
        while (i2 < i) {
            c2302k.m8381a(8);
            extractorInput2.peekFully(c2302k.f6929a, 0, 8);
            long m = c2302k.m8401m();
            int o = c2302k.m8403o();
            int i3 = 16;
            if (m == 1) {
                extractorInput2.peekFully(c2302k.f6929a, 8, 8);
                c2302k.m8386b(16);
                m = c2302k.m8411w();
            } else {
                if (m == 0) {
                    long length2 = extractorInput.getLength();
                    if (length2 != j) {
                        m = (length2 - extractorInput.getPosition()) + ((long) 8);
                    }
                }
                i3 = 8;
            }
            long j2 = (long) i3;
            if (m >= j2) {
                i2 += i3;
                if (o != C2087a.f5815B) {
                    if (o != C2087a.f5824K) {
                        if (o != C2087a.f5826M) {
                            if ((((long) i2) + m) - j2 >= ((long) i)) {
                                break;
                            }
                            int i4 = (int) (m - j2);
                            i2 += i4;
                            if (o == C2087a.f5840a) {
                                if (i4 < 8) {
                                    return false;
                                }
                                c2302k.m8381a(i4);
                                extractorInput2.peekFully(c2302k.f6929a, 0, i4);
                                i4 /= 4;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if (i5 == 1) {
                                        c2302k.m8390d(4);
                                    } else if (C2100g.m7520a(c2302k.m8403o())) {
                                        obj = 1;
                                        break;
                                    }
                                }
                                if (obj == null) {
                                    return false;
                                }
                            } else if (i4 != 0) {
                                extractorInput2.advancePeekPosition(i4);
                            }
                            j = -1;
                        }
                    }
                    z2 = true;
                    break;
                }
            } else {
                return false;
            }
        }
        z2 = false;
        if (obj != null && z == r0) {
            z3 = true;
        }
        return z3;
    }

    /* renamed from: a */
    private static boolean m7520a(int i) {
        if ((i >>> 8) == C2314v.m8499g("3gp")) {
            return true;
        }
        for (int i2 : f5932a) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }
}
