package com.esotericsoftware.kryo.io;

import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.util.UnsafeUtil;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class ByteBufferOutput extends Output {
    protected static final ByteOrder nativeOrder = ByteOrder.nativeOrder();
    ByteOrder byteOrder;
    protected ByteBuffer niobuffer;
    protected boolean varIntsEnabled;

    public ByteBufferOutput() {
        this.varIntsEnabled = true;
        this.byteOrder = ByteOrder.BIG_ENDIAN;
    }

    public ByteBufferOutput(int i) {
        this(i, i);
    }

    public ByteBufferOutput(int i, int i2) {
        this.varIntsEnabled = true;
        this.byteOrder = ByteOrder.BIG_ENDIAN;
        if (i2 < -1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("maxBufferSize cannot be < -1: ");
            stringBuilder.append(i2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.capacity = i;
        if (i2 == -1) {
            i2 = 2147483639;
        }
        this.maxCapacity = i2;
        this.niobuffer = ByteBuffer.allocateDirect(i);
        this.niobuffer.order(this.byteOrder);
    }

    public ByteBufferOutput(OutputStream outputStream) {
        this(4096, 4096);
        if (outputStream == null) {
            throw new IllegalArgumentException("outputStream cannot be null.");
        }
        this.outputStream = outputStream;
    }

    public ByteBufferOutput(OutputStream outputStream, int i) {
        this(i, i);
        if (outputStream == null) {
            throw new IllegalArgumentException("outputStream cannot be null.");
        }
        this.outputStream = outputStream;
    }

    public ByteBufferOutput(ByteBuffer byteBuffer) {
        this.varIntsEnabled = true;
        this.byteOrder = ByteOrder.BIG_ENDIAN;
        setBuffer(byteBuffer);
    }

    public ByteBufferOutput(ByteBuffer byteBuffer, int i) {
        this.varIntsEnabled = true;
        this.byteOrder = ByteOrder.BIG_ENDIAN;
        setBuffer(byteBuffer, i);
    }

    public ByteBufferOutput(long j, int i) {
        this.varIntsEnabled = true;
        this.byteOrder = ByteOrder.BIG_ENDIAN;
        this.niobuffer = UnsafeUtil.getDirectBufferAt(j, i);
        setBuffer(this.niobuffer, i);
    }

    public void release() {
        clear();
        UnsafeUtil.releaseBuffer(this.niobuffer);
        this.niobuffer = null;
    }

    public ByteOrder order() {
        return this.byteOrder;
    }

    public void order(ByteOrder byteOrder) {
        this.byteOrder = byteOrder;
        this.niobuffer.order(byteOrder);
    }

    public OutputStream getOutputStream() {
        return this.outputStream;
    }

    public void setOutputStream(OutputStream outputStream) {
        this.outputStream = outputStream;
        this.position = null;
        this.total = 0;
    }

    public void setBuffer(ByteBuffer byteBuffer) {
        setBuffer(byteBuffer, byteBuffer.capacity());
    }

    public void setBuffer(ByteBuffer byteBuffer, int i) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("buffer cannot be null.");
        } else if (i < -1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("maxBufferSize cannot be < -1: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else {
            this.niobuffer = byteBuffer;
            if (i == -1) {
                i = 2147483639;
            }
            this.maxCapacity = i;
            this.byteOrder = byteBuffer.order();
            this.capacity = byteBuffer.capacity();
            this.position = byteBuffer.position();
            this.total = null;
            this.outputStream = null;
        }
    }

    public ByteBuffer getByteBuffer() {
        this.niobuffer.position(this.position);
        return this.niobuffer;
    }

    public byte[] toBytes() {
        byte[] bArr = new byte[this.position];
        this.niobuffer.position(0);
        this.niobuffer.get(bArr, 0, this.position);
        return bArr;
    }

    public void setPosition(int i) {
        this.position = i;
        this.niobuffer.position(i);
    }

    public void clear() {
        this.niobuffer.clear();
        this.position = 0;
        this.total = 0;
    }

    protected boolean require(int i) throws KryoException {
        if (this.capacity - this.position >= i) {
            return false;
        }
        if (i > this.maxCapacity) {
            this.niobuffer.order(this.byteOrder);
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
                this.niobuffer.order(this.byteOrder);
                stringBuilder = new StringBuilder();
                stringBuilder.append("Buffer overflow. Available: ");
                stringBuilder.append(this.capacity - this.position);
                stringBuilder.append(", required: ");
                stringBuilder.append(i);
                throw new KryoException(stringBuilder.toString());
            }
            ByteBuffer allocateDirect;
            if (this.capacity == 0) {
                this.capacity = 1;
            }
            this.capacity = Math.min(this.capacity * 2, this.maxCapacity);
            if (this.capacity < 0) {
                this.capacity = this.maxCapacity;
            }
            if (this.niobuffer == null || this.niobuffer.isDirect()) {
                allocateDirect = ByteBuffer.allocateDirect(this.capacity);
            } else {
                allocateDirect = ByteBuffer.allocate(this.capacity);
            }
            this.niobuffer.position(0);
            this.niobuffer.limit(this.position);
            allocateDirect.put(this.niobuffer);
            allocateDirect.order(this.niobuffer.order());
            ByteOrder byteOrder = this.byteOrder;
            setBuffer(allocateDirect, this.maxCapacity);
            this.byteOrder = byteOrder;
        }
        return true;
    }

    public void flush() throws KryoException {
        if (this.outputStream != null) {
            try {
                byte[] bArr = new byte[this.position];
                this.niobuffer.position(0);
                this.niobuffer.get(bArr);
                this.niobuffer.position(0);
                this.outputStream.write(bArr, 0, this.position);
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
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.io.ByteBufferOutput.close():void");
    }

    public void write(int i) throws KryoException {
        if (this.position == this.capacity) {
            require(1);
        }
        this.niobuffer.put((byte) i);
        this.position++;
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
        this.niobuffer.put(b);
        this.position++;
    }

    public void writeByte(int i) throws KryoException {
        if (this.position == this.capacity) {
            require(1);
        }
        this.niobuffer.put((byte) i);
        this.position++;
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
            this.niobuffer.put(bArr, i, min);
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
        this.niobuffer.putInt(i);
        this.position += 4;
    }

    public int writeInt(int i, boolean z) throws KryoException {
        if (this.varIntsEnabled) {
            return writeVarInt(i, z);
        }
        writeInt(i);
        return 4;
    }

    public int writeVarInt(int i, boolean z) throws KryoException {
        this.niobuffer.position(this.position);
        if (!z) {
            i = (i >> 31) ^ (i << 1);
        }
        int i2 = i & 127;
        i >>>= 7;
        if (i == 0) {
            writeByte(i2);
            return 1;
        }
        z = (i2 | ProfileEditingConfig.DEFAULT_MAX_LENGTH) | ((i & 127) << 8);
        i >>>= 7;
        if (i == 0) {
            this.niobuffer.order(ByteOrder.LITTLE_ENDIAN);
            writeInt(z);
            this.niobuffer.order(this.byteOrder);
            this.position -= 2;
            this.niobuffer.position(this.position);
            return 2;
        }
        z = (z | true) | ((i & 127) << 16);
        i >>>= 7;
        if (i == 0) {
            this.niobuffer.order(ByteOrder.LITTLE_ENDIAN);
            writeInt(z);
            this.niobuffer.order(this.byteOrder);
            this.position--;
            this.niobuffer.position(this.position);
            return 3;
        }
        z = (z | true) | ((i & 127) << 24);
        i >>>= 7;
        if (i == 0) {
            this.niobuffer.order(ByteOrder.LITTLE_ENDIAN);
            writeInt(z);
            this.niobuffer.order(this.byteOrder);
            this.position += 0;
            return 4;
        }
        long j = (((long) (z | true)) & 4294967295L) | (((long) i) << 32);
        this.niobuffer.order(ByteOrder.LITTLE_ENDIAN);
        writeLong(j);
        this.niobuffer.order(this.byteOrder);
        this.position -= 3;
        this.niobuffer.position(this.position);
        return 5;
    }

    public void writeString(String str) throws KryoException {
        this.niobuffer.position(this.position);
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
        int i;
        char charAt;
        int i2 = 0;
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
                    str = str.getBytes();
                    this.niobuffer.put(str, 0, str.length);
                    this.position += length;
                }
                this.niobuffer.put(this.position - 1, (byte) (ProfileEditingConfig.DEFAULT_MAX_LENGTH | this.niobuffer.get(this.position - 1)));
            } else {
                writeUtf8Length(length + 1);
                if (this.capacity - this.position >= length) {
                    i = this.position;
                    while (i2 < length) {
                        charAt = str.charAt(i2);
                        if (charAt > '') {
                            break;
                        }
                        int i4 = i + 1;
                        this.niobuffer.put(i, (byte) charAt);
                        i2++;
                        i = i4;
                    }
                    this.position = i;
                    this.niobuffer.position(i);
                }
                if (i2 < length) {
                    writeString_slow(str, length, i2);
                }
                this.niobuffer.position(this.position);
            }
        }
        obj = null;
        if (obj == null) {
            writeUtf8Length(length + 1);
            if (this.capacity - this.position >= length) {
                i = this.position;
                while (i2 < length) {
                    charAt = str.charAt(i2);
                    if (charAt > '') {
                        break;
                    }
                    int i42 = i + 1;
                    this.niobuffer.put(i, (byte) charAt);
                    i2++;
                    i = i42;
                }
                this.position = i;
                this.niobuffer.position(i);
            }
            if (i2 < length) {
                writeString_slow(str, length, i2);
            }
            this.niobuffer.position(this.position);
        } else {
            if (this.capacity - this.position >= length) {
                str = str.getBytes();
                this.niobuffer.put(str, 0, str.length);
                this.position += length;
            } else {
                writeAscii_slow(str, length);
            }
            this.niobuffer.put(this.position - 1, (byte) (ProfileEditingConfig.DEFAULT_MAX_LENGTH | this.niobuffer.get(this.position - 1)));
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
            int i2 = this.position;
            while (i < length) {
                char charAt = charSequence.charAt(i);
                if (charAt > '') {
                    break;
                }
                int i3 = i2 + 1;
                this.niobuffer.put(i2, (byte) charAt);
                i++;
                i2 = i3;
            }
            this.position = i2;
            this.niobuffer.position(i2);
        }
        if (i < length) {
            writeString_slow(charSequence, length, i);
        }
        this.niobuffer.position(this.position);
    }

    public void writeAscii(String str) throws KryoException {
        if (str == null) {
            writeByte((int) ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            return;
        }
        int length = str.length();
        if (length == 0) {
            writeByte(129);
            return;
        }
        if (this.capacity - this.position < length) {
            writeAscii_slow(str, length);
        } else {
            str = str.getBytes();
            this.niobuffer.put(str, 0, str.length);
            this.position += length;
        }
        this.niobuffer.put(this.position - 1, (byte) (ProfileEditingConfig.DEFAULT_MAX_LENGTH | this.niobuffer.get(this.position - 1)));
    }

    private void writeUtf8Length(int i) {
        int i2 = i >>> 6;
        if (i2 == 0) {
            require(1);
            this.niobuffer.put((byte) (i | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
            this.position++;
            return;
        }
        int i3 = i >>> 13;
        if (i3 == 0) {
            require(2);
            this.niobuffer.put((byte) ((i | 64) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
            this.niobuffer.put((byte) i2);
            this.position += 2;
            return;
        }
        int i4 = i >>> 20;
        if (i4 == 0) {
            require(3);
            this.niobuffer.put((byte) ((i | 64) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
            this.niobuffer.put((byte) (i2 | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
            this.niobuffer.put((byte) i3);
            this.position += 3;
            return;
        }
        int i5 = i >>> 27;
        if (i5 == 0) {
            require(4);
            this.niobuffer.put((byte) ((i | 64) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
            this.niobuffer.put((byte) (i2 | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
            this.niobuffer.put((byte) (i3 | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
            this.niobuffer.put((byte) i4);
            this.position += 4;
            return;
        }
        require(5);
        this.niobuffer.put((byte) ((i | 64) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
        this.niobuffer.put((byte) (i2 | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
        this.niobuffer.put((byte) (i3 | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
        this.niobuffer.put((byte) (i4 | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
        this.niobuffer.put((byte) i5);
        this.position += 5;
    }

    private void writeString_slow(CharSequence charSequence, int i, int i2) {
        while (i2 < i) {
            if (this.position == this.capacity) {
                require(Math.min(this.capacity, i - i2));
            }
            char charAt = charSequence.charAt(i2);
            ByteBuffer byteBuffer;
            int i3;
            if (charAt <= '') {
                byteBuffer = this.niobuffer;
                i3 = this.position;
                this.position = i3 + 1;
                byteBuffer.put(i3, (byte) charAt);
            } else if (charAt > '߿') {
                byteBuffer = this.niobuffer;
                i3 = this.position;
                this.position = i3 + 1;
                byteBuffer.put(i3, (byte) (((charAt >> 12) & 15) | 224));
                require(2);
                byteBuffer = this.niobuffer;
                i3 = this.position;
                this.position = i3 + 1;
                byteBuffer.put(i3, (byte) (((charAt >> 6) & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
                byteBuffer = this.niobuffer;
                i3 = this.position;
                this.position = i3 + 1;
                byteBuffer.put(i3, (byte) ((charAt & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
            } else {
                byteBuffer = this.niobuffer;
                i3 = this.position;
                this.position = i3 + 1;
                byteBuffer.put(i3, (byte) (((charAt >> 6) & 31) | 192));
                require(1);
                byteBuffer = this.niobuffer;
                i3 = this.position;
                this.position = i3 + 1;
                byteBuffer.put(i3, (byte) ((charAt & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
            }
            i2++;
        }
    }

    private void writeAscii_slow(String str, int i) throws KryoException {
        ByteBuffer byteBuffer = this.niobuffer;
        int min = Math.min(i, this.capacity - this.position);
        ByteBuffer byteBuffer2 = byteBuffer;
        int i2 = 0;
        while (i2 < i) {
            byte[] bArr = new byte[i];
            int i3 = i2 + min;
            str.getBytes(i2, i3, bArr, 0);
            byteBuffer2.put(bArr, 0, min);
            this.position += min;
            min = Math.min(i - i3, this.capacity);
            if (require(min)) {
                byteBuffer2 = this.niobuffer;
            }
            i2 = i3;
        }
    }

    public void writeFloat(float f) throws KryoException {
        require(4);
        this.niobuffer.putFloat(f);
        this.position += 5.6E-45f;
    }

    public int writeFloat(float f, float f2, boolean z) throws KryoException {
        return writeInt((int) (f * f2), z);
    }

    public void writeShort(int i) throws KryoException {
        require(2);
        this.niobuffer.putShort((short) i);
        this.position += 2;
    }

    public void writeLong(long j) throws KryoException {
        require(8);
        this.niobuffer.putLong(j);
        this.position += 8;
    }

    public int writeLong(long j, boolean z) throws KryoException {
        if (this.varIntsEnabled) {
            return writeVarLong(j, z);
        }
        writeLong(j);
        return 8;
    }

    public int writeVarLong(long j, boolean z) throws KryoException {
        ByteBufferOutput byteBufferOutput = this;
        long j2 = !z ? (j << 1) ^ (j >> 63) : j;
        int i = (int) (j2 & 127);
        j2 >>>= 7;
        if (j2 == 0) {
            writeByte(i);
            return 1;
        }
        int i2 = (int) (((long) (i | ProfileEditingConfig.DEFAULT_MAX_LENGTH)) | ((j2 & 127) << 8));
        j2 >>>= 7;
        if (j2 == 0) {
            byteBufferOutput.niobuffer.order(ByteOrder.LITTLE_ENDIAN);
            writeInt(i2);
            byteBufferOutput.niobuffer.order(byteBufferOutput.byteOrder);
            byteBufferOutput.position -= 2;
            byteBufferOutput.niobuffer.position(byteBufferOutput.position);
            return 2;
        }
        int i3 = (int) (((long) (i2 | 32768)) | ((j2 & 127) << 16));
        j2 >>>= 7;
        if (j2 == 0) {
            byteBufferOutput.niobuffer.order(ByteOrder.LITTLE_ENDIAN);
            writeInt(i3);
            byteBufferOutput.niobuffer.order(byteBufferOutput.byteOrder);
            byteBufferOutput.position--;
            byteBufferOutput.niobuffer.position(byteBufferOutput.position);
            return 3;
        }
        i3 = (int) (((long) (i3 | 8388608)) | ((j2 & 127) << 24));
        j2 >>>= 7;
        if (j2 == 0) {
            byteBufferOutput.niobuffer.order(ByteOrder.LITTLE_ENDIAN);
            writeInt(i3);
            byteBufferOutput.niobuffer.order(byteBufferOutput.byteOrder);
            byteBufferOutput.position += 0;
            return 4;
        }
        long j3 = (((long) (i3 | Integer.MIN_VALUE)) & 4294967295L) | ((j2 & 127) << 32);
        j2 >>>= 7;
        if (j2 == 0) {
            byteBufferOutput.niobuffer.order(ByteOrder.LITTLE_ENDIAN);
            writeLong(j3);
            byteBufferOutput.niobuffer.order(byteBufferOutput.byteOrder);
            byteBufferOutput.position -= 3;
            byteBufferOutput.niobuffer.position(byteBufferOutput.position);
            return 5;
        }
        j3 = (j3 | 549755813888L) | ((j2 & 127) << 40);
        j2 >>>= 7;
        if (j2 == 0) {
            byteBufferOutput.niobuffer.order(ByteOrder.LITTLE_ENDIAN);
            writeLong(j3);
            byteBufferOutput.niobuffer.order(byteBufferOutput.byteOrder);
            byteBufferOutput.position -= 2;
            byteBufferOutput.niobuffer.position(byteBufferOutput.position);
            return 6;
        }
        j3 = (j3 | 140737488355328L) | ((j2 & 127) << 48);
        j2 >>>= 7;
        if (j2 == 0) {
            byteBufferOutput.niobuffer.order(ByteOrder.LITTLE_ENDIAN);
            writeLong(j3);
            byteBufferOutput.niobuffer.order(byteBufferOutput.byteOrder);
            byteBufferOutput.position--;
            byteBufferOutput.niobuffer.position(byteBufferOutput.position);
            return 7;
        }
        j3 = (j3 | 36028797018963968L) | ((j2 & 127) << 56);
        j2 >>>= 7;
        if (j2 == 0) {
            byteBufferOutput.niobuffer.order(ByteOrder.LITTLE_ENDIAN);
            writeLong(j3);
            byteBufferOutput.niobuffer.order(byteBufferOutput.byteOrder);
            return 8;
        }
        long j4 = j3 | Long.MIN_VALUE;
        byteBufferOutput.niobuffer.order(ByteOrder.LITTLE_ENDIAN);
        writeLong(j4);
        byteBufferOutput.niobuffer.order(byteBufferOutput.byteOrder);
        write((byte) ((int) j2));
        return 9;
    }

    public int writeLongS(long j, boolean z) throws KryoException {
        ByteBufferOutput byteBufferOutput = this;
        long j2 = !z ? (j << 1) ^ (j >> 63) : j;
        long j3 = j2 >>> 7;
        if (j3 == 0) {
            require(1);
            byteBufferOutput.niobuffer.put((byte) ((int) j2));
            byteBufferOutput.position++;
            return 1;
        }
        long j4 = j2 >>> 14;
        if (j4 == 0) {
            require(2);
            byteBufferOutput.niobuffer.put((byte) ((int) ((j2 & 127) | 128)));
            byteBufferOutput.niobuffer.put((byte) ((int) j3));
            byteBufferOutput.position += 2;
            return 2;
        }
        long j5 = j3;
        long j6 = j2 >>> 21;
        if (j6 == 0) {
            require(3);
            byteBufferOutput.niobuffer.put((byte) ((int) ((j2 & 127) | 128)));
            byteBufferOutput.niobuffer.put((byte) ((int) (j5 | 128)));
            byteBufferOutput.niobuffer.put((byte) ((int) j4));
            byteBufferOutput.position += 3;
            return 3;
        }
        long j7 = j2 >>> 28;
        if (j7 == 0) {
            require(4);
            byteBufferOutput.niobuffer.put((byte) ((int) ((j2 & 127) | 128)));
            byteBufferOutput.niobuffer.put((byte) ((int) (j5 | 128)));
            byteBufferOutput.niobuffer.put((byte) ((int) (j4 | 128)));
            byteBufferOutput.niobuffer.put((byte) ((int) j6));
            byteBufferOutput.position += 4;
            return 4;
        }
        long j8 = j2 >>> 35;
        if (j8 == 0) {
            require(5);
            byteBufferOutput.niobuffer.put((byte) ((int) ((j2 & 127) | 128)));
            byteBufferOutput.niobuffer.put((byte) ((int) (j5 | 128)));
            byteBufferOutput.niobuffer.put((byte) ((int) (j4 | 128)));
            byteBufferOutput.niobuffer.put((byte) ((int) (j6 | 128)));
            byteBufferOutput.niobuffer.put((byte) ((int) j7));
            byteBufferOutput.position += 5;
            return 5;
        }
        long j9 = j8;
        j8 = j2 >>> 42;
        if (j8 == 0) {
            require(6);
            byteBufferOutput.niobuffer.put((byte) ((int) ((j2 & 127) | 128)));
            byteBufferOutput.niobuffer.put((byte) ((int) (j5 | 128)));
            byteBufferOutput.niobuffer.put((byte) ((int) (j4 | 128)));
            byteBufferOutput.niobuffer.put((byte) ((int) (j6 | 128)));
            byteBufferOutput.niobuffer.put((byte) ((int) (j7 | 128)));
            byteBufferOutput.niobuffer.put((byte) ((int) j9));
            byteBufferOutput.position += 6;
            return 6;
        }
        long j10 = j8;
        j8 = j2 >>> 49;
        if (j8 == 0) {
            require(7);
            byteBufferOutput.niobuffer.put((byte) ((int) ((j2 & 127) | 128)));
            byteBufferOutput.niobuffer.put((byte) ((int) (j5 | 128)));
            byteBufferOutput.niobuffer.put((byte) ((int) (j4 | 128)));
            byteBufferOutput.niobuffer.put((byte) ((int) (j6 | 128)));
            byteBufferOutput.niobuffer.put((byte) ((int) (j7 | 128)));
            byteBufferOutput.niobuffer.put((byte) ((int) (j9 | 128)));
            byteBufferOutput.niobuffer.put((byte) ((int) j10));
            byteBufferOutput.position += 7;
            return 7;
        }
        long j11 = j8;
        j8 = j2 >>> 56;
        if (j8 == 0) {
            require(8);
            byteBufferOutput.niobuffer.put((byte) ((int) ((j2 & 127) | 128)));
            byteBufferOutput.niobuffer.put((byte) ((int) (j5 | 128)));
            byteBufferOutput.niobuffer.put((byte) ((int) (j4 | 128)));
            byteBufferOutput.niobuffer.put((byte) ((int) (j6 | 128)));
            byteBufferOutput.niobuffer.put((byte) ((int) (j7 | 128)));
            byteBufferOutput.niobuffer.put((byte) ((int) (j9 | 128)));
            byteBufferOutput.niobuffer.put((byte) ((int) (j10 | 128)));
            byteBufferOutput.niobuffer.put((byte) ((int) j11));
            byteBufferOutput.position += 8;
            return 8;
        }
        long j12 = j11;
        require(9);
        long j13 = j6;
        byteBufferOutput.niobuffer.put((byte) ((int) ((j2 & 127) | 128)));
        byteBufferOutput.niobuffer.put((byte) ((int) (j5 | 128)));
        byteBufferOutput.niobuffer.put((byte) ((int) (j4 | 128)));
        byteBufferOutput.niobuffer.put((byte) ((int) (j13 | 128)));
        byteBufferOutput.niobuffer.put((byte) ((int) (j7 | 128)));
        byteBufferOutput.niobuffer.put((byte) ((int) (j9 | 128)));
        byteBufferOutput.niobuffer.put((byte) ((int) (j10 | 128)));
        byteBufferOutput.niobuffer.put((byte) ((int) (j12 | 128)));
        byteBufferOutput.niobuffer.put((byte) ((int) j8));
        byteBufferOutput.position += 9;
        return 9;
    }

    public void writeBoolean(boolean z) throws KryoException {
        require(1);
        this.niobuffer.put((byte) z);
        this.position += true;
    }

    public void writeChar(char c) throws KryoException {
        require(2);
        this.niobuffer.putChar(c);
        this.position += '\u0002';
    }

    public void writeDouble(double d) throws KryoException {
        require(8);
        this.niobuffer.putDouble(d);
        this.position += 4.0E-323d;
    }

    public int writeDouble(double d, double d2, boolean z) throws KryoException {
        return writeLong((long) (d * d2), z);
    }

    public void writeInts(int[] iArr) throws KryoException {
        if (this.capacity - this.position < iArr.length * 4 || !isNativeOrder()) {
            super.writeInts(iArr);
            return;
        }
        this.niobuffer.asIntBuffer().put(iArr);
        this.position += iArr.length * 4;
    }

    public void writeLongs(long[] jArr) throws KryoException {
        if (this.capacity - this.position < jArr.length * 8 || !isNativeOrder()) {
            super.writeLongs(jArr);
            return;
        }
        this.niobuffer.asLongBuffer().put(jArr);
        this.position += jArr.length * 8;
    }

    public void writeFloats(float[] fArr) throws KryoException {
        if (this.capacity - this.position < fArr.length * 4 || !isNativeOrder()) {
            super.writeFloats(fArr);
            return;
        }
        this.niobuffer.asFloatBuffer().put(fArr);
        this.position += fArr.length * 4;
    }

    public void writeShorts(short[] sArr) throws KryoException {
        if (this.capacity - this.position < sArr.length * 2 || !isNativeOrder()) {
            super.writeShorts(sArr);
            return;
        }
        this.niobuffer.asShortBuffer().put(sArr);
        this.position += sArr.length * 2;
    }

    public void writeChars(char[] cArr) throws KryoException {
        if (this.capacity - this.position < cArr.length * 2 || !isNativeOrder()) {
            super.writeChars(cArr);
            return;
        }
        this.niobuffer.asCharBuffer().put(cArr);
        this.position += cArr.length * 2;
    }

    public void writeDoubles(double[] dArr) throws KryoException {
        if (this.capacity - this.position < dArr.length * 8 || !isNativeOrder()) {
            super.writeDoubles(dArr);
            return;
        }
        this.niobuffer.asDoubleBuffer().put(dArr);
        this.position += dArr.length * 8;
    }

    private boolean isNativeOrder() {
        return this.byteOrder == nativeOrder;
    }

    public boolean getVarIntsEnabled() {
        return this.varIntsEnabled;
    }

    public void setVarIntsEnabled(boolean z) {
        this.varIntsEnabled = z;
    }
}
