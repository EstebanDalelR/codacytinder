package de.javakaffee.kryoserializers.wicket;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.minlog.Log;
import java.lang.reflect.Field;
import java.util.Map.Entry;
import org.apache.wicket.util.collections.MiniMap;

public class MiniMapSerializer extends Serializer<MiniMap<Object, Object>> {
    private static final Field KEYS_FIELD;

    static {
        try {
            KEYS_FIELD = MiniMap.class.getDeclaredField("keys");
            KEYS_FIELD.setAccessible(true);
        } catch (Throwable e) {
            throw new RuntimeException("The MiniMap seems to have changed, could not access expected field.", e);
        }
    }

    private int getMaxEntries(MiniMap<?, ?> miniMap) {
        try {
            return ((Object[]) KEYS_FIELD.get(miniMap)).length;
        } catch (MiniMap<?, ?> miniMap2) {
            throw new RuntimeException("Could not access keys field.", miniMap2);
        }
    }

    public void write(Kryo kryo, Output output, MiniMap<Object, Object> miniMap) {
        output.writeInt(getMaxEntries(miniMap), true);
        output.writeInt(miniMap.size(), true);
        for (Entry entry : miniMap.entrySet()) {
            kryo.writeClassAndObject(output, entry.getKey());
            kryo.writeClassAndObject(output, entry.getValue());
        }
        if (Log.TRACE != null) {
            output = new StringBuilder();
            output.append("Wrote map: ");
            output.append(miniMap);
            Log.trace("kryo", output.toString());
        }
    }

    public MiniMap<Object, Object> read(Kryo kryo, Input input, Class<MiniMap<Object, Object>> cls) {
        MiniMap<Object, Object> miniMap = new MiniMap(input.readInt(true));
        cls = input.readInt(true);
        for (int i = 0; i < cls; i++) {
            miniMap.put(kryo.readClassAndObject(input), kryo.readClassAndObject(input));
        }
        return miniMap;
    }
}
