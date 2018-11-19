package com.tinder.data.places.p329a;

import com.tinder.api.model.recs.Rec;
import com.tinder.data.adapter.C2646o;
import com.tinder.data.adapter.ah;
import com.tinder.domain.recs.model.DefaultUserRec;
import com.tinder.domain.recs.model.PlacesUserRec;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/data/places/adapter/PlacesRecDomainApiAdapter;", "Lcom/tinder/data/adapter/DomainApiAdapter;", "Lcom/tinder/domain/recs/model/PlacesUserRec;", "Lcom/tinder/api/model/recs/Rec;", "recDomainApiAdapter", "Lcom/tinder/data/adapter/RecDomainApiAdapter;", "placeId", "", "(Lcom/tinder/data/adapter/RecDomainApiAdapter;Ljava/lang/String;)V", "fromApi", "apiModel", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.places.a.b */
public final class C10889b extends C2646o<PlacesUserRec, Rec> {
    /* renamed from: a */
    private final ah f35573a;
    /* renamed from: b */
    private final String f35574b;

    public C10889b(@NotNull ah ahVar, @NotNull String str) {
        C2668g.b(ahVar, "recDomainApiAdapter");
        C2668g.b(str, "placeId");
        this.f35573a = ahVar;
        this.f35574b = str;
    }

    @NotNull
    /* renamed from: a */
    public PlacesUserRec m43427a(@NotNull Rec rec) {
        C2668g.b(rec, "apiModel");
        com.tinder.domain.recs.model.Rec a = this.f35573a.m43098a(rec);
        if (a == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.domain.recs.model.DefaultUserRec");
        }
        DefaultUserRec defaultUserRec = (DefaultUserRec) a;
        rec = rec.isNew();
        if (rec == null) {
            rec = Boolean.valueOf(null);
        }
        return new PlacesUserRec(defaultUserRec, rec.booleanValue(), this.f35574b);
    }
}
