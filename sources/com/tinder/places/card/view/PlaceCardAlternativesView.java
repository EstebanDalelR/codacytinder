package com.tinder.places.card.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.content.C0432b;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.data.places.PlacesApiClient.PlacesApiException;
import com.tinder.deadshot.Deadshot;
import com.tinder.domain.places.model.Place.Alternative;
import com.tinder.places.card.presenter.C10127a;
import com.tinder.places.card.target.PlaceCardAlternativesTarget;
import com.tinder.places.injection.PlacesComponentProvider;
import com.tinder.places.p307b.C12296e;
import com.tinder.places.p307b.C12296e.C10124a;
import com.tinder.places.p307b.C14151a;
import com.tinder.places.p307b.C14153c;
import com.tinder.places.viewmodel.C14347a;
import com.tinder.utils.au;
import com.tinder.views.CustomButton;
import com.tinder.views.CustomTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.C19282g;
import kotlin.collections.C19301m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0016J\u0010\u0010-\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016J&\u0010.\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020)00H\u0016J\u001e\u00101\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\f\u00102\u001a\b\u0012\u0004\u0012\u00020)00H\u0016J\u0010\u00103\u001a\u00020)2\u0006\u00104\u001a\u00020\u0017H\u0016J\u0010\u00105\u001a\u00020)2\u0006\u00104\u001a\u00020\u0017H\u0016J\b\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u00020)H\u0016J\b\u00109\u001a\u00020)H\u0016J\b\u0010:\u001a\u00020)H\u0014J\b\u0010;\u001a\u00020)H\u0014J\u0006\u0010<\u001a\u00020)J*\u0010=\u001a\u00020)2\u0006\u0010>\u001a\u00020+2\u0006\u0010?\u001a\u0002072\u0010\b\u0002\u0010@\u001a\n\u0012\u0004\u0012\u00020)\u0018\u000100H\u0002J\b\u0010A\u001a\u00020)H\u0002J\u0010\u0010B\u001a\u00020)2\u0006\u0010C\u001a\u00020\u0017H\u0002J\u0010\u0010D\u001a\u00020)2\u0006\u0010C\u001a\u00020\u0017H\u0002J\u0010\u0010E\u001a\u00020)2\u0006\u0010F\u001a\u00020\u0017H\u0016J\u0010\u0010G\u001a\u00020)2\u0006\u0010H\u001a\u00020IH\u0016J\u0010\u0010J\u001a\u00020)2\u0006\u0010K\u001a\u00020LH\u0016J\b\u0010M\u001a\u00020)H\u0016J\b\u0010N\u001a\u00020)H\u0016J\b\u0010O\u001a\u00020)H\u0016J\u0016\u0010P\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+J$\u0010Q\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020)00J\u000e\u0010R\u001a\u00020)2\u0006\u0010S\u001a\u00020\u0019R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\tX\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u00020!8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000¨\u0006T"}, d2 = {"Lcom/tinder/places/card/view/PlaceCardAlternativesView;", "Landroid/widget/FrameLayout;", "Lcom/tinder/places/card/target/PlaceCardAlternativesTarget;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "buttonDividers", "", "Landroid/view/View;", "[Landroid/view/View;", "buttons", "Lcom/tinder/views/CustomButton;", "[Lcom/tinder/views/CustomButton;", "contentView", "getContentView", "()Landroid/view/View;", "contentView$delegate", "Lkotlin/Lazy;", "fadeAnimation", "Landroid/animation/Animator;", "numAlternatives", "", "placeCardAlternativesViewModel", "Lcom/tinder/places/viewmodel/PlaceCardAlternativeViewModel;", "getPlaceCardAlternativesViewModel", "()Lcom/tinder/places/viewmodel/PlaceCardAlternativeViewModel;", "setPlaceCardAlternativesViewModel", "(Lcom/tinder/places/viewmodel/PlaceCardAlternativeViewModel;)V", "placesTranslucent", "placesTranslucentMore", "presenter", "Lcom/tinder/places/card/presenter/PlaceCardAlternativesPresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/places/card/presenter/PlaceCardAlternativesPresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/places/card/presenter/PlaceCardAlternativesPresenter;)V", "slideAnimation", "Landroid/animation/AnimatorSet;", "animateInAlternatives", "", "fadeDuration", "", "slideDuration", "animateInEmptyState", "animateOutAlternatives", "slidingDoneCallback", "Lkotlin/Function0;", "animateOutEmptyState", "fadeDoneCallback", "bindButtonName", "position", "bindNoneOfThese", "hasAlternatives", "", "hideLoadingState", "hideNoOptionsText", "onAttachedToWindow", "onDetachedFromWindow", "onViewRecycled", "performSlideAnimation", "duration", "visible", "finishedCallback", "resetButtonsAndDividers", "setButtonTextColors", "color", "setDividerBackgrounds", "setTotalAlternatives", "count", "showCorrectionDialog", "alternative", "Lcom/tinder/domain/places/model/Place$Alternative;", "showErrorDialog", "throwable", "Lcom/tinder/data/places/PlacesApiClient$PlacesApiException;", "showLoadingState", "showNoAlternativeState", "showNoneOfTheseDialog", "startAnimateIn", "startAnimateOut", "updateViewModel", "viewModel", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PlaceCardAlternativesView extends FrameLayout implements PlaceCardAlternativesTarget {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f39849a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(PlaceCardAlternativesView.class), "contentView", "getContentView()Landroid/view/View;"))};
    @Inject
    @NotNull
    /* renamed from: b */
    public C10127a f39850b;
    @NotNull
    /* renamed from: c */
    public C14347a f39851c;
    /* renamed from: d */
    private final int f39852d = au.c(this, R.color.places_translucent);
    /* renamed from: e */
    private final int f39853e = au.c(this, R.color.places_translucent_more);
    /* renamed from: f */
    private final CustomButton[] f39854f;
    /* renamed from: g */
    private final View[] f39855g;
    /* renamed from: h */
    private AnimatorSet f39856h;
    /* renamed from: i */
    private Animator f39857i;
    /* renamed from: j */
    private int f39858j;
    /* renamed from: k */
    private final Lazy f39859k = C18451c.a((Function0) new PlaceCardAlternativesView$contentView$2(this));
    /* renamed from: l */
    private HashMap f39860l;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.PlaceCardAlternativesView$1 */
    static final class C101381 implements OnClickListener {
        /* renamed from: a */
        public static final C101381 f33125a = new C101381();

        C101381() {
        }

        public final void onClick(View view) {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/places/card/view/PlaceCardAlternativesView$animateInAlternatives$3", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/places/card/view/PlaceCardAlternativesView;J)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.PlaceCardAlternativesView$a */
    public static final class C10139a extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ PlaceCardAlternativesView f33126a;
        /* renamed from: b */
        final /* synthetic */ long f33127b;

        C10139a(PlaceCardAlternativesView placeCardAlternativesView, long j) {
            this.f33126a = placeCardAlternativesView;
            this.f33127b = j;
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            PlaceCardAlternativesView.m48604a(this.f33126a, this.f33127b, true, null, 4, null);
            this.f33126a.f39857i = (Animator) null;
            animator = this.f33126a.f39854f;
            int length = animator.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                CustomButton customButton = animator[i];
                int i3 = i2 + 1;
                if (i2 <= this.f33126a.f39858j) {
                    customButton.setEnabled(true);
                }
                i++;
                i2 = i3;
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/places/card/view/PlaceCardAlternativesView$animateOutEmptyState$1", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/places/card/view/PlaceCardAlternativesView;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.PlaceCardAlternativesView$b */
    public static final class C10141b extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ PlaceCardAlternativesView f33129a;

        C10141b(PlaceCardAlternativesView placeCardAlternativesView) {
            this.f33129a = placeCardAlternativesView;
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            this.f33129a.setVisibility(8);
            this.f33129a.setAlpha(1.0f);
            this.f33129a.f39857i = (Animator) null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.PlaceCardAlternativesView$c */
    static final class C10142c implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ PlaceCardAlternativesView f33130a;
        /* renamed from: b */
        final /* synthetic */ Alternative f33131b;

        C10142c(PlaceCardAlternativesView placeCardAlternativesView, Alternative alternative) {
            this.f33130a = placeCardAlternativesView;
            this.f33131b = alternative;
        }

        public final void onClick(View view) {
            this.f33130a.getPresenter$Tinder_release().m41405a(this.f33131b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.PlaceCardAlternativesView$d */
    static final class C10143d implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ PlaceCardAlternativesView f33132a;

        C10143d(PlaceCardAlternativesView placeCardAlternativesView) {
            this.f33132a = placeCardAlternativesView;
        }

        public final void onClick(View view) {
            this.f33132a.getPresenter$Tinder_release().m41409b();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/tinder/places/card/view/PlaceCardAlternativesView$performSlideAnimation$1$1", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/places/card/view/PlaceCardAlternativesView$performSlideAnimation$1;Lcom/tinder/views/CustomButton;ILandroid/view/View;)V", "onAnimationStart", "", "animation", "Landroid/animation/Animator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.PlaceCardAlternativesView$e */
    public static final class C10144e extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ CustomButton f33133a;
        /* renamed from: b */
        final /* synthetic */ int f33134b;
        /* renamed from: c */
        final /* synthetic */ View f33135c;
        /* renamed from: d */
        final /* synthetic */ PlaceCardAlternativesView f33136d;
        /* renamed from: e */
        final /* synthetic */ float f33137e;
        /* renamed from: f */
        final /* synthetic */ float f33138f;
        /* renamed from: g */
        final /* synthetic */ float f33139g;
        /* renamed from: h */
        final /* synthetic */ float f33140h;
        /* renamed from: i */
        final /* synthetic */ long f33141i;
        /* renamed from: j */
        final /* synthetic */ boolean f33142j;
        /* renamed from: k */
        final /* synthetic */ ArrayList f33143k;

        C10144e(CustomButton customButton, int i, View view, PlaceCardAlternativesView placeCardAlternativesView, float f, float f2, float f3, float f4, long j, boolean z, ArrayList arrayList) {
            this.f33133a = customButton;
            this.f33134b = i;
            this.f33135c = view;
            this.f33136d = placeCardAlternativesView;
            this.f33137e = f;
            this.f33138f = f2;
            this.f33139g = f3;
            this.f33140h = f4;
            this.f33141i = j;
            this.f33142j = z;
            this.f33143k = arrayList;
        }

        public void onAnimationStart(@Nullable Animator animator) {
            this.f33133a.setVisibility(0);
            if (this.f33134b <= this.f33136d.f39858j + 1) {
                this.f33135c.setVisibility(0);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/places/card/view/PlaceCardAlternativesView$performSlideAnimation$2", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/places/card/view/PlaceCardAlternativesView;Lkotlin/jvm/functions/Function0;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.PlaceCardAlternativesView$f */
    public static final class C10145f extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ PlaceCardAlternativesView f33144a;
        /* renamed from: b */
        final /* synthetic */ Function0 f33145b;

        C10145f(PlaceCardAlternativesView placeCardAlternativesView, Function0 function0) {
            this.f33144a = placeCardAlternativesView;
            this.f33145b = function0;
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            animator = this.f33145b;
            if (animator != null) {
                C15813i c15813i = (C15813i) animator.invoke();
            }
            this.f33144a.f39856h = (AnimatorSet) null;
        }
    }

    private final View getContentView() {
        Lazy lazy = this.f39859k;
        KProperty kProperty = f39849a[0];
        return (View) lazy.getValue();
    }

    /* renamed from: a */
    public View m48611a(int i) {
        if (this.f39860l == null) {
            this.f39860l = new HashMap();
        }
        View view = (View) this.f39860l.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f39860l.put(Integer.valueOf(i), view);
        return view;
    }

    public PlaceCardAlternativesView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        ((PlacesComponentProvider) context).getPlacesComponent().inject(this);
        attributeSet = context.getSystemService("layout_inflater");
        if (attributeSet == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
        }
        ((LayoutInflater) attributeSet).inflate(R.layout.view_places_card_alternative_locations, this, true);
        CustomButton[] customButtonArr = new CustomButton[4];
        CustomButton customButton = (CustomButton) m48611a(C6248a.alternativeBtn);
        C2668g.a(customButton, "alternativeBtn");
        customButtonArr[0] = customButton;
        customButton = (CustomButton) m48611a(C6248a.alternativeBtn2);
        C2668g.a(customButton, "alternativeBtn2");
        customButtonArr[1] = customButton;
        customButton = (CustomButton) m48611a(C6248a.alternativeBtn3);
        C2668g.a(customButton, "alternativeBtn3");
        customButtonArr[2] = customButton;
        customButton = (CustomButton) m48611a(C6248a.alternativeBtn4);
        C2668g.a(customButton, "alternativeBtn4");
        customButtonArr[3] = customButton;
        this.f39854f = customButtonArr;
        attributeSet = new View[4];
        View a = m48611a(C6248a.cardAlternativesDivider);
        C2668g.a(a, "cardAlternativesDivider");
        attributeSet[0] = a;
        a = m48611a(C6248a.cardAlternativesDivider2);
        C2668g.a(a, "cardAlternativesDivider2");
        attributeSet[1] = a;
        a = m48611a(C6248a.cardAlternativesDivider3);
        C2668g.a(a, "cardAlternativesDivider3");
        attributeSet[2] = a;
        a = m48611a(C6248a.cardAlternativesDivider4);
        C2668g.a(a, "cardAlternativesDivider4");
        attributeSet[3] = a;
        this.f39855g = attributeSet;
        setOnClickListener((OnClickListener) C101381.f33125a);
        ProgressBar progressBar = (ProgressBar) m48611a(C6248a.loadingSpinner);
        C2668g.a(progressBar, "loadingSpinner");
        progressBar.getIndeterminateDrawable().setColorFilter(C0432b.c(context, R.color.white), Mode.SRC_ATOP);
        ((CustomTextView) m48611a(C6248a.titleTextViewAlternatives)).setTextColor(-1);
        ((Button) m48611a(C6248a.goToBackFromAlternatives)).setTextColor(this.f39852d);
        setButtonTextColors(this.f39852d);
        setDividerBackgrounds(this.f39853e);
    }

    @NotNull
    public final C10127a getPresenter$Tinder_release() {
        C10127a c10127a = this.f39850b;
        if (c10127a == null) {
            C2668g.b("presenter");
        }
        return c10127a;
    }

    public final void setPresenter$Tinder_release(@NotNull C10127a c10127a) {
        C2668g.b(c10127a, "<set-?>");
        this.f39850b = c10127a;
    }

    @NotNull
    public final C14347a getPlaceCardAlternativesViewModel() {
        C14347a c14347a = this.f39851c;
        if (c14347a == null) {
            C2668g.b("placeCardAlternativesViewModel");
        }
        return c14347a;
    }

    public final void setPlaceCardAlternativesViewModel(@NotNull C14347a c14347a) {
        C2668g.b(c14347a, "<set-?>");
        this.f39851c = c14347a;
    }

    /* renamed from: a */
    public final void m48613a(long j, long j2) {
        C10127a c10127a = this.f39850b;
        if (c10127a == null) {
            C2668g.b("presenter");
        }
        c10127a.m41404a(j, j2, m48607b());
    }

    /* renamed from: a */
    public final void m48614a(long j, long j2, @NotNull Function0<C15813i> function0) {
        C2668g.b(function0, "slidingDoneCallback");
        C10127a c10127a = this.f39850b;
        if (c10127a == null) {
            C2668g.b("presenter");
        }
        c10127a.m41403a(j, j2, function0, m48607b());
    }

    /* renamed from: a */
    public final void m48612a() {
        m48610c();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C10127a c10127a = this.f39850b;
        if (c10127a == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c10127a);
        C14347a c14347a = this.f39851c;
        if (c14347a == null) {
            C2668g.b("placeCardAlternativesViewModel");
        }
        C10127a c10127a2 = this.f39850b;
        if (c10127a2 == null) {
            C2668g.b("presenter");
        }
        c10127a2.m41406a(c14347a);
    }

    public void hideNoOptionsText() {
        TextView textView = (TextView) m48611a(C6248a.noOptionsFoundText);
        C2668g.a(textView, "noOptionsFoundText");
        textView.setVisibility(4);
    }

    public void setTotalAlternatives(int i) {
        this.f39858j = i;
    }

    public void bindButtonName(int i) {
        CustomButton customButton = this.f39854f[i];
        C14347a c14347a = this.f39851c;
        if (c14347a == null) {
            C2668g.b("placeCardAlternativesViewModel");
        }
        Alternative alternative = (Alternative) c14347a.b().get(i);
        customButton.setText(alternative.getName());
        customButton.setVisibility(0);
        customButton.setOnClickListener(new C10142c(this, alternative));
    }

    public void bindNoneOfThese(int i) {
        i = this.f39854f[i];
        i.setText(au.a(this, R.string.places_none_of_these, new String[0]));
        i.setVisibility(0);
        i.setOnClickListener(new C10143d(this));
    }

    public void showNoAlternativeState() {
        for (CustomButton visibility : this.f39854f) {
            visibility.setVisibility(4);
        }
        for (View visibility2 : this.f39855g) {
            visibility2.setVisibility(4);
        }
        TextView textView = (TextView) m48611a(C6248a.noOptionsFoundText);
        C2668g.a(textView, "noOptionsFoundText");
        textView.setVisibility(0);
    }

    public void showLoadingState() {
        getContentView().setVisibility(8);
        ProgressBar progressBar = (ProgressBar) m48611a(C6248a.loadingSpinner);
        C2668g.a(progressBar, "loadingSpinner");
        progressBar.setVisibility(0);
    }

    public void hideLoadingState() {
        ProgressBar progressBar = (ProgressBar) m48611a(C6248a.loadingSpinner);
        C2668g.a(progressBar, "loadingSpinner");
        progressBar.setVisibility(8);
        getContentView().setVisibility(0);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
        Animator animator = this.f39857i;
        if (animator != null) {
            animator.cancel();
        }
        AnimatorSet animatorSet = this.f39856h;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public void animateInAlternatives(long j, long j2) {
        Animator animator = this.f39857i;
        if (animator == null || !animator.isRunning()) {
            AnimatorSet animatorSet = this.f39856h;
            if (animatorSet == null || !animatorSet.isRunning()) {
                for (CustomButton customButton : this.f39854f) {
                    customButton.setVisibility(4);
                    customButton.setEnabled(false);
                }
                for (View visibility : this.f39855g) {
                    visibility.setVisibility(4);
                }
                setVisibility(0);
                this.f39857i = ObjectAnimator.ofFloat(this, "alpha", new float[]{0.0f, 1.0f});
                animator = this.f39857i;
                if (animator != null) {
                    animator.addListener(new C10139a(this, j2));
                }
                j2 = this.f39857i;
                if (j2 != null) {
                    j2.setDuration(j);
                }
                j = this.f39857i;
                if (j != null) {
                    j.start();
                }
            }
        }
    }

    public void animateOutAlternatives(long j, long j2, @NotNull Function0<C15813i> function0) {
        C2668g.b(function0, "slidingDoneCallback");
        Animator animator = this.f39857i;
        if (animator == null || !animator.isRunning()) {
            AnimatorSet animatorSet = this.f39856h;
            if (animatorSet == null || !animatorSet.isRunning()) {
                m48603a(j2, false, (Function0) new PlaceCardAlternativesView$animateOutAlternatives$1(this, function0, j));
            }
        }
    }

    public void animateInEmptyState(long j) {
        Animator animator = this.f39857i;
        if (animator == null || !animator.isRunning()) {
            setVisibility(0);
            this.f39855g[0].setVisibility(0);
            this.f39857i = ObjectAnimator.ofFloat(this, "alpha", new float[]{0.0f, 1.0f});
            animator = this.f39857i;
            if (animator != null) {
                animator.setDuration(j);
            }
            j = this.f39857i;
            if (j != null) {
                j.start();
            }
        }
    }

    public void animateOutEmptyState(long j, @NotNull Function0<C15813i> function0) {
        C2668g.b(function0, "fadeDoneCallback");
        j = this.f39857i;
        if (j == null || j.isRunning() != 1) {
            function0.invoke();
            this.f39855g[0].setVisibility(0);
            this.f39857i = ObjectAnimator.ofFloat(this, "alpha", new float[]{1.0f, 0.0f});
            j = this.f39857i;
            if (j != null) {
                j.addListener(new C10141b(this));
            }
            j = this.f39857i;
            if (j != null) {
                j.start();
            }
        }
    }

    public void showCorrectionDialog(@NotNull Alternative alternative) {
        C2668g.b(alternative, "alternative");
        Context context = getContext();
        C2668g.a(context, "context");
        new C14151a(context, new C14181xcf66d975(this, alternative), alternative.getName()).show();
    }

    public void showNoneOfTheseDialog() {
        Context context = getContext();
        C2668g.a(context, "context");
        new C14153c(context, new C14182xcc5e34a2(this)).show();
    }

    public void showErrorDialog(@NotNull PlacesApiException placesApiException) {
        C2668g.b(placesApiException, "throwable");
        C10124a c10124a = C12296e.f39820a;
        Context context = getContext();
        C2668g.a(context, "context");
        c10124a.m41365a(placesApiException, context).show();
    }

    /* renamed from: a */
    public final void m48615a(@NotNull C14347a c14347a) {
        C2668g.b(c14347a, "viewModel");
        this.f39851c = c14347a;
        c14347a = this.f39851c;
        if (c14347a == null) {
            C2668g.b("placeCardAlternativesViewModel");
        }
        if (c14347a != null) {
            C10127a c10127a = this.f39850b;
            if (c10127a == null) {
                C2668g.b("presenter");
            }
            c10127a.m41406a(c14347a);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m48604a(PlaceCardAlternativesView placeCardAlternativesView, long j, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        placeCardAlternativesView.m48603a(j, z, function0);
    }

    /* renamed from: a */
    private final void m48603a(long j, boolean z, Function0<C15813i> function0) {
        if (this.f39856h == null) {
            int i;
            PlaceCardAlternativesView placeCardAlternativesView;
            ArrayList arrayList;
            float width = (float) (z ? getWidth() : 0);
            if (z) {
                i = 0;
            } else {
                i = getWidth();
            }
            float f = (float) i;
            float f2 = z ? 0.0f : 1.0f;
            float f3 = z ? 1.0f : 0.0f;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = C19282g.a(placeCardAlternativesView.f39854f, placeCardAlternativesView.f39855g).iterator();
            int i2 = 0;
            while (it.hasNext()) {
                int i3 = i2 + 1;
                Pair pair = (Pair) it.next();
                CustomButton customButton = (CustomButton) pair.a();
                View view = (View) pair.b();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(customButton, "translationX", new float[]{width, f});
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", new float[]{f2, f3});
                arrayList = arrayList2;
                long length = (j / ((long) placeCardAlternativesView.f39854f.length)) * ((long) i2);
                if (!z) {
                    length = j - length;
                }
                C2668g.a(ofFloat, "buttonAnimator");
                ofFloat.setStartDelay(length);
                C2668g.a(ofFloat2, "dividerAnimator");
                ofFloat2.setStartDelay(length);
                ObjectAnimator objectAnimator = ofFloat2;
                Iterator it2 = it;
                float f4 = f;
                float f5 = width;
                ofFloat.addListener(new C10144e(customButton, i2, view, placeCardAlternativesView, width, f, f2, f3, j, z, arrayList));
                C19301m.a(arrayList, new ObjectAnimator[]{r13, objectAnimator});
                i2 = i3;
                arrayList2 = arrayList;
                it = it2;
                f = f4;
                width = f5;
                placeCardAlternativesView = this;
            }
            arrayList = arrayList2;
            this.f39856h = new AnimatorSet();
            AnimatorSet animatorSet = this.f39856h;
            if (animatorSet != null) {
                animatorSet.addListener(new C10145f(r1, function0));
            }
            animatorSet = r1.f39856h;
            if (animatorSet != null) {
                animatorSet.playTogether(arrayList);
            }
            animatorSet = r1.f39856h;
            if (animatorSet != null) {
                animatorSet.start();
            }
        }
    }

    private final void setButtonTextColors(int i) {
        ((CustomButton) m48611a(C6248a.alternativeBtn)).setTextColor(i);
        ((CustomButton) m48611a(C6248a.alternativeBtn2)).setTextColor(i);
        ((CustomButton) m48611a(C6248a.alternativeBtn3)).setTextColor(i);
        ((CustomButton) m48611a(C6248a.alternativeBtn4)).setTextColor(i);
    }

    private final void setDividerBackgrounds(int i) {
        ColorDrawable colorDrawable = new ColorDrawable(i);
        i = m48611a(C6248a.cardAlternativesDivider);
        C2668g.a(i, "cardAlternativesDivider");
        Drawable drawable = colorDrawable;
        i.setBackground(drawable);
        i = m48611a(C6248a.cardAlternativesDivider2);
        C2668g.a(i, "cardAlternativesDivider2");
        i.setBackground(drawable);
        i = m48611a(C6248a.cardAlternativesDivider3);
        C2668g.a(i, "cardAlternativesDivider3");
        i.setBackground(drawable);
        i = m48611a(C6248a.cardAlternativesDivider4);
        C2668g.a(i, "cardAlternativesDivider4");
        i.setBackground(drawable);
    }

    /* renamed from: b */
    private final boolean m48607b() {
        Boolean valueOf;
        C14347a c14347a = this.f39851c;
        if (c14347a == null) {
            C2668g.b("placeCardAlternativesViewModel");
        }
        if (c14347a != null) {
            List b = c14347a.b();
            if (b != null) {
                valueOf = Boolean.valueOf(b.isEmpty() ^ 1);
                return valueOf.booleanValue();
            }
        }
        valueOf = null;
        return valueOf.booleanValue();
    }

    /* renamed from: c */
    private final void m48610c() {
        for (CustomButton customButton : this.f39854f) {
            customButton.setVisibility(4);
            customButton.setText("");
        }
        for (View visibility : this.f39855g) {
            visibility.setVisibility(4);
        }
    }
}
