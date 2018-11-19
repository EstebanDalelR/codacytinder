package org.joda.time.chrono;

import java.io.Serializable;
import org.joda.time.C19304a;
import org.joda.time.C19305b;
import org.joda.time.C19306c;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.field.C19314d;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.field.UnsupportedDurationField;

public abstract class BaseChronology extends C19304a implements Serializable {
    private static final long serialVersionUID = -7310865996721419676L;

    protected BaseChronology() {
    }

    /* renamed from: a */
    public long mo14487a(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        return mo14499e().mo14538b(mo14515u().mo14538b(mo14478C().mo14538b(mo14480E().mo14538b(0, i), i2), i3), i4);
    }

    /* renamed from: a */
    public long mo14488a(int i, int i2, int i3, int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        return mo14498d().mo14538b(mo14501g().mo14538b(mo14504j().mo14538b(mo14507m().mo14538b(mo14515u().mo14538b(mo14478C().mo14538b(mo14480E().mo14538b(0, i), i2), i3), i4), i5), i6), i7);
    }

    /* renamed from: a */
    public long mo14489a(long j, int i, int i2, int i3, int i4) throws IllegalArgumentException {
        return mo14498d().mo14538b(mo14501g().mo14538b(mo14504j().mo14538b(mo14507m().mo14538b(j, i), i2), i3), i4);
    }

