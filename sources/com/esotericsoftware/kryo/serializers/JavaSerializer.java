package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

public class JavaSerializer extends Serializer {

    private static class ObjectInputStreamWithKryoClassLoader extends ObjectInputStream {
        private final ClassLoader loader;

        ObjectInputStreamWithKryoClassLoader(InputStream inputStream, Kryo kryo) throws IOException {
            super(inputStream);
            this.loader = kryo.getClassLoader();
        }

        protected Class<?> resolveClass(ObjectStreamClass objectStreamClass) {
            try {
                return Class.forName(objectStreamClass.getName(), false, this.loader);
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Class not found: ");
                stringBuilder.append(objectStreamClass.getName());
                throw new RuntimeException(stringBuilder.toString(), e);
            }
        }
    }

    public void write(Kryo kryo, Output output, Object obj) {
        try {
            kryo = kryo.getGraphContext();
            ObjectOutputStream objectOutputStream = (ObjectOutputStream) kryo.get(this);
            if (objectOutputStream == null) {
                objectOutputStream = new ObjectOutputStream(output);
                kryo.put(this, objectOutputStream);
            }
            objectOutputStream.writeObject(obj);
            objectOutputStream.flush();
        } catch (Kryo kryo2) {
            throw new KryoException("Error during Java serialization.", kryo2);
        }
    }

    public Object read(Kryo kryo, Input input, Class cls) {
        try {
            cls = kryo.getGraphContext();
            ObjectInputStream objectInputStream = (ObjectInputStream) cls.get(this);
            if (objectInputStream == null) {
                objectInputStream = new ObjectInputStreamWithKryoClassLoader(input, kryo);
                cls.put(this, objectInputStream);
            }
            return objectInputStream.readObject();
        } catch (Kryo kryo2) {
            throw new KryoException("Error during Java deserialization.", kryo2);
        }
    }
}
