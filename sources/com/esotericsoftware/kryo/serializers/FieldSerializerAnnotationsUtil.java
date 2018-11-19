package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.factories.ReflectionSerializerFactory;
import com.esotericsoftware.kryo.serializers.CollectionSerializer.BindCollection;
import com.esotericsoftware.kryo.serializers.FieldSerializer.Bind;
import com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField;
import com.esotericsoftware.kryo.serializers.MapSerializer.BindMap;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;

final class FieldSerializerAnnotationsUtil {
    public FieldSerializerAnnotationsUtil(FieldSerializer fieldSerializer) {
    }

    public void processAnnotatedFields(FieldSerializer fieldSerializer) {
        CachedField[] fields = fieldSerializer.getFields();
        int length = fields.length;
        for (int i = 0; i < length; i++) {
            StringBuilder stringBuilder;
            Class elementSerializer;
            Serializer serializer;
            Class elementClass;
            Field field = fields[i].getField();
            if (field.isAnnotationPresent(Bind.class)) {
                fields[i].setSerializer(ReflectionSerializerFactory.makeSerializer(fieldSerializer.getKryo(), ((Bind) field.getAnnotation(Bind.class)).value(), field.getClass()));
            }
            if (field.isAnnotationPresent(BindCollection.class)) {
                field.isAnnotationPresent(BindMap.class);
            }
            if (field.isAnnotationPresent(BindCollection.class)) {
                if (fields[i].serializer != null) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("CollectionSerialier.Bind cannot be used with field ");
                    stringBuilder.append(fields[i].getField().getDeclaringClass().getName());
                    stringBuilder.append(".");
                    stringBuilder.append(fields[i].getField().getName());
                    stringBuilder.append(", because it has a serializer already.");
                    throw new RuntimeException(stringBuilder.toString());
                }
                BindCollection bindCollection = (BindCollection) field.getAnnotation(BindCollection.class);
                if (Collection.class.isAssignableFrom(fields[i].field.getType())) {
                    elementSerializer = bindCollection.elementSerializer();
                    if (elementSerializer == Serializer.class) {
                        elementSerializer = null;
                    }
                    if (elementSerializer == null) {
                        serializer = null;
                    } else {
                        serializer = ReflectionSerializerFactory.makeSerializer(fieldSerializer.getKryo(), elementSerializer, field.getClass());
                    }
                    boolean elementsCanBeNull = bindCollection.elementsCanBeNull();
                    elementClass = bindCollection.elementClass();
                    if (elementClass == Object.class) {
                        elementClass = null;
                    }
                    Serializer collectionSerializer = new CollectionSerializer();
                    collectionSerializer.setElementsCanBeNull(elementsCanBeNull);
                    collectionSerializer.setElementClass(elementClass, serializer);
                    fields[i].setSerializer(collectionSerializer);
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("CollectionSerialier.Bind should be used only with fields implementing java.util.Collection, but field ");
                    stringBuilder.append(fields[i].getField().getDeclaringClass().getName());
                    stringBuilder.append(".");
                    stringBuilder.append(fields[i].getField().getName());
                    stringBuilder.append(" does not implement it.");
                    throw new RuntimeException(stringBuilder.toString());
                }
            }
            if (field.isAnnotationPresent(BindMap.class)) {
                if (fields[i].serializer != null) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("MapSerialier.Bind cannot be used with field ");
                    stringBuilder.append(fields[i].getField().getDeclaringClass().getName());
                    stringBuilder.append(".");
                    stringBuilder.append(fields[i].getField().getName());
                    stringBuilder.append(", because it has a serializer already.");
                    throw new RuntimeException(stringBuilder.toString());
                }
                BindMap bindMap = (BindMap) field.getAnnotation(BindMap.class);
                if (Map.class.isAssignableFrom(fields[i].field.getType())) {
                    Serializer serializer2;
                    elementSerializer = bindMap.valueSerializer();
                    Class keySerializer = bindMap.keySerializer();
                    if (elementSerializer == Serializer.class) {
                        elementSerializer = null;
                    }
                    if (keySerializer == Serializer.class) {
                        keySerializer = null;
                    }
                    if (elementSerializer == null) {
                        serializer = null;
                    } else {
                        serializer = ReflectionSerializerFactory.makeSerializer(fieldSerializer.getKryo(), elementSerializer, field.getClass());
                    }
                    if (keySerializer == null) {
                        serializer2 = null;
                    } else {
                        serializer2 = ReflectionSerializerFactory.makeSerializer(fieldSerializer.getKryo(), keySerializer, field.getClass());
                    }
                    elementsCanBeNull = bindMap.valuesCanBeNull();
                    boolean keysCanBeNull = bindMap.keysCanBeNull();
                    Class keyClass = bindMap.keyClass();
                    elementClass = bindMap.valueClass();
                    if (keyClass == Object.class) {
                        keyClass = null;
                    }
                    if (elementClass == Object.class) {
                        elementClass = null;
                    }
                    Serializer mapSerializer = new MapSerializer();
                    mapSerializer.setKeysCanBeNull(keysCanBeNull);
                    mapSerializer.setValuesCanBeNull(elementsCanBeNull);
                    mapSerializer.setKeyClass(keyClass, serializer2);
                    mapSerializer.setValueClass(elementClass, serializer);
                    fields[i].setSerializer(mapSerializer);
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("MapSerialier.Bind should be used only with fields implementing java.util.Map, but field ");
                    stringBuilder.append(fields[i].getField().getDeclaringClass().getName());
                    stringBuilder.append(".");
                    stringBuilder.append(fields[i].getField().getName());
                    stringBuilder.append(" does not implement it.");
                    throw new RuntimeException(stringBuilder.toString());
                }
            }
        }
    }
}
