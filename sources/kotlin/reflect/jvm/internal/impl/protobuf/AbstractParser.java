package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.InputStream;

public abstract class AbstractParser<MessageType extends MessageLite> implements Parser<MessageType> {
    private static final ExtensionRegistryLite EMPTY_REGISTRY = ExtensionRegistryLite.getEmptyRegistry();

    private UninitializedMessageException newUninitializedMessageException(MessageType messageType) {
        if (messageType instanceof AbstractMessageLite) {
            return ((AbstractMessageLite) messageType).newUninitializedMessageException();
        }
        return new UninitializedMessageException(messageType);
    }

    private MessageType checkMessageInitialized(MessageType messageType) throws InvalidProtocolBufferException {
        if (messageType == null || messageType.isInitialized()) {
            return messageType;
        }
        throw newUninitializedMessageException(messageType).asInvalidProtocolBufferException().setUnfinishedMessage(messageType);
    }

    public MessageType parsePartialFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        MessageLite messageLite;
        try {
            byteString = byteString.newCodedInput();
            messageLite = (MessageLite) parsePartialFrom(byteString, extensionRegistryLite);
            byteString.checkLastTagWas(0);
            return messageLite;
        } catch (ByteString byteString2) {
            throw byteString2.setUnfinishedMessage(messageLite);
        } catch (ByteString byteString22) {
            throw byteString22;
        }
    }

    public MessageType parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom(byteString, extensionRegistryLite));
    }

    public MessageType parsePartialFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        inputStream = CodedInputStream.newInstance(inputStream);
        MessageLite messageLite = (MessageLite) parsePartialFrom(inputStream, extensionRegistryLite);
        try {
            inputStream.checkLastTagWas(0);
            return messageLite;
        } catch (InputStream inputStream2) {
            throw inputStream2.setUnfinishedMessage(messageLite);
        }
    }

    public MessageType parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom(inputStream, extensionRegistryLite));
    }

    public MessageType parseFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return parseFrom(inputStream, EMPTY_REGISTRY);
    }

    public MessageType parsePartialDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return parsePartialFrom(new LimitedInputStream(inputStream, CodedInputStream.readRawVarint32(read, inputStream)), extensionRegistryLite);
        } catch (InputStream inputStream2) {
            throw new InvalidProtocolBufferException(inputStream2.getMessage());
        }
    }

    public MessageType parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialDelimitedFrom(inputStream, extensionRegistryLite));
    }
}
