package android.arch.persistence.room.p006b;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.database.Cursor;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import com.tinder.api.ManagerWebServices;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.arch.persistence.room.b.b */
public class C0080b {
    /* renamed from: a */
    public final String f205a;
    /* renamed from: b */
    public final Map<String, C0076a> f206b;
    /* renamed from: c */
    public final Set<C0077b> f207c;
    @Nullable
    /* renamed from: d */
    public final Set<C0079d> f208d;

    /* renamed from: android.arch.persistence.room.b.b$a */
    public static class C0076a {
        /* renamed from: a */
        public final String f189a;
        /* renamed from: b */
        public final String f190b;
        /* renamed from: c */
        public final boolean f191c;
        /* renamed from: d */
        public final int f192d;

        public C0076a(String str, String str2, boolean z, int i) {
            this.f189a = str;
            this.f190b = str2;
            this.f191c = z;
            this.f192d = i;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    C0076a c0076a = (C0076a) obj;
                    if (VERSION.SDK_INT >= 20) {
                        if (this.f192d != c0076a.f192d) {
                            return false;
                        }
                    } else if (m246a() != c0076a.m246a()) {
                        return false;
                    }
                    if (!this.f189a.equals(c0076a.f189a) || this.f191c != c0076a.f191c) {
                        return false;
                    }
                    if (this.f190b != null) {
                        z = this.f190b.equalsIgnoreCase(c0076a.f190b);
                    } else if (c0076a.f190b != null) {
                        z = false;
                    }
                    return z;
                }
            }
            return false;
        }

        /* renamed from: a */
        public boolean m246a() {
            return this.f192d > 0;
        }

        public int hashCode() {
            return (((((this.f189a.hashCode() * 31) + (this.f190b != null ? this.f190b.hashCode() : 0)) * 31) + (this.f191c ? 1231 : 1237)) * 31) + this.f192d;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Column{name='");
            stringBuilder.append(this.f189a);
            stringBuilder.append('\'');
            stringBuilder.append(", type='");
            stringBuilder.append(this.f190b);
            stringBuilder.append('\'');
            stringBuilder.append(", notNull=");
            stringBuilder.append(this.f191c);
            stringBuilder.append(", primaryKeyPosition=");
            stringBuilder.append(this.f192d);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: android.arch.persistence.room.b.b$b */
    public static class C0077b {
        @NonNull
        /* renamed from: a */
        public final String f193a;
        @NonNull
        /* renamed from: b */
        public final String f194b;
        @NonNull
        /* renamed from: c */
        public final String f195c;
        @NonNull
        /* renamed from: d */
        public final List<String> f196d;
        @NonNull
        /* renamed from: e */
        public final List<String> f197e;

        public C0077b(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull List<String> list, @NonNull List<String> list2) {
            this.f193a = str;
            this.f194b = str2;
            this.f195c = str3;
            this.f196d = Collections.unmodifiableList(list);
            this.f197e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    C0077b c0077b = (C0077b) obj;
                    if (this.f193a.equals(c0077b.f193a) && this.f194b.equals(c0077b.f194b) && this.f195c.equals(c0077b.f195c) && this.f196d.equals(c0077b.f196d)) {
                        return this.f197e.equals(c0077b.f197e);
                    }
                    return false;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f193a.hashCode() * 31) + this.f194b.hashCode()) * 31) + this.f195c.hashCode()) * 31) + this.f196d.hashCode()) * 31) + this.f197e.hashCode();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ForeignKey{referenceTable='");
            stringBuilder.append(this.f193a);
            stringBuilder.append('\'');
            stringBuilder.append(", onDelete='");
            stringBuilder.append(this.f194b);
            stringBuilder.append('\'');
            stringBuilder.append(", onUpdate='");
            stringBuilder.append(this.f195c);
            stringBuilder.append('\'');
            stringBuilder.append(", columnNames=");
            stringBuilder.append(this.f196d);
            stringBuilder.append(", referenceColumnNames=");
            stringBuilder.append(this.f197e);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: android.arch.persistence.room.b.b$c */
    static class C0078c implements Comparable<C0078c> {
        /* renamed from: a */
        final int f198a;
        /* renamed from: b */
        final int f199b;
        /* renamed from: c */
        final String f200c;
        /* renamed from: d */
        final String f201d;

        public /* synthetic */ int compareTo(Object obj) {
            return m247a((C0078c) obj);
        }

        C0078c(int i, int i2, String str, String str2) {
            this.f198a = i;
            this.f199b = i2;
            this.f200c = str;
            this.f201d = str2;
        }

        /* renamed from: a */
        public int m247a(C0078c c0078c) {
            int i = this.f198a - c0078c.f198a;
            return i == 0 ? this.f199b - c0078c.f199b : i;
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: android.arch.persistence.room.b.b$d */
    public static class C0079d {
        /* renamed from: a */
        public final String f202a;
        /* renamed from: b */
        public final boolean f203b;
        /* renamed from: c */
        public final List<String> f204c;

        public C0079d(String str, boolean z, List<String> list) {
            this.f202a = str;
            this.f203b = z;
            this.f204c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    C0079d c0079d = (C0079d) obj;
                    if (this.f203b != c0079d.f203b || !this.f204c.equals(c0079d.f204c)) {
                        return false;
                    }
                    if (this.f202a.startsWith("index_")) {
                        return c0079d.f202a.startsWith("index_");
                    }
                    return this.f202a.equals(c0079d.f202a);
                }
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            if (this.f202a.startsWith("index_")) {
                hashCode = "index_".hashCode();
            } else {
                hashCode = this.f202a.hashCode();
            }
            return (((hashCode * 31) + this.f203b) * 31) + this.f204c.hashCode();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Index{name='");
            stringBuilder.append(this.f202a);
            stringBuilder.append('\'');
            stringBuilder.append(", unique=");
            stringBuilder.append(this.f203b);
            stringBuilder.append(", columns=");
            stringBuilder.append(this.f204c);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    public C0080b(String str, Map<String, C0076a> map, Set<C0077b> set, Set<C0079d> set2) {
        this.f205a = str;
        this.f206b = Collections.unmodifiableMap(map);
        this.f207c = Collections.unmodifiableSet(set);
        if (set2 == null) {
            str = null;
        } else {
            str = Collections.unmodifiableSet(set2);
        }
        this.f208d = str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r4 != r5) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = 0;
        if (r5 == 0) goto L_0x0063;
    L_0x0007:
        r2 = r4.getClass();
        r3 = r5.getClass();
        if (r2 == r3) goto L_0x0012;
    L_0x0011:
        goto L_0x0063;
    L_0x0012:
        r5 = (android.arch.persistence.room.p006b.C0080b) r5;
        r2 = r4.f205a;
        if (r2 == 0) goto L_0x0023;
    L_0x0018:
        r2 = r4.f205a;
        r3 = r5.f205a;
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x0028;
    L_0x0022:
        goto L_0x0027;
    L_0x0023:
        r2 = r5.f205a;
        if (r2 == 0) goto L_0x0028;
    L_0x0027:
        return r1;
    L_0x0028:
        r2 = r4.f206b;
        if (r2 == 0) goto L_0x0037;
    L_0x002c:
        r2 = r4.f206b;
        r3 = r5.f206b;
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x003c;
    L_0x0036:
        goto L_0x003b;
    L_0x0037:
        r2 = r5.f206b;
        if (r2 == 0) goto L_0x003c;
    L_0x003b:
        return r1;
    L_0x003c:
        r2 = r4.f207c;
        if (r2 == 0) goto L_0x004b;
    L_0x0040:
        r2 = r4.f207c;
        r3 = r5.f207c;
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x0050;
    L_0x004a:
        goto L_0x004f;
    L_0x004b:
        r2 = r5.f207c;
        if (r2 == 0) goto L_0x0050;
    L_0x004f:
        return r1;
    L_0x0050:
        r1 = r4.f208d;
        if (r1 == 0) goto L_0x0062;
    L_0x0054:
        r1 = r5.f208d;
        if (r1 != 0) goto L_0x0059;
    L_0x0058:
        goto L_0x0062;
    L_0x0059:
        r0 = r4.f208d;
        r5 = r5.f208d;
        r5 = r0.equals(r5);
        return r5;
    L_0x0062:
        return r0;
    L_0x0063:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.arch.persistence.room.b.b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((this.f205a != null ? this.f205a.hashCode() : 0) * 31) + (this.f206b != null ? this.f206b.hashCode() : 0)) * 31;
        if (this.f207c != null) {
            i = this.f207c.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TableInfo{name='");
        stringBuilder.append(this.f205a);
        stringBuilder.append('\'');
        stringBuilder.append(", columns=");
        stringBuilder.append(this.f206b);
        stringBuilder.append(", foreignKeys=");
        stringBuilder.append(this.f207c);
        stringBuilder.append(", indices=");
        stringBuilder.append(this.f208d);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static C0080b m249a(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        return new C0080b(str, C0080b.m252c(supportSQLiteDatabase, str), C0080b.m251b(supportSQLiteDatabase, str), C0080b.m253d(supportSQLiteDatabase, str));
    }

    /* renamed from: b */
    private static Set<C0077b> m251b(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        Set<C0077b> hashSet = new HashSet();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PRAGMA foreign_key_list(`");
        stringBuilder.append(str);
        stringBuilder.append("`)");
        Cursor query = supportSQLiteDatabase.query(stringBuilder.toString());
        try {
            int columnIndex = query.getColumnIndex("id");
            int columnIndex2 = query.getColumnIndex("seq");
            int columnIndex3 = query.getColumnIndex("table");
            int columnIndex4 = query.getColumnIndex("on_delete");
            int columnIndex5 = query.getColumnIndex("on_update");
            List<C0078c> a = C0080b.m250a(query);
            int count = query.getCount();
            int i = 0;
            while (i < count) {
                int i2;
                query.moveToPosition(i);
                if (query.getInt(columnIndex2) != 0) {
                    i2 = columnIndex;
                } else {
                    int i3 = query.getInt(columnIndex);
                    List arrayList = new ArrayList();
                    List arrayList2 = new ArrayList();
                    for (C0078c c0078c : a) {
                        i2 = columnIndex;
                        if (c0078c.f198a == i3) {
                            arrayList.add(c0078c.f200c);
                            arrayList2.add(c0078c.f201d);
                        }
                        columnIndex = i2;
                    }
                    i2 = columnIndex;
                    List list = arrayList2;
                    hashSet.add(new C0077b(query.getString(columnIndex3), query.getString(columnIndex4), query.getString(columnIndex5), arrayList, list));
                }
                i++;
                columnIndex = i2;
            }
            query.close();
            return hashSet;
        } catch (Throwable th) {
            Throwable th2 = th;
            query.close();
        }
    }

    /* renamed from: a */
    private static List<C0078c> m250a(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex(ManagerWebServices.PARAM_FROM);
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        List<C0078c> arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new C0078c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: c */
    private static Map<String, C0076a> m252c(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PRAGMA table_info(`");
        stringBuilder.append(str);
        stringBuilder.append("`)");
        supportSQLiteDatabase = supportSQLiteDatabase.query(stringBuilder.toString());
        str = new HashMap();
        try {
            if (supportSQLiteDatabase.getColumnCount() > 0) {
                int columnIndex = supportSQLiteDatabase.getColumnIndex("name");
                int columnIndex2 = supportSQLiteDatabase.getColumnIndex("type");
                int columnIndex3 = supportSQLiteDatabase.getColumnIndex("notnull");
                int columnIndex4 = supportSQLiteDatabase.getColumnIndex("pk");
                while (supportSQLiteDatabase.moveToNext()) {
                    String string = supportSQLiteDatabase.getString(columnIndex);
                    str.put(string, new C0076a(string, supportSQLiteDatabase.getString(columnIndex2), supportSQLiteDatabase.getInt(columnIndex3) != 0, supportSQLiteDatabase.getInt(columnIndex4)));
                }
            }
            supportSQLiteDatabase.close();
            return str;
        } catch (Throwable th) {
            supportSQLiteDatabase.close();
        }
    }

    @Nullable
    /* renamed from: d */
    private static Set<C0079d> m253d(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PRAGMA index_list(`");
        stringBuilder.append(str);
        stringBuilder.append("`)");
        str = supportSQLiteDatabase.query(stringBuilder.toString());
        try {
            int columnIndex = str.getColumnIndex("name");
            int columnIndex2 = str.getColumnIndex("origin");
            int columnIndex3 = str.getColumnIndex("unique");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    Set hashSet = new HashSet();
                    while (str.moveToNext()) {
                        if ("c".equals(str.getString(columnIndex2))) {
                            String string = str.getString(columnIndex);
                            boolean z = true;
                            if (str.getInt(columnIndex3) != 1) {
                                z = false;
                            }
                            C0079d a = C0080b.m248a(supportSQLiteDatabase, string, z);
                            if (a == null) {
                                str.close();
                                return null;
                            }
                            hashSet.add(a);
                        }
                    }
                    str.close();
                    return hashSet;
                }
            }
            str.close();
            return null;
        } catch (Throwable th) {
            str.close();
        }
    }

    @Nullable
    /* renamed from: a */
    private static C0079d m248a(SupportSQLiteDatabase supportSQLiteDatabase, String str, boolean z) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PRAGMA index_xinfo(`");
        stringBuilder.append(str);
        stringBuilder.append("`)");
        supportSQLiteDatabase = supportSQLiteDatabase.query(stringBuilder.toString());
        try {
            int columnIndex = supportSQLiteDatabase.getColumnIndex("seqno");
            int columnIndex2 = supportSQLiteDatabase.getColumnIndex("cid");
            int columnIndex3 = supportSQLiteDatabase.getColumnIndex("name");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    TreeMap treeMap = new TreeMap();
                    while (supportSQLiteDatabase.moveToNext()) {
                        if (supportSQLiteDatabase.getInt(columnIndex2) >= 0) {
                            int i = supportSQLiteDatabase.getInt(columnIndex);
                            treeMap.put(Integer.valueOf(i), supportSQLiteDatabase.getString(columnIndex3));
                        }
                    }
                    List arrayList = new ArrayList(treeMap.size());
                    arrayList.addAll(treeMap.values());
                    C0079d c0079d = new C0079d(str, z, arrayList);
                    supportSQLiteDatabase.close();
                    return c0079d;
                }
            }
            supportSQLiteDatabase.close();
            return null;
        } catch (Throwable th) {
            supportSQLiteDatabase.close();
        }
    }
}
