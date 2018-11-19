package com.tinder.crashindicator.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.wj;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Single;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u000f\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/crashindicator/analytics/SettingsOptionEventDispatcher;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/crashindicator/analytics/SettingsOptionEventDispatcher$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "createEvent", "Lrx/Single;", "Lcom/tinder/etl/event/SettingsOptionEvent;", "request", "execute", "", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@Deprecated(message = "Use AddSettingsOptionUseCase instead", replaceWith = @ReplaceWith(expression = "AddSettingsOptionUseCase", imports = {}))
/* renamed from: com.tinder.crashindicator.analytics.c */
public final class C3924c implements VoidUseCase<c$a> {
    /* renamed from: a */
    private final C2630h f12274a;

    @Inject
    public C3924c(@NotNull C2630h c2630h) {
        C2668g.m10309b(c2630h, "fireworks");
        this.f12274a = c2630h;
    }

    public /* synthetic */ void execute(Object obj) {
        m14806a((c$a) obj);
    }

    /* renamed from: a */
    public void m14806a(@NotNull c$a c_a) {
        C2668g.m10309b(c_a, "request");
        m14805b(c_a).d(new c$c(this)).b().m10386b(Schedulers.io()).m10381a((Action0) c$d.f43777a, (Action1) c$e.f43778a);
    }

    /* renamed from: b */
    private final Single<wj> m14805b(c$a c_a) {
        Object a = Single.a(new c$b(wj.a().a(c_a.a()).b(c_a.b()).a()));
        C2668g.m10305a(a, "Single.fromCallable { event }");
        return a;
    }
}
