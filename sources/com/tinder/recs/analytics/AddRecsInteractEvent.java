package com.tinder.recs.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.ty;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Single;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\f\rB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/recs/analytics/AddRecsInteractEvent;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/recs/analytics/AddRecsInteractEvent$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "createRecsInteractEvent", "Lrx/Single;", "Lcom/tinder/etl/event/RecsInteractEvent;", "request", "execute", "", "Request", "Type", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class AddRecsInteractEvent implements VoidUseCase<Request> {
    private final C2630h fireworks;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/tinder/recs/analytics/AddRecsInteractEvent$Request;", "", "type", "", "radius", "", "minTargetAge", "", "maxTargetAge", "newRadius", "newMinTargetAge", "newMaxTargetAge", "(Ljava/lang/String;FIIFII)V", "getMaxTargetAge", "()I", "getMinTargetAge", "getNewMaxTargetAge", "getNewMinTargetAge", "getNewRadius", "()F", "getRadius", "getType", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class Request {
        private final int maxTargetAge;
        private final int minTargetAge;
        private final int newMaxTargetAge;
        private final int newMinTargetAge;
        private final float newRadius;
        private final float radius;
        @NotNull
        private final String type;

        @NotNull
        public static /* synthetic */ Request copy$default(Request request, String str, float f, int i, int i2, float f2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                str = request.type;
            }
            if ((i5 & 2) != 0) {
                f = request.radius;
            }
            float f3 = f;
            if ((i5 & 4) != 0) {
                i = request.minTargetAge;
            }
            int i6 = i;
            if ((i5 & 8) != 0) {
                i2 = request.maxTargetAge;
            }
            int i7 = i2;
            if ((i5 & 16) != 0) {
                f2 = request.newRadius;
            }
            float f4 = f2;
            if ((i5 & 32) != 0) {
                i3 = request.newMinTargetAge;
            }
            int i8 = i3;
            if ((i5 & 64) != 0) {
                i4 = request.newMaxTargetAge;
            }
            return request.copy(str, f3, i6, i7, f4, i8, i4);
        }

        @NotNull
        public final String component1() {
            return this.type;
        }

        public final float component2() {
            return this.radius;
        }

        public final int component3() {
            return this.minTargetAge;
        }

        public final int component4() {
            return this.maxTargetAge;
        }

        public final float component5() {
            return this.newRadius;
        }

        public final int component6() {
            return this.newMinTargetAge;
        }

        public final int component7() {
            return this.newMaxTargetAge;
        }

        @NotNull
        public final Request copy(@NotNull String str, float f, int i, int i2, float f2, int i3, int i4) {
            String str2 = str;
            C2668g.b(str2, "type");
            return new Request(str2, f, i, i2, f2, i3, i4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Request) {
                Request request = (Request) obj;
                if (C2668g.a(this.type, request.type) && Float.compare(this.radius, request.radius) == 0) {
                    if ((this.minTargetAge == request.minTargetAge ? 1 : null) != null) {
                        if ((this.maxTargetAge == request.maxTargetAge ? 1 : null) != null && Float.compare(this.newRadius, request.newRadius) == 0) {
                            if ((this.newMinTargetAge == request.newMinTargetAge ? 1 : null) != null) {
                                if ((this.newMaxTargetAge == request.newMaxTargetAge ? 1 : null) != null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            String str = this.type;
            return ((((((((((((str != null ? str.hashCode() : 0) * 31) + Float.floatToIntBits(this.radius)) * 31) + this.minTargetAge) * 31) + this.maxTargetAge) * 31) + Float.floatToIntBits(this.newRadius)) * 31) + this.newMinTargetAge) * 31) + this.newMaxTargetAge;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(type=");
            stringBuilder.append(this.type);
            stringBuilder.append(", radius=");
            stringBuilder.append(this.radius);
            stringBuilder.append(", minTargetAge=");
            stringBuilder.append(this.minTargetAge);
            stringBuilder.append(", maxTargetAge=");
            stringBuilder.append(this.maxTargetAge);
            stringBuilder.append(", newRadius=");
            stringBuilder.append(this.newRadius);
            stringBuilder.append(", newMinTargetAge=");
            stringBuilder.append(this.newMinTargetAge);
            stringBuilder.append(", newMaxTargetAge=");
            stringBuilder.append(this.newMaxTargetAge);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public Request(@NotNull String str, float f, int i, int i2, float f2, int i3, int i4) {
            C2668g.b(str, "type");
            this.type = str;
            this.radius = f;
            this.minTargetAge = i;
            this.maxTargetAge = i2;
            this.newRadius = f2;
            this.newMinTargetAge = i3;
            this.newMaxTargetAge = i4;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public final float getRadius() {
            return this.radius;
        }

        public final int getMinTargetAge() {
            return this.minTargetAge;
        }

        public final int getMaxTargetAge() {
            return this.maxTargetAge;
        }

        public final float getNewRadius() {
            return this.newRadius;
        }

        public final int getNewMinTargetAge() {
            return this.newMinTargetAge;
        }

        public final int getNewMaxTargetAge() {
            return this.newMaxTargetAge;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/tinder/recs/analytics/AddRecsInteractEvent$Type;", "", "analyticsValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getAnalyticsValue", "()Ljava/lang/String;", "SETTINGS", "SETTINGS_UPDATE", "SETTINGS_CANCEL", "SETTINGS_BACKGROUND", "PASSPORT", "CARD_STACK", "TOP_PICKS_ALC", "TOP_PICKS_GRID", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum Type {
        ;
        
        @NotNull
        private final String analyticsValue;

        protected Type(String str) {
            C2668g.b(str, "analyticsValue");
            this.analyticsValue = str;
        }

        @NotNull
        public final String getAnalyticsValue() {
            return this.analyticsValue;
        }
    }

    @Inject
    public AddRecsInteractEvent(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.fireworks = c2630h;
    }

    public void execute(@NotNull Request request) {
        C2668g.b(request, "request");
        createRecsInteractEvent(request).c(new AddRecsInteractEvent$execute$1(this)).b(Schedulers.io()).a(AddRecsInteractEvent$execute$2.INSTANCE, AddRecsInteractEvent$execute$3.INSTANCE);
    }

    private final Single<ty> createRecsInteractEvent(Request request) {
        float radius = request.getRadius();
        int minTargetAge = request.getMinTargetAge();
        int maxTargetAge = request.getMaxTargetAge();
        float newRadius = request.getNewRadius();
        int newMinTargetAge = request.getNewMinTargetAge();
        int newMaxTargetAge = request.getNewMaxTargetAge();
        request = ty.a().a(request.getType()).f(Float.valueOf(radius)).b(Integer.valueOf(minTargetAge)).a(Integer.valueOf(maxTargetAge));
        if (newRadius != radius) {
            request.e(Float.valueOf(newRadius));
        }
        if (newMinTargetAge != minTargetAge) {
            request.d(Integer.valueOf(newMinTargetAge));
        }
        if (newMaxTargetAge != maxTargetAge) {
            request.c(Integer.valueOf(newMaxTargetAge));
        }
        request = Single.a(request.a());
        C2668g.a(request, "Single.just(it)");
        C2668g.a(request, "with(request) {\n        …}.let { Single.just(it) }");
        return request;
    }
}
