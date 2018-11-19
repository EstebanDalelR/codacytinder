package com.tinder.tindergold.p427b;

import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Take;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.tindergold.p426a.C16912a;
import com.tinder.tindergold.p426a.C16913b;
import com.tinder.tindergold.p426a.C16914c;
import com.tinder.tindergold.p481c.C16923a;
import com.tinder.tindergold.target.TinderGoldIntroTarget;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Completable;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0006\u0010\u0013\u001a\u00020\u0014J\r\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0016J\r\u0010\u0017\u001a\u00020\u0014H\u0001¢\u0006\u0002\b\u0018J\r\u0010\u0019\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u001aJ\r\u0010\u001b\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u001cR\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/tinder/tindergold/presenter/TinderGoldIntroPresenter;", "", "subscriptionProvider", "Lcom/tinder/domain/purchase/SubscriptionProvider;", "confirmTutorial", "Lcom/tinder/tindergold/usecase/ConfirmTinderGoldIntroTutorial;", "addGoldIntroViewEvent", "Lcom/tinder/tindergold/analytics/AddGoldIntroViewEvent;", "addGoldCancelIntroEvent", "Lcom/tinder/tindergold/analytics/AddGoldCancelIntroEvent;", "addGoldContinueIntroEvent", "Lcom/tinder/tindergold/analytics/AddGoldContinueIntroEvent;", "(Lcom/tinder/domain/purchase/SubscriptionProvider;Lcom/tinder/tindergold/usecase/ConfirmTinderGoldIntroTutorial;Lcom/tinder/tindergold/analytics/AddGoldIntroViewEvent;Lcom/tinder/tindergold/analytics/AddGoldCancelIntroEvent;Lcom/tinder/tindergold/analytics/AddGoldContinueIntroEvent;)V", "target", "Lcom/tinder/tindergold/target/TinderGoldIntroTarget;", "getTarget$Tinder_release", "()Lcom/tinder/tindergold/target/TinderGoldIntroTarget;", "setTarget$Tinder_release", "(Lcom/tinder/tindergold/target/TinderGoldIntroTarget;)V", "onContinueClick", "", "onDismiss", "onDismiss$Tinder_release", "onTakeTarget", "onTakeTarget$Tinder_release", "sendViewEvent", "sendViewEvent$Tinder_release", "setTitle", "setTitle$Tinder_release", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.tindergold.b.a */
public final class C15184a {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public TinderGoldIntroTarget f47226a;
    /* renamed from: b */
    private final SubscriptionProvider f47227b;
    /* renamed from: c */
    private final C16923a f47228c;
    /* renamed from: d */
    private final C16914c f47229d;
    /* renamed from: e */
    private final C16912a f47230e;
    /* renamed from: f */
    private final C16913b f47231f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.tindergold.b.a$a */
    static final class C18962a implements Action0 {
        /* renamed from: a */
        public static final C18962a f58642a = new C18962a();

        C18962a() {
        }

        public final void call() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.tindergold.b.a$b */
    static final class C18963b<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18963b f58643a = new C18963b();

        C18963b() {
        }

        public /* synthetic */ void call(Object obj) {
            m67459a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67459a(Throwable th) {
            C0001a.c(th);
        }
    }

    @Inject
    public C15184a(@NotNull SubscriptionProvider subscriptionProvider, @NotNull C16923a c16923a, @NotNull C16914c c16914c, @NotNull C16912a c16912a, @NotNull C16913b c16913b) {
        C2668g.b(subscriptionProvider, "subscriptionProvider");
        C2668g.b(c16923a, "confirmTutorial");
        C2668g.b(c16914c, "addGoldIntroViewEvent");
        C2668g.b(c16912a, "addGoldCancelIntroEvent");
        C2668g.b(c16913b, "addGoldContinueIntroEvent");
        this.f47227b = subscriptionProvider;
        this.f47228c = c16923a;
        this.f47229d = c16914c;
        this.f47230e = c16912a;
        this.f47231f = c16913b;
    }

    /* renamed from: a */
    public final void m57097a() {
        this.f47231f.execute().b(Schedulers.io()).d();
    }

    @Take
    /* renamed from: b */
    public final void m57098b() {
        m57101e();
        m57100d();
    }

    /* renamed from: c */
    public final void m57099c() {
        Completable.b(new Completable[]{this.f47230e.execute(), RxJavaInteropExtKt.toV1Completable(this.f47228c.execute())}).b(Schedulers.io()).a(C18962a.f58642a, C18963b.f58643a);
    }

    /* renamed from: d */
    public final void m57100d() {
        TinderGoldIntroTarget tinderGoldIntroTarget;
        if (this.f47227b.get().isPlus()) {
            tinderGoldIntroTarget = this.f47226a;
            if (tinderGoldIntroTarget == null) {
                C2668g.b("target");
            }
            tinderGoldIntroTarget.showUpgradeGoldTitle();
            return;
        }
        tinderGoldIntroTarget = this.f47226a;
        if (tinderGoldIntroTarget == null) {
            C2668g.b("target");
        }
        tinderGoldIntroTarget.showDefaultTinderGoldTitle();
    }

    /* renamed from: e */
    public final void m57101e() {
        this.f47229d.execute().b(Schedulers.io()).d();
    }
}
