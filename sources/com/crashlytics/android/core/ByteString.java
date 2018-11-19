package com.crashlytics.android.core;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.List;

final class ByteString {
    public static final ByteString EMPTY = new ByteString(new byte[0]);
    private final byte[] bytes;
    private volatile int hash;

    static final class CodedBuilder {
        private final byte[] buffer;
        private final CodedOutputStream output;

        private CodedBuilder(int i) {
            this.buffer = new byte[i];
            this.output = CodedOutputStream.newInstance(this.buffer);
        }

        public ByteString build() {
            this.output.checkNoSpaceLeft();
            return new ByteString(this.buffer);
        }

        public CodedOutputStream getCodedOutput() {
            return this.output;
        }
    }

    static final class Output extends FilterOutputStream {
        private final ByteArrayOutputStream bout;

        private Output(ByteArrayOutputStream byteArrayOutputStream) {
            super(byteArrayOutputStream);
            this.bout = byteArrayOutputStream;
        }

        public ByteString toByteString() {
            return new ByteString(this.bout.toByteArray());
        }
    }

    private ByteString(byte[] bArr) {
        this.hash = 0;
        this.bytes = bArr;
    }

    public byte byteAt(int i) {
        return this.bytes[i];
    }

    public int size() {
        return this.bytes.length;
    }

    public boolean isEmpty() {
        return this.bytes.length == 0;
    }

    public static ByteString copyFrom(byte[] bArr, int i, int i2) {
        Object obj = new byte[i2];
        System.arraycopy(bArr, i, obj, 0, i2);
        return new ByteString(obj);
    }

    public static ByteString copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer, int i) {
        i = new byte[i];
        byteBuffer.get(i);
        return new ByteString(i);
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer) {
        return copyFrom(byteBuffer, byteBuffer.remaining());
    }

    public static ByteString copyFrom(String str, String str2) throws UnsupportedEncodingException {
        return new ByteString(str.getBytes(str2));
    }

    public static ByteString copyFromUtf8(String str) {
        try {
            return new ByteString(str.getBytes("UTF-8"));
        } catch (String str2) {
            throw new RuntimeException("UTF-8 not supported.", str2);
        }
    }

    public static ByteString copyFrom(List<ByteString> list) {
        if (list.size() == 0) {
            return EMPTY;
        }
        if (list.size() == 1) {
            return (ByteString) list.get(0);
        }
        int i = 0;
        for (ByteString size : list) {
            i += size.size();
        }
        Object obj = new byte[i];
        i = 0;
        for (ByteString size2 : list) {
            System.arraycopy(size2.bytes, 0, obj, i, size2.size());
            i += size2.size();
        }
        return new ByteString(obj);
    }

    public void copyTo(byte[] bArr, int i) {
        System.arraycopy(this.bytes, 0, bArr, i, this.bytes.length);
    }

    public void copyTo(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.bytes, i, bArr, i2, i3);
    }

    public void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.bytes, 0, this.bytes.length);
    }

    public byte[] toByteArray() {
        int length = this.bytes.length;
        Object obj = new byte[length];
        System.arraycopy(this.bytes, 0, obj, 0, length);
        return obj;
    }

    public ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(this.bytes).asReadOnlyBuffer();
    }

    public String toString(String str) throws UnsupportedEncodingException {
        return new String(this.bytes, str);
    }

    public String toStringUtf8() {
        try {
            return new String(this.bytes, "UTF-8");
        } catch (Throwable e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        int length = this.bytes.length;
        if (length != byteString.bytes.length) {
            return false;
        }
        byte[] bArr = this.bytes;
        obj = byteString.bytes;
        for (int i = 0; i < length; i++) {
            if (bArr[i] != obj[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.hash;
        if (i == 0) {
            byte[] bArr = this.bytes;
            int length = this.bytes.length;
            int i2 = length;
            for (int i3 = 0; i3 < length; i3++) {
                i2 = (i2 * 31) + bArr[i3];
            }
            i = i2 == 0 ? 1 : i2;
            this.hash = i;
        }
        return i;
    }

    public InputStream newInput() {
        return new ByteArrayInputStream(this.bytes);
    }

    public static Output newOutput(int i) {
        return new Output(new ByteArrayOutputStream(i));
    }

    public static Output newOutput() {
        return newOutput(32);
    }

    static CodedBuilder newCodedBuilder(int i) {
        return new CodedBuilder(i);
    }
}
