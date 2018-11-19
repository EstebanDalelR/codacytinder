package com.tinder.data.toppicks;

import com.tinder.domain.recs.model.Rec;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J,\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/data/toppicks/TopPickResponseDomainApiAdapter;", "", "topPicksRecDomainApiAdapter", "Lcom/tinder/data/toppicks/TopPicksRecDomainApiAdapter;", "topPicksTeaserRecDomainApiAdapter", "Lcom/tinder/data/toppicks/TopPicksTeaserRecDomainApiAdapter;", "(Lcom/tinder/data/toppicks/TopPicksRecDomainApiAdapter;Lcom/tinder/data/toppicks/TopPicksTeaserRecDomainApiAdapter;)V", "fromApi", "", "Lcom/tinder/domain/recs/model/Rec;", "recs", "Lcom/tinder/api/model/recs/Rec;", "teasers", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.toppicks.i */
public final class C8795i {
    /* renamed from: a */
    private final C11027p f30868a;
    /* renamed from: b */
    private final C11028q f30869b;

    @Inject
    public C8795i(@NotNull C11027p c11027p, @NotNull C11028q c11028q) {
        C2668g.b(c11027p, "topPicksRecDomainApiAdapter");
        C2668g.b(c11028q, "topPicksTeaserRecDomainApiAdapter");
        this.f30868a = c11027p;
        this.f30869b = c11028q;
    }

    @NotNull
    /* renamed from: a */
    public final List<Rec> m37430a(@NotNull List<? extends com.tinder.api.model.recs.Rec> list, @NotNull List<? extends com.tinder.api.model.recs.Rec> list2) {
        C2668g.b(list, "recs");
        C2668g.b(list2, "teasers");
        list = this.f30868a.a(list);
        C2668g.a(list, "topPicksRecDomainApiAdapter.fromApi(recs)");
        Collection collection = list;
        list2 = this.f30869b.a(list2);
        C2668g.a(list2, "topPicksTeaserRecDomainApiAdapter.fromApi(teasers)");
        return C19301m.b(collection, list2);
    }
}
