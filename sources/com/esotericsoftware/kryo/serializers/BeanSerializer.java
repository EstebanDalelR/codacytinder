package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.minlog.Log;
import com.esotericsoftware.reflectasm.MethodAccess;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Comparator;

public class BeanSerializer<T> extends Serializer<T> {
    static final Object[] noArgs = new Object[0];
    Object access;
    private CachedProperty[] properties;

    /* renamed from: com.esotericsoftware.kryo.serializers.BeanSerializer$1 */
    class C11191 implements Comparator<PropertyDescriptor> {
        C11191() {
        }

        public int compare(PropertyDescriptor propertyDescriptor, PropertyDescriptor propertyDescriptor2) {
            return propertyDescriptor.getName().compareTo(propertyDescriptor2.getName());
        }
    }

    class CachedProperty<X> {
        Method getMethod;
        int getterAccessIndex;
        String name;
        Serializer serializer;
        Method setMethod;
        Class setMethodType;
        int setterAccessIndex;

        CachedProperty() {
        }

        public String toString() {
            return this.name;
        }

        Object get(Object obj) throws IllegalAccessException, InvocationTargetException {
            if (BeanSerializer.this.access != null) {
                return ((MethodAccess) BeanSerializer.this.access).invoke(obj, this.getterAccessIndex, new Object[0]);
            }
            return this.getMethod.invoke(obj, BeanSerializer.noArgs);
        }

        void set(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
            if (BeanSerializer.this.access != null) {
                ((MethodAccess) BeanSerializer.this.access).invoke(obj, this.setterAccessIndex, obj2);
                return;
            }
            this.setMethod.invoke(obj, new Object[]{obj2});
        }
    }

