package com.tinder.places.onboarding;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Guideline;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.places.injection.Place;
import com.tinder.places.injection.PlacesOnboardingComponentProvider;
import com.tinder.places.main.view.PlacesPinDropView;
import com.tinder.places.onboarding.PlacesOnboardingViewPager.PlacesOnboardingEventListener;
import com.tinder.places.viewmodel.C14351c;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001e\u001a\u00020\u0016H\u0014R$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/tinder/places/onboarding/PlacesOnboardingIntroView;", "Landroid/support/constraint/ConstraintLayout;", "Lcom/tinder/places/onboarding/Transitionable;", "context", "Landroid/content/Context;", "title", "", "pins", "", "Lcom/tinder/places/viewmodel/PlacePinViewModel;", "onboardingEventListener", "Lcom/tinder/places/onboarding/PlacesOnboardingViewPager$PlacesOnboardingEventListener;", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Lcom/tinder/places/onboarding/PlacesOnboardingViewPager$PlacesOnboardingEventListener;)V", "categories", "getCategories", "()Ljava/util/List;", "setCategories", "(Ljava/util/List;)V", "pendingAnimations", "", "Landroid/animation/Animator;", "animateFooter", "", "animateHeader", "cancelAllAnimations", "cancelAnimations", "enter", "position", "", "exit", "onDetachedFromWindow", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.onboarding.f */
public final class C12401f extends ConstraintLayout implements Transitionable {
    @Place
    @Inject
    @NotNull
    /* renamed from: a */
    public List<String> f40043a;
    /* renamed from: b */
    private final Set<Animator> f40044b = new LinkedHashSet();
    /* renamed from: c */
    private HashMap f40045c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/tinder/places/onboarding/PlacesOnboardingIntroView$animateFooter$1$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.onboarding.f$a */
    static final class C10258a implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ C12401f f33375a;

