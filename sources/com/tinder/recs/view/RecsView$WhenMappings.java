package com.tinder.recs.view;

import com.tinder.cardstack.model.SwipeDirection;
import com.tinder.domain.recs.model.Swipe.Type;
import com.tinder.enums.SwipeType;
import com.tinder.fireboarding.domain.Level;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
public final /* synthetic */ class RecsView$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[SwipeDirection.values().length];
    public static final /* synthetic */ int[] $EnumSwitchMapping$1 = new int[Type.values().length];
    public static final /* synthetic */ int[] $EnumSwitchMapping$2 = new int[Level.values().length];
    public static final /* synthetic */ int[] $EnumSwitchMapping$3 = new int[Level.values().length];
    public static final /* synthetic */ int[] $EnumSwitchMapping$4 = new int[SwipeType.values().length];

    static {
        $EnumSwitchMapping$0[SwipeDirection.UP.ordinal()] = 1;
        $EnumSwitchMapping$0[SwipeDirection.LEFT.ordinal()] = 2;
        $EnumSwitchMapping$0[SwipeDirection.RIGHT.ordinal()] = 3;
        $EnumSwitchMapping$1[Type.LIKE.ordinal()] = 1;
        $EnumSwitchMapping$1[Type.PASS.ordinal()] = 2;
        $EnumSwitchMapping$1[Type.SUPERLIKE.ordinal()] = 3;
        $EnumSwitchMapping$2[Level.BOOST.ordinal()] = 1;
        $EnumSwitchMapping$2[Level.REWIND.ordinal()] = 2;
        $EnumSwitchMapping$2[Level.SUPERLIKE.ordinal()] = 3;
        $EnumSwitchMapping$3[Level.REWIND.ordinal()] = 1;
        $EnumSwitchMapping$3[Level.SUPERLIKE.ordinal()] = 2;
        $EnumSwitchMapping$3[Level.BOOST.ordinal()] = 3;
        $EnumSwitchMapping$4[SwipeType.LIKE_BUTTON.ordinal()] = 1;
        $EnumSwitchMapping$4[SwipeType.PASS_BUTTON.ordinal()] = 2;
        $EnumSwitchMapping$4[SwipeType.SUPER_LIKE_BUTTON.ordinal()] = 3;
    }
}
