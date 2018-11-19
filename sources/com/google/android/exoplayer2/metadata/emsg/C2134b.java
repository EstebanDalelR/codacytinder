package com.google.android.exoplayer2.metadata.emsg;

import android.support.annotation.Nullable;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2314v;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.metadata.emsg.b */
public final class C2134b {
    /* renamed from: a */
    private final ByteArrayOutputStream f6130a = new ByteArrayOutputStream(512);
    /* renamed from: b */
    private final DataOutputStream f6131b = new DataOutputStream(this.f6130a);

    @Nullable
    /* renamed from: a */
    public byte[] m7687a(EventMessage eventMessage, long j) {
        C2289a.m8311a(j >= 0);
        this.f6130a.reset();
        try {
            C2134b.m7686a(this.f6131b, eventMessage.schemeIdUri);
            C2134b.m7686a(this.f6131b, eventMessage.value != null ? eventMessage.value : "");
            C2134b.m7685a(this.f6131b, j);
            C2134b.m7685a(this.f6131b, C2314v.m8492d(eventMessage.presentationTimeUs, j, 1000000));
            C2134b.m7685a(this.f6131b, C2314v.m8492d(eventMessage.durationMs, j, 1000));
            C2134b.m7685a(this.f6131b, eventMessage.id);
            this.f6131b.write(eventMessage.messageData);
            this.f6131b.flush();
            return this.f6130a.toByteArray();
        } catch (EventMessage eventMessage2) {
            throw new RuntimeException(eventMessage2);
        }
    }

    /* renamed from: a */
    private static void m7686a(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(null);
    }

    /* renamed from: a */
    private static void m7685a(DataOutputStream dataOutputStream, long j) throws IOException {
        dataOutputStream.writeByte(((int) (j >>> 24)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 16)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 8)) & 255);
        dataOutputStream.writeByte(((int) j) & 255);
    }
}
