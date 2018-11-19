package com.tinder.views.grid;

import android.content.Context;
import android.support.annotation.UiThread;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.util.AttributeSet;
import butterknife.BindInt;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.cardstack.cardgrid.view.C10483c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\nH\u0003J(\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\nH\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tinder/views/grid/GridEmptyView;", "Landroid/support/v7/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "emptyGridAdapter", "Lcom/tinder/views/grid/EmptyGridAdapter;", "numEmptyCards", "", "spanCount", "fillEmptyCardList", "", "numCards", "onSizeChanged", "w", "h", "oldw", "oldh", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class GridEmptyView extends RecyclerView {
    /* renamed from: a */
    private final C18301a f58761a = new C18301a();
    /* renamed from: b */
    private int f58762b;
    @BindInt(2131427342)
    @JvmField
    public int spanCount;

    public GridEmptyView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        ButterKnife.a(this);
        setHasFixedSize(true);
        addItemDecoration((ItemDecoration) new C10483c(this.spanCount, getResources().getDimensionPixelSize(R.dimen.padding_xxmed), 0, 4, null));
        setLayoutManager((LayoutManager) new GridLayoutManager(context, this.spanCount));
        setAdapter((Adapter) this.f58761a);
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != 0 && i2 != 0) {
            i = getAdapter();
            C2668g.a(i, "adapter");
            if (i.getItemCount() == 0) {
                this.f58762b = (int) Math.ceil((((double) getHeight()) / ((((double) getWidth()) / ((double) this.spanCount)) * ((double) 1069044204))) * ((double) this.spanCount));
                m67530a(this.f58762b);
            }
        }
    }

    @UiThread
    /* renamed from: a */
    private final void m67530a(int i) {
        List arrayList = new ArrayList();
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                arrayList.add(C15456b.f47887a);
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        this.f58761a.a(arrayList);
    }
}
