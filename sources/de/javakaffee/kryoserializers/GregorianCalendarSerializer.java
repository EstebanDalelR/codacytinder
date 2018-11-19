package de.javakaffee.kryoserializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import java.lang.reflect.Field;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class GregorianCalendarSerializer extends Serializer<GregorianCalendar> {
    private final Field _zoneField;

    public GregorianCalendarSerializer() {
        try {
            this._zoneField = Calendar.class.getDeclaredField("zone");
            this._zoneField.setAccessible(true);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public GregorianCalendar read(Kryo kryo, Input input, Class<GregorianCalendar> cls) {
        kryo = GregorianCalendar.getInstance();
        kryo.setTimeInMillis(input.readLong(true));
        kryo.setLenient(input.readBoolean());
        kryo.setFirstDayOfWeek(input.readInt(true));
        kryo.setMinimalDaysInFirstWeek(input.readInt(true));
        input = input.readString();
        if (getTimeZone(kryo).getID().equals(input) == null) {
            kryo.setTimeZone(TimeZone.getTimeZone(input));
        }
        return (GregorianCalendar) kryo;
    }

    public void write(Kryo kryo, Output output, GregorianCalendar gregorianCalendar) {
        output.writeLong(gregorianCalendar.getTimeInMillis(), true);
        output.writeBoolean(gregorianCalendar.isLenient());
        output.writeInt(gregorianCalendar.getFirstDayOfWeek(), true);
        output.writeInt(gregorianCalendar.getMinimalDaysInFirstWeek(), true);
        output.writeString(getTimeZone(gregorianCalendar).getID());
    }

    public GregorianCalendar copy(Kryo kryo, GregorianCalendar gregorianCalendar) {
        return (GregorianCalendar) gregorianCalendar.clone();
    }

    private TimeZone getTimeZone(Calendar calendar) {
        try {
            return (TimeZone) this._zoneField.get(calendar);
        } catch (Calendar calendar2) {
            throw new RuntimeException(calendar2);
        }
    }
}
