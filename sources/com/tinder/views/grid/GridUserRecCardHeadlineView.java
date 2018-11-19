package com.tinder.views.grid;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.tinder.R;
import com.tinder.recs.view.UserRecCardHeadLineView;
import com.tinder.utils.C15365p;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0014J\b\u0010\r\u001a\u00020\fH\u0014¨\u0006\u000e"}, d2 = {"Lcom/tinder/views/grid/GridUserRecCardHeadlineView;", "Lcom/tinder/recs/view/UserRecCardHeadLineView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "findGridInjector", "Lcom/tinder/views/grid/GridInjector;", "view", "Landroid/view/View;", "inflateView", "", "injectComponents", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public class GridUserRecCardHeadlineView extends UserRecCardHeadLineView {
    /* renamed from: a */
    private HashMap f52912a;

    public void _$_clearFindViewByIdCache() {
        if (this.f52912a != null) {
            this.f52912a.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f52912a == null) {
            this.f52912a = new HashMap();
        }
        View view = (View) this.f52912a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f52912a.put(Integer.valueOf(i), view);
        return view;
    }

    public GridUserRecCardHeadlineView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
    }

    protected void inflateView(@NotNull Context context) {
        C2668g.b(context, "context");
        LinearLayout.inflate(context, R.layout.rec_card_user_headline_grid, this);
    }

    protected void injectComponents() {
        Context context = getContext();
        C2668g.a(context, "context");
        context = C15365p.m57675b(context);
        if (context instanceof GridInjector) {
            ((GridInjector) context).inject(this);
            return;
        }
        ViewParent parent = getParent();
        if (parent == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.View");
        }
        m63197a((View) parent).inject(this);
    }

    /* renamed from: a */
    private final GridInjector m63197a(View view) {
        GridInjector gridInjector = (GridInjector) (!(view instanceof GridInjector) ? null : view);
        if (gridInjector != null) {
            return gridInjector;
        }
        view = view.getParent();
        if (view != null) {
            return m63197a(view);
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.View");
    }
}
