package com.tinder.base.view;

import android.content.Context;
import android.support.annotation.IdRes;
import android.util.AttributeSet;
import android.widget.ViewAnimator;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R&\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\b8G@FX\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/tinder/base/view/IdViewAnimator;", "Landroid/widget/ViewAnimator;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "id", "", "displayedChildId", "getDisplayedChildId", "()I", "setDisplayedChildId", "(I)V", "base_release"}, k = 1, mv = {1, 1, 10})
public class IdViewAnimator extends ViewAnimator {
    public /* synthetic */ IdViewAnimator(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public IdViewAnimator(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.m10309b(context, "context");
        super(context, attributeSet);
    }

    @IdRes
    public final int getDisplayedChildId() {
        Object childAt = getChildAt(getDisplayedChild());
        C2668g.m10305a(childAt, "getChildAt(displayedChild)");
        return childAt.getId();
    }

    public final void setDisplayedChildId(@IdRes int i) {
        if (getDisplayedChildId() != i) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                Object childAt = getChildAt(i2);
                C2668g.m10305a(childAt, "getChildAt(i)");
                if (childAt.getId() == i) {
                    setDisplayedChild(i2);
                    return;
                }
            }
            i = getResources().getResourceEntryName(i);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No view with ID ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
