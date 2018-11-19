package com.esotericsoftware.kryo.factories;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;

public class ReflectionSerializerFactory implements SerializerFactory {
    private final Class<? extends Serializer> serializerClass;

    public ReflectionSerializerFactory(Class<? extends Serializer> cls) {
        this.serializerClass = cls;
    }

    public Serializer makeSerializer(Kryo kryo, Class<?> cls) {
        return makeSerializer(kryo, this.serializerClass, cls);
    }

    public static com.esotericsoftware.kryo.Serializer makeSerializer(com.esotericsoftware.kryo.Kryo r5, java.lang.Class<? extends com.esotericsoftware.kryo.Serializer> r6, java.lang.Class<?> r7) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = 2;
        r1 = 1;
        r2 = 0;
        r3 = new java.lang.Class[r0];	 Catch:{ NoSuchMethodException -> 0x0020 }
        r4 = com.esotericsoftware.kryo.Kryo.class;	 Catch:{ NoSuchMethodException -> 0x0020 }
        r3[r2] = r4;	 Catch:{ NoSuchMethodException -> 0x0020 }
        r4 = java.lang.Class.class;	 Catch:{ NoSuchMethodException -> 0x0020 }
        r3[r1] = r4;	 Catch:{ NoSuchMethodException -> 0x0020 }
        r3 = r6.getConstructor(r3);	 Catch:{ NoSuchMethodException -> 0x0020 }
        r0 = new java.lang.Object[r0];	 Catch:{ NoSuchMethodException -> 0x0020 }
        r0[r2] = r5;	 Catch:{ NoSuchMethodException -> 0x0020 }
        r0[r1] = r7;	 Catch:{ NoSuchMethodException -> 0x0020 }
        r0 = r3.newInstance(r0);	 Catch:{ NoSuchMethodException -> 0x0020 }
        r0 = (com.esotericsoftware.kryo.Serializer) r0;	 Catch:{ NoSuchMethodException -> 0x0020 }
        return r0;
    L_0x001e:
        r5 = move-exception;
        goto L_0x0051;
    L_0x0020:
        r0 = new java.lang.Class[r1];	 Catch:{ NoSuchMethodException -> 0x0035 }
        r3 = com.esotericsoftware.kryo.Kryo.class;	 Catch:{ NoSuchMethodException -> 0x0035 }
        r0[r2] = r3;	 Catch:{ NoSuchMethodException -> 0x0035 }
        r0 = r6.getConstructor(r0);	 Catch:{ NoSuchMethodException -> 0x0035 }
        r3 = new java.lang.Object[r1];	 Catch:{ NoSuchMethodException -> 0x0035 }
        r3[r2] = r5;	 Catch:{ NoSuchMethodException -> 0x0035 }
        r5 = r0.newInstance(r3);	 Catch:{ NoSuchMethodException -> 0x0035 }
        r5 = (com.esotericsoftware.kryo.Serializer) r5;	 Catch:{ NoSuchMethodException -> 0x0035 }
        return r5;
    L_0x0035:
        r5 = new java.lang.Class[r1];	 Catch:{ NoSuchMethodException -> 0x004a }
        r0 = java.lang.Class.class;	 Catch:{ NoSuchMethodException -> 0x004a }
        r5[r2] = r0;	 Catch:{ NoSuchMethodException -> 0x004a }
        r5 = r6.getConstructor(r5);	 Catch:{ NoSuchMethodException -> 0x004a }
        r0 = new java.lang.Object[r1];	 Catch:{ NoSuchMethodException -> 0x004a }
        r0[r2] = r7;	 Catch:{ NoSuchMethodException -> 0x004a }
        r5 = r5.newInstance(r0);	 Catch:{ NoSuchMethodException -> 0x004a }
        r5 = (com.esotericsoftware.kryo.Serializer) r5;	 Catch:{ NoSuchMethodException -> 0x004a }
        return r5;
    L_0x004a:
        r5 = r6.newInstance();	 Catch:{ Exception -> 0x001e }
        r5 = (com.esotericsoftware.kryo.Serializer) r5;	 Catch:{ Exception -> 0x001e }
        return r5;
    L_0x0051:
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Unable to create serializer \"";
        r1.append(r2);
        r6 = r6.getName();
        r1.append(r6);
        r6 = "\" for class: ";
        r1.append(r6);
        r6 = com.esotericsoftware.kryo.util.Util.className(r7);
        r1.append(r6);
        r6 = r1.toString();
        r0.<init>(r6, r5);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.factories.ReflectionSerializerFactory.makeSerializer(com.esotericsoftware.kryo.Kryo, java.lang.Class, java.lang.Class):com.esotericsoftware.kryo.Serializer");
    }
}
