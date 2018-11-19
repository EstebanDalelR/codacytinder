package com.tinder.cardstack.cardgrid.view;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.support.v7.widget.RecyclerView.State;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0002J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0003H\u0002J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0002R\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/tinder/cardstack/cardgrid/view/GridSpacingItemDecoration;", "Landroid/support/v7/widget/RecyclerView$ItemDecoration;", "spanCount", "", "spacing", "headerOffset", "(III)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroid/support/v7/widget/RecyclerView;", "state", "Landroid/support/v7/widget/RecyclerView$State;", "isFirstColumn", "", "itemColumn", "isFirstRow", "itemPosition", "isLastColumn", "cardstack_release"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.cardstack.cardgrid.view.c */
public final class C10483c extends ItemDecoration {
    /* renamed from: a */
    private final int f34094a;
    /* renamed from: b */
    private final int f34095b;
    /* renamed from: c */
    private final int f34096c;

    /* renamed from: b */
    private final boolean m42355b(int i) {
        return i == 0;
    }

    public /* synthetic */ C10483c(int i, int i2, int i3, int i4, C15823e c15823e) {
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        this(i, i2, i3);
    }

    public C10483c(int i, int i2, int i3) {
        this.f34094a = i;
        this.f34095b = i2;
        this.f34096c = i3;
    }

    public void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull State state) {
        C2668g.b(rect, "outRect");
        C2668g.b(view, "view");
        C2668g.b(recyclerView, "parent");
        C2668g.b(state, "state");
        view = recyclerView.getChildAdapterPosition(view) + this.f34096c;
        recyclerView = view % this.f34094a;
        if (m42355b(recyclerView) != null) {
            rect.left = this.f34095b;
            rect.right = this.f34095b / 2;
        } else if (m42356c(recyclerView) != null) {
            rect.left = this.f34095b / 2;
            rect.right = this.f34095b;
        } else {
            rect.left = this.f34095b / 2;
            rect.right = this.f34095b / 2;
        }
        if (m42354a(view) != null) {
            rect.top = this.f34095b;
        }
        rect.bottom = this.f34095b;
    }

    /* renamed from: a */
    private final boolean m42354a(int i) {
        return i < this.f34094a;
    }

    /* renamed from: c */
    private final boolean m42356c(int i) {
        return i == this.f34094a - 1;
    }
}