    public BeanSerializer(com.esotericsoftware.kryo.Kryo r12, java.lang.Class r13) {
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
        r11 = this;
        r11.<init>();
        r0 = java.beans.Introspector.getBeanInfo(r13);	 Catch:{ IntrospectionException -> 0x00b5 }
        r0 = r0.getPropertyDescriptors();
        r1 = new com.esotericsoftware.kryo.serializers.BeanSerializer$1;
        r1.<init>();
        java.util.Arrays.sort(r0, r1);
        r1 = new java.util.ArrayList;
        r2 = r0.length;
        r1.<init>(r2);
        r2 = r0.length;
        r3 = 0;
        r4 = 0;
    L_0x001c:
        if (r4 >= r2) goto L_0x0068;
    L_0x001e:
        r5 = r0[r4];
        r6 = r5.getName();
        r7 = "class";
        r7 = r6.equals(r7);
        if (r7 == 0) goto L_0x002d;
    L_0x002c:
        goto L_0x0065;
    L_0x002d:
        r7 = r5.getReadMethod();
        r5 = r5.getWriteMethod();
        if (r7 == 0) goto L_0x0065;
    L_0x0037:
        if (r5 != 0) goto L_0x003a;
    L_0x0039:
        goto L_0x0065;
    L_0x003a:
        r8 = 0;
        r9 = r7.getReturnType();
        r10 = r12.isFinal(r9);
        if (r10 == 0) goto L_0x004d;
    L_0x0045:
        r8 = r12.getRegistration(r9);
        r8 = r8.getSerializer();
    L_0x004d:
        r9 = new com.esotericsoftware.kryo.serializers.BeanSerializer$CachedProperty;
        r9.<init>();
        r9.name = r6;
        r9.getMethod = r7;
        r9.setMethod = r5;
        r9.serializer = r8;
        r5 = r5.getParameterTypes();
        r5 = r5[r3];
        r9.setMethodType = r5;
        r1.add(r9);
    L_0x0065:
        r4 = r4 + 1;
        goto L_0x001c;
    L_0x0068:
        r12 = r1.size();
        r12 = new com.esotericsoftware.kryo.serializers.BeanSerializer.CachedProperty[r12];
        r12 = r1.toArray(r12);
        r12 = (com.esotericsoftware.kryo.serializers.BeanSerializer.CachedProperty[]) r12;
        r11.properties = r12;
        r12 = com.esotericsoftware.reflectasm.MethodAccess.get(r13);	 Catch:{ Throwable -> 0x00b4 }
        r11.access = r12;	 Catch:{ Throwable -> 0x00b4 }
        r12 = r11.properties;	 Catch:{ Throwable -> 0x00b4 }
        r12 = r12.length;	 Catch:{ Throwable -> 0x00b4 }
    L_0x007f:
        if (r3 >= r12) goto L_0x00b4;	 Catch:{ Throwable -> 0x00b4 }
    L_0x0081:
        r13 = r11.properties;	 Catch:{ Throwable -> 0x00b4 }
        r13 = r13[r3];	 Catch:{ Throwable -> 0x00b4 }
        r0 = r11.access;	 Catch:{ Throwable -> 0x00b4 }
        r0 = (com.esotericsoftware.reflectasm.MethodAccess) r0;	 Catch:{ Throwable -> 0x00b4 }
        r1 = r13.getMethod;	 Catch:{ Throwable -> 0x00b4 }
        r1 = r1.getName();	 Catch:{ Throwable -> 0x00b4 }
        r2 = r13.getMethod;	 Catch:{ Throwable -> 0x00b4 }
        r2 = r2.getParameterTypes();	 Catch:{ Throwable -> 0x00b4 }
        r0 = r0.getIndex(r1, r2);	 Catch:{ Throwable -> 0x00b4 }
        r13.getterAccessIndex = r0;	 Catch:{ Throwable -> 0x00b4 }
        r0 = r11.access;	 Catch:{ Throwable -> 0x00b4 }
        r0 = (com.esotericsoftware.reflectasm.MethodAccess) r0;	 Catch:{ Throwable -> 0x00b4 }
        r1 = r13.setMethod;	 Catch:{ Throwable -> 0x00b4 }
        r1 = r1.getName();	 Catch:{ Throwable -> 0x00b4 }
        r2 = r13.setMethod;	 Catch:{ Throwable -> 0x00b4 }
        r2 = r2.getParameterTypes();	 Catch:{ Throwable -> 0x00b4 }
        r0 = r0.getIndex(r1, r2);	 Catch:{ Throwable -> 0x00b4 }
        r13.setterAccessIndex = r0;	 Catch:{ Throwable -> 0x00b4 }
        r3 = r3 + 1;
        goto L_0x007f;
    L_0x00b4:
        return;
    L_0x00b5:
        r12 = move-exception;
        r13 = new com.esotericsoftware.kryo.KryoException;
        r0 = "Error getting bean info.";
        r13.<init>(r0, r12);
        throw r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.serializers.BeanSerializer.<init>(com.esotericsoftware.kryo.Kryo, java.lang.Class):void");
    }

