package com.tinder.reactions.navigation.p397b;

import com.tinder.C6250b.C6248a;
import com.tinder.chat.injection.scope.ChatActivityScope;
import com.tinder.common.view.extension.C8587g;
import com.tinder.deadshot.Deadshot;
import com.tinder.reactions.common.feature.FeatureLifecycle;
import com.tinder.reactions.navigation.p398c.C14684a;
import com.tinder.reactions.navigation.p399d.C14688a;
import com.tinder.reactions.navigation.target.GestureNavigationLoadingTarget;
import com.tinder.reactions.navigation.view.GestureNavigationLoadingView;
import com.tinder.reactions.navigation.view.ReactionLoadingLottieAnimationView;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0013H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/tinder/reactions/navigation/feature/GestureNavigationLoadingFeature;", "Lcom/tinder/reactions/common/feature/FeatureLifecycle;", "Lcom/tinder/reactions/navigation/target/GestureNavigationLoadingTarget;", "presenter", "Lcom/tinder/reactions/navigation/presenter/GestureNavigationLoadingPresenter;", "gestureNavigationLoadingViewProvider", "Lcom/tinder/reactions/navigation/provider/GestureNavigationLoadingViewProvider;", "(Lcom/tinder/reactions/navigation/presenter/GestureNavigationLoadingPresenter;Lcom/tinder/reactions/navigation/provider/GestureNavigationLoadingViewProvider;)V", "getGestureNavigationLoadingViewProvider$Tinder_release", "()Lcom/tinder/reactions/navigation/provider/GestureNavigationLoadingViewProvider;", "loadingView", "Lcom/tinder/reactions/navigation/view/GestureNavigationLoadingView;", "getLoadingView$Tinder_release", "()Lcom/tinder/reactions/navigation/view/GestureNavigationLoadingView;", "setLoadingView$Tinder_release", "(Lcom/tinder/reactions/navigation/view/GestureNavigationLoadingView;)V", "getPresenter$Tinder_release", "()Lcom/tinder/reactions/navigation/presenter/GestureNavigationLoadingPresenter;", "hideReactionsLoadingView", "", "onAttached", "onDetached", "showReactionsLoadingView", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ChatActivityScope
/* renamed from: com.tinder.reactions.navigation.b.a */
public final class C16369a implements FeatureLifecycle, GestureNavigationLoadingTarget {
    @NotNull
    /* renamed from: a */
    public GestureNavigationLoadingView f50911a;
    @NotNull
    /* renamed from: b */
    private final C14684a f50912b;
    @NotNull
    /* renamed from: c */
    private final C14688a f50913c;

    @Inject
    public C16369a(@NotNull C14684a c14684a, @NotNull C14688a c14688a) {
        C2668g.b(c14684a, "presenter");
        C2668g.b(c14688a, "gestureNavigationLoadingViewProvider");
        this.f50912b = c14684a;
        this.f50913c = c14688a;
        C14683b.m55935a(this);
    }

    @NotNull
    /* renamed from: b */
    public final C14688a m61740b() {
        return this.f50913c;
    }

    @NotNull
    /* renamed from: a */
    public final GestureNavigationLoadingView m61738a() {
        GestureNavigationLoadingView gestureNavigationLoadingView = this.f50911a;
        if (gestureNavigationLoadingView == null) {
            C2668g.b("loadingView");
        }
        return gestureNavigationLoadingView;
    }

    /* renamed from: a */
    public final void m61739a(@NotNull GestureNavigationLoadingView gestureNavigationLoadingView) {
        C2668g.b(gestureNavigationLoadingView, "<set-?>");
        this.f50911a = gestureNavigationLoadingView;
    }

    public void onAttached() {
        Deadshot.take(this, this.f50912b);
    }

    public void onDetached() {
        Deadshot.drop(this);
    }

    public void showReactionsLoadingView() {
        GestureNavigationLoadingView gestureNavigationLoadingView = this.f50911a;
        if (gestureNavigationLoadingView == null) {
            C2668g.b("loadingView");
        }
        C8587g.a(gestureNavigationLoadingView, true);
        ((ReactionLoadingLottieAnimationView) gestureNavigationLoadingView.m55949a(C6248a.reactionsLoadingAnimation)).m67199i();
    }

    public void hideReactionsLoadingView() {
        GestureNavigationLoadingView gestureNavigationLoadingView = this.f50911a;
        if (gestureNavigationLoadingView == null) {
            C2668g.b("loadingView");
        }
        C8587g.a(gestureNavigationLoadingView, false);
        ((ReactionLoadingLottieAnimationView) gestureNavigationLoadingView.m55949a(C6248a.reactionsLoadingAnimation)).m67198e();
    }
}
