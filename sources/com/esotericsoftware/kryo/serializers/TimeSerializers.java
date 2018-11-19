package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.util.Util;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public final class TimeSerializers {

    private static class DurationSerializer extends Serializer<Duration> {
        private DurationSerializer() {
            setImmutable(true);
        }

        public void write(Kryo kryo, Output output, Duration duration) {
            output.writeLong(duration.getSeconds());
            output.writeInt(duration.getNano(), true);
        }

        public Duration read(Kryo kryo, Input input, Class<Duration> cls) {
            return Duration.ofSeconds(input.readLong(), (long) input.readInt(true));
        }
    }

    private static class InstantSerializer extends Serializer<Instant> {
        private InstantSerializer() {
            setImmutable(true);
        }

        public void write(Kryo kryo, Output output, Instant instant) {
            output.writeLong(instant.getEpochSecond(), true);
            output.writeInt(instant.getNano(), true);
        }

        public Instant read(Kryo kryo, Input input, Class<Instant> cls) {
            return Instant.ofEpochSecond(input.readLong(true), (long) input.readInt(true));
        }
    }

    private static class LocalDateSerializer extends Serializer<LocalDate> {
        private LocalDateSerializer() {
            setImmutable(true);
        }

        public void write(Kryo kryo, Output output, LocalDate localDate) {
            write(output, localDate);
        }

        static void write(Output output, LocalDate localDate) {
            output.writeInt(localDate.getYear(), true);
            output.writeByte(localDate.getMonthValue());
            output.writeByte(localDate.getDayOfMonth());
        }

        public LocalDate read(Kryo kryo, Input input, Class<LocalDate> cls) {
            return read(input);
        }

        static LocalDate read(Input input) {
            return LocalDate.of(input.readInt(true), input.readByte(), input.readByte());
        }
    }

    private static class LocalDateTimeSerializer extends Serializer<LocalDateTime> {
        private LocalDateTimeSerializer() {
            setImmutable(true);
        }

        public void write(Kryo kryo, Output output, LocalDateTime localDateTime) {
            LocalDateSerializer.write(output, localDateTime.toLocalDate());
            LocalTimeSerializer.write(output, localDateTime.toLocalTime());
        }

        public LocalDateTime read(Kryo kryo, Input input, Class<LocalDateTime> cls) {
            return LocalDateTime.of(LocalDateSerializer.read(input), LocalTimeSerializer.read(input));
        }
    }

    private static class LocalTimeSerializer extends Serializer<LocalTime> {
        private LocalTimeSerializer() {
            setImmutable(true);
        }

        public void write(Kryo kryo, Output output, LocalTime localTime) {
            write(output, localTime);
        }

        static void write(Output output, LocalTime localTime) {
            if (localTime.getNano() != 0) {
                output.writeByte(localTime.getHour());
                output.writeByte(localTime.getMinute());
                output.writeByte(localTime.getSecond());
                output.writeInt(localTime.getNano(), true);
            } else if (localTime.getSecond() != 0) {
                output.writeByte(localTime.getHour());
                output.writeByte(localTime.getMinute());
                output.writeByte(localTime.getSecond() ^ -1);
            } else if (localTime.getMinute() == 0) {
                output.writeByte(localTime.getHour() ^ -1);
            } else {
                output.writeByte(localTime.getHour());
                output.writeByte(localTime.getMinute() ^ -1);
            }
        }

        public LocalTime read(Kryo kryo, Input input, Class<LocalTime> cls) {
            return read(input);
        }

        static LocalTime read(Input input) {
            int i;
            int readByte = input.readByte();
            int i2 = 0;
            if (readByte < 0) {
                readByte ^= -1;
                input = null;
                i = 0;
            } else {
                i = input.readByte();
                if (i < 0) {
                    i ^= -1;
                } else {
                    byte readByte2 = input.readByte();
                    if (readByte2 < (byte) 0) {
                        i2 = readByte2 ^ -1;
                    } else {
                        input = input.readInt(true);
                        i2 = readByte2;
                    }
                }
                input = null;
            }
            return LocalTime.of(readByte, i, i2, input);
        }
    }

    private static class MonthDaySerializer extends Serializer<MonthDay> {
        private MonthDaySerializer() {
            setImmutable(true);
        }

        public void write(Kryo kryo, Output output, MonthDay monthDay) {
            output.writeByte(monthDay.getMonthValue());
            output.writeByte(monthDay.getDayOfMonth());
        }

        public MonthDay read(Kryo kryo, Input input, Class<MonthDay> cls) {
            return MonthDay.of(input.readByte(), input.readByte());
        }
    }

    private static class OffsetDateTimeSerializer extends Serializer<OffsetDateTime> {
        private OffsetDateTimeSerializer() {
            setImmutable(true);
        }

        public void write(Kryo kryo, Output output, OffsetDateTime offsetDateTime) {
            LocalDateSerializer.write(output, offsetDateTime.toLocalDate());
            LocalTimeSerializer.write(output, offsetDateTime.toLocalTime());
            ZoneOffsetSerializer.write(output, offsetDateTime.getOffset());
        }

        public OffsetDateTime read(Kryo kryo, Input input, Class<OffsetDateTime> cls) {
            return OffsetDateTime.of(LocalDateSerializer.read(input), LocalTimeSerializer.read(input), ZoneOffsetSerializer.read(input));
        }
    }

    private static class OffsetTimeSerializer extends Serializer<OffsetTime> {
        private OffsetTimeSerializer() {
            setImmutable(true);
        }

        public void write(Kryo kryo, Output output, OffsetTime offsetTime) {
            LocalTimeSerializer.write(output, offsetTime.toLocalTime());
            ZoneOffsetSerializer.write(output, offsetTime.getOffset());
        }

        public OffsetTime read(Kryo kryo, Input input, Class<OffsetTime> cls) {
            return OffsetTime.of(LocalTimeSerializer.read(input), ZoneOffsetSerializer.read(input));
        }
    }

    private static class PeriodSerializer extends Serializer<Period> {
        private PeriodSerializer() {
            setImmutable(true);
        }

        public void write(Kryo kryo, Output output, Period period) {
            output.writeInt(period.getYears(), true);
            output.writeInt(period.getMonths(), true);
            output.writeInt(period.getDays(), true);
        }

        public Period read(Kryo kryo, Input input, Class<Period> cls) {
            return Period.of(input.readInt(true), input.readInt(true), input.readInt(true));
        }
    }

    private static class YearMonthSerializer extends Serializer<YearMonth> {
        private YearMonthSerializer() {
            setImmutable(true);
        }

        public void write(Kryo kryo, Output output, YearMonth yearMonth) {
            output.writeInt(yearMonth.getYear(), true);
            output.writeByte(yearMonth.getMonthValue());
        }

        public YearMonth read(Kryo kryo, Input input, Class<YearMonth> cls) {
            return YearMonth.of(input.readInt(true), input.readByte());
        }
    }

    private static class YearSerializer extends Serializer<Year> {
        private YearSerializer() {
            setImmutable(true);
        }

        public void write(Kryo kryo, Output output, Year year) {
            output.writeInt(year.getValue(), true);
        }

        public Year read(Kryo kryo, Input input, Class<Year> cls) {
            return Year.of(input.readInt(true));
        }
    }

    private static class ZoneIdSerializer extends Serializer<ZoneId> {
        private ZoneIdSerializer() {
            setImmutable(true);
        }

        public void write(Kryo kryo, Output output, ZoneId zoneId) {
            write(output, zoneId);
        }

        static void write(Output output, ZoneId zoneId) {
            output.writeString(zoneId.getId());
        }

        public ZoneId read(Kryo kryo, Input input, Class<ZoneId> cls) {
            return read(input);
        }

        static ZoneId read(Input input) {
            return ZoneId.of(input.readString());
        }
    }

    private static class ZoneOffsetSerializer extends Serializer<ZoneOffset> {
        private ZoneOffsetSerializer() {
            setImmutable(true);
        }

        public void write(Kryo kryo, Output output, ZoneOffset zoneOffset) {
            write(output, zoneOffset);
        }

        static void write(Output output, ZoneOffset zoneOffset) {
            zoneOffset = zoneOffset.getTotalSeconds();
            int i = zoneOffset % 900 == 0 ? zoneOffset / 900 : 127;
            output.writeByte(i);
            if (i == 127) {
                output.writeInt(zoneOffset);
            }
        }

        public ZoneOffset read(Kryo kryo, Input input, Class<ZoneOffset> cls) {
            return read(input);
        }

        static ZoneOffset read(Input input) {
            byte readByte = input.readByte();
            return readByte == Byte.MAX_VALUE ? ZoneOffset.ofTotalSeconds(input.readInt()) : ZoneOffset.ofTotalSeconds(readByte * 900);
        }
    }

    private static class ZonedDateTimeSerializer extends Serializer<ZonedDateTime> {
        private ZonedDateTimeSerializer() {
            setImmutable(true);
        }

        public void write(Kryo kryo, Output output, ZonedDateTime zonedDateTime) {
            LocalDateSerializer.write(output, zonedDateTime.toLocalDate());
            LocalTimeSerializer.write(output, zonedDateTime.toLocalTime());
            ZoneIdSerializer.write(output, zonedDateTime.getZone());
        }

        public ZonedDateTime read(Kryo kryo, Input input, Class<ZonedDateTime> cls) {
            return ZonedDateTime.of(LocalDateSerializer.read(input), LocalTimeSerializer.read(input), ZoneIdSerializer.read(input));
        }
    }

    public static void addDefaultSerializers(Kryo kryo) {
        if (Util.isClassAvailable("java.time.Duration")) {
            kryo.addDefaultSerializer(Duration.class, new DurationSerializer());
        }
        if (Util.isClassAvailable("java.time.Instant")) {
            kryo.addDefaultSerializer(Instant.class, new InstantSerializer());
        }
        if (Util.isClassAvailable("java.time.LocalDate")) {
            kryo.addDefaultSerializer(LocalDate.class, new LocalDateSerializer());
        }
        if (Util.isClassAvailable("java.time.LocalTime")) {
            kryo.addDefaultSerializer(LocalTime.class, new LocalTimeSerializer());
        }
        if (Util.isClassAvailable("java.time.LocalDateTime")) {
            kryo.addDefaultSerializer(LocalDateTime.class, new LocalDateTimeSerializer());
        }
        if (Util.isClassAvailable("java.time.ZoneOffset")) {
            kryo.addDefaultSerializer(ZoneOffset.class, new ZoneOffsetSerializer());
        }
        if (Util.isClassAvailable("java.time.ZoneId")) {
            kryo.addDefaultSerializer(ZoneId.class, new ZoneIdSerializer());
        }
        if (Util.isClassAvailable("java.time.OffsetTime")) {
            kryo.addDefaultSerializer(OffsetTime.class, new OffsetTimeSerializer());
        }
        if (Util.isClassAvailable("java.time.OffsetDateTime")) {
            kryo.addDefaultSerializer(OffsetDateTime.class, new OffsetDateTimeSerializer());
        }
        if (Util.isClassAvailable("java.time.ZonedDateTime")) {
            kryo.addDefaultSerializer(ZonedDateTime.class, new ZonedDateTimeSerializer());
        }
        if (Util.isClassAvailable("java.time.Year")) {
            kryo.addDefaultSerializer(Year.class, new YearSerializer());
        }
        if (Util.isClassAvailable("java.time.YearMonth")) {
            kryo.addDefaultSerializer(YearMonth.class, new YearMonthSerializer());
        }
        if (Util.isClassAvailable("java.time.MonthDay")) {
            kryo.addDefaultSerializer(MonthDay.class, new MonthDaySerializer());
        }
        if (Util.isClassAvailable("java.time.Period")) {
            kryo.addDefaultSerializer(Period.class, new PeriodSerializer());
        }
    }
}
