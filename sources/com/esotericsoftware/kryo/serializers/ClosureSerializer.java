package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import java.lang.invoke.SerializedLambda;
import java.lang.reflect.Method;

public class ClosureSerializer extends Serializer {
    private static Method readResolve;
    private static Class serializedLambda = SerializedLambda.class;

    public static class Closure {
    }

    static {
        try {
            readResolve = serializedLambda.getDeclaredMethod("readResolve", new Class[0]);
            readResolve.setAccessible(true);
        } catch (Throwable e) {
            throw new RuntimeException("Could not obtain SerializedLambda or its methods via reflection", e);
        }
    }

    public void write(Kryo kryo, Output output, Object obj) {
        try {
            Method declaredMethod = obj.getClass().getDeclaredMethod("writeReplace", new Class[0]);
            declaredMethod.setAccessible(true);
            obj = declaredMethod.invoke(obj, new Object[0]);
            if (serializedLambda.isInstance(obj)) {
                kryo.writeObject(output, obj);
                return;
            }
            throw new RuntimeException("Could not serialize lambda");
        } catch (Kryo kryo2) {
            throw new RuntimeException("Could not serialize lambda", kryo2);
        }
    }

    public Object read(Kryo kryo, Input input, Class cls) {
        try {
            return readResolve.invoke(kryo.readObject(input, serializedLambda), new Object[null]);
        } catch (Kryo kryo2) {
            throw new RuntimeException("Could not serialize lambda", kryo2);
        }
    }

    public Object copy(Kryo kryo, Object obj) {
        try {
            kryo = obj.getClass().getDeclaredMethod("writeReplace", new Class[0]);
            kryo.setAccessible(true);
            kryo = kryo.invoke(obj, new Object[0]);
            if (serializedLambda.isInstance(kryo) != null) {
                return readResolve.invoke(kryo, new Object[0]);
            }
            throw new RuntimeException("Could not serialize lambda");
        } catch (Kryo kryo2) {
            throw new RuntimeException("Could not serialize lambda", kryo2);
        }
    }
}
