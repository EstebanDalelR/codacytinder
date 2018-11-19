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
import com.tinder.api.ManagerWebServices;
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

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0013H\u0014R$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/tinder/places/onboarding/PlacesOnboardingShortView;", "Landroid/support/constraint/ConstraintLayout;", "Lcom/tinder/places/onboarding/Transitionable;", "context", "Landroid/content/Context;", "title", "", "pins", "", "Lcom/tinder/places/viewmodel/PlacePinViewModel;", "onboardingEventListener", "Lcom/tinder/places/onboarding/PlacesOnboardingViewPager$PlacesOnboardingEventListener;", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Lcom/tinder/places/onboarding/PlacesOnboardingViewPager$PlacesOnboardingEventListener;)V", "categories", "getCategories", "()Ljava/util/List;", "setCategories", "(Ljava/util/List;)V", "cancelAnimations", "", "enter", "position", "", "exit", "onDetachedFromWindow", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.onboarding.h */
public final class C12403h extends ConstraintLayout implements Transitionable {
    @Place
    @Inject
    @NotNull
    /* renamed from: a */
    public List<String> f40047a;
    /* renamed from: b */
    private final PlacesOnboardingEventListener f40048b;
    /* renamed from: c */
    private HashMap f40049c;

    /* renamed from: a */
    public View m48835a(int i) {
        if (this.f40049c == null) {
            this.f40049c = new HashMap();
        }
        View view = (View) this.f40049c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f40049c.put(Integer.valueOf(i), view);
        return view;
    }

    public void exit(float f) {
    }

    public C12403h(@NotNull final Context context, @NotNull String str, @NotNull List<C14351c> list, @NotNull PlacesOnboardingEventListener placesOnboardingEventListener) {
        C2668g.b(context, "context");
        C2668g.b(str, ManagerWebServices.PARAM_JOB_TITLE);
        C2668g.b(list, "pins");
        C2668g.b(placesOnboardingEventListener, "onboardingEventListener");
        super(context);
        this.f40048b = placesOnboardingEventListener;
        ((PlacesOnboardingComponentProvider) context).getPlacesOnboardingComponent().inject(this);
        ConstraintLayout.inflate(context, R.layout.view_places_onboarding_short_view, this);
        PlacesPinDropView placesPinDropView = (PlacesPinDropView) m48835a(C6248a.pinDropView);
        List list2 = this.f40047a;
        if (list2 == null) {
            C2668g.b("categories");
        }
        PlacesPinDropView.m48760a(placesPinDropView, list, false, false, list2, false, 16, null);
        ((TextView) m48835a(C6248a.acceptButton)).setOnClickListener((OnClickListener) new OnClickListener() {
            public final void onClick(View view) {
                this.f40048b.onUserAcceptsPlaces();
            }
        });
        ((TextView) m48835a(C6248a.notNowButton)).setOnClickListener((OnClickListener) new OnClickListener() {
            public final void onClick(View view) {
                this.f40048b.onUserDeclinesPlaces();
            }
        });
        TextView textView = (TextView) m48835a(C6248a.titleText);
        C2668g.a(textView, "titleText");
        textView.setText(str);
        ((TextView) m48835a(C6248a.learnMoreButton)).setOnClickListener((OnClickListener) new OnClickListener() {
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
        List<String> list = this.f40047a;
        if (list == null) {
            C2668g.b("categories");
        }
        return list;
    }

    public final void setCategories(@NotNull List<String> list) {
        C2668g.b(list, "<set-?>");
        this.f40047a = list;
    }

    public void enter(float f) {
        ((PlacesPinDropView) m48835a(C6248a.pinDropView)).m48766b();
    }

    public void cancelAnimations() {
        ((PlacesPinDropView) m48835a(C6248a.pinDropView)).m48767c();
    }

    protected void onDetachedFromWindow() {
        ((PlacesPinDropView) m48835a(C6248a.pinDropView)).m48764a();
        super.onDetachedFromWindow();
    }
}
