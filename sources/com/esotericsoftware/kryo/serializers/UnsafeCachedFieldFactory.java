package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField;
import com.esotericsoftware.kryo.serializers.FieldSerializer.CachedFieldFactory;
import java.lang.reflect.Field;

class UnsafeCachedFieldFactory implements CachedFieldFactory {
    UnsafeCachedFieldFactory() {
    }

    public CachedField createCachedField(Class cls, Field field, FieldSerializer fieldSerializer) {
        if (cls.isPrimitive()) {
            if (cls == Boolean.TYPE) {
                return new UnsafeBooleanField(field);
            }
            if (cls == Byte.TYPE) {
                return new UnsafeByteField(field);
            }
            if (cls == Character.TYPE) {
                return new UnsafeCharField(field);
            }
            if (cls == Short.TYPE) {
                return new UnsafeShortField(field);
            }
            if (cls == Integer.TYPE) {
                return new UnsafeIntField(field);
            }
            if (cls == Long.TYPE) {
                return new UnsafeLongField(field);
            }
            if (cls == Float.TYPE) {
                return new UnsafeFloatField(field);
            }
            if (cls == Double.TYPE) {
                return new UnsafeDoubleField(field);
            }
            return new UnsafeObjectField(fieldSerializer);
        } else if (cls == String.class && (fieldSerializer.kryo.getReferences() == null || fieldSerializer.kryo.getReferenceResolver().useReferences(String.class) == null)) {
            return new UnsafeStringField(field);
        } else {
            return new UnsafeObjectField(fieldSerializer);
        }
    }
}
