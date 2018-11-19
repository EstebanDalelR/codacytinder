package com.tinder.reactions.gestures.viewmodel;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/reactions/gestures/viewmodel/AnimatedBackground;", "Lcom/tinder/reactions/gestures/viewmodel/GrandGestureViewBackground;", "animationFile", "", "animationScale", "", "(Ljava/lang/String;F)V", "getAnimationFile", "()Ljava/lang/String;", "getAnimationScale", "()F", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.gestures.viewmodel.a */
public final class C16360a extends C14677g {
    @NotNull
    /* renamed from: a */
    private final String f50892a;
    /* renamed from: b */
    private final float f50893b;

    @NotNull
    /* renamed from: a */
    public final String m61717a() {
        return this.f50892a;
    }

    /* renamed from: b */
    public final float m61718b() {
        return this.f50893b;
    }

    public C16360a(@NotNull String str, float f) {
        C2668g.b(str, "animationFile");
        super();
        this.f50892a = str;
        this.f50893b = f;
    }
}
