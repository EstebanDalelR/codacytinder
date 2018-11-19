package de.javakaffee.kryoserializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.foursquare.internal.util.C1948m;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class SynchronizedCollectionsSerializer extends Serializer<Object> {
    private static final Field SOURCE_COLLECTION_FIELD;
    private static final Field SOURCE_MAP_FIELD;

    private enum SynchronizedCollection {
        COLLECTION(Collections.synchronizedCollection(Arrays.asList(new String[]{""})).getClass(), SynchronizedCollectionsSerializer.SOURCE_COLLECTION_FIELD) {
            public Object create(Object obj) {
                return Collections.synchronizedCollection((Collection) obj);
            }
        },
        RANDOM_ACCESS_LIST(Collections.synchronizedList(new ArrayList()).getClass(), SynchronizedCollectionsSerializer.SOURCE_COLLECTION_FIELD) {
            public Object create(Object obj) {
                return Collections.synchronizedList((List) obj);
            }
        },
        LIST(Collections.synchronizedList(new LinkedList()).getClass(), SynchronizedCollectionsSerializer.SOURCE_COLLECTION_FIELD) {
            public Object create(Object obj) {
                return Collections.synchronizedList((List) obj);
            }
        },
        SET(Collections.synchronizedSet(new HashSet()).getClass(), SynchronizedCollectionsSerializer.SOURCE_COLLECTION_FIELD) {
            public Object create(Object obj) {
                return Collections.synchronizedSet((Set) obj);
            }
        },
        SORTED_SET(Collections.synchronizedSortedSet(new TreeSet()).getClass(), SynchronizedCollectionsSerializer.SOURCE_COLLECTION_FIELD) {
            public Object create(Object obj) {
                return Collections.synchronizedSortedSet((SortedSet) obj);
            }
        },
        MAP(Collections.synchronizedMap(new HashMap()).getClass(), SynchronizedCollectionsSerializer.SOURCE_MAP_FIELD) {
            public Object create(Object obj) {
                return Collections.synchronizedMap((Map) obj);
            }
        },
        SORTED_MAP(Collections.synchronizedSortedMap(new TreeMap()).getClass(), SynchronizedCollectionsSerializer.SOURCE_MAP_FIELD) {
            public Object create(Object obj) {
                return Collections.synchronizedSortedMap((SortedMap) obj);
            }
        };
        
        private final Field sourceCollectionField;
        private final Class<?> type;

        public abstract Object create(Object obj);

        private SynchronizedCollection(Class<?> cls, Field field) {
            this.type = cls;
            this.sourceCollectionField = field;
        }

        static SynchronizedCollection valueOfType(Class<?> cls) {
            for (SynchronizedCollection synchronizedCollection : values()) {
                if (synchronizedCollection.type.equals(cls)) {
                    return synchronizedCollection;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("The type ");
            stringBuilder.append(cls);
            stringBuilder.append(" is not supported.");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    static {
        try {
            SOURCE_COLLECTION_FIELD = Class.forName("java.util.Collections$SynchronizedCollection").getDeclaredField("c");
            SOURCE_COLLECTION_FIELD.setAccessible(true);
            SOURCE_MAP_FIELD = Class.forName("java.util.Collections$SynchronizedMap").getDeclaredField(C1948m.f5228a);
            SOURCE_MAP_FIELD.setAccessible(true);
        } catch (Throwable e) {
            throw new RuntimeException("Could not access source collection field in java.util.Collections$SynchronizedCollection.", e);
        }
    }

    public Object read(Kryo kryo, Input input, Class<Object> cls) {
        return SynchronizedCollection.values()[input.readInt(true)].create(kryo.readClassAndObject(input));
    }

    public void write(Kryo kryo, Output output, Object obj) {
        try {
            SynchronizedCollection valueOfType = SynchronizedCollection.valueOfType(obj.getClass());
            output.writeInt(valueOfType.ordinal(), true);
            kryo.writeClassAndObject(output, valueOfType.sourceCollectionField.get(obj));
        } catch (Kryo kryo2) {
            throw kryo2;
        } catch (Kryo kryo22) {
            throw new RuntimeException(kryo22);
        }
    }

    public Object copy(Kryo kryo, Object obj) {
        try {
            SynchronizedCollection valueOfType = SynchronizedCollection.valueOfType(obj.getClass());
            return valueOfType.create(kryo.copy(valueOfType.sourceCollectionField.get(obj)));
        } catch (Kryo kryo2) {
            throw kryo2;
        } catch (Kryo kryo22) {
            throw new RuntimeException(kryo22);
        }
    }

    public static void registerSerializers(Kryo kryo) {
        Serializer synchronizedCollectionsSerializer = new SynchronizedCollectionsSerializer();
        SynchronizedCollection.values();
        for (SynchronizedCollection access$400 : SynchronizedCollection.values()) {
            kryo.register(access$400.type, synchronizedCollectionsSerializer);
        }
    }
}
