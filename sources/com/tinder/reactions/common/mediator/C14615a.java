package com.tinder.reactions.common.mediator;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/tinder/reactions/common/mediator/ViewMediator;", "Landroid/view/View$OnAttachStateChangeListener;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "getView$Tinder_release", "()Landroid/view/View;", "onViewAttachedToWindow", "", "v", "onViewDetachedFromWindow", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.common.mediator.a */
public class C14615a implements OnAttachStateChangeListener {
    @NotNull
    /* renamed from: a */
    private final View f46120a;

    public void onViewAttachedToWindow(@NotNull View view) {
        C2668g.b(view, "v");
    }

    public void onViewDetachedFromWindow(@NotNull View view) {
        C2668g.b(view, "v");
    }

    public C14615a(@NotNull View view) {
        C2668g.b(view, "view");
        this.f46120a = view;
        this.f46120a.addOnAttachStateChangeListener(this);
    }

    @NotNull
    /* renamed from: a */
    public final View m55767a() {
        return this.f46120a;
    }
}
