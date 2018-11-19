package android.arch.persistence.db;

/* renamed from: android.arch.persistence.db.a */
public final class C2714a implements SupportSQLiteQuery {
    /* renamed from: a */
    private final String f8567a;
    /* renamed from: b */
    private final Object[] f8568b;

    public C2714a(String str, Object[] objArr) {
        this.f8567a = str;
        this.f8568b = objArr;
    }

    public C2714a(String str) {
        this(str, null);
    }

    public String getSql() {
        return this.f8567a;
    }

    public void bindTo(SupportSQLiteProgram supportSQLiteProgram) {
        C2714a.m10550a(supportSQLiteProgram, this.f8568b);
    }

    /* renamed from: a */
    public static void m10550a(SupportSQLiteProgram supportSQLiteProgram, Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                C2714a.m10549a(supportSQLiteProgram, i, obj);
            }
        }
    }

    /* renamed from: a */
    private static void m10549a(SupportSQLiteProgram supportSQLiteProgram, int i, Object obj) {
        if (obj == null) {
            supportSQLiteProgram.bindNull(i);
        } else if (obj instanceof byte[]) {
            supportSQLiteProgram.bindBlob(i, (byte[]) obj);
        } else if (obj instanceof Float) {
            supportSQLiteProgram.bindDouble(i, (double) ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            supportSQLiteProgram.bindDouble(i, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            supportSQLiteProgram.bindLong(i, ((Long) obj).longValue());
        } else if (obj instanceof Integer) {
            supportSQLiteProgram.bindLong(i, (long) ((Integer) obj).intValue());
        } else if (obj instanceof Short) {
            supportSQLiteProgram.bindLong(i, (long) ((Short) obj).shortValue());
        } else if (obj instanceof Byte) {
            supportSQLiteProgram.bindLong(i, (long) ((Byte) obj).byteValue());
        } else if (obj instanceof String) {
            supportSQLiteProgram.bindString(i, (String) obj);
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Cannot bind ");
            stringBuilder.append(obj);
            stringBuilder.append(" at index ");
            stringBuilder.append(i);
            stringBuilder.append(" Supported types: null, byte[], float, double, long, int, short, byte,");
            stringBuilder.append(" string");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
