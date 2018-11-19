package com.tinder.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.Gson;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import p000a.p001a.C0001a;

@Deprecated
public class SparksEvent {
    private static final Gson GSON = new Gson();
    @NonNull
    public final String name;
    @NonNull
    public final Map<String, Object> params;
    public final long timestamp;

    public SparksEvent(@NonNull String str) {
        this(str, System.currentTimeMillis(), null);
    }

    public SparksEvent(@NonNull String str, long j, @Nullable Map<String, Object> map) {
        this.name = str;
        this.timestamp = j;
        this.params = map == null ? new ConcurrentHashMap(20) : new ConcurrentHashMap(map);
    }

    public SparksEvent put(@NonNull String str, JSONArray jSONArray) {
        if (str == null) {
            C0001a.e("Cannot add null key to SparksEvent parameters", new Object[null]);
            return this;
        }
        this.params.put(str, GSON.toJson(jSONArray));
        return this;
    }

    public SparksEvent put(@NonNull String str, byte b) {
        if (str == null) {
            C0001a.e("Cannot add null key to SparksEvent parameters.", new Object[(byte) 0]);
            return this;
        }
        this.params.put(str, Byte.valueOf(b));
        return this;
    }

    public SparksEvent put(@NonNull String str, byte[] bArr) {
        if (str == null) {
            C0001a.e("Cannot add null key to SparksEvent parameters.", new Object[null]);
            return this;
        }
        this.params.put(str, bArr);
        return this;
    }

    public SparksEvent put(@NonNull String str, char c) {
        if (str == null) {
            C0001a.e("Cannot add null key to SparksEvent parameters.", new Object['\u0000']);
            return this;
        }
        this.params.put(str, Character.valueOf(c));
        return this;
    }

    public SparksEvent put(@NonNull String str, char[] cArr) {
        if (str == null) {
            C0001a.e("Cannot add null key to SparksEvent parameters.", new Object[null]);
            return this;
        }
        this.params.put(str, cArr);
        return this;
    }

    public SparksEvent put(@NonNull String str, int i) {
        if (str == null) {
            C0001a.e("Cannot add null key to SparksEvent parameters.", new Object[0]);
            return this;
        }
        this.params.put(str, Integer.valueOf(i));
        return this;
    }

    public SparksEvent put(@NonNull String str, float f) {
        if (str == null) {
            C0001a.e("Cannot add null key to SparksEvent parameters.", new Object[0]);
            return this;
        }
        this.params.put(str, Float.valueOf(f));
        return this;
    }

    public SparksEvent put(@NonNull String str, long j) {
        if (str == null) {
            C0001a.e("Cannot add null key to SparksEvent parameters.", new Object[0]);
            return this;
        }
        this.params.put(str, Long.valueOf(j));
        return this;
    }

    public SparksEvent put(@NonNull String str, double d) {
        if (str == null) {
            C0001a.e("Cannot add null key to SparksEvent parameters.", new Object[0.0d]);
            return this;
        }
        this.params.put(str, Double.valueOf(d));
        return this;
    }

    public SparksEvent put(@NonNull String str, boolean z) {
        if (str == null) {
            C0001a.e("Cannot add null key to SparksEvent parameters.", new Object[false]);
            return this;
        }
        this.params.put(str, Boolean.valueOf(z));
        return this;
    }

    public SparksEvent put(@NonNull String str, @NonNull String str2) {
        if (str != null) {
            if (str2 != null) {
                this.params.put(str, str2);
                return this;
            }
        }
        C0001a.e("Cannot add null key or value to SparksEvent parameters.", new Object[null]);
        return this;
    }

    public SparksEvent put(@NonNull String str, @NonNull List<String> list) {
        if (str != null) {
            if (list != null) {
                this.params.put(str, list);
                return this;
            }
        }
        C0001a.e("Cannot add null key or value to SparksEvent parameters. asdfhjbasdvk", new Object[null]);
        return this;
    }

    public SparksEvent put(@NonNull String str, @NonNull int[] iArr) {
        if (str != null) {
            if (iArr.length != 0) {
                this.params.put(str, iArr);
                return this;
            }
        }
        C0001a.e("Cannot add null key or value to SparksEvent parameters.", new Object[null]);
        return this;
    }

    public SparksEvent put(@NonNull String str, @NonNull Map<String, Object> map) {
        if (str != null) {
            if (map.size() != 0) {
                this.params.put(str, map);
                return this;
            }
        }
        C0001a.e("Cannot add null key or value to SparksEvent parameters.", new Object[null]);
        return this;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SparksEvent{name='");
        stringBuilder.append(this.name);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SparksEvent)) {
            return null;
        }
        return this.name.equals(((SparksEvent) obj).name);
    }

    public int hashCode() {
        return this.name.hashCode();
    }
}
