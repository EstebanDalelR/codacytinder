package com.tinder.toppicks.dialog;

import android.animation.Animator;
import com.tinder.toppicks.FadeAnimation;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/Animator;", "invoke", "com/tinder/toppicks/dialog/TopPicksPaywallDialog$collapse$2$2"}, k = 3, mv = {1, 1, 10})
final class TopPicksPaywallDialog$collapse$$inlined$apply$lambda$3 extends Lambda implements Function1<Animator, C15813i> {
    /* renamed from: a */
    final /* synthetic */ TopPicksPaywallDialog f58679a;

    TopPicksPaywallDialog$collapse$$inlined$apply$lambda$3(TopPicksPaywallDialog topPicksPaywallDialog) {
        this.f58679a = topPicksPaywallDialog;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        m67469a((Animator) obj);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m67469a(@NotNull Animator animator) {
        C2668g.b(animator, "it");
        this.f58679a.m57325c(FadeAnimation.OUT);
    }
}
