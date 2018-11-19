package com.esotericsoftware.kryo;

import android.support.v7.widget.RecyclerView.ItemAnimator;
import com.esotericsoftware.kryo.factories.PseudoSerializerFactory;
import com.esotericsoftware.kryo.factories.ReflectionSerializerFactory;
import com.esotericsoftware.kryo.factories.SerializerFactory;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.serializers.ClosureSerializer.Closure;
import com.esotericsoftware.kryo.serializers.CollectionSerializer;
import com.esotericsoftware.kryo.serializers.DefaultArraySerializers.BooleanArraySerializer;
import com.esotericsoftware.kryo.serializers.DefaultArraySerializers.ByteArraySerializer;
import com.esotericsoftware.kryo.serializers.DefaultArraySerializers.CharArraySerializer;
import com.esotericsoftware.kryo.serializers.DefaultArraySerializers.DoubleArraySerializer;
import com.esotericsoftware.kryo.serializers.DefaultArraySerializers.FloatArraySerializer;
import com.esotericsoftware.kryo.serializers.DefaultArraySerializers.IntArraySerializer;
import com.esotericsoftware.kryo.serializers.DefaultArraySerializers.LongArraySerializer;
import com.esotericsoftware.kryo.serializers.DefaultArraySerializers.ObjectArraySerializer;
import com.esotericsoftware.kryo.serializers.DefaultArraySerializers.ShortArraySerializer;
import com.esotericsoftware.kryo.serializers.DefaultArraySerializers.StringArraySerializer;
import com.esotericsoftware.kryo.serializers.DefaultSerializers.BigDecimalSerializer;
import com.esotericsoftware.kryo.serializers.DefaultSerializers.BigIntegerSerializer;
import com.esotericsoftware.kryo.serializers.DefaultSerializers.BooleanSerializer;
import com.esotericsoftware.kryo.serializers.DefaultSerializers.ByteSerializer;
import com.esotericsoftware.kryo.serializers.DefaultSerializers.CalendarSerializer;
import com.esotericsoftware.kryo.serializers.DefaultSerializers.CharSerializer;
import com.esotericsoftware.kryo.serializers.DefaultSerializers.CharsetSerializer;
import com.esotericsoftware.kryo.serializers.DefaultSerializers.ClassSerializer;
import com.esotericsoftware.kryo.serializers.DefaultSerializers.CollectionsEmptyListSerializer;
import com.esotericsoftware.kryo.serializers.DefaultSerializers.CollectionsEmptyMapSerializer;
import com.esotericsoftware.kryo.serializers.DefaultSerializers.CollectionsEmptySetSerializer;
import com.esotericsoftware.kryo.serializers.DefaultSerializers.CollectionsSingletonListSerializer;
import com.esotericsoftware.kryo.serializers.DefaultSerializers.CollectionsSingletonMapSerializer;
import com.esotericsoftware.kryo.serializers.DefaultSerializers.CollectionsSingletonSetSerializer;
import com.esotericsoftware.kryo.serializers.DefaultSerializers.CurrencySerializer;
import com.esotericsoftware.kryo.serializers.DefaultSerializers.DateSerializer;
import com.esotericsoftware.kryo.serializers.DefaultSerializers.DoubleSerializer;
import com.esotericsoftware.kryo.serializers.DefaultSerializers.EnumSerializer;
import com.esotericsoftware.kryo.serializers.DefaultSerializers.EnumSetSerializer;
import com.esotericsoftware.kryo.serializers.DefaultSerializers.FloatSerializer;
import com.esotericsoftware.kryo.serializers.DefaultSerializers.IntSerializer;
import com.esotericsoftware.kryo.serializers.DefaultSerializers.KryoSerializableSerializer;
import com.esotericsoftware.kryo.serializers.DefaultSerializers.LocaleSerializer;
import com.esotericsoftware.kryo.serializers.DefaultSerializers.LongSerializer;
import com.esotericsoftware.kryo.serializers.DefaultSerializers.ShortSerializer;
import com.esotericsoftware.kryo.serializers.DefaultSerializers.StringBufferSerializer;
import com.esotericsoftware.kryo.serializers.DefaultSerializers.StringBuilderSerializer;
import com.esotericsoftware.kryo.serializers.DefaultSerializers.StringSerializer;
import com.esotericsoftware.kryo.serializers.DefaultSerializers.TimeZoneSerializer;
import com.esotericsoftware.kryo.serializers.DefaultSerializers.TreeMapSerializer;
import com.esotericsoftware.kryo.serializers.DefaultSerializers.TreeSetSerializer;
import com.esotericsoftware.kryo.serializers.DefaultSerializers.URLSerializer;
import com.esotericsoftware.kryo.serializers.DefaultSerializers.VoidSerializer;
import com.esotericsoftware.kryo.serializers.FieldSerializer;
import com.esotericsoftware.kryo.serializers.FieldSerializerConfig;
import com.esotericsoftware.kryo.serializers.GenericsResolver;
import com.esotericsoftware.kryo.serializers.MapSerializer;
import com.esotericsoftware.kryo.serializers.OptionalSerializers;
import com.esotericsoftware.kryo.serializers.TaggedFieldSerializerConfig;
import com.esotericsoftware.kryo.serializers.TimeSerializers;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.esotericsoftware.kryo.util.DefaultStreamFactory;
import com.esotericsoftware.kryo.util.IdentityMap;
import com.esotericsoftware.kryo.util.IntArray;
import com.esotericsoftware.kryo.util.MapReferenceResolver;
import com.esotericsoftware.kryo.util.ObjectMap;
import com.esotericsoftware.kryo.util.Util;
import com.esotericsoftware.minlog.Log;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Currency;
import java.util.Date;
import java.util.EnumSet;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;
import org.objenesis.instantiator.ObjectInstantiator;
import org.objenesis.strategy.InstantiatorStrategy;

public class Kryo {
    public static final byte NOT_NULL = (byte) 1;
    private static final int NO_REF = -2;
    public static final byte NULL = (byte) 0;
    private static final int REF = -1;
    private boolean autoReset;
    private ClassLoader classLoader;
    private final ClassResolver classResolver;
    private ObjectMap context;
    private int copyDepth;
    private boolean copyReferences;
    private boolean copyShallow;
    private SerializerFactory defaultSerializer;
    private final ArrayList<DefaultSerializerEntry> defaultSerializers;
    private int depth;
    private FieldSerializerConfig fieldSerializerConfig;
    private GenericsResolver genericsResolver;
    private ObjectMap graphContext;
    private final int lowPriorityDefaultSerializerCount;
    private int maxDepth;
    private Object needsCopyReference;
    private int nextRegisterID;
    private IdentityMap originalToCopy;
    private Object readObject;
    private final IntArray readReferenceIds;
    private ReferenceResolver referenceResolver;
    private boolean references;
    private boolean registrationRequired;
    private InstantiatorStrategy strategy;
    private StreamFactory streamFactory;
    private TaggedFieldSerializerConfig taggedFieldSerializerConfig;
    private volatile Thread thread;
    private boolean warnUnregisteredClasses;

