package kotlin.reflect.jvm;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.KCallable;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KMutableProperty.Setter;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty.Getter;
import kotlin.reflect.jvm.internal.UtilKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\",\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0000\u001a\u00020\u00018F@FX\u000e¢\u0006\f\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"value", "", "isAccessible", "Lkotlin/reflect/KCallable;", "(Lkotlin/reflect/KCallable;)Z", "setAccessible", "(Lkotlin/reflect/KCallable;Z)V", "kotlin-reflection"}, k = 2, mv = {1, 1, 10})
@JvmName(name = "KCallablesJvm")
/* renamed from: kotlin.reflect.jvm.a */
public final class C15840a {
    /* renamed from: a */
    public static final void m59901a(@NotNull KCallable<?> kCallable, boolean z) {
        C2668g.b(kCallable, "$receiver");
        if (kCallable instanceof KMutableProperty) {
            KProperty kProperty = (KProperty) kCallable;
            Field a = C15842c.m59904a(kProperty);
            if (a != null) {
                a.setAccessible(z);
            }
            Method b = C15842c.m59909b(kProperty);
            if (b != null) {
                b.setAccessible(z);
            }
            kCallable = C15842c.m59906a((KMutableProperty) kCallable);
            if (kCallable != null) {
                kCallable.setAccessible(z);
            }
        } else if (kCallable instanceof KProperty) {
            KProperty kProperty2 = (KProperty) kCallable;
            r0 = C15842c.m59904a(kProperty2);
            if (r0 != null) {
                r0.setAccessible(z);
            }
            kCallable = C15842c.m59909b(kProperty2);
            if (kCallable != null) {
                kCallable.setAccessible(z);
            }
        } else if (kCallable instanceof Getter) {
            r0 = C15842c.m59904a(((Getter) kCallable).getProperty());
            if (r0 != null) {
                r0.setAccessible(z);
            }
            kCallable = C15842c.m59905a((KFunction) kCallable);
            if (kCallable != null) {
                kCallable.setAccessible(z);
            }
        } else if (kCallable instanceof Setter) {
            r0 = C15842c.m59904a(((Setter) kCallable).getProperty());
            if (r0 != null) {
                r0.setAccessible(z);
            }
            kCallable = C15842c.m59905a((KFunction) kCallable);
            if (kCallable != null) {
                kCallable.setAccessible(z);
            }
        } else if (kCallable instanceof KFunction) {
            AccessibleObject accessibleObject;
            KFunction kFunction = (KFunction) kCallable;
            Method a2 = C15842c.m59905a(kFunction);
            if (a2 != null) {
                a2.setAccessible(z);
            }
            kCallable = UtilKt.asKCallableImpl(kCallable);
            if (kCallable != null) {
                kCallable = kCallable.getDefaultCaller();
                if (kCallable != null) {
                    kCallable = kCallable.getMember$kotlin_reflection();
                    if (!(kCallable instanceof AccessibleObject)) {
                        kCallable = null;
                    }
                    accessibleObject = (AccessibleObject) kCallable;
                    if (accessibleObject != null) {
                        accessibleObject.setAccessible(true);
                    }
                    kCallable = C15842c.m59908b(kFunction);
                    if (kCallable != null) {
                        kCallable.setAccessible(z);
                    }
                }
            }
            kCallable = null;
            if (kCallable instanceof AccessibleObject) {
                kCallable = null;
            }
            accessibleObject = (AccessibleObject) kCallable;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(true);
            }
            kCallable = C15842c.m59908b(kFunction);
            if (kCallable != null) {
                kCallable.setAccessible(z);
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown callable: ");
            stringBuilder.append(kCallable);
            stringBuilder.append(" (");
            stringBuilder.append(kCallable.getClass());
            stringBuilder.append(')');
            throw ((Throwable) new UnsupportedOperationException(stringBuilder.toString()));
        }
    }
}
