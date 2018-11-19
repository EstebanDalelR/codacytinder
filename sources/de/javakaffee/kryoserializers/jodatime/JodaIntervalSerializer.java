package de.javakaffee.kryoserializers.jodatime;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import org.joda.time.Interval;

public class JodaIntervalSerializer extends Serializer<Interval> {
    public JodaIntervalSerializer() {
        setImmutable(true);
    }

    public Interval read(Kryo kryo, Input input, Class<Interval> cls) {
        return new Interval(input.readLong(true), input.readLong(true), IdentifiableChronology.readChronology(input));
    }

    public void write(Kryo kryo, Output output, Interval interval) {
        long startMillis = interval.getStartMillis();
        long endMillis = interval.getEndMillis();
        kryo = IdentifiableChronology.getChronologyId(interval.getChronology());
        output.writeLong(startMillis, true);
        output.writeLong(endMillis, true);
        if (kryo == null) {
            kryo = "";
        }
        output.writeString(kryo);
    }
}
