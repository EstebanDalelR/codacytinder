package com.google.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class AbstractMessageLite<MessageType extends AbstractMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> implements MessageLite {
    protected int memoizedHashCode = 0;

    public static abstract class Builder<MessageType extends AbstractMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> implements com.google.protobuf.MessageLite.Builder {

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

        protected abstract BuilderType internalMergeFrom(MessageType messageType);

        public abstract BuilderType mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException;

        public BuilderType mergeFrom(CodedInputStream codedInputStream) throws IOException {
            return mergeFrom(codedInputStream, ExtensionRegistryLite.getEmptyRegistry());
        }

        public BuilderType mergeFrom(ByteString byteString) throws InvalidProtocolBufferException {
            try {
                CodedInputStream newCodedInput = byteString.newCodedInput();
                mergeFrom(newCodedInput);
                newCodedInput.checkLastTagWas(0);
                return this;
            } catch (ByteString byteString2) {
                throw byteString2;
            } catch (ByteString byteString22) {
                throw new RuntimeException(getReadingExceptionMessage("ByteString"), byteString22);
            }
        }

        public BuilderType mergeFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            try {
                CodedInputStream newCodedInput = byteString.newCodedInput();
                mergeFrom(newCodedInput, extensionRegistryLite);
                newCodedInput.checkLastTagWas(null);
                return this;
            } catch (ByteString byteString2) {
                throw byteString2;
            } catch (ByteString byteString22) {
                throw new RuntimeException(getReadingExceptionMessage("ByteString"), byteString22);
            }
        }

        public BuilderType mergeFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return mergeFrom(bArr, 0, bArr.length);
        }

        public BuilderType mergeFrom(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            try {
                CodedInputStream newInstance = CodedInputStream.newInstance(bArr, i, i2);
                mergeFrom(newInstance);
                newInstance.checkLastTagWas(0);
                return this;
            } catch (byte[] bArr2) {
                throw bArr2;
            } catch (byte[] bArr22) {
                throw new RuntimeException(getReadingExceptionMessage("byte array"), bArr22);
            }
        }

        public BuilderType mergeFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return mergeFrom(bArr, 0, bArr.length, extensionRegistryLite);
        }

        public BuilderType mergeFrom(byte[] bArr, int i, int i2, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            try {
                CodedInputStream newInstance = CodedInputStream.newInstance(bArr, i, i2);
                mergeFrom(newInstance, extensionRegistryLite);
                newInstance.checkLastTagWas(0);
                return this;
            } catch (byte[] bArr2) {
                throw bArr2;
            } catch (byte[] bArr22) {
                throw new RuntimeException(getReadingExceptionMessage("byte array"), bArr22);
            }
        }

        public BuilderType mergeFrom(InputStream inputStream) throws IOException {
            CodedInputStream newInstance = CodedInputStream.newInstance(inputStream);
            mergeFrom(newInstance);
            newInstance.checkLastTagWas(0);
            return this;
        }

        public BuilderType mergeFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            CodedInputStream newInstance = CodedInputStream.newInstance(inputStream);
            mergeFrom(newInstance, extensionRegistryLite);
            newInstance.checkLastTagWas(null);
            return this;
        }

        public boolean mergeDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            mergeFrom(new LimitedInputStream(inputStream, CodedInputStream.readRawVarint32(read, inputStream)), extensionRegistryLite);
            return true;
        }

        public boolean mergeDelimitedFrom(InputStream inputStream) throws IOException {
            return mergeDelimitedFrom(inputStream, ExtensionRegistryLite.getEmptyRegistry());
        }

        public BuilderType mergeFrom(MessageLite messageLite) {
            if (getDefaultInstanceForType().getClass().isInstance(messageLite)) {
                return internalMergeFrom((AbstractMessageLite) messageLite);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }

        private String getReadingExceptionMessage(String str) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Reading ");
            stringBuilder.append(getClass().getName());
            stringBuilder.append(" from a ");
            stringBuilder.append(str);
            stringBuilder.append(" threw an IOException (should never happen).");
            return stringBuilder.toString();
        }

        private static <T> void addAllCheckingNulls(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (Object next : iterable) {
                if (next == null) {
                    iterable = new StringBuilder();
                    iterable.append("Element at index ");
                    iterable.append(list.size() - size);
                    iterable.append(" is null.");
                    iterable = iterable.toString();
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(iterable);
                }
                list.add(next);
            }
        }

        protected static UninitializedMessageException newUninitializedMessageException(MessageLite messageLite) {
            return new UninitializedMessageException(messageLite);
        }

        @Deprecated
        protected static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
            addAll((Iterable) iterable, (List) collection);
        }

        protected static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
            Internal.checkNotNull(iterable);
            if (iterable instanceof LazyStringList) {
                iterable = ((LazyStringList) iterable).getUnderlyingElements();
                LazyStringList lazyStringList = (LazyStringList) list;
                list = list.size();
                for (Object next : iterable) {
                    if (next == null) {
                        iterable = new StringBuilder();
                        iterable.append("Element at index ");
                        iterable.append(lazyStringList.size() - list);
                        iterable.append(" is null.");
                        iterable = iterable.toString();
                        for (int size = lazyStringList.size() - 1; size >= list; size--) {
                            lazyStringList.remove(size);
                        }
                        throw new NullPointerException(iterable);
                    } else if (next instanceof ByteString) {
                        lazyStringList.add((ByteString) next);
                    } else {
                        lazyStringList.add((String) next);
                    }
                }
            } else if (iterable instanceof PrimitiveNonBoxingCollection) {
                list.addAll((Collection) iterable);
            } else {
                addAllCheckingNulls(iterable, list);
            }
        }
    }

    public ByteString toByteString() {
        try {
            CodedBuilder newCodedBuilder = ByteString.newCodedBuilder(getSerializedSize());
            writeTo(newCodedBuilder.getCodedOutput());
            return newCodedBuilder.build();
        } catch (Throwable e) {
            throw new RuntimeException(getSerializingExceptionMessage("ByteString"), e);
        }
    }

    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            CodedOutputStream newInstance = CodedOutputStream.newInstance(bArr);
            writeTo(newInstance);
            newInstance.checkNoSpaceLeft();
            return bArr;
        } catch (Throwable e) {
            throw new RuntimeException(getSerializingExceptionMessage("byte array"), e);
        }
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream = CodedOutputStream.newInstance(outputStream, CodedOutputStream.computePreferredBufferSize(getSerializedSize()));
        writeTo((CodedOutputStream) outputStream);
        outputStream.flush();
    }

    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        outputStream = CodedOutputStream.newInstance(outputStream, CodedOutputStream.computePreferredBufferSize(CodedOutputStream.computeRawVarint32Size(serializedSize) + serializedSize));
        outputStream.writeRawVarint32(serializedSize);
        writeTo((CodedOutputStream) outputStream);
        outputStream.flush();
    }

    UninitializedMessageException newUninitializedMessageException() {
        return new UninitializedMessageException((MessageLite) this);
    }

    private String getSerializingExceptionMessage(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Serializing ");
        stringBuilder.append(getClass().getName());
        stringBuilder.append(" to a ");
        stringBuilder.append(str);
        stringBuilder.append(" threw an IOException (should never happen).");
        return stringBuilder.toString();
    }

    protected static void checkByteStringIsUtf8(ByteString byteString) throws IllegalArgumentException {
        if (byteString.isValidUtf8() == null) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    @Deprecated
    protected static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        Builder.addAll((Iterable) iterable, (List) collection);
    }

    protected static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        Builder.addAll((Iterable) iterable, (List) list);
    }
}
