package okhttp3.internal.connection;

import java.io.IOException;
import okhttp3.C15963q;
import okhttp3.C15966s;
import okhttp3.C17692o;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.internal.http.C17662f;

/* renamed from: okhttp3.internal.connection.a */
public final class C17657a implements Interceptor {
    /* renamed from: a */
    public final C17692o f54883a;

    public C17657a(C17692o c17692o) {
        this.f54883a = c17692o;
    }

    public C15966s intercept(Chain chain) throws IOException {
        C17662f c17662f = (C17662f) chain;
        C15963q request = c17662f.request();
        C15921f a = c17662f.m64316a();
        return c17662f.m64317a(request, a, a.m60246a(this.f54883a, chain, request.m60527b().equals("GET") ^ 1), a.m60251c());
    }
}
