package com.tinder.places.card.view;

import android.animation.Animator;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tinder.C6250b.C6248a;
import com.tinder.utils.an;
import com.tinder.views.CustomTextView;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/places/card/view/ShrinkListener;", "Lcom/tinder/utils/SimpleAnimatorListener;", "card", "Lcom/tinder/places/card/view/PlaceCardExpanded;", "carouselCard", "Lcom/tinder/places/card/view/PlaceCardView;", "(Lcom/tinder/places/card/view/PlaceCardExpanded;Lcom/tinder/places/card/view/PlaceCardView;)V", "getCard", "()Lcom/tinder/places/card/view/PlaceCardExpanded;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "onAnimationStart", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.card.view.o */
public final class C12324o extends an {
    @NotNull
    /* renamed from: a */
    private final C14184e f39894a;
    /* renamed from: b */
    private final PlaceCardView f39895b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.o$a */
    static final class C10188a implements OnClickListener {
        /* renamed from: a */
        public static final C10188a f33235a = new C10188a();

        C10188a() {
        }

        public final void onClick(View view) {
        }
    }

    public C12324o(@NotNull C14184e c14184e, @NotNull PlaceCardView placeCardView) {
        C2668g.b(c14184e, "card");
        C2668g.b(placeCardView, "carouselCard");
        this.f39894a = c14184e;
        this.f39895b = placeCardView;
    }

    public void onAnimationEnd(@Nullable Animator animator) {
        animator = this.f39894a.getParent();
        if (animator == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ((ViewGroup) animator).removeView(this.f39894a);
        this.f39895b.setVisibilityLocked(false);
        this.f39895b.setVisibility(0);
    }

    public void onAnimationStart(@Nullable Animator animator) {
        ((ImageView) this.f39894a.m53897a(C6248a.collapseCardExpanded)).setOnClickListener(C10188a.f33235a);
        ImageView imageView = (ImageView) this.f39894a.m53897a(C6248a.verticalEllipsesExpanded);
        C2668g.a(imageView, "card.verticalEllipsesExpanded");
        imageView.setVisibility(0);
        CustomTextView customTextView = (CustomTextView) this.f39894a.m53897a(C6248a.introPlaceTextExpanded);
        C2668g.a(customTextView, "card.introPlaceTextExpanded");
        customTextView.setVisibility(0);
        TextView textView = (TextView) this.f39894a.m53897a(C6248a.seeRecsExpanded);
        C2668g.a(textView, "card.seeRecsExpanded");
        textView.setVisibility(0);
        customTextView = (CustomTextView) this.f39894a.m53897a(C6248a.titleTextViewExpanded);
        C2668g.a(customTextView, "card.titleTextViewExpanded");
        if (customTextView.getVisibility() == 8) {
            customTextView = (CustomTextView) this.f39894a.m53897a(C6248a.titleTextViewExpanded);
            C2668g.a(customTextView, "card.titleTextViewExpanded");
            customTextView.setAlpha(0.0f);
            customTextView = (CustomTextView) this.f39894a.m53897a(C6248a.titleTextViewExpanded);
            C2668g.a(customTextView, "card.titleTextViewExpanded");
            customTextView.setVisibility(0);
            customTextView = (CustomTextView) this.f39894a.m53897a(C6248a.titleTextMini);
            C2668g.a(customTextView, "card.titleTextMini");
            customTextView.setVisibility(8);
        }
    }
}
