package com.tinder.reactions.gestures.viewmodel;

import android.widget.ImageView.ScaleType;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/reactions/gestures/viewmodel/DrawableBackground;", "Lcom/tinder/reactions/gestures/viewmodel/GrandGestureViewBackground;", "drawable", "", "scaleType", "Landroid/widget/ImageView$ScaleType;", "(ILandroid/widget/ImageView$ScaleType;)V", "getDrawable", "()I", "getScaleType", "()Landroid/widget/ImageView$ScaleType;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.gestures.viewmodel.b */
public final class C16361b extends C14677g {
    /* renamed from: a */
    private final int f50894a;
    @NotNull
    /* renamed from: b */
    private final ScaleType f50895b;

    /* renamed from: a */
    public final int m61719a() {
        return this.f50894a;
    }

    public /* synthetic */ C16361b(int i, ScaleType scaleType, int i2, C15823e c15823e) {
        if ((i2 & 2) != 0) {
            scaleType = ScaleType.FIT_CENTER;
        }
        this(i, scaleType);
    }

    @NotNull
    /* renamed from: b */
    public final ScaleType m61720b() {
        return this.f50895b;
    }

    public C16361b(int i, @NotNull ScaleType scaleType) {
        C2668g.b(scaleType, "scaleType");
        super();
        this.f50894a = i;
        this.f50895b = scaleType;
    }
}
