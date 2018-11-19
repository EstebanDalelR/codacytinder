package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator;

class BoundedByteString extends LiteralByteString {
    private final int bytesLength;
    private final int bytesOffset;

    private class BoundedByteIterator implements ByteIterator {
        private final int limit;
        private int position;

        private BoundedByteIterator() {
            this.position = BoundedByteString.this.getOffsetIntoBytes();
            this.limit = this.position + BoundedByteString.this.size();
        }

        public boolean hasNext() {
            return this.position < this.limit;
        }

        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        public byte nextByte() {
            if (this.position >= this.limit) {
                throw new NoSuchElementException();
            }
            byte[] bArr = BoundedByteString.this.bytes;
            int i = this.position;
            this.position = i + 1;
            return bArr[i];
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    BoundedByteString(byte[] bArr, int i, int i2) {
        super(bArr);
        if (i < 0) {
            i2 = new StringBuilder(29);
            i2.append("Offset too small: ");
            i2.append(i);
            throw new IllegalArgumentException(i2.toString());
        } else if (i2 < 0) {
            i2 = new StringBuilder(29);
            i2.append("Length too small: ");
            i2.append(i);
            throw new IllegalArgumentException(i2.toString());
        } else if (((long) i) + ((long) i2) > ((long) bArr.length)) {
            StringBuilder stringBuilder = new StringBuilder(48);
            stringBuilder.append("Offset+Length too large: ");
            stringBuilder.append(i);
            stringBuilder.append("+");
            stringBuilder.append(i2);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else {
            this.bytesOffset = i;
            this.bytesLength = i2;
        }
    }

    public byte byteAt(int i) {
        if (i < 0) {
            StringBuilder stringBuilder = new StringBuilder(28);
            stringBuilder.append("Index too small: ");
            stringBuilder.append(i);
            throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
        } else if (i < size()) {
            return this.bytes[this.bytesOffset + i];
        } else {
            int size = size();
            StringBuilder stringBuilder2 = new StringBuilder(41);
            stringBuilder2.append("Index too large: ");
            stringBuilder2.append(i);
            stringBuilder2.append(", ");
            stringBuilder2.append(size);
            throw new ArrayIndexOutOfBoundsException(stringBuilder2.toString());
        }
    }

    public int size() {
        return this.bytesLength;
    }

    protected int getOffsetIntoBytes() {
        return this.bytesOffset;
    }

    protected void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.bytes, getOffsetIntoBytes() + i, bArr, i2, i3);
    }

    public ByteIterator iterator() {
        return new BoundedByteIterator();
    }
}
