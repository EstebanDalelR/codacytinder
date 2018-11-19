package com.google.gson.internal;

import com.tinder.api.ManagerWebServices;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

/* renamed from: com.google.gson.internal.$Gson$Types */
public final class C$Gson$Types {
    static final Type[] EMPTY_TYPE_ARRAY = new Type[0];

    /* renamed from: com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl */
    private static final class GenericArrayTypeImpl implements Serializable, GenericArrayType {
        private static final long serialVersionUID = 0;
        private final Type componentType;

        public GenericArrayTypeImpl(Type type) {
            this.componentType = C$Gson$Types.canonicalize(type);
        }

        public Type getGenericComponentType() {
            return this.componentType;
        }

        public boolean equals(Object obj) {
            return (!(obj instanceof GenericArrayType) || C$Gson$Types.equals(this, (GenericArrayType) obj) == null) ? null : true;
        }

        public int hashCode() {
            return this.componentType.hashCode();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(C$Gson$Types.typeToString(this.componentType));
            stringBuilder.append("[]");
            return stringBuilder.toString();
        }
    }

    /* renamed from: com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl */
    private static final class ParameterizedTypeImpl implements Serializable, ParameterizedType {
        private static final long serialVersionUID = 0;
        private final Type ownerType;
        private final Type rawType;
        private final Type[] typeArguments;

        public ParameterizedTypeImpl(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Object obj;
                Class cls = (Class) type2;
                boolean z = true;
                if (!Modifier.isStatic(cls.getModifiers())) {
                    if (cls.getEnclosingClass() != null) {
                        obj = null;
                        if (type == null) {
                            if (obj != null) {
                                z = false;
                            }
                        }
                        C$Gson$Preconditions.checkArgument(z);
                    }
                }
                obj = 1;
                if (type == null) {
                    if (obj != null) {
                        z = false;
                    }
                }
                C$Gson$Preconditions.checkArgument(z);
            }
            if (type == null) {
                type = null;
            } else {
                type = C$Gson$Types.canonicalize(type);
            }
            this.ownerType = type;
            this.rawType = C$Gson$Types.canonicalize(type2);
            this.typeArguments = (Type[]) typeArr.clone();
            type = this.typeArguments.length;
            for (int i = 0; i < type; i++) {
                C$Gson$Preconditions.checkNotNull(this.typeArguments[i]);
                C$Gson$Types.checkNotPrimitive(this.typeArguments[i]);
                this.typeArguments[i] = C$Gson$Types.canonicalize(this.typeArguments[i]);
            }
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.typeArguments.clone();
        }

        public Type getRawType() {
            return this.rawType;
        }

        public Type getOwnerType() {
            return this.ownerType;
        }

