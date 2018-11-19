package com.tinder.recs.animation;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.C3082c;
import com.bumptech.glide.load.resource.p028a.C1041b;
import com.bumptech.glide.request.RequestListener;
import com.facebook.rebound.C1811f;
import com.facebook.rebound.C1812g;
import com.facebook.rebound.C3443i;
import com.tinder.recs.view.RecProfileView;
import com.tinder.recs.view.tappablecards.TappyPageIndicatorView;
import com.tinder.toppicks.view.C18244a;
import com.tinder.toppicks.view.TopPicksTagView;
import com.tinder.view.grid.ParallaxFrameLayout;

public abstract class DefaultRecProfileAnimationDecorator extends RecProfileAnimationDecorator {
    private static final double FRICTION = 7.0d;
    private static final double REST_DISPLACEMENT_THRESHOLD = 0.001d;
    private static final double SPRING_VELOCITY = 12.0d;
    private static final double TENSION = 40.0d;
    @NonNull
    final PlaceholderPhotoConfig config;
    @NonNull
    final RecProfileView recProfileView;

    public static class LinearFloatInterpolator {
        private final float endValue;
        private final float startValue;

        public LinearFloatInterpolator(float f, float f2) {
            this.startValue = f;
            this.endValue = f2;
        }

        public float getValue(float f) {
            return ((this.endValue - this.startValue) * f) + this.startValue;
        }
    }

    public static class LinearRectInterpolator {
        private final LinearFloatInterpolator bottomInterpolator;
        private final LinearFloatInterpolator leftInterpolator;
        private final LinearFloatInterpolator rightInterpolator;
        private final LinearFloatInterpolator topInterpolator;

        public LinearRectInterpolator(Rect rect, Rect rect2) {
            this.leftInterpolator = new LinearFloatInterpolator((float) rect.left, (float) rect2.left);
            this.topInterpolator = new LinearFloatInterpolator((float) rect.top, (float) rect2.top);
            this.rightInterpolator = new LinearFloatInterpolator((float) rect.right, (float) rect2.right);
            this.bottomInterpolator = new LinearFloatInterpolator((float) rect.bottom, (float) rect2.bottom);
        }

        public void getValue(float f, Rect rect) {
            rect.set((int) this.leftInterpolator.getValue(f), (int) this.topInterpolator.getValue(f), (int) this.rightInterpolator.getValue(f), (int) this.bottomInterpolator.getValue(f));
        }
    }

    public static class PlaceholderImageView extends FrameLayout {
        private final ImageView imageView;
        @Nullable
        private TappyPageIndicatorView indicator;
        private final ParallaxFrameLayout parallaxFramelayout;
        @Nullable
        private TopPicksTagView topPicksTagView;

        public boolean hasOverlappingRendering() {
            return false;
        }

        public PlaceholderImageView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.parallaxFramelayout = new ParallaxFrameLayout(context, attributeSet);
            this.imageView = new AppCompatImageView(context, attributeSet);
            this.imageView.setScaleType(ScaleType.CENTER_CROP);
            this.parallaxFramelayout.addView(this.imageView, new LayoutParams(-1, -1));
            addView(this.parallaxFramelayout, new LayoutParams(-1, -1));
        }

        protected void onAttachedToWindow() {
            updateSize(0.0f, 0.0f, 0, 0, -1.0f);
            super.onAttachedToWindow();
        }

        public ParallaxFrameLayout parallaxFramelayout() {
            return this.parallaxFramelayout;
        }

        public void updateSize(float f, float f2, int i, int i2, float f3) {
            setTranslationX(f);
            setTranslationY(f2);
            setWidthHeight(i, i2);
            setParallaxFactor(f3);
        }

        public void setWidthHeight(int i, int i2) {
            LayoutParams layoutParams = getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i2;
            setLayoutParams(layoutParams);
        }

        public void setParallaxFactor(float f) {
            this.parallaxFramelayout.setParallaxFactor(f);
            this.parallaxFramelayout.getParallaxManager().m57813e();
        }

