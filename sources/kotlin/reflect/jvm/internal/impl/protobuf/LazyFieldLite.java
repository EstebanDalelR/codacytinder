package kotlin.reflect.jvm.internal.impl.protobuf;

public class LazyFieldLite {
    private ByteString bytes;
    private ExtensionRegistryLite extensionRegistry;
    private volatile boolean isDirty;
    protected volatile MessageLite value;

    public MessageLite getValue(MessageLite messageLite) {
        ensureInitialized(messageLite);
        return this.value;
    }

    public MessageLite setValue(MessageLite messageLite) {
        MessageLite messageLite2 = this.value;
        this.value = messageLite;
        this.bytes = null;
        this.isDirty = true;
        return messageLite2;
    }

    public int getSerializedSize() {
        if (this.isDirty) {
            return this.value.getSerializedSize();
        }
        return this.bytes.size();
    }

    protected void ensureInitialized(kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r2.value;
        if (r0 == 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        monitor-enter(r2);
        r0 = r2.value;	 Catch:{ all -> 0x0025 }
        if (r0 == 0) goto L_0x000c;	 Catch:{ all -> 0x0025 }
    L_0x000a:
        monitor-exit(r2);	 Catch:{ all -> 0x0025 }
        return;
    L_0x000c:
        r0 = r2.bytes;	 Catch:{ IOException -> 0x0023 }
        if (r0 == 0) goto L_0x0021;	 Catch:{ IOException -> 0x0023 }
    L_0x0010:
        r3 = r3.getParserForType();	 Catch:{ IOException -> 0x0023 }
        r0 = r2.bytes;	 Catch:{ IOException -> 0x0023 }
        r1 = r2.extensionRegistry;	 Catch:{ IOException -> 0x0023 }
        r3 = r3.parseFrom(r0, r1);	 Catch:{ IOException -> 0x0023 }
        r3 = (kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) r3;	 Catch:{ IOException -> 0x0023 }
        r2.value = r3;	 Catch:{ IOException -> 0x0023 }
        goto L_0x0023;	 Catch:{ IOException -> 0x0023 }
    L_0x0021:
        r2.value = r3;	 Catch:{ IOException -> 0x0023 }
    L_0x0023:
        monitor-exit(r2);	 Catch:{ all -> 0x0025 }
        return;	 Catch:{ all -> 0x0025 }
    L_0x0025:
        r3 = move-exception;	 Catch:{ all -> 0x0025 }
        monitor-exit(r2);	 Catch:{ all -> 0x0025 }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.LazyFieldLite.ensureInitialized(kotlin.reflect.jvm.internal.impl.protobuf.MessageLite):void");
    }
}
