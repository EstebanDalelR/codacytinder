package com.google.android.exoplayer2.metadata.emsg;

import com.google.android.exoplayer2.metadata.C4243a;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataDecoder;
import com.google.android.exoplayer2.util.C2302k;
import com.google.android.exoplayer2.util.C2314v;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.metadata.emsg.a */
public final class C3667a implements MetadataDecoder {
    public Metadata decode(C4243a c4243a) {
        ByteBuffer byteBuffer = c4243a.b;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        C2302k c2302k = new C2302k(array, limit);
        String y = c2302k.m8413y();
        String y2 = c2302k.m8413y();
        long m = c2302k.m8401m();
        long d = C2314v.m8492d(c2302k.m8401m(), 1000000, m);
        long d2 = C2314v.m8492d(c2302k.m8401m(), 1000, m);
        long m2 = c2302k.m8401m();
        byte[] copyOfRange = Arrays.copyOfRange(array, c2302k.m8389d(), limit);
        return new Metadata(new EventMessage(y, y2, d2, m2, copyOfRange, d));
    }
}
