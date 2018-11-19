package com.tinder.reactions.gestures.animators;

import android.content.Context;
import android.view.View;
import com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider;
import com.tinder.domain.reactions.model.GrandGestureType;
import com.tinder.domain.reactions.provider.StrikeReactionTypesProvider;
import com.tinder.profile.p365d.C14398a;
import com.tinder.reactions.common.p388b.C14612a;
import com.tinder.reactions.gestures.common.GestureEvent.State;
import com.tinder.reactions.gestures.p393a.C14641a;
import com.tinder.reactions.gestures.view.C14673e;
import com.tinder.reactions.gestures.view.TappableGrandGestureView;
import com.tinder.reactions.gestures.viewmodel.C16362c;
import com.tinder.reactions.p385c.C16290l;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u001eH\u0002R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\""}, d2 = {"Lcom/tinder/reactions/gestures/animators/StrikeGrandGestureAnimator;", "Lcom/tinder/reactions/gestures/animators/GrandGestureAnimator;", "view", "Lcom/tinder/reactions/gestures/view/TappableGrandGestureView;", "viewModel", "Lcom/tinder/reactions/gestures/viewmodel/DynamicTypeGrandGestureViewModel;", "mediator", "Lcom/tinder/reactions/gestures/mediator/GestureAnimationMediator;", "(Lcom/tinder/reactions/gestures/view/TappableGrandGestureView;Lcom/tinder/reactions/gestures/viewmodel/DynamicTypeGrandGestureViewModel;Lcom/tinder/reactions/gestures/mediator/GestureAnimationMediator;)V", "cachedFallbackStrikeType", "Lcom/tinder/domain/reactions/model/GrandGestureType;", "matchId", "", "getMatchId", "()Ljava/lang/String;", "setMatchId", "(Ljava/lang/String;)V", "strikeReactionTypesProvider", "Lcom/tinder/domain/reactions/provider/StrikeReactionTypesProvider;", "getStrikeReactionTypesProvider$Tinder_release", "()Lcom/tinder/domain/reactions/provider/StrikeReactionTypesProvider;", "setStrikeReactionTypesProvider$Tinder_release", "(Lcom/tinder/domain/reactions/provider/StrikeReactionTypesProvider;)V", "updateNextStrikeId", "Lcom/tinder/reactions/usecase/UpdateNextStrikeId;", "getUpdateNextStrikeId$Tinder_release", "()Lcom/tinder/reactions/usecase/UpdateNextStrikeId;", "setUpdateNextStrikeId$Tinder_release", "(Lcom/tinder/reactions/usecase/UpdateNextStrikeId;)V", "setupDagger", "", "context", "Landroid/content/Context;", "updateCachedFallbackStrikeType", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.gestures.animators.k */
public final class C16342k extends C14646c {
    @Inject
    @NotNull
    /* renamed from: a */
    public C16290l f50837a;
    @Inject
    @NotNull
    /* renamed from: b */
    public StrikeReactionTypesProvider f50838b;
    @Inject
    @NotNull
    /* renamed from: c */
    public String f50839c;
    /* renamed from: d */
    private GrandGestureType f50840d = GrandGestureType.STRIKE_1;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "state", "Lcom/tinder/reactions/gestures/common/GestureEvent$State;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.animators.k$1 */
    static final class C179771<T, R> implements Func1<State, Boolean> {
        /* renamed from: a */
        public static final C179771 f55908a = new C179771();

        C179771() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m65324a((State) obj));
        }

        /* renamed from: a */
        public final boolean m65324a(State state) {
            return state == State.GESTURE_ACTIVATED ? true : null;
        }
    }

    public C16342k(@NotNull TappableGrandGestureView tappableGrandGestureView, @NotNull C16362c c16362c, @NotNull C14641a c14641a) {
        C2668g.b(tappableGrandGestureView, "view");
        C2668g.b(c16362c, "viewModel");
        C2668g.b(c14641a, "mediator");
        View view = tappableGrandGestureView;
        super(view, c16362c, c14641a);
        Context context = tappableGrandGestureView.getContext();
        C2668g.a(context, "view.context");
        m61643a(context);
        C14673e.m55919a(tappableGrandGestureView, c16362c);
        tappableGrandGestureView.getGrandGestureStateObservable().j(C14612a.f46118a.m55756a(view)).f((Func1) C179771.f55908a).c((Func1) new Func1<T, Observable<? extends R>>() {
            public /* synthetic */ Object call(Object obj) {
                return m65325a((State) obj);
            }

            /* renamed from: a */
            public final Observable<GrandGestureType> m65325a(State state) {
                return this.m61647b().m61482a(this.m61648c()).a();
            }
        }).a(RxUtils.a()).a((Action1) new Action1<GrandGestureType>() {
            public /* synthetic */ void call(Object obj) {
                m67157a((GrandGestureType) obj);
            }

            /* renamed from: a */
            public final void m67157a(GrandGestureType grandGestureType) {
                this.m61646d();
                C16342k c16342k = this;
                C2668g.a(grandGestureType, "grandGestureType");
                c16342k.m55839a(grandGestureType);
            }
        }, (Action1) new Action1<Throwable>() {
            public /* synthetic */ void call(Object obj) {
                m67158a((Throwable) obj);
            }

            /* renamed from: a */
            public final void m67158a(Throwable th) {
                C0001a.c(th);
                this.m55839a(this.f50840d);
            }
        });
    }

    @NotNull
    /* renamed from: b */
    public final C16290l m61647b() {
        C16290l c16290l = this.f50837a;
        if (c16290l == null) {
            C2668g.b("updateNextStrikeId");
        }
        return c16290l;
    }

    @NotNull
    /* renamed from: c */
    public final String m61648c() {
        String str = this.f50839c;
        if (str == null) {
            C2668g.b("matchId");
        }
        return str;
    }

    /* renamed from: d */
    private final void m61646d() {
        StrikeReactionTypesProvider strikeReactionTypesProvider = this.f50838b;
        if (strikeReactionTypesProvider == null) {
            C2668g.b("strikeReactionTypesProvider");
        }
        this.f50840d = GrandGestureType.Companion.fromValue(strikeReactionTypesProvider.nextStrikeId(this.f50840d.getGestureId()));
    }

    /* renamed from: a */
    private final void m61643a(Context context) {
        context = C14398a.m54830a(context);
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider");
        }
        ((ChatActivitySubcomponentProvider) context).provideChatActivityComponent().inject(this);
    }
}
