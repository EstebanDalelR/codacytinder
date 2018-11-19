package com.tinder.paywall.viewmodels;

import com.tinder.paywall.legacy.GoldPaywallSource;
import com.tinder.paywall.legacy.PaywallTypeSource;
import com.tinder.paywall.legacy.PlusPaywallSource;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/paywall/viewmodels/FirstPerkResolver;", "", "()V", "fromSource", "Lcom/tinder/paywall/viewmodels/PaywallPerk;", "source", "Lcom/tinder/paywall/legacy/PaywallTypeSource;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.paywall.viewmodels.b */
public final class C10083b {
    @NotNull
    /* renamed from: a */
    public final PaywallPerk m41200a(@NotNull PaywallTypeSource paywallTypeSource) {
        C2668g.b(paywallTypeSource, "source");
        if (paywallTypeSource != PlusPaywallSource.SUPERLIKE_DIALOG_UPSELL) {
            if (paywallTypeSource != PlusPaywallSource.BLENDS_ACTIVITY) {
                if (paywallTypeSource != PlusPaywallSource.CONTROL_SUPERLIKE_FEATURE) {
                    if (paywallTypeSource != PlusPaywallSource.GAMEPAD_SUPERLIKE) {
                        if (paywallTypeSource != PlusPaywallSource.BOOST_DIALOG_UPDATE) {
                            if (paywallTypeSource != PlusPaywallSource.BOOST_DIALOG_SUMMARY) {
                                if (paywallTypeSource != PlusPaywallSource.BOOST_DIALOG_UPSELL_BUTTON) {
                                    if (paywallTypeSource != PlusPaywallSource.CONTROL_BOOST_FEATURE) {
                                        if (paywallTypeSource != PlusPaywallSource.GAMEPAD_UNDO) {
                                            if (paywallTypeSource != PlusPaywallSource.CONTROL_UNDO) {
                                                if (paywallTypeSource == PlusPaywallSource.CONTROL_HIDE_ADS) {
                                                    return PaywallPerk.NO_ADS;
                                                }
                                                if (paywallTypeSource != PlusPaywallSource.PASSPORT_ADD_LOCATION) {
                                                    if (paywallTypeSource != PlusPaywallSource.PASSPORT_RECENT_LOCATION) {
                                                        if (paywallTypeSource != PlusPaywallSource.CONTROL_OTHER_FEATURE) {
                                                            if (paywallTypeSource != PlusPaywallSource.GAMEPAD_LIKE) {
                                                                if (paywallTypeSource != PlusPaywallSource.CONTROL_UNLIMITED_SWIPES) {
                                                                    if (paywallTypeSource == PlusPaywallSource.CONTROL_WHO_SEES_YOU) {
                                                                        return PaywallPerk.WHO_SEES_YOU;
                                                                    }
                                                                    if (paywallTypeSource == PlusPaywallSource.CONTROL_YOUR_PROFILE) {
                                                                        return PaywallPerk.YOUR_PROFILE;
                                                                    }
                                                                    if (paywallTypeSource != GoldPaywallSource.FASTMATCH_MATCHLIST_PREVIEW) {
                                                                        if (paywallTypeSource != GoldPaywallSource.SETTINGS_BUTTON) {
                                                                            if (paywallTypeSource != GoldPaywallSource.FASTMATCH_INTRO) {
                                                                                if (paywallTypeSource != GoldPaywallSource.DEEPLINK) {
                                                                                    if (paywallTypeSource != GoldPaywallSource.CONTROLLA_FASTMATCH_FEATURE) {
                                                                                        if (paywallTypeSource == GoldPaywallSource.LIKES_BOUNCER) {
                                                                                            return PaywallPerk.UNLIMITED_LIKES;
                                                                                        }
                                                                                        if (paywallTypeSource == GoldPaywallSource.REWIND) {
                                                                                            return PaywallPerk.UNDO;
                                                                                        }
                                                                                        if (paywallTypeSource != GoldPaywallSource.TOP_PICKS_SWIPE_RIGHT_ON_REC) {
                                                                                            if (paywallTypeSource != GoldPaywallSource.TOP_PICKS_VIEWING_PROFILE) {
                                                                                                if (paywallTypeSource != GoldPaywallSource.TOP_PICKS_SCROLL_TO_BOTTOM) {
                                                                                                    if (paywallTypeSource != GoldPaywallSource.TOP_PICKS_SWIPE_LEFT_ON_REC) {
                                                                                                        if (paywallTypeSource != GoldPaywallSource.TOP_PICKS_DEEPLINK) {
                                                                                                            if (paywallTypeSource != GoldPaywallSource.TOP_PICKS_FOOTER_BUTTON) {
                                                                                                                return PaywallPerk.PASSPORT;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    return PaywallPerk.TOP_PICKS_FEATURE;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        return PaywallPerk.TOP_PICKS_TEASER;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    return PaywallPerk.FAST_MATCH;
                                                                }
                                                            }
                                                            return PaywallPerk.UNLIMITED_LIKES;
                                                        }
                                                    }
                                                }
                                                return PaywallPerk.PASSPORT;
                                            }
                                        }
                                        return PaywallPerk.UNDO;
                                    }
                                }
                            }
                        }
                        return PaywallPerk.BOOST;
                    }
                }
            }
        }
        return PaywallPerk.SUPER_LIKE;
    }
}
