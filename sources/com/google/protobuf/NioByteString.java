package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

final class NioByteString extends LeafByteString {
    private final ByteBuffer buffer;

    /* renamed from: com.google.protobuf.NioByteString$1 */
    class C56401 extends InputStream {
        private final ByteBuffer buf = NioByteString.this.buffer.slice();

        public boolean markSupported() {
            return true;
        }

        C56401() {
        }

        public void mark(int i) {
            this.buf.mark();
        }

        public void reset() throws IOException {
            try {
                this.buf.reset();
            } catch (Throwable e) {
                throw new IOException(e);
            }
        }

        public int available() throws IOException {
            return this.buf.remaining();
        }

        public int read() throws IOException {
            if (this.buf.hasRemaining()) {
                return this.buf.get() & 255;
            }
            return -1;
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (!this.buf.hasRemaining()) {
                return -1;
            }
            i2 = Math.min(i2, this.buf.remaining());
            this.buf.get(bArr, i, i2);
            return i2;
        }
    }

    NioByteString(ByteBuffer byteBuffer) {
        Internal.checkNotNull(byteBuffer, "buffer");
        this.buffer = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private Object writeReplace() {
        return ByteString.copyFrom(this.buffer.slice());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    public byte byteAt(int i) {
        try {
            return this.buffer.get(i);
        } catch (int i2) {
            throw i2;
        } catch (int i22) {
            throw new ArrayIndexOutOfBoundsException(i22.getMessage());
        }
    }

    public int size() {
        return this.buffer.remaining();
    }

    public ByteString substring(int i, int i2) {
        try {
            return new NioByteString(slice(i, i2));
        } catch (int i3) {
            throw i3;
        } catch (int i32) {
            throw new ArrayIndexOutOfBoundsException(i32.getMessage());
        }
    }

    protected void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        ByteBuffer slice = this.buffer.slice();
        slice.position(i);
        slice.get(bArr, i2, i3);
    }

    public void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.buffer.slice());
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }

    boolean equalsRange(ByteString byteString, int i, int i2) {
        return substring(0, i2).equals(byteString.substring(i, i2 + i));
    }

    void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
        if (this.buffer.hasArray()) {
            outputStream.write(this.buffer.array(), (this.buffer.arrayOffset() + this.buffer.position()) + i, i2);
            return;
        }
        ByteBufferWriter.write(slice(i, i2 + i), outputStream);
    }

    void writeTo(ByteOutput byteOutput) throws IOException {
        byteOutput.writeLazy(this.buffer.slice());
    }

    public ByteBuffer asReadOnlyByteBuffer() {
        return this.buffer.asReadOnlyBuffer();
    }

    public List<ByteBuffer> asReadOnlyByteBufferList() {
        return Collections.singletonList(asReadOnlyByteBuffer());
    }

    protected String toStringInternal(Charset charset) {
        byte[] array;
        int arrayOffset;
        int remaining;
        if (this.buffer.hasArray()) {
            array = this.buffer.array();
            arrayOffset = this.buffer.arrayOffset() + this.buffer.position();
            remaining = this.buffer.remaining();
        } else {
            array = toByteArray();
            arrayOffset = 0;
            remaining = array.length;
        }
        return new String(array, arrayOffset, remaining, charset);
    }

    public boolean isValidUtf8() {
        return Utf8.isValidUtf8(this.buffer);
    }

    protected int partialIsValidUtf8(int i, int i2, int i3) {
        return Utf8.partialIsValidUtf8(i, this.buffer, i2, i3 + i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (size() != byteString.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof NioByteString) {
            return this.buffer.equals(((NioByteString) obj).buffer);
        }
        if (obj instanceof RopeByteString) {
            return obj.equals(this);
        }
        return this.buffer.equals(byteString.asReadOnlyByteBuffer());
    }

    protected int partialHash(int i, int i2, int i3) {
        int i4 = i;
        for (i = i2; i < i2 + i3; i++) {
            i4 = (i4 * 31) + this.buffer.get(i);
        }
        return i4;
    }

    public InputStream newInput() {
        return new C56401();
    }

    public CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance(this.buffer, true);
    }

    private ByteBuffer slice(int i, int i2) {
        if (i >= this.buffer.position() && i2 <= this.buffer.limit()) {
            if (i <= i2) {
                ByteBuffer slice = this.buffer.slice();
                slice.position(i - this.buffer.position());
                slice.limit(i2 - this.buffer.position());
                return slice;
            }
        }
        throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }
}
