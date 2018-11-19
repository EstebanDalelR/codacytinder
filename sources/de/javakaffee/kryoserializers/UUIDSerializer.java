package de.javakaffee.kryoserializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import java.util.UUID;

public class UUIDSerializer extends Serializer<UUID> {
    public UUIDSerializer() {
        setImmutable(true);
    }

    public void write(Kryo kryo, Output output, UUID uuid) {
        output.writeLong(uuid.getMostSignificantBits());
        output.writeLong(uuid.getLeastSignificantBits());
    }

    public UUID read(Kryo kryo, Input input, Class<UUID> cls) {
        return new UUID(input.readLong(), input.readLong());
    }
}
