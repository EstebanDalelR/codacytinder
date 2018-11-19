package com.tinder.account.photos.photogrid.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.EtlEvent;
import com.tinder.etl.event.rn;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\t\nB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/account/photos/photogrid/analytics/AddProfileAddPhotoEvent;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/account/photos/photogrid/analytics/AddProfileAddPhotoEvent$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "execute", "", "request", "From", "Request", "account_release"}, k = 1, mv = {1, 1, 10})
public final class AddProfileAddPhotoEvent implements VoidUseCase<C2625a> {
    /* renamed from: a */
    private final C2630h f12197a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/tinder/account/photos/photogrid/analytics/AddProfileAddPhotoEvent$From;", "", "analyticsValue", "", "(Ljava/lang/String;ILjava/lang/Number;)V", "getAnalyticsValue", "()Ljava/lang/Number;", "FACEBOOK", "GALLERY", "account_release"}, k = 1, mv = {1, 1, 10})
    public enum From {
        ;
        
        @NotNull
        private final Number analyticsValue;

        protected From(Number number) {
            C2668g.m10309b(number, "analyticsValue");
            this.analyticsValue = number;
        }

        @NotNull
        public final Number getAnalyticsValue() {
            return this.analyticsValue;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/tinder/account/photos/photogrid/analytics/AddProfileAddPhotoEvent$Request;", "", "source", "Lcom/tinder/account/photos/photogrid/analytics/ProfileEditSource;", "from", "Lcom/tinder/account/photos/photogrid/analytics/AddProfileAddPhotoEvent$From;", "toIdx", "", "(Lcom/tinder/account/photos/photogrid/analytics/ProfileEditSource;Lcom/tinder/account/photos/photogrid/analytics/AddProfileAddPhotoEvent$From;I)V", "getFrom", "()Lcom/tinder/account/photos/photogrid/analytics/AddProfileAddPhotoEvent$From;", "getSource", "()Lcom/tinder/account/photos/photogrid/analytics/ProfileEditSource;", "getToIdx", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "account_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.account.photos.photogrid.analytics.AddProfileAddPhotoEvent$a */
    public static final class C2625a {
        @NotNull
        /* renamed from: a */
        private final ProfileEditSource f8195a;
        @NotNull
        /* renamed from: b */
        private final From f8196b;
        /* renamed from: c */
        private final int f8197c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C2625a) {
                C2625a c2625a = (C2625a) obj;
                if (C2668g.m10308a(this.f8195a, c2625a.f8195a) && C2668g.m10308a(this.f8196b, c2625a.f8196b)) {
                    if ((this.f8197c == c2625a.f8197c ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            ProfileEditSource profileEditSource = this.f8195a;
            int i = 0;
            int hashCode = (profileEditSource != null ? profileEditSource.hashCode() : 0) * 31;
            From from = this.f8196b;
            if (from != null) {
                i = from.hashCode();
            }
            return ((hashCode + i) * 31) + this.f8197c;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(source=");
            stringBuilder.append(this.f8195a);
            stringBuilder.append(", from=");
            stringBuilder.append(this.f8196b);
            stringBuilder.append(", toIdx=");
            stringBuilder.append(this.f8197c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C2625a(@NotNull ProfileEditSource profileEditSource, @NotNull From from, int i) {
            C2668g.m10309b(profileEditSource, "source");
            C2668g.m10309b(from, ManagerWebServices.PARAM_FROM);
            this.f8195a = profileEditSource;
            this.f8196b = from;
            this.f8197c = i;
        }

        @NotNull
        /* renamed from: a */
        public final ProfileEditSource m9842a() {
            return this.f8195a;
        }

        @NotNull
        /* renamed from: b */
        public final From m9843b() {
            return this.f8196b;
        }

        /* renamed from: c */
        public final int m9844c() {
            return this.f8197c;
        }
    }

    @Inject
    public AddProfileAddPhotoEvent(@NotNull C2630h c2630h) {
        C2668g.m10309b(c2630h, "fireworks");
        this.f12197a = c2630h;
    }

    public /* synthetic */ void execute(Object obj) {
        m14672a((C2625a) obj);
    }

    /* renamed from: a */
    public void m14672a(@NotNull C2625a c2625a) {
        C2668g.m10309b(c2625a, "request");
        this.f12197a.m9860a((EtlEvent) rn.a().b(c2625a.m9842a().getAnalyticsValue()).a(c2625a.m9843b().getAnalyticsValue()).c(Integer.valueOf(c2625a.m9844c())).a());
    }
}