    static final class DefaultSerializerEntry {
        final SerializerFactory serializerFactory;
        final Class type;

        DefaultSerializerEntry(Class cls, SerializerFactory serializerFactory) {
            this.type = cls;
            this.serializerFactory = serializerFactory;
        }
    }

    public static class DefaultInstantiatorStrategy implements InstantiatorStrategy {
        private InstantiatorStrategy fallbackStrategy;

        public DefaultInstantiatorStrategy(InstantiatorStrategy instantiatorStrategy) {
            this.fallbackStrategy = instantiatorStrategy;
        }

        public void setFallbackInstantiatorStrategy(InstantiatorStrategy instantiatorStrategy) {
            this.fallbackStrategy = instantiatorStrategy;
        }

        public InstantiatorStrategy getFallbackInstantiatorStrategy() {
            return this.fallbackStrategy;
        }

        public org.objenesis.instantiator.ObjectInstantiator newInstantiatorOf(final java.lang.Class r4) {
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
            r3 = this;
            r0 = com.esotericsoftware.kryo.util.Util.IS_ANDROID;
            r1 = 1;
            if (r0 != 0) goto L_0x002a;
        L_0x0005:
            r0 = r4.getEnclosingClass();
            if (r0 == 0) goto L_0x001d;
        L_0x000b:
            r0 = r4.isMemberClass();
            if (r0 == 0) goto L_0x001d;
        L_0x0011:
            r0 = r4.getModifiers();
            r0 = java.lang.reflect.Modifier.isStatic(r0);
            if (r0 != 0) goto L_0x001d;
        L_0x001b:
            r0 = 1;
            goto L_0x001e;
        L_0x001d:
            r0 = 0;
        L_0x001e:
            if (r0 != 0) goto L_0x002a;
        L_0x0020:
            r0 = com.esotericsoftware.reflectasm.ConstructorAccess.get(r4);	 Catch:{ Exception -> 0x002a }
            r2 = new com.esotericsoftware.kryo.Kryo$DefaultInstantiatorStrategy$1;	 Catch:{ Exception -> 0x002a }
            r2.<init>(r0, r4);	 Catch:{ Exception -> 0x002a }
            return r2;
        L_0x002a:
            r0 = 0;
            r2 = r0;	 Catch:{ Exception -> 0x0033 }
            r2 = (java.lang.Class[]) r2;	 Catch:{ Exception -> 0x0033 }
            r2 = r4.getConstructor(r2);	 Catch:{ Exception -> 0x0033 }
            goto L_0x003c;
        L_0x0033:
            r0 = (java.lang.Class[]) r0;	 Catch:{ Exception -> 0x0042 }
            r2 = r4.getDeclaredConstructor(r0);	 Catch:{ Exception -> 0x0042 }
            r2.setAccessible(r1);	 Catch:{ Exception -> 0x0042 }
        L_0x003c:
            r0 = new com.esotericsoftware.kryo.Kryo$DefaultInstantiatorStrategy$2;	 Catch:{ Exception -> 0x0042 }
            r0.<init>(r2, r4);	 Catch:{ Exception -> 0x0042 }
            return r0;
        L_0x0042:
            r0 = r3.fallbackStrategy;
            if (r0 != 0) goto L_0x00bf;
        L_0x0046:
            r0 = r4.isMemberClass();
            if (r0 == 0) goto L_0x0071;
        L_0x004c:
            r0 = r4.getModifiers();
            r0 = java.lang.reflect.Modifier.isStatic(r0);
            if (r0 != 0) goto L_0x0071;
        L_0x0056:
            r0 = new com.esotericsoftware.kryo.KryoException;
            r1 = new java.lang.StringBuilder;
            r1.<init>();
            r2 = "Class cannot be created (non-static member class): ";
            r1.append(r2);
            r4 = com.esotericsoftware.kryo.util.Util.className(r4);
            r1.append(r4);
            r4 = r1.toString();
            r0.<init>(r4);
            throw r0;
        L_0x0071:
            r0 = new java.lang.StringBuilder;
            r1 = new java.lang.StringBuilder;
            r1.<init>();
            r2 = "Class cannot be created (missing no-arg constructor): ";
            r1.append(r2);
            r2 = com.esotericsoftware.kryo.util.Util.className(r4);
            r1.append(r2);
            r1 = r1.toString();
            r0.<init>(r1);
            r4 = r4.getSimpleName();
            r1 = "";
            r4 = r4.equals(r1);
            if (r4 == 0) goto L_0x00b5;
        L_0x0097:
            r4 = "\n\tThis is an anonymous class, which is not serializable by default in Kryo. Possible solutions: ";
            r0.append(r4);
            r4 = "1. Remove uses of anonymous classes, including double brace initialization, from the containing ";
            r0.append(r4);
            r4 = "class. This is the safest solution, as anonymous classes don't have predictable names for serialization.";
            r0.append(r4);
            r4 = "\n\t2. Register a FieldSerializer for the containing class and call ";
            r0.append(r4);
            r4 = "FieldSerializer#setIgnoreSyntheticFields(false) on it. This is not safe but may be sufficient temporarily. ";
            r0.append(r4);
            r4 = "Use at your own risk.";
            r0.append(r4);
        L_0x00b5:
            r4 = new com.esotericsoftware.kryo.KryoException;
            r0 = r0.toString();
            r4.<init>(r0);
            throw r4;
        L_0x00bf:
            r0 = r3.fallbackStrategy;
            r4 = r0.newInstantiatorOf(r4);
            return r4;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.Kryo.DefaultInstantiatorStrategy.newInstantiatorOf(java.lang.Class):org.objenesis.instantiator.ObjectInstantiator");
        }
    }

    public Kryo() {
        this(new DefaultClassResolver(), new MapReferenceResolver(), new DefaultStreamFactory());
    }

    public Kryo(ReferenceResolver referenceResolver) {
        this(new DefaultClassResolver(), referenceResolver, new DefaultStreamFactory());
    }

    public Kryo(ClassResolver classResolver, ReferenceResolver referenceResolver) {
        this(classResolver, referenceResolver, new DefaultStreamFactory());
    }

