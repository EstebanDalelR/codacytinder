package com.tinder.feed.analytics.p247a;

import com.tinder.common.navigation.Screen.Matches.Subscreen;
import com.tinder.main.model.MainPage;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.analytics.a.c */
public final /* synthetic */ class C9424c {
    /* renamed from: a */
    public static final /* synthetic */ int[] f31575a = new int[MainPage.values().length];
    /* renamed from: b */
    public static final /* synthetic */ int[] f31576b = new int[Subscreen.values().length];

    static {
        f31575a[MainPage.PROFILE.ordinal()] = 1;
        f31575a[MainPage.RECS.ordinal()] = 2;
        f31575a[MainPage.MATCHES.ordinal()] = 3;
        f31575a[MainPage.FEED.ordinal()] = 4;
        f31575a[MainPage.DISCOVERY.ordinal()] = 5;
        f31576b[Subscreen.FEED.ordinal()] = 1;
        f31576b[Subscreen.MESSAGES.ordinal()] = 2;
    }
}
