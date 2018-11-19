package de.javakaffee.kryoserializers.dexx;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.github.andrewoma.dexx.collection.Builder;
import com.github.andrewoma.dexx.collection.Set;
import com.github.andrewoma.dexx.collection.Sets;

public class SetSerializer extends Serializer<Set<Object>> {
    private static final boolean DOES_NOT_ACCEPT_NULL = false;
    private static final boolean IMMUTABLE = true;

    public SetSerializer() {
        super(false, IMMUTABLE);
    }

    public void write(Kryo kryo, Output output, Set<Object> set) {
        output.writeInt(set.size(), IMMUTABLE);
        for (Object writeClassAndObject : set) {
            kryo.writeClassAndObject(output, writeClassAndObject);
        }
    }

    public Set<Object> read(Kryo kryo, Input input, Class<Set<Object>> cls) {
        cls = input.readInt(IMMUTABLE);
        Builder builder = Sets.builder();
        for (int i = 0; i < cls; i++) {
            builder.add(kryo.readClassAndObject(input));
        }
        return (Set) builder.build();
    }

    public static void registerSerializers(Kryo kryo) {
        Kryo kryo2 = kryo;
        Serializer setSerializer = new SetSerializer();
        kryo2.register(Set.class, setSerializer);
        kryo2.register(Sets.of().getClass(), setSerializer);
        kryo2.register(Sets.of(Integer.valueOf(1)).getClass(), setSerializer);
        kryo2.register(Sets.of(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3)).getClass(), setSerializer);
        kryo2.register(Sets.of(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4)).getClass(), setSerializer);
        kryo2.register(Sets.of(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5)).getClass(), setSerializer);
        kryo2.register(Sets.of(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6)).getClass(), setSerializer);
        kryo2.register(Sets.of(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7)).getClass(), setSerializer);
        kryo2.register(Sets.of(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7), Integer.valueOf(8)).getClass(), setSerializer);
        kryo2.register(Sets.of(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7), Integer.valueOf(8), Integer.valueOf(9)).getClass(), setSerializer);
        kryo2.register(Sets.of(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7), Integer.valueOf(8), Integer.valueOf(9), Integer.valueOf(10)).getClass(), setSerializer);
        kryo2.register(Sets.of(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7), Integer.valueOf(8), Integer.valueOf(9), Integer.valueOf(10), new Integer[]{Integer.valueOf(11)}).getClass(), setSerializer);
    }
}
