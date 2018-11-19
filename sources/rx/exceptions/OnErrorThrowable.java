package rx.exceptions;

import com.tinder.api.ManagerWebServices;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import rx.p498c.C19403f;

public final class OnErrorThrowable extends RuntimeException {
    private static final long serialVersionUID = -569558213262703934L;

    public static class OnNextValue extends RuntimeException {
        private static final long serialVersionUID = -3454462756050397899L;
        /* renamed from: a */
        private final Object f60588a;

        /* renamed from: rx.exceptions.OnErrorThrowable$OnNextValue$a */
        static final class C19409a {
            /* renamed from: a */
            static final Set<Class<?>> f60587a = C19409a.m69863a();

            /* renamed from: a */
            private static Set<Class<?>> m69863a() {
                Set<Class<?>> hashSet = new HashSet();
                hashSet.add(Boolean.class);
                hashSet.add(Character.class);
                hashSet.add(Byte.class);
                hashSet.add(Short.class);
                hashSet.add(Integer.class);
                hashSet.add(Long.class);
                hashSet.add(Float.class);
                hashSet.add(Double.class);
                return hashSet;
            }
        }

        public OnNextValue(Object obj) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("OnError while emitting onNext value: ");
            stringBuilder.append(m69864a(obj));
            super(stringBuilder.toString());
            if (!(obj instanceof Serializable)) {
                try {
                    obj = String.valueOf(obj);
                } catch (Object obj2) {
                    obj2 = obj2.getMessage();
                }
            }
            this.f60588a = obj2;
        }

        /* renamed from: a */
        public Object m69865a() {
            return this.f60588a;
        }

        /* renamed from: a */
        static String m69864a(Object obj) {
            if (obj == null) {
                return ManagerWebServices.NULL_STRING_VALUE;
            }
            if (C19409a.f60587a.contains(obj.getClass())) {
                return obj.toString();
            }
            if (obj instanceof String) {
                return (String) obj;
            }
            if (obj instanceof Enum) {
                return ((Enum) obj).name();
            }
            String a = C19403f.m69828a().m69829b().m69797a(obj);
            if (a != null) {
                return a;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(obj.getClass().getName());
            stringBuilder.append(".class");
            return stringBuilder.toString();
        }
    }

    /* renamed from: a */
    public static Throwable m69866a(Throwable th, Object obj) {
        if (th == null) {
            th = new NullPointerException();
        }
        Throwable c = C19410a.m69875c(th);
        if ((c instanceof OnNextValue) && ((OnNextValue) c).m69865a() == obj) {
            return th;
        }
        C19410a.m69868a(th, new OnNextValue(obj));
        return th;
    }
}
