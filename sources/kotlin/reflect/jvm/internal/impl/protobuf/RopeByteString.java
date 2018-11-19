package kotlin.reflect.jvm.internal.impl.protobuf;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Stack;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator;

class RopeByteString extends ByteString {
    private static final int[] minLengthByDepth;
    private int hash;
    private final ByteString left;
    private final int leftLength;
    private final ByteString right;
    private final int totalLength;
    private final int treeDepth;

    private static class Balancer {
        private final Stack<ByteString> prefixesStack;

        private Balancer() {
            this.prefixesStack = new Stack();
        }

        private ByteString balance(ByteString byteString, ByteString byteString2) {
            doBalance(byteString);
            doBalance(byteString2);
            byteString = (ByteString) this.prefixesStack.pop();
            while (this.prefixesStack.isEmpty() == null) {
                byteString = new RopeByteString((ByteString) this.prefixesStack.pop(), byteString);
            }
            return byteString;
        }

        private void doBalance(ByteString byteString) {
            if (byteString.isBalanced()) {
                insert(byteString);
            } else if (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                doBalance(ropeByteString.left);
                doBalance(ropeByteString.right);
            } else {
                byteString = String.valueOf(String.valueOf(byteString.getClass()));
                StringBuilder stringBuilder = new StringBuilder(byteString.length() + 49);
                stringBuilder.append("Has a new type of ByteString been created? Found ");
                stringBuilder.append(byteString);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }

        private void insert(ByteString byteString) {
            int depthBinForLength = getDepthBinForLength(byteString.size());
            int i = RopeByteString.minLengthByDepth[depthBinForLength + 1];
            if (!this.prefixesStack.isEmpty()) {
                if (((ByteString) this.prefixesStack.peek()).size() < i) {
                    depthBinForLength = RopeByteString.minLengthByDepth[depthBinForLength];
                    ByteString byteString2 = (ByteString) this.prefixesStack.pop();
                    while (!this.prefixesStack.isEmpty() && ((ByteString) this.prefixesStack.peek()).size() < depthBinForLength) {
                        byteString2 = new RopeByteString((ByteString) this.prefixesStack.pop(), byteString2);
                    }
                    ByteString ropeByteString = new RopeByteString(byteString2, byteString);
                    while (this.prefixesStack.isEmpty() == null) {
                        if (((ByteString) this.prefixesStack.peek()).size() >= RopeByteString.minLengthByDepth[getDepthBinForLength(ropeByteString.size()) + 1]) {
                            break;
                        }
                        ropeByteString = new RopeByteString((ByteString) this.prefixesStack.pop(), ropeByteString);
                    }
                    this.prefixesStack.push(ropeByteString);
                    return;
                }
            }
            this.prefixesStack.push(byteString);
        }

        private int getDepthBinForLength(int i) {
            i = Arrays.binarySearch(RopeByteString.minLengthByDepth, i);
            return i < 0 ? (-(i + 1)) - 1 : i;
        }
    }

    private static class PieceIterator implements Iterator<LiteralByteString> {
        private final Stack<RopeByteString> breadCrumbs;
        private LiteralByteString next;

        private PieceIterator(ByteString byteString) {
            this.breadCrumbs = new Stack();
            this.next = getLeafByLeft(byteString);
        }

        private LiteralByteString getLeafByLeft(ByteString byteString) {
            while (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                this.breadCrumbs.push(ropeByteString);
                byteString = ropeByteString.left;
            }
            return (LiteralByteString) byteString;
        }

        private LiteralByteString getNextNonEmptyLeaf() {
            while (!this.breadCrumbs.isEmpty()) {
                LiteralByteString leafByLeft = getLeafByLeft(((RopeByteString) this.breadCrumbs.pop()).right);
                if (!leafByLeft.isEmpty()) {
                    return leafByLeft;
                }
            }
            return null;
        }

        public boolean hasNext() {
            return this.next != null;
        }

