package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.Loader.Loadable;
import com.google.android.exoplayer2.util.C2314v;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

public final class ParsingLoadable<T> implements Loadable {
    /* renamed from: a */
    public final DataSpec f11666a;
    /* renamed from: b */
    public final int f11667b;
    /* renamed from: c */
    private final DataSource f11668c;
    /* renamed from: d */
    private final Parser<? extends T> f11669d;
    /* renamed from: e */
    private volatile T f11670e;
    /* renamed from: f */
    private volatile boolean f11671f;
    /* renamed from: g */
    private volatile long f11672g;

    public interface Parser<T> {
        T parse(Uri uri, InputStream inputStream) throws IOException;
    }

    public ParsingLoadable(DataSource dataSource, Uri uri, int i, Parser<? extends T> parser) {
        this(dataSource, new DataSpec(uri, 3), i, (Parser) parser);
    }

    public ParsingLoadable(DataSource dataSource, DataSpec dataSpec, int i, Parser<? extends T> parser) {
        this.f11668c = dataSource;
        this.f11666a = dataSpec;
        this.f11667b = i;
        this.f11669d = parser;
    }

    /* renamed from: a */
    public final T m14090a() {
        return this.f11670e;
    }

    /* renamed from: b */
    public long m14091b() {
        return this.f11672g;
    }

    public final void cancelLoad() {
        this.f11671f = true;
    }

    public final boolean isLoadCanceled() {
        return this.f11671f;
    }

    public final void load() throws IOException {
        Closeable c2279c = new C2279c(this.f11668c, this.f11666a);
        try {
            c2279c.m8249b();
            this.f11670e = this.f11669d.parse(this.f11668c.getUri(), c2279c);
        } finally {
            this.f11672g = c2279c.m8248a();
            C2314v.m8473a(c2279c);
        }
    }
}
