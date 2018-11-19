package com.google.protobuf;

import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.FieldDescriptor.JavaType;
import com.google.protobuf.Descriptors.FieldDescriptor.Type;
import com.google.protobuf.WireFormat.FieldType;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public final class MapEntry<K, V> extends AbstractMessage {
    private volatile int cachedSerializedSize;
    private final K key;
    private final Metadata<K, V> metadata;
    private final V value;

    private static final class Metadata<K, V> extends Metadata<K, V> {
        public final Descriptor descriptor;
        public final Parser<MapEntry<K, V>> parser = new C77841();

        /* renamed from: com.google.protobuf.MapEntry$Metadata$1 */
        class C77841 extends AbstractParser<MapEntry<K, V>> {
            C77841() {
            }

            public MapEntry<K, V> parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new MapEntry(Metadata.this, codedInputStream, extensionRegistryLite);
            }
        }

        public Metadata(Descriptor descriptor, MapEntry<K, V> mapEntry, FieldType fieldType, FieldType fieldType2) {
            super(fieldType, mapEntry.key, fieldType2, mapEntry.value);
            this.descriptor = descriptor;
        }
    }

    public static class Builder<K, V> extends com.google.protobuf.AbstractMessage.Builder<Builder<K, V>> {
        private boolean hasKey;
        private boolean hasValue;
        private K key;
        private final Metadata<K, V> metadata;
        private V value;

        public Builder<K, V> setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return this;
        }

        private Builder(Metadata<K, V> metadata) {
            this(metadata, metadata.defaultKey, metadata.defaultValue, false, false);
        }

        private Builder(Metadata<K, V> metadata, K k, V v, boolean z, boolean z2) {
            this.metadata = metadata;
            this.key = k;
            this.value = v;
            this.hasKey = z;
            this.hasValue = z2;
        }

        public K getKey() {
            return this.key;
        }

        public V getValue() {
            return this.value;
        }

        public Builder<K, V> setKey(K k) {
            this.key = k;
            this.hasKey = true;
            return this;
        }

        public Builder<K, V> clearKey() {
            this.key = this.metadata.defaultKey;
            this.hasKey = false;
            return this;
        }

        public Builder<K, V> setValue(V v) {
            this.value = v;
            this.hasValue = true;
            return this;
        }

        public Builder<K, V> clearValue() {
            this.value = this.metadata.defaultValue;
            this.hasValue = false;
            return this;
        }

        public MapEntry<K, V> build() {
            Object buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
        }

        public MapEntry<K, V> buildPartial() {
            return new MapEntry(this.metadata, this.key, this.value);
        }

        public Descriptor getDescriptorForType() {
            return this.metadata.descriptor;
        }

        private void checkFieldDescriptor(FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.getContainingType() != this.metadata.descriptor) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Wrong FieldDescriptor \"");
                stringBuilder.append(fieldDescriptor.getFullName());
                stringBuilder.append("\" used in message \"");
                stringBuilder.append(this.metadata.descriptor.getFullName());
                throw new RuntimeException(stringBuilder.toString());
            }
        }

        public com.google.protobuf.Message.Builder newBuilderForField(FieldDescriptor fieldDescriptor) {
            checkFieldDescriptor(fieldDescriptor);
            if (fieldDescriptor.getNumber() == 2) {
                if (fieldDescriptor.getJavaType() == JavaType.MESSAGE) {
                    return ((Message) this.value).newBuilderForType();
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\"");
            stringBuilder.append(fieldDescriptor.getFullName());
            stringBuilder.append("\" is not a message value field.");
            throw new RuntimeException(stringBuilder.toString());
        }

        public Builder<K, V> setField(FieldDescriptor fieldDescriptor, Object obj) {
            checkFieldDescriptor(fieldDescriptor);
            if (fieldDescriptor.getNumber() == 1) {
                setKey(obj);
            } else {
                if (fieldDescriptor.getType() == Type.ENUM) {
                    obj = Integer.valueOf(((EnumValueDescriptor) obj).getNumber());
                } else if (fieldDescriptor.getType() == Type.MESSAGE && obj != null && this.metadata.defaultValue.getClass().isInstance(obj) == null) {
                    obj = ((Message) this.metadata.defaultValue).toBuilder().mergeFrom((Message) obj).build();
                }
                setValue(obj);
            }
            return this;
        }

        public Builder<K, V> clearField(FieldDescriptor fieldDescriptor) {
            checkFieldDescriptor(fieldDescriptor);
            if (fieldDescriptor.getNumber() == 1) {
                clearKey();
            } else {
                clearValue();
            }
            return this;
        }

        public Builder<K, V> setRepeatedField(FieldDescriptor fieldDescriptor, int i, Object obj) {
            throw new RuntimeException("There is no repeated field in a map entry message.");
        }

        public Builder<K, V> addRepeatedField(FieldDescriptor fieldDescriptor, Object obj) {
            throw new RuntimeException("There is no repeated field in a map entry message.");
        }

        public MapEntry<K, V> getDefaultInstanceForType() {
            return new MapEntry(this.metadata, this.metadata.defaultKey, this.metadata.defaultValue);
        }

        public boolean isInitialized() {
            return MapEntry.isInitialized(this.metadata, this.value);
        }

        public Map<FieldDescriptor, Object> getAllFields() {
            Map treeMap = new TreeMap();
            for (FieldDescriptor fieldDescriptor : this.metadata.descriptor.getFields()) {
                if (hasField(fieldDescriptor)) {
                    treeMap.put(fieldDescriptor, getField(fieldDescriptor));
                }
            }
            return Collections.unmodifiableMap(treeMap);
        }

        public boolean hasField(FieldDescriptor fieldDescriptor) {
            checkFieldDescriptor(fieldDescriptor);
            return fieldDescriptor.getNumber() == 1 ? this.hasKey : this.hasValue;
        }

        public Object getField(FieldDescriptor fieldDescriptor) {
            checkFieldDescriptor(fieldDescriptor);
            Object key = fieldDescriptor.getNumber() == 1 ? getKey() : getValue();
            return fieldDescriptor.getType() == Type.ENUM ? fieldDescriptor.getEnumType().findValueByNumberCreatingIfUnknown(((Integer) key).intValue()) : key;
        }

        public int getRepeatedFieldCount(FieldDescriptor fieldDescriptor) {
            throw new RuntimeException("There is no repeated field in a map entry message.");
        }

        public Object getRepeatedField(FieldDescriptor fieldDescriptor, int i) {
            throw new RuntimeException("There is no repeated field in a map entry message.");
        }

        public UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        public Builder<K, V> clone() {
            return new Builder(this.metadata, this.key, this.value, this.hasKey, this.hasValue);
        }
    }

    private MapEntry(Descriptor descriptor, FieldType fieldType, K k, FieldType fieldType2, V v) {
        this.cachedSerializedSize = -1;
        this.key = k;
        this.value = v;
        this.metadata = new Metadata(descriptor, this, fieldType, fieldType2);
    }

    private MapEntry(Metadata metadata, K k, V v) {
        this.cachedSerializedSize = -1;
        this.key = k;
        this.value = v;
        this.metadata = metadata;
    }

    private MapEntry(Metadata<K, V> metadata, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this.cachedSerializedSize = -1;
        try {
            this.metadata = metadata;
            metadata = MapEntryLite.parseEntry(codedInputStream, metadata, extensionRegistryLite);
            this.key = metadata.getKey();
            this.value = metadata.getValue();
        } catch (Metadata<K, V> metadata2) {
            throw metadata2.setUnfinishedMessage(this);
        } catch (IOException e) {
            throw new InvalidProtocolBufferException(e).setUnfinishedMessage(this);
        }
    }

    public static <K, V> MapEntry<K, V> newDefaultInstance(Descriptor descriptor, FieldType fieldType, K k, FieldType fieldType2, V v) {
        return new MapEntry(descriptor, fieldType, k, fieldType2, v);
    }

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

    public int getSerializedSize() {
        if (this.cachedSerializedSize != -1) {
            return this.cachedSerializedSize;
        }
        int computeSerializedSize = MapEntryLite.computeSerializedSize(this.metadata, this.key, this.value);
        this.cachedSerializedSize = computeSerializedSize;
        return computeSerializedSize;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        MapEntryLite.writeTo(codedOutputStream, this.metadata, this.key, this.value);
    }

    public boolean isInitialized() {
        return isInitialized(this.metadata, this.value);
    }

    public Parser<MapEntry<K, V>> getParserForType() {
        return this.metadata.parser;
    }

    public Builder<K, V> newBuilderForType() {
        return new Builder(this.metadata);
    }

    public Builder<K, V> toBuilder() {
        return new Builder(this.metadata, this.key, this.value, true, true);
    }

    public MapEntry<K, V> getDefaultInstanceForType() {
        return new MapEntry(this.metadata, this.metadata.defaultKey, this.metadata.defaultValue);
    }

    public Descriptor getDescriptorForType() {
        return this.metadata.descriptor;
    }

    public Map<FieldDescriptor, Object> getAllFields() {
        Map treeMap = new TreeMap();
        for (FieldDescriptor fieldDescriptor : this.metadata.descriptor.getFields()) {
            if (hasField(fieldDescriptor)) {
                treeMap.put(fieldDescriptor, getField(fieldDescriptor));
            }
        }
        return Collections.unmodifiableMap(treeMap);
    }

    private void checkFieldDescriptor(FieldDescriptor fieldDescriptor) {
        if (fieldDescriptor.getContainingType() != this.metadata.descriptor) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Wrong FieldDescriptor \"");
            stringBuilder.append(fieldDescriptor.getFullName());
            stringBuilder.append("\" used in message \"");
            stringBuilder.append(this.metadata.descriptor.getFullName());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public boolean hasField(FieldDescriptor fieldDescriptor) {
        checkFieldDescriptor(fieldDescriptor);
        return true;
    }

    public Object getField(FieldDescriptor fieldDescriptor) {
        checkFieldDescriptor(fieldDescriptor);
        Object key = fieldDescriptor.getNumber() == 1 ? getKey() : getValue();
        return fieldDescriptor.getType() == Type.ENUM ? fieldDescriptor.getEnumType().findValueByNumberCreatingIfUnknown(((Integer) key).intValue()) : key;
    }

    public int getRepeatedFieldCount(FieldDescriptor fieldDescriptor) {
        throw new RuntimeException("There is no repeated field in a map entry message.");
    }

    public Object getRepeatedField(FieldDescriptor fieldDescriptor, int i) {
        throw new RuntimeException("There is no repeated field in a map entry message.");
    }

    public UnknownFieldSet getUnknownFields() {
        return UnknownFieldSet.getDefaultInstance();
    }

    private static <V> boolean isInitialized(Metadata metadata, V v) {
        return metadata.valueType.getJavaType() == WireFormat.JavaType.MESSAGE ? ((MessageLite) v).isInitialized() : true;
    }

    final Metadata<K, V> getMetadata() {
        return this.metadata;
    }
}