        public void loadImageUrl(@NonNull String str) {
            loadImageUrl(str, null, null);
        }

        public void loadImageUrl(@NonNull String str, @Nullable String str2) {
            loadImageUrl(str, str2, null);
        }

        public void loadImageUrl(@NonNull String str, @Nullable String str2, @Nullable RequestListener<String, C1041b> requestListener) {
            str = C0994i.b(getContext()).a(str).a(DiskCacheStrategy.ALL).d().e();
            if (requestListener != null) {
                str.a(requestListener);
            }
            if (str2 != null && str2.isEmpty() == null) {
                str.a(new C3082c[]{new C18244a(getContext())});
            }
            str.a(this.imageView);
        }

        public void showPageIndicator(int i, int i2) {
            if (this.indicator == null) {
                this.indicator = new TappyPageIndicatorView(getContext());
                this.indicator.setLayoutParams(new LayoutParams(-1, -2));
                addView(this.indicator);
            }
            this.indicator.setPageCount(i);
            this.indicator.setActivePage(i2);
        }

        public void updateActivePage(int i) {
            if (this.indicator != null) {
                this.indicator.setActivePage(i);
            }
        }

        public void setTagViewWithName(String str) {
            if (this.topPicksTagView == null) {
                this.topPicksTagView = new TopPicksTagView(getContext(), null);
                this.topPicksTagView.m57469a(str);
                addView(this.topPicksTagView);
                return;
            }
            this.topPicksTagView.m57469a(str);
            this.topPicksTagView.invalidate();
        }

        public void fadeTagView(Long l, Float f) {
            if (this.topPicksTagView != null) {
                this.topPicksTagView.animate().setDuration(l.longValue()).alpha(f.floatValue()).start();
            }
        }

        public void removeTagViewFromView() {
            if (this.topPicksTagView != null) {
                removeView(this.topPicksTagView);
            }
        }
    }

    public static abstract class PlaceholderPhotoConfig {

        public static abstract class Builder {
            public abstract PlaceholderPhotoConfig build();

            public abstract Builder displayedPhotoIndex(int i);

            public abstract Builder displayedPhotoUrl(String str);

            public abstract Builder photoCount(int i);

            public abstract Builder placeholderHeight(int i);

            public abstract Builder placeholderParallaxFactor(float f);

            public abstract Builder placeholderTagName(@Nullable String str);

            public abstract Builder placeholderWidth(int i);

            public abstract Builder placeholderX(int i);

            public abstract Builder placeholderY(int i);

            public abstract Builder showPageIndicator(boolean z);
        }

        public abstract int displayedPhotoIndex();

        @NonNull
        public abstract String displayedPhotoUrl();

        public abstract int photoCount();

        public abstract int placeholderHeight();

        public abstract float placeholderParallaxFactor();

        @Nullable
        public abstract String placeholderTagName();

        public abstract int placeholderWidth();

        public abstract int placeholderX();

        public abstract int placeholderY();

        public abstract boolean showPageIndicator();

        public static Builder builder() {
            return new com.tinder.recs.animation.C16392xe0232f8c.Builder();
        }

        public static Builder builder(PlaceholderPhotoConfig placeholderPhotoConfig) {
            return new com.tinder.recs.animation.C16392xe0232f8c.Builder(placeholderPhotoConfig);
        }
    }

    DefaultRecProfileAnimationDecorator(@NonNull RecProfileView recProfileView, @NonNull PlaceholderPhotoConfig placeholderPhotoConfig) {
        this.recProfileView = recProfileView;
        this.config = placeholderPhotoConfig;
    }

    C1811f createSpring() {
        C1811f b = C3443i.c().b();
        b.c(SPRING_VELOCITY);
        b.d(REST_DISPLACEMENT_THRESHOLD);
        b.a(C1812g.a(TENSION, FRICTION));
        return b;
    }
}
