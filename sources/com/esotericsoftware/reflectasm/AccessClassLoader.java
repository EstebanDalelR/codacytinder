package com.esotericsoftware.reflectasm;

import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

class AccessClassLoader extends ClassLoader {
    private static final WeakHashMap<ClassLoader, WeakReference<AccessClassLoader>> accessClassLoaders = new WeakHashMap();
    private static volatile Method defineClassMethod;
    private static volatile AccessClassLoader selfContextAccessClassLoader = new AccessClassLoader(selfContextParentClassLoader);
    private static final ClassLoader selfContextParentClassLoader = getParentClassLoader(AccessClassLoader.class);

    static AccessClassLoader get(Class cls) {
        cls = getParentClassLoader(cls);
        if (selfContextParentClassLoader.equals(cls)) {
            if (selfContextAccessClassLoader == null) {
                synchronized (accessClassLoaders) {
                    if (selfContextAccessClassLoader == null) {
                        selfContextAccessClassLoader = new AccessClassLoader(selfContextParentClassLoader);
                    }
                }
            }
            return selfContextAccessClassLoader;
        }
        synchronized (accessClassLoaders) {
            AccessClassLoader accessClassLoader;
            WeakReference weakReference = (WeakReference) accessClassLoaders.get(cls);
            if (weakReference != null) {
                accessClassLoader = (AccessClassLoader) weakReference.get();
                if (accessClassLoader != null) {
                    return accessClassLoader;
                }
                accessClassLoaders.remove(cls);
            }
            accessClassLoader = new AccessClassLoader(cls);
            accessClassLoaders.put(cls, new WeakReference(accessClassLoader));
            return accessClassLoader;
        }
    }

    public static void remove(ClassLoader classLoader) {
        if (selfContextParentClassLoader.equals(classLoader)) {
            selfContextAccessClassLoader = null;
            return;
        }
        synchronized (accessClassLoaders) {
            accessClassLoaders.remove(classLoader);
        }
    }

    public static int activeAccessClassLoaders() {
        int size = accessClassLoaders.size();
        return selfContextAccessClassLoader != null ? size + 1 : size;
    }

    private AccessClassLoader(ClassLoader classLoader) {
        super(classLoader);
    }

