package com.tinder.reactions.gestures.animators;

import com.tinder.reactions.gestures.viewmodel.GestureActivationType;
import com.tinder.reactions.navigation.viewmodel.GrandGestureNavigationItem.Type;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.gestures.animators.e */
public final /* synthetic */ class C14648e {
    /* renamed from: a */
    public static final /* synthetic */ int[] f46188a = new int[Type.values().length];
    /* renamed from: b */
    public static final /* synthetic */ int[] f46189b = new int[GestureActivationType.values().length];

    static {
        f46188a[Type.HEART.ordinal()] = 1;
        f46188a[Type.LAUGH.ordinal()] = 2;
        f46188a[Type.CLAP.ordinal()] = 3;
        f46188a[Type.CHAT_BUBBLE.ordinal()] = 4;
        f46188a[Type.MARTINI.ordinal()] = 5;
        f46188a[Type.STRIKE.ordinal()] = 6;
        f46188a[Type.EYEROLL.ordinal()] = 7;
        f46188a[Type.BALL_IN_COURT.ordinal()] = 8;
        f46189b[GestureActivationType.PULL_AND_RELEASE.ordinal()] = 1;
        f46189b[GestureActivationType.CLICK.ordinal()] = 2;
        f46189b[GestureActivationType.FLING_ON_TARGET.ordinal()] = 3;
        f46189b[GestureActivationType.SELECT_AND_CLICK.ordinal()] = 4;
    }
}
