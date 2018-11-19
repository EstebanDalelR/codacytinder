package com.foursquare.pilgrim;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.foursquare.pilgrim.PilgrimSdk.LogLevel;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

final class av {
    @NonNull
    /* renamed from: a */
    private final LogLevel f5317a;
    /* renamed from: b */
    private final boolean f5318b;
    @NonNull
    /* renamed from: c */
    private final Set<NearbyTrigger> f5319c;
    @NonNull
    /* renamed from: d */
    private final PilgrimExceptionHandler f5320d;
    @NonNull
    /* renamed from: e */
    private final PilgrimNotificationHandler f5321e;
    @Nullable
    /* renamed from: f */
    private final PilgrimUserInfo f5322f;

    /* renamed from: com.foursquare.pilgrim.av$a */
    static class C1969a {
        @NonNull
        /* renamed from: a */
        private LogLevel f5311a;
        /* renamed from: b */
        private boolean f5312b;
        @NonNull
        /* renamed from: c */
        private Set<NearbyTrigger> f5313c;
        @NonNull
        /* renamed from: d */
        private PilgrimExceptionHandler f5314d;
        @NonNull
        /* renamed from: e */
        private PilgrimNotificationHandler f5315e;
        @Nullable
        /* renamed from: f */
        private PilgrimUserInfo f5316f;

        C1969a() {
            this.f5311a = LogLevel.INFO;
            this.f5312b = false;
            this.f5313c = new LinkedHashSet();
            this.f5314d = new C3553i();
            this.f5315e = new C3554j();
        }

        private C1969a(@NonNull av avVar) {
            this.f5311a = LogLevel.INFO;
            this.f5312b = false;
            this.f5313c = new LinkedHashSet();
            this.f5314d = new C3553i();
            this.f5315e = new C3554j();
            this.f5311a = avVar.f5317a;
            this.f5312b = avVar.f5318b;
            this.f5313c = avVar.f5319c;
            this.f5314d = avVar.f5320d;
            this.f5315e = avVar.f5321e;
            this.f5316f = avVar.f5322f;
        }

        @NonNull
        /* renamed from: a */
        C1969a m6981a(@NonNull LogLevel logLevel) {
            this.f5311a = logLevel;
            return this;
        }

        @NonNull
        /* renamed from: a */
        C1969a m6984a(boolean z) {
            this.f5312b = z;
            return this;
        }

        @NonNull
        /* renamed from: a */
        C1969a m6983a(@NonNull Collection<NearbyTrigger> collection) {
            if (collection instanceof Set) {
                collection = (Set) collection;
            } else {
                collection = new LinkedHashSet(collection);
            }
            this.f5313c = collection;
            return this;
        }

        @NonNull
        /* renamed from: a */
        C1969a m6979a(@NonNull PilgrimExceptionHandler pilgrimExceptionHandler) {
            this.f5314d = pilgrimExceptionHandler;
            return this;
        }

        @NonNull
        /* renamed from: a */
        C1969a m6980a(@NonNull PilgrimNotificationHandler pilgrimNotificationHandler) {
            this.f5315e = pilgrimNotificationHandler;
            return this;
        }

        @NonNull
        /* renamed from: a */
        C1969a m6982a(@Nullable PilgrimUserInfo pilgrimUserInfo) {
            this.f5316f = pilgrimUserInfo;
            return this;
        }

