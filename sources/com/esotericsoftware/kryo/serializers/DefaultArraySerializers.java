package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Registration;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.minlog.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;

public class DefaultArraySerializers {

    public static class BooleanArraySerializer extends Serializer<boolean[]> {
        public BooleanArraySerializer() {
            setAcceptsNull(true);
        }

        public void write(Kryo kryo, Output output, boolean[] zArr) {
            kryo = null;
            if (zArr == null) {
                output.writeVarInt(0, true);
                return;
            }
            output.writeVarInt(zArr.length + 1, true);
            int length = zArr.length;
            while (kryo < length) {
                output.writeBoolean(zArr[kryo]);
                kryo++;
            }
        }

        public boolean[] read(Kryo kryo, Input input, Class<boolean[]> cls) {
            kryo = input.readVarInt(true);
            if (kryo == null) {
                return null;
            }
            kryo--;
            cls = new boolean[kryo];
            for (int i = 0; i < kryo; i++) {
                cls[i] = input.readBoolean();
            }
            return cls;
        }

        public boolean[] copy(Kryo kryo, boolean[] zArr) {
            kryo = new boolean[zArr.length];
            System.arraycopy(zArr, 0, kryo, 0, kryo.length);
            return kryo;
        }
    }

    public static class ByteArraySerializer extends Serializer<byte[]> {
        public ByteArraySerializer() {
            setAcceptsNull(true);
        }

        public void write(Kryo kryo, Output output, byte[] bArr) {
            if (bArr == null) {
                output.writeVarInt(null, true);
                return;
            }
            output.writeVarInt(bArr.length + 1, true);
            output.writeBytes(bArr);
        }

        public byte[] read(Kryo kryo, Input input, Class<byte[]> cls) {
            cls = input.readVarInt(true);
            if (cls == null) {
                return null;
            }
            return input.readBytes(cls - 1);
        }

        public byte[] copy(Kryo kryo, byte[] bArr) {
            kryo = new byte[bArr.length];
            System.arraycopy(bArr, 0, kryo, 0, kryo.length);
            return kryo;
        }
    }

    public static class CharArraySerializer extends Serializer<char[]> {
        public CharArraySerializer() {
            setAcceptsNull(true);
        }

        public void write(Kryo kryo, Output output, char[] cArr) {
            if (cArr == null) {
                output.writeVarInt(null, true);
                return;
            }
            output.writeVarInt(cArr.length + 1, true);
            output.writeChars(cArr);
        }

        public char[] read(Kryo kryo, Input input, Class<char[]> cls) {
            cls = input.readVarInt(true);
            if (cls == null) {
                return null;
            }
            return input.readChars(cls - 1);
        }

        public char[] copy(Kryo kryo, char[] cArr) {
            kryo = new char[cArr.length];
            System.arraycopy(cArr, 0, kryo, 0, kryo.length);
            return kryo;
        }
    }

    public static class DoubleArraySerializer extends Serializer<double[]> {
        public DoubleArraySerializer() {
            setAcceptsNull(true);
        }

        public void write(Kryo kryo, Output output, double[] dArr) {
            if (dArr == null) {
                output.writeVarInt(null, true);
                return;
            }
            output.writeVarInt(dArr.length + 1, true);
            output.writeDoubles(dArr);
        }

        public double[] read(Kryo kryo, Input input, Class<double[]> cls) {
            cls = input.readVarInt(true);
            if (cls == null) {
                return null;
            }
            return input.readDoubles(cls - 1);
        }

        public double[] copy(Kryo kryo, double[] dArr) {
            kryo = new double[dArr.length];
            System.arraycopy(dArr, 0, kryo, 0, kryo.length);
            return kryo;
        }
    }

    public static class FloatArraySerializer extends Serializer<float[]> {
        public FloatArraySerializer() {
            setAcceptsNull(true);
        }

        public void write(Kryo kryo, Output output, float[] fArr) {
            if (fArr == null) {
                output.writeVarInt(null, true);
                return;
            }
            output.writeVarInt(fArr.length + 1, true);
            output.writeFloats(fArr);
        }

