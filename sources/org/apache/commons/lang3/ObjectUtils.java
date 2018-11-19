package org.apache.commons.lang3;

import java.io.Serializable;

public class ObjectUtils {
    /* renamed from: a */
    public static final Null f49632a = new Null();

    public static class Null implements Serializable {
        private static final long serialVersionUID = 7092611880189329093L;

        Null() {
        }

        private Object readResolve() {
            return ObjectUtils.f49632a;
        }
    }

    @Deprecated
    /* renamed from: a */
    public static boolean m60648a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null) {
            if (obj2 != null) {
                return obj.equals(obj2);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m60647a(StringBuffer stringBuffer, Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot get the toString of a null identity");
        }
        stringBuffer.append(obj.getClass().getName());
        stringBuffer.append('@');
        stringBuffer.append(Integer.toHexString(System.identityHashCode(obj)));
    }
}
