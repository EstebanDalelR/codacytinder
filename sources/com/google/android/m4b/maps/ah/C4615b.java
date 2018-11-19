package com.google.android.m4b.maps.ah;

import com.google.android.m4b.maps.aa.af;
import com.google.android.m4b.maps.aa.af.C4540a;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.ah.C4626e.C4622d;
import com.google.android.m4b.maps.ah.C4626e.C4625g;
import com.google.android.m4b.maps.p125y.C5566g;
import com.google.android.m4b.maps.p125y.C5571j;
import com.tinder.api.ManagerWebServices;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.m4b.maps.ah.b */
public final class C4615b {
    /* renamed from: a */
    private final C4612b f17030a;

    /* renamed from: com.google.android.m4b.maps.ah.b$b */
    static class C4612b {
        /* renamed from: a */
        private final af<C4613c, Type> f17027a;

        /* renamed from: com.google.android.m4b.maps.ah.b$b$1 */
        class C63781 extends C4612b {
            /* renamed from: a */
            private /* synthetic */ TypeVariable f23709a;
            /* renamed from: b */
            private /* synthetic */ C4612b f23710b;
            /* renamed from: c */
            private /* synthetic */ C4612b f23711c;

            C63781(C4612b c4612b, TypeVariable typeVariable, C4612b c4612b2) {
                this.f23711c = c4612b;
                this.f23709a = typeVariable;
                this.f23710b = c4612b2;
            }

            /* renamed from: a */
            public final Type mo4851a(TypeVariable<?> typeVariable, C4612b c4612b) {
                if (typeVariable.getGenericDeclaration().equals(this.f23709a.getGenericDeclaration())) {
                    return typeVariable;
                }
                return this.f23710b.mo4851a(typeVariable, c4612b);
            }
        }

        C4612b() {
            this.f17027a = af.m20492d();
        }

        private C4612b(af<C4613c, Type> afVar) {
            this.f17027a = afVar;
        }

        /* renamed from: a */
        final C4612b m20702a(Map<C4613c, ? extends Type> map) {
            C4540a e = af.m20493e();
            e.mo4794a(this.f17027a);
            map = map.entrySet().iterator();
            while (map.hasNext()) {
                Entry entry = (Entry) map.next();
                C4613c c4613c = (C4613c) entry.getKey();
                Type type = (Type) entry.getValue();
                C5571j.m24299a(c4613c.m20706b(type) ^ true, "Type variable %s bound to itself", c4613c);
                e.mo4792a(c4613c, type);
            }
            return new C4612b(e.mo4795a());
        }

        /* renamed from: a */
        Type mo4851a(TypeVariable<?> typeVariable, C4612b c4612b) {
            Type type = (Type) this.f17027a.get(new C4613c(typeVariable));
            if (type != null) {
                return new C4615b(c4612b).m20711b(type);
            }
            Type[] bounds = typeVariable.getBounds();
            if (bounds.length == 0) {
                return typeVariable;
            }
            Type[] a = new C4615b(c4612b).m20710a(bounds);
            if (C4622d.f17043a && Arrays.equals(bounds, a)) {
                return typeVariable;
            }
            return C4626e.m20733a(typeVariable.getGenericDeclaration(), typeVariable.getName(), a);
        }
    }

    /* renamed from: com.google.android.m4b.maps.ah.b$c */
    static final class C4613c {
        /* renamed from: a */
        private final TypeVariable<?> f17028a;

