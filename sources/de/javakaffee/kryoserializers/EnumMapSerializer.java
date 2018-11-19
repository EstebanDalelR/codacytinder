package de.javakaffee.kryoserializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.minlog.Log;
import java.lang.reflect.Field;
import java.util.EnumMap;
import java.util.Map.Entry;

public class EnumMapSerializer extends Serializer<EnumMap<? extends Enum<?>, ?>> {
    private static final Object FAKE_REFERENCE = new Object();
    private static final Field TYPE_FIELD;

    static {
        try {
            TYPE_FIELD = EnumMap.class.getDeclaredField("keyType");
            TYPE_FIELD.setAccessible(true);
        } catch (Throwable e) {
            throw new RuntimeException("The EnumMap class seems to have changed, could not access expected field.", e);
        }
    }

    public EnumMap<? extends Enum<?>, ?> copy(Kryo kryo, EnumMap<? extends Enum<?>, ?> enumMap) {
        EnumMap<? extends Enum<?>, ?> enumMap2 = new EnumMap(enumMap);
        enumMap = enumMap.entrySet().iterator();
        while (enumMap.hasNext()) {
            Entry entry = (Entry) enumMap.next();
            enumMap2.put((Enum) entry.getKey(), kryo.copy(entry.getValue()));
        }
        return enumMap2;
    }

    private EnumMap<? extends Enum<?>, ?> create(Kryo kryo, Input input, Class<EnumMap<? extends Enum<?>, ?>> cls) {
        return new EnumMap(kryo.readClass(input).getType());
    }

    public EnumMap<? extends Enum<?>, ?> read(Kryo kryo, Input input, Class<EnumMap<? extends Enum<?>, ?>> cls) {
        kryo.reference(FAKE_REFERENCE);
        cls = create(kryo, input, cls);
        Enum[] enumArr = (Enum[]) getKeyType(cls).getEnumConstants();
        int readInt = input.readInt(true);
        for (int i = 0; i < readInt; i++) {
            cls.put(enumArr[input.readInt(true)], kryo.readClassAndObject(input));
        }
        return cls;
    }

    public void write(Kryo kryo, Output output, EnumMap<? extends Enum<?>, ?> enumMap) {
        kryo.writeClass(output, getKeyType(enumMap));
        output.writeInt(enumMap.size(), true);
        for (Entry entry : enumMap.entrySet()) {
            output.writeInt(((Enum) entry.getKey()).ordinal(), true);
            kryo.writeClassAndObject(output, entry.getValue());
        }
        if (Log.TRACE != null) {
            output = new StringBuilder();
            output.append("Wrote EnumMap: ");
            output.append(enumMap);
            Log.trace("kryo", output.toString());
        }
    }

    private Class<Enum<?>> getKeyType(EnumMap<?, ?> enumMap) {
        try {
            return (Class) TYPE_FIELD.get(enumMap);
        } catch (EnumMap<?, ?> enumMap2) {
            throw new RuntimeException("Could not access keys field.", enumMap2);
        }
    }
}
