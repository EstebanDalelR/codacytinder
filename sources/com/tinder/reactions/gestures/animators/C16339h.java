package com.tinder.reactions.gestures.animators;

import android.content.Context;
import android.view.View;
import com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider;
import com.tinder.profile.p365d.C14398a;
import com.tinder.reactions.analytics.C16280l;
import com.tinder.reactions.analytics.C16280l.C14586a;
import com.tinder.reactions.common.p388b.C14612a;
import com.tinder.reactions.gestures.common.GestureEvent.State;
import com.tinder.reactions.gestures.p393a.C14641a;
import com.tinder.reactions.gestures.view.C14673e;
import com.tinder.reactions.gestures.view.PullAndReleaseGrandGestureView;
import com.tinder.reactions.gestures.viewmodel.C16365n;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u001e\u0010\t\u001a\u00020\n8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/tinder/reactions/gestures/animators/PullAndReleaseGrandGestureAnimator;", "Lcom/tinder/reactions/gestures/animators/GrandGestureAnimator;", "view", "Lcom/tinder/reactions/gestures/view/PullAndReleaseGrandGestureView;", "viewModel", "Lcom/tinder/reactions/gestures/viewmodel/SingleGrandGestureViewModel;", "mediator", "Lcom/tinder/reactions/gestures/mediator/GestureAnimationMediator;", "(Lcom/tinder/reactions/gestures/view/PullAndReleaseGrandGestureView;Lcom/tinder/reactions/gestures/viewmodel/SingleGrandGestureViewModel;Lcom/tinder/reactions/gestures/mediator/GestureAnimationMediator;)V", "grandGestureShowTutorialEventDispatcher", "Lcom/tinder/reactions/analytics/GrandGestureShowTutorialEventDispatcher;", "getGrandGestureShowTutorialEventDispatcher$Tinder_release", "()Lcom/tinder/reactions/analytics/GrandGestureShowTutorialEventDispatcher;", "setGrandGestureShowTutorialEventDispatcher$Tinder_release", "(Lcom/tinder/reactions/analytics/GrandGestureShowTutorialEventDispatcher;)V", "matchId", "", "getMatchId$Tinder_release", "()Ljava/lang/String;", "setMatchId$Tinder_release", "(Ljava/lang/String;)V", "addShowTutorialEvent", "", "setupDagger", "context", "Landroid/content/Context;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.gestures.animators.h */
public final class C16339h extends C14646c {
    @Inject
    @NotNull
    /* renamed from: a */
    public C16280l f50833a;
    @Inject
    @NotNull
    /* renamed from: b */
    public String f50834b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.animators.h$2 */
    static final class C187302<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C187302 f58218a = new C187302();

        C187302() {
        }

        public /* synthetic */ void call(Object obj) {
            m67154a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67154a(Throwable th) {
            C0001a.c(th);
        }
    }

    public C16339h(@NotNull final PullAndReleaseGrandGestureView pullAndReleaseGrandGestureView, @NotNull final C16365n c16365n, @NotNull C14641a c14641a) {
        C2668g.b(pullAndReleaseGrandGestureView, "view");
        C2668g.b(c16365n, "viewModel");
        C2668g.b(c14641a, "mediator");
        View view = pullAndReleaseGrandGestureView;
        super(view, c16365n, c14641a);
        Context context = pullAndReleaseGrandGestureView.getContext();
        C2668g.a(context, "view.context");
        m61637a(context);
        C14673e.m55917a(pullAndReleaseGrandGestureView, c16365n);
        pullAndReleaseGrandGestureView.getGrandGestureStateObservable().j(C14612a.f46118a.m55756a(view)).a(new Action1<State>() {
            public /* synthetic */ void call(Object obj) {
                m67153a((State) obj);
            }

            /* renamed from: a */
            public final void m67153a(State state) {
                if (state == State.GESTURE_INCORRECT_INTERACTION) {
                    pullAndReleaseGrandGestureView.m55910a();
                    this.m61639b();
                } else if (state == State.GESTURE_ACTIVATED) {
                    this.m55839a(c16365n.m61725a());
                }
            }
        }, (Action1) C187302.f58218a);
    }

    /* renamed from: b */
    private final void m61639b() {
        C16280l c16280l = this.f50833a;
        if (c16280l == null) {
            C2668g.b("grandGestureShowTutorialEventDispatcher");
        }
        String str = this.f50834b;
        if (str == null) {
            C2668g.b("matchId");
        }
        c16280l.m61470a(new C14586a(str));
    }

    /* renamed from: a */
    private final void m61637a(Context context) {
        context = C14398a.m54830a(context);
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider");
        }
        ((ChatActivitySubcomponentProvider) context).provideChatActivityComponent().inject(this);
    }
}
