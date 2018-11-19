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

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/tindergold/analytics/AddGoldSettingsRestoreEvent;", "Lcom/tinder/domain/common/usecase/CompletableUseCase;", "", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "goldEtlEventFactory", "Lcom/tinder/tindergold/analytics/TinderGoldEtlEventFactory;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/tindergold/analytics/TinderGoldEtlEventFactory;)V", "execute", "Lrx/Completable;", "productId", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.tindergold.a.i */
public final class C16920i implements CompletableUseCase<String> {
    /* renamed from: a */
    private final C2630h f52125a;
    /* renamed from: b */
    private final C15183k f52126b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.tindergold.a.i$a */
    static final class C18960a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C16920i f58639a;
        /* renamed from: b */
        final /* synthetic */ String f58640b;

        C18960a(C16920i c16920i, String str) {
            this.f58639a = c16920i;
            this.f58640b = str;
        }

        public final void call() {
            this.f58639a.f52125a.a(this.f58639a.f52126b.m57095e(new C15182b(Integer.valueOf(2), Integer.valueOf(24), -1, this.f58640b)));
        }
    }

    @Inject
    public C16920i(@NotNull C2630h c2630h, @NotNull C15183k c15183k) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c15183k, "goldEtlEventFactory");
        this.f52125a = c2630h;
        this.f52126b = c15183k;
    }

    public /* synthetic */ Completable execute(Object obj) {
        return m62581a((String) obj);
    }

    @NotNull
    /* renamed from: a */
    public Completable m62581a(@NotNull String str) {
        C2668g.b(str, "productId");
        str = Completable.a(new C18960a(this, str));
        C2668g.a(str, "Completable.fromAction {…   productId)))\n        }");
        return str;
    }
}
