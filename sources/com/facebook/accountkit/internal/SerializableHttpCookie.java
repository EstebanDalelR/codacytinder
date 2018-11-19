package com.facebook.accountkit.internal;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.net.HttpCookie;

final class SerializableHttpCookie implements Serializable {
    private static final long serialVersionUID = 2064381394822046912L;
    /* renamed from: a */
    private transient HttpCookie f3254a;
    /* renamed from: b */
    private Field f3255b;

    /* renamed from: a */
    public java.lang.String m4245a(java.net.HttpCookie r2) {
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
        r1.f3254a = r2;
        r2 = new java.io.ByteArrayOutputStream;
        r2.<init>();
        r0 = new java.io.ObjectOutputStream;	 Catch:{ IOException -> 0x0018 }
        r0.<init>(r2);	 Catch:{ IOException -> 0x0018 }
        r0.writeObject(r1);	 Catch:{ IOException -> 0x0018 }
        r2 = r2.toByteArray();
        r2 = r1.m4240a(r2);
        return r2;
    L_0x0018:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.SerializableHttpCookie.a(java.net.HttpCookie):java.lang.String");
    }

    /* renamed from: a */
    public java.net.HttpCookie m4246a(java.lang.String r2) {
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
        r2 = r1.m4244b(r2);
        r0 = new java.io.ByteArrayInputStream;
        r0.<init>(r2);
        r2 = new java.io.ObjectInputStream;	 Catch:{ IOException -> 0x0017, IOException -> 0x0017 }
        r2.<init>(r0);	 Catch:{ IOException -> 0x0017, IOException -> 0x0017 }
        r2 = r2.readObject();	 Catch:{ IOException -> 0x0017, IOException -> 0x0017 }
        r2 = (com.facebook.accountkit.internal.SerializableHttpCookie) r2;	 Catch:{ IOException -> 0x0017, IOException -> 0x0017 }
        r2 = r2.f3254a;	 Catch:{ IOException -> 0x0017, IOException -> 0x0017 }
        goto L_0x0018;
    L_0x0017:
        r2 = 0;
    L_0x0018:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.SerializableHttpCookie.a(java.lang.String):java.net.HttpCookie");
    }

    /* renamed from: a */
    private boolean m4242a() {
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
        r2 = this;
        r2.m4243b();	 Catch:{ NoSuchFieldException -> 0x0012, NoSuchFieldException -> 0x0012, NoSuchFieldException -> 0x0012 }
        r0 = r2.f3255b;	 Catch:{ NoSuchFieldException -> 0x0012, NoSuchFieldException -> 0x0012, NoSuchFieldException -> 0x0012 }
        r1 = r2.f3254a;	 Catch:{ NoSuchFieldException -> 0x0012, NoSuchFieldException -> 0x0012, NoSuchFieldException -> 0x0012 }
        r0 = r0.get(r1);	 Catch:{ NoSuchFieldException -> 0x0012, NoSuchFieldException -> 0x0012, NoSuchFieldException -> 0x0012 }
        r0 = (java.lang.Boolean) r0;	 Catch:{ NoSuchFieldException -> 0x0012, NoSuchFieldException -> 0x0012, NoSuchFieldException -> 0x0012 }
        r0 = r0.booleanValue();	 Catch:{ NoSuchFieldException -> 0x0012, NoSuchFieldException -> 0x0012, NoSuchFieldException -> 0x0012 }
        return r0;
    L_0x0012:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.SerializableHttpCookie.a():boolean");
    }

    /* renamed from: a */
    private void m4241a(boolean r3) {
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
        r2 = this;
        r2.m4243b();	 Catch:{ NoSuchFieldException -> 0x000e, NoSuchFieldException -> 0x000e, NoSuchFieldException -> 0x000e }
        r0 = r2.f3255b;	 Catch:{ NoSuchFieldException -> 0x000e, NoSuchFieldException -> 0x000e, NoSuchFieldException -> 0x000e }
        r1 = r2.f3254a;	 Catch:{ NoSuchFieldException -> 0x000e, NoSuchFieldException -> 0x000e, NoSuchFieldException -> 0x000e }
        r3 = java.lang.Boolean.valueOf(r3);	 Catch:{ NoSuchFieldException -> 0x000e, NoSuchFieldException -> 0x000e, NoSuchFieldException -> 0x000e }
        r0.set(r1, r3);	 Catch:{ NoSuchFieldException -> 0x000e, NoSuchFieldException -> 0x000e, NoSuchFieldException -> 0x000e }
    L_0x000e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.SerializableHttpCookie.a(boolean):void");
    }

    /* renamed from: b */
    private void m4243b() throws NoSuchFieldException {
        this.f3255b = this.f3254a.getClass().getDeclaredField("httpOnly");
        this.f3255b.setAccessible(true);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.f3254a.getName());
        objectOutputStream.writeObject(this.f3254a.getValue());
        objectOutputStream.writeObject(this.f3254a.getComment());
        objectOutputStream.writeObject(this.f3254a.getCommentURL());
        objectOutputStream.writeObject(this.f3254a.getDomain());
        objectOutputStream.writeLong(this.f3254a.getMaxAge());
        objectOutputStream.writeObject(this.f3254a.getPath());
        objectOutputStream.writeObject(this.f3254a.getPortlist());
        objectOutputStream.writeInt(this.f3254a.getVersion());
        objectOutputStream.writeBoolean(this.f3254a.getSecure());
        objectOutputStream.writeBoolean(this.f3254a.getDiscard());
        objectOutputStream.writeBoolean(m4242a());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.f3254a = new HttpCookie((String) objectInputStream.readObject(), (String) objectInputStream.readObject());
        this.f3254a.setComment((String) objectInputStream.readObject());
        this.f3254a.setCommentURL((String) objectInputStream.readObject());
        this.f3254a.setDomain((String) objectInputStream.readObject());
        this.f3254a.setMaxAge(objectInputStream.readLong());
        this.f3254a.setPath((String) objectInputStream.readObject());
        this.f3254a.setPortlist((String) objectInputStream.readObject());
        this.f3254a.setVersion(objectInputStream.readInt());
        this.f3254a.setSecure(objectInputStream.readBoolean());
        this.f3254a.setDiscard(objectInputStream.readBoolean());
        m4241a(objectInputStream.readBoolean());
    }

    /* renamed from: a */
    private String m4240a(byte[] bArr) {
        StringBuilder stringBuilder = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            if (i < 16) {
                stringBuilder.append('0');
            }
            stringBuilder.append(Integer.toHexString(i));
        }
        return stringBuilder.toString();
    }

    /* renamed from: b */
    private byte[] m4244b(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }
}
