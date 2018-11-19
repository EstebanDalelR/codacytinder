package de.javakaffee.kryoserializers.guava;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.google.common.collect.HashMultimap;

public class HashMultimapSerializer extends MultimapSerializerBase<Object, Object, HashMultimap<Object, Object>> {
    private static final boolean DOES_NOT_ACCEPT_NULL = false;
    private static final boolean IMMUTABLE = false;

    public HashMultimapSerializer() {
        super(false, false);
    }

    public void write(Kryo kryo, Output output, HashMultimap<Object, Object> hashMultimap) {
        writeMultimap(kryo, output, hashMultimap);
    }

    public HashMultimap<Object, Object> read(Kryo kryo, Input input, Class<HashMultimap<Object, Object>> cls) {
        cls = HashMultimap.create();
        readMultimap(kryo, input, cls);
        return cls;
    }

    public static void registerSerializers(Kryo kryo) {
        kryo.register(HashMultimap.class, new HashMultimapSerializer());
    }
}
