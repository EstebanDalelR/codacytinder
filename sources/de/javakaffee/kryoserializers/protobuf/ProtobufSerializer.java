package de.javakaffee.kryoserializers.protobuf;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.google.protobuf.GeneratedMessage;
import java.lang.reflect.Method;

public class ProtobufSerializer<T extends GeneratedMessage> extends Serializer<T> {
    private Method parseFromMethod = null;

    public boolean getAcceptsNull() {
        return true;
    }

    public void write(Kryo kryo, Output output, T t) {
        if (t == null) {
            output.writeByte(null);
            output.flush();
            return;
        }
        kryo = t.toByteArray();
        output.writeInt(kryo.length + 1, true);
        output.writeBytes(kryo);
        output.flush();
    }

    public T read(Kryo kryo, Input input, Class<T> cls) {
        int readInt = input.readInt(true);
        if (readInt == 0) {
            return null;
        }
        input = input.readBytes(readInt - 1);
        try {
            return (GeneratedMessage) getParseFromMethod(cls).invoke(cls, new Object[]{input});
        } catch (Kryo kryo2) {
            cls = new StringBuilder();
            cls.append("Unable to deserialize protobuf ");
            cls.append(kryo2.getMessage());
            throw new RuntimeException(cls.toString(), kryo2);
        } catch (Kryo kryo22) {
            cls = new StringBuilder();
            cls.append("Unable to deserialize protobuf ");
            cls.append(kryo22.getMessage());
            throw new RuntimeException(cls.toString(), kryo22);
        } catch (Kryo kryo222) {
            cls = new StringBuilder();
            cls.append("Unable to deserialize protobuf ");
            cls.append(kryo222.getMessage());
            throw new RuntimeException(cls.toString(), kryo222);
        }
    }

    private Method getParseFromMethod(Class<T> cls) throws NoSuchMethodException {
        if (this.parseFromMethod == null) {
            this.parseFromMethod = cls.getMethod("parseFrom", new Class[]{byte[].class});
        }
        return this.parseFromMethod;
    }
}
