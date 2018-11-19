package com.tinder.places.carousel.view;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0002J\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\nR\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/places/carousel/view/PlacesCarouselLoadingView;", "Landroid/support/constraint/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "cardMargin", "", "addTeasers", "", "startShimmer", "stopShimmer", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PlacesCarouselLoadingView extends ConstraintLayout {
    /* renamed from: a */
    private final int f39920a = getResources().getDimensionPixelSize(R.dimen.places_recs_image_cell_margin);
    /* renamed from: b */
    private HashMap f39921b;

    /* renamed from: a */
    public View m48709a(int i) {
        if (this.f39921b == null) {
            this.f39921b = new HashMap();
        }
        View view = (View) this.f39921b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f39921b.put(Integer.valueOf(i), view);
        return view;
    }

    public PlacesCarouselLoadingView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        ConstraintLayout.inflate(context, R.layout.view_places_loading_card, this);
        m48708c();
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) m48709a(C6248a.placesLoadingShimmer);
        C2668g.a(shimmerFrameLayout, "placesLoadingShimmer");
        shimmerFrameLayout.setDropoff(0.8f);
    }

    /* renamed from: a */
    public final void m48710a() {
        ((ShimmerFrameLayout) m48709a(C6248a.placesLoadingShimmer)).b();
    }

    /* renamed from: b */
    public final void m48711b() {
        ((ShimmerFrameLayout) m48709a(C6248a.placesLoadingShimmer)).c();
    }

    /* renamed from: c */
    private final void m48708c() {
        for (int i = 0; i < 4; i++) {
            View view = new View(getContext());
            view.setBackgroundResource(R.drawable.places_loading_card_grey_rectangle);
            LayoutParams layoutParams = new LayoutParams(-1, -1, 1.0f);
            layoutParams.setMarginEnd(this.f39920a);
            layoutParams.setMarginStart(this.f39920a);
            view.setLayoutParams(layoutParams);
            ((LinearLayout) m48709a(C6248a.loadingPlaceRecs)).addView(view);
        }
    }
}
