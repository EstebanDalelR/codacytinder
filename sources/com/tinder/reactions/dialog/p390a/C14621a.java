package com.tinder.reactions.dialog.p390a;

import com.tinder.deadshot.DeadshotTarget;
import com.tinder.reactions.analytics.C16273c;
import com.tinder.reactions.analytics.C16273c.C14580a;
import com.tinder.reactions.analytics.C16275f;
import com.tinder.reactions.analytics.GestureIntroFrom;
import com.tinder.reactions.analytics.model.GestureRespondIntro;
import com.tinder.reactions.p385c.C16286e;
import com.tinder.reactions.target.TinderReactionsIntroTarget;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0012\u001a\u00020\u0010J\u0006\u0010\u0013\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/tinder/reactions/dialog/presenter/TinderReactionsIntroPresenter;", "", "confirmTutorial", "Lcom/tinder/reactions/usecase/ConfirmTinderReactionsIntroTutorial;", "addGrandGestureShowIntroEvent", "Lcom/tinder/reactions/analytics/AddGrandGestureShowIntroEvent;", "addGrandGestureDismissIntroEvent", "Lcom/tinder/reactions/analytics/AddGrandGestureDismissIntroEvent;", "(Lcom/tinder/reactions/usecase/ConfirmTinderReactionsIntroTutorial;Lcom/tinder/reactions/analytics/AddGrandGestureShowIntroEvent;Lcom/tinder/reactions/analytics/AddGrandGestureDismissIntroEvent;)V", "target", "Lcom/tinder/reactions/target/TinderReactionsIntroTarget;", "getTarget$Tinder_release", "()Lcom/tinder/reactions/target/TinderReactionsIntroTarget;", "setTarget$Tinder_release", "(Lcom/tinder/reactions/target/TinderReactionsIntroTarget;)V", "onCtaClicked", "", "onDialogNotCtaClicked", "onDismiss", "onShow", "onTouchOutside", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.dialog.a.a */
public final class C14621a {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public TinderReactionsIntroTarget f46125a;
    /* renamed from: b */
    private final C16286e f46126b;
    /* renamed from: c */
    private final C16275f f46127c;
    /* renamed from: d */
    private final C16273c f46128d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.dialog.a.a$a */
    static final class C18701a implements Action0 {
        /* renamed from: a */
        public static final C18701a f58182a = new C18701a();

        C18701a() {
        }

        public final void call() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.dialog.a.a$b */
    static final class C18702b<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18702b f58183a = new C18702b();

        C18702b() {
        }

        public /* synthetic */ void call(Object obj) {
            m67131a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67131a(Throwable th) {
            C0001a.c(th);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.dialog.a.a$c */
    static final class C18703c implements Action0 {
        /* renamed from: a */
        public static final C18703c f58184a = new C18703c();

        C18703c() {
        }

        public final void call() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.dialog.a.a$d */
    static final class C18704d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18704d f58185a = new C18704d();

        C18704d() {
        }

        public /* synthetic */ void call(Object obj) {
            m67132a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67132a(Throwable th) {
            C0001a.c(th);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.dialog.a.a$e */
    static final class C18705e implements Action0 {
        /* renamed from: a */
        public static final C18705e f58186a = new C18705e();

        C18705e() {
        }

        public final void call() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.dialog.a.a$f */
    static final class C18706f<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18706f f58187a = new C18706f();

        C18706f() {
        }

        public /* synthetic */ void call(Object obj) {
            m67133a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67133a(Throwable th) {
            C0001a.c(th);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.dialog.a.a$g */
    static final class C18707g implements Action0 {
        /* renamed from: a */
        public static final C18707g f58188a = new C18707g();

        C18707g() {
        }

        public final void call() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.dialog.a.a$h */
    static final class C18708h<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18708h f58189a = new C18708h();

        C18708h() {
        }

        public /* synthetic */ void call(Object obj) {
            m67134a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67134a(Throwable th) {
            C0001a.c(th);
        }
    }

    @Inject
    public C14621a(@NotNull C16286e c16286e, @NotNull C16275f c16275f, @NotNull C16273c c16273c) {
        C2668g.b(c16286e, "confirmTutorial");
        C2668g.b(c16275f, "addGrandGestureShowIntroEvent");
        C2668g.b(c16273c, "addGrandGestureDismissIntroEvent");
        this.f46126b = c16286e;
        this.f46127c = c16275f;
        this.f46128d = c16273c;
    }

    /* renamed from: a */
    public final void m55781a() {
        this.f46127c.m61457a(GestureIntroFrom.CARD_STACK);
        TinderReactionsIntroTarget tinderReactionsIntroTarget = this.f46125a;
        if (tinderReactionsIntroTarget == null) {
            C2668g.b("target");
        }
        tinderReactionsIntroTarget.playAnimation();
    }

    /* renamed from: b */
    public final void m55782b() {
        this.f46128d.m61453a(new C14580a(GestureIntroFrom.CARD_STACK, GestureRespondIntro.CARD_STACK_CONFIRM)).b(Schedulers.io()).a(C18701a.f58182a, C18702b.f58183a);
        TinderReactionsIntroTarget tinderReactionsIntroTarget = this.f46125a;
        if (tinderReactionsIntroTarget == null) {
            C2668g.b("target");
        }
        tinderReactionsIntroTarget.dismiss();
    }

    /* renamed from: c */
    public final void m55783c() {
        this.f46128d.m61453a(new C14580a(GestureIntroFrom.CARD_STACK, GestureRespondIntro.CARD_STACK_GESTURE)).b(Schedulers.io()).a(C18703c.f58184a, C18704d.f58185a);
    }

    /* renamed from: d */
    public final void m55784d() {
        this.f46128d.m61453a(new C14580a(GestureIntroFrom.CARD_STACK, GestureRespondIntro.CARD_STACK_BACKGROUND)).b(Schedulers.io()).a(C18707g.f58188a, C18708h.f58189a);
    }

    /* renamed from: e */
    public final void m55785e() {
        this.f46126b.execute().b(Schedulers.io()).a(C18705e.f58186a, C18706f.f58187a);
    }
}
