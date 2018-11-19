package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v4.app.i */
public class C0392i {
    /* renamed from: a */
    private final C2827j<?> f1326a;

    /* renamed from: a */
    public static C0392i m1458a(C2827j<?> c2827j) {
        return new C0392i(c2827j);
    }

    private C0392i(C2827j<?> c2827j) {
        this.f1326a = c2827j;
    }

    /* renamed from: a */
    public FragmentManager m1460a() {
        return this.f1326a.m11072k();
    }

    @Nullable
    /* renamed from: a */
    public Fragment m1459a(String str) {
        return this.f1326a.f8957d.m11144b(str);
    }

    /* renamed from: a */
    public void m1464a(Fragment fragment) {
        this.f1326a.f8957d.m11135a(this.f1326a, this.f1326a, fragment);
    }

    /* renamed from: a */
    public View m1461a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f1326a.f8957d.onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: b */
    public void m1469b() {
        this.f1326a.f8957d.m11190o();
    }

    /* renamed from: c */
    public Parcelable m1473c() {
        return this.f1326a.f8957d.m11187n();
    }

    /* renamed from: a */
    public void m1463a(Parcelable parcelable, C0404l c0404l) {
        this.f1326a.f8957d.m11127a(parcelable, c0404l);
    }

    /* renamed from: d */
    public C0404l m1474d() {
        return this.f1326a.f8957d.m11183l();
    }

    /* renamed from: e */
    public void m1475e() {
        this.f1326a.f8957d.m11191p();
    }

    /* renamed from: f */
    public void m1476f() {
        this.f1326a.f8957d.m11193q();
    }

    /* renamed from: g */
    public void m1477g() {
        this.f1326a.f8957d.m11194r();
    }

    /* renamed from: h */
    public void m1478h() {
        this.f1326a.f8957d.m11195s();
    }

    /* renamed from: i */
    public void m1479i() {
        this.f1326a.f8957d.m11196t();
    }

    /* renamed from: j */
    public void m1480j() {
        this.f1326a.f8957d.m11197u();
    }

    /* renamed from: k */
    public void m1481k() {
        this.f1326a.f8957d.m11198v();
    }

    /* renamed from: l */
    public void m1482l() {
        this.f1326a.f8957d.m11200x();
    }

    /* renamed from: a */
    public void m1465a(boolean z) {
        this.f1326a.f8957d.m11139a(z);
    }

    /* renamed from: b */
    public void m1471b(boolean z) {
        this.f1326a.f8957d.m11152b(z);
    }

    /* renamed from: a */
    public void m1462a(Configuration configuration) {
        this.f1326a.f8957d.m11125a(configuration);
    }

    /* renamed from: m */
    public void m1483m() {
        this.f1326a.f8957d.m11201y();
    }

    /* renamed from: a */
    public boolean m1467a(Menu menu, MenuInflater menuInflater) {
        return this.f1326a.f8957d.m11141a(menu, menuInflater);
    }

    /* renamed from: a */
    public boolean m1466a(Menu menu) {
        return this.f1326a.f8957d.m11140a(menu);
    }

    /* renamed from: a */
    public boolean m1468a(MenuItem menuItem) {
        return this.f1326a.f8957d.m11142a(menuItem);
    }

    /* renamed from: b */
    public boolean m1472b(MenuItem menuItem) {
        return this.f1326a.f8957d.m11155b(menuItem);
    }

    /* renamed from: b */
    public void m1470b(Menu menu) {
        this.f1326a.f8957d.m11151b(menu);
    }

    /* renamed from: n */
    public boolean m1484n() {
        return this.f1326a.f8957d.m11178i();
    }
}
