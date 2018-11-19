package com.tinder.reactions.chat.presenter;

import com.tinder.chat.analytics.af;
import com.tinder.chat.analytics.af.C8418a;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Take;
import com.tinder.reactions.analytics.C16277h;
import com.tinder.reactions.analytics.C16277h.C14583a;
import com.tinder.reactions.analytics.model.GestureDrawerInteractMethod;
import com.tinder.reactions.chat.p386a.C14598a;
import com.tinder.reactions.chat.target.ExpandReactionDrawerFeatureTarget;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B1\b\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0014H\u0002J\u0006\u0010\u0017\u001a\u00020\u0014J\b\u0010\u0018\u001a\u00020\u0014H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/tinder/reactions/chat/presenter/ExpandReactionDrawerFromChatInputPresenter;", "", "matchId", "", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "grandGestureOpenEventDispatcher", "Lcom/tinder/reactions/analytics/GrandGestureOpenEventDispatcher;", "chatTapInputTypeEventDispatcher", "Lcom/tinder/chat/analytics/ChatTapInputTypeEventDispatcher;", "chatInputExpandButtonClickedProvider", "Lcom/tinder/reactions/chat/provider/ChatInputExpandButtonClickedProvider;", "(Ljava/lang/String;Lcom/tinder/core/experiment/AbTestUtility;Lcom/tinder/reactions/analytics/GrandGestureOpenEventDispatcher;Lcom/tinder/chat/analytics/ChatTapInputTypeEventDispatcher;Lcom/tinder/reactions/chat/provider/ChatInputExpandButtonClickedProvider;)V", "target", "Lcom/tinder/reactions/chat/target/ExpandReactionDrawerFeatureTarget;", "getTarget$Tinder_release", "()Lcom/tinder/reactions/chat/target/ExpandReactionDrawerFeatureTarget;", "setTarget$Tinder_release", "(Lcom/tinder/reactions/chat/target/ExpandReactionDrawerFeatureTarget;)V", "dispatchGrandGestureExpandButtonClicked", "", "dispatchGrandGestureOpenEvent", "dispatchTapInputEvent", "onExpandButtonClicked", "onTake", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.chat.presenter.a */
public final class C14603a {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public ExpandReactionDrawerFeatureTarget f46080a;
    /* renamed from: b */
    private final String f46081b;
    /* renamed from: c */
    private final AbTestUtility f46082c;
    /* renamed from: d */
    private final C16277h f46083d;
    /* renamed from: e */
    private final af f46084e;
    /* renamed from: f */
    private final C14598a f46085f;

    @Inject
    public C14603a(@NotNull String str, @NotNull AbTestUtility abTestUtility, @NotNull C16277h c16277h, @NotNull af afVar, @NotNull C14598a c14598a) {
        C2668g.b(str, "matchId");
        C2668g.b(abTestUtility, "abTestUtility");
        C2668g.b(c16277h, "grandGestureOpenEventDispatcher");
        C2668g.b(afVar, "chatTapInputTypeEventDispatcher");
        C2668g.b(c14598a, "chatInputExpandButtonClickedProvider");
        this.f46081b = str;
        this.f46082c = abTestUtility;
        this.f46083d = c16277h;
        this.f46084e = afVar;
        this.f46085f = c14598a;
    }

    @Take
    /* renamed from: a */
    public final void m55708a() {
        if (this.f46082c.isGrandGesturesEnabled()) {
            ExpandReactionDrawerFeatureTarget expandReactionDrawerFeatureTarget;
            expandReactionDrawerFeatureTarget = this.f46080a;
            if (expandReactionDrawerFeatureTarget == null) {
                C2668g.b("target");
            }
            expandReactionDrawerFeatureTarget.showReactions();
            return;
        }
        expandReactionDrawerFeatureTarget = this.f46080a;
        if (expandReactionDrawerFeatureTarget == null) {
            C2668g.b("target");
        }
        expandReactionDrawerFeatureTarget.hideReactions();
    }

    /* renamed from: b */
    public final void m55709b() {
        m55705c();
        m55706d();
        m55707e();
        ExpandReactionDrawerFeatureTarget expandReactionDrawerFeatureTarget = this.f46080a;
        if (expandReactionDrawerFeatureTarget == null) {
            C2668g.b("target");
        }
        expandReactionDrawerFeatureTarget.expandDrawer();
    }

    /* renamed from: c */
    private final void m55705c() {
        this.f46085f.m55694a();
    }

    /* renamed from: d */
    private final void m55706d() {
        this.f46083d.m61461a(new C14583a(this.f46081b, GestureDrawerInteractMethod.TAP));
    }

    /* renamed from: e */
    private final void m55707e() {
        this.f46084e.a(new C8418a(this.f46081b, "gestures"));
    }
}
