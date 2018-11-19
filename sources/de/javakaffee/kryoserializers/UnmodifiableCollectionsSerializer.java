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

public class UnmodifiableCollectionsSerializer extends Serializer<Object> {
    private static final Field SOURCE_COLLECTION_FIELD;
    private static final Field SOURCE_MAP_FIELD;

    private enum UnmodifiableCollection {
        COLLECTION(Collections.unmodifiableCollection(Arrays.asList(new String[]{""})).getClass(), UnmodifiableCollectionsSerializer.SOURCE_COLLECTION_FIELD) {
            public Object create(Object obj) {
                return Collections.unmodifiableCollection((Collection) obj);
            }
        },
        RANDOM_ACCESS_LIST(Collections.unmodifiableList(new ArrayList()).getClass(), UnmodifiableCollectionsSerializer.SOURCE_COLLECTION_FIELD) {
            public Object create(Object obj) {
                return Collections.unmodifiableList((List) obj);
            }
        },
        LIST(Collections.unmodifiableList(new LinkedList()).getClass(), UnmodifiableCollectionsSerializer.SOURCE_COLLECTION_FIELD) {
            public Object create(Object obj) {
                return Collections.unmodifiableList((List) obj);
            }
        },
        SET(Collections.unmodifiableSet(new HashSet()).getClass(), UnmodifiableCollectionsSerializer.SOURCE_COLLECTION_FIELD) {
            public Object create(Object obj) {
                return Collections.unmodifiableSet((Set) obj);
            }
        },
        SORTED_SET(Collections.unmodifiableSortedSet(new TreeSet()).getClass(), UnmodifiableCollectionsSerializer.SOURCE_COLLECTION_FIELD) {
            public Object create(Object obj) {
                return Collections.unmodifiableSortedSet((SortedSet) obj);
            }
        },
        MAP(Collections.unmodifiableMap(new HashMap()).getClass(), UnmodifiableCollectionsSerializer.SOURCE_MAP_FIELD) {
            public Object create(Object obj) {
                return Collections.unmodifiableMap((Map) obj);
            }
        },
        SORTED_MAP(Collections.unmodifiableSortedMap(new TreeMap()).getClass(), UnmodifiableCollectionsSerializer.SOURCE_MAP_FIELD) {
            public Object create(Object obj) {
                return Collections.unmodifiableSortedMap((SortedMap) obj);
            }
        };
        
        private final Field sourceCollectionField;
        private final Class<?> type;

        public abstract Object create(Object obj);

        private UnmodifiableCollection(Class<?> cls, Field field) {
            this.type = cls;
            this.sourceCollectionField = field;
        }

        static UnmodifiableCollection valueOfType(Class<?> cls) {
            for (UnmodifiableCollection unmodifiableCollection : values()) {
                if (unmodifiableCollection.type.equals(cls)) {
                    return unmodifiableCollection;
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
            SOURCE_COLLECTION_FIELD = Class.forName("java.util.Collections$UnmodifiableCollection").getDeclaredField("c");
            SOURCE_COLLECTION_FIELD.setAccessible(true);
            SOURCE_MAP_FIELD = Class.forName("java.util.Collections$UnmodifiableMap").getDeclaredField(C1948m.f5228a);
            SOURCE_MAP_FIELD.setAccessible(true);
        } catch (Throwable e) {
            throw new RuntimeException("Could not access source collection field in java.util.Collections$UnmodifiableCollection.", e);
        }
    }

    public Object read(Kryo kryo, Input input, Class<Object> cls) {
        return UnmodifiableCollection.values()[input.readInt(true)].create(kryo.readClassAndObject(input));
    }

    public void write(Kryo kryo, Output output, Object obj) {
        try {
            UnmodifiableCollection valueOfType = UnmodifiableCollection.valueOfType(obj.getClass());
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
            UnmodifiableCollection valueOfType = UnmodifiableCollection.valueOfType(obj.getClass());
            return valueOfType.create(kryo.copy(valueOfType.sourceCollectionField.get(obj)));
        } catch (Kryo kryo2) {
            throw kryo2;
        } catch (Kryo kryo22) {
            throw new RuntimeException(kryo22);
        }
    }

    public static void registerSerializers(Kryo kryo) {
        Serializer unmodifiableCollectionsSerializer = new UnmodifiableCollectionsSerializer();
        UnmodifiableCollection.values();
        for (UnmodifiableCollection access$400 : UnmodifiableCollection.values()) {
            kryo.register(access$400.type, unmodifiableCollectionsSerializer);
        }
    }
}
