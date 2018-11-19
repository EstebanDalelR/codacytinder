package com.tinder.toppicks.view;

import android.content.Context;
import android.support.annotation.StyleRes;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B%\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0014¨\u0006\u000f"}, d2 = {"Lcom/tinder/toppicks/view/PortraitCardView;", "Landroid/support/v7/widget/CardView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "style", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "Companion", "toppicks_release"}, k = 1, mv = {1, 1, 10})
public class PortraitCardView extends CardView {
    /* renamed from: a */
    public static final C15303a f52660a = new C15303a();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/toppicks/view/PortraitCardView$Companion;", "", "()V", "ASPECT_RATIO", "", "toppicks_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.view.PortraitCardView$a */
    public static final class C15303a {
        private C15303a() {
        }
    }

    public PortraitCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
    }

    public /* synthetic */ PortraitCardView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public /* synthetic */ PortraitCardView(Context context, AttributeSet attributeSet, int i, int i2, C15823e c15823e) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet, i);
    }

    public PortraitCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, @StyleRes int i) {
        C2668g.b(context, "context");
        super(context, attributeSet, i);
    }

    protected void onMeasure(int i, int i2) {
        i = MeasureSpec.getSize(i);
        super.onMeasure(MeasureSpec.makeMeasureSpec(i, 1073741824), MeasureSpec.makeMeasureSpec((int) (((float) i) * 1069044204), 1073741824));
    }
}
