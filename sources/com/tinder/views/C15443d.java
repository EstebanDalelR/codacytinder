package com.tinder.views;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001c\u0010\u0007\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/tinder/views/CircularOutlineProvider;", "Landroid/view/ViewOutlineProvider;", "()V", "calculateBounds", "Landroid/graphics/RectF;", "view", "Landroid/view/View;", "getOutline", "", "outline", "Landroid/graphics/Outline;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.views.d */
public final class C15443d extends ViewOutlineProvider {
    public void getOutline(@Nullable View view, @Nullable Outline outline) {
        if (view != null && outline != null) {
            Rect rect = new Rect();
            m57936a(view).roundOut(rect);
            outline.setRoundRect(rect, ((float) rect.width()) / 2.0f);
        }
    }

    /* renamed from: a */
    private final RectF m57936a(View view) {
        int width = (view.getWidth() - view.getPaddingStart()) - view.getPaddingEnd();
        int height = (view.getHeight() - view.getPaddingTop()) - view.getPaddingBottom();
        int min = Math.min(width, height);
        float paddingStart = ((float) view.getPaddingStart()) + (((float) (width - min)) / 2.0f);
        view = ((float) view.getPaddingTop()) + (((float) (height - min)) / 2.0f);
        float f = (float) min;
        return new RectF(paddingStart, view, paddingStart + f, f + view);
    }
}
