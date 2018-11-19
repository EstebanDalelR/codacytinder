package com.tinder.places.card.view;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import com.tinder.C6250b.C6248a;
import com.tinder.data.places.PlacesApiClient.PlacesApiException;
import com.tinder.deadshot.Deadshot;
import com.tinder.domain.places.model.PlacesConfigExpansion;
import com.tinder.places.card.presenter.PlacesCardViewPresenter;
import com.tinder.places.card.presenter.PlacesCardViewPresenter.FlippedState;
import com.tinder.places.card.target.PlacesCardTarget;
import com.tinder.places.carousel.adapter.PlacesCarouselAdapter.Update;
import com.tinder.places.injection.PlacesComponentProvider;
import com.tinder.places.p307b.C12296e;
import com.tinder.places.p307b.C12296e.C10124a;
import com.tinder.places.p307b.C14154f;
import com.tinder.places.p312g.p313a.C10211a;
import com.tinder.places.viewmodel.C14347a;
import com.tinder.places.viewmodel.C14349b;
import com.tinder.utils.an;
import com.tinder.viewmodel.C15424c;
import com.tinder.views.CustomButton;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C19301m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002~B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u000205H\u0016J\b\u00107\u001a\u000205H\u0016J\b\u00108\u001a\u000205H\u0002J&\u00109\u001a\u0002052\u0006\u0010:\u001a\u00020\u001e2\u0006\u0010;\u001a\u00020$2\u000e\u0010<\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010=J\u0018\u0010?\u001a\u0002052\u0006\u0010:\u001a\u00020\u001e2\u0006\u0010@\u001a\u00020AH\u0002J\b\u0010B\u001a\u000205H\u0002J\u0016\u0010C\u001a\u0002052\f\u0010D\u001a\b\u0012\u0004\u0012\u00020&0=H\u0016J\u0018\u0010E\u001a\u0002052\u0006\u0010:\u001a\u00020\u001e2\u0006\u0010;\u001a\u00020$H\u0002J\b\u0010F\u001a\u000205H\u0016J\b\u0010G\u001a\u000205H\u0016J\b\u0010H\u001a\u000205H\u0016J\b\u0010I\u001a\u000205H\u0016J\u0012\u0010I\u001a\u0002052\b\u0010;\u001a\u0004\u0018\u00010$H\u0002J\u001a\u0010J\u001a\u0002052\b\u0010;\u001a\u0004\u0018\u00010$2\u0006\u0010K\u001a\u00020\u001eH\u0002J\b\u0010L\u001a\u00020MH\u0002J\u0006\u0010N\u001a\u00020OJ\u0018\u0010P\u001a\u00020\u001c2\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020RH\u0002J2\u0010T\u001a\u00020\u001c2\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020R2\u0006\u0010U\u001a\u00020V2\u0010\b\u0002\u0010W\u001a\n\u0012\u0004\u0012\u000205\u0018\u00010XH\u0002J\b\u0010Y\u001a\u000205H\u0014J\b\u0010Z\u001a\u000205H\u0014J\u0006\u0010[\u001a\u000205J\u0018\u0010\\\u001a\u0002052\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020^H\u0014J\u0006\u0010`\u001a\u000205J\u000e\u0010a\u001a\u0002052\u0006\u0010b\u001a\u00020MJ\u0010\u0010c\u001a\u0002052\u0006\u0010;\u001a\u00020$H\u0002J\b\u0010d\u001a\u000205H\u0016J\u0017\u0010e\u001a\u0002052\b\u0010f\u001a\u0004\u0018\u00010^H\u0016¢\u0006\u0002\u0010gJ\b\u0010h\u001a\u000205H\u0016J\u0010\u0010i\u001a\u0002052\u0006\u0010j\u001a\u00020^H\u0016J\u0018\u0010k\u001a\u0002052\u0006\u0010l\u001a\u00020^2\u0006\u0010m\u001a\u00020^H\u0016J\b\u0010n\u001a\u000205H\u0016J\u0010\u0010o\u001a\u0002052\u0006\u0010p\u001a\u00020qH\u0016J\b\u0010r\u001a\u000205H\u0002J\u0010\u0010s\u001a\u0002052\u0006\u0010K\u001a\u00020\u001eH\u0002J\b\u0010t\u001a\u000205H\u0002J3\u0010u\u001a\u0002052\u0006\u0010v\u001a\u00020/2!\u0010w\u001a\u001d\u0012\u0013\u0012\u00110/¢\u0006\f\by\u0012\b\bz\u0012\u0004\b\b({\u0012\u0004\u0012\u0002050xH\u0016J\b\u0010|\u001a\u000205H\u0016J\b\u0010}\u001a\u000205H\u0016R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020&X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010(\u001a\u00020)8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020/X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u0006\u0001"}, d2 = {"Lcom/tinder/places/card/view/PlaceCardView;", "Landroid/widget/FrameLayout;", "Lcom/tinder/places/card/target/PlacesCardTarget;", "Lcom/tinder/places/card/view/PlaceCardFlipListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "cardAlternatives", "Lcom/tinder/places/card/view/PlaceCardAlternativesView;", "getCardAlternatives", "()Lcom/tinder/places/card/view/PlaceCardAlternativesView;", "cardAlternatives$delegate", "Lkotlin/Lazy;", "cardBack", "Lcom/tinder/places/card/view/PlaceCardBackView;", "getCardBack", "()Lcom/tinder/places/card/view/PlaceCardBackView;", "cardBack$delegate", "cardPushTouchListener", "Lcom/tinder/places/card/view/CardPushTouchListener;", "cardRemove", "Lcom/tinder/places/card/view/PlaceCardRemoveView;", "getCardRemove", "()Lcom/tinder/places/card/view/PlaceCardRemoveView;", "cardRemove$delegate", "flipAnimator", "Landroid/animation/AnimatorSet;", "placeCardViewModel", "Lcom/tinder/places/viewmodel/PlaceCardViewModel;", "getPlaceCardViewModel$Tinder_release", "()Lcom/tinder/places/viewmodel/PlaceCardViewModel;", "setPlaceCardViewModel$Tinder_release", "(Lcom/tinder/places/viewmodel/PlaceCardViewModel;)V", "placeCarouselListener", "Lcom/tinder/places/card/view/PlaceCardView$PlaceCarouselListener;", "placeId", "", "placeName", "presenter", "Lcom/tinder/places/card/presenter/PlacesCardViewPresenter;", "getPresenter", "()Lcom/tinder/places/card/presenter/PlacesCardViewPresenter;", "setPresenter", "(Lcom/tinder/places/card/presenter/PlacesCardViewPresenter;)V", "visibilityLocked", "", "getVisibilityLocked", "()Z", "setVisibilityLocked", "(Z)V", "animateFromAlternativesToBack", "", "animateFromBackToAlternatives", "animateFromBackToRemoveMeFromHere", "animateFromRemoveFromHereToBack", "bind", "item", "listener", "payloads", "", "", "bindPartial", "payload", "Lcom/tinder/places/carousel/adapter/PlacesCarouselAdapter$Update;", "bindPlaceColor", "bindTeasers", "teasers", "bindTotal", "disableCardInteraction", "enableCardInteraction", "endFlipAnimation", "flipBackwards", "flipBackwardsFromAlternatives", "newPlace", "getCameraDistanceForFlip", "", "getExpansionConfig", "Lcom/tinder/domain/places/model/PlacesConfigExpansion;", "getFadeAnimation", "viewIn", "Landroid/view/View;", "viewOut", "getFlipAnimation", "direction", "Lcom/tinder/places/card/view/PlaceCardView$FlipDirection;", "midFlipListener", "Lkotlin/Function0;", "onAttachedToWindow", "onDetachedFromWindow", "onEntranceAnimationEnded", "onMeasure", "widthMeasureSpec", "", "heightMeasureSpec", "onViewRecycled", "setFrontContentAlpha", "alpha", "setListener", "setNoRecsExistState", "setRecsErrorState", "code", "(Ljava/lang/Integer;)V", "setRecsLoadingState", "setVisibility", "visibility", "setVisitorInfo", "totalVisitors", "newVisitors", "showBack", "showErrorDialog", "throwable", "Lcom/tinder/data/places/PlacesApiClient$PlacesApiException;", "showFront", "showFrontFromAlternativesAnimated", "showFrontNotAnimated", "showRemoveDialog", "isPermanent", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "confirmed", "startRemoveLoadingState", "stopRemoveLoadingState", "FlipDirection", "PlaceCarouselListener", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PlaceCardView extends FrameLayout implements PlacesCardTarget, PlaceCardFlipListener {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f39873a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(PlaceCardView.class), "cardBack", "getCardBack()Lcom/tinder/places/card/view/PlaceCardBackView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(PlaceCardView.class), "cardAlternatives", "getCardAlternatives()Lcom/tinder/places/card/view/PlaceCardAlternativesView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(PlaceCardView.class), "cardRemove", "getCardRemove()Lcom/tinder/places/card/view/PlaceCardRemoveView;"))};
    @Inject
    @NotNull
    /* renamed from: b */
    public PlacesCardViewPresenter f39874b;
    /* renamed from: c */
    private boolean f39875c;
    /* renamed from: d */
    private final Lazy f39876d = C18451c.a((Function0) new PlaceCardView$cardBack$2(this));
    /* renamed from: e */
    private final Lazy f39877e = C18451c.a((Function0) new PlaceCardView$cardAlternatives$2(this));
    /* renamed from: f */
    private final Lazy f39878f = C18451c.a((Function0) new PlaceCardView$cardRemove$2(this));
    @Nullable
    /* renamed from: g */
    private C14349b f39879g;
    /* renamed from: h */
    private String f39880h;
    /* renamed from: i */
    private String f39881i;
    /* renamed from: j */
    private PlaceCarouselListener f39882j;
    /* renamed from: k */
    private C10163a f39883k;
    /* renamed from: l */
    private AnimatorSet f39884l;
    /* renamed from: m */
    private HashMap f39885m;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/places/card/view/PlaceCardView$FlipDirection;", "", "(Ljava/lang/String;I)V", "LEFT", "RIGHT", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    private enum FlipDirection {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/tinder/places/card/view/PlaceCardView$PlaceCarouselListener;", "", "allowScrolling", "", "disallowScrolling", "showPlaceRecs", "placeCard", "Lcom/tinder/places/card/view/PlaceCardView;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public interface PlaceCarouselListener {
        void allowScrolling();

        void disallowScrolling();

        void showPlaceRecs(@NotNull PlaceCardView placeCardView);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.PlaceCardView$a */
    static final class C10155a implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ PlaceCardView f33161a;
        /* renamed from: b */
        final /* synthetic */ PlaceCarouselListener f33162b;

        C10155a(PlaceCardView placeCardView, PlaceCarouselListener placeCarouselListener) {
            this.f33161a = placeCardView;
            this.f33162b = placeCarouselListener;
        }

        public final void onClick(View view) {
            this.f33161a.m48631a(this.f33162b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.PlaceCardView$b */
    static final class C10156b implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ PlaceCardView f33163a;

        C10156b(PlaceCardView placeCardView) {
            this.f33163a = placeCardView;
        }

        public final void onClick(View view) {
            this.f33163a.getPresenter().m41391f();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.PlaceCardView$c */
    static final class C10157c implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ PlaceCardView f33164a;

        C10157c(PlaceCardView placeCardView) {
            this.f33164a = placeCardView;
        }

        public final void onClick(View view) {
            this.f33164a.getPresenter().m41390e();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.PlaceCardView$d */
    static final class C10158d implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ PlaceCardView f33165a;

        C10158d(PlaceCardView placeCardView) {
            this.f33165a = placeCardView;
        }

        public final void onClick(View view) {
            this.f33165a.m48643e();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.PlaceCardView$e */
    static final class C10159e implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ PlaceCardView f33166a;

        C10159e(PlaceCardView placeCardView) {
            this.f33166a = placeCardView;
        }

        public final void onClick(View view) {
            this.f33166a.getPresenter().m41392g();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.PlaceCardView$f */
    static final class C10160f implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ PlaceCardView f33167a;

        C10160f(PlaceCardView placeCardView) {
            this.f33167a = placeCardView;
        }

        public final void onClick(View view) {
            this.f33167a.getPresenter().m41393h();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.PlaceCardView$g */
    static final class C10161g implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ PlaceCardView f33168a;

        C10161g(PlaceCardView placeCardView) {
            this.f33168a = placeCardView;
        }

        public final void onClick(View view) {
            this.f33168a.m48644f();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/places/card/view/PlaceCardView$getFadeAnimation$1", "Lcom/tinder/utils/SimpleAnimatorListener;", "(Landroid/view/View;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.PlaceCardView$h */
    public static final class C12313h extends an {
        /* renamed from: a */
        final /* synthetic */ View f39869a;

        C12313h(View view) {
            this.f39869a = view;
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            this.f39869a.setAlpha(1.0f);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/places/card/view/PlaceCardView$getFlipAnimation$1", "Lcom/tinder/utils/SimpleAnimatorListener;", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.PlaceCardView$i */
    public static final class C12314i extends an {
        /* renamed from: a */
        final /* synthetic */ View f39870a;
        /* renamed from: b */
        final /* synthetic */ Function0 f39871b;

        C12314i(View view, Function0 function0) {
            this.f39870a = view;
            this.f39871b = function0;
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            this.f39870a.setVisibility(8);
            this.f39870a.setRotationY(0.0f);
            animator = this.f39871b;
            if (animator != null) {
                C15813i c15813i = (C15813i) animator.invoke();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/places/card/view/PlaceCardView$getFlipAnimation$2", "Lcom/tinder/utils/SimpleAnimatorListener;", "(Landroid/view/View;)V", "onAnimationStart", "", "animation", "Landroid/animation/Animator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.PlaceCardView$j */
    public static final class C12315j extends an {
        /* renamed from: a */
        final /* synthetic */ View f39872a;

        C12315j(View view) {
            this.f39872a = view;
        }

        public void onAnimationStart(@Nullable Animator animator) {
            this.f39872a.setVisibility(0);
        }
    }

    private final PlaceCardAlternativesView getCardAlternatives() {
        Lazy lazy = this.f39877e;
        KProperty kProperty = f39873a[1];
        return (PlaceCardAlternativesView) lazy.getValue();
    }

    private final PlaceCardBackView getCardBack() {
        Lazy lazy = this.f39876d;
        KProperty kProperty = f39873a[0];
        return (PlaceCardBackView) lazy.getValue();
    }

    private final PlaceCardRemoveView getCardRemove() {
        Lazy lazy = this.f39878f;
        KProperty kProperty = f39873a[2];
        return (PlaceCardRemoveView) lazy.getValue();
    }

    /* renamed from: a */
    public View m48646a(int i) {
        if (this.f39885m == null) {
            this.f39885m = new HashMap();
        }
        View view = (View) this.f39885m.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f39885m.put(Integer.valueOf(i), view);
        return view;
    }

    public PlaceCardView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        ((PlacesComponentProvider) context).getPlacesComponent().inject(this);
        this.f39880h = "";
        this.f39881i = "";
    }

    public final boolean getVisibilityLocked() {
        return this.f39875c;
    }

    public final void setVisibilityLocked(boolean z) {
        this.f39875c = z;
    }

    @Nullable
    public final C14349b getPlaceCardViewModel$Tinder_release() {
        return this.f39879g;
    }

    public final void setPlaceCardViewModel$Tinder_release(@Nullable C14349b c14349b) {
        this.f39879g = c14349b;
    }

    @NotNull
    public final PlacesCardViewPresenter getPresenter() {
        PlacesCardViewPresenter placesCardViewPresenter = this.f39874b;
        if (placesCardViewPresenter == null) {
            C2668g.b("presenter");
        }
        return placesCardViewPresenter;
    }

    public final void setPresenter(@NotNull PlacesCardViewPresenter placesCardViewPresenter) {
        C2668g.b(placesCardViewPresenter, "<set-?>");
        this.f39874b = placesCardViewPresenter;
    }

    /* renamed from: a */
    public final void m48648a(@NotNull C14349b c14349b, @NotNull PlaceCarouselListener placeCarouselListener, @Nullable List<? extends Object> list) {
        C2668g.b(c14349b, "item");
        C2668g.b(placeCarouselListener, "listener");
        if (list == null || list.isEmpty()) {
            m48636a(c14349b, placeCarouselListener);
            return;
        }
        placeCarouselListener = list.get(null);
        if ((placeCarouselListener instanceof Update) != null) {
            m48637a(c14349b, (Update) placeCarouselListener);
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        PlacesCardViewPresenter placesCardViewPresenter = this.f39874b;
        if (placesCardViewPresenter == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, placesCardViewPresenter);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
        C10163a c10163a = this.f39883k;
        if (c10163a != null) {
            c10163a.m41461a();
        }
        setScaleX(1.0f);
        setScaleY(1.0f);
    }

    protected void onMeasure(int i, int i2) {
        i2 = getLayoutParams();
        if (i2 == 0) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if ((i2.width == -1 ? 1 : 0) == 0) {
            throw ((Throwable) new IllegalArgumentException("Expected width to be MATCH_PARENT but was not".toString()));
        }
        i = ((double) MeasureSpec.getSize(i)) / 1.25d;
        super.onMeasure(MeasureSpec.makeMeasureSpec((int) i, 1073741824), MeasureSpec.makeMeasureSpec((int) (1.2d * i), 1073741824));
    }

    public void endFlipAnimation() {
        AnimatorSet animatorSet = this.f39884l;
        if (animatorSet != null) {
            animatorSet.end();
        }
    }

    public void bindTeasers(@NotNull List<String> list) {
        C2668g.b(list, "teasers");
        ((PlaceCardFrontView) m48646a(C6248a.placeCardFront)).m48622a((List) list);
        m48645g();
    }

    public void setNoRecsExistState() {
        bindTeasers(C19301m.a());
    }

    public void setRecsErrorState(@Nullable Integer num) {
        ((PlaceCardFrontView) m48646a(C6248a.placeCardFront)).setRecsErrorState(num);
        num = this.f39879g;
        if (num != null) {
            this.f39883k = new C10163a(null, new PlaceCardView$setRecsErrorState$$inlined$let$lambda$1(num, this), 1, null);
            ((PlaceCardFrontView) m48646a(C6248a.placeCardFront)).setOnTouchListener(this.f39883k);
        }
    }

    public void setRecsLoadingState() {
        ((PlaceCardFrontView) m48646a(C6248a.placeCardFront)).m48624b();
        this.f39883k = new C10163a(null, new PlaceCardView$setRecsLoadingState$1(this), 1, null);
        ((PlaceCardFrontView) m48646a(C6248a.placeCardFront)).setOnTouchListener(this.f39883k);
    }

    public void setVisitorInfo(int i, int i2) {
        ((PlaceCardFrontView) m48646a(C6248a.placeCardFront)).m48620a(i, i2);
        C14349b c14349b = this.f39879g;
        if (c14349b != null) {
            c14349b = C14349b.a(c14349b, null, null, Integer.valueOf(i), null, 0, 0, false, null, false, null, 1019, null);
        } else {
            c14349b = null;
        }
        r0.f39879g = c14349b;
    }

    public void startRemoveLoadingState() {
        ((PlaceCardRemoveView) m48646a(C6248a.placeCardRemove)).m41456a(true);
    }

    public void stopRemoveLoadingState() {
        ((PlaceCardRemoveView) m48646a(C6248a.placeCardRemove)).m41456a(false);
    }

    public void showErrorDialog(@NotNull PlacesApiException placesApiException) {
        C2668g.b(placesApiException, "throwable");
        C10124a c10124a = C12296e.f39820a;
        Context context = getContext();
        C2668g.a(context, "context");
        c10124a.m41365a(placesApiException, context).show();
    }

    public void disableCardInteraction() {
        ((PlaceCardFrontView) m48646a(C6248a.placeCardFront)).setOnTouchListener(null);
        ((PlaceCardFrontView) m48646a(C6248a.placeCardFront)).setGoBackListener(PlaceCardView$disableCardInteraction$1.f44959a);
    }

    public void enableCardInteraction() {
        ((PlaceCardFrontView) m48646a(C6248a.placeCardFront)).setOnTouchListener(this.f39883k);
        ((PlaceCardFrontView) m48646a(C6248a.placeCardFront)).setGoBackListener(new PlaceCardView$enableCardInteraction$1(this));
    }

    public void setVisibility(int i) {
        if (!this.f39875c) {
            super.setVisibility(i);
        }
    }

    public void flipBackwards() {
        m48631a(this.f39882j);
    }

    public final void setFrontContentAlpha(float f) {
        PlaceCardFrontView placeCardFrontView = (PlaceCardFrontView) m48646a(C6248a.placeCardFront);
        C2668g.a(placeCardFrontView, "placeCardFront");
        placeCardFrontView.setAlpha(f);
    }

    /* renamed from: a */
    public final void m48647a() {
        ((PlaceCardFrontView) m48646a(C6248a.placeCardFront)).m48625c();
        ((PlaceCardAlternativesView) m48646a(C6248a.placeCardAlternatives)).m48612a();
    }

    @NotNull
    public final PlacesConfigExpansion getExpansionConfig() {
        return ((PlaceCardFrontView) m48646a(C6248a.placeCardFront)).getExpansionConfig();
    }

    /* renamed from: a */
    private final void m48636a(C14349b c14349b, PlaceCarouselListener placeCarouselListener) {
        C14349b c14349b2 = c14349b;
        PlaceCarouselListener placeCarouselListener2 = placeCarouselListener;
        this.f39880h = c14349b.a();
        this.f39881i = c14349b.b();
        this.f39879g = c14349b2;
        setListener(placeCarouselListener2);
        C10163a c10163a = this.f39883k;
        if (c10163a != null) {
            c10163a.m41461a();
        }
        r0.f39883k = new C10163a(null, new PlaceCardView$bindTotal$1(r0, placeCarouselListener2), 1, null);
        String b = c14349b.b();
        DateTime f = c14349b.f();
        boolean d = c14349b.d();
        Context context = getContext();
        C2668g.a(context, "context");
        ((PlaceCardFrontView) m48646a(C6248a.placeCardFront)).m48621a(new C15424c(b, f, d, c14349b2.a(context), null, null, null, 112, null));
        m48642d();
        PlaceCardFlipListener placeCardFlipListener = r0;
        ((PlaceCardFrontView) m48646a(C6248a.placeCardFront)).setFlipListener(placeCardFlipListener);
        m48645g();
        ((PlaceCardBackContainerView) m48646a(C6248a.placeCardBackContainer)).setNames(c14349b.b());
        ((PlaceCardBackContainerView) m48646a(C6248a.placeCardBackContainer)).setFlipListener(placeCardFlipListener);
        ((Button) getCardBack().m41449a(C6248a.goToFront)).setOnClickListener(new C10155a(r0, placeCarouselListener2));
        ((CustomButton) getCardBack().m41449a(C6248a.removePlaceBtn)).setOnClickListener(new C10156b(r0));
        ((CustomButton) getCardBack().m41449a(C6248a.incorrectPlaceBtn)).setOnClickListener(new C10157c(r0));
        getCardAlternatives().setPlaceCardAlternativesViewModel(new C14347a(c14349b.a(), c14349b.e()));
        ((Button) getCardAlternatives().m48611a(C6248a.goToBackFromAlternatives)).setOnClickListener(new C10158d(r0));
        ((CustomButton) getCardRemove().m41454a(C6248a.justThisOnceBtn)).setOnClickListener(new C10159e(r0));
        ((CustomButton) getCardRemove().m41454a(C6248a.neverShowMeHereBtn)).setOnClickListener(new C10160f(r0));
        ((Button) getCardRemove().m41454a(C6248a.goToBackFromRemove)).setOnClickListener(new C10161g(r0));
        PlacesCardViewPresenter placesCardViewPresenter = r0.f39874b;
        if (placesCardViewPresenter == null) {
            C2668g.b("presenter");
        }
        placesCardViewPresenter.m41386a(c14349b2);
    }

    /* renamed from: a */
    private final void m48637a(C14349b c14349b, Update update) {
        switch (C10185i.f33221a[update.ordinal()]) {
            case 1:
                ((PlaceCardFrontView) m48646a(C6248a.placeCardFront)).m48623a(c14349b.d());
                return;
            case 2:
                m48632a(this.f39882j, c14349b);
                getCardAlternatives().m48615a(new C14347a(c14349b.a(), c14349b.e()));
                return;
            default:
                return;
        }
    }

    private final void setListener(PlaceCarouselListener placeCarouselListener) {
        this.f39882j = placeCarouselListener;
    }

    /* renamed from: a */
    private final void m48631a(PlaceCarouselListener placeCarouselListener) {
        if (placeCarouselListener != null) {
            placeCarouselListener.allowScrolling();
        }
        m48639c();
    }

    /* renamed from: a */
    private final void m48632a(PlaceCarouselListener placeCarouselListener, C14349b c14349b) {
        if (placeCarouselListener != null) {
            placeCarouselListener.allowScrolling();
        }
        m48635a(c14349b);
    }

    public void showRemoveDialog(boolean z, @NotNull Function1<? super Boolean, C15813i> function1) {
        C2668g.b(function1, "action");
        Context context = getContext();
        C2668g.a(context, "context");
        new C14154f(context, function1, this.f39881i, z).show();
    }

    /* renamed from: a */
    static /* synthetic */ AnimatorSet m48629a(PlaceCardView placeCardView, View view, View view2, FlipDirection flipDirection, Function0 function0, int i, Object obj) {
        if ((i & 8) != 0) {
            function0 = null;
        }
        return placeCardView.m48628a(view, view2, flipDirection, function0);
    }

    /* renamed from: a */
    private final AnimatorSet m48628a(View view, View view2, FlipDirection flipDirection, Function0<C15813i> function0) {
        Object obj = 1119092736;
        float f = flipDirection == FlipDirection.LEFT ? -90.0f : 90.0f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "rotationY", new float[]{0.0f, f});
        C2668g.a(ofFloat, "outFlip");
        ofFloat.setInterpolator(new AccelerateInterpolator());
        ofFloat.addListener(new C12314i(view2, function0));
        if (flipDirection != FlipDirection.LEFT) {
            obj = -1028390912;
        }
        view2 = ObjectAnimator.ofFloat(view, "rotationY", new float[]{obj, null});
        C2668g.a(view2, "inFlip");
        view2.setInterpolator((TimeInterpolator) new DecelerateInterpolator());
        view2.addListener((AnimatorListener) new C12315j(view));
        view = new AnimatorSet();
        view.playSequentially(new Animator[]{ofFloat, (Animator) view2});
        view.setDuration(200);
        return view;
    }

    /* renamed from: a */
    private final AnimatorSet m48627a(View view, View view2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "alpha", new float[]{1.0f, 0.0f});
        C2668g.a(ofFloat, "outFade");
        ofFloat.setInterpolator(new AccelerateInterpolator());
        ofFloat.addListener(new C12313h(view2));
        view = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f});
        C2668g.a(view, "inFade");
        view.setInterpolator((TimeInterpolator) new DecelerateInterpolator());
        view2 = new AnimatorSet();
        view2.playSequentially(new Animator[]{ofFloat, (Animator) view});
        view2.setDuration(200);
        return view2;
    }

    public void showBack() {
        float cameraDistanceForFlip = getCameraDistanceForFlip();
        PlaceCardFrontView placeCardFrontView = (PlaceCardFrontView) m48646a(C6248a.placeCardFront);
        C2668g.a(placeCardFrontView, "placeCardFront");
        placeCardFrontView.setCameraDistance(cameraDistanceForFlip);
        PlaceCardBackContainerView placeCardBackContainerView = (PlaceCardBackContainerView) m48646a(C6248a.placeCardBackContainer);
        C2668g.a(placeCardBackContainerView, "placeCardBackContainer");
        placeCardBackContainerView.setCameraDistance(cameraDistanceForFlip);
        AnimatorSet animatorSet = new AnimatorSet();
        Animator[] animatorArr = new Animator[2];
        PlaceCardBackContainerView placeCardBackContainerView2 = (PlaceCardBackContainerView) m48646a(C6248a.placeCardBackContainer);
        C2668g.a(placeCardBackContainerView2, "placeCardBackContainer");
        View view = placeCardBackContainerView2;
        PlaceCardFrontView placeCardFrontView2 = (PlaceCardFrontView) m48646a(C6248a.placeCardFront);
        C2668g.a(placeCardFrontView2, "placeCardFront");
        animatorArr[0] = m48629a(this, view, placeCardFrontView2, FlipDirection.LEFT, null, 8, null);
        animatorArr[1] = m48627a((View) getCardBack(), ((PlaceCardFrontView) m48646a(C6248a.placeCardFront)).getContentView());
        animatorSet.playTogether(animatorArr);
        this.f39884l = animatorSet;
        animatorSet = this.f39884l;
        if (animatorSet != null) {
            animatorSet.start();
        }
        getCardAlternatives().setVisibility(8);
        getCardRemove().setVisibility(8);
        PlaceCarouselListener placeCarouselListener = this.f39882j;
        if (placeCarouselListener != null) {
            placeCarouselListener.disallowScrolling();
        }
        PlacesCardViewPresenter placesCardViewPresenter = this.f39874b;
        if (placesCardViewPresenter == null) {
            C2668g.b("presenter");
        }
        placesCardViewPresenter.m41385a(FlippedState.BACK);
    }

    /* renamed from: c */
    private final void m48639c() {
        float cameraDistanceForFlip = getCameraDistanceForFlip();
        PlaceCardFrontView placeCardFrontView = (PlaceCardFrontView) m48646a(C6248a.placeCardFront);
        C2668g.a(placeCardFrontView, "placeCardFront");
        placeCardFrontView.setCameraDistance(cameraDistanceForFlip);
        PlaceCardBackContainerView placeCardBackContainerView = (PlaceCardBackContainerView) m48646a(C6248a.placeCardBackContainer);
        C2668g.a(placeCardBackContainerView, "placeCardBackContainer");
        placeCardBackContainerView.setCameraDistance(cameraDistanceForFlip);
        AnimatorSet animatorSet = new AnimatorSet();
        Animator[] animatorArr = new Animator[2];
        PlaceCardFrontView placeCardFrontView2 = (PlaceCardFrontView) m48646a(C6248a.placeCardFront);
        C2668g.a(placeCardFrontView2, "placeCardFront");
        View view = placeCardFrontView2;
        PlaceCardBackContainerView placeCardBackContainerView2 = (PlaceCardBackContainerView) m48646a(C6248a.placeCardBackContainer);
        C2668g.a(placeCardBackContainerView2, "placeCardBackContainer");
        animatorArr[0] = m48629a(this, view, placeCardBackContainerView2, FlipDirection.RIGHT, null, 8, null);
        animatorArr[1] = m48627a(((PlaceCardFrontView) m48646a(C6248a.placeCardFront)).getContentView(), (View) getCardBack());
        animatorSet.playTogether(animatorArr);
        this.f39884l = animatorSet;
        animatorSet = this.f39884l;
        if (animatorSet != null) {
            animatorSet.start();
        }
        getCardBack().setVisibility(0);
        getCardAlternatives().setVisibility(8);
        getCardRemove().setVisibility(8);
        PlacesCardViewPresenter placesCardViewPresenter = this.f39874b;
        if (placesCardViewPresenter == null) {
            C2668g.b("presenter");
        }
        placesCardViewPresenter.m41385a(FlippedState.FRONT);
    }

    /* renamed from: d */
    private final void m48642d() {
        PlaceCardBackContainerView placeCardBackContainerView = (PlaceCardBackContainerView) m48646a(C6248a.placeCardBackContainer);
        C2668g.a(placeCardBackContainerView, "placeCardBackContainer");
        placeCardBackContainerView.setVisibility(8);
        PlaceCardFrontView placeCardFrontView = (PlaceCardFrontView) m48646a(C6248a.placeCardFront);
        C2668g.a(placeCardFrontView, "placeCardFront");
        placeCardFrontView.setVisibility(0);
        getCardBack().setVisibility(0);
        getCardAlternatives().setVisibility(8);
        getCardRemove().setVisibility(8);
        PlacesCardViewPresenter placesCardViewPresenter = this.f39874b;
        if (placesCardViewPresenter == null) {
            C2668g.b("presenter");
        }
        placesCardViewPresenter.m41385a(FlippedState.FRONT);
    }

    /* renamed from: a */
    private final void m48635a(C14349b c14349b) {
        float cameraDistanceForFlip = getCameraDistanceForFlip();
        PlaceCardFrontView placeCardFrontView = (PlaceCardFrontView) m48646a(C6248a.placeCardFront);
        C2668g.a(placeCardFrontView, "placeCardFront");
        placeCardFrontView.setCameraDistance(cameraDistanceForFlip);
        ((PlaceCardFrontView) m48646a(C6248a.placeCardFront)).m48619a();
        PlaceCardBackContainerView placeCardBackContainerView = (PlaceCardBackContainerView) m48646a(C6248a.placeCardBackContainer);
        C2668g.a(placeCardBackContainerView, "placeCardBackContainer");
        placeCardBackContainerView.setCameraDistance(cameraDistanceForFlip);
        AnimatorSet animatorSet = new AnimatorSet();
        Animator[] animatorArr = new Animator[2];
        PlaceCardFrontView placeCardFrontView2 = (PlaceCardFrontView) m48646a(C6248a.placeCardFront);
        C2668g.a(placeCardFrontView2, "placeCardFront");
        View view = placeCardFrontView2;
        PlaceCardBackContainerView placeCardBackContainerView2 = (PlaceCardBackContainerView) m48646a(C6248a.placeCardBackContainer);
        C2668g.a(placeCardBackContainerView2, "placeCardBackContainer");
        animatorArr[0] = m48628a(view, placeCardBackContainerView2, FlipDirection.RIGHT, new C14183x9edf5ada(this, c14349b));
        animatorArr[1] = m48627a(((PlaceCardFrontView) m48646a(C6248a.placeCardFront)).getContentView(), (View) getCardBack());
        animatorSet.playTogether(animatorArr);
        this.f39884l = animatorSet;
        c14349b = this.f39884l;
        if (c14349b != null) {
            c14349b.start();
        }
        getCardBack().setVisibility(0);
        getCardAlternatives().setVisibility(8);
        getCardRemove().setVisibility(8);
        c14349b = this.f39874b;
        if (c14349b == null) {
            C2668g.b("presenter");
        }
        c14349b.m41385a(FlippedState.FRONT);
    }

    /* renamed from: e */
    private final void m48643e() {
        getCardAlternatives().m48614a(250, 250, (Function0) new PlaceCardView$animateFromAlternativesToBack$1(this));
    }

    public void animateFromBackToAlternatives() {
        getCardBack().m41450a(250, true);
        getCardAlternatives().m48613a(250, 250);
    }

    public void animateFromBackToRemoveMeFromHere() {
        getCardBack().m41450a(250, false);
        getCardRemove().m41455a(250);
    }

    /* renamed from: f */
    private final void m48644f() {
        getCardRemove().m41457b(250);
        getCardBack().m41451b(250, false);
    }

    private final float getCameraDistanceForFlip() {
        Resources resources = getResources();
        C2668g.a(resources, "resources");
        return resources.getDisplayMetrics().density * ((float) 5000);
    }

    /* renamed from: g */
    private final void m48645g() {
        C10211a a;
        C14349b c14349b = this.f39879g;
        if (c14349b != null) {
            Context context = getContext();
            C2668g.a(context, "context");
            a = c14349b.a(context);
        } else {
            a = null;
        }
        PlaceCardBackContainerView placeCardBackContainerView = (PlaceCardBackContainerView) m48646a(C6248a.placeCardBackContainer);
        C2668g.a(placeCardBackContainerView, "placeCardBackContainer");
        View a2 = placeCardBackContainerView.m41446a(C6248a.cardBackgroundBack);
        C2668g.a(a2, "placeCardBackContainer.cardBackgroundBack");
        a2.setBackground(a);
    }

    /* renamed from: b */
    public final void m48649b() {
        ((PlaceCardFrontView) m48646a(C6248a.placeCardFront)).m48626d();
    }
}
