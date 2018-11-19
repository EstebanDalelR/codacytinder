package com.tinder.reactions.drawer.mediator;

import com.tinder.reactions.drawer.model.SlideType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.drawer.mediator.h */
public final /* synthetic */ class C14634h {
    /* renamed from: a */
    public static final /* synthetic */ int[] f46151a = new int[SlideType.values().length];

    static {
        f46151a[SlideType.UP.ordinal()] = 1;
        f46151a[SlideType.DOWN.ordinal()] = 2;
        f46151a[SlideType.NAVIGATOR.ordinal()] = 3;
        f46151a[SlideType.HANDLE.ordinal()] = 4;
    }
}
