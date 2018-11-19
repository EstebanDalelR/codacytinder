package com.tinder.places.card.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.utils.an;
import com.tinder.views.CustomButton;
import com.tinder.views.CustomTextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000eJ\b\u0010\u0011\u001a\u00020\nH\u0014J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u000eH\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/tinder/places/card/view/PlaceCardBackView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "animatorSet", "Landroid/animation/AnimatorSet;", "fadeIn", "", "duration", "", "fromAlternatives", "", "fadeOut", "toAlternatives", "onDetachedFromWindow", "viewsToFade", "", "Landroid/view/View;", "shouldAddTitleView", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PlaceCardBackView extends FrameLayout {
    /* renamed from: a */
    private AnimatorSet f33151a;
    /* renamed from: b */
    private HashMap f33152b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.PlaceCardBackView$1 */
    static final class C101461 implements OnClickListener {
        /* renamed from: a */
        public static final C101461 f33148a = new C101461();

        C101461() {
        }

        public final void onClick(View view) {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/places/card/view/PlaceCardBackView$fadeOut$1", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/places/card/view/PlaceCardBackView;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.PlaceCardBackView$b */
    public static final class C10147b extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ PlaceCardBackView f33149a;

        C10147b(PlaceCardBackView placeCardBackView) {
            this.f33149a = placeCardBackView;
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            this.f33149a.setVisibility(8);
            this.f33149a.f33151a = (AnimatorSet) null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/places/card/view/PlaceCardBackView$fadeOut$animators$1$1", "Landroid/animation/AnimatorListenerAdapter;", "(Landroid/view/View;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.PlaceCardBackView$c */
    public static final class C10148c extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ View f33150a;

        C10148c(View view) {
            this.f33150a = view;
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            this.f33150a.setAlpha(1.0f);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/places/card/view/PlaceCardBackView$fadeIn$1", "Lcom/tinder/utils/SimpleAnimatorListener;", "(Lcom/tinder/places/card/view/PlaceCardBackView;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.PlaceCardBackView$a */
    public static final class C12311a extends an {
        /* renamed from: a */
        final /* synthetic */ PlaceCardBackView f39861a;

        C12311a(PlaceCardBackView placeCardBackView) {
            this.f39861a = placeCardBackView;
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            this.f39861a.f33151a = (AnimatorSet) null;
        }
    }

    /* renamed from: a */
    public View m41449a(int i) {
        if (this.f33152b == null) {
            this.f33152b = new HashMap();
        }
        View view = (View) this.f33152b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f33152b.put(Integer.valueOf(i), view);
        return view;
    }

    public PlaceCardBackView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        attributeSet = context.getSystemService("layout_inflater");
        if (attributeSet == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
        }
        ((LayoutInflater) attributeSet).inflate(R.layout.view_place_card_back, this, true);
        setOnClickListener((OnClickListener) C101461.f33148a);
        attributeSet = context.getResources().getColor(R.color.places_translucent);
        context = context.getResources().getColor(R.color.places_translucent_more);
        ((CustomTextView) m41449a(C6248a.titleTextViewBack)).setTextColor(-1);
        ((Button) m41449a(C6248a.goToFront)).setTextColor(attributeSet);
        attributeSet = m41449a(C6248a.cardBackDivider);
        C2668g.a(attributeSet, "cardBackDivider");
        attributeSet.setBackground(new ColorDrawable(context));
    }

    /* renamed from: a */
    public final void m41450a(long j, boolean z) {
        AnimatorSet animatorSet = this.f33151a;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f33151a = new AnimatorSet();
        Iterable<View> a = m41447a(z);
        Collection arrayList = new ArrayList(C19301m.a(a, 10));
        for (View view : a) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f});
            ofFloat.addListener(new C10148c(view));
            C2668g.a(ofFloat, "alphaAnimator");
            ofFloat.setDuration(j);
            arrayList.add(ofFloat);
        }
        List list = (List) arrayList;
        j = this.f33151a;
        if (j != null) {
            j.addListener(new C10147b(this));
        }
        j = this.f33151a;
        if (j != null) {
            j.playTogether(list);
        }
        j = this.f33151a;
        if (j != null) {
            j.start();
        }
    }

    /* renamed from: b */
    public final void m41451b(long j, boolean z) {
        AnimatorSet animatorSet = this.f33151a;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f33151a = new AnimatorSet();
        setVisibility(0);
        z = m41447a(z);
        Iterable<View> iterable = (Iterable) z;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (View view : iterable) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat((ConstraintLayout) m41449a(C6248a.cardContainerBack), "alpha", new float[]{0.0f, 1.0f});
            C2668g.a(ofFloat, "alphaAnimator");
            ofFloat.setDuration(j);
            arrayList.add(ofFloat);
        }
        List list = (List) arrayList;
        ((ObjectAnimator) list.get(C19301m.a(z))).addListener(new C12311a(this));
        j = this.f33151a;
        if (j != null) {
            j.playTogether(list);
        }
        j = this.f33151a;
        if (j != null) {
            j.start();
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f33151a;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* renamed from: a */
    private final List<View> m41447a(boolean z) {
        List c = C19301m.c(new View[]{(Button) m41449a(C6248a.goToFront), m41449a(C6248a.cardBackDivider), (CustomButton) m41449a(C6248a.removePlaceBtn), m41449a(C6248a.cardBackDivider2), (CustomButton) m41449a(C6248a.incorrectPlaceBtn)});
        if (z) {
            c.add((CustomTextView) m41449a(C6248a.titleTextViewBack));
        }
        return C19301m.l(c);
    }
}
