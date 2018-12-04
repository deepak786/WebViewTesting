package mobilyte.com.webviewtesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = findViewById(R.id.webView);
        String text = "Lorem ipsum dollar sit amet. Lorem ipsum dollar sit amet. Lorem ipsum dollar sit amet. Lorem ipsum dollar sit amet. Lorem ipsum dollar sit amet.";
        String contentStr = String.valueOf(Html
                .fromHtml("<![CDATA[<body style=\"text-align:justify;color:#80000000; \"><i><small>"
                        + text
                        + "</small></i></body>]]>"));
        webView.loadDataWithBaseURL(null, contentStr, "text/html", "utf-8", null);
    }
}
