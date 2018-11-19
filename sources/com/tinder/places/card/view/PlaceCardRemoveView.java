package com.tinder.places.card.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.ColorDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.C0432b;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
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

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\u000e\u001a\u00020\nH\u0014J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/tinder/places/card/view/PlaceCardRemoveView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "fadeAnimatorSet", "Landroid/animation/AnimatorSet;", "fadeIn", "", "duration", "", "fadeOut", "onDetachedFromWindow", "setDividerBackgrounds", "color", "", "showLoadingState", "visible", "", "viewsToFade", "", "Landroid/view/View;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PlaceCardRemoveView extends FrameLayout {
    /* renamed from: a */
    private AnimatorSet f33159a;
    /* renamed from: b */
    private HashMap f33160b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.PlaceCardRemoveView$1 */
    static final class C101531 implements OnClickListener {
        /* renamed from: a */
        public static final C101531 f33157a = new C101531();

        C101531() {
        }

        public final void onClick(View view) {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/places/card/view/PlaceCardRemoveView$fadeOut$1", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/places/card/view/PlaceCardRemoveView;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.PlaceCardRemoveView$b */
    public static final class C10154b extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ PlaceCardRemoveView f33158a;

        C10154b(PlaceCardRemoveView placeCardRemoveView) {
            this.f33158a = placeCardRemoveView;
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            this.f33158a.setVisibility(8);
            this.f33158a.setAlpha(1.0f);
            this.f33158a.f33159a = (AnimatorSet) null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/places/card/view/PlaceCardRemoveView$fadeIn$1", "Lcom/tinder/utils/SimpleAnimatorListener;", "(Lcom/tinder/places/card/view/PlaceCardRemoveView;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.PlaceCardRemoveView$a */
    public static final class C12312a extends an {
        /* renamed from: a */
        final /* synthetic */ PlaceCardRemoveView f39868a;

        C12312a(PlaceCardRemoveView placeCardRemoveView) {
            this.f39868a = placeCardRemoveView;
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            this.f39868a.f33159a = (AnimatorSet) null;
        }
    }

    /* renamed from: a */
    public View m41454a(int i) {
        if (this.f33160b == null) {
            this.f33160b = new HashMap();
        }
        View view = (View) this.f33160b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f33160b.put(Integer.valueOf(i), view);
        return view;
    }

    public PlaceCardRemoveView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        attributeSet = context.getSystemService("layout_inflater");
        if (attributeSet == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
        }
        ((LayoutInflater) attributeSet).inflate(R.layout.view_place_card_remove_location, this, true);
        setOnClickListener((OnClickListener) C101531.f33157a);
        ProgressBar progressBar = (ProgressBar) m41454a(C6248a.loadingSpinner);
        C2668g.a(progressBar, "loadingSpinner");
        progressBar.getIndeterminateDrawable().setColorFilter(C0432b.c(context, R.color.white), Mode.SRC_ATOP);
        attributeSet = context.getResources().getColor(R.color.places_translucent);
        context = context.getResources().getColor(R.color.places_translucent_more);
        ((CustomTextView) m41454a(C6248a.titleTextViewRemove)).setTextColor(-1);
        ((Button) m41454a(C6248a.goToBackFromRemove)).setTextColor(attributeSet);
        setDividerBackgrounds(context);
    }

    /* renamed from: a */
    public final void m41455a(long j) {
        AnimatorSet animatorSet = this.f33159a;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f33159a = new AnimatorSet();
        setVisibility(0);
        List a = m41452a();
        Iterable<View> iterable = a;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (View ofFloat : iterable) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ofFloat, "alpha", new float[]{0.0f, 1.0f});
            C2668g.a(ofFloat2, "fadeAnimation");
            ofFloat2.setDuration(j);
            arrayList.add(ofFloat2);
        }
        List list = (List) arrayList;
        ((ObjectAnimator) list.get(C19301m.a(a))).addListener(new C12312a(this));
        j = this.f33159a;
        if (j != null) {
            j.playTogether(list);
        }
        j = this.f33159a;
        if (j != null) {
            j.start();
        }
    }

    /* renamed from: b */
    public final void m41457b(long j) {
        AnimatorSet animatorSet = this.f33159a;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f33159a = new AnimatorSet();
        Iterable<View> a = m41452a();
        Collection arrayList = new ArrayList(C19301m.a(a, 10));
        for (View ofFloat : a) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ofFloat, "alpha", new float[]{1.0f, 0.0f});
            C2668g.a(ofFloat2, "fadeAnimation");
            ofFloat2.setDuration(j);
            arrayList.add(ofFloat2);
        }
        List list = (List) arrayList;
        j = this.f33159a;
        if (j != null) {
            j.addListener(new C10154b(this));
        }
        j = this.f33159a;
        if (j != null) {
            j.playTogether(list);
        }
        j = this.f33159a;
        if (j != null) {
            j.start();
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f33159a;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* renamed from: a */
    private final List<View> m41452a() {
        return C19301m.b(new View[]{(Button) m41454a(C6248a.goToBackFromRemove), m41454a(C6248a.cardRemoveDivider), (CustomButton) m41454a(C6248a.justThisOnceBtn), m41454a(C6248a.cardRemoveDivider2), (CustomButton) m41454a(C6248a.neverShowMeHereBtn)});
    }

    private final void setDividerBackgrounds(int i) {
        View a = m41454a(C6248a.cardRemoveDivider);
        C2668g.a(a, "cardRemoveDivider");
        a.setBackground(new ColorDrawable(i));
        a = m41454a(C6248a.cardRemoveDivider2);
        C2668g.a(a, "cardRemoveDivider2");
        a.setBackground(new ColorDrawable(i));
    }

    /* renamed from: a */
    public final void m41456a(boolean z) {
        if (z) {
            ConstraintLayout constraintLayout = (ConstraintLayout) m41454a(C6248a.cardContainerRemove);
            C2668g.a(constraintLayout, "cardContainerRemove");
            constraintLayout.setVisibility(8);
            ProgressBar progressBar = (ProgressBar) m41454a(C6248a.loadingSpinner);
            C2668g.a(progressBar, "loadingSpinner");
            progressBar.setVisibility(0);
            return;
        }
        progressBar = (ProgressBar) m41454a(C6248a.loadingSpinner);
        C2668g.a(progressBar, "loadingSpinner");
        progressBar.setVisibility(8);
        constraintLayout = (ConstraintLayout) m41454a(C6248a.cardContainerRemove);
        C2668g.a(constraintLayout, "cardContainerRemove");
        constraintLayout.setVisibility(0);
    }
}
