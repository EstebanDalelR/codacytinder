package de.javakaffee.kryoserializers.guava;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.google.common.collect.Multimap;
import java.util.Map.Entry;

public abstract class MultimapSerializerBase<K, V, T extends Multimap<K, V>> extends Serializer<T> {
    public MultimapSerializerBase(boolean z, boolean z2) {
        super(z, z2);
    }

    protected void writeMultimap(Kryo kryo, Output output, Multimap<K, V> multimap) {
        output.writeInt(multimap.size(), true);
        multimap = multimap.entries().iterator();
        while (multimap.hasNext()) {
            Entry entry = (Entry) multimap.next();
            kryo.writeClassAndObject(output, entry.getKey());
            kryo.writeClassAndObject(output, entry.getValue());
        }
    }

    protected void readMultimap(Kryo kryo, Input input, Multimap<K, V> multimap) {
        int readInt = input.readInt(true);
        for (int i = 0; i < readInt; i++) {
            multimap.put(kryo.readClassAndObject(input), kryo.readClassAndObject(input));
        }
    }
}