        public float[] read(Kryo kryo, Input input, Class<float[]> cls) {
            cls = input.readVarInt(true);
            if (cls == null) {
                return null;
            }
            return input.readFloats(cls - 1);
        }

        public float[] copy(Kryo kryo, float[] fArr) {
            kryo = new float[fArr.length];
            System.arraycopy(fArr, 0, kryo, 0, kryo.length);
            return kryo;
        }
    }

    public static class IntArraySerializer extends Serializer<int[]> {
        public IntArraySerializer() {
            setAcceptsNull(true);
        }

        public void write(Kryo kryo, Output output, int[] iArr) {
            if (iArr == null) {
                output.writeVarInt(0, true);
                return;
            }
            output.writeVarInt(iArr.length + 1, true);
            output.writeInts(iArr, false);
        }

        public int[] read(Kryo kryo, Input input, Class<int[]> cls) {
            cls = input.readVarInt(true);
            if (cls == null) {
                return null;
            }
            return input.readInts(cls - 1, null);
        }

        public int[] copy(Kryo kryo, int[] iArr) {
            kryo = new int[iArr.length];
            System.arraycopy(iArr, 0, kryo, 0, kryo.length);
            return kryo;
        }
    }

    public static class LongArraySerializer extends Serializer<long[]> {
        public LongArraySerializer() {
            setAcceptsNull(true);
        }

        public void write(Kryo kryo, Output output, long[] jArr) {
            if (jArr == null) {
                output.writeVarInt(0, true);
                return;
            }
            output.writeVarInt(jArr.length + 1, true);
            output.writeLongs(jArr, false);
        }

        public long[] read(Kryo kryo, Input input, Class<long[]> cls) {
            cls = input.readVarInt(true);
            if (cls == null) {
                return null;
            }
            return input.readLongs(cls - 1, null);
        }

        public long[] copy(Kryo kryo, long[] jArr) {
            kryo = new long[jArr.length];
            System.arraycopy(jArr, 0, kryo, 0, kryo.length);
            return kryo;
        }
    }

    public static class ObjectArraySerializer extends Serializer<Object[]> {
        private boolean elementsAreSameType;
        private boolean elementsCanBeNull = true;
        private Class[] generics;
        private final Class type;

        public ObjectArraySerializer(Kryo kryo, Class cls) {
            setAcceptsNull(true);
            this.type = cls;
            if (((cls.getComponentType().getModifiers() & 16) != null ? true : null) != null) {
                setElementsAreSameType(true);
            }
        }

        public void write(Kryo kryo, Output output, Object[] objArr) {
            int i = 0;
            if (objArr == null) {
                output.writeVarInt(0, true);
                return;
            }
            output.writeVarInt(objArr.length + 1, true);
            Class componentType = objArr.getClass().getComponentType();
            if (!this.elementsAreSameType) {
                if (!Modifier.isFinal(componentType.getModifiers())) {
                    int length = objArr.length;
                    while (i < length) {
                        if (objArr[i] != null) {
                            kryo.getSerializer(objArr[i].getClass()).setGenerics(kryo, this.generics);
                        }
                        kryo.writeClassAndObject(output, objArr[i]);
                        i++;
                    }
                }
            }
            Serializer serializer = kryo.getSerializer(componentType);
            serializer.setGenerics(kryo, this.generics);
            int length2 = objArr.length;
            while (i < length2) {
                if (this.elementsCanBeNull) {
                    kryo.writeObjectOrNull(output, objArr[i], serializer);
                } else {
                    kryo.writeObject(output, objArr[i], serializer);
                }
                i++;
            }
        }

