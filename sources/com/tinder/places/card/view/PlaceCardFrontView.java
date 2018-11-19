package com.tinder.places.card.view;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.common.ConnectionResult;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.deadshot.Deadshot;
import com.tinder.domain.places.model.PlacesConfigExpansion;
import com.tinder.domain.places.model.PlacesConfigExpansion.Size;
import com.tinder.domain.places.model.PlacesConfigExpansion.Size.Companion;
import com.tinder.places.card.p308a.C10125a;
import com.tinder.places.card.presenter.C10129c;
import com.tinder.places.card.target.PlaceCardFrontTarget;
import com.tinder.places.injection.PlacesComponentProvider;
import com.tinder.utils.au;
import com.tinder.viewmodel.C15424c;
import com.tinder.viewmodel.C15425d;
import com.tinder.views.CustomTextView;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C15828l;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tinder.com.tooltip.Tooltip;
import tinder.com.tooltip.Tooltip.AnchorGravity;
import tinder.com.tooltip.Tooltip.C19463a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0016J\u0006\u0010 \u001a\u00020!J\b\u0010\"\u001a\u00020\u0019H\u0016J\b\u0010#\u001a\u00020\u0019H\u0014J\b\u0010$\u001a\u00020\u0019H\u0014J\u0006\u0010%\u001a\u00020\u0019J\u0006\u0010&\u001a\u00020\u0019J\u0014\u0010'\u001a\u00020\u00192\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)J\u0006\u0010+\u001a\u00020\u0019J\u000e\u0010,\u001a\u00020\u00192\u0006\u0010-\u001a\u00020.J\b\u0010/\u001a\u00020\u0019H\u0016J\u0010\u00100\u001a\u00020\u00192\u0006\u00101\u001a\u000202H\u0016J\u0010\u00103\u001a\u00020\u00192\u0006\u00104\u001a\u000205H\u0016J\u0010\u00106\u001a\u00020\u00192\u0006\u00101\u001a\u000202H\u0016J\b\u00107\u001a\u00020\u0019H\u0016J\u000e\u00108\u001a\u00020\u00192\u0006\u00109\u001a\u00020\u000fJ\u0014\u0010:\u001a\u00020\u00192\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00190;J\b\u0010<\u001a\u00020\u0019H\u0016J\u0010\u0010=\u001a\u00020\u00192\u0006\u0010>\u001a\u00020*H\u0016J\u0015\u0010?\u001a\u00020\u00192\b\u0010@\u001a\u0004\u0018\u00010A¢\u0006\u0002\u0010BJ\u0006\u0010C\u001a\u00020\u0019J\b\u0010D\u001a\u00020\u0019H\u0016J\u0016\u0010E\u001a\u00020\u00192\u0006\u0010F\u001a\u00020A2\u0006\u0010G\u001a\u00020AJ \u0010E\u001a\u00020\u00192\u0006\u0010F\u001a\u00020A2\u0006\u0010G\u001a\u00020A2\u0006\u00104\u001a\u000205H\u0016J\b\u0010H\u001a\u00020\u0019H\u0016J\b\u0010I\u001a\u00020\u0019H\u0016J\u0017\u0010J\u001a\u00020\u00192\b\u0010@\u001a\u0004\u0018\u00010AH\u0016¢\u0006\u0002\u0010BJ\b\u0010K\u001a\u00020\u0019H\u0016J\b\u0010L\u001a\u00020\u0019H\u0016J\b\u0010M\u001a\u00020\u0019H\u0016R\u001b\u0010\b\u001a\u00020\t8FX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00118\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000¨\u0006N"}, d2 = {"Lcom/tinder/places/card/view/PlaceCardFrontView;", "Landroid/widget/FrameLayout;", "Lcom/tinder/places/card/target/PlaceCardFrontTarget;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "contentView", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "contentView$delegate", "Lkotlin/Lazy;", "flipListener", "Lcom/tinder/places/card/view/PlaceCardFlipListener;", "presenter", "Lcom/tinder/places/card/presenter/PlaceCardFrontPresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/places/card/presenter/PlaceCardFrontPresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/places/card/presenter/PlaceCardFrontPresenter;)V", "tooltip", "Ltinder/com/tooltip/Tooltip;", "bind", "", "placeCardFrontViewModel", "Lcom/tinder/viewmodel/PlaceCardFrontViewModel;", "bindTeasers", "placeRecTeasersViewModel", "Lcom/tinder/viewmodel/PlaceRecTeasersViewModel;", "dismissTooltipIfPresent", "getExpansionConfig", "Lcom/tinder/domain/places/model/PlacesConfigExpansion;", "hideRecsErrorText", "onAttachedToWindow", "onDetachedFromWindow", "onEntranceAnimationEnded", "onViewRecycled", "requestBindTeasers", "teasers", "", "", "requestTeaserImageViewsReset", "requestUpdateVisitText", "viewed", "", "resetTeaserImageViews", "setAlpha", "alpha", "", "setColor", "backgroundDrawable", "Landroid/graphics/drawable/Drawable;", "setContentAlpha", "setExpiringTitle", "setFlipListener", "listener", "setGoBackListener", "Lkotlin/Function0;", "setNewPlaceTitle", "setPlaceName", "placeName", "setRecsErrorState", "code", "", "(Ljava/lang/Integer;)V", "setRecsLoadingState", "setRegularTitle", "setVisitorInfo", "totalVisitors", "newVisitors", "showErrorButton", "showNoVisitorButton", "showRecsErrorText", "showTutorialTooltip", "startShimmer", "stopShimmer", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PlaceCardFrontView extends FrameLayout implements PlaceCardFrontTarget {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f39862a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(PlaceCardFrontView.class), "contentView", "getContentView()Landroid/view/View;"))};
    @Inject
    @NotNull
    /* renamed from: b */
    public C10129c f39863b;
    /* renamed from: c */
    private PlaceCardFlipListener f39864c;
    /* renamed from: d */
    private Tooltip f39865d;
    @NotNull
    /* renamed from: e */
    private final Lazy f39866e = C18451c.a((Function0) new PlaceCardFrontView$contentView$2(this));
    /* renamed from: f */
    private HashMap f39867f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.PlaceCardFrontView$a */
    static final class C10149a implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ Function0 f33153a;

        C10149a(Function0 function0) {
            this.f33153a = function0;
        }

        public final void onClick(View view) {
            this.f33153a.invoke();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JP\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0016¨\u0006\u0010¸\u0006\u0011"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "(Lkotlin/jvm/functions/Function1;)V", "onLayoutChange", "", "view", "Landroid/view/View;", "left", "", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "core-ktx_release", "androidx/core/view/ViewKt$doOnLayout$$inlined$doOnNextLayout$1"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.PlaceCardFrontView$b */
    public static final class C10151b implements OnLayoutChangeListener {
        /* renamed from: a */
        final /* synthetic */ PlaceCardFrontView f33155a;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss", "com/tinder/places/card/view/PlaceCardFrontView$showTutorialTooltip$1$1"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.places.card.view.PlaceCardFrontView$b$a */
        static final class C10150a implements OnDismissListener {
            /* renamed from: a */
            final /* synthetic */ C10151b f33154a;

            C10150a(C10151b c10151b) {
                this.f33154a = c10151b;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                this.f33154a.f33155a.f39865d = (Tooltip) null;
            }
        }

        public C10151b(PlaceCardFrontView placeCardFrontView) {
            this.f33155a = placeCardFrontView;
        }

        public void onLayoutChange(@NotNull View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            PlaceCardFrontView placeCardFrontView = this.f33155a;
            i2 = this.f33155a.getContext();
            C2668g.a(i2, "context");
            placeCardFrontView.f39865d = new C19463a(i2, (ImageView) this.f33155a.m48618a(C6248a.goToBack)).a(au.a(this.f33155a, R.string.places_card_tooltip_tutorial, new String[0])).a(AnchorGravity.TOP).a(new int[]{au.c(this.f33155a, R.color.gradient_red), au.c(this.f33155a, R.color.gradient_orange)}).a(false).a();
            view = this.f33155a.f39865d;
            if (view != null) {
                view.setOnDismissListener((OnDismissListener) new C10150a(this));
            }
            view = this.f33155a.f39865d;
            if (view != null) {
                view.show();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss", "com/tinder/places/card/view/PlaceCardFrontView$showTutorialTooltip$1$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.PlaceCardFrontView$c */
    static final class C10152c implements OnDismissListener {
        /* renamed from: a */
        final /* synthetic */ PlaceCardFrontView f33156a;

        C10152c(PlaceCardFrontView placeCardFrontView) {
            this.f33156a = placeCardFrontView;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f33156a.f39865d = (Tooltip) null;
        }
    }

    /* renamed from: a */
    public View m48618a(int i) {
        if (this.f39867f == null) {
            this.f39867f = new HashMap();
        }
        View view = (View) this.f39867f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f39867f.put(Integer.valueOf(i), view);
        return view;
    }

    @NotNull
    public final View getContentView() {
        Lazy lazy = this.f39866e;
        KProperty kProperty = f39862a[0];
        return (View) lazy.getValue();
    }

    public PlaceCardFrontView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        ((PlacesComponentProvider) context).getPlacesComponent().inject(this);
        context = context.getSystemService("layout_inflater");
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
        }
        ((LayoutInflater) context).inflate(R.layout.view_place_card_front, this, true);
    }

    @NotNull
    public final C10129c getPresenter$Tinder_release() {
        C10129c c10129c = this.f39863b;
        if (c10129c == null) {
            C2668g.b("presenter");
        }
        return c10129c;
    }

    public final void setPresenter$Tinder_release(@NotNull C10129c c10129c) {
        C2668g.b(c10129c, "<set-?>");
        this.f39863b = c10129c;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C10129c c10129c = this.f39863b;
        if (c10129c == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c10129c);
    }

    protected void onDetachedFromWindow() {
        Deadshot.drop(this);
        super.onDetachedFromWindow();
        PlaceCardFlipListener placeCardFlipListener = this.f39864c;
        if (placeCardFlipListener != null) {
            placeCardFlipListener.endFlipAnimation();
        }
    }

    public void setPlaceName(@NotNull String str) {
        C2668g.b(str, "placeName");
        TextView textView = (TextView) m48618a(C6248a.titleTextView);
        C2668g.a(textView, "titleTextView");
        textView.setText(str);
        ((TextView) m48618a(C6248a.titleTextView)).setTextColor(-1);
    }

    public void setColor(@NotNull Drawable drawable) {
        C2668g.b(drawable, "backgroundDrawable");
        View a = m48618a(C6248a.cardBackground);
        C2668g.a(a, "cardBackground");
        a.setBackground(drawable);
    }

    public void setVisitorInfo(int i, int i2, @NotNull Drawable drawable) {
        C2668g.b(drawable, "backgroundDrawable");
        TextView textView = (TextView) m48618a(C6248a.seeRecsBtn);
        C2668g.a(textView, "seeRecsBtn");
        C10125a c10125a = C10125a.f33093a;
        Resources resources = getResources();
        C2668g.a(resources, "resources");
        textView.setText(c10125a.m41367b(i, resources));
        textView = (TextView) m48618a(C6248a.seeRecsBtn);
        C2668g.a(textView, "seeRecsBtn");
        c10125a = C10125a.f33093a;
        resources = getResources();
        C2668g.a(resources, "resources");
        textView.setBackground(c10125a.m41368c(i, resources));
        ((PlaceRecTeasersView) m48618a(C6248a.recsView)).m48651a(i, i2, drawable);
    }

    public void bindTeasers(@NotNull C15425d c15425d) {
        C2668g.b(c15425d, "placeRecTeasersViewModel");
        ((PlaceRecTeasersView) m48618a(C6248a.recsView)).m48652a(c15425d);
    }

    public void resetTeaserImageViews() {
        ((PlaceRecTeasersView) m48618a(C6248a.recsView)).resetImageViews();
    }

    public void setContentAlpha(float f) {
        ConstraintLayout constraintLayout = (ConstraintLayout) m48618a(C6248a.cardContainer);
        C2668g.a(constraintLayout, "cardContainer");
        if (constraintLayout.getAlpha() != f) {
            constraintLayout = (ConstraintLayout) m48618a(C6248a.cardContainer);
            C2668g.a(constraintLayout, "cardContainer");
            constraintLayout.setAlpha(f);
        }
        ImageView imageView = (ImageView) m48618a(C6248a.goToBack);
        C2668g.a(imageView, "goToBack");
        if (imageView.getAlpha() != f) {
            imageView = (ImageView) m48618a(C6248a.goToBack);
            C2668g.a(imageView, "goToBack");
            imageView.setAlpha(f);
        }
        TextView textView = (TextView) m48618a(C6248a.seeRecsBtn);
        C2668g.a(textView, "seeRecsBtn");
        if (textView.getAlpha() != f) {
            textView = (TextView) m48618a(C6248a.seeRecsBtn);
            C2668g.a(textView, "seeRecsBtn");
            textView.setAlpha(f);
        }
    }

    public void setRegularTitle() {
        CustomTextView customTextView = (CustomTextView) m48618a(C6248a.introPlaceTextView);
        C2668g.a(customTextView, "introPlaceTextView");
        customTextView.setText(au.a(this, R.string.youve_been_to, new String[0]));
    }

    public void setNewPlaceTitle() {
        CustomTextView customTextView = (CustomTextView) m48618a(C6248a.introPlaceTextView);
        C2668g.a(customTextView, "introPlaceTextView");
        customTextView.setText(au.a(this, R.string.new_place, new String[0]));
    }

    public void setExpiringTitle() {
        CustomTextView customTextView = (CustomTextView) m48618a(C6248a.introPlaceTextView);
        C2668g.a(customTextView, "introPlaceTextView");
        customTextView.setText(au.a(this, R.string.places_expiring_soon, new String[0]));
    }

    public void showRecsErrorText(@Nullable Integer num) {
        TextView textView;
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) m48618a(C6248a.placeCardRecsShimmer);
        C2668g.a(shimmerFrameLayout, "placeCardRecsShimmer");
        shimmerFrameLayout.setVisibility(4);
        TextView textView2 = (TextView) m48618a(C6248a.placeRecsErrorText);
        C2668g.a(textView2, "placeRecsErrorText");
        if (num != null) {
            num = num.intValue();
            String a = au.a(this, R.string.error_trouble_connecting_with_code, new String[0]);
            C15828l c15828l = C15828l.f49033a;
            Object[] objArr = new Object[]{Integer.valueOf(num)};
            num = String.format(a, Arrays.copyOf(objArr, objArr.length));
            C2668g.a(num, "java.lang.String.format(format, *args)");
            if (num != null) {
                num = (CharSequence) num;
                textView2.setText(num);
                textView = (TextView) m48618a(C6248a.placeRecsErrorText);
                C2668g.a(textView, "placeRecsErrorText");
                textView.setVisibility(0);
            }
        }
        num = au.a(this, R.string.error_trouble_connecting, new String[0]);
        textView2.setText(num);
        textView = (TextView) m48618a(C6248a.placeRecsErrorText);
        C2668g.a(textView, "placeRecsErrorText");
        textView.setVisibility(0);
    }

    public void hideRecsErrorText() {
        TextView textView = (TextView) m48618a(C6248a.placeRecsErrorText);
        C2668g.a(textView, "placeRecsErrorText");
        textView.setVisibility(8);
    }

    public void showErrorButton() {
        TextView textView = (TextView) m48618a(C6248a.seeRecsBtn);
        C2668g.a(textView, "seeRecsBtn");
        C10125a c10125a = C10125a.f33093a;
        Resources resources = getResources();
        C2668g.a(resources, "resources");
        textView.setBackground(c10125a.m41368c(0, resources));
        textView = (TextView) m48618a(C6248a.seeRecsBtn);
        C2668g.a(textView, "seeRecsBtn");
        textView.setText(au.a(this, R.string.places_try_again, new String[0]));
    }

    public void showNoVisitorButton() {
        TextView textView = (TextView) m48618a(C6248a.seeRecsBtn);
        C2668g.a(textView, "seeRecsBtn");
        C10125a c10125a = C10125a.f33093a;
        Resources resources = getResources();
        C2668g.a(resources, "resources");
        textView.setBackground(c10125a.m41368c(0, resources));
        textView = (TextView) m48618a(C6248a.seeRecsBtn);
        C2668g.a(textView, "seeRecsBtn");
        c10125a = C10125a.f33093a;
        resources = getResources();
        C2668g.a(resources, "resources");
        textView.setText(c10125a.m41366a(0, resources));
    }

    public void startShimmer() {
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) m48618a(C6248a.placeCardRecsShimmer);
        C2668g.a(shimmerFrameLayout, "placeCardRecsShimmer");
        shimmerFrameLayout.setBaseAlpha(0.1f);
        shimmerFrameLayout = (ShimmerFrameLayout) m48618a(C6248a.placeCardRecsShimmer);
        C2668g.a(shimmerFrameLayout, "placeCardRecsShimmer");
        shimmerFrameLayout.setDuration(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        shimmerFrameLayout = (ShimmerFrameLayout) m48618a(C6248a.placeCardRecsShimmer);
        C2668g.a(shimmerFrameLayout, "placeCardRecsShimmer");
        shimmerFrameLayout.setIntensity(0.0f);
        shimmerFrameLayout = (ShimmerFrameLayout) m48618a(C6248a.placeCardRecsShimmer);
        C2668g.a(shimmerFrameLayout, "placeCardRecsShimmer");
        shimmerFrameLayout.setDropoff(0.3f);
        ((ShimmerFrameLayout) m48618a(C6248a.placeCardRecsShimmer)).b();
        shimmerFrameLayout = (ShimmerFrameLayout) m48618a(C6248a.placeCardRecsShimmer);
        C2668g.a(shimmerFrameLayout, "placeCardRecsShimmer");
        shimmerFrameLayout.setVisibility(0);
    }

    public void stopShimmer() {
        ((ShimmerFrameLayout) m48618a(C6248a.placeCardRecsShimmer)).c();
    }

    public void dismissTooltipIfPresent() {
        Tooltip tooltip = this.f39865d;
        if (tooltip != null) {
            tooltip.dismiss();
        }
    }

    public void setAlpha(float f) {
        C10129c c10129c = this.f39863b;
        if (c10129c == null) {
            C2668g.b("presenter");
        }
        c10129c.m41420a(f);
    }

    /* renamed from: a */
    public final void m48621a(@NotNull C15424c c15424c) {
        C2668g.b(c15424c, "placeCardFrontViewModel");
        C10129c c10129c = this.f39863b;
        if (c10129c == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c10129c);
        c10129c = this.f39863b;
        if (c10129c == null) {
            C2668g.b("presenter");
        }
        c10129c.m41422a(c15424c);
    }

    public final void setFlipListener(@NotNull PlaceCardFlipListener placeCardFlipListener) {
        C2668g.b(placeCardFlipListener, "listener");
        this.f39864c = placeCardFlipListener;
    }

    /* renamed from: a */
    public final void m48620a(int i, int i2) {
        C10129c c10129c = this.f39863b;
        if (c10129c == null) {
            C2668g.b("presenter");
        }
        c10129c.m41421a(i, i2);
    }

    /* renamed from: a */
    public final void m48619a() {
        C10129c c10129c = this.f39863b;
        if (c10129c == null) {
            C2668g.b("presenter");
        }
        c10129c.m41427c();
    }

    /* renamed from: a */
    public final void m48622a(@NotNull List<String> list) {
        C2668g.b(list, "teasers");
        C10129c c10129c = this.f39863b;
        if (c10129c == null) {
            C2668g.b("presenter");
        }
        c10129c.m41424a((List) list);
    }

    /* renamed from: a */
    public final void m48623a(boolean z) {
        C10129c c10129c = this.f39863b;
        if (c10129c == null) {
            C2668g.b("presenter");
        }
        c10129c.m41425a(z);
    }

    public final void setRecsErrorState(@Nullable Integer num) {
        C10129c c10129c = this.f39863b;
        if (c10129c == null) {
            C2668g.b("presenter");
        }
        c10129c.m41423a(num);
    }

    /* renamed from: b */
    public final void m48624b() {
        C10129c c10129c = this.f39863b;
        if (c10129c == null) {
            C2668g.b("presenter");
        }
        c10129c.m41428d();
    }

    public final void setGoBackListener(@NotNull Function0<C15813i> function0) {
        C2668g.b(function0, "listener");
        ((ImageView) m48618a(C6248a.goToBack)).setOnClickListener(new C10149a(function0));
    }

    /* renamed from: c */
    public final void m48625c() {
        Deadshot.drop(this);
    }

    @NotNull
    public final PlacesConfigExpansion getExpansionConfig() {
        Companion companion = Size.Companion;
        CardView cardView = (CardView) m48618a(C6248a.cardViewFront);
        C2668g.a(cardView, "cardViewFront");
        ConstraintLayout constraintLayout = (ConstraintLayout) cardView.findViewById(C6248a.cardContainer);
        C2668g.a(constraintLayout, "cardViewFront.cardContainer");
        Size absoluteSize = companion.getAbsoluteSize(constraintLayout);
        companion = Size.Companion;
        PlaceRecTeasersView placeRecTeasersView = (PlaceRecTeasersView) m48618a(C6248a.recsView);
        C2668g.a(placeRecTeasersView, "recsView");
        Size absoluteSize2 = companion.getAbsoluteSize(placeRecTeasersView);
        companion = Size.Companion;
        TextView textView = (TextView) m48618a(C6248a.titleTextView);
        C2668g.a(textView, "titleTextView");
        Size absoluteSize3 = companion.getAbsoluteSize(textView);
        TextView textView2 = (TextView) m48618a(C6248a.titleTextView);
        C2668g.a(textView2, "titleTextView");
        float textSize = textView2.getTextSize();
        Companion companion2 = Size.Companion;
        CustomTextView customTextView = (CustomTextView) m48618a(C6248a.introPlaceTextView);
        C2668g.a(customTextView, "introPlaceTextView");
        return new PlacesConfigExpansion(absoluteSize, absoluteSize3, companion2.getAbsoluteSize(customTextView), absoluteSize2, Float.valueOf(textSize));
    }

    /* renamed from: d */
    public final void m48626d() {
        C10129c c10129c = this.f39863b;
        if (c10129c == null) {
            C2668g.b("presenter");
        }
        c10129c.m41429e();
    }

    public void showTutorialTooltip() {
        if (!ViewCompat.z(this) || isLayoutRequested()) {
            addOnLayoutChangeListener(new C10151b(this));
            return;
        }
        View view = this;
        Context context = getContext();
        C2668g.a(context, "context");
        this.f39865d = new C19463a(context, (ImageView) m48618a(C6248a.goToBack)).a(au.a(this, R.string.places_card_tooltip_tutorial, new String[0])).a(AnchorGravity.TOP).a(new int[]{au.c(this, R.color.gradient_red), au.c(this, R.color.gradient_orange)}).a(false).a();
        Tooltip a = this.f39865d;
        if (a != null) {
            a.setOnDismissListener(new C10152c(this));
        }
        a = this.f39865d;
        if (a != null) {
            a.show();
        }
    }
}
