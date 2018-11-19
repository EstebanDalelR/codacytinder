package com.tinder.places.card.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.resource.bitmap.C4103d;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.deadshot.Deadshot;
import com.tinder.places.card.presenter.C10133f;
import com.tinder.places.card.target.PlaceRecTeasersTarget;
import com.tinder.places.injection.PlacesComponentProvider;
import com.tinder.places.p312g.p313a.C10211a;
import com.tinder.utils.au;
import com.tinder.viewmodel.C15425d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import javax.inject.Inject;
import jp.wasabeef.glide.transformations.RoundedCornersTransformation;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C19301m;
import kotlin.collections.ab;
import kotlin.jvm.internal.C15828l;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C19068g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017J \u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\"\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\u0012H\u0016J\b\u0010!\u001a\u00020\u000fH\u0014J\b\u0010\"\u001a\u00020\u000fH\u0014J0\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u0012H\u0014J\b\u0010*\u001a\u00020\u000fH\u0016J\b\u0010+\u001a\u00020\u000fH\u0016J\u0010\u0010,\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u0012H\u0016J\u0010\u0010.\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u0012H\u0016R\u001e\u0010\b\u001a\u00020\t8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u00060"}, d2 = {"Lcom/tinder/places/card/view/PlaceRecTeasersView;", "Landroid/widget/LinearLayout;", "Lcom/tinder/places/card/target/PlaceRecTeasersTarget;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "presenter", "Lcom/tinder/places/card/presenter/PlaceRecTeasersPresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/places/card/presenter/PlaceRecTeasersPresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/places/card/presenter/PlaceRecTeasersPresenter;)V", "addImageView", "", "applyNewVisitorsOverlay", "newVisitors", "", "background", "Lcom/tinder/places/view/util/PlacesGradientDrawable;", "bindTeasers", "viewModel", "Lcom/tinder/viewmodel/PlaceRecTeasersViewModel;", "bindVisitorCounts", "totalVisitors", "backgroundDrawable", "Landroid/graphics/drawable/Drawable;", "loadImage", "index", "imageUrl", "", "cornerRadius", "onAttachedToWindow", "onDetachedFromWindow", "onLayout", "changed", "", "l", "t", "r", "b", "requestThumbnailsHeight", "resetImageViews", "setImageViewCount", "images", "setThumbnailsHeight", "adjustedHeight", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PlaceRecTeasersView extends LinearLayout implements PlaceRecTeasersTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public C10133f f39886a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/tinder/places/card/view/PlaceRecTeasersView$requestThumbnailsHeight$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "(Lcom/tinder/places/card/view/PlaceRecTeasersView;)V", "onGlobalLayout", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.PlaceRecTeasersView$a */
    public static final class C10162a implements OnGlobalLayoutListener {
        /* renamed from: a */
        final /* synthetic */ PlaceRecTeasersView f33169a;

        C10162a(PlaceRecTeasersView placeRecTeasersView) {
            this.f33169a = placeRecTeasersView;
        }

        public void onGlobalLayout() {
            this.f33169a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            Iterable b = C19068g.b(0, this.f33169a.getChildCount());
            Collection arrayList = new ArrayList(C19301m.a(b, 10));
            Iterator it = b.iterator();
            while (it.hasNext()) {
                arrayList.add(this.f33169a.getChildAt(((ab) it).b()));
            }
            for (View view : (List) arrayList) {
                Object obj;
                C2668g.a(view, "it");
                if (view.getWidth() > 0) {
                    obj = 1;
                    continue;
                } else {
                    obj = null;
                    continue;
                }
                if (obj != null) {
                    C10133f presenter$Tinder_release = this.f33169a.getPresenter$Tinder_release();
                    C2668g.a(view, "it");
                    presenter$Tinder_release.m41436a(view.getWidth(), view.getHeight());
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    public PlaceRecTeasersView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        ((PlacesComponentProvider) context).getPlacesComponent().inject(this);
    }

    @NotNull
    public final C10133f getPresenter$Tinder_release() {
        C10133f c10133f = this.f39886a;
        if (c10133f == null) {
            C2668g.b("presenter");
        }
        return c10133f;
    }

    public final void setPresenter$Tinder_release(@NotNull C10133f c10133f) {
        C2668g.b(c10133f, "<set-?>");
        this.f39886a = c10133f;
    }

    public void requestThumbnailsHeight() {
        getViewTreeObserver().addOnGlobalLayoutListener(new C10162a(this));
    }

    public void setThumbnailsHeight(int i) {
        Iterable b = C19068g.b(0, getChildCount());
        Collection arrayList = new ArrayList(C19301m.a(b, 10));
        Iterator it = b.iterator();
        while (it.hasNext()) {
            arrayList.add(getChildAt(((ab) it).b()));
        }
        for (View view : (List) arrayList) {
            C2668g.a(view, "it");
            LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i;
            view.setLayoutParams(layoutParams);
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        i = this.f39886a;
        if (i == 0) {
            C2668g.b("presenter");
        }
        i.m41439a(z);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C10133f c10133f = this.f39886a;
        if (c10133f == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c10133f);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    /* renamed from: a */
    public final void m48651a(int i, int i2, @Nullable Drawable drawable) {
        C10133f c10133f = this.f39886a;
        if (c10133f == null) {
            C2668g.b("presenter");
        }
        if (drawable == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.places.view.util.PlacesGradientDrawable");
        }
        c10133f.m41437a(i, i2, (C10211a) drawable);
    }

    /* renamed from: a */
    public final void m48652a(@NotNull C15425d c15425d) {
        C2668g.b(c15425d, "viewModel");
        C10133f c10133f = this.f39886a;
        if (c10133f == null) {
            C2668g.b("presenter");
        }
        c10133f.m41438a(c15425d);
    }

    public void resetImageViews() {
        Iterator it = C19068g.b(0, getChildCount()).iterator();
        while (it.hasNext()) {
            View childAt = getChildAt(((ab) it).b());
            C2668g.a(childAt, "teasersView");
            ImageView imageView = (ImageView) childAt.findViewById(C6248a.recsTeaserImageView);
            C0994i.a(imageView);
            imageView.setBackgroundResource(R.drawable.places_recs_placeholder_loading);
            TextView textView = (TextView) childAt.findViewById(C6248a.newVisitorsText);
            C2668g.a(textView, "teasersView.newVisitorsText");
            textView.setVisibility(8);
        }
    }

    public void applyNewVisitorsOverlay(int i, @NotNull C10211a c10211a) {
        C2668g.b(c10211a, "background");
        View childAt = getChildAt(getChildCount() - 1);
        ColorDrawable colorDrawable = new ColorDrawable(c10211a.m41531a());
        colorDrawable.setAlpha((int) 1125377638);
        C2668g.a(childAt, "lastTeaserView");
        TextView textView = (TextView) childAt.findViewById(C6248a.newVisitorsText);
        C2668g.a(textView, "lastTeaserView.newVisitorsText");
        textView.setBackground(colorDrawable);
        ImageView imageView = (ImageView) childAt.findViewById(C6248a.recsTeaserImageView);
        C2668g.a(imageView, "lastTeaserView.recsTeaserImageView");
        imageView.setAlpha(0.13f);
        textView = (TextView) childAt.findViewById(C6248a.newVisitorsText);
        C2668g.a(textView, "lastTeaserView.newVisitorsText");
        textView.setVisibility(0);
        textView = (TextView) childAt.findViewById(C6248a.newVisitorsText);
        C2668g.a(textView, "lastTeaserView.newVisitorsText");
        Object[] objArr;
        if (i >= 99) {
            i = au.a(this, R.plurals.places_new_visitors, 99);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append('+');
            C15828l c15828l = C15828l.f49033a;
            objArr = new Object[]{Integer.valueOf(99)};
            i = String.format(i, Arrays.copyOf(objArr, objArr.length));
            C2668g.a(i, "java.lang.String.format(format, *args)");
            stringBuilder.append(i);
            i = stringBuilder.toString();
        } else {
            String a = au.a(this, R.plurals.places_new_visitors, i);
            C15828l c15828l2 = C15828l.f49033a;
            objArr = new Object[]{Integer.valueOf(i)};
            i = String.format(a, Arrays.copyOf(objArr, objArr.length));
            C2668g.a(i, "java.lang.String.format(format, *args)");
            i = (CharSequence) i;
        }
        textView.setText(i);
    }

    public void loadImage(int i, @Nullable String str, int i2) {
        i = getChildAt(i);
        C2668g.a(i, "teasersView");
        ImageView imageView = (ImageView) i.findViewById(C6248a.recsTeaserImageView);
        ViewCompat.i(imageView, 3.0f);
        C2668g.a(imageView, "teasersImageView");
        imageView.setVisibility(0);
        if (str != null) {
            C0994i.b(getContext()).a(str).d().a(new Transformation[]{new C4103d(getContext()), new RoundedCornersTransformation(getContext(), i2, 0)}).a(imageView);
            return;
        }
        imageView.setBackgroundResource(R.drawable.places_recs_placeholder_empty);
    }

    public void setImageViewCount(int i) {
        if (getChildCount() != i) {
            removeAllViews();
            i = C19068g.b(0, i).iterator();
            while (i.hasNext()) {
                ((ab) i).b();
                m48650a();
            }
        }
    }

    /* renamed from: a */
    private final void m48650a() {
        addView(LayoutInflater.from(getContext()).inflate(R.layout.view_place_card_image_cell, this, false));
    }
}
