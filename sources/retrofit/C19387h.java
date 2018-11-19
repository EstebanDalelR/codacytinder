package retrofit;

import com.tinder.api.ManagerWebServices;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;

/* renamed from: retrofit.h */
final class C19387h {
    /* renamed from: a */
    private static final Type[] f60525a = new Type[0];

    /* renamed from: retrofit.h$a */
    private static final class C19384a implements GenericArrayType {
        /* renamed from: a */
        private final Type f60519a;

        public C19384a(Type type) {
            this.f60519a = type;
        }

        public Type getGenericComponentType() {
            return this.f60519a;
        }

        public boolean equals(Object obj) {
            return (!(obj instanceof GenericArrayType) || C19387h.m69581a((Type) this, (GenericArrayType) obj) == null) ? null : true;
        }

        public int hashCode() {
            return this.f60519a.hashCode();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(C19387h.m69584b(this.f60519a));
            stringBuilder.append("[]");
            return stringBuilder.toString();
        }
    }

    /* renamed from: retrofit.h$b */
    private static final class C19385b implements ParameterizedType {
        /* renamed from: a */
        private final Type f60520a;
        /* renamed from: b */
        private final Type f60521b;
        /* renamed from: c */
        private final Type[] f60522c;

        public C19385b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Object obj = 1;
                Object obj2 = type == null ? 1 : null;
                if (((Class) type2).getEnclosingClass() != null) {
                    obj = null;
                }
                if (obj2 != obj) {
                    throw new IllegalArgumentException();
                }
            }
            this.f60520a = type;
            this.f60521b = type2;
            this.f60522c = (Type[]) typeArr.clone();
            for (Type[] typeArr2 : this.f60522c) {
                if (typeArr2 == null) {
                    throw new NullPointerException();
                }
                C19387h.m69587d(typeArr2);
            }
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.f60522c.clone();
        }

        public Type getRawType() {
            return this.f60521b;
        }

        public Type getOwnerType() {
            return this.f60520a;
        }

        public boolean equals(Object obj) {
            return (!(obj instanceof ParameterizedType) || C19387h.m69581a((Type) this, (ParameterizedType) obj) == null) ? null : true;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f60522c) ^ this.f60521b.hashCode()) ^ C19387h.m69583b(this.f60520a);
        }

        public String toString() {
            int i = 1;
            StringBuilder stringBuilder = new StringBuilder((this.f60522c.length + 1) * 30);
            stringBuilder.append(C19387h.m69584b(this.f60521b));
            if (this.f60522c.length == 0) {
                return stringBuilder.toString();
            }
            stringBuilder.append("<");
            stringBuilder.append(C19387h.m69584b(this.f60522c[0]));
            while (i < this.f60522c.length) {
                stringBuilder.append(", ");
                stringBuilder.append(C19387h.m69584b(this.f60522c[i]));
                i++;
            }
            stringBuilder.append(">");
            return stringBuilder.toString();
        }
    }

    /* renamed from: retrofit.h$c */
    private static final class C19386c implements WildcardType {
        /* renamed from: a */
        private final Type f60523a;
        /* renamed from: b */
        private final Type f60524b;

        public C19386c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            } else if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            } else if (typeArr2.length == 1) {
                if (typeArr2[0] == null) {
                    throw new NullPointerException();
                }
                C19387h.m69587d(typeArr2[0]);
                if (typeArr[0] != Object.class) {
                    throw new IllegalArgumentException();
                }
                this.f60524b = typeArr2[0];
                this.f60523a = Object.class;
            } else if (typeArr[0] == null) {
                throw new NullPointerException();
            } else {
                C19387h.m69587d(typeArr[0]);
                this.f60524b = null;
                this.f60523a = typeArr[0];
            }
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.f60523a};
        }

        public Type[] getLowerBounds() {
            if (this.f60524b == null) {
                return C19387h.f60525a;
            }
            return new Type[]{this.f60524b};
        }

        public boolean equals(Object obj) {
            return (!(obj instanceof WildcardType) || C19387h.m69581a((Type) this, (WildcardType) obj) == null) ? null : true;
        }

        public int hashCode() {
            return (this.f60524b != null ? this.f60524b.hashCode() + 31 : 1) ^ (this.f60523a.hashCode() + 31);
        }

        public String toString() {
            StringBuilder stringBuilder;
            if (this.f60524b != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("? super ");
                stringBuilder.append(C19387h.m69584b(this.f60524b));
                return stringBuilder.toString();
            } else if (this.f60523a == Object.class) {
                return "?";
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("? extends ");
                stringBuilder.append(C19387h.m69584b(this.f60523a));
                return stringBuilder.toString();
            }
        }
    }

    /* renamed from: a */
    public static Class<?> m69575a(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            type = ((ParameterizedType) type).getRawType();
            if (type instanceof Class) {
                return (Class) type;
            }
            throw new IllegalArgumentException();
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(C19387h.m69575a(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return C19387h.m69575a(((WildcardType) type).getUpperBounds()[0]);
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
    }

    /* renamed from: a */
    public static boolean m69581a(Type type, Type type2) {
        boolean z = true;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (!C19387h.m69580a(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments()) == null) {
                z = false;
            }
            return z;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return C19387h.m69581a(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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
    static Type m69577a(Type type, Class<?> cls, Class<?> cls2) {
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
                    return C19387h.m69577a(cls.getGenericInterfaces()[i], type[i], (Class) cls2);
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
                    return C19387h.m69577a(cls.getGenericSuperclass(), (Class) superclass, (Class) cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: a */
    private static int m69574a(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: a */
    private static boolean m69580a(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || obj.equals(obj2) == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static int m69583b(Object obj) {
        return obj != null ? obj.hashCode() : null;
    }

    /* renamed from: b */
    public static String m69584b(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* renamed from: b */
    public static Type m69585b(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C19387h.m69578a(type, (Class) cls, C19387h.m69577a(type, (Class) cls, (Class) cls2));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public static Type m69578a(Type type, Class<?> cls, Type type2) {
        while (type2 instanceof TypeVariable) {
            type2 = (TypeVariable) type2;
            Type a = C19387h.m69579a(type, (Class) cls, (TypeVariable) type2);
            if (a == type2) {
                return a;
            }
            type2 = a;
        }
        if (type2 instanceof Class) {
            a = (Class) type2;
            if (a.isArray()) {
                type2 = a.getComponentType();
                type = C19387h.m69578a(type, (Class) cls, type2);
                if (type2 != type) {
                    a = new C19384a(type);
                }
                return a;
            }
        }
        if (type2 instanceof GenericArrayType) {
            type2 = (GenericArrayType) type2;
            a = type2.getGenericComponentType();
            type = C19387h.m69578a(type, (Class) cls, a);
            if (a != type) {
                type2 = new C19384a(type);
            }
            return type2;
        }
        int i = 0;
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            a = parameterizedType.getOwnerType();
            Type a2 = C19387h.m69578a(type, (Class) cls, a);
            Object obj = a2 != a ? 1 : null;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            while (i < length) {
                Type a3 = C19387h.m69578a(type, (Class) cls, actualTypeArguments[i]);
                if (a3 != actualTypeArguments[i]) {
                    if (obj == null) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        obj = 1;
                    }
                    actualTypeArguments[i] = a3;
                }
                i++;
            }
            return obj != null ? new C19385b(a2, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        } else if (!(type2 instanceof WildcardType)) {
            return type2;
        } else {
            WildcardType wildcardType = (WildcardType) type2;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                if (C19387h.m69578a(type, (Class) cls, lowerBounds[0]) != lowerBounds[0]) {
                    return new C19386c(new Type[]{Object.class}, new Type[]{C19387h.m69578a(type, (Class) cls, lowerBounds[0])});
                }
            } else if (upperBounds.length == 1 && C19387h.m69578a(type, (Class) cls, upperBounds[0]) != upperBounds[0]) {
                return new C19386c(new Type[]{C19387h.m69578a(type, (Class) cls, upperBounds[0])}, f60525a);
            }
            return wildcardType;
        }
    }

    /* renamed from: a */
    private static Type m69579a(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class a = C19387h.m69576a((TypeVariable) typeVariable);
        if (a == null) {
            return typeVariable;
        }
        type = C19387h.m69577a(type, (Class) cls, a);
        if ((type instanceof ParameterizedType) == null) {
            return typeVariable;
        }
        return ((ParameterizedType) type).getActualTypeArguments()[C19387h.m69574a(a.getTypeParameters(), (Object) typeVariable)];
    }

    /* renamed from: a */
    private static Class<?> m69576a(TypeVariable<?> typeVariable) {
        typeVariable = typeVariable.getGenericDeclaration();
        return typeVariable instanceof Class ? (Class) typeVariable : null;
    }

    /* renamed from: d */
    private static void m69587d(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive() != null) {
            throw new IllegalArgumentException();
        }
    }
}
