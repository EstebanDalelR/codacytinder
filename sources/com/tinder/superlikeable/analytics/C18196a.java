package com.tinder.superlikeable.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.etl.event.xn;
import com.tinder.superlikeable.analytics.AddSuperLikeableInteractEvent.Method;
import com.tinder.superlikeable.analytics.AddSuperLikeableInteractEvent.SuperLikeablePosition;
import com.tinder.superlikeable.analytics.AddSuperLikeableInteractEvent.Type;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/superlikeable/analytics/AddSuperLikeableGameInteractEvent;", "Lcom/tinder/superlikeable/analytics/AddSuperLikeableInteractEvent;", "Lcom/tinder/superlikeable/analytics/AddSuperLikeableGameInteractEvent$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "superLikeableAnalyticsFactory", "Lcom/tinder/superlikeable/analytics/SuperLikeableAnalyticsFactory;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/superlikeable/analytics/SuperLikeableAnalyticsFactory;)V", "execute", "", "request", "Request", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.superlikeable.analytics.a */
public final class C18196a extends AddSuperLikeableInteractEvent<C15091a> {
    /* renamed from: a */
    private final C2630h f56410a;
    /* renamed from: b */
    private final C15096f f56411b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, d2 = {"Lcom/tinder/superlikeable/analytics/AddSuperLikeableGameInteractEvent$Request;", "", "position", "", "superLikeableSessionId", "", "superLikeablePosition", "Lcom/tinder/superlikeable/analytics/AddSuperLikeableInteractEvent$SuperLikeablePosition;", "method", "Lcom/tinder/superlikeable/analytics/AddSuperLikeableInteractEvent$Method;", "(ILjava/lang/String;Lcom/tinder/superlikeable/analytics/AddSuperLikeableInteractEvent$SuperLikeablePosition;Lcom/tinder/superlikeable/analytics/AddSuperLikeableInteractEvent$Method;)V", "getMethod", "()Lcom/tinder/superlikeable/analytics/AddSuperLikeableInteractEvent$Method;", "getPosition", "()I", "getSuperLikeablePosition", "()Lcom/tinder/superlikeable/analytics/AddSuperLikeableInteractEvent$SuperLikeablePosition;", "getSuperLikeableSessionId", "()Ljava/lang/String;", "type", "Lcom/tinder/superlikeable/analytics/AddSuperLikeableInteractEvent$Type;", "getType", "()Lcom/tinder/superlikeable/analytics/AddSuperLikeableInteractEvent$Type;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.analytics.a$a */
    public static final class C15091a {
        @NotNull
        /* renamed from: a */
        private final Type f46944a = Type.SUPERLIKE;
        /* renamed from: b */
        private final int f46945b;
        @NotNull
        /* renamed from: c */
        private final String f46946c;
        @NotNull
        /* renamed from: d */
        private final SuperLikeablePosition f46947d;
        @Nullable
        /* renamed from: e */
        private final Method f46948e;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C15091a) {
                C15091a c15091a = (C15091a) obj;
                return (this.f46945b == c15091a.f46945b ? 1 : null) != null && C2668g.a(this.f46946c, c15091a.f46946c) && C2668g.a(this.f46947d, c15091a.f46947d) && C2668g.a(this.f46948e, c15091a.f46948e);
            }
        }

        public int hashCode() {
            int i = this.f46945b * 31;
            String str = this.f46946c;
            int i2 = 0;
            i = (i + (str != null ? str.hashCode() : 0)) * 31;
            SuperLikeablePosition superLikeablePosition = this.f46947d;
            i = (i + (superLikeablePosition != null ? superLikeablePosition.hashCode() : 0)) * 31;
            Method method = this.f46948e;
            if (method != null) {
                i2 = method.hashCode();
            }
            return i + i2;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(position=");
            stringBuilder.append(this.f46945b);
            stringBuilder.append(", superLikeableSessionId=");
            stringBuilder.append(this.f46946c);
            stringBuilder.append(", superLikeablePosition=");
            stringBuilder.append(this.f46947d);
            stringBuilder.append(", method=");
            stringBuilder.append(this.f46948e);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C15091a(int i, @NotNull String str, @NotNull SuperLikeablePosition superLikeablePosition, @Nullable Method method) {
            C2668g.b(str, "superLikeableSessionId");
            C2668g.b(superLikeablePosition, "superLikeablePosition");
            this.f46945b = i;
            this.f46946c = str;
            this.f46947d = superLikeablePosition;
            this.f46948e = method;
        }

        /* renamed from: b */
        public final int m56847b() {
            return this.f46945b;
        }

        @NotNull
        /* renamed from: c */
        public final String m56848c() {
            return this.f46946c;
        }

        @NotNull
        /* renamed from: d */
        public final SuperLikeablePosition m56849d() {
            return this.f46947d;
        }

        @Nullable
        /* renamed from: e */
        public final Method m56850e() {
            return this.f46948e;
        }

        @NotNull
        /* renamed from: a */
        public final Type m56846a() {
            return this.f46944a;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/etl/event/SuperLikeableInteractEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.analytics.a$b */
    static final class C18195b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C18196a f56409a;

        C18195b(C18196a c18196a) {
            this.f56409a = c18196a;
        }

        public /* synthetic */ Object call(Object obj) {
            m65972a((xn) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m65972a(xn xnVar) {
            this.f56409a.f56410a.a(xnVar);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.analytics.a$c */
    static final class C18934c implements Action0 {
        /* renamed from: a */
        public static final C18934c f58591a = new C18934c();

        C18934c() {
        }

        public final void call() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "t", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.analytics.a$d */
    static final class C18935d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18935d f58592a = new C18935d();

        C18935d() {
        }

        public /* synthetic */ void call(Object obj) {
            m67426a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67426a(@NotNull Throwable th) {
            C2668g.b(th, "t");
            C0001a.c(th, "Error executing AddSuperLikeableGameInteractEvent", new Object[0]);
        }
    }

    public /* synthetic */ void execute(Object obj) {
        m65974a((C15091a) obj);
    }

    @Inject
    public C18196a(@NotNull C2630h c2630h, @NotNull C15096f c15096f) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c15096f, "superLikeableAnalyticsFactory");
        this.f56410a = c2630h;
        this.f56411b = c15096f;
    }

    /* renamed from: a */
    public void m65974a(@NotNull C15091a c15091a) {
        C2668g.b(c15091a, "request");
        this.f56411b.m56869a(c15091a).d(new C18195b(this)).b().b(Schedulers.io()).a(C18934c.f58591a, C18935d.f58592a);
    }
}