        public LiteralByteString next() {
            if (this.next == null) {
                throw new NoSuchElementException();
            }
            LiteralByteString literalByteString = this.next;
            this.next = getNextNonEmptyLeaf();
            return literalByteString;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private class RopeInputStream extends InputStream {
        private LiteralByteString currentPiece;
        private int currentPieceIndex;
        private int currentPieceOffsetInRope;
        private int currentPieceSize;
        private int mark;
        private PieceIterator pieceIterator;

        public boolean markSupported() {
            return true;
        }

        public RopeInputStream() {
            initialize();
        }

        public int read(byte[] bArr, int i, int i2) {
            if (bArr == null) {
                throw new NullPointerException();
            }
            if (i >= 0 && i2 >= 0) {
                if (i2 <= bArr.length - i) {
                    return readSkipInternal(bArr, i, i2);
                }
            }
            throw new IndexOutOfBoundsException();
        }

        public long skip(long j) {
            if (j < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            return (long) readSkipInternal(null, 0, (int) j);
        }

        private int readSkipInternal(byte[] bArr, int i, int i2) {
            int i3 = i;
            i = i2;
            while (i > 0) {
                advanceIfCurrentPieceFullyRead();
                if (this.currentPiece == null) {
                    if (i == i2) {
                        return -1;
                    }
                    return i2 - i;
                }
                int min = Math.min(this.currentPieceSize - this.currentPieceIndex, i);
                if (bArr != null) {
                    this.currentPiece.copyTo(bArr, this.currentPieceIndex, i3, min);
                    i3 += min;
                }
                this.currentPieceIndex += min;
                i -= min;
            }
            return i2 - i;
        }

        public int read() throws IOException {
            advanceIfCurrentPieceFullyRead();
            if (this.currentPiece == null) {
                return -1;
            }
            LiteralByteString literalByteString = this.currentPiece;
            int i = this.currentPieceIndex;
            this.currentPieceIndex = i + 1;
            return literalByteString.byteAt(i) & 255;
        }

        public int available() throws IOException {
            return RopeByteString.this.size() - (this.currentPieceOffsetInRope + this.currentPieceIndex);
        }

        public void mark(int i) {
            this.mark = this.currentPieceOffsetInRope + this.currentPieceIndex;
        }

        public synchronized void reset() {
            initialize();
            readSkipInternal(null, 0, this.mark);
        }

        private void initialize() {
            this.pieceIterator = new PieceIterator(RopeByteString.this);
            this.currentPiece = this.pieceIterator.next();
            this.currentPieceSize = this.currentPiece.size();
            this.currentPieceIndex = 0;
            this.currentPieceOffsetInRope = 0;
        }

        private void advanceIfCurrentPieceFullyRead() {
            if (this.currentPiece != null && this.currentPieceIndex == this.currentPieceSize) {
                this.currentPieceOffsetInRope += this.currentPieceSize;
                this.currentPieceIndex = 0;
                if (this.pieceIterator.hasNext()) {
                    this.currentPiece = this.pieceIterator.next();
                    this.currentPieceSize = this.currentPiece.size();
                    return;
                }
                this.currentPiece = null;
                this.currentPieceSize = 0;
            }
        }
    }

    private class RopeByteIterator implements ByteIterator {
        private ByteIterator bytes;
        int bytesRemaining;
        private final PieceIterator pieces;

        private RopeByteIterator() {
            this.pieces = new PieceIterator(RopeByteString.this);
            this.bytes = this.pieces.next().iterator();
            this.bytesRemaining = RopeByteString.this.size();
        }

        public boolean hasNext() {
            return this.bytesRemaining > 0;
        }

        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        public byte nextByte() {
            if (!this.bytes.hasNext()) {
                this.bytes = this.pieces.next().iterator();
            }
            this.bytesRemaining--;
            return this.bytes.nextByte();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    static {
        List arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.valueOf(ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED));
        minLengthByDepth = new int[arrayList.size()];
        for (i = 0; i < minLengthByDepth.length; i++) {
            minLengthByDepth[i] = ((Integer) arrayList.get(i)).intValue();
        }
    }

    private RopeByteString(ByteString byteString, ByteString byteString2) {
        this.hash = 0;
        this.left = byteString;
        this.right = byteString2;
        this.leftLength = byteString.size();
        this.totalLength = this.leftLength + byteString2.size();
        this.treeDepth = Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
    }

    static ByteString concatenate(ByteString byteString, ByteString byteString2) {
        RopeByteString ropeByteString = byteString instanceof RopeByteString ? (RopeByteString) byteString : null;
        if (byteString2.size() == 0) {
            return byteString;
        }
        if (byteString.size() != 0) {
            int size = byteString.size() + byteString2.size();
            if (size < ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                return concatenateBytes(byteString, byteString2);
            }
            if (ropeByteString != null && ropeByteString.right.size() + byteString2.size() < ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                byteString2 = new RopeByteString(ropeByteString.left, concatenateBytes(ropeByteString.right, byteString2));
            } else if (ropeByteString == null || ropeByteString.left.getTreeDepth() <= ropeByteString.right.getTreeDepth() || ropeByteString.getTreeDepth() <= byteString2.getTreeDepth()) {
                if (size >= minLengthByDepth[Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1]) {
                    return new RopeByteString(byteString, byteString2);
                }
                return new Balancer().balance(byteString, byteString2);
            } else {
                byteString2 = new RopeByteString(ropeByteString.left, new RopeByteString(ropeByteString.right, byteString2));
            }
        }
        return byteString2;
    }

    private static LiteralByteString concatenateBytes(ByteString byteString, ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        byte[] bArr = new byte[(size + size2)];
        byteString.copyTo(bArr, 0, 0, size);
        byteString2.copyTo(bArr, 0, size, size2);
        return new LiteralByteString(bArr);
    }

    public int size() {
        return this.totalLength;
    }

    protected int getTreeDepth() {
        return this.treeDepth;
    }

    protected boolean isBalanced() {
        return this.totalLength >= minLengthByDepth[this.treeDepth];
    }

    protected void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        if (i + i3 <= this.leftLength) {
            this.left.copyToInternal(bArr, i, i2, i3);
        } else if (i >= this.leftLength) {
            this.right.copyToInternal(bArr, i - this.leftLength, i2, i3);
        } else {
            int i4 = this.leftLength - i;
            this.left.copyToInternal(bArr, i, i2, i4);
            this.right.copyToInternal(bArr, 0, i2 + i4, i3 - i4);
        }
    }

    void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
        if (i + i2 <= this.leftLength) {
            this.left.writeToInternal(outputStream, i, i2);
        } else if (i >= this.leftLength) {
            this.right.writeToInternal(outputStream, i - this.leftLength, i2);
        } else {
            int i3 = this.leftLength - i;
            this.left.writeToInternal(outputStream, i, i3);
            this.right.writeToInternal(outputStream, 0, i2 - i3);
        }
    }

    public String toString(String str) throws UnsupportedEncodingException {
        return new String(toByteArray(), str);
    }

    public boolean isValidUtf8() {
        if (this.right.partialIsValidUtf8(this.left.partialIsValidUtf8(0, 0, this.leftLength), 0, this.right.size()) == 0) {
            return true;
        }
        return false;
    }

    protected int partialIsValidUtf8(int i, int i2, int i3) {
        if (i2 + i3 <= this.leftLength) {
            return this.left.partialIsValidUtf8(i, i2, i3);
        }
        if (i2 >= this.leftLength) {
            return this.right.partialIsValidUtf8(i, i2 - this.leftLength, i3);
        }
        int i4 = this.leftLength - i2;
        return this.right.partialIsValidUtf8(this.left.partialIsValidUtf8(i, i2, i4), 0, i3 - i4);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (this.totalLength != byteString.size()) {
            return false;
        }
        if (this.totalLength == 0) {
            return true;
        }
        if (this.hash != 0) {
            int peekCachedHashCode = byteString.peekCachedHashCode();
            if (!(peekCachedHashCode == 0 || this.hash == peekCachedHashCode)) {
                return false;
            }
        }
        return equalsFragments(byteString);
    }

    private boolean equalsFragments(ByteString byteString) {
        Iterator pieceIterator = new PieceIterator(this);
        LiteralByteString literalByteString = (LiteralByteString) pieceIterator.next();
        Iterator pieceIterator2 = new PieceIterator(byteString);
        LiteralByteString literalByteString2 = (LiteralByteString) pieceIterator2.next();
        byteString = null;
        int i = 0;
        int i2 = 0;
        while (true) {
            int size = literalByteString.size() - byteString;
            int size2 = literalByteString2.size() - i;
            int min = Math.min(size, size2);
            if (!(byteString == null ? literalByteString.equalsRange(literalByteString2, i, min) : literalByteString2.equalsRange(literalByteString, byteString, min))) {
                return false;
            }
            i2 += min;
            if (i2 >= this.totalLength) {
                break;
            }
            if (min == size) {
                literalByteString = (LiteralByteString) pieceIterator.next();
                byteString = null;
            } else {
                byteString += min;
            }
            if (min == size2) {
                literalByteString2 = (LiteralByteString) pieceIterator2.next();
                i = 0;
            } else {
                i += min;
            }
        }
        if (i2 == this.totalLength) {
            return true;
        }
        throw new IllegalStateException();
    }

    public int hashCode() {
        int i = this.hash;
        if (i == 0) {
            i = partialHash(this.totalLength, 0, this.totalLength);
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
        if (i2 + i3 <= this.leftLength) {
            return this.left.partialHash(i, i2, i3);
        }
        if (i2 >= this.leftLength) {
            return this.right.partialHash(i, i2 - this.leftLength, i3);
        }
        int i4 = this.leftLength - i2;
        return this.right.partialHash(this.left.partialHash(i, i2, i4), 0, i3 - i4);
    }

    public CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance(new RopeInputStream());
    }

    public ByteIterator iterator() {
        return new RopeByteIterator();
    }
}
