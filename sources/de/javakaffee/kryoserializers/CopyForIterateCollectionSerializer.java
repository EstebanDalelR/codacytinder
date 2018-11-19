package de.javakaffee.kryoserializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.serializers.CollectionSerializer;
import java.util.ArrayList;
import java.util.Collection;

public class CopyForIterateCollectionSerializer extends CollectionSerializer {
    public void write(Kryo kryo, Output output, Collection collection) {
        super.write(kryo, output, new ArrayList(collection));
    }
}
