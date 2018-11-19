package de.javakaffee.kryoserializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.minlog.Log;
import java.lang.reflect.Field;
import java.util.EnumSet;

public class EnumSetSerializer extends Serializer<EnumSet<? extends Enum<?>>> {
    private static final Field TYPE_FIELD;

    static {
        try {
            TYPE_FIELD = EnumSet.class.getDeclaredField("elementType");
            TYPE_FIELD.setAccessible(true);
        } catch (Throwable e) {
            throw new RuntimeException("The EnumSet class seems to have changed, could not access expected field.", e);
        }
    }

    public EnumSet<? extends Enum<?>> copy(Kryo kryo, EnumSet<? extends Enum<?>> enumSet) {
        return enumSet.clone();
    }

    public EnumSet read(Kryo kryo, Input input, Class<EnumSet<? extends Enum<?>>> cls) {
        kryo = kryo.readClass(input).getType();
        cls = EnumSet.noneOf(kryo);
        int readInt = input.readInt(true);
        Enum[] enumArr = (Enum[]) kryo.getEnumConstants();
        for (int i = 0; i < readInt; i++) {
            cls.add(enumArr[input.readInt(true)]);
        }
        return cls;
    }

    public void write(Kryo kryo, Output output, EnumSet<? extends Enum<?>> enumSet) {
        kryo.writeClass(output, getElementType(enumSet));
        output.writeInt(enumSet.size(), true);
        kryo = enumSet.iterator();
        while (kryo.hasNext()) {
            output.writeInt(((Enum) kryo.next()).ordinal(), true);
        }
        if (Log.TRACE != null) {
            output = new StringBuilder();
            output.append("Wrote EnumSet: ");
            output.append(enumSet);
            Log.trace("kryo", output.toString());
        }
    }

    private Class<? extends Enum<?>> getElementType(EnumSet<? extends Enum<?>> enumSet) {
        try {
            return (Class) TYPE_FIELD.get(enumSet);
        } catch (EnumSet<? extends Enum<?>> enumSet2) {
            throw new RuntimeException("Could not access keys field.", enumSet2);
        }
    }
}