    public Kryo(ClassResolver classResolver, ReferenceResolver referenceResolver, StreamFactory streamFactory) {
        this.defaultSerializer = new ReflectionSerializerFactory(FieldSerializer.class);
        this.defaultSerializers = new ArrayList(33);
        this.classLoader = getClass().getClassLoader();
        this.strategy = new DefaultInstantiatorStrategy();
        this.maxDepth = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.autoReset = true;
        this.readReferenceIds = new IntArray(0);
        this.copyReferences = true;
        this.genericsResolver = new GenericsResolver();
        this.fieldSerializerConfig = new FieldSerializerConfig();
        this.taggedFieldSerializerConfig = new TaggedFieldSerializerConfig();
        if (classResolver == null) {
            throw new IllegalArgumentException("classResolver cannot be null.");
        }
        this.classResolver = classResolver;
        classResolver.setKryo(this);
        this.streamFactory = streamFactory;
        streamFactory.setKryo(this);
        this.referenceResolver = referenceResolver;
        if (referenceResolver != null) {
            referenceResolver.setKryo(this);
            this.references = true;
        }
        addDefaultSerializer(byte[].class, ByteArraySerializer.class);
        addDefaultSerializer(char[].class, CharArraySerializer.class);
        addDefaultSerializer(short[].class, ShortArraySerializer.class);
        addDefaultSerializer(int[].class, IntArraySerializer.class);
        addDefaultSerializer(long[].class, LongArraySerializer.class);
        addDefaultSerializer(float[].class, FloatArraySerializer.class);
        addDefaultSerializer(double[].class, DoubleArraySerializer.class);
        addDefaultSerializer(boolean[].class, BooleanArraySerializer.class);
        addDefaultSerializer(String[].class, StringArraySerializer.class);
        addDefaultSerializer(Object[].class, ObjectArraySerializer.class);
        addDefaultSerializer(KryoSerializable.class, KryoSerializableSerializer.class);
        addDefaultSerializer(BigInteger.class, BigIntegerSerializer.class);
        addDefaultSerializer(BigDecimal.class, BigDecimalSerializer.class);
        addDefaultSerializer(Class.class, ClassSerializer.class);
        addDefaultSerializer(Date.class, DateSerializer.class);
        addDefaultSerializer(Enum.class, EnumSerializer.class);
        addDefaultSerializer(EnumSet.class, EnumSetSerializer.class);
        addDefaultSerializer(Currency.class, CurrencySerializer.class);
        addDefaultSerializer(StringBuffer.class, StringBufferSerializer.class);
        addDefaultSerializer(StringBuilder.class, StringBuilderSerializer.class);
        addDefaultSerializer(Collections.EMPTY_LIST.getClass(), CollectionsEmptyListSerializer.class);
        addDefaultSerializer(Collections.EMPTY_MAP.getClass(), CollectionsEmptyMapSerializer.class);
        addDefaultSerializer(Collections.EMPTY_SET.getClass(), CollectionsEmptySetSerializer.class);
        addDefaultSerializer(Collections.singletonList(null).getClass(), CollectionsSingletonListSerializer.class);
        addDefaultSerializer(Collections.singletonMap(null, null).getClass(), CollectionsSingletonMapSerializer.class);
        addDefaultSerializer(Collections.singleton(null).getClass(), CollectionsSingletonSetSerializer.class);
        addDefaultSerializer(TreeSet.class, TreeSetSerializer.class);
        addDefaultSerializer(Collection.class, CollectionSerializer.class);
        addDefaultSerializer(TreeMap.class, TreeMapSerializer.class);
        addDefaultSerializer(Map.class, MapSerializer.class);
        addDefaultSerializer(TimeZone.class, TimeZoneSerializer.class);
        addDefaultSerializer(Calendar.class, CalendarSerializer.class);
        addDefaultSerializer(Locale.class, LocaleSerializer.class);
        addDefaultSerializer(Charset.class, CharsetSerializer.class);
        addDefaultSerializer(URL.class, URLSerializer.class);
        OptionalSerializers.addDefaultSerializers(this);
        TimeSerializers.addDefaultSerializers(this);
        this.lowPriorityDefaultSerializerCount = this.defaultSerializers.size();
        register(Integer.TYPE, new IntSerializer());
        register(String.class, new StringSerializer());
        register(Float.TYPE, new FloatSerializer());
        register(Boolean.TYPE, new BooleanSerializer());
        register(Byte.TYPE, new ByteSerializer());
        register(Character.TYPE, new CharSerializer());
        register(Short.TYPE, new ShortSerializer());
        register(Long.TYPE, new LongSerializer());
        register(Double.TYPE, new DoubleSerializer());
        register(Void.TYPE, new VoidSerializer());
    }

    public void setDefaultSerializer(SerializerFactory serializerFactory) {
        if (serializerFactory == null) {
            throw new IllegalArgumentException("serializer cannot be null.");
        }
        this.defaultSerializer = serializerFactory;
    }

    public void setDefaultSerializer(Class<? extends Serializer> cls) {
        if (cls == null) {
            throw new IllegalArgumentException("serializer cannot be null.");
        }
        this.defaultSerializer = new ReflectionSerializerFactory(cls);
    }

    public void addDefaultSerializer(Class cls, Serializer serializer) {
        if (cls == null) {
            throw new IllegalArgumentException("type cannot be null.");
        } else if (serializer == null) {
            throw new IllegalArgumentException("serializer cannot be null.");
        } else {
            this.defaultSerializers.add(this.defaultSerializers.size() - this.lowPriorityDefaultSerializerCount, new DefaultSerializerEntry(cls, new PseudoSerializerFactory(serializer)));
        }
    }

    public void addDefaultSerializer(Class cls, SerializerFactory serializerFactory) {
        if (cls == null) {
            throw new IllegalArgumentException("type cannot be null.");
        } else if (serializerFactory == null) {
            throw new IllegalArgumentException("serializerFactory cannot be null.");
        } else {
            this.defaultSerializers.add(this.defaultSerializers.size() - this.lowPriorityDefaultSerializerCount, new DefaultSerializerEntry(cls, serializerFactory));
        }
    }

    public void addDefaultSerializer(Class cls, Class<? extends Serializer> cls2) {
        if (cls == null) {
            throw new IllegalArgumentException("type cannot be null.");
        } else if (cls2 == null) {
            throw new IllegalArgumentException("serializerClass cannot be null.");
        } else {
            this.defaultSerializers.add(this.defaultSerializers.size() - this.lowPriorityDefaultSerializerCount, new DefaultSerializerEntry(cls, new ReflectionSerializerFactory(cls2)));
        }
    }