        C10258a(C12401f c12401f) {
            this.f33375a = c12401f;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Guideline guideline = (Guideline) this.f33375a.m48831a(C6248a.footerBaseline);
            C2668g.a(guideline, "footerBaseline");
            LayoutParams layoutParams = guideline.getLayoutParams();
            if (layoutParams == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            C2668g.a(valueAnimator, "it");
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            layoutParams2.f300c = ((Float) valueAnimator).floatValue();
            Guideline guideline2 = (Guideline) this.f33375a.m48831a(C6248a.footerBaseline);
            C2668g.a(guideline2, "footerBaseline");
            guideline2.setLayoutParams(layoutParams2);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/tinder/places/onboarding/PlacesOnboardingIntroView$animateFooter$1$2", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/places/onboarding/PlacesOnboardingIntroView$animateFooter$1;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.onboarding.f$b */
    public static final class C10259b extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ C12401f f33376a;

        C10259b(C12401f c12401f) {
            this.f33376a = c12401f;
        }

        public void onAnimationEnd(@NotNull Animator animator) {
            C2668g.b(animator, "animation");
            this.f33376a.f40044b.remove(animator);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/tinder/places/onboarding/PlacesOnboardingIntroView$animateHeader$1$1", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/places/onboarding/PlacesOnboardingIntroView$animateHeader$1;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.onboarding.f$c */
    public static final class C10260c extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ C12401f f33377a;
        /* renamed from: b */
        final /* synthetic */ ObjectAnimator f33378b;
        /* renamed from: c */
        final /* synthetic */ ObjectAnimator f33379c;
        /* renamed from: d */
        final /* synthetic */ ObjectAnimator f33380d;

        C10260c(C12401f c12401f, ObjectAnimator objectAnimator, ObjectAnimator objectAnimator2, ObjectAnimator objectAnimator3) {
            this.f33377a = c12401f;
            this.f33378b = objectAnimator;
            this.f33379c = objectAnimator2;
            this.f33380d = objectAnimator3;
        }

        public void onAnimationEnd(@NotNull Animator animator) {
            C2668g.b(animator, "animation");
            this.f33377a.f40044b.remove(animator);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/tinder/places/onboarding/PlacesOnboardingIntroView$animateHeader$2$1", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/places/onboarding/PlacesOnboardingIntroView$animateHeader$2;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.onboarding.f$d */
    public static final class C10261d extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ C12401f f33381a;

        C10261d(C12401f c12401f) {
            this.f33381a = c12401f;
        }

        public void onAnimationEnd(@NotNull Animator animator) {
            C2668g.b(animator, "animation");
            this.f33381a.f40044b.remove(animator);
        }
    }

    /* renamed from: a */
    public View m48831a(int i) {
        if (this.f40045c == null) {
            this.f40045c = new HashMap();
        }
        View view = (View) this.f40045c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f40045c.put(Integer.valueOf(i), view);
        return view;
    }

    public void enter(float f) {
    }

    public void exit(float f) {
    }

    public C12401f(@NotNull Context context, @NotNull String str, @NotNull List<C14351c> list, @NotNull PlacesOnboardingEventListener placesOnboardingEventListener) {
        C2668g.b(context, "context");
        C2668g.b(str, ManagerWebServices.PARAM_JOB_TITLE);
        C2668g.b(list, "pins");
        C2668g.b(placesOnboardingEventListener, "onboardingEventListener");
        super(context);
        ((PlacesOnboardingComponentProvider) context).getPlacesOnboardingComponent().inject(this);
        ConstraintLayout.inflate(context, R.layout.view_places_onboarding_intro, this);
        PlacesPinDropView placesPinDropView = (PlacesPinDropView) m48831a(C6248a.pinDropView);
        List list2 = this.f40043a;
        if (list2 == null) {
            C2668g.b("categories");
        }
        PlacesPinDropView.m48760a(placesPinDropView, list, true, true, list2, false, 16, null);
        TextView textView = (TextView) m48831a(C6248a.titleText);
        C2668g.a(textView, "titleText");
        textView.setText(str);
        m48829b();
        m48828a();
        placesOnboardingEventListener.onFirstScreenReady();
    }

    @NotNull
    public final List<String> getCategories() {
        List<String> list = this.f40043a;
        if (list == null) {
            C2668g.b("categories");
        }
        return list;
    }

    public final void setCategories(@NotNull List<String> list) {
        C2668g.b(list, "<set-?>");
        this.f40043a = list;
    }

    public void cancelAnimations() {
        ((PlacesPinDropView) m48831a(C6248a.pinDropView)).m48767c();
    }

    protected void onDetachedFromWindow() {
        m48830c();
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    private final void m48828a() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((LinearLayout) m48831a(C6248a.placesHeaderContainer), "alpha", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((LinearLayout) m48831a(C6248a.placesHeaderContainer), "scaleX", new float[]{2.0f, 1.0f});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat((LinearLayout) m48831a(C6248a.placesHeaderContainer), "scaleY", new float[]{2.0f, 1.0f});
        Set set = this.f40044b;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
        animatorSet.setDuration(300);
        animatorSet.addListener(new C10260c(this, ofFloat, ofFloat2, ofFloat3));
        animatorSet.start();
        set.add(animatorSet);
        Set set2 = this.f40044b;
        ofFloat2 = ObjectAnimator.ofFloat((ImageView) m48831a(C6248a.placesPinIcon), "translationY", new float[]{-1000.0f, 0.0f});
        ofFloat2.setDuration(300);
        ofFloat2.setInterpolator(new OvershootInterpolator(0.6f));
        ofFloat2.addListener(new C10261d(this));
        ofFloat2.start();
        C2668g.a(ofFloat2, "ObjectAnimator.ofFloat(p…    start()\n            }");
        set2.add(ofFloat2);
    }

    /* renamed from: b */
    private final void m48829b() {
        Guideline guideline = (Guideline) m48831a(C6248a.footerBaseline);
        C2668g.a(guideline, "footerBaseline");
        LayoutParams layoutParams = guideline.getLayoutParams();
        if (layoutParams == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
        }
        float f = ((ConstraintLayout.LayoutParams) layoutParams).f300c;
        Set set = this.f40044b;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, f});
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration(300);
        ofFloat.addUpdateListener(new C10258a(this));
        ofFloat.addListener(new C10259b(this));
        ofFloat.start();
        C2668g.a(ofFloat, "ValueAnimator.ofFloat(1.…    start()\n            }");
        set.add(ofFloat);
    }

    /* renamed from: c */
    private final void m48830c() {
        for (Animator animator : this.f40044b) {
            animator.removeAllListeners();
            animator.end();
        }
        this.f40044b.clear();
        ((PlacesPinDropView) m48831a(C6248a.pinDropView)).m48764a();
    }
}
