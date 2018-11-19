package com.tinder.data.fastmatch.usecase;

import com.tinder.domain.fastmatch.model.FastMatchStatus;
import com.tinder.domain.fastmatch.model.FastMatchStatus.Source;
import com.tinder.domain.fastmatch.provider.FastMatchStatusProvider;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/data/fastmatch/usecase/DecrementFastMatchCount;", "", "provider", "Lcom/tinder/domain/fastmatch/provider/FastMatchStatusProvider;", "(Lcom/tinder/domain/fastmatch/provider/FastMatchStatusProvider;)V", "execute", "", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.fastmatch.usecase.a */
public final class C8650a {
    /* renamed from: a */
    private final FastMatchStatusProvider f30499a;

    @Inject
    public C8650a(@NotNull FastMatchStatusProvider fastMatchStatusProvider) {
        C2668g.b(fastMatchStatusProvider, "provider");
        this.f30499a = fastMatchStatusProvider;
    }

    /* renamed from: a */
    public final void m36885a() {
        FastMatchStatus fastMatchStatus = this.f30499a.get();
        this.f30499a.update(FastMatchStatus.copy$default(fastMatchStatus, fastMatchStatus.getCount() - 1, false, null, 0, Source.DECREMENT, 14, null));
    }
}
