package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField;
import com.esotericsoftware.kryo.serializers.FieldSerializer.CachedFieldFactory;
import java.lang.reflect.Field;

class ObjectCachedFieldFactory implements CachedFieldFactory {
    ObjectCachedFieldFactory() {
    }

    public CachedField createCachedField(Class cls, Field field, FieldSerializer fieldSerializer) {
        if (cls.isPrimitive() == null) {
            return new ObjectField(fieldSerializer);
        }
        if (cls == Boolean.TYPE) {
            return new ObjectBooleanField(fieldSerializer);
        }
        if (cls == Byte.TYPE) {
            return new ObjectByteField(fieldSerializer);
        }
        if (cls == Character.TYPE) {
            return new ObjectCharField(fieldSerializer);
        }
        if (cls == Short.TYPE) {
            return new ObjectShortField(fieldSerializer);
        }
        if (cls == Integer.TYPE) {
            return new ObjectIntField(fieldSerializer);
        }
        if (cls == Long.TYPE) {
            return new ObjectLongField(fieldSerializer);
        }
        if (cls == Float.TYPE) {
            return new ObjectFloatField(fieldSerializer);
        }
        if (cls == Double.TYPE) {
            return new ObjectDoubleField(fieldSerializer);
        }
        return new ObjectField(fieldSerializer);
    }
}
