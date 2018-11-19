package io.branch.referral;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.ClipboardManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import io.branch.referral.SharingHelper.SHARE_WITH;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ShareLinkManager {
    /* renamed from: k */
    private static int f48159k = 100;
    /* renamed from: a */
    C15576a f48160a;
    /* renamed from: b */
    Branch$BranchLinkShareListener f48161b;
    /* renamed from: c */
    Branch$IChannelProperties f48162c;
    /* renamed from: d */
    Context f48163d;
    /* renamed from: e */
    final int f48164e = 5;
    /* renamed from: f */
    final int f48165f = 100;
    /* renamed from: g */
    private List<ResolveInfo> f48166g;
    /* renamed from: h */
    private Intent f48167h;
    /* renamed from: i */
    private final int f48168i = Color.argb(60, 17, 4, 56);
    /* renamed from: j */
    private final int f48169j = Color.argb(20, 17, 4, 56);
    /* renamed from: l */
    private boolean f48170l = false;
    /* renamed from: m */
    private int f48171m = -1;
    /* renamed from: n */
    private int f48172n = 50;
    /* renamed from: o */
    private Branch$c f48173o;
    /* renamed from: p */
    private List<String> f48174p = new ArrayList();
    /* renamed from: q */
    private List<String> f48175q = new ArrayList();

    /* renamed from: io.branch.referral.ShareLinkManager$2 */
    class C155712 implements OnDismissListener {
        /* renamed from: a */
        final /* synthetic */ ShareLinkManager f48153a;

        C155712(ShareLinkManager shareLinkManager) {
            this.f48153a = shareLinkManager;
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (this.f48153a.f48161b != null) {
                this.f48153a.f48161b.onShareLinkDialogDismissed();
                this.f48153a.f48161b = null;
            }
            if (this.f48153a.f48170l == null) {
                this.f48153a.f48163d = null;
                this.f48153a.f48173o = null;
            }
            this.f48153a.f48160a = null;
        }
    }

    private class CopyLinkItem extends ResolveInfo {
        private CopyLinkItem() {
        }

        public CharSequence loadLabel(PackageManager packageManager) {
            return ShareLinkManager.this.f48173o.m58168n();
        }

        public Drawable loadIcon(PackageManager packageManager) {
            return ShareLinkManager.this.f48173o.m58167m();
        }
    }

    private class MoreShareItem extends ResolveInfo {
        private MoreShareItem() {
        }

        public CharSequence loadLabel(PackageManager packageManager) {
            return ShareLinkManager.this.f48173o.m58166l();
        }

        public Drawable loadIcon(PackageManager packageManager) {
            return ShareLinkManager.this.f48173o.m58165k();
        }
    }

    /* renamed from: io.branch.referral.ShareLinkManager$a */
    private class C15572a extends BaseAdapter {
        /* renamed from: a */
        public int f48154a;
        /* renamed from: b */
        final /* synthetic */ ShareLinkManager f48155b;

        public long getItemId(int i) {
            return (long) i;
        }

        private C15572a(ShareLinkManager shareLinkManager) {
            this.f48155b = shareLinkManager;
            this.f48154a = -1;
        }

        public int getCount() {
            return this.f48155b.f48166g.size();
        }

        public Object getItem(int i) {
            return this.f48155b.f48166g.get(i);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = new C15573b(this.f48155b, this.f48155b.f48163d);
            } else {
                view = (C15573b) view;
            }
            ResolveInfo resolveInfo = (ResolveInfo) this.f48155b.f48166g.get(i);
            view.m58259a(resolveInfo.loadLabel(this.f48155b.f48163d.getPackageManager()).toString(), resolveInfo.loadIcon(this.f48155b.f48163d.getPackageManager()), i == this.f48154a ? 1 : 0);
            view.setTag(resolveInfo);
            view.setClickable(false);
            return view;
        }

        public boolean isEnabled(int i) {
            return this.f48154a < 0;
        }
    }

    /* renamed from: io.branch.referral.ShareLinkManager$b */
    private class C15573b extends TextView {
        /* renamed from: a */
        Context f48156a;
        /* renamed from: b */
        int f48157b;
        /* renamed from: c */
        final /* synthetic */ ShareLinkManager f48158c;

        public C15573b(ShareLinkManager shareLinkManager, Context context) {
            this.f48158c = shareLinkManager;
            super(context);
            this.f48156a = context;
            setPadding(100, 5, 5, 5);
            setGravity(8388627);
            setMinWidth(this.f48156a.getResources().getDisplayMetrics().widthPixels);
            this.f48157b = shareLinkManager.f48172n != 0 ? C2666j.b(context, shareLinkManager.f48172n) : null;
        }

        /* renamed from: a */
        public void m58259a(String str, Drawable drawable, boolean z) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\t");
            stringBuilder.append(str);
            setText(stringBuilder.toString());
            setTag(str);
            if (drawable == null) {
                setTextAppearance(this.f48156a, 16973890);
                setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
            } else {
                if (this.f48157b != 0) {
                    drawable.setBounds(0, 0, this.f48157b, this.f48157b);
                    setCompoundDrawables(drawable, null, null, null);
                } else {
                    setCompoundDrawablesWithIntrinsicBounds(drawable, null, null, null);
                }
                setTextAppearance(this.f48156a, 16973892);
                ShareLinkManager.f48159k = Math.max(ShareLinkManager.f48159k, drawable.getIntrinsicHeight() + 5);
            }
            setMinHeight(ShareLinkManager.f48159k);
            setTextColor(this.f48156a.getResources().getColor(17170444));
            if (z) {
                setBackgroundColor(this.f48158c.f48168i);
            } else {
                setBackgroundColor(this.f48158c.f48169j);
            }
        }
    }

    ShareLinkManager() {
    }

    /* renamed from: a */
    public Dialog m58277a(Branch$c branch$c) {
        this.f48173o = branch$c;
        this.f48163d = branch$c.m58149b();
        this.f48161b = branch$c.m58162h();
        this.f48162c = branch$c.m58163i();
        this.f48167h = new Intent("android.intent.action.SEND");
        this.f48167h.setType("text/plain");
        this.f48171m = branch$c.m58176v();
        this.f48174p = branch$c.m58159e();
        this.f48175q = branch$c.m58157d();
        this.f48172n = branch$c.m58177w();
        try {
            m58270a(branch$c.m58155c());
        } catch (Branch$c branch$c2) {
            branch$c2.printStackTrace();
            if (this.f48161b != null) {
                this.f48161b.onLinkShareResponse(null, null, new C15583e("Trouble sharing link", -110));
            } else {
                Log.i("BranchSDK", "Unable create share options. Couldn't find applications on device to share the link.");
            }
        }
        return this.f48160a;
    }

    /* renamed from: a */
    public void m58278a(boolean z) {
        if (this.f48160a != null && this.f48160a.isShowing()) {
            if (z) {
                this.f48160a.cancel();
            } else {
                this.f48160a.dismiss();
            }
        }
    }

    /* renamed from: a */
    private void m58270a(List<SHARE_WITH> list) {
        View listView;
        PackageManager packageManager = this.f48163d.getPackageManager();
        List arrayList = new ArrayList();
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(this.f48167h, 65536);
        List arrayList2 = new ArrayList();
        final List arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList(list);
        Iterator it = queryIntentActivities.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            ResolveInfo resolveInfo = (ResolveInfo) it.next();
            String str = resolveInfo.activityInfo.packageName;
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                SHARE_WITH share_with = (SHARE_WITH) it2.next();
                if (resolveInfo.activityInfo != null && str.toLowerCase().contains(share_with.toString().toLowerCase())) {
                    obj = share_with;
                    break;
                }
            }
            if (obj != null) {
                arrayList.add(resolveInfo);
                list.remove(obj);
            }
        }
        queryIntentActivities.removeAll(arrayList);
        queryIntentActivities.addAll(0, arrayList);
        if (this.f48174p.size() > 0) {
            for (ResolveInfo resolveInfo2 : queryIntentActivities) {
                if (this.f48174p.contains(resolveInfo2.activityInfo.packageName)) {
                    arrayList2.add(resolveInfo2);
                }
            }
        } else {
            arrayList2 = queryIntentActivities;
        }
        for (ResolveInfo resolveInfo3 : r2) {
            if (!this.f48175q.contains(resolveInfo3.activityInfo.packageName)) {
                arrayList3.add(resolveInfo3);
            }
        }
        for (ResolveInfo resolveInfo32 : queryIntentActivities) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                if (((SHARE_WITH) it3.next()).toString().equalsIgnoreCase(resolveInfo32.activityInfo.packageName)) {
                    arrayList3.add(resolveInfo32);
                }
            }
        }
        arrayList3.add(new CopyLinkItem());
        queryIntentActivities.add(new CopyLinkItem());
        arrayList.add(new CopyLinkItem());
        if (arrayList.size() > 1) {
            if (queryIntentActivities.size() > arrayList.size()) {
                arrayList.add(new MoreShareItem());
            }
            this.f48166g = arrayList;
        } else {
            this.f48166g = arrayList3;
        }
        final Object c15572a = new C15572a();
        if (this.f48171m <= 1 || VERSION.SDK_INT < 21) {
            listView = new ListView(this.f48163d);
        } else {
            listView = new ListView(this.f48163d, null, 0, this.f48171m);
        }
        listView.setHorizontalFadingEdgeEnabled(false);
        listView.setBackgroundColor(-1);
        listView.setSelector(new ColorDrawable(0));
        if (this.f48173o.m58175u() != null) {
            listView.addHeaderView(this.f48173o.m58175u(), null, false);
        } else if (!TextUtils.isEmpty(this.f48173o.m58174t())) {
            View textView = new TextView(this.f48163d);
            textView.setText(this.f48173o.m58174t());
            textView.setBackgroundColor(this.f48169j);
            textView.setTextColor(this.f48169j);
            textView.setTextAppearance(this.f48163d, 16973892);
            textView.setTextColor(this.f48163d.getResources().getColor(17170432));
            textView.setPadding(100, 5, 5, 5);
            listView.addHeaderView(textView, null, false);
        }
        listView.setAdapter(c15572a);
        if (this.f48173o.m58173s() >= 0) {
            listView.setDividerHeight(this.f48173o.m58173s());
        } else if (this.f48173o.m58171q()) {
            listView.setDividerHeight(0);
        }
        listView.setOnItemClickListener(new OnItemClickListener(this) {
            /* renamed from: d */
            final /* synthetic */ ShareLinkManager f48152d;

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if ((view.getTag() instanceof MoreShareItem) != null) {
                    this.f48152d.f48166g = arrayList3;
                    c15572a.notifyDataSetChanged();
                    return;
                }
                if (this.f48152d.f48161b != null) {
                    adapterView = "";
                    if (!(view.getTag() == null || this.f48152d.f48163d == null || ((ResolveInfo) view.getTag()).loadLabel(this.f48152d.f48163d.getPackageManager()) == null)) {
                        adapterView = ((ResolveInfo) view.getTag()).loadLabel(this.f48152d.f48163d.getPackageManager()).toString();
                    }
                    this.f48152d.f48173o.m58170p().m63278b(((ResolveInfo) view.getTag()).loadLabel(this.f48152d.f48163d.getPackageManager()).toString());
                    this.f48152d.f48161b.onChannelSelected(adapterView);
                }
                c15572a.f48154a = i - listView.getHeaderViewsCount();
                c15572a.notifyDataSetChanged();
                this.f48152d.m58265a((ResolveInfo) view.getTag());
                if (this.f48152d.f48160a != null) {
                    this.f48152d.f48160a.cancel();
                }
            }
        });
        if (this.f48173o.m58172r() > null) {
            this.f48160a = new C15576a(this.f48163d, this.f48173o.m58172r());
        } else {
            this.f48160a = new C15576a(this.f48163d, this.f48173o.m58171q());
        }
        this.f48160a.setContentView(listView);
        this.f48160a.show();
        if (this.f48161b != null) {
            this.f48161b.onShareLinkDialogLaunched();
        }
        this.f48160a.setOnDismissListener(new C155712(this));
    }

    /* renamed from: a */
    private void m58265a(final ResolveInfo resolveInfo) {
        this.f48170l = true;
        final String charSequence = resolveInfo.loadLabel(this.f48163d.getPackageManager()).toString();
        this.f48173o.m58170p().m63277a(new Branch$BranchLinkCreateListener(this) {
            /* renamed from: c */
            final /* synthetic */ ShareLinkManager f52979c;

            public void onLinkCreate(String str, C15583e c15583e) {
                if (c15583e == null) {
                    this.f52979c.m58266a(resolveInfo, str, charSequence);
                    return;
                }
                String j = this.f52979c.f48173o.m58164j();
                if (j == null || j.trim().length() <= 0) {
                    if (this.f52979c.f48161b != null) {
                        this.f52979c.f48161b.onLinkShareResponse(str, charSequence, c15583e);
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unable to share link ");
                        stringBuilder.append(c15583e.m58330a());
                        Log.i("BranchSDK", stringBuilder.toString());
                    }
                    if (c15583e.m58331b() != -113) {
                        if (c15583e.m58331b() != -117) {
                            this.f52979c.m58278a(false);
                            this.f52979c.f48170l = false;
                            return;
                        }
                    }
                    this.f52979c.m58266a(resolveInfo, str, charSequence);
                    return;
                }
                this.f52979c.m58266a(resolveInfo, j, charSequence);
            }
        }, true);
    }

    /* renamed from: a */
    private void m58266a(ResolveInfo resolveInfo, String str, String str2) {
        if (this.f48161b != null) {
            this.f48161b.onLinkShareResponse(str, str2, null);
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Shared link with ");
            stringBuilder.append(str2);
            Log.i("BranchSDK", stringBuilder.toString());
        }
        if (resolveInfo instanceof CopyLinkItem) {
            m58269a(str, this.f48173o.m58160f());
            return;
        }
        this.f48167h.setPackage(resolveInfo.activityInfo.packageName);
        resolveInfo = this.f48173o.m58161g();
        String f = this.f48173o.m58160f();
        if (this.f48162c != null) {
            CharSequence sharingTitleForChannel = this.f48162c.getSharingTitleForChannel(str2);
            str2 = this.f48162c.getSharingMessageForChannel(str2);
            if (!TextUtils.isEmpty(sharingTitleForChannel)) {
                resolveInfo = sharingTitleForChannel;
            }
            if (!TextUtils.isEmpty(str2)) {
                f = str2;
            }
        }
        if (resolveInfo != null && resolveInfo.trim().length() > null) {
            this.f48167h.putExtra("android.intent.extra.SUBJECT", resolveInfo);
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(f);
        stringBuilder.append("\n");
        stringBuilder.append(str);
        this.f48167h.putExtra("android.intent.extra.TEXT", stringBuilder.toString());
        this.f48163d.startActivity(this.f48167h);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    private void m58269a(String str, String str2) {
        if (VERSION.SDK_INT < 11) {
            ((ClipboardManager) this.f48163d.getSystemService("clipboard")).setText(str);
        } else {
            ((android.content.ClipboardManager) this.f48163d.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(str2, str));
        }
        Toast.makeText(this.f48163d, this.f48173o.m58169o(), 0).show();
    }
}
