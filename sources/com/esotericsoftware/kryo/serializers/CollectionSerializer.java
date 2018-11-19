package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;

public class CollectionSerializer extends Serializer<Collection> {
    private Class elementClass;
    private boolean elementsCanBeNull = true;
    private Class genericType;
    private Serializer serializer;

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface BindCollection {
        Class<?> elementClass() default Object.class;

        Class<? extends Serializer> elementSerializer() default Serializer.class;

        boolean elementsCanBeNull() default true;
    }

    public CollectionSerializer(Class cls, Serializer serializer) {
        setElementClass(cls, serializer);
    }

    public CollectionSerializer(Class cls, Serializer serializer, boolean z) {
        setElementClass(cls, serializer);
        this.elementsCanBeNull = z;
    }

    public void setElementsCanBeNull(boolean z) {
        this.elementsCanBeNull = z;
    }

    public void setElementClass(Class cls, Serializer serializer) {
        this.elementClass = cls;
        this.serializer = serializer;
    }

    public void setGenerics(Kryo kryo, Class[] clsArr) {
        this.genericType = null;
        if (clsArr != null && clsArr.length > 0 && kryo.isFinal(clsArr[0]) != null) {
            this.genericType = clsArr[0];
        }
    }

    public void write(Kryo kryo, Output output, Collection collection) {
        output.writeVarInt(collection.size(), true);
        Serializer serializer = this.serializer;
        if (this.genericType != null) {
            if (serializer == null) {
                serializer = kryo.getSerializer(this.genericType);
            }
            this.genericType = null;
        }
        if (serializer == null) {
            for (Object writeClassAndObject : collection) {
                kryo.writeClassAndObject(output, writeClassAndObject);
            }
        } else if (this.elementsCanBeNull) {
            for (Object writeObjectOrNull : collection) {
                kryo.writeObjectOrNull(output, writeObjectOrNull, serializer);
            }
        } else {
            for (Object writeObjectOrNull2 : collection) {
                kryo.writeObject(output, writeObjectOrNull2, serializer);
            }
        }
    }

    protected Collection create(Kryo kryo, Input input, Class<Collection> cls) {
        return (Collection) kryo.newInstance(cls);
    }

    public Collection read(Kryo kryo, Input input, Class<Collection> cls) {
        cls = create(kryo, input, cls);
        kryo.reference(cls);
        int readVarInt = input.readVarInt(true);
        if (cls instanceof ArrayList) {
            ((ArrayList) cls).ensureCapacity(readVarInt);
        }
        Class cls2 = this.elementClass;
        Serializer serializer = this.serializer;
        if (this.genericType != null) {
            if (serializer == null) {
                cls2 = this.genericType;
                serializer = kryo.getSerializer(this.genericType);
            }
            this.genericType = null;
        }
        int i = 0;
        if (serializer == null) {
            while (i < readVarInt) {
                cls.add(kryo.readClassAndObject(input));
                i++;
            }
        } else if (this.elementsCanBeNull) {
            while (i < readVarInt) {
                cls.add(kryo.readObjectOrNull(input, cls2, serializer));
                i++;
            }
        } else {
            while (i < readVarInt) {
                cls.add(kryo.readObject(input, cls2, serializer));
                i++;
            }
        }
        return cls;
    }

    protected Collection createCopy(Kryo kryo, Collection collection) {
        return (Collection) kryo.newInstance(collection.getClass());
    }

    public Collection copy(Kryo kryo, Collection collection) {
        Collection createCopy = createCopy(kryo, collection);
        kryo.reference(createCopy);
        for (Object copy : collection) {
            createCopy.add(kryo.copy(copy));
        }
        return createCopy;
    }
}
