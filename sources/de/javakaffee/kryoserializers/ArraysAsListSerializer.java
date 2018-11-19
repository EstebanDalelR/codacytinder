package de.javakaffee.kryoserializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class ArraysAsListSerializer extends Serializer<List<?>> {
    private Field _arrayField;

    public ArraysAsListSerializer() {
        try {
            this._arrayField = Class.forName("java.util.Arrays$ArrayList").getDeclaredField("a");
            this._arrayField.setAccessible(true);
            setImmutable(true);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public List<?> read(Kryo kryo, Input input, Class<List<?>> cls) {
        cls = input.readInt(true);
        Class type = kryo.readClass(input).getType();
        if (type.isPrimitive()) {
            type = getPrimitiveWrapperClass(type);
        }
        try {
            Object newInstance = Array.newInstance(type, cls);
            for (int i = 0; i < cls; i++) {
                Array.set(newInstance, i, kryo.readClassAndObject(input));
            }
            return Arrays.asList((Object[]) newInstance);
        } catch (Kryo kryo2) {
            throw new RuntimeException(kryo2);
        }
    }

    public void write(Kryo kryo, Output output, List<?> list) {
        try {
            Object[] objArr = (Object[]) this._arrayField.get(list);
            output.writeInt(objArr.length, true);
            kryo.writeClass(output, objArr.getClass().getComponentType());
            for (Object writeClassAndObject : objArr) {
                kryo.writeClassAndObject(output, writeClassAndObject);
            }
        } catch (Kryo kryo2) {
            throw kryo2;
        } catch (Kryo kryo22) {
            throw new RuntimeException(kryo22);
        }
    }

    private static Class<?> getPrimitiveWrapperClass(Class<?> cls) {
        if (cls.isPrimitive()) {
            if (cls.equals(Long.TYPE)) {
                return Long.class;
            }
            if (cls.equals(Integer.TYPE)) {
                return Integer.class;
            }
            if (cls.equals(Double.TYPE)) {
                return Double.class;
            }
            if (cls.equals(Float.TYPE)) {
                return Float.class;
            }
            if (cls.equals(Boolean.TYPE)) {
                return Boolean.class;
            }
            if (cls.equals(Character.TYPE)) {
                return Character.class;
            }
            if (cls.equals(Short.TYPE)) {
                return Short.class;
            }
            if (cls.equals(Byte.TYPE)) {
                return Byte.class;
            }
        }
        return cls;
    }
}
