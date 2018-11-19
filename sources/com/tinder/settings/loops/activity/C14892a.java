package com.tinder.settings.loops.activity;

import com.tinder.domain.settings.loops.model.AutoPlayVideoSettingsOption;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.settings.loops.activity.a */
public final /* synthetic */ class C14892a {
    /* renamed from: a */
    public static final /* synthetic */ int[] f46576a = new int[AutoPlayVideoSettingsOption.values().length];

    static {
        f46576a[AutoPlayVideoSettingsOption.ON_WIFI_AND_MOBILE_DATA.ordinal()] = 1;
        f46576a[AutoPlayVideoSettingsOption.ON_WIFI_ONLY.ordinal()] = 2;
        f46576a[AutoPlayVideoSettingsOption.ON_NEVER_AUTOPLAY.ordinal()] = 3;
    }
}
