package com.tinder.toppicks.notifications;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.api.model.settings.PushSettingsKt;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.sv;
import io.reactivex.C3956a;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/toppicks/notifications/SendTopPicksPushSendEvent;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/toppicks/notifications/SendTopPicksPushSendEvent$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "execute", "", "request", "Request", "toppicks_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.notifications.f */
public final class C17045f implements VoidUseCase<C15281a> {
    /* renamed from: a */
    private final C2630h f52504a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tinder/toppicks/notifications/SendTopPicksPushSendEvent$Request;", "", "targetTime", "", "(J)V", "getTargetTime", "()J", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "toppicks_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.notifications.f$a */
    public static final class C15281a {
        /* renamed from: a */
        private final long f47417a;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C15281a) {
                if ((this.f47417a == ((C15281a) obj).f47417a ? 1 : null) != null) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            long j = this.f47417a;
            return (int) (j ^ (j >>> 32));
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(targetTime=");
            stringBuilder.append(this.f47417a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C15281a(long j) {
            this.f47417a = j;
        }

        /* renamed from: a */
        public final long m57393a() {
            return this.f47417a;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.notifications.f$b */
    static final class C17042b implements Action {
        /* renamed from: a */
        final /* synthetic */ C17045f f52500a;
        /* renamed from: b */
        final /* synthetic */ C15281a f52501b;

        C17042b(C17045f c17045f, C15281a c15281a) {
            this.f52500a = c17045f;
            this.f52501b = c15281a;
        }

        public final void run() {
            this.f52500a.f52504a.a(sv.a().a(Long.valueOf(this.f52501b.m57393a())).a(PushSettingsKt.KEY_TOP_PICKS_DAILY).a());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.notifications.f$c */
    static final class C17043c implements Action {
        /* renamed from: a */
        public static final C17043c f52502a = new C17043c();

        C17043c() {
        }

        public final void run() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.notifications.f$d */
    static final class C17044d<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17044d f52503a = new C17044d();

        C17044d() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62843a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62843a(Throwable th) {
            C0001a.c(th, "Error sending to picks push add event", new Object[0]);
        }
    }

    @Inject
    public C17045f(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f52504a = c2630h;
    }

    public /* synthetic */ void execute(Object obj) {
        m62845a((C15281a) obj);
    }

    /* renamed from: a */
    public void m62845a(@NotNull C15281a c15281a) {
        C2668g.b(c15281a, "request");
        C3956a.a(new C17042b(this, c15281a)).b(C15756a.m59010b()).a(C17043c.f52502a, C17044d.f52503a);
    }
}
