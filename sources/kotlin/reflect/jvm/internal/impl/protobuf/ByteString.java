package kotlin.reflect.jvm.internal.impl.protobuf;

import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public abstract class ByteString implements Iterable<Byte> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final ByteString EMPTY = new LiteralByteString(new byte[0]);

    public interface ByteIterator extends Iterator<Byte> {
        byte nextByte();
    }

    public static final class Output extends OutputStream {
        private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
        private byte[] buffer;
        private int bufferPos;
        private final ArrayList<ByteString> flushedBuffers;
        private int flushedBuffersTotalBytes;
        private final int initialCapacity;

        Output(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.initialCapacity = i;
            this.flushedBuffers = new ArrayList();
            this.buffer = new byte[i];
        }

        public synchronized void write(int i) {
            if (this.bufferPos == this.buffer.length) {
                flushFullBuffer(1);
            }
            byte[] bArr = this.buffer;
            int i2 = this.bufferPos;
            this.bufferPos = i2 + 1;
            bArr[i2] = (byte) i;
        }

        public synchronized void write(byte[] bArr, int i, int i2) {
            if (i2 <= this.buffer.length - this.bufferPos) {
                System.arraycopy(bArr, i, this.buffer, this.bufferPos, i2);
                this.bufferPos += i2;
            } else {
                int length = this.buffer.length - this.bufferPos;
                System.arraycopy(bArr, i, this.buffer, this.bufferPos, length);
                i += length;
                i2 -= length;
                flushFullBuffer(i2);
                System.arraycopy(bArr, i, this.buffer, 0, i2);
                this.bufferPos = i2;
            }
        }

        public synchronized ByteString toByteString() {
            flushLastBuffer();
            return ByteString.copyFrom(this.flushedBuffers);
        }

        private byte[] copyArray(byte[] bArr, int i) {
            Object obj = new byte[i];
            System.arraycopy(bArr, 0, obj, 0, Math.min(bArr.length, i));
            return obj;
        }

        public synchronized int size() {
            return this.flushedBuffersTotalBytes + this.bufferPos;
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
        }

        private void flushFullBuffer(int i) {
            this.flushedBuffers.add(new LiteralByteString(this.buffer));
            this.flushedBuffersTotalBytes += this.buffer.length;
            this.buffer = new byte[Math.max(this.initialCapacity, Math.max(i, this.flushedBuffersTotalBytes >>> 1))];
            this.bufferPos = 0;
        }

        private void flushLastBuffer() {
            if (this.bufferPos >= this.buffer.length) {
                this.flushedBuffers.add(new LiteralByteString(this.buffer));
                this.buffer = EMPTY_BYTE_ARRAY;
            } else if (this.bufferPos > 0) {
                this.flushedBuffers.add(new LiteralByteString(copyArray(this.buffer, this.bufferPos)));
            }
            this.flushedBuffersTotalBytes += this.bufferPos;
            this.bufferPos = 0;
        }
    }

    protected abstract void copyToInternal(byte[] bArr, int i, int i2, int i3);

    protected abstract int getTreeDepth();

    protected abstract boolean isBalanced();

    public abstract boolean isValidUtf8();

    public abstract ByteIterator iterator();

    public abstract CodedInputStream newCodedInput();

    protected abstract int partialHash(int i, int i2, int i3);

    protected abstract int partialIsValidUtf8(int i, int i2, int i3);

    protected abstract int peekCachedHashCode();

    public abstract int size();

    public abstract String toString(String str) throws UnsupportedEncodingException;

    abstract void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException;

    ByteString() {
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public static ByteString copyFrom(byte[] bArr, int i, int i2) {
        Object obj = new byte[i2];
        System.arraycopy(bArr, i, obj, 0, i2);
        return new LiteralByteString(obj);
    }

    public static ByteString copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static ByteString copyFromUtf8(String str) {
        try {
            return new LiteralByteString(str.getBytes("UTF-8"));
        } catch (String str2) {
            throw new RuntimeException("UTF-8 not supported?", str2);
        }
    }

    public ByteString concat(ByteString byteString) {
        int size = size();
        int size2 = byteString.size();
        if (((long) size) + ((long) size2) < 2147483647L) {
            return RopeByteString.concatenate(this, byteString);
        }
        StringBuilder stringBuilder = new StringBuilder(53);
        stringBuilder.append("ByteString would be too long: ");
        stringBuilder.append(size);
        stringBuilder.append("+");
        stringBuilder.append(size2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static ByteString copyFrom(Iterable<ByteString> iterable) {
        Collection collection;
        if (iterable instanceof Collection) {
            collection = (Collection) iterable;
        } else {
            collection = new ArrayList();
            for (ByteString add : iterable) {
                collection.add(add);
            }
        }
        if (collection.isEmpty() != null) {
            return EMPTY;
        }
        return balancedConcat(collection.iterator(), collection.size());
    }

    private static ByteString balancedConcat(Iterator<ByteString> it, int i) {
        if (i == 1) {
            return (ByteString) it.next();
        }
        int i2 = i >>> 1;
        return balancedConcat(it, i2).concat(balancedConcat(it, i - i2));
    }

    public void copyTo(byte[] bArr, int i, int i2, int i3) {
        if (i < 0) {
            i2 = new StringBuilder(30);
            i2.append("Source offset < 0: ");
            i2.append(i);
            throw new IndexOutOfBoundsException(i2.toString());
        } else if (i2 < 0) {
            i = new StringBuilder(30);
            i.append("Target offset < 0: ");
            i.append(i2);
            throw new IndexOutOfBoundsException(i.toString());
        } else if (i3 < 0) {
            i = new StringBuilder(23);
            i.append("Length < 0: ");
            i.append(i3);
            throw new IndexOutOfBoundsException(i.toString());
        } else {
            int i4 = i + i3;
            if (i4 > size()) {
                i = new StringBuilder(34);
                i.append("Source end offset < 0: ");
                i.append(i4);
                throw new IndexOutOfBoundsException(i.toString());
            }
            i4 = i2 + i3;
            if (i4 > bArr.length) {
                i = new StringBuilder(34);
                i.append("Target end offset < 0: ");
                i.append(i4);
                throw new IndexOutOfBoundsException(i.toString());
            } else if (i3 > 0) {
                copyToInternal(bArr, i, i2, i3);
            }
        }
    }

    public byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return Internal.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    void writeTo(OutputStream outputStream, int i, int i2) throws IOException {
        if (i < 0) {
            i2 = new StringBuilder(30);
            i2.append("Source offset < 0: ");
            i2.append(i);
            throw new IndexOutOfBoundsException(i2.toString());
        } else if (i2 < 0) {
            i = new StringBuilder(23);
            i.append("Length < 0: ");
            i.append(i2);
            throw new IndexOutOfBoundsException(i.toString());
        } else {
            int i3 = i + i2;
            if (i3 > size()) {
                i = new StringBuilder(39);
                i.append("Source end offset exceeded: ");
                i.append(i3);
                throw new IndexOutOfBoundsException(i.toString());
            } else if (i2 > 0) {
                writeToInternal(outputStream, i, i2);
            }
        }
    }

    public String toStringUtf8() {
        try {
            return toString("UTF-8");
        } catch (Throwable e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    public static Output newOutput() {
        return new Output(ProfileEditingConfig.DEFAULT_MAX_LENGTH);
    }

    public String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }
}
