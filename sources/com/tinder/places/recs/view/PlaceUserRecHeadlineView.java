package com.tinder.places.recs.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.tinder.R;
import com.tinder.views.grid.GridUserRecCardHeadlineView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0014¨\u0006\t"}, d2 = {"Lcom/tinder/places/recs/view/PlaceUserRecHeadlineView;", "Lcom/tinder/views/grid/GridUserRecCardHeadlineView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "inflateView", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PlaceUserRecHeadlineView extends GridUserRecCardHeadlineView {
    /* renamed from: a */
    private HashMap f43356a;

    public void _$_clearFindViewByIdCache() {
        if (this.f43356a != null) {
            this.f43356a.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f43356a == null) {
            this.f43356a = new HashMap();
        }
        View view = (View) this.f43356a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f43356a.put(Integer.valueOf(i), view);
        return view;
    }

    public PlaceUserRecHeadlineView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
    }

    protected void inflateView(@NotNull Context context) {
        C2668g.b(context, "context");
        LinearLayout.inflate(context, R.layout.rec_card_user_headline_place, this);
    }
}
