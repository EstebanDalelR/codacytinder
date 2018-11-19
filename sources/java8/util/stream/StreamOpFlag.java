package java8.util.stream;

import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java8.util.Maps;
import java8.util.Spliterator;

enum StreamOpFlag {
    DISTINCT(0, set(Type.SPLITERATOR).m59696a(Type.STREAM).m59699c(Type.OP)),
    SORTED(1, set(Type.SPLITERATOR).m59696a(Type.STREAM).m59699c(Type.OP)),
    ORDERED(2, set(Type.SPLITERATOR).m59696a(Type.STREAM).m59699c(Type.OP).m59698b(Type.TERMINAL_OP).m59698b(Type.UPSTREAM_TERMINAL_OP)),
    SIZED(3, set(Type.SPLITERATOR).m59696a(Type.STREAM).m59698b(Type.OP)),
    SHORT_CIRCUIT(12, set(Type.OP).m59696a(Type.TERMINAL_OP));
    
    private static final int CLEAR_BITS = 2;
    private static final int FLAG_MASK = 0;
    private static final int FLAG_MASK_IS = 0;
    private static final int FLAG_MASK_NOT = 0;
    static final int INITIAL_OPS_VALUE = 0;
    static final int IS_DISTINCT = 0;
    static final int IS_ORDERED = 0;
    static final int IS_SHORT_CIRCUIT = 0;
    static final int IS_SIZED = 0;
    static final int IS_SORTED = 0;
    static final int NOT_DISTINCT = 0;
    static final int NOT_ORDERED = 0;
    static final int NOT_SIZED = 0;
    static final int NOT_SORTED = 0;
    static final int OP_MASK = 0;
    private static final int PRESERVE_BITS = 3;
    private static final int SET_BITS = 1;
    static final int SPLITERATOR_CHARACTERISTICS_MASK = 0;
    static final int STREAM_MASK = 0;
    static final int TERMINAL_OP_MASK = 0;
    static final int UPSTREAM_TERMINAL_OP_MASK = 0;
    private final int bitPosition;
    private final int clear;
    private final Map<Type, Integer> maskTable;
    private final int preserve;
    private final int set;

    private static class MaskBuilder {
        /* renamed from: a */
        final Map<Type, Integer> f48908a;

        MaskBuilder(Map<Type, Integer> map) {
            this.f48908a = map;
        }

        /* renamed from: a */
        MaskBuilder m59697a(Type type, Integer num) {
            this.f48908a.put(type, num);
            return this;
        }

        /* renamed from: a */
        MaskBuilder m59696a(Type type) {
            return m59697a(type, Integer.valueOf(1));
        }

        /* renamed from: b */
        MaskBuilder m59698b(Type type) {
            return m59697a(type, Integer.valueOf(2));
        }

        /* renamed from: c */
        MaskBuilder m59699c(Type type) {
            return m59697a(type, Integer.valueOf(3));
        }

