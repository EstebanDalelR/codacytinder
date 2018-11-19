package com.tinder.addy.ping;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import okhttp3.C15963q.C15962a;
import okhttp3.C17692o;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/addy/ping/PingClient;", "", "okHttpClient", "Lokhttp3/OkHttpClient;", "(Lokhttp3/OkHttpClient;)V", "ping", "Lrx/Completable;", "url", "", "addy_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.addy.ping.b */
public final class C6189b {
    /* renamed from: a */
    private final C17692o f22743a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.addy.ping.b$a */
    static final class C8119a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C6189b f29115a;
        /* renamed from: b */
        final /* synthetic */ String f29116b;

        C8119a(C6189b c6189b, String str) {
            this.f29115a = c6189b;
            this.f29116b = str;
        }

        public final void call() {
            this.f29115a.f22743a.newCall(new C15962a().a(this.f29116b).a().d()).execute();
        }
    }

    public C6189b(@NotNull C17692o c17692o) {
        C2668g.b(c17692o, "okHttpClient");
        this.f22743a = c17692o;
    }

    @NotNull
    /* renamed from: a */
    public final Completable m26802a(@NotNull String str) {
        C2668g.b(str, "url");
        str = Completable.a(new C8119a(this, str));
        C2668g.a(str, "Completable.fromAction {…     call.execute()\n    }");
        return str;
    }
}
