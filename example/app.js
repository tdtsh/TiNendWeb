// open a single window
var win = Ti.UI.createWindow({
	backgroundColor:'white'
});

var label = Ti.UI.createLabel({width:'auto',height:'auto',text:'TiNendWeb test'});
win.add(label);

// TODO: write your module tests here
var TiNendWeb = require('com.tdtsh.TiNendWeb');

var adView = TiNendWeb.createWebView({
	url: "/nendAd.html",
	width: '320dp',
	height: '50dp',
	bottom: 0,
	zIndex: 1
});

adView.addEventListener('beforeload', function(e) {
	if (e.url.lastIndexOf('market', 0) === 0) {
		Ti.Platform.openURL(e.url);
	}
});

label.text = TiNendWeb.example();

win.open();

