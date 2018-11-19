package kotlin.jvm.internal;

import com.tinder.api.ManagerWebServices;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableCollection;
import kotlin.jvm.internal.markers.KMutableIterable;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.jvm.internal.markers.KMutableSet;

/* renamed from: kotlin.jvm.internal.m */
public class C15829m {
    /* renamed from: a */
    private static <T extends Throwable> T m59875a(T t) {
        return C2668g.a(t, C15829m.class.getName());
    }

    /* renamed from: a */
    public static void m59876a(Object obj, String str) {
        obj = obj == null ? ManagerWebServices.NULL_STRING_VALUE : obj.getClass().getName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(obj);
        stringBuilder.append(" cannot be cast to ");
        stringBuilder.append(str);
        C15829m.m59877a(stringBuilder.toString());
    }

    /* renamed from: a */
    public static void m59877a(String str) {
        throw C15829m.m59873a(new ClassCastException(str));
    }

    /* renamed from: a */
    public static ClassCastException m59873a(ClassCastException classCastException) {
        throw ((ClassCastException) C15829m.m59875a((Throwable) classCastException));
    }

    /* renamed from: a */
    public static Iterable m59874a(Object obj) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableIterable)) {
            C15829m.m59876a(obj, "kotlin.collections.MutableIterable");
        }
        return C15829m.m59879b(obj);
    }

    /* renamed from: b */
    public static Iterable m59879b(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e) {
            throw C15829m.m59873a(e);
        }
    }

    /* renamed from: c */
    public static Collection m59880c(Object obj) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableCollection)) {
            C15829m.m59876a(obj, "kotlin.collections.MutableCollection");
        }
        return C15829m.m59881d(obj);
    }

    /* renamed from: d */
    public static Collection m59881d(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            throw C15829m.m59873a(e);
        }
    }

    /* renamed from: e */
    public static Set m59882e(Object obj) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableSet)) {
            C15829m.m59876a(obj, "kotlin.collections.MutableSet");
        }
        return C15829m.m59883f(obj);
    }

    /* renamed from: f */
    public static Set m59883f(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            throw C15829m.m59873a(e);
        }
    }

    /* renamed from: g */
    public static Map m59884g(Object obj) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableMap)) {
            C15829m.m59876a(obj, "kotlin.collections.MutableMap");
        }
        return C15829m.m59885h(obj);
    }

    /* renamed from: h */
    public static Map m59885h(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            throw C15829m.m59873a(e);
        }
    }

    /* renamed from: i */
    public static int m59886i(Object obj) {
        if (obj instanceof FunctionBase) {
            return ((FunctionBase) obj).getArity();
        }
        if (obj instanceof Function0) {
            return null;
        }
        if (obj instanceof Function1) {
            return 1;
        }
        if (obj instanceof Function2) {
            return 2;
        }
        if (obj instanceof Function3) {
            return 3;
        }
        if (obj instanceof Function4) {
            return 4;
        }
        if (obj instanceof Function5) {
            return 5;
        }
        if (obj instanceof Function6) {
            return 6;
        }
        if (obj instanceof Function7) {
            return 7;
        }
        if (obj instanceof Function8) {
            return 8;
        }
        if (obj instanceof Function9) {
            return 9;
        }
        if (obj instanceof Function10) {
            return 10;
        }
        if (obj instanceof Function11) {
            return 11;
        }
        if (obj instanceof Function12) {
            return 12;
        }
        if (obj instanceof Function13) {
            return 13;
        }
        if (obj instanceof Function14) {
            return 14;
        }
        if (obj instanceof Function15) {
            return 15;
        }
        if (obj instanceof Function16) {
            return 16;
        }
        if (obj instanceof Function17) {
            return 17;
        }
        if (obj instanceof Function18) {
            return 18;
        }
        if (obj instanceof Function19) {
            return 19;
        }
        if (obj instanceof Function20) {
            return 20;
        }
        if (obj instanceof Function21) {
            return 21;
        }
        return (obj instanceof Function22) != null ? 22 : -1;
    }

    /* renamed from: a */
    public static boolean m59878a(Object obj, int i) {
        return ((obj instanceof Function) && C15829m.m59886i(obj) == i) ? true : null;
    }
}
