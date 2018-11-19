package io.paperdb.serializer;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.serializers.CollectionSerializer;
import java.util.ArrayList;
import java.util.Collection;

public class NoArgCollectionSerializer extends CollectionSerializer {
    protected Collection create(Kryo kryo, Input input, Class<Collection> cls) {
        return new ArrayList();
    }
}