    public Serializer getDefaultSerializer(Class cls) {
        if (cls == null) {
            throw new IllegalArgumentException("type cannot be null.");
        }
        Serializer defaultSerializerForAnnotatedType = getDefaultSerializerForAnnotatedType(cls);
        if (defaultSerializerForAnnotatedType != null) {
            return defaultSerializerForAnnotatedType;
        }
        int size = this.defaultSerializers.size();
        for (int i = 0; i < size; i++) {
            DefaultSerializerEntry defaultSerializerEntry = (DefaultSerializerEntry) this.defaultSerializers.get(i);
            if (defaultSerializerEntry.type.isAssignableFrom(cls)) {
                return defaultSerializerEntry.serializerFactory.makeSerializer(this, cls);
            }
        }
        return newDefaultSerializer(cls);
    }

    protected Serializer getDefaultSerializerForAnnotatedType(Class cls) {
        return cls.isAnnotationPresent(DefaultSerializer.class) ? ReflectionSerializerFactory.makeSerializer(this, ((DefaultSerializer) cls.getAnnotation(DefaultSerializer.class)).value(), cls) : null;
    }

    protected Serializer newDefaultSerializer(Class cls) {
        return this.defaultSerializer.makeSerializer(this, cls);
    }

    public Registration register(Class cls) {
        Registration registration = this.classResolver.getRegistration(cls);
        if (registration != null) {
            return registration;
        }
        return register(cls, getDefaultSerializer(cls));
    }

    public Registration register(Class cls, int i) {
        Registration registration = this.classResolver.getRegistration(cls);
        if (registration != null) {
            return registration;
        }
        return register(cls, getDefaultSerializer(cls), i);
    }

    public Registration register(Class cls, Serializer serializer) {
        Registration registration = this.classResolver.getRegistration(cls);
        if (registration == null) {
            return this.classResolver.register(new Registration(cls, serializer, getNextRegistrationId()));
        }
        registration.setSerializer(serializer);
        return registration;
    }

    public Registration register(Class cls, Serializer serializer, int i) {
        if (i >= 0) {
            return register(new Registration(cls, serializer, i));
        }
        serializer = new StringBuilder();
        serializer.append("id must be >= 0: ");
        serializer.append(i);
        throw new IllegalArgumentException(serializer.toString());
    }

    public Registration register(Registration registration) {
        int id = registration.getId();
        if (id < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("id must be > 0: ");
            stringBuilder.append(id);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        Registration registration2 = getRegistration(registration.getId());
        if (!(!Log.DEBUG || registration2 == null || registration2.getType() == registration.getType())) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("An existing registration with a different type already uses ID: ");
            stringBuilder.append(registration.getId());
            stringBuilder.append("\nExisting registration: ");
            stringBuilder.append(registration2);
            stringBuilder.append("\nis now overwritten with: ");
            stringBuilder.append(registration);
            Log.debug(stringBuilder.toString());
        }
        return this.classResolver.register(registration);
    }

    public int getNextRegistrationId() {
        while (this.nextRegisterID != -2) {
            if (this.classResolver.getRegistration(this.nextRegisterID) == null) {
                return this.nextRegisterID;
            }
            this.nextRegisterID++;
        }
        throw new KryoException("No registration IDs are available.");
    }

    public Registration getRegistration(Class cls) {
        if (cls == null) {
            throw new IllegalArgumentException("type cannot be null.");
        }
        Registration registration = this.classResolver.getRegistration(cls);
        if (registration != null) {
            return registration;
        }
        if (Proxy.isProxyClass(cls)) {
            registration = getRegistration(InvocationHandler.class);
        } else if (!cls.isEnum() && Enum.class.isAssignableFrom(cls)) {
            registration = getRegistration(cls.getEnclosingClass());
        } else if (EnumSet.class.isAssignableFrom(cls)) {
            registration = this.classResolver.getRegistration(EnumSet.class);
        } else if (isClosure(cls)) {
            registration = this.classResolver.getRegistration(Closure.class);
        }
        if (registration != null) {
            return registration;
        }
        if (this.registrationRequired) {
            throw new IllegalArgumentException(unregisteredClassMessage(cls));
        }
        if (this.warnUnregisteredClasses) {
            Log.warn(unregisteredClassMessage(cls));
        }
        return this.classResolver.registerImplicit(cls);
    }

