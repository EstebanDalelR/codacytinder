package de.javakaffee.kryoserializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import java.lang.reflect.Constructor;
import java.util.Date;

public class DateSerializer extends Serializer<Date> {
    private final Constructor<? extends Date> _constructor;

    public DateSerializer(Class<? extends Date> cls) {
        try {
            this._constructor = cls.getConstructor(new Class[]{Long.TYPE});
        } catch (Class<? extends Date> cls2) {
            throw new RuntimeException(cls2);
        }
    }

    public Date read(Kryo kryo, Input input, Class<Date> cls) {
        try {
            return (Date) this._constructor.newInstance(new Object[]{Long.valueOf(input.readLong(true))});
        } catch (Kryo kryo2) {
            throw new RuntimeException(kryo2);
        }
    }

    public void write(Kryo kryo, Output output, Date date) {
        output.writeLong(date.getTime(), true);
    }

    public Date copy(Kryo kryo, Date date) {
        return (Date) date.clone();
    }
}
