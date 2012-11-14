
XBMC JSON-RPC library for Android
=================================

This is a library that is [generated](https://github.com/freezy/xbmc-jsonrpclib-android-generator)
from JSON-RPC's [introspect](http://wiki.xbmc.org/index.php?title=JSON-RPC_API/v3#JSONRPC.Introspect).
It takes care of marshaling and unmarshaling the JSON data into Java class
objects and vice versa. It also wraps a Java object model around JSON-RPC's output
and input objects.

Additionally, all results are [parcelable](http://developer.android.com/reference/android/os/Parcelable.html)
so they can easily passed from one Android [activity](http://developer.android.com/reference/android/app/Activity.html)
to another.

The library also contains an implementation of the network stack that can be 
used if necessary.


Dependencies
------------

* Obivously, the [Android framework](http://developer.android.com/sdk/index.html) is needed.
* As serializer, Jackson is used, which can be obtained [here](http://jackson.codehaus.org/).

All dependencies should be in the Eclipse project that is included in the repository.

Integration
-----------

If you want to use the provided connection service, you'll have to add this into
your Manifest under `application`: 

	<service android:name="org.xbmc.android.jsonrpc.service.ConnectionService" />
	
You'll also need to request permission to access the network (under `manifest`):

	<uses-permission android:name="android.permission.INTERNET" />

The API can the be accessed via the `ConnectionManager`. For instance, for fetching
all music albums, you would write:

```java
// init connection manager
final ConnectionManager cm = new ConnectionManager(getApplicationContext(), new HostConfig("192.168.0.100"));

// create api call object
final AudioLibrary.GetAlbums call = new AudioLibrary.GetAlbums(null, null, (ListModel.AlbumFilter)null, 
		AudioModel.AlbumFields.TITLE, AudioModel.AlbumFields.YEAR); // only fetch title and year

// execute
cm.call(call, new ApiCallback<AlbumDetail>() {
	public void onResponse(AbstractCall<AlbumDetail> call) {
		for (AlbumDetail album : call.getResults()) {
			Log.d(TAG, "Got album: " + album.title + " (" + album.year + ")");
		}
	}
	public void onError(int code, String message, String hint) {
		Log.d(TAG, "Error " + code + ": " + message);
	}
});
```

Note that the response is always asynchronous and is run in the service and not 
in the UI thread. 

Branches
--------

The master branch will always be built against a nightly build of XBMC. I'll 
create additional branches for Eden and Frodo soon.

