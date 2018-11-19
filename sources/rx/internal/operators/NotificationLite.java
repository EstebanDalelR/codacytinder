package rx.internal.operators;

import java.io.Serializable;
import rx.Observer;

public final class NotificationLite {
    /* renamed from: a */
    private static final Object f60594a = new C194121();
    /* renamed from: b */
    private static final Object f60595b = new C194132();

    /* renamed from: rx.internal.operators.NotificationLite$1 */
    static class C194121 implements Serializable {
        private static final long serialVersionUID = 1;

        public String toString() {
            return "Notification=>Completed";
        }

        C194121() {
        }
    }

    /* renamed from: rx.internal.operators.NotificationLite$2 */
    static class C194132 implements Serializable {
        private static final long serialVersionUID = 2;

        public String toString() {
            return "Notification=>NULL";
        }

        C194132() {
        }
    }

    static final class OnErrorSentinel implements Serializable {
        private static final long serialVersionUID = 3;
        /* renamed from: a */
        final Throwable f60593a;

        public OnErrorSentinel(Throwable th) {
            this.f60593a = th;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Notification=>Error:");
            stringBuilder.append(this.f60593a);
            return stringBuilder.toString();
        }
    }

    /* renamed from: a */
    public static <T> Object m69885a(T t) {
        return t == null ? f60595b : t;
    }

    /* renamed from: a */
    public static Object m69884a() {
        return f60594a;
    }

    /* renamed from: a */
    public static Object m69886a(Throwable th) {
        return new OnErrorSentinel(th);
    }

    /* renamed from: a */
    public static <T> boolean m69887a(Observer<? super T> observer, Object obj) {
        if (obj == f60594a) {
            observer.onCompleted();
            return true;
        } else if (obj == f60595b) {
            observer.onNext(null);
            return false;
        } else if (obj == null) {
            throw new IllegalArgumentException("The lite notification can not be null");
        } else if (obj.getClass() == OnErrorSentinel.class) {
            observer.onError(((OnErrorSentinel) obj).f60593a);
            return true;
        } else {
            observer.onNext(obj);
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m69888b(Object obj) {
        return obj == f60594a ? true : null;
    }

    /* renamed from: c */
    public static boolean m69889c(Object obj) {
        return obj instanceof OnErrorSentinel;
    }

    /* renamed from: d */
    public static boolean m69890d(Object obj) {
        return (obj == null || m69889c(obj) || m69888b(obj) != null) ? null : true;
    }

    /* renamed from: e */
    public static <T> T m69891e(Object obj) {
        return obj == f60595b ? null : obj;
    }

    /* renamed from: f */
    public static Throwable m69892f(Object obj) {
        return ((OnErrorSentinel) obj).f60593a;
    }
}
