package de.javakaffee.kryoserializers.guava;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.google.common.collect.Sets;

public class ImmutableSetSerializer extends Serializer<ImmutableSet<Object>> {
    private static final boolean DOES_NOT_ACCEPT_NULL = false;
    private static final boolean IMMUTABLE = true;

    private enum SomeEnum {
        A,
        B,
        C
    }

    public ImmutableSetSerializer() {
        super(false, IMMUTABLE);
    }

    public void write(Kryo kryo, Output output, ImmutableSet<Object> immutableSet) {
        output.writeInt(immutableSet.size(), IMMUTABLE);
        immutableSet = immutableSet.iterator();
        while (immutableSet.hasNext()) {
            kryo.writeClassAndObject(output, immutableSet.next());
        }
    }

    public ImmutableSet<Object> read(Kryo kryo, Input input, Class<ImmutableSet<Object>> cls) {
        cls = input.readInt(IMMUTABLE);
        Builder builder = ImmutableSet.builder();
        for (int i = 0; i < cls; i++) {
            builder.add(kryo.readClassAndObject(input));
        }
        return builder.build();
    }

    public static void registerSerializers(Kryo kryo) {
        Serializer immutableSetSerializer = new ImmutableSetSerializer();
        kryo.register(ImmutableSet.class, immutableSetSerializer);
        kryo.register(ImmutableSet.of().getClass(), immutableSetSerializer);
        kryo.register(ImmutableSet.of(Integer.valueOf(1)).getClass(), immutableSetSerializer);
        kryo.register(ImmutableSet.of(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3)).getClass(), immutableSetSerializer);
        kryo.register(Sets.immutableEnumSet(SomeEnum.A, new SomeEnum[]{SomeEnum.B, SomeEnum.C}).getClass(), immutableSetSerializer);
    }
}
