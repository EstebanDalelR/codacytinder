package okhttp3.internal.http;

import javax.annotation.Nullable;
import okhttp3.C15958m;
import okhttp3.C15968t;
import okio.BufferedSource;

/* renamed from: okhttp3.internal.http.g */
public final class C17663g extends C15968t {
    @Nullable
    /* renamed from: a */
    private final String f54914a;
    /* renamed from: b */
    private final long f54915b;
    /* renamed from: c */
    private final BufferedSource f54916c;

    public C17663g(@Nullable String str, long j, BufferedSource bufferedSource) {
        this.f54914a = str;
        this.f54915b = j;
        this.f54916c = bufferedSource;
    }

    public C15958m contentType() {
        return this.f54914a != null ? C15958m.m60479a(this.f54914a) : null;
    }

    public long contentLength() {
        return this.f54915b;
    }

    public BufferedSource source() {
        return this.f54916c;
    }
}
