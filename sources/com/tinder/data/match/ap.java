package com.tinder.data.match;

import com.tinder.data.model.TrackingUrlModel;
import com.tinder.data.model.TrackingUrlModel.Creator;
import org.joda.time.DateTime;

final /* synthetic */ class ap implements Creator {
    /* renamed from: a */
    static final Creator f35243a = new ap();

    private ap() {
    }

    public TrackingUrlModel create(String str, String str2, String str3, boolean z, DateTime dateTime, String str4) {
        return new C12920j(str, str2, str3, z, dateTime, str4);
    }
}
