package de.javakaffee.kryoserializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.serializers.FieldSerializer;
import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import sun.reflect.ReflectionFactory;

public class KryoReflectionFactorySupport extends Kryo {
    private static final Object[] INITARGS = new Object[0];
    private static final ReflectionFactory REFLECTION_FACTORY = ReflectionFactory.getReflectionFactory();
    private static final Map<Class<?>, Constructor<?>> _constructors = new ConcurrentHashMap();

    public Serializer<?> getDefaultSerializer(Class cls) {
        cls = super.getDefaultSerializer(cls);
        if (cls instanceof FieldSerializer) {
            ((FieldSerializer) cls).setIgnoreSyntheticFields(false);
        }
        return cls;
    }

    public <T> T newInstance(Class<T> cls) {
        if (cls == null) {
            throw new IllegalArgumentException("type cannot be null.");
        }
        Constructor constructor = (Constructor) _constructors.get(cls);
        if (constructor == null) {
            constructor = getNoArgsConstructor(cls);
            if (constructor == null) {
                constructor = newConstructorForSerialization(cls);
            }
            _constructors.put(cls, constructor);
        }
        return newInstanceFrom(constructor);
    }

    private static Object newInstanceFrom(Constructor<?> constructor) {
        try {
            return constructor.newInstance(INITARGS);
        } catch (Constructor<?> constructor2) {
            throw new RuntimeException(constructor2);
        }
    }

    public static <T> T newInstanceFromReflectionFactory(Class<T> cls) {
        Constructor constructor = (Constructor) _constructors.get(cls);
        if (constructor == null) {
            constructor = newConstructorForSerialization(cls);
            _constructors.put(cls, constructor);
        }
        return newInstanceFrom(constructor);
    }

    private static <T> Constructor<?> newConstructorForSerialization(Class<T> cls) {
        try {
            cls = REFLECTION_FACTORY.newConstructorForSerialization(cls, Object.class.getDeclaredConstructor(new Class[0]));
            cls.setAccessible(true);
            return cls;
        } catch (Class<T> cls2) {
            throw new RuntimeException(cls2);
        }
    }

    private static Constructor<?> getNoArgsConstructor(Class<?> cls) {
        for (Constructor<?> constructor : cls.getConstructors()) {
            if (constructor.getParameterTypes().length == 0) {
                constructor.setAccessible(true);
                return constructor;
            }
        }
        return null;
    }
}
