package com.tinder.toppicks.p482c;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\"\u0010\u000f\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/toppicks/grid/EndOfListScrollListener;", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "listener", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "lastItemHeight", "", "shouldTrigger", "", "totalDisplacementY", "onScrollStateChanged", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "newState", "onScrolled", "dx", "dy", "toppicks_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.c.a */
public final class C16988a extends OnScrollListener {
    /* renamed from: a */
    private boolean f52385a;
    /* renamed from: b */
    private int f52386b;
    /* renamed from: c */
    private int f52387c;
    /* renamed from: d */
    private final Function0<C15813i> f52388d;

    public C16988a(@NotNull Function0<C15813i> function0) {
        C2668g.b(function0, "listener");
        this.f52388d = function0;
    }

    public void onScrolled(@Nullable RecyclerView recyclerView, int i, int i2) {
        super.onScrolled(recyclerView, i, i2);
        this.f52386b += Math.abs(i2);
        this.f52385a = this.f52386b > this.f52387c ? true : null;
    }

    public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
        C2668g.b(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        if (recyclerView.canScrollVertically(1) == 0 && this.f52385a != 0) {
            i = recyclerView.getAdapter();
            C2668g.a(i, "recyclerView.adapter");
            if (i.getItemCount() > 0) {
                recyclerView = recyclerView.getLayoutManager();
                if (recyclerView == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager");
                }
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView;
                i = gridLayoutManager.findLastVisibleItemPosition();
                this.f52385a = false;
                this.f52386b = 0;
                recyclerView = gridLayoutManager.findViewByPosition(i);
                C2668g.a(recyclerView, "layoutManager.findViewByPosition(pos)");
                this.f52387c = recyclerView.getHeight();
                this.f52388d.invoke();
            }
        }
    }
}
