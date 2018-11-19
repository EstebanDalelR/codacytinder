package com.tinder.base.p174d.p175a;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/tinder/base/network/interceptor/ImagePerformance;", "", "urlPath", "", "responseDataRecords", "", "Lcom/tinder/base/network/interceptor/ImagePerformance$ResponseData;", "(Ljava/lang/String;Ljava/util/List;)V", "getResponseDataRecords", "()Ljava/util/List;", "getUrlPath", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ResponseData", "base_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.base.d.a.c */
public final class C8307c {
    @NotNull
    /* renamed from: a */
    private final String f29585a;
    @NotNull
    /* renamed from: b */
    private final List<C8306a> f29586b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/base/network/interceptor/ImagePerformance$ResponseData;", "", "time", "", "statusCode", "", "(JI)V", "getStatusCode", "()I", "getTime", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "base_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.base.d.a.c$a */
    public static final class C8306a {
        /* renamed from: a */
        private final long f29583a;
        /* renamed from: b */
        private final int f29584b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8306a) {
                C8306a c8306a = (C8306a) obj;
                if ((this.f29583a == c8306a.f29583a ? 1 : null) != null) {
                    if ((this.f29584b == c8306a.f29584b ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            long j = this.f29583a;
            return (((int) (j ^ (j >>> 32))) * 31) + this.f29584b;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ResponseData(time=");
            stringBuilder.append(this.f29583a);
            stringBuilder.append(", statusCode=");
            stringBuilder.append(this.f29584b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8306a(long j, int i) {
            this.f29583a = j;
            this.f29584b = i;
        }

        /* renamed from: a */
        public final long m35401a() {
            return this.f29583a;
        }

        /* renamed from: b */
        public final int m35402b() {
            return this.f29584b;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8307c) {
                C8307c c8307c = (C8307c) obj;
                if (C2668g.a(this.f29585a, c8307c.f29585a) && C2668g.a(this.f29586b, c8307c.f29586b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f29585a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.f29586b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ImagePerformance(urlPath=");
        stringBuilder.append(this.f29585a);
        stringBuilder.append(", responseDataRecords=");
        stringBuilder.append(this.f29586b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C8307c(@NotNull String str, @NotNull List<C8306a> list) {
        C2668g.b(str, "urlPath");
        C2668g.b(list, "responseDataRecords");
        this.f29585a = str;
        this.f29586b = list;
    }

    @NotNull
    /* renamed from: a */
    public final List<C8306a> m35403a() {
        return this.f29586b;
    }
}
