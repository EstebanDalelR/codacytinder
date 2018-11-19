package com.tinder.places.onboarding;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.C4081d;
import com.bumptech.glide.load.Transformation;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.common.p192e.p193a.C10659a;
import com.tinder.common.p192e.p193a.C10659a.C8531a;
import com.tinder.domain.places.model.PlacesOnboardingConfig.OnboardingRec;
import com.tinder.views.CustomTextView;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.ak;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001 B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0006H\u0002J\u0016\u0010\u0012\u001a\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0002J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J \u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001f\u001a\u00020\u000fH\u0002R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/tinder/places/onboarding/PlacesOnboardingChatView;", "Landroid/support/constraint/ConstraintLayout;", "Lcom/tinder/places/onboarding/Transitionable;", "context", "Landroid/content/Context;", "title", "", "rec", "Lcom/tinder/domain/places/model/PlacesOnboardingConfig$OnboardingRec;", "messages", "", "(Landroid/content/Context;Ljava/lang/String;Lcom/tinder/domain/places/model/PlacesOnboardingConfig$OnboardingRec;Ljava/util/List;)V", "firstEntrance", "", "applyShadows", "", "bindImages", "url", "bindMessages", "cancelAnimations", "enter", "position", "", "exit", "getPopInAnimator", "Landroid/animation/Animator;", "view", "Landroid/view/View;", "popFrom", "Lcom/tinder/places/onboarding/PlacesOnboardingChatView$PopFrom;", "popIn", "startChatAnimation", "PopFrom", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PlacesOnboardingChatView extends ConstraintLayout implements Transitionable {
    /* renamed from: a */
    private boolean f40020a = true;
    /* renamed from: b */
    private HashMap f40021b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/places/onboarding/PlacesOnboardingChatView$PopFrom;", "", "(Ljava/lang/String;I)V", "LEFT", "RIGHT", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    private enum PopFrom {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/tinder/places/onboarding/PlacesOnboardingChatView$getPopInAnimator$1$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.onboarding.PlacesOnboardingChatView$a */
    static final class C10250a implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ PlacesOnboardingChatView f33366a;
        /* renamed from: b */
        final /* synthetic */ View f33367b;
        /* renamed from: c */
        final /* synthetic */ PopFrom f33368c;

        C10250a(PlacesOnboardingChatView placesOnboardingChatView, View view, PopFrom popFrom) {
            this.f33366a = placesOnboardingChatView;
            this.f33367b = view;
            this.f33368c = popFrom;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            PlacesOnboardingChatView placesOnboardingChatView = this.f33366a;
            View view = this.f33367b;
            C2668g.a(valueAnimator, "it");
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            placesOnboardingChatView.m48798a(view, ((Float) valueAnimator).floatValue(), this.f33368c);
        }
    }

    /* renamed from: a */
    public View m48803a(int i) {
        if (this.f40021b == null) {
            this.f40021b = new HashMap();
        }
        View view = (View) this.f40021b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f40021b.put(Integer.valueOf(i), view);
        return view;
    }

    public void cancelAnimations() {
    }

    public PlacesOnboardingChatView(@NotNull Context context, @NotNull String str, @NotNull OnboardingRec onboardingRec, @NotNull List<String> list) {
        C2668g.b(context, "context");
        C2668g.b(str, ManagerWebServices.PARAM_JOB_TITLE);
        C2668g.b(onboardingRec, "rec");
        C2668g.b(list, ManagerWebServices.PARAM_MESSAGES);
        super(context);
        ConstraintLayout.inflate(context, R.layout.view_places_onboarding_chat, this);
        TextView textView = (TextView) m48803a(C6248a.titleText);
        C2668g.a(textView, "titleText");
        textView.setText(str);
        m48802b();
        m48801a((List) list);
        m48800a(onboardingRec.getImageUrl());
    }

    public void enter(float f) {
        ImageView imageView = (ImageView) m48803a(C6248a.chatImage1);
        C2668g.a(imageView, "chatImage1");
        imageView.setAlpha(f);
        CustomTextView customTextView = (CustomTextView) m48803a(C6248a.chatMessage1);
        C2668g.a(customTextView, "chatMessage1");
        m48798a(customTextView, f, PopFrom.LEFT);
        if (f == 1.0f) {
            m48797a();
        }
    }

    public void exit(float f) {
        ImageView imageView = (ImageView) m48803a(C6248a.onboardingMapImageBlur);
        C2668g.a(imageView, "onboardingMapImageBlur");
        imageView.setAlpha(Math.max(0.0f, ((float) 1) - (((float) 2) * f)));
    }

    /* renamed from: a */
    private final void m48797a() {
        if (this.f40020a) {
            this.f40020a = false;
            CustomTextView customTextView = (CustomTextView) m48803a(C6248a.chatMessage2);
            C2668g.a(customTextView, "chatMessage2");
            Animator a = m48796a(customTextView, PopFrom.RIGHT);
            AnimatorSet animatorSet = new AnimatorSet();
            Animator[] animatorArr = new Animator[2];
            CustomTextView customTextView2 = (CustomTextView) m48803a(C6248a.chatMessage3);
            C2668g.a(customTextView2, "chatMessage3");
            animatorArr[0] = m48796a(customTextView2, PopFrom.LEFT);
            ImageView imageView = (ImageView) m48803a(C6248a.chatImage3);
            C2668g.a(imageView, "chatImage3");
            animatorArr[1] = m48796a(imageView, PopFrom.LEFT);
            animatorSet.playTogether(animatorArr);
            FrameLayout frameLayout = (FrameLayout) m48803a(C6248a.chatMessage4);
            C2668g.a(frameLayout, "chatMessage4");
            Animator a2 = m48796a(frameLayout, PopFrom.LEFT);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playSequentially(new Animator[]{a, animatorSet, a2});
            animatorSet2.start();
        }
    }

    /* renamed from: b */
    private final void m48802b() {
        for (View i : ak.a(new View[]{(CustomTextView) m48803a(C6248a.chatMessage1), (CustomTextView) m48803a(C6248a.chatMessage2), (CustomTextView) m48803a(C6248a.chatMessage3), (FrameLayout) m48803a(C6248a.chatMessage4), (ImageView) m48803a(C6248a.chatImage1), (ImageView) m48803a(C6248a.chatImage3)})) {
            ViewCompat.i(i, 2.0f);
        }
    }

    /* renamed from: a */
    private final void m48801a(List<String> list) {
        CustomTextView customTextView = (CustomTextView) m48803a(C6248a.chatMessage1);
        C2668g.a(customTextView, "chatMessage1");
        customTextView.setText((CharSequence) list.get(0));
        customTextView = (CustomTextView) m48803a(C6248a.chatMessage2);
        C2668g.a(customTextView, "chatMessage2");
        customTextView.setText((CharSequence) list.get(1));
        customTextView = (CustomTextView) m48803a(C6248a.chatMessage3);
        C2668g.a(customTextView, "chatMessage3");
        customTextView.setText((CharSequence) list.get(2));
    }

    /* renamed from: a */
    private final void m48800a(String str) {
        C10659a b = new C8531a(getContext()).m36498a(-1).m36497a(10.0f).m36499b();
        C4081d a = C0994i.b(getContext()).a(str);
        Transformation[] transformationArr = new Transformation[1];
        transformationArr[0] = b;
        a.a(transformationArr).a((ImageView) m48803a(C6248a.chatImage1));
        C0994i.b(getContext()).a(str).a(new Transformation[]{r0}).a((ImageView) m48803a(C6248a.chatImage3));
    }

    /* renamed from: a */
    private final void m48798a(View view, float f, PopFrom popFrom) {
        float width = ((float) (view.getWidth() / 3)) * (((float) 1) - f);
        if (popFrom == PopFrom.LEFT) {
            width = -width;
        }
        view.setAlpha(f);
        view.setScaleX(f);
        view.setScaleY(f);
        view.setTranslationX(width);
    }

    /* renamed from: a */
    private final Animator m48796a(View view, PopFrom popFrom) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setStartDelay(500);
        ofFloat.addUpdateListener(new C10250a(this, view, popFrom));
        C2668g.a(ofFloat, "ValueAnimator.ofFloat(0.…)\n            }\n        }");
        return ofFloat;
    }
}
