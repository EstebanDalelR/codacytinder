package com.tinder.places.onboarding;

import android.content.Context;
import android.support.annotation.FloatRange;
import android.util.AttributeSet;
import android.view.View;
import com.tinder.domain.places.model.PlacesOnboardingConfig;
import com.tinder.places.onboarding.p315a.C12392a;
import com.tinder.places.onboarding.p315a.C12393b;
import com.tinder.views.TransitionViewPager;
import io.reactivex.C3957b;
import io.reactivex.processors.BehaviorProcessor;
import io.reactivex.processors.C18430a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0011\u001a\u00020\u000bJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0013J\u0018\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/tinder/places/onboarding/PlacesOnboardingViewPager;", "Lcom/tinder/views/TransitionViewPager;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "viewEnteringProcessor", "Lio/reactivex/processors/FlowableProcessor;", "Lcom/tinder/places/onboarding/PlacesOnboardingViewPager$ViewPagerProgress;", "bind", "", "config", "Lcom/tinder/domain/places/model/PlacesOnboardingConfig;", "onboardingEventListener", "Lcom/tinder/places/onboarding/PlacesOnboardingViewPager$PlacesOnboardingEventListener;", "bindShortOnboarding", "cancelAnimations", "observeEnteringViews", "Lio/reactivex/Flowable;", "viewEntering", "index", "", "progress", "", "viewExiting", "PlacesOnboardingEventListener", "ViewPagerProgress", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PlacesOnboardingViewPager extends TransitionViewPager {
    /* renamed from: a */
    private final C18430a<C10251a> f43333a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/tinder/places/onboarding/PlacesOnboardingViewPager$PlacesOnboardingEventListener;", "", "onFirstScreenReady", "", "onLastScreenTransition", "position", "", "onUserAcceptsPlaces", "onUserDeclinesPlaces", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public interface PlacesOnboardingEventListener {
        void onFirstScreenReady();

        void onLastScreenTransition(@FloatRange(from = 0.0d, to = 1.0d) float f);

        void onUserAcceptsPlaces();

        void onUserDeclinesPlaces();
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/places/onboarding/PlacesOnboardingViewPager$ViewPagerProgress;", "", "page", "", "progress", "", "(IF)V", "getPage", "()I", "getProgress", "()F", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.onboarding.PlacesOnboardingViewPager$a */
    public static final class C10251a {
        /* renamed from: a */
        private final int f33369a;
        /* renamed from: b */
        private final float f33370b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C10251a) {
                C10251a c10251a = (C10251a) obj;
                return (this.f33369a == c10251a.f33369a ? 1 : null) != null && Float.compare(this.f33370b, c10251a.f33370b) == 0;
            }
        }

        public int hashCode() {
            return (this.f33369a * 31) + Float.floatToIntBits(this.f33370b);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ViewPagerProgress(page=");
            stringBuilder.append(this.f33369a);
            stringBuilder.append(", progress=");
            stringBuilder.append(this.f33370b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C10251a(int i, float f) {
            this.f33369a = i;
            this.f33370b = f;
        }

        /* renamed from: a */
        public final int m41634a() {
            return this.f33369a;
        }
    }

    public PlacesOnboardingViewPager(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        context = BehaviorProcessor.q().u();
        C2668g.a(context, "BehaviorProcessor.create…rogress>().toSerialized()");
        this.f43333a = context;
        setOffscreenPageLimit(3);
    }

    /* renamed from: a */
    public void m53036a(int i, float f) {
        View findViewWithTag = findViewWithTag(Integer.valueOf(i));
        if (!(findViewWithTag instanceof Transitionable)) {
            findViewWithTag = null;
        }
        Transitionable transitionable = (Transitionable) findViewWithTag;
        if (transitionable != null) {
            transitionable.enter(f);
        }
        this.f43333a.onNext(new C10251a(i, f));
    }

    /* renamed from: b */
    public void m53039b(int i, float f) {
        i = findViewWithTag(Integer.valueOf(i));
        if (!(i instanceof Transitionable)) {
            i = 0;
        }
        Transitionable transitionable = (Transitionable) i;
        if (transitionable != null) {
            transitionable.exit(f);
        }
    }

    /* renamed from: a */
    public final void m53037a(@NotNull PlacesOnboardingConfig placesOnboardingConfig, @NotNull PlacesOnboardingEventListener placesOnboardingEventListener) {
        C2668g.b(placesOnboardingConfig, "config");
        C2668g.b(placesOnboardingEventListener, "onboardingEventListener");
        Context context = getContext();
        C2668g.a(context, "context");
        setAdapter(new C12392a(context, placesOnboardingConfig, placesOnboardingEventListener));
    }

    /* renamed from: b */
    public final void m53040b(@NotNull PlacesOnboardingConfig placesOnboardingConfig, @NotNull PlacesOnboardingEventListener placesOnboardingEventListener) {
        C2668g.b(placesOnboardingConfig, "config");
        C2668g.b(placesOnboardingEventListener, "onboardingEventListener");
        Context context = getContext();
        C2668g.a(context, "context");
        setAdapter(new C12393b(context, placesOnboardingConfig, placesOnboardingEventListener));
    }

    /* renamed from: a */
    public final void m53035a() {
        int i = getAdapter() instanceof C12392a ? 4 : 1;
        int i2 = 0;
        if (i >= 0) {
            while (true) {
                View childAt = getChildAt(i2);
                if (!(childAt instanceof Transitionable)) {
                    childAt = null;
                }
                Transitionable transitionable = (Transitionable) childAt;
                if (transitionable != null) {
                    transitionable.cancelAnimations();
                }
                if (i2 != i) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    @NotNull
    /* renamed from: b */
    public final C3957b<C10251a> m53038b() {
        C3957b<C10251a> g = this.f43333a.g();
        C2668g.a(g, "viewEnteringProcessor.hide()");
        return g;
    }
}
