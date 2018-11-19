package com.tinder.data.fastmatch.usecase;

import com.tinder.domain.fastmatch.model.FastMatchStatus;
import com.tinder.domain.fastmatch.model.FastMatchStatus.Source;
import com.tinder.domain.fastmatch.provider.FastMatchStatusProvider;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/data/fastmatch/usecase/UpdateFastMatchCount;", "", "provider", "Lcom/tinder/domain/fastmatch/provider/FastMatchStatusProvider;", "(Lcom/tinder/domain/fastmatch/provider/FastMatchStatusProvider;)V", "execute", "", "newCount", "", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.fastmatch.usecase.f */
public final class C8651f {
    /* renamed from: a */
    private final FastMatchStatusProvider f30500a;

    @Inject
    public C8651f(@NotNull FastMatchStatusProvider fastMatchStatusProvider) {
        C2668g.b(fastMatchStatusProvider, "provider");
        this.f30500a = fastMatchStatusProvider;
    }

    /* renamed from: a */
    public final void m36886a(int i) {
        this.f30500a.update(FastMatchStatus.copy$default(this.f30500a.get(), i, false, null, 0, Source.UPDATE, 14, null));
    }
}
