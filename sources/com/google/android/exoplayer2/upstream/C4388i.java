package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.upstream.HttpDataSource.C2275b;
import com.google.android.exoplayer2.upstream.HttpDataSource.C4266a;
import io.fabric.sdk.android.services.events.C15645a;

/* renamed from: com.google.android.exoplayer2.upstream.i */
public final class C4388i extends C4266a {
    /* renamed from: a */
    private final String f14553a;
    /* renamed from: b */
    private final TransferListener<? super DataSource> f14554b;
    /* renamed from: c */
    private final int f14555c;
    /* renamed from: d */
    private final int f14556d;
    /* renamed from: e */
    private final boolean f14557e;

    /* renamed from: b */
    protected /* synthetic */ HttpDataSource mo3741b(C2275b c2275b) {
        return m18132a(c2275b);
    }

    public C4388i(String str, TransferListener<? super DataSource> transferListener) {
        this(str, transferListener, C15645a.MAX_BYTE_SIZE_PER_FILE, C15645a.MAX_BYTE_SIZE_PER_FILE, false);
    }

    public C4388i(String str, TransferListener<? super DataSource> transferListener, int i, int i2, boolean z) {
        this.f14553a = str;
        this.f14554b = transferListener;
        this.f14555c = i;
        this.f14556d = i2;
        this.f14557e = z;
    }

    /* renamed from: a */
    protected C4268h m18132a(C2275b c2275b) {
        return new C4268h(this.f14553a, null, this.f14554b, this.f14555c, this.f14556d, this.f14557e, c2275b);
    }
}
