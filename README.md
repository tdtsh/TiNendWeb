TiNendWeb Module
================

Description
-----------

TiNendWeb module extends the Appcelerator Titanium Mobile's WebView.
To catch event beforeload 'market://detail' throwen by Nend SDK for Google Play.

WebView内でGoogle Playへのリンクのクリックを検知するために作ったWebViewの薄いラッパーです。
Titanium + Android 2.3系で NendのSDKによる広告表示ができず、仕方なくWebviewで表示させようとした時に使いましたが、Nend以外の目的でも使えます。

Get the module
--------------

Find the newest version in the dist folder

Referencing the module in your Ti mobile application

Simply add the following lines to your tiapp.xml file:

<modules>
	<module platform="android">net.nend</module>
</modules>

Author
------

Tadatoshi Hanazaki
web: http://www.close-to.biz/
twitter: @hntn

License
-------

The MIT License (MIT) Copyright (c) 2014 Tadatoshi Hanazaki

