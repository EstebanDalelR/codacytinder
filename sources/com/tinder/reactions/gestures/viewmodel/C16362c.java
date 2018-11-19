package com.tinder.reactions.gestures.viewmodel;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/tinder/reactions/gestures/viewmodel/DynamicTypeGrandGestureViewModel;", "Lcom/tinder/reactions/gestures/viewmodel/GrandGestureViewModel;", "animationFile", "", "animationScale", "", "activationType", "Lcom/tinder/reactions/gestures/viewmodel/GestureActivationType;", "(Ljava/lang/String;FLcom/tinder/reactions/gestures/viewmodel/GestureActivationType;)V", "getAnimationFile", "()Ljava/lang/String;", "getAnimationScale", "()F", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.gestures.viewmodel.c */
public final class C16362c extends C14678h {
    @NotNull
    /* renamed from: a */
    private final String f50896a;
    /* renamed from: b */
    private final float f50897b;

    @NotNull
    /* renamed from: a */
    public final String m61721a() {
        return this.f50896a;
    }

    /* renamed from: b */
    public final float m61722b() {
        return this.f50897b;
    }

    public C16362c(@NotNull String str, float f, @NotNull GestureActivationType gestureActivationType) {
        C2668g.b(str, "animationFile");
        C2668g.b(gestureActivationType, "activationType");
        super(gestureActivationType);
        this.f50896a = str;
        this.f50897b = f;
    }
}
