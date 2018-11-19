package com.esotericsoftware.kryo.util;

import com.esotericsoftware.kryo.ClassResolver;
import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.Registration;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.minlog.Log;

public class DefaultClassResolver implements ClassResolver {
    public static final byte NAME = (byte) -1;
    protected IdentityObjectIntMap<Class> classToNameId;
    protected final ObjectMap<Class, Registration> classToRegistration = new ObjectMap();
    protected final IntMap<Registration> idToRegistration = new IntMap();
    protected Kryo kryo;
    private Class memoizedClass;
    private int memoizedClassId = -1;
    private Registration memoizedClassIdValue;
    private Registration memoizedClassValue;
    protected IntMap<Class> nameIdToClass;
    protected ObjectMap<String, Class> nameToClass;
    protected int nextNameId;

    public void setKryo(Kryo kryo) {
        this.kryo = kryo;
    }

    public Registration register(Registration registration) {
        if (registration == null) {
            throw new IllegalArgumentException("registration cannot be null.");
        }
        StringBuilder stringBuilder;
        if (registration.getId() != -1) {
            if (Log.TRACE) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Register class ID ");
                stringBuilder.append(registration.getId());
                stringBuilder.append(": ");
                stringBuilder.append(Util.className(registration.getType()));
                stringBuilder.append(" (");
                stringBuilder.append(registration.getSerializer().getClass().getName());
                stringBuilder.append(")");
                Log.trace("kryo", stringBuilder.toString());
            }
            this.idToRegistration.put(registration.getId(), registration);
        } else if (Log.TRACE) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Register class name: ");
            stringBuilder.append(Util.className(registration.getType()));
            stringBuilder.append(" (");
            stringBuilder.append(registration.getSerializer().getClass().getName());
            stringBuilder.append(")");
            Log.trace("kryo", stringBuilder.toString());
        }
        this.classToRegistration.put(registration.getType(), registration);
        if (registration.getType().isPrimitive()) {
            this.classToRegistration.put(Util.getWrapperClass(registration.getType()), registration);
        }
        return registration;
    }

    public Registration registerImplicit(Class cls) {
        return register(new Registration(cls, this.kryo.getDefaultSerializer(cls), -1));
    }

    public Registration getRegistration(Class cls) {
        if (cls == this.memoizedClass) {
            return this.memoizedClassValue;
        }
        Registration registration = (Registration) this.classToRegistration.get(cls);
        if (registration != null) {
            this.memoizedClass = cls;
            this.memoizedClassValue = registration;
        }
        return registration;
    }

    public Registration getRegistration(int i) {
        return (Registration) this.idToRegistration.get(i);
    }

    public Registration writeClass(Output output, Class cls) {
        if (cls == null) {
            if (Log.TRACE != null || (Log.DEBUG != null && this.kryo.getDepth() == 1)) {
                Util.log("Write", null);
            }
            output.writeVarInt(null, true);
            return null;
        }
        Registration registration = this.kryo.getRegistration(cls);
        if (registration.getId() == -1) {
            writeName(output, cls, registration);
        } else {
            if (Log.TRACE) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Write class ");
                stringBuilder.append(registration.getId());
                stringBuilder.append(": ");
                stringBuilder.append(Util.className(cls));
                Log.trace("kryo", stringBuilder.toString());
            }
            output.writeVarInt(registration.getId() + 2, true);
        }
        return registration;
    }

    protected void writeName(Output output, Class cls, Registration registration) {
        int i;
        output.writeVarInt(1, true);
        if (this.classToNameId != null) {
            i = this.classToNameId.get(cls, -1);
            if (i != -1) {
                if (Log.TRACE) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Write class name reference ");
                    stringBuilder.append(i);
                    stringBuilder.append(": ");
                    stringBuilder.append(Util.className(cls));
                    Log.trace("kryo", stringBuilder.toString());
                }
                output.writeVarInt(i, true);
                return;
            }
        }
        if (Log.TRACE) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Write class name: ");
            stringBuilder2.append(Util.className(cls));
            Log.trace("kryo", stringBuilder2.toString());
        }
        i = this.nextNameId;
        this.nextNameId = i + 1;
        if (this.classToNameId == null) {
            this.classToNameId = new IdentityObjectIntMap();
        }
        this.classToNameId.put(cls, i);
        output.writeVarInt(i, true);
        output.writeString(cls.getName());
    }

    public Registration readClass(Input input) {
        int readVarInt = input.readVarInt(true);
        switch (readVarInt) {
            case 0:
                if (Log.TRACE != null || (Log.DEBUG != null && this.kryo.getDepth() == 1)) {
                    Util.log("Read", null);
                }
                return null;
            case 1:
                return readName(input);
            default:
                if (readVarInt == this.memoizedClassId) {
                    return this.memoizedClassIdValue;
                }
                int i = readVarInt - 2;
                Registration registration = (Registration) this.idToRegistration.get(i);
                if (registration == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Encountered unregistered class ID: ");
                    stringBuilder.append(i);
                    throw new KryoException(stringBuilder.toString());
                }
                if (Log.TRACE) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Read class ");
                    stringBuilder2.append(i);
                    stringBuilder2.append(": ");
                    stringBuilder2.append(Util.className(registration.getType()));
                    Log.trace("kryo", stringBuilder2.toString());
                }
                this.memoizedClassId = readVarInt;
                this.memoizedClassIdValue = registration;
                return registration;
        }
    }

    protected com.esotericsoftware.kryo.Registration readName(com.esotericsoftware.kryo.io.Input r6) {
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
        r5 = this;
        r0 = 1;
        r0 = r6.readVarInt(r0);
        r1 = r5.nameIdToClass;
        if (r1 != 0) goto L_0x0010;
    L_0x0009:
        r1 = new com.esotericsoftware.kryo.util.IntMap;
        r1.<init>();
        r5.nameIdToClass = r1;
    L_0x0010:
        r1 = r5.nameIdToClass;
        r1 = r1.get(r0);
        r1 = (java.lang.Class) r1;
        if (r1 != 0) goto L_0x009d;
    L_0x001a:
        r6 = r6.readString();
        r1 = r5.getTypeByName(r6);
        if (r1 != 0) goto L_0x007d;
    L_0x0024:
        r1 = 0;
        r2 = r5.kryo;	 Catch:{ ClassNotFoundException -> 0x0030 }
        r2 = r2.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x0030 }
        r1 = java.lang.Class.forName(r6, r1, r2);	 Catch:{ ClassNotFoundException -> 0x0030 }
        goto L_0x0055;
    L_0x0030:
        r1 = move-exception;
        r2 = com.esotericsoftware.minlog.Log.WARN;
        if (r2 == 0) goto L_0x0050;
    L_0x0035:
        r2 = "kryo";
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "Unable to load class ";
        r3.append(r4);
        r3.append(r6);
        r4 = " with kryo's ClassLoader. Retrying with current..";
        r3.append(r4);
        r3 = r3.toString();
        com.esotericsoftware.minlog.Log.warn(r2, r3);
    L_0x0050:
        r2 = java.lang.Class.forName(r6);	 Catch:{ ClassNotFoundException -> 0x0066 }
        r1 = r2;
    L_0x0055:
        r2 = r5.nameToClass;
        if (r2 != 0) goto L_0x0060;
    L_0x0059:
        r2 = new com.esotericsoftware.kryo.util.ObjectMap;
        r2.<init>();
        r5.nameToClass = r2;
    L_0x0060:
        r2 = r5.nameToClass;
        r2.put(r6, r1);
        goto L_0x007d;
    L_0x0066:
        r0 = new com.esotericsoftware.kryo.KryoException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Unable to find class: ";
        r2.append(r3);
        r2.append(r6);
        r6 = r2.toString();
        r0.<init>(r6, r1);
        throw r0;
    L_0x007d:
        r2 = r5.nameIdToClass;
        r2.put(r0, r1);
        r0 = com.esotericsoftware.minlog.Log.TRACE;
        if (r0 == 0) goto L_0x00c3;
    L_0x0086:
        r0 = "kryo";
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Read class name: ";
        r2.append(r3);
        r2.append(r6);
        r6 = r2.toString();
        com.esotericsoftware.minlog.Log.trace(r0, r6);
        goto L_0x00c3;
    L_0x009d:
        r6 = com.esotericsoftware.minlog.Log.TRACE;
        if (r6 == 0) goto L_0x00c3;
    L_0x00a1:
        r6 = "kryo";
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Read class name reference ";
        r2.append(r3);
        r2.append(r0);
        r0 = ": ";
        r2.append(r0);
        r0 = com.esotericsoftware.kryo.util.Util.className(r1);
        r2.append(r0);
        r0 = r2.toString();
        com.esotericsoftware.minlog.Log.trace(r6, r0);
    L_0x00c3:
        r6 = r5.kryo;
        r6 = r6.getRegistration(r1);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.util.DefaultClassResolver.readName(com.esotericsoftware.kryo.io.Input):com.esotericsoftware.kryo.Registration");
    }

    protected Class<?> getTypeByName(String str) {
        return this.nameToClass != null ? (Class) this.nameToClass.get(str) : null;
    }

    public void reset() {
        if (!this.kryo.isRegistrationRequired()) {
            if (this.classToNameId != null) {
                this.classToNameId.clear();
            }
            if (this.nameIdToClass != null) {
                this.nameIdToClass.clear();
            }
            this.nextNameId = 0;
        }
    }
}
