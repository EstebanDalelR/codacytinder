package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.KryoSerializable;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.util.Util;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Currency;
import java.util.Date;
import java.util.EnumSet;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;

public class DefaultSerializers {

    public static class BigDecimalSerializer extends Serializer<BigDecimal> {
        private final BigIntegerSerializer bigIntegerSerializer = new BigIntegerSerializer();

        public BigDecimalSerializer() {
            setAcceptsNull(true);
            setImmutable(true);
        }

        public void write(Kryo kryo, Output output, BigDecimal bigDecimal) {
            if (bigDecimal == null) {
                output.writeVarInt(0, true);
            } else if (bigDecimal == BigDecimal.ZERO) {
                this.bigIntegerSerializer.write(kryo, output, BigInteger.ZERO);
                output.writeInt(0, false);
            } else {
                this.bigIntegerSerializer.write(kryo, output, bigDecimal.unscaledValue());
                output.writeInt(bigDecimal.scale(), false);
            }
        }

        public java.math.BigDecimal read(com.esotericsoftware.kryo.Kryo r6, com.esotericsoftware.kryo.io.Input r7, java.lang.Class<java.math.BigDecimal> r8) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r5 = this;
            r0 = r5.bigIntegerSerializer;
            r1 = java.math.BigInteger.class;
            r6 = r0.read(r6, r7, r1);
            if (r6 != 0) goto L_0x000c;
        L_0x000a:
            r6 = 0;
            return r6;
        L_0x000c:
            r0 = 0;
            r7 = r7.readInt(r0);
            r1 = java.math.BigDecimal.class;
            if (r8 == r1) goto L_0x0048;
        L_0x0015:
            if (r8 == 0) goto L_0x0048;
        L_0x0017:
            r1 = 2;
            r2 = new java.lang.Class[r1];	 Catch:{ Exception -> 0x0041 }
            r3 = java.math.BigInteger.class;	 Catch:{ Exception -> 0x0041 }
            r2[r0] = r3;	 Catch:{ Exception -> 0x0041 }
            r3 = java.lang.Integer.TYPE;	 Catch:{ Exception -> 0x0041 }
            r4 = 1;	 Catch:{ Exception -> 0x0041 }
            r2[r4] = r3;	 Catch:{ Exception -> 0x0041 }
            r8 = r8.getConstructor(r2);	 Catch:{ Exception -> 0x0041 }
            r2 = r8.isAccessible();	 Catch:{ Exception -> 0x0041 }
            if (r2 != 0) goto L_0x0030;
        L_0x002d:
            r8.setAccessible(r4);	 Catch:{ SecurityException -> 0x0030 }
        L_0x0030:
            r1 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x0041 }
            r1[r0] = r6;	 Catch:{ Exception -> 0x0041 }
            r6 = java.lang.Integer.valueOf(r7);	 Catch:{ Exception -> 0x0041 }
            r1[r4] = r6;	 Catch:{ Exception -> 0x0041 }
            r6 = r8.newInstance(r1);	 Catch:{ Exception -> 0x0041 }
            r6 = (java.math.BigDecimal) r6;	 Catch:{ Exception -> 0x0041 }
            return r6;
        L_0x0041:
            r6 = move-exception;
            r7 = new com.esotericsoftware.kryo.KryoException;
            r7.<init>(r6);
            throw r7;
        L_0x0048:
            r8 = java.math.BigInteger.ZERO;
            if (r6 != r8) goto L_0x0051;
        L_0x004c:
            if (r7 != 0) goto L_0x0051;
        L_0x004e:
            r6 = java.math.BigDecimal.ZERO;
            return r6;
        L_0x0051:
            r8 = new java.math.BigDecimal;
            r8.<init>(r6, r7);
            return r8;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.serializers.DefaultSerializers.BigDecimalSerializer.read(com.esotericsoftware.kryo.Kryo, com.esotericsoftware.kryo.io.Input, java.lang.Class):java.math.BigDecimal");
        }
    }

    public static class BigIntegerSerializer extends Serializer<BigInteger> {
        public BigIntegerSerializer() {
            setImmutable(true);
            setAcceptsNull(true);
        }

        public void write(Kryo kryo, Output output, BigInteger bigInteger) {
            if (bigInteger == null) {
                output.writeVarInt(0, true);
            } else if (bigInteger == BigInteger.ZERO) {
                output.writeVarInt(2, true);
                output.writeByte(0);
            } else {
                kryo = bigInteger.toByteArray();
                output.writeVarInt(kryo.length + 1, true);
                output.writeBytes(kryo);
            }
        }

        public java.math.BigInteger read(com.esotericsoftware.kryo.Kryo r4, com.esotericsoftware.kryo.io.Input r5, java.lang.Class<java.math.BigInteger> r6) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r3 = this;
            r4 = 1;
            r0 = r5.readVarInt(r4);
            if (r0 != 0) goto L_0x0009;
        L_0x0007:
            r4 = 0;
            return r4;
        L_0x0009:
            r1 = r0 + -1;
            r5 = r5.readBytes(r1);
            r1 = java.math.BigInteger.class;
            r2 = 0;
            if (r6 == r1) goto L_0x003b;
        L_0x0014:
            if (r6 == 0) goto L_0x003b;
        L_0x0016:
            r0 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x0034 }
            r1 = byte[].class;	 Catch:{ Exception -> 0x0034 }
            r0[r2] = r1;	 Catch:{ Exception -> 0x0034 }
            r6 = r6.getConstructor(r0);	 Catch:{ Exception -> 0x0034 }
            r0 = r6.isAccessible();	 Catch:{ Exception -> 0x0034 }
            if (r0 != 0) goto L_0x0029;
        L_0x0026:
            r6.setAccessible(r4);	 Catch:{ SecurityException -> 0x0029 }
        L_0x0029:
            r4 = new java.lang.Object[r4];	 Catch:{ Exception -> 0x0034 }
            r4[r2] = r5;	 Catch:{ Exception -> 0x0034 }
            r4 = r6.newInstance(r4);	 Catch:{ Exception -> 0x0034 }
            r4 = (java.math.BigInteger) r4;	 Catch:{ Exception -> 0x0034 }
            return r4;
        L_0x0034:
            r4 = move-exception;
            r5 = new com.esotericsoftware.kryo.KryoException;
            r5.<init>(r4);
            throw r5;
        L_0x003b:
            r4 = 2;
            if (r0 != r4) goto L_0x0051;
        L_0x003e:
            r4 = r5[r2];
            r6 = 10;
            if (r4 == r6) goto L_0x004e;
        L_0x0044:
            switch(r4) {
                case 0: goto L_0x004b;
                case 1: goto L_0x0048;
                default: goto L_0x0047;
            };
        L_0x0047:
            goto L_0x0051;
        L_0x0048:
            r4 = java.math.BigInteger.ONE;
            return r4;
        L_0x004b:
            r4 = java.math.BigInteger.ZERO;
            return r4;
        L_0x004e:
            r4 = java.math.BigInteger.TEN;
            return r4;
        L_0x0051:
            r4 = new java.math.BigInteger;
            r4.<init>(r5);
            return r4;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.serializers.DefaultSerializers.BigIntegerSerializer.read(com.esotericsoftware.kryo.Kryo, com.esotericsoftware.kryo.io.Input, java.lang.Class):java.math.BigInteger");
        }
    }

    public static class BooleanSerializer extends Serializer<Boolean> {
        public BooleanSerializer() {
            setImmutable(true);
        }

        public void write(Kryo kryo, Output output, Boolean bool) {
            output.writeBoolean(bool.booleanValue());
        }

        public Boolean read(Kryo kryo, Input input, Class<Boolean> cls) {
            return Boolean.valueOf(input.readBoolean());
        }
    }

    public static class ByteSerializer extends Serializer<Byte> {
        public ByteSerializer() {
            setImmutable(true);
        }

        public void write(Kryo kryo, Output output, Byte b) {
            output.writeByte(b.byteValue());
        }

        public Byte read(Kryo kryo, Input input, Class<Byte> cls) {
            return Byte.valueOf(input.readByte());
        }
    }

    public static class CalendarSerializer extends Serializer<Calendar> {
        private static final long DEFAULT_GREGORIAN_CUTOVER = -12219292800000L;
        TimeZoneSerializer timeZoneSerializer = new TimeZoneSerializer();

        public void write(Kryo kryo, Output output, Calendar calendar) {
            this.timeZoneSerializer.write(kryo, output, calendar.getTimeZone());
            output.writeLong(calendar.getTimeInMillis(), true);
            output.writeBoolean(calendar.isLenient());
            output.writeInt(calendar.getFirstDayOfWeek(), true);
            output.writeInt(calendar.getMinimalDaysInFirstWeek(), true);
            if ((calendar instanceof GregorianCalendar) != null) {
                output.writeLong(((GregorianCalendar) calendar).getGregorianChange().getTime(), false);
            } else {
                output.writeLong(DEFAULT_GREGORIAN_CUTOVER, false);
            }
        }

        public Calendar read(Kryo kryo, Input input, Class<Calendar> cls) {
            kryo = Calendar.getInstance(this.timeZoneSerializer.read(kryo, input, TimeZone.class));
            kryo.setTimeInMillis(input.readLong(true));
            kryo.setLenient(input.readBoolean());
            kryo.setFirstDayOfWeek(input.readInt(true));
            kryo.setMinimalDaysInFirstWeek(input.readInt(true));
            input = input.readLong(null);
            if (input != DEFAULT_GREGORIAN_CUTOVER && (kryo instanceof GregorianCalendar)) {
                ((GregorianCalendar) kryo).setGregorianChange(new Date(input));
            }
            return kryo;
        }

        public Calendar copy(Kryo kryo, Calendar calendar) {
            return (Calendar) calendar.clone();
        }
    }

    public static class CharSerializer extends Serializer<Character> {
        public CharSerializer() {
            setImmutable(true);
        }

        public void write(Kryo kryo, Output output, Character ch) {
            output.writeChar(ch.charValue());
        }

        public Character read(Kryo kryo, Input input, Class<Character> cls) {
            return Character.valueOf(input.readChar());
        }
    }

    public static class CharsetSerializer extends Serializer<Charset> {
        public CharsetSerializer() {
            setImmutable(true);
        }

        public void write(Kryo kryo, Output output, Charset charset) {
            output.writeString(charset.name());
        }

        public Charset read(Kryo kryo, Input input, Class<Charset> cls) {
            return Charset.forName(input.readString());
        }
    }

    public static class ClassSerializer extends Serializer<Class> {
        public ClassSerializer() {
            setImmutable(true);
            setAcceptsNull(true);
        }

        public void write(Kryo kryo, Output output, Class cls) {
            kryo.writeClass(output, cls);
            int i = (cls == null || cls.isPrimitive() == null) ? null : true;
            output.writeByte(i);
        }

        public Class read(Kryo kryo, Input input, Class<Class> cls) {
            kryo = kryo.readClass(input);
            input = input.read();
            kryo = kryo != null ? kryo.getType() : null;
            if (kryo != null) {
                if (kryo.isPrimitive() != null) {
                    if (input != 1) {
                        kryo = Util.getWrapperClass(kryo);
                    }
                    return kryo;
                }
            }
            return kryo;
        }
    }

    public static class CollectionsEmptyListSerializer extends Serializer {
        public void write(Kryo kryo, Output output, Object obj) {
        }

        public CollectionsEmptyListSerializer() {
            setImmutable(true);
        }

        public Object read(Kryo kryo, Input input, Class cls) {
            return Collections.EMPTY_LIST;
        }
    }

    public static class CollectionsEmptyMapSerializer extends Serializer {
        public void write(Kryo kryo, Output output, Object obj) {
        }

        public CollectionsEmptyMapSerializer() {
            setImmutable(true);
        }

        public Object read(Kryo kryo, Input input, Class cls) {
            return Collections.EMPTY_MAP;
        }
    }

    public static class CollectionsEmptySetSerializer extends Serializer {
        public void write(Kryo kryo, Output output, Object obj) {
        }

        public CollectionsEmptySetSerializer() {
            setImmutable(true);
        }

        public Object read(Kryo kryo, Input input, Class cls) {
            return Collections.EMPTY_SET;
        }
    }

    public static class CollectionsSingletonListSerializer extends Serializer<List> {
        public CollectionsSingletonListSerializer() {
            setImmutable(true);
        }

        public void write(Kryo kryo, Output output, List list) {
            kryo.writeClassAndObject(output, list.get(0));
        }

        public List read(Kryo kryo, Input input, Class cls) {
            return Collections.singletonList(kryo.readClassAndObject(input));
        }
    }

    public static class CollectionsSingletonMapSerializer extends Serializer<Map> {
        public CollectionsSingletonMapSerializer() {
            setImmutable(true);
        }

        public void write(Kryo kryo, Output output, Map map) {
            Entry entry = (Entry) map.entrySet().iterator().next();
            kryo.writeClassAndObject(output, entry.getKey());
            kryo.writeClassAndObject(output, entry.getValue());
        }

        public Map read(Kryo kryo, Input input, Class cls) {
            return Collections.singletonMap(kryo.readClassAndObject(input), kryo.readClassAndObject(input));
        }
    }

    public static class CollectionsSingletonSetSerializer extends Serializer<Set> {
        public CollectionsSingletonSetSerializer() {
            setImmutable(true);
        }

        public void write(Kryo kryo, Output output, Set set) {
            kryo.writeClassAndObject(output, set.iterator().next());
        }

        public Set read(Kryo kryo, Input input, Class cls) {
            return Collections.singleton(kryo.readClassAndObject(input));
        }
    }

    public static class CurrencySerializer extends Serializer<Currency> {
        public CurrencySerializer() {
            setImmutable(true);
            setAcceptsNull(true);
        }

        public void write(Kryo kryo, Output output, Currency currency) {
            output.writeString(currency == null ? null : currency.getCurrencyCode());
        }

        public Currency read(Kryo kryo, Input input, Class<Currency> cls) {
            kryo = input.readString();
            if (kryo == null) {
                return null;
            }
            return Currency.getInstance(kryo);
        }
    }

    public static class DateSerializer extends Serializer<Date> {
        private java.util.Date create(com.esotericsoftware.kryo.Kryo r5, java.lang.Class<? extends java.util.Date> r6, long r7) throws com.esotericsoftware.kryo.KryoException {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r4 = this;
            r0 = java.util.Date.class;
            if (r6 == r0) goto L_0x0053;
        L_0x0004:
            if (r6 != 0) goto L_0x0007;
        L_0x0006:
            goto L_0x0053;
        L_0x0007:
            r0 = java.sql.Timestamp.class;
            if (r6 != r0) goto L_0x0011;
        L_0x000b:
            r5 = new java.sql.Timestamp;
            r5.<init>(r7);
            return r5;
        L_0x0011:
            r0 = java.sql.Date.class;
            if (r6 != r0) goto L_0x001b;
        L_0x0015:
            r5 = new java.sql.Date;
            r5.<init>(r7);
            return r5;
        L_0x001b:
            r0 = java.sql.Time.class;
            if (r6 != r0) goto L_0x0025;
        L_0x001f:
            r5 = new java.sql.Time;
            r5.<init>(r7);
            return r5;
        L_0x0025:
            r0 = 1;
            r1 = new java.lang.Class[r0];	 Catch:{ Exception -> 0x0049 }
            r2 = java.lang.Long.TYPE;	 Catch:{ Exception -> 0x0049 }
            r3 = 0;	 Catch:{ Exception -> 0x0049 }
            r1[r3] = r2;	 Catch:{ Exception -> 0x0049 }
            r1 = r6.getConstructor(r1);	 Catch:{ Exception -> 0x0049 }
            r2 = r1.isAccessible();	 Catch:{ Exception -> 0x0049 }
            if (r2 != 0) goto L_0x003a;
        L_0x0037:
            r1.setAccessible(r0);	 Catch:{ SecurityException -> 0x003a }
        L_0x003a:
            r0 = new java.lang.Object[r0];	 Catch:{ Exception -> 0x0049 }
            r2 = java.lang.Long.valueOf(r7);	 Catch:{ Exception -> 0x0049 }
            r0[r3] = r2;	 Catch:{ Exception -> 0x0049 }
            r0 = r1.newInstance(r0);	 Catch:{ Exception -> 0x0049 }
            r0 = (java.util.Date) r0;	 Catch:{ Exception -> 0x0049 }
            return r0;
        L_0x0049:
            r5 = r5.newInstance(r6);
            r5 = (java.util.Date) r5;
            r5.setTime(r7);
            return r5;
        L_0x0053:
            r5 = new java.util.Date;
            r5.<init>(r7);
            return r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.serializers.DefaultSerializers.DateSerializer.create(com.esotericsoftware.kryo.Kryo, java.lang.Class, long):java.util.Date");
        }

        public void write(Kryo kryo, Output output, Date date) {
            output.writeLong(date.getTime(), true);
        }

        public Date read(Kryo kryo, Input input, Class<Date> cls) {
            return create(kryo, cls, input.readLong(true));
        }

        public Date copy(Kryo kryo, Date date) {
            return create(kryo, date.getClass(), date.getTime());
        }
    }

    public static class DoubleSerializer extends Serializer<Double> {
        public DoubleSerializer() {
            setImmutable(true);
        }

        public void write(Kryo kryo, Output output, Double d) {
            output.writeDouble(d.doubleValue());
        }

        public Double read(Kryo kryo, Input input, Class<Double> cls) {
            return Double.valueOf(input.readDouble());
        }
    }

    public static class EnumSerializer extends Serializer<Enum> {
        private Object[] enumConstants;

        public EnumSerializer(Class<? extends Enum> cls) {
            setImmutable(true);
            setAcceptsNull(true);
            this.enumConstants = cls.getEnumConstants();
            if (this.enumConstants == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("The type must be an enum: ");
                stringBuilder.append(cls);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }

        public void write(Kryo kryo, Output output, Enum enumR) {
            if (enumR == null) {
                output.writeVarInt(null, true);
            } else {
                output.writeVarInt(enumR.ordinal() + 1, true);
            }
        }

        public Enum read(Kryo kryo, Input input, Class<Enum> cls) {
            input = input.readVarInt(true);
            if (input == null) {
                return null;
            }
            input--;
            if (input >= null) {
                if (input <= this.enumConstants.length - 1) {
                    return (Enum) this.enumConstants[input];
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid ordinal for enum \"");
            stringBuilder.append(cls.getName());
            stringBuilder.append("\": ");
            stringBuilder.append(input);
            throw new KryoException(stringBuilder.toString());
        }
    }

    public static class EnumSetSerializer extends Serializer<EnumSet> {
        public void write(Kryo kryo, Output output, EnumSet enumSet) {
            Serializer serializer;
            if (enumSet.isEmpty()) {
                EnumSet complementOf = EnumSet.complementOf(enumSet);
                if (complementOf.isEmpty()) {
                    throw new KryoException("An EnumSet must have a defined Enum to be serialized.");
                }
                serializer = kryo.writeClass(output, complementOf.iterator().next().getClass()).getSerializer();
            } else {
                serializer = kryo.writeClass(output, enumSet.iterator().next().getClass()).getSerializer();
            }
            output.writeInt(enumSet.size(), true);
            enumSet = enumSet.iterator();
            while (enumSet.hasNext()) {
                serializer.write(kryo, output, enumSet.next());
            }
        }

        public EnumSet read(Kryo kryo, Input input, Class<EnumSet> cls) {
            cls = kryo.readClass(input);
            EnumSet noneOf = EnumSet.noneOf(cls.getType());
            cls = cls.getSerializer();
            int readInt = input.readInt(true);
            for (int i = 0; i < readInt; i++) {
                noneOf.add(cls.read(kryo, input, null));
            }
            return noneOf;
        }

        public EnumSet copy(Kryo kryo, EnumSet enumSet) {
            return EnumSet.copyOf(enumSet);
        }
    }

    public static class FloatSerializer extends Serializer<Float> {
        public FloatSerializer() {
            setImmutable(true);
        }

        public void write(Kryo kryo, Output output, Float f) {
            output.writeFloat(f.floatValue());
        }

        public Float read(Kryo kryo, Input input, Class<Float> cls) {
            return Float.valueOf(input.readFloat());
        }
    }

    public static class IntSerializer extends Serializer<Integer> {
        public IntSerializer() {
            setImmutable(true);
        }

        public void write(Kryo kryo, Output output, Integer num) {
            output.writeInt(num.intValue(), null);
        }

        public Integer read(Kryo kryo, Input input, Class<Integer> cls) {
            return Integer.valueOf(input.readInt(null));
        }
    }

    public static class KryoSerializableSerializer extends Serializer<KryoSerializable> {
        public void write(Kryo kryo, Output output, KryoSerializable kryoSerializable) {
            kryoSerializable.write(kryo, output);
        }

        public KryoSerializable read(Kryo kryo, Input input, Class<KryoSerializable> cls) {
            KryoSerializable kryoSerializable = (KryoSerializable) kryo.newInstance(cls);
            kryo.reference(kryoSerializable);
            kryoSerializable.read(kryo, input);
            return kryoSerializable;
        }
    }

    public static class LocaleSerializer extends Serializer<Locale> {
        public static final Locale SPAIN = new Locale("es", "ES", "");
        public static final Locale SPANISH = new Locale("es", "", "");

        public LocaleSerializer() {
            setImmutable(true);
        }

        protected Locale create(String str, String str2, String str3) {
            Locale locale = Locale.getDefault();
            if (isSameLocale(locale, str, str2, str3)) {
                return locale;
            }
            if (locale != Locale.US && isSameLocale(Locale.US, str, str2, str3)) {
                return Locale.US;
            }
            if (isSameLocale(Locale.ENGLISH, str, str2, str3)) {
                return Locale.ENGLISH;
            }
            if (isSameLocale(Locale.GERMAN, str, str2, str3)) {
                return Locale.GERMAN;
            }
            if (isSameLocale(SPANISH, str, str2, str3)) {
                return SPANISH;
            }
            if (isSameLocale(Locale.FRENCH, str, str2, str3)) {
                return Locale.FRENCH;
            }
            if (isSameLocale(Locale.ITALIAN, str, str2, str3)) {
                return Locale.ITALIAN;
            }
            if (isSameLocale(Locale.JAPANESE, str, str2, str3)) {
                return Locale.JAPANESE;
            }
            if (isSameLocale(Locale.KOREAN, str, str2, str3)) {
                return Locale.KOREAN;
            }
            if (isSameLocale(Locale.SIMPLIFIED_CHINESE, str, str2, str3)) {
                return Locale.SIMPLIFIED_CHINESE;
            }
            if (isSameLocale(Locale.CHINESE, str, str2, str3)) {
                return Locale.CHINESE;
            }
            if (isSameLocale(Locale.TRADITIONAL_CHINESE, str, str2, str3)) {
                return Locale.TRADITIONAL_CHINESE;
            }
            if (isSameLocale(Locale.UK, str, str2, str3)) {
                return Locale.UK;
            }
            if (isSameLocale(Locale.GERMANY, str, str2, str3)) {
                return Locale.GERMANY;
            }
            if (isSameLocale(SPAIN, str, str2, str3)) {
                return SPAIN;
            }
            if (isSameLocale(Locale.FRANCE, str, str2, str3)) {
                return Locale.FRANCE;
            }
            if (isSameLocale(Locale.ITALY, str, str2, str3)) {
                return Locale.ITALY;
            }
            if (isSameLocale(Locale.JAPAN, str, str2, str3)) {
                return Locale.JAPAN;
            }
            if (isSameLocale(Locale.KOREA, str, str2, str3)) {
                return Locale.KOREA;
            }
            if (isSameLocale(Locale.CANADA, str, str2, str3)) {
                return Locale.CANADA;
            }
            if (isSameLocale(Locale.CANADA_FRENCH, str, str2, str3)) {
                return Locale.CANADA_FRENCH;
            }
            return new Locale(str, str2, str3);
        }

        public void write(Kryo kryo, Output output, Locale locale) {
            output.writeAscii(locale.getLanguage());
            output.writeAscii(locale.getCountry());
            output.writeString(locale.getVariant());
        }

        public Locale read(Kryo kryo, Input input, Class<Locale> cls) {
            return create(input.readString(), input.readString(), input.readString());
        }

        protected static boolean isSameLocale(java.util.Locale r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r0 = 0;
            r1 = r2.getLanguage();	 Catch:{ NullPointerException -> 0x0021 }
            r3 = r1.equals(r3);	 Catch:{ NullPointerException -> 0x0021 }
            if (r3 == 0) goto L_0x0020;	 Catch:{ NullPointerException -> 0x0021 }
        L_0x000b:
            r3 = r2.getCountry();	 Catch:{ NullPointerException -> 0x0021 }
            r3 = r3.equals(r4);	 Catch:{ NullPointerException -> 0x0021 }
            if (r3 == 0) goto L_0x0020;	 Catch:{ NullPointerException -> 0x0021 }
        L_0x0015:
            r2 = r2.getVariant();	 Catch:{ NullPointerException -> 0x0021 }
            r2 = r2.equals(r5);	 Catch:{ NullPointerException -> 0x0021 }
            if (r2 == 0) goto L_0x0020;
        L_0x001f:
            r0 = 1;
        L_0x0020:
            return r0;
        L_0x0021:
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.serializers.DefaultSerializers.LocaleSerializer.isSameLocale(java.util.Locale, java.lang.String, java.lang.String, java.lang.String):boolean");
        }
    }

    public static class LongSerializer extends Serializer<Long> {
        public LongSerializer() {
            setImmutable(true);
        }

        public void write(Kryo kryo, Output output, Long l) {
            output.writeLong(l.longValue(), null);
        }

        public Long read(Kryo kryo, Input input, Class<Long> cls) {
            return Long.valueOf(input.readLong(null));
        }
    }

    public static class ShortSerializer extends Serializer<Short> {
        public ShortSerializer() {
            setImmutable(true);
        }

        public void write(Kryo kryo, Output output, Short sh) {
            output.writeShort(sh.shortValue());
        }

        public Short read(Kryo kryo, Input input, Class<Short> cls) {
            return Short.valueOf(input.readShort());
        }
    }

    public static class StringBufferSerializer extends Serializer<StringBuffer> {
        public StringBufferSerializer() {
            setAcceptsNull(true);
        }

        public void write(Kryo kryo, Output output, StringBuffer stringBuffer) {
            output.writeString((CharSequence) stringBuffer);
        }

        public StringBuffer read(Kryo kryo, Input input, Class<StringBuffer> cls) {
            kryo = input.readString();
            if (kryo == null) {
                return null;
            }
            return new StringBuffer(kryo);
        }

        public StringBuffer copy(Kryo kryo, StringBuffer stringBuffer) {
            return new StringBuffer(stringBuffer);
        }
    }

    public static class StringBuilderSerializer extends Serializer<StringBuilder> {
        public StringBuilderSerializer() {
            setAcceptsNull(true);
        }

        public void write(Kryo kryo, Output output, StringBuilder stringBuilder) {
            output.writeString((CharSequence) stringBuilder);
        }

        public StringBuilder read(Kryo kryo, Input input, Class<StringBuilder> cls) {
            return input.readStringBuilder();
        }

        public StringBuilder copy(Kryo kryo, StringBuilder stringBuilder) {
            return new StringBuilder(stringBuilder);
        }
    }

    public static class StringSerializer extends Serializer<String> {
        public StringSerializer() {
            setImmutable(true);
            setAcceptsNull(true);
        }

        public void write(Kryo kryo, Output output, String str) {
            output.writeString(str);
        }

        public String read(Kryo kryo, Input input, Class<String> cls) {
            return input.readString();
        }
    }

    public static class TimeZoneSerializer extends Serializer<TimeZone> {
        public TimeZoneSerializer() {
            setImmutable(true);
        }

        public void write(Kryo kryo, Output output, TimeZone timeZone) {
            output.writeString(timeZone.getID());
        }

        public TimeZone read(Kryo kryo, Input input, Class<TimeZone> cls) {
            return TimeZone.getTimeZone(input.readString());
        }
    }

    public static class URLSerializer extends Serializer<URL> {
        public URLSerializer() {
            setImmutable(true);
        }

        public void write(Kryo kryo, Output output, URL url) {
            output.writeString(url.toExternalForm());
        }

        public URL read(Kryo kryo, Input input, Class<URL> cls) {
            try {
                return new URL(input.readString());
            } catch (Throwable e) {
                throw new KryoException(e);
            }
        }
    }

    public static class VoidSerializer extends Serializer {
        public Object read(Kryo kryo, Input input, Class cls) {
            return null;
        }

        public void write(Kryo kryo, Output output, Object obj) {
        }

        public VoidSerializer() {
            setImmutable(true);
        }
    }

    public static class TreeMapSerializer extends MapSerializer {
        public void write(Kryo kryo, Output output, Map map) {
            kryo.writeClassAndObject(output, ((TreeMap) map).comparator());
            super.write(kryo, output, map);
        }

        protected Map create(Kryo kryo, Input input, Class<Map> cls) {
            return createTreeMap(cls, (Comparator) kryo.readClassAndObject(input));
        }

        protected Map createCopy(Kryo kryo, Map map) {
            return createTreeMap(map.getClass(), ((TreeMap) map).comparator());
        }

        private java.util.TreeMap createTreeMap(java.lang.Class<? extends java.util.Map> r5, java.util.Comparator r6) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r4 = this;
            r0 = java.util.TreeMap.class;
            if (r5 == r0) goto L_0x002d;
        L_0x0004:
            if (r5 == 0) goto L_0x002d;
        L_0x0006:
            r0 = 1;
            r1 = new java.lang.Class[r0];	 Catch:{ Exception -> 0x0026 }
            r2 = java.util.Comparator.class;	 Catch:{ Exception -> 0x0026 }
            r3 = 0;	 Catch:{ Exception -> 0x0026 }
            r1[r3] = r2;	 Catch:{ Exception -> 0x0026 }
            r5 = r5.getConstructor(r1);	 Catch:{ Exception -> 0x0026 }
            r1 = r5.isAccessible();	 Catch:{ Exception -> 0x0026 }
            if (r1 != 0) goto L_0x001b;
        L_0x0018:
            r5.setAccessible(r0);	 Catch:{ SecurityException -> 0x001b }
        L_0x001b:
            r0 = new java.lang.Object[r0];	 Catch:{ Exception -> 0x0026 }
            r0[r3] = r6;	 Catch:{ Exception -> 0x0026 }
            r5 = r5.newInstance(r0);	 Catch:{ Exception -> 0x0026 }
            r5 = (java.util.TreeMap) r5;	 Catch:{ Exception -> 0x0026 }
            return r5;
        L_0x0026:
            r5 = move-exception;
            r6 = new com.esotericsoftware.kryo.KryoException;
            r6.<init>(r5);
            throw r6;
        L_0x002d:
            r5 = new java.util.TreeMap;
            r5.<init>(r6);
            return r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.serializers.DefaultSerializers.TreeMapSerializer.createTreeMap(java.lang.Class, java.util.Comparator):java.util.TreeMap");
        }
    }

    public static class TreeSetSerializer extends CollectionSerializer {
        public void write(Kryo kryo, Output output, Collection collection) {
            kryo.writeClassAndObject(output, ((TreeSet) collection).comparator());
            super.write(kryo, output, collection);
        }

        protected TreeSet create(Kryo kryo, Input input, Class<Collection> cls) {
            return createTreeSet(cls, (Comparator) kryo.readClassAndObject(input));
        }

        protected TreeSet createCopy(Kryo kryo, Collection collection) {
            return createTreeSet(collection.getClass(), ((TreeSet) collection).comparator());
        }

        private java.util.TreeSet createTreeSet(java.lang.Class<? extends java.util.Collection> r5, java.util.Comparator r6) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r4 = this;
            r0 = java.util.TreeSet.class;
            if (r5 == r0) goto L_0x002d;
        L_0x0004:
            if (r5 == 0) goto L_0x002d;
        L_0x0006:
            r0 = 1;
            r1 = new java.lang.Class[r0];	 Catch:{ Exception -> 0x0026 }
            r2 = java.util.Comparator.class;	 Catch:{ Exception -> 0x0026 }
            r3 = 0;	 Catch:{ Exception -> 0x0026 }
            r1[r3] = r2;	 Catch:{ Exception -> 0x0026 }
            r5 = r5.getConstructor(r1);	 Catch:{ Exception -> 0x0026 }
            r1 = r5.isAccessible();	 Catch:{ Exception -> 0x0026 }
            if (r1 != 0) goto L_0x001b;
        L_0x0018:
            r5.setAccessible(r0);	 Catch:{ SecurityException -> 0x001b }
        L_0x001b:
            r0 = new java.lang.Object[r0];	 Catch:{ Exception -> 0x0026 }
            r0[r3] = r6;	 Catch:{ Exception -> 0x0026 }
            r5 = r5.newInstance(r0);	 Catch:{ Exception -> 0x0026 }
            r5 = (java.util.TreeSet) r5;	 Catch:{ Exception -> 0x0026 }
            return r5;
        L_0x0026:
            r5 = move-exception;
            r6 = new com.esotericsoftware.kryo.KryoException;
            r6.<init>(r5);
            throw r6;
        L_0x002d:
            r5 = new java.util.TreeSet;
            r5.<init>(r6);
            return r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.serializers.DefaultSerializers.TreeSetSerializer.createTreeSet(java.lang.Class, java.util.Comparator):java.util.TreeSet");
        }
    }
}
