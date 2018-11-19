package com.squareup.moshi;

import com.tinder.api.ManagerWebServices;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import javax.annotation.Nullable;

/* renamed from: com.squareup.moshi.r */
public final class C5992r {
    /* renamed from: a */
    static final Type[] f21878a = new Type[0];

    /* renamed from: com.squareup.moshi.r$a */
    private static final class C5989a implements GenericArrayType {
        /* renamed from: a */
        private final Type f21872a;

        C5989a(Type type) {
            this.f21872a = C5992r.m25685d(type);
        }

        public Type getGenericComponentType() {
            return this.f21872a;
        }

        public boolean equals(Object obj) {
            return (!(obj instanceof GenericArrayType) || C5992r.m25680a((Type) this, (GenericArrayType) obj) == null) ? null : true;
        }

        public int hashCode() {
            return this.f21872a.hashCode();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(C5992r.m25687f(this.f21872a));
            stringBuilder.append("[]");
            return stringBuilder.toString();
        }
    }

    /* renamed from: com.squareup.moshi.r$b */
    private static final class C5990b implements ParameterizedType {
        /* renamed from: a */
        final Type[] f21873a;
        @Nullable
        /* renamed from: b */
        private final Type f21874b;
        /* renamed from: c */
        private final Type f21875c;

        C5990b(@Nullable Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Object obj = 1;
                Object obj2 = type == null ? 1 : null;
                if (((Class) type2).getEnclosingClass() != null) {
                    obj = null;
                }
                if (obj2 != obj) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("unexpected owner type for ");
                    stringBuilder.append(type2);
                    stringBuilder.append(": ");
                    stringBuilder.append(type);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            if (type == null) {
                type = null;
            } else {
                type = C5992r.m25685d(type);
            }
            this.f21874b = type;
            this.f21875c = C5992r.m25685d(type2);
            this.f21873a = (Type[]) typeArr.clone();
            for (int i = 0; i < this.f21873a.length; i++) {
                if (this.f21873a[i] == null) {
                    throw new NullPointerException();
                }
                C5992r.m25691j(this.f21873a[i]);
                this.f21873a[i] = C5992r.m25685d(this.f21873a[i]);
            }
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.f21873a.clone();
        }

        public Type getRawType() {
            return this.f21875c;
        }

        @Nullable
        public Type getOwnerType() {
            return this.f21874b;
        }

