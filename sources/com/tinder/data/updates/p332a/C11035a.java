package com.tinder.data.updates.p332a;

import com.tinder.api.model.updates.Updates;
import com.tinder.data.adapter.C2646o;
import com.tinder.domain.updates.model.PollInterval;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"Lcom/tinder/data/updates/adapter/PollIntervalDomainApiAdapter;", "Lcom/tinder/data/adapter/DomainApiAdapter;", "Lcom/tinder/domain/updates/model/PollInterval;", "Lcom/tinder/api/model/updates/Updates$PollInterval;", "()V", "fromApi", "apiModel", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.updates.a.a */
public final class C11035a extends C2646o<PollInterval, Updates.PollInterval> {
    @Nullable
    /* renamed from: a */
    public PollInterval m43704a(@NotNull Updates.PollInterval pollInterval) {
        C2668g.b(pollInterval, "apiModel");
        Long persistent = pollInterval.persistent();
        if (persistent == null) {
            persistent = Long.valueOf(0);
        }
        pollInterval = pollInterval.standard();
        if (pollInterval == null) {
            pollInterval = Long.valueOf(0);
        }
        if (persistent.longValue() > 0) {
            if (pollInterval.longValue() > 0) {
                C2668g.a(persistent, "persistent");
                long longValue = persistent.longValue();
                C2668g.a(pollInterval, "standard");
                return new PollInterval(longValue, pollInterval.longValue());
            }
        }
        return null;
    }
}
