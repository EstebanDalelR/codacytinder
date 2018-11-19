package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.InputChunked;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.io.OutputChunked;
import java.io.OutputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

public class DeflateSerializer extends Serializer {
    private int compressionLevel = 4;
    private boolean noHeaders = true;
    private final Serializer serializer;

    public DeflateSerializer(Serializer serializer) {
        this.serializer = serializer;
    }

    public void write(Kryo kryo, Output output, Object obj) {
        OutputStream outputChunked = new OutputChunked(output, 256);
        output = new Deflater(this.compressionLevel, this.noHeaders);
        try {
            OutputStream deflaterOutputStream = new DeflaterOutputStream(outputChunked, output);
            Output output2 = new Output(deflaterOutputStream, 256);
            this.serializer.write(kryo, output2, obj);
            output2.flush();
            deflaterOutputStream.finish();
            output.end();
            outputChunked.endChunks();
        } catch (Throwable e) {
            throw new KryoException(e);
        } catch (Throwable th) {
            output.end();
        }
    }

    public Object read(Kryo kryo, Input input, Class cls) {
        Inflater inflater = new Inflater(this.noHeaders);
        try {
            kryo = this.serializer.read(kryo, new Input(new InflaterInputStream(new InputChunked(input, 256), inflater), 256), cls);
            return kryo;
        } finally {
            inflater.end();
        }
    }

    public void setNoHeaders(boolean z) {
        this.noHeaders = z;
    }

    public void setCompressionLevel(int i) {
        this.compressionLevel = i;
    }

    public Object copy(Kryo kryo, Object obj) {
        return this.serializer.copy(kryo, obj);
    }
}
