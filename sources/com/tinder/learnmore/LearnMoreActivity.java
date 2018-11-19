package com.tinder.learnmore;

import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tinder.api.ManagerWebServices;
import com.tinder.learnmore.LearnMoreLinkMovementMethod.OnLinksClickedListener;
import com.tinder.places.C6257b.C6254c;
import com.tinder.places.C6257b.C6255d;
import com.tinder.places.C6257b.C6256e;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000;\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0004\u0018\u00002\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\rH\u0002J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\u0015"}, d2 = {"Lcom/tinder/learnmore/LearnMoreActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "listener", "com/tinder/learnmore/LearnMoreActivity$listener$1", "Lcom/tinder/learnmore/LearnMoreActivity$listener$1;", "getLinkAnswer", "Landroid/text/Spanned;", "questionView", "Landroid/view/View;", "type", "Lcom/tinder/learnmore/LearnMoreActivity$LinkAnswerType;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "populateQuestions", "showUrl", "link", "", "LinkAnswerType", "places_release"}, k = 1, mv = {1, 1, 10})
public final class LearnMoreActivity extends AppCompatActivity {
    /* renamed from: a */
    private final C11894a f45377a = new C11894a(this);
    /* renamed from: b */
    private HashMap f45378b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/learnmore/LearnMoreActivity$LinkAnswerType;", "", "(Ljava/lang/String;I)V", "Q8", "Q9", "places_release"}, k = 1, mv = {1, 1, 10})
    private enum LinkAnswerType {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.learnmore.LearnMoreActivity$b */
    static final class C9745b implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ LearnMoreActivity f32371a;

        C9745b(LearnMoreActivity learnMoreActivity) {
            this.f32371a = learnMoreActivity;
        }

        public final void onClick(View view) {
            this.f32371a.finish();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"com/tinder/learnmore/LearnMoreActivity$listener$1", "Lcom/tinder/learnmore/LearnMoreLinkMovementMethod$OnLinksClickedListener;", "(Lcom/tinder/learnmore/LearnMoreActivity;)V", "onContactUsClicked", "", "onPrivacyPolicyClicked", "places_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.learnmore.LearnMoreActivity$a */
    public static final class C11894a implements OnLinksClickedListener {
        /* renamed from: a */
        final /* synthetic */ LearnMoreActivity f38784a;

        C11894a(LearnMoreActivity learnMoreActivity) {
            this.f38784a = learnMoreActivity;
        }

        public void onContactUsClicked() {
            this.f38784a.m54497a("https://www.gotinder.com/contact");
        }

        public void onPrivacyPolicyClicked() {
            this.f38784a.m54497a(ManagerWebServices.URL_PRIVACY);
        }
    }

    /* renamed from: a */
    public View m54498a(int i) {
        if (this.f45378b == null) {
            this.f45378b = new HashMap();
        }
        View view = (View) this.f45378b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f45378b.put(Integer.valueOf(i), view);
        return view;
    }

    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C6255d.activity_places_learn_more);
        m54495a();
        ((ImageView) m54498a(C6254c.closeButton)).setOnClickListener(new C9745b(this));
    }

    /* renamed from: a */
    private final void m54495a() {
        for (int i = 0; i < 9; i++) {
            CharSequence string;
            View inflate = getLayoutInflater().inflate(C6255d.view_places_learn_more_question_item, null);
            View findViewById = inflate.findViewById(C6254c.questionText);
            C2668g.a(findViewById, "questionView.findViewByI…tView>(R.id.questionText)");
            TextView textView = (TextView) findViewById;
            switch (i) {
                case 0:
                    string = getString(C6256e.places_learn_more_question_1);
                    break;
                case 1:
                    string = getString(C6256e.places_learn_more_question_2);
                    break;
                case 2:
                    string = getString(C6256e.places_learn_more_question_3);
                    break;
                case 3:
                    string = getString(C6256e.places_learn_more_question_4);
                    break;
                case 4:
                    string = getString(C6256e.places_learn_more_question_5);
                    break;
                case 5:
                    string = getString(C6256e.places_learn_more_question_6);
                    break;
                case 6:
                    string = getString(C6256e.places_learn_more_question_7);
                    break;
                case 7:
                    string = getString(C6256e.places_learn_more_question_8);
                    break;
                default:
                    string = getString(C6256e.places_learn_more_question_9);
                    break;
            }
            textView.setText(string);
            findViewById = inflate.findViewById(C6254c.answerText);
            C2668g.a(findViewById, "questionView.findViewByI…extView>(R.id.answerText)");
            textView = (TextView) findViewById;
            switch (i) {
                case 0:
                    string = getString(C6256e.places_learn_more_answer_1);
                    break;
                case 1:
                    string = getString(C6256e.places_learn_more_answer_2);
                    break;
                case 2:
                    string = getString(C6256e.places_learn_more_answer_3);
                    break;
                case 3:
                    string = getString(C6256e.places_learn_more_answer_4);
                    break;
                case 4:
                    string = getString(C6256e.places_learn_more_answer_5);
                    break;
                case 5:
                    string = getString(C6256e.places_learn_more_answer_6);
                    break;
                case 6:
                    string = getString(C6256e.places_learn_more_answer_7);
                    break;
                case 7:
                    C2668g.a(inflate, "questionView");
                    string = m54494a(inflate, LinkAnswerType.Q8);
                    break;
                default:
                    C2668g.a(inflate, "questionView");
                    string = m54494a(inflate, LinkAnswerType.Q9);
                    break;
            }
            textView.setText(string);
            ((LinearLayout) m54498a(C6254c.learnMoreLinearLayout)).addView(inflate);
        }
    }

    /* renamed from: a */
    private final Spanned m54494a(View view, LinkAnswerType linkAnswerType) {
        TextView textView = (TextView) view.findViewById(C6254c.answerText);
        C2668g.a(textView, "answerTextView");
        textView.setMovementMethod(new LearnMoreLinkMovementMethod(this.f45377a));
        if (linkAnswerType == LinkAnswerType.Q8) {
            view = getString(C6256e.places_learn_more_answer_8);
        } else {
            view = getString(C6256e.places_learn_more_answer_9);
        }
        if (VERSION.SDK_INT >= 24) {
            view = Html.fromHtml(view, null);
            C2668g.a(view, "Html.fromHtml(string, Html.FROM_HTML_MODE_LEGACY)");
            return view;
        }
        view = Html.fromHtml(view);
        C2668g.a(view, "Html.fromHtml(string)");
        return view;
    }

    /* renamed from: a */
    private final void m54497a(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        if (intent.resolveActivity(getPackageManager()) == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        startActivity(intent);
    }
}
