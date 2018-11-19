package com.tinder.scarlet.websocket.okhttp;

import com.tinder.api.ManagerWebServices;
import com.tinder.scarlet.C14789c.C16513a;
import com.tinder.scarlet.C14789c.C16514b;
import com.tinder.scarlet.C14796f;
import com.tinder.scarlet.WebSocket.C14786a;
import com.tinder.scarlet.WebSocket.C14786a.C16492a;
import com.tinder.scarlet.WebSocket.C14786a.C16493b;
import com.tinder.scarlet.WebSocket.C14786a.C16494c;
import com.tinder.scarlet.WebSocket.C14786a.C16495d;
import com.tinder.scarlet.WebSocket.C14786a.C16496e;
import io.reactivex.C3957b;
import io.reactivex.processors.C18430a;
import io.reactivex.processors.PublishProcessor;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import okhttp3.C15966s;
import okhttp3.C15970v;
import okhttp3.WebSocket;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bJ \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J \u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\"\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0010H\u0016J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0006\u0010\u001c\u001a\u00020\nR\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/tinder/scarlet/websocket/okhttp/OkHttpWebSocketEventObserver;", "Lokhttp3/WebSocketListener;", "()V", "processor", "Lio/reactivex/processors/FlowableProcessor;", "Lcom/tinder/scarlet/WebSocket$Event;", "kotlin.jvm.PlatformType", "observe", "Lio/reactivex/Flowable;", "onClosed", "", "webSocket", "Lokhttp3/WebSocket;", "code", "", "reason", "", "onClosing", "onFailure", "t", "", "response", "Lokhttp3/Response;", "onMessage", "text", "bytes", "Lokio/ByteString;", "onOpen", "terminate", "scarlet-websocket-okhttp"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.scarlet.websocket.okhttp.c */
public final class C16554c extends C15970v {
    /* renamed from: a */
    private final C18430a<C14786a> f51241a = PublishProcessor.m67663q().m66603u();

    @NotNull
    /* renamed from: a */
    public final C3957b<C14786a> m61974a() {
        C18430a c18430a = this.f51241a;
        C2668g.a(c18430a, "processor");
        return c18430a;
    }

    /* renamed from: b */
    public final void m61980b() {
        this.f51241a.onComplete();
    }

    /* renamed from: a */
    public void mo12270a(@NotNull WebSocket webSocket, @NotNull C15966s c15966s) {
        C2668g.b(webSocket, "webSocket");
        C2668g.b(c15966s, "response");
        this.f51241a.onNext(new C16495d(webSocket));
    }

    /* renamed from: a */
    public void mo12271a(@NotNull WebSocket webSocket, @NotNull ByteString byteString) {
        C2668g.b(webSocket, "webSocket");
        C2668g.b(byteString, "bytes");
        webSocket = this.f51241a;
        byteString = byteString.mo13433i();
        C2668g.a(byteString, "bytes.toByteArray()");
        webSocket.onNext(new C16496e(new C16513a(byteString)));
    }

    /* renamed from: a */
    public void mo12268a(@NotNull WebSocket webSocket, @NotNull String str) {
        C2668g.b(webSocket, "webSocket");
        C2668g.b(str, ManagerWebServices.PARAM_TEXT);
        this.f51241a.onNext(new C16496e(new C16514b(str)));
    }

    /* renamed from: a */
    public void mo12267a(@NotNull WebSocket webSocket, int i, @NotNull String str) {
        C2668g.b(webSocket, "webSocket");
        C2668g.b(str, "reason");
        this.f51241a.onNext(new C16493b(new C14796f(i, str)));
    }

    /* renamed from: b */
    public void mo12272b(@NotNull WebSocket webSocket, int i, @NotNull String str) {
        C2668g.b(webSocket, "webSocket");
        C2668g.b(str, "reason");
        this.f51241a.onNext(new C16492a(new C14796f(i, str)));
    }

    /* renamed from: a */
    public void mo12269a(@NotNull WebSocket webSocket, @NotNull Throwable th, @Nullable C15966s c15966s) {
        C2668g.b(webSocket, "webSocket");
        C2668g.b(th, "t");
        this.f51241a.onNext(new C16494c(th));
    }
}
