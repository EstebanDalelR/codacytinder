package com.google.i18n.phonenumbers;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

public final class Phonemetadata {

    public static class NumberFormat implements Externalizable {
        private static final long serialVersionUID = 1;
        /* renamed from: a */
        private boolean f20767a;
        /* renamed from: b */
        private String f20768b = "";
        /* renamed from: c */
        private boolean f20769c;
        /* renamed from: d */
        private String f20770d = "";
        /* renamed from: e */
        private List<String> f20771e = new ArrayList();
        /* renamed from: f */
        private boolean f20772f;
        /* renamed from: g */
        private String f20773g = "";
        /* renamed from: h */
        private boolean f20774h;
        /* renamed from: i */
        private boolean f20775i = false;
        /* renamed from: j */
        private boolean f20776j;
        /* renamed from: k */
        private String f20777k = "";

        /* renamed from: a */
        public String m24539a() {
            return this.f20768b;
        }

        /* renamed from: a */
        public NumberFormat m24537a(String str) {
            this.f20767a = true;
            this.f20768b = str;
            return this;
        }

        /* renamed from: b */
        public String m24542b() {
            return this.f20770d;
        }

        /* renamed from: b */
        public NumberFormat m24541b(String str) {
            this.f20769c = true;
            this.f20770d = str;
            return this;
        }

        /* renamed from: c */
        public int m24543c() {
            return this.f20771e.size();
        }

        /* renamed from: a */
        public String m24540a(int i) {
            return (String) this.f20771e.get(i);
        }

        /* renamed from: d */
        public String m24546d() {
            return this.f20773g;
        }

        /* renamed from: c */
        public NumberFormat m24544c(String str) {
            this.f20772f = true;
            this.f20773g = str;
            return this;
        }

        /* renamed from: e */
        public boolean m24547e() {
            return this.f20775i;
        }

        /* renamed from: a */
        public NumberFormat m24538a(boolean z) {
            this.f20774h = true;
            this.f20775i = z;
            return this;
        }

        /* renamed from: f */
        public String m24548f() {
            return this.f20777k;
        }

        /* renamed from: d */
        public NumberFormat m24545d(String str) {
            this.f20776j = true;
            this.f20777k = str;
            return this;
        }

        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeUTF(this.f20768b);
            objectOutput.writeUTF(this.f20770d);
            int c = m24543c();
            objectOutput.writeInt(c);
            for (int i = 0; i < c; i++) {
                objectOutput.writeUTF((String) this.f20771e.get(i));
            }
            objectOutput.writeBoolean(this.f20772f);
            if (this.f20772f) {
                objectOutput.writeUTF(this.f20773g);
            }
            objectOutput.writeBoolean(this.f20776j);
            if (this.f20776j) {
                objectOutput.writeUTF(this.f20777k);
            }
            objectOutput.writeBoolean(this.f20775i);
        }

