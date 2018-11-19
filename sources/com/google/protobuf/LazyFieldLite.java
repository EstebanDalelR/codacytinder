package com.google.protobuf;

public class LazyFieldLite {
    private static final ExtensionRegistryLite EMPTY_REGISTRY = ExtensionRegistryLite.getEmptyRegistry();
    private ByteString delayedBytes;
    private ExtensionRegistryLite extensionRegistry;
    private volatile ByteString memoizedBytes;
    protected volatile MessageLite value;

    public int hashCode() {
        return 1;
    }

    public LazyFieldLite(ExtensionRegistryLite extensionRegistryLite, ByteString byteString) {
        checkArguments(extensionRegistryLite, byteString);
        this.extensionRegistry = extensionRegistryLite;
        this.delayedBytes = byteString;
    }

    public static LazyFieldLite fromValue(MessageLite messageLite) {
        LazyFieldLite lazyFieldLite = new LazyFieldLite();
        lazyFieldLite.setValue(messageLite);
        return lazyFieldLite;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyFieldLite)) {
            return null;
        }
        LazyFieldLite lazyFieldLite = (LazyFieldLite) obj;
        MessageLite messageLite = this.value;
        MessageLite messageLite2 = lazyFieldLite.value;
        if (messageLite == null && messageLite2 == null) {
            return toByteString().equals(lazyFieldLite.toByteString());
        }
        if (messageLite != null && messageLite2 != null) {
            return messageLite.equals(messageLite2);
        }
        if (messageLite != null) {
            return messageLite.equals(lazyFieldLite.getValue(messageLite.getDefaultInstanceForType()));
        }
        return getValue(messageLite2.getDefaultInstanceForType()).equals(messageLite2);
    }

    public boolean containsDefaultInstance() {
        if (this.memoizedBytes != ByteString.EMPTY) {
            if (this.value == null) {
                if (this.delayedBytes != null) {
                    if (this.delayedBytes == ByteString.EMPTY) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public void clear() {
        this.delayedBytes = null;
        this.value = null;
        this.memoizedBytes = null;
    }

    public void set(LazyFieldLite lazyFieldLite) {
        this.delayedBytes = lazyFieldLite.delayedBytes;
        this.value = lazyFieldLite.value;
        this.memoizedBytes = lazyFieldLite.memoizedBytes;
        if (lazyFieldLite.extensionRegistry != null) {
            this.extensionRegistry = lazyFieldLite.extensionRegistry;
        }
    }

    public MessageLite getValue(MessageLite messageLite) {
        ensureInitialized(messageLite);
        return this.value;
    }

    public MessageLite setValue(MessageLite messageLite) {
        MessageLite messageLite2 = this.value;
        this.delayedBytes = null;
        this.memoizedBytes = null;
        this.value = messageLite;
        return messageLite2;
    }

    public void merge(LazyFieldLite lazyFieldLite) {
        if (!lazyFieldLite.containsDefaultInstance()) {
            if (containsDefaultInstance()) {
                set(lazyFieldLite);
                return;
            }
            if (this.extensionRegistry == null) {
                this.extensionRegistry = lazyFieldLite.extensionRegistry;
            }
            if (this.delayedBytes != null && lazyFieldLite.delayedBytes != null) {
                this.delayedBytes = this.delayedBytes.concat(lazyFieldLite.delayedBytes);
            } else if (this.value == null && lazyFieldLite.value != null) {
                setValue(mergeValueAndBytes(lazyFieldLite.value, this.delayedBytes, this.extensionRegistry));
            } else if (this.value == null || lazyFieldLite.value != null) {
                setValue(this.value.toBuilder().mergeFrom(lazyFieldLite.value).build());
            } else {
                setValue(mergeValueAndBytes(this.value, lazyFieldLite.delayedBytes, lazyFieldLite.extensionRegistry));
            }
        }
    }

    public void mergeFrom(com.google.protobuf.CodedInputStream r2, com.google.protobuf.ExtensionRegistryLite r3) throws java.io.IOException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r1 = this;
        r0 = r1.containsDefaultInstance();
        if (r0 == 0) goto L_0x000e;
    L_0x0006:
        r2 = r2.readBytes();
        r1.setByteString(r2, r3);
        return;
    L_0x000e:
        r0 = r1.extensionRegistry;
        if (r0 != 0) goto L_0x0014;
    L_0x0012:
        r1.extensionRegistry = r3;
    L_0x0014:
        r0 = r1.delayedBytes;
        if (r0 == 0) goto L_0x0028;
    L_0x0018:
        r3 = r1.delayedBytes;
        r2 = r2.readBytes();
        r2 = r3.concat(r2);
        r3 = r1.extensionRegistry;
        r1.setByteString(r2, r3);
        return;
    L_0x0028:
        r0 = r1.value;	 Catch:{ InvalidProtocolBufferException -> 0x0039 }
        r0 = r0.toBuilder();	 Catch:{ InvalidProtocolBufferException -> 0x0039 }
        r2 = r0.mergeFrom(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0039 }
        r2 = r2.build();	 Catch:{ InvalidProtocolBufferException -> 0x0039 }
        r1.setValue(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0039 }
    L_0x0039:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.LazyFieldLite.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):void");
    }

    private static com.google.protobuf.MessageLite mergeValueAndBytes(com.google.protobuf.MessageLite r1, com.google.protobuf.ByteString r2, com.google.protobuf.ExtensionRegistryLite r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = r1.toBuilder();	 Catch:{ InvalidProtocolBufferException -> 0x000d }
        r2 = r0.mergeFrom(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x000d }
        r2 = r2.build();	 Catch:{ InvalidProtocolBufferException -> 0x000d }
        return r2;
    L_0x000d:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.LazyFieldLite.mergeValueAndBytes(com.google.protobuf.MessageLite, com.google.protobuf.ByteString, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.MessageLite");
    }

    public void setByteString(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        checkArguments(extensionRegistryLite, byteString);
        this.delayedBytes = byteString;
        this.extensionRegistry = extensionRegistryLite;
        this.value = null;
        this.memoizedBytes = null;
    }

    public int getSerializedSize() {
        if (this.memoizedBytes != null) {
            return this.memoizedBytes.size();
        }
        if (this.delayedBytes != null) {
            return this.delayedBytes.size();
        }
        return this.value != null ? this.value.getSerializedSize() : 0;
    }

    public ByteString toByteString() {
        if (this.memoizedBytes != null) {
            return this.memoizedBytes;
        }
        if (this.delayedBytes != null) {
            return this.delayedBytes;
        }
        synchronized (this) {
            if (this.memoizedBytes != null) {
                ByteString byteString = this.memoizedBytes;
                return byteString;
            }
            if (this.value == null) {
                this.memoizedBytes = ByteString.EMPTY;
            } else {
                this.memoizedBytes = this.value.toByteString();
            }
            byteString = this.memoizedBytes;
            return byteString;
        }
    }

    protected void ensureInitialized(com.google.protobuf.MessageLite r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r3 = this;
        r0 = r3.value;
        if (r0 == 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        monitor-enter(r3);
        r0 = r3.value;	 Catch:{ all -> 0x0034 }
        if (r0 == 0) goto L_0x000c;	 Catch:{ all -> 0x0034 }
    L_0x000a:
        monitor-exit(r3);	 Catch:{ all -> 0x0034 }
        return;
    L_0x000c:
        r0 = r3.delayedBytes;	 Catch:{ InvalidProtocolBufferException -> 0x002c }
        if (r0 == 0) goto L_0x0025;	 Catch:{ InvalidProtocolBufferException -> 0x002c }
    L_0x0010:
        r0 = r4.getParserForType();	 Catch:{ InvalidProtocolBufferException -> 0x002c }
        r1 = r3.delayedBytes;	 Catch:{ InvalidProtocolBufferException -> 0x002c }
        r2 = r3.extensionRegistry;	 Catch:{ InvalidProtocolBufferException -> 0x002c }
        r0 = r0.parseFrom(r1, r2);	 Catch:{ InvalidProtocolBufferException -> 0x002c }
        r0 = (com.google.protobuf.MessageLite) r0;	 Catch:{ InvalidProtocolBufferException -> 0x002c }
        r3.value = r0;	 Catch:{ InvalidProtocolBufferException -> 0x002c }
        r0 = r3.delayedBytes;	 Catch:{ InvalidProtocolBufferException -> 0x002c }
        r3.memoizedBytes = r0;	 Catch:{ InvalidProtocolBufferException -> 0x002c }
        goto L_0x0032;	 Catch:{ InvalidProtocolBufferException -> 0x002c }
    L_0x0025:
        r3.value = r4;	 Catch:{ InvalidProtocolBufferException -> 0x002c }
        r0 = com.google.protobuf.ByteString.EMPTY;	 Catch:{ InvalidProtocolBufferException -> 0x002c }
        r3.memoizedBytes = r0;	 Catch:{ InvalidProtocolBufferException -> 0x002c }
        goto L_0x0032;
    L_0x002c:
        r3.value = r4;	 Catch:{ all -> 0x0034 }
        r4 = com.google.protobuf.ByteString.EMPTY;	 Catch:{ all -> 0x0034 }
        r3.memoizedBytes = r4;	 Catch:{ all -> 0x0034 }
    L_0x0032:
        monitor-exit(r3);	 Catch:{ all -> 0x0034 }
        return;	 Catch:{ all -> 0x0034 }
    L_0x0034:
        r4 = move-exception;	 Catch:{ all -> 0x0034 }
        monitor-exit(r3);	 Catch:{ all -> 0x0034 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.LazyFieldLite.ensureInitialized(com.google.protobuf.MessageLite):void");
    }

    private static void checkArguments(ExtensionRegistryLite extensionRegistryLite, ByteString byteString) {
        if (extensionRegistryLite == null) {
            throw new NullPointerException("found null ExtensionRegistry");
        } else if (byteString == null) {
            throw new NullPointerException("found null ByteString");
        }
    }
}
