package com.tinder.reactions.gestures.animators;

import android.view.View;
import com.tinder.domain.reactions.model.GrandGestureType;
import com.tinder.reactions.gestures.p393a.C14641a;
import com.tinder.reactions.gestures.viewmodel.C14678h;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0004J\u0006\u0010\r\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/reactions/gestures/animators/GrandGestureAnimator;", "", "grandGestureAnimationView", "Landroid/view/View;", "viewModel", "Lcom/tinder/reactions/gestures/viewmodel/GrandGestureViewModel;", "mediator", "Lcom/tinder/reactions/gestures/mediator/GestureAnimationMediator;", "(Landroid/view/View;Lcom/tinder/reactions/gestures/viewmodel/GrandGestureViewModel;Lcom/tinder/reactions/gestures/mediator/GestureAnimationMediator;)V", "gestureActivated", "", "type", "Lcom/tinder/domain/reactions/model/GrandGestureType;", "getView", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.gestures.animators.c */
public class C14646c {
    /* renamed from: a */
    private final View f46185a;
    /* renamed from: b */
    private final C14678h f46186b;
    /* renamed from: c */
    private final C14641a f46187c;

    public C14646c(@NotNull View view, @NotNull C14678h c14678h, @NotNull C14641a c14641a) {
        C2668g.b(view, "grandGestureAnimationView");
        C2668g.b(c14678h, "viewModel");
        C2668g.b(c14641a, "mediator");
        this.f46185a = view;
        this.f46186b = c14678h;
        this.f46187c = c14641a;
    }

    @NotNull
    /* renamed from: a */
    public final View m55838a() {
        return this.f46185a;
    }

    /* renamed from: a */
    protected final void m55839a(@NotNull GrandGestureType grandGestureType) {
        C2668g.b(grandGestureType, "type");
        this.f46187c.m55831a(grandGestureType);
    }
}
