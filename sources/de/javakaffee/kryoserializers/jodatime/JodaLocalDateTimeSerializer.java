package de.javakaffee.kryoserializers.jodatime;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.facebook.ads.AdError;
import com.tinder.api.ManagerWebServices;
import org.joda.time.LocalDateTime;

public class JodaLocalDateTimeSerializer extends Serializer<LocalDateTime> {
    public JodaLocalDateTimeSerializer() {
        setImmutable(true);
    }

    public LocalDateTime read(Kryo kryo, Input input, Class<LocalDateTime> cls) {
        long readLong = input.readLong(true);
        kryo = (int) (readLong / 86400000);
        cls = (int) (readLong % 86400000);
        return new LocalDateTime(kryo / 416, (kryo % 416) / 32, kryo % 32, cls / 3600000, (cls % 3600000) / ManagerWebServices.TIMEOUT_AUTH_MS, (cls % 60000) / AdError.NETWORK_ERROR_CODE, cls % AdError.NETWORK_ERROR_CODE, IdentifiableChronology.readChronology(input));
    }

    public void write(Kryo kryo, Output output, LocalDateTime localDateTime) {
        output.writeLong((((long) ((((localDateTime.m18420e() * 13) * 32) + (localDateTime.m18421f() * 32)) + localDateTime.m18422g())) * 86400000) + ((long) localDateTime.m18427l()), true);
        String chronologyId = IdentifiableChronology.getChronologyId(localDateTime.getChronology());
        if (chronologyId == null) {
            chronologyId = "";
        }
        output.writeString(chronologyId);
    }
}
