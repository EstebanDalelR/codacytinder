package com.tinder.places.card.view;

import com.tinder.places.carousel.p309a.C10189a;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a\u001e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005\u001a\u001e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u000fXT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000*.\u0010\u0017\"\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00190\u00182\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00190\u0018¨\u0006\u001a"}, d2 = {"ANIMATION_DURATION", "", "CARD_ANIMATION_CURVE", "Lcom/tinder/places/carousel/util/CubicBezierInterpolator;", "CARD_ELEVATION", "", "FADE_IN_ACCELERATION", "", "RECS_ANIMATION_CURVE", "SHRINK_ANIMATION_CURVE", "SHRINK_CARD_ACCELERATION", "SHRINK_CARD_INTERPOLATE_FACTOR", "SHRINK_DURATION_FADE_IN", "SHRINK_DURATION_FADE_OUT", "SWIPE_THRESHOLD", "", "TEASER_BOUNCE_FACTOR", "TOOLBAR_ANIMATION_DURATION", "TOOLBAR_MIN_ALPHA", "tween", "oldValue", "newValue", "ratio", "ToolbarCollapser", "Lkotlin/Function2;", "", "Tinder_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.places.card.view.f */
public final class C10184f {
    /* renamed from: a */
    private static final C10189a f33218a = new C10189a(0.35f, 1.3f, 0.55f, 1.0f);
    /* renamed from: b */
    private static final C10189a f33219b = new C10189a(0.15f, 1.7f, 0.5f, 0.8f);
    /* renamed from: c */
    private static final C10189a f33220c = new C10189a(0.65f, 1.15f, 0.7f, 1.05f);

    /* renamed from: a */
    public static final float m41464a(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* renamed from: a */
    public static final int m41465a(int i, int i2, float f) {
        return (int) (((float) i) + (((float) (i2 - i)) * f));
    }
}
