package com.tinder.ads;

import com.tinder.domain.common.TrackingUrl.Event;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
public final /* synthetic */ class NativeDfpTrackingUrlParser$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Event.values().length];

    static {
        $EnumSwitchMapping$0[Event.IMPRESSION.ordinal()] = 1;
        $EnumSwitchMapping$0[Event.OPEN.ordinal()] = 2;
        $EnumSwitchMapping$0[Event.CLICK.ordinal()] = 3;
        $EnumSwitchMapping$0[Event.SWIPES.ordinal()] = 4;
    }
}
