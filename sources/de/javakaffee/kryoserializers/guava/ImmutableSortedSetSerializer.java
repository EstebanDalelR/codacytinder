package de.javakaffee.kryoserializers.guava;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.google.common.collect.ImmutableSortedSet;
import java.util.Comparator;

public class ImmutableSortedSetSerializer extends Serializer<ImmutableSortedSet<Object>> {
    private static final boolean DOES_NOT_ACCEPT_NULL = false;
    private static final boolean IMMUTABLE = true;

    public ImmutableSortedSetSerializer() {
        super(false, IMMUTABLE);
    }

    public void write(Kryo kryo, Output output, ImmutableSortedSet<Object> immutableSortedSet) {
        kryo.writeClassAndObject(output, immutableSortedSet.comparator());
        output.writeInt(immutableSortedSet.size(), IMMUTABLE);
        immutableSortedSet = immutableSortedSet.iterator();
        while (immutableSortedSet.hasNext()) {
            kryo.writeClassAndObject(output, immutableSortedSet.next());
        }
    }

    public ImmutableSortedSet<Object> read(Kryo kryo, Input input, Class<ImmutableSortedSet<Object>> cls) {
        cls = ImmutableSortedSet.orderedBy((Comparator) kryo.readClassAndObject(input));
        int readInt = input.readInt(IMMUTABLE);
        for (int i = 0; i < readInt; i++) {
            cls.add(kryo.readClassAndObject(input));
        }
        return cls.build();
    }

    public static void registerSerializers(Kryo kryo) {
        Serializer immutableSortedSetSerializer = new ImmutableSortedSetSerializer();
        kryo.register(ImmutableSortedSet.class, immutableSortedSetSerializer);
        kryo.register(ImmutableSortedSet.of().getClass(), immutableSortedSetSerializer);
        kryo.register(ImmutableSortedSet.of("").getClass(), immutableSortedSetSerializer);
        kryo.register(ImmutableSortedSet.of().descendingSet().getClass(), immutableSortedSetSerializer);
    }
}
