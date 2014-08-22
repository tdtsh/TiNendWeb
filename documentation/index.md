# TiNendWeb Module

## Description

TiNendWeb module extends the Appcelerator Titanium Mobile's WebView.
To catch event beforeload 'market://detail' throwen by Nend SDK for Google Play.
Titanium Android module for use nend web script on Android 2.3.

## Accessing the TiNendWeb Module

To access this module from JavaScript, you would do the following:

	var TiNendWeb = require('com.tdtsh.TiNendWeb');


The TiNendWeb variable is a reference to the Module object.	


## Usage

```javascript
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
```

```html
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=Shift_JIS" >
        <meta name="viewport" content="width=device-width, minimum-scale=1, maximum-scale=1">
    </head>
    <body style="margin:0px;background-color:#ffffff" >
		<script type="text/javascript">
		var nend_params = {"media":82,"site":58536,"spot":127513,"type":1,"oriented":1};
		</script>
		<script type="text/javascript" src="http://js1.nend.net/js/nendAdLoader.js"></script>
    </body>
</html>
```

## Author

Tadatoshi Hanazaki
web: http://www.close-to.biz/
twitter: @hntn

## License

The MIT License (MIT) Copyright (c) 2014 Tadatoshi Hanazaki
