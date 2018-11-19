package com.esotericsoftware.kryo.util;

import com.esotericsoftware.minlog.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import sun.misc.Cleaner;
import sun.misc.Unsafe;
import sun.nio.ch.DirectBuffer;

public class UnsafeUtil {
    private static final Unsafe _unsafe;
    public static final long byteArrayBaseOffset;
    public static final long charArrayBaseOffset;
    static Constructor<? extends ByteBuffer> directByteBufferConstr;
    public static final long doubleArrayBaseOffset;
    public static final long floatArrayBaseOffset;
    public static final long intArrayBaseOffset;
    public static final long longArrayBaseOffset;
    public static final long shortArrayBaseOffset;

    /* renamed from: com.esotericsoftware.kryo.util.UnsafeUtil$1 */
    static class C11231 implements Comparator<Field> {
        C11231() {
        }

        public int compare(Field field, Field field2) {
            long objectFieldOffset = UnsafeUtil.unsafe().objectFieldOffset(field);
            field = UnsafeUtil.unsafe().objectFieldOffset(field2);
            if (objectFieldOffset < field) {
                return -1;
            }
            return objectFieldOffset == field ? null : 1;
        }
    }

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
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = 0;
        r1 = 1;
        r4 = com.esotericsoftware.kryo.util.Util.IS_ANDROID;	 Catch:{ Exception -> 0x007f }
        if (r4 != 0) goto L_0x0064;	 Catch:{ Exception -> 0x007f }
    L_0x0006:
        r4 = sun.misc.Unsafe.class;	 Catch:{ Exception -> 0x007f }
        r5 = "theUnsafe";	 Catch:{ Exception -> 0x007f }
        r4 = r4.getDeclaredField(r5);	 Catch:{ Exception -> 0x007f }
        r4.setAccessible(r1);	 Catch:{ Exception -> 0x007f }
        r4 = r4.get(r0);	 Catch:{ Exception -> 0x007f }
        r4 = (sun.misc.Unsafe) r4;	 Catch:{ Exception -> 0x007f }
        r5 = byte[].class;	 Catch:{ Exception -> 0x0061 }
        r5 = r4.arrayBaseOffset(r5);	 Catch:{ Exception -> 0x0061 }
        r5 = (long) r5;
        r7 = char[].class;	 Catch:{ Exception -> 0x005e }
        r7 = r4.arrayBaseOffset(r7);	 Catch:{ Exception -> 0x005e }
        r7 = (long) r7;
        r9 = short[].class;	 Catch:{ Exception -> 0x005b }
        r9 = r4.arrayBaseOffset(r9);	 Catch:{ Exception -> 0x005b }
        r9 = (long) r9;
        r11 = int[].class;	 Catch:{ Exception -> 0x0058 }
        r11 = r4.arrayBaseOffset(r11);	 Catch:{ Exception -> 0x0058 }
        r11 = (long) r11;
        r13 = float[].class;	 Catch:{ Exception -> 0x0055 }
        r13 = r4.arrayBaseOffset(r13);	 Catch:{ Exception -> 0x0055 }
        r13 = (long) r13;
        r15 = long[].class;	 Catch:{ Exception -> 0x0052 }
        r15 = r4.arrayBaseOffset(r15);	 Catch:{ Exception -> 0x0052 }
        r2 = (long) r15;
        r15 = double[].class;	 Catch:{ Exception -> 0x0050 }
        r15 = r4.arrayBaseOffset(r15);	 Catch:{ Exception -> 0x0050 }
        r0 = (long) r15;
        r16 = r5;
        r18 = r0;
        r0 = r2;
        r2 = r18;
        goto L_0x009b;
    L_0x0050:
        r0 = r2;
        goto L_0x008c;
    L_0x0052:
        r0 = 0;
        goto L_0x008c;
    L_0x0055:
        r0 = 0;
        goto L_0x008a;
    L_0x0058:
        r0 = 0;
        goto L_0x0088;
    L_0x005b:
        r0 = 0;
        goto L_0x0086;
    L_0x005e:
        r0 = 0;
        goto L_0x0084;
    L_0x0061:
        r0 = 0;
        goto L_0x0082;
    L_0x0064:
        r0 = com.esotericsoftware.minlog.Log.TRACE;	 Catch:{ Exception -> 0x007f }
        if (r0 == 0) goto L_0x006f;	 Catch:{ Exception -> 0x007f }
    L_0x0068:
        r0 = "kryo";	 Catch:{ Exception -> 0x007f }
        r1 = "Running on Android platform. Use of sun.misc.Unsafe should be disabled";	 Catch:{ Exception -> 0x007f }
        com.esotericsoftware.minlog.Log.trace(r0, r1);	 Catch:{ Exception -> 0x007f }
    L_0x006f:
        r0 = 0;
        r2 = 0;
        r4 = 0;
        r7 = 0;
        r9 = 0;
        r11 = 0;
        r13 = 0;
        r16 = 0;
        goto L_0x009b;
    L_0x007f:
        r0 = 0;
        r4 = 0;
    L_0x0082:
        r5 = 0;
    L_0x0084:
        r7 = 0;
    L_0x0086:
        r9 = 0;
    L_0x0088:
        r11 = 0;
    L_0x008a:
        r13 = 0;
    L_0x008c:
        r2 = com.esotericsoftware.minlog.Log.TRACE;
        if (r2 == 0) goto L_0x0097;
    L_0x0090:
        r2 = "kryo";
        r3 = "sun.misc.Unsafe is not accessible or not available. Use of sun.misc.Unsafe should be disabled";
        com.esotericsoftware.minlog.Log.trace(r2, r3);
    L_0x0097:
        r16 = r5;
        r2 = 0;
    L_0x009b:
        byteArrayBaseOffset = r16;
        charArrayBaseOffset = r7;
        shortArrayBaseOffset = r9;
        intArrayBaseOffset = r11;
        floatArrayBaseOffset = r13;
        longArrayBaseOffset = r0;
        doubleArrayBaseOffset = r2;
        _unsafe = r4;
        r0 = 1;
        r1 = java.nio.ByteBuffer.allocateDirect(r0);
        r0 = r1.getClass();	 Catch:{ Exception -> 0x00d3 }
        r1 = 3;	 Catch:{ Exception -> 0x00d3 }
        r1 = new java.lang.Class[r1];	 Catch:{ Exception -> 0x00d3 }
        r2 = 0;	 Catch:{ Exception -> 0x00d3 }
        r3 = java.lang.Long.TYPE;	 Catch:{ Exception -> 0x00d3 }
        r1[r2] = r3;	 Catch:{ Exception -> 0x00d3 }
        r2 = java.lang.Integer.TYPE;	 Catch:{ Exception -> 0x00d3 }
        r3 = 1;	 Catch:{ Exception -> 0x00d3 }
        r1[r3] = r2;	 Catch:{ Exception -> 0x00d3 }
        r2 = 2;	 Catch:{ Exception -> 0x00d3 }
        r3 = java.lang.Object.class;	 Catch:{ Exception -> 0x00d3 }
        r1[r2] = r3;	 Catch:{ Exception -> 0x00d3 }
        r0 = r0.getDeclaredConstructor(r1);	 Catch:{ Exception -> 0x00d3 }
        directByteBufferConstr = r0;	 Catch:{ Exception -> 0x00d3 }
        r0 = directByteBufferConstr;	 Catch:{ Exception -> 0x00d3 }
        r1 = 1;	 Catch:{ Exception -> 0x00d3 }
        r0.setAccessible(r1);	 Catch:{ Exception -> 0x00d3 }
        goto L_0x00d6;
    L_0x00d3:
        r0 = 0;
        directByteBufferConstr = r0;
    L_0x00d6:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.util.UnsafeUtil.<clinit>():void");
    }

    public static final Unsafe unsafe() {
        return _unsafe;
    }

    public static Field[] sortFieldsByOffset(List<Field> list) {
        Field[] fieldArr = (Field[]) list.toArray(new Field[0]);
        Arrays.sort(fieldArr, new C11231());
        for (Field field : list) {
            if (Log.TRACE) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Field '");
                stringBuilder.append(field.getName());
                stringBuilder.append("' at offset ");
                stringBuilder.append(unsafe().objectFieldOffset(field));
                Log.trace("kryo", stringBuilder.toString());
            }
        }
        return fieldArr;
    }

    public static final ByteBuffer getDirectBufferAt(long j, int i) {
        if (directByteBufferConstr == null) {
            return null;
        }
        try {
            return (ByteBuffer) directByteBufferConstr.newInstance(new Object[]{Long.valueOf(j), Integer.valueOf(i), null});
        } catch (int i2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Cannot allocate ByteBuffer at a given address: ");
            stringBuilder.append(j);
            throw new RuntimeException(stringBuilder.toString(), i2);
        }
    }

    public static void releaseBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer != null && byteBuffer.isDirect()) {
            byteBuffer = ((DirectBuffer) byteBuffer).cleaner();
            if (byteBuffer != null) {
                ((Cleaner) byteBuffer).clean();
            }
        }
    }
}
