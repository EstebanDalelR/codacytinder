package de.javakaffee.kryoserializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import java.util.Collections;
import java.util.Map;

public class CollectionsEmptyMapSerializer extends Serializer<Map<?, ?>> {
    public void write(Kryo kryo, Output output, Map<?, ?> map) {
    }

    public CollectionsEmptyMapSerializer() {
        setImmutable(true);
    }

    public Map<?, ?> read(Kryo kryo, Input input, Class<Map<?, ?>> cls) {
        return Collections.EMPTY_MAP;
    }
}
