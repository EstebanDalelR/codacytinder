package com.google.android.m4b.maps.ah;

import com.google.android.m4b.maps.aa.C4585q;
import com.google.android.m4b.maps.aa.C7422v;
import com.google.android.m4b.maps.aa.ae;
import com.google.android.m4b.maps.aa.ae.C7397a;
import com.google.android.m4b.maps.aa.al;
import com.google.android.m4b.maps.aa.al.C7400a;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.aa.bc;
import com.google.android.m4b.maps.p125y.C5571j;
import com.google.android.m4b.maps.p125y.C5572k;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.m4b.maps.ah.c */
public class C6384c<T> extends C4611a<T> implements Serializable {
    /* renamed from: a */
    private final Type f23718a;
    /* renamed from: b */
    private transient C4615b f23719b;

    /* renamed from: com.google.android.m4b.maps.ah.c$b */
    static abstract class C4616b<K> {
        /* renamed from: a */
        static final C4616b<C6384c<?>> f17031a = new C63801();
        /* renamed from: b */
        static final C4616b<Class<?>> f17032b = new C63812();

        /* renamed from: com.google.android.m4b.maps.ah.c$b$1 */
        static class C63801 extends C4616b<C6384c<?>> {
            C63801() {
                super();
            }

            /* renamed from: b */
            final /* synthetic */ Class mo4853b(Object obj) {
                return ((C6384c) obj).m27890b();
            }

            /* renamed from: c */
            final /* synthetic */ Iterable mo4854c(Object obj) {
                return ((C6384c) obj).m27892d();
            }

            /* renamed from: d */
            final /* synthetic */ Object mo4855d(Object obj) {
                return ((C6384c) obj).m27891c();
            }
        }

        /* renamed from: com.google.android.m4b.maps.ah.c$b$2 */
        static class C63812 extends C4616b<Class<?>> {
            C63812() {
                super();
            }

            /* renamed from: b */
            final /* synthetic */ Class mo4853b(Object obj) {
                return (Class) obj;
            }

            /* renamed from: c */
            final /* synthetic */ Iterable mo4854c(Object obj) {
                return Arrays.asList(((Class) obj).getInterfaces());
            }

            /* renamed from: d */
            final /* synthetic */ Object mo4855d(Object obj) {
                return ((Class) obj).getSuperclass();
            }
        }

        /* renamed from: b */
        abstract Class<?> mo4853b(K k);

        /* renamed from: c */
        abstract Iterable<? extends K> mo4854c(K k);

        /* renamed from: d */
        abstract K mo4855d(K k);

        private C4616b() {
        }

        /* renamed from: a */
        final ae<K> m20714a(K k) {
            return m20713a(ae.m27680a((Object) k));
        }

        /* renamed from: a */
        final ae<K> m20713a(Iterable<? extends K> iterable) {
            final Map b = ax.m20623b();
            for (Object a : iterable) {
                m20712a(a, b);
            }
            iterable = bc.m20643b().mo4827a();
            return new bc<K>() {
                public final int compare(K k, K k2) {
                    return iterable.compare(b.get(k), b.get(k2));
                }
            }.m20644a(b.keySet());
        }

        /* renamed from: a */
        private int m20712a(K k, Map<? super K, Integer> map) {
            Integer num = (Integer) map.get(this);
            if (num != null) {
                return num.intValue();
            }
            int isInterface = mo4853b(k).isInterface();
            for (Object a : mo4854c(k)) {
                isInterface = Math.max(isInterface, m20712a(a, map));
            }
            Object d = mo4855d(k);
            if (d != null) {
                isInterface = Math.max(isInterface, m20712a(d, map));
            }
            isInterface++;
            map.put(k, Integer.valueOf(isInterface));
            return isInterface;
        }
    }

    /* renamed from: com.google.android.m4b.maps.ah.c$c */
    enum C6383c implements C5572k<C6384c<?>> {
        IGNORE_TYPE_VARIABLE_OR_WILDCARD {
            /* renamed from: a */
            public final /* synthetic */ boolean mo5815a(Object obj) {
                C6384c c6384c = (C6384c) obj;
                return ((c6384c.f23718a instanceof TypeVariable) || (c6384c.f23718a instanceof WildcardType) != null) ? null : true;
            }
        },
        INTERFACE_ONLY {
            /* renamed from: a */
            public final /* synthetic */ boolean mo5815a(Object obj) {
                return ((C6384c) obj).m27890b().isInterface();
            }
        };
    }

    /* renamed from: com.google.android.m4b.maps.ah.c$a */
    static final class C7426a<T> extends C6384c<T> {
        private static final long serialVersionUID = 0;

        C7426a(Type type) {
            super(type);
        }
    }

    /* renamed from: com.google.android.m4b.maps.ah.c$d */
    public class C8061d extends C7422v<C6384c<? super T>> implements Serializable {
        private static final long serialVersionUID = 0;
        /* renamed from: a */
        private transient al<C6384c<? super T>> f28870a;
        /* renamed from: b */
        private /* synthetic */ C6384c f28871b;

        /* renamed from: a */
        protected final /* synthetic */ Collection mo7018a() {
            return mo7537b();
        }

