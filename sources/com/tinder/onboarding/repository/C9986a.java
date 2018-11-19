package com.tinder.onboarding.repository;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.tinder.common.utils.C8578a;
import com.tinder.domain.common.model.Gender.Value;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.common.model.Photo.Render;
import com.tinder.onboarding.model.GenderSelection;
import com.tinder.onboarding.model.OnboardingEmail;
import com.tinder.onboarding.model.OnboardingPassword;
import com.tinder.onboarding.model.OnboardingUser;
import com.tinder.onboarding.model.network.EmailRequestMeta;
import com.tinder.onboarding.model.network.Field;
import com.tinder.onboarding.model.network.PasswordRequestMeta;
import com.tinder.onboarding.model.network.Photos;
import com.tinder.onboarding.model.network.Photos.ProcessedPhotos;
import com.tinder.onboarding.model.network.UpdateFieldsRequest;
import com.tinder.onboarding.model.network.UpdateFieldsRequest.Builder;
import com.tinder.scope.ActivityScope;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java8.util.Objects;
import java8.util.Optional;
import java8.util.stream.Collectors;
import java8.util.stream.StreamSupport;
import javax.inject.Inject;
import org.joda.time.LocalDate;
import org.joda.time.format.C19316b;
import org.joda.time.format.C19322g;
import rx.functions.Func0;

@ActivityScope
/* renamed from: com.tinder.onboarding.repository.a */
class C9986a {
    /* renamed from: a */
    private static final Type f32831a = new C121721().getType();
    /* renamed from: b */
    private static final List<Field.Type> f32832b = Arrays.asList(new Field.Type[]{Field.Type.NAME, Field.Type.BIRTHDAY, Field.Type.PHOTOS, Field.Type.PASSWORD});
    /* renamed from: c */
    private final C9985a f32833c = new C9985a();
    /* renamed from: d */
    private final Gson f32834d;

    /* renamed from: com.tinder.onboarding.repository.a$a */
    private static class C9985a {
        /* renamed from: a */
        private final C19316b f32830a;

        private C9985a() {
            this.f32830a = C19322g.c();
        }

        @NonNull
        /* renamed from: a */
        private LocalDate m40961a(@NonNull String str) {
            return LocalDate.a(str, this.f32830a);
        }

        @NonNull
        /* renamed from: a */
        private String m40959a(@NonNull LocalDate localDate) {
            return this.f32830a.a(localDate);
        }
    }

    /* renamed from: com.tinder.onboarding.repository.a$1 */
    static class C121721 extends TypeToken<List<Photos>> {
        C121721() {
        }
    }

    /* renamed from: a */
    final /* synthetic */ List m40982a(List list) {
        return m40976b(list);
    }

    @Inject
    C9986a(@NonNull Gson gson) {
        this.f32834d = gson;
    }

    @NonNull
    /* renamed from: a */
    UpdateFieldsRequest m40981a(@NonNull String str, @NonNull OnboardingUser onboardingUser) {
        Objects.b(str);
        Objects.b(onboardingUser);
        Builder builder = new Builder(str);
        onboardingUser.getEmail().a(new C12173b(builder));
        onboardingUser.getClass();
        m40973a(builder, C13527c.m52890a(onboardingUser), Field.Type.NAME);
        m40973a(builder, new C13528j(this, onboardingUser), Field.Type.BIRTHDAY);
        onboardingUser.getGenderSelection().a(new C12180k(builder));
        onboardingUser.getPassword().a(new C12181l(builder));
        return builder.build();
    }

    /* renamed from: a */
    static final /* synthetic */ void m40971a(Builder builder, OnboardingEmail onboardingEmail) {
        String email = onboardingEmail.email();
        if (onboardingEmail.skipped()) {
            builder.addField(C9986a.m40974b());
        } else if (email != null) {
            builder.addField(C9986a.m40975b(email));
        }
        onboardingEmail = onboardingEmail.allowMarketing();
        if (onboardingEmail != null) {
            builder.addField(Field.create(Field.Type.ALLOW_EMAIL_MARKETING, onboardingEmail));
        }
    }

