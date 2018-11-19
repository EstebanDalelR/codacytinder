package de.javakaffee.kryoserializers.dexx;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.github.andrewoma.dexx.collection.Map;
import com.github.andrewoma.dexx.collection.Maps;
import com.github.andrewoma.dexx.collection.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class MapSerializer extends Serializer<Map<Object, ? extends Object>> {
    private static final boolean DOES_NOT_ACCEPT_NULL = true;
    private static final boolean IMMUTABLE = true;

    public MapSerializer() {
        super(true, true);
    }

    public void write(Kryo kryo, Output output, Map<Object, ? extends Object> map) {
        kryo.writeObject(output, map.asMap());
    }

    public Map<Object, Object> read(Kryo kryo, Input input, Class<Map<Object, ? extends Object>> cls) {
        HashMap hashMap = (HashMap) kryo.readObject(input, HashMap.class);
        input = new ArrayList();
        for (Entry entry : hashMap.entrySet()) {
            input.add(new Pair(entry.getKey(), entry.getValue()));
        }
        return Maps.copyOf(input);
    }

    public static void registerSerializers(Kryo kryo) {
        Serializer mapSerializer = new MapSerializer();
        kryo.register(Map.class, mapSerializer);
        kryo.register(Maps.of().getClass(), mapSerializer);
        Object obj = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        Object obj4 = new Object();
        Object obj5 = new Object();
        kryo.register(Maps.of(obj, obj).getClass(), mapSerializer);
        kryo.register(Maps.of(obj, obj, obj2, obj2).getClass(), mapSerializer);
        Object obj6 = obj;
        Object obj7 = obj2;
        Object obj8 = obj2;
        Object obj9 = obj3;
        Object obj10 = obj3;
        kryo.register(Maps.of(obj, obj6, obj7, obj8, obj9, obj10).getClass(), mapSerializer);
        Object obj11 = obj4;
        Object obj12 = obj4;
        kryo.register(Maps.of(obj, obj6, obj7, obj8, obj9, obj10, obj11, obj12).getClass(), mapSerializer);
        kryo.register(Maps.of(obj, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj5, obj5).getClass(), mapSerializer);
    }
}
