package com.tinder.scarlet.websocket.okhttp;

import com.tinder.api.ManagerWebServices;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import okhttp3.C15963q;
import okhttp3.WebSocket;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0001J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0006\u0010\u0014\u001a\u00020\u0005R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/tinder/scarlet/websocket/okhttp/OkHttpWebSocketHolder;", "Lokhttp3/WebSocket;", "()V", "webSocket", "cancel", "", "close", "", "code", "", "reason", "", "initiate", "queueSize", "", "request", "send", "text", "bytes", "Lokio/ByteString;", "shutdown", "scarlet-websocket-okhttp"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.scarlet.websocket.okhttp.d */
public final class C16555d implements WebSocket {
    /* renamed from: a */
    private WebSocket f51242a;

    public /* synthetic */ long queueSize() {
        return ((Number) m61984b()).longValue();
    }

    public /* synthetic */ C15963q request() {
        return (C15963q) m61985c();
    }

    /* renamed from: a */
    public final void m61983a(@NotNull WebSocket webSocket) {
        C2668g.b(webSocket, "webSocket");
        this.f51242a = webSocket;
    }

    /* renamed from: a */
    public final void m61982a() {
        this.f51242a = (WebSocket) null;
    }

    @NotNull
    /* renamed from: b */
    public Void m61984b() {
        throw new UnsupportedOperationException();
    }

    @NotNull
    /* renamed from: c */
    public Void m61985c() {
        throw new UnsupportedOperationException();
    }

    public boolean send(@NotNull String str) {
        C2668g.b(str, ManagerWebServices.PARAM_TEXT);
        WebSocket webSocket = this.f51242a;
        return webSocket != null ? webSocket.send(str) : null;
    }

    public boolean send(@NotNull ByteString byteString) {
        C2668g.b(byteString, "bytes");
        WebSocket webSocket = this.f51242a;
        return webSocket != null ? webSocket.send(byteString) : null;
    }

    public boolean close(int i, @Nullable String str) {
        WebSocket webSocket = this.f51242a;
        return webSocket != null ? webSocket.close(i, str) : false;
    }

    public void cancel() {
        WebSocket webSocket = this.f51242a;
        if (webSocket != null) {
            webSocket.cancel();
        }
    }
}
