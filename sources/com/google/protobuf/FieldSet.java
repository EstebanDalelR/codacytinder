package com.google.protobuf;

import com.google.protobuf.Internal.EnumLite;
import com.google.protobuf.Internal.EnumLiteMap;
import com.google.protobuf.MessageLite.Builder;
import com.google.protobuf.WireFormat.FieldType;
import com.google.protobuf.WireFormat.JavaType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

final class FieldSet<FieldDescriptorType extends FieldDescriptorLite<FieldDescriptorType>> {
    private static final FieldSet DEFAULT_INSTANCE = new FieldSet(true);
    private final SmallSortedMap<FieldDescriptorType, Object> fields = SmallSortedMap.newFieldMap(16);
    private boolean hasLazyField = false;
    private boolean isImmutable;

    public interface FieldDescriptorLite<T extends FieldDescriptorLite<T>> extends Comparable<T> {
        EnumLiteMap<?> getEnumType();

        JavaType getLiteJavaType();

        FieldType getLiteType();

        int getNumber();

        Builder internalMergeFrom(Builder builder, MessageLite messageLite);

        boolean isPacked();

        boolean isRepeated();
    }

    private FieldSet() {
    }

    private FieldSet(boolean z) {
        makeImmutable();
    }

    public static <T extends FieldDescriptorLite<T>> FieldSet<T> newFieldSet() {
        return new FieldSet();
    }

    public static <T extends FieldDescriptorLite<T>> FieldSet<T> emptySet() {
        return DEFAULT_INSTANCE;
    }

    public void makeImmutable() {
        if (!this.isImmutable) {
            this.fields.makeImmutable();
            this.isImmutable = true;
        }
    }

