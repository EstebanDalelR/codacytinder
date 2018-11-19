package de.javakaffee.kryoserializers.guava;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.google.common.collect.LinkedListMultimap;

public class LinkedListMultimapSerializer extends MultimapSerializerBase<Object, Object, LinkedListMultimap<Object, Object>> {
    private static final boolean DOES_NOT_ACCEPT_NULL = false;
    private static final boolean IMMUTABLE = false;

    public LinkedListMultimapSerializer() {
        super(false, false);
    }

    public void write(Kryo kryo, Output output, LinkedListMultimap<Object, Object> linkedListMultimap) {
        writeMultimap(kryo, output, linkedListMultimap);
    }

    public LinkedListMultimap<Object, Object> read(Kryo kryo, Input input, Class<LinkedListMultimap<Object, Object>> cls) {
        cls = LinkedListMultimap.create();
        readMultimap(kryo, input, cls);
        return cls;
    }

    public static void registerSerializers(Kryo kryo) {
        kryo.register(LinkedListMultimap.class, new LinkedListMultimapSerializer());
    }
}
