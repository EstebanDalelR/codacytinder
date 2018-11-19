package com.esotericsoftware.kryo.io;

import com.esotericsoftware.kryo.KryoException;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.IOException;
import java.io.InputStream;

public class Input extends InputStream {
    protected byte[] buffer;
    protected int capacity;
    protected char[] chars;
    protected InputStream inputStream;
    protected int limit;
    protected int position;
    protected long total;

    public Input() {
        this.chars = new char[32];
    }

    public Input(int i) {
        this.chars = new char[32];
        this.capacity = i;
        this.buffer = new byte[i];
    }

    public Input(byte[] bArr) {
        this.chars = new char[32];
        setBuffer(bArr, 0, bArr.length);
    }

    public Input(byte[] bArr, int i, int i2) {
        this.chars = new char[32];
        setBuffer(bArr, i, i2);
    }

    public Input(InputStream inputStream) {
        this(4096);
        if (inputStream == null) {
            throw new IllegalArgumentException("inputStream cannot be null.");
        }
        this.inputStream = inputStream;
    }

    public Input(InputStream inputStream, int i) {
        this(i);
        if (inputStream == null) {
            throw new IllegalArgumentException("inputStream cannot be null.");
        }
        this.inputStream = inputStream;
    }

    public void setBuffer(byte[] bArr) {
        setBuffer(bArr, 0, bArr.length);
    }

