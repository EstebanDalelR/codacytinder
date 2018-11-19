package com.tinder.gamepad.view;

import com.tinder.gamepad.model.GamepadButtonState;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.gamepad.view.a */
public final /* synthetic */ class C9660a {
    /* renamed from: a */
    public static final /* synthetic */ int[] f32196a = new int[GamepadButtonState.values().length];

    static {
        f32196a[GamepadButtonState.ENABLED.ordinal()] = 1;
        f32196a[GamepadButtonState.DISABLED.ordinal()] = 2;
        f32196a[GamepadButtonState.HIDDEN.ordinal()] = 3;
    }
}
