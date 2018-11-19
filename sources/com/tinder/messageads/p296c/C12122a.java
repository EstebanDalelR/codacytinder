package com.tinder.messageads.p296c;

import android.net.Uri;
import com.google.android.gms.ads.formats.C2356c.C2355b;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.tinder.addy.Ad;
import com.tinder.addy.Ad.AdType;
import com.tinder.addy.source.nativedfp.NativeDfpLoader.AdFactory;
import com.tinder.api.ManagerWebServices;
import com.tinder.messageads.model.C12131a;
import com.tinder.messageads.model.MessageAdType;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19303i;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/messageads/factory/MessageAdFactory;", "Lcom/tinder/addy/source/nativedfp/NativeDfpLoader$AdFactory;", "adType", "Lcom/tinder/messageads/model/MessageAdType;", "(Lcom/tinder/messageads/model/MessageAdType;)V", "create", "Lcom/tinder/messageads/model/MessageAd;", "wrapped", "Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;", "parseDate", "Lorg/joda/time/DateTime;", "date", "", "message-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.messageads.c.a */
public abstract class C12122a implements AdFactory {
    /* renamed from: a */
    private final MessageAdType f39344a;

    public C12122a(@NotNull MessageAdType messageAdType) {
        C2668g.b(messageAdType, "adType");
        this.f39344a = messageAdType;
    }

    public /* synthetic */ Ad create(NativeCustomTemplateAd nativeCustomTemplateAd) {
        return m48264a(nativeCustomTemplateAd);
    }

    @NotNull
    /* renamed from: a */
    public C12131a m48264a(@NotNull NativeCustomTemplateAd nativeCustomTemplateAd) {
        C2668g.b(nativeCustomTemplateAd, "wrapped");
        CharSequence text = nativeCustomTemplateAd.getText("line_item_id");
        if (text == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        String obj = text.toString();
        if ((C19303i.a(obj) ^ 1) == 0) {
            throw new IllegalArgumentException("Line item id cannot be empty".toString());
        }
        AdType adType = this.f39344a;
        C2355b image = nativeCustomTemplateAd.getImage("logo");
        Uri b = image != null ? image.b() : null;
        if (b == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        String uri = b.toString();
        C2668g.a(uri, "requireNotNull(wrapped.g…OGO_KEY)?.uri).toString()");
        CharSequence text2 = nativeCustomTemplateAd.getText("clickthrough_text");
        if (text2 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        String obj2 = text2.toString();
        text2 = nativeCustomTemplateAd.getText("clickthrough_url");
        if (text2 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        String obj3 = text2.toString();
        text2 = nativeCustomTemplateAd.getText("creative_id");
        if (text2 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        String obj4 = text2.toString();
        text2 = nativeCustomTemplateAd.getText("body");
        if (text2 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        String obj5 = text2.toString();
        text2 = nativeCustomTemplateAd.getText(ManagerWebServices.PARAM_JOB_TITLE);
        if (text2 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        String obj6 = text2.toString();
        text2 = nativeCustomTemplateAd.getText("end_date");
        if (text2 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        return new C12131a(nativeCustomTemplateAd, adType, uri, obj2, obj, obj3, obj4, obj5, obj6, m48263a(text2.toString()));
    }

    /* renamed from: a */
    private final org.joda.time.DateTime m48263a(java.lang.String r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = com.tinder.messageads.p296c.C9906b.f32746a;	 Catch:{ IllegalArgumentException -> 0x000e }
        r0 = r0.d(r3);	 Catch:{ IllegalArgumentException -> 0x000e }
        r1 = "DATE_FORMATTER.parseDateTime(date)";	 Catch:{ IllegalArgumentException -> 0x000e }
        kotlin.jvm.internal.C2668g.a(r0, r1);	 Catch:{ IllegalArgumentException -> 0x000e }
        goto L_0x002a;
    L_0x000e:
        r0 = com.tinder.messageads.p296c.C9906b.f32747b;	 Catch:{ IllegalArgumentException -> 0x001c }
        r0 = r0.d(r3);	 Catch:{ IllegalArgumentException -> 0x001c }
        r1 = "FIRST_ALTERNATIVE_DATE_F…ATTER.parseDateTime(date)";	 Catch:{ IllegalArgumentException -> 0x001c }
        kotlin.jvm.internal.C2668g.a(r0, r1);	 Catch:{ IllegalArgumentException -> 0x001c }
        goto L_0x002a;
    L_0x001c:
        r0 = com.tinder.messageads.p296c.C9906b.f32748c;
        r3 = r0.d(r3);
        r0 = "SECOND_ALTERNATIVE_DATE_…ATTER.parseDateTime(date)";
        kotlin.jvm.internal.C2668g.a(r3, r0);
        r0 = r3;
    L_0x002a:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.messageads.c.a.a(java.lang.String):org.joda.time.DateTime");
    }
}
