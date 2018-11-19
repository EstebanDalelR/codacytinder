package de.javakaffee.kryoserializers.guava;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.serializers.CollectionSerializer;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class ReverseListSerializer extends Serializer<List<Object>> {
    private static final CollectionSerializer serializer = new CollectionSerializer();

    private static class RandomAccessReverseList extends ReverseListSerializer {
        private RandomAccessReverseList() {
        }

        public /* bridge */ /* synthetic */ Object copy(Kryo kryo, Object obj) {
            return super.copy(kryo, (List) obj);
        }

        public /* bridge */ /* synthetic */ void write(Kryo kryo, Output output, Object obj) {
            super.write(kryo, output, (List) obj);
        }

        public List<Object> read(Kryo kryo, Input input, Class<List<Object>> cls) {
            return Lists.reverse((List) ReverseListSerializer.serializer.read(kryo, input, ArrayList.class));
        }
    }

    private static class ReverseList extends ReverseListSerializer {
        private ReverseList() {
        }

        public /* bridge */ /* synthetic */ Object copy(Kryo kryo, Object obj) {
            return super.copy(kryo, (List) obj);
        }

        public /* bridge */ /* synthetic */ void write(Kryo kryo, Output output, Object obj) {
            super.write(kryo, output, (List) obj);
        }

        public List<Object> read(Kryo kryo, Input input, Class<List<Object>> cls) {
            return Lists.reverse((List) ReverseListSerializer.serializer.read(kryo, input, LinkedList.class));
        }
    }

    public void write(Kryo kryo, Output output, List<Object> list) {
        serializer.write(kryo, output, Lists.reverse(list));
    }

    public List<Object> copy(Kryo kryo, List<Object> list) {
        return Lists.reverse((List) serializer.copy(kryo, Lists.reverse(list)));
    }

    public static void registerSerializers(Kryo kryo) {
        kryo.register(Lists.reverse(Lists.newLinkedList()).getClass(), forReverseList());
        kryo.register(Lists.reverse(Lists.newArrayList()).getClass(), forRandomAccessReverseList());
    }

    public static ReverseListSerializer forReverseList() {
        return new ReverseList();
    }

    public static ReverseListSerializer forRandomAccessReverseList() {
        return new RandomAccessReverseList();
    }
}