    public void write(Kryo kryo, Output output, T t) {
        Class cls = t.getClass();
        int length = this.properties.length;
        int i = 0;
        while (i < length) {
            CachedProperty cachedProperty = this.properties[i];
            try {
                if (Log.TRACE) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Write property: ");
                    stringBuilder.append(cachedProperty);
                    stringBuilder.append(" (");
                    stringBuilder.append(cls.getName());
                    stringBuilder.append(")");
                    Log.trace("kryo", stringBuilder.toString());
                }
                Object obj = cachedProperty.get(t);
                Serializer serializer = cachedProperty.serializer;
                if (serializer != null) {
                    kryo.writeObjectOrNull(output, obj, serializer);
                } else {
                    kryo.writeClassAndObject(output, obj);
                }
                i++;
            } catch (Kryo kryo2) {
                t = new StringBuilder();
                t.append("Error accessing getter method: ");
                t.append(cachedProperty);
                t.append(" (");
                t.append(cls.getName());
                t.append(")");
                throw new KryoException(t.toString(), kryo2);
            } catch (Kryo kryo22) {
                t = new StringBuilder();
                t.append("Error invoking getter method: ");
                t.append(cachedProperty);
                t.append(" (");
                t.append(cls.getName());
                t.append(")");
                throw new KryoException(t.toString(), kryo22);
            } catch (Kryo kryo222) {
                output = new StringBuilder();
                output.append(cachedProperty);
                output.append(" (");
                output.append(cls.getName());
                output.append(")");
                kryo222.addTrace(output.toString());
                throw kryo222;
            } catch (Throwable e) {
                output = new KryoException(e);
                kryo222 = new StringBuilder();
                kryo222.append(cachedProperty);
                kryo222.append(" (");
                kryo222.append(cls.getName());
                kryo222.append(")");
                output.addTrace(kryo222.toString());
                throw output;
            }
        }
    }

    public T read(Kryo kryo, Input input, Class<T> cls) {
        StringBuilder stringBuilder;
        cls = kryo.newInstance(cls);
        kryo.reference(cls);
        int length = this.properties.length;
        int i = 0;
        while (i < length) {
            CachedProperty cachedProperty = this.properties[i];
            try {
                Object readObjectOrNull;
                if (Log.TRACE) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Read property: ");
                    stringBuilder2.append(cachedProperty);
                    stringBuilder2.append(" (");
                    stringBuilder2.append(cls.getClass());
                    stringBuilder2.append(")");
                    Log.trace("kryo", stringBuilder2.toString());
                }
                Serializer serializer = cachedProperty.serializer;
                if (serializer != null) {
                    readObjectOrNull = kryo.readObjectOrNull(input, cachedProperty.setMethodType, serializer);
                } else {
                    readObjectOrNull = kryo.readClassAndObject(input);
                }
                cachedProperty.set(cls, readObjectOrNull);
                i++;
            } catch (Kryo kryo2) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Error accessing setter method: ");
                stringBuilder.append(cachedProperty);
                stringBuilder.append(" (");
                stringBuilder.append(cls.getClass().getName());
                stringBuilder.append(")");
                throw new KryoException(stringBuilder.toString(), kryo2);
            } catch (Kryo kryo22) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Error invoking setter method: ");
                stringBuilder.append(cachedProperty);
                stringBuilder.append(" (");
                stringBuilder.append(cls.getClass().getName());
                stringBuilder.append(")");
                throw new KryoException(stringBuilder.toString(), kryo22);
            } catch (Kryo kryo222) {
                input = new StringBuilder();
                input.append(cachedProperty);
                input.append(" (");
                input.append(cls.getClass().getName());
                input.append(")");
                kryo222.addTrace(input.toString());
                throw kryo222;
            } catch (Throwable e) {
                input = new KryoException(e);
                kryo222 = new StringBuilder();
                kryo222.append(cachedProperty);
                kryo222.append(" (");
                kryo222.append(cls.getClass().getName());
                kryo222.append(")");
                input.addTrace(kryo222.toString());
                throw input;
            }
        }
        return cls;
    }

    public T copy(Kryo kryo, T t) {
        kryo = kryo.newInstance(t.getClass());
        int length = this.properties.length;
        int i = 0;
        while (i < length) {
            CachedProperty cachedProperty = this.properties[i];
            try {
                cachedProperty.set(kryo, cachedProperty.get(t));
                i++;
            } catch (T t2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(cachedProperty);
                stringBuilder.append(" (");
                stringBuilder.append(kryo.getClass().getName());
                stringBuilder.append(")");
                t2.addTrace(stringBuilder.toString());
                throw t2;
            } catch (Throwable e) {
                KryoException kryoException = new KryoException(e);
                t2 = new StringBuilder();
                t2.append(cachedProperty);
                t2.append(" (");
                t2.append(kryo.getClass().getName());
                t2.append(")");
                kryoException.addTrace(t2.toString());
                throw kryoException;
            } catch (T t22) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Error copying bean property: ");
                stringBuilder2.append(cachedProperty);
                stringBuilder2.append(" (");
                stringBuilder2.append(kryo.getClass().getName());
                stringBuilder2.append(")");
                throw new KryoException(stringBuilder2.toString(), t22);
            }
        }
        return kryo;
    }
}
