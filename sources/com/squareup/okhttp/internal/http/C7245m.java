package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.internal.C6058i;
import java.io.IOException;
import java.net.ProtocolException;
import okio.C15982q;
import okio.C18549c;
import okio.Sink;

/* renamed from: com.squareup.okhttp.internal.http.m */
public final class C7245m implements Sink {
    /* renamed from: a */
    private boolean f26138a;
    /* renamed from: b */
    private final int f26139b;
    /* renamed from: c */
    private final C18549c f26140c;

    public void flush() throws IOException {
    }

    public C7245m(int i) {
        this.f26140c = new C18549c();
        this.f26139b = i;
    }

    public C7245m() {
        this(-1);
    }

    public void close() throws IOException {
        if (!this.f26138a) {
            this.f26138a = true;
            if (this.f26140c.a() < ((long) this.f26139b)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("content-length promised ");
                stringBuilder.append(this.f26139b);
                stringBuilder.append(" bytes, but received ");
                stringBuilder.append(this.f26140c.a());
                throw new ProtocolException(stringBuilder.toString());
            }
        }
    }

    public void write(C18549c c18549c, long j) throws IOException {
        if (this.f26138a) {
            throw new IllegalStateException("closed");
        }
        C6058i.m26246a(c18549c.a(), 0, j);
        if (this.f26139b == -1 || this.f26140c.a() <= ((long) this.f26139b) - j) {
            this.f26140c.write(c18549c, j);
            return;
        }
        j = new StringBuilder();
        j.append("exceeded content-length limit of ");
        j.append(this.f26139b);
        j.append(" bytes");
        throw new ProtocolException(j.toString());
    }

    public C15982q timeout() {
        return C15982q.f49620c;
    }

    /* renamed from: a */
    public long m31040a() throws IOException {
        return this.f26140c.a();
    }

    /* renamed from: a */
    public void m31041a(Sink sink) throws IOException {
        C18549c c18549c = new C18549c();
        this.f26140c.a(c18549c, 0, this.f26140c.a());
        sink.write(c18549c, c18549c.a());
    }
}
