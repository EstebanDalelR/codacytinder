package com.tinder.spotify.views;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.support.v4.view.p011a.C2890b;
import android.util.AttributeSet;
import com.makeramen.roundedimageview.RoundedImageView;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0010H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0014J\b\u0010\u001a\u001a\u00020\u0015H\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/tinder/spotify/views/SpotifyArtworkRoundedImageView;", "Lcom/makeramen/roundedimageview/RoundedImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "animatorUpdateListener", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "endRadius", "", "getEndRadius", "()F", "setEndRadius", "(F)V", "radiusValueAnimator", "Landroid/animation/ValueAnimator;", "startRadius", "getStartRadius", "setStartRadius", "animateImageCropIn", "", "animateImageCropOut", "onAnimationUpdate", "animation", "onAttachedToWindow", "onDetachedFromWindow", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class SpotifyArtworkRoundedImageView extends RoundedImageView {
    /* renamed from: c */
    private float f51955c;
    /* renamed from: d */
    private float f51956d;
    /* renamed from: e */
    private final ValueAnimator f51957e = new ValueAnimator();
    /* renamed from: f */
    private final AnimatorUpdateListener f51958f = ((AnimatorUpdateListener) new C15054a(this));

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.spotify.views.SpotifyArtworkRoundedImageView$a */
    static final class C15054a implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ SpotifyArtworkRoundedImageView f46879a;

        C15054a(SpotifyArtworkRoundedImageView spotifyArtworkRoundedImageView) {
            this.f46879a = spotifyArtworkRoundedImageView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            SpotifyArtworkRoundedImageView spotifyArtworkRoundedImageView = this.f46879a;
            C2668g.a(valueAnimator, "it");
            spotifyArtworkRoundedImageView.m62425a(valueAnimator);
        }
    }

    public SpotifyArtworkRoundedImageView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        this.f51957e.setDuration(500);
        this.f51957e.setInterpolator((TimeInterpolator) new C2890b());
    }

    public final float getEndRadius() {
        return this.f51955c;
    }

    public final void setEndRadius(float f) {
        this.f51955c = f;
    }

    public final float getStartRadius() {
        return this.f51956d;
    }

    public final void setStartRadius(float f) {
        this.f51956d = f;
    }

    /* renamed from: a */
    public final void m62427a() {
        this.f51957e.cancel();
        this.f51957e.setFloatValues(new float[]{this.f51956d, this.f51955c});
        this.f51957e.start();
    }

    /* renamed from: b */
    public final void m62428b() {
        this.f51957e.cancel();
        this.f51957e.setFloatValues(new float[]{this.f51955c, this.f51956d});
        this.f51957e.start();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f51957e.addUpdateListener(this.f51958f);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f51957e.removeUpdateListener(this.f51958f);
    }

    /* renamed from: a */
    private final void m62425a(ValueAnimator valueAnimator) {
        valueAnimator = valueAnimator.getAnimatedValue();
        if (valueAnimator == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
        setCornerRadius(((Float) valueAnimator).floatValue());
    }
}