        public void readExternal(ObjectInput objectInput) throws IOException {
            m24537a(objectInput.readUTF());
            m24541b(objectInput.readUTF());
            int readInt = objectInput.readInt();
            for (int i = 0; i < readInt; i++) {
                this.f20771e.add(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                m24544c(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                m24545d(objectInput.readUTF());
            }
            m24538a(objectInput.readBoolean());
        }
    }

    public static class PhoneMetadata implements Externalizable {
        private static final long serialVersionUID = 1;
        /* renamed from: A */
        private boolean f20778A;
        /* renamed from: B */
        private PhoneNumberDesc f20779B = null;
        /* renamed from: C */
        private boolean f20780C;
        /* renamed from: D */
        private PhoneNumberDesc f20781D = null;
        /* renamed from: E */
        private boolean f20782E;
        /* renamed from: F */
        private PhoneNumberDesc f20783F = null;
        /* renamed from: G */
        private boolean f20784G;
        /* renamed from: H */
        private PhoneNumberDesc f20785H = null;
        /* renamed from: I */
        private boolean f20786I;
        /* renamed from: J */
        private String f20787J = "";
        /* renamed from: K */
        private boolean f20788K;
        /* renamed from: L */
        private int f20789L = 0;
        /* renamed from: M */
        private boolean f20790M;
        /* renamed from: N */
        private String f20791N = "";
        /* renamed from: O */
        private boolean f20792O;
        /* renamed from: P */
        private String f20793P = "";
        /* renamed from: Q */
        private boolean f20794Q;
        /* renamed from: R */
        private String f20795R = "";
        /* renamed from: S */
        private boolean f20796S;
        /* renamed from: T */
        private String f20797T = "";
        /* renamed from: U */
        private boolean f20798U;
        /* renamed from: V */
        private String f20799V = "";
        /* renamed from: W */
        private boolean f20800W;
        /* renamed from: X */
        private String f20801X = "";
        /* renamed from: Y */
        private boolean f20802Y;
        /* renamed from: Z */
        private boolean f20803Z = false;
        /* renamed from: a */
        private boolean f20804a;
        private List<NumberFormat> aa = new ArrayList();
        private List<NumberFormat> ab = new ArrayList();
        private boolean ac;
        private boolean ad = false;
        private boolean ae;
        private String af = "";
        private boolean ag;
        private boolean ah = false;
        private boolean ai;
        private boolean aj = false;
        /* renamed from: b */
        private PhoneNumberDesc f20805b = null;
        /* renamed from: c */
        private boolean f20806c;
        /* renamed from: d */
        private PhoneNumberDesc f20807d = null;
        /* renamed from: e */
        private boolean f20808e;
        /* renamed from: f */
        private PhoneNumberDesc f20809f = null;
        /* renamed from: g */
        private boolean f20810g;
        /* renamed from: h */
        private PhoneNumberDesc f20811h = null;
        /* renamed from: i */
        private boolean f20812i;
        /* renamed from: j */
        private PhoneNumberDesc f20813j = null;
        /* renamed from: k */
        private boolean f20814k;
        /* renamed from: l */
        private PhoneNumberDesc f20815l = null;
        /* renamed from: m */
        private boolean f20816m;
        /* renamed from: n */
        private PhoneNumberDesc f20817n = null;
        /* renamed from: o */
        private boolean f20818o;
        /* renamed from: p */
        private PhoneNumberDesc f20819p = null;
        /* renamed from: q */
        private boolean f20820q;
        /* renamed from: r */
        private PhoneNumberDesc f20821r = null;
        /* renamed from: s */
        private boolean f20822s;
        /* renamed from: t */
        private PhoneNumberDesc f20823t = null;
        /* renamed from: u */
        private boolean f20824u;
        /* renamed from: v */
        private PhoneNumberDesc f20825v = null;
        /* renamed from: w */
        private boolean f20826w;
        /* renamed from: x */
        private PhoneNumberDesc f20827x = null;
        /* renamed from: y */
        private boolean f20828y;
        /* renamed from: z */
        private PhoneNumberDesc f20829z = null;

        /* renamed from: a */
        public PhoneNumberDesc m24554a() {
            return this.f20805b;
        }

        /* renamed from: a */
        public PhoneMetadata m24551a(PhoneNumberDesc phoneNumberDesc) {
            if (phoneNumberDesc == null) {
                throw new NullPointerException();
            }
            this.f20804a = true;
            this.f20805b = phoneNumberDesc;
            return this;
        }

        /* renamed from: b */
        public PhoneNumberDesc m24558b() {
            return this.f20807d;
        }

        /* renamed from: b */
        public PhoneMetadata m24555b(PhoneNumberDesc phoneNumberDesc) {
            if (phoneNumberDesc == null) {
                throw new NullPointerException();
            }
            this.f20806c = true;
            this.f20807d = phoneNumberDesc;
            return this;
        }

        /* renamed from: c */
        public PhoneNumberDesc m24562c() {
            return this.f20809f;
        }

        /* renamed from: c */
        public PhoneMetadata m24559c(PhoneNumberDesc phoneNumberDesc) {
            if (phoneNumberDesc == null) {
                throw new NullPointerException();
            }
            this.f20808e = true;
            this.f20809f = phoneNumberDesc;
            return this;
        }

        /* renamed from: d */
        public PhoneNumberDesc m24566d() {
            return this.f20811h;
        }

        /* renamed from: d */
        public PhoneMetadata m24563d(PhoneNumberDesc phoneNumberDesc) {
            if (phoneNumberDesc == null) {
                throw new NullPointerException();
            }
            this.f20810g = true;
            this.f20811h = phoneNumberDesc;
            return this;
        }

        /* renamed from: e */
        public PhoneNumberDesc m24569e() {
            return this.f20813j;
        }

        /* renamed from: e */
        public PhoneMetadata m24567e(PhoneNumberDesc phoneNumberDesc) {
            if (phoneNumberDesc == null) {
                throw new NullPointerException();
            }
            this.f20812i = true;
            this.f20813j = phoneNumberDesc;
            return this;
        }

        /* renamed from: f */
        public PhoneNumberDesc m24572f() {
            return this.f20815l;
        }

        /* renamed from: f */
        public PhoneMetadata m24570f(PhoneNumberDesc phoneNumberDesc) {
            if (phoneNumberDesc == null) {
                throw new NullPointerException();
            }
            this.f20814k = true;
            this.f20815l = phoneNumberDesc;
            return this;
        }

        /* renamed from: g */
        public PhoneNumberDesc m24575g() {
            return this.f20817n;
        }

        /* renamed from: g */
        public PhoneMetadata m24573g(PhoneNumberDesc phoneNumberDesc) {
            if (phoneNumberDesc == null) {
                throw new NullPointerException();
            }
            this.f20816m = true;
            this.f20817n = phoneNumberDesc;
            return this;
        }

        /* renamed from: h */
        public PhoneNumberDesc m24578h() {
            return this.f20819p;
        }

        /* renamed from: h */
        public PhoneMetadata m24576h(PhoneNumberDesc phoneNumberDesc) {
            if (phoneNumberDesc == null) {
                throw new NullPointerException();
            }
            this.f20818o = true;
            this.f20819p = phoneNumberDesc;
            return this;
        }

        /* renamed from: i */
        public PhoneNumberDesc m24580i() {
            return this.f20821r;
        }

        /* renamed from: i */
        public PhoneMetadata m24579i(PhoneNumberDesc phoneNumberDesc) {
            if (phoneNumberDesc == null) {
                throw new NullPointerException();
            }
            this.f20820q = true;
            this.f20821r = phoneNumberDesc;
            return this;
        }

        /* renamed from: j */
        public PhoneNumberDesc m24582j() {
            return this.f20823t;
        }

        /* renamed from: j */
        public PhoneMetadata m24581j(PhoneNumberDesc phoneNumberDesc) {
            if (phoneNumberDesc == null) {
                throw new NullPointerException();
            }
            this.f20822s = true;
            this.f20823t = phoneNumberDesc;
            return this;
        }

        /* renamed from: k */
        public PhoneMetadata m24583k(PhoneNumberDesc phoneNumberDesc) {
            if (phoneNumberDesc == null) {
                throw new NullPointerException();
            }
            this.f20824u = true;
            this.f20825v = phoneNumberDesc;
            return this;
        }

        /* renamed from: k */
        public PhoneNumberDesc m24584k() {
            return this.f20827x;
        }

        /* renamed from: l */
        public PhoneMetadata m24586l(PhoneNumberDesc phoneNumberDesc) {
            if (phoneNumberDesc == null) {
                throw new NullPointerException();
            }
            this.f20826w = true;
            this.f20827x = phoneNumberDesc;
            return this;
        }

        /* renamed from: m */
        public PhoneMetadata m24587m(PhoneNumberDesc phoneNumberDesc) {
            if (phoneNumberDesc == null) {
                throw new NullPointerException();
            }
            this.f20828y = true;
            this.f20829z = phoneNumberDesc;
            return this;
        }

        /* renamed from: n */
        public PhoneMetadata m24589n(PhoneNumberDesc phoneNumberDesc) {
            if (phoneNumberDesc == null) {
                throw new NullPointerException();
            }
            this.f20778A = true;
            this.f20779B = phoneNumberDesc;
            return this;
        }

        /* renamed from: o */
        public PhoneMetadata m24591o(PhoneNumberDesc phoneNumberDesc) {
            if (phoneNumberDesc == null) {
                throw new NullPointerException();
            }
            this.f20780C = true;
            this.f20781D = phoneNumberDesc;
            return this;
        }

        /* renamed from: p */
        public PhoneMetadata m24593p(PhoneNumberDesc phoneNumberDesc) {
            if (phoneNumberDesc == null) {
                throw new NullPointerException();
            }
            this.f20782E = true;
            this.f20783F = phoneNumberDesc;
            return this;
        }

        /* renamed from: q */
        public PhoneMetadata m24595q(PhoneNumberDesc phoneNumberDesc) {
            if (phoneNumberDesc == null) {
                throw new NullPointerException();
            }
            this.f20784G = true;
            this.f20785H = phoneNumberDesc;
            return this;
        }

        /* renamed from: a */
        public PhoneMetadata m24552a(String str) {
            this.f20786I = true;
            this.f20787J = str;
            return this;
        }

        /* renamed from: l */
        public int m24585l() {
            return this.f20789L;
        }

        /* renamed from: a */
        public PhoneMetadata m24550a(int i) {
            this.f20788K = true;
            this.f20789L = i;
            return this;
        }

        /* renamed from: m */
        public String m24588m() {
            return this.f20791N;
        }

        /* renamed from: b */
        public PhoneMetadata m24556b(String str) {
            this.f20790M = true;
            this.f20791N = str;
            return this;
        }

        /* renamed from: c */
        public PhoneMetadata m24560c(String str) {
            this.f20792O = true;
            this.f20793P = str;
            return this;
        }

        /* renamed from: n */
        public boolean m24590n() {
            return this.f20794Q;
        }

        /* renamed from: o */
        public String m24592o() {
            return this.f20795R;
        }

        /* renamed from: d */
        public PhoneMetadata m24564d(String str) {
            this.f20794Q = true;
            this.f20795R = str;
            return this;
        }

        /* renamed from: p */
        public boolean m24594p() {
            return this.f20796S;
        }

        /* renamed from: q */
        public String m24596q() {
            return this.f20797T;
        }

        /* renamed from: e */
        public PhoneMetadata m24568e(String str) {
            this.f20796S = true;
            this.f20797T = str;
            return this;
        }

        /* renamed from: r */
        public boolean m24597r() {
            return this.f20798U;
        }

        /* renamed from: s */
        public String m24598s() {
            return this.f20799V;
        }

        /* renamed from: f */
        public PhoneMetadata m24571f(String str) {
            this.f20798U = true;
            this.f20799V = str;
            return this;
        }

        /* renamed from: t */
        public String m24599t() {
            return this.f20801X;
        }

        /* renamed from: g */
        public PhoneMetadata m24574g(String str) {
            this.f20800W = true;
            this.f20801X = str;
            return this;
        }

        /* renamed from: u */
        public boolean m24600u() {
            return this.f20803Z;
        }

        /* renamed from: a */
        public PhoneMetadata m24553a(boolean z) {
            this.f20802Y = true;
            this.f20803Z = z;
            return this;
        }

        /* renamed from: v */
        public List<NumberFormat> m24601v() {
            return this.aa;
        }

        /* renamed from: w */
        public int m24602w() {
            return this.aa.size();
        }

        /* renamed from: x */
        public List<NumberFormat> m24603x() {
            return this.ab;
        }

        /* renamed from: y */
        public int m24604y() {
            return this.ab.size();
        }

        /* renamed from: b */
        public PhoneMetadata m24557b(boolean z) {
            this.ac = true;
            this.ad = z;
            return this;
        }

        /* renamed from: z */
        public boolean m24605z() {
            return this.ae;
        }

        /* renamed from: A */
        public String m24549A() {
            return this.af;
        }

        /* renamed from: h */
        public PhoneMetadata m24577h(String str) {
            this.ae = true;
            this.af = str;
            return this;
        }

        /* renamed from: c */
        public PhoneMetadata m24561c(boolean z) {
            this.ag = true;
            this.ah = z;
            return this;
        }

        /* renamed from: d */
        public PhoneMetadata m24565d(boolean z) {
            this.ai = true;
            this.aj = z;
            return this;
        }

        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeBoolean(this.f20804a);
            if (this.f20804a) {
                this.f20805b.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.f20806c);
            if (this.f20806c) {
                this.f20807d.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.f20808e);
            if (this.f20808e) {
                this.f20809f.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.f20810g);
            if (this.f20810g) {
                this.f20811h.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.f20812i);
            if (this.f20812i) {
                this.f20813j.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.f20814k);
            if (this.f20814k) {
                this.f20815l.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.f20816m);
            if (this.f20816m) {
                this.f20817n.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.f20818o);
            if (this.f20818o) {
                this.f20819p.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.f20820q);
            if (this.f20820q) {
                this.f20821r.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.f20822s);
            if (this.f20822s) {
                this.f20823t.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.f20824u);
            if (this.f20824u) {
                this.f20825v.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.f20826w);
            if (this.f20826w) {
                this.f20827x.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.f20828y);
            if (this.f20828y) {
                this.f20829z.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.f20778A);
            if (this.f20778A) {
                this.f20779B.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.f20780C);
            if (this.f20780C) {
                this.f20781D.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.f20782E);
            if (this.f20782E) {
                this.f20783F.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.f20784G);
            if (this.f20784G) {
                this.f20785H.writeExternal(objectOutput);
            }
            objectOutput.writeUTF(this.f20787J);
            objectOutput.writeInt(this.f20789L);
            objectOutput.writeUTF(this.f20791N);
            objectOutput.writeBoolean(this.f20792O);
            if (this.f20792O) {
                objectOutput.writeUTF(this.f20793P);
            }
            objectOutput.writeBoolean(this.f20794Q);
            if (this.f20794Q) {
                objectOutput.writeUTF(this.f20795R);
            }
            objectOutput.writeBoolean(this.f20796S);
            if (this.f20796S) {
                objectOutput.writeUTF(this.f20797T);
            }
            objectOutput.writeBoolean(this.f20798U);
            if (this.f20798U) {
                objectOutput.writeUTF(this.f20799V);
            }
            objectOutput.writeBoolean(this.f20800W);
            if (this.f20800W) {
                objectOutput.writeUTF(this.f20801X);
            }
            objectOutput.writeBoolean(this.f20803Z);
            int w = m24602w();
            objectOutput.writeInt(w);
            for (int i = 0; i < w; i++) {
                ((NumberFormat) this.aa.get(i)).writeExternal(objectOutput);
            }
            w = m24604y();
            objectOutput.writeInt(w);
            for (int i2 = 0; i2 < w; i2++) {
                ((NumberFormat) this.ab.get(i2)).writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.ad);
            objectOutput.writeBoolean(this.ae);
            if (this.ae) {
                objectOutput.writeUTF(this.af);
            }
            objectOutput.writeBoolean(this.ah);
            objectOutput.writeBoolean(this.aj);
        }

        public void readExternal(ObjectInput objectInput) throws IOException {
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc = new PhoneNumberDesc();
                phoneNumberDesc.readExternal(objectInput);
                m24551a(phoneNumberDesc);
            }
            if (objectInput.readBoolean()) {
                phoneNumberDesc = new PhoneNumberDesc();
                phoneNumberDesc.readExternal(objectInput);
                m24555b(phoneNumberDesc);
            }
            if (objectInput.readBoolean()) {
                phoneNumberDesc = new PhoneNumberDesc();
                phoneNumberDesc.readExternal(objectInput);
                m24559c(phoneNumberDesc);
            }
            if (objectInput.readBoolean()) {
                phoneNumberDesc = new PhoneNumberDesc();
                phoneNumberDesc.readExternal(objectInput);
                m24563d(phoneNumberDesc);
            }
            if (objectInput.readBoolean()) {
                phoneNumberDesc = new PhoneNumberDesc();
                phoneNumberDesc.readExternal(objectInput);
                m24567e(phoneNumberDesc);
            }
            if (objectInput.readBoolean()) {
                phoneNumberDesc = new PhoneNumberDesc();
                phoneNumberDesc.readExternal(objectInput);
                m24570f(phoneNumberDesc);
            }
            if (objectInput.readBoolean()) {
                phoneNumberDesc = new PhoneNumberDesc();
                phoneNumberDesc.readExternal(objectInput);
                m24573g(phoneNumberDesc);
            }
            if (objectInput.readBoolean()) {
                phoneNumberDesc = new PhoneNumberDesc();
                phoneNumberDesc.readExternal(objectInput);
                m24576h(phoneNumberDesc);
            }
            if (objectInput.readBoolean()) {
                phoneNumberDesc = new PhoneNumberDesc();
                phoneNumberDesc.readExternal(objectInput);
                m24579i(phoneNumberDesc);
            }
            if (objectInput.readBoolean()) {
                phoneNumberDesc = new PhoneNumberDesc();
                phoneNumberDesc.readExternal(objectInput);
                m24581j(phoneNumberDesc);
            }
            if (objectInput.readBoolean()) {
                phoneNumberDesc = new PhoneNumberDesc();
                phoneNumberDesc.readExternal(objectInput);
                m24583k(phoneNumberDesc);
            }
            if (objectInput.readBoolean()) {
                phoneNumberDesc = new PhoneNumberDesc();
                phoneNumberDesc.readExternal(objectInput);
                m24586l(phoneNumberDesc);
            }
            if (objectInput.readBoolean()) {
                phoneNumberDesc = new PhoneNumberDesc();
                phoneNumberDesc.readExternal(objectInput);
                m24587m(phoneNumberDesc);
            }
            if (objectInput.readBoolean()) {
                phoneNumberDesc = new PhoneNumberDesc();
                phoneNumberDesc.readExternal(objectInput);
                m24589n(phoneNumberDesc);
            }
            if (objectInput.readBoolean()) {
                phoneNumberDesc = new PhoneNumberDesc();
                phoneNumberDesc.readExternal(objectInput);
                m24591o(phoneNumberDesc);
            }
            if (objectInput.readBoolean()) {
                phoneNumberDesc = new PhoneNumberDesc();
                phoneNumberDesc.readExternal(objectInput);
                m24593p(phoneNumberDesc);
            }
            if (objectInput.readBoolean()) {
                phoneNumberDesc = new PhoneNumberDesc();
                phoneNumberDesc.readExternal(objectInput);
                m24595q(phoneNumberDesc);
            }
            m24552a(objectInput.readUTF());
            m24550a(objectInput.readInt());
            m24556b(objectInput.readUTF());
            if (objectInput.readBoolean()) {
                m24560c(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                m24564d(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                m24568e(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                m24571f(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                m24574g(objectInput.readUTF());
            }
            m24553a(objectInput.readBoolean());
            int readInt = objectInput.readInt();
            for (int i = 0; i < readInt; i++) {
                NumberFormat numberFormat = new NumberFormat();
                numberFormat.readExternal(objectInput);
                this.aa.add(numberFormat);
            }
            readInt = objectInput.readInt();
            for (int i2 = 0; i2 < readInt; i2++) {
                NumberFormat numberFormat2 = new NumberFormat();
                numberFormat2.readExternal(objectInput);
                this.ab.add(numberFormat2);
            }
            m24557b(objectInput.readBoolean());
            if (objectInput.readBoolean()) {
                m24577h(objectInput.readUTF());
            }
            m24561c(objectInput.readBoolean());
            m24565d(objectInput.readBoolean());
        }
    }

    public static class PhoneMetadataCollection implements Externalizable {
        private static final long serialVersionUID = 1;
        /* renamed from: a */
        private List<PhoneMetadata> f20830a = new ArrayList();

        /* renamed from: a */
        public List<PhoneMetadata> m24606a() {
            return this.f20830a;
        }

        /* renamed from: b */
        public int m24607b() {
            return this.f20830a.size();
        }

        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            int b = m24607b();
            objectOutput.writeInt(b);
            for (int i = 0; i < b; i++) {
                ((PhoneMetadata) this.f20830a.get(i)).writeExternal(objectOutput);
            }
        }

        public void readExternal(ObjectInput objectInput) throws IOException {
            int readInt = objectInput.readInt();
            for (int i = 0; i < readInt; i++) {
                PhoneMetadata phoneMetadata = new PhoneMetadata();
                phoneMetadata.readExternal(objectInput);
                this.f20830a.add(phoneMetadata);
            }
        }
    }

    public static class PhoneNumberDesc implements Externalizable {
        private static final long serialVersionUID = 1;
        /* renamed from: a */
        private boolean f20831a;
        /* renamed from: b */
        private String f20832b = "";
        /* renamed from: c */
        private List<Integer> f20833c = new ArrayList();
        /* renamed from: d */
        private List<Integer> f20834d = new ArrayList();
        /* renamed from: e */
        private boolean f20835e;
        /* renamed from: f */
        private String f20836f = "";

        /* renamed from: a */
        public String m24610a() {
            return this.f20832b;
        }

        /* renamed from: a */
        public PhoneNumberDesc m24609a(String str) {
            this.f20831a = true;
            this.f20832b = str;
            return this;
        }

        /* renamed from: b */
        public List<Integer> m24612b() {
            return this.f20833c;
        }

        /* renamed from: c */
        public int m24613c() {
            return this.f20833c.size();
        }

        /* renamed from: a */
        public int m24608a(int i) {
            return ((Integer) this.f20833c.get(i)).intValue();
        }

        /* renamed from: d */
        public List<Integer> m24614d() {
            return this.f20834d;
        }

        /* renamed from: e */
        public int m24615e() {
            return this.f20834d.size();
        }

        /* renamed from: b */
        public PhoneNumberDesc m24611b(String str) {
            this.f20835e = true;
            this.f20836f = str;
            return this;
        }

        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeBoolean(this.f20831a);
            if (this.f20831a) {
                objectOutput.writeUTF(this.f20832b);
            }
            int c = m24613c();
            objectOutput.writeInt(c);
            for (int i = 0; i < c; i++) {
                objectOutput.writeInt(((Integer) this.f20833c.get(i)).intValue());
            }
            c = m24615e();
            objectOutput.writeInt(c);
            for (int i2 = 0; i2 < c; i2++) {
                objectOutput.writeInt(((Integer) this.f20834d.get(i2)).intValue());
            }
            objectOutput.writeBoolean(this.f20835e);
            if (this.f20835e) {
                objectOutput.writeUTF(this.f20836f);
            }
        }

        public void readExternal(ObjectInput objectInput) throws IOException {
            if (objectInput.readBoolean()) {
                m24609a(objectInput.readUTF());
            }
            int readInt = objectInput.readInt();
            for (int i = 0; i < readInt; i++) {
                this.f20833c.add(Integer.valueOf(objectInput.readInt()));
            }
            readInt = objectInput.readInt();
            for (int i2 = 0; i2 < readInt; i2++) {
                this.f20834d.add(Integer.valueOf(objectInput.readInt()));
            }
            if (objectInput.readBoolean()) {
                m24611b(objectInput.readUTF());
            }
        }
    }
}
