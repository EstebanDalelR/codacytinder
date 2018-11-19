package com.tinder.toppicks.tooltip;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.tooltip.a */
public final /* synthetic */ class C15302a {
    /* renamed from: a */
    public static final /* synthetic */ int[] f47473a = new int[TriggerCondition.values().length];

    static {
        f47473a[TriggerCondition.IMMEDIATELY.ordinal()] = 1;
        f47473a[TriggerCondition.SWIPE_COUNT.ordinal()] = 2;
        f47473a[TriggerCondition.NEVER.ordinal()] = 3;
    }
}
