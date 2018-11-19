package com.tinder.fragments;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.volley.C3001b;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.C4079e;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.C4330g;
import com.tinder.R;
import com.tinder.adapters.C6171a;
import com.tinder.api.ManagerNetwork;
import com.tinder.api.ManagerWebServices;
import com.tinder.dialogs.C8867t;
import com.tinder.interfaces.PhotoUploadSelection;
import com.tinder.managers.FacebookManager;
import com.tinder.managers.LegacyBreadCrumbTracker;
import com.tinder.managers.ManagerApp;
import com.tinder.p257g.C9645b;
import com.tinder.utils.Async;
import com.tinder.utils.ad;
import com.tinder.utils.at;
import com.tinder.utils.av;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import org.json.JSONObject;
import p000a.p001a.C0001a;

/* renamed from: com.tinder.fragments.g */
public class C13308g extends Fragment implements OnClickListener {
    @Inject
    /* renamed from: a */
    FacebookManager f42215a;
    @Inject
    /* renamed from: b */
    ManagerNetwork f42216b;
    @Inject
    /* renamed from: c */
    LegacyBreadCrumbTracker f42217c;
    /* renamed from: d */
    private View f42218d;
    /* renamed from: e */
    private GridView f42219e;
    /* renamed from: f */
    private ProgressBar f42220f;
    /* renamed from: g */
    private TextView f42221g;
    /* renamed from: h */
    private C6171a f42222h;
    /* renamed from: i */
    private boolean f42223i;
    /* renamed from: j */
    private C8867t f42224j;
    @Nullable
    /* renamed from: k */
    private String f42225k;
    @Nullable
    /* renamed from: l */
    private String f42226l;
    @Nullable
    /* renamed from: m */
    private String f42227m;

    /* renamed from: com.tinder.fragments.g$1 */
    class C143101 extends C4330g<Bitmap> {
        /* renamed from: a */
        final /* synthetic */ C13308g f45321a;

        C143101(C13308g c13308g) {
            this.f45321a = c13308g;
        }

        public /* synthetic */ void onResourceReady(Object obj, GlideAnimation glideAnimation) {
            m54423a((Bitmap) obj, glideAnimation);
        }

        public void onLoadFailed(Exception exception, Drawable drawable) {
            if (this.f45321a.f42223i == null) {
                av.a(this.f45321a.f42224j);
                this.f45321a.m51524c();
            }
        }

        /* renamed from: a */
        public void m54423a(Bitmap bitmap, GlideAnimation<? super Bitmap> glideAnimation) {
            if (this.f45321a.f42223i == null) {
                Async.a(new C11847k(this, bitmap)).a(new C11848l(this)).a();
            }
        }

        /* renamed from: a */
        final /* synthetic */ Object m54422a(Bitmap bitmap) {
            return this.f45321a.m51528a(bitmap);
        }

        /* renamed from: a */
        final /* synthetic */ void m54424a(Object obj) {
            if (this.f45321a.getActivity() != null) {
                if (!this.f45321a.getActivity().isFinishing()) {
                    String str = (String) obj;
                    av.a(this.f45321a.f42224j);
                    ((PhotoUploadSelection) this.f45321a.getActivity()).cropFbPhoto(str, this.f45321a.f42225k, this.f45321a.f42226l);
                    return;
                }
            }
            ad.c("Not telling user we cropped image, activity is null.");
        }
    }