    /* renamed from: a */
    public void mo14492a(ReadablePartial readablePartial, int[] iArr) {
        int size = readablePartial.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            int i3 = iArr[i2];
            C19305b field = readablePartial.getField(i2);
            if (i3 < field.mo14553g()) {
                throw new IllegalFieldValueException(field.mo14534a(), Integer.valueOf(i3), Integer.valueOf(field.mo14553g()), null);
            } else if (i3 > field.mo14555h()) {
                throw new IllegalFieldValueException(field.mo14534a(), Integer.valueOf(i3), null, Integer.valueOf(field.mo14555h()));
            } else {
                i2++;
            }
        }
        while (i < size) {
            i2 = iArr[i];
            C19305b field2 = readablePartial.getField(i);
            if (i2 < field2.mo14527a(readablePartial, iArr)) {
                throw new IllegalFieldValueException(field2.mo14534a(), Integer.valueOf(i2), Integer.valueOf(field2.mo14527a(readablePartial, iArr)), null);
            } else if (i2 > field2.mo14537b(readablePartial, iArr)) {
                throw new IllegalFieldValueException(field2.mo14534a(), Integer.valueOf(i2), null, Integer.valueOf(field2.mo14537b(readablePartial, iArr)));
            } else {
                i++;
            }
        }
    }

    /* renamed from: a */
    public int[] mo14493a(ReadablePartial readablePartial, long j) {
        int size = readablePartial.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = readablePartial.getFieldType(i).mo14453a(this).mo14524a(j);
        }
        return iArr;
    }

    /* renamed from: b */
    public long mo14496b(ReadablePartial readablePartial, long j) {
        int size = readablePartial.size();
        for (int i = 0; i < size; i++) {
            j = readablePartial.getFieldType(i).mo14453a(this).mo14538b(j, readablePartial.getValue(i));
        }
        return j;
    }

    /* renamed from: a */
    public int[] mo14495a(ReadablePeriod readablePeriod, long j, long j2) {
        int size = readablePeriod.size();
        int[] iArr = new int[size];
        if (j != j2) {
            for (int i = 0; i < size; i++) {
                C19306c a = readablePeriod.getFieldType(i).mo14457a(this);
                int c = a.mo14523c(j2, j);
                if (c != 0) {
                    j = a.mo14558a(j, c);
                }
                iArr[i] = c;
            }
        }
        return iArr;
    }

    /* renamed from: a */
    public int[] mo14494a(ReadablePeriod readablePeriod, long j) {
        int size = readablePeriod.size();
        int[] iArr = new int[size];
        long j2 = 0;
        if (j != 0) {
            for (int i = 0; i < size; i++) {
                C19306c a = readablePeriod.getFieldType(i).mo14457a(this);
                if (a.mo14560c()) {
                    int c = a.mo14523c(j, j2);
                    j2 = a.mo14558a(j2, c);
                    iArr[i] = c;
                }
            }
        }
        return iArr;
    }

    /* renamed from: a */
    public long mo14491a(ReadablePeriod readablePeriod, long j, int i) {
        if (!(i == 0 || readablePeriod == null)) {
            int size = readablePeriod.size();
            for (int i2 = 0; i2 < size; i2++) {
                long value = (long) readablePeriod.getValue(i2);
                if (value != 0) {
                    j = readablePeriod.getFieldType(i2).mo14457a(this).mo14559a(j, value * ((long) i));
                }
            }
        }
        return j;
    }

    /* renamed from: a */
    public long mo14490a(long j, long j2, int i) {
        if (j2 != 0) {
            if (i != 0) {
                return C19314d.m69089a(j, C19314d.m69088a(j2, i));
            }
        }
        return j;
    }

    /* renamed from: c */
    public C19306c mo14497c() {
        return UnsupportedDurationField.m70257a(DurationFieldType.m68918a());
    }

    /* renamed from: d */
    public C19305b mo14498d() {
        return UnsupportedDateTimeField.m70221a(DateTimeFieldType.m68875a(), mo14497c());
    }

    /* renamed from: e */
    public C19305b mo14499e() {
        return UnsupportedDateTimeField.m70221a(DateTimeFieldType.m68876b(), mo14497c());
    }

    /* renamed from: f */
    public C19306c mo14500f() {
        return UnsupportedDurationField.m70257a(DurationFieldType.m68919b());
    }

    /* renamed from: g */
    public C19305b mo14501g() {
        return UnsupportedDateTimeField.m70221a(DateTimeFieldType.m68877c(), mo14500f());
    }

    /* renamed from: h */
    public C19305b mo14502h() {
        return UnsupportedDateTimeField.m70221a(DateTimeFieldType.m68878d(), mo14500f());
    }

    /* renamed from: i */
    public C19306c mo14503i() {
        return UnsupportedDurationField.m70257a(DurationFieldType.m68920c());
    }

    /* renamed from: j */
    public C19305b mo14504j() {
        return UnsupportedDateTimeField.m70221a(DateTimeFieldType.m68879e(), mo14503i());
    }

    /* renamed from: k */
    public C19305b mo14505k() {
        return UnsupportedDateTimeField.m70221a(DateTimeFieldType.m68880f(), mo14503i());
    }

    /* renamed from: l */
    public C19306c mo14506l() {
        return UnsupportedDurationField.m70257a(DurationFieldType.m68921d());
    }

    /* renamed from: m */
    public C19305b mo14507m() {
        return UnsupportedDateTimeField.m70221a(DateTimeFieldType.m68881g(), mo14506l());
    }

    /* renamed from: n */
    public C19305b mo14508n() {
        return UnsupportedDateTimeField.m70221a(DateTimeFieldType.m68882h(), mo14506l());
    }

    /* renamed from: o */
    public C19306c mo14509o() {
        return UnsupportedDurationField.m70257a(DurationFieldType.m68922e());
    }

    /* renamed from: p */
    public C19305b mo14510p() {
        return UnsupportedDateTimeField.m70221a(DateTimeFieldType.m68883i(), mo14506l());
    }

    /* renamed from: q */
    public C19305b mo14511q() {
        return UnsupportedDateTimeField.m70221a(DateTimeFieldType.m68884j(), mo14506l());
    }

    /* renamed from: r */
    public C19305b mo14512r() {
        return UnsupportedDateTimeField.m70221a(DateTimeFieldType.m68885k(), mo14509o());
    }

    /* renamed from: s */
    public C19306c mo14513s() {
        return UnsupportedDurationField.m70257a(DurationFieldType.m68923f());
    }

    /* renamed from: t */
    public C19305b mo14514t() {
        return UnsupportedDateTimeField.m70221a(DateTimeFieldType.m68886l(), mo14513s());
    }

    /* renamed from: u */
    public C19305b mo14515u() {
        return UnsupportedDateTimeField.m70221a(DateTimeFieldType.m68887m(), mo14513s());
    }

    /* renamed from: v */
    public C19305b mo14516v() {
        return UnsupportedDateTimeField.m70221a(DateTimeFieldType.m68888n(), mo14513s());
    }

    /* renamed from: w */
    public C19306c mo14517w() {
        return UnsupportedDurationField.m70257a(DurationFieldType.m68924g());
    }

    /* renamed from: x */
    public C19305b mo14518x() {
        return UnsupportedDateTimeField.m70221a(DateTimeFieldType.m68889o(), mo14517w());
    }

    /* renamed from: y */
    public C19306c mo14519y() {
        return UnsupportedDurationField.m70257a(DurationFieldType.m68925h());
    }

    /* renamed from: z */
    public C19305b mo14520z() {
        return UnsupportedDateTimeField.m70221a(DateTimeFieldType.m68890p(), mo14519y());
    }

    /* renamed from: A */
    public C19305b mo14476A() {
        return UnsupportedDateTimeField.m70221a(DateTimeFieldType.m68891q(), mo14519y());
    }

    /* renamed from: B */
    public C19306c mo14477B() {
        return UnsupportedDurationField.m70257a(DurationFieldType.m68926i());
    }

    /* renamed from: C */
    public C19305b mo14478C() {
        return UnsupportedDateTimeField.m70221a(DateTimeFieldType.m68892r(), mo14477B());
    }

    /* renamed from: D */
    public C19306c mo14479D() {
        return UnsupportedDurationField.m70257a(DurationFieldType.m68927j());
    }

    /* renamed from: E */
    public C19305b mo14480E() {
        return UnsupportedDateTimeField.m70221a(DateTimeFieldType.m68893s(), mo14479D());
    }

    /* renamed from: F */
    public C19305b mo14481F() {
        return UnsupportedDateTimeField.m70221a(DateTimeFieldType.m68894t(), mo14479D());
    }

    /* renamed from: G */
    public C19305b mo14482G() {
        return UnsupportedDateTimeField.m70221a(DateTimeFieldType.m68895u(), mo14479D());
    }

    /* renamed from: H */
    public C19306c mo14483H() {
        return UnsupportedDurationField.m70257a(DurationFieldType.m68928k());
    }

    /* renamed from: I */
    public C19305b mo14484I() {
        return UnsupportedDateTimeField.m70221a(DateTimeFieldType.m68896v(), mo14483H());
    }

    /* renamed from: J */
    public C19306c mo14485J() {
        return UnsupportedDurationField.m70257a(DurationFieldType.m68929l());
    }

    /* renamed from: K */
    public C19305b mo14486K() {
        return UnsupportedDateTimeField.m70221a(DateTimeFieldType.m68897w(), mo14485J());
    }
}
