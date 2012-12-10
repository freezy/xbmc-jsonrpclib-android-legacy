/*
 *      Copyright (C) 2005-2012 Team XBMC
 *      http://xbmc.org
 *
 *  This Program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2, or (at your option)
 *  any later version.
 *
 *  This Program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with XBMC Remote; see the file license.  If not, write to
 *  the Free Software Foundation, 675 Mass Ave, Cambridge, MA 02139, USA.
 *  http://www.gnu.org/copyleft/gpl.html
 *
 */
package org.xbmc.android.jsonrpc.api.call;

import android.os.Parcel;
import android.os.Parcelable;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.node.ObjectNode;
import org.xbmc.android.jsonrpc.api.AbstractCall;
import org.xbmc.android.jsonrpc.api.model.GUIModel;
import org.xbmc.android.jsonrpc.api.model.GlobalModel;

public final class GUI {

	/**
	 * Activates the given window.
	 * <p/>
	 * This class represents the API method <tt>GUI.ActivateWindow</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class ActivateWindow extends AbstractCall<String> {
		public final static String API_TYPE = "GUI.ActivateWindow";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected ActivateWindow(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<ActivateWindow> CREATOR = new Parcelable.Creator<ActivateWindow>() {
			@Override
			public ActivateWindow createFromParcel(Parcel parcel) {
				return new ActivateWindow(parcel);
			}
			@Override
			public ActivateWindow[] newArray(int n) {
				return new ActivateWindow[n];
			}
		};

		/**
		 * Activates the given window.
		 * @param window One of: <tt>home</tt>, <tt>programs</tt>, <tt>pictures</tt>, <tt>filemanager</tt>, <tt>files</tt>, <tt>settings</tt>, <tt>music</tt>, <tt>video</tt>, <tt>videos</tt>, <tt>tv</tt>, <tt>pvr</tt>, <tt>pvrguideinfo</tt>, <tt>pvrrecordinginfo</tt>, <tt>pvrtimersetting</tt>, <tt>pvrgroupmanager</tt>, <tt>pvrchannelmanager</tt>, <tt>pvrguidesearch</tt>, <tt>pvrchannelscan</tt>, <tt>pvrupdateprogress</tt>, <tt>pvrosdchannels</tt>, <tt>pvrosdguide</tt>, <tt>pvrosddirector</tt>, <tt>pvrosdcutter</tt>, <tt>pvrosdteletext</tt>, <tt>systeminfo</tt>, <tt>testpattern</tt>, <tt>screencalibration</tt>, <tt>guicalibration</tt>, <tt>picturessettings</tt>, <tt>programssettings</tt>, <tt>weathersettings</tt>, <tt>musicsettings</tt>, <tt>systemsettings</tt>, <tt>videossettings</tt>, <tt>networksettings</tt>, <tt>servicesettings</tt>, <tt>appearancesettings</tt>, <tt>pvrsettings</tt>, <tt>tvsettings</tt>, <tt>scripts</tt>, <tt>videofiles</tt>, <tt>videolibrary</tt>, <tt>videoplaylist</tt>, <tt>loginscreen</tt>, <tt>profiles</tt>, <tt>skinsettings</tt>, <tt>addonbrowser</tt>, <tt>yesnodialog</tt>, <tt>progressdialog</tt>, <tt>virtualkeyboard</tt>, <tt>volumebar</tt>, <tt>submenu</tt>, <tt>favourites</tt>, <tt>contextmenu</tt>, <tt>infodialog</tt>, <tt>numericinput</tt>, <tt>gamepadinput</tt>, <tt>shutdownmenu</tt>, <tt>mutebug</tt>, <tt>playercontrols</tt>, <tt>seekbar</tt>, <tt>musicosd</tt>, <tt>addonsettings</tt>, <tt>visualisationsettings</tt>, <tt>visualisationpresetlist</tt>, <tt>osdvideosettings</tt>, <tt>osdaudiosettings</tt>, <tt>videobookmarks</tt>, <tt>filebrowser</tt>, <tt>networksetup</tt>, <tt>mediasource</tt>, <tt>profilesettings</tt>, <tt>locksettings</tt>, <tt>contentsettings</tt>, <tt>songinformation</tt>, <tt>smartplaylisteditor</tt>, <tt>smartplaylistrule</tt>, <tt>busydialog</tt>, <tt>pictureinfo</tt>, <tt>accesspoints</tt>, <tt>fullscreeninfo</tt>, <tt>karaokeselector</tt>, <tt>karaokelargeselector</tt>, <tt>sliderdialog</tt>, <tt>addoninformation</tt>, <tt>musicplaylist</tt>, <tt>musicfiles</tt>, <tt>musiclibrary</tt>, <tt>musicplaylisteditor</tt>, <tt>teletext</tt>, <tt>selectdialog</tt>, <tt>musicinformation</tt>, <tt>okdialog</tt>, <tt>movieinformation</tt>, <tt>textviewer</tt>, <tt>fullscreenvideo</tt>, <tt>fullscreenlivetv</tt>, <tt>visualisation</tt>, <tt>slideshow</tt>, <tt>filestackingdialog</tt>, <tt>karaoke</tt>, <tt>weather</tt>, <tt>screensaver</tt>, <tt>videoosd</tt>, <tt>videomenu</tt>, <tt>videotimeseek</tt>, <tt>musicoverlay</tt>, <tt>videooverlay</tt>, <tt>startwindow</tt>, <tt>startup</tt>, <tt>peripherals</tt>, <tt>peripheralsettings</tt>, <tt>extendedprogressdialog</tt>, <tt>mediafilter</tt>. See constants at {@link GUIModel.Window}.
		 * @param parameters
		 */
		public ActivateWindow(String window, String... parameters) {
			super();
			addParameter("window", window);
			addParameter("parameters", parameters);
		}