    /* renamed from: a */
    public String m51528a(@NonNull Bitmap bitmap) {
        try {
            File file = new File(getContext().getCacheDir(), "uncropped.png");
            OutputStream fileOutputStream = new FileOutputStream(file);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Out ");
            stringBuilder.append(Boolean.toString(fileOutputStream != null));
            stringBuilder.append(" file: ");
            stringBuilder.append(file.toString());
            ad.a(stringBuilder.toString());
            bitmap.compress(CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return file.getPath();
        } catch (Bitmap bitmap2) {
            ad.a("Failed to write out image", bitmap2);
            return "";
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        ManagerApp.e().inject(this);
    }

    /* renamed from: a */
    private void m51518a() {
        if (getActivity() != null) {
            this.f42221g.setVisibility(0);
            this.f42220f.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m51519a(@NonNull String str, String str2) {
        this.f42221g.setVisibility(8);
        if (str.length() > 0) {
            if (TextUtils.isEmpty(str2)) {
                if (str.equals(ManagerWebServices.FB_PARAM_TAGGED_ID) != null) {
                    str2 = FacebookManager.m40463a(this.f42227m);
                } else {
                    str2 = FacebookManager.m40464a(str, this.f42227m);
                }
            }
            Request c4079e = new C4079e(str2, null, new C11845h(this, str), new C11846i(this));
            c4079e.setRetryPolicy(new C3001b(10000, 0, 1.0f));
            this.f42216b.addRequest(c4079e);
            return;
        }
        m51518a();
    }

    /* renamed from: a */
    final /* synthetic */ void m51532a(@NonNull String str, JSONObject jSONObject) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Graph photos response: ");
        stringBuilder.append(jSONObject.toString());
        ad.b(stringBuilder.toString());
        m51520a(jSONObject);
        if (jSONObject.has(ManagerWebServices.FB_PARAM_PAGING)) {
            try {
                String optString = jSONObject.getJSONObject(ManagerWebServices.FB_PARAM_PAGING).optString(ManagerWebServices.FB_PARAM_NEXT);
                if (!TextUtils.isEmpty(optString)) {
                    m51519a(str, optString);
                }
            } catch (String str2) {
                ad.a("Failed to get URL for album from graph response", str2);
            }
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m51530a(VolleyError volleyError) {
        C0001a.c(volleyError);
        m51518a();
    }

    /* renamed from: a */
    private void m51520a(@NonNull JSONObject jSONObject) {
        if (!this.f42223i) {
            List arrayList = new ArrayList();
            int i = 0;
            try {
                arrayList.addAll(C9645b.m40036b(jSONObject));
                this.f42222h.a(arrayList);
                this.f42220f.setVisibility(8);
                this.f42218d.setVisibility(0);
                if (this.f42222h.getCount() == null) {
                    this.f42221g.setVisibility(i);
                    this.f42219e.setClickable(true);
                    m51523b();
                }
            } catch (JSONObject jSONObject2) {
                ad.c(jSONObject2.getMessage());
                this.f42222h.a(arrayList);
                this.f42220f.setVisibility(8);
                this.f42218d.setVisibility(0);
                if (this.f42222h.getCount() == null) {
                }
            } catch (Throwable th) {
                this.f42222h.a(arrayList);
                this.f42220f.setVisibility(8);
                this.f42218d.setVisibility(0);
                if (this.f42222h.getCount() != 0) {
                    i = 8;
                }
                this.f42221g.setVisibility(i);
                this.f42219e.setClickable(true);
                m51523b();
            }
            i = 8;
            this.f42221g.setVisibility(i);
            this.f42219e.setClickable(true);
            m51523b();
        }
    }

    /* renamed from: b */
    private void m51523b() {
        this.f42219e.setOnItemClickListener(new C9638j(this));
    }

    /* renamed from: a */
    final /* synthetic */ void m51529a(AdapterView adapterView, View view, int i, long j) {
        this.f42224j.show();
        this.f42225k = this.f42222h.b(i);
        this.f42226l = this.f42222h.a(i);
        m51531a(this.f42222h.a(i));
    }

    /* renamed from: a */
    public void m51531a(String str) {
        C0994i.a(getActivity()).a(str).l().b(new C143101(this));
    }

    public void onCreate(@Nullable Bundle bundle) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("bundle=");
        stringBuilder.append(bundle);
        ad.a(stringBuilder.toString());
        super.onCreate(bundle);
        if (bundle != null) {
            this.f42225k = bundle.getString("id");
            this.f42226l = bundle.getString("source");
            bundle = new StringBuilder();
            bundle.append("mSelecteId=");
            bundle.append(this.f42225k);
            bundle.append(", mSelectedSource=");
            bundle.append(this.f42226l);
            ad.a(bundle.toString());
        }
    }

    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        layoutInflater = layoutInflater.inflate(R.layout.view_add_photos, viewGroup, false);
        this.f42222h = new C6171a(getActivity());
        this.f42223i = false;
        return layoutInflater;
    }

    public void onViewCreated(@NonNull View view, Bundle bundle) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("savedInstanceState=");
        stringBuilder.append(bundle);
        ad.a(stringBuilder.toString());
        super.onViewCreated(view, bundle);
        this.f42219e = (GridView) view.findViewById(R.id.grid_photos);
        this.f42220f = (ProgressBar) view.findViewById(R.id.progress);
        this.f42221g = (TextView) view.findViewById(R.id.txt_no_pics);
        this.f42218d = view.findViewById(R.id.grid_container);
        this.f42224j = new C8867t(getActivity());
        String string = getArguments().getString("id");
        this.f42219e.setAdapter(this.f42222h);
        this.f42227m = FacebookManager.m40462a();
        if (string != null) {
            m51519a(string, (String) null);
        } else {
            ad.c("Failed to fetch album, no album ID passed in.");
        }
    }

    public void onResume() {
        super.onResume();
        this.f42217c.m40475a((Fragment) this);
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
        bundle.putString("id", this.f42225k);
        bundle.putString("source", this.f42226l);
        super.onSaveInstanceState(bundle);
    }

    public void onDestroyView() {
        this.f42223i = true;
        super.onDestroyView();
    }

    /* renamed from: c */
    private void m51524c() {
        at.a(getActivity(), R.string.error_fetching_bitmap);
    }

    public void onClick(View view) {
        getActivity().onBackPressed();
    }
}
