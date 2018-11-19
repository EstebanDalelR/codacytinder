package com.tinder.superlikeable.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.xr;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/superlikeable/analytics/AddSuperLikeableViewEvent;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/superlikeable/analytics/AddSuperLikeableViewEvent$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "execute", "", "request", "Request", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.superlikeable.analytics.d */
public final class C16895d implements VoidUseCase<C15093a> {
    /* renamed from: a */
    private final C2630h f52058a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003Jm\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015¨\u0006+"}, d2 = {"Lcom/tinder/superlikeable/analytics/AddSuperLikeableViewEvent$Request;", "", "otherId0", "", "age0", "", "otherId1", "age1", "otherId2", "age2", "otherId3", "age3", "position", "superLikeableSessionId", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;IILjava/lang/String;)V", "getAge0", "()I", "getAge1", "getAge2", "getAge3", "getOtherId0", "()Ljava/lang/String;", "getOtherId1", "getOtherId2", "getOtherId3", "getPosition", "getSuperLikeableSessionId", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.analytics.d$a */
    public static final class C15093a {
        @NotNull
        /* renamed from: a */
        private final String f46954a;
        /* renamed from: b */
        private final int f46955b;
        @NotNull
        /* renamed from: c */
        private final String f46956c;
        /* renamed from: d */
        private final int f46957d;
        @NotNull
        /* renamed from: e */
        private final String f46958e;
        /* renamed from: f */
        private final int f46959f;
        @NotNull
        /* renamed from: g */
        private final String f46960g;
        /* renamed from: h */
        private final int f46961h;
        /* renamed from: i */
        private final int f46962i;
        @NotNull
        /* renamed from: j */
        private final String f46963j;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C15093a) {
                C15093a c15093a = (C15093a) obj;
                if (C2668g.a(this.f46954a, c15093a.f46954a)) {
                    if ((this.f46955b == c15093a.f46955b ? 1 : null) != null && C2668g.a(this.f46956c, c15093a.f46956c)) {
                        if ((this.f46957d == c15093a.f46957d ? 1 : null) != null && C2668g.a(this.f46958e, c15093a.f46958e)) {
                            if ((this.f46959f == c15093a.f46959f ? 1 : null) != null && C2668g.a(this.f46960g, c15093a.f46960g)) {
                                if ((this.f46961h == c15093a.f46961h ? 1 : null) != null) {
                                    return (this.f46962i == c15093a.f46962i ? 1 : null) != null && C2668g.a(this.f46963j, c15093a.f46963j);
                                }
                            }
                        }
                    }
                }
            }
        }

        public int hashCode() {
            String str = this.f46954a;
            int i = 0;
            int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f46955b) * 31;
            String str2 = this.f46956c;
            hashCode = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f46957d) * 31;
            str2 = this.f46958e;
            hashCode = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f46959f) * 31;
            str2 = this.f46960g;
            hashCode = (((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f46961h) * 31) + this.f46962i) * 31;
            str2 = this.f46963j;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(otherId0=");
            stringBuilder.append(this.f46954a);
            stringBuilder.append(", age0=");
            stringBuilder.append(this.f46955b);
            stringBuilder.append(", otherId1=");
            stringBuilder.append(this.f46956c);
            stringBuilder.append(", age1=");
            stringBuilder.append(this.f46957d);
            stringBuilder.append(", otherId2=");
            stringBuilder.append(this.f46958e);
            stringBuilder.append(", age2=");
            stringBuilder.append(this.f46959f);
            stringBuilder.append(", otherId3=");
            stringBuilder.append(this.f46960g);
            stringBuilder.append(", age3=");
            stringBuilder.append(this.f46961h);
            stringBuilder.append(", position=");
            stringBuilder.append(this.f46962i);
            stringBuilder.append(", superLikeableSessionId=");
            stringBuilder.append(this.f46963j);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C15093a(@NotNull String str, int i, @NotNull String str2, int i2, @NotNull String str3, int i3, @NotNull String str4, int i4, int i5, @NotNull String str5) {
            C2668g.b(str, "otherId0");
            C2668g.b(str2, "otherId1");
            C2668g.b(str3, "otherId2");
            C2668g.b(str4, "otherId3");
            C2668g.b(str5, "superLikeableSessionId");
            this.f46954a = str;
            this.f46955b = i;
            this.f46956c = str2;
            this.f46957d = i2;
            this.f46958e = str3;
            this.f46959f = i3;
            this.f46960g = str4;
            this.f46961h = i4;
            this.f46962i = i5;
            this.f46963j = str5;
        }

        @NotNull
        /* renamed from: a */
        public final String m56857a() {
            return this.f46954a;
        }

        /* renamed from: b */
        public final int m56858b() {
            return this.f46955b;
        }

        @NotNull
        /* renamed from: c */
        public final String m56859c() {
            return this.f46956c;
        }

        /* renamed from: d */
        public final int m56860d() {
            return this.f46957d;
        }

        @NotNull
        /* renamed from: e */
        public final String m56861e() {
            return this.f46958e;
        }

        /* renamed from: f */
        public final int m56862f() {
            return this.f46959f;
        }

        @NotNull
        /* renamed from: g */
        public final String m56863g() {
            return this.f46960g;
        }

        /* renamed from: h */
        public final int m56864h() {
            return this.f46961h;
        }

        /* renamed from: i */
        public final int m56865i() {
            return this.f46962i;
        }

        @NotNull
        /* renamed from: j */
        public final String m56866j() {
            return this.f46963j;
        }
    }

    @Inject
    public C16895d(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f52058a = c2630h;
    }

    public /* synthetic */ void execute(Object obj) {
        m62495a((C15093a) obj);
    }

    /* renamed from: a */
    public void m62495a(@NotNull C15093a c15093a) {
        C2668g.b(c15093a, "request");
        this.f52058a.a(xr.a().a(c15093a.m56857a()).a(Integer.valueOf(c15093a.m56858b())).b(c15093a.m56859c()).b(Integer.valueOf(c15093a.m56860d())).c(c15093a.m56861e()).c(Integer.valueOf(c15093a.m56862f())).d(c15093a.m56863g()).d(Integer.valueOf(c15093a.m56864h())).e(Integer.valueOf(c15093a.m56865i())).e(c15093a.m56866j()).a());
    }
}
