package com.tinder.data.toppicks;

import com.tinder.api.model.recs.Rec;
import com.tinder.api.model.toppicks.Tagging;
import com.tinder.data.adapter.C2646o;
import com.tinder.data.adapter.ah;
import com.tinder.domain.recs.model.DefaultUserRec;
import com.tinder.domain.recs.model.TopPickUserRec;
import com.tinder.domain.recs.model.TopPickUserRec.TYPE;
import com.tinder.domain.recs.model.TopPickUserRec.TYPE.Companion;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/data/toppicks/TopPicksRecDomainApiAdapter;", "Lcom/tinder/data/adapter/DomainApiAdapter;", "Lcom/tinder/domain/recs/model/TopPickUserRec;", "Lcom/tinder/api/model/recs/Rec;", "recDomainApiAdapter", "Lcom/tinder/data/adapter/RecDomainApiAdapter;", "tagDomainApiAdapter", "Lcom/tinder/data/toppicks/TagDomainApiAdapter;", "(Lcom/tinder/data/adapter/RecDomainApiAdapter;Lcom/tinder/data/toppicks/TagDomainApiAdapter;)V", "fromApi", "apiModel", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.toppicks.p */
public final class C11027p extends C2646o<TopPickUserRec, Rec> {
    /* renamed from: a */
    private final ah f35780a;
    /* renamed from: b */
    private final C11007e f35781b;

    @Inject
    public C11027p(@NotNull ah ahVar, @NotNull C11007e c11007e) {
        C2668g.b(ahVar, "recDomainApiAdapter");
        C2668g.b(c11007e, "tagDomainApiAdapter");
        this.f35780a = ahVar;
        this.f35781b = c11007e;
    }

    @Nullable
    /* renamed from: a */
    public TopPickUserRec m43698a(@NotNull Rec rec) {
        C2668g.b(rec, "apiModel");
        com.tinder.domain.recs.model.Rec a = this.f35780a.m43098a(rec);
        if (!(a instanceof DefaultUserRec)) {
            a = null;
        }
        DefaultUserRec defaultUserRec = (DefaultUserRec) a;
        if (defaultUserRec == null) {
            return null;
        }
        TYPE from;
        TYPE type;
        Long expirationTime;
        long longValue;
        Tagging tagging;
        Integer topPickType = rec.topPickType();
        if (topPickType != null) {
            Companion companion = TYPE.Companion;
            C2668g.a(topPickType, "it");
            from = companion.from(topPickType.intValue());
            if (from != null) {
                type = from;
                expirationTime = rec.expirationTime();
                if (expirationTime != null) {
                    expirationTime = Long.valueOf(0);
                }
                longValue = expirationTime.longValue();
                tagging = rec.tagging();
                if (tagging != null) {
                    C11007e c11007e = this.f35781b;
                    C2668g.a(tagging, "it");
                    rec = c11007e.m43654a(tagging);
                    if (rec != null) {
                        return new TopPickUserRec(defaultUserRec, type, longValue, rec);
                    }
                }
                rec = C19301m.a();
                return new TopPickUserRec(defaultUserRec, type, longValue, rec);
            }
        }
        from = TYPE.DAILY;
        type = from;
        expirationTime = rec.expirationTime();
        if (expirationTime != null) {
            expirationTime = Long.valueOf(0);
        }
        longValue = expirationTime.longValue();
        tagging = rec.tagging();
        if (tagging != null) {
            C11007e c11007e2 = this.f35781b;
            C2668g.a(tagging, "it");
            rec = c11007e2.m43654a(tagging);
            if (rec != null) {
                return new TopPickUserRec(defaultUserRec, type, longValue, rec);
            }
        }
        rec = C19301m.a();
        return new TopPickUserRec(defaultUserRec, type, longValue, rec);
    }
}
