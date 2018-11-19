package de.javakaffee.kryoserializers.guava;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import java.util.Map;
import java.util.Map.Entry;

public class ImmutableMultimapSerializer extends Serializer<ImmutableMultimap<Object, Object>> {
    private static final boolean DOES_NOT_ACCEPT_NULL = true;
    private static final boolean IMMUTABLE = true;

    public ImmutableMultimapSerializer() {
        super(true, true);
    }

    public void write(Kryo kryo, Output output, ImmutableMultimap<Object, Object> immutableMultimap) {
        kryo.writeObject(output, ImmutableMap.copyOf(immutableMultimap.asMap()));
    }

    public ImmutableMultimap<Object, Object> read(Kryo kryo, Input input, Class<ImmutableMultimap<Object, Object>> cls) {
        Kryo<Entry> entrySet = ((Map) kryo.readObject(input, ImmutableMap.class)).entrySet();
        input = ImmutableMultimap.builder();
        for (Entry entry : entrySet) {
            input.putAll(entry.getKey(), (Iterable) entry.getValue());
        }
        return input.build();
    }

    public static void registerSerializers(Kryo kryo) {
        if (!(kryo.getSerializer(ImmutableList.class) instanceof ImmutableListSerializer)) {
            ImmutableListSerializer.registerSerializers(kryo);
        }
        if (!(kryo.getSerializer(ImmutableMap.class) instanceof ImmutableMapSerializer)) {
            ImmutableMapSerializer.registerSerializers(kryo);
        }
        Serializer immutableMultimapSerializer = new ImmutableMultimapSerializer();
        kryo.register(ImmutableMultimap.class, immutableMultimapSerializer);
        kryo.register(ImmutableMultimap.of().getClass(), immutableMultimapSerializer);
        Object obj = new Object();
        kryo.register(ImmutableMultimap.of(obj, obj).getClass(), immutableMultimapSerializer);
    }
}
