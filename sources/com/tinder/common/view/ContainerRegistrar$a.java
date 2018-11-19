package com.tinder.common.view;

import android.view.View;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/common/view/ContainerRegistrar$Companion;", "", "()V", "findParentContainerRegistrar", "Lcom/tinder/common/view/ContainerRegistrar;", "view", "Landroid/view/View;", "base_release"}, k = 1, mv = {1, 1, 10})
public final class ContainerRegistrar$a {
    /* renamed from: a */
    static final /* synthetic */ ContainerRegistrar$a f30341a = new ContainerRegistrar$a();

    private ContainerRegistrar$a() {
    }

    @Nullable
    /* renamed from: a */
    public final ContainerRegistrar m36597a(@NotNull View view) {
        C2668g.b(view, "view");
        if (view.getContext() instanceof ContainerRegistrar) {
            view = view.getContext();
            if (view != null) {
                return (ContainerRegistrar) view;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.common.view.ContainerRegistrar");
        }
        view = view.getParent();
        if (!(view instanceof View)) {
            view = null;
        }
        view = view;
        while (view != null) {
            if (view instanceof ContainerRegistrar) {
                return (ContainerRegistrar) view;
            }
            view = view.getParent();
            if (!(view instanceof View)) {
                view = null;
            }
            view = view;
        }
        return null;
    }
}
