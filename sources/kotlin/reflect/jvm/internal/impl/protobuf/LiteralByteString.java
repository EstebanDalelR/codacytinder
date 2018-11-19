package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator;

class LiteralByteString extends ByteString {
    protected final byte[] bytes;
    private int hash = 0;

    private class LiteralByteIterator implements ByteIterator {
        private final int limit;
        private int position;

        private LiteralByteIterator() {
            this.position = 0;
            this.limit = LiteralByteString.this.size();
        }

        public boolean hasNext() {
            return this.position < this.limit;
        }

        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        public byte nextByte() {
            try {
                byte[] bArr = LiteralByteString.this.bytes;
                int i = this.position;
                this.position = i + 1;
                return bArr[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    protected int getOffsetIntoBytes() {
        return 0;
    }

    protected int getTreeDepth() {
        return 0;
    }

    protected boolean isBalanced() {
        return true;
    }

    LiteralByteString(byte[] bArr) {
        this.bytes = bArr;
    }

    public byte byteAt(int i) {
        return this.bytes[i];
    }

    public int size() {
        return this.bytes.length;
    }

    protected void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.bytes, i, bArr, i2, i3);
    }

    void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.bytes, getOffsetIntoBytes() + i, i2);
    }

    public String toString(String str) throws UnsupportedEncodingException {
        return new String(this.bytes, getOffsetIntoBytes(), size(), str);
    }

    public boolean isValidUtf8() {
        int offsetIntoBytes = getOffsetIntoBytes();
        return Utf8.isValidUtf8(this.bytes, offsetIntoBytes, size() + offsetIntoBytes);
    }

    protected int partialIsValidUtf8(int i, int i2, int i3) {
        int offsetIntoBytes = getOffsetIntoBytes() + i2;
        return Utf8.partialIsValidUtf8(i, this.bytes, offsetIntoBytes, i3 + offsetIntoBytes);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof LiteralByteString) {
            return equalsRange((LiteralByteString) obj, 0, size());
        }
        if (obj instanceof RopeByteString) {
            return obj.equals(this);
        }
        obj = String.valueOf(String.valueOf(obj.getClass()));
        StringBuilder stringBuilder = new StringBuilder(obj.length() + 49);
        stringBuilder.append("Has a new type of ByteString been created? Found ");
        stringBuilder.append(obj);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    boolean equalsRange(LiteralByteString literalByteString, int i, int i2) {
        if (i2 > literalByteString.size()) {
            i = size();
            StringBuilder stringBuilder = new StringBuilder(40);
            stringBuilder.append("Length too large: ");
            stringBuilder.append(i2);
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i + i2 > literalByteString.size()) {
            literalByteString = literalByteString.size();
            StringBuilder stringBuilder2 = new StringBuilder(59);
            stringBuilder2.append("Ran off end of other: ");
            stringBuilder2.append(i);
            stringBuilder2.append(", ");
            stringBuilder2.append(i2);
            stringBuilder2.append(", ");
            stringBuilder2.append(literalByteString);
            throw new IllegalArgumentException(stringBuilder2.toString());
        } else {
            byte[] bArr = this.bytes;
            byte[] bArr2 = literalByteString.bytes;
            int offsetIntoBytes = getOffsetIntoBytes() + i2;
            i2 = getOffsetIntoBytes();
            literalByteString = literalByteString.getOffsetIntoBytes() + i;
            while (i2 < offsetIntoBytes) {
                if (bArr[i2] != bArr2[literalByteString]) {
                    return null;
                }
                i2++;
                literalByteString++;
            }
            return true;
        }
    }

    public int hashCode() {
        int i = this.hash;
        if (i == 0) {
            i = size();
            i = partialHash(i, 0, i);
            if (i == 0) {
                i = 1;
            }
            this.hash = i;
        }
        return i;
    }

    protected int peekCachedHashCode() {
        return this.hash;
    }

    protected int partialHash(int i, int i2, int i3) {
        return hashCode(i, this.bytes, getOffsetIntoBytes() + i2, i3);
    }

    static int hashCode(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        for (i = i2; i < i2 + i3; i++) {
            i4 = (i4 * 31) + bArr[i];
        }
        return i4;
    }

    public CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance(this);
    }

    public ByteIterator iterator() {
        return new LiteralByteIterator();
    }
}
