package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;

public class EnumNameSerializer extends Serializer<Enum> {
    private final Class<? extends Enum> enumType;
    private final Serializer stringSerializer;

    public EnumNameSerializer(Kryo kryo, Class<? extends Enum> cls) {
        this.enumType = cls;
        this.stringSerializer = kryo.getSerializer(String.class);
        setImmutable(true);
    }

    public void write(Kryo kryo, Output output, Enum enumR) {
        kryo.writeObject(output, enumR.name(), this.stringSerializer);
    }

    public Enum read(Kryo kryo, Input input, Class<Enum> cls) {
        String str = (String) kryo.readObject(input, String.class, this.stringSerializer);
        try {
            return Enum.valueOf(this.enumType, str);
        } catch (Input input2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid name for enum \"");
            stringBuilder.append(this.enumType.getName());
            stringBuilder.append("\": ");
            stringBuilder.append(str);
            throw new KryoException(stringBuilder.toString(), input2);
        }
    }
}
