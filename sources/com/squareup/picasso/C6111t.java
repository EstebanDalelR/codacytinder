package com.squareup.picasso;

import java.io.PrintWriter;

/* renamed from: com.squareup.picasso.t */
public class C6111t {
    /* renamed from: a */
    public final int f22479a;
    /* renamed from: b */
    public final int f22480b;
    /* renamed from: c */
    public final long f22481c;
    /* renamed from: d */
    public final long f22482d;
    /* renamed from: e */
    public final long f22483e;
    /* renamed from: f */
    public final long f22484f;
    /* renamed from: g */
    public final long f22485g;
    /* renamed from: h */
    public final long f22486h;
    /* renamed from: i */
    public final long f22487i;
    /* renamed from: j */
    public final long f22488j;
    /* renamed from: k */
    public final int f22489k;
    /* renamed from: l */
    public final int f22490l;
    /* renamed from: m */
    public final int f22491m;
    /* renamed from: n */
    public final long f22492n;

    public C6111t(int i, int i2, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i3, int i4, int i5, long j9) {
        this.f22479a = i;
        this.f22480b = i2;
        this.f22481c = j;
        this.f22482d = j2;
        this.f22483e = j3;
        this.f22484f = j4;
        this.f22485g = j5;
        this.f22486h = j6;
        this.f22487i = j7;
        this.f22488j = j8;
        this.f22489k = i3;
        this.f22490l = i4;
        this.f22491m = i5;
        this.f22492n = j9;
    }

    /* renamed from: a */
    public void m26557a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.f22479a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f22480b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((double) ((((float) this.f22480b) / ((float) this.f22479a)) * 100.0f)));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f22481c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f22482d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f22489k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f22483e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f22486h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f22490l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f22484f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f22491m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f22485g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f22487i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f22488j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("StatsSnapshot{maxSize=");
        stringBuilder.append(this.f22479a);
        stringBuilder.append(", size=");
        stringBuilder.append(this.f22480b);
        stringBuilder.append(", cacheHits=");
        stringBuilder.append(this.f22481c);
        stringBuilder.append(", cacheMisses=");
        stringBuilder.append(this.f22482d);
        stringBuilder.append(", downloadCount=");
        stringBuilder.append(this.f22489k);
        stringBuilder.append(", totalDownloadSize=");
        stringBuilder.append(this.f22483e);
        stringBuilder.append(", averageDownloadSize=");
        stringBuilder.append(this.f22486h);
        stringBuilder.append(", totalOriginalBitmapSize=");
        stringBuilder.append(this.f22484f);
        stringBuilder.append(", totalTransformedBitmapSize=");
        stringBuilder.append(this.f22485g);
        stringBuilder.append(", averageOriginalBitmapSize=");
        stringBuilder.append(this.f22487i);
        stringBuilder.append(", averageTransformedBitmapSize=");
        stringBuilder.append(this.f22488j);
        stringBuilder.append(", originalBitmapCount=");
        stringBuilder.append(this.f22490l);
        stringBuilder.append(", transformedBitmapCount=");
        stringBuilder.append(this.f22491m);
        stringBuilder.append(", timeStamp=");
        stringBuilder.append(this.f22492n);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
