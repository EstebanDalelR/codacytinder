package de.javakaffee.kryoserializers.guava;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapSerializer extends Serializer<ImmutableMap<Object, ? extends Object>> {
    private static final boolean DOES_NOT_ACCEPT_NULL = true;
    private static final boolean IMMUTABLE = true;

    private enum DummyEnum {
        VALUE1,
        VALUE2
    }

    public ImmutableMapSerializer() {
        super(true, true);
    }

    public void write(Kryo kryo, Output output, ImmutableMap<Object, ? extends Object> immutableMap) {
        kryo.writeObject(output, Maps.newHashMap(immutableMap));
    }

    public ImmutableMap<Object, Object> read(Kryo kryo, Input input, Class<ImmutableMap<Object, ? extends Object>> cls) {
        return ImmutableMap.copyOf((Map) kryo.readObject(input, HashMap.class));
    }

    public static void registerSerializers(Kryo kryo) {
        Serializer immutableMapSerializer = new ImmutableMapSerializer();
        kryo.register(ImmutableMap.class, immutableMapSerializer);
        kryo.register(ImmutableMap.of().getClass(), immutableMapSerializer);
        Object obj = new Object();
        Object obj2 = new Object();
        kryo.register(ImmutableMap.of(obj, obj).getClass(), immutableMapSerializer);
        kryo.register(ImmutableMap.of(obj, obj, obj2, obj2).getClass(), immutableMapSerializer);
        Map enumMap = new EnumMap(DummyEnum.class);
        for (Object put : DummyEnum.values()) {
            enumMap.put(put, obj);
        }
        kryo.register(ImmutableMap.copyOf(enumMap).getClass(), immutableMapSerializer);
    }
}
