package com.google.android.m4b.maps.ah;

import com.google.android.m4b.maps.aa.ae;
import com.google.android.m4b.maps.aa.ae.C7397a;
import com.google.android.m4b.maps.aa.as;
import com.google.android.m4b.maps.p125y.C5566g;
import com.google.android.m4b.maps.p125y.C5569h;
import com.google.android.m4b.maps.p125y.C5571j;
import com.google.android.m4b.maps.p125y.C5573l;
import com.google.android.m4b.maps.p125y.C6849f;
import com.tinder.api.ManagerWebServices;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.google.android.m4b.maps.ah.e */
final class C4626e {
    /* renamed from: a */
    private static final C6849f<Type, String> f17052a = new C74291();
    /* renamed from: b */
    private static final C5566g f17053b = C5566g.m24266a(", ").mo5819b(ManagerWebServices.NULL_STRING_VALUE);

    /* renamed from: com.google.android.m4b.maps.ah.e$a */
    enum C4619a {
        OWNED_BY_ENCLOSING_CLASS {
            /* renamed from: a */
            final Class<?> mo4856a(Class<?> cls) {
                return cls.getEnclosingClass();
            }
        },
        LOCAL_CLASS_HAS_NO_OWNER {
            /* renamed from: a */
            final Class<?> mo4856a(Class<?> cls) {
                if (cls.isLocalClass()) {
                    return null;
                }
                return cls.getEnclosingClass();
            }
        };
        
        /* renamed from: a */
        static final C4619a f17034a = null;

        /* renamed from: com.google.android.m4b.maps.ah.e$a$a */
        class C4618a<T> {
            C4618a() {
            }
        }

        /* renamed from: com.google.android.m4b.maps.ah.e$a$3 */
        static class C63873 extends C4618a<String> {
            C63873() {
            }
        }

        /* renamed from: a */
        abstract Class<?> mo4856a(Class<?> cls);

        static {
            ParameterizedType parameterizedType = (ParameterizedType) new C63873().getClass().getGenericSuperclass();
            C4619a[] values = C4619a.values();
            int length = values.length;
            int i;
            while (i < length) {
                C4619a c4619a = values[i];
                if (c4619a.mo4856a(C4618a.class) == parameterizedType.getOwnerType()) {
                    f17034a = c4619a;
                    return;
                }
                i++;
            }
            throw new AssertionError();
        }
    }

    /* renamed from: com.google.android.m4b.maps.ah.e$b */
    static final class C4620b implements Serializable, GenericArrayType {
        private static final long serialVersionUID = 0;
        /* renamed from: a */
        private final Type f17038a;

        C4620b(Type type) {
            this.f17038a = C4621c.f17039a.mo4858b(type);
        }

        public final Type getGenericComponentType() {
            return this.f17038a;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(C4626e.m20737b(this.f17038a));
            stringBuilder.append("[]");
            return stringBuilder.toString();
        }

