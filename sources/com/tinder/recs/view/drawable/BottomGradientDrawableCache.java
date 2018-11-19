package com.tinder.recs.view.drawable;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.support.annotation.ColorInt;
import android.support.v4.content.C0432b;
import android.util.SparseArray;
import com.tinder.R;
import com.tinder.module.ForApplication;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\nH\u0002J\u0013\u0010\u000b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\nH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/recs/view/drawable/BottomGradientDrawableCache;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "drawableArray", "Landroid/util/SparseArray;", "Landroid/graphics/drawable/GradientDrawable;", "create", "color", "", "get", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class BottomGradientDrawableCache {
    private final SparseArray<GradientDrawable> drawableArray = new SparseArray(2);

    @Inject
    public BottomGradientDrawableCache(@NotNull @ForApplication Context context) {
        C2668g.b(context, "context");
        int c = C0432b.c(context, R.color.rec_edgeless_bottom_gradient_default);
        context = C0432b.c(context, R.color.rec_edgeless_bottom_gradient_superlike);
        this.drawableArray.put(c, create(c));
        this.drawableArray.put(context, create(context));
    }

    @NotNull
    public final GradientDrawable get(@ColorInt int i) {
        if (this.drawableArray.get(i) == null) {
            this.drawableArray.put(i, create(i));
        }
        i = this.drawableArray.get(i);
        C2668g.a(i, "drawableArray.get(color)");
        return (GradientDrawable) i;
    }

    private final GradientDrawable create(@ColorInt int i) {
        GradientDrawable gradientDrawable = new GradientDrawable(Orientation.BOTTOM_TOP, new int[]{i, 0});
        gradientDrawable.setGradientType(0);
        gradientDrawable.setUseLevel(true);
        return gradientDrawable;
    }
}