    /* renamed from: a */
    final /* synthetic */ Optional m40983a(@NonNull OnboardingUser onboardingUser) {
        onboardingUser = onboardingUser.getBirthday();
        C9985a c9985a = this.f32833c;
        c9985a.getClass();
        return onboardingUser.a(C12179i.m48319a(c9985a));
    }

    /* renamed from: a */
    static final /* synthetic */ void m40970a(Builder builder, GenderSelection genderSelection) {
        Value gender = genderSelection.gender();
        if (gender != null) {
            builder.addField(Field.create(Field.Type.GENDER, Integer.valueOf(gender.id())));
            String customGender = genderSelection.customGender();
            if (customGender != null) {
                builder.addField(Field.create(Field.Type.CUSTOM_GENDER, customGender));
            }
        }
        genderSelection = genderSelection.showGenderOnProfile();
        if (genderSelection != null) {
            builder.addField(Field.create(Field.Type.SHOW_GENDER_ON_PROFILE, genderSelection));
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m40972a(Builder builder, OnboardingPassword onboardingPassword) {
        if (onboardingPassword.changed()) {
            String text = onboardingPassword.text();
            if (C8578a.m36596a(text)) {
                throw new IllegalArgumentException("User has changed password but it's null or empty");
            }
            onboardingPassword = C9986a.m40965a(text);
        } else {
            onboardingPassword = C9986a.m40963a();
        }
        builder.addField(onboardingPassword);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.NonNull
    /* renamed from: a */
    com.tinder.onboarding.model.OnboardingUser m40979a(@android.support.annotation.NonNull com.tinder.onboarding.model.network.FieldsResponse r15) {
        /*
        r14 = this;
        r0 = new com.tinder.onboarding.model.OnboardingUser$Builder;
        r0.<init>();
        r1 = r15.isUserUnderage();
        r0.setUnderage(r1);
        r1 = com.tinder.onboarding.model.OnboardingEmail.builder();
        r2 = com.tinder.onboarding.model.GenderSelection.builder();
        r15 = r15.getFields();
        r15 = r15.iterator();
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r6 = 0;
    L_0x0020:
        r7 = r15.hasNext();
        if (r7 == 0) goto L_0x0143;
    L_0x0026:
        r7 = r15.next();
        r7 = (com.tinder.onboarding.model.network.Field) r7;
        r8 = r7.getType();
        if (r8 != 0) goto L_0x0033;
    L_0x0032:
        goto L_0x0020;
    L_0x0033:
        r9 = r7.isEditable();
        r10 = 1;
        r11 = java.lang.Boolean.valueOf(r10);
        r9 = java8.util.Objects.b(r9, r11);
        r9 = (java.lang.Boolean) r9;
        r9 = r9.booleanValue();
        r11 = r7.isRequired();
        r12 = java.lang.Boolean.valueOf(r3);
        r11 = java8.util.Objects.b(r11, r12);
        r11 = (java.lang.Boolean) r11;
        r11 = r11.booleanValue();
        r12 = f32832b;
        r12 = r12.contains(r8);
        if (r12 == 0) goto L_0x0063;
    L_0x0060:
        if (r9 != 0) goto L_0x0063;
    L_0x0062:
        goto L_0x0020;
    L_0x0063:
        r12 = r7.getData();
        r13 = com.tinder.onboarding.repository.C9986a.C99842.f32829a;
        r8 = r8.ordinal();
        r8 = r13[r8];
        switch(r8) {
            case 1: goto L_0x013e;
            case 2: goto L_0x012c;
            case 3: goto L_0x011f;
            case 4: goto L_0x0113;
            case 5: goto L_0x0107;
            case 6: goto L_0x00f3;
            case 7: goto L_0x00d5;
            case 8: goto L_0x00aa;
            case 9: goto L_0x0073;
            default: goto L_0x0072;
        };
    L_0x0072:
        goto L_0x0020;
    L_0x0073:
        r7 = r7.getMeta();
        r8 = com.tinder.onboarding.model.network.PasswordResponseMeta.class;
        r7 = r14.m40967a(r7, r8);
        r8 = com.tinder.onboarding.model.OnboardingPassword.builder();
        r8 = r8.changed(r3);
        r9 = r7.c();
        if (r9 == 0) goto L_0x0098;
    L_0x008b:
        r7 = r7.b();
        r7 = (com.tinder.onboarding.model.network.PasswordResponseMeta) r7;
        r7 = r7.hasPassword();
        if (r7 == 0) goto L_0x0098;
    L_0x0097:
        goto L_0x0099;
    L_0x0098:
        r10 = 0;
    L_0x0099:
        r7 = r8.exists(r10);
        r7 = r7.build();
        r7 = java8.util.Optional.a(r7);
        r0.addPassword(r7);
        goto L_0x0020;
    L_0x00aa:
        r7 = r7.getDefaultValue();
        r8 = 0;
        r8 = r12.c(r8);
        r8 = (java.lang.Boolean) r8;
        r1.allowMarketing(r8);
        r8 = java.lang.Boolean.valueOf(r3);
        r7 = r7.c(r8);
        r7 = (java.lang.Boolean) r7;
        r1.defaultAllowMarketing(r7);
        r1.allowMarketingEditable(r9);
        if (r4 != 0) goto L_0x00cf;
    L_0x00ca:
        if (r9 == 0) goto L_0x00cd;
    L_0x00cc:
        goto L_0x00cf;
    L_0x00cd:
        r4 = 0;
        goto L_0x00d0;
    L_0x00cf:
        r4 = 1;
    L_0x00d0:
        if (r5 != 0) goto L_0x00f0;
    L_0x00d2:
        if (r11 == 0) goto L_0x00ef;
    L_0x00d4:
        goto L_0x00f0;
    L_0x00d5:
        r1.getClass();
        r7 = com.tinder.onboarding.repository.C12174d.m48317a(r1);
        r12.a(r7);
        r1.emailEditable(r9);
        if (r4 != 0) goto L_0x00e9;
    L_0x00e4:
        if (r9 == 0) goto L_0x00e7;
    L_0x00e6:
        goto L_0x00e9;
    L_0x00e7:
        r4 = 0;
        goto L_0x00ea;
    L_0x00e9:
        r4 = 1;
    L_0x00ea:
        if (r5 != 0) goto L_0x00f0;
    L_0x00ec:
        if (r11 == 0) goto L_0x00ef;
    L_0x00ee:
        goto L_0x00f0;
    L_0x00ef:
        r10 = 0;
    L_0x00f0:
        r5 = r10;
        goto L_0x0020;
    L_0x00f3:
        r7 = f32831a;
        r7 = r14.m40967a(r12, r7);
        r8 = new com.tinder.onboarding.repository.q;
        r8.<init>(r14);
        r7 = r7.a(r8);
        r0.addPhotos(r7);
        goto L_0x0020;
    L_0x0107:
        r2.getClass();
        r7 = com.tinder.onboarding.repository.C12185p.m48322a(r2);
        r12.a(r7);
        goto L_0x0020;
    L_0x0113:
        r2.getClass();
        r7 = com.tinder.onboarding.repository.C12184o.m48321a(r2);
        r12.a(r7);
        goto L_0x0020;
    L_0x011f:
        if (r9 == 0) goto L_0x0020;
    L_0x0121:
        r6 = new com.tinder.onboarding.repository.n;
        r6.<init>(r2);
        r12.a(r6);
        r6 = 1;
        goto L_0x0020;
    L_0x012c:
        r7 = r14.f32833c;
        r7.getClass();
        r7 = com.tinder.onboarding.repository.C12182m.m48320a(r7);
        r7 = r12.a(r7);
        r0.addBirthday(r7);
        goto L_0x0020;
    L_0x013e:
        r0.addName(r12);
        goto L_0x0020;
    L_0x0143:
        if (r4 == 0) goto L_0x0181;
    L_0x0145:
        r15 = r1.isEmailRequired(r5);
        r15 = r15.build();
        r1 = r15.emailEditable();
        if (r1 != 0) goto L_0x017a;
    L_0x0153:
        r1 = r15.email();
        r1 = com.tinder.common.utils.C8578a.m36596a(r1);
        if (r1 == 0) goto L_0x017a;
    L_0x015d:
        r1 = r15.allowMarketingEditable();
        if (r1 == 0) goto L_0x017a;
    L_0x0163:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Invalid email state: ";
        r1.append(r2);
        r1.append(r15);
        r15 = r1.toString();
        r0.<init>(r15);
        throw r0;
    L_0x017a:
        r15 = java8.util.Optional.a(r15);
        r0.addEmail(r15);
    L_0x0181:
        if (r6 == 0) goto L_0x0199;
    L_0x0183:
        r15 = r2.build();
        r1 = r15.gender();
        if (r1 == 0) goto L_0x0192;
    L_0x018d:
        r15 = java8.util.Optional.a(r15);
        goto L_0x0196;
    L_0x0192:
        r15 = java8.util.Optional.a();
    L_0x0196:
        r0.addGenderSelection(r15);
    L_0x0199:
        r15 = r0.build();
        return r15;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.onboarding.repository.a.a(com.tinder.onboarding.model.network.FieldsResponse):com.tinder.onboarding.model.OnboardingUser");
    }

    /* renamed from: b */
    private List<Photo> m40976b(List<Photos> list) {
        return (List) StreamSupport.a(list).map(new C12175e(this)).collect(Collectors.a());
    }

    /* renamed from: a */
    final /* synthetic */ Photo m40978a(Photos photos) {
        return Photo.builder().id(photos.getId()).url(photos.getImageUrl()).renders(m40977c(photos.getProcessedPhotos())).videos(Collections.emptyList()).build();
    }

    /* renamed from: c */
    private List<Render> m40977c(@Nullable List<ProcessedPhotos> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        return (List) StreamSupport.a(list).map(C12176f.f39466a).collect(Collectors.a());
    }

    @android.support.annotation.Nullable
    /* renamed from: a */
    com.tinder.onboarding.model.network.OnboardingErrorResponse m40980a(@android.support.annotation.NonNull okhttp3.C15968t r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r3 = r3.string();	 Catch:{ IOException -> 0x0015 }
        r0 = r2.f32834d;	 Catch:{ JsonParseException -> 0x000f }
        r1 = com.tinder.onboarding.model.network.OnboardingErrorResponse.class;	 Catch:{ JsonParseException -> 0x000f }
        r0 = r0.fromJson(r3, r1);	 Catch:{ JsonParseException -> 0x000f }
        r0 = (com.tinder.onboarding.model.network.OnboardingErrorResponse) r0;	 Catch:{ JsonParseException -> 0x000f }
        return r0;
    L_0x000f:
        r0 = new com.tinder.onboarding.exception.OnboardingJsonParseException;
        r0.<init>(r3);
        throw r0;
    L_0x0015:
        r3 = move-exception;
        r0 = new com.tinder.onboarding.exception.OnboardingInternalErrorException;
        r0.<init>(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.onboarding.repository.a.a(okhttp3.t):com.tinder.onboarding.model.network.OnboardingErrorResponse");
    }

    /* renamed from: a */
    private <T> void m40973a(@NonNull Builder builder, @NonNull Func0<Optional<T>> func0, @NonNull Field.Type type) {
        func0 = ((Optional) func0.call()).a(new C12177g(type));
        builder.getClass();
        func0.a(C12178h.m48318a(builder));
    }

    /* renamed from: a */
    private <T> Optional<T> m40967a(Optional<?> optional, Type type) {
        if (optional.c()) {
            return Optional.b(this.f32834d.fromJson(this.f32834d.toJson(optional.b()), type));
        }
        return Optional.a();
    }

    /* renamed from: a */
    private static Field<String, PasswordRequestMeta> m40963a() {
        return new Field(Field.Type.PASSWORD, null, null, new PasswordRequestMeta(true));
    }

    /* renamed from: a */
    private static Field<String, PasswordRequestMeta> m40965a(@NonNull String str) {
        return new Field(Field.Type.PASSWORD, str, null, null);
    }

    /* renamed from: b */
    private static Field<Void, EmailRequestMeta> m40974b() {
        return new Field(Field.Type.EMAIL, null, null, EmailRequestMeta.skipped());
    }

    /* renamed from: b */
    private static Field<String, Void> m40975b(@NonNull String str) {
        return new Field(Field.Type.EMAIL, str, null, null);
    }
}
