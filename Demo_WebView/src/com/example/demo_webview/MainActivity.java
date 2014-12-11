package com.example.demo_webview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
private WebView webView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	webView=(WebView)findViewById(R.id.webView);
	webView.setWebViewClient(new WebViewClient());
	webView.loadUrl("http://www.baidu.com");
	}

	

}