    protected String unregisteredClassMessage(Class cls) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Class is not registered: ");
        stringBuilder.append(Util.className(cls));
        stringBuilder.append("\nNote: To register this class use: kryo.register(");
        stringBuilder.append(Util.className(cls));
        stringBuilder.append(".class);");
        return stringBuilder.toString();
    }

    public Registration getRegistration(int i) {
        return this.classResolver.getRegistration(i);
    }

    public Serializer getSerializer(Class cls) {
        return getRegistration(cls).getSerializer();
    }

    public Registration writeClass(Output output, Class cls) {
        if (output == null) {
            throw new IllegalArgumentException("output cannot be null.");
        }
        try {
            output = this.classResolver.writeClass(output, cls);
            return output;
        } finally {
            if (this.depth == null && this.autoReset != null) {
                reset();
            }
        }
    }

    public void writeObject(Output output, Object obj) {
        if (output == null) {
            throw new IllegalArgumentException("output cannot be null.");
        } else if (obj == null) {
            throw new IllegalArgumentException("object cannot be null.");
        } else {
            beginObject();
            try {
                if (this.references && writeReferenceOrNull(output, obj, false)) {
                    getRegistration(obj.getClass()).getSerializer().setGenerics(this, null);
                    return;
                }
                if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                    Util.log("Write", obj);
                }
                getRegistration(obj.getClass()).getSerializer().write(this, output, obj);
                output = this.depth - 1;
                this.depth = output;
                if (output == null && this.autoReset != null) {
                    reset();
                }
            } finally {
                obj = this.depth - 1;
                this.depth = obj;
                if (obj == null && this.autoReset != null) {
                    reset();
                }
            }
        }
    }

    public void writeObject(Output output, Object obj, Serializer serializer) {
        if (output == null) {
            throw new IllegalArgumentException("output cannot be null.");
        } else if (obj == null) {
            throw new IllegalArgumentException("object cannot be null.");
        } else if (serializer == null) {
            throw new IllegalArgumentException("serializer cannot be null.");
        } else {
            beginObject();
            try {
                if (this.references && writeReferenceOrNull(output, obj, false)) {
                    serializer.setGenerics(this, null);
                    return;
                }
                if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                    Util.log("Write", obj);
                }
                serializer.write(this, output, obj);
                output = this.depth - 1;
                this.depth = output;
                if (output == null && this.autoReset != null) {
                    reset();
                }
            } finally {
                obj = this.depth - 1;
                this.depth = obj;
                if (obj == null && this.autoReset != null) {
                    reset();
                }
            }
        }
    }

    public void writeObjectOrNull(Output output, Object obj, Class cls) {
        if (output == null) {
            throw new IllegalArgumentException("output cannot be null.");
        }
        beginObject();
        try {
            cls = getRegistration(cls).getSerializer();
            if (this.references) {
                if (writeReferenceOrNull(output, obj, true)) {
                    cls.setGenerics(this, null);
                    return;
                }
            } else if (!cls.getAcceptsNull()) {
                if (obj == null) {
                    if (Log.TRACE != null || (Log.DEBUG != null && this.depth == 1)) {
                        Util.log("Write", obj);
                    }
                    output.writeByte((byte) null);
                    output = this.depth - 1;
                    this.depth = output;
                    if (output == null && this.autoReset != null) {
                        reset();
                    }
                    return;
                }
                output.writeByte((byte) 1);
            }
            if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                Util.log("Write", obj);
            }
            cls.write(this, output, obj);
            output = this.depth - 1;
            this.depth = output;
            if (output == null && this.autoReset != null) {
                reset();
            }
        } finally {
            obj = this.depth - 1;
            this.depth = obj;
            if (obj == null && this.autoReset != null) {
                reset();
            }
        }
    }

    public void writeObjectOrNull(Output output, Object obj, Serializer serializer) {
        if (output == null) {
            throw new IllegalArgumentException("output cannot be null.");
        } else if (serializer == null) {
            throw new IllegalArgumentException("serializer cannot be null.");
        } else {
            beginObject();
            try {
                if (this.references) {
                    if (writeReferenceOrNull(output, obj, true)) {
                        serializer.setGenerics(this, null);
                        return;
                    }
                } else if (!serializer.getAcceptsNull()) {
                    if (obj == null) {
                        if (Log.TRACE != null || (Log.DEBUG != null && this.depth == 1)) {
                            Util.log("Write", null);
                        }
                        output.writeByte((byte) null);
                        output = this.depth - 1;
                        this.depth = output;
                        if (output == null && this.autoReset != null) {
                            reset();
                        }
                        return;
                    }
                    output.writeByte((byte) 1);
                }
                if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                    Util.log("Write", obj);
                }
                serializer.write(this, output, obj);
                output = this.depth - 1;
                this.depth = output;
                if (output == null && this.autoReset != null) {
                    reset();
                }
            } finally {
                obj = this.depth - 1;
                this.depth = obj;
                if (obj == null && this.autoReset != null) {
                    reset();
                }
            }
        }
    }

    public void writeClassAndObject(Output output, Object obj) {
        if (output == null) {
            throw new IllegalArgumentException("output cannot be null.");
        }
        beginObject();
        if (obj == null) {
            try {
                writeClass(output, null);
            } finally {
                obj = this.depth - 1;
                this.depth = obj;
                if (obj == null && this.autoReset != null) {
                    reset();
                }
            }
        } else {
            Registration writeClass = writeClass(output, obj.getClass());
            if (this.references && writeReferenceOrNull(output, obj, false)) {
                writeClass.getSerializer().setGenerics(this, null);
                output = this.depth - 1;
                this.depth = output;
                if (output == null && this.autoReset != null) {
                    reset();
                }
                return;
            }
            if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                Util.log("Write", obj);
            }
            writeClass.getSerializer().write(this, output, obj);
            output = this.depth - 1;
            this.depth = output;
            if (output == null && this.autoReset != null) {
                reset();
            }
        }
    }

    boolean writeReferenceOrNull(Output output, Object obj, boolean z) {
        if (obj == null) {
            if (Log.TRACE != null || (Log.DEBUG != null && this.depth == 1)) {
                Util.log("Write", false);
            }
            output.writeVarInt(0, true);
            return true;
        } else if (this.referenceResolver.useReferences(obj.getClass())) {
            z = this.referenceResolver.getWrittenId(obj);
            if (!z) {
                if (Log.DEBUG) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Write object reference ");
                    stringBuilder.append(z);
                    stringBuilder.append(": ");
                    stringBuilder.append(Util.string(obj));
                    Log.debug("kryo", stringBuilder.toString());
                }
                output.writeVarInt(z + 2, true);
                return true;
            }
            z = this.referenceResolver.addWrittenObject(obj);
            output.writeVarInt(1, true);
            if (Log.TRACE != null) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Write initial object reference ");
                stringBuilder2.append(z);
                stringBuilder2.append(": ");
                stringBuilder2.append(Util.string(obj));
                Log.trace("kryo", stringBuilder2.toString());
            }
            return false;
        } else {
            if (z) {
                output.writeVarInt(1, true);
            }
            return false;
        }
    }

    public Registration readClass(Input input) {
        if (input == null) {
            throw new IllegalArgumentException("input cannot be null.");
        }
        try {
            input = this.classResolver.readClass(input);
            return input;
        } finally {
            if (this.depth == 0 && this.autoReset) {
                reset();
            }
        }
    }

    public <T> T readObject(Input input, Class<T> cls) {
        if (input == null) {
            throw new IllegalArgumentException("input cannot be null.");
        } else if (cls == null) {
            throw new IllegalArgumentException("type cannot be null.");
        } else {
            beginObject();
            try {
                if (this.references) {
                    int readReferenceOrNull = readReferenceOrNull(input, cls, false);
                    if (readReferenceOrNull == -1) {
                        input = this.readObject;
                        return input;
                    }
                    input = getRegistration((Class) cls).getSerializer().read(this, input, cls);
                    if (readReferenceOrNull == this.readReferenceIds.size) {
                        reference(input);
                    }
                } else {
                    input = getRegistration((Class) cls).getSerializer().read(this, input, cls);
                }
                if (Log.TRACE != null || (Log.DEBUG != null && this.depth == 1)) {
                    Util.log("Read", input);
                }
                cls = this.depth - 1;
                this.depth = cls;
                if (cls == null && this.autoReset != null) {
                    reset();
                }
                return input;
            } finally {
                cls = this.depth - 1;
                this.depth = cls;
                if (cls == null && this.autoReset != null) {
                    reset();
                }
            }
        }
    }

    public <T> T readObject(Input input, Class<T> cls, Serializer serializer) {
        if (input == null) {
            throw new IllegalArgumentException("input cannot be null.");
        } else if (cls == null) {
            throw new IllegalArgumentException("type cannot be null.");
        } else if (serializer == null) {
            throw new IllegalArgumentException("serializer cannot be null.");
        } else {
            beginObject();
            try {
                if (this.references) {
                    int readReferenceOrNull = readReferenceOrNull(input, cls, false);
                    if (readReferenceOrNull == -1) {
                        input = this.readObject;
                        return input;
                    }
                    input = serializer.read(this, input, cls);
                    if (readReferenceOrNull == this.readReferenceIds.size) {
                        reference(input);
                    }
                } else {
                    input = serializer.read(this, input, cls);
                }
                if (Log.TRACE != null || (Log.DEBUG != null && this.depth == 1)) {
                    Util.log("Read", input);
                }
                cls = this.depth - 1;
                this.depth = cls;
                if (cls == null && this.autoReset != null) {
                    reset();
                }
                return input;
            } finally {
                cls = this.depth - 1;
                this.depth = cls;
                if (cls == null && this.autoReset != null) {
                    reset();
                }
            }
        }
    }

    public <T> T readObjectOrNull(Input input, Class<T> cls) {
        if (input == null) {
            throw new IllegalArgumentException("input cannot be null.");
        } else if (cls == null) {
            throw new IllegalArgumentException("type cannot be null.");
        } else {
            beginObject();
            try {
                if (this.references) {
                    int readReferenceOrNull = readReferenceOrNull(input, cls, true);
                    if (readReferenceOrNull == -1) {
                        input = this.readObject;
                        return input;
                    }
                    input = getRegistration((Class) cls).getSerializer().read(this, input, cls);
                    if (readReferenceOrNull == this.readReferenceIds.size) {
                        reference(input);
                    }
                } else {
                    Serializer serializer = getRegistration((Class) cls).getSerializer();
                    if (serializer.getAcceptsNull() || input.readByte() != (byte) 0) {
                        input = serializer.read(this, input, cls);
                    } else {
                        if (Log.TRACE != null || (Log.DEBUG != null && this.depth == 1)) {
                            Util.log("Read", null);
                        }
                        input = this.depth - 1;
                        this.depth = input;
                        if (input == null && this.autoReset != null) {
                            reset();
                        }
                        return null;
                    }
                }
                if (Log.TRACE != null || (Log.DEBUG != null && this.depth == 1)) {
                    Util.log("Read", input);
                }
                cls = this.depth - 1;
                this.depth = cls;
                if (cls == null && this.autoReset != null) {
                    reset();
                }
                return input;
            } finally {
                cls = this.depth - 1;
                this.depth = cls;
                if (cls == null && this.autoReset != null) {
                    reset();
                }
            }
        }
    }

    public <T> T readObjectOrNull(Input input, Class<T> cls, Serializer serializer) {
        if (input == null) {
            throw new IllegalArgumentException("input cannot be null.");
        } else if (cls == null) {
            throw new IllegalArgumentException("type cannot be null.");
        } else if (serializer == null) {
            throw new IllegalArgumentException("serializer cannot be null.");
        } else {
            beginObject();
            try {
                if (this.references) {
                    int readReferenceOrNull = readReferenceOrNull(input, cls, true);
                    if (readReferenceOrNull == -1) {
                        input = this.readObject;
                        return input;
                    }
                    input = serializer.read(this, input, cls);
                    if (readReferenceOrNull == this.readReferenceIds.size) {
                        reference(input);
                    }
                } else if (serializer.getAcceptsNull() || input.readByte() != (byte) 0) {
                    input = serializer.read(this, input, cls);
                } else {
                    if (Log.TRACE != null || (Log.DEBUG != null && this.depth == 1)) {
                        Util.log("Read", null);
                    }
                    input = this.depth - 1;
                    this.depth = input;
                    if (input == null && this.autoReset != null) {
                        reset();
                    }
                    return null;
                }
                if (Log.TRACE != null || (Log.DEBUG != null && this.depth == 1)) {
                    Util.log("Read", input);
                }
                cls = this.depth - 1;
                this.depth = cls;
                if (cls == null && this.autoReset != null) {
                    reset();
                }
                return input;
            } finally {
                cls = this.depth - 1;
                this.depth = cls;
                if (cls == null && this.autoReset != null) {
                    reset();
                }
            }
        }
    }

    public Object readClassAndObject(Input input) {
        if (input == null) {
            throw new IllegalArgumentException("input cannot be null.");
        }
        beginObject();
        int i;
        try {
            Registration readClass = readClass(input);
            if (readClass == null) {
                input = this.depth - 1;
                this.depth = input;
                if (input == null && this.autoReset != null) {
                    reset();
                }
                return null;
            }
            Class type = readClass.getType();
            if (this.references) {
                readClass.getSerializer().setGenerics(this, null);
                int readReferenceOrNull = readReferenceOrNull(input, type, false);
                if (readReferenceOrNull == -1) {
                    input = this.readObject;
                    return input;
                }
                input = readClass.getSerializer().read(this, input, type);
                if (readReferenceOrNull == this.readReferenceIds.size) {
                    reference(input);
                }
            } else {
                input = readClass.getSerializer().read(this, input, type);
            }
            if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                Util.log("Read", input);
            }
            i = this.depth - 1;
            this.depth = i;
            if (i == 0 && this.autoReset) {
                reset();
            }
            return input;
        } finally {
            i = this.depth - 1;
            this.depth = i;
            if (i == 0 && this.autoReset) {
                reset();
            }
        }
    }

    int readReferenceOrNull(com.esotericsoftware.kryo.io.Input r5, java.lang.Class r6, boolean r7) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Wrong literal type: com.esotericsoftware.kryo.io.Input for value: 2
	at jadx.core.dex.instructions.args.LiteralArg.<init>(LiteralArg.java:16)
	at jadx.core.dex.instructions.args.InsnArg.lit(InsnArg.java:44)
	at jadx.core.dex.visitors.SimplifyVisitor.simplifyArith(SimplifyVisitor.java:239)
	at jadx.core.dex.visitors.SimplifyVisitor.simplifyInsn(SimplifyVisitor.java:63)
	at jadx.core.dex.visitors.SimplifyVisitor.visit(SimplifyVisitor.java:44)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r4 = this;
        r0 = r6.isPrimitive();
        if (r0 == 0) goto L_0x000a;
    L_0x0006:
        r6 = com.esotericsoftware.kryo.util.Util.getWrapperClass(r6);
    L_0x000a:
        r0 = r4.referenceResolver;
        r0 = r0.useReferences(r6);
        r1 = -1;
        r2 = -2;
        r3 = 1;
        if (r7 == 0) goto L_0x003c;
    L_0x0015:
        r5 = r5.readVarInt(r3);
        if (r5 != 0) goto L_0x0030;
    L_0x001b:
        r5 = com.esotericsoftware.minlog.Log.TRACE;
        r6 = 0;
        if (r5 != 0) goto L_0x0028;
    L_0x0020:
        r5 = com.esotericsoftware.minlog.Log.DEBUG;
        if (r5 == 0) goto L_0x002d;
    L_0x0024:
        r5 = r4.depth;
        if (r5 != r3) goto L_0x002d;
    L_0x0028:
        r5 = "Read";
        com.esotericsoftware.kryo.util.Util.log(r5, r6);
    L_0x002d:
        r4.readObject = r6;
        return r1;
    L_0x0030:
        if (r0 != 0) goto L_0x004c;
    L_0x0032:
        r5 = r4.readReferenceIds;
        r5.add(r2);
        r5 = r4.readReferenceIds;
        r5 = r5.size;
        return r5;
    L_0x003c:
        if (r0 != 0) goto L_0x0048;
    L_0x003e:
        r5 = r4.readReferenceIds;
        r5.add(r2);
        r5 = r4.readReferenceIds;
        r5 = r5.size;
        return r5;
    L_0x0048:
        r5 = r5.readVarInt(r3);
    L_0x004c:
        if (r5 != r3) goto L_0x0084;
    L_0x004e:
        r5 = r4.referenceResolver;
        r5 = r5.nextReadId(r6);
        r7 = com.esotericsoftware.minlog.Log.TRACE;
        if (r7 == 0) goto L_0x007a;
    L_0x0058:
        r7 = "kryo";
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Read initial object reference ";
        r0.append(r1);
        r0.append(r5);
        r1 = ": ";
        r0.append(r1);
        r6 = com.esotericsoftware.kryo.util.Util.className(r6);
        r0.append(r6);
        r6 = r0.toString();
        com.esotericsoftware.minlog.Log.trace(r7, r6);
    L_0x007a:
        r6 = r4.readReferenceIds;
        r6.add(r5);
        r5 = r4.readReferenceIds;
        r5 = r5.size;
        return r5;
    L_0x0084:
        r5 = r5 + r2;
        r7 = r4.referenceResolver;
        r6 = r7.getReadObject(r6, r5);
        r4.readObject = r6;
        r6 = com.esotericsoftware.minlog.Log.DEBUG;
        if (r6 == 0) goto L_0x00b5;
    L_0x0091:
        r6 = "kryo";
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r0 = "Read object reference ";
        r7.append(r0);
        r7.append(r5);
        r5 = ": ";
        r7.append(r5);
        r5 = r4.readObject;
        r5 = com.esotericsoftware.kryo.util.Util.string(r5);
        r7.append(r5);
        r5 = r7.toString();
        com.esotericsoftware.minlog.Log.debug(r6, r5);
    L_0x00b5:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.Kryo.readReferenceOrNull(com.esotericsoftware.kryo.io.Input, java.lang.Class, boolean):int");
    }

    public void reference(Object obj) {
        if (this.copyDepth > 0) {
            if (this.needsCopyReference == null) {
                return;
            }
            if (obj == null) {
                throw new IllegalArgumentException("object cannot be null.");
            }
            this.originalToCopy.put(this.needsCopyReference, obj);
            this.needsCopyReference = null;
        } else if (this.references && obj != null) {
            int pop = this.readReferenceIds.pop();
            if (pop != -2) {
                this.referenceResolver.setReadObject(pop, obj);
            }
        }
    }

    public void reset() {
        this.depth = 0;
        if (this.graphContext != null) {
            this.graphContext.clear();
        }
        this.classResolver.reset();
        if (this.references) {
            this.referenceResolver.reset();
            this.readObject = null;
        }
        this.copyDepth = 0;
        if (this.originalToCopy != null) {
            this.originalToCopy.clear(ItemAnimator.FLAG_MOVED);
        }
        if (Log.TRACE) {
            Log.trace("kryo", "Object graph complete.");
        }
    }

    public <T> T copy(T t) {
        if (t == null) {
            return null;
        }
        if (this.copyShallow) {
            return t;
        }
        this.copyDepth++;
        T t2;
        try {
            if (this.originalToCopy == null) {
                this.originalToCopy = new IdentityMap();
            }
            t2 = this.originalToCopy.get(t);
            if (t2 != null) {
                return t2;
            }
            if (this.copyReferences) {
                this.needsCopyReference = t;
            }
            if (t instanceof KryoCopyable) {
                t = ((KryoCopyable) t).copy(this);
            } else {
                t = getSerializer(t.getClass()).copy(this, t);
            }
            if (this.needsCopyReference != null) {
                reference(t);
            }
            if (Log.TRACE || (Log.DEBUG && this.copyDepth == 1)) {
                Util.log("Copy", t);
            }
            int i = this.copyDepth - 1;
            this.copyDepth = i;
            if (i == 0) {
                reset();
            }
            return t;
        } finally {
            t2 = this.copyDepth - 1;
            this.copyDepth = t2;
            if (t2 == null) {
                reset();
            }
        }
    }

    public <T> T copy(T t, Serializer serializer) {
        if (t == null) {
            return null;
        }
        if (this.copyShallow) {
            return t;
        }
        T t2 = this.copyDepth + 1;
        this.copyDepth = t2;
        try {
            if (this.originalToCopy == null) {
                this.originalToCopy = new IdentityMap();
            }
            t2 = this.originalToCopy.get(t);
            if (t2 != null) {
                return t2;
            }
            if (this.copyReferences) {
                this.needsCopyReference = t;
            }
            if (t instanceof KryoCopyable) {
                t = ((KryoCopyable) t).copy(this);
            } else {
                t = serializer.copy(this, t);
            }
            if (this.needsCopyReference != null) {
                reference(t);
            }
            if (Log.TRACE != null || (Log.DEBUG != null && this.copyDepth == 1)) {
                Util.log("Copy", t);
            }
            serializer = this.copyDepth - 1;
            this.copyDepth = serializer;
            if (serializer == null) {
                reset();
            }
            return t;
        } finally {
            serializer = this.copyDepth - 1;
            this.copyDepth = serializer;
            if (serializer == null) {
                reset();
            }
        }
    }

    public <T> T copyShallow(T t) {
        int i;
        if (t == null) {
            return null;
        }
        this.copyDepth++;
        this.copyShallow = true;
        try {
            if (this.originalToCopy == null) {
                this.originalToCopy = new IdentityMap();
            }
            T t2 = this.originalToCopy.get(t);
            if (t2 != null) {
                return t2;
            }
            if (this.copyReferences) {
                this.needsCopyReference = t;
            }
            if (t instanceof KryoCopyable) {
                t = ((KryoCopyable) t).copy(this);
            } else {
                t = getSerializer(t.getClass()).copy(this, t);
            }
            if (this.needsCopyReference != null) {
                reference(t);
            }
            if (Log.TRACE || (Log.DEBUG && this.copyDepth == 1)) {
                Util.log("Shallow copy", t);
            }
            this.copyShallow = false;
            i = this.copyDepth - 1;
            this.copyDepth = i;
            if (i == 0) {
                reset();
            }
            return t;
        } finally {
            this.copyShallow = false;
            i = this.copyDepth - 1;
            this.copyDepth = i;
            if (i == 0) {
                reset();
            }
        }
    }

    public <T> T copyShallow(T t, Serializer serializer) {
        if (t == null) {
            return null;
        }
        this.copyDepth++;
        this.copyShallow = true;
        try {
            if (this.originalToCopy == null) {
                this.originalToCopy = new IdentityMap();
            }
            T t2 = this.originalToCopy.get(t);
            if (t2 != null) {
                return t2;
            }
            if (this.copyReferences) {
                this.needsCopyReference = t;
            }
            if (t instanceof KryoCopyable) {
                t = ((KryoCopyable) t).copy(this);
            } else {
                t = serializer.copy(this, t);
            }
            if (this.needsCopyReference != null) {
                reference(t);
            }
            if (Log.TRACE != null || (Log.DEBUG != null && this.copyDepth == 1)) {
                Util.log("Shallow copy", t);
            }
            this.copyShallow = false;
            serializer = this.copyDepth - 1;
            this.copyDepth = serializer;
            if (serializer == null) {
                reset();
            }
            return t;
        } finally {
            this.copyShallow = false;
            serializer = this.copyDepth - 1;
            this.copyDepth = serializer;
            if (serializer == null) {
                reset();
            }
        }
    }

    private void beginObject() {
        if (Log.DEBUG) {
            if (this.depth == 0) {
                this.thread = Thread.currentThread();
            } else if (this.thread != Thread.currentThread()) {
                throw new ConcurrentModificationException("Kryo must not be accessed concurrently by multiple threads.");
            }
        }
        if (this.depth == this.maxDepth) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Max depth exceeded: ");
            stringBuilder.append(this.depth);
            throw new KryoException(stringBuilder.toString());
        }
        this.depth++;
    }

    public ClassResolver getClassResolver() {
        return this.classResolver;
    }

    public ReferenceResolver getReferenceResolver() {
        return this.referenceResolver;
    }

    public void setClassLoader(ClassLoader classLoader) {
        if (classLoader == null) {
            throw new IllegalArgumentException("classLoader cannot be null.");
        }
        this.classLoader = classLoader;
    }

    public ClassLoader getClassLoader() {
        return this.classLoader;
    }

    public void setRegistrationRequired(boolean z) {
        this.registrationRequired = z;
        if (Log.TRACE) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Registration required: ");
            stringBuilder.append(z);
            Log.trace("kryo", stringBuilder.toString());
        }
    }

    public boolean isRegistrationRequired() {
        return this.registrationRequired;
    }

    public void setWarnUnregisteredClasses(boolean z) {
        this.warnUnregisteredClasses = z;
        if (Log.TRACE) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Warn unregistered classes: ");
            stringBuilder.append(z);
            Log.trace("kryo", stringBuilder.toString());
        }
    }

    public boolean isWarnUnregisteredClasses() {
        return this.warnUnregisteredClasses;
    }

    public boolean setReferences(boolean z) {
        if (z == this.references) {
            return z;
        }
        this.references = z;
        if (z && this.referenceResolver == null) {
            this.referenceResolver = new MapReferenceResolver();
        }
        if (Log.TRACE) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("References: ");
            stringBuilder.append(z);
            Log.trace("kryo", stringBuilder.toString());
        }
        return z ^ 1;
    }

    public void setCopyReferences(boolean z) {
        this.copyReferences = z;
    }

    public FieldSerializerConfig getFieldSerializerConfig() {
        return this.fieldSerializerConfig;
    }

    public TaggedFieldSerializerConfig getTaggedFieldSerializerConfig() {
        return this.taggedFieldSerializerConfig;
    }

    public void setReferenceResolver(ReferenceResolver referenceResolver) {
        if (referenceResolver == null) {
            throw new IllegalArgumentException("referenceResolver cannot be null.");
        }
        this.references = true;
        this.referenceResolver = referenceResolver;
        if (Log.TRACE) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Reference resolver: ");
            stringBuilder.append(referenceResolver.getClass().getName());
            Log.trace("kryo", stringBuilder.toString());
        }
    }

    public boolean getReferences() {
        return this.references;
    }

    public void setInstantiatorStrategy(InstantiatorStrategy instantiatorStrategy) {
        this.strategy = instantiatorStrategy;
    }

    public InstantiatorStrategy getInstantiatorStrategy() {
        return this.strategy;
    }

    protected ObjectInstantiator newInstantiator(Class cls) {
        return this.strategy.newInstantiatorOf(cls);
    }

    public <T> T newInstance(Class<T> cls) {
        Registration registration = getRegistration((Class) cls);
        ObjectInstantiator instantiator = registration.getInstantiator();
        if (instantiator == null) {
            instantiator = newInstantiator(cls);
            registration.setInstantiator(instantiator);
        }
        return instantiator.newInstance();
    }

    public ObjectMap getContext() {
        if (this.context == null) {
            this.context = new ObjectMap();
        }
        return this.context;
    }

    public ObjectMap getGraphContext() {
        if (this.graphContext == null) {
            this.graphContext = new ObjectMap();
        }
        return this.graphContext;
    }

    public int getDepth() {
        return this.depth;
    }

    public IdentityMap getOriginalToCopyMap() {
        return this.originalToCopy;
    }

    public void setAutoReset(boolean z) {
        this.autoReset = z;
    }

    public void setMaxDepth(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxDepth must be > 0.");
        }
        this.maxDepth = i;
    }

    public boolean isFinal(Class cls) {
        if (cls == null) {
            throw new IllegalArgumentException("type cannot be null.");
        } else if (cls.isArray()) {
            return Modifier.isFinal(Util.getElementClass(cls).getModifiers());
        } else {
            return Modifier.isFinal(cls.getModifiers());
        }
    }

    protected boolean isClosure(Class cls) {
        if (cls != null) {
            return cls.getName().indexOf(47) >= null ? true : null;
        } else {
            throw new IllegalArgumentException("type cannot be null.");
        }
    }

    public GenericsResolver getGenericsResolver() {
        return this.genericsResolver;
    }

    public StreamFactory getStreamFactory() {
        return this.streamFactory;
    }

    public void setStreamFactory(StreamFactory streamFactory) {
        this.streamFactory = streamFactory;
    }

    @Deprecated
    public void setAsmEnabled(boolean z) {
        this.fieldSerializerConfig.setUseAsm(z);
    }

    @Deprecated
    public boolean getAsmEnabled() {
        return this.fieldSerializerConfig.isUseAsm();
    }
}
