package com.tinder.reactions.gestures.animators;

import android.view.View;
import com.tinder.R;
import com.tinder.reactions.gestures.p393a.C14641a;
import com.tinder.reactions.gestures.view.FlingOnTargetGrandGestureView;
import com.tinder.reactions.gestures.view.PullAndReleaseGrandGestureView;
import com.tinder.reactions.gestures.view.SelectableGrandGestureView;
import com.tinder.reactions.gestures.view.TappableGrandGestureView;
import com.tinder.reactions.gestures.viewmodel.C14678h;
import com.tinder.reactions.gestures.viewmodel.C16360a;
import com.tinder.reactions.gestures.viewmodel.C16362c;
import com.tinder.reactions.gestures.viewmodel.C16364m;
import com.tinder.reactions.gestures.viewmodel.C16365n;
import com.tinder.reactions.navigation.viewmodel.GrandGestureNavigationItem.Type;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J-\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rJ\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/tinder/reactions/gestures/animators/GrandGestureAnimatorFactory;", "", "()V", "create", "Lcom/tinder/reactions/gestures/animators/GrandGestureAnimator;", "itemType", "Lcom/tinder/reactions/navigation/viewmodel/GrandGestureNavigationItem$Type;", "viewModel", "Lcom/tinder/reactions/gestures/viewmodel/GrandGestureViewModel;", "view", "Landroid/view/View;", "mediator", "Lcom/tinder/reactions/gestures/mediator/GestureAnimationMediator;", "create$Tinder_release", "getGrandGestureViewResId", "", "getGrandGestureViewResId$Tinder_release", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.gestures.animators.d */
public final class C14647d {
    @NotNull
    /* renamed from: a */
    public final C14646c m55841a(@NotNull Type type, @NotNull C14678h c14678h, @NotNull View view, @NotNull C14641a c14641a) {
        C2668g.b(type, "itemType");
        C2668g.b(c14678h, "viewModel");
        C2668g.b(view, "view");
        C2668g.b(c14641a, "mediator");
        switch (C14648e.f46188a[type.ordinal()]) {
            case 1:
                return (C14646c) new C16339h((PullAndReleaseGrandGestureView) view, (C16365n) c14678h, c14641a);
            case 2:
                return (C14646c) new C16344m((TappableGrandGestureView) view, (C16365n) c14678h, c14641a);
            case 3:
                return (C14646c) new C16344m((TappableGrandGestureView) view, (C16365n) c14678h, c14641a);
            case 4:
                return (C14646c) new C16341j((SelectableGrandGestureView) view, (C16364m) c14678h, c14641a);
            case 5:
                return (C14646c) new C16335a((FlingOnTargetGrandGestureView) view, (C16365n) c14678h, c14641a);
            case 6:
                return (C14646c) new C16342k((TappableGrandGestureView) view, (C16362c) c14678h, c14641a);
            case 7:
                return (C14646c) new C16344m((TappableGrandGestureView) view, (C16365n) c14678h, c14641a);
            case 8:
                return (C14646c) new C16344m((TappableGrandGestureView) view, (C16365n) c14678h, c14641a);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    public final int m55840a(@NotNull C14678h c14678h) {
        C2668g.b(c14678h, "viewModel");
        switch (C14648e.f46189b[c14678h.m55931c().ordinal()]) {
            case 1:
                return R.layout.pull_and_release_gesture_view;
            case 2:
                return (!(c14678h instanceof C16365n) || (((C16365n) c14678h).m61728e() instanceof C16360a) == null) ? R.layout.tappable_grand_gesture_view : R.layout.animated_bg_tappable_grand_gesture_view;
            case 3:
                return R.layout.fling_on_target_grand_gesture_view;
            case 4:
                return R.layout.select_and_click_grand_gesture_view;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
