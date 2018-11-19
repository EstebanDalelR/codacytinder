package com.tinder.tindergold.p426a;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.tindergold.p426a.C15183k.C15182b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/tindergold/analytics/AddGoldPaywallSelectEvent;", "Lcom/tinder/domain/common/usecase/CompletableUseCase;", "Lcom/tinder/tindergold/analytics/TinderGoldEtlEventFactory$Options;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "goldEtlEventFactory", "Lcom/tinder/tindergold/analytics/TinderGoldEtlEventFactory;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/tindergold/analytics/TinderGoldEtlEventFactory;)V", "execute", "Lrx/Completable;", "options", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.tindergold.a.e */
public final class C16916e implements CompletableUseCase<C15182b> {
    /* renamed from: a */
    private final C2630h f52117a;
    /* renamed from: b */
    private final C15183k f52118b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.tindergold.a.e$a */
    static final class C18956a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C16916e f58631a;
        /* renamed from: b */
        final /* synthetic */ C15182b f58632b;

        C18956a(C16916e c16916e, C15182b c15182b) {
            this.f58631a = c16916e;
            this.f58632b = c15182b;
        }

        public final void call() {
            this.f58631a.f52117a.a(this.f58631a.f52118b.m57093c(this.f58632b));
        }
    }

    @Inject
    public C16916e(@NotNull C2630h c2630h, @NotNull C15183k c15183k) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c15183k, "goldEtlEventFactory");
        this.f52117a = c2630h;
        this.f52118b = c15183k;
    }

    public /* synthetic */ Completable execute(Object obj) {
        return m62569a((C15182b) obj);
    }

    @NotNull
    /* renamed from: a */
    public Completable m62569a(@NotNull C15182b c15182b) {
        C2668g.b(c15182b, "options");
        c15182b = Completable.a(new C18956a(this, c15182b));
        C2668g.a(c15182b, "Completable.fromAction {…elect(options))\n        }");
        return c15182b;
    }
}
