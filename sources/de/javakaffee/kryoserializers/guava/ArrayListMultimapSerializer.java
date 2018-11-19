package de.javakaffee.kryoserializers.guava;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.google.common.collect.ArrayListMultimap;

public class ArrayListMultimapSerializer extends MultimapSerializerBase<Object, Object, ArrayListMultimap<Object, Object>> {
    private static final boolean DOES_NOT_ACCEPT_NULL = false;
    private static final boolean IMMUTABLE = false;

    public ArrayListMultimapSerializer() {
        super(false, false);
    }

    public void write(Kryo kryo, Output output, ArrayListMultimap<Object, Object> arrayListMultimap) {
        writeMultimap(kryo, output, arrayListMultimap);
    }

    public ArrayListMultimap<Object, Object> read(Kryo kryo, Input input, Class<ArrayListMultimap<Object, Object>> cls) {
        cls = ArrayListMultimap.create();
        readMultimap(kryo, input, cls);
        return cls;
    }

    public static void registerSerializers(Kryo kryo) {
        kryo.register(ArrayListMultimap.class, new ArrayListMultimapSerializer());
    }
}
