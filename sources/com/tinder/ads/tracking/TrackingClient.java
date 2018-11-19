package com.tinder.ads.tracking;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import okhttp3.C17692o;
import org.jetbrains.annotations.NotNull;
import rx.Completable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/ads/tracking/TrackingClient;", "", "okHttpClient", "Lokhttp3/OkHttpClient;", "(Lokhttp3/OkHttpClient;)V", "ping", "Lrx/Completable;", "url", "", "tracking_release"}, k = 1, mv = {1, 1, 7})
public final class TrackingClient {
    private final C17692o okHttpClient;

    public TrackingClient(@NotNull C17692o c17692o) {
        C2668g.b(c17692o, "okHttpClient");
        this.okHttpClient = c17692o;
    }

    @NotNull
    public final Completable ping(@NotNull String str) {
        C2668g.b(str, "url");
        str = Completable.a(new TrackingClient$ping$1(this, str));
        C2668g.a(str, "Completable.fromAction {…     call.execute()\n    }");
        return str;
    }
}
