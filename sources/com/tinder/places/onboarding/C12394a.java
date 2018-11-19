package com.tinder.places.onboarding;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.learnmore.LearnMoreActivity;
import com.tinder.places.injection.Place;
import com.tinder.places.injection.PlacesOnboardingComponentProvider;
import com.tinder.places.main.view.PlacesPinDropView;
import com.tinder.places.onboarding.PlacesOnboardingViewPager.PlacesOnboardingEventListener;
import com.tinder.places.viewmodel.C14351c;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0012H\u0014R$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/tinder/places/onboarding/PlacesOnboardingAcceptView;", "Landroid/support/constraint/ConstraintLayout;", "Lcom/tinder/places/onboarding/Transitionable;", "context", "Landroid/content/Context;", "pins", "", "Lcom/tinder/places/viewmodel/PlacePinViewModel;", "onboardingEventListener", "Lcom/tinder/places/onboarding/PlacesOnboardingViewPager$PlacesOnboardingEventListener;", "(Landroid/content/Context;Ljava/util/List;Lcom/tinder/places/onboarding/PlacesOnboardingViewPager$PlacesOnboardingEventListener;)V", "categories", "", "getCategories", "()Ljava/util/List;", "setCategories", "(Ljava/util/List;)V", "cancelAnimations", "", "enter", "position", "", "exit", "onDetachedFromWindow", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.onboarding.a */
public final class C12394a extends ConstraintLayout implements Transitionable {
    @Place
    @Inject
    @NotNull
    /* renamed from: a */
    public List<String> f40030a;
    /* renamed from: b */
    private final PlacesOnboardingEventListener f40031b;
    /* renamed from: c */
    private HashMap f40032c;

    /* renamed from: a */
    public View m48805a(int i) {
        if (this.f40032c == null) {
            this.f40032c = new HashMap();
        }
        View view = (View) this.f40032c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f40032c.put(Integer.valueOf(i), view);
        return view;
    }

    public void exit(float f) {
    }

    public C12394a(@NotNull final Context context, @NotNull List<C14351c> list, @NotNull PlacesOnboardingEventListener placesOnboardingEventListener) {
        C2668g.b(context, "context");
        C2668g.b(list, "pins");
        C2668g.b(placesOnboardingEventListener, "onboardingEventListener");
        super(context);
        this.f40031b = placesOnboardingEventListener;
        ((PlacesOnboardingComponentProvider) context).getPlacesOnboardingComponent().inject(this);
        ConstraintLayout.inflate(context, R.layout.view_places_onboarding_accept, this);
        PlacesPinDropView placesPinDropView = (PlacesPinDropView) m48805a(C6248a.pinDropView);
        List list2 = this.f40030a;
        if (list2 == null) {
            C2668g.b("categories");
        }
        PlacesPinDropView.m48760a(placesPinDropView, list, false, false, list2, false, 16, null);
        ((TextView) m48805a(C6248a.acceptButton)).setOnClickListener((OnClickListener) new OnClickListener() {
            public final void onClick(View view) {
                this.f40031b.onUserAcceptsPlaces();
            }
        });
        ((TextView) m48805a(C6248a.notNowButton)).setOnClickListener((OnClickListener) new OnClickListener() {
            public final void onClick(View view) {
                this.f40031b.onUserDeclinesPlaces();
            }
        });
        ((TextView) m48805a(C6248a.learnMoreButton)).setOnClickListener((OnClickListener) new OnClickListener() {
            public final void onClick(View view) {
                view = context;
                if (view == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                }
                ((Activity) view).startActivity(new Intent(context, LearnMoreActivity.class));
            }
        });
    }

    @NotNull
    public final List<String> getCategories() {
        List<String> list = this.f40030a;
        if (list == null) {
            C2668g.b("categories");
        }
        return list;
    }

    public final void setCategories(@NotNull List<String> list) {
        C2668g.b(list, "<set-?>");
        this.f40030a = list;
    }

    public void enter(float f) {
        if (f == 1.0f) {
            ((PlacesPinDropView) m48805a(C6248a.pinDropView)).m48766b();
        }
        View a = m48805a(C6248a.whiteOverlay);
        C2668g.a(a, "whiteOverlay");
        a.setAlpha(((float) 1) - f);
        this.f40031b.onLastScreenTransition(f);
    }

    public void cancelAnimations() {
        ((PlacesPinDropView) m48805a(C6248a.pinDropView)).m48767c();
    }

    protected void onDetachedFromWindow() {
        ((PlacesPinDropView) m48805a(C6248a.pinDropView)).m48764a();
        super.onDetachedFromWindow();
    }
}
