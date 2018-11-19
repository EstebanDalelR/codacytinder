package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.NotNull;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.serializers.FieldSerializerUnsafeUtil.Factory;
import com.esotericsoftware.kryo.util.IntArray;
import com.esotericsoftware.minlog.Log;
import com.esotericsoftware.reflectasm.FieldAccess;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class FieldSerializer<T> extends Serializer<T> implements Comparator<CachedField> {
    static CachedFieldFactory asmFieldFactory;
    static CachedFieldFactory objectFieldFactory;
    static Method sortFieldsByOffsetMethod;
    static boolean unsafeAvailable = true;
    static CachedFieldFactory unsafeFieldFactory;
    static Class<?> unsafeUtilClass;
    Object access;
    private FieldSerializerAnnotationsUtil annotationsUtil;
    final Class componentType;
    protected final FieldSerializerConfig config;
    private CachedField[] fields;
    private Class[] generics;
    private Generics genericsScope;
    private FieldSerializerGenericsUtil genericsUtil;
    private boolean hasObjectFields;
    final Kryo kryo;
    protected HashSet<CachedField> removedFields;
    private CachedField[] transientFields;
    final Class type;
    final TypeVariable[] typeParameters;
    private FieldSerializerUnsafeUtil unsafeUtil;
    private boolean useMemRegions;
    private boolean varIntsEnabled;

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Bind {
        Class<? extends Serializer> value();
    }

    public static abstract class CachedField<X> {
        FieldAccess access;
        int accessIndex = -1;
        boolean canBeNull;
        Field field;
        long offset = -1;
        Serializer serializer;
        Class valueClass;
        boolean varIntsEnabled = true;

        public abstract void copy(Object obj, Object obj2);

        public abstract void read(Input input, Object obj);

        public abstract void write(Output output, Object obj);

        public void setClass(Class cls) {
            this.valueClass = cls;
            this.serializer = null;
        }

        public void setClass(Class cls, Serializer serializer) {
            this.valueClass = cls;
            this.serializer = serializer;
        }

        public void setSerializer(Serializer serializer) {
            this.serializer = serializer;
        }

        public Serializer getSerializer() {
            return this.serializer;
        }

        public void setCanBeNull(boolean z) {
            this.canBeNull = z;
        }

        public Field getField() {
            return this.field;
        }

        public String toString() {
            return this.field.getName();
        }
    }

    public interface CachedFieldFactory {
        CachedField createCachedField(Class cls, Field field, FieldSerializer fieldSerializer);
    }

    public interface CachedFieldNameStrategy {
        public static final CachedFieldNameStrategy DEFAULT = new C31381();
        public static final CachedFieldNameStrategy EXTENDED = new C31392();

        /* renamed from: com.esotericsoftware.kryo.serializers.FieldSerializer$CachedFieldNameStrategy$1 */
        static class C31381 implements CachedFieldNameStrategy {
            C31381() {
            }

            public String getName(CachedField cachedField) {
                return cachedField.field.getName();
            }
        }

        /* renamed from: com.esotericsoftware.kryo.serializers.FieldSerializer$CachedFieldNameStrategy$2 */
        static class C31392 implements CachedFieldNameStrategy {
            C31392() {
            }

            public String getName(CachedField cachedField) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(cachedField.field.getDeclaringClass().getSimpleName());
                stringBuilder.append(".");
                stringBuilder.append(cachedField.field.getName());
                return stringBuilder.toString();
            }
        }

        String getName(CachedField cachedField);
    }

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Optional {
        String value();
    }

    protected void initializeCachedFields() {
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
        r0 = com.esotericsoftware.kryo.serializers.FieldSerializer.class;	 Catch:{ Throwable -> 0x0036 }
        r0 = r0.getClassLoader();	 Catch:{ Throwable -> 0x0036 }
        r1 = "com.esotericsoftware.kryo.util.UnsafeUtil";	 Catch:{ Throwable -> 0x0036 }
        r0 = r0.loadClass(r1);	 Catch:{ Throwable -> 0x0036 }
        unsafeUtilClass = r0;	 Catch:{ Throwable -> 0x0036 }
        r0 = unsafeUtilClass;	 Catch:{ Throwable -> 0x0036 }
        r1 = "unsafe";	 Catch:{ Throwable -> 0x0036 }
        r2 = 0;	 Catch:{ Throwable -> 0x0036 }
        r3 = new java.lang.Class[r2];	 Catch:{ Throwable -> 0x0036 }
        r0 = r0.getMethod(r1, r3);	 Catch:{ Throwable -> 0x0036 }
        r1 = unsafeUtilClass;	 Catch:{ Throwable -> 0x0036 }
        r3 = "sortFieldsByOffset";	 Catch:{ Throwable -> 0x0036 }
        r4 = 1;	 Catch:{ Throwable -> 0x0036 }
        r5 = new java.lang.Class[r4];	 Catch:{ Throwable -> 0x0036 }
        r6 = java.util.List.class;	 Catch:{ Throwable -> 0x0036 }
        r5[r2] = r6;	 Catch:{ Throwable -> 0x0036 }
        r1 = r1.getMethod(r3, r5);	 Catch:{ Throwable -> 0x0036 }
        sortFieldsByOffsetMethod = r1;	 Catch:{ Throwable -> 0x0036 }
        r1 = 0;	 Catch:{ Throwable -> 0x0036 }
        r2 = new java.lang.Object[r2];	 Catch:{ Throwable -> 0x0036 }
        r0 = r0.invoke(r1, r2);	 Catch:{ Throwable -> 0x0036 }
        if (r0 == 0) goto L_0x0041;	 Catch:{ Throwable -> 0x0036 }
    L_0x0033:
        unsafeAvailable = r4;	 Catch:{ Throwable -> 0x0036 }
        goto L_0x0041;
    L_0x0036:
        r0 = com.esotericsoftware.minlog.Log.TRACE;
        if (r0 == 0) goto L_0x0041;
    L_0x003a:
        r0 = "kryo";
        r1 = "sun.misc.Unsafe is unavailable.";
        com.esotericsoftware.minlog.Log.trace(r0, r1);
    L_0x0041:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.serializers.FieldSerializer.<clinit>():void");
    }

    public FieldSerializer(Kryo kryo, Class cls) {
        this(kryo, cls, null);
    }

    public FieldSerializer(Kryo kryo, Class cls, Class[] clsArr) {
        this(kryo, cls, clsArr, kryo.getFieldSerializerConfig().clone());
    }

    protected FieldSerializer(Kryo kryo, Class cls, Class[] clsArr, FieldSerializerConfig fieldSerializerConfig) {
        this.fields = new CachedField[0];
        this.transientFields = new CachedField[0];
        this.removedFields = new HashSet();
        this.useMemRegions = false;
        this.hasObjectFields = false;
        this.varIntsEnabled = true;
        if (Log.TRACE) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Optimize ints: ");
            stringBuilder.append(this.varIntsEnabled);
            Log.trace("kryo", stringBuilder.toString());
        }
        this.config = fieldSerializerConfig;
        this.kryo = kryo;
        this.type = cls;
        this.generics = clsArr;
        this.typeParameters = cls.getTypeParameters();
        if (this.typeParameters != null) {
            if (this.typeParameters.length != null) {
                this.componentType = null;
                this.genericsUtil = new FieldSerializerGenericsUtil(this);
                this.unsafeUtil = Factory.getInstance(this);
                this.annotationsUtil = new FieldSerializerAnnotationsUtil(this);
                rebuildCachedFields();
            }
        }
        this.componentType = cls.getComponentType();
        this.genericsUtil = new FieldSerializerGenericsUtil(this);
        this.unsafeUtil = Factory.getInstance(this);
        this.annotationsUtil = new FieldSerializerAnnotationsUtil(this);
        rebuildCachedFields();
    }

    protected void rebuildCachedFields() {
        rebuildCachedFields(false);
    }

    protected void rebuildCachedFields(boolean r10) {
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
        r9 = this;
        r0 = com.esotericsoftware.minlog.Log.TRACE;
        if (r0 == 0) goto L_0x0024;
    L_0x0004:
        r0 = r9.generics;
        if (r0 == 0) goto L_0x0024;
    L_0x0008:
        r0 = "kryo";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Generic type parameters: ";
        r1.append(r2);
        r2 = r9.generics;
        r2 = java.util.Arrays.toString(r2);
        r1.append(r2);
        r1 = r1.toString();
        com.esotericsoftware.minlog.Log.trace(r0, r1);
    L_0x0024:
        r0 = r9.type;
        r0 = r0.isInterface();
        r1 = 0;
        if (r0 == 0) goto L_0x0032;
    L_0x002d:
        r10 = new com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField[r1];
        r9.fields = r10;
        return;
    L_0x0032:
        r9.hasObjectFields = r1;
        r0 = r9.config;
        r0 = r0.isOptimizedGenerics();
        if (r0 == 0) goto L_0x0059;
    L_0x003c:
        r0 = r9.genericsUtil;
        r2 = r9.type;
        r3 = r9.generics;
        r0 = r0.buildGenericsScope(r2, r3);
        r9.genericsScope = r0;
        r0 = r9.genericsScope;
        if (r0 == 0) goto L_0x0059;
    L_0x004c:
        r0 = r9.kryo;
        r0 = r0.getGenericsResolver();
        r2 = r9.type;
        r3 = r9.genericsScope;
        r0.pushScope(r2, r3);
    L_0x0059:
        r0 = new com.esotericsoftware.kryo.util.IntArray;
        r0.<init>();
        if (r10 != 0) goto L_0x00ef;
    L_0x0060:
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r9.type;
    L_0x0067:
        r4 = java.lang.Object.class;
        if (r3 == r4) goto L_0x008d;
    L_0x006b:
        r4 = r3.getDeclaredFields();
        if (r4 == 0) goto L_0x0088;
    L_0x0071:
        r5 = r4.length;
        r6 = 0;
    L_0x0073:
        if (r6 >= r5) goto L_0x0088;
    L_0x0075:
        r7 = r4[r6];
        r8 = r7.getModifiers();
        r8 = java.lang.reflect.Modifier.isStatic(r8);
        if (r8 == 0) goto L_0x0082;
    L_0x0081:
        goto L_0x0085;
    L_0x0082:
        r2.add(r7);
    L_0x0085:
        r6 = r6 + 1;
        goto L_0x0073;
    L_0x0088:
        r3 = r3.getSuperclass();
        goto L_0x0067;
    L_0x008d:
        r3 = r9.kryo;
        r3 = r3.getContext();
        r4 = r9.useMemRegions;
        r5 = 1;
        if (r4 == 0) goto L_0x00bf;
    L_0x0098:
        r4 = r9.config;
        r4 = r4.isUseAsm();
        if (r4 != 0) goto L_0x00bf;
    L_0x00a0:
        r4 = unsafeAvailable;
        if (r4 == 0) goto L_0x00bf;
    L_0x00a4:
        r4 = sortFieldsByOffsetMethod;	 Catch:{ Exception -> 0x00b6 }
        r6 = 0;	 Catch:{ Exception -> 0x00b6 }
        r7 = new java.lang.Object[r5];	 Catch:{ Exception -> 0x00b6 }
        r7[r1] = r2;	 Catch:{ Exception -> 0x00b6 }
        r2 = r4.invoke(r6, r7);	 Catch:{ Exception -> 0x00b6 }
        r2 = (java.lang.reflect.Field[]) r2;	 Catch:{ Exception -> 0x00b6 }
        r2 = java.util.Arrays.asList(r2);	 Catch:{ Exception -> 0x00b6 }
        goto L_0x00bf;
    L_0x00b6:
        r10 = move-exception;
        r0 = new java.lang.RuntimeException;
        r1 = "Cannot invoke UnsafeUtil.sortFieldsByOffset()";
        r0.<init>(r1, r10);
        throw r0;
    L_0x00bf:
        r4 = r9.buildValidFields(r1, r2, r3, r0);
        r2 = r9.buildValidFields(r5, r2, r3, r0);
        r3 = r9.config;
        r3 = r3.isUseAsm();
        if (r3 == 0) goto L_0x00fb;
    L_0x00cf:
        r3 = com.esotericsoftware.kryo.util.Util.IS_ANDROID;
        if (r3 != 0) goto L_0x00fb;
    L_0x00d3:
        r3 = r9.type;
        r3 = r3.getModifiers();
        r3 = java.lang.reflect.Modifier.isPublic(r3);
        if (r3 == 0) goto L_0x00fb;
    L_0x00df:
        r3 = r0.indexOf(r5);
        r5 = -1;
        if (r3 == r5) goto L_0x00fb;
    L_0x00e6:
        r3 = r9.type;	 Catch:{ RuntimeException -> 0x00fb }
        r3 = com.esotericsoftware.reflectasm.FieldAccess.get(r3);	 Catch:{ RuntimeException -> 0x00fb }
        r9.access = r3;	 Catch:{ RuntimeException -> 0x00fb }
        goto L_0x00fb;
    L_0x00ef:
        r2 = r9.fields;
        r4 = r9.buildValidFieldsFromCachedFields(r2, r0);
        r2 = r9.transientFields;
        r2 = r9.buildValidFieldsFromCachedFields(r2, r0);
    L_0x00fb:
        r3 = new java.util.ArrayList;
        r5 = r4.size();
        r3.<init>(r5);
        r5 = new java.util.ArrayList;
        r6 = r2.size();
        r5.<init>(r6);
        r9.createCachedFields(r0, r4, r3, r1);
        r1 = r4.size();
        r9.createCachedFields(r0, r2, r5, r1);
        java.util.Collections.sort(r3, r9);
        r0 = r3.size();
        r0 = new com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField[r0];
        r0 = r3.toArray(r0);
        r0 = (com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField[]) r0;
        r9.fields = r0;
        java.util.Collections.sort(r5, r9);
        r0 = r5.size();
        r0 = new com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField[r0];
        r0 = r5.toArray(r0);
        r0 = (com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField[]) r0;
        r9.transientFields = r0;
        r9.initializeCachedFields();
        r0 = r9.genericsScope;
        if (r0 == 0) goto L_0x0149;
    L_0x0140:
        r0 = r9.kryo;
        r0 = r0.getGenericsResolver();
        r0.popScope();
    L_0x0149:
        if (r10 != 0) goto L_0x0161;
    L_0x014b:
        r10 = r9.removedFields;
        r10 = r10.iterator();
    L_0x0151:
        r0 = r10.hasNext();
        if (r0 == 0) goto L_0x0161;
    L_0x0157:
        r0 = r10.next();
        r0 = (com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField) r0;
        r9.removeField(r0);
        goto L_0x0151;
    L_0x0161:
        r10 = r9.annotationsUtil;
        r10.processAnnotatedFields(r9);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.serializers.FieldSerializer.rebuildCachedFields(boolean):void");
    }

    private List<Field> buildValidFieldsFromCachedFields(CachedField[] cachedFieldArr, IntArray intArray) {
        List arrayList = new ArrayList(cachedFieldArr.length);
        for (CachedField cachedField : cachedFieldArr) {
            arrayList.add(cachedField.field);
            intArray.add(cachedField.accessIndex > -1 ? 1 : 0);
        }
        return arrayList;
    }

    private java.util.List<java.lang.reflect.Field> buildValidFields(boolean r9, java.util.List<java.lang.reflect.Field> r10, com.esotericsoftware.kryo.util.ObjectMap r11, com.esotericsoftware.kryo.util.IntArray r12) {
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
        r8 = this;
        r0 = new java.util.ArrayList;
        r1 = r10.size();
        r0.<init>(r1);
        r1 = r10.size();
        r2 = 0;
        r3 = 0;
    L_0x000f:
        if (r3 >= r1) goto L_0x0085;
    L_0x0011:
        r4 = r10.get(r3);
        r4 = (java.lang.reflect.Field) r4;
        r5 = r4.getModifiers();
        r6 = java.lang.reflect.Modifier.isTransient(r5);
        if (r6 == r9) goto L_0x0022;
    L_0x0021:
        goto L_0x0082;
    L_0x0022:
        r6 = java.lang.reflect.Modifier.isStatic(r5);
        if (r6 == 0) goto L_0x0029;
    L_0x0028:
        goto L_0x0082;
    L_0x0029:
        r6 = r4.isSynthetic();
        if (r6 == 0) goto L_0x0038;
    L_0x002f:
        r6 = r8.config;
        r6 = r6.isIgnoreSyntheticFields();
        if (r6 == 0) goto L_0x0038;
    L_0x0037:
        goto L_0x0082;
    L_0x0038:
        r6 = r4.isAccessible();
        r7 = 1;
        if (r6 != 0) goto L_0x004b;
    L_0x003f:
        r6 = r8.config;
        r6 = r6.isSetFieldsAsAccessible();
        if (r6 != 0) goto L_0x0048;
    L_0x0047:
        goto L_0x0082;
    L_0x0048:
        r4.setAccessible(r7);	 Catch:{ AccessControlException -> 0x0082 }
    L_0x004b:
        r6 = com.esotericsoftware.kryo.serializers.FieldSerializer.Optional.class;
        r6 = r4.getAnnotation(r6);
        r6 = (com.esotericsoftware.kryo.serializers.FieldSerializer.Optional) r6;
        if (r6 == 0) goto L_0x0060;
    L_0x0055:
        r6 = r6.value();
        r6 = r11.containsKey(r6);
        if (r6 != 0) goto L_0x0060;
    L_0x005f:
        goto L_0x0082;
    L_0x0060:
        r0.add(r4);
        r6 = java.lang.reflect.Modifier.isFinal(r5);
        if (r6 != 0) goto L_0x007e;
    L_0x0069:
        r5 = java.lang.reflect.Modifier.isPublic(r5);
        if (r5 == 0) goto L_0x007e;
    L_0x006f:
        r4 = r4.getType();
        r4 = r4.getModifiers();
        r4 = java.lang.reflect.Modifier.isPublic(r4);
        if (r4 == 0) goto L_0x007e;
    L_0x007d:
        goto L_0x007f;
    L_0x007e:
        r7 = 0;
    L_0x007f:
        r12.add(r7);
    L_0x0082:
        r3 = r3 + 1;
        goto L_0x000f;
    L_0x0085:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.serializers.FieldSerializer.buildValidFields(boolean, java.util.List, com.esotericsoftware.kryo.util.ObjectMap, com.esotericsoftware.kryo.util.IntArray):java.util.List<java.lang.reflect.Field>");
    }

    private void createCachedFields(IntArray intArray, List<Field> list, List<CachedField> list2, int i) {
        if (!this.config.isUseAsm()) {
            if (this.useMemRegions) {
                this.unsafeUtil.createUnsafeCacheFieldsAndRegions(list, list2, i, intArray);
                return;
            }
        }
        int i2 = 0;
        int size = list.size();
        while (i2 < size) {
            Field field = (Field) list.get(i2);
            int i3 = -1;
            if (this.access != null && intArray.get(i + i2) == 1) {
                i3 = ((FieldAccess) this.access).getIndex(field.getName());
            }
            list2.add(newCachedField(field, list2.size(), i3));
            i2++;
        }
    }

    public void setGenerics(Kryo kryo, Class[] clsArr) {
        if (this.config.isOptimizedGenerics() != null) {
            this.generics = clsArr;
            if (this.typeParameters != null && this.typeParameters.length > null) {
                rebuildCachedFields(true);
            }
        }
    }

    public Class[] getGenerics() {
        return this.generics;
    }

    CachedField newCachedField(Field field, int i, int i2) {
        CachedField newCachedFieldOfGenericType;
        i = 1;
        Class[] clsArr = new Class[]{field.getType()};
        Type genericType = this.config.isOptimizedGenerics() ? field.getGenericType() : null;
        if (this.config.isOptimizedGenerics()) {
            if (genericType != clsArr[0]) {
                newCachedFieldOfGenericType = this.genericsUtil.newCachedFieldOfGenericType(field, i2, clsArr, genericType);
                if (newCachedFieldOfGenericType instanceof ObjectField) {
                    this.hasObjectFields = true;
                }
                newCachedFieldOfGenericType.field = field;
                newCachedFieldOfGenericType.varIntsEnabled = this.varIntsEnabled;
                if (!this.config.isUseAsm()) {
                    newCachedFieldOfGenericType.offset = this.unsafeUtil.getObjectFieldOffset(field);
                }
                newCachedFieldOfGenericType.access = (FieldAccess) this.access;
                newCachedFieldOfGenericType.accessIndex = i2;
                if (this.config.isFieldsCanBeNull() != 0 || clsArr[0].isPrimitive() != 0 || field.isAnnotationPresent(NotNull.class) != null) {
                    i = 0;
                }
                newCachedFieldOfGenericType.canBeNull = i;
                if (!(this.kryo.isFinal(clsArr[0]) == null && this.config.isFixedFieldTypes() == null)) {
                    newCachedFieldOfGenericType.valueClass = clsArr[0];
                }
                return newCachedFieldOfGenericType;
            }
        }
        if (Log.TRACE) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Field ");
            stringBuilder.append(field.getName());
            stringBuilder.append(": ");
            stringBuilder.append(clsArr[0]);
            Log.trace("kryo", stringBuilder.toString());
        }
        newCachedFieldOfGenericType = newMatchingCachedField(field, i2, clsArr[0], genericType, null);
        if (newCachedFieldOfGenericType instanceof ObjectField) {
            this.hasObjectFields = true;
        }
        newCachedFieldOfGenericType.field = field;
        newCachedFieldOfGenericType.varIntsEnabled = this.varIntsEnabled;
        if (this.config.isUseAsm()) {
            newCachedFieldOfGenericType.offset = this.unsafeUtil.getObjectFieldOffset(field);
        }
        newCachedFieldOfGenericType.access = (FieldAccess) this.access;
        newCachedFieldOfGenericType.accessIndex = i2;
        if (this.config.isFieldsCanBeNull() != 0) {
        }
        i = 0;
        newCachedFieldOfGenericType.canBeNull = i;
        newCachedFieldOfGenericType.valueClass = clsArr[0];
        return newCachedFieldOfGenericType;
    }

    CachedField newMatchingCachedField(Field field, int i, Class cls, Type type, Class[] clsArr) {
        if (i != -1) {
            return getAsmFieldFactory().createCachedField(cls, field, this);
        }
        if (this.config.isUseAsm() == 0) {
            return getUnsafeFieldFactory().createCachedField(cls, field, this);
        }
        field = getObjectFieldFactory().createCachedField(cls, field, this);
        if (this.config.isOptimizedGenerics() == 0) {
            return field;
        }
        if (clsArr != null) {
            ((ObjectField) field).generics = clsArr;
            return field;
        } else if (type == null) {
            return field;
        } else {
            i = FieldSerializerGenericsUtil.getGenerics(type, this.kryo);
            ((ObjectField) field).generics = i;
            if (Log.TRACE == null) {
                return field;
            }
            type = new StringBuilder();
            type.append("Field generics: ");
            type.append(Arrays.toString(i));
            Log.trace("kryo", type.toString());
            return field;
        }
    }

    private CachedFieldFactory getAsmFieldFactory() {
        if (asmFieldFactory == null) {
            asmFieldFactory = new AsmCachedFieldFactory();
        }
        return asmFieldFactory;
    }

    private CachedFieldFactory getObjectFieldFactory() {
        if (objectFieldFactory == null) {
            objectFieldFactory = new ObjectCachedFieldFactory();
        }
        return objectFieldFactory;
    }

    private CachedFieldFactory getUnsafeFieldFactory() {
        if (unsafeFieldFactory == null) {
            try {
                unsafeFieldFactory = (CachedFieldFactory) getClass().getClassLoader().loadClass("com.esotericsoftware.kryo.serializers.UnsafeCachedFieldFactory").newInstance();
            } catch (Throwable e) {
                throw new RuntimeException("Cannot create UnsafeFieldFactory", e);
            }
        }
        return unsafeFieldFactory;
    }

    public int compare(CachedField cachedField, CachedField cachedField2) {
        return getCachedFieldName(cachedField).compareTo(getCachedFieldName(cachedField2));
    }

    public void setFieldsCanBeNull(boolean z) {
        this.config.setFieldsCanBeNull(z);
        rebuildCachedFields();
    }

    public void setFieldsAsAccessible(boolean z) {
        this.config.setFieldsAsAccessible(z);
        rebuildCachedFields();
    }

    public void setIgnoreSyntheticFields(boolean z) {
        this.config.setIgnoreSyntheticFields(z);
        rebuildCachedFields();
    }

    public void setFixedFieldTypes(boolean z) {
        this.config.setFixedFieldTypes(z);
        rebuildCachedFields();
    }

    public void setUseAsm(boolean z) {
        this.config.setUseAsm(z);
        rebuildCachedFields();
    }

    public void setCopyTransient(boolean z) {
        this.config.setCopyTransient(z);
    }

    public void setSerializeTransient(boolean z) {
        this.config.setSerializeTransient(z);
    }

    public void setOptimizedGenerics(boolean z) {
        this.config.setOptimizedGenerics(z);
        rebuildCachedFields();
    }

    public void write(Kryo kryo, Output output, T t) {
        if (Log.TRACE) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("FieldSerializer.write fields of class: ");
            stringBuilder.append(t.getClass().getName());
            Log.trace("kryo", stringBuilder.toString());
        }
        if (this.config.isOptimizedGenerics()) {
            if (!(this.typeParameters == null || this.generics == null)) {
                rebuildCachedFields();
            }
            if (this.genericsScope != null) {
                kryo.getGenericsResolver().pushScope(this.type, this.genericsScope);
            }
        }
        for (CachedField write : this.fields) {
            write.write(output, t);
        }
        if (this.config.isSerializeTransient()) {
            for (CachedField write2 : this.transientFields) {
                write2.write(output, t);
            }
        }
        if (this.config.isOptimizedGenerics() != null && this.genericsScope != null) {
            kryo.getGenericsResolver().popScope();
        }
    }

    public T read(Kryo kryo, Input input, Class<T> cls) {
        try {
            if (this.config.isOptimizedGenerics()) {
                if (!(this.typeParameters == null || this.generics == null)) {
                    rebuildCachedFields();
                }
                if (this.genericsScope != null) {
                    kryo.getGenericsResolver().pushScope(cls, this.genericsScope);
                }
            }
            cls = create(kryo, input, cls);
            kryo.reference(cls);
            for (CachedField read : this.fields) {
                read.read(input, cls);
            }
            if (this.config.isSerializeTransient()) {
                for (CachedField read2 : this.transientFields) {
                    read2.read(input, cls);
                }
            }
            if (!(this.config.isOptimizedGenerics() == null || this.genericsScope == null || kryo.getGenericsResolver() == null)) {
                kryo.getGenericsResolver().popScope();
            }
            return cls;
        } catch (Throwable th) {
            if (!(this.config.isOptimizedGenerics() == null || this.genericsScope == null || kryo.getGenericsResolver() == null)) {
                kryo.getGenericsResolver().popScope();
            }
        }
    }

    protected T create(Kryo kryo, Input input, Class<T> cls) {
        return kryo.newInstance(cls);
    }

    public CachedField getField(String str) {
        for (CachedField cachedField : this.fields) {
            if (getCachedFieldName(cachedField).equals(str)) {
                return cachedField;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Field \"");
        stringBuilder.append(str);
        stringBuilder.append("\" not found on class: ");
        stringBuilder.append(this.type.getName());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    protected String getCachedFieldName(CachedField cachedField) {
        return this.config.getCachedFieldNameStrategy().getName(cachedField);
    }

    public void removeField(String str) {
        int i;
        for (i = 0; i < this.fields.length; i++) {
            CachedField cachedField = this.fields[i];
            if (getCachedFieldName(cachedField).equals(str)) {
                str = new CachedField[(this.fields.length - 1)];
                System.arraycopy(this.fields, 0, str, 0, i);
                System.arraycopy(this.fields, i + 1, str, i, str.length - i);
                this.fields = str;
                this.removedFields.add(cachedField);
                return;
            }
        }
        for (i = 0; i < this.transientFields.length; i++) {
            cachedField = this.transientFields[i];
            if (getCachedFieldName(cachedField).equals(str)) {
                str = new CachedField[(this.transientFields.length - 1)];
                System.arraycopy(this.transientFields, 0, str, 0, i);
                System.arraycopy(this.transientFields, i + 1, str, i, str.length - i);
                this.transientFields = str;
                this.removedFields.add(cachedField);
                return;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Field \"");
        stringBuilder.append(str);
        stringBuilder.append("\" not found on class: ");
        stringBuilder.append(this.type.getName());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public void removeField(CachedField cachedField) {
        int i;
        for (i = 0; i < this.fields.length; i++) {
            CachedField cachedField2 = this.fields[i];
            if (cachedField2 == cachedField) {
                cachedField = new CachedField[(this.fields.length - 1)];
                System.arraycopy(this.fields, 0, cachedField, 0, i);
                System.arraycopy(this.fields, i + 1, cachedField, i, cachedField.length - i);
                this.fields = cachedField;
                this.removedFields.add(cachedField2);
                return;
            }
        }
        for (i = 0; i < this.transientFields.length; i++) {
            cachedField2 = this.transientFields[i];
            if (cachedField2 == cachedField) {
                cachedField = new CachedField[(this.transientFields.length - 1)];
                System.arraycopy(this.transientFields, 0, cachedField, 0, i);
                System.arraycopy(this.transientFields, i + 1, cachedField, i, cachedField.length - i);
                this.transientFields = cachedField;
                this.removedFields.add(cachedField2);
                return;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Field \"");
        stringBuilder.append(cachedField);
        stringBuilder.append("\" not found on class: ");
        stringBuilder.append(this.type.getName());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public CachedField[] getFields() {
        return this.fields;
    }

    public CachedField[] getTransientFields() {
        return this.transientFields;
    }

    public Class getType() {
        return this.type;
    }

    public Kryo getKryo() {
        return this.kryo;
    }

    public boolean getUseAsmEnabled() {
        return this.config.isUseAsm();
    }

    public boolean getUseMemRegions() {
        return this.useMemRegions;
    }

    public boolean getCopyTransient() {
        return this.config.isCopyTransient();
    }

    public boolean getSerializeTransient() {
        return this.config.isSerializeTransient();
    }

    protected T createCopy(Kryo kryo, T t) {
        return kryo.newInstance(t.getClass());
    }

    public T copy(Kryo kryo, T t) {
        T createCopy = createCopy(kryo, t);
        kryo.reference(createCopy);
        if (this.config.isCopyTransient() != null) {
            for (CachedField copy : this.transientFields) {
                copy.copy(t, createCopy);
            }
        }
        for (CachedField copy2 : this.fields) {
            copy2.copy(t, createCopy);
        }
        return createCopy;
    }

    final Generics getGenericsScope() {
        return this.genericsScope;
    }
}
