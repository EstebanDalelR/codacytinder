package com.facebook.ads;

import android.content.Context;
import com.facebook.ads.internal.p040g.C1416i;

public final class BidderTokenProvider {
    public static String getBidderToken(Context context) {
        return new C1416i(context, true).m4928a();
    }
}
