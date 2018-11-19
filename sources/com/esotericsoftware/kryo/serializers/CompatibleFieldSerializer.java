package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.InputChunked;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.io.OutputChunked;
import com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField;
import com.esotericsoftware.kryo.util.ObjectMap;
import com.esotericsoftware.minlog.Log;
import java.io.InputStream;

public class CompatibleFieldSerializer<T> extends FieldSerializer<T> {
    private static final int THRESHOLD_BINARY_SEARCH = 32;

    public CompatibleFieldSerializer(Kryo kryo, Class cls) {
        super(kryo, cls);
    }

    public void write(Kryo kryo, Output output, T t) {
        CachedField[] fields = getFields();
        kryo = kryo.getGraphContext();
        if (!kryo.containsKey(this)) {
            kryo.put(this, null);
            if (Log.TRACE != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Write ");
                stringBuilder.append(fields.length);
                stringBuilder.append(" field names.");
                Log.trace("kryo", stringBuilder.toString());
            }
            output.writeVarInt(fields.length, true);
            for (CachedField cachedFieldName : fields) {
                output.writeString(getCachedFieldName(cachedFieldName));
            }
        }
        kryo = new OutputChunked(output, 1024);
        for (CachedField write : fields) {
            write.write(kryo, t);
            kryo.endChunks();
        }
    }

    public T read(Kryo kryo, Input input, Class<T> cls) {
        int compareTo;
        InputStream inputStream = input;
        T create = create(kryo, input, cls);
        kryo.reference(create);
        ObjectMap graphContext = kryo.getGraphContext();
        CachedField[] cachedFieldArr = (CachedField[]) graphContext.get(this);
        boolean z = true;
        if (cachedFieldArr == null) {
            int readVarInt = inputStream.readVarInt(true);
            if (Log.TRACE) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Read ");
                stringBuilder.append(readVarInt);
                stringBuilder.append(" field names.");
                Log.trace("kryo", stringBuilder.toString());
            }
            String[] strArr = new String[readVarInt];
            for (int i = 0; i < readVarInt; i++) {
                strArr[i] = input.readString();
            }
            Object obj = new CachedField[readVarInt];
            CachedField[] fields = getFields();
            int i2;
            int i3;
            StringBuilder stringBuilder2;
            if (readVarInt < 32) {
                for (i2 = 0; i2 < readVarInt; i2++) {
                    String str = strArr[i2];
                    int length = fields.length;
                    for (i3 = 0; i3 < length; i3++) {
                        if (getCachedFieldName(fields[i3]).equals(str)) {
                            obj[i2] = fields[i3];
                            break;
                        }
                    }
                    if (Log.TRACE) {
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Ignore obsolete field: ");
                        stringBuilder2.append(str);
                        Log.trace("kryo", stringBuilder2.toString());
                    }
                }
            } else {
                i2 = fields.length > readVarInt ? fields.length : readVarInt;
                for (int i4 = 0; i4 < readVarInt; i4++) {
                    String str2 = strArr[i4];
                    int i5 = i2 - 1;
                    i3 = 0;
                    while (i3 <= i5) {
                        int i6 = (i3 + i5) >>> 1;
                        compareTo = str2.compareTo(getCachedFieldName(fields[i6]));
                        if (compareTo >= 0) {
                            if (compareTo <= 0) {
                                obj[i4] = fields[i6];
                                break;
                            }
                            i3 = i6 + 1;
                        } else {
                            i5 = i6 - 1;
                        }
                    }
                    if (Log.TRACE) {
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Ignore obsolete field: ");
                        stringBuilder2.append(str2);
                        Log.trace("kryo", stringBuilder2.toString());
                    }
                }
            }
            graphContext.put(r0, obj);
            cachedFieldArr = obj;
        }
        Input inputChunked = new InputChunked(inputStream, 1024);
        if (getGenerics() == null) {
            z = false;
        }
        for (CachedField cachedField : r4) {
            CachedField cachedField2;
            if (cachedField2 != null && r6) {
                cachedField2 = getField(getCachedFieldName(cachedField2));
            }
            if (cachedField2 == null) {
                if (Log.TRACE) {
                    Log.trace("kryo", "Skip obsolete field.");
                }
                inputChunked.nextChunks();
            } else {
                cachedField2.read(inputChunked, create);
                inputChunked.nextChunks();
            }
        }
        return create;
    }
}
