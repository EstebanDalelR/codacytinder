package com.esotericsoftware.kryo.io;

import com.esotericsoftware.kryo.KryoException;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.OutputStream;

public class Output extends OutputStream {
    protected byte[] buffer;
    protected int capacity;
    protected int maxCapacity;
    protected OutputStream outputStream;
    protected int position;
    protected long total;

    public static int intLength(int i, boolean z) {
        if (!z) {
            i = (i >> 31) ^ (i << 1);
        }
        return (i >>> 7) == 0 ? 1 : (i >>> 14) == 0 ? 2 : (i >>> 21) == 0 ? 3 : (i >>> 28) == 0 ? 4 : 5;
    }

    public static int longLength(long j, boolean z) {
        if (!z) {
            j = (j << 1) ^ (j >> 63);
        }
        return (j >>> 7) == 0 ? 1 : (j >>> 14) == 0 ? 2 : (j >>> 21) == 0 ? 3 : (j >>> 28) == 0 ? 4 : (j >>> 35) == 0 ? 5 : (j >>> 42) == 0 ? 6 : (j >>> 49) == 0 ? 7 : (j >>> 56) == 0 ? 8 : 9;
    }

    public Output(int i) {
        this(i, i);
    }

    public Output(int i, int i2) {
        if (i > i2 && i2 != -1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bufferSize: ");
            stringBuilder.append(i);
            stringBuilder.append(" cannot be greater than maxBufferSize: ");
            stringBuilder.append(i2);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i2 < -1) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("maxBufferSize cannot be < -1: ");
            stringBuilder2.append(i2);
            throw new IllegalArgumentException(stringBuilder2.toString());
        } else {
            this.capacity = i;
            if (i2 == -1) {
                i2 = 2147483639;
            }
            this.maxCapacity = i2;
            this.buffer = new byte[i];
        }
    }

    public Output(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public Output(byte[] bArr, int i) {
        if (bArr == null) {
            throw new IllegalArgumentException("buffer cannot be null.");
        }
        setBuffer(bArr, i);
    }

    public Output(OutputStream outputStream) {
        this(4096, 4096);
        if (outputStream == null) {
            throw new IllegalArgumentException("outputStream cannot be null.");
        }
        this.outputStream = outputStream;
    }

    public Output(OutputStream outputStream, int i) {
        this(i, i);
        if (outputStream == null) {
            throw new IllegalArgumentException("outputStream cannot be null.");
        }
        this.outputStream = outputStream;
    }

    public OutputStream getOutputStream() {
        return this.outputStream;
    }

    public void setOutputStream(OutputStream outputStream) {
        this.outputStream = outputStream;
        this.position = null;
        this.total = 0;
    }

    public void setBuffer(byte[] bArr) {
        setBuffer(bArr, bArr.length);
    }

    public void setBuffer(byte[] bArr, int i) {
        if (bArr == null) {
            throw new IllegalArgumentException("buffer cannot be null.");
        } else if (bArr.length > i && i != -1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("buffer has length: ");
            stringBuilder.append(bArr.length);
            stringBuilder.append(" cannot be greater than maxBufferSize: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i < -1) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("maxBufferSize cannot be < -1: ");
            stringBuilder2.append(i);
            throw new IllegalArgumentException(stringBuilder2.toString());
        } else {
            this.buffer = bArr;
            if (i == -1) {
                i = 2147483639;
            }
            this.maxCapacity = i;
            this.capacity = bArr.length;
            this.position = null;
            this.total = null;
            this.outputStream = null;
        }
    }

    public byte[] getBuffer() {
        return this.buffer;
    }

    public byte[] toBytes() {
        Object obj = new byte[this.position];
        System.arraycopy(this.buffer, 0, obj, 0, this.position);
        return obj;
    }

    public int position() {
        return this.position;
    }

    public void setPosition(int i) {
        this.position = i;
    }

    public long total() {
        return this.total + ((long) this.position);
    }

    public void clear() {
        this.position = 0;
        this.total = 0;
    }

    protected boolean require(int i) throws KryoException {
        if (this.capacity - this.position >= i) {
            return false;
        }
        if (i > this.maxCapacity) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Buffer overflow. Max capacity: ");
            stringBuilder.append(this.maxCapacity);
            stringBuilder.append(", required: ");
            stringBuilder.append(i);
            throw new KryoException(stringBuilder.toString());
        }
        flush();
        while (this.capacity - this.position < i) {
            if (this.capacity == this.maxCapacity) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Buffer overflow. Available: ");
                stringBuilder.append(this.capacity - this.position);
                stringBuilder.append(", required: ");
                stringBuilder.append(i);
                throw new KryoException(stringBuilder.toString());
            }
            if (this.capacity == 0) {
                this.capacity = 1;
            }
            this.capacity = Math.min(this.capacity * 2, this.maxCapacity);
            if (this.capacity < 0) {
                this.capacity = this.maxCapacity;
            }
            Object obj = new byte[this.capacity];
            System.arraycopy(this.buffer, 0, obj, 0, this.position);
            this.buffer = obj;
        }
        return true;
    }

    public void flush() throws KryoException {
        if (this.outputStream != null) {
            try {
                this.outputStream.write(this.buffer, 0, this.position);
                this.outputStream.flush();
                this.total += (long) this.position;
                this.position = 0;
            } catch (Throwable e) {
                throw new KryoException(e);
            }
        }
    }

    public void close() throws com.esotericsoftware.kryo.KryoException {
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
        r1 = this;
        r1.flush();
        r0 = r1.outputStream;
        if (r0 == 0) goto L_0x000c;
    L_0x0007:
        r0 = r1.outputStream;	 Catch:{ IOException -> 0x000c }
        r0.close();	 Catch:{ IOException -> 0x000c }
    L_0x000c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.io.Output.close():void");
    }

    public void write(int i) throws KryoException {
        if (this.position == this.capacity) {
            require(1);
        }
        byte[] bArr = this.buffer;
        int i2 = this.position;
        this.position = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public void write(byte[] bArr) throws KryoException {
        if (bArr == null) {
            throw new IllegalArgumentException("bytes cannot be null.");
        }
        writeBytes(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) throws KryoException {
        writeBytes(bArr, i, i2);
    }

    public void writeByte(byte b) throws KryoException {
        if (this.position == this.capacity) {
            require(1);
        }
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        bArr[i] = b;
    }

    public void writeByte(int i) throws KryoException {
        if (this.position == this.capacity) {
            require(1);
        }
        byte[] bArr = this.buffer;
        int i2 = this.position;
        this.position = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public void writeBytes(byte[] bArr) throws KryoException {
        if (bArr == null) {
            throw new IllegalArgumentException("bytes cannot be null.");
        }
        writeBytes(bArr, 0, bArr.length);
    }

    public void writeBytes(byte[] bArr, int i, int i2) throws KryoException {
        if (bArr == null) {
            throw new IllegalArgumentException("bytes cannot be null.");
        }
        int min = Math.min(this.capacity - this.position, i2);
        while (true) {
            System.arraycopy(bArr, i, this.buffer, this.position, min);
            this.position += min;
            i2 -= min;
            if (i2 != 0) {
                i += min;
                min = Math.min(this.capacity, i2);
                require(min);
            } else {
                return;
            }
        }
    }

    public void writeInt(int i) throws KryoException {
        require(4);
        byte[] bArr = this.buffer;
        int i2 = this.position;
        this.position = i2 + 1;
        bArr[i2] = (byte) (i >> 24);
        i2 = this.position;
        this.position = i2 + 1;
        bArr[i2] = (byte) (i >> 16);
        i2 = this.position;
        this.position = i2 + 1;
        bArr[i2] = (byte) (i >> 8);
        i2 = this.position;
        this.position = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public int writeInt(int i, boolean z) throws KryoException {
        return writeVarInt(i, z);
    }

    public int writeVarInt(int i, boolean z) throws KryoException {
        if (!z) {
            i = (i >> 31) ^ (i << 1);
        }
        z = i >>> 7;
        int i2;
        if (z) {
            int i3 = i >>> 14;
            int i4;
            if (i3 == 0) {
                require(2);
                byte[] bArr = this.buffer;
                i4 = this.position;
                this.position = i4 + 1;
                bArr[i4] = (byte) ((i & 127) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                i = this.buffer;
                i2 = this.position;
                this.position = i2 + 1;
                i[i2] = (byte) z;
                return 2;
            }
            i2 = i >>> 21;
            int i5;
            if (i2 == 0) {
                require(3);
                byte[] bArr2 = this.buffer;
                i5 = this.position;
                this.position = i5 + 1;
                bArr2[i5] = (byte) ((i & 127) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                i = this.buffer;
                i4 = this.position;
                this.position = i4 + 1;
                i[i4] = (byte) (z | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                i = this.buffer;
                z = this.position;
                this.position = z + 1;
                i[z] = (byte) i3;
                return 3;
            }
            i4 = i >>> 28;
            int i6;
            if (i4 == 0) {
                require(4);
                byte[] bArr3 = this.buffer;
                i6 = this.position;
                this.position = i6 + 1;
                bArr3[i6] = (byte) ((i & 127) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                i = this.buffer;
                i5 = this.position;
                this.position = i5 + 1;
                i[i5] = (byte) (z | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                i = this.buffer;
                z = this.position;
                this.position = z + 1;
                i[z] = (byte) (i3 | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                i = this.buffer;
                z = this.position;
                this.position = z + 1;
                i[z] = (byte) i2;
                return 4;
            }
            require(5);
            byte[] bArr4 = this.buffer;
            int i7 = this.position;
            this.position = i7 + 1;
            bArr4[i7] = (byte) ((i & 127) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            i = this.buffer;
            i6 = this.position;
            this.position = i6 + 1;
            i[i6] = (byte) (z | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            i = this.buffer;
            z = this.position;
            this.position = z + 1;
            i[z] = (byte) (i3 | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            i = this.buffer;
            z = this.position;
            this.position = z + 1;
            i[z] = (byte) (i2 | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            i = this.buffer;
            z = this.position;
            this.position = z + 1;
            i[z] = (byte) i4;
            return 5;
        }
        require(1);
        byte[] bArr5 = this.buffer;
        i2 = this.position;
        this.position = i2 + 1;
        bArr5[i2] = (byte) i;
        return 1;
    }

    public void writeString(String str) throws KryoException {
        if (str == null) {
            writeByte((int) ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            return;
        }
        int length = str.length();
        if (length == 0) {
            writeByte(129);
            return;
        }
        Object obj;
        int i = 0;
        byte[] bArr;
        int i2;
        char charAt;
        if (length > 1 && length < 64) {
            int i3 = 0;
            while (i3 < length) {
                if (str.charAt(i3) <= '') {
                    i3++;
                }
            }
            obj = 1;
            if (obj == null) {
                if (this.capacity - this.position >= length) {
                    writeAscii_slow(str, length);
                } else {
                    str.getBytes(0, length, this.buffer, this.position);
                    this.position += length;
                }
                str = this.buffer;
                length = this.position - 1;
                str[length] = (byte) (ProfileEditingConfig.DEFAULT_MAX_LENGTH | str[length]);
            } else {
                writeUtf8Length(length + 1);
                if (this.capacity - this.position >= length) {
                    bArr = this.buffer;
                    i2 = this.position;
                    while (i < length) {
                        charAt = str.charAt(i);
                        if (charAt > '') {
                            break;
                        }
                        int i4 = i2 + 1;
                        bArr[i2] = (byte) charAt;
                        i++;
                        i2 = i4;
                    }
                    this.position = i2;
                }
                if (i < length) {
                    writeString_slow(str, length, i);
                }
            }
        }
        obj = null;
        if (obj == null) {
            writeUtf8Length(length + 1);
            if (this.capacity - this.position >= length) {
                bArr = this.buffer;
                i2 = this.position;
                while (i < length) {
                    charAt = str.charAt(i);
                    if (charAt > '') {
                        break;
                    }
                    int i42 = i2 + 1;
                    bArr[i2] = (byte) charAt;
                    i++;
                    i2 = i42;
                }
                this.position = i2;
            }
            if (i < length) {
                writeString_slow(str, length, i);
            }
        } else {
            if (this.capacity - this.position >= length) {
                str.getBytes(0, length, this.buffer, this.position);
                this.position += length;
            } else {
                writeAscii_slow(str, length);
            }
            str = this.buffer;
            length = this.position - 1;
            str[length] = (byte) (ProfileEditingConfig.DEFAULT_MAX_LENGTH | str[length]);
        }
    }

    public void writeString(CharSequence charSequence) throws KryoException {
        if (charSequence == null) {
            writeByte((int) ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            return;
        }
        int length = charSequence.length();
        if (length == 0) {
            writeByte(129);
            return;
        }
        writeUtf8Length(length + 1);
        int i = 0;
        if (this.capacity - this.position >= length) {
            byte[] bArr = this.buffer;
            int i2 = this.position;
            while (i < length) {
                char charAt = charSequence.charAt(i);
                if (charAt > '') {
                    break;
                }
                int i3 = i2 + 1;
                bArr[i2] = (byte) charAt;
                i++;
                i2 = i3;
            }
            this.position = i2;
        }
        if (i < length) {
            writeString_slow(charSequence, length, i);
        }
    }

    public void writeAscii(String str) throws KryoException {
        if (str == null) {
            writeByte((int) ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            return;
        }
        int length = str.length();
        switch (length) {
            case 0:
                writeByte(129);
                return;
            case 1:
                writeByte(130);
                writeByte(str.charAt(0));
                return;
            default:
                if (this.capacity - this.position < length) {
                    writeAscii_slow(str, length);
                } else {
                    str.getBytes(0, length, this.buffer, this.position);
                    this.position += length;
                }
                str = this.buffer;
                length = this.position - 1;
                str[length] = (byte) (ProfileEditingConfig.DEFAULT_MAX_LENGTH | str[length]);
                return;
        }
    }

    private void writeUtf8Length(int i) {
        int i2 = i >>> 6;
        if (i2 == 0) {
            require(1);
            byte[] bArr = this.buffer;
            int i3 = this.position;
            this.position = i3 + 1;
            bArr[i3] = (byte) (i | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            return;
        }
        i3 = i >>> 13;
        if (i3 == 0) {
            require(2);
            byte[] bArr2 = this.buffer;
            int i4 = this.position;
            this.position = i4 + 1;
            bArr2[i4] = (byte) ((i | 64) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            i = this.position;
            this.position = i + 1;
            bArr2[i] = (byte) i2;
            return;
        }
        i4 = i >>> 20;
        if (i4 == 0) {
            require(3);
            byte[] bArr3 = this.buffer;
            int i5 = this.position;
            this.position = i5 + 1;
            bArr3[i5] = (byte) ((i | 64) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            i = this.position;
            this.position = i + 1;
            bArr3[i] = (byte) (i2 | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            i = this.position;
            this.position = i + 1;
            bArr3[i] = (byte) i3;
            return;
        }
        i5 = i >>> 27;
        if (i5 == 0) {
            require(4);
            byte[] bArr4 = this.buffer;
            int i6 = this.position;
            this.position = i6 + 1;
            bArr4[i6] = (byte) ((i | 64) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            i = this.position;
            this.position = i + 1;
            bArr4[i] = (byte) (i2 | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            i = this.position;
            this.position = i + 1;
            bArr4[i] = (byte) (i3 | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            i = this.position;
            this.position = i + 1;
            bArr4[i] = (byte) i4;
            return;
        }
        require(5);
        byte[] bArr5 = this.buffer;
        int i7 = this.position;
        this.position = i7 + 1;
        bArr5[i7] = (byte) ((i | 64) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
        i = this.position;
        this.position = i + 1;
        bArr5[i] = (byte) (i2 | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
        i = this.position;
        this.position = i + 1;
        bArr5[i] = (byte) (i3 | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
        i = this.position;
        this.position = i + 1;
        bArr5[i] = (byte) (i4 | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
        i = this.position;
        this.position = i + 1;
        bArr5[i] = (byte) i5;
    }

    private void writeString_slow(CharSequence charSequence, int i, int i2) {
        while (i2 < i) {
            if (this.position == this.capacity) {
                require(Math.min(this.capacity, i - i2));
            }
            char charAt = charSequence.charAt(i2);
            byte[] bArr;
            int i3;
            if (charAt <= '') {
                bArr = this.buffer;
                i3 = this.position;
                this.position = i3 + 1;
                bArr[i3] = (byte) charAt;
            } else if (charAt > '߿') {
                bArr = this.buffer;
                i3 = this.position;
                this.position = i3 + 1;
                bArr[i3] = (byte) (((charAt >> 12) & 15) | 224);
                require(2);
                bArr = this.buffer;
                i3 = this.position;
                this.position = i3 + 1;
                bArr[i3] = (byte) (((charAt >> 6) & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                bArr = this.buffer;
                i3 = this.position;
                this.position = i3 + 1;
                bArr[i3] = (byte) ((charAt & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            } else {
                bArr = this.buffer;
                i3 = this.position;
                this.position = i3 + 1;
                bArr[i3] = (byte) (((charAt >> 6) & 31) | 192);
                require(1);
                bArr = this.buffer;
                i3 = this.position;
                this.position = i3 + 1;
                bArr[i3] = (byte) ((charAt & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            }
            i2++;
        }
    }

    private void writeAscii_slow(String str, int i) throws KryoException {
        if (i != 0) {
            if (this.capacity == 0) {
                require(1);
            }
            int i2 = 0;
            byte[] bArr = this.buffer;
            int min = Math.min(i, this.capacity - this.position);
            while (i2 < i) {
                int i3 = i2 + min;
                str.getBytes(i2, i3, bArr, this.position);
                this.position += min;
                min = Math.min(i - i3, this.capacity);
                if (require(min)) {
                    bArr = this.buffer;
                }
                i2 = i3;
            }
        }
    }

    public void writeFloat(float f) throws KryoException {
        writeInt(Float.floatToIntBits(f));
    }

    public int writeFloat(float f, float f2, boolean z) throws KryoException {
        return writeInt((int) (f * f2), z);
    }

    public void writeShort(int i) throws KryoException {
        require(2);
        byte[] bArr = this.buffer;
        int i2 = this.position;
        this.position = i2 + 1;
        bArr[i2] = (byte) (i >>> 8);
        bArr = this.buffer;
        i2 = this.position;
        this.position = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public void writeLong(long j) throws KryoException {
        require(8);
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        bArr[i] = (byte) ((int) (j >>> 56));
        i = this.position;
        this.position = i + 1;
        bArr[i] = (byte) ((int) (j >>> 48));
        i = this.position;
        this.position = i + 1;
        bArr[i] = (byte) ((int) (j >>> 40));
        i = this.position;
        this.position = i + 1;
        bArr[i] = (byte) ((int) (j >>> 32));
        i = this.position;
        this.position = i + 1;
        bArr[i] = (byte) ((int) (j >>> 24));
        i = this.position;
        this.position = i + 1;
        bArr[i] = (byte) ((int) (j >>> 16));
        i = this.position;
        this.position = i + 1;
        bArr[i] = (byte) ((int) (j >>> 8));
        int i2 = this.position;
        this.position = i2 + 1;
        bArr[i2] = (byte) ((int) j);
    }

    public int writeLong(long j, boolean z) throws KryoException {
        return writeVarLong(j, z);
    }

    public int writeVarLong(long j, boolean z) throws KryoException {
        Output output = this;
        long j2 = !z ? (j << 1) ^ (j >> 63) : j;
        long j3 = j2 >>> 7;
        if (j3 == 0) {
            require(1);
            byte[] bArr = output.buffer;
            int i = output.position;
            output.position = i + 1;
            bArr[i] = (byte) ((int) j2);
            return 1;
        }
        long j4 = j2 >>> 14;
        if (j4 == 0) {
            require(2);
            bArr = output.buffer;
            int i2 = output.position;
            output.position = i2 + 1;
            bArr[i2] = (byte) ((int) ((j2 & 127) | 128));
            byte[] bArr2 = output.buffer;
            int i3 = output.position;
            output.position = i3 + 1;
            bArr2[i3] = (byte) ((int) j3);
            return 2;
        }
        long j5 = j3;
        long j6 = j2 >>> 21;
        if (j6 == 0) {
            require(3);
            bArr = output.buffer;
            i = output.position;
            output.position = i + 1;
            bArr[i] = (byte) ((int) ((j2 & 127) | 128));
            bArr2 = output.buffer;
            i3 = output.position;
            output.position = i3 + 1;
            bArr2[i3] = (byte) ((int) (j5 | 128));
            bArr2 = output.buffer;
            i3 = output.position;
            output.position = i3 + 1;
            bArr2[i3] = (byte) ((int) j4);
            return 3;
        }
        long j7 = j2 >>> 28;
        if (j7 == 0) {
            require(4);
            byte[] bArr3 = output.buffer;
            i2 = output.position;
            output.position = i2 + 1;
            bArr3[i2] = (byte) ((int) ((j2 & 127) | 128));
            bArr3 = output.buffer;
            i2 = output.position;
            output.position = i2 + 1;
            bArr3[i2] = (byte) ((int) (j5 | 128));
            bArr3 = output.buffer;
            i2 = output.position;
            output.position = i2 + 1;
            bArr3[i2] = (byte) ((int) (j4 | 128));
            bArr2 = output.buffer;
            i3 = output.position;
            output.position = i3 + 1;
            bArr2[i3] = (byte) ((int) j6);
            return 4;
        }
        long j8 = j2 >>> 35;
        if (j8 == 0) {
            require(5);
            bArr3 = output.buffer;
            i2 = output.position;
            output.position = i2 + 1;
            bArr3[i2] = (byte) ((int) ((j2 & 127) | 128));
            bArr3 = output.buffer;
            i2 = output.position;
            output.position = i2 + 1;
            bArr3[i2] = (byte) ((int) (j5 | 128));
            bArr3 = output.buffer;
            i2 = output.position;
            output.position = i2 + 1;
            bArr3[i2] = (byte) ((int) (j4 | 128));
            bArr3 = output.buffer;
            i2 = output.position;
            output.position = i2 + 1;
            bArr3[i2] = (byte) ((int) (j6 | 128));
            bArr2 = output.buffer;
            i3 = output.position;
            output.position = i3 + 1;
            bArr2[i3] = (byte) ((int) j7);
            return 5;
        }
        long j9 = j8;
        j8 = j2 >>> 42;
        if (j8 == 0) {
            require(6);
            bArr3 = output.buffer;
            i2 = output.position;
            output.position = i2 + 1;
            bArr3[i2] = (byte) ((int) ((j2 & 127) | 128));
            bArr3 = output.buffer;
            i2 = output.position;
            output.position = i2 + 1;
            bArr3[i2] = (byte) ((int) (j5 | 128));
            bArr3 = output.buffer;
            i2 = output.position;
            output.position = i2 + 1;
            bArr3[i2] = (byte) ((int) (j4 | 128));
            bArr3 = output.buffer;
            i2 = output.position;
            output.position = i2 + 1;
            bArr3[i2] = (byte) ((int) (j6 | 128));
            bArr = output.buffer;
            i = output.position;
            output.position = i + 1;
            bArr[i] = (byte) ((int) (j7 | 128));
            bArr2 = output.buffer;
            i3 = output.position;
            output.position = i3 + 1;
            bArr2[i3] = (byte) ((int) j9);
            return 6;
        }
        long j10 = j8;
        j8 = j2 >>> 49;
        if (j8 == 0) {
            require(7);
            byte[] bArr4 = output.buffer;
            int i4 = output.position;
            output.position = i4 + 1;
            bArr4[i4] = (byte) ((int) ((j2 & 127) | 128));
            bArr4 = output.buffer;
            i4 = output.position;
            output.position = i4 + 1;
            bArr4[i4] = (byte) ((int) (j5 | 128));
            bArr4 = output.buffer;
            i4 = output.position;
            output.position = i4 + 1;
            bArr4[i4] = (byte) ((int) (j4 | 128));
            bArr4 = output.buffer;
            i4 = output.position;
            output.position = i4 + 1;
            bArr4[i4] = (byte) ((int) (j6 | 128));
            bArr4 = output.buffer;
            int i5 = output.position;
            output.position = i5 + 1;
            bArr4[i5] = (byte) ((int) (j7 | 128));
            bArr4 = output.buffer;
            i5 = output.position;
            output.position = i5 + 1;
            bArr4[i5] = (byte) ((int) (j9 | 128));
            bArr2 = output.buffer;
            i3 = output.position;
            output.position = i3 + 1;
            bArr2[i3] = (byte) ((int) j10);
            return 7;
        }
        long j11 = j8;
        j8 = j2 >>> 56;
        if (j8 == 0) {
            require(8);
            bArr3 = output.buffer;
            i2 = output.position;
            output.position = i2 + 1;
            bArr3[i2] = (byte) ((int) ((j2 & 127) | 128));
            bArr3 = output.buffer;
            i2 = output.position;
            output.position = i2 + 1;
            bArr3[i2] = (byte) ((int) (j5 | 128));
            bArr3 = output.buffer;
            i2 = output.position;
            output.position = i2 + 1;
            bArr3[i2] = (byte) ((int) (j4 | 128));
            bArr3 = output.buffer;
            i2 = output.position;
            output.position = i2 + 1;
            bArr3[i2] = (byte) ((int) (j6 | 128));
            bArr = output.buffer;
            i = output.position;
            output.position = i + 1;
            bArr[i] = (byte) ((int) (j7 | 128));
            bArr = output.buffer;
            i = output.position;
            output.position = i + 1;
            bArr[i] = (byte) ((int) (j9 | 128));
            bArr = output.buffer;
            i = output.position;
            output.position = i + 1;
            bArr[i] = (byte) ((int) (j10 | 128));
            bArr2 = output.buffer;
            i3 = output.position;
            output.position = i3 + 1;
            bArr2[i3] = (byte) ((int) j11);
            return 8;
        }
        long j12 = j11;
        require(9);
        byte[] bArr5 = output.buffer;
        int i6 = output.position;
        output.position = i6 + 1;
        long j13 = j8;
        bArr5[i6] = (byte) ((int) ((j2 & 127) | 128));
        bArr4 = output.buffer;
        int i7 = output.position;
        output.position = i7 + 1;
        bArr4[i7] = (byte) ((int) (j5 | 128));
        bArr4 = output.buffer;
        i7 = output.position;
        output.position = i7 + 1;
        bArr4[i7] = (byte) ((int) (j4 | 128));
        bArr4 = output.buffer;
        i7 = output.position;
        output.position = i7 + 1;
        bArr4[i7] = (byte) ((int) (j6 | 128));
        bArr4 = output.buffer;
        i5 = output.position;
        output.position = i5 + 1;
        bArr4[i5] = (byte) ((int) (j7 | 128));
        bArr4 = output.buffer;
        i5 = output.position;
        output.position = i5 + 1;
        bArr4[i5] = (byte) ((int) (j9 | 128));
        bArr4 = output.buffer;
        i5 = output.position;
        output.position = i5 + 1;
        bArr4[i5] = (byte) ((int) (j10 | 128));
        bArr4 = output.buffer;
        i5 = output.position;
        output.position = i5 + 1;
        bArr4[i5] = (byte) ((int) (j12 | 128));
        bArr2 = output.buffer;
        i3 = output.position;
        output.position = i3 + 1;
        bArr2[i3] = (byte) ((int) j13);
        return 9;
    }

    public void writeBoolean(boolean z) throws KryoException {
        if (this.position == this.capacity) {
            require(1);
        }
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        bArr[i] = (byte) z;
    }

    public void writeChar(char c) throws KryoException {
        require(2);
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        bArr[i] = (byte) (c >>> 8);
        bArr = this.buffer;
        i = this.position;
        this.position = i + 1;
        bArr[i] = (byte) c;
    }

    public void writeDouble(double d) throws KryoException {
        writeLong(Double.doubleToLongBits(d));
    }

    public int writeDouble(double d, double d2, boolean z) throws KryoException {
        return writeLong((long) (d * d2), z);
    }

    public void writeInts(int[] iArr, boolean z) throws KryoException {
        for (int writeInt : iArr) {
            writeInt(writeInt, z);
        }
    }

    public void writeLongs(long[] jArr, boolean z) throws KryoException {
        for (long writeLong : jArr) {
            writeLong(writeLong, z);
        }
    }

    public void writeInts(int[] iArr) throws KryoException {
        for (int writeInt : iArr) {
            writeInt(writeInt);
        }
    }

    public void writeLongs(long[] jArr) throws KryoException {
        for (long writeLong : jArr) {
            writeLong(writeLong);
        }
    }

    public void writeFloats(float[] fArr) throws KryoException {
        for (float writeFloat : fArr) {
            writeFloat(writeFloat);
        }
    }

    public void writeShorts(short[] sArr) throws KryoException {
        for (short writeShort : sArr) {
            writeShort(writeShort);
        }
    }

    public void writeChars(char[] cArr) throws KryoException {
        for (char writeChar : cArr) {
            writeChar(writeChar);
        }
    }

    public void writeDoubles(double[] dArr) throws KryoException {
        for (double writeDouble : dArr) {
            writeDouble(writeDouble);
        }
    }
}
