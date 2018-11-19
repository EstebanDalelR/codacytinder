package de.javakaffee.kryoserializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import java.net.URI;

public class URISerializer extends Serializer<URI> {
    public URISerializer() {
        setImmutable(true);
    }

    public void write(Kryo kryo, Output output, URI uri) {
        output.writeString(uri.toString());
    }

    public URI read(Kryo kryo, Input input, Class<URI> cls) {
        return URI.create(input.readString());
    }
}
