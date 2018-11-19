package de.javakaffee.kryoserializers.jodatime;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import org.joda.time.LocalDate;

public class JodaLocalDateSerializer extends Serializer<LocalDate> {
    public JodaLocalDateSerializer() {
        setImmutable(true);
    }

    public LocalDate read(Kryo kryo, Input input, Class<LocalDate> cls) {
        kryo = input.readInt(true);
        return new LocalDate(kryo / 416, (kryo % 416) / 32, kryo % 32, IdentifiableChronology.readChronology(input));
    }

    public void write(Kryo kryo, Output output, LocalDate localDate) {
        output.writeInt((((localDate.m18404d() * 13) * 32) + (localDate.m18406e() * 32)) + localDate.m18407f(), true);
        String chronologyId = IdentifiableChronology.getChronologyId(localDate.getChronology());
        if (chronologyId == null) {
            chronologyId = "";
        }
        output.writeString(chronologyId);
    }
}