        @NonNull
        /* renamed from: a */
        public av m6985a() {
            return new av(this.f5311a, this.f5312b, this.f5313c, this.f5314d, this.f5315e, this.f5316f);
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    C1969a c1969a = (C1969a) obj;
                    if (this.f5312b != c1969a.f5312b || this.f5311a != c1969a.f5311a || !this.f5313c.equals(c1969a.f5313c) || !this.f5314d.equals(c1969a.f5314d) || !this.f5315e.equals(c1969a.f5315e)) {
                        return false;
                    }
                    if (this.f5316f != null) {
                        z = this.f5316f.equals(c1969a.f5316f);
                    } else if (c1969a.f5316f != null) {
                        z = false;
                    }
                    return z;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((((((this.f5311a.hashCode() * 31) + this.f5312b) * 31) + this.f5313c.hashCode()) * 31) + this.f5314d.hashCode()) * 31) + this.f5315e.hashCode()) * 31) + (this.f5316f != null ? this.f5316f.hashCode() : 0);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("PilgrimSdkOptions.Builder{logLevel=");
            stringBuilder.append(this.f5311a);
            stringBuilder.append(", enablePersistentLogs=");
            stringBuilder.append(this.f5312b);
            stringBuilder.append(", nearbyTriggers=");
            stringBuilder.append(this.f5313c);
            stringBuilder.append(", exceptionHandler=");
            stringBuilder.append(this.f5314d);
            stringBuilder.append(", notificationHandler=");
            stringBuilder.append(this.f5315e);
            stringBuilder.append(", userInfo=");
            stringBuilder.append(this.f5316f);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    @NonNull
    /* renamed from: a */
    static av m6987a() {
        return new C1969a().m6985a();
    }

    private av(@NonNull LogLevel logLevel, boolean z, @NonNull Set<NearbyTrigger> set, @NonNull PilgrimExceptionHandler pilgrimExceptionHandler, @NonNull PilgrimNotificationHandler pilgrimNotificationHandler, @Nullable PilgrimUserInfo pilgrimUserInfo) {
        this.f5317a = logLevel;
        this.f5318b = z;
        this.f5319c = set;
        this.f5320d = pilgrimExceptionHandler;
        this.f5321e = pilgrimNotificationHandler;
        this.f5322f = pilgrimUserInfo;
    }

    @NonNull
    /* renamed from: b */
    LogLevel m6993b() {
        return this.f5317a;
    }

    /* renamed from: c */
    boolean m6994c() {
        return this.f5318b;
    }

    @NonNull
    /* renamed from: d */
    Set<NearbyTrigger> m6995d() {
        return this.f5319c;
    }

    @NonNull
    /* renamed from: e */
    PilgrimExceptionHandler m6996e() {
        return this.f5320d;
    }

    @NonNull
    /* renamed from: f */
    PilgrimNotificationHandler m6997f() {
        return this.f5321e;
    }

    @Nullable
    /* renamed from: g */
    PilgrimUserInfo m6998g() {
        return this.f5322f;
    }

    @NonNull
    /* renamed from: h */
    C1969a m6999h() {
        return new C1969a();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                av avVar = (av) obj;
                if (this.f5318b != avVar.f5318b || this.f5317a != avVar.f5317a || !this.f5319c.equals(avVar.f5319c) || !this.f5320d.equals(avVar.f5320d) || !this.f5321e.equals(avVar.f5321e)) {
                    return false;
                }
                if (this.f5322f != null) {
                    z = this.f5322f.equals(avVar.f5322f);
                } else if (avVar.f5322f != null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.f5317a.hashCode() * 31) + this.f5318b) * 31) + this.f5319c.hashCode()) * 31) + this.f5320d.hashCode()) * 31) + this.f5321e.hashCode()) * 31) + (this.f5322f != null ? this.f5322f.hashCode() : 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PilgrimSdkOptions{logLevel=");
        stringBuilder.append(this.f5317a);
        stringBuilder.append(", enablePersistentLogs=");
        stringBuilder.append(this.f5318b);
        stringBuilder.append(", nearbyTriggers=");
        stringBuilder.append(this.f5319c);
        stringBuilder.append(", exceptionHandler=");
        stringBuilder.append(this.f5320d);
        stringBuilder.append(", notificationHandler=");
        stringBuilder.append(this.f5321e);
        stringBuilder.append(", userInfo=");
        stringBuilder.append(this.f5322f);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
