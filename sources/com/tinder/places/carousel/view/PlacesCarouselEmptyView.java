package com.tinder.places.carousel.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.learnmore.LearnMoreActivity;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/places/carousel/view/PlacesCarouselEmptyView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PlacesCarouselEmptyView extends FrameLayout {
    /* renamed from: a */
    private HashMap f33254a;

    /* renamed from: a */
    public View m41507a(int i) {
        if (this.f33254a == null) {
            this.f33254a = new HashMap();
        }
        View view = (View) this.f33254a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f33254a.put(Integer.valueOf(i), view);
        return view;
    }

    public PlacesCarouselEmptyView(@NotNull final Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        FrameLayout.inflate(context, R.layout.view_no_places_card, this);
        ((TextView) m41507a(C6248a.learnMoreButton)).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                view = context;
                if (view == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                }
                ((Activity) view).startActivity(new Intent(context, LearnMoreActivity.class));
            }
        });
    }
}
