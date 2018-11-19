package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.InputChunked;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.io.OutputChunked;
import com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField;
import com.esotericsoftware.minlog.Log;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Comparator;

public class TaggedFieldSerializer<T> extends FieldSerializer<T> {
    private static final Comparator<CachedField> TAGGED_VALUE_COMPARATOR = new C11211();
    private boolean[] annexed;
    private boolean[] deprecated;
    private int[] tags;
    private int writeFieldCount;

    /* renamed from: com.esotericsoftware.kryo.serializers.TaggedFieldSerializer$1 */
    static class C11211 implements Comparator<CachedField> {
        C11211() {
        }

        public int compare(CachedField cachedField, CachedField cachedField2) {
            return ((Tag) cachedField.getField().getAnnotation(Tag.class)).value() - ((Tag) cachedField2.getField().getAnnotation(Tag.class)).value();
        }
    }

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Tag {
        boolean annexed() default false;

        int value();
    }

    @Deprecated
    public boolean isIgnoreUnkownTags() {
        return false;
    }

    @Deprecated
    public void setIgnoreUnknownTags(boolean z) {
    }

    public TaggedFieldSerializer(Kryo kryo, Class cls) {
        super(kryo, cls, null, kryo.getTaggedFieldSerializerConfig().clone());
    }

    public void setSkipUnknownTags(boolean z) {
        ((TaggedFieldSerializerConfig) this.config).setSkipUnknownTags(z);
        rebuildCachedFields();
    }

    public boolean isSkipUnknownTags() {
        return ((TaggedFieldSerializerConfig) this.config).isSkipUnknownTags();
    }

    protected void initializeCachedFields() {
        int i;
        CachedField[] fields = getFields();
        int length = fields.length;
        for (i = 0; i < length; i++) {
            if (fields[i].getField().getAnnotation(Tag.class) == null) {
                if (Log.TRACE) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Ignoring field without tag: ");
                    stringBuilder.append(fields[i]);
                    Log.trace("kryo", stringBuilder.toString());
                }
                super.removeField(fields[i]);
            }
        }
        fields = getFields();
        this.tags = new int[fields.length];
        this.deprecated = new boolean[fields.length];
        this.annexed = new boolean[fields.length];
        this.writeFieldCount = fields.length;
        Arrays.sort(fields, TAGGED_VALUE_COMPARATOR);
        length = fields.length;
        for (i = 0; i < length; i++) {
            Field field = fields[i].getField();
            this.tags[i] = ((Tag) field.getAnnotation(Tag.class)).value();
            if (i > 0) {
                if (this.tags[i] == this.tags[i - 1]) {
                    throw new KryoException(String.format("The fields [%s] and [%s] both have a Tag value of %d.", new Object[]{field, fields[i - 1].getField(), Integer.valueOf(this.tags[i])}));
                }
            }
            if (field.getAnnotation(Deprecated.class) != null) {
                this.deprecated[i] = true;
                this.writeFieldCount--;
            }
            if (((Tag) field.getAnnotation(Tag.class)).annexed()) {
                this.annexed[i] = true;
            }
        }
        this.removedFields.clear();
    }

    public void removeField(String str) {
        super.removeField(str);
        initializeCachedFields();
    }

    public void removeField(CachedField cachedField) {
        super.removeField(cachedField);
        initializeCachedFields();
    }

    public void write(Kryo kryo, Output output, T t) {
        kryo = getFields();
        output.writeVarInt(this.writeFieldCount, true);
        int length = kryo.length;
        Output output2 = null;
        for (int i = 0; i < length; i++) {
            if (!this.deprecated[i]) {
                output.writeVarInt(this.tags[i], true);
                if (this.annexed[i]) {
                    if (output2 == null) {
                        output2 = new OutputChunked(output, 1024);
                    }
                    kryo[i].write(output2, t);
                    output2.endChunks();
                } else {
                    kryo[i].write(output, t);
                }
            }
        }
    }

    public T read(Kryo kryo, Input input, Class<T> cls) {
        cls = create(kryo, input, cls);
        kryo.reference(cls);
        int readVarInt = input.readVarInt(true);
        int[] iArr = this.tags;
        CachedField[] fields = getFields();
        InputChunked inputChunked = null;
        for (int i = 0; i < readVarInt; i++) {
            CachedField cachedField;
            boolean z;
            int readVarInt2 = input.readVarInt(true);
            int length = iArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (iArr[i2] == readVarInt2) {
                    cachedField = fields[i2];
                    z = this.annexed[i2];
                    break;
                }
            }
            cachedField = null;
            z = false;
            if (cachedField == null) {
                if (isSkipUnknownTags()) {
                    if (inputChunked == null) {
                        inputChunked = new InputChunked(input, 1024);
                    }
                    inputChunked.nextChunks();
                    if (Log.TRACE) {
                        Log.trace(String.format("Unknown field tag: %d (%s) encountered. Assuming a future annexed tag with chunked encoding and skipping.", new Object[]{Integer.valueOf(readVarInt2), getType().getName()}));
                    }
                } else {
                    input = new StringBuilder();
                    input.append("Unknown field tag: ");
                    input.append(readVarInt2);
                    input.append(" (");
                    input.append(getType().getName());
                    input.append(")");
                    throw new KryoException(input.toString());
                }
            } else if (z) {
                if (inputChunked == null) {
                    inputChunked = new InputChunked(input, 1024);
                }
                cachedField.read(inputChunked, cls);
                inputChunked.nextChunks();
            } else {
                cachedField.read(input, cls);
            }
        }
        return cls;
    }
}
