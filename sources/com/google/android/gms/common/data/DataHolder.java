package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.facebook.ads.AdError;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.zzbfm;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@KeepName
public final class DataHolder extends zzbfm implements Closeable {
    public static final Creator<DataHolder> CREATOR = new C2487c();
    private static final C2485a zzfwi = new C3814b(new String[0], null);
    private boolean mClosed;
    private final int zzcd;
    private int zzeck;
    private final String[] zzfwb;
    private Bundle zzfwc;
    private final CursorWindow[] zzfwd;
    private final Bundle zzfwe;
    private int[] zzfwf;
    int zzfwg;
    private boolean zzfwh;

    /* renamed from: com.google.android.gms.common.data.DataHolder$a */
    public static class C2485a {
        /* renamed from: a */
        private final String[] f7547a;
        /* renamed from: b */
        private final ArrayList<HashMap<String, Object>> f7548b;
        /* renamed from: c */
        private final String f7549c;
        /* renamed from: d */
        private final HashMap<Object, Integer> f7550d;
        /* renamed from: e */
        private boolean f7551e;
        /* renamed from: f */
        private String f7552f;

        private C2485a(String[] strArr, String str) {
            this.f7547a = (String[]) ad.m9045a((Object) strArr);
            this.f7548b = new ArrayList();
            this.f7549c = str;
            this.f7550d = new HashMap();
            this.f7551e = false;
            this.f7552f = null;
        }
    }

    public static class zzb extends RuntimeException {
        public zzb(String str) {
            super(str);
        }
    }

    DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.mClosed = false;
        this.zzfwh = true;
        this.zzeck = i;
        this.zzfwb = strArr;
        this.zzfwd = cursorWindowArr;
        this.zzcd = i2;
        this.zzfwe = bundle;
    }

    private DataHolder(C2485a c2485a, int i, Bundle bundle) {
        this(c2485a.f7547a, zza(c2485a, -1), i, null);
    }

    private DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i, Bundle bundle) {
        this.mClosed = false;
        this.zzfwh = true;
        this.zzeck = 1;
        this.zzfwb = (String[]) ad.m9045a((Object) strArr);
        this.zzfwd = (CursorWindow[]) ad.m9045a((Object) cursorWindowArr);
        this.zzcd = i;
        this.zzfwe = bundle;
        zzajz();
    }

    private static CursorWindow[] zza(C2485a c2485a, int i) {
        int i2 = 0;
        if (c2485a.f7547a.length == 0) {
            return new CursorWindow[0];
        }
        List b = c2485a.f7548b;
        int size = b.size();
        CursorWindow cursorWindow = new CursorWindow(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(cursorWindow);
        cursorWindow.setNumColumns(c2485a.f7547a.length);
        CursorWindow cursorWindow2 = cursorWindow;
        int i3 = 0;
        Object obj = null;
        while (i3 < size) {
            try {
                if (!cursorWindow2.allocRow()) {
                    StringBuilder stringBuilder = new StringBuilder(72);
                    stringBuilder.append("Allocating additional cursor window for large data set (row ");
                    stringBuilder.append(i3);
                    stringBuilder.append(")");
                    Log.d("DataHolder", stringBuilder.toString());
                    cursorWindow2 = new CursorWindow(false);
                    cursorWindow2.setStartPosition(i3);
                    cursorWindow2.setNumColumns(c2485a.f7547a.length);
                    arrayList.add(cursorWindow2);
                    if (!cursorWindow2.allocRow()) {
                        Log.e("DataHolder", "Unable to allocate row to hold data.");
                        arrayList.remove(cursorWindow2);
                        return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
                    }
                }
                Map map = (Map) b.get(i3);
                boolean z = true;
                for (int i4 = 0; i4 < c2485a.f7547a.length && z; i4++) {
                    String str = c2485a.f7547a[i4];
                    Object obj2 = map.get(str);
                    if (obj2 == null) {
                        z = cursorWindow2.putNull(i3, i4);
                    } else if (obj2 instanceof String) {
                        z = cursorWindow2.putString((String) obj2, i3, i4);
                    } else {
                        long longValue;
                        if (obj2 instanceof Long) {
                            longValue = ((Long) obj2).longValue();
                        } else if (obj2 instanceof Integer) {
                            z = cursorWindow2.putLong((long) ((Integer) obj2).intValue(), i3, i4);
                        } else if (obj2 instanceof Boolean) {
                            longValue = ((Boolean) obj2).booleanValue() ? 1 : 0;
                        } else if (obj2 instanceof byte[]) {
                            z = cursorWindow2.putBlob((byte[]) obj2, i3, i4);
                        } else if (obj2 instanceof Double) {
                            z = cursorWindow2.putDouble(((Double) obj2).doubleValue(), i3, i4);
                        } else if (obj2 instanceof Float) {
                            z = cursorWindow2.putDouble((double) ((Float) obj2).floatValue(), i3, i4);
                        } else {
                            String valueOf = String.valueOf(obj2);
                            StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(str).length() + 32) + String.valueOf(valueOf).length());
                            stringBuilder2.append("Unsupported object for column ");
                            stringBuilder2.append(str);
                            stringBuilder2.append(": ");
                            stringBuilder2.append(valueOf);
                            throw new IllegalArgumentException(stringBuilder2.toString());
                        }
                        z = cursorWindow2.putLong(longValue, i3, i4);
                    }
                }
                if (z) {
                    obj = null;
                } else if (obj != null) {
                    throw new zzb("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                } else {
                    StringBuilder stringBuilder3 = new StringBuilder(74);
                    stringBuilder3.append("Couldn't populate window data for row ");
                    stringBuilder3.append(i3);
                    stringBuilder3.append(" - allocating new window.");
                    Log.d("DataHolder", stringBuilder3.toString());
                    cursorWindow2.freeLastRow();
                    cursorWindow2 = new CursorWindow(false);
                    cursorWindow2.setStartPosition(i3);
                    cursorWindow2.setNumColumns(c2485a.f7547a.length);
                    arrayList.add(cursorWindow2);
                    i3--;
                    obj = 1;
                }
                i3++;
            } catch (RuntimeException e) {
                i = arrayList.size();
                while (i2 < i) {
                    ((CursorWindow) arrayList.get(i2)).close();
                    i2++;
                }
                throw e;
            }
        }
        return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
    }

    public static C2485a zzb(String[] strArr) {
        return new C2485a(strArr);
    }

    public static DataHolder zzca(int i) {
        return new DataHolder(zzfwi, i, null);
    }

    private final void zzh(String str, int i) {
        if (this.zzfwc != null) {
            if (this.zzfwc.containsKey(str)) {
                if (isClosed()) {
                    throw new IllegalArgumentException("Buffer is closed.");
                }
                if (i >= 0) {
                    if (i < this.zzfwg) {
                        return;
                    }
                }
                throw new CursorIndexOutOfBoundsException(i, this.zzfwg);
            }
        }
        String str2 = "No such column: ";
        str = String.valueOf(str);
        throw new IllegalArgumentException(str.length() != 0 ? str2.concat(str) : new String(str2));
    }

    public final void close() {
        synchronized (this) {
            if (!this.mClosed) {
                this.mClosed = true;
                for (CursorWindow close : this.zzfwd) {
                    close.close();
                }
            }
        }
    }

    protected final void finalize() throws Throwable {
        try {
            if (this.zzfwh && this.zzfwd.length > 0 && !isClosed()) {
                close();
                String obj = toString();
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(obj).length() + 178);
                stringBuilder.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                stringBuilder.append(obj);
                stringBuilder.append(")");
                Log.e("DataBuffer", stringBuilder.toString());
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }

    public final int getCount() {
        return this.zzfwg;
    }

    public final int getStatusCode() {
        return this.zzcd;
    }

    public final boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.mClosed;
        }
        return z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = oj.a(parcel);
        oj.a(parcel, 1, this.zzfwb, false);
        oj.a(parcel, 2, this.zzfwd, i, false);
        oj.a(parcel, 3, this.zzcd);
        oj.a(parcel, 4, this.zzfwe, false);
        oj.a(parcel, AdError.NETWORK_ERROR_CODE, this.zzeck);
        oj.a(parcel, a);
        if ((i & 1) != 0) {
            close();
        }
    }

    public final void zza(String str, int i, int i2, CharArrayBuffer charArrayBuffer) {
        zzh(str, i);
        this.zzfwd[i2].copyStringToBuffer(i, this.zzfwc.getInt(str), charArrayBuffer);
    }

    public final Bundle zzagk() {
        return this.zzfwe;
    }

    public final void zzajz() {
        int i;
        this.zzfwc = new Bundle();
        for (i = 0; i < this.zzfwb.length; i++) {
            this.zzfwc.putInt(this.zzfwb[i], i);
        }
        this.zzfwf = new int[this.zzfwd.length];
        i = 0;
        for (int i2 = 0; i2 < this.zzfwd.length; i2++) {
            this.zzfwf[i2] = i;
            i += this.zzfwd[i2].getNumRows() - (i - this.zzfwd[i2].getStartPosition());
        }
        this.zzfwg = i;
    }

    public final long zzb(String str, int i, int i2) {
        zzh(str, i);
        return this.zzfwd[i2].getLong(i, this.zzfwc.getInt(str));
    }

    public final int zzbz(int i) {
        int i2 = 0;
        boolean z = i >= 0 && i < this.zzfwg;
        ad.m9050a(z);
        while (i2 < this.zzfwf.length) {
            if (i < this.zzfwf[i2]) {
                i2--;
                break;
            }
            i2++;
        }
        return i2 == this.zzfwf.length ? i2 - 1 : i2;
    }

    public final int zzc(String str, int i, int i2) {
        zzh(str, i);
        return this.zzfwd[i2].getInt(i, this.zzfwc.getInt(str));
    }

    public final String zzd(String str, int i, int i2) {
        zzh(str, i);
        return this.zzfwd[i2].getString(i, this.zzfwc.getInt(str));
    }

    public final boolean zze(String str, int i, int i2) {
        zzh(str, i);
        return Long.valueOf(this.zzfwd[i2].getLong(i, this.zzfwc.getInt(str))).longValue() == 1;
    }

    public final float zzf(String str, int i, int i2) {
        zzh(str, i);
        return this.zzfwd[i2].getFloat(i, this.zzfwc.getInt(str));
    }

    public final byte[] zzg(String str, int i, int i2) {
        zzh(str, i);
        return this.zzfwd[i2].getBlob(i, this.zzfwc.getInt(str));
    }

    public final boolean zzga(String str) {
        return this.zzfwc.containsKey(str);
    }

    public final boolean zzh(String str, int i, int i2) {
        zzh(str, i);
        return this.zzfwd[i2].isNull(i, this.zzfwc.getInt(str));
    }
}
