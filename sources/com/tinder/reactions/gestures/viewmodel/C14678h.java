package com.tinder.reactions.gestures.viewmodel;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/tinder/reactions/gestures/viewmodel/GrandGestureViewModel;", "", "activationType", "Lcom/tinder/reactions/gestures/viewmodel/GestureActivationType;", "(Lcom/tinder/reactions/gestures/viewmodel/GestureActivationType;)V", "getActivationType", "()Lcom/tinder/reactions/gestures/viewmodel/GestureActivationType;", "Lcom/tinder/reactions/gestures/viewmodel/SingleGrandGestureViewModel;", "Lcom/tinder/reactions/gestures/viewmodel/SelectableGrandGestureViewModel;", "Lcom/tinder/reactions/gestures/viewmodel/DynamicTypeGrandGestureViewModel;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.gestures.viewmodel.h */
public abstract class C14678h {
    @NotNull
    /* renamed from: a */
    private final GestureActivationType f46261a;

    private C14678h(GestureActivationType gestureActivationType) {
        this.f46261a = gestureActivationType;
    }

    @NotNull
    /* renamed from: c */
    public final GestureActivationType m55931c() {
        return this.f46261a;
    }
}
