package com.mapbox.mapboxsdk.maps.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v4.view.C0609n;
import android.support.v4.view.C2899o;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnCompassAnimationListener;

@SuppressLint({"AppCompatCustomView"})
public final class CompassView extends ImageView implements Runnable {
    private static final long TIME_FADE_ANIMATION = 500;
    public static final long TIME_MAP_NORTH_ANIMATION = 150;
    public static final long TIME_WAIT_IDLE = 500;
    private OnCompassAnimationListener compassAnimationListener;
    private C0609n fadeAnimator;
    private boolean fadeCompassViewFacingNorth = true;
    private boolean isAnimating = false;
    private float rotation = 0.0f;

    /* renamed from: com.mapbox.mapboxsdk.maps.widgets.CompassView$1 */
    class C78441 extends C2899o {
        C78441() {
        }

        public void onAnimationEnd(View view) {
            CompassView.this.setLayerType(0, null);
            CompassView.this.setVisibility(4);
            CompassView.this.resetAnimation();
        }
    }

    public CompassView(Context context) {
        super(context);
        initialize(context);
    }

    public CompassView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize(context);
    }

    public CompassView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initialize(context);
    }

    private void initialize(Context context) {
        setEnabled(false);
        context = (int) (context.getResources().getDisplayMetrics().density * 48.0f);
        setLayoutParams(new LayoutParams(context, context));
    }

    public void injectCompassAnimationListener(@NonNull OnCompassAnimationListener onCompassAnimationListener) {
        this.compassAnimationListener = onCompassAnimationListener;
    }

    public void isAnimating(boolean z) {
        this.isAnimating = z;
    }

    private void resetAnimation() {
        if (this.fadeAnimator != null) {
            this.fadeAnimator.b();
        }
        this.fadeAnimator = null;
    }

    public boolean isHidden() {
        return this.fadeCompassViewFacingNorth && isFacingNorth();
    }

    public boolean isFacingNorth() {
        if (((double) Math.abs(this.rotation)) < 359.0d) {
            if (((double) Math.abs(this.rotation)) > 1.0d) {
                return false;
            }
        }
        return true;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z || isHidden()) {
            resetAnimation();
            setAlpha(false);
            setVisibility(true);
            return;
        }
        resetAnimation();
        setAlpha(true);
        setVisibility(false);
    }

    public void update(double d) {
        this.rotation = (float) d;
        if (isEnabled() != null) {
            if (isHidden() != null) {
                if (getVisibility() != 4) {
                    if (this.fadeAnimator == null) {
                        postDelayed(this, 2.47E-321d);
                        return;
                    }
                }
                return;
            }
            resetAnimation();
            setAlpha(5.263544247E-315d);
            setVisibility(0.0d);
            notifyCompassAnimationListenerWhenAnimating();
            setRotation(this.rotation);
        }
    }

    public void fadeCompassViewFacingNorth(boolean z) {
        this.fadeCompassViewFacingNorth = z;
    }

    public boolean isFadeCompassViewFacingNorth() {
        return this.fadeCompassViewFacingNorth;
    }

    public void setCompassImage(Drawable drawable) {
        setImageDrawable(drawable);
    }

    public Drawable getCompassImage() {
        return getDrawable();
    }

    public void run() {
        if (isHidden()) {
            this.compassAnimationListener.onCompassAnimationFinished();
            resetAnimation();
            setLayerType(2, null);
            this.fadeAnimator = ViewCompat.m(this).a(0.0f).a(500);
            this.fadeAnimator.a(new C78441());
        }
    }

    private void notifyCompassAnimationListenerWhenAnimating() {
        if (this.isAnimating) {
            this.compassAnimationListener.onCompassAnimation();
        }
    }
}
