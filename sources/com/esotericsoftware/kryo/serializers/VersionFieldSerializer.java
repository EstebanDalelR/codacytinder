package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField;
import com.esotericsoftware.minlog.Log;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class VersionFieldSerializer<T> extends FieldSerializer<T> {
    private boolean compatible;
    private int[] fieldVersion;
    private int typeVersion;

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Since {
        int value() default 0;
    }

    public VersionFieldSerializer(Kryo kryo, Class cls) {
        super(kryo, cls);
        this.typeVersion = null;
        this.compatible = true;
        initializeCachedFields();
    }

    public VersionFieldSerializer(Kryo kryo, Class cls, boolean z) {
        this(kryo, cls);
        this.compatible = z;
    }

    protected void initializeCachedFields() {
        CachedField[] fields = getFields();
        this.fieldVersion = new int[fields.length];
        int length = fields.length;
        for (int i = 0; i < length; i++) {
            Since since = (Since) fields[i].getField().getAnnotation(Since.class);
            if (since != null) {
                this.fieldVersion[i] = since.value();
                this.typeVersion = Math.max(this.fieldVersion[i], this.typeVersion);
            } else {
                this.fieldVersion[i] = 0;
            }
        }
        this.removedFields.clear();
        if (Log.DEBUG) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Version for type ");
            stringBuilder.append(getType().getName());
            stringBuilder.append(" is ");
            stringBuilder.append(this.typeVersion);
            Log.debug(stringBuilder.toString());
        }
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
        output.writeVarInt(this.typeVersion, true);
        for (CachedField write : kryo) {
            write.write(output, t);
        }
    }

    public T read(Kryo kryo, Input input, Class<T> cls) {
        cls = create(kryo, input, cls);
        kryo.reference(cls);
        kryo = input.readVarInt(true);
        if (this.compatible || kryo == this.typeVersion) {
            CachedField[] fields = getFields();
            int length = fields.length;
            for (int i = 0; i < length; i++) {
                if (this.fieldVersion[i] <= kryo) {
                    fields[i].read(input, cls);
                } else if (Log.DEBUG) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Skip field ");
                    stringBuilder.append(fields[i].getField().getName());
                    Log.debug(stringBuilder.toString());
                }
            }
            return cls;
        }
        cls = new StringBuilder();
        cls.append("Version not compatible: ");
        cls.append(kryo);
        cls.append(" <-> ");
        cls.append(this.typeVersion);
        throw new KryoException(cls.toString());
    }
}
