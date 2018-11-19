package com.tinder.places.viewmodel;

import com.tinder.domain.places.model.Place;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/tinder/places/viewmodel/PlaceSettingViewModel;", "", "id", "", "name", "selected", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getName", "getSelected", "()Z", "setSelected", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "Factory", "places_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.viewmodel.d */
public final class C14353d {
    /* renamed from: a */
    public static final C14352a f45532a = new C14352a();
    @NotNull
    /* renamed from: b */
    private final String f45533b;
    @NotNull
    /* renamed from: c */
    private final String f45534c;
    /* renamed from: d */
    private boolean f45535d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/places/viewmodel/PlaceSettingViewModel$Factory;", "", "()V", "fromPlace", "Lcom/tinder/places/viewmodel/PlaceSettingViewModel;", "place", "Lcom/tinder/domain/places/model/Place;", "places_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.viewmodel.d$a */
    public static final class C14352a {
        private C14352a() {
        }

        @NotNull
        /* renamed from: a */
        public final C14353d m54671a(@NotNull Place place) {
            C2668g.b(place, "place");
            return new C14353d(String.valueOf(place.getId()), place.getName(), false);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14353d) {
            C14353d c14353d = (C14353d) obj;
            if (C2668g.a(this.f45533b, c14353d.f45533b) && C2668g.a(this.f45534c, c14353d.f45534c)) {
                if ((this.f45535d == c14353d.f45535d ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f45533b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f45534c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        i = this.f45535d;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PlaceSettingViewModel(id=");
        stringBuilder.append(this.f45533b);
        stringBuilder.append(", name=");
        stringBuilder.append(this.f45534c);
        stringBuilder.append(", selected=");
        stringBuilder.append(this.f45535d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C14353d(@NotNull String str, @NotNull String str2, boolean z) {
        C2668g.b(str, "id");
        C2668g.b(str2, "name");
        this.f45533b = str;
        this.f45534c = str2;
        this.f45535d = z;
    }

    @NotNull
    /* renamed from: a */
    public final String m54672a() {
        return this.f45533b;
    }

    @NotNull
    /* renamed from: b */
    public final String m54674b() {
        return this.f45534c;
    }

    /* renamed from: a */
    public final void m54673a(boolean z) {
        this.f45535d = z;
    }

    /* renamed from: c */
    public final boolean m54675c() {
        return this.f45535d;
    }
}
