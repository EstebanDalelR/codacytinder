package com.google.android.gms.internal;

import android.content.SharedPreferences.Editor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

@zzzv
public final class alk {
    /* renamed from: a */
    private final Collection<ald<?>> f15413a = new ArrayList();
    /* renamed from: b */
    private final Collection<ald<String>> f15414b = new ArrayList();
    /* renamed from: c */
    private final Collection<ald<String>> f15415c = new ArrayList();

    /* renamed from: a */
    public final List<String> m19327a() {
        List<String> arrayList = new ArrayList();
        for (ald a : this.f15414b) {
            String str = (String) aja.m19221f().m19334a(a);
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void m19328a(Editor editor, int i, JSONObject jSONObject) {
        for (ald ald : this.f15413a) {
            if (ald.m19325c() == 1) {
                ald.mo4352a(editor, ald.mo4351a(jSONObject));
            }
        }
    }

    /* renamed from: a */
    public final void m19329a(ald ald) {
        this.f15413a.add(ald);
    }

    /* renamed from: b */
    public final List<String> m19330b() {
        List<String> a = m19327a();
        for (ald a2 : this.f15415c) {
            String str = (String) aja.m19221f().m19334a(a2);
            if (str != null) {
                a.add(str);
            }
        }
        return a;
    }

    /* renamed from: b */
    public final void m19331b(ald<String> ald) {
        this.f15414b.add(ald);
    }

    /* renamed from: c */
    public final void m19332c(ald<String> ald) {
        this.f15415c.add(ald);
    }
}