    protected Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
        if (str.equals(FieldAccess.class.getName())) {
            return FieldAccess.class;
        }
        if (str.equals(MethodAccess.class.getName())) {
            return MethodAccess.class;
        }
        if (str.equals(ConstructorAccess.class.getName())) {
            return ConstructorAccess.class;
        }
        if (str.equals(PublicConstructorAccess.class.getName())) {
            return PublicConstructorAccess.class;
        }
        return super.loadClass(str, z);
    }

    java.lang.Class<?> defineClass(java.lang.String r8, byte[] r9) throws java.lang.ClassFormatError {
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
        r7 = this;
        r0 = getDefineClassMethod();	 Catch:{ Exception -> 0x0032 }
        r1 = r7.getParent();	 Catch:{ Exception -> 0x0032 }
        r2 = 5;	 Catch:{ Exception -> 0x0032 }
        r2 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x0032 }
        r3 = 0;	 Catch:{ Exception -> 0x0032 }
        r2[r3] = r8;	 Catch:{ Exception -> 0x0032 }
        r4 = 1;	 Catch:{ Exception -> 0x0032 }
        r2[r4] = r9;	 Catch:{ Exception -> 0x0032 }
        r4 = 2;	 Catch:{ Exception -> 0x0032 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ Exception -> 0x0032 }
        r2[r4] = r3;	 Catch:{ Exception -> 0x0032 }
        r3 = 3;	 Catch:{ Exception -> 0x0032 }
        r4 = r9.length;	 Catch:{ Exception -> 0x0032 }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ Exception -> 0x0032 }
        r2[r3] = r4;	 Catch:{ Exception -> 0x0032 }
        r3 = 4;	 Catch:{ Exception -> 0x0032 }
        r4 = r7.getClass();	 Catch:{ Exception -> 0x0032 }
        r4 = r4.getProtectionDomain();	 Catch:{ Exception -> 0x0032 }
        r2[r3] = r4;	 Catch:{ Exception -> 0x0032 }
        r0 = r0.invoke(r1, r2);	 Catch:{ Exception -> 0x0032 }
        r0 = (java.lang.Class) r0;	 Catch:{ Exception -> 0x0032 }
        return r0;
    L_0x0032:
        r4 = 0;
        r5 = r9.length;
        r0 = r7.getClass();
        r6 = r0.getProtectionDomain();
        r1 = r7;
        r2 = r8;
        r3 = r9;
        r8 = r1.defineClass(r2, r3, r4, r5, r6);
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.reflectasm.AccessClassLoader.defineClass(java.lang.String, byte[]):java.lang.Class<?>");
    }

    static boolean areInSameRuntimeClassLoader(Class cls, Class cls2) {
        if (cls.getPackage() != cls2.getPackage()) {
            return false;
        }
        cls = cls.getClassLoader();
        cls2 = cls2.getClassLoader();
        Class systemClassLoader = ClassLoader.getSystemClassLoader();
        boolean z = true;
        if (cls == null) {
            if (cls2 != null) {
                if (cls2 != systemClassLoader) {
                    z = false;
                }
            }
            return z;
        } else if (cls2 == null) {
            if (cls != systemClassLoader) {
                z = false;
            }
            return z;
        } else {
            if (cls != cls2) {
                z = false;
            }
            return z;
        }
    }

    private static ClassLoader getParentClassLoader(Class cls) {
        cls = cls.getClassLoader();
        return cls == null ? ClassLoader.getSystemClassLoader() : cls;
    }

    private static java.lang.reflect.Method getDefineClassMethod() throws java.lang.Exception {
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
        r0 = defineClassMethod;
        if (r0 != 0) goto L_0x0037;
    L_0x0004:
        r0 = accessClassLoaders;
        monitor-enter(r0);
        r1 = java.lang.ClassLoader.class;	 Catch:{ all -> 0x0034 }
        r2 = "defineClass";	 Catch:{ all -> 0x0034 }
        r3 = 5;	 Catch:{ all -> 0x0034 }
        r3 = new java.lang.Class[r3];	 Catch:{ all -> 0x0034 }
        r4 = 0;	 Catch:{ all -> 0x0034 }
        r5 = java.lang.String.class;	 Catch:{ all -> 0x0034 }
        r3[r4] = r5;	 Catch:{ all -> 0x0034 }
        r4 = byte[].class;	 Catch:{ all -> 0x0034 }
        r5 = 1;	 Catch:{ all -> 0x0034 }
        r3[r5] = r4;	 Catch:{ all -> 0x0034 }
        r4 = 2;	 Catch:{ all -> 0x0034 }
        r6 = java.lang.Integer.TYPE;	 Catch:{ all -> 0x0034 }
        r3[r4] = r6;	 Catch:{ all -> 0x0034 }
        r4 = 3;	 Catch:{ all -> 0x0034 }
        r6 = java.lang.Integer.TYPE;	 Catch:{ all -> 0x0034 }
        r3[r4] = r6;	 Catch:{ all -> 0x0034 }
        r4 = 4;	 Catch:{ all -> 0x0034 }
        r6 = java.security.ProtectionDomain.class;	 Catch:{ all -> 0x0034 }
        r3[r4] = r6;	 Catch:{ all -> 0x0034 }
        r1 = r1.getDeclaredMethod(r2, r3);	 Catch:{ all -> 0x0034 }
        defineClassMethod = r1;	 Catch:{ all -> 0x0034 }
        r1 = defineClassMethod;	 Catch:{ Exception -> 0x0032 }
        r1.setAccessible(r5);	 Catch:{ Exception -> 0x0032 }
    L_0x0032:
        monitor-exit(r0);	 Catch:{ all -> 0x0034 }
        goto L_0x0037;	 Catch:{ all -> 0x0034 }
    L_0x0034:
        r1 = move-exception;	 Catch:{ all -> 0x0034 }
        monitor-exit(r0);	 Catch:{ all -> 0x0034 }
        throw r1;
    L_0x0037:
        r0 = defineClassMethod;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.reflectasm.AccessClassLoader.getDefineClassMethod():java.lang.reflect.Method");
    }
}
