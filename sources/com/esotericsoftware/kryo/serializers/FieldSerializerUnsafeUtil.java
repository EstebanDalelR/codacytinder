package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField;
import com.esotericsoftware.kryo.util.IntArray;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.List;

interface FieldSerializerUnsafeUtil {

    public static class Factory {
        static Constructor<FieldSerializerUnsafeUtil> fieldSerializerUnsafeUtilConstructor;

        static {
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
            r0 = com.esotericsoftware.kryo.serializers.FieldSerializer.class;	 Catch:{ Throwable -> 0x001a }
            r0 = r0.getClassLoader();	 Catch:{ Throwable -> 0x001a }
            r1 = "com.esotericsoftware.kryo.serializers.FieldSerializerUnsafeUtilImpl";	 Catch:{ Throwable -> 0x001a }
            r0 = r0.loadClass(r1);	 Catch:{ Throwable -> 0x001a }
            r1 = 1;	 Catch:{ Throwable -> 0x001a }
            r1 = new java.lang.Class[r1];	 Catch:{ Throwable -> 0x001a }
            r2 = 0;	 Catch:{ Throwable -> 0x001a }
            r3 = com.esotericsoftware.kryo.serializers.FieldSerializer.class;	 Catch:{ Throwable -> 0x001a }
            r1[r2] = r3;	 Catch:{ Throwable -> 0x001a }
            r0 = r0.getConstructor(r1);	 Catch:{ Throwable -> 0x001a }
            fieldSerializerUnsafeUtilConstructor = r0;	 Catch:{ Throwable -> 0x001a }
        L_0x001a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.serializers.FieldSerializerUnsafeUtil.Factory.<clinit>():void");
        }

        static com.esotericsoftware.kryo.serializers.FieldSerializerUnsafeUtil getInstance(com.esotericsoftware.kryo.serializers.FieldSerializer r3) {
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
            r0 = fieldSerializerUnsafeUtilConstructor;
            if (r0 == 0) goto L_0x0013;
        L_0x0004:
            r0 = fieldSerializerUnsafeUtilConstructor;	 Catch:{ Exception -> 0x0013 }
            r1 = 1;	 Catch:{ Exception -> 0x0013 }
            r1 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x0013 }
            r2 = 0;	 Catch:{ Exception -> 0x0013 }
            r1[r2] = r3;	 Catch:{ Exception -> 0x0013 }
            r3 = r0.newInstance(r1);	 Catch:{ Exception -> 0x0013 }
            r3 = (com.esotericsoftware.kryo.serializers.FieldSerializerUnsafeUtil) r3;	 Catch:{ Exception -> 0x0013 }
            return r3;
        L_0x0013:
            r3 = 0;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.serializers.FieldSerializerUnsafeUtil.Factory.getInstance(com.esotericsoftware.kryo.serializers.FieldSerializer):com.esotericsoftware.kryo.serializers.FieldSerializerUnsafeUtil");
        }
    }

    void createUnsafeCacheFieldsAndRegions(List<Field> list, List<CachedField> list2, int i, IntArray intArray);

    long getObjectFieldOffset(Field field);
}