        public final int hashCode() {
            return this.f17038a.hashCode();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GenericArrayType)) {
                return null;
            }
            return C5569h.m24284a(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
        }
    }

    /* renamed from: com.google.android.m4b.maps.ah.e$c */
    enum C4621c {
        JAVA6 {
            /* renamed from: b */
            final Type mo4858b(Type type) {
                C5571j.m24292a((Object) type);
                if (type instanceof Class) {
                    Class cls = (Class) type;
                    if (cls.isArray()) {
                        return new C4620b(cls.getComponentType());
                    }
                }
                return type;
            }

            /* renamed from: a */
            final /* synthetic */ Type mo4857a(Type type) {
                return new C4620b(type);
            }
        },
        JAVA7 {
            /* renamed from: a */
            final Type mo4857a(Type type) {
                if (type instanceof Class) {
                    return C4626e.m20729a((Class) type);
                }
                return new C4620b(type);
            }

            /* renamed from: b */
            final Type mo4858b(Type type) {
                return (Type) C5571j.m24292a((Object) type);
            }
        };
        
        /* renamed from: a */
        static final C4621c f17039a = null;

        /* renamed from: com.google.android.m4b.maps.ah.e$c$1 */
        static class C63881 extends C4611a<int[]> {
            C63881() {
            }
        }

        /* renamed from: a */
        abstract Type mo4857a(Type type);

        /* renamed from: b */
        abstract Type mo4858b(Type type);

        /* renamed from: a */
        final ae<Type> m20725a(Type[] typeArr) {
            C7397a g = ae.m27686g();
            for (Type b : typeArr) {
                g.m31831c(mo4858b(b));
            }
            return g.m31828a();
        }
    }

    /* renamed from: com.google.android.m4b.maps.ah.e$d */
    static final class C4622d<X> {
        /* renamed from: a */
        static final boolean f17043a = (C4622d.class.getTypeParameters()[0].equals(C4626e.m20733a((GenericDeclaration) C4622d.class, "X", new Type[0])) ^ 1);

        C4622d() {
        }
    }

    /* renamed from: com.google.android.m4b.maps.ah.e$e */
    static final class C4623e implements Serializable, ParameterizedType {
        private static final long serialVersionUID = 0;
        /* renamed from: a */
        private final Type f17044a;
        /* renamed from: b */
        private final ae<Type> f17045b;
        /* renamed from: c */
        private final Class<?> f17046c;

        C4623e(Type type, Class<?> cls, Type[] typeArr) {
            C5571j.m24292a((Object) cls);
            C5571j.m24297a(typeArr.length == cls.getTypeParameters().length);
            C4626e.m20734a(typeArr, "type parameter");
            this.f17044a = type;
            this.f17046c = cls;
            this.f17045b = C4621c.f17039a.m20725a(typeArr);
        }

        public final Type[] getActualTypeArguments() {
            return ((Type[]) this.f17045b.toArray(new Type[this.f17045b.size()]));
        }

        public final Type getRawType() {
            return this.f17046c;
        }

        public final Type getOwnerType() {
            return this.f17044a;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            if (this.f17044a != null) {
                stringBuilder.append(C4626e.m20737b(this.f17044a));
                stringBuilder.append('.');
            }
            stringBuilder.append(this.f17046c.getName());
            stringBuilder.append('<');
            stringBuilder.append(C4626e.f17053b.m24269a(as.m20500a(this.f17045b, C4626e.f17052a)));
            stringBuilder.append('>');
            return stringBuilder.toString();
        }

        public final int hashCode() {
            return ((this.f17044a == null ? 0 : this.f17044a.hashCode()) ^ this.f17045b.hashCode()) ^ this.f17046c.hashCode();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (getRawType().equals(parameterizedType.getRawType()) && C5569h.m24284a(getOwnerType(), parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments()) != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.android.m4b.maps.ah.e$f */
    static final class C4624f<D extends GenericDeclaration> implements TypeVariable<D> {
        /* renamed from: a */
        private final D f17047a;
        /* renamed from: b */
        private final String f17048b;
        /* renamed from: c */
        private final ae<Type> f17049c;

        C4624f(D d, String str, Type[] typeArr) {
            C4626e.m20734a(typeArr, "bound for type variable");
            this.f17047a = (GenericDeclaration) C5571j.m24292a((Object) d);
            this.f17048b = (String) C5571j.m24292a((Object) str);
            this.f17049c = ae.m27682a((Object[]) typeArr);
        }

        public final Type[] getBounds() {
            return ((Type[]) this.f17049c.toArray(new Type[this.f17049c.size()]));
        }

        public final D getGenericDeclaration() {
            return this.f17047a;
        }

        public final String getName() {
            return this.f17048b;
        }

        public final String toString() {
            return this.f17048b;
        }

        public final int hashCode() {
            return this.f17047a.hashCode() ^ this.f17048b.hashCode();
        }

        public final boolean equals(Object obj) {
            if (C4622d.f17043a) {
                if (!(obj instanceof C4624f)) {
                    return false;
                }
                C4624f c4624f = (C4624f) obj;
                return this.f17048b.equals(c4624f.getName()) && this.f17047a.equals(c4624f.getGenericDeclaration()) && this.f17049c.equals(c4624f.f17049c) != null;
            } else if (!(obj instanceof TypeVariable)) {
                return false;
            } else {
                TypeVariable typeVariable = (TypeVariable) obj;
                return this.f17048b.equals(typeVariable.getName()) && this.f17047a.equals(typeVariable.getGenericDeclaration()) != null;
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.ah.e$g */
    static final class C4625g implements Serializable, WildcardType {
        private static final long serialVersionUID = 0;
        /* renamed from: a */
        private final ae<Type> f17050a;
        /* renamed from: b */
        private final ae<Type> f17051b;

        C4625g(Type[] typeArr, Type[] typeArr2) {
            C4626e.m20734a(typeArr, "lower bound for wildcard");
            C4626e.m20734a(typeArr2, "upper bound for wildcard");
            this.f17050a = C4621c.f17039a.m20725a(typeArr);
            this.f17051b = C4621c.f17039a.m20725a(typeArr2);
        }

        public final Type[] getLowerBounds() {
            return ((Type[]) this.f17050a.toArray(new Type[this.f17050a.size()]));
        }

        public final Type[] getUpperBounds() {
            return ((Type[]) this.f17051b.toArray(new Type[this.f17051b.size()]));
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) obj;
            if (!this.f17050a.equals(Arrays.asList(wildcardType.getLowerBounds())) || this.f17051b.equals(Arrays.asList(wildcardType.getUpperBounds())) == null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.f17050a.hashCode() ^ this.f17051b.hashCode();
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("?");
            Iterator it = this.f17050a.iterator();
            while (it.hasNext()) {
                Type type = (Type) it.next();
                stringBuilder.append(" super ");
                stringBuilder.append(C4626e.m20737b(type));
            }
            for (Type type2 : as.m20501a(this.f17051b, C5573l.m24305a(C5573l.m24306a((Object) Object.class)))) {
                stringBuilder.append(" extends ");
                stringBuilder.append(C4626e.m20737b(type2));
            }
            return stringBuilder.toString();
        }
    }

    /* renamed from: com.google.android.m4b.maps.ah.e$1 */
    static class C74291 implements C6849f<Type, String> {
        C74291() {
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo7022a(Object obj) {
            return C4626e.m20737b((Type) obj);
        }
    }

    /* renamed from: a */
    static Type m20732a(Type type) {
        if (!(type instanceof WildcardType)) {
            return C4621c.f17039a.mo4857a(type);
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        boolean z = true;
        C5571j.m24298a(lowerBounds.length <= 1, (Object) "Wildcard cannot have more than one lower bounds.");
        if (lowerBounds.length == 1) {
            return new C4625g(new Type[]{C4626e.m20732a(lowerBounds[0])}, new Type[]{Object.class});
        }
        type = wildcardType.getUpperBounds();
        if (type.length != 1) {
            z = false;
        }
        C5571j.m24298a(z, (Object) "Wildcard should have only one upper bound.");
        return C4626e.m20738c(C4626e.m20732a(type[0]));
    }

    /* renamed from: a */
    static <D extends GenericDeclaration> TypeVariable<D> m20733a(D d, String str, Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        return new C4624f(d, str, typeArr);
    }

    /* renamed from: c */
    private static WildcardType m20738c(Type type) {
        return new C4625g(new Type[0], new Type[]{type});
    }

    /* renamed from: b */
    static String m20737b(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* renamed from: a */
    static Class<?> m20729a(Class<?> cls) {
        return Array.newInstance(cls, 0).getClass();
    }

    /* renamed from: a */
    static ParameterizedType m20731a(Type type, Class<?> cls, Type... typeArr) {
        if (type == null) {
            return new C4623e(C4619a.f17034a.mo4856a(cls), cls, typeArr);
        }
        C5571j.m24292a((Object) typeArr);
        C5571j.m24299a(cls.getEnclosingClass() != null, "Owner type for unenclosed %s", cls);
        return new C4623e(type, cls, typeArr);
    }

    /* renamed from: a */
    static /* synthetic */ void m20734a(Type[] typeArr, String str) {
        for (Type type : typeArr) {
            if (type instanceof Class) {
                C5571j.m24299a(((Class) type).isPrimitive() ^ true, "Primitive type '%s' used as %s", (Class) type, str);
            }
        }
    }
}
