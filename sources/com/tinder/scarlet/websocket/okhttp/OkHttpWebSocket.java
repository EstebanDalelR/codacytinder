package com.tinder.scarlet.websocket.okhttp;

import com.tinder.scarlet.C14789c;
import com.tinder.scarlet.C14789c.C16513a;
import com.tinder.scarlet.C14789c.C16514b;
import com.tinder.scarlet.C14796f;
import com.tinder.scarlet.Stream;
import com.tinder.scarlet.WebSocket;
import com.tinder.scarlet.WebSocket.C14786a;
import com.tinder.scarlet.WebSocket.C14786a.C16492a;
import com.tinder.scarlet.WebSocket.C14786a.C16493b;
import com.tinder.scarlet.WebSocket.C14786a.C16494c;
import com.tinder.scarlet.WebSocket.C14786a.C16495d;
import com.tinder.scarlet.WebSocket.Factory;
import com.tinder.scarlet.utils.C14820d;
import io.reactivex.C3957b;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import okhttp3.C15970v;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Subscription;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0017J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0017J\b\u0010\u000f\u001a\u00020\nH\u0003J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/tinder/scarlet/websocket/okhttp/OkHttpWebSocket;", "Lcom/tinder/scarlet/WebSocket;", "okHttpWebSocketHolder", "Lcom/tinder/scarlet/websocket/okhttp/OkHttpWebSocketHolder;", "okHttpWebSocketEventObserver", "Lcom/tinder/scarlet/websocket/okhttp/OkHttpWebSocketEventObserver;", "connectionEstablisher", "Lcom/tinder/scarlet/websocket/okhttp/OkHttpWebSocket$ConnectionEstablisher;", "(Lcom/tinder/scarlet/websocket/okhttp/OkHttpWebSocketHolder;Lcom/tinder/scarlet/websocket/okhttp/OkHttpWebSocketEventObserver;Lcom/tinder/scarlet/websocket/okhttp/OkHttpWebSocket$ConnectionEstablisher;)V", "cancel", "", "close", "", "shutdownReason", "Lcom/tinder/scarlet/ShutdownReason;", "handleConnectionShutdown", "handleWebSocketEvent", "event", "Lcom/tinder/scarlet/WebSocket$Event;", "open", "Lcom/tinder/scarlet/Stream;", "send", "message", "Lcom/tinder/scarlet/Message;", "ConnectionEstablisher", "Factory", "scarlet-websocket-okhttp"}, k = 1, mv = {1, 1, 9})
public final class OkHttpWebSocket implements WebSocket {
    /* renamed from: a */
    private final C16555d f51236a;
    /* renamed from: b */
    private final C16554c f51237b;
    /* renamed from: c */
    private final ConnectionEstablisher f51238c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/scarlet/websocket/okhttp/OkHttpWebSocket$ConnectionEstablisher;", "", "establishConnection", "", "webSocketListener", "Lokhttp3/WebSocketListener;", "scarlet-websocket-okhttp"}, k = 1, mv = {1, 1, 9})
    public interface ConnectionEstablisher {
        void establishConnection(@NotNull C15970v c15970v);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/scarlet/websocket/okhttp/OkHttpWebSocket$Factory;", "Lcom/tinder/scarlet/WebSocket$Factory;", "connectionEstablisher", "Lcom/tinder/scarlet/websocket/okhttp/OkHttpWebSocket$ConnectionEstablisher;", "(Lcom/tinder/scarlet/websocket/okhttp/OkHttpWebSocket$ConnectionEstablisher;)V", "create", "Lcom/tinder/scarlet/WebSocket;", "scarlet-websocket-okhttp"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.websocket.okhttp.OkHttpWebSocket$a */
    public static final class C16551a implements Factory {
        /* renamed from: a */
        private final ConnectionEstablisher f51234a;

        public C16551a(@NotNull ConnectionEstablisher connectionEstablisher) {
            C2668g.b(connectionEstablisher, "connectionEstablisher");
            this.f51234a = connectionEstablisher;
        }

        @NotNull
        public WebSocket create() {
            return new OkHttpWebSocket(new C16555d(), new C16554c(), this.f51234a);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lorg/reactivestreams/Subscription;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.websocket.okhttp.OkHttpWebSocket$b */
    static final class C16552b<T> implements Consumer<Subscription> {
        /* renamed from: a */
        final /* synthetic */ OkHttpWebSocket f51235a;

        C16552b(OkHttpWebSocket okHttpWebSocket) {
            this.f51235a = okHttpWebSocket;
        }

        public /* synthetic */ void accept(Object obj) {
            m61968a((Subscription) obj);
        }

        /* renamed from: a */
        public final void m61968a(Subscription subscription) {
            this.f51235a.f51238c.establishConnection(this.f51235a.f51237b);
        }
    }

    public OkHttpWebSocket(@NotNull C16555d c16555d, @NotNull C16554c c16554c, @NotNull ConnectionEstablisher connectionEstablisher) {
        C2668g.b(c16555d, "okHttpWebSocketHolder");
        C2668g.b(c16554c, "okHttpWebSocketEventObserver");
        C2668g.b(connectionEstablisher, "connectionEstablisher");
        this.f51236a = c16555d;
        this.f51237b = c16554c;
        this.f51238c = connectionEstablisher;
    }

    @NotNull
    public Stream<C14786a> open() {
        C3957b a = this.f51237b.m61974a().b(new C16552b(this)).a(new C16556e(new OkHttpWebSocket$open$2(this)));
        C2668g.a(a, "okHttpWebSocketEventObse…is::handleWebSocketEvent)");
        return C14820d.m56166a(a);
    }

    public synchronized boolean send(@NotNull C14789c c14789c) {
        C2668g.b(c14789c, "message");
        if (c14789c instanceof C16514b) {
            c14789c = this.f51236a.send(((C16514b) c14789c).m61933a());
        } else if (c14789c instanceof C16513a) {
            c14789c = ((C16513a) c14789c).m61932a();
            ByteString a = ByteString.m60582a(c14789c, 0, c14789c.length);
            C16555d c16555d = this.f51236a;
            C2668g.a(a, "byteString");
            c14789c = c16555d.send(a);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return c14789c;
    }

    public synchronized boolean close(@NotNull C14796f c14796f) {
        C2668g.b(c14796f, "shutdownReason");
        return this.f51236a.close(c14796f.m56098d(), c14796f.m56099e());
    }

    public synchronized void cancel() {
        this.f51236a.cancel();
    }

    /* renamed from: a */
    private final void m61971a(C14786a c14786a) {
        if (c14786a instanceof C16495d) {
            C16555d c16555d = this.f51236a;
            c14786a = ((C16495d) c14786a).m61919a();
            if (c14786a == null) {
                throw new TypeCastException("null cannot be cast to non-null type okhttp3.WebSocket");
            }
            c16555d.m61983a((okhttp3.WebSocket) c14786a);
        } else if (c14786a instanceof C16493b) {
            close(C14796f.f46377a);
        } else {
            if (!(c14786a instanceof C16492a)) {
                if ((c14786a instanceof C16494c) == null) {
                    return;
                }
            }
            m61970a();
        }
    }

    /* renamed from: a */
    private final synchronized void m61970a() {
        this.f51236a.m61982a();
        this.f51237b.m61980b();
    }
}
