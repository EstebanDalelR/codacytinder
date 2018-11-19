package com.tinder.superlikeable.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.base.p174d.p175a.C8307c;
import com.tinder.base.p174d.p175a.C8307c.C8306a;
import com.tinder.base.p174d.p175a.C8308d;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.xp;
import com.tinder.etl.event.xp.C9330a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0012B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J!\u0010\u000b\u001a\u00020\f*\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eH\u0002¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/superlikeable/analytics/AddSuperLikeableSessionEvent;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/superlikeable/analytics/AddSuperLikeableSessionEvent$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "imagePerformanceCache", "Lcom/tinder/base/network/interceptor/ImagePerformanceCache;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/base/network/interceptor/ImagePerformanceCache;)V", "execute", "", "request", "recsImagePerformanceData", "Lcom/tinder/etl/event/SuperLikeableSessionEvent$Builder;", "recsPerformanceData", "", "Lcom/tinder/base/network/interceptor/ImagePerformance$ResponseData;", "(Lcom/tinder/etl/event/SuperLikeableSessionEvent$Builder;[Lcom/tinder/base/network/interceptor/ImagePerformance$ResponseData;)Lcom/tinder/etl/event/SuperLikeableSessionEvent$Builder;", "Request", "Source", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
public final class AddSuperLikeableSessionEvent implements VoidUseCase<C15090a> {
    /* renamed from: a */
    private final C2630h f52056a;
    /* renamed from: b */
    private final C8308d f52057b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/tinder/superlikeable/analytics/AddSuperLikeableSessionEvent$Source;", "", "analyticsValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getAnalyticsValue", "()Ljava/lang/String;", "SUPERLIKE", "SKIP", "BACK", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    public enum Source {
        ;
        
        @NotNull
        private final String analyticsValue;

        protected Source(String str) {
            C2668g.b(str, "analyticsValue");
            this.analyticsValue = str;
        }

        @NotNull
        public final String getAnalyticsValue() {
            return this.analyticsValue;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\fHÆ\u0003JK\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lcom/tinder/superlikeable/analytics/AddSuperLikeableSessionEvent$Request;", "", "position", "", "superLikeableSessionId", "", "durationInMillis", "", "numProfilesOpened", "source", "Lcom/tinder/superlikeable/analytics/AddSuperLikeableSessionEvent$Source;", "recImageUrls", "", "(ILjava/lang/String;JILcom/tinder/superlikeable/analytics/AddSuperLikeableSessionEvent$Source;Ljava/util/List;)V", "getDurationInMillis", "()J", "getNumProfilesOpened", "()I", "getPosition", "getRecImageUrls", "()Ljava/util/List;", "getSource", "()Lcom/tinder/superlikeable/analytics/AddSuperLikeableSessionEvent$Source;", "getSuperLikeableSessionId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.analytics.AddSuperLikeableSessionEvent$a */
    public static final class C15090a {
        /* renamed from: a */
        private final int f46938a;
        @NotNull
        /* renamed from: b */
        private final String f46939b;
        /* renamed from: c */
        private final long f46940c;
        /* renamed from: d */
        private final int f46941d;
        @NotNull
        /* renamed from: e */
        private final Source f46942e;
        @NotNull
        /* renamed from: f */
        private final List<String> f46943f;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C15090a) {
                C15090a c15090a = (C15090a) obj;
                if ((this.f46938a == c15090a.f46938a ? 1 : null) != null && C2668g.a(this.f46939b, c15090a.f46939b)) {
                    if ((this.f46940c == c15090a.f46940c ? 1 : null) != null) {
                        return (this.f46941d == c15090a.f46941d ? 1 : null) != null && C2668g.a(this.f46942e, c15090a.f46942e) && C2668g.a(this.f46943f, c15090a.f46943f);
                    }
                }
            }
        }

