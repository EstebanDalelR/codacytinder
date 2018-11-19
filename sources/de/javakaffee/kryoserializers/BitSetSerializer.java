package de.javakaffee.kryoserializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import java.util.BitSet;

public class BitSetSerializer extends Serializer<BitSet> {
    public BitSet copy(Kryo kryo, BitSet bitSet) {
        kryo = new BitSet();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            kryo.set(i, bitSet.get(i));
        }
        return kryo;
    }

    public void write(Kryo kryo, Output output, BitSet bitSet) {
        kryo = bitSet.length();
        output.writeInt(kryo, true);
        for (int i = 0; i < kryo; i++) {
            output.writeBoolean(bitSet.get(i));
        }
    }

    public BitSet read(Kryo kryo, Input input, Class<BitSet> cls) {
        kryo = input.readInt(true);
        cls = new BitSet(kryo);
        for (int i = 0; i < kryo; i++) {
            cls.set(i, input.readBoolean());
        }
        return cls;
    }
}
