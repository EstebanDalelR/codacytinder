package com.tinder.data.toppicks;

import com.tinder.api.model.recs.Rec;
import com.tinder.api.model.recs.Rec.User;
import com.tinder.api.model.toppicks.Tagging;
import com.tinder.common.p076a.C2640a;
import com.tinder.data.adapter.C10746z;
import com.tinder.data.adapter.C2646o;
import com.tinder.domain.recs.model.TopPickTeaserRec;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/data/toppicks/TopPicksTeaserRecDomainApiAdapter;", "Lcom/tinder/data/adapter/DomainApiAdapter;", "Lcom/tinder/domain/recs/model/TopPickTeaserRec;", "Lcom/tinder/api/model/recs/Rec;", "photosAdapter", "Lcom/tinder/data/adapter/PhotoDomainApiAdapter;", "tagDomainApiAdapter", "Lcom/tinder/data/toppicks/TagDomainApiAdapter;", "(Lcom/tinder/data/adapter/PhotoDomainApiAdapter;Lcom/tinder/data/toppicks/TagDomainApiAdapter;)V", "fromApi", "apiModel", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.toppicks.q */
public final class C11028q extends C2646o<TopPickTeaserRec, Rec> {
    /* renamed from: a */
    private final C10746z f35782a;
    /* renamed from: b */
    private final C11007e f35783b;

    @Inject
    public C11028q(@NotNull C10746z c10746z, @NotNull C11007e c11007e) {
        C2668g.b(c10746z, "photosAdapter");
        C2668g.b(c11007e, "tagDomainApiAdapter");
        this.f35782a = c10746z;
        this.f35783b = c11007e;
    }

    @Nullable
    /* renamed from: a */
    public TopPickTeaserRec m43700a(@NotNull Rec rec) {
        C2668g.b(rec, "apiModel");
        User user = rec.user();
        List list = null;
        if (user == null) {
            return (TopPickTeaserRec) null;
        }
        C2640a.a(user.id());
        C2640a.a(rec.expirationTime());
        String id = user.id();
        if (id == null) {
            id = "";
        }
        String str = id;
        Long expirationTime = rec.expirationTime();
        if (expirationTime == null) {
            expirationTime = Long.valueOf(0);
        }
        long longValue = expirationTime.longValue();
        List photos = user.photos();
        if (photos != null) {
            list = this.f35782a.a(photos);
        }
        List list2 = list;
        Tagging tagging = rec.tagging();
        if (tagging != null) {
            C11007e c11007e = this.f35783b;
            C2668g.a(tagging, "it");
            rec = c11007e.m43654a(tagging);
            if (rec != null) {
                return new TopPickTeaserRec(str, false, null, null, longValue, list2, rec, 14, null);
            }
        }
        rec = C19301m.a();
        return new TopPickTeaserRec(str, false, null, null, longValue, list2, rec, 14, null);
    }
}
