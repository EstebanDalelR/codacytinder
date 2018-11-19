package com.tinder.data.message;

import android.support.annotation.NonNull;
import com.tinder.data.message.aq.C10833b;
import com.tinder.domain.message.DeliveryStatus;
import org.joda.time.DateTime;

/* renamed from: com.tinder.data.message.d */
final class C12953d extends C10833b {
    /* renamed from: a */
    private final long f41489a;
    /* renamed from: b */
    private final String f41490b;
    /* renamed from: c */
    private final String f41491c;
    /* renamed from: d */
    private final String f41492d;
    /* renamed from: e */
    private final String f41493e;
    /* renamed from: f */
    private final String f41494f;
    /* renamed from: g */
    private final DateTime f41495g;
    /* renamed from: h */
    private final boolean f41496h;
    /* renamed from: i */
    private final MessageType f41497i;
    /* renamed from: j */
    private final DeliveryStatus f41498j;
    /* renamed from: k */
    private final boolean f41499k;

    C12953d(long j, String str, String str2, String str3, String str4, String str5, DateTime dateTime, boolean z, MessageType messageType, DeliveryStatus deliveryStatus, boolean z2) {
        this.f41489a = j;
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f41490b = str;
        if (str2 == null) {
            throw new NullPointerException("Null match_id");
        }
        this.f41491c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null to_id");
        }
        this.f41492d = str3;
        if (str4 == null) {
            throw new NullPointerException("Null from_id");
        }
        this.f41493e = str4;
        if (str5 == null) {
            throw new NullPointerException("Null text");
        }
        this.f41494f = str5;
        if (dateTime == null) {
            throw new NullPointerException("Null sent_date");
        }
        this.f41495g = dateTime;
        this.f41496h = z;
        if (messageType == null) {
            throw new NullPointerException("Null type");
        }
        this.f41497i = messageType;
        if (deliveryStatus == null) {
            throw new NullPointerException("Null delivery_status");
        }
        this.f41498j = deliveryStatus;
        this.f41499k = z2;
    }

    public long client_sequential_id() {
        return this.f41489a;
    }

    @NonNull
    public String id() {
        return this.f41490b;
    }

    @NonNull
    public String match_id() {
        return this.f41491c;
    }

    @NonNull
    public String to_id() {
        return this.f41492d;
    }

    @NonNull
    public String from_id() {
        return this.f41493e;
    }

    @NonNull
    public String text() {
        return this.f41494f;
    }

    @NonNull
    public DateTime sent_date() {
        return this.f41495g;
    }

    public boolean is_liked() {
        return this.f41496h;
    }

    @NonNull
    public MessageType type() {
        return this.f41497i;
    }

    @NonNull
    public DeliveryStatus delivery_status() {
        return this.f41498j;
    }

    public boolean is_seen() {
        return this.f41499k;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Message{client_sequential_id=");
        stringBuilder.append(this.f41489a);
        stringBuilder.append(", id=");
        stringBuilder.append(this.f41490b);
        stringBuilder.append(", match_id=");
        stringBuilder.append(this.f41491c);
        stringBuilder.append(", to_id=");
        stringBuilder.append(this.f41492d);
        stringBuilder.append(", from_id=");
        stringBuilder.append(this.f41493e);
        stringBuilder.append(", text=");
        stringBuilder.append(this.f41494f);
        stringBuilder.append(", sent_date=");
        stringBuilder.append(this.f41495g);
        stringBuilder.append(", is_liked=");
        stringBuilder.append(this.f41496h);
        stringBuilder.append(", type=");
        stringBuilder.append(this.f41497i);
        stringBuilder.append(", delivery_status=");
        stringBuilder.append(this.f41498j);
        stringBuilder.append(", is_seen=");
        stringBuilder.append(this.f41499k);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10833b)) {
            return false;
        }
        C10833b c10833b = (C10833b) obj;
        if (this.f41489a != c10833b.client_sequential_id() || !this.f41490b.equals(c10833b.id()) || !this.f41491c.equals(c10833b.match_id()) || !this.f41492d.equals(c10833b.to_id()) || !this.f41493e.equals(c10833b.from_id()) || !this.f41494f.equals(c10833b.text()) || !this.f41495g.equals(c10833b.sent_date()) || this.f41496h != c10833b.is_liked() || !this.f41497i.equals(c10833b.type()) || !this.f41498j.equals(c10833b.delivery_status()) || this.f41499k != c10833b.is_seen()) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = 1237;
        int hashCode = ((((((((((((((((((((int) (((long) 1000003) ^ ((this.f41489a >>> 32) ^ this.f41489a))) * 1000003) ^ this.f41490b.hashCode()) * 1000003) ^ this.f41491c.hashCode()) * 1000003) ^ this.f41492d.hashCode()) * 1000003) ^ this.f41493e.hashCode()) * 1000003) ^ this.f41494f.hashCode()) * 1000003) ^ this.f41495g.hashCode()) * 1000003) ^ (this.f41496h ? 1231 : 1237)) * 1000003) ^ this.f41497i.hashCode()) * 1000003) ^ this.f41498j.hashCode()) * 1000003;
        if (this.f41499k) {
            i = 1231;
        }
        return hashCode ^ i;
    }
}