    public void setBuffer(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("bytes cannot be null.");
        }
        this.buffer = bArr;
        this.position = i;
        this.limit = i + i2;
        this.capacity = bArr.length;
        this.total = null;
        this.inputStream = null;
    }

    public byte[] getBuffer() {
        return this.buffer;
    }

    public InputStream getInputStream() {
        return this.inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
        this.limit = null;
        rewind();
    }

    public long total() {
        return this.total + ((long) this.position);
    }

    public void setTotal(long j) {
        this.total = j;
    }

    public int position() {
        return this.position;
    }

    public void setPosition(int i) {
        this.position = i;
    }

    public int limit() {
        return this.limit;
    }

    public void setLimit(int i) {
        this.limit = i;
    }

    public void rewind() {
        this.position = 0;
        this.total = 0;
    }

    public void skip(int i) throws KryoException {
        int min = Math.min(this.limit - this.position, i);
        while (true) {
            this.position += min;
            i -= min;
            if (i != 0) {
                min = Math.min(i, this.capacity);
                require(min);
            } else {
                return;
            }
        }
    }

    protected int fill(byte[] bArr, int i, int i2) throws KryoException {
        if (this.inputStream == null) {
            return -1;
        }
        try {
            return this.inputStream.read(bArr, i, i2);
        } catch (Throwable e) {
            throw new KryoException(e);
        }
    }

    protected int require(int i) throws KryoException {
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
        int fill;
        if (i2 > 0) {
            fill = fill(this.buffer, this.limit, this.capacity - this.limit);
            if (fill == -1) {
                throw new KryoException("Buffer underflow.");
            }
            i2 += fill;
            if (i2 >= i) {
                this.limit += fill;
                return i2;
            }
        }
        System.arraycopy(this.buffer, this.position, this.buffer, 0, i2);
        this.total += (long) this.position;
        this.position = 0;
        do {
            fill = fill(this.buffer, i2, this.capacity - i2);
            if (fill != -1) {
                i2 += fill;
            } else if (i2 < i) {
                throw new KryoException("Buffer underflow.");
            }
            this.limit = i2;
            return i2;
        } while (i2 < i);
        this.limit = i2;
        return i2;
    }

    private int optional(int i) throws KryoException {
        int i2 = this.limit - this.position;
        if (i2 >= i) {
            return i;
        }
        i = Math.min(i, this.capacity);
        int fill = fill(this.buffer, this.limit, this.capacity - this.limit);
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
        System.arraycopy(this.buffer, this.position, this.buffer, 0, i2);
        this.total += (long) this.position;
        this.position = 0;
        do {
            fill = fill(this.buffer, i2, this.capacity - i2);
            if (fill == -1) {
                break;
            }
            i2 += fill;
        } while (i2 < i);
        this.limit = i2;
        if (i2 != 0) {
            i3 = Math.min(i2, i);
        }
        return i3;
    }

    public boolean eof() {
        return optional(1) <= 0;
    }

    public int available() throws IOException {
        return (this.limit - this.position) + (this.inputStream != null ? this.inputStream.available() : 0);
    }

    public int read() throws KryoException {
        if (optional(1) <= 0) {
            return -1;
        }
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        return bArr[i] & 255;
    }

    public int read(byte[] bArr) throws KryoException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) throws KryoException {
        if (bArr == null) {
            throw new IllegalArgumentException("bytes cannot be null.");
        }
        int min = Math.min(this.limit - this.position, i2);
        int i3 = i2;
        do {
            System.arraycopy(this.buffer, this.position, bArr, i, min);
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
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.io.Input.close():void");
    }

    public byte readByte() throws KryoException {
        require(1);
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        return bArr[i];
    }

    public int readByteUnsigned() throws KryoException {
        require(1);
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        return bArr[i] & 255;
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
            System.arraycopy(this.buffer, this.position, bArr, i, min);
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
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 4;
        return (bArr[i + 3] & 255) | ((((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16)) | ((bArr[i + 2] & 255) << 8));
    }

    public int readInt(boolean z) throws KryoException {
        return readVarInt(z);
    }

    public int readVarInt(boolean z) throws KryoException {
        if (require(1) < 5) {
            return readInt_slow(z);
        }
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        byte b = bArr[i];
        i = b & 127;
        if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
            bArr = this.buffer;
            int i2 = this.position;
            this.position = i2 + 1;
            byte b2 = bArr[i2];
            i |= (b2 & 127) << 7;
            if ((b2 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                i2 = this.position;
                this.position = i2 + 1;
                b2 = bArr[i2];
                i |= (b2 & 127) << 14;
                if ((b2 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                    i2 = this.position;
                    this.position = i2 + 1;
                    b2 = bArr[i2];
                    i |= (b2 & 127) << 21;
                    if ((b2 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                        i2 = this.position;
                        this.position = i2 + 1;
                        i |= (bArr[i2] & 127) << 28;
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
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        byte b = bArr[i];
        i = b & 127;
        if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
            require(1);
            byte[] bArr2 = this.buffer;
            int i2 = this.position;
            this.position = i2 + 1;
            byte b2 = bArr2[i2];
            i |= (b2 & 127) << 7;
            if ((b2 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                require(1);
                i2 = this.position;
                this.position = i2 + 1;
                b2 = bArr2[i2];
                i |= (b2 & 127) << 14;
                if ((b2 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                    require(1);
                    i2 = this.position;
                    this.position = i2 + 1;
                    b2 = bArr2[i2];
                    i |= (b2 & 127) << 21;
                    if ((b2 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                        require(1);
                        int i3 = this.position;
                        this.position = i3 + 1;
                        i |= (bArr2[i3] & 127) << 28;
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
        if ((this.buffer[i] & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
            return true;
        }
        if (i2 == this.limit) {
            return false;
        }
        int i3 = i2 + 1;
        if ((this.buffer[i2] & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
            return true;
        }
        if (i3 == this.limit) {
            return false;
        }
        i2 = i3 + 1;
        if ((this.buffer[i3] & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
            return true;
        }
        if (i2 == this.limit) {
            return false;
        }
        i3 = i2 + 1;
        if ((this.buffer[i2] & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 && i3 == this.limit) {
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
        if ((this.buffer[i] & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
            return true;
        }
        if (i2 == this.limit) {
            return false;
        }
        int i3 = i2 + 1;
        if ((this.buffer[i2] & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
            return true;
        }
        if (i3 == this.limit) {
            return false;
        }
        i2 = i3 + 1;
        if ((this.buffer[i3] & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
            return true;
        }
        if (i2 == this.limit) {
            return false;
        }
        i3 = i2 + 1;
        if ((this.buffer[i2] & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
            return true;
        }
        if (i3 == this.limit) {
            return false;
        }
        i2 = i3 + 1;
        if ((this.buffer[i3] & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
            return true;
        }
        if (i2 == this.limit) {
            return false;
        }
        i3 = i2 + 1;
        if ((this.buffer[i2] & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
            return true;
        }
        if (i3 == this.limit) {
            return false;
        }
        i2 = i3 + 1;
        if ((this.buffer[i3] & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
            return true;
        }
        if (i2 == this.limit) {
            return false;
        }
        i3 = i2 + 1;
        if ((this.buffer[i2] & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 && i3 == this.limit) {
            return false;
        }
        return true;
    }

    public String readString() {
        int require = require(1);
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        byte b = bArr[i];
        if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
            return readAscii();
        }
        require = require >= 5 ? readUtf8Length(b) : readUtf8Length_slow(b);
        switch (require) {
            case 0:
                return null;
            case 1:
                return "";
            default:
                require--;
                if (this.chars.length < require) {
                    this.chars = new char[require];
                }
                readUtf8(require);
                return new String(this.chars, 0, require);
        }
    }

    private int readUtf8Length(int i) {
        int i2 = i & 63;
        if ((i & 64) == 0) {
            return i2;
        }
        i = this.buffer;
        int i3 = this.position;
        this.position = i3 + 1;
        byte b = i[i3];
        i2 |= (b & 127) << 6;
        if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
            return i2;
        }
        i3 = this.position;
        this.position = i3 + 1;
        b = i[i3];
        i2 |= (b & 127) << 13;
        if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
            return i2;
        }
        i3 = this.position;
        this.position = i3 + 1;
        b = i[i3];
        i2 |= (b & 127) << 20;
        if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
            return i2;
        }
        i3 = this.position;
        this.position = i3 + 1;
        return i2 | ((i[i3] & 127) << 27);
    }

    private int readUtf8Length_slow(int i) {
        int i2 = i & 63;
        if ((i & 64) == 0) {
            return i2;
        }
        require(1);
        byte[] bArr = this.buffer;
        int i3 = this.position;
        this.position = i3 + 1;
        byte b = bArr[i3];
        i2 |= (b & 127) << 6;
        if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
            return i2;
        }
        require(1);
        i3 = this.position;
        this.position = i3 + 1;
        b = bArr[i3];
        i2 |= (b & 127) << 13;
        if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
            return i2;
        }
        require(1);
        i3 = this.position;
        this.position = i3 + 1;
        b = bArr[i3];
        i2 |= (b & 127) << 20;
        if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
            return i2;
        }
        require(1);
        i = this.position;
        this.position = i + 1;
        return i2 | ((bArr[i] & 127) << 27);
    }

    private void readUtf8(int i) {
        byte[] bArr = this.buffer;
        char[] cArr = this.chars;
        int min = Math.min(require(1), i);
        int i2 = this.position;
        int i3 = 0;
        while (i3 < min) {
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b < (byte) 0) {
                i2 = i4 - 1;
                break;
            }
            int i5 = i3 + 1;
            cArr[i3] = (char) b;
            i2 = i4;
            i3 = i5;
        }
        this.position = i2;
        if (i3 < i) {
            readUtf8_slow(i, i3);
        }
    }

    private void readUtf8_slow(int i, int i2) {
        char[] cArr = this.chars;
        byte[] bArr = this.buffer;
        while (i2 < i) {
            if (this.position == this.limit) {
                require(1);
            }
            int i3 = this.position;
            this.position = i3 + 1;
            i3 = bArr[i3] & 255;
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
                            i3 = (i3 & 31) << 6;
                            i4 = this.position;
                            this.position = i4 + 1;
                            cArr[i2] = (char) (i3 | (bArr[i4] & 63));
                            break;
                        case 14:
                            require(2);
                            i3 = (i3 & 15) << 12;
                            i4 = this.position;
                            this.position = i4 + 1;
                            i3 |= (bArr[i4] & 63) << 6;
                            i4 = this.position;
                            this.position = i4 + 1;
                            cArr[i2] = (char) (i3 | (bArr[i4] & 63));
                            break;
                        default:
                            break;
                    }
            }
            i2++;
        }
    }

    private String readAscii() {
        byte[] bArr = this.buffer;
        int i = this.position;
        int i2 = i - 1;
        int i3 = this.limit;
        while (i != i3) {
            int i4 = i + 1;
            if ((bArr[i] & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                i = i4 - 1;
                bArr[i] = (byte) (bArr[i] & 127);
                String str = new String(bArr, 0, i2, i4 - i2);
                bArr[i] = (byte) (bArr[i] | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                this.position = i4;
                return str;
            }
            i = i4;
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
        byte[] bArr = this.buffer;
        int i2 = this.position;
        int i3 = this.limit;
        int i4 = 0;
        while (i2 < i3) {
            obj[i4] = (char) bArr[i2];
            i2++;
            i4++;
        }
        this.position = this.limit;
        while (true) {
            require(1);
            i2 = this.position;
            this.position = i2 + 1;
            byte b = bArr[i2];
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
        int require = require(1);
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        byte b = bArr[i];
        if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
            return new StringBuilder(readAscii());
        }
        require = require >= 5 ? readUtf8Length(b) : readUtf8Length_slow(b);
        switch (require) {
            case 0:
                return null;
            case 1:
                return new StringBuilder("");
            default:
                require--;
                if (this.chars.length < require) {
                    this.chars = new char[require];
                }
                readUtf8(require);
                StringBuilder stringBuilder = new StringBuilder(require);
                stringBuilder.append(this.chars, 0, require);
                return stringBuilder;
        }
    }

    public float readFloat() throws KryoException {
        return Float.intBitsToFloat(readInt());
    }

    public float readFloat(float f, boolean z) throws KryoException {
        return ((float) readInt(z)) / f;
    }

    public short readShort() throws KryoException {
        require(2);
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        byte[] bArr2 = this.buffer;
        int i3 = this.position;
        this.position = i3 + 1;
        return (short) (i2 | (bArr2[i3] & 255));
    }

    public int readShortUnsigned() throws KryoException {
        require(2);
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        byte[] bArr2 = this.buffer;
        int i3 = this.position;
        this.position = i3 + 1;
        return i2 | (bArr2[i3] & 255);
    }

    public long readLong() throws KryoException {
        require(8);
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        long j = ((long) bArr[i]) << 56;
        int i2 = this.position;
        this.position = i2 + 1;
        long j2 = j | (((long) (bArr[i2] & 255)) << 48);
        i = this.position;
        this.position = i + 1;
        long j3 = j2 | (((long) (bArr[i] & 255)) << 40);
        i = this.position;
        this.position = i + 1;
        j2 = j3 | (((long) (bArr[i] & 255)) << 32);
        i = this.position;
        this.position = i + 1;
        j3 = j2 | (((long) (bArr[i] & 255)) << 24);
        i = this.position;
        this.position = i + 1;
        j2 = j3 | ((long) ((bArr[i] & 255) << 16));
        i = this.position;
        this.position = i + 1;
        j3 = j2 | ((long) ((bArr[i] & 255) << 8));
        int i3 = this.position;
        this.position = i3 + 1;
        return j3 | ((long) (bArr[i3] & 255));
    }

    public long readLong(boolean z) throws KryoException {
        return readVarLong(z);
    }

    public long readVarLong(boolean z) throws KryoException {
        if (require(1) < 9) {
            return readLong_slow(z);
        }
        long j;
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        byte b = bArr[i];
        long j2 = (long) (b & 127);
        if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
            bArr = this.buffer;
            int i2 = this.position;
            this.position = i2 + 1;
            byte b2 = bArr[i2];
            j = j2 | ((long) ((b2 & 127) << 7));
            if ((b2 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                i = this.position;
                this.position = i + 1;
                byte b3 = bArr[i];
                long j3 = j | ((long) ((b3 & 127) << 14));
                if ((b3 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                    i = this.position;
                    this.position = i + 1;
                    b3 = bArr[i];
                    j = j3 | ((long) ((b3 & 127) << 21));
                    if ((b3 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                        i = this.position;
                        this.position = i + 1;
                        b3 = bArr[i];
                        j3 = j | (((long) (b3 & 127)) << 28);
                        if ((b3 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                            i = this.position;
                            this.position = i + 1;
                            b3 = bArr[i];
                            j = j3 | (((long) (b3 & 127)) << 35);
                            if ((b3 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                                i = this.position;
                                this.position = i + 1;
                                b3 = bArr[i];
                                j3 = j | (((long) (b3 & 127)) << 42);
                                if ((b3 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                                    i = this.position;
                                    this.position = i + 1;
                                    b3 = bArr[i];
                                    j = j3 | (((long) (b3 & 127)) << 49);
                                    if ((b3 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                                        i = this.position;
                                        this.position = i + 1;
                                        j |= ((long) bArr[i]) << 56;
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
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        byte b = bArr[i];
        long j2 = (long) (b & 127);
        if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
            require(1);
            bArr = this.buffer;
            int i2 = this.position;
            this.position = i2 + 1;
            byte b2 = bArr[i2];
            long j3 = j2 | ((long) ((b2 & 127) << 7));
            if ((b2 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                require(1);
                i = this.position;
                this.position = i + 1;
                byte b3 = bArr[i];
                long j4 = j3 | ((long) ((b3 & 127) << 14));
                if ((b3 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                    require(1);
                    i = this.position;
                    this.position = i + 1;
                    b3 = bArr[i];
                    j = j4 | ((long) ((b3 & 127) << 21));
                    if ((b3 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                        require(1);
                        i = this.position;
                        this.position = i + 1;
                        b3 = bArr[i];
                        long j5 = j | (((long) (b3 & 127)) << 28);
                        if ((b3 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                            require(1);
                            i = this.position;
                            this.position = i + 1;
                            b3 = bArr[i];
                            j = j5 | (((long) (b3 & 127)) << 35);
                            if ((b3 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                                require(1);
                                i = this.position;
                                this.position = i + 1;
                                b3 = bArr[i];
                                j5 = j | (((long) (b3 & 127)) << 42);
                                if ((b3 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                                    require(1);
                                    i = this.position;
                                    this.position = i + 1;
                                    b3 = bArr[i];
                                    j = j5 | (((long) (b3 & 127)) << 49);
                                    if ((b3 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                                        require(1);
                                        i = this.position;
                                        this.position = i + 1;
                                        j |= ((long) bArr[i]) << 56;
                                    }
                                }
                            }
                        }
                        j = j5;
                    }
                } else {
                    j = j4;
                }
            } else {
                j = j3;
            }
        } else {
            j = j2;
        }
        return !z ? (j >>> 1) ^ (-(j & 1)) : j;
    }

    public boolean readBoolean() throws KryoException {
        require(1);
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        if (bArr[i] == (byte) 1) {
            return true;
        }
        return false;
    }

    public char readChar() throws KryoException {
        require(2);
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        byte[] bArr2 = this.buffer;
        int i3 = this.position;
        this.position = i3 + 1;
        return (char) (i2 | (bArr2[i3] & 255));
    }

    public double readDouble() throws KryoException {
        return Double.longBitsToDouble(readLong());
    }

    public double readDouble(double d, boolean z) throws KryoException {
        return ((double) readLong(z)) / d;
    }

    public int[] readInts(int i, boolean z) throws KryoException {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = readInt(z);
        }
        return iArr;
    }

    public long[] readLongs(int i, boolean z) throws KryoException {
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = readLong(z);
        }
        return jArr;
    }

    public int[] readInts(int i) throws KryoException {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = readInt();
        }
        return iArr;
    }

    public long[] readLongs(int i) throws KryoException {
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = readLong();
        }
        return jArr;
    }

    public float[] readFloats(int i) throws KryoException {
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = readFloat();
        }
        return fArr;
    }

    public short[] readShorts(int i) throws KryoException {
        short[] sArr = new short[i];
        for (int i2 = 0; i2 < i; i2++) {
            sArr[i2] = readShort();
        }
        return sArr;
    }

    public char[] readChars(int i) throws KryoException {
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = readChar();
        }
        return cArr;
    }

    public double[] readDoubles(int i) throws KryoException {
        double[] dArr = new double[i];
        for (int i2 = 0; i2 < i; i2++) {
            dArr[i2] = readDouble();
        }
        return dArr;
    }
}
