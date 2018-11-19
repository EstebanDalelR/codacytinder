package com.tinder.toppicks.domain.worker;

import com.tinder.domain.common.model.Subscription;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.domain.toppicks.usecase.ResetTopPickSession;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.recs.domain.model.CustomRecEngineResetReason.SubscriptionChange;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/toppicks/domain/worker/TopPicksSubscriptionWorker;", "Lcom/tinder/toppicks/domain/worker/TopPicksWorker;", "subscriptionProvider", "Lcom/tinder/domain/purchase/SubscriptionProvider;", "resetTopPicksSession", "Lcom/tinder/domain/toppicks/usecase/ResetTopPickSession;", "(Lcom/tinder/domain/purchase/SubscriptionProvider;Lcom/tinder/domain/toppicks/usecase/ResetTopPickSession;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "onStart", "", "onStop", "domain_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.domain.worker.c */
public final class C17010c implements TopPicksWorker {
    /* renamed from: a */
    private Disposable f52431a;
    /* renamed from: b */
    private final SubscriptionProvider f52432b;
    /* renamed from: c */
    private final ResetTopPickSession f52433c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "subscription", "Lcom/tinder/domain/common/model/Subscription;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.domain.worker.c$a */
    static final class C17008a<T> implements Consumer<Subscription> {
        /* renamed from: a */
        final /* synthetic */ C17010c f52429a;

        C17008a(C17010c c17010c) {
            this.f52429a = c17010c;
        }

        public /* synthetic */ void accept(Object obj) {
            m62787a((Subscription) obj);
        }

        /* renamed from: a */
        public final void m62787a(Subscription subscription) {
            this.f52429a.f52433c.execute(SubscriptionChange.INSTANCE);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.domain.worker.c$b */
    static final class C17009b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17009b f52430a = new C17009b();

        C17009b() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62788a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62788a(Throwable th) {
            C0001a.c(th, "Error observing subscription", new Object[0]);
        }
    }

    @Inject
    public C17010c(@NotNull SubscriptionProvider subscriptionProvider, @NotNull ResetTopPickSession resetTopPickSession) {
        C2668g.b(subscriptionProvider, "subscriptionProvider");
        C2668g.b(resetTopPickSession, "resetTopPicksSession");
        this.f52432b = subscriptionProvider;
        this.f52433c = resetTopPickSession;
    }

    public void onStart() {
        this.f52431a = RxJavaInteropExtKt.toV2Observable(this.f52432b.observe()).distinctUntilChanged().skip(1).subscribe(new C17008a(this), C17009b.f52430a);
    }

    public void onStop() {
        Disposable disposable = this.f52431a;
        if (disposable != null) {
            disposable.dispose();
        }
    }
}
