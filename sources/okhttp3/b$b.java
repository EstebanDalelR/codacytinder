package okhttp3;

import java.io.IOException;
import javax.annotation.Nullable;
import okhttp3.internal.cache.C15915c.C15914c;
import okio.BufferedSource;
import okio.C15976k;
import okio.C17704f;

class b$b extends C15968t {
    /* renamed from: a */
    final C15914c f54839a;
    /* renamed from: b */
    private final BufferedSource f54840b;
    @Nullable
    /* renamed from: c */
    private final String f54841c;
    @Nullable
    /* renamed from: d */
    private final String f54842d;

    b$b(final C15914c c15914c, String str, String str2) {
        this.f54839a = c15914c;
        this.f54841c = str;
        this.f54842d = str2;
        this.f54840b = C15976k.m60609a(new C17704f(this, c15914c.m60197a(1)) {
            /* renamed from: b */
            final /* synthetic */ b$b f57780b;

            public void close() throws IOException {
                c15914c.close();
                super.close();
            }
        });
    }

    public C15958m contentType() {
        return this.f54841c != null ? C15958m.m60479a(this.f54841c) : null;
    }

    public long contentLength() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = -1;
        r2 = r4.f54842d;	 Catch:{ NumberFormatException -> 0x000e }
        if (r2 == 0) goto L_0x000d;	 Catch:{ NumberFormatException -> 0x000e }
    L_0x0006:
        r2 = r4.f54842d;	 Catch:{ NumberFormatException -> 0x000e }
        r2 = java.lang.Long.parseLong(r2);	 Catch:{ NumberFormatException -> 0x000e }
        r0 = r2;
    L_0x000d:
        return r0;
    L_0x000e:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.b$b.contentLength():long");
    }

    public BufferedSource source() {
        return this.f54840b;
    }
}
