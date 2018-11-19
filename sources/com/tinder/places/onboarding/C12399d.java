package com.tinder.places.onboarding;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintLayout.LayoutParams;
import android.support.constraint.Guideline;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.deadshot.Deadshot;
import com.tinder.domain.places.model.Place;
import com.tinder.domain.places.model.PlacesOnboardingConfig.OnboardingRec;
import com.tinder.places.injection.PlacesOnboardingComponentProvider;
import com.tinder.places.onboarding.presenter.C10265a;
import com.tinder.places.onboarding.target.PlacesOnboardingCardTarget;
import com.tinder.places.recs.view.PlacesUserRecCardView;
import com.tinder.places.viewmodel.PlaceColor;
import com.tinder.recs.card.UserRecCard;
import com.tinder.utils.av;
import com.tinder.views.RoundedFrameLayout;
import com.tinder.views.grid.GridInjector;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001f\u001a\u00020\u0016H\u0014J\b\u0010 \u001a\u00020\u0016H\u0014R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/tinder/places/onboarding/PlacesOnboardingCardView;", "Landroid/support/constraint/ConstraintLayout;", "Lcom/tinder/places/onboarding/Transitionable;", "Lcom/tinder/places/onboarding/target/PlacesOnboardingCardTarget;", "context", "Landroid/content/Context;", "title", "", "rec", "Lcom/tinder/domain/places/model/PlacesOnboardingConfig$OnboardingRec;", "place", "Lcom/tinder/domain/places/model/Place;", "(Landroid/content/Context;Ljava/lang/String;Lcom/tinder/domain/places/model/PlacesOnboardingConfig$OnboardingRec;Lcom/tinder/domain/places/model/Place;)V", "color", "Lcom/tinder/places/viewmodel/PlaceColor;", "presenter", "Lcom/tinder/places/onboarding/presenter/PlacesOnboardingCardPresenter;", "getPresenter", "()Lcom/tinder/places/onboarding/presenter/PlacesOnboardingCardPresenter;", "setPresenter", "(Lcom/tinder/places/onboarding/presenter/PlacesOnboardingCardPresenter;)V", "attachRecCard", "", "card", "Lcom/tinder/recs/card/UserRecCard;", "cancelAnimations", "enter", "position", "", "exit", "getLikeStampScaledOpacity", "onAttachedToWindow", "onDetachedFromWindow", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.onboarding.d */
public final class C12399d extends ConstraintLayout implements Transitionable, PlacesOnboardingCardTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public C10265a f40038a;
    /* renamed from: b */
    private final PlaceColor f40039b;
    /* renamed from: c */
    private final OnboardingRec f40040c;
    /* renamed from: d */
    private HashMap f40041d;

    /* renamed from: a */
    private final float m48823a(float f) {
        return f * 5.0f;
    }

    /* renamed from: a */
    public View m48824a(int i) {
        if (this.f40041d == null) {
            this.f40041d = new HashMap();
        }
        View view = (View) this.f40041d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f40041d.put(Integer.valueOf(i), view);
        return view;
    }

    public void cancelAnimations() {
    }

    public C12399d(@NotNull Context context, @NotNull String str, @NotNull OnboardingRec onboardingRec, @NotNull Place place) {
        C2668g.b(context, "context");
        C2668g.b(str, ManagerWebServices.PARAM_JOB_TITLE);
        C2668g.b(onboardingRec, "rec");
        C2668g.b(place, "place");
        super(context);
        this.f40040c = onboardingRec;
        ((PlacesOnboardingComponentProvider) context).getPlacesOnboardingComponent().inject(this);
        setClipToPadding(null);
        ConstraintLayout.inflate(context, R.layout.view_places_onboarding_card, this);
        TextView textView = (TextView) m48824a(C6248a.titleText);
        C2668g.a(textView, "titleText");
        textView.setText(str);
        ((RoundedFrameLayout) m48824a(C6248a.roundedFrameLayout)).setRoundTop(true);
        TextView textView2 = (TextView) m48824a(C6248a.titleTextViewOnboarding);
        C2668g.a(textView2, "titleTextViewOnboarding");
        textView2.setText(place.getName());
        this.f40039b = PlaceColor.Companion.a(place.getId());
        RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) m48824a(C6248a.roundedFrameLayout);
        C2668g.a(roundedFrameLayout, "roundedFrameLayout");
        roundedFrameLayout.setBackground(this.f40039b.getBackgroundGradient().a(context));
    }

    @NotNull
    public final C10265a getPresenter() {
        C10265a c10265a = this.f40038a;
        if (c10265a == null) {
            C2668g.b("presenter");
        }
        return c10265a;
    }

    public final void setPresenter(@NotNull C10265a c10265a) {
        C2668g.b(c10265a, "<set-?>");
        this.f40038a = c10265a;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C10265a c10265a = this.f40038a;
        if (c10265a == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c10265a);
        c10265a = this.f40038a;
        if (c10265a == null) {
            C2668g.b("presenter");
        }
        c10265a.m41636a(this.f40040c);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    public void attachRecCard(@NotNull UserRecCard userRecCard) {
        C2668g.b(userRecCard, "card");
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.recs_card_places, this, false);
        if (inflate == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.places.recs.view.PlacesUserRecCardView");
        }
        PlacesUserRecCardView placesUserRecCardView = (PlacesUserRecCardView) inflate;
        Context context = getContext();
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.views.grid.GridInjector");
        }
        ((GridInjector) context).inject(placesUserRecCardView);
        placesUserRecCardView.setColor(this.f40039b);
        placesUserRecCardView.setAspectRatio(1.25f);
        placesUserRecCardView.b(userRecCard);
        ((FrameLayout) m48824a(C6248a.placeOnboardingRecContainer)).addView(placesUserRecCardView);
    }

    public void enter(float f) {
        float f2 = (((float) 1) - f) * 0.65f;
        Guideline guideline = (Guideline) m48824a(C6248a.recCardGuideline);
        C2668g.a(guideline, "recCardGuideline");
        f = guideline.getLayoutParams();
        if (f == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
        }
        LayoutParams layoutParams = (LayoutParams) f;
        layoutParams.f300c = f2;
        Guideline guideline2 = (Guideline) m48824a(C6248a.recCardGuideline);
        C2668g.a(guideline2, "recCardGuideline");
        guideline2.setLayoutParams(layoutParams);
    }

    public void exit(float f) {
        FrameLayout frameLayout = (FrameLayout) m48824a(C6248a.placeOnboardingRecContainer);
        float f2 = ((float) 1) - f;
        frameLayout.setAlpha(f2);
        frameLayout.setRotation(((float) 45) * f);
        frameLayout.setTranslationY(-(((float) (frameLayout.getHeight() / 2)) * f));
        frameLayout.setTranslationX(((float) av.b()) * f);
        frameLayout.setScaleX(f2);
        frameLayout.setScaleY(f2);
        View findViewById = ((FrameLayout) m48824a(C6248a.placeOnboardingRecContainer)).findViewById(R.id.stamp_liked);
        C2668g.a(findViewById, "likeStamp");
        f = (f < 0.0f || f > 0.2f) ? 1.0f : m48823a(f);
        findViewById.setAlpha(f);
    }
}
