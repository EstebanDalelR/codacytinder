package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tinder.api.ManagerWebServices;
import io.fabric.sdk.android.services.events.C15645a;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public final class TypeAdapters {
    public static final TypeAdapter<AtomicBoolean> ATOMIC_BOOLEAN = new C69429().nullSafe();
    public static final TypeAdapterFactory ATOMIC_BOOLEAN_FACTORY = newFactory(AtomicBoolean.class, ATOMIC_BOOLEAN);
    public static final TypeAdapter<AtomicInteger> ATOMIC_INTEGER = new C69418().nullSafe();
    public static final TypeAdapter<AtomicIntegerArray> ATOMIC_INTEGER_ARRAY = new TypeAdapter<AtomicIntegerArray>() {
        public AtomicIntegerArray read(JsonReader jsonReader) throws IOException {
            List arrayList = new ArrayList();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                try {
                    arrayList.add(Integer.valueOf(jsonReader.nextInt()));
                } catch (Throwable e) {
                    throw new JsonSyntaxException(e);
                }
            }
            jsonReader.endArray();
            jsonReader = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(jsonReader);
            for (int i = 0; i < jsonReader; i++) {
                atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
            }
            return atomicIntegerArray;
        }

        public void write(JsonWriter jsonWriter, AtomicIntegerArray atomicIntegerArray) throws IOException {
            jsonWriter.beginArray();
            int length = atomicIntegerArray.length();
            for (int i = 0; i < length; i++) {
                jsonWriter.value((long) atomicIntegerArray.get(i));
            }
            jsonWriter.endArray();
        }
    }.nullSafe();
    public static final TypeAdapterFactory ATOMIC_INTEGER_ARRAY_FACTORY = newFactory(AtomicIntegerArray.class, ATOMIC_INTEGER_ARRAY);
    public static final TypeAdapterFactory ATOMIC_INTEGER_FACTORY = newFactory(AtomicInteger.class, ATOMIC_INTEGER);
    public static final TypeAdapter<BigDecimal> BIG_DECIMAL = new TypeAdapter<BigDecimal>() {
        public BigDecimal read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return new BigDecimal(jsonReader.nextString());
            } catch (Throwable e) {
                throw new JsonSyntaxException(e);
            }
        }

        public void write(JsonWriter jsonWriter, BigDecimal bigDecimal) throws IOException {
            jsonWriter.value((Number) bigDecimal);
        }
    };
    public static final TypeAdapter<BigInteger> BIG_INTEGER = new TypeAdapter<BigInteger>() {
        public BigInteger read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return new BigInteger(jsonReader.nextString());
            } catch (Throwable e) {
                throw new JsonSyntaxException(e);
            }
        }

        public void write(JsonWriter jsonWriter, BigInteger bigInteger) throws IOException {
            jsonWriter.value((Number) bigInteger);
        }
    };
    public static final TypeAdapter<BitSet> BIT_SET = new C69342().nullSafe();
    public static final TypeAdapterFactory BIT_SET_FACTORY = newFactory(BitSet.class, BIT_SET);
    public static final TypeAdapter<Boolean> BOOLEAN = new C69363();
    public static final TypeAdapter<Boolean> BOOLEAN_AS_STRING = new C69374();
    public static final TypeAdapterFactory BOOLEAN_FACTORY = newFactory(Boolean.TYPE, Boolean.class, BOOLEAN);
    public static final TypeAdapter<Number> BYTE = new C69385();
    public static final TypeAdapterFactory BYTE_FACTORY = newFactory(Byte.TYPE, Byte.class, BYTE);
    public static final TypeAdapter<Calendar> CALENDAR = new TypeAdapter<Calendar>() {
        private static final String DAY_OF_MONTH = "dayOfMonth";
        private static final String HOUR_OF_DAY = "hourOfDay";
        private static final String MINUTE = "minute";
        private static final String MONTH = "month";
        private static final String SECOND = "second";
        private static final String YEAR = "year";

        public Calendar read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (jsonReader.peek() != JsonToken.END_OBJECT) {
                String nextName = jsonReader.nextName();
                int nextInt = jsonReader.nextInt();
                if (YEAR.equals(nextName)) {
                    i = nextInt;
                } else if (MONTH.equals(nextName)) {
                    i2 = nextInt;
                } else if (DAY_OF_MONTH.equals(nextName)) {
                    i3 = nextInt;
                } else if (HOUR_OF_DAY.equals(nextName)) {
                    i4 = nextInt;
                } else if (MINUTE.equals(nextName)) {
                    i5 = nextInt;
                } else if (SECOND.equals(nextName)) {
                    i6 = nextInt;
                }
            }
            jsonReader.endObject();
            return new GregorianCalendar(i, i2, i3, i4, i5, i6);
        }

        public void write(JsonWriter jsonWriter, Calendar calendar) throws IOException {
            if (calendar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name(YEAR);
            jsonWriter.value((long) calendar.get(1));
            jsonWriter.name(MONTH);
            jsonWriter.value((long) calendar.get(2));
            jsonWriter.name(DAY_OF_MONTH);
            jsonWriter.value((long) calendar.get(5));
            jsonWriter.name(HOUR_OF_DAY);
            jsonWriter.value((long) calendar.get(11));
            jsonWriter.name(MINUTE);
            jsonWriter.value((long) calendar.get(12));
            jsonWriter.name(SECOND);
            jsonWriter.value((long) calendar.get(13));
            jsonWriter.endObject();
        }
    };
    public static final TypeAdapterFactory CALENDAR_FACTORY = newFactoryForMultipleTypes(Calendar.class, GregorianCalendar.class, CALENDAR);
    public static final TypeAdapter<Character> CHARACTER = new TypeAdapter<Character>() {
        public Character read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader = jsonReader.nextString();
            if (jsonReader.length() == 1) {
                return Character.valueOf(jsonReader.charAt(0));
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expecting character, got: ");
            stringBuilder.append(jsonReader);
            throw new JsonSyntaxException(stringBuilder.toString());
        }

        public void write(JsonWriter jsonWriter, Character ch) throws IOException {
            jsonWriter.value(ch == null ? null : String.valueOf(ch));
        }
    };
    public static final TypeAdapterFactory CHARACTER_FACTORY = newFactory(Character.TYPE, Character.class, CHARACTER);
    public static final TypeAdapter<Class> CLASS = new C69321().nullSafe();
    public static final TypeAdapterFactory CLASS_FACTORY = newFactory(Class.class, CLASS);
    public static final TypeAdapter<Currency> CURRENCY = new TypeAdapter<Currency>() {
        public Currency read(JsonReader jsonReader) throws IOException {
            return Currency.getInstance(jsonReader.nextString());
        }

        public void write(JsonWriter jsonWriter, Currency currency) throws IOException {
            jsonWriter.value(currency.getCurrencyCode());
        }
    }.nullSafe();
    public static final TypeAdapterFactory CURRENCY_FACTORY = newFactory(Currency.class, CURRENCY);
    public static final TypeAdapter<Number> DOUBLE = new TypeAdapter<Number>() {
        public Number read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Double.valueOf(jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    };
    public static final TypeAdapterFactory ENUM_FACTORY = new TypeAdapterFactory() {
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            gson = typeToken.getRawType();
            if (Enum.class.isAssignableFrom(gson) != null) {
                if (gson != Enum.class) {
                    if (gson.isEnum() == null) {
                        gson = gson.getSuperclass();
                    }
                    return new EnumTypeAdapter(gson);
                }
            }
            return null;
        }
    };
    public static final TypeAdapter<Number> FLOAT = new TypeAdapter<Number>() {
        public Number read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Float.valueOf((float) jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    };
    public static final TypeAdapter<InetAddress> INET_ADDRESS = new TypeAdapter<InetAddress>() {
        public InetAddress read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return InetAddress.getByName(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        public void write(JsonWriter jsonWriter, InetAddress inetAddress) throws IOException {
            jsonWriter.value(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    };
    public static final TypeAdapterFactory INET_ADDRESS_FACTORY = newTypeHierarchyFactory(InetAddress.class, INET_ADDRESS);
    public static final TypeAdapter<Number> INTEGER = new C69407();
    public static final TypeAdapterFactory INTEGER_FACTORY = newFactory(Integer.TYPE, Integer.class, INTEGER);
    public static final TypeAdapter<JsonElement> JSON_ELEMENT = new TypeAdapter<JsonElement>() {
        public JsonElement read(JsonReader jsonReader) throws IOException {
            JsonElement jsonArray;
            switch (jsonReader.peek()) {
                case NUMBER:
                    return new JsonPrimitive(new LazilyParsedNumber(jsonReader.nextString()));
                case BOOLEAN:
                    return new JsonPrimitive(Boolean.valueOf(jsonReader.nextBoolean()));
                case STRING:
                    return new JsonPrimitive(jsonReader.nextString());
                case NULL:
                    jsonReader.nextNull();
                    return JsonNull.INSTANCE;
                case BEGIN_ARRAY:
                    jsonArray = new JsonArray();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonArray.add(read(jsonReader));
                    }
                    jsonReader.endArray();
                    return jsonArray;
                case BEGIN_OBJECT:
                    jsonArray = new JsonObject();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        jsonArray.add(jsonReader.nextName(), read(jsonReader));
                    }
                    jsonReader.endObject();
                    return jsonArray;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public void write(JsonWriter jsonWriter, JsonElement jsonElement) throws IOException {
            if (jsonElement != null) {
                if (!jsonElement.isJsonNull()) {
                    if (jsonElement.isJsonPrimitive()) {
                        jsonElement = jsonElement.getAsJsonPrimitive();
                        if (jsonElement.isNumber()) {
                            jsonWriter.value(jsonElement.getAsNumber());
                            return;
                        } else if (jsonElement.isBoolean()) {
                            jsonWriter.value(jsonElement.getAsBoolean());
                            return;
                        } else {
                            jsonWriter.value(jsonElement.getAsString());
                            return;
                        }
                    } else if (jsonElement.isJsonArray()) {
                        jsonWriter.beginArray();
                        jsonElement = jsonElement.getAsJsonArray().iterator();
                        while (jsonElement.hasNext()) {
                            write(jsonWriter, (JsonElement) jsonElement.next());
                        }
                        jsonWriter.endArray();
                        return;
                    } else if (jsonElement.isJsonObject()) {
                        jsonWriter.beginObject();
                        for (Entry entry : jsonElement.getAsJsonObject().entrySet()) {
                            jsonWriter.name((String) entry.getKey());
                            write(jsonWriter, (JsonElement) entry.getValue());
                        }
                        jsonWriter.endObject();
                        return;
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Couldn't write ");
                        stringBuilder.append(jsonElement.getClass());
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
            }
            jsonWriter.nullValue();
        }
    };
    public static final TypeAdapterFactory JSON_ELEMENT_FACTORY = newTypeHierarchyFactory(JsonElement.class, JSON_ELEMENT);
    public static final TypeAdapter<Locale> LOCALE = new TypeAdapter<Locale>() {
        public Locale read(JsonReader jsonReader) throws IOException {
            String str = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(jsonReader.nextString(), C15645a.ROLL_OVER_FILE_NAME_SEPARATOR);
            jsonReader = stringTokenizer.hasMoreElements() != null ? stringTokenizer.nextToken() : null;
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            }
            if (nextToken == null && str == null) {
                return new Locale(jsonReader);
            }
            if (str == null) {
                return new Locale(jsonReader, nextToken);
            }
            return new Locale(jsonReader, nextToken, str);
        }

        public void write(JsonWriter jsonWriter, Locale locale) throws IOException {
            jsonWriter.value(locale == null ? null : locale.toString());
        }
    };
    public static final TypeAdapterFactory LOCALE_FACTORY = newFactory(Locale.class, LOCALE);
    public static final TypeAdapter<Number> LONG = new TypeAdapter<Number>() {
        public Number read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Long.valueOf(jsonReader.nextLong());
            } catch (Throwable e) {
                throw new JsonSyntaxException(e);
            }
        }

        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    };
    public static final TypeAdapter<Number> NUMBER = new TypeAdapter<Number>() {
        public Number read(JsonReader jsonReader) throws IOException {
            JsonToken peek = jsonReader.peek();
            int i = AnonymousClass36.$SwitchMap$com$google$gson$stream$JsonToken[peek.ordinal()];
            if (i != 1) {
                switch (i) {
                    case 3:
                        break;
                    case 4:
                        jsonReader.nextNull();
                        return null;
                    default:
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Expecting number, got: ");
                        stringBuilder.append(peek);
                        throw new JsonSyntaxException(stringBuilder.toString());
                }
            }
            return new LazilyParsedNumber(jsonReader.nextString());
        }

        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    };
    public static final TypeAdapterFactory NUMBER_FACTORY = newFactory(Number.class, NUMBER);
    public static final TypeAdapter<Number> SHORT = new C69396();
    public static final TypeAdapterFactory SHORT_FACTORY = newFactory(Short.TYPE, Short.class, SHORT);
    public static final TypeAdapter<String> STRING = new TypeAdapter<String>() {
        public String read(JsonReader jsonReader) throws IOException {
            JsonToken peek = jsonReader.peek();
            if (peek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            } else if (peek == JsonToken.BOOLEAN) {
                return Boolean.toString(jsonReader.nextBoolean());
            } else {
                return jsonReader.nextString();
            }
        }

        public void write(JsonWriter jsonWriter, String str) throws IOException {
            jsonWriter.value(str);
        }
    };
    public static final TypeAdapter<StringBuffer> STRING_BUFFER = new TypeAdapter<StringBuffer>() {
        public StringBuffer read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return new StringBuffer(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        public void write(JsonWriter jsonWriter, StringBuffer stringBuffer) throws IOException {
            jsonWriter.value(stringBuffer == null ? null : stringBuffer.toString());
        }
    };
    public static final TypeAdapterFactory STRING_BUFFER_FACTORY = newFactory(StringBuffer.class, STRING_BUFFER);
    public static final TypeAdapter<StringBuilder> STRING_BUILDER = new TypeAdapter<StringBuilder>() {
        public StringBuilder read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return new StringBuilder(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        public void write(JsonWriter jsonWriter, StringBuilder stringBuilder) throws IOException {
            jsonWriter.value(stringBuilder == null ? null : stringBuilder.toString());
        }
    };
    public static final TypeAdapterFactory STRING_BUILDER_FACTORY = newFactory(StringBuilder.class, STRING_BUILDER);
    public static final TypeAdapterFactory STRING_FACTORY = newFactory(String.class, STRING);
    public static final TypeAdapterFactory TIMESTAMP_FACTORY = new TypeAdapterFactory() {
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() != Timestamp.class) {
                return null;
            }
            gson = gson.getAdapter(Date.class);
            return new TypeAdapter<Timestamp>() {
                public Timestamp read(JsonReader jsonReader) throws IOException {
                    Date date = (Date) gson.read(jsonReader);
                    return date != null ? new Timestamp(date.getTime()) : null;
                }

                public void write(JsonWriter jsonWriter, Timestamp timestamp) throws IOException {
                    gson.write(jsonWriter, timestamp);
                }
            };
        }
    };
    public static final TypeAdapter<URI> URI = new TypeAdapter<URI>() {
        public URI read(JsonReader jsonReader) throws IOException {
            URI uri = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                jsonReader = jsonReader.nextString();
                if (!ManagerWebServices.NULL_STRING_VALUE.equals(jsonReader)) {
                    uri = new URI(jsonReader);
                }
                return uri;
            } catch (Throwable e) {
                throw new JsonIOException(e);
            }
        }

        public void write(JsonWriter jsonWriter, URI uri) throws IOException {
            jsonWriter.value(uri == null ? null : uri.toASCIIString());
        }
    };
    public static final TypeAdapterFactory URI_FACTORY = newFactory(URI.class, URI);
    public static final TypeAdapter<URL> URL = new TypeAdapter<URL>() {
        public URL read(JsonReader jsonReader) throws IOException {
            URL url = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader = jsonReader.nextString();
            if (!ManagerWebServices.NULL_STRING_VALUE.equals(jsonReader)) {
                url = new URL(jsonReader);
            }
            return url;
        }

        public void write(JsonWriter jsonWriter, URL url) throws IOException {
            jsonWriter.value(url == null ? null : url.toExternalForm());
        }
    };
    public static final TypeAdapterFactory URL_FACTORY = newFactory(URL.class, URL);
    public static final TypeAdapter<UUID> UUID = new TypeAdapter<UUID>() {
        public UUID read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return UUID.fromString(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        public void write(JsonWriter jsonWriter, UUID uuid) throws IOException {
            jsonWriter.value(uuid == null ? null : uuid.toString());
        }
    };
    public static final TypeAdapterFactory UUID_FACTORY = newFactory(UUID.class, UUID);

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$1 */
    static class C69321 extends TypeAdapter<Class> {
        C69321() {
        }

        public void write(JsonWriter jsonWriter, Class cls) throws IOException {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Attempted to serialize java.lang.Class: ");
            stringBuilder.append(cls.getName());
            stringBuilder.append(". Forgot to register a type adapter?");
            throw new UnsupportedOperationException(stringBuilder.toString());
        }

        public Class read(JsonReader jsonReader) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$2 */
    static class C69342 extends TypeAdapter<BitSet> {
        C69342() {
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.BitSet read(com.google.gson.stream.JsonReader r7) throws java.io.IOException {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r6 = this;
            r0 = new java.util.BitSet;
            r0.<init>();
            r7.beginArray();
            r1 = r7.peek();
            r2 = 0;
            r3 = 0;
        L_0x000e:
            r4 = com.google.gson.stream.JsonToken.END_ARRAY;
            if (r1 == r4) goto L_0x0070;
        L_0x0012:
            r4 = com.google.gson.internal.bind.TypeAdapters.AnonymousClass36.$SwitchMap$com$google$gson$stream$JsonToken;
            r5 = r1.ordinal();
            r4 = r4[r5];
            r5 = 1;
            switch(r4) {
                case 1: goto L_0x005e;
                case 2: goto L_0x0059;
                case 3: goto L_0x0035;
                default: goto L_0x001e;
            };
        L_0x001e:
            r7 = new com.google.gson.JsonSyntaxException;
            r0 = new java.lang.StringBuilder;
            r0.<init>();
            r2 = "Invalid bitset value type: ";
            r0.append(r2);
            r0.append(r1);
            r0 = r0.toString();
            r7.<init>(r0);
            throw r7;
        L_0x0035:
            r1 = r7.nextString();
            r4 = java.lang.Integer.parseInt(r1);	 Catch:{ NumberFormatException -> 0x0042 }
            if (r4 == 0) goto L_0x0040;
        L_0x003f:
            goto L_0x0064;
        L_0x0040:
            r5 = 0;
            goto L_0x0064;
        L_0x0042:
            r7 = new com.google.gson.JsonSyntaxException;
            r0 = new java.lang.StringBuilder;
            r0.<init>();
            r2 = "Error: Expecting: bitset number value (1, 0), Found: ";
            r0.append(r2);
            r0.append(r1);
            r0 = r0.toString();
            r7.<init>(r0);
            throw r7;
        L_0x0059:
            r5 = r7.nextBoolean();
            goto L_0x0064;
        L_0x005e:
            r1 = r7.nextInt();
            if (r1 == 0) goto L_0x0040;
        L_0x0064:
            if (r5 == 0) goto L_0x0069;
        L_0x0066:
            r0.set(r3);
        L_0x0069:
            r3 = r3 + 1;
            r1 = r7.peek();
            goto L_0x000e;
        L_0x0070:
            r7.endArray();
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.2.read(com.google.gson.stream.JsonReader):java.util.BitSet");
        }

        public void write(JsonWriter jsonWriter, BitSet bitSet) throws IOException {
            jsonWriter.beginArray();
            int length = bitSet.length();
            for (int i = 0; i < length; i++) {
                jsonWriter.value((long) bitSet.get(i));
            }
            jsonWriter.endArray();
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$3 */
    static class C69363 extends TypeAdapter<Boolean> {
        C69363() {
        }

        public Boolean read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            } else if (jsonReader.peek() == JsonToken.STRING) {
                return Boolean.valueOf(Boolean.parseBoolean(jsonReader.nextString()));
            } else {
                return Boolean.valueOf(jsonReader.nextBoolean());
            }
        }

        public void write(JsonWriter jsonWriter, Boolean bool) throws IOException {
            jsonWriter.value(bool);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$4 */
    static class C69374 extends TypeAdapter<Boolean> {
        C69374() {
        }

        public Boolean read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Boolean.valueOf(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        public void write(JsonWriter jsonWriter, Boolean bool) throws IOException {
            jsonWriter.value(bool == null ? ManagerWebServices.NULL_STRING_VALUE : bool.toString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$5 */
    static class C69385 extends TypeAdapter<Number> {
        C69385() {
        }

        public Number read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Byte.valueOf((byte) jsonReader.nextInt());
            } catch (Throwable e) {
                throw new JsonSyntaxException(e);
            }
        }

        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$6 */
    static class C69396 extends TypeAdapter<Number> {
        C69396() {
        }

        public Number read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Short.valueOf((short) jsonReader.nextInt());
            } catch (Throwable e) {
                throw new JsonSyntaxException(e);
            }
        }

        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$7 */
    static class C69407 extends TypeAdapter<Number> {
        C69407() {
        }

        public Number read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Integer.valueOf(jsonReader.nextInt());
            } catch (Throwable e) {
                throw new JsonSyntaxException(e);
            }
        }

        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$8 */
    static class C69418 extends TypeAdapter<AtomicInteger> {
        C69418() {
        }

        public AtomicInteger read(JsonReader jsonReader) throws IOException {
            try {
                return new AtomicInteger(jsonReader.nextInt());
            } catch (Throwable e) {
                throw new JsonSyntaxException(e);
            }
        }

        public void write(JsonWriter jsonWriter, AtomicInteger atomicInteger) throws IOException {
            jsonWriter.value((long) atomicInteger.get());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$9 */
    static class C69429 extends TypeAdapter<AtomicBoolean> {
        C69429() {
        }

        public AtomicBoolean read(JsonReader jsonReader) throws IOException {
            return new AtomicBoolean(jsonReader.nextBoolean());
        }

        public void write(JsonWriter jsonWriter, AtomicBoolean atomicBoolean) throws IOException {
            jsonWriter.value(atomicBoolean.get());
        }
    }

    private static final class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T> {
        private final Map<T, String> constantToName = new HashMap();
        private final Map<String, T> nameToConstant = new HashMap();

        public EnumTypeAdapter(Class<T> cls) {
            try {
                for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                    Object name = enumR.name();
                    SerializedName serializedName = (SerializedName) cls.getField(name).getAnnotation(SerializedName.class);
                    if (serializedName != null) {
                        name = serializedName.value();
                        for (Object put : serializedName.alternate()) {
                            this.nameToConstant.put(put, enumR);
                        }
                    }
                    this.nameToConstant.put(name, enumR);
                    this.constantToName.put(enumR, name);
                }
            } catch (Class<T> cls2) {
                throw new AssertionError(cls2);
            }
        }

        public T read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return (Enum) this.nameToConstant.get(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        public void write(JsonWriter jsonWriter, T t) throws IOException {
            jsonWriter.value(t == null ? null : (String) this.constantToName.get(t));
        }
    }

    private TypeAdapters() {
        throw new UnsupportedOperationException();
    }

    public static <TT> TypeAdapterFactory newFactory(final TypeToken<TT> typeToken, final TypeAdapter<TT> typeAdapter) {
        return new TypeAdapterFactory() {
            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                return typeToken.equals(typeToken) != null ? typeAdapter : null;
            }
        };
    }

    public static <TT> TypeAdapterFactory newFactory(final Class<TT> cls, final TypeAdapter<TT> typeAdapter) {
        return new TypeAdapterFactory() {
            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                return typeToken.getRawType() == cls ? typeAdapter : null;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Factory[type=");
                stringBuilder.append(cls.getName());
                stringBuilder.append(",adapter=");
                stringBuilder.append(typeAdapter);
                stringBuilder.append("]");
                return stringBuilder.toString();
            }
        };
    }

    public static <TT> TypeAdapterFactory newFactory(final Class<TT> cls, final Class<TT> cls2, final TypeAdapter<? super TT> typeAdapter) {
        return new TypeAdapterFactory() {
            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                gson = typeToken.getRawType();
                if (gson != cls) {
                    if (gson != cls2) {
                        return null;
                    }
                }
                return typeAdapter;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Factory[type=");
                stringBuilder.append(cls2.getName());
                stringBuilder.append("+");
                stringBuilder.append(cls.getName());
                stringBuilder.append(",adapter=");
                stringBuilder.append(typeAdapter);
                stringBuilder.append("]");
                return stringBuilder.toString();
            }
        };
    }

    public static <TT> TypeAdapterFactory newFactoryForMultipleTypes(final Class<TT> cls, final Class<? extends TT> cls2, final TypeAdapter<? super TT> typeAdapter) {
        return new TypeAdapterFactory() {
            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                gson = typeToken.getRawType();
                if (gson != cls) {
                    if (gson != cls2) {
                        return null;
                    }
                }
                return typeAdapter;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Factory[type=");
                stringBuilder.append(cls.getName());
                stringBuilder.append("+");
                stringBuilder.append(cls2.getName());
                stringBuilder.append(",adapter=");
                stringBuilder.append(typeAdapter);
                stringBuilder.append("]");
                return stringBuilder.toString();
            }
        };
    }

    public static <T1> TypeAdapterFactory newTypeHierarchyFactory(final Class<T1> cls, final TypeAdapter<T1> typeAdapter) {
        return new TypeAdapterFactory() {
            public <T2> TypeAdapter<T2> create(Gson gson, TypeToken<T2> typeToken) {
                gson = typeToken.getRawType();
                if (cls.isAssignableFrom(gson) == null) {
                    return null;
                }
                return new TypeAdapter<T1>() {
                    public void write(JsonWriter jsonWriter, T1 t1) throws IOException {
                        typeAdapter.write(jsonWriter, t1);
                    }

                    public T1 read(JsonReader jsonReader) throws IOException {
                        jsonReader = typeAdapter.read(jsonReader);
                        if (jsonReader == null || gson.isInstance(jsonReader)) {
                            return jsonReader;
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Expected a ");
                        stringBuilder.append(gson.getName());
                        stringBuilder.append(" but was ");
                        stringBuilder.append(jsonReader.getClass().getName());
                        throw new JsonSyntaxException(stringBuilder.toString());
                    }
                };
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Factory[typeHierarchy=");
                stringBuilder.append(cls.getName());
                stringBuilder.append(",adapter=");
                stringBuilder.append(typeAdapter);
                stringBuilder.append("]");
                return stringBuilder.toString();
            }
        };
    }
}