        public boolean equals(Object obj) {
            return (!(obj instanceof ParameterizedType) || C5992r.m25680a((Type) this, (ParameterizedType) obj) == null) ? null : true;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f21873a) ^ this.f21875c.hashCode()) ^ C5992r.m25670a(this.f21874b);
        }

        public String toString() {
            int i = 1;
            StringBuilder stringBuilder = new StringBuilder((this.f21873a.length + 1) * 30);
            stringBuilder.append(C5992r.m25687f(this.f21875c));
            if (this.f21873a.length == 0) {
                return stringBuilder.toString();
            }
            stringBuilder.append("<");
            stringBuilder.append(C5992r.m25687f(this.f21873a[0]));
            while (i < this.f21873a.length) {
                stringBuilder.append(", ");
                stringBuilder.append(C5992r.m25687f(this.f21873a[i]));
                i++;
            }
            stringBuilder.append(">");
            return stringBuilder.toString();
        }
    }

    /* renamed from: com.squareup.moshi.r$c */
    private static final class C5991c implements WildcardType {
        /* renamed from: a */
        private final Type f21876a;
        @Nullable
        /* renamed from: b */
        private final Type f21877b;

        C5991c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            } else if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            } else if (typeArr2.length == 1) {
                if (typeArr2[0] == null) {
                    throw new NullPointerException();
                }
                C5992r.m25691j(typeArr2[0]);
                if (typeArr[0] != Object.class) {
                    throw new IllegalArgumentException();
                }
                this.f21877b = C5992r.m25685d(typeArr2[0]);
                this.f21876a = Object.class;
            } else if (typeArr[0] == null) {
                throw new NullPointerException();
            } else {
                C5992r.m25691j(typeArr[0]);
                this.f21877b = null;
                this.f21876a = C5992r.m25685d(typeArr[0]);
            }
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.f21876a};
        }

        public Type[] getLowerBounds() {
            if (this.f21877b == null) {
                return C5992r.f21878a;
            }
            return new Type[]{this.f21877b};
        }

        public boolean equals(Object obj) {
            return (!(obj instanceof WildcardType) || C5992r.m25680a((Type) this, (WildcardType) obj) == null) ? null : true;
        }

        public int hashCode() {
            return (this.f21877b != null ? this.f21877b.hashCode() + 31 : 1) ^ (this.f21876a.hashCode() + 31);
        }

        public String toString() {
            StringBuilder stringBuilder;
            if (this.f21877b != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("? super ");
                stringBuilder.append(C5992r.m25687f(this.f21877b));
                return stringBuilder.toString();
            } else if (this.f21876a == Object.class) {
                return "?";
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("? extends ");
                stringBuilder.append(C5992r.m25687f(this.f21876a));
                return stringBuilder.toString();
            }
        }
    }

    /* renamed from: a */
    public static ParameterizedType m25674a(Type type, Type... typeArr) {
        return new C5990b(null, type, typeArr);
    }

    /* renamed from: a */
    public static GenericArrayType m25673a(Type type) {
        return new C5989a(type);
    }

    /* renamed from: b */
    public static WildcardType m25682b(Type type) {
        return new C5991c(new Type[]{type}, f21878a);
    }

    /* renamed from: c */
    public static WildcardType m25684c(Type type) {
        return new C5991c(new Type[]{Object.class}, new Type[]{type});
    }

    /* renamed from: d */
    static Type m25685d(Type type) {
        if (type instanceof Class) {
            type = (Class) type;
            if (type.isArray()) {
                type = new C5989a(C5992r.m25685d(type.getComponentType()));
            }
            return type;
        } else if (type instanceof ParameterizedType) {
            if (type instanceof C5990b) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C5990b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            if (type instanceof C5989a) {
                return type;
            }
            return new C5989a(((GenericArrayType) type).getGenericComponentType());
        } else if (!(type instanceof WildcardType) || (type instanceof C5991c)) {
            return type;
        } else {
            WildcardType wildcardType = (WildcardType) type;
            return new C5991c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    /* renamed from: e */
    public static Class<?> m25686e(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(C5992r.m25686e(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return C5992r.m25686e(((WildcardType) type).getUpperBounds()[0]);
        }
        String str;
        if (type == null) {
            str = ManagerWebServices.NULL_STRING_VALUE;
        } else {
            str = type.getClass().getName();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected a Class, ParameterizedType, or GenericArrayType, but <");
        stringBuilder.append(type);
        stringBuilder.append("> is of type ");
        stringBuilder.append(str);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: a */
    static boolean m25679a(@Nullable Object obj, @Nullable Object obj2) {
        if (obj != obj2) {
            if (obj == null || obj.equals(obj2) == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m25680a(@Nullable Type type, @Nullable Type type2) {
        boolean z = true;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            if (type2 instanceof GenericArrayType) {
                return C5992r.m25680a(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return type.equals(type2);
        } else if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Object[] objArr;
            if (parameterizedType instanceof C5990b) {
                objArr = ((C5990b) parameterizedType).f21873a;
            } else {
                objArr = parameterizedType.getActualTypeArguments();
            }
            Object[] objArr2;
            if (parameterizedType2 instanceof C5990b) {
                objArr2 = ((C5990b) parameterizedType2).f21873a;
            } else {
                objArr2 = parameterizedType2.getActualTypeArguments();
            }
            if (!C5992r.m25679a(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) || parameterizedType.getRawType().equals(parameterizedType2.getRawType()) == null || Arrays.equals(r1, r3) == null) {
                z = false;
            }
            return z;
        } else if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return C5992r.m25680a(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return C5992r.m25680a(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (!Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) || Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds()) == null) {
                z = false;
            }
            return z;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() != typeVariable2.getGenericDeclaration() || typeVariable.getName().equals(typeVariable2.getName()) == null) {
                z = false;
            }
            return z;
        }
    }

    /* renamed from: a */
    static int m25670a(@Nullable Object obj) {
        return obj != null ? obj.hashCode() : null;
    }

    /* renamed from: f */
    static String m25687f(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* renamed from: a */
    static Type m25676a(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface() != null) {
            type = cls.getInterfaces();
            int length = type.length;
            for (int i = 0; i < length; i++) {
                if (type[i] == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(type[i])) {
                    return C5992r.m25676a(cls.getGenericInterfaces()[i], type[i], (Class) cls2);
                }
            }
        }
        if (cls.isInterface() == null) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return C5992r.m25676a(cls.getGenericSuperclass(), (Class) superclass, (Class) cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: b */
    static Type m25681b(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C5992r.m25677a(type, (Class) cls, C5992r.m25676a(type, (Class) cls, (Class) cls2));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: g */
    static Type m25688g(Type type) {
        Class e = C5992r.m25686e(type);
        return C5992r.m25677a(type, e, e.getGenericSuperclass());
    }

    /* renamed from: h */
    static Type m25689h(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        return type instanceof Class ? ((Class) type).getComponentType() : null;
    }

    /* renamed from: a */
    public static Type m25675a(Type type, Class<?> cls) {
        type = C5992r.m25681b(type, cls, Collection.class);
        if ((type instanceof WildcardType) != null) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        if ((type instanceof ParameterizedType) != null) {
            return ((ParameterizedType) type).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    /* renamed from: b */
    static Type[] m25683b(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        type = C5992r.m25681b(type, cls, Map.class);
        if ((type instanceof ParameterizedType) != null) {
            return ((ParameterizedType) type).getActualTypeArguments();
        }
        return new Type[]{Object.class, Object.class};
    }

    /* renamed from: a */
    static Type m25677a(Type type, Class<?> cls, Type type2) {
        while (type2 instanceof TypeVariable) {
            type2 = (TypeVariable) type2;
            Type a = C5992r.m25678a(type, (Class) cls, (TypeVariable) type2);
            if (a == type2) {
                return a;
            }
            type2 = a;
        }
        if (type2 instanceof Class) {
            a = (Class) type2;
            if (a.isArray()) {
                type2 = a.getComponentType();
                type = C5992r.m25677a(type, (Class) cls, type2);
                if (type2 != type) {
                    a = C5992r.m25673a(type);
                }
                return a;
            }
        }
        if (type2 instanceof GenericArrayType) {
            type2 = (GenericArrayType) type2;
            a = type2.getGenericComponentType();
            type = C5992r.m25677a(type, (Class) cls, a);
            if (a != type) {
                type2 = C5992r.m25673a(type);
            }
            return type2;
        }
        int i = 0;
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            a = parameterizedType.getOwnerType();
            Type a2 = C5992r.m25677a(type, (Class) cls, a);
            Object obj = a2 != a ? 1 : null;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            while (i < length) {
                Type a3 = C5992r.m25677a(type, (Class) cls, actualTypeArguments[i]);
                if (a3 != actualTypeArguments[i]) {
                    if (obj == null) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        obj = 1;
                    }
                    actualTypeArguments[i] = a3;
                }
                i++;
            }
            return obj != null ? new C5990b(a2, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        } else if (!(type2 instanceof WildcardType)) {
            return type2;
        } else {
            WildcardType wildcardType = (WildcardType) type2;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                type = C5992r.m25677a(type, (Class) cls, lowerBounds[0]);
                if (type != lowerBounds[0]) {
                    return C5992r.m25684c(type);
                }
            } else if (upperBounds.length == 1) {
                type = C5992r.m25677a(type, (Class) cls, upperBounds[0]);
                if (type != upperBounds[0]) {
                    return C5992r.m25682b(type);
                }
            }
            return wildcardType;
        }
    }

    /* renamed from: a */
    static Type m25678a(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class a = C5992r.m25672a((TypeVariable) typeVariable);
        if (a == null) {
            return typeVariable;
        }
        type = C5992r.m25676a(type, (Class) cls, a);
        if ((type instanceof ParameterizedType) == null) {
            return typeVariable;
        }
        return ((ParameterizedType) type).getActualTypeArguments()[C5992r.m25671a(a.getTypeParameters(), (Object) typeVariable)];
    }

    /* renamed from: i */
    static boolean m25690i(Type type) {
        if (!(type == Boolean.class || type == Byte.class || type == Character.class || type == Double.class || type == Float.class || type == Integer.class || type == Long.class || type == Short.class || type == String.class)) {
            if (type != Object.class) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static int m25671a(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    @Nullable
    /* renamed from: a */
    private static Class<?> m25672a(TypeVariable<?> typeVariable) {
        typeVariable = typeVariable.getGenericDeclaration();
        return typeVariable instanceof Class ? (Class) typeVariable : null;
    }

    /* renamed from: j */
    static void m25691j(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive() != null) {
            throw new IllegalArgumentException();
        }
    }
}
