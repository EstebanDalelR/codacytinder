package com.tinder.bitmoji.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.SimpleVoidUseCase;
import com.tinder.domain.injection.qualifiers.IoScheduler;
import com.tinder.etl.event.bt;
import io.reactivex.C15679f;
import io.reactivex.C3956a;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/bitmoji/analytics/AddBitmojiInteractEvent;", "Lcom/tinder/domain/common/usecase/SimpleVoidUseCase;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "ioScheduler", "Lio/reactivex/Scheduler;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lio/reactivex/Scheduler;)V", "execute", "", "bitmoji_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.bitmoji.analytics.c */
public final class C10374c implements SimpleVoidUseCase {
    /* renamed from: a */
    private final C2630h f33853a;
    /* renamed from: b */
    private final C15679f f33854b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.bitmoji.analytics.c$a */
    static final class C10372a implements Action {
        /* renamed from: a */
        final /* synthetic */ C10374c f33851a;

        C10372a(C10374c c10374c) {
            this.f33851a = c10374c;
        }

        public final void run() {
            this.f33851a.f33853a.a(bt.m44233a().m37869a("start search").m37870a());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.bitmoji.analytics.c$b */
    static final class C10373b implements Action {
        /* renamed from: a */
        public static final C10373b f33852a = new C10373b();

        C10373b() {
        }

        public final void run() {
        }
    }

    @Inject
    public C10374c(@NotNull C2630h c2630h, @NotNull @IoScheduler C15679f c15679f) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c15679f, "ioScheduler");
        this.f33853a = c2630h;
        this.f33854b = c15679f;
    }

    public void execute() {
        C3956a b = C3956a.a(new C10372a(this)).b(this.f33854b);
        Action action = C10373b.f33852a;
        Function1 function1 = AddBitmojiInteractEvent$execute$3.f45098a;
        if (function1 != null) {
            function1 = new C10375d(function1);
        }
        b.a(action, (Consumer) function1);
    }
}
