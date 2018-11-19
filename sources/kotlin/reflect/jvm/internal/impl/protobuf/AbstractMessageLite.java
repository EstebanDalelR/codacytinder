package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class AbstractMessageLite implements MessageLite {
    protected int memoizedHashCode = 0;

    public static abstract class Builder<BuilderType extends Builder> implements kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder {

        static final class LimitedInputStream extends FilterInputStream {
            private int limit;

            LimitedInputStream(InputStream inputStream, int i) {
                super(inputStream);
                this.limit = i;
            }

            public int available() throws IOException {
                return Math.min(super.available(), this.limit);
            }

            public int read() throws IOException {
                if (this.limit <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.limit--;
                }
                return read;
            }

            public int read(byte[] bArr, int i, int i2) throws IOException {
                if (this.limit <= 0) {
                    return -1;
                }
                bArr = super.read(bArr, i, Math.min(i2, this.limit));
                if (bArr >= null) {
                    this.limit -= bArr;
                }
                return bArr;
            }

            public long skip(long j) throws IOException {
                j = super.skip(Math.min(j, (long) this.limit));
                if (j >= 0) {
                    this.limit = (int) (((long) this.limit) - j);
                }
                return j;
            }
        }

        public abstract BuilderType clone();

        public abstract BuilderType mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException;

        protected static UninitializedMessageException newUninitializedMessageException(MessageLite messageLite) {
            return new UninitializedMessageException(messageLite);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        outputStream = CodedOutputStream.newInstance(outputStream, CodedOutputStream.computePreferredBufferSize(CodedOutputStream.computeRawVarint32Size(serializedSize) + serializedSize));
        outputStream.writeRawVarint32(serializedSize);
        writeTo(outputStream);
        outputStream.flush();
    }

    UninitializedMessageException newUninitializedMessageException() {
        return new UninitializedMessageException(this);
    }
}
