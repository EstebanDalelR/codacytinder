package com.google.android.exoplayer2.extractor.p062c;

import android.util.Log;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2302k;
import com.google.android.exoplayer2.util.C2314v;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.extractor.c.c */
final class C2071c {

    /* renamed from: com.google.android.exoplayer2.extractor.c.c$a */
    private static final class C2070a {
        /* renamed from: a */
        public final int f5704a;
        /* renamed from: b */
        public final long f5705b;

        private C2070a(int i, long j) {
            this.f5704a = i;
            this.f5705b = j;
        }

        /* renamed from: a */
        public static C2070a m7414a(ExtractorInput extractorInput, C2302k c2302k) throws IOException, InterruptedException {
            extractorInput.peekFully(c2302k.f6929a, 0, 8);
            c2302k.m8388c(0);
            return new C2070a(c2302k.m8403o(), c2302k.m8402n());
        }
    }

    /* renamed from: a */
    public static C3621b m7415a(ExtractorInput extractorInput) throws IOException, InterruptedException {
        C2289a.m8309a((Object) extractorInput);
        C2302k c2302k = new C2302k(16);
        if (C2070a.m7414a(extractorInput, c2302k).f5704a != C2314v.m8499g("RIFF")) {
            return null;
        }
        int i = 4;
        extractorInput.peekFully(c2302k.f6929a, 0, 4);
        c2302k.m8388c(0);
        int o = c2302k.m8403o();
        if (o != C2314v.m8499g("WAVE")) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unsupported RIFF format: ");
            stringBuilder.append(o);
            Log.e("WavHeaderReader", stringBuilder.toString());
            return null;
        }
        C2070a a = C2070a.m7414a(extractorInput, c2302k);
        while (a.f5704a != C2314v.m8499g("fmt ")) {
            extractorInput.advancePeekPosition((int) a.f5705b);
            a = C2070a.m7414a(extractorInput, c2302k);
        }
        C2289a.m8313b(a.f5705b >= 16);
        extractorInput.peekFully(c2302k.f6929a, 0, 16);
        c2302k.m8388c(0);
        int i2 = c2302k.m8397i();
        int i3 = c2302k.m8397i();
        int v = c2302k.m8410v();
        int v2 = c2302k.m8410v();
        int i4 = c2302k.m8397i();
        int i5 = c2302k.m8397i();
        int i6 = (i3 * i5) / 8;
        if (i4 != i6) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Expected block alignment: ");
            stringBuilder2.append(i6);
            stringBuilder2.append("; got: ");
            stringBuilder2.append(i4);
            throw new ParserException(stringBuilder2.toString());
        }
        int i7;
        if (i2 != 1) {
            if (i2 == 3) {
                if (i5 != 32) {
                    i = 0;
                }
                i7 = i;
                if (i7 != 0) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Unsupported WAV bit depth ");
                    stringBuilder.append(i5);
                    stringBuilder.append(" for type ");
                    stringBuilder.append(i2);
                    Log.e("WavHeaderReader", stringBuilder.toString());
                    return null;
                }
                extractorInput.advancePeekPosition(((int) a.f5705b) - 16);
                return new C3621b(i3, v, v2, i4, i5, i7);
            } else if (i2 != 65534) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported WAV format type: ");
                stringBuilder.append(i2);
                Log.e("WavHeaderReader", stringBuilder.toString());
                return null;
            }
        }
        i7 = C2314v.m8482b(i5);
        if (i7 != 0) {
            extractorInput.advancePeekPosition(((int) a.f5705b) - 16);
            return new C3621b(i3, v, v2, i4, i5, i7);
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported WAV bit depth ");
        stringBuilder.append(i5);
        stringBuilder.append(" for type ");
        stringBuilder.append(i2);
        Log.e("WavHeaderReader", stringBuilder.toString());
        return null;
    }

    /* renamed from: a */
    public static void m7416a(ExtractorInput extractorInput, C3621b c3621b) throws IOException, InterruptedException {
        C2289a.m8309a((Object) extractorInput);
        C2289a.m8309a((Object) c3621b);
        extractorInput.resetPeekPosition();
        C2302k c2302k = new C2302k(8);
        C2070a a = C2070a.m7414a(extractorInput, c2302k);
        while (a.f5704a != C2314v.m8499g(ManagerWebServices.FB_DATA)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Ignoring unknown WAV chunk: ");
            stringBuilder.append(a.f5704a);
            Log.w("WavHeaderReader", stringBuilder.toString());
            long j = a.f5705b + 8;
            if (a.f5704a == C2314v.m8499g("RIFF")) {
                j = 12;
            }
            if (j > 2147483647L) {
                c3621b = new StringBuilder();
                c3621b.append("Chunk is too large (~2GB+) to skip; id: ");
                c3621b.append(a.f5704a);
                throw new ParserException(c3621b.toString());
            }
            extractorInput.skipFully((int) j);
            a = C2070a.m7414a(extractorInput, c2302k);
        }
        extractorInput.skipFully(8);
        c3621b.m13631a(extractorInput.getPosition(), a.f5705b);
    }
}
