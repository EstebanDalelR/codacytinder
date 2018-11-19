package com.tinder.updates.p443a;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.aav;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action0;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/updates/analytics/AddWebSocketCloseEvent;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/updates/analytics/AddWebSocketCloseEvent$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "execute", "", "request", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.updates.a.c */
public final class C17205c implements VoidUseCase<C15335a> {
    /* renamed from: a */
    private final C2630h f52777a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/tinder/updates/analytics/AddWebSocketCloseEvent$Request;", "", "closeCode", "", "wasPreviouslyEstablished", "", "(IZ)V", "getCloseCode", "()I", "getWasPreviouslyEstablished", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.updates.a.c$a */
    public static final class C15335a {
        /* renamed from: a */
        private final int f47560a;
        /* renamed from: b */
        private final boolean f47561b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C15335a) {
                C15335a c15335a = (C15335a) obj;
                if ((this.f47560a == c15335a.f47560a ? 1 : null) != null) {
                    if ((this.f47561b == c15335a.f47561b ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            int i = this.f47560a * 31;
            int i2 = this.f47561b;
            if (i2 != 0) {
                i2 = 1;
            }
            return i + i2;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(closeCode=");
            stringBuilder.append(this.f47560a);
            stringBuilder.append(", wasPreviouslyEstablished=");
            stringBuilder.append(this.f47561b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C15335a(int i, boolean z) {
            this.f47560a = i;
            this.f47561b = z;
        }

        /* renamed from: a */
        public final int m57527a() {
            return this.f47560a;
        }

        /* renamed from: b */
        public final boolean m57528b() {
            return this.f47561b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.updates.a.c$b */
    static final class C18982b implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C17205c f58717a;
        /* renamed from: b */
        final /* synthetic */ C15335a f58718b;

        C18982b(C17205c c17205c, C15335a c15335a) {
            this.f58717a = c17205c;
            this.f58718b = c15335a;
        }

        public final void call() {
            this.f58717a.f52777a.a(aav.a().a(Integer.valueOf(this.f58718b.m57527a())).a(Boolean.valueOf(this.f58718b.m57528b())).a());
        }
    }

    @Inject
    public C17205c(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f52777a = c2630h;
    }

    public /* synthetic */ void execute(Object obj) {
        m63092a((C15335a) obj);
    }

    /* renamed from: a */
    public void m63092a(@NotNull C15335a c15335a) {
        C2668g.b(c15335a, "request");
        Completable.a(new C18982b(this, c15335a)).b(Schedulers.io()).b(RxUtils.b());
    }
}
