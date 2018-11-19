package com.facebook.ads.internal.view;

import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.facebook.ads.internal.adapters.C1359i;
import com.facebook.ads.internal.p041h.C1425f;
import com.facebook.ads.internal.p047k.C1490h;
import com.facebook.ads.internal.p047k.ai;
import com.facebook.ads.internal.p049l.C1517a;
import com.facebook.ads.internal.p049l.C1517a.C1516a;
import com.facebook.ads.internal.view.C1604d.C1603a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.k */
public class C3380k extends Adapter<C3379b> {
    /* renamed from: a */
    private final C1425f f10278a;
    /* renamed from: b */
    private final ai f10279b;
    /* renamed from: c */
    private final C1359i f10280c;
    @Nullable
    /* renamed from: d */
    private C1603a f10281d;
    /* renamed from: e */
    private int f10282e;
    /* renamed from: f */
    private int f10283f;
    /* renamed from: g */
    private String f10284g;
    /* renamed from: h */
    private boolean f10285h;
    /* renamed from: i */
    private int f10286i;
    /* renamed from: j */
    private List<C1612a> f10287j;

    /* renamed from: com.facebook.ads.internal.view.k$a */
    public static class C1612a {
        /* renamed from: a */
        public String f4467a;
        /* renamed from: b */
        public String f4468b;
        /* renamed from: c */
        public String f4469c;
        /* renamed from: d */
        public String f4470d;
        /* renamed from: e */
        public String f4471e;
        /* renamed from: f */
        private final int f4472f;
        /* renamed from: g */
        private final int f4473g;
        @Nullable
        /* renamed from: h */
        private C1517a f4474h;
        /* renamed from: i */
        private boolean f4475i = false;

        public C1612a(int i, int i2, String str, String str2, String str3, String str4, String str5) {
            this.f4472f = i;
            this.f4473g = i2;
            this.f4471e = str;
            this.f4467a = str2;
            this.f4468b = str3;
            this.f4469c = str4;
            this.f4470d = str5;
        }

        /* renamed from: a */
        private void m5493a(final C1425f c1425f, final ai aiVar, final String str, C1611j c1611j) {
            if (!this.f4475i) {
                if (this.f4474h != null) {
                    this.f4474h.m5351b();
                    this.f4474h = null;
                }
                this.f4474h = new C1517a(c1611j, 10, new C1516a(this) {
                    /* renamed from: d */
                    final /* synthetic */ C1612a f10276d;

                    /* renamed from: a */
                    public void mo1681a() {
                        if (!TextUtils.isEmpty(str)) {
                            Map a = this.f10276d.m5496a();
                            if (this.f10276d.f4474h != null) {
                                this.f10276d.f4474h.m5350a(a);
                            }
                            a.put("touch", C1490h.m5244a(aiVar.m5188e()));
                            c1425f.mo1743a(str, a);
                        }
                        this.f10276d.f4475i = true;
                    }
                });
                this.f4474h.m5349a(100);
                this.f4474h.m5352b(100);
                this.f4474h.m5348a();
            }
        }

        /* renamed from: a */
        public Map<String, String> m5496a() {
            Map<String, String> hashMap = new HashMap();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f4472f);
            stringBuilder.append("");
            hashMap.put("cardind", stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.f4473g);
            stringBuilder.append("");
            hashMap.put("cardcnt", stringBuilder.toString());
            return hashMap;
        }
    }

    /* renamed from: com.facebook.ads.internal.view.k$b */
    public static class C3379b extends ViewHolder {
        /* renamed from: a */
        public C1611j f10277a;

        public C3379b(C1611j c1611j) {
            super(c1611j);
            this.f10277a = c1611j;
        }
    }

    public C3380k(List<C1612a> list, C1425f c1425f, ai aiVar, C1603a c1603a, C1359i c1359i, String str, int i, int i2, int i3, boolean z) {
        this.f10278a = c1425f;
        this.f10279b = aiVar;
        this.f10281d = c1603a;
        this.f10287j = list;
        this.f10283f = i;
        this.f10280c = c1359i;
        this.f10285h = z;
        this.f10284g = str;
        this.f10282e = i3;
        this.f10286i = i2;
    }

    /* renamed from: a */
    public C3379b m13007a(ViewGroup viewGroup, int i) {
        return new C3379b(new C1611j(viewGroup.getContext(), this.f10280c, this.f10285h, this.f10278a, this.f10281d, this.f10284g));
    }

    /* renamed from: a */
    public void m13008a(C3379b c3379b, int i) {
        LayoutParams marginLayoutParams = new MarginLayoutParams(this.f10283f, -2);
        marginLayoutParams.setMargins(i == 0 ? this.f10282e : this.f10286i, 0, i >= this.f10287j.size() + -1 ? this.f10282e : this.f10286i, 0);
        C1612a c1612a = (C1612a) this.f10287j.get(i);
        c3379b.f10277a.setImageUrl(c1612a.f4471e);
        c3379b.f10277a.setLayoutParams(marginLayoutParams);
        c3379b.f10277a.m5490a(c1612a.f4467a, c1612a.f4468b);
        c3379b.f10277a.m5491a(c1612a.f4469c, c1612a.f4470d, c1612a.m5496a());
        c1612a.m5493a(this.f10278a, this.f10279b, this.f10284g, c3379b.f10277a);
    }

    public int getItemCount() {
        return this.f10287j.size();
    }

    public /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        m13008a((C3379b) viewHolder, i);
    }

    public /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m13007a(viewGroup, i);
    }
}
