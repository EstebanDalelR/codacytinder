package com.tinder.places.map.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.mapbox.mapboxsdk.style.layers.CircleLayer;
import com.mapbox.mapboxsdk.style.layers.PropertyFactory;
import com.mapbox.mapboxsdk.style.layers.PropertyValue;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\bH\u0002J\u0006\u0010\r\u001a\u00020\u000bR\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/places/map/view/RingLayerAnimator;", "", "ring", "Lcom/mapbox/mapboxsdk/style/layers/CircleLayer;", "circleAnimations", "", "Landroid/animation/AnimatorSet;", "delayMillis", "", "(Lcom/mapbox/mapboxsdk/style/layers/CircleLayer;Ljava/util/Map;J)V", "beginRingAnimation", "", "delay", "start", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.map.view.f */
public final class C10246f {
    /* renamed from: a */
    public static final C10243a f33360a = new C10243a();
    /* renamed from: b */
    private final CircleLayer f33361b;
    /* renamed from: c */
    private final Map<CircleLayer, AnimatorSet> f33362c;
    /* renamed from: d */
    private final long f33363d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/places/map/view/RingLayerAnimator$Companion;", "", "()V", "ALPHA_BEG", "", "ALPHA_END", "LAYER_ANIM_DURATION_MS", "", "SCALE_BEG", "SCALE_END", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.map.view.f$a */
    public static final class C10243a {
        private C10243a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animator", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.map.view.f$b */
    static final class C10244b implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ CircleLayer f33358a;

        C10244b(CircleLayer circleLayer) {
            this.f33358a = circleLayer;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            CircleLayer circleLayer = this.f33358a;
            PropertyValue[] propertyValueArr = new PropertyValue[1];
            C2668g.a(valueAnimator, "animator");
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            propertyValueArr[0] = PropertyFactory.circleRadius((Float) valueAnimator);
            circleLayer.setProperties(propertyValueArr);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animator", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.map.view.f$c */
    static final class C10245c implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ CircleLayer f33359a;

        C10245c(CircleLayer circleLayer) {
            this.f33359a = circleLayer;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            CircleLayer circleLayer = this.f33359a;
            PropertyValue[] propertyValueArr = new PropertyValue[1];
            C2668g.a(valueAnimator, "animator");
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            propertyValueArr[0] = PropertyFactory.circleOpacity((Float) valueAnimator);
            circleLayer.setProperties(propertyValueArr);
        }
    }

    public C10246f(@NotNull CircleLayer circleLayer, @NotNull Map<CircleLayer, AnimatorSet> map, long j) {
        C2668g.b(circleLayer, "ring");
        C2668g.b(map, "circleAnimations");
        this.f33361b = circleLayer;
        this.f33362c = map;
        this.f33363d = j;
    }

    public /* synthetic */ C10246f(CircleLayer circleLayer, Map map, long j, int i, C15823e c15823e) {
        if ((i & 4) != 0) {
            j = 0;
        }
        this(circleLayer, map, j);
    }

    /* renamed from: a */
    public final void m41633a() {
        m41632a(this.f33361b, this.f33363d);
    }

    /* renamed from: a */
    private final void m41632a(CircleLayer circleLayer, long j) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.6f, 66.0f});
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        C2668g.a(ofFloat, "ringRadiusAnimator");
        ofFloat.setDuration(4000);
        ofFloat.setRepeatMode(1);
        ofFloat.setRepeatCount(-1);
        C2668g.a(ofFloat2, "ringOpacityAnimator");
        ofFloat2.setDuration(4000);
        ofFloat2.setRepeatMode(1);
        ofFloat2.setRepeatCount(-1);
        ofFloat.addUpdateListener(new C10244b(circleLayer));
        ofFloat2.addUpdateListener(new C10245c(circleLayer));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(new Animator[]{ofFloat2, ofFloat});
        if (j != 0) {
            animatorSet.setStartDelay(j);
        }
        this.f33362c.put(circleLayer, animatorSet);
        animatorSet.start();
    }
}
