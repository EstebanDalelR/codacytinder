package com.tinder.scarlet;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u000e\u000fJ\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u0010"}, d2 = {"Lcom/tinder/scarlet/WebSocket;", "", "cancel", "", "close", "", "shutdownReason", "Lcom/tinder/scarlet/ShutdownReason;", "open", "Lcom/tinder/scarlet/Stream;", "Lcom/tinder/scarlet/WebSocket$Event;", "send", "message", "Lcom/tinder/scarlet/Message;", "Event", "Factory", "scarlet-core"}, k = 1, mv = {1, 1, 9})
public interface WebSocket {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/tinder/scarlet/WebSocket$Factory;", "", "create", "Lcom/tinder/scarlet/WebSocket;", "scarlet-core"}, k = 1, mv = {1, 1, 9})
    public interface Factory {
        @NotNull
        WebSocket create();
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/tinder/scarlet/WebSocket$Event;", "", "()V", "OnConnectionClosed", "OnConnectionClosing", "OnConnectionFailed", "OnConnectionOpened", "OnMessageReceived", "Lcom/tinder/scarlet/WebSocket$Event$OnConnectionOpened;", "Lcom/tinder/scarlet/WebSocket$Event$OnMessageReceived;", "Lcom/tinder/scarlet/WebSocket$Event$OnConnectionClosing;", "Lcom/tinder/scarlet/WebSocket$Event$OnConnectionClosed;", "Lcom/tinder/scarlet/WebSocket$Event$OnConnectionFailed;", "scarlet-core"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.WebSocket$a */
    public static abstract class C14786a {

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tinder/scarlet/WebSocket$Event$OnConnectionClosed;", "Lcom/tinder/scarlet/WebSocket$Event;", "shutdownReason", "Lcom/tinder/scarlet/ShutdownReason;", "(Lcom/tinder/scarlet/ShutdownReason;)V", "getShutdownReason", "()Lcom/tinder/scarlet/ShutdownReason;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "scarlet-core"}, k = 1, mv = {1, 1, 9})
        /* renamed from: com.tinder.scarlet.WebSocket$a$a */
        public static final class C16492a extends C14786a {
            @NotNull
            /* renamed from: a */
            private final C14796f f51168a;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C16492a) {
                        if (C2668g.a(this.f51168a, ((C16492a) obj).f51168a)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                C14796f c14796f = this.f51168a;
                return c14796f != null ? c14796f.hashCode() : 0;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("OnConnectionClosed(shutdownReason=");
                stringBuilder.append(this.f51168a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public C16492a(@NotNull C14796f c14796f) {
                C2668g.b(c14796f, "shutdownReason");
                super();
                this.f51168a = c14796f;
            }

            @NotNull
            /* renamed from: a */
            public final C14796f m61918a() {
                return this.f51168a;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tinder/scarlet/WebSocket$Event$OnConnectionClosing;", "Lcom/tinder/scarlet/WebSocket$Event;", "shutdownReason", "Lcom/tinder/scarlet/ShutdownReason;", "(Lcom/tinder/scarlet/ShutdownReason;)V", "getShutdownReason", "()Lcom/tinder/scarlet/ShutdownReason;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "scarlet-core"}, k = 1, mv = {1, 1, 9})
        /* renamed from: com.tinder.scarlet.WebSocket$a$b */
        public static final class C16493b extends C14786a {
            @NotNull
            /* renamed from: a */
            private final C14796f f51169a;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C16493b) {
                        if (C2668g.a(this.f51169a, ((C16493b) obj).f51169a)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                C14796f c14796f = this.f51169a;
                return c14796f != null ? c14796f.hashCode() : 0;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("OnConnectionClosing(shutdownReason=");
                stringBuilder.append(this.f51169a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public C16493b(@NotNull C14796f c14796f) {
                C2668g.b(c14796f, "shutdownReason");
                super();
                this.f51169a = c14796f;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tinder/scarlet/WebSocket$Event$OnConnectionFailed;", "Lcom/tinder/scarlet/WebSocket$Event;", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "scarlet-core"}, k = 1, mv = {1, 1, 9})
        /* renamed from: com.tinder.scarlet.WebSocket$a$c */
        public static final class C16494c extends C14786a {
            @NotNull
            /* renamed from: a */
            private final Throwable f51170a;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C16494c) {
                        if (C2668g.a(this.f51170a, ((C16494c) obj).f51170a)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                Throwable th = this.f51170a;
                return th != null ? th.hashCode() : 0;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("OnConnectionFailed(throwable=");
                stringBuilder.append(this.f51170a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public C16494c(@NotNull Throwable th) {
                C2668g.b(th, "throwable");
                super();
                this.f51170a = th;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/tinder/scarlet/WebSocket$Event$OnConnectionOpened;", "WEB_SOCKET", "", "Lcom/tinder/scarlet/WebSocket$Event;", "webSocket", "(Ljava/lang/Object;)V", "getWebSocket", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/tinder/scarlet/WebSocket$Event$OnConnectionOpened;", "equals", "", "other", "hashCode", "", "toString", "", "scarlet-core"}, k = 1, mv = {1, 1, 9})
        /* renamed from: com.tinder.scarlet.WebSocket$a$d */
        public static final class C16495d<WEB_SOCKET> extends C14786a {
            @NotNull
            /* renamed from: a */
            private final WEB_SOCKET f51171a;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C16495d) {
                        if (C2668g.a(this.f51171a, ((C16495d) obj).f51171a)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                Object obj = this.f51171a;
                return obj != null ? obj.hashCode() : 0;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("OnConnectionOpened(webSocket=");
                stringBuilder.append(this.f51171a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public C16495d(@NotNull WEB_SOCKET web_socket) {
                C2668g.b(web_socket, "webSocket");
                super();
                this.f51171a = web_socket;
            }

            @NotNull
            /* renamed from: a */
            public final WEB_SOCKET m61919a() {
                return this.f51171a;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tinder/scarlet/WebSocket$Event$OnMessageReceived;", "Lcom/tinder/scarlet/WebSocket$Event;", "message", "Lcom/tinder/scarlet/Message;", "(Lcom/tinder/scarlet/Message;)V", "getMessage", "()Lcom/tinder/scarlet/Message;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "scarlet-core"}, k = 1, mv = {1, 1, 9})
        /* renamed from: com.tinder.scarlet.WebSocket$a$e */
        public static final class C16496e extends C14786a {
            @NotNull
            /* renamed from: a */
            private final C14789c f51172a;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C16496e) {
                        if (C2668g.a(this.f51172a, ((C16496e) obj).f51172a)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                C14789c c14789c = this.f51172a;
                return c14789c != null ? c14789c.hashCode() : 0;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("OnMessageReceived(message=");
                stringBuilder.append(this.f51172a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public C16496e(@NotNull C14789c c14789c) {
                C2668g.b(c14789c, "message");
                super();
                this.f51172a = c14789c;
            }

            @NotNull
            /* renamed from: a */
            public final C14789c m61920a() {
                return this.f51172a;
            }
        }

        private C14786a() {
        }
    }

    void cancel();

    boolean close(@NotNull C14796f c14796f);

    @NotNull
    Stream<C14786a> open();

    boolean send(@NotNull C14789c c14789c);
}
