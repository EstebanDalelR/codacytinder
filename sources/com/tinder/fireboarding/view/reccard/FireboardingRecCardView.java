package com.tinder.fireboarding.view.reccard;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout.LayoutParams;
import com.tinder.cardstack.model.C8395a;
import com.tinder.cardstack.view.CardCollectionLayout;
import com.tinder.cardstack.view.CardStackLayout;
import com.tinder.cardstack.view.CardStackLayout.OnCardPairStateChangeListener;
import com.tinder.fireboarding.C9559a.C9553b;
import com.tinder.fireboarding.C9559a.C9555d;
import com.tinder.fireboarding.C9559a.C9556e;
import com.tinder.fireboarding.domain.C11803i;
import com.tinder.fireboarding.domain.Level;
import com.tinder.fireboarding.view.C9571a;
import com.tinder.fireboarding.view.C9617b;
import com.tinder.fireboarding.view.p256b.C9616a;
import com.tinder.fireboarding.view.reccard.CardAtTopOfCardStackDetector.OnCardAtTopOfCardStackCallback;
import com.tinder.recs.view.RecCardView;
import com.tinder.utils.au;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressLint({"ViewConstructor"})
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003=>?B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u0002H\u0016J\b\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020)H\u0014J\u0010\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020!H\u0016J\u0010\u0010.\u001a\u00020!2\u0006\u0010+\u001a\u00020,H\u0016J\u0018\u0010/\u001a\u00020!2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000201H\u0014J\u0010\u00103\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u0002H\u0016J\b\u00104\u001a\u00020!H\u0002J\u0010\u00105\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u0002H\u0016J(\u00106\u001a\u00020!2\u0006\u00107\u001a\u0002012\u0006\u00108\u001a\u0002012\u0006\u00109\u001a\u0002012\u0006\u0010:\u001a\u000201H\u0014J\b\u0010;\u001a\u00020!H\u0002J\u0018\u0010<\u001a\u00020!2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0002X.¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/tinder/fireboarding/view/reccard/FireboardingRecCardView;", "Lcom/tinder/recs/view/RecCardView;", "Lcom/tinder/fireboarding/view/reccard/FireboardingRecCard;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "fireboardingLevelIconViewFactory", "Lcom/tinder/fireboarding/view/reccard/FireboardingLevelIconViewFactory;", "(Landroid/content/Context;Landroid/util/AttributeSet;Lcom/tinder/fireboarding/view/reccard/FireboardingLevelIconViewFactory;)V", "backgroundView", "Landroid/view/View;", "getBackgroundView", "()Landroid/view/View;", "backgroundView$delegate", "Lkotlin/Lazy;", "cardAtTopOfCardStackDetector", "Lcom/tinder/fireboarding/view/reccard/CardAtTopOfCardStackDetector;", "iconView", "onCardPairStateChangeListener", "Lcom/tinder/cardstack/view/CardStackLayout$OnCardPairStateChangeListener;", "onFireboardingRecCardViewListener", "Lcom/tinder/fireboarding/view/reccard/FireboardingRecCardView$OnFireboardingRecCardViewListener;", "getOnFireboardingRecCardViewListener", "()Lcom/tinder/fireboarding/view/reccard/FireboardingRecCardView$OnFireboardingRecCardViewListener;", "setOnFireboardingRecCardViewListener", "(Lcom/tinder/fireboarding/view/reccard/FireboardingRecCardView$OnFireboardingRecCardViewListener;)V", "optimalIconSize", "", "raysDrawable", "Lcom/tinder/fireboarding/view/drawable/RaysDrawableWrapper;", "recCard", "addNewIconView", "", "level", "Lcom/tinder/fireboarding/domain/Level;", "bind", "createRecCardViewParams", "Lcom/tinder/fireboarding/view/reccard/FireboardingRecCardView$RecCardViewParams;", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "onAttachedToCardCollectionLayout", "cardCollectionLayout", "Lcom/tinder/cardstack/view/CardCollectionLayout;", "onCardViewRecycled", "onDetachedFromCardCollectionLayout", "onMeasure", "widthMeasureSpec", "", "heightMeasureSpec", "onMovedToTop", "onReadyForEntranceAnimation", "onRemovedFromTop", "onSizeChanged", "w", "h", "oldw", "oldh", "removeCurrentIconView", "scaleIconViewToMatchOptimalSize", "OnFireboardingRecCardViewListener", "PairStateChangeListener", "RecCardViewParams", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
public final class FireboardingRecCardView extends RecCardView<C11839a> {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f42167a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(FireboardingRecCardView.class), "backgroundView", "getBackgroundView()Landroid/view/View;"))};
    /* renamed from: b */
    private final C9616a f42168b;
    /* renamed from: c */
    private final Lazy f42169c;
    /* renamed from: d */
    private OnCardPairStateChangeListener f42170d;
    @Nullable
    /* renamed from: e */
    private OnFireboardingRecCardViewListener f42171e;
    /* renamed from: f */
    private C11839a f42172f;
    /* renamed from: g */
    private View f42173g;
    /* renamed from: h */
    private float f42174h;
    /* renamed from: i */
    private final CardAtTopOfCardStackDetector f42175i;
    /* renamed from: j */
    private final FireboardingLevelIconViewFactory f42176j;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/fireboarding/view/reccard/FireboardingRecCardView$OnFireboardingRecCardViewListener;", "", "onFireboardingRecCardViewMovedToTop", "", "onFireboardingRecCardViewReadyForAnimation", "recCardViewParams", "Lcom/tinder/fireboarding/view/reccard/FireboardingRecCardView$RecCardViewParams;", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
    public interface OnFireboardingRecCardViewListener {
        void onFireboardingRecCardViewMovedToTop();

        void onFireboardingRecCardViewReadyForAnimation(@NotNull C9619b c9619b);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003J;\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\tHÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/tinder/fireboarding/view/reccard/FireboardingRecCardView$RecCardViewParams;", "", "cardViewBounds", "Lcom/tinder/fireboarding/view/ViewBounds;", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "iconView", "Landroid/view/View;", "iconSize", "", "level", "Lcom/tinder/fireboarding/domain/Level;", "(Lcom/tinder/fireboarding/view/ViewBounds;Landroid/graphics/drawable/GradientDrawable;Landroid/view/View;ILcom/tinder/fireboarding/domain/Level;)V", "getBackgroundDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "getCardViewBounds", "()Lcom/tinder/fireboarding/view/ViewBounds;", "getIconSize", "()I", "getIconView", "()Landroid/view/View;", "getLevel", "()Lcom/tinder/fireboarding/domain/Level;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.reccard.FireboardingRecCardView$b */
    public static final class C9619b {
        @NotNull
        /* renamed from: a */
        private final C9571a f32134a;
        @NotNull
        /* renamed from: b */
        private final GradientDrawable f32135b;
        @NotNull
        /* renamed from: c */
        private final View f32136c;
        /* renamed from: d */
        private final int f32137d;
        @NotNull
        /* renamed from: e */
        private final Level f32138e;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C9619b) {
                C9619b c9619b = (C9619b) obj;
                if (C2668g.a(this.f32134a, c9619b.f32134a) && C2668g.a(this.f32135b, c9619b.f32135b) && C2668g.a(this.f32136c, c9619b.f32136c)) {
                    return (this.f32137d == c9619b.f32137d ? 1 : null) != null && C2668g.a(this.f32138e, c9619b.f32138e);
                }
            }
        }

        public int hashCode() {
            C9571a c9571a = this.f32134a;
            int i = 0;
            int hashCode = (c9571a != null ? c9571a.hashCode() : 0) * 31;
            GradientDrawable gradientDrawable = this.f32135b;
            hashCode = (hashCode + (gradientDrawable != null ? gradientDrawable.hashCode() : 0)) * 31;
            View view = this.f32136c;
            hashCode = (((hashCode + (view != null ? view.hashCode() : 0)) * 31) + this.f32137d) * 31;
            Level level = this.f32138e;
            if (level != null) {
                i = level.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("RecCardViewParams(cardViewBounds=");
            stringBuilder.append(this.f32134a);
            stringBuilder.append(", backgroundDrawable=");
            stringBuilder.append(this.f32135b);
            stringBuilder.append(", iconView=");
            stringBuilder.append(this.f32136c);
            stringBuilder.append(", iconSize=");
            stringBuilder.append(this.f32137d);
            stringBuilder.append(", level=");
            stringBuilder.append(this.f32138e);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C9619b(@NotNull C9571a c9571a, @NotNull GradientDrawable gradientDrawable, @NotNull View view, int i, @NotNull Level level) {
            C2668g.b(c9571a, "cardViewBounds");
            C2668g.b(gradientDrawable, "backgroundDrawable");
            C2668g.b(view, "iconView");
            C2668g.b(level, "level");
            this.f32134a = c9571a;
            this.f32135b = gradientDrawable;
            this.f32136c = view;
            this.f32137d = i;
            this.f32138e = level;
        }

        @NotNull
        /* renamed from: a */
        public final C9571a m40024a() {
            return this.f32134a;
        }

        @NotNull
        /* renamed from: b */
        public final GradientDrawable m40025b() {
            return this.f32135b;
        }

        @NotNull
        /* renamed from: c */
        public final View m40026c() {
            return this.f32136c;
        }

        /* renamed from: d */
        public final int m40027d() {
            return this.f32137d;
        }

        @NotNull
        /* renamed from: e */
        public final Level m40028e() {
            return this.f32138e;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0002J\u001c\u0010\t\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0016J\u001c\u0010\u000b\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/fireboarding/view/reccard/FireboardingRecCardView$PairStateChangeListener;", "Lcom/tinder/cardstack/view/CardStackLayout$OnCardPairStateChangeListener;", "(Lcom/tinder/fireboarding/view/reccard/FireboardingRecCardView;)V", "cardAbove", "Landroid/view/View;", "isValidPairForCurrentCard", "", "lowerCard", "higherCard", "onPairCreated", "", "onPairDestroyed", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.reccard.FireboardingRecCardView$a */
    public final class C11837a implements OnCardPairStateChangeListener {
        /* renamed from: a */
        final /* synthetic */ FireboardingRecCardView f38582a;
        /* renamed from: b */
        private View f38583b;

        public C11837a(FireboardingRecCardView fireboardingRecCardView) {
            this.f38582a = fireboardingRecCardView;
        }

        public void onPairCreated(@Nullable View view, @Nullable View view2) {
            if (C2668g.a(view2, this.f38582a) != null) {
                this.f38583b = view;
                this.f38582a.f42175i.m40021c();
            }
        }

        public void onPairDestroyed(@Nullable View view, @Nullable View view2) {
            if (this.f38583b != null && m47740a(view2, view, this.f38583b) != null) {
                this.f38583b = null;
                this.f38582a.f42175i.m40022d();
            }
        }

        /* renamed from: a */
        private final boolean m47740a(View view, View view2, View view3) {
            return (C2668g.a(view, this.f38582a) == null || C2668g.a(view2, view3) == null) ? null : true;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/tinder/fireboarding/view/reccard/FireboardingRecCardView$cardAtTopOfCardStackDetector$1", "Lcom/tinder/fireboarding/view/reccard/CardAtTopOfCardStackDetector$OnCardAtTopOfCardStackCallback;", "(Lcom/tinder/fireboarding/view/reccard/FireboardingRecCardView;)V", "onCardAtTopOfCardStack", "", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.reccard.FireboardingRecCardView$c */
    public static final class C11838c implements OnCardAtTopOfCardStackCallback {
        /* renamed from: a */
        final /* synthetic */ FireboardingRecCardView f38584a;

        C11838c(FireboardingRecCardView fireboardingRecCardView) {
            this.f38584a = fireboardingRecCardView;
        }

        public void onCardAtTopOfCardStack() {
            this.f38584a.m51470a();
        }
    }

    private final View getBackgroundView() {
        Lazy lazy = this.f42169c;
        KProperty kProperty = f42167a[0];
        return (View) lazy.getValue();
    }

    public /* synthetic */ void bind(C8395a c8395a) {
        m51476a((C11839a) c8395a);
    }

    public /* synthetic */ void bind(Object obj) {
        m51476a((C11839a) obj);
    }

    public /* synthetic */ void onMovedToTop(C8395a c8395a) {
        m51477b((C11839a) c8395a);
    }

    public /* synthetic */ void onMovedToTop(Object obj) {
        m51477b((C11839a) obj);
    }

    public /* synthetic */ void onRemovedFromTop(C8395a c8395a) {
        m51478c((C11839a) c8395a);
    }

    public /* synthetic */ void onRemovedFromTop(Object obj) {
        m51478c((C11839a) obj);
    }

    public /* synthetic */ FireboardingRecCardView(Context context, AttributeSet attributeSet, FireboardingLevelIconViewFactory fireboardingLevelIconViewFactory, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet, fireboardingLevelIconViewFactory);
    }

    public FireboardingRecCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, @NotNull FireboardingLevelIconViewFactory fireboardingLevelIconViewFactory) {
        C2668g.b(context, "context");
        C2668g.b(fireboardingLevelIconViewFactory, "fireboardingLevelIconViewFactory");
        super(context, attributeSet);
        this.f42176j = fireboardingLevelIconViewFactory;
        this.f42168b = new C9616a(au.b(this, C9553b.fireboarding_rays));
        this.f42169c = C18451c.a(LazyThreadSafetyMode.NONE, new FireboardingRecCardView$$special$$inlined$bindView$1(this, C9555d.fireboarding_rec_card_background));
        this.f42175i = new CardAtTopOfCardStackDetector((OnCardAtTopOfCardStackCallback) new C11838c(this), null, 2, null);
        CardView.inflate(context, C9556e.view_fireboarding_rec_card, this);
    }

    @Nullable
    public final OnFireboardingRecCardViewListener getOnFireboardingRecCardViewListener() {
        return this.f42171e;
    }

    public final void setOnFireboardingRecCardViewListener(@Nullable OnFireboardingRecCardViewListener onFireboardingRecCardViewListener) {
        this.f42171e = onFireboardingRecCardViewListener;
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f42174h = ((float) Math.min(MeasureSpec.getSize(i), MeasureSpec.getSize(i2))) * 1050253722;
        i = this.f42173g;
        if (i != 0) {
            m51471a(i, this.f42174h);
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f42168b.setBounds(0, 0, i, i2);
    }

    protected void dispatchDraw(@NotNull Canvas canvas) {
        C2668g.b(canvas, "canvas");
        super.dispatchDraw(canvas);
        this.f42168b.draw(canvas);
    }

    /* renamed from: a */
    public void m51476a(@NotNull C11839a c11839a) {
        C2668g.b(c11839a, "recCard");
        super.bind(c11839a);
        this.f42172f = c11839a;
        getBackgroundView().setBackground(au.b(this, c11839a.m47741a()));
        m51473b();
        m51472a(((C11803i) c11839a.getItem()).m47720c());
    }

    public void onCardViewRecycled() {
        super.onCardViewRecycled();
        this.f42175i.m40023e();
    }

    /* renamed from: b */
    public void m51477b(@NotNull C11839a c11839a) {
        C2668g.b(c11839a, "recCard");
        super.onMovedToTop(c11839a);
        c11839a = this.f42171e;
        if (c11839a != null) {
            c11839a.onFireboardingRecCardViewMovedToTop();
        }
        this.f42175i.m40019a();
    }

    /* renamed from: c */
    public void m51478c(@NotNull C11839a c11839a) {
        C2668g.b(c11839a, "recCard");
        super.onRemovedFromTop(c11839a);
        this.f42175i.m40020b();
    }

    public void onAttachedToCardCollectionLayout(@NotNull CardCollectionLayout cardCollectionLayout) {
        C2668g.b(cardCollectionLayout, "cardCollectionLayout");
        super.onAttachedToCardCollectionLayout(cardCollectionLayout);
        if ((cardCollectionLayout instanceof CardStackLayout) && this.f42170d == null) {
            OnCardPairStateChangeListener c11837a = new C11837a(this);
            this.f42170d = c11837a;
            ((CardStackLayout) cardCollectionLayout).m54032a(c11837a);
        }
    }

    public void onDetachedFromCardCollectionLayout(@NotNull CardCollectionLayout cardCollectionLayout) {
        C2668g.b(cardCollectionLayout, "cardCollectionLayout");
        super.onDetachedFromCardCollectionLayout(cardCollectionLayout);
        if (cardCollectionLayout instanceof CardStackLayout) {
            OnCardPairStateChangeListener onCardPairStateChangeListener = this.f42170d;
            if (onCardPairStateChangeListener != null) {
                ((CardStackLayout) cardCollectionLayout).m54037b(onCardPairStateChangeListener);
            }
            this.f42170d = (OnCardPairStateChangeListener) null;
        }
    }

    /* renamed from: a */
    private final void m51470a() {
        OnFireboardingRecCardViewListener onFireboardingRecCardViewListener = this.f42171e;
        if (onFireboardingRecCardViewListener != null) {
            onFireboardingRecCardViewListener.onFireboardingRecCardViewReadyForAnimation(m51475c());
        }
    }

    /* renamed from: a */
    private final void m51471a(View view, float f) {
        float measuredWidth = (float) view.getMeasuredWidth();
        f /= measuredWidth;
        measuredWidth /= (float) 2;
        view.setPivotX(measuredWidth);
        view.setPivotY(measuredWidth);
        view.setScaleX(f);
        view.setScaleY(f);
    }

    /* renamed from: b */
    private final void m51473b() {
        View view = this.f42173g;
        if (view != null) {
            removeView(view);
        }
    }

    /* renamed from: a */
    private final void m51472a(Level level) {
        FireboardingLevelIconViewFactory fireboardingLevelIconViewFactory = this.f42176j;
        Context context = getContext();
        C2668g.a(context, "context");
        level = fireboardingLevelIconViewFactory.create(context, level);
        level.setLayoutParams(new LayoutParams(-2, -2, 17));
        this.f42173g = level;
        addView(level);
    }

    /* renamed from: c */
    private final C9619b m51475c() {
        C9571a a = C9617b.m40012a((View) this);
        C11839a c11839a = this.f42172f;
        if (c11839a == null) {
            C2668g.b("recCard");
        }
        Drawable b = au.b(this, c11839a.m47741a());
        if (b == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        }
        GradientDrawable gradientDrawable = (GradientDrawable) b;
        FireboardingLevelIconViewFactory fireboardingLevelIconViewFactory = this.f42176j;
        Context context = getContext();
        C2668g.a(context, "context");
        C11839a c11839a2 = this.f42172f;
        if (c11839a2 == null) {
            C2668g.b("recCard");
        }
        View create = fireboardingLevelIconViewFactory.create(context, ((C11803i) c11839a2.getItem()).m47720c());
        int i = (int) this.f42174h;
        c11839a = this.f42172f;
        if (c11839a == null) {
            C2668g.b("recCard");
        }
        return new C9619b(a, gradientDrawable, create, i, ((C11803i) c11839a.getItem()).m47720c());
    }
}
