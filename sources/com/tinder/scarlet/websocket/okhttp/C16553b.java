package com.tinder.scarlet.websocket.okhttp;

import com.tinder.scarlet.websocket.okhttp.OkHttpWebSocket.ConnectionEstablisher;
import com.tinder.scarlet.websocket.okhttp.request.RequestFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import okhttp3.C15970v;
import okhttp3.C17692o;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/scarlet/websocket/okhttp/OkHttpClientWebSocketConnectionEstablisher;", "Lcom/tinder/scarlet/websocket/okhttp/OkHttpWebSocket$ConnectionEstablisher;", "okHttpClient", "Lokhttp3/OkHttpClient;", "requestFactory", "Lcom/tinder/scarlet/websocket/okhttp/request/RequestFactory;", "(Lokhttp3/OkHttpClient;Lcom/tinder/scarlet/websocket/okhttp/request/RequestFactory;)V", "establishConnection", "", "webSocketListener", "Lokhttp3/WebSocketListener;", "scarlet-websocket-okhttp"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.scarlet.websocket.okhttp.b */
public final class C16553b implements ConnectionEstablisher {
    /* renamed from: a */
    private final C17692o f51239a;
    /* renamed from: b */
    private final RequestFactory f51240b;

    public C16553b(@NotNull C17692o c17692o, @NotNull RequestFactory requestFactory) {
        C2668g.b(c17692o, "okHttpClient");
        C2668g.b(requestFactory, "requestFactory");
        this.f51239a = c17692o;
        this.f51240b = requestFactory;
    }

    public void establishConnection(@NotNull C15970v c15970v) {
        C2668g.b(c15970v, "webSocketListener");
        this.f51239a.newWebSocket(this.f51240b.createRequest(), c15970v);
    }
}
