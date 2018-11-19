package com.tinder.pushnotifications.p380a;

import com.tinder.app.AppVisibilityTracker$Visibility;
import com.tinder.pushnotifications.model.NotificationType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.pushnotifications.a.b */
public final /* synthetic */ class C14549b {
    /* renamed from: a */
    public static final /* synthetic */ int[] f45971a = new int[AppVisibilityTracker$Visibility.values().length];
    /* renamed from: b */
    public static final /* synthetic */ int[] f45972b = new int[NotificationType.values().length];

    static {
        f45971a[AppVisibilityTracker$Visibility.FOREGROUND.ordinal()] = 1;
        f45972b[NotificationType.MATCH.ordinal()] = 1;
        f45972b[NotificationType.MESSAGE.ordinal()] = 2;
        f45972b[NotificationType.PHOTO_OPTIMIZED.ordinal()] = 3;
        f45972b[NotificationType.BOOST.ordinal()] = 4;
        f45972b[NotificationType.DISCOUNT.ordinal()] = 5;
        f45972b[NotificationType.MARKET.ordinal()] = 6;
        f45972b[NotificationType.SUPERLIKE.ordinal()] = 7;
        f45972b[NotificationType.REMOVE.ordinal()] = 8;
        f45972b[NotificationType.FASTMATCH.ordinal()] = 9;
        f45972b[NotificationType.SELECT.ordinal()] = 10;
        f45972b[NotificationType.ERROR.ordinal()] = 11;
        f45972b[NotificationType.SUPER_LIKEABLE.ordinal()] = 12;
        f45972b[NotificationType.TOP_PICKS_DAILY.ordinal()] = 13;
        f45972b[NotificationType.PLACES.ordinal()] = 14;
        f45972b[NotificationType.TOP_PICKS_DISCOVERY.ordinal()] = 15;
        f45972b[NotificationType.PHONE_NUMBER_VERIFIED.ordinal()] = 16;
    }
}