        public boolean equals(Object obj) {
            return (!(obj instanceof ParameterizedType) || C$Gson$Types.equals(this, (ParameterizedType) obj) == null) ? null : true;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode()) ^ C$Gson$Types.hashCodeOrZero(this.ownerType);
        }

        public String toString() {
            int length = this.typeArguments.length;
            if (length == 0) {
                return C$Gson$Types.typeToString(this.rawType);
            }
            StringBuilder stringBuilder = new StringBuilder((length + 1) * 30);
            stringBuilder.append(C$Gson$Types.typeToString(this.rawType));
            stringBuilder.append("<");
            stringBuilder.append(C$Gson$Types.typeToString(this.typeArguments[0]));
            for (int i = 1; i < length; i++) {
                stringBuilder.append(", ");
                stringBuilder.append(C$Gson$Types.typeToString(this.typeArguments[i]));
            }
            stringBuilder.append(">");
            return stringBuilder.toString();
        }
    }

    /* renamed from: com.google.gson.internal.$Gson$Types$WildcardTypeImpl */
    private static final class WildcardTypeImpl implements Serializable, WildcardType {
        private static final long serialVersionUID = 0;
        private final Type lowerBound;
        private final Type upperBound;

        public WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            boolean z = true;
            C$Gson$Preconditions.checkArgument(typeArr2.length <= 1);
            C$Gson$Preconditions.checkArgument(typeArr.length == 1);
            if (typeArr2.length == 1) {
                C$Gson$Preconditions.checkNotNull(typeArr2[0]);
                C$Gson$Types.checkNotPrimitive(typeArr2[0]);
                if (typeArr[0] != Object.class) {
                    z = false;
                }
                C$Gson$Preconditions.checkArgument(z);
                this.lowerBound = C$Gson$Types.canonicalize(typeArr2[0]);
                this.upperBound = Object.class;
                return;
            }
            C$Gson$Preconditions.checkNotNull(typeArr[0]);
            C$Gson$Types.checkNotPrimitive(typeArr[0]);
            this.lowerBound = null;
            this.upperBound = C$Gson$Types.canonicalize(typeArr[0]);
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.upperBound};
        }

        public Type[] getLowerBounds() {
            if (this.lowerBound == null) {
                return C$Gson$Types.EMPTY_TYPE_ARRAY;
            }
            return new Type[]{this.lowerBound};
        }

        public boolean equals(Object obj) {
            return (!(obj instanceof WildcardType) || C$Gson$Types.equals(this, (WildcardType) obj) == null) ? null : true;
        }

        public int hashCode() {
            return (this.lowerBound != null ? this.lowerBound.hashCode() + 31 : 1) ^ (this.upperBound.hashCode() + 31);
        }

        public String toString() {
            StringBuilder stringBuilder;
            if (this.lowerBound != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("? super ");
                stringBuilder.append(C$Gson$Types.typeToString(this.lowerBound));
                return stringBuilder.toString();
            } else if (this.upperBound == Object.class) {
                return "?";
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("? extends ");
                stringBuilder.append(C$Gson$Types.typeToString(this.upperBound));
                return stringBuilder.toString();
            }
        }
    }

    private C$Gson$Types() {
        throw new UnsupportedOperationException();
    }

    public static ParameterizedType newParameterizedTypeWithOwner(Type type, Type type2, Type... typeArr) {
        return new ParameterizedTypeImpl(type, type2, typeArr);
    }

    public static GenericArrayType arrayOf(Type type) {
        return new GenericArrayTypeImpl(type);
    }

    public static WildcardType subtypeOf(Type type) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds();
        } else {
            type = new Type[]{type};
        }
        return new WildcardTypeImpl(type, EMPTY_TYPE_ARRAY);
    }

    public static WildcardType supertypeOf(Type type) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getLowerBounds();
        } else {
            type = new Type[]{type};
        }
        return new WildcardTypeImpl(new Type[]{Object.class}, type);
    }

    public static Type canonicalize(Type type) {
        if (type instanceof Class) {
            type = (Class) type;
            if (type.isArray()) {
                type = new GenericArrayTypeImpl(C$Gson$Types.canonicalize(type.getComponentType()));
            }
            return type;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new ParameterizedTypeImpl(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new GenericArrayTypeImpl(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new WildcardTypeImpl(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    public static Class<?> getRawType(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            type = ((ParameterizedType) type).getRawType();
            C$Gson$Preconditions.checkArgument(type instanceof Class);
            return (Class) type;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(C$Gson$Types.getRawType(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return C$Gson$Types.getRawType(((WildcardType) type).getUpperBounds()[0]);
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

    static boolean equal(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || obj.equals(obj2) == null) {
                return null;
            }
        }
        return true;
    }

    public static boolean equals(Type type, Type type2) {
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
            if (!C$Gson$Types.equal(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments()) == null) {
                z = false;
            }
            return z;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return C$Gson$Types.equals(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    static int hashCodeOrZero(Object obj) {
        return obj != null ? obj.hashCode() : null;
    }

    public static String typeToString(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    static Type getGenericSupertype(Type type, Class<?> cls, Class<?> cls2) {
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
                    return C$Gson$Types.getGenericSupertype(cls.getGenericInterfaces()[i], type[i], cls2);
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
                    return C$Gson$Types.getGenericSupertype(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    static Type getSupertype(Type type, Class<?> cls, Class<?> cls2) {
        C$Gson$Preconditions.checkArgument(cls2.isAssignableFrom(cls));
        return C$Gson$Types.resolve(type, cls, C$Gson$Types.getGenericSupertype(type, cls, cls2));
    }

    public static Type getArrayComponentType(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        return ((Class) type).getComponentType();
    }

    public static Type getCollectionElementType(Type type, Class<?> cls) {
        type = C$Gson$Types.getSupertype(type, cls, Collection.class);
        if ((type instanceof WildcardType) != null) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        if ((type instanceof ParameterizedType) != null) {
            return ((ParameterizedType) type).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    public static Type[] getMapKeyAndValueTypes(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        type = C$Gson$Types.getSupertype(type, cls, Map.class);
        if ((type instanceof ParameterizedType) != null) {
            return ((ParameterizedType) type).getActualTypeArguments();
        }
        return new Type[]{Object.class, Object.class};
    }

    public static Type resolve(Type type, Class<?> cls, Type type2) {
        return C$Gson$Types.resolve(type, cls, type2, new HashSet());
    }

    private static Type resolve(Type type, Class<?> cls, Type type2, Collection<TypeVariable> collection) {
        while (type2 instanceof TypeVariable) {
            Type type3 = (TypeVariable) type2;
            if (collection.contains(type3)) {
                return type2;
            }
            collection.add(type3);
            type2 = C$Gson$Types.resolveTypeVariable(type, cls, type3);
            if (type2 == type3) {
                return type2;
            }
        }
        if (type2 instanceof Class) {
            type3 = (Class) type2;
            if (type3.isArray()) {
                type2 = type3.getComponentType();
                type = C$Gson$Types.resolve(type, cls, type2, collection);
                if (type2 != type) {
                    type3 = C$Gson$Types.arrayOf(type);
                }
                return type3;
            }
        }
        if (type2 instanceof GenericArrayType) {
            type2 = (GenericArrayType) type2;
            type3 = type2.getGenericComponentType();
            type = C$Gson$Types.resolve(type, cls, type3, collection);
            if (type3 != type) {
                type2 = C$Gson$Types.arrayOf(type);
            }
            return type2;
        }
        int i = 0;
        if (type2 instanceof ParameterizedType) {
            type2 = (ParameterizedType) type2;
            type3 = type2.getOwnerType();
            Type resolve = C$Gson$Types.resolve(type, cls, type3, collection);
            Object obj = resolve != type3 ? 1 : null;
            Type[] actualTypeArguments = type2.getActualTypeArguments();
            int length = actualTypeArguments.length;
            while (i < length) {
                Type resolve2 = C$Gson$Types.resolve(type, cls, actualTypeArguments[i], collection);
                if (resolve2 != actualTypeArguments[i]) {
                    if (obj == null) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        obj = 1;
                    }
                    actualTypeArguments[i] = resolve2;
                }
                i++;
            }
            if (obj != null) {
                type2 = C$Gson$Types.newParameterizedTypeWithOwner(resolve, type2.getRawType(), actualTypeArguments);
            }
            return type2;
        } else if (!(type2 instanceof WildcardType)) {
            return type2;
        } else {
            WildcardType wildcardType = (WildcardType) type2;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                type = C$Gson$Types.resolve(type, cls, lowerBounds[0], collection);
                if (type != lowerBounds[0]) {
                    return C$Gson$Types.supertypeOf(type);
                }
            } else if (upperBounds.length == 1) {
                type = C$Gson$Types.resolve(type, cls, upperBounds[0], collection);
                if (type != upperBounds[0]) {
                    return C$Gson$Types.subtypeOf(type);
                }
            }
            return wildcardType;
        }
    }

    static Type resolveTypeVariable(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class declaringClassOf = C$Gson$Types.declaringClassOf(typeVariable);
        if (declaringClassOf == null) {
            return typeVariable;
        }
        type = C$Gson$Types.getGenericSupertype(type, cls, declaringClassOf);
        if ((type instanceof ParameterizedType) == null) {
            return typeVariable;
        }
        return ((ParameterizedType) type).getActualTypeArguments()[C$Gson$Types.indexOf(declaringClassOf.getTypeParameters(), typeVariable)];
    }

    private static int indexOf(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    private static Class<?> declaringClassOf(TypeVariable<?> typeVariable) {
        typeVariable = typeVariable.getGenericDeclaration();
        return typeVariable instanceof Class ? (Class) typeVariable : null;
    }

    static void checkNotPrimitive(Type type) {
        if (type instanceof Class) {
            if (((Class) type).isPrimitive() != null) {
                type = null;
                C$Gson$Preconditions.checkArgument(type);
            }
        }
        type = true;
        C$Gson$Preconditions.checkArgument(type);
    }
}
