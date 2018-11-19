package de.javakaffee.kryoserializers.dexx;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.github.andrewoma.dexx.collection.IndexedLists;
import com.github.andrewoma.dexx.collection.List;

public class ListSerializer extends Serializer<List> {
    private static final boolean DOES_NOT_ACCEPT_NULL = true;
    private static final boolean IMMUTABLE = true;

    public ListSerializer() {
        super(true, true);
    }

    public void write(Kryo kryo, Output output, List list) {
        output.writeInt(list.size(), true);
        for (Object writeClassAndObject : list) {
            kryo.writeClassAndObject(output, writeClassAndObject);
        }
    }

    public List<Object> read(Kryo kryo, Input input, Class<List> cls) {
        cls = input.readInt(true);
        Object[] objArr = new Object[cls];
        for (int i = 0; i < cls; i++) {
            objArr[i] = kryo.readClassAndObject(input);
        }
        return IndexedLists.copyOf(objArr);
    }

    public static void registerSerializers(Kryo kryo) {
        Kryo kryo2 = kryo;
        Serializer listSerializer = new ListSerializer();
        kryo2.register(List.class, listSerializer);
        kryo2.register(IndexedLists.of().getClass(), listSerializer);
        kryo2.register(IndexedLists.of(Integer.valueOf(1)).getClass(), listSerializer);
        kryo2.register(IndexedLists.of(Integer.valueOf(1), Integer.valueOf(2)).getClass(), listSerializer);
        kryo2.register(IndexedLists.of(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3)).getClass(), listSerializer);
        kryo2.register(IndexedLists.of(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4)).getClass(), listSerializer);
        kryo2.register(IndexedLists.of(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5)).getClass(), listSerializer);
        kryo2.register(IndexedLists.of(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6)).getClass(), listSerializer);
        kryo2.register(IndexedLists.of(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7)).getClass(), listSerializer);
        kryo2.register(IndexedLists.of(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7), Integer.valueOf(8)).getClass(), listSerializer);
        kryo2.register(IndexedLists.of(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7), Integer.valueOf(8), Integer.valueOf(9)).getClass(), listSerializer);
        kryo2.register(IndexedLists.of(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7), Integer.valueOf(8), Integer.valueOf(10)).getClass(), listSerializer);
        kryo2.register(IndexedLists.of(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7), Integer.valueOf(8), Integer.valueOf(10), Integer.valueOf(11)).getClass(), listSerializer);
    }
}
