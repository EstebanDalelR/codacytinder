package com.tinder.views.grid;

import android.content.Context;
import android.support.v4.content.C0432b;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.tinder.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0014¨\u0006\f"}, d2 = {"Lcom/tinder/views/grid/GridEmptyRecCardView;", "Landroid/support/v7/widget/CardView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onMeasure", "", "widthMeasureSpec", "", "heightMeasureSpec", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class GridEmptyRecCardView extends CardView {
    public /* synthetic */ GridEmptyRecCardView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public GridEmptyRecCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        setRadius((float) getResources().getDimensionPixelSize(R.dimen.rec_card_radius));
        setCardBackgroundColor(C0432b.c(context, R.color.fast_match_empty_card_color));
    }

    protected void onMeasure(int i, int i2) {
        i = MeasureSpec.getSize(i);
        super.onMeasure(MeasureSpec.makeMeasureSpec(i, 1073741824), MeasureSpec.makeMeasureSpec((int) (((float) i) * 1069044204), 1073741824));
    }
}
