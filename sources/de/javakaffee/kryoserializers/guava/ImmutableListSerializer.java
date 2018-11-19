package de.javakaffee.kryoserializers.guava;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Lists;

public class ImmutableListSerializer extends Serializer<ImmutableList<Object>> {
    private static final boolean DOES_NOT_ACCEPT_NULL = false;
    private static final boolean IMMUTABLE = true;

    public ImmutableListSerializer() {
        super(false, IMMUTABLE);
    }

    public void write(Kryo kryo, Output output, ImmutableList<Object> immutableList) {
        output.writeInt(immutableList.size(), IMMUTABLE);
        immutableList = immutableList.iterator();
        while (immutableList.hasNext()) {
            kryo.writeClassAndObject(output, immutableList.next());
        }
    }

    public ImmutableList<Object> read(Kryo kryo, Input input, Class<ImmutableList<Object>> cls) {
        cls = input.readInt(IMMUTABLE);
        Object[] objArr = new Object[cls];
        for (int i = 0; i < cls; i++) {
            objArr[i] = kryo.readClassAndObject(input);
        }
        return ImmutableList.copyOf(objArr);
    }

    public static void registerSerializers(Kryo kryo) {
        Serializer immutableListSerializer = new ImmutableListSerializer();
        kryo.register(ImmutableList.class, immutableListSerializer);
        kryo.register(ImmutableList.of().getClass(), immutableListSerializer);
        kryo.register(ImmutableList.of(Integer.valueOf(1)).getClass(), immutableListSerializer);
        kryo.register(ImmutableList.of(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3)).subList(1, 2).getClass(), immutableListSerializer);
        kryo.register(ImmutableList.of().reverse().getClass(), immutableListSerializer);
        kryo.register(Lists.charactersOf("KryoRocks").getClass(), immutableListSerializer);
        HashBasedTable create = HashBasedTable.create();
        create.put(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3));
        create.put(Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6));
        kryo.register(ImmutableTable.copyOf(create).values().getClass(), immutableListSerializer);
    }
}
