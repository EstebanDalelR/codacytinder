package com.tinder.data.fastmatch.p324a;

import com.tinder.api.ManagerWebServices;
import com.tinder.api.response.FastMatchCountResponse;
import com.tinder.api.response.FastMatchCountResponse.Data;
import com.tinder.common.p076a.C2640a;
import com.tinder.data.adapter.C2646o;
import com.tinder.domain.fastmatch.model.FastMatchCount;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"Lcom/tinder/data/fastmatch/adapter/FastMatchCountAdapter;", "Lcom/tinder/data/adapter/DomainApiAdapter;", "Lcom/tinder/domain/fastmatch/model/FastMatchCount;", "Lcom/tinder/api/response/FastMatchCountResponse;", "()V", "fromApi", "response", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.fastmatch.a.a */
public final class C10766a extends C2646o<FastMatchCount, FastMatchCountResponse> {
    @NotNull
    /* renamed from: a */
    public FastMatchCount m43169a(@NotNull FastMatchCountResponse fastMatchCountResponse) {
        C2668g.b(fastMatchCountResponse, "response");
        Data data = (Data) C2640a.a(fastMatchCountResponse.data());
        Integer num = (Integer) C2640a.a(data.count());
        C2668g.a(data, ManagerWebServices.FB_DATA);
        Boolean bool = (Boolean) C2640a.a(data.isRange());
        C2668g.a(num, ManagerWebServices.FB_PARAM_FIELD_COUNT);
        int intValue = num.intValue();
        C2668g.a(bool, "isRange");
        return new FastMatchCount(intValue, bool.booleanValue());
    }
}
