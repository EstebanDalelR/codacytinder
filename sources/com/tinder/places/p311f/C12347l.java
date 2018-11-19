package com.tinder.places.p311f;

import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.domain.places.PlacesRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/places/usecase/UpdateCorrectLocation;", "Lcom/tinder/domain/common/usecase/CompletableUseCase;", "Lcom/tinder/places/usecase/UpdateCorrectLocation$UpdateCorrectLocationRequest;", "placesRepository", "Lcom/tinder/domain/places/PlacesRepository;", "(Lcom/tinder/domain/places/PlacesRepository;)V", "execute", "Lrx/Completable;", "request", "UpdateCorrectLocationRequest", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.f.l */
public final class C12347l implements CompletableUseCase<C10209a> {
    /* renamed from: a */
    private final PlacesRepository f39954a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tinder/places/usecase/UpdateCorrectLocation$UpdateCorrectLocationRequest;", "", "newPlaceId", "", "oldPlaceId", "(Ljava/lang/String;Ljava/lang/String;)V", "getNewPlaceId", "()Ljava/lang/String;", "getOldPlaceId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.f.l$a */
    public static final class C10209a {
        @NotNull
        /* renamed from: a */
        private final String f33276a;
        @NotNull
        /* renamed from: b */
        private final String f33277b;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C10209a) {
                    C10209a c10209a = (C10209a) obj;
                    if (C2668g.a(this.f33276a, c10209a.f33276a) && C2668g.a(this.f33277b, c10209a.f33277b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f33276a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f33277b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("UpdateCorrectLocationRequest(newPlaceId=");
            stringBuilder.append(this.f33276a);
            stringBuilder.append(", oldPlaceId=");
            stringBuilder.append(this.f33277b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C10209a(@NotNull String str, @NotNull String str2) {
            C2668g.b(str, "newPlaceId");
            C2668g.b(str2, "oldPlaceId");
            this.f33276a = str;
            this.f33277b = str2;
        }

        @NotNull
        /* renamed from: a */
        public final String m41529a() {
            return this.f33276a;
        }

        @NotNull
        /* renamed from: b */
        public final String m41530b() {
            return this.f33277b;
        }
    }

    @Inject
    public C12347l(@NotNull PlacesRepository placesRepository) {
        C2668g.b(placesRepository, "placesRepository");
        this.f39954a = placesRepository;
    }

    public /* synthetic */ Completable execute(Object obj) {
        return m48733a((C10209a) obj);
    }

    @NotNull
    /* renamed from: a */
    public Completable m48733a(@NotNull C10209a c10209a) {
        C2668g.b(c10209a, "request");
        return this.f39954a.correctPlace(c10209a.m41529a(), c10209a.m41530b());
    }
}
