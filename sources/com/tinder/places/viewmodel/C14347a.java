package com.tinder.places.viewmodel;

import com.tinder.domain.places.model.Place.Alternative;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/tinder/places/viewmodel/PlaceCardAlternativeViewModel;", "", "placeId", "", "alternatives", "", "Lcom/tinder/domain/places/model/Place$Alternative;", "(Ljava/lang/String;Ljava/util/List;)V", "getAlternatives", "()Ljava/util/List;", "getPlaceId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "places_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.viewmodel.a */
public final class C14347a {
    @NotNull
    /* renamed from: a */
    private final String f45512a;
    @NotNull
    /* renamed from: b */
    private final List<Alternative> f45513b;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C14347a) {
                C14347a c14347a = (C14347a) obj;
                if (C2668g.a(this.f45512a, c14347a.f45512a) && C2668g.a(this.f45513b, c14347a.f45513b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f45512a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.f45513b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PlaceCardAlternativeViewModel(placeId=");
        stringBuilder.append(this.f45512a);
        stringBuilder.append(", alternatives=");
        stringBuilder.append(this.f45513b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C14347a(@NotNull String str, @NotNull List<Alternative> list) {
        C2668g.b(str, "placeId");
        C2668g.b(list, "alternatives");
        this.f45512a = str;
        this.f45513b = list;
    }

    @NotNull
    /* renamed from: a */
    public final String m54650a() {
        return this.f45512a;
    }

    @NotNull
    /* renamed from: b */
    public final List<Alternative> m54651b() {
        return this.f45513b;
    }
}
