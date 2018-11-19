package com.tinder.data.match;

import com.tinder.data.model.MatchModel;
import com.tinder.data.model.MatchModel.Creator;
import com.tinder.domain.match.model.Match.Attribution;
import org.joda.time.DateTime;

final /* synthetic */ class aa implements Creator {
    /* renamed from: a */
    static final Creator f35230a = new aa();

    private aa() {
    }

    public MatchModel create(String str, DateTime dateTime, DateTime dateTime2, Attribution attribution, boolean z, boolean z2, String str2, String str3, String str4, boolean z3, MatchType matchType) {
        return new C12915e(str, dateTime, dateTime2, attribution, z, z2, str2, str3, str4, z3, matchType);
    }
}
