package com.tinder.scarlet.websocket.okhttp;

import com.tinder.scarlet.WebSocket.Factory;
import com.tinder.scarlet.websocket.okhttp.OkHttpWebSocket.C16551a;
import com.tinder.scarlet.websocket.okhttp.request.RequestFactory;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.C2668g;
import okhttp3.C17692o;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"newWebSocketFactory", "Lcom/tinder/scarlet/WebSocket$Factory;", "Lokhttp3/OkHttpClient;", "requestFactory", "Lcom/tinder/scarlet/websocket/okhttp/request/RequestFactory;", "url", "", "scarlet-websocket-okhttp"}, k = 2, mv = {1, 1, 9})
@JvmName(name = "OkHttpClientUtils")
/* renamed from: com.tinder.scarlet.websocket.okhttp.a */
public final class C14823a {
    @NotNull
    /* renamed from: a */
    public static final Factory m56174a(@NotNull C17692o c17692o, @NotNull RequestFactory requestFactory) {
        C2668g.b(c17692o, "$receiver");
        C2668g.b(requestFactory, "requestFactory");
        return new C16551a(new C16553b(c17692o, requestFactory));
    }
}
