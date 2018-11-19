package com.tinder.places.main.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Guideline;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.deadshot.Deadshot;
import com.tinder.domain.meta.model.Location;
import com.tinder.domain.places.model.Place;
import com.tinder.places.main.presenter.C10220d;
import com.tinder.places.main.target.PlacesPinDropTarget;
import com.tinder.places.main.util.PlacesSharedViewInjector;
import com.tinder.places.map.view.PlacePinView;
import com.tinder.places.viewmodel.C14351c;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.C19301m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J<\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\f2\b\b\u0002\u0010%\u001a\u00020!J\u0016\u0010&\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\fH\u0016J\u0016\u0010'\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\fH\u0016J\u001e\u0010(\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\f2\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010)\u001a\u00020\u001dH\u0016J\u0006\u0010*\u001a\u00020\u001dJ\u0006\u0010+\u001a\u00020\u001dJ\b\u0010,\u001a\u00020\u001dH\u0016J\u0006\u0010-\u001a\u00020\u001dJ\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020$H\u0002J\b\u00101\u001a\u00020\u001dH\u0016J\b\u00102\u001a\u00020\u001dH\u0014J\b\u00103\u001a\u00020\u001dH\u0014J\b\u0010%\u001a\u00020\u001dH\u0016J\b\u00104\u001a\u00020\u001dH\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\f8BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0014\u0010\u000fR\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u00065"}, d2 = {"Lcom/tinder/places/main/view/PlacesPinDropView;", "Landroid/support/constraint/ConstraintLayout;", "Lcom/tinder/places/main/target/PlacesPinDropTarget;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "pendingAnimations", "", "Landroid/animation/Animator;", "pinGuidelines", "", "Landroid/support/constraint/Guideline;", "getPinGuidelines", "()Ljava/util/List;", "pinGuidelines$delegate", "Lkotlin/Lazy;", "pinViews", "Lcom/tinder/places/map/view/PlacePinView;", "getPinViews", "pinViews$delegate", "presenter", "Lcom/tinder/places/main/presenter/PlacesPinDropPresenter;", "getPresenter", "()Lcom/tinder/places/main/presenter/PlacesPinDropPresenter;", "setPresenter", "(Lcom/tinder/places/main/presenter/PlacesPinDropPresenter;)V", "bind", "", "pins", "Lcom/tinder/places/viewmodel/PlacePinViewModel;", "activated", "", "shouldBounce", "categories", "", "showMap", "bindActivatedPins", "bindDeactivatedPins", "bindPins", "cancelAllAnimations", "cancelAnimations", "commencePinDrop", "dropPins", "endPinsBouncing", "getSamplePlace", "Lcom/tinder/domain/places/model/Place;", "icon", "hideMap", "onAttachedToWindow", "onDetachedFromWindow", "stopPinsBouncing", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PlacesPinDropView extends ConstraintLayout implements PlacesPinDropTarget {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f39983a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(PlacesPinDropView.class), "pinViews", "getPinViews()Ljava/util/List;")), C15825i.a(new PropertyReference1Impl(C15825i.a(PlacesPinDropView.class), "pinGuidelines", "getPinGuidelines()Ljava/util/List;"))};
    @Inject
    @NotNull
    /* renamed from: b */
    public C10220d f39984b;
    /* renamed from: c */
    private final Lazy f39985c;
    /* renamed from: d */
    private final Lazy f39986d;
    /* renamed from: e */
    private final Set<Animator> f39987e;
    /* renamed from: f */
    private HashMap f39988f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/tinder/places/main/view/PlacesPinDropView$dropPins$1$animation$1$1", "com/tinder/places/main/view/PlacesPinDropView$$special$$inlined$apply$lambda$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.main.view.PlacesPinDropView$a */
    static final class C10226a implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ int f33320a;
        /* renamed from: b */
        final /* synthetic */ PlacePinView f33321b;
        /* renamed from: c */
        final /* synthetic */ Guideline f33322c;
        /* renamed from: d */
        final /* synthetic */ PlacesPinDropView f33323d;

        C10226a(int i, PlacePinView placePinView, Guideline guideline, PlacesPinDropView placesPinDropView) {
            this.f33320a = i;
            this.f33321b = placePinView;
            this.f33322c = guideline;
            this.f33323d = placesPinDropView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2668g.a(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            if (((Float) animatedValue).floatValue() > 0.0f) {
                this.f33321b.setVisibility(0);
            }
            LayoutParams layoutParams = this.f33322c.getLayoutParams();
            if (layoutParams == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            layoutParams2.f300c = ((Float) valueAnimator).floatValue();
            this.f33322c.setLayoutParams(layoutParams2);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007¸\u0006\b"}, d2 = {"com/tinder/places/main/view/PlacesPinDropView$dropPins$1$animation$1$2", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/places/main/view/PlacesPinDropView$dropPins$1$animation$1;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "Tinder_release", "com/tinder/places/main/view/PlacesPinDropView$$special$$inlined$apply$lambda$2"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.main.view.PlacesPinDropView$b */
    public static final class C10227b extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ int f33324a;
        /* renamed from: b */
        final /* synthetic */ PlacePinView f33325b;
        /* renamed from: c */
        final /* synthetic */ Guideline f33326c;
        /* renamed from: d */
        final /* synthetic */ PlacesPinDropView f33327d;

        C10227b(int i, PlacePinView placePinView, Guideline guideline, PlacesPinDropView placesPinDropView) {
            this.f33324a = i;
            this.f33325b = placePinView;
            this.f33326c = guideline;
            this.f33327d = placesPinDropView;
        }

        public void onAnimationEnd(@NotNull Animator animator) {
            C2668g.b(animator, "animation");
            if (this.f33324a == this.f33327d.getPinViews().size() - 1) {
                for (PlacePinView a : this.f33327d.getPinViews()) {
                    a.m48788a();
                }
            }
            this.f33327d.f39987e.remove(animator);
        }
    }

    private final List<Guideline> getPinGuidelines() {
        Lazy lazy = this.f39986d;
        KProperty kProperty = f39983a[1];
        return (List) lazy.getValue();
    }

    private final List<PlacePinView> getPinViews() {
        Lazy lazy = this.f39985c;
        KProperty kProperty = f39983a[0];
        return (List) lazy.getValue();
    }

    /* renamed from: a */
    public View m48763a(int i) {
        if (this.f39988f == null) {
            this.f39988f = new HashMap();
        }
        View view = (View) this.f39988f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f39988f.put(Integer.valueOf(i), view);
        return view;
    }

    public PlacesPinDropView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f39985c = C18451c.a((Function0) new PlacesPinDropView$pinViews$2(this));
        this.f39986d = C18451c.a((Function0) new PlacesPinDropView$pinGuidelines$2(this));
        this.f39987e = (Set) new LinkedHashSet();
        ((PlacesSharedViewInjector) context).injectPlacesPinDropView(this);
        ConstraintLayout.inflate(context, R.layout.view_places_pin_drop_view, this);
    }

    public /* synthetic */ PlacesPinDropView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    @NotNull
    public final C10220d getPresenter() {
        C10220d c10220d = this.f39984b;
        if (c10220d == null) {
            C2668g.b("presenter");
        }
        return c10220d;
    }

    public final void setPresenter(@NotNull C10220d c10220d) {
        C2668g.b(c10220d, "<set-?>");
        this.f39984b = c10220d;
    }

    /* renamed from: a */
    public static /* synthetic */ void m48760a(PlacesPinDropView placesPinDropView, List list, boolean z, boolean z2, List list2, boolean z3, int i, Object obj) {
        placesPinDropView.m48765a(list, z, z2, list2, (i & 16) != 0 ? false : z3);
    }

    /* renamed from: a */
    public final void m48765a(@NotNull List<C14351c> list, boolean z, boolean z2, @NotNull List<String> list2, boolean z3) {
        C2668g.b(list, "pins");
        C2668g.b(list2, "categories");
        int i = 0;
        for (PlacePinView a : getPinViews()) {
            int i2 = i + 1;
            a.m48789a(C14351c.f45525a.a(m48758a((String) list2.get(i))), false);
            i = i2;
        }
        list2 = this.f39984b;
        if (list2 == null) {
            C2668g.b("presenter");
        }
        list2.m41547a(list, z, z2, z3);
    }

    /* renamed from: a */
    public final void m48764a() {
        C10220d c10220d = this.f39984b;
        if (c10220d == null) {
            C2668g.b("presenter");
        }
        c10220d.m41551d();
    }

    /* renamed from: b */
    public final void m48766b() {
        C10220d c10220d = this.f39984b;
        if (c10220d == null) {
            C2668g.b("presenter");
        }
        c10220d.m41548a(true);
        c10220d = this.f39984b;
        if (c10220d == null) {
            C2668g.b("presenter");
        }
        c10220d.m41550c();
    }

    /* renamed from: c */
    public final void m48767c() {
        C10220d c10220d = this.f39984b;
        if (c10220d == null) {
            C2668g.b("presenter");
        }
        c10220d.m41552e();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C10220d c10220d = this.f39984b;
        if (c10220d == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c10220d);
    }

    protected void onDetachedFromWindow() {
        m48764a();
        Deadshot.drop(this);
        super.onDetachedFromWindow();
    }

    public void bindActivatedPins(@NotNull List<C14351c> list) {
        C2668g.b(list, "pins");
        m48761a(list, true);
    }

    public void bindDeactivatedPins(@NotNull List<C14351c> list) {
        C2668g.b(list, "pins");
        m48761a(list, false);
    }

    public void cancelAllAnimations() {
        for (Animator animator : this.f39987e) {
            animator.removeAllListeners();
            animator.end();
        }
        this.f39987e.clear();
    }

    public void stopPinsBouncing() {
        for (PlacePinView b : getPinViews()) {
            b.m48790b();
        }
    }

    public void dropPins() {
        int i = 0;
        for (Pair pair : C19301m.c(getPinGuidelines(), getPinViews())) {
            int i2 = i + 1;
            Guideline guideline = (Guideline) pair.c();
            PlacePinView placePinView = (PlacePinView) pair.d();
            placePinView.setVisibility(4);
            LayoutParams layoutParams = guideline.getLayoutParams();
            if (layoutParams == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
            }
            float f = ((ConstraintLayout.LayoutParams) layoutParams).f300c;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, f});
            ofFloat.setInterpolator(new OvershootInterpolator(0.6f));
            ofFloat.setDuration(300);
            ofFloat.setStartDelay((300 / ((long) getPinViews().size())) * ((long) i));
            ofFloat.start();
            ofFloat.addUpdateListener(new C10226a(i, placePinView, guideline, this));
            ofFloat.addListener(new C10227b(i, placePinView, guideline, this));
            Set set = this.f39987e;
            C2668g.a(ofFloat, "animation");
            set.add(ofFloat);
            i = i2;
        }
    }

    public void showMap() {
        ImageView imageView = (ImageView) m48763a(C6248a.onboardingMapImage);
        C2668g.a(imageView, "onboardingMapImage");
        imageView.setVisibility(0);
    }

    public void hideMap() {
        ImageView imageView = (ImageView) m48763a(C6248a.onboardingMapImage);
        C2668g.a(imageView, "onboardingMapImage");
        imageView.setVisibility(8);
    }

    /* renamed from: a */
    private final Place m48758a(String str) {
        Location build = Location.builder().lat(0.0d).lon(0.0d).build();
        C2668g.a(build, "Location.builder().lat(0.0).lon(0.0).build()");
        DateTime a = DateTime.a();
        C2668g.a(a, "DateTime.now()");
        return new Place(1234, "whatever", build, str, a, false, false, C19301m.a(), null, 0, 0, 1792, null);
    }

    /* renamed from: a */
    private final void m48761a(List<C14351c> list, boolean z) {
        list = C19301m.c(getPinViews(), list).iterator();
        while (list.hasNext()) {
            Pair pair = (Pair) list.next();
            PlacePinView placePinView = (PlacePinView) pair.c();
            placePinView.m48789a((C14351c) pair.d(), z);
            placePinView.setVisibility(4);
        }
    }
}
