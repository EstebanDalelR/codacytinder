package de.javakaffee.kryoserializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.serializers.MapSerializer;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CopyForIterateMapSerializer extends MapSerializer {
    public void write(Kryo kryo, Output output, Map map) {
        Map linkedHashMap;
        if (map instanceof LinkedHashMap) {
            linkedHashMap = new LinkedHashMap(map);
        } else {
            linkedHashMap = new HashMap(map);
        }
        super.write(kryo, output, linkedHashMap);
    }
}
