package com.esotericsoftware.kryo.io;

import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.util.UnsafeUtil;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class ByteBufferInput extends Input {
    protected static final ByteOrder nativeOrder = ByteOrder.nativeOrder();
    ByteOrder byteOrder;
    protected ByteBuffer niobuffer;
    protected boolean varIntsEnabled;

    public ByteBufferInput() {
        this.varIntsEnabled = true;
        this.byteOrder = ByteOrder.BIG_ENDIAN;
    }

    public ByteBufferInput(int i) {
        this.varIntsEnabled = true;
        this.byteOrder = ByteOrder.BIG_ENDIAN;
        this.capacity = i;
        this.niobuffer = ByteBuffer.allocateDirect(i);
        this.niobuffer.order(this.byteOrder);
    }

    public ByteBufferInput(byte[] bArr) {
        this.varIntsEnabled = true;
        this.byteOrder = ByteOrder.BIG_ENDIAN;
        setBuffer(bArr);
    }

    public ByteBufferInput(ByteBuffer byteBuffer) {
        this.varIntsEnabled = true;
        this.byteOrder = ByteOrder.BIG_ENDIAN;
        setBuffer(byteBuffer);
    }

    public ByteBufferInput(InputStream inputStream) {
        this(4096);
        if (inputStream == null) {
            throw new IllegalArgumentException("inputStream cannot be null.");
        }
        this.inputStream = inputStream;
    }

    public ByteBufferInput(InputStream inputStream, int i) {
        this(i);
        if (inputStream == null) {
            throw new IllegalArgumentException("inputStream cannot be null.");
        }
        this.inputStream = inputStream;
    }

    public ByteOrder order() {
        return this.byteOrder;
    }

    public void order(ByteOrder byteOrder) {
        this.byteOrder = byteOrder;
    }

    public void setBuffer(byte[] bArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        allocateDirect.position(0);
        allocateDirect.limit(bArr.length);
        allocateDirect.order(this.byteOrder);
        setBuffer(allocateDirect);
    }

    public void setBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("buffer cannot be null.");
        }
        this.niobuffer = byteBuffer;
        this.position = byteBuffer.position();
        this.limit = byteBuffer.limit();
        this.capacity = byteBuffer.capacity();
        this.byteOrder = byteBuffer.order();
        this.total = 0;
        this.inputStream = null;
    }

    public void release() {
        close();
        UnsafeUtil.releaseBuffer(this.niobuffer);
        this.niobuffer = null;
    }

    public ByteBufferInput(long j, int i) {
        this.varIntsEnabled = true;
        this.byteOrder = ByteOrder.BIG_ENDIAN;
        setBuffer(UnsafeUtil.getDirectBufferAt(j, i));
    }

    public ByteBuffer getByteBuffer() {
        return this.niobuffer;
    }

    public InputStream getInputStream() {
        return this.inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
        this.limit = null;
        rewind();
    }

    public void rewind() {
        super.rewind();
        this.niobuffer.position(0);
    }

    protected int fill(ByteBuffer byteBuffer, int i, int i2) throws KryoException {
        if (this.inputStream == null) {
            return -1;
        }
        try {
            byte[] bArr = new byte[i2];
            i2 = this.inputStream.read(bArr, 0, i2);
            byteBuffer.position(i);
            if (i2 >= 0) {
                byteBuffer.put(bArr, 0, i2);
                byteBuffer.position(i);
            }
            return i2;
        } catch (Throwable e) {
            throw new KryoException(e);
        }
    }

    protected final int require(int i) throws KryoException {
        int i2 = this.limit - this.position;
        if (i2 >= i) {
            return i2;
        }
        if (i > this.capacity) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Buffer too small: capacity: ");
            stringBuilder.append(this.capacity);
            stringBuilder.append(", required: ");
            stringBuilder.append(i);
            throw new KryoException(stringBuilder.toString());
        }
        if (i2 > 0) {
            int fill = fill(this.niobuffer, this.limit, this.capacity - this.limit);
            if (fill == -1) {
                throw new KryoException("Buffer underflow.");
            }
            i2 += fill;
            if (i2 >= i) {
                this.limit += fill;
                return i2;
            }
        }
        this.niobuffer.position(this.position);
        this.niobuffer.compact();
        this.total += (long) this.position;
        this.position = 0;
        do {
            int fill2 = fill(this.niobuffer, i2, this.capacity - i2);
            if (fill2 != -1) {
                i2 += fill2;
            } else if (i2 < i) {
                throw new KryoException("Buffer underflow.");
            }
            this.limit = i2;
            this.niobuffer.position(0);
            return i2;
        } while (i2 < i);
        this.limit = i2;
        this.niobuffer.position(0);
        return i2;
    }

    private int optional(int i) throws KryoException {
        int i2 = this.limit - this.position;
        if (i2 >= i) {
            return i;
        }
        i = Math.min(i, this.capacity);
        int fill = fill(this.niobuffer, this.limit, this.capacity - this.limit);
        int i3 = -1;
        if (fill == -1) {
            if (i2 != 0) {
                i3 = Math.min(i2, i);
            }
            return i3;
        }
        i2 += fill;
        if (i2 >= i) {
            this.limit += fill;
            return i;
        }
        this.niobuffer.compact();
        this.total += (long) this.position;
        this.position = 0;
        do {
            fill = fill(this.niobuffer, i2, this.capacity - i2);
            if (fill == -1) {
                break;
            }
            i2 += fill;
        } while (i2 < i);
        this.limit = i2;
        this.niobuffer.position(this.position);
        if (i2 != 0) {
            i3 = Math.min(i2, i);
        }
        return i3;
    }

    public int read() throws KryoException {
        if (optional(1) <= 0) {
            return -1;
        }
        this.niobuffer.position(this.position);
        this.position++;
        return this.niobuffer.get() & 255;
    }

    public int read(byte[] bArr) throws KryoException {
        this.niobuffer.position(this.position);
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) throws KryoException {
        this.niobuffer.position(this.position);
        if (bArr == null) {
            throw new IllegalArgumentException("bytes cannot be null.");
        }
        int min = Math.min(this.limit - this.position, i2);
        int i3 = i2;
        do {
            this.niobuffer.get(bArr, i, min);
            this.position += min;
            i3 -= min;
            if (i3 == 0) {
                break;
            }
            i += min;
            min = optional(i3);
            if (min == -1) {
                if (i2 == i3) {
                    return -1;
                }
            }
        } while (this.position != this.limit);
        return i2 - i3;
    }

    public void setPosition(int i) {
        this.position = i;
        this.niobuffer.position(i);
    }

    public void setLimit(int i) {
        this.limit = i;
        this.niobuffer.limit(i);
    }

    public void skip(int i) throws KryoException {
        super.skip(i);
        this.niobuffer.position(position());
    }

    public long skip(long j) throws KryoException {
        long j2 = j;
        while (j2 > 0) {
            int min = (int) Math.min(2147483639, j2);
            skip(min);
            j2 -= (long) min;
        }
        return j;
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
        r0 = r1.inputStream;
        if (r0 == 0) goto L_0x0009;
    L_0x0004:
        r0 = r1.inputStream;	 Catch:{ IOException -> 0x0009 }
        r0.close();	 Catch:{ IOException -> 0x0009 }
    L_0x0009:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.io.ByteBufferInput.close():void");
    }

    public byte readByte() throws KryoException {
        this.niobuffer.position(this.position);
        require(1);
        this.position++;
        return this.niobuffer.get();
    }

    public int readByteUnsigned() throws KryoException {
        require(1);
        this.position++;
        return this.niobuffer.get() & 255;
    }

    public byte[] readBytes(int i) throws KryoException {
        byte[] bArr = new byte[i];
        readBytes(bArr, 0, i);
        return bArr;
    }

    public void readBytes(byte[] bArr) throws KryoException {
        readBytes(bArr, 0, bArr.length);
    }

    public void readBytes(byte[] bArr, int i, int i2) throws KryoException {
        if (bArr == null) {
            throw new IllegalArgumentException("bytes cannot be null.");
        }
        int min = Math.min(this.limit - this.position, i2);
        while (true) {
            this.niobuffer.get(bArr, i, min);
            this.position += min;
            i2 -= min;
            if (i2 != 0) {
                i += min;
                min = Math.min(i2, this.capacity);
                require(min);
            } else {
                return;
            }
        }
    }

    public int readInt() throws KryoException {
        require(4);
        this.position += 4;
        return this.niobuffer.getInt();
    }

    public int readInt(boolean z) throws KryoException {
        if (this.varIntsEnabled) {
            return readVarInt(z);
        }
        return readInt();
    }

    public int readVarInt(boolean z) throws KryoException {
        this.niobuffer.position(this.position);
        if (require(1) < 5) {
            return readInt_slow(z);
        }
        this.position++;
        byte b = this.niobuffer.get();
        int i = b & 127;
        if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
            this.position++;
            b = this.niobuffer.get();
            i |= (b & 127) << 7;
            if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                this.position++;
                b = this.niobuffer.get();
                i |= (b & 127) << 14;
                if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                    this.position++;
                    b = this.niobuffer.get();
                    i |= (b & 127) << 21;
                    if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                        this.position++;
                        i |= (this.niobuffer.get() & 127) << 28;
                    }
                }
            }
        }
        if (!z) {
            i = (i >>> 1) ^ (-(i & 1));
        }
        return i;
    }

    private int readInt_slow(boolean z) {
        this.position++;
        byte b = this.niobuffer.get();
        int i = b & 127;
        if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
            require(1);
            this.position++;
            b = this.niobuffer.get();
            i |= (b & 127) << 7;
            if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                require(1);
                this.position++;
                b = this.niobuffer.get();
                i |= (b & 127) << 14;
                if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                    require(1);
                    this.position++;
                    b = this.niobuffer.get();
                    i |= (b & 127) << 21;
                    if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                        require(1);
                        this.position++;
                        i |= (this.niobuffer.get() & 127) << 28;
                    }
                }
            }
        }
        return z ? i : (i >>> 1) ^ (-(i & 1));
    }

    public boolean canReadInt() throws KryoException {
        if (this.limit - this.position >= 5) {
            return true;
        }
        if (optional(5) <= 0) {
            return false;
        }
        int i = this.position;
        int i2 = i + 1;
        if ((this.niobuffer.get(i) & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
            return true;
        }
        if (i2 == this.limit) {
            return false;
        }
        int i3 = i2 + 1;
        if ((this.niobuffer.get(i2) & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
            return true;
        }
        if (i3 == this.limit) {
            return false;
        }
        i2 = i3 + 1;
        if ((this.niobuffer.get(i3) & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
            return true;
        }
        if (i2 == this.limit) {
            return false;
        }
        i3 = i2 + 1;
        if ((this.niobuffer.get(i2) & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 && i3 == this.limit) {
            return false;
        }
        return true;
    }

    public boolean canReadLong() throws KryoException {
        if (this.limit - this.position >= 9) {
            return true;
        }
        if (optional(5) <= 0) {
            return false;
        }
        int i = this.position;
        int i2 = i + 1;
        if ((this.niobuffer.get(i) & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
            return true;
        }
        if (i2 == this.limit) {
            return false;
        }
        int i3 = i2 + 1;
        if ((this.niobuffer.get(i2) & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
            return true;
        }
        if (i3 == this.limit) {
            return false;
        }
        i2 = i3 + 1;
        if ((this.niobuffer.get(i3) & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
            return true;
        }
        if (i2 == this.limit) {
            return false;
        }
        i3 = i2 + 1;
        if ((this.niobuffer.get(i2) & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
            return true;
        }
        if (i3 == this.limit) {
            return false;
        }
        i2 = i3 + 1;
        if ((this.niobuffer.get(i3) & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
            return true;
        }
        if (i2 == this.limit) {
            return false;
        }
        i3 = i2 + 1;
        if ((this.niobuffer.get(i2) & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
            return true;
        }
        if (i3 == this.limit) {
            return false;
        }
        i2 = i3 + 1;
        if ((this.niobuffer.get(i3) & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
            return true;
        }
        if (i2 == this.limit) {
            return false;
        }
        i3 = i2 + 1;
        if ((this.niobuffer.get(i2) & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 && i3 == this.limit) {
            return false;
        }
        return true;
    }

    public String readString() {
        this.niobuffer.position(this.position);
        int require = require(1);
        this.position++;
        byte b = this.niobuffer.get();
        if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
            return readAscii();
        }
        int readUtf8Length = require >= 5 ? readUtf8Length(b) : readUtf8Length_slow(b);
        switch (readUtf8Length) {
            case 0:
                return null;
            case 1:
                return "";
            default:
                readUtf8Length--;
                if (this.chars.length < readUtf8Length) {
                    this.chars = new char[readUtf8Length];
                }
                readUtf8(readUtf8Length);
                return new String(this.chars, 0, readUtf8Length);
        }
    }

    private int readUtf8Length(int i) {
        int i2 = i & 63;
        if ((i & 64) == 0) {
            return i2;
        }
        this.position++;
        i = this.niobuffer.get();
        i2 |= (i & 127) << 6;
        if ((i & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
            return i2;
        }
        this.position++;
        i = this.niobuffer.get();
        i2 |= (i & 127) << 13;
        if ((i & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
            return i2;
        }
        this.position++;
        i = this.niobuffer.get();
        i2 |= (i & 127) << 20;
        if ((i & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
            return i2;
        }
        this.position++;
        return i2 | ((this.niobuffer.get() & 127) << 27);
    }

    private int readUtf8Length_slow(int i) {
        int i2 = i & 63;
        if ((i & 64) == 0) {
            return i2;
        }
        require(1);
        this.position++;
        byte b = this.niobuffer.get();
        i2 |= (b & 127) << 6;
        if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
            return i2;
        }
        require(1);
        this.position++;
        b = this.niobuffer.get();
        i2 |= (b & 127) << 13;
        if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
            return i2;
        }
        require(1);
        this.position++;
        b = this.niobuffer.get();
        i2 |= (b & 127) << 20;
        if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
            return i2;
        }
        require(1);
        this.position++;
        return i2 | ((this.niobuffer.get() & 127) << 27);
    }

    private void readUtf8(int i) {
        char[] cArr = this.chars;
        int min = Math.min(require(1), i);
        int i2 = this.position;
        int i3 = 0;
        while (i3 < min) {
            i2++;
            byte b = this.niobuffer.get();
            if (b < (byte) 0) {
                i2--;
                break;
            }
            int i4 = i3 + 1;
            cArr[i3] = (char) b;
            i3 = i4;
        }
        this.position = i2;
        if (i3 < i) {
            this.niobuffer.position(i2);
            readUtf8_slow(i, i3);
        }
    }

    private void readUtf8_slow(int i, int i2) {
        char[] cArr = this.chars;
        while (i2 < i) {
            if (this.position == this.limit) {
                require(1);
            }
            this.position++;
            int i3 = this.niobuffer.get() & 255;
            int i4 = i3 >> 4;
            switch (i4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    cArr[i2] = (char) i3;
                    break;
                default:
                    switch (i4) {
                        case 12:
                        case 13:
                            if (this.position == this.limit) {
                                require(1);
                            }
                            this.position++;
                            cArr[i2] = (char) (((i3 & 31) << 6) | (this.niobuffer.get() & 63));
                            break;
                        case 14:
                            require(2);
                            this.position += 2;
                            cArr[i2] = (char) ((((i3 & 15) << 12) | ((this.niobuffer.get() & 63) << 6)) | (this.niobuffer.get() & 63));
                            break;
                        default:
                            break;
                    }
            }
            i2++;
        }
    }

    private String readAscii() {
        int i = this.position;
        int i2 = i - 1;
        int i3 = this.limit;
        while (i != i3) {
            i++;
            if ((this.niobuffer.get() & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                int i4 = i - 1;
                this.niobuffer.put(i4, (byte) (this.niobuffer.get(i4) & 127));
                i3 = i - i2;
                byte[] bArr = new byte[i3];
                this.niobuffer.position(i2);
                this.niobuffer.get(bArr);
                String str = new String(bArr, 0, 0, i3);
                this.niobuffer.put(i4, (byte) (this.niobuffer.get(i4) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
                this.position = i;
                this.niobuffer.position(this.position);
                return str;
            }
        }
        return readAscii_slow();
    }

    private String readAscii_slow() {
        this.position--;
        int i = this.limit - this.position;
        if (i > this.chars.length) {
            this.chars = new char[(i * 2)];
        }
        Object obj = this.chars;
        int i2 = this.position;
        int i3 = this.limit;
        int i4 = 0;
        while (i2 < i3) {
            obj[i4] = (char) this.niobuffer.get(i2);
            i2++;
            i4++;
        }
        this.position = this.limit;
        while (true) {
            require(1);
            this.position++;
            byte b = this.niobuffer.get();
            if (i == obj.length) {
                Object obj2 = new char[(i * 2)];
                System.arraycopy(obj, 0, obj2, 0, i);
                this.chars = obj2;
                obj = obj2;
            }
            if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                int i5 = i + 1;
                obj[i] = (char) (b & 127);
                return new String(obj, 0, i5);
            }
            i3 = i + 1;
            obj[i] = (char) b;
            i = i3;
        }
    }

    public StringBuilder readStringBuilder() {
        this.niobuffer.position(this.position);
        int require = require(1);
        this.position++;
        byte b = this.niobuffer.get();
        if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
            return new StringBuilder(readAscii());
        }
        int readUtf8Length = require >= 5 ? readUtf8Length(b) : readUtf8Length_slow(b);
        switch (readUtf8Length) {
            case 0:
                return null;
            case 1:
                return new StringBuilder("");
            default:
                readUtf8Length--;
                if (this.chars.length < readUtf8Length) {
                    this.chars = new char[readUtf8Length];
                }
                readUtf8(readUtf8Length);
                StringBuilder stringBuilder = new StringBuilder(readUtf8Length);
                stringBuilder.append(this.chars, 0, readUtf8Length);
                return stringBuilder;
        }
    }

    public float readFloat() throws KryoException {
        require(4);
        this.position += 4;
        return this.niobuffer.getFloat();
    }

    public float readFloat(float f, boolean z) throws KryoException {
        return ((float) readInt(z)) / f;
    }

    public short readShort() throws KryoException {
        require(2);
        this.position += 2;
        return this.niobuffer.getShort();
    }

    public int readShortUnsigned() throws KryoException {
        require(2);
        this.position += 2;
        return this.niobuffer.getShort();
    }

    public long readLong() throws KryoException {
        require(8);
        this.position += 8;
        return this.niobuffer.getLong();
    }

    public long readLong(boolean z) throws KryoException {
        if (this.varIntsEnabled) {
            return readVarLong(z);
        }
        return readLong();
    }

    public long readVarLong(boolean z) throws KryoException {
        this.niobuffer.position(this.position);
        if (require(1) < 9) {
            return readLong_slow(z);
        }
        long j;
        this.position++;
        byte b = this.niobuffer.get();
        long j2 = (long) (b & 127);
        if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
            this.position++;
            b = this.niobuffer.get();
            j = j2 | ((long) ((b & 127) << 7));
            if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                this.position++;
                b = this.niobuffer.get();
                long j3 = j | ((long) ((b & 127) << 14));
                if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                    this.position++;
                    b = this.niobuffer.get();
                    j = j3 | ((long) ((b & 127) << 21));
                    if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                        this.position++;
                        b = this.niobuffer.get();
                        j3 = j | (((long) (b & 127)) << 28);
                        if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                            this.position++;
                            b = this.niobuffer.get();
                            j = j3 | (((long) (b & 127)) << 35);
                            if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                                this.position++;
                                b = this.niobuffer.get();
                                j3 = j | (((long) (b & 127)) << 42);
                                if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                                    this.position++;
                                    b = this.niobuffer.get();
                                    j = j3 | (((long) (b & 127)) << 49);
                                    if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                                        this.position++;
                                        j |= ((long) this.niobuffer.get()) << 56;
                                    }
                                }
                            }
                        }
                    }
                }
                j = j3;
            }
        } else {
            j = j2;
        }
        if (!z) {
            j = (j >>> 1) ^ (-(j & 1));
        }
        return j;
    }

    private long readLong_slow(boolean z) {
        long j;
        this.position++;
        byte b = this.niobuffer.get();
        long j2 = (long) (b & 127);
        if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
            require(1);
            this.position++;
            b = this.niobuffer.get();
            long j3 = j2 | ((long) ((b & 127) << 7));
            if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                require(1);
                this.position++;
                b = this.niobuffer.get();
                j = j3 | ((long) ((b & 127) << 14));
                if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                    require(1);
                    this.position++;
                    b = this.niobuffer.get();
                    j3 = j | ((long) ((b & 127) << 21));
                    if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                        require(1);
                        this.position++;
                        b = this.niobuffer.get();
                        j = j3 | (((long) (b & 127)) << 28);
                        if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                            require(1);
                            this.position++;
                            b = this.niobuffer.get();
                            j3 = j | (((long) (b & 127)) << 35);
                            if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                                require(1);
                                this.position++;
                                b = this.niobuffer.get();
                                j = j3 | (((long) (b & 127)) << 42);
                                if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                                    require(1);
                                    this.position++;
                                    b = this.niobuffer.get();
                                    j3 = j | (((long) (b & 127)) << 49);
                                    if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                                        require(1);
                                        this.position++;
                                        j = j3 | (((long) this.niobuffer.get()) << 56);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            j = j3;
        } else {
            j = j2;
        }
        return !z ? (j >>> 1) ^ (-(j & 1)) : j;
    }

    public boolean readBoolean() throws KryoException {
        require(1);
        this.position++;
        if (this.niobuffer.get() == (byte) 1) {
            return true;
        }
        return false;
    }

    public char readChar() throws KryoException {
        require(2);
        this.position += 2;
        return this.niobuffer.getChar();
    }

    public double readDouble() throws KryoException {
        require(8);
        this.position += 8;
        return this.niobuffer.getDouble();
    }

    public double readDouble(double d, boolean z) throws KryoException {
        return ((double) readLong(z)) / d;
    }

    public int[] readInts(int i) throws KryoException {
        int i2 = i * 4;
        if (this.capacity - this.position < i2 || !isNativeOrder()) {
            return super.readInts(i);
        }
        i = new int[i];
        this.niobuffer.asIntBuffer().get(i);
        this.position += i2;
        this.niobuffer.position(this.position);
        return i;
    }

    public long[] readLongs(int i) throws KryoException {
        int i2 = i * 8;
        if (this.capacity - this.position < i2 || !isNativeOrder()) {
            return super.readLongs(i);
        }
        i = new long[i];
        this.niobuffer.asLongBuffer().get(i);
        this.position += i2;
        this.niobuffer.position(this.position);
        return i;
    }

    public float[] readFloats(int i) throws KryoException {
        int i2 = i * 4;
        if (this.capacity - this.position < i2 || !isNativeOrder()) {
            return super.readFloats(i);
        }
        i = new float[i];
        this.niobuffer.asFloatBuffer().get(i);
        this.position += i2;
        this.niobuffer.position(this.position);
        return i;
    }

    public short[] readShorts(int i) throws KryoException {
        int i2 = i * 2;
        if (this.capacity - this.position < i2 || !isNativeOrder()) {
            return super.readShorts(i);
        }
        i = new short[i];
        this.niobuffer.asShortBuffer().get(i);
        this.position += i2;
        this.niobuffer.position(this.position);
        return i;
    }

    public char[] readChars(int i) throws KryoException {
        int i2 = i * 2;
        if (this.capacity - this.position < i2 || !isNativeOrder()) {
            return super.readChars(i);
        }
        i = new char[i];
        this.niobuffer.asCharBuffer().get(i);
        this.position += i2;
        this.niobuffer.position(this.position);
        return i;
    }

    public double[] readDoubles(int i) throws KryoException {
        int i2 = i * 8;
        if (this.capacity - this.position < i2 || !isNativeOrder()) {
            return super.readDoubles(i);
        }
        i = new double[i];
        this.niobuffer.asDoubleBuffer().get(i);
        this.position += i2;
        this.niobuffer.position(this.position);
        return i;
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
