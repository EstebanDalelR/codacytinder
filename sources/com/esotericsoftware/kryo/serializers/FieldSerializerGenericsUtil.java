package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField;
import com.esotericsoftware.minlog.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

final class FieldSerializerGenericsUtil {
    private Kryo kryo;
    private FieldSerializer serializer;

    public FieldSerializerGenericsUtil(FieldSerializer fieldSerializer) {
        this.serializer = fieldSerializer;
        this.kryo = fieldSerializer.getKryo();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    com.esotericsoftware.kryo.serializers.Generics buildGenericsScope(java.lang.Class r10, java.lang.Class[] r11) {
        /*
        r9 = this;
        r0 = 0;
        r1 = r10;
        r2 = r0;
    L_0x0003:
        r3 = 0;
        if (r1 == 0) goto L_0x0066;
    L_0x0006:
        r2 = r9.serializer;
        r2 = r2.type;
        if (r1 != r2) goto L_0x0011;
    L_0x000c:
        r2 = r9.serializer;
        r2 = r2.typeParameters;
        goto L_0x0015;
    L_0x0011:
        r2 = r1.getTypeParameters();
    L_0x0015:
        if (r2 == 0) goto L_0x001a;
    L_0x0017:
        r4 = r2.length;
        if (r4 != 0) goto L_0x0066;
    L_0x001a:
        r4 = r9.serializer;
        r4 = r4.type;
        if (r1 != r4) goto L_0x0061;
    L_0x0020:
        r1 = r9.serializer;
        r1 = r1.componentType;
        if (r1 == 0) goto L_0x0027;
    L_0x0026:
        goto L_0x0003;
    L_0x0027:
        r1 = r9.serializer;
        r1 = r1.type;
    L_0x002b:
        r4 = r1.getGenericSuperclass();
        r1 = r1.getSuperclass();
        if (r4 == 0) goto L_0x0039;
    L_0x0035:
        r5 = r4 instanceof java.lang.reflect.ParameterizedType;
        if (r5 == 0) goto L_0x002b;
    L_0x0039:
        if (r4 != 0) goto L_0x003c;
    L_0x003b:
        goto L_0x0066;
    L_0x003c:
        r4 = (java.lang.reflect.ParameterizedType) r4;
        r11 = r4.getActualTypeArguments();
        r2 = r1.getTypeParameters();
        r1 = r11.length;
        r1 = new java.lang.Class[r1];
        r4 = 0;
    L_0x004a:
        r5 = r11.length;
        if (r4 >= r5) goto L_0x005f;
    L_0x004d:
        r5 = r11[r4];
        r5 = r5 instanceof java.lang.Class;
        if (r5 == 0) goto L_0x0058;
    L_0x0053:
        r5 = r11[r4];
        r5 = (java.lang.Class) r5;
        goto L_0x005a;
    L_0x0058:
        r5 = java.lang.Object.class;
    L_0x005a:
        r1[r4] = r5;
        r4 = r4 + 1;
        goto L_0x004a;
    L_0x005f:
        r11 = r1;
        goto L_0x0066;
    L_0x0061:
        r1 = r1.getComponentType();
        goto L_0x0003;
    L_0x0066:
        if (r2 == 0) goto L_0x0101;
    L_0x0068:
        r1 = r2.length;
        if (r1 <= 0) goto L_0x0101;
    L_0x006b:
        r0 = com.esotericsoftware.minlog.Log.TRACE;
        if (r0 == 0) goto L_0x008e;
    L_0x006f:
        r0 = "kryo";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r4 = "Class ";
        r1.append(r4);
        r10 = r10.getName();
        r1.append(r10);
        r10 = " has generic type parameters";
        r1.append(r10);
        r10 = r1.toString();
        com.esotericsoftware.minlog.Log.trace(r0, r10);
    L_0x008e:
        r10 = new java.util.HashMap;
        r10.<init>();
        r0 = r2.length;
        r1 = 0;
    L_0x0095:
        if (r3 >= r0) goto L_0x00fb;
    L_0x0097:
        r4 = r2[r3];
        r5 = r4.getName();
        r6 = com.esotericsoftware.minlog.Log.TRACE;
        if (r6 == 0) goto L_0x00c7;
    L_0x00a1:
        r6 = "kryo";
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r8 = "Type parameter variable: name=";
        r7.append(r8);
        r7.append(r5);
        r8 = " type bounds=";
        r7.append(r8);
        r4 = r4.getBounds();
        r4 = java.util.Arrays.toString(r4);
        r7.append(r4);
        r4 = r7.toString();
        com.esotericsoftware.minlog.Log.trace(r6, r4);
    L_0x00c7:
        r4 = r9.getTypeVarConcreteClass(r11, r1, r5);
        if (r4 == 0) goto L_0x00f6;
    L_0x00cd:
        r10.put(r5, r4);
        r6 = com.esotericsoftware.minlog.Log.TRACE;
        if (r6 == 0) goto L_0x00f6;
    L_0x00d4:
        r6 = "kryo";
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r8 = "Concrete type used for ";
        r7.append(r8);
        r7.append(r5);
        r5 = " is: ";
        r7.append(r5);
        r4 = r4.getName();
        r7.append(r4);
        r4 = r7.toString();
        com.esotericsoftware.minlog.Log.trace(r6, r4);
    L_0x00f6:
        r1 = r1 + 1;
        r3 = r3 + 1;
        goto L_0x0095;
    L_0x00fb:
        r11 = new com.esotericsoftware.kryo.serializers.Generics;
        r11.<init>(r10);
        return r11;
    L_0x0101:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.serializers.FieldSerializerGenericsUtil.buildGenericsScope(java.lang.Class, java.lang.Class[]):com.esotericsoftware.kryo.serializers.Generics");
    }

    private Class<?> getTypeVarConcreteClass(Class[] clsArr, int i, String str) {
        if (clsArr != null && clsArr.length > i) {
            return clsArr[i];
        }
        if (Log.TRACE != null) {
            Log.trace("kryo", "Trying to use kryo.getGenericScope");
        }
        clsArr = this.kryo.getGenericsResolver();
        return clsArr.isSet() != 0 ? clsArr.getConcreteClass(str) : null;
    }

    Class[] computeFieldGenerics(Type type, Field field, Class[] clsArr) {
        if (type == null) {
            return null;
        }
        StringBuilder stringBuilder;
        if ((type instanceof TypeVariable) && this.serializer.getGenericsScope() != null) {
            type = this.serializer.getGenericsScope().getConcreteClass(((TypeVariable) type).getName());
            if (type == null) {
                return null;
            }
            clsArr[0] = type;
            type = new Class[]{clsArr[0]};
            if (Log.TRACE) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Determined concrete class of '");
                stringBuilder.append(field.getName());
                stringBuilder.append("' to be ");
                stringBuilder.append(clsArr[0].getName());
                Log.trace("kryo", stringBuilder.toString());
            }
            return type;
        } else if (type instanceof ParameterizedType) {
            clsArr = ((ParameterizedType) type).getActualTypeArguments();
            if (clsArr == null) {
                return null;
            }
            Class[] clsArr2 = new Class[clsArr.length];
            for (int i = 0; i < clsArr.length; i++) {
                Class cls = clsArr[i];
                if (cls instanceof Class) {
                    clsArr2[i] = cls;
                } else if (cls instanceof ParameterizedType) {
                    clsArr2[i] = (Class) ((ParameterizedType) cls).getRawType();
                } else if ((cls instanceof TypeVariable) && this.serializer.getGenericsScope() != null) {
                    clsArr2[i] = this.serializer.getGenericsScope().getConcreteClass(((TypeVariable) cls).getName());
                    if (clsArr2[i] == null) {
                        clsArr2[i] = Object.class;
                    }
                } else if (cls instanceof WildcardType) {
                    clsArr2[i] = Object.class;
                } else if (cls instanceof GenericArrayType) {
                    Type genericComponentType = ((GenericArrayType) cls).getGenericComponentType();
                    if (genericComponentType instanceof Class) {
                        clsArr2[i] = Array.newInstance((Class) genericComponentType, 0).getClass();
                    } else if (genericComponentType instanceof TypeVariable) {
                        Generics genericsScope = this.serializer.getGenericsScope();
                        if (genericsScope != null) {
                            cls = genericsScope.getConcreteClass(((TypeVariable) genericComponentType).getName());
                            if (cls != null) {
                                clsArr2[i] = Array.newInstance(cls, 0).getClass();
                            }
                        }
                    }
                } else {
                    clsArr2[i] = null;
                }
            }
            if (!(Log.TRACE == null || clsArr2 == null)) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Determined concrete class of parametrized '");
                stringBuilder2.append(field.getName());
                stringBuilder2.append("' to be ");
                stringBuilder2.append(type);
                stringBuilder2.append(" where type parameters are ");
                stringBuilder2.append(Arrays.toString(clsArr2));
                Log.trace("kryo", stringBuilder2.toString());
            }
            return clsArr2;
        } else if (!(type instanceof GenericArrayType)) {
            return null;
        } else {
            Class[] computeFieldGenerics = computeFieldGenerics(((GenericArrayType) type).getGenericComponentType(), field, new Class[]{clsArr[0]});
            if (Log.TRACE != null && computeFieldGenerics != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Determined concrete class of a generic array '");
                stringBuilder.append(field.getName());
                stringBuilder.append("' to be ");
                stringBuilder.append(type);
                stringBuilder.append(" where type parameters are ");
                stringBuilder.append(Arrays.toString(computeFieldGenerics));
                Log.trace("kryo", stringBuilder.toString());
                return computeFieldGenerics;
            } else if (Log.TRACE == null) {
                return computeFieldGenerics;
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Determined concrete class of '");
                stringBuilder.append(field.getName());
                stringBuilder.append("' to be ");
                stringBuilder.append(type);
                Log.trace("kryo", stringBuilder.toString());
                return computeFieldGenerics;
            }
        }
    }

    CachedField newCachedFieldOfGenericType(Field field, int i, Class[] clsArr, Type type) {
        if (Log.TRACE) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Field '");
            stringBuilder.append(field.getName());
            stringBuilder.append("' of type ");
            stringBuilder.append(clsArr[0]);
            stringBuilder.append(" of generic type ");
            stringBuilder.append(type);
            Log.trace("kryo", stringBuilder.toString());
        }
        if (Log.TRACE && type != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Field generic type is of class ");
            stringBuilder.append(type.getClass().getName());
            Log.trace("kryo", stringBuilder.toString());
        }
        Object buildGenericsScope = buildGenericsScope(clsArr[0], getGenerics(type, this.kryo));
        if (clsArr[0] == Object.class && (type instanceof TypeVariable) && this.serializer.getGenericsScope() != null) {
            TypeVariable typeVariable = (TypeVariable) type;
            Class concreteClass = this.serializer.getGenericsScope().getConcreteClass(typeVariable.getName());
            if (concreteClass != null) {
                buildGenericsScope = new Generics();
                buildGenericsScope.add(typeVariable.getName(), concreteClass);
            }
        }
        if (Log.TRACE) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Generics scope of field '");
            stringBuilder2.append(field.getName());
            stringBuilder2.append("' of class ");
            stringBuilder2.append(type);
            stringBuilder2.append(" is ");
            stringBuilder2.append(buildGenericsScope);
            Log.trace("kryo", stringBuilder2.toString());
        }
        Class[] computeFieldGenerics = computeFieldGenerics(type, field, clsArr);
        field = this.serializer.newMatchingCachedField(field, i, clsArr[0], type, computeFieldGenerics);
        if (!(computeFieldGenerics == null || (field instanceof ObjectField) == 0 || computeFieldGenerics.length <= 0 || computeFieldGenerics[0] == 0)) {
            ((ObjectField) field).generics = computeFieldGenerics;
            if (Log.TRACE != 0) {
                clsArr = new StringBuilder();
                clsArr.append("Field generics: ");
                clsArr.append(Arrays.toString(computeFieldGenerics));
                Log.trace("kryo", clsArr.toString());
            }
        }
        return field;
    }

    public static Class[] getGenerics(Type type, Kryo kryo) {
        if (type instanceof GenericArrayType) {
            type = ((GenericArrayType) type).getGenericComponentType();
            if (!(type instanceof Class)) {
                return getGenerics(type, kryo);
            }
            return new Class[]{(Class) type};
        } else if (!(type instanceof ParameterizedType)) {
            return null;
        } else {
            if (Log.TRACE) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Processing generic type ");
                stringBuilder.append(type);
                Log.trace("kryo", stringBuilder.toString());
            }
            type = ((ParameterizedType) type).getActualTypeArguments();
            Class[] clsArr = new Class[type.length];
            int length = type.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                Object obj = type[i2];
                if (Log.TRACE) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Processing actual type ");
                    stringBuilder2.append(obj);
                    stringBuilder2.append(" (");
                    stringBuilder2.append(obj.getClass().getName());
                    stringBuilder2.append(")");
                    Log.trace("kryo", stringBuilder2.toString());
                }
                clsArr[i2] = Object.class;
                if (obj instanceof Class) {
                    clsArr[i2] = (Class) obj;
                } else if (obj instanceof ParameterizedType) {
                    clsArr[i2] = (Class) ((ParameterizedType) obj).getRawType();
                } else if (obj instanceof TypeVariable) {
                    r7 = kryo.getGenericsResolver();
                    if (r7.isSet()) {
                        r6 = r7.getConcreteClass(((TypeVariable) obj).getName());
                        if (r6 != null) {
                            clsArr[i2] = r6;
                        }
                    }
                } else if (obj instanceof GenericArrayType) {
                    Type genericComponentType = ((GenericArrayType) obj).getGenericComponentType();
                    if (genericComponentType instanceof Class) {
                        clsArr[i2] = Array.newInstance((Class) genericComponentType, 0).getClass();
                    } else if (genericComponentType instanceof TypeVariable) {
                        r7 = kryo.getGenericsResolver();
                        if (r7.isSet()) {
                            r6 = r7.getConcreteClass(((TypeVariable) genericComponentType).getName());
                            if (r6 != null) {
                                clsArr[i2] = Array.newInstance(r6, 0).getClass();
                            }
                        }
                    } else {
                        Class[] generics = getGenerics(genericComponentType, kryo);
                        if (generics != null) {
                            clsArr[i2] = generics[0];
                        }
                    }
                } else {
                }
                i++;
            }
            if (i == 0) {
                return null;
            }
            return clsArr;
        }
    }
}
