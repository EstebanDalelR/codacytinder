package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.KryoObjectInput;
import com.esotericsoftware.kryo.io.KryoObjectOutput;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.util.ObjectMap;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExternalizableSerializer extends Serializer {
    private ObjectMap<Class, JavaSerializer> javaSerializerByType;
    private KryoObjectInput objectInput = null;
    private KryoObjectOutput objectOutput = null;

    public void write(Kryo kryo, Output output, Object obj) {
        JavaSerializer javaSerializerIfRequired = getJavaSerializerIfRequired(obj.getClass());
        if (javaSerializerIfRequired == null) {
            writeExternal(kryo, output, obj);
        } else {
            javaSerializerIfRequired.write(kryo, output, obj);
        }
    }

    public Object read(Kryo kryo, Input input, Class cls) {
        JavaSerializer javaSerializerIfRequired = getJavaSerializerIfRequired(cls);
        if (javaSerializerIfRequired == null) {
            return readExternal(kryo, input, cls);
        }
        return javaSerializerIfRequired.read(kryo, input, cls);
    }

    private void writeExternal(Kryo kryo, Output output, Object obj) {
        try {
            ((Externalizable) obj).writeExternal(getObjectOutput(kryo, output));
        } catch (Throwable e) {
            throw new KryoException(e);
        } catch (Throwable e2) {
            throw new KryoException(e2);
        }
    }

    private Object readExternal(Kryo kryo, Input input, Class cls) {
        try {
            Externalizable externalizable = (Externalizable) kryo.newInstance(cls);
            externalizable.readExternal(getObjectInput(kryo, input));
            return externalizable;
        } catch (Throwable e) {
            throw new KryoException(e);
        } catch (Throwable e2) {
            throw new KryoException(e2);
        } catch (Throwable e22) {
            throw new KryoException(e22);
        }
    }

    private ObjectOutput getObjectOutput(Kryo kryo, Output output) {
        if (this.objectOutput == null) {
            this.objectOutput = new KryoObjectOutput(kryo, output);
        } else {
            this.objectOutput.setOutput(output);
        }
        return this.objectOutput;
    }

    private ObjectInput getObjectInput(Kryo kryo, Input input) {
        if (this.objectInput == null) {
            this.objectInput = new KryoObjectInput(kryo, input);
        } else {
            this.objectInput.setInput(input);
        }
        return this.objectInput;
    }

    private JavaSerializer getJavaSerializerIfRequired(Class cls) {
        JavaSerializer cachedSerializer = getCachedSerializer(cls);
        return (cachedSerializer != null || isJavaSerializerRequired(cls) == null) ? cachedSerializer : new JavaSerializer();
    }

    private JavaSerializer getCachedSerializer(Class cls) {
        if (this.javaSerializerByType != null) {
            return (JavaSerializer) this.javaSerializerByType.get(cls);
        }
        this.javaSerializerByType = new ObjectMap();
        return null;
    }

    private boolean isJavaSerializerRequired(Class cls) {
        if (!hasInheritableReplaceMethod(cls, "writeReplace")) {
            if (hasInheritableReplaceMethod(cls, "readResolve") == null) {
                return null;
            }
        }
        return true;
    }

    private static boolean hasInheritableReplaceMethod(java.lang.Class r2, java.lang.String r3) {
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
    L_0x0000:
        r0 = 0;
        if (r2 == 0) goto L_0x000f;
    L_0x0003:
        r1 = new java.lang.Class[r0];	 Catch:{ NoSuchMethodException -> 0x000a }
        r1 = r2.getDeclaredMethod(r3, r1);	 Catch:{ NoSuchMethodException -> 0x000a }
        goto L_0x0010;
    L_0x000a:
        r2 = r2.getSuperclass();
        goto L_0x0000;
    L_0x000f:
        r1 = 0;
    L_0x0010:
        if (r1 == 0) goto L_0x001b;
    L_0x0012:
        r2 = r1.getReturnType();
        r3 = java.lang.Object.class;
        if (r2 != r3) goto L_0x001b;
    L_0x001a:
        r0 = 1;
    L_0x001b:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.serializers.ExternalizableSerializer.hasInheritableReplaceMethod(java.lang.Class, java.lang.String):boolean");
    }
}
