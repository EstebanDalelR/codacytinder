package com.tinder.reactions.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.etl.event.ir;
import com.tinder.reactions.analytics.model.GestureRespondIntro;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/reactions/analytics/AddGrandGestureDismissIntroEvent;", "Lcom/tinder/domain/common/usecase/CompletableUseCase;", "Lcom/tinder/reactions/analytics/AddGrandGestureDismissIntroEvent$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "execute", "Lrx/Completable;", "request", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.analytics.c */
public final class C16273c implements CompletableUseCase<C14580a> {
    /* renamed from: a */
    private final C2630h f50682a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tinder/reactions/analytics/AddGrandGestureDismissIntroEvent$Request;", "", "gestureIntroFrom", "Lcom/tinder/reactions/analytics/GestureIntroFrom;", "gestureRespondIntro", "Lcom/tinder/reactions/analytics/model/GestureRespondIntro;", "(Lcom/tinder/reactions/analytics/GestureIntroFrom;Lcom/tinder/reactions/analytics/model/GestureRespondIntro;)V", "getGestureIntroFrom", "()Lcom/tinder/reactions/analytics/GestureIntroFrom;", "getGestureRespondIntro", "()Lcom/tinder/reactions/analytics/model/GestureRespondIntro;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.c$a */
    public static final class C14580a {
        @NotNull
        /* renamed from: a */
        private final GestureIntroFrom f46019a;
        @NotNull
        /* renamed from: b */
        private final GestureRespondIntro f46020b;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C14580a) {
                    C14580a c14580a = (C14580a) obj;
                    if (C2668g.a(this.f46019a, c14580a.f46019a) && C2668g.a(this.f46020b, c14580a.f46020b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            GestureIntroFrom gestureIntroFrom = this.f46019a;
            int i = 0;
            int hashCode = (gestureIntroFrom != null ? gestureIntroFrom.hashCode() : 0) * 31;
            GestureRespondIntro gestureRespondIntro = this.f46020b;
            if (gestureRespondIntro != null) {
                i = gestureRespondIntro.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(gestureIntroFrom=");
            stringBuilder.append(this.f46019a);
            stringBuilder.append(", gestureRespondIntro=");
            stringBuilder.append(this.f46020b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C14580a(@NotNull GestureIntroFrom gestureIntroFrom, @NotNull GestureRespondIntro gestureRespondIntro) {
            C2668g.b(gestureIntroFrom, "gestureIntroFrom");
            C2668g.b(gestureRespondIntro, "gestureRespondIntro");
            this.f46019a = gestureIntroFrom;
            this.f46020b = gestureRespondIntro;
        }

        @NotNull
        /* renamed from: a */
        public final GestureIntroFrom m55623a() {
            return this.f46019a;
        }

        @NotNull
        /* renamed from: b */
        public final GestureRespondIntro m55624b() {
            return this.f46020b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.c$b */
    static final class C18653b implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C16273c f58122a;
        /* renamed from: b */
        final /* synthetic */ C14580a f58123b;

        C18653b(C16273c c16273c, C14580a c14580a) {
            this.f58122a = c16273c;
            this.f58123b = c14580a;
        }

        public final void call() {
            this.f58122a.f50682a.a(ir.a().a(this.f58123b.m55623a().getAnalyticsValue()).b(this.f58123b.m55624b().getAnalyticsValue()).a());
        }
    }

    @Inject
    public C16273c(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f50682a = c2630h;
    }

    public /* synthetic */ Completable execute(Object obj) {
        return m61453a((C14580a) obj);
    }

    @NotNull
    /* renamed from: a */
    public Completable m61453a(@NotNull C14580a c14580a) {
        C2668g.b(c14580a, "request");
        c14580a = Completable.a(new C18653b(this, c14580a));
        C2668g.a(c14580a, "Completable.fromAction {…missIntroEvent)\n        }");
        return c14580a;
    }
}
