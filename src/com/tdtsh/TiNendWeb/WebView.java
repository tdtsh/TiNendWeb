package com.tdtsh.TiNendWeb;

import org.appcelerator.kroll.KrollDict;
import org.appcelerator.titanium.proxy.TiViewProxy;
import org.appcelerator.titanium.util.Log;
import org.appcelerator.titanium.view.TiUIView;

import ti.modules.titanium.ui.widget.webview.TiUIWebView;
import ti.modules.titanium.ui.widget.webview.TiWebViewClient;

import android.webkit.WebSettings;
import android.content.Intent;
import android.net.Uri;

public class WebView extends TiUIWebView
{
	private static final String LCAT = "WebView";

	public WebView(TiViewProxy proxy) 
	{
		super(proxy);

		// 広告用WebView 
		android.webkit.WebView mWebViewNendAd =  super.getWebView();

		WebSettings settings = mWebViewNendAd.getSettings();
		settings.setJavaScriptEnabled(true);
		settings.setSupportMultipleWindows(false);
		settings.setJavaScriptCanOpenWindowsAutomatically(false);

        mWebViewNendAd.setWebViewClient(new TiWebViewClient(this, mWebViewNendAd) {
			@Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
				Log.d(LCAT, "shouldOverrideUrlLoading url: " + url);
				Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
				view.getProxy().getActivity().startActivity(intent);
				return true;
            }
        });
		setNativeView(mWebViewNendAd);
	}

	@Override
	public void processProperties(KrollDict d)
	{
		super.processProperties(d);
	}

}
