package com.tinder.data.match;

import com.tinder.data.model.SponsoredMatchCreativeValuesModel;
import com.tinder.data.model.SponsoredMatchCreativeValuesModel.Creator;
import java.util.List;
import org.joda.time.DateTime;

/* renamed from: com.tinder.data.match.l */
final /* synthetic */ class C10795l implements Creator {
    /* renamed from: a */
    static final Creator f35245a = new C10795l();

    private C10795l() {
    }

    public SponsoredMatchCreativeValuesModel create(String str, String str2, String str3, String str4, String str5, String str6, String str7, DateTime dateTime, List list) {
        return new C12909a(str, str2, str3, str4, str5, str6, str7, dateTime, list);
    }
}