		/**
		 * Activates the given window.
		 * @param window One of: <tt>home</tt>, <tt>programs</tt>, <tt>pictures</tt>, <tt>filemanager</tt>, <tt>files</tt>, <tt>settings</tt>, <tt>music</tt>, <tt>video</tt>, <tt>videos</tt>, <tt>tv</tt>, <tt>pvr</tt>, <tt>pvrguideinfo</tt>, <tt>pvrrecordinginfo</tt>, <tt>pvrtimersetting</tt>, <tt>pvrgroupmanager</tt>, <tt>pvrchannelmanager</tt>, <tt>pvrguidesearch</tt>, <tt>pvrchannelscan</tt>, <tt>pvrupdateprogress</tt>, <tt>pvrosdchannels</tt>, <tt>pvrosdguide</tt>, <tt>pvrosddirector</tt>, <tt>pvrosdcutter</tt>, <tt>pvrosdteletext</tt>, <tt>systeminfo</tt>, <tt>testpattern</tt>, <tt>screencalibration</tt>, <tt>guicalibration</tt>, <tt>picturessettings</tt>, <tt>programssettings</tt>, <tt>weathersettings</tt>, <tt>musicsettings</tt>, <tt>systemsettings</tt>, <tt>videossettings</tt>, <tt>networksettings</tt>, <tt>servicesettings</tt>, <tt>appearancesettings</tt>, <tt>pvrsettings</tt>, <tt>tvsettings</tt>, <tt>scripts</tt>, <tt>videofiles</tt>, <tt>videolibrary</tt>, <tt>videoplaylist</tt>, <tt>loginscreen</tt>, <tt>profiles</tt>, <tt>skinsettings</tt>, <tt>addonbrowser</tt>, <tt>yesnodialog</tt>, <tt>progressdialog</tt>, <tt>virtualkeyboard</tt>, <tt>volumebar</tt>, <tt>submenu</tt>, <tt>favourites</tt>, <tt>contextmenu</tt>, <tt>infodialog</tt>, <tt>numericinput</tt>, <tt>gamepadinput</tt>, <tt>shutdownmenu</tt>, <tt>mutebug</tt>, <tt>playercontrols</tt>, <tt>seekbar</tt>, <tt>musicosd</tt>, <tt>addonsettings</tt>, <tt>visualisationsettings</tt>, <tt>visualisationpresetlist</tt>, <tt>osdvideosettings</tt>, <tt>osdaudiosettings</tt>, <tt>videobookmarks</tt>, <tt>filebrowser</tt>, <tt>networksetup</tt>, <tt>mediasource</tt>, <tt>profilesettings</tt>, <tt>locksettings</tt>, <tt>contentsettings</tt>, <tt>songinformation</tt>, <tt>smartplaylisteditor</tt>, <tt>smartplaylistrule</tt>, <tt>busydialog</tt>, <tt>pictureinfo</tt>, <tt>accesspoints</tt>, <tt>fullscreeninfo</tt>, <tt>karaokeselector</tt>, <tt>karaokelargeselector</tt>, <tt>sliderdialog</tt>, <tt>addoninformation</tt>, <tt>musicplaylist</tt>, <tt>musicfiles</tt>, <tt>musiclibrary</tt>, <tt>musicplaylisteditor</tt>, <tt>teletext</tt>, <tt>selectdialog</tt>, <tt>musicinformation</tt>, <tt>okdialog</tt>, <tt>movieinformation</tt>, <tt>textviewer</tt>, <tt>fullscreenvideo</tt>, <tt>fullscreenlivetv</tt>, <tt>visualisation</tt>, <tt>slideshow</tt>, <tt>filestackingdialog</tt>, <tt>karaoke</tt>, <tt>weather</tt>, <tt>screensaver</tt>, <tt>videoosd</tt>, <tt>videomenu</tt>, <tt>videotimeseek</tt>, <tt>musicoverlay</tt>, <tt>videooverlay</tt>, <tt>startwindow</tt>, <tt>startup</tt>, <tt>peripherals</tt>, <tt>peripheralsettings</tt>, <tt>extendedprogressdialog</tt>, <tt>mediafilter</tt>. See constants at {@link GUIModel.Window}.
		 */
		public ActivateWindow(String window) {
			super();
			addParameter("window", window);
		}

