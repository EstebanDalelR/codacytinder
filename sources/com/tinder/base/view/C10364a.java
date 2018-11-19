package com.tinder.base.view;

import android.support.v4.view.C0600i;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J \u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\nJ\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000eH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/tinder/base/view/ViewPagerAdapter;", "Landroid/support/v4/view/PagerAdapter;", "()V", "viewsForPage", "Landroid/util/SparseArray;", "Landroid/view/View;", "createViewForPage", "container", "Landroid/view/ViewGroup;", "position", "", "destroyItem", "", "object", "", "getViewForPage", "index", "instantiateItem", "isViewFromObject", "", "view", "obj", "base_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.base.view.a */
public abstract class C10364a extends C0600i {
    /* renamed from: a */
    private final SparseArray<View> f33839a = new SparseArray();

    @NotNull
    /* renamed from: a */
    public abstract View mo11322a(@NotNull ViewGroup viewGroup, int i);

    public /* synthetic */ Object instantiateItem(ViewGroup viewGroup, int i) {
        return m42196b(viewGroup, i);
    }

    @NotNull
    /* renamed from: b */
    public View m42196b(@NotNull ViewGroup viewGroup, int i) {
        C2668g.b(viewGroup, "container");
        View a = mo11322a(viewGroup, i);
        viewGroup.addView(a);
        this.f33839a.setValueAt(i, a);
        return a;
    }

    public boolean isViewFromObject(@NotNull View view, @NotNull Object obj) {
        C2668g.b(view, "view");
        C2668g.b(obj, "obj");
        return C2668g.a(view, obj);
    }

    public void destroyItem(@NotNull ViewGroup viewGroup, int i, @NotNull Object obj) {
        C2668g.b(viewGroup, "container");
        C2668g.b(obj, "object");
        this.f33839a.removeAt(i);
    }
}
