package com.tinder.data.fastmatch.p324a;

import com.tinder.api.response.v2.FastMatchNewCountResponse;
import com.tinder.common.p076a.C2640a;
import com.tinder.data.adapter.C2646o;
import com.tinder.domain.fastmatch.model.FastMatchNewCount;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"Lcom/tinder/data/fastmatch/adapter/FastMatchNewCountAdapter;", "Lcom/tinder/data/adapter/DomainApiAdapter;", "Lcom/tinder/domain/fastmatch/model/FastMatchNewCount;", "Lcom/tinder/api/response/v2/FastMatchNewCountResponse;", "()V", "fromApi", "response", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.fastmatch.a.b */
public final class C10767b extends C2646o<FastMatchNewCount, FastMatchNewCountResponse> {
    @NotNull
    /* renamed from: a */
    public FastMatchNewCount m43171a(@NotNull FastMatchNewCountResponse fastMatchNewCountResponse) {
        C2668g.b(fastMatchNewCountResponse, "response");
        String str = (String) C2640a.a(fastMatchNewCountResponse.getNewCountToken());
        fastMatchNewCountResponse = fastMatchNewCountResponse.getCount();
        C2668g.a(str, "newCountToken");
        return new FastMatchNewCount(fastMatchNewCountResponse, str);
    }
}
