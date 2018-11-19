package com.tinder.smsauth.ui.view;

import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tinder.smsauth.entity.C14975c;
import com.tinder.smsauth.ui.C15008k.C15005d;
import com.tinder.smsauth.ui.C15008k.C15006e;
import com.tinder.smsauth.ui.C15008k.C15007f;
import java.util.List;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.collections.C17554o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0016\u0010\u0013\u001a\u00020\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tR\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/tinder/smsauth/ui/view/CountryCodeAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/tinder/smsauth/ui/view/CountryCodeAdapter$ViewHolder;", "onCountryCodeSelected", "Lkotlin/Function1;", "Lcom/tinder/smsauth/entity/Country;", "", "(Lkotlin/jvm/functions/Function1;)V", "countries", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setCountries", "ViewHolder", "ui_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.smsauth.ui.view.a */
final class C16807a extends Adapter<C16806a> {
    /* renamed from: a */
    private List<C14975c> f51846a = C17554o.m64195a();
    /* renamed from: b */
    private final Function1<C14975c, C15813i> f51847b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/tinder/smsauth/ui/view/CountryCodeAdapter$onCreateViewHolder$1$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.view.a$b */
    static final class C15027b implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C16806a f46798a;
        /* renamed from: b */
        final /* synthetic */ C16807a f46799b;

        C15027b(C16806a c16806a, C16807a c16807a) {
            this.f46798a = c16806a;
            this.f46799b = c16807a;
        }

        public final void onClick(View view) {
            view = this.f46798a.getAdapterPosition();
            if (view != -1) {
                this.f46799b.f51847b.invoke(this.f46799b.f51846a.get(view));
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/tinder/smsauth/ui/view/CountryCodeAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "countryCode", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getCountryCode$ui_release", "()Landroid/widget/TextView;", "countryName", "getCountryName$ui_release", "ui_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.view.a$a */
    public static final class C16806a extends ViewHolder {
        /* renamed from: a */
        private final TextView f51844a;
        /* renamed from: b */
        private final TextView f51845b;

        public C16806a(@NotNull View view) {
            C2668g.b(view, "view");
            super(view);
            this.f51844a = (TextView) view.findViewById(C15005d.countryName);
            this.f51845b = (TextView) view.findViewById(C15005d.countryCode);
        }

        /* renamed from: a */
        public final TextView m62336a() {
            return this.f51844a;
        }

        /* renamed from: b */
        public final TextView m62337b() {
            return this.f51845b;
        }
    }

    public /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        m62341a((C16806a) viewHolder, i);
    }

    public /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m62340a(viewGroup, i);
    }

    public C16807a(@NotNull Function1<? super C14975c, C15813i> function1) {
        C2668g.b(function1, "onCountryCodeSelected");
        this.f51847b = function1;
    }

    public int getItemCount() {
        return this.f51846a.size();
    }

    /* renamed from: a */
    public final void m62342a(@Nullable List<C14975c> list) {
        if (list == null) {
            list = C17554o.m64195a();
        }
        this.f51846a = list;
        notifyDataSetChanged();
    }

    @NotNull
    /* renamed from: a */
    public C16806a m62340a(@NotNull ViewGroup viewGroup, int i) {
        C2668g.b(viewGroup, "parent");
        viewGroup = LayoutInflater.from(viewGroup.getContext()).inflate(C15006e.country_code_entry, viewGroup, false);
        C2668g.a(viewGroup, "view");
        i = new C16806a(viewGroup);
        i.itemView.setOnClickListener(new C15027b(i, this));
        return i;
    }

    /* renamed from: a */
    public void m62341a(@NotNull C16806a c16806a, int i) {
        C2668g.b(c16806a, "holder");
        C14975c c14975c = (C14975c) this.f51846a.get(i);
        TextView a = c16806a.m62336a();
        C2668g.a(a, "holder.countryName");
        a.setText(c14975c.m56563c());
        a = c16806a.m62337b();
        C2668g.a(a, "holder.countryCode");
        c16806a = c16806a.itemView;
        C2668g.a(c16806a, "holder.itemView");
        c16806a = c16806a.getContext();
        C2668g.a(c16806a, "holder.itemView.context");
        a.setText(c16806a.getResources().getString(C15007f.sms_country_code_with_prefix, new Object[]{String.valueOf(c14975c.m56561a())}));
    }
}