        /* renamed from: a */
        Map<Type, Integer> m59695a() {
            if (this.f48908a instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) this.f48908a;
                for (Object putIfAbsent : Type.values()) {
                    concurrentMap.putIfAbsent(putIfAbsent, Integer.valueOf(0));
                }
                return concurrentMap;
            }
            for (Object a : Type.values()) {
                Maps.m59107a(this.f48908a, a, Integer.valueOf(0));
            }
            return this.f48908a;
        }
    }

    enum Type {
        private static final /* synthetic */ Type[] $VALUES = null;
        public static final Type OP = null;
        public static final Type SPLITERATOR = null;
        public static final Type STREAM = null;
        public static final Type TERMINAL_OP = null;
        public static final Type UPSTREAM_TERMINAL_OP = null;

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        static {
            SPLITERATOR = new Type("SPLITERATOR", 0);
            STREAM = new Type("STREAM", 1);
            OP = new Type("OP", 2);
            TERMINAL_OP = new Type("TERMINAL_OP", 3);
            UPSTREAM_TERMINAL_OP = new Type("UPSTREAM_TERMINAL_OP", 4);
            $VALUES = new Type[]{SPLITERATOR, STREAM, OP, TERMINAL_OP, UPSTREAM_TERMINAL_OP};
        }
    }

    static {
        SPLITERATOR_CHARACTERISTICS_MASK = createMask(Type.SPLITERATOR);
        STREAM_MASK = createMask(Type.STREAM);
        OP_MASK = createMask(Type.OP);
        TERMINAL_OP_MASK = createMask(Type.TERMINAL_OP);
        UPSTREAM_TERMINAL_OP_MASK = createMask(Type.UPSTREAM_TERMINAL_OP);
        FLAG_MASK = createFlagMask();
        FLAG_MASK_IS = STREAM_MASK;
        FLAG_MASK_NOT = STREAM_MASK << 1;
        INITIAL_OPS_VALUE = FLAG_MASK_IS | FLAG_MASK_NOT;
        IS_DISTINCT = DISTINCT.set;
        NOT_DISTINCT = DISTINCT.clear;
        IS_SORTED = SORTED.set;
        NOT_SORTED = SORTED.clear;
        IS_ORDERED = ORDERED.set;
        NOT_ORDERED = ORDERED.clear;
        IS_SIZED = SIZED.set;
        NOT_SIZED = SIZED.clear;
        IS_SHORT_CIRCUIT = SHORT_CIRCUIT.set;
    }

    private static MaskBuilder set(Type type) {
        return new MaskBuilder(new EnumMap(Type.class)).m59696a(type);
    }

    private StreamOpFlag(int i, MaskBuilder maskBuilder) {
        this.maskTable = maskBuilder.m59695a();
        i *= 2;
        this.bitPosition = i;
        this.set = 1 << i;
        this.clear = 2 << i;
        this.preserve = 3 << i;
    }

    int set() {
        return this.set;
    }

    int clear() {
        return this.clear;
    }

    boolean isStreamFlag() {
        return ((Integer) this.maskTable.get(Type.STREAM)).intValue() > 0;
    }

    boolean isKnown(int i) {
        return (i & this.preserve) == this.set;
    }

    boolean isCleared(int i) {
        return (i & this.preserve) == this.clear;
    }

    boolean isPreserved(int i) {
        return (i & this.preserve) == this.preserve;
    }

    boolean canSet(Type type) {
        return (((Integer) this.maskTable.get(type)).intValue() & 1) > null;
    }

    private static int createMask(Type type) {
        int i = 0;
        for (StreamOpFlag streamOpFlag : values()) {
            i |= ((Integer) streamOpFlag.maskTable.get(type)).intValue() << streamOpFlag.bitPosition;
        }
        return i;
    }

    private static int createFlagMask() {
        int i = 0;
        for (StreamOpFlag streamOpFlag : values()) {
            i |= streamOpFlag.preserve;
        }
        return i;
    }

    private static int getMask(int i) {
        if (i == 0) {
            return FLAG_MASK;
        }
        return (((i & FLAG_MASK_NOT) >> 1) | (((FLAG_MASK_IS & i) << 1) | i)) ^ -1;
    }

    static int combineOpFlags(int i, int i2) {
        return i | (i2 & getMask(i));
    }

    static int toStreamFlags(int i) {
        return i & (((i ^ -1) >> 1) & FLAG_MASK_IS);
    }

    static int toCharacteristics(int i) {
        return i & SPLITERATOR_CHARACTERISTICS_MASK;
    }

    static int fromCharacteristics(Spliterator<?> spliterator) {
        int characteristics = spliterator.characteristics();
        if ((characteristics & 4) == 0 || spliterator.getComparator() == null) {
            return SPLITERATOR_CHARACTERISTICS_MASK & characteristics;
        }
        return (SPLITERATOR_CHARACTERISTICS_MASK & characteristics) & -5;
    }

    static int fromCharacteristics(int i) {
        return i & SPLITERATOR_CHARACTERISTICS_MASK;
    }
}