		@Override
		protected String parseOne(JsonNode node) {
			return node.getTextValue();
		}

		@Override
		public String getName() {
			return API_TYPE;
		}

		@Override
		protected boolean returnsList() {
			return false;
		}
	}

	/**
	 * Retrieves the values of the given properties.
	 * <p/>
	 * This class represents the API method <tt>GUI.GetProperties</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class GetProperties extends AbstractCall<GUIModel.PropertyValue> {
		public final static String API_TYPE = "GUI.GetProperties";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeParcelable(mResult, flags);
		}

		/**
		 * Construct via parcel.
		 */
		protected GetProperties(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<GetProperties> CREATOR = new Parcelable.Creator<GetProperties>() {
			@Override
			public GetProperties createFromParcel(Parcel parcel) {
				return new GetProperties(parcel);
			}
			@Override
			public GetProperties[] newArray(int n) {
				return new GetProperties[n];
			}
		};

		/**
		 * Retrieves the values of the given properties.
		 * @param properties One or more of: <tt>currentwindow</tt>, <tt>currentcontrol</tt>, <tt>skin</tt>, <tt>fullscreen</tt>. See constants at {@link GUIModel.PropertyName}.
		 */
		public GetProperties(String... properties) {
			super();
			addParameter("properties", properties);
		}

		@Override
		protected GUIModel.PropertyValue parseOne(JsonNode node) {
			return new GUIModel.PropertyValue(node);
		}

		@Override
		public String getName() {
			return API_TYPE;
		}

		@Override
		protected boolean returnsList() {
			return false;
		}
	}

	/**
	 * Toggle fullscreen/GUI.
	 * <p/>
	 * This class represents the API method <tt>GUI.SetFullscreen</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class SetFullscreen extends AbstractCall<Boolean> {
		public final static String API_TYPE = "GUI.SetFullscreen";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected SetFullscreen(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<SetFullscreen> CREATOR = new Parcelable.Creator<SetFullscreen>() {
			@Override
			public SetFullscreen createFromParcel(Parcel parcel) {
				return new SetFullscreen(parcel);
			}
			@Override
			public SetFullscreen[] newArray(int n) {
				return new SetFullscreen[n];
			}
		};

		/**
		 * Toggle fullscreen/GUI.
		 * @param fullscreen
		 */
		public SetFullscreen(GlobalModel.Toggle fullscreen) {
			super();
			addParameter("fullscreen", fullscreen);
		}

		@Override
		protected Boolean parseOne(JsonNode node) {
			return node.getBooleanValue();
		}

		@Override
		public String getName() {
			return API_TYPE;
		}

		@Override
		protected boolean returnsList() {
			return false;
		}
	}

	/**
	 * Shows a GUI notification.
	 * <p/>
	 * This class represents the API method <tt>GUI.ShowNotification</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class ShowNotification extends AbstractCall<String> {
		public final static String API_TYPE = "GUI.ShowNotification";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected ShowNotification(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<ShowNotification> CREATOR = new Parcelable.Creator<ShowNotification>() {
			@Override
			public ShowNotification createFromParcel(Parcel parcel) {
				return new ShowNotification(parcel);
			}
			@Override
			public ShowNotification[] newArray(int n) {
				return new ShowNotification[n];
			}
		};

		/**
		 * Shows a GUI notification.
		 * @param title
		 * @param message
		 * @param image
		 * @param displaytimeThe time in milliseconds the notification will be visible.
		 */
		public ShowNotification(String title, String message, String image, Integer displaytime) {
			super();
			addParameter("title", title);
			addParameter("message", message);
			addParameter("image", image);
			addParameter("displaytime", displaytime);
		}

		/**
		 * Shows a GUI notification.
		 * @param title
		 * @param message
		 */
		public ShowNotification(String title, String message) {
			super();
			addParameter("title", title);
			addParameter("message", message);
		}

		/**
		 * Shows a GUI notification.
		 * @param title
		 * @param message
		 * @param image
		 */
		public ShowNotification(String title, String message, String image) {
			super();
			addParameter("title", title);
			addParameter("message", message);
			addParameter("image", image);
		}

		/**
		 * Shows a GUI notification.
		 * @param title
		 * @param message
		 * @param displaytimeThe time in milliseconds the notification will be visible.
		 */
		public ShowNotification(String title, String message, Integer displaytime) {
			super();
			addParameter("title", title);
			addParameter("message", message);
			addParameter("displaytime", displaytime);
		}

		@Override
		protected String parseOne(JsonNode node) {
			return node.getTextValue();
		}

		@Override
		public String getName() {
			return API_TYPE;
		}

		@Override
		protected boolean returnsList() {
			return false;
		}
	}
}
