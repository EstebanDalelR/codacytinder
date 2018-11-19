package de.javakaffee.kryoserializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.tinder.api.ManagerWebServices;
import java.lang.reflect.Field;
import java.util.List;

public class SubListSerializers {
    private static final Object FAKE_REFERENCE = new Object();

    public static class ArrayListSubListSerializer extends Serializer<List<?>> {
        public static final Class<?> SUBLIST_CLASS = SubListSerializers.getClassOrNull("java.util.ArrayList$SubList");
        private Field _parentField;
        private Field _parentOffsetField;
        private Field _sizeField;

        public ArrayListSubListSerializer() {
            try {
                Class cls = Class.forName("java.util.ArrayList$SubList");
                this._parentField = cls.getDeclaredField("parent");
                this._parentOffsetField = cls.getDeclaredField("parentOffset");
                this._sizeField = cls.getDeclaredField(ManagerWebServices.PARAM_SIZE);
                this._parentField.setAccessible(true);
                this._parentOffsetField.setAccessible(true);
                this._sizeField.setAccessible(true);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public static boolean canSerialize(Class<?> cls) {
            return (SUBLIST_CLASS == null || SUBLIST_CLASS.isAssignableFrom(cls) == null) ? null : true;
        }

        public static Kryo addDefaultSerializer(Kryo kryo) {
            if (SUBLIST_CLASS != null) {
                kryo.addDefaultSerializer(SUBLIST_CLASS, new ArrayListSubListSerializer());
            }
            return kryo;
        }

        public List<?> read(Kryo kryo, Input input, Class<List<?>> cls) {
            kryo.reference(SubListSerializers.FAKE_REFERENCE);
            return ((List) kryo.readClassAndObject(input)).subList(input.readInt(true), input.readInt(true));
        }

        public void write(Kryo kryo, Output output, List<?> list) {
            try {
                kryo.writeClassAndObject(output, this._parentField.get(list));
                kryo = this._parentOffsetField.getInt(list);
                output.writeInt(kryo, true);
                output.writeInt(kryo + this._sizeField.getInt(list), true);
            } catch (Kryo kryo2) {
                throw kryo2;
            } catch (Kryo kryo22) {
                throw new RuntimeException(kryo22);
            }
        }

        public List<?> copy(Kryo kryo, List<?> list) {
            kryo.reference(SubListSerializers.FAKE_REFERENCE);
            try {
                List list2 = (List) this._parentField.get(list);
                int i = this._parentOffsetField.getInt(list);
                return ((List) kryo.copy(list2)).subList(i, this._sizeField.getInt(list) + i);
            } catch (Kryo kryo2) {
                throw new RuntimeException(kryo2);
            }
        }
    }

    public static class JavaUtilSubListSerializer extends Serializer<List<?>> {
        public static final Class<?> SUBLIST_CLASS = SubListSerializers.getClassOrNull("java.util.SubList");
        private Field _listField;
        private Field _offsetField;
        private Field _sizeField;

        public JavaUtilSubListSerializer() {
            try {
                Class cls = Class.forName("java.util.SubList");
                this._listField = cls.getDeclaredField("l");
                this._offsetField = cls.getDeclaredField("offset");
                this._sizeField = cls.getDeclaredField(ManagerWebServices.PARAM_SIZE);
                this._listField.setAccessible(true);
                this._offsetField.setAccessible(true);
                this._sizeField.setAccessible(true);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public static boolean canSerialize(Class<?> cls) {
            return (SUBLIST_CLASS == null || SUBLIST_CLASS.isAssignableFrom(cls) == null) ? null : true;
        }

        public static Kryo addDefaultSerializer(Kryo kryo) {
            if (SUBLIST_CLASS != null) {
                kryo.addDefaultSerializer(SUBLIST_CLASS, new JavaUtilSubListSerializer());
            }
            return kryo;
        }

        public List<?> read(Kryo kryo, Input input, Class<List<?>> cls) {
            kryo.reference(SubListSerializers.FAKE_REFERENCE);
            return ((List) kryo.readClassAndObject(input)).subList(input.readInt(true), input.readInt(true));
        }

        public void write(Kryo kryo, Output output, List<?> list) {
            try {
                kryo.writeClassAndObject(output, this._listField.get(list));
                kryo = this._offsetField.getInt(list);
                output.writeInt(kryo, true);
                output.writeInt(kryo + this._sizeField.getInt(list), true);
            } catch (Kryo kryo2) {
                throw kryo2;
            } catch (Kryo kryo22) {
                throw new RuntimeException(kryo22);
            }
        }

        public List<?> copy(Kryo kryo, List<?> list) {
            kryo.reference(SubListSerializers.FAKE_REFERENCE);
            try {
                List list2 = (List) this._listField.get(list);
                int i = this._offsetField.getInt(list);
                return ((List) kryo.copy(list2)).subList(i, this._sizeField.getInt(list) + i);
            } catch (Kryo kryo2) {
                throw new RuntimeException(kryo2);
            }
        }
    }

    static Class<?> getClass(String str) {
        try {
            return Class.forName(str);
        } catch (String str2) {
            throw new RuntimeException(str2);
        }
    }

    static java.lang.Class<?> getClassOrNull(java.lang.String r0) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = java.lang.Class.forName(r0);	 Catch:{ Exception -> 0x0005 }
        return r0;
    L_0x0005:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: de.javakaffee.kryoserializers.SubListSerializers.getClassOrNull(java.lang.String):java.lang.Class<?>");
    }

    public static Serializer<List<?>> createFor(Class cls) {
        if (ArrayListSubListSerializer.canSerialize(cls)) {
            return new ArrayListSubListSerializer();
        }
        return JavaUtilSubListSerializer.canSerialize(cls) != null ? new JavaUtilSubListSerializer() : null;
    }

    public static Kryo addDefaultSerializers(Kryo kryo) {
        ArrayListSubListSerializer.addDefaultSerializer(kryo);
        JavaUtilSubListSerializer.addDefaultSerializer(kryo);
        return kryo;
    }
}
