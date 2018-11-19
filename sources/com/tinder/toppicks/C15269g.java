package com.tinder.toppicks;

import com.tinder.paywall.legacy.TopPicksPaywallSource;
import com.tinder.toppicks.TopPicksPaywallViewModel.ViewType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.g */
public final /* synthetic */ class C15269g {
    /* renamed from: a */
    public static final /* synthetic */ int[] f47391a = new int[TopPicksPaywallSource.values().length];
    /* renamed from: b */
    public static final /* synthetic */ int[] f47392b = new int[TopPicksPaywallSource.values().length];
    /* renamed from: c */
    public static final /* synthetic */ int[] f47393c = new int[TopPicksPaywallSource.values().length];
    /* renamed from: d */
    public static final /* synthetic */ int[] f47394d = new int[TopPicksPaywallSource.values().length];
    /* renamed from: e */
    public static final /* synthetic */ int[] f47395e = new int[ViewType.values().length];

    static {
        f47391a[TopPicksPaywallSource.EXHAUSTED_VIEW_EMPTY_STATE.ordinal()] = 1;
        f47391a[TopPicksPaywallSource.DEEPLINK.ordinal()] = 2;
        f47391a[TopPicksPaywallSource.CLICK_ON_TEASER.ordinal()] = 3;
        f47391a[TopPicksPaywallSource.SWIPE_ON_TEASER.ordinal()] = 4;
        f47391a[TopPicksPaywallSource.FOOTER_BUTTON.ordinal()] = 5;
        f47391a[TopPicksPaywallSource.SCROLL_TO_BOTTOM.ordinal()] = 6;
        f47391a[TopPicksPaywallSource.TOP_PICKS_NOT_AVAILABLE.ordinal()] = 7;
        f47392b[TopPicksPaywallSource.SCROLL_TO_BOTTOM.ordinal()] = 1;
        f47392b[TopPicksPaywallSource.CLICK_ON_TEASER.ordinal()] = 2;
        f47392b[TopPicksPaywallSource.SWIPE_ON_TEASER.ordinal()] = 3;
        f47392b[TopPicksPaywallSource.FOOTER_BUTTON.ordinal()] = 4;
        f47392b[TopPicksPaywallSource.DEEPLINK.ordinal()] = 5;
        f47392b[TopPicksPaywallSource.EXHAUSTED_VIEW_EMPTY_STATE.ordinal()] = 6;
        f47392b[TopPicksPaywallSource.TOP_PICKS_NOT_AVAILABLE.ordinal()] = 7;
        f47393c[TopPicksPaywallSource.TOP_PICKS_NOT_AVAILABLE.ordinal()] = 1;
        f47393c[TopPicksPaywallSource.SCROLL_TO_BOTTOM.ordinal()] = 2;
        f47393c[TopPicksPaywallSource.EXHAUSTED_VIEW_EMPTY_STATE.ordinal()] = 3;
        f47393c[TopPicksPaywallSource.CLICK_ON_TEASER.ordinal()] = 4;
        f47393c[TopPicksPaywallSource.SWIPE_ON_TEASER.ordinal()] = 5;
        f47393c[TopPicksPaywallSource.FOOTER_BUTTON.ordinal()] = 6;
        f47393c[TopPicksPaywallSource.DEEPLINK.ordinal()] = 7;
        f47394d[TopPicksPaywallSource.SCROLL_TO_BOTTOM.ordinal()] = 1;
        f47394d[TopPicksPaywallSource.CLICK_ON_TEASER.ordinal()] = 2;
        f47394d[TopPicksPaywallSource.SWIPE_ON_TEASER.ordinal()] = 3;
        f47394d[TopPicksPaywallSource.FOOTER_BUTTON.ordinal()] = 4;
        f47394d[TopPicksPaywallSource.DEEPLINK.ordinal()] = 5;
        f47394d[TopPicksPaywallSource.EXHAUSTED_VIEW_EMPTY_STATE.ordinal()] = 6;
        f47394d[TopPicksPaywallSource.TOP_PICKS_NOT_AVAILABLE.ordinal()] = 7;
        f47395e[ViewType.PAYWALL_ITEMS.ordinal()] = 1;
        f47395e[ViewType.PICKS_NOT_AVAILABLE.ordinal()] = 2;
    }
}
