package com.tinder.scarlet;

import io.reactivex.disposables.Disposable;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/tinder/scarlet/State;", "", "()V", "Connected", "Connecting", "Destroyed", "Disconnected", "Disconnecting", "WaitingToRetry", "Lcom/tinder/scarlet/State$WaitingToRetry;", "Lcom/tinder/scarlet/State$Connecting;", "Lcom/tinder/scarlet/State$Connected;", "Lcom/tinder/scarlet/State$Disconnecting;", "Lcom/tinder/scarlet/State$Disconnected;", "Lcom/tinder/scarlet/State$Destroyed;", "scarlet"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.scarlet.g */
public abstract class C14797g {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\bJ\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/tinder/scarlet/State$Connected;", "Lcom/tinder/scarlet/State;", "session", "Lcom/tinder/scarlet/Session;", "(Lcom/tinder/scarlet/Session;)V", "getSession$scarlet", "()Lcom/tinder/scarlet/Session;", "component1", "component1$scarlet", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "scarlet"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.g$a */
    public static final class C16515a extends C14797g {
        @NotNull
        /* renamed from: a */
        private final C14794e f51182a;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C16515a) {
                    if (C2668g.a(this.f51182a, ((C16515a) obj).f51182a)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C14794e c14794e = this.f51182a;
            return c14794e != null ? c14794e.hashCode() : 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Connected(session=");
            stringBuilder.append(this.f51182a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        @NotNull
        /* renamed from: a */
        public final C14794e m61934a() {
            return this.f51182a;
        }

        public C16515a(@NotNull C14794e c14794e) {
            C2668g.b(c14794e, "session");
            super();
            this.f51182a = c14794e;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\fJ\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/tinder/scarlet/State$Connecting;", "Lcom/tinder/scarlet/State;", "session", "Lcom/tinder/scarlet/Session;", "retryCount", "", "(Lcom/tinder/scarlet/Session;I)V", "getRetryCount", "()I", "getSession$scarlet", "()Lcom/tinder/scarlet/Session;", "component1", "component1$scarlet", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "scarlet"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.g$b */
    public static final class C16516b extends C14797g {
        @NotNull
        /* renamed from: a */
        private final C14794e f51183a;
        /* renamed from: b */
        private final int f51184b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C16516b) {
                C16516b c16516b = (C16516b) obj;
                if (C2668g.a(this.f51183a, c16516b.f51183a)) {
                    if ((this.f51184b == c16516b.f51184b ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            C14794e c14794e = this.f51183a;
            return ((c14794e != null ? c14794e.hashCode() : 0) * 31) + this.f51184b;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Connecting(session=");
            stringBuilder.append(this.f51183a);
            stringBuilder.append(", retryCount=");
            stringBuilder.append(this.f51184b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        @NotNull
        /* renamed from: a */
        public final C14794e m61935a() {
            return this.f51183a;
        }

        /* renamed from: b */
        public final int m61936b() {
            return this.f51184b;
        }

        public C16516b(@NotNull C14794e c14794e, int i) {
            C2668g.b(c14794e, "session");
            super();
            this.f51183a = c14794e;
            this.f51184b = i;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/scarlet/State$Destroyed;", "Lcom/tinder/scarlet/State;", "()V", "scarlet"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.g$c */
    public static final class C16517c extends C14797g {
        /* renamed from: a */
        public static final C16517c f51185a = new C16517c();

        private C16517c() {
            super();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/scarlet/State$Disconnected;", "Lcom/tinder/scarlet/State;", "()V", "scarlet"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.g$d */
    public static final class C16518d extends C14797g {
        /* renamed from: a */
        public static final C16518d f51186a = new C16518d();

        private C16518d() {
            super();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/scarlet/State$Disconnecting;", "Lcom/tinder/scarlet/State;", "()V", "scarlet"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.g$e */
    public static final class C16519e extends C14797g {
        /* renamed from: a */
        public static final C16519e f51187a = new C16519e();

        private C16519e() {
            super();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u000f\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0010J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/tinder/scarlet/State$WaitingToRetry;", "Lcom/tinder/scarlet/State;", "timerDisposable", "Lio/reactivex/disposables/Disposable;", "retryCount", "", "retryInMillis", "", "(Lio/reactivex/disposables/Disposable;IJ)V", "getRetryCount", "()I", "getRetryInMillis", "()J", "getTimerDisposable$scarlet", "()Lio/reactivex/disposables/Disposable;", "component1", "component1$scarlet", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "scarlet"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.g$f */
    public static final class C16520f extends C14797g {
        @NotNull
        /* renamed from: a */
        private final Disposable f51188a;
        /* renamed from: b */
        private final int f51189b;
        /* renamed from: c */
        private final long f51190c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C16520f) {
                C16520f c16520f = (C16520f) obj;
                if (C2668g.a(this.f51188a, c16520f.f51188a)) {
                    if ((this.f51189b == c16520f.f51189b ? 1 : null) != null) {
                        if ((this.f51190c == c16520f.f51190c ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            Disposable disposable = this.f51188a;
            int hashCode = (((disposable != null ? disposable.hashCode() : 0) * 31) + this.f51189b) * 31;
            long j = this.f51190c;
            return hashCode + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("WaitingToRetry(timerDisposable=");
            stringBuilder.append(this.f51188a);
            stringBuilder.append(", retryCount=");
            stringBuilder.append(this.f51189b);
            stringBuilder.append(", retryInMillis=");
            stringBuilder.append(this.f51190c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        @NotNull
        /* renamed from: a */
        public final Disposable m61937a() {
            return this.f51188a;
        }

        /* renamed from: b */
        public final int m61938b() {
            return this.f51189b;
        }

        public C16520f(@NotNull Disposable disposable, int i, long j) {
            C2668g.b(disposable, "timerDisposable");
            super();
            this.f51188a = disposable;
            this.f51189b = i;
            this.f51190c = j;
        }
    }

    private C14797g() {
    }
}
