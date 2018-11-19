package de.javakaffee.kryoserializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.serializers.CompatibleFieldSerializer;

public class CompatibleFieldSerializerReflectionFactorySupport extends CompatibleFieldSerializer<Object> {
    public CompatibleFieldSerializerReflectionFactorySupport(Kryo kryo, Class<?> cls) {
        super(kryo, cls);
    }

    public Object create(Kryo kryo, Input input, Class cls) {
        return KryoReflectionFactorySupport.newInstanceFromReflectionFactory(cls);
    }
}
