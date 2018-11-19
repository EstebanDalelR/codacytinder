package com.google.android.exoplayer2.upstream;

import android.content.Context;
import com.google.android.exoplayer2.upstream.DataSource.Factory;

/* renamed from: com.google.android.exoplayer2.upstream.g */
public final class C3724g implements Factory {
    /* renamed from: a */
    private final Context f11757a;
    /* renamed from: b */
    private final TransferListener<? super DataSource> f11758b;
    /* renamed from: c */
    private final Factory f11759c;

    public /* synthetic */ DataSource createDataSource() {
        return m14148a();
    }

    public C3724g(Context context, String str, TransferListener<? super DataSource> transferListener) {
        this(context, (TransferListener) transferListener, new C4388i(str, transferListener));
    }

    public C3724g(Context context, TransferListener<? super DataSource> transferListener, Factory factory) {
        this.f11757a = context.getApplicationContext();
        this.f11758b = transferListener;
        this.f11759c = factory;
    }

    /* renamed from: a */
    public C3723f m14148a() {
        return new C3723f(this.f11757a, this.f11758b, this.f11759c.createDataSource());
    }
}