    public boolean isImmutable() {
        return this.isImmutable;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FieldSet)) {
            return null;
        }
        return this.fields.equals(((FieldSet) obj).fields);
    }

    public int hashCode() {
        return this.fields.hashCode();
    }

    public FieldSet<FieldDescriptorType> clone() {
        FieldSet<FieldDescriptorType> newFieldSet = newFieldSet();
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            Entry arrayEntryAt = this.fields.getArrayEntryAt(i);
            newFieldSet.setField((FieldDescriptorLite) arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        for (Entry arrayEntryAt2 : this.fields.getOverflowEntries()) {
            newFieldSet.setField((FieldDescriptorLite) arrayEntryAt2.getKey(), arrayEntryAt2.getValue());
        }
        newFieldSet.hasLazyField = this.hasLazyField;
        return newFieldSet;
    }

    public void clear() {
        this.fields.clear();
        this.hasLazyField = false;
    }

    public Map<FieldDescriptorType, Object> getAllFields() {
        if (this.hasLazyField) {
            Map<FieldDescriptorType, Object> newFieldMap = SmallSortedMap.newFieldMap(16);
            for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
                cloneFieldEntry(newFieldMap, this.fields.getArrayEntryAt(i));
            }
            for (Entry cloneFieldEntry : this.fields.getOverflowEntries()) {
                cloneFieldEntry(newFieldMap, cloneFieldEntry);
            }
            if (this.fields.isImmutable()) {
                newFieldMap.makeImmutable();
            }
            return newFieldMap;
        }
        return this.fields.isImmutable() ? this.fields : Collections.unmodifiableMap(this.fields);
    }

    private void cloneFieldEntry(Map<FieldDescriptorType, Object> map, Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        entry = entry.getValue();
        if (entry instanceof LazyField) {
            map.put(fieldDescriptorLite, ((LazyField) entry).getValue());
        } else {
            map.put(fieldDescriptorLite, entry);
        }
    }

    public Iterator<Entry<FieldDescriptorType, Object>> iterator() {
        if (this.hasLazyField) {
            return new LazyIterator(this.fields.entrySet().iterator());
        }
        return this.fields.entrySet().iterator();
    }

    public boolean hasField(FieldDescriptorType fieldDescriptorType) {
        if (!fieldDescriptorType.isRepeated()) {
            return this.fields.get(fieldDescriptorType) != null ? true : null;
        } else {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
    }

    public Object getField(FieldDescriptorType fieldDescriptorType) {
        fieldDescriptorType = this.fields.get(fieldDescriptorType);
        return fieldDescriptorType instanceof LazyField ? ((LazyField) fieldDescriptorType).getValue() : fieldDescriptorType;
    }

    public void setField(FieldDescriptorType fieldDescriptorType, Object obj) {
        if (!fieldDescriptorType.isRepeated()) {
            verifyType(fieldDescriptorType.getLiteType(), obj);
        } else if (obj instanceof List) {
            List<Object> arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            for (Object verifyType : arrayList) {
                verifyType(fieldDescriptorType.getLiteType(), verifyType);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof LazyField) {
            this.hasLazyField = true;
        }
        this.fields.put((Comparable) fieldDescriptorType, obj);
    }

    public void clearField(FieldDescriptorType fieldDescriptorType) {
        this.fields.remove(fieldDescriptorType);
        if (this.fields.isEmpty() != null) {
            this.hasLazyField = null;
        }
    }

    public int getRepeatedFieldCount(FieldDescriptorType fieldDescriptorType) {
        if (fieldDescriptorType.isRepeated()) {
            fieldDescriptorType = getField(fieldDescriptorType);
            if (fieldDescriptorType == null) {
                return null;
            }
            return ((List) fieldDescriptorType).size();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public Object getRepeatedField(FieldDescriptorType fieldDescriptorType, int i) {
        if (fieldDescriptorType.isRepeated()) {
            fieldDescriptorType = getField(fieldDescriptorType);
            if (fieldDescriptorType != null) {
                return ((List) fieldDescriptorType).get(i);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public void setRepeatedField(FieldDescriptorType fieldDescriptorType, int i, Object obj) {
        if (fieldDescriptorType.isRepeated()) {
            Object field = getField(fieldDescriptorType);
            if (field == null) {
                throw new IndexOutOfBoundsException();
            }
            verifyType(fieldDescriptorType.getLiteType(), obj);
            ((List) field).set(i, obj);
            return;
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public void addRepeatedField(FieldDescriptorType fieldDescriptorType, Object obj) {
        if (fieldDescriptorType.isRepeated()) {
            List arrayList;
            verifyType(fieldDescriptorType.getLiteType(), obj);
            Object field = getField(fieldDescriptorType);
            if (field == null) {
                arrayList = new ArrayList();
                this.fields.put((Comparable) fieldDescriptorType, (Object) arrayList);
            } else {
                arrayList = (List) field;
            }
            arrayList.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void verifyType(com.google.protobuf.WireFormat.FieldType r2, java.lang.Object r3) {
        /*
        com.google.protobuf.Internal.checkNotNull(r3);
        r0 = com.google.protobuf.FieldSet.C56331.$SwitchMap$com$google$protobuf$WireFormat$JavaType;
        r2 = r2.getJavaType();
        r2 = r2.ordinal();
        r2 = r0[r2];
        r0 = 1;
        r1 = 0;
        switch(r2) {
            case 1: goto L_0x0040;
            case 2: goto L_0x003d;
            case 3: goto L_0x003a;
            case 4: goto L_0x0037;
            case 5: goto L_0x0034;
            case 6: goto L_0x0031;
            case 7: goto L_0x0028;
            case 8: goto L_0x001f;
            case 9: goto L_0x0015;
            default: goto L_0x0014;
        };
    L_0x0014:
        goto L_0x0042;
    L_0x0015:
        r2 = r3 instanceof com.google.protobuf.MessageLite;
        if (r2 != 0) goto L_0x001d;
    L_0x0019:
        r2 = r3 instanceof com.google.protobuf.LazyField;
        if (r2 == 0) goto L_0x0042;
    L_0x001d:
        r1 = 1;
        goto L_0x0042;
    L_0x001f:
        r2 = r3 instanceof java.lang.Integer;
        if (r2 != 0) goto L_0x001d;
    L_0x0023:
        r2 = r3 instanceof com.google.protobuf.Internal.EnumLite;
        if (r2 == 0) goto L_0x0042;
    L_0x0027:
        goto L_0x001d;
    L_0x0028:
        r2 = r3 instanceof com.google.protobuf.ByteString;
        if (r2 != 0) goto L_0x001d;
    L_0x002c:
        r2 = r3 instanceof byte[];
        if (r2 == 0) goto L_0x0042;
    L_0x0030:
        goto L_0x001d;
    L_0x0031:
        r1 = r3 instanceof java.lang.String;
        goto L_0x0042;
    L_0x0034:
        r1 = r3 instanceof java.lang.Boolean;
        goto L_0x0042;
    L_0x0037:
        r1 = r3 instanceof java.lang.Double;
        goto L_0x0042;
    L_0x003a:
        r1 = r3 instanceof java.lang.Float;
        goto L_0x0042;
    L_0x003d:
        r1 = r3 instanceof java.lang.Long;
        goto L_0x0042;
    L_0x0040:
        r1 = r3 instanceof java.lang.Integer;
    L_0x0042:
        if (r1 != 0) goto L_0x004c;
    L_0x0044:
        r2 = new java.lang.IllegalArgumentException;
        r3 = "Wrong object type used with protocol message reflection.";
        r2.<init>(r3);
        throw r2;
    L_0x004c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.FieldSet.verifyType(com.google.protobuf.WireFormat$FieldType, java.lang.Object):void");
    }

    public boolean isInitialized() {
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            if (!isInitialized(this.fields.getArrayEntryAt(i))) {
                return false;
            }
        }
        for (Entry isInitialized : this.fields.getOverflowEntries()) {
            if (!isInitialized(isInitialized)) {
                return false;
            }
        }
        return true;
    }

    private boolean isInitialized(Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        if (fieldDescriptorLite.getLiteJavaType() == JavaType.MESSAGE) {
            if (fieldDescriptorLite.isRepeated()) {
                for (MessageLite isInitialized : (List) entry.getValue()) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            }
            entry = entry.getValue();
            if (entry instanceof MessageLite) {
                if (((MessageLite) entry).isInitialized() == null) {
                    return false;
                }
            } else if ((entry instanceof LazyField) != null) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    static int getWireFormatForFieldType(FieldType fieldType, boolean z) {
        return z ? 2 : fieldType.getWireType();
    }

    public void mergeFrom(FieldSet<FieldDescriptorType> fieldSet) {
        for (int i = 0; i < fieldSet.fields.getNumArrayEntries(); i++) {
            mergeFromField(fieldSet.fields.getArrayEntryAt(i));
        }
        for (FieldDescriptorType mergeFromField : fieldSet.fields.getOverflowEntries()) {
            mergeFromField(mergeFromField);
        }
    }

    private Object cloneIfMutable(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        Object obj2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, obj2, 0, bArr.length);
        return obj2;
    }

    private void mergeFromField(Entry<FieldDescriptorType, Object> entry) {
        Comparable comparable = (FieldDescriptorLite) entry.getKey();
        entry = entry.getValue();
        if (entry instanceof LazyField) {
            entry = ((LazyField) entry).getValue();
        }
        Object field;
        if (comparable.isRepeated()) {
            field = getField(comparable);
            if (field == null) {
                field = new ArrayList();
            }
            for (Object cloneIfMutable : (List) entry) {
                ((List) field).add(cloneIfMutable(cloneIfMutable));
            }
            this.fields.put(comparable, field);
        } else if (comparable.getLiteJavaType() == JavaType.MESSAGE) {
            field = getField(comparable);
            if (field == null) {
                this.fields.put(comparable, cloneIfMutable(entry));
                return;
            }
            this.fields.put(comparable, comparable.internalMergeFrom(((MessageLite) field).toBuilder(), (MessageLite) entry).build());
        } else {
            this.fields.put(comparable, cloneIfMutable(entry));
        }
    }

    public static Object readPrimitiveField(CodedInputStream codedInputStream, FieldType fieldType, boolean z) throws IOException {
        if (z) {
            return WireFormat.readPrimitiveField(codedInputStream, fieldType, Utf8Validation.STRICT);
        }
        return WireFormat.readPrimitiveField(codedInputStream, fieldType, Utf8Validation.LOOSE);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            Entry arrayEntryAt = this.fields.getArrayEntryAt(i);
            writeField((FieldDescriptorLite) arrayEntryAt.getKey(), arrayEntryAt.getValue(), codedOutputStream);
        }
        for (Entry arrayEntryAt2 : this.fields.getOverflowEntries()) {
            writeField((FieldDescriptorLite) arrayEntryAt2.getKey(), arrayEntryAt2.getValue(), codedOutputStream);
        }
    }

    public void writeMessageSetTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            writeMessageSetTo(this.fields.getArrayEntryAt(i), codedOutputStream);
        }
        for (Entry writeMessageSetTo : this.fields.getOverflowEntries()) {
            writeMessageSetTo(writeMessageSetTo, codedOutputStream);
        }
    }

    private void writeMessageSetTo(Entry<FieldDescriptorType, Object> entry, CodedOutputStream codedOutputStream) throws IOException {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        if (fieldDescriptorLite.getLiteJavaType() != JavaType.MESSAGE || fieldDescriptorLite.isRepeated() || fieldDescriptorLite.isPacked()) {
            writeField(fieldDescriptorLite, entry.getValue(), codedOutputStream);
            return;
        }
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            value = ((LazyField) value).getValue();
        }
        codedOutputStream.writeMessageSetExtension(((FieldDescriptorLite) entry.getKey()).getNumber(), (MessageLite) value);
    }

    static void writeElement(CodedOutputStream codedOutputStream, FieldType fieldType, int i, Object obj) throws IOException {
        if (fieldType == FieldType.GROUP) {
            codedOutputStream.writeGroup(i, (MessageLite) obj);
            return;
        }
        codedOutputStream.writeTag(i, getWireFormatForFieldType(fieldType, false));
        writeElementNoTag(codedOutputStream, fieldType, obj);
    }

    static void writeElementNoTag(CodedOutputStream codedOutputStream, FieldType fieldType, Object obj) throws IOException {
        switch (fieldType) {
            case DOUBLE:
                codedOutputStream.writeDoubleNoTag(((Double) obj).doubleValue());
                return;
            case FLOAT:
                codedOutputStream.writeFloatNoTag(((Float) obj).floatValue());
                return;
            case INT64:
                codedOutputStream.writeInt64NoTag(((Long) obj).longValue());
                return;
            case UINT64:
                codedOutputStream.writeUInt64NoTag(((Long) obj).longValue());
                return;
            case INT32:
                codedOutputStream.writeInt32NoTag(((Integer) obj).intValue());
                return;
            case FIXED64:
                codedOutputStream.writeFixed64NoTag(((Long) obj).longValue());
                return;
            case FIXED32:
                codedOutputStream.writeFixed32NoTag(((Integer) obj).intValue());
                return;
            case BOOL:
                codedOutputStream.writeBoolNoTag(((Boolean) obj).booleanValue());
                return;
            case GROUP:
                codedOutputStream.writeGroupNoTag((MessageLite) obj);
                return;
            case MESSAGE:
                codedOutputStream.writeMessageNoTag((MessageLite) obj);
                return;
            case STRING:
                if ((obj instanceof ByteString) != null) {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                    return;
                } else {
                    codedOutputStream.writeStringNoTag((String) obj);
                    return;
                }
            case BYTES:
                if ((obj instanceof ByteString) != null) {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                    return;
                } else {
                    codedOutputStream.writeByteArrayNoTag((byte[]) obj);
                    return;
                }
            case UINT32:
                codedOutputStream.writeUInt32NoTag(((Integer) obj).intValue());
                return;
            case SFIXED32:
                codedOutputStream.writeSFixed32NoTag(((Integer) obj).intValue());
                return;
            case SFIXED64:
                codedOutputStream.writeSFixed64NoTag(((Long) obj).longValue());
                return;
            case SINT32:
                codedOutputStream.writeSInt32NoTag(((Integer) obj).intValue());
                return;
            case SINT64:
                codedOutputStream.writeSInt64NoTag(((Long) obj).longValue());
                return;
            case ENUM:
                if ((obj instanceof EnumLite) != null) {
                    codedOutputStream.writeEnumNoTag(((EnumLite) obj).getNumber());
                    return;
                } else {
                    codedOutputStream.writeEnumNoTag(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public static void writeField(FieldDescriptorLite<?> fieldDescriptorLite, Object obj, CodedOutputStream codedOutputStream) throws IOException {
        FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (fieldDescriptorLite.isRepeated()) {
            List<Object> list = (List) obj;
            if (fieldDescriptorLite.isPacked() != null) {
                codedOutputStream.writeTag(number, 2);
                fieldDescriptorLite = null;
                for (Object computeElementSizeNoTag : list) {
                    fieldDescriptorLite += computeElementSizeNoTag(liteType, computeElementSizeNoTag);
                }
                codedOutputStream.writeRawVarint32(fieldDescriptorLite);
                for (Object obj2 : list) {
                    writeElementNoTag(codedOutputStream, liteType, obj2);
                }
                return;
            }
            for (Object obj22 : list) {
                writeElement(codedOutputStream, liteType, number, obj22);
            }
        } else if ((obj22 instanceof LazyField) != null) {
            writeElement(codedOutputStream, liteType, number, ((LazyField) obj22).getValue());
        } else {
            writeElement(codedOutputStream, liteType, number, obj22);
        }
    }

    public int getSerializedSize() {
        int i = 0;
        for (int i2 = 0; i2 < this.fields.getNumArrayEntries(); i2++) {
            Entry arrayEntryAt = this.fields.getArrayEntryAt(i2);
            i += computeFieldSize((FieldDescriptorLite) arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        for (Entry arrayEntryAt2 : this.fields.getOverflowEntries()) {
            i += computeFieldSize((FieldDescriptorLite) arrayEntryAt2.getKey(), arrayEntryAt2.getValue());
        }
        return i;
    }

    public int getMessageSetSerializedSize() {
        int i = 0;
        for (int i2 = 0; i2 < this.fields.getNumArrayEntries(); i2++) {
            i += getMessageSetSerializedSize(this.fields.getArrayEntryAt(i2));
        }
        for (Entry messageSetSerializedSize : this.fields.getOverflowEntries()) {
            i += getMessageSetSerializedSize(messageSetSerializedSize);
        }
        return i;
    }

    private int getMessageSetSerializedSize(Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (fieldDescriptorLite.getLiteJavaType() != JavaType.MESSAGE || fieldDescriptorLite.isRepeated() || fieldDescriptorLite.isPacked()) {
            return computeFieldSize(fieldDescriptorLite, value);
        }
        if (value instanceof LazyField) {
            return CodedOutputStream.computeLazyFieldMessageSetExtensionSize(((FieldDescriptorLite) entry.getKey()).getNumber(), (LazyField) value);
        }
        return CodedOutputStream.computeMessageSetExtensionSize(((FieldDescriptorLite) entry.getKey()).getNumber(), (MessageLite) value);
    }

    static int computeElementSize(FieldType fieldType, int i, Object obj) {
        i = CodedOutputStream.computeTagSize(i);
        if (fieldType == FieldType.GROUP) {
            i *= 2;
        }
        return i + computeElementSizeNoTag(fieldType, obj);
    }

    static int computeElementSizeNoTag(FieldType fieldType, Object obj) {
        switch (fieldType) {
            case DOUBLE:
                return CodedOutputStream.computeDoubleSizeNoTag(((Double) obj).doubleValue());
            case FLOAT:
                return CodedOutputStream.computeFloatSizeNoTag(((Float) obj).floatValue());
            case INT64:
                return CodedOutputStream.computeInt64SizeNoTag(((Long) obj).longValue());
            case UINT64:
                return CodedOutputStream.computeUInt64SizeNoTag(((Long) obj).longValue());
            case INT32:
                return CodedOutputStream.computeInt32SizeNoTag(((Integer) obj).intValue());
            case FIXED64:
                return CodedOutputStream.computeFixed64SizeNoTag(((Long) obj).longValue());
            case FIXED32:
                return CodedOutputStream.computeFixed32SizeNoTag(((Integer) obj).intValue());
            case BOOL:
                return CodedOutputStream.computeBoolSizeNoTag(((Boolean) obj).booleanValue());
            case GROUP:
                return CodedOutputStream.computeGroupSizeNoTag((MessageLite) obj);
            case MESSAGE:
                if ((obj instanceof LazyField) != null) {
                    return CodedOutputStream.computeLazyFieldSizeNoTag((LazyField) obj);
                }
                return CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj);
            case STRING:
                if ((obj instanceof ByteString) != null) {
                    return CodedOutputStream.computeBytesSizeNoTag((ByteString) obj);
                }
                return CodedOutputStream.computeStringSizeNoTag((String) obj);
            case BYTES:
                if ((obj instanceof ByteString) != null) {
                    return CodedOutputStream.computeBytesSizeNoTag((ByteString) obj);
                }
                return CodedOutputStream.computeByteArraySizeNoTag((byte[]) obj);
            case UINT32:
                return CodedOutputStream.computeUInt32SizeNoTag(((Integer) obj).intValue());
            case SFIXED32:
                return CodedOutputStream.computeSFixed32SizeNoTag(((Integer) obj).intValue());
            case SFIXED64:
                return CodedOutputStream.computeSFixed64SizeNoTag(((Long) obj).longValue());
            case SINT32:
                return CodedOutputStream.computeSInt32SizeNoTag(((Integer) obj).intValue());
            case SINT64:
                return CodedOutputStream.computeSInt64SizeNoTag(((Long) obj).longValue());
            case ENUM:
                if ((obj instanceof EnumLite) != null) {
                    return CodedOutputStream.computeEnumSizeNoTag(((EnumLite) obj).getNumber());
                }
                return CodedOutputStream.computeEnumSizeNoTag(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int computeFieldSize(FieldDescriptorLite<?> fieldDescriptorLite, Object obj) {
        FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (!fieldDescriptorLite.isRepeated()) {
            return computeElementSize(liteType, number, obj);
        }
        int i = 0;
        if (fieldDescriptorLite.isPacked() != null) {
            for (Object obj2 : (List) obj2) {
                i += computeElementSizeNoTag(liteType, obj2);
            }
            return (CodedOutputStream.computeTagSize(number) + i) + CodedOutputStream.computeRawVarint32Size(i);
        }
        for (Object obj22 : (List) obj22) {
            i += computeElementSize(liteType, number, obj22);
        }
        return i;
    }
}
