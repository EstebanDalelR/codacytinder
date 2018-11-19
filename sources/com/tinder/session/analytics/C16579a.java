package com.tinder.session.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.SimpleVoidUseCase;
import com.tinder.etl.event.zu;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/session/analytics/AddUserEvent;", "Lcom/tinder/domain/common/usecase/SimpleVoidUseCase;", "userEventFactory", "Lcom/tinder/session/analytics/UserEventFactory;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/session/analytics/UserEventFactory;Lcom/tinder/analytics/fireworks/Fireworks;)V", "execute", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.session.analytics.a */
public final class C16579a implements SimpleVoidUseCase {
    /* renamed from: a */
    private final C14834c f51280a;
    /* renamed from: b */
    private final C2630h f51281b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/etl/event/UserEvent;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.session.analytics.a$a */
    static final class C16577a<T> implements Consumer<zu> {
        /* renamed from: a */
        final /* synthetic */ C16579a f51278a;

        C16577a(C16579a c16579a) {
            this.f51278a = c16579a;
        }

        public /* synthetic */ void accept(Object obj) {
            m62010a((zu) obj);
        }

        /* renamed from: a */
        public final void m62010a(zu zuVar) {
            this.f51278a.f51281b.a(zuVar);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.session.analytics.a$b */
    static final class C16578b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C16578b f51279a = new C16578b();

        C16578b() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62011a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62011a(Throwable th) {
            C0001a.c(th, "Error tracking User event", new Object[0]);
        }
    }

    @Inject
    public C16579a(@NotNull C14834c c14834c, @NotNull C2630h c2630h) {
        C2668g.b(c14834c, "userEventFactory");
        C2668g.b(c2630h, "fireworks");
        this.f51280a = c14834c;
        this.f51281b = c2630h;
    }

    public void execute() {
        this.f51280a.m56202a().b(C15756a.m59010b()).a(new C16577a(this), C16578b.f51279a);
    }
}
