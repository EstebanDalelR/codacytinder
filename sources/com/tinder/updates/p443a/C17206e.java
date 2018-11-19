package com.tinder.updates.p443a;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.aax;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action0;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\t\nB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/updates/analytics/AddWebSocketConnectEvent;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/updates/analytics/AddWebSocketConnectEvent$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "execute", "", "request", "Companion", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.updates.a.e */
public final class C17206e implements VoidUseCase<C15337b> {
    /* renamed from: a */
    public static final C15336a f52778a = new C15336a();
    /* renamed from: c */
    private static final boolean f52779c = false;
    /* renamed from: b */
    private final C2630h f52780b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/updates/analytics/AddWebSocketConnectEvent$Companion;", "", "()V", "PHASE_1_HAS_DATA", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.updates.a.e$a */
    public static final class C15336a {
        private C15336a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/tinder/updates/analytics/AddWebSocketConnectEvent$Request;", "", "retryCount", "", "isEstablished", "", "(IZ)V", "()Z", "getRetryCount", "()I", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.updates.a.e$b */
    public static final class C15337b {
        /* renamed from: a */
        private final int f47562a;
        /* renamed from: b */
        private final boolean f47563b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C15337b) {
                C15337b c15337b = (C15337b) obj;
                if ((this.f47562a == c15337b.f47562a ? 1 : null) != null) {
                    if ((this.f47563b == c15337b.f47563b ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            int i = this.f47562a * 31;
            int i2 = this.f47563b;
            if (i2 != 0) {
                i2 = 1;
            }
            return i + i2;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(retryCount=");
            stringBuilder.append(this.f47562a);
            stringBuilder.append(", isEstablished=");
            stringBuilder.append(this.f47563b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C15337b(int i, boolean z) {
            this.f47562a = i;
            this.f47563b = z;
        }

        /* renamed from: a */
        public final int m57529a() {
            return this.f47562a;
        }

        /* renamed from: b */
        public final boolean m57530b() {
            return this.f47563b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.updates.a.e$c */
    static final class C18983c implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C17206e f58719a;
        /* renamed from: b */
        final /* synthetic */ C15337b f58720b;

        C18983c(C17206e c17206e, C15337b c15337b) {
            this.f58719a = c17206e;
            this.f58720b = c15337b;
        }

        public final void call() {
            this.f58719a.f52780b.a(aax.a().a(Integer.valueOf(this.f58720b.m57529a())).a(Boolean.valueOf(this.f58720b.m57530b())).b(Boolean.valueOf(C17206e.f52779c)).a());
        }
    }

    @Inject
    public C17206e(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f52780b = c2630h;
    }

    public /* synthetic */ void execute(Object obj) {
        m63095a((C15337b) obj);
    }

    /* renamed from: a */
    public void m63095a(@NotNull C15337b c15337b) {
        C2668g.b(c15337b, "request");
        Completable.a(new C18983c(this, c15337b)).b(Schedulers.io()).b(RxUtils.b());
    }
}
