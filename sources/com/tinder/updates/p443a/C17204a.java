package com.tinder.updates.p443a;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.zs;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action0;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\t\nB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/updates/analytics/AddUpdatesReceivedEvent;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/updates/analytics/AddUpdatesReceivedEvent$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "execute", "", "request", "Companion", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.updates.a.a */
public final class C17204a implements VoidUseCase<C15334b> {
    /* renamed from: a */
    public static final C15333a f52775a = new C15333a();
    /* renamed from: b */
    private final C2630h f52776b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/updates/analytics/AddUpdatesReceivedEvent$Companion;", "", "()V", "PHASE_1_DELIVERY_DELTA", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.updates.a.a$a */
    public static final class C15333a {
        private C15333a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/tinder/updates/analytics/AddUpdatesReceivedEvent$Request;", "", "isInitiatedByNudge", "", "hasData", "(ZZ)V", "getHasData", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.updates.a.a$b */
    public static final class C15334b {
        /* renamed from: a */
        private final boolean f47558a;
        /* renamed from: b */
        private final boolean f47559b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C15334b) {
                C15334b c15334b = (C15334b) obj;
                if ((this.f47558a == c15334b.f47558a ? 1 : null) != null) {
                    if ((this.f47559b == c15334b.f47559b ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            int i = this.f47558a;
            int i2 = 1;
            if (i != 0) {
                i = 1;
            }
            i *= 31;
            boolean z = this.f47559b;
            if (!z) {
                i2 = z;
            }
            return i + i2;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(isInitiatedByNudge=");
            stringBuilder.append(this.f47558a);
            stringBuilder.append(", hasData=");
            stringBuilder.append(this.f47559b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C15334b(boolean z, boolean z2) {
            this.f47558a = z;
            this.f47559b = z2;
        }

        /* renamed from: a */
        public final boolean m57525a() {
            return this.f47558a;
        }

        /* renamed from: b */
        public final boolean m57526b() {
            return this.f47559b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.updates.a.a$c */
    static final class C18981c implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C17204a f58715a;
        /* renamed from: b */
        final /* synthetic */ C15334b f58716b;

        C18981c(C17204a c17204a, C15334b c15334b) {
            this.f58715a = c17204a;
            this.f58716b = c15334b;
        }

        public final void call() {
            this.f58715a.f52776b.a(zs.a().a(Boolean.valueOf(this.f58716b.m57525a())).a(Integer.valueOf(0)).b(Boolean.valueOf(this.f58716b.m57526b())).a());
        }
    }

    @Inject
    public C17204a(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f52776b = c2630h;
    }

    public /* synthetic */ void execute(Object obj) {
        m63090a((C15334b) obj);
    }

    /* renamed from: a */
    public void m63090a(@NotNull C15334b c15334b) {
        C2668g.b(c15334b, "request");
        Completable.a(new C18981c(this, c15334b)).b(Schedulers.io()).b(RxUtils.b());
    }
}