        public int hashCode() {
            int i = this.f46938a * 31;
            String str = this.f46939b;
            int i2 = 0;
            i = (i + (str != null ? str.hashCode() : 0)) * 31;
            long j = this.f46940c;
            i = (((i + ((int) (j ^ (j >>> 32)))) * 31) + this.f46941d) * 31;
            Source source = this.f46942e;
            i = (i + (source != null ? source.hashCode() : 0)) * 31;
            List list = this.f46943f;
            if (list != null) {
                i2 = list.hashCode();
            }
            return i + i2;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(position=");
            stringBuilder.append(this.f46938a);
            stringBuilder.append(", superLikeableSessionId=");
            stringBuilder.append(this.f46939b);
            stringBuilder.append(", durationInMillis=");
            stringBuilder.append(this.f46940c);
            stringBuilder.append(", numProfilesOpened=");
            stringBuilder.append(this.f46941d);
            stringBuilder.append(", source=");
            stringBuilder.append(this.f46942e);
            stringBuilder.append(", recImageUrls=");
            stringBuilder.append(this.f46943f);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C15090a(int i, @NotNull String str, long j, int i2, @NotNull Source source, @NotNull List<String> list) {
            C2668g.b(str, "superLikeableSessionId");
            C2668g.b(source, "source");
            C2668g.b(list, "recImageUrls");
            this.f46938a = i;
            this.f46939b = str;
            this.f46940c = j;
            this.f46941d = i2;
            this.f46942e = source;
            this.f46943f = list;
        }

        /* renamed from: a */
        public final int m56840a() {
            return this.f46938a;
        }

        @NotNull
        /* renamed from: b */
        public final String m56841b() {
            return this.f46939b;
        }

        /* renamed from: c */
        public final long m56842c() {
            return this.f46940c;
        }

        /* renamed from: d */
        public final int m56843d() {
            return this.f46941d;
        }

        @NotNull
        /* renamed from: e */
        public final Source m56844e() {
            return this.f46942e;
        }

        @NotNull
        /* renamed from: f */
        public final List<String> m56845f() {
            return this.f46943f;
        }
    }

    @Inject
    public AddSuperLikeableSessionEvent(@NotNull C2630h c2630h, @NotNull C8308d c8308d) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c8308d, "imagePerformanceCache");
        this.f52056a = c2630h;
        this.f52057b = c8308d;
    }

    public /* synthetic */ void execute(Object obj) {
        m62494a((C15090a) obj);
    }

    /* renamed from: a */
    public void m62494a(@NotNull C15090a c15090a) {
        C2668g.b(c15090a, "request");
        C8306a[] c8306aArr = new C8306a[4];
        Iterable<String> f = c15090a.m56845f();
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) f, 10));
        for (String a : f) {
            arrayList.add(this.f52057b.a(a));
        }
        Collection arrayList2 = new ArrayList();
        int i = 0;
        for (C8307c c8307c : (List) arrayList) {
            C8306a c8306a;
            int i2 = i + 1;
            if (c8307c != null) {
                List a2 = c8307c.a();
                if (a2 != null) {
                    c8306a = (C8306a) C19299w.m68829f(a2);
                    c8306aArr[i] = c8306a;
                    arrayList2.add(C15813i.f49016a);
                    i = i2;
                }
            }
            c8306a = null;
            c8306aArr[i] = c8306a;
            arrayList2.add(C15813i.f49016a);
            i = i2;
        }
        List list = (List) arrayList2;
        c15090a = xp.a().c(Integer.valueOf(c15090a.m56840a())).a(c15090a.m56841b()).a(Long.valueOf(c15090a.m56842c())).b(Integer.valueOf(c15090a.m56843d())).b(c15090a.m56844e().toString());
        C2668g.a(c15090a, "SuperLikeableSessionEven…equest.source.toString())");
        this.f52056a.a(m62493a(c15090a, c8306aArr).a());
    }

    /* renamed from: a */
    private final C9330a m62493a(@NotNull C9330a c9330a, C8306a[] c8306aArr) {
        C8306a c8306a = c8306aArr[0];
        C8306a c8306a2 = c8306aArr[1];
        C8306a c8306a3 = c8306aArr[2];
        c8306aArr = c8306aArr[3];
        if (c8306a != null) {
            c9330a.d(Integer.valueOf(c8306a.b()));
            c9330a.e(Long.valueOf(c8306a.a()));
        }
        if (c8306a2 != null) {
            c9330a.f(Integer.valueOf(c8306a2.b()));
            c9330a.g(Long.valueOf(c8306a2.a()));
        }
        if (c8306a3 != null) {
            c9330a.h(Integer.valueOf(c8306a3.b()));
            c9330a.i(Long.valueOf(c8306a3.a()));
        }
        if (c8306aArr != null) {
            c9330a.j(Integer.valueOf(c8306aArr.b()));
            c9330a.k(Long.valueOf(c8306aArr.a()));
        }
        return c9330a;
    }
}
