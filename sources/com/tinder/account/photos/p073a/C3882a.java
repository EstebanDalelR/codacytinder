package com.tinder.account.photos.p073a;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.EtlEvent;
import com.tinder.etl.event.rr;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/account/photos/analytics/AddProfileDeletePhotoEvent;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/account/photos/analytics/AddProfileDeletePhotoEvent$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "execute", "", "request", "Request", "account_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.account.photos.a.a */
public final class C3882a implements VoidUseCase<C2616a> {
    /* renamed from: a */
    private final C2630h f12153a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/tinder/account/photos/analytics/AddProfileDeletePhotoEvent$Request;", "", "photoId", "", "(Ljava/lang/String;)V", "getPhotoId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "account_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.account.photos.a.a$a */
    public static final class C2616a {
        @NotNull
        /* renamed from: a */
        private final String f8154a;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C2616a) {
                    if (C2668g.m10308a(this.f8154a, ((C2616a) obj).f8154a)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f8154a;
            return str != null ? str.hashCode() : 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(photoId=");
            stringBuilder.append(this.f8154a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C2616a(@NotNull String str) {
            C2668g.m10309b(str, "photoId");
            this.f8154a = str;
        }

        @NotNull
        /* renamed from: a */
        public final String m9784a() {
            return this.f8154a;
        }
    }

    @Inject
    public C3882a(@NotNull C2630h c2630h) {
        C2668g.m10309b(c2630h, "fireworks");
        this.f12153a = c2630h;
    }

    public /* synthetic */ void execute(Object obj) {
        m14627a((C2616a) obj);
    }

    /* renamed from: a */
    public void m14627a(@NotNull C2616a c2616a) {
        C2668g.m10309b(c2616a, "request");
        this.f12153a.m9860a((EtlEvent) rr.a().a(c2616a.m9784a()).a());
    }
}
