package rx;

public final class Notification<T> {
    /* renamed from: d */
    private static final Notification<Void> f60539d = new Notification(Kind.OnCompleted, null, null);
    /* renamed from: a */
    private final Kind f60540a;
    /* renamed from: b */
    private final Throwable f60541b;
    /* renamed from: c */
    private final T f60542c;

    public enum Kind {
        OnNext,
        OnError,
        OnCompleted
    }

    /* renamed from: a */
    public static <T> Notification<T> m69598a(T t) {
        return new Notification(Kind.OnNext, t, null);
    }

    /* renamed from: a */
    public static <T> Notification<T> m69599a(Throwable th) {
        return new Notification(Kind.OnError, null, th);
    }

    /* renamed from: a */
    public static <T> Notification<T> m69597a() {
        return f60539d;
    }

    private Notification(Kind kind, T t, Throwable th) {
        this.f60542c = t;
        this.f60541b = th;
        this.f60540a = kind;
    }

    /* renamed from: b */
    public Throwable m69600b() {
        return this.f60541b;
    }

    /* renamed from: c */
    public T m69601c() {
        return this.f60542c;
    }

    /* renamed from: d */
    public boolean m69602d() {
        return m69607i() && this.f60542c != null;
    }

    /* renamed from: e */
    public boolean m69603e() {
        return m69605g() && this.f60541b != null;
    }

    /* renamed from: f */
    public Kind m69604f() {
        return this.f60540a;
    }

    /* renamed from: g */
    public boolean m69605g() {
        return m69604f() == Kind.OnError;
    }

    /* renamed from: h */
    public boolean m69606h() {
        return m69604f() == Kind.OnCompleted;
    }

    /* renamed from: i */
    public boolean m69607i() {
        return m69604f() == Kind.OnNext;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        stringBuilder.append('[');
        stringBuilder.append(super.toString());
        stringBuilder.append(' ');
        stringBuilder.append(m69604f());
        if (m69602d()) {
            stringBuilder.append(' ');
            stringBuilder.append(m69601c());
        }
        if (m69603e()) {
            stringBuilder.append(' ');
            stringBuilder.append(m69600b().getMessage());
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public int hashCode() {
        int hashCode = m69604f().hashCode();
        if (m69602d()) {
            hashCode = (hashCode * 31) + m69601c().hashCode();
        }
        return m69603e() ? (hashCode * 31) + m69600b().hashCode() : hashCode;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        Notification notification = (Notification) obj;
        if (notification.m69604f() == m69604f() && ((this.f60542c == notification.f60542c || (this.f60542c != null && this.f60542c.equals(notification.f60542c))) && (this.f60541b == notification.f60541b || !(this.f60541b == null || this.f60541b.equals(notification.f60541b) == null)))) {
            z = true;
        }
        return z;
    }
}
