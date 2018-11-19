package com.tinder.data.places;

import com.tinder.domain.recs.model.PlacesUserRec;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/data/places/PlaceWorkerRecsUpdate;", "", "rec", "Lcom/tinder/domain/recs/model/PlacesUserRec;", "count", "", "(Lcom/tinder/domain/recs/model/PlacesUserRec;I)V", "getCount", "()I", "getRec", "()Lcom/tinder/domain/recs/model/PlacesUserRec;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.places.d */
final class C8743d {
    @NotNull
    /* renamed from: a */
    private final PlacesUserRec f30728a;
    /* renamed from: b */
    private final int f30729b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8743d) {
            C8743d c8743d = (C8743d) obj;
            if (C2668g.a(this.f30728a, c8743d.f30728a)) {
                if ((this.f30729b == c8743d.f30729b ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        PlacesUserRec placesUserRec = this.f30728a;
        return ((placesUserRec != null ? placesUserRec.hashCode() : 0) * 31) + this.f30729b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PlaceWorkerRecsUpdate(rec=");
        stringBuilder.append(this.f30728a);
        stringBuilder.append(", count=");
        stringBuilder.append(this.f30729b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C8743d(@NotNull PlacesUserRec placesUserRec, int i) {
        C2668g.b(placesUserRec, "rec");
        this.f30728a = placesUserRec;
        this.f30729b = i;
    }

    @NotNull
    /* renamed from: a */
    public final PlacesUserRec m37254a() {
        return this.f30728a;
    }

    /* renamed from: b */
    public final int m37255b() {
        return this.f30729b;
    }
}
