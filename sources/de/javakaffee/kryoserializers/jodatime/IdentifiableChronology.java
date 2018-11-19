package de.javakaffee.kryoserializers.jodatime;

import com.esotericsoftware.kryo.io.Input;
import org.joda.time.C19304a;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;

enum IdentifiableChronology {
    ISO(null, ISOChronology.O()),
    COPTIC("COPTIC", CopticChronology.Z()),
    ETHIOPIC("ETHIOPIC", EthiopicChronology.Z()),
    GREGORIAN("GREGORIAN", GregorianChronology.aa()),
    JULIAN("JULIAN", JulianChronology.Z()),
    ISLAMIC("ISLAMIC", IslamicChronology.aa()),
    BUDDHIST("BUDDHIST", BuddhistChronology.O()),
    GJ("GJ", GJChronology.O());
    
    private final C19304a _chronology;
    private final String _id;

    private IdentifiableChronology(String str, C19304a c19304a) {
        this._id = str;
        this._chronology = c19304a;
    }

    public String getId() {
        return this._id;
    }

    public static String getIdByChronology(Class<? extends C19304a> cls) throws IllegalArgumentException {
        for (IdentifiableChronology identifiableChronology : values()) {
            if (cls.equals(identifiableChronology._chronology.getClass())) {
                return identifiableChronology._id;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Chronology not supported: ");
        stringBuilder.append(cls.getSimpleName());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static C19304a valueOfId(String str) throws IllegalArgumentException {
        if (str == null) {
            return ISO._chronology;
        }
        for (IdentifiableChronology identifiableChronology : values()) {
            if (str.equals(identifiableChronology._id)) {
                return identifiableChronology._chronology;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No chronology found for id ");
        stringBuilder.append(str);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    static C19304a readChronology(Input input) {
        input = input.readString();
        if ("".equals(input)) {
            input = null;
        }
        return valueOfId(input);
    }

    static String getChronologyId(C19304a c19304a) {
        return getIdByChronology(c19304a.getClass());
    }
}
