package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.C2302k;

abstract class TagPayloadReader {
    /* renamed from: a */
    protected final TrackOutput f5711a;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    protected abstract void mo2277a(C2302k c2302k, long j) throws ParserException;

    /* renamed from: a */
    protected abstract boolean mo2278a(C2302k c2302k) throws ParserException;

    protected TagPayloadReader(TrackOutput trackOutput) {
        this.f5711a = trackOutput;
    }

    /* renamed from: b */
    public final void m7424b(C2302k c2302k, long j) throws ParserException {
        if (mo2278a(c2302k)) {
            mo2277a(c2302k, j);
        }
    }
}
