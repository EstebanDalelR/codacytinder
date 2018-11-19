package com.google.protobuf;

public final class RpcUtil {

    public static final class AlreadyCalledException extends RuntimeException {
        private static final long serialVersionUID = 5469741279507848266L;

        public AlreadyCalledException() {
            super("This RpcCallback was already called and cannot be called multiple times.");
        }
    }

    public static <Type extends Message> RpcCallback<Type> specializeCallback(RpcCallback<Message> rpcCallback) {
        return rpcCallback;
    }

    private RpcUtil() {
    }

    public static <Type extends Message> RpcCallback<Message> generalizeCallback(final RpcCallback<Type> rpcCallback, final Class<Type> cls, final Type type) {
        return new RpcCallback<Message>() {
            public void run(com.google.protobuf.Message r2) {
                /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r1 = this;
                r0 = r2;	 Catch:{ ClassCastException -> 0x0009 }
                r0 = r0.cast(r2);	 Catch:{ ClassCastException -> 0x0009 }
                r0 = (com.google.protobuf.Message) r0;	 Catch:{ ClassCastException -> 0x0009 }
                goto L_0x000f;
            L_0x0009:
                r0 = r3;
                r0 = com.google.protobuf.RpcUtil.copyAsType(r0, r2);
            L_0x000f:
                r2 = r1;
                r2.run(r0);
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.RpcUtil.1.run(com.google.protobuf.Message):void");
            }
        };
    }

    private static <Type extends Message> Type copyAsType(Type type, Message message) {
        return type.newBuilderForType().mergeFrom(message).build();
    }

    public static <ParameterType> RpcCallback<ParameterType> newOneTimeCallback(final RpcCallback<ParameterType> rpcCallback) {
        return new RpcCallback<ParameterType>() {
            private boolean alreadyCalled = null;

            public void run(ParameterType parameterType) {
                synchronized (this) {
                    if (this.alreadyCalled) {
                        throw new AlreadyCalledException();
                    }
                    this.alreadyCalled = true;
                }
                rpcCallback.run(parameterType);
            }
        };
    }
}
