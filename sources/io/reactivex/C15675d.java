package io.reactivex;

import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.util.NotificationLite;

/* renamed from: io.reactivex.d */
public final class C15675d<T> {
    /* renamed from: b */
    static final C15675d<Object> f48531b = new C15675d(null);
    /* renamed from: a */
    final Object f48532a;

    private C15675d(Object obj) {
        this.f48532a = obj;
    }

    /* renamed from: a */
    public boolean m58834a() {
        return this.f48532a == null;
    }

    /* renamed from: b */
    public boolean m58835b() {
        return NotificationLite.isError(this.f48532a);
    }

    /* renamed from: c */
    public boolean m58836c() {
        Object obj = this.f48532a;
        return (obj == null || NotificationLite.isError(obj)) ? false : true;
    }

    @Nullable
    /* renamed from: d */
    public T m58837d() {
        Object obj = this.f48532a;
        return (obj == null || NotificationLite.isError(obj)) ? null : this.f48532a;
    }

    @Nullable
    /* renamed from: e */
    public Throwable m58838e() {
        Object obj = this.f48532a;
        return NotificationLite.isError(obj) ? NotificationLite.getError(obj) : null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C15675d)) {
            return null;
        }
        return C15684a.m58896a(this.f48532a, ((C15675d) obj).f48532a);
    }

    public int hashCode() {
        Object obj = this.f48532a;
        return obj != null ? obj.hashCode() : 0;
    }

    public String toString() {
        Object obj = this.f48532a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (NotificationLite.isError(obj)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("OnErrorNotification[");
            stringBuilder.append(NotificationLite.getError(obj));
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("OnNextNotification[");
        stringBuilder2.append(this.f48532a);
        stringBuilder2.append("]");
        return stringBuilder2.toString();
    }

    @NonNull
    /* renamed from: a */
    public static <T> C15675d<T> m58831a(@NonNull T t) {
        C15684a.m58895a((Object) t, "value is null");
        return new C15675d(t);
    }

    @NonNull
    /* renamed from: a */
    public static <T> C15675d<T> m58832a(@NonNull Throwable th) {
        C15684a.m58895a((Object) th, "error is null");
        return new C15675d(NotificationLite.error(th));
    }

    @NonNull
    /* renamed from: f */
    public static <T> C15675d<T> m58833f() {
        return f48531b;
    }
}
