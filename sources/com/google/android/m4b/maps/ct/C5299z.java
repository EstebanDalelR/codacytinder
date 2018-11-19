package com.google.android.m4b.maps.ct;

/* renamed from: com.google.android.m4b.maps.ct.z */
public final class C5299z {
    /* renamed from: a */
    private static int f19678a = 11;
    /* renamed from: b */
    private static int f19679b = 12;
    /* renamed from: c */
    private static int f19680c = 16;
    /* renamed from: d */
    private static int f19681d = 26;

    /* renamed from: com.google.android.m4b.maps.ct.z$a */
    public enum C5296a {
        DOUBLE(C5297b.DOUBLE, 1),
        FLOAT(C5297b.FLOAT, 5),
        INT64(C5297b.LONG, 0),
        UINT64(C5297b.LONG, 0),
        INT32(C5297b.INT, 0),
        FIXED64(C5297b.LONG, 1),
        FIXED32(C5297b.INT, 5),
        BOOL(C5297b.BOOLEAN, 0),
        STRING(C5297b.STRING, 2) {
            /* renamed from: c */
            public final boolean mo5390c() {
                return false;
            }
        },
        GROUP(C5297b.MESSAGE, 3) {
            /* renamed from: c */
            public final boolean mo5390c() {
                return false;
            }
        },
        MESSAGE(C5297b.MESSAGE, 2) {
            /* renamed from: c */
            public final boolean mo5390c() {
                return false;
            }
        },
        BYTES(C5297b.BYTE_STRING, 2) {
            /* renamed from: c */
            public final boolean mo5390c() {
                return false;
            }
        },
        UINT32(C5297b.INT, 0),
        ENUM(C5297b.ENUM, 0),
        SFIXED32(C5297b.INT, 5),
        SFIXED64(C5297b.LONG, 1),
        SINT32(C5297b.INT, 0),
        SINT64(C5297b.LONG, 0);
        
        /* renamed from: s */
        private final C5297b f19661s;
        /* renamed from: t */
        private final int f19662t;

        /* renamed from: c */
        public boolean mo5390c() {
            return true;
        }

        private C5296a(C5297b c5297b, int i) {
            this.f19661s = c5297b;
            this.f19662t = i;
        }

        /* renamed from: a */
        public final C5297b m23478a() {
            return this.f19661s;
        }

        /* renamed from: b */
        public final int m23479b() {
            return this.f19662t;
        }
    }

    /* renamed from: com.google.android.m4b.maps.ct.z$b */
    public enum C5297b {
        INT(Integer.valueOf(0)),
        LONG(Long.valueOf(0)),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.valueOf(false)),
        STRING(""),
        BYTE_STRING(C5255d.f19541a),
        ENUM(null),
        MESSAGE(null);
        
        /* renamed from: j */
        private final Object f19673j;

        private C5297b(Object obj) {
            this.f19673j = obj;
        }
    }

    /* renamed from: com.google.android.m4b.maps.ct.z$c */
    enum C5298c {
        LOOSE {
            /* renamed from: a */
            final Object mo5391a(C5257e c5257e) {
                return c5257e.m23305j();
            }
        },
        STRICT {
            /* renamed from: a */
            final Object mo5391a(C5257e c5257e) {
                return c5257e.m23306k();
            }
        },
        LAZY {
            /* renamed from: a */
            final Object mo5391a(C5257e c5257e) {
                return c5257e.m23307l();
            }
        };

        /* renamed from: a */
        abstract Object mo5391a(C5257e c5257e);
    }

    /* renamed from: a */
    public static int m23482a(int i) {
        return i & 7;
    }

    /* renamed from: a */
    static int m23483a(int i, int i2) {
        return (i << 3) | i2;
    }

    /* renamed from: b */
    public static int m23485b(int i) {
        return i >>> 3;
    }

    /* renamed from: a */
    static Object m23484a(C5257e c5257e, C5296a c5296a, C5298c c5298c) {
        switch (c5296a) {
            case DOUBLE:
                return Double.valueOf(c5257e.m23295b());
            case FLOAT:
                return Float.valueOf(c5257e.m23297c());
            case INT64:
                return Long.valueOf(c5257e.m23300e());
            case UINT64:
                return Long.valueOf(c5257e.m23299d());
            case INT32:
                return Integer.valueOf(c5257e.m23301f());
            case FIXED64:
                return Long.valueOf(c5257e.m23302g());
            case FIXED32:
                return Integer.valueOf(c5257e.m23303h());
            case BOOL:
                return Boolean.valueOf(c5257e.m23304i());
            case BYTES:
                return c5257e.m23307l();
            case UINT32:
                return Integer.valueOf(c5257e.m23308m());
            case SFIXED32:
                return Integer.valueOf(c5257e.m23310o());
            case SFIXED64:
                return Long.valueOf(c5257e.m23311p());
            case SINT32:
                return Integer.valueOf(c5257e.m23312q());
            case SINT64:
                return Long.valueOf(c5257e.m23313r());
            case STRING:
                return c5298c.mo5391a(c5257e);
            case GROUP:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case MESSAGE:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case ENUM:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
