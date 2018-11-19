package com.tinder.data.match;

import com.tinder.data.model.MatchPersonModel;
import com.tinder.data.model.MatchPersonModel.Creator;
import com.tinder.domain.common.model.Gender;
import java.util.List;
import org.joda.time.DateTime;

/* renamed from: com.tinder.data.match.z */
final /* synthetic */ class C10808z implements Creator {
    /* renamed from: a */
    static final Creator f35253a = new C10808z();

    private C10808z() {
    }

    public MatchPersonModel create(String str, String str2, String str3, DateTime dateTime, Gender gender, List list, List list2, List list3, List list4) {
        return new C12916f(str, str2, str3, dateTime, gender, list, list2, list3, list4);
    }
}
