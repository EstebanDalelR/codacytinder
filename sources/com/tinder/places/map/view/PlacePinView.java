package com.tinder.places.map.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.C0432b;
import android.support.v4.graphics.drawable.C0450a;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.places.viewmodel.C14351c;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0001\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0006\u0010\u001c\u001a\u00020\u0012J\u0006\u0010\u001d\u001a\u00020\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/tinder/places/map/view/PlacePinView;", "Landroid/support/constraint/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bounceAnimator", "Landroid/animation/Animator;", "getBounceAnimator", "()Landroid/animation/Animator;", "setBounceAnimator", "(Landroid/animation/Animator;)V", "raisedMarginPixels", "", "getRaisedMarginPixels", "()I", "bind", "", "viewModel", "Lcom/tinder/places/viewmodel/PlacePinViewModel;", "activated", "", "generatePinBitmap", "Landroid/graphics/Bitmap;", "getShadedIcon", "Landroid/graphics/drawable/Drawable;", "iconRes", "startBouncing", "stopBouncing", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PlacePinView extends ConstraintLayout {
    @Nullable
    /* renamed from: a */
    private Animator f40006a;
    /* renamed from: b */
    private final int f40007b;
    /* renamed from: c */
    private HashMap f40008c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/tinder/places/map/view/PlacePinView$startBouncing$1$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.map.view.PlacePinView$a */
    static final class C10233a implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ PlacePinView f33347a;

        C10233a(PlacePinView placePinView) {
            this.f33347a = placePinView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2668g.a(valueAnimator, "it");
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            valueAnimator = -((Float) valueAnimator).floatValue();
            ImageView imageView = (ImageView) this.f33347a.m48787a(C6248a.pinOutline);
            C2668g.a(imageView, "pinOutline");
            imageView.setTranslationY(valueAnimator);
            imageView = (ImageView) this.f33347a.m48787a(C6248a.pinIcon);
            C2668g.a(imageView, "pinIcon");
            imageView.setTranslationY(valueAnimator);
        }
    }

    /* renamed from: a */
    public View m48787a(int i) {
        if (this.f40008c == null) {
            this.f40008c = new HashMap();
        }
        View view = (View) this.f40008c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f40008c.put(Integer.valueOf(i), view);
        return view;
    }

    public PlacePinView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f40007b = context.getResources().getDimensionPixelSize(R.dimen.places_pin_selected_float_distance);
        ConstraintLayout.inflate(context, R.layout.view_place_pin, this);
    }

    @Nullable
    public final Animator getBounceAnimator() {
        return this.f40006a;
    }

    public final void setBounceAnimator(@Nullable Animator animator) {
        this.f40006a = animator;
    }

    public final int getRaisedMarginPixels() {
        return this.f40007b;
    }

    /* renamed from: a */
    public final void m48789a(@NotNull C14351c c14351c, boolean z) {
        C2668g.b(c14351c, "viewModel");
        ((ImageView) m48787a(C6248a.pinIcon)).setImageDrawable(m48786a(c14351c.d(), z));
        ((ImageView) m48787a(C6248a.pinOutline)).setImageResource(z ? c14351c.b() : R.drawable.places_pin_white_shadowed);
    }

    /* renamed from: a */
    public final void m48788a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, (float) this.f40007b});
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(2);
        ofFloat.setDuration(500);
        ofFloat.addUpdateListener(new C10233a(this));
        ofFloat.start();
        this.f40006a = ofFloat;
    }

    /* renamed from: b */
    public final void m48790b() {
        Animator animator = this.f40006a;
        if (animator != null) {
            animator.end();
        }
    }

    @NotNull
    /* renamed from: c */
    public final Bitmap m48791c() {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        measure(makeMeasureSpec, makeMeasureSpec);
        makeMeasureSpec = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        layout(0, 0, makeMeasureSpec, measuredHeight);
        Bitmap createBitmap = Bitmap.createBitmap(makeMeasureSpec, measuredHeight, Config.ARGB_8888);
        createBitmap.eraseColor(0);
        draw(new Canvas(createBitmap));
        C2668g.a(createBitmap, "bitmap");
        return createBitmap;
    }

    /* renamed from: a */
    private final Drawable m48786a(@DrawableRes int i, boolean z) {
        i = C0432b.a(getContext(), i);
        if (i == 0) {
            return 0;
        }
        i = C0450a.g(i.mutate());
        C0450a.a(i, C0432b.c(getContext(), z ? true : true));
        C0450a.a(i, Mode.SRC_IN);
        return i;
    }
}
