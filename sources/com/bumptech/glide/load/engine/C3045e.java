package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.engine.e */
class C3045e implements Key {
    /* renamed from: a */
    private final String f9490a;
    /* renamed from: b */
    private final int f9491b;
    /* renamed from: c */
    private final int f9492c;
    /* renamed from: d */
    private final ResourceDecoder f9493d;
    /* renamed from: e */
    private final ResourceDecoder f9494e;
    /* renamed from: f */
    private final Transformation f9495f;
    /* renamed from: g */
    private final ResourceEncoder f9496g;
    /* renamed from: h */
    private final ResourceTranscoder f9497h;
    /* renamed from: i */
    private final Encoder f9498i;
    /* renamed from: j */
    private final Key f9499j;
    /* renamed from: k */
    private String f9500k;
    /* renamed from: l */
    private int f9501l;
    /* renamed from: m */
    private Key f9502m;

    public C3045e(String str, Key key, int i, int i2, ResourceDecoder resourceDecoder, ResourceDecoder resourceDecoder2, Transformation transformation, ResourceEncoder resourceEncoder, ResourceTranscoder resourceTranscoder, Encoder encoder) {
        this.f9490a = str;
        this.f9499j = key;
        this.f9491b = i;
        this.f9492c = i2;
        this.f9493d = resourceDecoder;
        this.f9494e = resourceDecoder2;
        this.f9495f = transformation;
        this.f9496g = resourceEncoder;
        this.f9497h = resourceTranscoder;
        this.f9498i = encoder;
    }

    /* renamed from: a */
    public Key m11999a() {
        if (this.f9502m == null) {
            this.f9502m = new C3049h(this.f9490a, this.f9499j);
        }
        return this.f9502m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                C3045e c3045e = (C3045e) obj;
                if (!this.f9490a.equals(c3045e.f9490a) || !this.f9499j.equals(c3045e.f9499j) || this.f9492c != c3045e.f9492c || this.f9491b != c3045e.f9491b) {
                    return false;
                }
                if (((this.f9495f == null ? 1 : 0) ^ (c3045e.f9495f == null ? 1 : 0)) != 0) {
                    return false;
                }
                if (this.f9495f != null && !this.f9495f.getId().equals(c3045e.f9495f.getId())) {
                    return false;
                }
                if (((this.f9494e == null ? 1 : 0) ^ (c3045e.f9494e == null ? 1 : 0)) != 0) {
                    return false;
                }
                if (this.f9494e != null && !this.f9494e.getId().equals(c3045e.f9494e.getId())) {
                    return false;
                }
                if (((this.f9493d == null ? 1 : 0) ^ (c3045e.f9493d == null ? 1 : 0)) != 0) {
                    return false;
                }
                if (this.f9493d != null && !this.f9493d.getId().equals(c3045e.f9493d.getId())) {
                    return false;
                }
                if (((this.f9496g == null ? 1 : 0) ^ (c3045e.f9496g == null ? 1 : 0)) != 0) {
                    return false;
                }
                if (this.f9496g != null && !this.f9496g.getId().equals(c3045e.f9496g.getId())) {
                    return false;
                }
                if (((this.f9497h == null ? 1 : 0) ^ (c3045e.f9497h == null ? 1 : 0)) != 0) {
                    return false;
                }
                if (this.f9497h != null && !this.f9497h.getId().equals(c3045e.f9497h.getId())) {
                    return false;
                }
                if (((this.f9498i == null ? 1 : 0) ^ (c3045e.f9498i == null ? 1 : 0)) != 0) {
                    return false;
                }
                return this.f9498i == null || this.f9498i.getId().equals(c3045e.f9498i.getId()) != null;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f9501l == 0) {
            this.f9501l = this.f9490a.hashCode();
            this.f9501l = (this.f9501l * 31) + this.f9499j.hashCode();
            this.f9501l = (this.f9501l * 31) + this.f9491b;
            this.f9501l = (this.f9501l * 31) + this.f9492c;
            int i = 0;
            this.f9501l = (this.f9501l * 31) + (this.f9493d != null ? this.f9493d.getId().hashCode() : 0);
            this.f9501l = (this.f9501l * 31) + (this.f9494e != null ? this.f9494e.getId().hashCode() : 0);
            this.f9501l = (this.f9501l * 31) + (this.f9495f != null ? this.f9495f.getId().hashCode() : 0);
            this.f9501l = (this.f9501l * 31) + (this.f9496g != null ? this.f9496g.getId().hashCode() : 0);
            this.f9501l = (this.f9501l * 31) + (this.f9497h != null ? this.f9497h.getId().hashCode() : 0);
            int i2 = this.f9501l * 31;
            if (this.f9498i != null) {
                i = this.f9498i.getId().hashCode();
            }
            this.f9501l = i2 + i;
        }
        return this.f9501l;
    }

    public String toString() {
        if (this.f9500k == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("EngineKey{");
            stringBuilder.append(this.f9490a);
            stringBuilder.append('+');
            stringBuilder.append(this.f9499j);
            stringBuilder.append("+[");
            stringBuilder.append(this.f9491b);
            stringBuilder.append('x');
            stringBuilder.append(this.f9492c);
            stringBuilder.append("]+");
            stringBuilder.append('\'');
            stringBuilder.append(this.f9493d != null ? this.f9493d.getId() : "");
            stringBuilder.append('\'');
            stringBuilder.append('+');
            stringBuilder.append('\'');
            stringBuilder.append(this.f9494e != null ? this.f9494e.getId() : "");
            stringBuilder.append('\'');
            stringBuilder.append('+');
            stringBuilder.append('\'');
            stringBuilder.append(this.f9495f != null ? this.f9495f.getId() : "");
            stringBuilder.append('\'');
            stringBuilder.append('+');
            stringBuilder.append('\'');
            stringBuilder.append(this.f9496g != null ? this.f9496g.getId() : "");
            stringBuilder.append('\'');
            stringBuilder.append('+');
            stringBuilder.append('\'');
            stringBuilder.append(this.f9497h != null ? this.f9497h.getId() : "");
            stringBuilder.append('\'');
            stringBuilder.append('+');
            stringBuilder.append('\'');
            stringBuilder.append(this.f9498i != null ? this.f9498i.getId() : "");
            stringBuilder.append('\'');
            stringBuilder.append('}');
            this.f9500k = stringBuilder.toString();
        }
        return this.f9500k;
    }

    public void updateDiskCacheKey(MessageDigest messageDigest) throws UnsupportedEncodingException {
        byte[] array = ByteBuffer.allocate(8).putInt(this.f9491b).putInt(this.f9492c).array();
        this.f9499j.updateDiskCacheKey(messageDigest);
        messageDigest.update(this.f9490a.getBytes("UTF-8"));
        messageDigest.update(array);
        messageDigest.update((this.f9493d != null ? this.f9493d.getId() : "").getBytes("UTF-8"));
        messageDigest.update((this.f9494e != null ? this.f9494e.getId() : "").getBytes("UTF-8"));
        messageDigest.update((this.f9495f != null ? this.f9495f.getId() : "").getBytes("UTF-8"));
        messageDigest.update((this.f9496g != null ? this.f9496g.getId() : "").getBytes("UTF-8"));
        messageDigest.update((this.f9498i != null ? this.f9498i.getId() : "").getBytes("UTF-8"));
    }
}
