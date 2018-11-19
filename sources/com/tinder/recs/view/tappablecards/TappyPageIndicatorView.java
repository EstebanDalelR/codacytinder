package com.tinder.recs.view.tappablecards;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0014J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\rH\u0014J\u000e\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\rJ\u000e\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\rR\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/tinder/recs/view/tappablecards/TappyPageIndicatorView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "renderer", "Lcom/tinder/recs/view/tappablecards/TappyPageIndicatorRenderer;", "getRenderer", "()Lcom/tinder/recs/view/tappablecards/TappyPageIndicatorRenderer;", "measureSpan", "", "measureSpec", "actualSize", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setActivePage", "activePage", "setPageCount", "pageCount", "recs-cards_release"}, k = 1, mv = {1, 1, 10})
public class TappyPageIndicatorView extends View {
    private HashMap _$_findViewCache;
    @NotNull
    private final TappyPageIndicatorRenderer renderer;

    public void _$_clearFindViewByIdCache() {
        if (this._$_findViewCache != null) {
            this._$_findViewCache.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), view);
        return view;
    }

    public TappyPageIndicatorView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.renderer = new TappyPageIndicatorRenderer(this, null, null, 6, null);
        setLayerType(1, null);
    }

    public TappyPageIndicatorView(@NotNull Context context) {
        C2668g.b(context, "context");
        this(context, null);
    }

    @NotNull
    protected final TappyPageIndicatorRenderer getRenderer() {
        return this.renderer;
    }

    protected void onDraw(@NotNull Canvas canvas) {
        C2668g.b(canvas, "canvas");
        super.onDraw(canvas);
        this.renderer.draw(canvas);
    }

    public final void setPageCount(int i) {
        this.renderer.setPageCount(i);
        invalidate();
    }

    public final void setActivePage(int i) {
        this.renderer.setActivePage(i);
        invalidate();
    }

    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(measureSpan(i, this.renderer.getWidth()), measureSpan(i2, this.renderer.getHeight()));
    }

    private final int measureSpan(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        i = MeasureSpec.getMode(i);
        if (i == Integer.MIN_VALUE) {
            return Math.min(i2, size);
        }
        if (i != 1073741824) {
            return i2;
        }
        return size;
    }
}