        /* renamed from: c */
        protected final /* synthetic */ Object mo4837c() {
            return mo7537b();
        }

        C8061d(C6384c c6384c) {
            this.f28871b = c6384c;
        }

        /* renamed from: b */
        protected final Set<C6384c<? super T>> mo7537b() {
            Set set = this.f28870a;
            if (set != null) {
                return set;
            }
            set = C4585q.m20673a(C4616b.f17031a.m20714a(this.f28871b)).m20675a(C6383c.IGNORE_TYPE_VARIABLE_OR_WILDCARD).m20674a();
            this.f28870a = set;
            return set;
        }

        /* renamed from: d */
        public final Set<Class<? super T>> m34202d() {
            return al.m27701a(C4616b.f17032b.m20713a(C6384c.m27889e(this.f28871b.f23718a)));
        }
    }

    protected C6384c() {
        this.f23718a = m20701a();
        C5571j.m24303b(!(this.f23718a instanceof TypeVariable), "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", this.f23718a);
    }

    private C6384c(Type type) {
        this.f23718a = (Type) C5571j.m24292a((Object) type);
    }

    /* renamed from: a */
    public static <T> C6384c<T> m27883a(Class<T> cls) {
        return new C7426a(cls);
    }

    /* renamed from: b */
    private static C6384c<?> m27885b(Type type) {
        return new C7426a(type);
    }

    /* renamed from: b */
    public final Class<? super T> m27890b() {
        return C6384c.m27884a(this.f23718a);
    }

    /* renamed from: c */
    final C6384c<? super T> m27891c() {
        if (this.f23718a instanceof TypeVariable) {
            return C6384c.m27888d(((TypeVariable) this.f23718a).getBounds()[0]);
        }
        if (this.f23718a instanceof WildcardType) {
            return C6384c.m27888d(((WildcardType) this.f23718a).getUpperBounds()[0]);
        }
        Type genericSuperclass = m27890b().getGenericSuperclass();
        if (genericSuperclass == null) {
            return null;
        }
        return m27887c(genericSuperclass);
    }

    /* renamed from: d */
    private static C6384c<? super T> m27888d(Type type) {
        type = C6384c.m27885b(type);
        return type.m27890b().isInterface() ? null : type;
    }

    /* renamed from: d */
    final ae<C6384c<? super T>> m27892d() {
        if (this.f23718a instanceof TypeVariable) {
            return C6384c.m27881a(((TypeVariable) this.f23718a).getBounds());
        }
        if (this.f23718a instanceof WildcardType) {
            return C6384c.m27881a(((WildcardType) this.f23718a).getUpperBounds());
        }
        C7397a g = ae.m27686g();
        for (Type c : m27890b().getGenericInterfaces()) {
            g.m31831c(m27887c(c));
        }
        return g.m31828a();
    }

    /* renamed from: a */
    private static ae<C6384c<? super T>> m27881a(Type[] typeArr) {
        C7397a g = ae.m27686g();
        for (Type b : typeArr) {
            C6384c b2 = C6384c.m27885b(b);
            if (b2.m27890b().isInterface()) {
                g.m31831c(b2);
            }
        }
        return g.m31828a();
    }

    /* renamed from: e */
    public final C8061d m27893e() {
        return new C8061d(this);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6384c)) {
            return null;
        }
        return this.f23718a.equals(((C6384c) obj).f23718a);
    }

    public int hashCode() {
        return this.f23718a.hashCode();
    }

    public String toString() {
        return C4626e.m20737b(this.f23718a);
    }

    protected Object writeReplace() {
        return C6384c.m27885b(new C4615b().m20711b(this.f23718a));
    }

    /* renamed from: a */
    static Class<?> m27884a(Type type) {
        return (Class) C6384c.m27889e(type).mo4785a().next();
    }

    /* renamed from: e */
    private static al<Class<?>> m27889e(Type type) {
        C5571j.m24292a((Object) type);
        final C7400a h = al.m27705h();
        new C4617d() {
            /* renamed from: a */
            final void mo4849a(TypeVariable<?> typeVariable) {
                m20723a((Type[]) typeVariable.getBounds());
            }

            /* renamed from: a */
            final void mo4850a(WildcardType wildcardType) {
                m20723a((Type[]) wildcardType.getUpperBounds());
            }

            /* renamed from: a */
            final void mo4848a(ParameterizedType parameterizedType) {
                h.mo7529c((Class) parameterizedType.getRawType());
            }

            /* renamed from: a */
            final void mo4847a(Class<?> cls) {
                h.mo7529c(cls);
            }

            /* renamed from: a */
            final void mo4852a(GenericArrayType genericArrayType) {
                h.mo7529c(C4626e.m20729a(C6384c.m27884a(genericArrayType.getGenericComponentType())));
            }
        }.m20723a(type);
        return h.mo7525a();
    }

    /* renamed from: c */
    private C6384c<?> m27887c(Type type) {
        C5571j.m24292a((Object) type);
        C4615b c4615b = this.f23719b;
        if (c4615b == null) {
            c4615b = C4615b.m20708a(this.f23718a);
            this.f23719b = c4615b;
        }
        type = C6384c.m27885b(c4615b.m20711b(type));
        type.f23719b = this.f23719b;
        return type;
    }
}