        public Object[] read(Kryo kryo, Input input, Class<Object[]> cls) {
            int readVarInt = input.readVarInt(true);
            if (readVarInt == 0) {
                return null;
            }
            Object[] objArr = (Object[]) Array.newInstance(cls.getComponentType(), readVarInt - 1);
            kryo.reference(objArr);
            Class componentType = objArr.getClass().getComponentType();
            int i = 0;
            if (!this.elementsAreSameType) {
                if (!Modifier.isFinal(componentType.getModifiers())) {
                    int length = objArr.length;
                    while (i < length) {
                        Registration readClass = kryo.readClass(input);
                        if (readClass != null) {
                            readClass.getSerializer().setGenerics(kryo, this.generics);
                            objArr[i] = kryo.readObject(input, readClass.getType(), readClass.getSerializer());
                        } else {
                            objArr[i] = null;
                        }
                        i++;
                    }
                    return objArr;
                }
            }
            Serializer serializer = kryo.getSerializer(componentType);
            serializer.setGenerics(kryo, this.generics);
            int length2 = objArr.length;
            while (i < length2) {
                if (this.elementsCanBeNull) {
                    objArr[i] = kryo.readObjectOrNull(input, componentType, serializer);
                } else {
                    objArr[i] = kryo.readObject(input, componentType, serializer);
                }
                i++;
            }
            return objArr;
        }

        public Object[] copy(Kryo kryo, Object[] objArr) {
            Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), objArr.length);
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                objArr2[i] = kryo.copy(objArr[i]);
            }
            return objArr2;
        }

        public void setElementsCanBeNull(boolean z) {
            this.elementsCanBeNull = z;
        }

        public void setElementsAreSameType(boolean z) {
            this.elementsAreSameType = z;
        }

        public void setGenerics(Kryo kryo, Class[] clsArr) {
            if (Log.TRACE != null) {
                Log.trace("kryo", "setting generics for ObjectArraySerializer");
            }
            this.generics = clsArr;
        }
    }

    public static class ShortArraySerializer extends Serializer<short[]> {
        public ShortArraySerializer() {
            setAcceptsNull(true);
        }

        public void write(Kryo kryo, Output output, short[] sArr) {
            if (sArr == null) {
                output.writeVarInt(null, true);
                return;
            }
            output.writeVarInt(sArr.length + 1, true);
            output.writeShorts(sArr);
        }

        public short[] read(Kryo kryo, Input input, Class<short[]> cls) {
            cls = input.readVarInt(true);
            if (cls == null) {
                return null;
            }
            return input.readShorts(cls - 1);
        }

        public short[] copy(Kryo kryo, short[] sArr) {
            kryo = new short[sArr.length];
            System.arraycopy(sArr, 0, kryo, 0, kryo.length);
            return kryo;
        }
    }

    public static class StringArraySerializer extends Serializer<String[]> {
        public StringArraySerializer() {
            setAcceptsNull(true);
        }

        public void write(Kryo kryo, Output output, String[] strArr) {
            int i = 0;
            if (strArr == null) {
                output.writeVarInt(0, true);
                return;
            }
            output.writeVarInt(strArr.length + 1, true);
            if (kryo.getReferences() && kryo.getReferenceResolver().useReferences(String.class)) {
                Serializer serializer = kryo.getSerializer(String.class);
                int length = strArr.length;
                while (i < length) {
                    kryo.writeObjectOrNull(output, strArr[i], serializer);
                    i++;
                }
            } else {
                kryo = strArr.length;
                while (i < kryo) {
                    output.writeString(strArr[i]);
                    i++;
                }
            }
        }

        public String[] read(Kryo kryo, Input input, Class<String[]> cls) {
            cls = input.readVarInt(true);
            if (cls == null) {
                return null;
            }
            cls--;
            String[] strArr = new String[cls];
            int i = 0;
            if (kryo.getReferences() && kryo.getReferenceResolver().useReferences(String.class)) {
                Serializer serializer = kryo.getSerializer(String.class);
                while (i < cls) {
                    strArr[i] = (String) kryo.readObjectOrNull(input, String.class, serializer);
                    i++;
                }
            } else {
                while (i < cls) {
                    strArr[i] = input.readString();
                    i++;
                }
            }
            return strArr;
        }

        public String[] copy(Kryo kryo, String[] strArr) {
            kryo = new String[strArr.length];
            System.arraycopy(strArr, 0, kryo, 0, kryo.length);
            return kryo;
        }
    }
}
