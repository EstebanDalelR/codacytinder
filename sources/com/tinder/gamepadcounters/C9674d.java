package com.tinder.gamepadcounters;

import com.tinder.app.AppVisibilityTracker$Visibility;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.gamepadcounters.d */
public final /* synthetic */ class C9674d {
    /* renamed from: a */
    public static final /* synthetic */ int[] f32241a = new int[AppVisibilityTracker$Visibility.values().length];
    /* renamed from: b */
    public static final /* synthetic */ int[] f32242b = new int[Source.values().length];

    static {
        f32241a[AppVisibilityTracker$Visibility.FOREGROUND.ordinal()] = 1;
        f32241a[AppVisibilityTracker$Visibility.BACKGROUND.ordinal()] = 2;
        f32242b[Source.GAMEPAD.ordinal()] = 1;
        f32242b[Source.FASTMATCH.ordinal()] = 2;
    }
}
