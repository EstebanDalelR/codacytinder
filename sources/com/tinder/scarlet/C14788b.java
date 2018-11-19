package com.tinder.scarlet;

import com.tinder.scarlet.Lifecycle.C14785a;
import com.tinder.scarlet.WebSocket.C14786a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/scarlet/Event;", "", "()V", "OnLifecycle", "OnRetry", "OnStateChange", "OnWebSocket", "Lcom/tinder/scarlet/Event$OnLifecycle;", "Lcom/tinder/scarlet/Event$OnWebSocket;", "Lcom/tinder/scarlet/Event$OnStateChange;", "Lcom/tinder/scarlet/Event$OnRetry;", "scarlet"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.scarlet.b */
public abstract class C14788b {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/scarlet/Event$OnLifecycle;", "Lcom/tinder/scarlet/Event;", "()V", "StateChange", "Terminate", "Lcom/tinder/scarlet/Event$OnLifecycle$StateChange;", "Lcom/tinder/scarlet/Event$OnLifecycle$Terminate;", "scarlet"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.b$a */
    public static abstract class C16504a extends C14788b {

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003B\u000f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/tinder/scarlet/Event$OnLifecycle$StateChange;", "T", "Lcom/tinder/scarlet/Lifecycle$State;", "Lcom/tinder/scarlet/Event$OnLifecycle;", "state", "(Lcom/tinder/scarlet/Lifecycle$State;)V", "getState", "()Lcom/tinder/scarlet/Lifecycle$State;", "Lcom/tinder/scarlet/Lifecycle$State;", "component1", "copy", "(Lcom/tinder/scarlet/Lifecycle$State;)Lcom/tinder/scarlet/Event$OnLifecycle$StateChange;", "equals", "", "other", "", "hashCode", "", "toString", "", "scarlet"}, k = 1, mv = {1, 1, 9})
        /* renamed from: com.tinder.scarlet.b$a$a */
        public static final class C18035a<T extends C14785a> extends C16504a {
            @NotNull
            /* renamed from: a */
            private final T f56035a;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C18035a) {
                        if (C2668g.a(this.f56035a, ((C18035a) obj).f56035a)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                C14785a c14785a = this.f56035a;
                return c14785a != null ? c14785a.hashCode() : 0;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("StateChange(state=");
                stringBuilder.append(this.f56035a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public C18035a(@NotNull T t) {
                C2668g.b(t, "state");
                super();
                this.f56035a = t;
            }

            @NotNull
            /* renamed from: a */
            public final T m65500a() {
                return this.f56035a;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/scarlet/Event$OnLifecycle$Terminate;", "Lcom/tinder/scarlet/Event$OnLifecycle;", "()V", "scarlet"}, k = 1, mv = {1, 1, 9})
        /* renamed from: com.tinder.scarlet.b$a$b */
        public static final class C18036b extends C16504a {
            /* renamed from: a */
            public static final C18036b f56036a = new C18036b();

            private C18036b() {
                super();
            }
        }

        private C16504a() {
            super();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/scarlet/Event$OnRetry;", "Lcom/tinder/scarlet/Event;", "()V", "scarlet"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.b$b */
    public static final class C16505b extends C14788b {
        /* renamed from: a */
        public static final C16505b f51178a = new C16505b();

        private C16505b() {
            super();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003B\u000f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/tinder/scarlet/Event$OnStateChange;", "T", "Lcom/tinder/scarlet/State;", "Lcom/tinder/scarlet/Event;", "state", "(Lcom/tinder/scarlet/State;)V", "getState", "()Lcom/tinder/scarlet/State;", "Lcom/tinder/scarlet/State;", "component1", "copy", "(Lcom/tinder/scarlet/State;)Lcom/tinder/scarlet/Event$OnStateChange;", "equals", "", "other", "", "hashCode", "", "toString", "", "scarlet"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.b$c */
    public static final class C16506c<T extends C14797g> extends C14788b {
        @NotNull
        /* renamed from: a */
        private final T f51179a;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C16506c) {
                    if (C2668g.a(this.f51179a, ((C16506c) obj).f51179a)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C14797g c14797g = this.f51179a;
            return c14797g != null ? c14797g.hashCode() : 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("OnStateChange(state=");
            stringBuilder.append(this.f51179a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C16506c(@NotNull T t) {
            C2668g.b(t, "state");
            super();
            this.f51179a = t;
        }

        @NotNull
        /* renamed from: a */
        public final T m61928a() {
            return this.f51179a;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/scarlet/Event$OnWebSocket;", "Lcom/tinder/scarlet/Event;", "()V", "Event", "Terminate", "Lcom/tinder/scarlet/Event$OnWebSocket$Event;", "Lcom/tinder/scarlet/Event$OnWebSocket$Terminate;", "scarlet"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.b$d */
    public static abstract class C16507d extends C14788b {

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003B\u000f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/tinder/scarlet/Event$OnWebSocket$Event;", "T", "Lcom/tinder/scarlet/WebSocket$Event;", "Lcom/tinder/scarlet/Event$OnWebSocket;", "event", "(Lcom/tinder/scarlet/WebSocket$Event;)V", "getEvent", "()Lcom/tinder/scarlet/WebSocket$Event;", "Lcom/tinder/scarlet/WebSocket$Event;", "component1", "copy", "(Lcom/tinder/scarlet/WebSocket$Event;)Lcom/tinder/scarlet/Event$OnWebSocket$Event;", "equals", "", "other", "", "hashCode", "", "toString", "", "scarlet"}, k = 1, mv = {1, 1, 9})
        /* renamed from: com.tinder.scarlet.b$d$a */
        public static final class C18037a<T extends C14786a> extends C16507d {
            @NotNull
            /* renamed from: a */
            private final T f56037a;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C18037a) {
                        if (C2668g.a(this.f56037a, ((C18037a) obj).f56037a)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                C14786a c14786a = this.f56037a;
                return c14786a != null ? c14786a.hashCode() : 0;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Event(event=");
                stringBuilder.append(this.f56037a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public C18037a(@NotNull T t) {
                C2668g.b(t, "event");
                super();
                this.f56037a = t;
            }

            @NotNull
            /* renamed from: a */
            public final T m65501a() {
                return this.f56037a;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/scarlet/Event$OnWebSocket$Terminate;", "Lcom/tinder/scarlet/Event$OnWebSocket;", "()V", "scarlet"}, k = 1, mv = {1, 1, 9})
        /* renamed from: com.tinder.scarlet.b$d$b */
        public static final class C18038b extends C16507d {
            /* renamed from: a */
            public static final C18038b f56038a = new C18038b();

            private C18038b() {
                super();
            }
        }

        private C16507d() {
            super();
        }
    }

    private C14788b() {
    }
}
