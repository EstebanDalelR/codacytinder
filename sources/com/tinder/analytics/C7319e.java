package com.tinder.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.at;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Single;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u000f\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/analytics/AppCloseEventDispatcher;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/analytics/AppCloseEventDispatcher$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "createEvent", "Lrx/Single;", "Lcom/tinder/etl/event/AppCloseEvent;", "request", "execute", "", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.analytics.e */
public final class C7319e implements VoidUseCase<C6218a> {
    /* renamed from: a */
    private final C2630h f26440a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/analytics/AppCloseEventDispatcher$Request;", "", "isCrash", "", "isRegistered", "sessionLengthInSecs", "", "(ZZI)V", "()Z", "getSessionLengthInSecs", "()I", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.analytics.e$a */
    public static final class C6218a {
        /* renamed from: a */
        private final boolean f22780a;
        /* renamed from: b */
        private final boolean f22781b;
        /* renamed from: c */
        private final int f22782c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C6218a) {
                C6218a c6218a = (C6218a) obj;
                if ((this.f22780a == c6218a.f22780a ? 1 : null) != null) {
                    if ((this.f22781b == c6218a.f22781b ? 1 : null) != null) {
                        if ((this.f22782c == c6218a.f22782c ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            int i = this.f22780a;
            int i2 = 1;
            if (i != 0) {
                i = 1;
            }
            i *= 31;
            boolean z = this.f22781b;
            if (!z) {
                i2 = z;
            }
            return ((i + i2) * 31) + this.f22782c;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(isCrash=");
            stringBuilder.append(this.f22780a);
            stringBuilder.append(", isRegistered=");
            stringBuilder.append(this.f22781b);
            stringBuilder.append(", sessionLengthInSecs=");
            stringBuilder.append(this.f22782c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C6218a(boolean z, boolean z2, int i) {
            this.f22780a = z;
            this.f22781b = z2;
            this.f22782c = i;
        }

        /* renamed from: a */
        public final boolean m26846a() {
            return this.f22780a;
        }

        /* renamed from: b */
        public final boolean m26847b() {
            return this.f22781b;
        }

        /* renamed from: c */
        public final int m26848c() {
            return this.f22782c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/AppCloseEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.analytics.e$b */
    static final class C6219b<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C6218a f22783a;

        C6219b(C6218a c6218a) {
            this.f22783a = c6218a;
        }

        public /* synthetic */ Object call() {
            return m26849a();
        }

        /* renamed from: a */
        public final at m26849a() {
            return at.a().a(Boolean.valueOf(this.f22783a.m26846a())).b(Boolean.valueOf(this.f22783a.m26847b())).a(Integer.valueOf(this.f22783a.m26848c())).a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/etl/event/AppCloseEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.analytics.e$c */
    static final class C8003c<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C7319e f28627a;

        C8003c(C7319e c7319e) {
            this.f28627a = c7319e;
        }

        public /* synthetic */ Object call(Object obj) {
            m33901a((at) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m33901a(at atVar) {
            this.f28627a.f26440a.a(atVar);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.analytics.e$d */
    static final class C8134d implements Action0 {
        /* renamed from: a */
        public static final C8134d f29140a = new C8134d();

        C8134d() {
        }

        public final void call() {
            C0001a.b("AppCloseEvent successfully logged.", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.analytics.e$e */
    static final class C8135e<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C8135e f29141a = new C8135e();

        C8135e() {
        }

        public /* synthetic */ void call(Object obj) {
            m34538a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m34538a(Throwable th) {
            C0001a.c(th, "AppCloseEventDispatcher failed.", new Object[0]);
        }
    }

    @Inject
    public C7319e(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f26440a = c2630h;
    }

    public /* synthetic */ void execute(Object obj) {
        m31221a((C6218a) obj);
    }

    /* renamed from: a */
    public void m31221a(@NotNull C6218a c6218a) {
        C2668g.b(c6218a, "request");
        m31220b(c6218a).d(new C8003c(this)).b().b(Schedulers.io()).a(C8134d.f29140a, C8135e.f29141a);
    }

    /* renamed from: b */
    private final Single<at> m31220b(C6218a c6218a) {
        c6218a = Single.a(new C6219b(c6218a));
        C2668g.a(c6218a, "Single.fromCallable {\n  …InSecs).build()\n        }");
        return c6218a;
    }
}
