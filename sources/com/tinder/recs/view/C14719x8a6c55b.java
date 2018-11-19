package com.tinder.recs.view;

import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.tinder.R;
import com.tinder.base.p173c.C8304b;
import com.tinder.fireboarding.view.animation.C9603f.C9601a;
import com.tinder.fireboarding.view.animation.C9607h;
import com.tinder.utils.au;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005¸\u0006\u0000"}, d2 = {"com/tinder/base/extension/ViewExtKt$doWhenViewHasSize$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "onPreDraw", "", "base_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.recs.view.RecsView$showNudgeAnimation$1$$special$$inlined$doWhenViewHasSize$1 */
public final class C14719x8a6c55b implements OnPreDrawListener {
    final /* synthetic */ View receiver$0;
    final /* synthetic */ RecsView$showNudgeAnimation$1 this$0;

    public C14719x8a6c55b(View view, RecsView$showNudgeAnimation$1 recsView$showNudgeAnimation$1) {
        this.receiver$0 = view;
        this.this$0 = recsView$showNudgeAnimation$1;
    }

    public boolean onPreDraw() {
        if (!C8304b.b(this.receiver$0)) {
            return true;
        }
        this.receiver$0.getViewTreeObserver().removeOnPreDrawListener(this);
        View view = this.receiver$0;
        LikeButton likeButton = this.this$0.this$0.getGamepad$Tinder_release().likeButton;
        C2668g.a(likeButton, "gamepad.likeButton");
        C9601a c9601a = new C9601a(likeButton, au.m57652c(this.this$0.this$0, R.color.white), au.m57649a(this.this$0.this$0, (int) R.string.fireboarding_like_tooltip, new String[0]), au.m57652c(this.this$0.this$0, R.color.like_meter_gradient_end));
        IconGamepadButton iconGamepadButton = this.this$0.this$0.getGamepad$Tinder_release().passButton;
        C2668g.a(iconGamepadButton, "gamepad.passButton");
        C9607h.a(RecsView.access$getNudgeAnimation$p(this.this$0.this$0), this.this$0.$touchBlockingViewContainer, this.this$0.this$0.getCardStack$Tinder_release(), c9601a, new C9601a(iconGamepadButton, au.m57652c(this.this$0.this$0, R.color.white), au.m57649a(this.this$0.this$0, (int) R.string.fireboarding_pass_tooltip, new String[0]), au.m57652c(this.this$0.this$0, R.color.button_gradient_red)), 0.0f, 16, null);
        return false;
    }
}
