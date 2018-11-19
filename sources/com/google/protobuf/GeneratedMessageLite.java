package com.google.protobuf;

import com.google.protobuf.FieldSet.FieldDescriptorLite;
import com.google.protobuf.Internal.BooleanList;
import com.google.protobuf.Internal.DoubleList;
import com.google.protobuf.Internal.EnumLite;
import com.google.protobuf.Internal.EnumLiteMap;
import com.google.protobuf.Internal.FloatList;
import com.google.protobuf.Internal.IntList;
import com.google.protobuf.Internal.LongList;
import com.google.protobuf.Internal.ProtobufList;
import com.google.protobuf.WireFormat.FieldType;
import com.google.protobuf.WireFormat.JavaType;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite<MessageType, BuilderType> {
    protected int memoizedSerializedSize = -1;
    protected UnknownFieldSetLite unknownFields = UnknownFieldSetLite.getDefaultInstance();

    public enum MethodToInvoke {
        IS_INITIALIZED,
        VISIT,
        MERGE_FROM_STREAM,
        MAKE_IMMUTABLE,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        private final byte[] asBytes;
        private final String messageClassName;

        public static SerializedForm of(MessageLite messageLite) {
            return new SerializedForm(messageLite);
        }

        SerializedForm(MessageLite messageLite) {
            this.messageClassName = messageLite.getClass().getName();
            this.asBytes = messageLite.toByteArray();
        }

        protected java.lang.Object readResolve() throws java.io.ObjectStreamException {
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
            r4 = this;
            r0 = r4.messageClassName;	 Catch:{ ClassNotFoundException -> 0x0057, NoSuchFieldException -> 0x0052, SecurityException -> 0x0038, IllegalAccessException -> 0x002f, InvalidProtocolBufferException -> 0x0026 }
            r0 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0057, NoSuchFieldException -> 0x0052, SecurityException -> 0x0038, IllegalAccessException -> 0x002f, InvalidProtocolBufferException -> 0x0026 }
            r1 = "DEFAULT_INSTANCE";	 Catch:{ ClassNotFoundException -> 0x0057, NoSuchFieldException -> 0x0052, SecurityException -> 0x0038, IllegalAccessException -> 0x002f, InvalidProtocolBufferException -> 0x0026 }
            r0 = r0.getDeclaredField(r1);	 Catch:{ ClassNotFoundException -> 0x0057, NoSuchFieldException -> 0x0052, SecurityException -> 0x0038, IllegalAccessException -> 0x002f, InvalidProtocolBufferException -> 0x0026 }
            r1 = 1;	 Catch:{ ClassNotFoundException -> 0x0057, NoSuchFieldException -> 0x0052, SecurityException -> 0x0038, IllegalAccessException -> 0x002f, InvalidProtocolBufferException -> 0x0026 }
            r0.setAccessible(r1);	 Catch:{ ClassNotFoundException -> 0x0057, NoSuchFieldException -> 0x0052, SecurityException -> 0x0038, IllegalAccessException -> 0x002f, InvalidProtocolBufferException -> 0x0026 }
            r1 = 0;	 Catch:{ ClassNotFoundException -> 0x0057, NoSuchFieldException -> 0x0052, SecurityException -> 0x0038, IllegalAccessException -> 0x002f, InvalidProtocolBufferException -> 0x0026 }
            r0 = r0.get(r1);	 Catch:{ ClassNotFoundException -> 0x0057, NoSuchFieldException -> 0x0052, SecurityException -> 0x0038, IllegalAccessException -> 0x002f, InvalidProtocolBufferException -> 0x0026 }
            r0 = (com.google.protobuf.MessageLite) r0;	 Catch:{ ClassNotFoundException -> 0x0057, NoSuchFieldException -> 0x0052, SecurityException -> 0x0038, IllegalAccessException -> 0x002f, InvalidProtocolBufferException -> 0x0026 }
            r0 = r0.newBuilderForType();	 Catch:{ ClassNotFoundException -> 0x0057, NoSuchFieldException -> 0x0052, SecurityException -> 0x0038, IllegalAccessException -> 0x002f, InvalidProtocolBufferException -> 0x0026 }
            r1 = r4.asBytes;	 Catch:{ ClassNotFoundException -> 0x0057, NoSuchFieldException -> 0x0052, SecurityException -> 0x0038, IllegalAccessException -> 0x002f, InvalidProtocolBufferException -> 0x0026 }
            r0 = r0.mergeFrom(r1);	 Catch:{ ClassNotFoundException -> 0x0057, NoSuchFieldException -> 0x0052, SecurityException -> 0x0038, IllegalAccessException -> 0x002f, InvalidProtocolBufferException -> 0x0026 }
            r0 = r0.buildPartial();	 Catch:{ ClassNotFoundException -> 0x0057, NoSuchFieldException -> 0x0052, SecurityException -> 0x0038, IllegalAccessException -> 0x002f, InvalidProtocolBufferException -> 0x0026 }
            return r0;
        L_0x0026:
            r0 = move-exception;
            r1 = new java.lang.RuntimeException;
            r2 = "Unable to understand proto buffer";
            r1.<init>(r2, r0);
            throw r1;
        L_0x002f:
            r0 = move-exception;
            r1 = new java.lang.RuntimeException;
            r2 = "Unable to call parsePartialFrom";
            r1.<init>(r2, r0);
            throw r1;
        L_0x0038:
            r0 = move-exception;
            r1 = new java.lang.RuntimeException;
            r2 = new java.lang.StringBuilder;
            r2.<init>();
            r3 = "Unable to call DEFAULT_INSTANCE in ";
            r2.append(r3);
            r3 = r4.messageClassName;
            r2.append(r3);
            r2 = r2.toString();
            r1.<init>(r2, r0);
            throw r1;
        L_0x0052:
            r0 = r4.readResolveFallback();
            return r0;
        L_0x0057:
            r0 = move-exception;
            r1 = new java.lang.RuntimeException;
            r2 = new java.lang.StringBuilder;
            r2.<init>();
            r3 = "Unable to find proto buffer class: ";
            r2.append(r3);
            r3 = r4.messageClassName;
            r2.append(r3);
            r2 = r2.toString();
            r1.<init>(r2, r0);
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.GeneratedMessageLite.SerializedForm.readResolve():java.lang.Object");
        }

        @Deprecated
        private Object readResolveFallback() throws ObjectStreamException {
            StringBuilder stringBuilder;
            try {
                Field declaredField = Class.forName(this.messageClassName).getDeclaredField("defaultInstance");
                declaredField.setAccessible(true);
                return ((MessageLite) declaredField.get(null)).newBuilderForType().mergeFrom(this.asBytes).buildPartial();
            } catch (Throwable e) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to find proto buffer class: ");
                stringBuilder.append(this.messageClassName);
                throw new RuntimeException(stringBuilder.toString(), e);
            } catch (Throwable e2) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to find defaultInstance in ");
                stringBuilder.append(this.messageClassName);
                throw new RuntimeException(stringBuilder.toString(), e2);
            } catch (Throwable e22) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to call defaultInstance in ");
                stringBuilder.append(this.messageClassName);
                throw new RuntimeException(stringBuilder.toString(), e22);
            } catch (Throwable e222) {
                throw new RuntimeException("Unable to call parsePartialFrom", e222);
            } catch (Throwable e2222) {
                throw new RuntimeException("Unable to understand proto buffer", e2222);
            }
        }
    }

    protected interface Visitor {
        boolean visitBoolean(boolean z, boolean z2, boolean z3, boolean z4);

        BooleanList visitBooleanList(BooleanList booleanList, BooleanList booleanList2);

        ByteString visitByteString(boolean z, ByteString byteString, boolean z2, ByteString byteString2);

        double visitDouble(boolean z, double d, boolean z2, double d2);

        DoubleList visitDoubleList(DoubleList doubleList, DoubleList doubleList2);

        FieldSet<ExtensionDescriptor> visitExtensions(FieldSet<ExtensionDescriptor> fieldSet, FieldSet<ExtensionDescriptor> fieldSet2);

        float visitFloat(boolean z, float f, boolean z2, float f2);

        FloatList visitFloatList(FloatList floatList, FloatList floatList2);

        int visitInt(boolean z, int i, boolean z2, int i2);

        IntList visitIntList(IntList intList, IntList intList2);

        <T> ProtobufList<T> visitList(ProtobufList<T> protobufList, ProtobufList<T> protobufList2);

        long visitLong(boolean z, long j, boolean z2, long j2);

        LongList visitLongList(LongList longList, LongList longList2);

        <K, V> MapFieldLite<K, V> visitMap(MapFieldLite<K, V> mapFieldLite, MapFieldLite<K, V> mapFieldLite2);

        <T extends MessageLite> T visitMessage(T t, T t2);

        Object visitOneofBoolean(boolean z, Object obj, Object obj2);

        Object visitOneofByteString(boolean z, Object obj, Object obj2);

        Object visitOneofDouble(boolean z, Object obj, Object obj2);

        Object visitOneofFloat(boolean z, Object obj, Object obj2);

        Object visitOneofInt(boolean z, Object obj, Object obj2);

        Object visitOneofLong(boolean z, Object obj, Object obj2);

        Object visitOneofMessage(boolean z, Object obj, Object obj2);

        void visitOneofNotSet(boolean z);

        Object visitOneofString(boolean z, Object obj, Object obj2);

        String visitString(boolean z, String str, boolean z2, String str2);

        UnknownFieldSetLite visitUnknownFields(UnknownFieldSetLite unknownFieldSetLite, UnknownFieldSetLite unknownFieldSetLite2);
    }

    static class EqualsVisitor implements Visitor {
        static final EqualsVisitor INSTANCE = new EqualsVisitor();
        static final NotEqualsException NOT_EQUALS = new NotEqualsException();

        static final class NotEqualsException extends RuntimeException {
            NotEqualsException() {
            }
        }

        private EqualsVisitor() {
        }

        public boolean visitBoolean(boolean z, boolean z2, boolean z3, boolean z4) {
            if (z == z3) {
                if (z2 == z4) {
                    return z2;
                }
            }
            throw NOT_EQUALS;
        }

        public int visitInt(boolean z, int i, boolean z2, int i2) {
            if (z == z2) {
                if (i == i2) {
                    return i;
                }
            }
            throw NOT_EQUALS;
        }

        public double visitDouble(boolean z, double d, boolean z2, double d2) {
            if (z == z2) {
                if (d == d2) {
                    return d;
                }
            }
            throw NOT_EQUALS;
        }

        public float visitFloat(boolean z, float f, boolean z2, float f2) {
            if (z == z2) {
                if (f == f2) {
                    return f;
                }
            }
            throw NOT_EQUALS;
        }

        public long visitLong(boolean z, long j, boolean z2, long j2) {
            if (z == z2) {
                if (j == j2) {
                    return j;
                }
            }
            throw NOT_EQUALS;
        }

        public String visitString(boolean z, String str, boolean z2, String str2) {
            if (z == z2) {
                if (str.equals(str2)) {
                    return str;
                }
            }
            throw NOT_EQUALS;
        }

        public ByteString visitByteString(boolean z, ByteString byteString, boolean z2, ByteString byteString2) {
            if (z == z2) {
                if (byteString.equals(byteString2)) {
                    return byteString;
                }
            }
            throw NOT_EQUALS;
        }

        public Object visitOneofBoolean(boolean z, Object obj, Object obj2) {
            if (z && obj.equals(obj2)) {
                return obj;
            }
            throw NOT_EQUALS;
        }

        public Object visitOneofInt(boolean z, Object obj, Object obj2) {
            if (z && obj.equals(obj2)) {
                return obj;
            }
            throw NOT_EQUALS;
        }

        public Object visitOneofDouble(boolean z, Object obj, Object obj2) {
            if (z && obj.equals(obj2)) {
                return obj;
            }
            throw NOT_EQUALS;
        }

        public Object visitOneofFloat(boolean z, Object obj, Object obj2) {
            if (z && obj.equals(obj2)) {
                return obj;
            }
            throw NOT_EQUALS;
        }

        public Object visitOneofLong(boolean z, Object obj, Object obj2) {
            if (z && obj.equals(obj2)) {
                return obj;
            }
            throw NOT_EQUALS;
        }

        public Object visitOneofString(boolean z, Object obj, Object obj2) {
            if (z && obj.equals(obj2)) {
                return obj;
            }
            throw NOT_EQUALS;
        }

        public Object visitOneofByteString(boolean z, Object obj, Object obj2) {
            if (z && obj.equals(obj2)) {
                return obj;
            }
            throw NOT_EQUALS;
        }

        public Object visitOneofMessage(boolean z, Object obj, Object obj2) {
            if (z && ((GeneratedMessageLite) obj).equals(this, (MessageLite) obj2)) {
                return obj;
            }
            throw NOT_EQUALS;
        }

        public void visitOneofNotSet(boolean z) {
            if (z) {
                throw NOT_EQUALS;
            }
        }

        public <T extends MessageLite> T visitMessage(T t, T t2) {
            if (t == null && t2 == null) {
                return null;
            }
            if (t != null) {
                if (t2 != null) {
                    ((GeneratedMessageLite) t).equals(this, t2);
                    return t;
                }
            }
            throw NOT_EQUALS;
        }

        public <T> ProtobufList<T> visitList(ProtobufList<T> protobufList, ProtobufList<T> protobufList2) {
            if (protobufList.equals(protobufList2) != null) {
                return protobufList;
            }
            throw NOT_EQUALS;
        }

        public BooleanList visitBooleanList(BooleanList booleanList, BooleanList booleanList2) {
            if (booleanList.equals(booleanList2) != null) {
                return booleanList;
            }
            throw NOT_EQUALS;
        }

        public IntList visitIntList(IntList intList, IntList intList2) {
            if (intList.equals(intList2) != null) {
                return intList;
            }
            throw NOT_EQUALS;
        }

        public DoubleList visitDoubleList(DoubleList doubleList, DoubleList doubleList2) {
            if (doubleList.equals(doubleList2) != null) {
                return doubleList;
            }
            throw NOT_EQUALS;
        }

        public FloatList visitFloatList(FloatList floatList, FloatList floatList2) {
            if (floatList.equals(floatList2) != null) {
                return floatList;
            }
            throw NOT_EQUALS;
        }

        public LongList visitLongList(LongList longList, LongList longList2) {
            if (longList.equals(longList2) != null) {
                return longList;
            }
            throw NOT_EQUALS;
        }

        public FieldSet<ExtensionDescriptor> visitExtensions(FieldSet<ExtensionDescriptor> fieldSet, FieldSet<ExtensionDescriptor> fieldSet2) {
            if (fieldSet.equals(fieldSet2) != null) {
                return fieldSet;
            }
            throw NOT_EQUALS;
        }

        public UnknownFieldSetLite visitUnknownFields(UnknownFieldSetLite unknownFieldSetLite, UnknownFieldSetLite unknownFieldSetLite2) {
            if (unknownFieldSetLite.equals(unknownFieldSetLite2) != null) {
                return unknownFieldSetLite;
            }
            throw NOT_EQUALS;
        }

        public <K, V> MapFieldLite<K, V> visitMap(MapFieldLite<K, V> mapFieldLite, MapFieldLite<K, V> mapFieldLite2) {
            if (mapFieldLite.equals(mapFieldLite2) != null) {
                return mapFieldLite;
            }
            throw NOT_EQUALS;
        }
    }

    public interface ExtendableMessageOrBuilder<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends MessageLiteOrBuilder {
        <Type> Type getExtension(ExtensionLite<MessageType, Type> extensionLite);

        <Type> Type getExtension(ExtensionLite<MessageType, List<Type>> extensionLite, int i);

        <Type> int getExtensionCount(ExtensionLite<MessageType, List<Type>> extensionLite);

        <Type> boolean hasExtension(ExtensionLite<MessageType, Type> extensionLite);
    }

    static final class ExtensionDescriptor implements FieldDescriptorLite<ExtensionDescriptor> {
        final EnumLiteMap<?> enumTypeMap;
        final boolean isPacked;
        final boolean isRepeated;
        final int number;
        final FieldType type;

        ExtensionDescriptor(EnumLiteMap<?> enumLiteMap, int i, FieldType fieldType, boolean z, boolean z2) {
            this.enumTypeMap = enumLiteMap;
            this.number = i;
            this.type = fieldType;
            this.isRepeated = z;
            this.isPacked = z2;
        }

        public int getNumber() {
            return this.number;
        }

        public FieldType getLiteType() {
            return this.type;
        }

        public JavaType getLiteJavaType() {
            return this.type.getJavaType();
        }

        public boolean isRepeated() {
            return this.isRepeated;
        }

        public boolean isPacked() {
            return this.isPacked;
        }

        public EnumLiteMap<?> getEnumType() {
            return this.enumTypeMap;
        }

        public com.google.protobuf.MessageLite.Builder internalMergeFrom(com.google.protobuf.MessageLite.Builder builder, MessageLite messageLite) {
            return ((Builder) builder).mergeFrom((GeneratedMessageLite) messageLite);
        }

        public int compareTo(ExtensionDescriptor extensionDescriptor) {
            return this.number - extensionDescriptor.number;
        }
    }

    public static class GeneratedExtension<ContainingType extends MessageLite, Type> extends ExtensionLite<ContainingType, Type> {
        final ContainingType containingTypeDefaultInstance;
        final Type defaultValue;
        final ExtensionDescriptor descriptor;
        final MessageLite messageDefaultInstance;

        GeneratedExtension(ContainingType containingType, Type type, MessageLite messageLite, ExtensionDescriptor extensionDescriptor, Class cls) {
            if (containingType == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            } else if (extensionDescriptor.getLiteType() == FieldType.MESSAGE && messageLite == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            } else {
                this.containingTypeDefaultInstance = containingType;
                this.defaultValue = type;
                this.messageDefaultInstance = messageLite;
                this.descriptor = extensionDescriptor;
            }
        }

        public ContainingType getContainingTypeDefaultInstance() {
            return this.containingTypeDefaultInstance;
        }

        public int getNumber() {
            return this.descriptor.getNumber();
        }

        public MessageLite getMessageDefaultInstance() {
            return this.messageDefaultInstance;
        }

        Object fromFieldSetType(Object obj) {
            if (!this.descriptor.isRepeated()) {
                return singularFromFieldSetType(obj);
            }
            if (this.descriptor.getLiteJavaType() != JavaType.ENUM) {
                return obj;
            }
            List arrayList = new ArrayList();
            for (Object singularFromFieldSetType : (List) obj) {
                arrayList.add(singularFromFieldSetType(singularFromFieldSetType));
            }
            return arrayList;
        }

        Object singularFromFieldSetType(Object obj) {
            return this.descriptor.getLiteJavaType() == JavaType.ENUM ? this.descriptor.enumTypeMap.findValueByNumber(((Integer) obj).intValue()) : obj;
        }

        Object toFieldSetType(Object obj) {
            if (!this.descriptor.isRepeated()) {
                return singularToFieldSetType(obj);
            }
            if (this.descriptor.getLiteJavaType() != JavaType.ENUM) {
                return obj;
            }
            List arrayList = new ArrayList();
            for (Object singularToFieldSetType : (List) obj) {
                arrayList.add(singularToFieldSetType(singularToFieldSetType));
            }
            return arrayList;
        }

        Object singularToFieldSetType(Object obj) {
            return this.descriptor.getLiteJavaType() == JavaType.ENUM ? Integer.valueOf(((EnumLite) obj).getNumber()) : obj;
        }

        public FieldType getLiteType() {
            return this.descriptor.getLiteType();
        }

        public boolean isRepeated() {
            return this.descriptor.isRepeated;
        }

        public Type getDefaultValue() {
            return this.defaultValue;
        }
    }

    static class HashCodeVisitor implements Visitor {
        int hashCode = 0;

        HashCodeVisitor() {
        }

        public boolean visitBoolean(boolean z, boolean z2, boolean z3, boolean z4) {
            this.hashCode = (this.hashCode * 53) + Internal.hashBoolean(z2);
            return z2;
        }

        public int visitInt(boolean z, int i, boolean z2, int i2) {
            this.hashCode = (this.hashCode * 53) + i;
            return i;
        }

        public double visitDouble(boolean z, double d, boolean z2, double d2) {
            this.hashCode = (this.hashCode * 53) + Internal.hashLong(Double.doubleToLongBits(d));
            return d;
        }

        public float visitFloat(boolean z, float f, boolean z2, float f2) {
            this.hashCode = (this.hashCode * 53) + Float.floatToIntBits(f);
            return f;
        }

        public long visitLong(boolean z, long j, boolean z2, long j2) {
            this.hashCode = (this.hashCode * 53) + Internal.hashLong(j);
            return j;
        }

        public String visitString(boolean z, String str, boolean z2, String str2) {
            this.hashCode = (this.hashCode * 53) + str.hashCode();
            return str;
        }

        public ByteString visitByteString(boolean z, ByteString byteString, boolean z2, ByteString byteString2) {
            this.hashCode = (this.hashCode * 53) + byteString.hashCode();
            return byteString;
        }

        public Object visitOneofBoolean(boolean z, Object obj, Object obj2) {
            this.hashCode = (this.hashCode * 53) + Internal.hashBoolean(((Boolean) obj).booleanValue());
            return obj;
        }

        public Object visitOneofInt(boolean z, Object obj, Object obj2) {
            this.hashCode = (this.hashCode * 53) + ((Integer) obj).intValue();
            return obj;
        }

        public Object visitOneofDouble(boolean z, Object obj, Object obj2) {
            this.hashCode = (this.hashCode * 53) + Internal.hashLong(Double.doubleToLongBits(((Double) obj).doubleValue()));
            return obj;
        }

        public Object visitOneofFloat(boolean z, Object obj, Object obj2) {
            this.hashCode = (this.hashCode * 53) + Float.floatToIntBits(((Float) obj).floatValue());
            return obj;
        }

        public Object visitOneofLong(boolean z, Object obj, Object obj2) {
            this.hashCode = (this.hashCode * 53) + Internal.hashLong(((Long) obj).longValue());
            return obj;
        }

        public Object visitOneofString(boolean z, Object obj, Object obj2) {
            this.hashCode = (this.hashCode * 53) + obj.hashCode();
            return obj;
        }

        public Object visitOneofByteString(boolean z, Object obj, Object obj2) {
            this.hashCode = (this.hashCode * 53) + obj.hashCode();
            return obj;
        }

        public Object visitOneofMessage(boolean z, Object obj, Object obj2) {
            return visitMessage((MessageLite) obj, (MessageLite) obj2);
        }

        public void visitOneofNotSet(boolean z) {
            if (z) {
                throw new IllegalStateException();
            }
        }

        public <T extends MessageLite> T visitMessage(T t, T t2) {
            t2 = t != null ? (t instanceof GeneratedMessageLite) != null ? ((GeneratedMessageLite) t).hashCode(this) : t.hashCode() : 37;
            this.hashCode = (this.hashCode * 53) + t2;
            return t;
        }

        public <T> ProtobufList<T> visitList(ProtobufList<T> protobufList, ProtobufList<T> protobufList2) {
            this.hashCode = (this.hashCode * 53) + protobufList.hashCode();
            return protobufList;
        }

        public BooleanList visitBooleanList(BooleanList booleanList, BooleanList booleanList2) {
            this.hashCode = (this.hashCode * 53) + booleanList.hashCode();
            return booleanList;
        }

        public IntList visitIntList(IntList intList, IntList intList2) {
            this.hashCode = (this.hashCode * 53) + intList.hashCode();
            return intList;
        }

        public DoubleList visitDoubleList(DoubleList doubleList, DoubleList doubleList2) {
            this.hashCode = (this.hashCode * 53) + doubleList.hashCode();
            return doubleList;
        }

        public FloatList visitFloatList(FloatList floatList, FloatList floatList2) {
            this.hashCode = (this.hashCode * 53) + floatList.hashCode();
            return floatList;
        }

        public LongList visitLongList(LongList longList, LongList longList2) {
            this.hashCode = (this.hashCode * 53) + longList.hashCode();
            return longList;
        }

        public FieldSet<ExtensionDescriptor> visitExtensions(FieldSet<ExtensionDescriptor> fieldSet, FieldSet<ExtensionDescriptor> fieldSet2) {
            this.hashCode = (this.hashCode * 53) + fieldSet.hashCode();
            return fieldSet;
        }

        public UnknownFieldSetLite visitUnknownFields(UnknownFieldSetLite unknownFieldSetLite, UnknownFieldSetLite unknownFieldSetLite2) {
            this.hashCode = (this.hashCode * 53) + unknownFieldSetLite.hashCode();
            return unknownFieldSetLite;
        }

        public <K, V> MapFieldLite<K, V> visitMap(MapFieldLite<K, V> mapFieldLite, MapFieldLite<K, V> mapFieldLite2) {
            this.hashCode = (this.hashCode * 53) + mapFieldLite.hashCode();
            return mapFieldLite;
        }
    }

    protected static class MergeFromVisitor implements Visitor {
        public static final MergeFromVisitor INSTANCE = new MergeFromVisitor();

        public boolean visitBoolean(boolean z, boolean z2, boolean z3, boolean z4) {
            return z3 ? z4 : z2;
        }

        public ByteString visitByteString(boolean z, ByteString byteString, boolean z2, ByteString byteString2) {
            return z2 ? byteString2 : byteString;
        }

        public double visitDouble(boolean z, double d, boolean z2, double d2) {
            return z2 ? d2 : d;
        }

        public float visitFloat(boolean z, float f, boolean z2, float f2) {
            return z2 ? f2 : f;
        }

        public int visitInt(boolean z, int i, boolean z2, int i2) {
            return z2 ? i2 : i;
        }

        public long visitLong(boolean z, long j, boolean z2, long j2) {
            return z2 ? j2 : j;
        }

        public Object visitOneofBoolean(boolean z, Object obj, Object obj2) {
            return obj2;
        }

        public Object visitOneofByteString(boolean z, Object obj, Object obj2) {
            return obj2;
        }

        public Object visitOneofDouble(boolean z, Object obj, Object obj2) {
            return obj2;
        }

        public Object visitOneofFloat(boolean z, Object obj, Object obj2) {
            return obj2;
        }

        public Object visitOneofInt(boolean z, Object obj, Object obj2) {
            return obj2;
        }

        public Object visitOneofLong(boolean z, Object obj, Object obj2) {
            return obj2;
        }

        public void visitOneofNotSet(boolean z) {
        }

        public Object visitOneofString(boolean z, Object obj, Object obj2) {
            return obj2;
        }

        public String visitString(boolean z, String str, boolean z2, String str2) {
            return z2 ? str2 : str;
        }

        private MergeFromVisitor() {
        }

        public Object visitOneofMessage(boolean z, Object obj, Object obj2) {
            return z ? visitMessage((MessageLite) obj, (MessageLite) obj2) : obj2;
        }

        public <T extends MessageLite> T visitMessage(T t, T t2) {
            if (t != null && t2 != null) {
                return t.toBuilder().mergeFrom((MessageLite) t2).build();
            }
            if (t == null) {
                t = t2;
            }
            return t;
        }

        public <T> ProtobufList<T> visitList(ProtobufList<T> protobufList, ProtobufList<T> protobufList2) {
            int size = protobufList.size();
            int size2 = protobufList2.size();
            if (size > 0 && size2 > 0) {
                if (!protobufList.isModifiable()) {
                    protobufList = protobufList.mutableCopyWithCapacity(size2 + size);
                }
                protobufList.addAll(protobufList2);
            }
            return size > 0 ? protobufList : protobufList2;
        }

        public BooleanList visitBooleanList(BooleanList booleanList, BooleanList booleanList2) {
            int size = booleanList.size();
            int size2 = booleanList2.size();
            if (size > 0 && size2 > 0) {
                if (!booleanList.isModifiable()) {
                    booleanList = booleanList.mutableCopyWithCapacity(size2 + size);
                }
                booleanList.addAll(booleanList2);
            }
            return size > 0 ? booleanList : booleanList2;
        }

        public IntList visitIntList(IntList intList, IntList intList2) {
            int size = intList.size();
            int size2 = intList2.size();
            if (size > 0 && size2 > 0) {
                if (!intList.isModifiable()) {
                    intList = intList.mutableCopyWithCapacity(size2 + size);
                }
                intList.addAll(intList2);
            }
            return size > 0 ? intList : intList2;
        }

        public DoubleList visitDoubleList(DoubleList doubleList, DoubleList doubleList2) {
            int size = doubleList.size();
            int size2 = doubleList2.size();
            if (size > 0 && size2 > 0) {
                if (!doubleList.isModifiable()) {
                    doubleList = doubleList.mutableCopyWithCapacity(size2 + size);
                }
                doubleList.addAll(doubleList2);
            }
            return size > 0 ? doubleList : doubleList2;
        }

        public FloatList visitFloatList(FloatList floatList, FloatList floatList2) {
            int size = floatList.size();
            int size2 = floatList2.size();
            if (size > 0 && size2 > 0) {
                if (!floatList.isModifiable()) {
                    floatList = floatList.mutableCopyWithCapacity(size2 + size);
                }
                floatList.addAll(floatList2);
            }
            return size > 0 ? floatList : floatList2;
        }

        public LongList visitLongList(LongList longList, LongList longList2) {
            int size = longList.size();
            int size2 = longList2.size();
            if (size > 0 && size2 > 0) {
                if (!longList.isModifiable()) {
                    longList = longList.mutableCopyWithCapacity(size2 + size);
                }
                longList.addAll(longList2);
            }
            return size > 0 ? longList : longList2;
        }

        public FieldSet<ExtensionDescriptor> visitExtensions(FieldSet<ExtensionDescriptor> fieldSet, FieldSet<ExtensionDescriptor> fieldSet2) {
            if (fieldSet.isImmutable()) {
                fieldSet = fieldSet.clone();
            }
            fieldSet.mergeFrom(fieldSet2);
            return fieldSet;
        }

        public UnknownFieldSetLite visitUnknownFields(UnknownFieldSetLite unknownFieldSetLite, UnknownFieldSetLite unknownFieldSetLite2) {
            return unknownFieldSetLite2 == UnknownFieldSetLite.getDefaultInstance() ? unknownFieldSetLite : UnknownFieldSetLite.mutableCopyOf(unknownFieldSetLite, unknownFieldSetLite2);
        }

        public <K, V> MapFieldLite<K, V> visitMap(MapFieldLite<K, V> mapFieldLite, MapFieldLite<K, V> mapFieldLite2) {
            if (!mapFieldLite2.isEmpty()) {
                if (!mapFieldLite.isMutable()) {
                    mapFieldLite = mapFieldLite.mutableCopy();
                }
                mapFieldLite.mergeFrom(mapFieldLite2);
            }
            return mapFieldLite;
        }
    }

    protected static class DefaultInstanceBasedParser<T extends GeneratedMessageLite<T, ?>> extends AbstractParser<T> {
        private T defaultInstance;

        public DefaultInstanceBasedParser(T t) {
            this.defaultInstance = t;
        }

        public T parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parsePartialFrom(this.defaultInstance, codedInputStream, extensionRegistryLite);
        }
    }

    public static abstract class Builder<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends com.google.protobuf.AbstractMessageLite.Builder<MessageType, BuilderType> {
        private final MessageType defaultInstance;
        protected MessageType instance;
        protected boolean isBuilt = null;

        protected Builder(MessageType messageType) {
            this.defaultInstance = messageType;
            this.instance = (GeneratedMessageLite) messageType.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        }

        protected void copyOnWrite() {
            if (this.isBuilt) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) this.instance.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
                mergeFromInstance(generatedMessageLite, this.instance);
                this.instance = generatedMessageLite;
                this.isBuilt = false;
            }
        }

        public final boolean isInitialized() {
            return GeneratedMessageLite.isInitialized(this.instance, false);
        }

        public final BuilderType clear() {
            this.instance = (GeneratedMessageLite) this.instance.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
            return this;
        }

        public BuilderType clone() {
            BuilderType newBuilderForType = getDefaultInstanceForType().newBuilderForType();
            newBuilderForType.mergeFrom(buildPartial());
            return newBuilderForType;
        }

        public MessageType buildPartial() {
            if (this.isBuilt) {
                return this.instance;
            }
            this.instance.makeImmutable();
            this.isBuilt = true;
            return this.instance;
        }

        public final MessageType build() {
            MessageType buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw com.google.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(buildPartial);
        }

        protected BuilderType internalMergeFrom(MessageType messageType) {
            return mergeFrom(messageType);
        }

        public BuilderType mergeFrom(MessageType messageType) {
            copyOnWrite();
            mergeFromInstance(this.instance, messageType);
            return this;
        }

        private void mergeFromInstance(MessageType messageType, MessageType messageType2) {
            messageType.visit(MergeFromVisitor.INSTANCE, messageType2);
        }

        public MessageType getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        public BuilderType mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            copyOnWrite();
            try {
                this.instance.dynamicMethod(MethodToInvoke.MERGE_FROM_STREAM, codedInputStream, extensionRegistryLite);
                return this;
            } catch (CodedInputStream codedInputStream2) {
                if ((codedInputStream2.getCause() instanceof IOException) != null) {
                    throw ((IOException) codedInputStream2.getCause());
                }
                throw codedInputStream2;
            }
        }
    }

    public static abstract class ExtendableBuilder<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends Builder<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        protected ExtendableBuilder(MessageType messageType) {
            super(messageType);
        }

        void internalSetExtensionSet(FieldSet<ExtensionDescriptor> fieldSet) {
            copyOnWrite();
            ((ExtendableMessage) this.instance).extensions = fieldSet;
        }

        protected void copyOnWrite() {
            if (this.isBuilt) {
                super.copyOnWrite();
                ((ExtendableMessage) this.instance).extensions = ((ExtendableMessage) this.instance).extensions.clone();
            }
        }

        public final MessageType buildPartial() {
            if (this.isBuilt) {
                return (ExtendableMessage) this.instance;
            }
            ((ExtendableMessage) this.instance).extensions.makeImmutable();
            return (ExtendableMessage) super.buildPartial();
        }

        private void verifyExtensionContainingType(GeneratedExtension<MessageType, ?> generatedExtension) {
            if (generatedExtension.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public final <Type> boolean hasExtension(ExtensionLite<MessageType, Type> extensionLite) {
            return ((ExtendableMessage) this.instance).hasExtension(extensionLite);
        }

        public final <Type> int getExtensionCount(ExtensionLite<MessageType, List<Type>> extensionLite) {
            return ((ExtendableMessage) this.instance).getExtensionCount(extensionLite);
        }

        public final <Type> Type getExtension(ExtensionLite<MessageType, Type> extensionLite) {
            return ((ExtendableMessage) this.instance).getExtension(extensionLite);
        }

        public final <Type> Type getExtension(ExtensionLite<MessageType, List<Type>> extensionLite, int i) {
            return ((ExtendableMessage) this.instance).getExtension(extensionLite, i);
        }

        public final <Type> BuilderType setExtension(ExtensionLite<MessageType, Type> extensionLite, Type type) {
            extensionLite = GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(extensionLite);
            copyOnWrite();
            ((ExtendableMessage) this.instance).extensions.setField(extensionLite.descriptor, extensionLite.toFieldSetType(type));
            return this;
        }

        public final <Type> BuilderType setExtension(ExtensionLite<MessageType, List<Type>> extensionLite, int i, Type type) {
            extensionLite = GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(extensionLite);
            copyOnWrite();
            ((ExtendableMessage) this.instance).extensions.setRepeatedField(extensionLite.descriptor, i, extensionLite.singularToFieldSetType(type));
            return this;
        }

        public final <Type> BuilderType addExtension(ExtensionLite<MessageType, List<Type>> extensionLite, Type type) {
            extensionLite = GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(extensionLite);
            copyOnWrite();
            ((ExtendableMessage) this.instance).extensions.addRepeatedField(extensionLite.descriptor, extensionLite.singularToFieldSetType(type));
            return this;
        }

        public final <Type> BuilderType clearExtension(ExtensionLite<MessageType, ?> extensionLite) {
            extensionLite = GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(extensionLite);
            copyOnWrite();
            ((ExtendableMessage) this.instance).extensions.clearField(extensionLite.descriptor);
            return this;
        }
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends GeneratedMessageLite<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        protected FieldSet<ExtensionDescriptor> extensions = FieldSet.newFieldSet();

        protected class ExtensionWriter {
            private final Iterator<Entry<ExtensionDescriptor, Object>> iter;
            private final boolean messageSetWireFormat;
            private Entry<ExtensionDescriptor, Object> next;

            private ExtensionWriter(boolean z) {
                this.iter = ExtendableMessage.this.extensions.iterator();
                if (this.iter.hasNext() != null) {
                    this.next = (Entry) this.iter.next();
                }
                this.messageSetWireFormat = z;
            }

            public void writeUntil(int i, CodedOutputStream codedOutputStream) throws IOException {
                while (this.next != null && ((ExtensionDescriptor) this.next.getKey()).getNumber() < i) {
                    ExtensionDescriptor extensionDescriptor = (ExtensionDescriptor) this.next.getKey();
                    if (this.messageSetWireFormat && extensionDescriptor.getLiteJavaType() == JavaType.MESSAGE && !extensionDescriptor.isRepeated()) {
                        codedOutputStream.writeMessageSetExtension(extensionDescriptor.getNumber(), (MessageLite) this.next.getValue());
                    } else {
                        FieldSet.writeField(extensionDescriptor, this.next.getValue(), codedOutputStream);
                    }
                    if (this.iter.hasNext()) {
                        this.next = (Entry) this.iter.next();
                    } else {
                        this.next = null;
                    }
                }
            }
        }

        public /* bridge */ /* synthetic */ MessageLite getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        public /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder newBuilderForType() {
            return super.newBuilderForType();
        }

        public /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder toBuilder() {
            return super.toBuilder();
        }

        protected final void mergeExtensionFields(MessageType messageType) {
            if (this.extensions.isImmutable()) {
                this.extensions = this.extensions.clone();
            }
            this.extensions.mergeFrom(messageType.extensions);
        }

        final void visit(Visitor visitor, MessageType messageType) {
            super.visit(visitor, messageType);
            this.extensions = visitor.visitExtensions(this.extensions, messageType.extensions);
        }

        protected <MessageType extends MessageLite> boolean parseUnknownField(MessageType messageType, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, int i) throws IOException {
            int tagFieldNumber = WireFormat.getTagFieldNumber(i);
            return parseExtension(codedInputStream, extensionRegistryLite, extensionRegistryLite.findLiteExtensionByNumber(messageType, tagFieldNumber), i, tagFieldNumber);
        }

        private boolean parseExtension(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, GeneratedExtension<?, ?> generatedExtension, int i, int i2) throws IOException {
            Object obj;
            Object obj2;
            com.google.protobuf.MessageLite.Builder builder;
            MessageLite messageLite;
            int tagWireType = WireFormat.getTagWireType(i);
            if (generatedExtension != null) {
                if (tagWireType == FieldSet.getWireFormatForFieldType(generatedExtension.descriptor.getLiteType(), false)) {
                    obj = null;
                    obj2 = null;
                    if (obj == null) {
                        return parseUnknownField(i, codedInputStream);
                    }
                    if (obj2 != null) {
                        extensionRegistryLite = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                        if (generatedExtension.descriptor.getLiteType() == FieldType.ENUM) {
                            while (codedInputStream.getBytesUntilLimit() > 0) {
                                i = generatedExtension.descriptor.getEnumType().findValueByNumber(codedInputStream.readEnum());
                                if (i != 0) {
                                    return true;
                                }
                                this.extensions.addRepeatedField(generatedExtension.descriptor, generatedExtension.singularToFieldSetType(i));
                            }
                        } else {
                            while (codedInputStream.getBytesUntilLimit() > 0) {
                                this.extensions.addRepeatedField(generatedExtension.descriptor, FieldSet.readPrimitiveField(codedInputStream, generatedExtension.descriptor.getLiteType(), false));
                            }
                        }
                        codedInputStream.popLimit(extensionRegistryLite);
                    } else {
                        switch (generatedExtension.descriptor.getLiteJavaType()) {
                            case MESSAGE:
                                builder = 0;
                                if (generatedExtension.descriptor.isRepeated() == 0) {
                                    messageLite = (MessageLite) this.extensions.getField(generatedExtension.descriptor);
                                    if (messageLite != null) {
                                        builder = messageLite.toBuilder();
                                    }
                                }
                                if (builder == 0) {
                                    builder = generatedExtension.getMessageDefaultInstance().newBuilderForType();
                                }
                                if (generatedExtension.descriptor.getLiteType() == FieldType.GROUP) {
                                    codedInputStream.readGroup(generatedExtension.getNumber(), builder, extensionRegistryLite);
                                } else {
                                    codedInputStream.readMessage(builder, extensionRegistryLite);
                                }
                                extensionRegistryLite = builder.build();
                                break;
                            case ENUM:
                                codedInputStream = codedInputStream.readEnum();
                                extensionRegistryLite = generatedExtension.descriptor.getEnumType().findValueByNumber(codedInputStream);
                                if (extensionRegistryLite == null) {
                                    mergeVarintField(i2, codedInputStream);
                                    return true;
                                }
                                break;
                            default:
                                extensionRegistryLite = FieldSet.readPrimitiveField(codedInputStream, generatedExtension.descriptor.getLiteType(), false);
                                break;
                        }
                        if (generatedExtension.descriptor.isRepeated() != null) {
                            this.extensions.addRepeatedField(generatedExtension.descriptor, generatedExtension.singularToFieldSetType(extensionRegistryLite));
                        } else {
                            this.extensions.setField(generatedExtension.descriptor, generatedExtension.singularToFieldSetType(extensionRegistryLite));
                        }
                    }
                    return true;
                } else if (generatedExtension.descriptor.isRepeated && generatedExtension.descriptor.type.isPackable() && tagWireType == FieldSet.getWireFormatForFieldType(generatedExtension.descriptor.getLiteType(), true)) {
                    obj = null;
                    obj2 = 1;
                    if (obj == null) {
                        return parseUnknownField(i, codedInputStream);
                    }
                    if (obj2 != null) {
                        switch (generatedExtension.descriptor.getLiteJavaType()) {
                            case MESSAGE:
                                builder = 0;
                                if (generatedExtension.descriptor.isRepeated() == 0) {
                                    messageLite = (MessageLite) this.extensions.getField(generatedExtension.descriptor);
                                    if (messageLite != null) {
                                        builder = messageLite.toBuilder();
                                    }
                                }
                                if (builder == 0) {
                                    builder = generatedExtension.getMessageDefaultInstance().newBuilderForType();
                                }
                                if (generatedExtension.descriptor.getLiteType() == FieldType.GROUP) {
                                    codedInputStream.readMessage(builder, extensionRegistryLite);
                                } else {
                                    codedInputStream.readGroup(generatedExtension.getNumber(), builder, extensionRegistryLite);
                                }
                                extensionRegistryLite = builder.build();
                                break;
                            case ENUM:
                                codedInputStream = codedInputStream.readEnum();
                                extensionRegistryLite = generatedExtension.descriptor.getEnumType().findValueByNumber(codedInputStream);
                                if (extensionRegistryLite == null) {
                                    mergeVarintField(i2, codedInputStream);
                                    return true;
                                }
                                break;
                            default:
                                extensionRegistryLite = FieldSet.readPrimitiveField(codedInputStream, generatedExtension.descriptor.getLiteType(), false);
                                break;
                        }
                        if (generatedExtension.descriptor.isRepeated() != null) {
                            this.extensions.setField(generatedExtension.descriptor, generatedExtension.singularToFieldSetType(extensionRegistryLite));
                        } else {
                            this.extensions.addRepeatedField(generatedExtension.descriptor, generatedExtension.singularToFieldSetType(extensionRegistryLite));
                        }
                    } else {
                        extensionRegistryLite = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                        if (generatedExtension.descriptor.getLiteType() == FieldType.ENUM) {
                            while (codedInputStream.getBytesUntilLimit() > 0) {
                                this.extensions.addRepeatedField(generatedExtension.descriptor, FieldSet.readPrimitiveField(codedInputStream, generatedExtension.descriptor.getLiteType(), false));
                            }
                        } else {
                            while (codedInputStream.getBytesUntilLimit() > 0) {
                                i = generatedExtension.descriptor.getEnumType().findValueByNumber(codedInputStream.readEnum());
                                if (i != 0) {
                                    return true;
                                }
                                this.extensions.addRepeatedField(generatedExtension.descriptor, generatedExtension.singularToFieldSetType(i));
                            }
                        }
                        codedInputStream.popLimit(extensionRegistryLite);
                    }
                    return true;
                }
            }
            obj = 1;
            obj2 = null;
            if (obj == null) {
                return parseUnknownField(i, codedInputStream);
            }
            if (obj2 != null) {
                extensionRegistryLite = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                if (generatedExtension.descriptor.getLiteType() == FieldType.ENUM) {
                    while (codedInputStream.getBytesUntilLimit() > 0) {
                        i = generatedExtension.descriptor.getEnumType().findValueByNumber(codedInputStream.readEnum());
                        if (i != 0) {
                            return true;
                        }
                        this.extensions.addRepeatedField(generatedExtension.descriptor, generatedExtension.singularToFieldSetType(i));
                    }
                } else {
                    while (codedInputStream.getBytesUntilLimit() > 0) {
                        this.extensions.addRepeatedField(generatedExtension.descriptor, FieldSet.readPrimitiveField(codedInputStream, generatedExtension.descriptor.getLiteType(), false));
                    }
                }
                codedInputStream.popLimit(extensionRegistryLite);
            } else {
                switch (generatedExtension.descriptor.getLiteJavaType()) {
                    case MESSAGE:
                        builder = 0;
                        if (generatedExtension.descriptor.isRepeated() == 0) {
                            messageLite = (MessageLite) this.extensions.getField(generatedExtension.descriptor);
                            if (messageLite != null) {
                                builder = messageLite.toBuilder();
                            }
                        }
                        if (builder == 0) {
                            builder = generatedExtension.getMessageDefaultInstance().newBuilderForType();
                        }
                        if (generatedExtension.descriptor.getLiteType() == FieldType.GROUP) {
                            codedInputStream.readGroup(generatedExtension.getNumber(), builder, extensionRegistryLite);
                        } else {
                            codedInputStream.readMessage(builder, extensionRegistryLite);
                        }
                        extensionRegistryLite = builder.build();
                        break;
                    case ENUM:
                        codedInputStream = codedInputStream.readEnum();
                        extensionRegistryLite = generatedExtension.descriptor.getEnumType().findValueByNumber(codedInputStream);
                        if (extensionRegistryLite == null) {
                            mergeVarintField(i2, codedInputStream);
                            return true;
                        }
                        break;
                    default:
                        extensionRegistryLite = FieldSet.readPrimitiveField(codedInputStream, generatedExtension.descriptor.getLiteType(), false);
                        break;
                }
                if (generatedExtension.descriptor.isRepeated() != null) {
                    this.extensions.addRepeatedField(generatedExtension.descriptor, generatedExtension.singularToFieldSetType(extensionRegistryLite));
                } else {
                    this.extensions.setField(generatedExtension.descriptor, generatedExtension.singularToFieldSetType(extensionRegistryLite));
                }
            }
            return true;
        }

        protected <MessageType extends MessageLite> boolean parseUnknownFieldAsMessageSet(MessageType messageType, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, int i) throws IOException {
            if (i == WireFormat.MESSAGE_SET_ITEM_TAG) {
                mergeMessageSetExtensionFromCodedStream(messageType, codedInputStream, extensionRegistryLite);
                return true;
            } else if (WireFormat.getTagWireType(i) == 2) {
                return parseUnknownField(messageType, codedInputStream, extensionRegistryLite, i);
            } else {
                return codedInputStream.skipField(i);
            }
        }

        private <MessageType extends MessageLite> void mergeMessageSetExtensionFromCodedStream(MessageType messageType, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int i = 0;
            GeneratedExtension generatedExtension = null;
            ByteString byteString = generatedExtension;
            while (true) {
                int readTag = codedInputStream.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
                    i = codedInputStream.readUInt32();
                    if (i != 0) {
                        generatedExtension = extensionRegistryLite.findLiteExtensionByNumber(messageType, i);
                    }
                } else if (readTag == WireFormat.MESSAGE_SET_MESSAGE_TAG) {
                    if (i == 0 || generatedExtension == null) {
                        byteString = codedInputStream.readBytes();
                    } else {
                        eagerlyMergeMessageSetExtension(codedInputStream, generatedExtension, extensionRegistryLite, i);
                        byteString = null;
                    }
                } else if (!codedInputStream.skipField(readTag)) {
                    break;
                }
            }
            codedInputStream.checkLastTagWas(WireFormat.MESSAGE_SET_ITEM_END_TAG);
            if (byteString != null && i != 0) {
                if (generatedExtension != null) {
                    mergeMessageSetExtensionFromBytes(byteString, extensionRegistryLite, generatedExtension);
                } else if (byteString != null) {
                    mergeLengthDelimitedField(i, byteString);
                }
            }
        }

        private void eagerlyMergeMessageSetExtension(CodedInputStream codedInputStream, GeneratedExtension<?, ?> generatedExtension, ExtensionRegistryLite extensionRegistryLite, int i) throws IOException {
            parseExtension(codedInputStream, extensionRegistryLite, generatedExtension, WireFormat.makeTag(i, 2), i);
        }

        private void mergeMessageSetExtensionFromBytes(ByteString byteString, ExtensionRegistryLite extensionRegistryLite, GeneratedExtension<?, ?> generatedExtension) throws IOException {
            MessageLite messageLite = (MessageLite) this.extensions.getField(generatedExtension.descriptor);
            com.google.protobuf.MessageLite.Builder toBuilder = messageLite != null ? messageLite.toBuilder() : null;
            if (toBuilder == null) {
                toBuilder = generatedExtension.getMessageDefaultInstance().newBuilderForType();
            }
            byteString.newCodedInput().readMessage(toBuilder, extensionRegistryLite);
            this.extensions.setField(generatedExtension.descriptor, generatedExtension.singularToFieldSetType(toBuilder.build()));
        }

        private void verifyExtensionContainingType(GeneratedExtension<MessageType, ?> generatedExtension) {
            if (generatedExtension.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public final <Type> boolean hasExtension(ExtensionLite<MessageType, Type> extensionLite) {
            extensionLite = GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(extensionLite);
            return this.extensions.hasField(extensionLite.descriptor);
        }

        public final <Type> int getExtensionCount(ExtensionLite<MessageType, List<Type>> extensionLite) {
            extensionLite = GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(extensionLite);
            return this.extensions.getRepeatedFieldCount(extensionLite.descriptor);
        }

        public final <Type> Type getExtension(ExtensionLite<MessageType, Type> extensionLite) {
            extensionLite = GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(extensionLite);
            Object field = this.extensions.getField(extensionLite.descriptor);
            if (field == null) {
                return extensionLite.defaultValue;
            }
            return extensionLite.fromFieldSetType(field);
        }

        public final <Type> Type getExtension(ExtensionLite<MessageType, List<Type>> extensionLite, int i) {
            extensionLite = GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(extensionLite);
            return extensionLite.singularFromFieldSetType(this.extensions.getRepeatedField(extensionLite.descriptor, i));
        }

        protected boolean extensionsAreInitialized() {
            return this.extensions.isInitialized();
        }

        protected final void makeImmutable() {
            super.makeImmutable();
            this.extensions.makeImmutable();
        }

        protected ExtensionWriter newExtensionWriter() {
            return new ExtensionWriter(false);
        }

        protected ExtensionWriter newMessageSetExtensionWriter() {
            return new ExtensionWriter(true);
        }

        protected int extensionsSerializedSize() {
            return this.extensions.getSerializedSize();
        }

        protected int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.getMessageSetSerializedSize();
        }
    }

    protected abstract Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2);

    public final Parser<MessageType> getParserForType() {
        return (Parser) dynamicMethod(MethodToInvoke.GET_PARSER);
    }

    public final MessageType getDefaultInstanceForType() {
        return (GeneratedMessageLite) dynamicMethod(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    public final BuilderType newBuilderForType() {
        return (Builder) dynamicMethod(MethodToInvoke.NEW_BUILDER);
    }

    public String toString() {
        return MessageLiteToString.toString(this, super.toString());
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        Object hashCodeVisitor = new HashCodeVisitor();
        visit(hashCodeVisitor, this);
        this.memoizedHashCode = hashCodeVisitor.hashCode;
        return this.memoizedHashCode;
    }

    int hashCode(HashCodeVisitor hashCodeVisitor) {
        if (this.memoizedHashCode == 0) {
            int i = hashCodeVisitor.hashCode;
            hashCodeVisitor.hashCode = 0;
            visit(hashCodeVisitor, this);
            this.memoizedHashCode = hashCodeVisitor.hashCode;
            hashCodeVisitor.hashCode = i;
        }
        return this.memoizedHashCode;
    }

    public boolean equals(java.lang.Object r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r3 = this;
        r0 = 1;
        if (r3 != r4) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r3.getDefaultInstanceForType();
        r1 = r1.getClass();
        r1 = r1.isInstance(r4);
        r2 = 0;
        if (r1 != 0) goto L_0x0014;
    L_0x0013:
        return r2;
    L_0x0014:
        r1 = com.google.protobuf.GeneratedMessageLite.EqualsVisitor.INSTANCE;	 Catch:{ NotEqualsException -> 0x001c }
        r4 = (com.google.protobuf.GeneratedMessageLite) r4;	 Catch:{ NotEqualsException -> 0x001c }
        r3.visit(r1, r4);	 Catch:{ NotEqualsException -> 0x001c }
        return r0;
    L_0x001c:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.GeneratedMessageLite.equals(java.lang.Object):boolean");
    }

    boolean equals(EqualsVisitor equalsVisitor, MessageLite messageLite) {
        if (this == messageLite) {
            return true;
        }
        if (!getDefaultInstanceForType().getClass().isInstance(messageLite)) {
            return null;
        }
        visit(equalsVisitor, (GeneratedMessageLite) messageLite);
        return true;
    }

    private final void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == UnknownFieldSetLite.getDefaultInstance()) {
            this.unknownFields = UnknownFieldSetLite.newInstance();
        }
    }

    protected boolean parseUnknownField(int i, CodedInputStream codedInputStream) throws IOException {
        if (WireFormat.getTagWireType(i) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.mergeFieldFrom(i, codedInputStream);
    }

    protected void mergeVarintField(int i, int i2) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.mergeVarintField(i, i2);
    }

    protected void mergeLengthDelimitedField(int i, ByteString byteString) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.mergeLengthDelimitedField(i, byteString);
    }

    protected void makeImmutable() {
        dynamicMethod(MethodToInvoke.MAKE_IMMUTABLE);
        this.unknownFields.makeImmutable();
    }

    public final boolean isInitialized() {
        return dynamicMethod(MethodToInvoke.IS_INITIALIZED, Boolean.TRUE) != null;
    }

    public final BuilderType toBuilder() {
        Builder builder = (Builder) dynamicMethod(MethodToInvoke.NEW_BUILDER);
        builder.mergeFrom(this);
        return builder;
    }

    protected Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj) {
        return dynamicMethod(methodToInvoke, obj, null);
    }

    protected Object dynamicMethod(MethodToInvoke methodToInvoke) {
        return dynamicMethod(methodToInvoke, null, null);
    }

    void visit(Visitor visitor, MessageType messageType) {
        dynamicMethod(MethodToInvoke.VISIT, visitor, messageType);
        this.unknownFields = visitor.visitUnknownFields(this.unknownFields, messageType.unknownFields);
    }

    protected final void mergeUnknownFields(UnknownFieldSetLite unknownFieldSetLite) {
        this.unknownFields = UnknownFieldSetLite.mutableCopyOf(this.unknownFields, unknownFieldSetLite);
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingType, Type type, MessageLite messageLite, EnumLiteMap<?> enumLiteMap, int i, FieldType fieldType, Class cls) {
        return new GeneratedExtension(containingType, type, messageLite, new ExtensionDescriptor(enumLiteMap, i, fieldType, false, false), cls);
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingType, MessageLite messageLite, EnumLiteMap<?> enumLiteMap, int i, FieldType fieldType, boolean z, Class cls) {
        return new GeneratedExtension(containingType, Collections.emptyList(), messageLite, new ExtensionDescriptor(enumLiteMap, i, fieldType, true, z), cls);
    }

    static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (Class[] clsArr2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Generated message class \"");
            stringBuilder.append(cls.getName());
            stringBuilder.append("\" missing method \"");
            stringBuilder.append(str);
            stringBuilder.append("\".");
            throw new RuntimeException(stringBuilder.toString(), clsArr2);
        }
    }

    static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (Method method2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", method2);
        } catch (Method method22) {
            method22 = method22.getCause();
            if ((method22 instanceof RuntimeException) != null) {
                throw ((RuntimeException) method22);
            } else if ((method22 instanceof Error) != null) {
                throw ((Error) method22);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", method22);
            }
        }
    }

    private static <MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>, T> GeneratedExtension<MessageType, T> checkIsLite(ExtensionLite<MessageType, T> extensionLite) {
        if (extensionLite.isLite()) {
            return (GeneratedExtension) extensionLite;
        }
        throw new IllegalArgumentException("Expected a lite extension.");
    }

    protected static final <T extends GeneratedMessageLite<T, ?>> boolean isInitialized(T t, boolean z) {
        return t.dynamicMethod(MethodToInvoke.IS_INITIALIZED, Boolean.valueOf(z)) != null ? true : null;
    }

    protected static final <T extends GeneratedMessageLite<T, ?>> void makeImmutable(T t) {
        t.dynamicMethod(MethodToInvoke.MAKE_IMMUTABLE);
    }

    protected static IntList emptyIntList() {
        return IntArrayList.emptyList();
    }

    protected static IntList mutableCopy(IntList intList) {
        int size = intList.size();
        return intList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    protected static LongList emptyLongList() {
        return LongArrayList.emptyList();
    }

    protected static LongList mutableCopy(LongList longList) {
        int size = longList.size();
        return longList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    protected static FloatList emptyFloatList() {
        return FloatArrayList.emptyList();
    }

    protected static FloatList mutableCopy(FloatList floatList) {
        int size = floatList.size();
        return floatList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    protected static DoubleList emptyDoubleList() {
        return DoubleArrayList.emptyList();
    }

    protected static DoubleList mutableCopy(DoubleList doubleList) {
        int size = doubleList.size();
        return doubleList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    protected static BooleanList emptyBooleanList() {
        return BooleanArrayList.emptyList();
    }

    protected static BooleanList mutableCopy(BooleanList booleanList) {
        int size = booleanList.size();
        return booleanList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    protected static <E> ProtobufList<E> emptyProtobufList() {
        return ProtobufArrayList.emptyList();
    }

    protected static <E> ProtobufList<E> mutableCopy(ProtobufList<E> protobufList) {
        int size = protobufList.size();
        return protobufList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            generatedMessageLite.dynamicMethod(MethodToInvoke.MERGE_FROM_STREAM, codedInputStream, extensionRegistryLite);
            generatedMessageLite.makeImmutable();
            return generatedMessageLite;
        } catch (T t2) {
            if ((t2.getCause() instanceof InvalidProtocolBufferException) != null) {
                throw ((InvalidProtocolBufferException) t2.getCause());
            }
            throw t2;
        }
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, CodedInputStream codedInputStream) throws InvalidProtocolBufferException {
        return parsePartialFrom((GeneratedMessageLite) t, codedInputStream, ExtensionRegistryLite.getEmptyRegistry());
    }

    private static <T extends GeneratedMessageLite<T, ?>> T checkMessageInitialized(T t) throws InvalidProtocolBufferException {
        if (t == null || t.isInitialized()) {
            return t;
        }
        throw t.newUninitializedMessageException().asInvalidProtocolBufferException().setUnfinishedMessage(t);
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parseFrom((GeneratedMessageLite) t, CodedInputStream.newInstance(byteBuffer), extensionRegistryLite));
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return parseFrom((GeneratedMessageLite) t, byteBuffer, ExtensionRegistryLite.getEmptyRegistry());
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteString byteString) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parseFrom((GeneratedMessageLite) t, byteString, ExtensionRegistryLite.getEmptyRegistry()));
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom((GeneratedMessageLite) t, byteString, extensionRegistryLite));
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        try {
            CodedInputStream newCodedInput = byteString.newCodedInput();
            t = parsePartialFrom((GeneratedMessageLite) t, newCodedInput, extensionRegistryLite);
            newCodedInput.checkLastTagWas(null);
            return t;
        } catch (ByteString byteString2) {
            throw byteString2.setUnfinishedMessage(t);
        } catch (T t2) {
            throw t2;
        }
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        try {
            CodedInputStream newInstance = CodedInputStream.newInstance(bArr);
            t = parsePartialFrom((GeneratedMessageLite) t, newInstance, extensionRegistryLite);
            newInstance.checkLastTagWas(null);
            return t;
        } catch (byte[] bArr2) {
            throw bArr2.setUnfinishedMessage(t);
        } catch (T t2) {
            throw t2;
        }
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom((GeneratedMessageLite) t, bArr, ExtensionRegistryLite.getEmptyRegistry()));
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom((GeneratedMessageLite) t, bArr, extensionRegistryLite));
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom((GeneratedMessageLite) t, CodedInputStream.newInstance(inputStream), ExtensionRegistryLite.getEmptyRegistry()));
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom((GeneratedMessageLite) t, CodedInputStream.newInstance(inputStream), extensionRegistryLite));
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, CodedInputStream codedInputStream) throws InvalidProtocolBufferException {
        return parseFrom((GeneratedMessageLite) t, codedInputStream, ExtensionRegistryLite.getEmptyRegistry());
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom((GeneratedMessageLite) t, codedInputStream, extensionRegistryLite));
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, ExtensionRegistryLite.getEmptyRegistry()));
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, extensionRegistryLite));
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialDelimitedFrom(T t, InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            CodedInputStream newInstance = CodedInputStream.newInstance(new LimitedInputStream(inputStream, CodedInputStream.readRawVarint32(read, inputStream)));
            t = parsePartialFrom((GeneratedMessageLite) t, newInstance, extensionRegistryLite);
            try {
                newInstance.checkLastTagWas(null);
                return t;
            } catch (InputStream inputStream2) {
                throw inputStream2.setUnfinishedMessage(t);
            }
        } catch (T t2) {
            throw new InvalidProtocolBufferException(t2.getMessage());
        }
    }
}