        C4613c(TypeVariable<?> typeVariable) {
            this.f17028a = (TypeVariable) C5571j.m24292a((Object) typeVariable);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f17028a.getGenericDeclaration(), this.f17028a.getName()});
        }

        public final boolean equals(Object obj) {
            return obj instanceof C4613c ? m20705a(((C4613c) obj).f17028a) : null;
        }

        public final String toString() {
            return this.f17028a.toString();
        }

        /* renamed from: a */
        static Object m20704a(Type type) {
            return type instanceof TypeVariable ? new C4613c((TypeVariable) type) : null;
        }

        /* renamed from: b */
        final boolean m20706b(Type type) {
            return type instanceof TypeVariable ? m20705a((TypeVariable) type) : null;
        }

        /* renamed from: a */
        private boolean m20705a(TypeVariable<?> typeVariable) {
            return (!this.f17028a.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) || this.f17028a.getName().equals(typeVariable.getName()) == null) ? null : true;
        }
    }

    /* renamed from: com.google.android.m4b.maps.ah.b$d */
    static final class C4614d {
        /* renamed from: a */
        private final AtomicInteger f17029a;

        private C4614d() {
            this.f17029a = new AtomicInteger();
        }

        /* renamed from: a */
        final Type m20707a(Type type) {
            C5571j.m24292a((Object) type);
            if ((type instanceof Class) || (type instanceof TypeVariable)) {
                return type;
            }
            if (type instanceof GenericArrayType) {
                return C4626e.m20732a(m20707a(((GenericArrayType) type).getGenericComponentType()));
            }
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Type ownerType = parameterizedType.getOwnerType();
                ownerType = ownerType == null ? null : m20707a(ownerType);
                Class cls = (Class) parameterizedType.getRawType();
                type = parameterizedType.getActualTypeArguments();
                Type[] typeArr = new Type[type.length];
                for (int i = 0; i < type.length; i++) {
                    typeArr[i] = m20707a(type[i]);
                }
                return C4626e.m20731a(ownerType, cls, typeArr);
            } else if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                if (wildcardType.getLowerBounds().length != 0) {
                    return type;
                }
                Object[] upperBounds = wildcardType.getUpperBounds();
                StringBuilder stringBuilder = new StringBuilder("capture#");
                stringBuilder.append(this.f17029a.incrementAndGet());
                stringBuilder.append("-of ? extends ");
                stringBuilder.append(C5566g.m24265a((char) ManagerWebServices.QUERY_AMPERSAND).m24271a(upperBounds));
                return C4626e.m20733a((GenericDeclaration) C4614d.class, stringBuilder.toString(), wildcardType.getUpperBounds());
            } else {
                throw new AssertionError("must have been one of the known types");
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.ah.b$a */
    static final class C6377a extends C4617d {
        /* renamed from: a */
        private static final C4614d f23707a = new C4614d();
        /* renamed from: b */
        private final Map<C4613c, Type> f23708b = ax.m20623b();

        private C6377a() {
        }

        /* renamed from: a */
        static af<C4613c, Type> m27864a(Type type) {
            C6377a c6377a = new C6377a();
            c6377a.m20723a(f23707a.m20707a(type));
            return af.m20489a(c6377a.f23708b);
        }

        /* renamed from: a */
        final void mo4847a(Class<?> cls) {
            m20723a(cls.getGenericSuperclass());
            m20723a((Type[]) cls.getGenericInterfaces());
        }

        /* renamed from: a */
        final void mo4848a(ParameterizedType parameterizedType) {
            TypeVariable[] typeParameters = ((Class) parameterizedType.getRawType()).getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            C5571j.m24301b(typeParameters.length == actualTypeArguments.length);
            for (int i = 0; i < typeParameters.length; i++) {
                C4613c c4613c = new C4613c(typeParameters[i]);
                Type type = actualTypeArguments[i];
                if (!this.f23708b.containsKey(c4613c)) {
                    Type type2 = type;
                    while (type2 != null) {
                        if (c4613c.m20706b(type2)) {
                            while (type != null) {
                                type = (Type) this.f23708b.remove(C4613c.m20704a(type));
                            }
                        } else {
                            type2 = (Type) this.f23708b.get(C4613c.m20704a(type2));
                        }
                    }
                    this.f23708b.put(c4613c, type);
                }
            }
            m20723a(r0);
            m20723a(parameterizedType.getOwnerType());
        }

        /* renamed from: a */
        final void mo4849a(TypeVariable<?> typeVariable) {
            m20723a((Type[]) typeVariable.getBounds());
        }

        /* renamed from: a */
        final void mo4850a(WildcardType wildcardType) {
            m20723a((Type[]) wildcardType.getUpperBounds());
        }
    }

    public C4615b() {
        this.f17030a = new C4612b();
    }

    private C4615b(C4612b c4612b) {
        this.f17030a = c4612b;
    }

    /* renamed from: a */
    static C4615b m20708a(Type type) {
        C4615b c4615b = new C4615b();
        return new C4615b(c4615b.f17030a.m20702a(C6377a.m27864a(type)));
    }

    /* renamed from: b */
    public final Type m20711b(Type type) {
        C5571j.m24292a((Object) type);
        if (type instanceof TypeVariable) {
            C4612b c4612b = this.f17030a;
            TypeVariable typeVariable = (TypeVariable) type;
            return c4612b.mo4851a(typeVariable, new C63781(c4612b, typeVariable, c4612b));
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType == null) {
                ownerType = null;
            } else {
                ownerType = m20711b(ownerType);
            }
            return C4626e.m20731a(ownerType, (Class) m20711b(parameterizedType.getRawType()), m20710a(parameterizedType.getActualTypeArguments()));
        } else if (type instanceof GenericArrayType) {
            return C4626e.m20732a(m20711b(((GenericArrayType) type).getGenericComponentType()));
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new C4625g(m20710a(wildcardType.getLowerBounds()), m20710a(wildcardType.getUpperBounds()));
        }
    }

    /* renamed from: a */
    private Type[] m20710a(Type[] typeArr) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i = 0; i < typeArr.length; i++) {
            typeArr2[i] = m20711b(typeArr[i]);
        }
        return typeArr2;
    }
}
