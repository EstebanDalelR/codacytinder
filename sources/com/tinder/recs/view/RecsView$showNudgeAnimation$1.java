package com.tinder.recs.view;

import android.view.View;
import com.tinder.R;
import com.tinder.base.p173c.C8304b;
import com.tinder.base.view.TouchBlockingViewContainer;
import com.tinder.fireboarding.view.animation.C9603f.C9601a;
import com.tinder.fireboarding.view.animation.C9607h;
import com.tinder.utils.au;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class RecsView$showNudgeAnimation$1 extends Lambda implements Function0<C15813i> {
    final /* synthetic */ TouchBlockingViewContainer $touchBlockingViewContainer;
    final /* synthetic */ RecsView this$0;

    RecsView$showNudgeAnimation$1(RecsView recsView, TouchBlockingViewContainer touchBlockingViewContainer) {
        this.this$0 = recsView;
        this.$touchBlockingViewContainer = touchBlockingViewContainer;
        super(0);
    }

    public final void invoke() {
        LikeButton likeButton = this.this$0.getGamepad$Tinder_release().likeButton;
        C2668g.a(likeButton, "gamepad.likeButton");
        View view = likeButton;
        if (C8304b.b(view)) {
            likeButton = this.this$0.getGamepad$Tinder_release().likeButton;
            C2668g.a(likeButton, "gamepad.likeButton");
            C9601a c9601a = new C9601a(likeButton, au.m57652c(this.this$0, R.color.white), au.m57649a(this.this$0, (int) R.string.fireboarding_like_tooltip, new String[0]), au.m57652c(this.this$0, R.color.like_meter_gradient_end));
            IconGamepadButton iconGamepadButton = this.this$0.getGamepad$Tinder_release().passButton;
            C2668g.a(iconGamepadButton, "gamepad.passButton");
            C9607h.a(RecsView.access$getNudgeAnimation$p(this.this$0), this.$touchBlockingViewContainer, this.this$0.getCardStack$Tinder_release(), c9601a, new C9601a(iconGamepadButton, au.m57652c(this.this$0, R.color.white), au.m57649a(this.this$0, (int) R.string.fireboarding_pass_tooltip, new String[0]), au.m57652c(this.this$0, R.color.button_gradient_red)), 0.0f, 16, null);
            return;
        }
        view.getViewTreeObserver().addOnPreDrawListener(new C14719x8a6c55b(view, this));
    }
}
