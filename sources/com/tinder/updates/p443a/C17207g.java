package com.tinder.updates.p443a;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.aaz;
import com.tinder.etl.event.aaz.C8964a;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action0;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\t\nB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/updates/analytics/AddWebSocketNudgeEvent;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/updates/analytics/AddWebSocketNudgeEvent$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "execute", "", "request", "Companion", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.updates.a.g */
public final class C17207g implements VoidUseCase<C15339b> {
    /* renamed from: a */
    public static final C15338a f52781a = new C15338a();
    /* renamed from: b */
    private final C2630h f52782b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/tinder/updates/analytics/AddWebSocketNudgeEvent$Companion;", "", "()V", "PHASE_1_START_DELTA", "", "PHASE_1_UPSTREAM_DELTA", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.updates.a.g$a */
    public static final class C15338a {
        private C15338a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/tinder/updates/analytics/AddWebSocketNudgeEvent$Request;", "", "nudgeType", "", "(I)V", "getNudgeType", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.updates.a.g$b */
    public static final class C15339b {
        /* renamed from: a */
        private final int f47564a;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C15339b) {
                if ((this.f47564a == ((C15339b) obj).f47564a ? 1 : null) != null) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f47564a;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(nudgeType=");
            stringBuilder.append(this.f47564a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C15339b(int i) {
            this.f47564a = i;
        }

        /* renamed from: a */
        public final int m57531a() {
            return this.f47564a;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.updates.a.g$c */
    static final class C18984c implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C17207g f58721a;
        /* renamed from: b */
        final /* synthetic */ C15339b f58722b;

        C18984c(C17207g c17207g, C15339b c15339b) {
            this.f58721a = c17207g;
            this.f58722b = c15339b;
        }

        public final void call() {
            C2630h a = this.f58721a.f52782b;
            C8964a a2 = aaz.a();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(this.f58722b.m57531a());
            a.a(a2.a(stringBuilder.toString()).b(Integer.valueOf(0)).a(Integer.valueOf(0)).a());
        }
    }

    @Inject
    public C17207g(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f52782b = c2630h;
    }

    public /* synthetic */ void execute(Object obj) {
        m63097a((C15339b) obj);
    }

    /* renamed from: a */
    public void m63097a(@NotNull C15339b c15339b) {
        C2668g.b(c15339b, "request");
        Completable.a(new C18984c(this, c15339b)).b(Schedulers.io()).b(RxUtils.b());
    }
}
