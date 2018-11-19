package com.tinder.data.places;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/tinder/data/places/PerformanceApiEvent;", "", "()V", "key", "", "getKey", "()Ljava/lang/String;", "Error", "Finished", "Started", "Lcom/tinder/data/places/PerformanceApiEvent$Started;", "Lcom/tinder/data/places/PerformanceApiEvent$Finished;", "Lcom/tinder/data/places/PerformanceApiEvent$Error;", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.places.b */
public abstract class C8741b {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BU\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b¢\u0006\u0002\u0010\rBG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b¢\u0006\u0002\u0010\u0011J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0019\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000bHÆ\u0003J\\\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\t2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010(\u001a\u00020\tHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u0010\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006*"}, d2 = {"Lcom/tinder/data/places/PerformanceApiEvent$Error;", "Lcom/tinder/data/places/PerformanceApiEvent;", "key", "", "response", "Lretrofit2/Response;", "obfuscation", "Lkotlin/Pair;", "errorCode", "", "map", "", "", "(Ljava/lang/String;Lretrofit2/Response;Lkotlin/Pair;Ljava/lang/Integer;Ljava/util/Map;)V", "endPoint", "method", "statusCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Ljava/util/Map;)V", "getEndPoint", "()Ljava/lang/String;", "getErrorCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getKey", "getMap", "()Ljava/util/Map;", "getMethod", "getStatusCode", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Ljava/util/Map;)Lcom/tinder/data/places/PerformanceApiEvent$Error;", "equals", "", "other", "hashCode", "toString", "data_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.places.b$a */
    public static final class C10890a extends C8741b {
        @NotNull
        /* renamed from: a */
        private final String f35575a;
        @NotNull
        /* renamed from: b */
        private final String f35576b;
        @NotNull
        /* renamed from: c */
        private final String f35577c;
        /* renamed from: d */
        private final int f35578d;
        @Nullable
        /* renamed from: e */
        private final Integer f35579e;
        @Nullable
        /* renamed from: f */
        private final Map<String, Object> f35580f;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C10890a) {
                C10890a c10890a = (C10890a) obj;
                if (C2668g.a(mo9820a(), c10890a.mo9820a()) && C2668g.a(this.f35576b, c10890a.f35576b) && C2668g.a(this.f35577c, c10890a.f35577c)) {
                    return (this.f35578d == c10890a.f35578d ? 1 : null) != null && C2668g.a(this.f35579e, c10890a.f35579e) && C2668g.a(this.f35580f, c10890a.f35580f);
                }
            }
        }

        public int hashCode() {
            String a = mo9820a();
            int i = 0;
            int hashCode = (a != null ? a.hashCode() : 0) * 31;
            String str = this.f35576b;
            hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            str = this.f35577c;
            hashCode = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f35578d) * 31;
            Integer num = this.f35579e;
            hashCode = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
            Map map = this.f35580f;
            if (map != null) {
                i = map.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error(key=");
            stringBuilder.append(mo9820a());
            stringBuilder.append(", endPoint=");
            stringBuilder.append(this.f35576b);
            stringBuilder.append(", method=");
            stringBuilder.append(this.f35577c);
            stringBuilder.append(", statusCode=");
            stringBuilder.append(this.f35578d);
            stringBuilder.append(", errorCode=");
            stringBuilder.append(this.f35579e);
            stringBuilder.append(", map=");
            stringBuilder.append(this.f35580f);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        @NotNull
        /* renamed from: a */
        public String mo9820a() {
            return this.f35575a;
        }

        @NotNull
        /* renamed from: b */
        public final String m43430b() {
            return this.f35576b;
        }

        @NotNull
        /* renamed from: c */
        public final String m43431c() {
            return this.f35577c;
        }

        /* renamed from: d */
        public final int m43432d() {
            return this.f35578d;
        }

        @Nullable
        /* renamed from: e */
        public final Integer m43433e() {
            return this.f35579e;
        }

        @Nullable
        /* renamed from: f */
        public final Map<String, Object> m43434f() {
            return this.f35580f;
        }

        public C10890a(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, @Nullable Integer num, @Nullable Map<String, ? extends Object> map) {
            C2668g.b(str, "key");
            C2668g.b(str2, "endPoint");
            C2668g.b(str3, "method");
            super();
            this.f35575a = str;
            this.f35576b = str2;
            this.f35577c = str3;
            this.f35578d = i;
            this.f35579e = num;
            this.f35580f = map;
        }

        public C10890a(@NotNull String str, @NotNull Response<?> response, @Nullable Pair<String, String> pair, @Nullable Integer num, @Nullable Map<String, ? extends Object> map) {
            C2668g.b(str, "key");
            C2668g.b(response, "response");
            this(str, C8740a.m37247b(C8740a.m37248b(response), pair), C8740a.m37246a(response), response.code(), num, map);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BK\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t¢\u0006\u0002\u0010\u000bB=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t¢\u0006\u0002\u0010\u0010J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u000fHÆ\u0003J\u0019\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tHÆ\u0003JK\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\"\u001a\u00020\u000fHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R!\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006$"}, d2 = {"Lcom/tinder/data/places/PerformanceApiEvent$Finished;", "Lcom/tinder/data/places/PerformanceApiEvent;", "key", "", "response", "Lretrofit2/Response;", "obfuscation", "Lkotlin/Pair;", "map", "", "", "(Ljava/lang/String;Lretrofit2/Response;Lkotlin/Pair;Ljava/util/Map;)V", "endPoint", "method", "statusCode", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;)V", "getEndPoint", "()Ljava/lang/String;", "getKey", "getMap", "()Ljava/util/Map;", "getMethod", "getStatusCode", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "data_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.places.b$b */
    public static final class C10891b extends C8741b {
        @NotNull
        /* renamed from: a */
        private final String f35581a;
        @NotNull
        /* renamed from: b */
        private final String f35582b;
        @NotNull
        /* renamed from: c */
        private final String f35583c;
        /* renamed from: d */
        private final int f35584d;
        @Nullable
        /* renamed from: e */
        private final Map<String, Object> f35585e;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C10891b) {
                C10891b c10891b = (C10891b) obj;
                if (C2668g.a(mo9820a(), c10891b.mo9820a()) && C2668g.a(this.f35582b, c10891b.f35582b) && C2668g.a(this.f35583c, c10891b.f35583c)) {
                    return (this.f35584d == c10891b.f35584d ? 1 : null) != null && C2668g.a(this.f35585e, c10891b.f35585e);
                }
            }
        }

        public int hashCode() {
            String a = mo9820a();
            int i = 0;
            int hashCode = (a != null ? a.hashCode() : 0) * 31;
            String str = this.f35582b;
            hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            str = this.f35583c;
            hashCode = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f35584d) * 31;
            Map map = this.f35585e;
            if (map != null) {
                i = map.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Finished(key=");
            stringBuilder.append(mo9820a());
            stringBuilder.append(", endPoint=");
            stringBuilder.append(this.f35582b);
            stringBuilder.append(", method=");
            stringBuilder.append(this.f35583c);
            stringBuilder.append(", statusCode=");
            stringBuilder.append(this.f35584d);
            stringBuilder.append(", map=");
            stringBuilder.append(this.f35585e);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        @NotNull
        /* renamed from: a */
        public String mo9820a() {
            return this.f35581a;
        }

        @NotNull
        /* renamed from: b */
        public final String m43436b() {
            return this.f35582b;
        }

        @NotNull
        /* renamed from: c */
        public final String m43437c() {
            return this.f35583c;
        }

        /* renamed from: d */
        public final int m43438d() {
            return this.f35584d;
        }

        @Nullable
        /* renamed from: e */
        public final Map<String, Object> m43439e() {
            return this.f35585e;
        }

        public C10891b(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, @Nullable Map<String, ? extends Object> map) {
            C2668g.b(str, "key");
            C2668g.b(str2, "endPoint");
            C2668g.b(str3, "method");
            super();
            this.f35581a = str;
            this.f35582b = str2;
            this.f35583c = str3;
            this.f35584d = i;
            this.f35585e = map;
        }

        public C10891b(@NotNull String str, @NotNull Response<?> response, @Nullable Pair<String, String> pair, @Nullable Map<String, ? extends Object> map) {
            C2668g.b(str, "key");
            C2668g.b(response, "response");
            this(str, C8740a.m37247b(C8740a.m37248b(response), pair), C8740a.m37246a(response), response.code(), map);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tinder/data/places/PerformanceApiEvent$Started;", "Lcom/tinder/data/places/PerformanceApiEvent;", "key", "", "(Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.places.b$c */
    public static final class C10892c extends C8741b {
        @NotNull
        /* renamed from: a */
        private final String f35586a;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C10892c) {
                    if (C2668g.a(mo9820a(), ((C10892c) obj).mo9820a())) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String a = mo9820a();
            return a != null ? a.hashCode() : 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Started(key=");
            stringBuilder.append(mo9820a());
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C10892c(@NotNull String str) {
            C2668g.b(str, "key");
            super();
            this.f35586a = str;
        }

        @NotNull
        /* renamed from: a */
        public String mo9820a() {
            return this.f35586a;
        }
    }

    @NotNull
    /* renamed from: a */
    public abstract String mo9820a();

    private C8741b() {
    }
}
