package de.javakaffee.kryoserializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import java.util.Collections;
import java.util.List;

public class CollectionsEmptyListSerializer extends Serializer<List<?>> {
    public void write(Kryo kryo, Output output, List<?> list) {
    }

    public CollectionsEmptyListSerializer() {
        setImmutable(true);
    }

    public List<?> read(Kryo kryo, Input input, Class<List<?>> cls) {
        return Collections.EMPTY_LIST;
    }
}
