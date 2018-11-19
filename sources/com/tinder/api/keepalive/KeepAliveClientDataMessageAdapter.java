package com.tinder.api.keepalive;

import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.MessageLite;
import com.tinder.api.ManagerWebServices;
import com.tinder.proto.keepalive.KeepAliveClientData.ClientData;
import com.tinder.proto.keepalive.KeepAliveClientData.ClientData.PayloadCase;
import com.tinder.scarlet.C14789c;
import com.tinder.scarlet.MessageAdapter;
import com.tinder.scarlet.p468a.p470b.C16503a.C16502a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u001d\b\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/tinder/api/keepalive/KeepAliveClientDataMessageAdapter;", "Lcom/tinder/scarlet/MessageAdapter;", "", "clientDataMessageAdapter", "Lcom/tinder/proto/keepalive/KeepAliveClientData$ClientData;", "fieldDescriptor", "Lcom/google/protobuf/Descriptors$FieldDescriptor;", "(Lcom/tinder/scarlet/MessageAdapter;Lcom/google/protobuf/Descriptors$FieldDescriptor;)V", "getFieldDescriptor$api_release", "()Lcom/google/protobuf/Descriptors$FieldDescriptor;", "fromMessage", "message", "Lcom/tinder/scarlet/Message;", "toMessage", "data", "Factory", "api_release"}, k = 1, mv = {1, 1, 10})
public final class KeepAliveClientDataMessageAdapter implements MessageAdapter<Object> {
    private final MessageAdapter<ClientData> clientDataMessageAdapter;
    @NotNull
    private final FieldDescriptor fieldDescriptor;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J'\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0002\u0010\u0010J\f\u0010\u0011\u001a\u00020\u0012*\u00020\fH\u0002J\f\u0010\u0013\u001a\u00020\u0014*\u00020\u0012H\u0002R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/tinder/api/keepalive/KeepAliveClientDataMessageAdapter$Factory;", "Lcom/tinder/scarlet/MessageAdapter$Factory;", "protobufMessageAdapterFactory", "Lcom/tinder/scarlet/messageadapter/protobuf/ProtobufMessageAdapter$Factory;", "(Lcom/tinder/scarlet/messageadapter/protobuf/ProtobufMessageAdapter$Factory;)V", "clientDataMessageAdapter", "Lcom/tinder/scarlet/MessageAdapter;", "Lcom/tinder/proto/keepalive/KeepAliveClientData$ClientData;", "clientDataMessageAdapter$annotations", "()V", "create", "type", "Ljava/lang/reflect/Type;", "annotations", "", "", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lcom/tinder/scarlet/MessageAdapter;", "findDescriptor", "Lcom/google/protobuf/Descriptors$Descriptor;", "findFieldDescriptorInClientData", "Lcom/google/protobuf/Descriptors$FieldDescriptor;", "Companion", "api_release"}, k = 1, mv = {1, 1, 10})
    public static final class Factory implements com.tinder.scarlet.MessageAdapter.Factory {
        private static final List<FieldDescriptor> CLIENT_DATA_PAYLOAD_FIELD_DESCRIPTORS;
        @Deprecated
        public static final Companion Companion = new Companion();
        private final MessageAdapter<ClientData> clientDataMessageAdapter;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/tinder/api/keepalive/KeepAliveClientDataMessageAdapter$Factory$Companion;", "", "()V", "CLIENT_DATA_PAYLOAD_FIELD_DESCRIPTORS", "", "Lcom/google/protobuf/Descriptors$FieldDescriptor;", "api_release"}, k = 1, mv = {1, 1, 10})
        private static final class Companion {
            private Companion() {
            }
        }

        private static /* synthetic */ void clientDataMessageAdapter$annotations() {
        }

        public Factory(@NotNull C16502a c16502a) {
            C2668g.b(c16502a, "protobufMessageAdapterFactory");
            c16502a = c16502a.create(ClientData.class, new Annotation[0]);
            if (c16502a == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.scarlet.MessageAdapter<com.tinder.proto.keepalive.KeepAliveClientData.ClientData>");
            }
            this.clientDataMessageAdapter = c16502a;
        }

        @NotNull
        public MessageAdapter<?> create(@NotNull Type type, @NotNull Annotation[] annotationArr) {
            C2668g.b(type, "type");
            C2668g.b(annotationArr, "annotations");
            return (MessageAdapter) new KeepAliveClientDataMessageAdapter(this.clientDataMessageAdapter, findFieldDescriptorInClientData(findDescriptor(type)));
        }

        private final Descriptor findDescriptor(@NotNull Type type) {
            if (!(type instanceof Class)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            } else if (type == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<*>");
            } else {
                Class cls = (Class) type;
                if (MessageLite.class.isAssignableFrom(cls)) {
                    type = cls.getMethod("getDescriptor", new Class[0]).invoke(null, new Object[0]);
                    if (type != null) {
                        return (Descriptor) type;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.google.protobuf.Descriptors.Descriptor");
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }

        private final FieldDescriptor findFieldDescriptorInClientData(@NotNull Descriptor descriptor) {
            for (FieldDescriptor fieldDescriptor : CLIENT_DATA_PAYLOAD_FIELD_DESCRIPTORS) {
                if (C2668g.a(fieldDescriptor.getMessageType(), descriptor)) {
                    return fieldDescriptor;
                }
            }
            throw ((Throwable) new NoSuchElementException("Collection contains no element matching the predicate."));
        }

        static {
            PayloadCase[] values = PayloadCase.values();
            Collection arrayList = new ArrayList();
            for (PayloadCase number : values) {
                FieldDescriptor findFieldByNumber = ClientData.getDescriptor().findFieldByNumber(number.getNumber());
                if (findFieldByNumber != null) {
                    arrayList.add(findFieldByNumber);
                }
            }
            CLIENT_DATA_PAYLOAD_FIELD_DESCRIPTORS = (List) arrayList;
        }
    }

    private KeepAliveClientDataMessageAdapter(MessageAdapter<ClientData> messageAdapter, FieldDescriptor fieldDescriptor) {
        this.clientDataMessageAdapter = messageAdapter;
        this.fieldDescriptor = fieldDescriptor;
    }

    @NotNull
    public final FieldDescriptor getFieldDescriptor$api_release() {
        return this.fieldDescriptor;
    }

    @NotNull
    public Object fromMessage(@NotNull C14789c c14789c) {
        C2668g.b(c14789c, "message");
        ClientData clientData = (ClientData) this.clientDataMessageAdapter.fromMessage(c14789c);
        if (clientData.hasField(this.fieldDescriptor)) {
            c14789c = clientData.getField(this.fieldDescriptor);
            C2668g.a(c14789c, "clientData.getField(fieldDescriptor)");
            return c14789c;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @NotNull
    public C14789c toMessage(@NotNull Object obj) {
        C2668g.b(obj, ManagerWebServices.FB_DATA);
        obj = ClientData.newBuilder().setField(this.fieldDescriptor, obj).build();
        MessageAdapter messageAdapter = this.clientDataMessageAdapter;
        C2668g.a(obj, "clientData");
        return messageAdapter.toMessage(obj);
    }
}
