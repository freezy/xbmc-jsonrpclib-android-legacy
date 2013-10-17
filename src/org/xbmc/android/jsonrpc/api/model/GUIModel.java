/*
 *      Copyright (C) 2005-2013 Team XBMC
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
package org.xbmc.android.jsonrpc.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.ObjectNode;
import org.xbmc.android.jsonrpc.api.AbstractModel;

public final class GUIModel {

	/**
	 * API Name: <tt>GUI.Property.Value</tt>
	 * <p/>
	 * Note: This class is used as result only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class PropertyValue extends AbstractModel {
		public final static String API_TYPE = "GUI.Property.Value";

		// field names
		public static final String CURRENTCONTROL = "currentcontrol";
		public static final String CURRENTWINDOW = "currentwindow";
		public static final String FULLSCREEN = "fullscreen";
		public static final String SKIN = "skin";

		// class members
		public final Currentcontrol currentcontrol;
		public final Currentwindow currentwindow;
		public final Boolean fullscreen;
		public final Skin skin;

		/**
		 * @param currentcontrol
		 * @param currentwindow
		 * @param fullscreen
		 * @param skin
		 */
		public PropertyValue(Currentcontrol currentcontrol, Currentwindow currentwindow, Boolean fullscreen, Skin skin) {
			this.currentcontrol = currentcontrol;
			this.currentwindow = currentwindow;
			this.fullscreen = fullscreen;
			this.skin = skin;
		}

		/**
		 * Construct from JSON object.
		 * @param node JSON object representing a PropertyValue object
		 */
		public PropertyValue(JsonNode node) {
			currentcontrol = node.has(CURRENTCONTROL) ? new Currentcontrol(node.get(CURRENTCONTROL)) : null;
			currentwindow = node.has(CURRENTWINDOW) ? new Currentwindow(node.get(CURRENTWINDOW)) : null;
			fullscreen = parseBoolean(node, FULLSCREEN);
			skin = node.has(SKIN) ? new Skin(node.get(SKIN)) : null;
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = OM.createObjectNode();
			node.put(CURRENTCONTROL, currentcontrol.toJsonNode());
			node.put(CURRENTWINDOW, currentwindow.toJsonNode());
			node.put(FULLSCREEN, fullscreen);
			node.put(SKIN, skin.toJsonNode());
			return node;
		}

		/**
		 * Extracts a list of {@link PropertyValue} objects from a JSON array.
		 * @param node ObjectNode containing the list of objects.
		 * @param key Key pointing to the node where the list is stored.
		 */
		static List<PropertyValue> getGUIModelPropertyValueList(JsonNode node, String key) {
			if (node.has(key)) {
				final ArrayNode a = (ArrayNode)node.get(key);
				final List<PropertyValue> l = new ArrayList<PropertyValue>(a.size());
				for (int i = 0; i < a.size(); i++) {
					l.add(new PropertyValue((JsonNode)a.get(i)));
				}
				return l;
			}
			return new ArrayList<PropertyValue>(0);
		}

		/**
		 * Flatten this object into a Parcel.
		 * @param parcel the Parcel in which the object should be written.
		 * @param flags additional flags about how the object should be written.
		 */
		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			parcel.writeValue(currentcontrol);
			parcel.writeValue(currentwindow);
			parcel.writeInt(fullscreen ? 1 : 0);
			parcel.writeValue(skin);
		}

		/**
		 * Construct via parcel.
		 */
		protected PropertyValue(Parcel parcel) {
			currentcontrol = parcel.<Currentcontrol>readParcelable(Currentcontrol.class.getClassLoader());
			currentwindow = parcel.<Currentwindow>readParcelable(Currentwindow.class.getClassLoader());
			fullscreen = parcel.readInt() == 1;
			skin = parcel.<Skin>readParcelable(Skin.class.getClassLoader());
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<PropertyValue> CREATOR = new Parcelable.Creator<PropertyValue>() {
			@Override
			public PropertyValue createFromParcel(Parcel parcel) {
				return new PropertyValue(parcel);
			}
			@Override
			public PropertyValue[] newArray(int n) {
				return new PropertyValue[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}

		/**
		 * Note: This class is used as result only.<br/>
		 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
		 */
		public static class Skin extends AbstractModel {

			// field names
			public static final String ID = "id";
			public static final String NAME = "name";

			// class members
			public final String id;
			public final String name;

			/**
			 * @param id
			 * @param name
			 */
			public Skin(String id, String name) {
				this.id = id;
				this.name = name;
			}

			/**
			 * Construct from JSON object.
			 * @param node JSON object representing a Skin object
			 */
			public Skin(JsonNode node) {
				id = node.get(ID).getTextValue(); // required value
				name = parseString(node, NAME);
			}

			@Override
			public JsonNode toJsonNode() {
				final ObjectNode node = OM.createObjectNode();
				node.put(ID, id);
				node.put(NAME, name);
				return node;
			}

			/**
			 * Extracts a list of {@link Skin} objects from a JSON array.
			 * @param node ObjectNode containing the list of objects.
			 * @param key Key pointing to the node where the list is stored.
			 */
			static List<Skin> getGUIModelSkinList(JsonNode node, String key) {
				if (node.has(key)) {
					final ArrayNode a = (ArrayNode)node.get(key);
					final List<Skin> l = new ArrayList<Skin>(a.size());
					for (int i = 0; i < a.size(); i++) {
						l.add(new Skin((JsonNode)a.get(i)));
					}
					return l;
				}
				return new ArrayList<Skin>(0);
			}

			/**
			 * Flatten this object into a Parcel.
			 * @param parcel the Parcel in which the object should be written.
			 * @param flags additional flags about how the object should be written.
			 */
			@Override
			public void writeToParcel(Parcel parcel, int flags) {
				parcel.writeValue(id);
				parcel.writeValue(name);
			}

			/**
			 * Construct via parcel.
			 */
			protected Skin(Parcel parcel) {
				id = parcel.readString();
				name = parcel.readString();
			}

			/**
			 * Generates instances of this Parcelable class from a Parcel.
			 */
			public static final Parcelable.Creator<Skin> CREATOR = new Parcelable.Creator<Skin>() {
				@Override
				public Skin createFromParcel(Parcel parcel) {
					return new Skin(parcel);
				}
				@Override
				public Skin[] newArray(int n) {
					return new Skin[n];
				}
			};

			@Override
			public int describeContents() {
				return 0;
			}
		}

		/**
		 * Note: This class is used as result only.<br/>
		 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
		 */
		public static class Currentwindow extends AbstractModel {

			// field names
			public static final String ID = "id";
			public static final String LABEL = "label";

			// class members
			public final Integer id;
			public final String label;

			/**
			 * @param id
			 * @param label
			 */
			public Currentwindow(Integer id, String label) {
				this.id = id;
				this.label = label;
			}

			/**
			 * Construct from JSON object.
			 * @param node JSON object representing a Currentwindow object
			 */
			public Currentwindow(JsonNode node) {
				id = node.get(ID).getIntValue(); // required value
				label = node.get(LABEL).getTextValue(); // required value
			}

			@Override
			public JsonNode toJsonNode() {
				final ObjectNode node = OM.createObjectNode();
				node.put(ID, id);
				node.put(LABEL, label);
				return node;
			}

			/**
			 * Extracts a list of {@link Currentwindow} objects from a JSON array.
			 * @param node ObjectNode containing the list of objects.
			 * @param key Key pointing to the node where the list is stored.
			 */
			static List<Currentwindow> getGUIModelCurrentwindowList(JsonNode node, String key) {
				if (node.has(key)) {
					final ArrayNode a = (ArrayNode)node.get(key);
					final List<Currentwindow> l = new ArrayList<Currentwindow>(a.size());
					for (int i = 0; i < a.size(); i++) {
						l.add(new Currentwindow((JsonNode)a.get(i)));
					}
					return l;
				}
				return new ArrayList<Currentwindow>(0);
			}

			/**
			 * Flatten this object into a Parcel.
			 * @param parcel the Parcel in which the object should be written.
			 * @param flags additional flags about how the object should be written.
			 */
			@Override
			public void writeToParcel(Parcel parcel, int flags) {
				parcel.writeValue(id);
				parcel.writeValue(label);
			}

			/**
			 * Construct via parcel.
			 */
			protected Currentwindow(Parcel parcel) {
				id = parcel.readInt();
				label = parcel.readString();
			}

			/**
			 * Generates instances of this Parcelable class from a Parcel.
			 */
			public static final Parcelable.Creator<Currentwindow> CREATOR = new Parcelable.Creator<Currentwindow>() {
				@Override
				public Currentwindow createFromParcel(Parcel parcel) {
					return new Currentwindow(parcel);
				}
				@Override
				public Currentwindow[] newArray(int n) {
					return new Currentwindow[n];
				}
			};

			@Override
			public int describeContents() {
				return 0;
			}
		}

		/**
		 * Note: This class is used as result only.<br/>
		 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
		 */
		public static class Currentcontrol extends AbstractModel {

			// field names
			public static final String LABEL = "label";

			// class members
			public final String label;

			/**
			 * @param label
			 */
			public Currentcontrol(String label) {
				this.label = label;
			}

			/**
			 * Construct from JSON object.
			 * @param node JSON object representing a Currentcontrol object
			 */
			public Currentcontrol(JsonNode node) {
				label = node.get(LABEL).getTextValue(); // required value
			}

			@Override
			public JsonNode toJsonNode() {
				final ObjectNode node = OM.createObjectNode();
				node.put(LABEL, label);
				return node;
			}

			/**
			 * Extracts a list of {@link Currentcontrol} objects from a JSON array.
			 * @param node ObjectNode containing the list of objects.
			 * @param key Key pointing to the node where the list is stored.
			 */
			static List<Currentcontrol> getGUIModelCurrentcontrolList(JsonNode node, String key) {
				if (node.has(key)) {
					final ArrayNode a = (ArrayNode)node.get(key);
					final List<Currentcontrol> l = new ArrayList<Currentcontrol>(a.size());
					for (int i = 0; i < a.size(); i++) {
						l.add(new Currentcontrol((JsonNode)a.get(i)));
					}
					return l;
				}
				return new ArrayList<Currentcontrol>(0);
			}

			/**
			 * Flatten this object into a Parcel.
			 * @param parcel the Parcel in which the object should be written.
			 * @param flags additional flags about how the object should be written.
			 */
			@Override
			public void writeToParcel(Parcel parcel, int flags) {
				parcel.writeValue(label);
			}

			/**
			 * Construct via parcel.
			 */
			protected Currentcontrol(Parcel parcel) {
				label = parcel.readString();
			}

			/**
			 * Generates instances of this Parcelable class from a Parcel.
			 */
			public static final Parcelable.Creator<Currentcontrol> CREATOR = new Parcelable.Creator<Currentcontrol>() {
				@Override
				public Currentcontrol createFromParcel(Parcel parcel) {
					return new Currentcontrol(parcel);
				}
				@Override
				public Currentcontrol[] newArray(int n) {
					return new Currentcontrol[n];
				}
			};

			@Override
			public int describeContents() {
				return 0;
			}
		}
	}

	/**
	 * API Name: <tt>GUI.Property.Name</tt>
	 */
	public interface PropertyName {

		public final String CURRENTWINDOW = "currentwindow";
		public final String CURRENTCONTROL = "currentcontrol";
		public final String SKIN = "skin";
		public final String FULLSCREEN = "fullscreen";

		public final static Set<String> values = new HashSet<String>(Arrays.asList(CURRENTWINDOW, CURRENTCONTROL, SKIN, FULLSCREEN));
	}

	/**
	 * API Name: <tt>GUI.Window</tt>
	 */
	public interface Window {

		public final String HOME = "home";
		public final String PROGRAMS = "programs";
		public final String PICTURES = "pictures";
		public final String FILEMANAGER = "filemanager";
		public final String FILES = "files";
		public final String SETTINGS = "settings";
		public final String MUSIC = "music";
		public final String VIDEO = "video";
		public final String VIDEOS = "videos";
		public final String TV = "tv";
		public final String PVR = "pvr";
		public final String PVRGUIDEINFO = "pvrguideinfo";
		public final String PVRRECORDINGINFO = "pvrrecordinginfo";
		public final String PVRTIMERSETTING = "pvrtimersetting";
		public final String PVRGROUPMANAGER = "pvrgroupmanager";
		public final String PVRCHANNELMANAGER = "pvrchannelmanager";
		public final String PVRGUIDESEARCH = "pvrguidesearch";
		public final String PVRCHANNELSCAN = "pvrchannelscan";
		public final String PVRUPDATEPROGRESS = "pvrupdateprogress";
		public final String PVROSDCHANNELS = "pvrosdchannels";
		public final String PVROSDGUIDE = "pvrosdguide";
		public final String PVROSDDIRECTOR = "pvrosddirector";
		public final String PVROSDCUTTER = "pvrosdcutter";
		public final String PVROSDTELETEXT = "pvrosdteletext";
		public final String SYSTEMINFO = "systeminfo";
		public final String TESTPATTERN = "testpattern";
		public final String SCREENCALIBRATION = "screencalibration";
		public final String GUICALIBRATION = "guicalibration";
		public final String PICTURESSETTINGS = "picturessettings";
		public final String PROGRAMSSETTINGS = "programssettings";
		public final String WEATHERSETTINGS = "weathersettings";
		public final String MUSICSETTINGS = "musicsettings";
		public final String SYSTEMSETTINGS = "systemsettings";
		public final String VIDEOSSETTINGS = "videossettings";
		public final String NETWORKSETTINGS = "networksettings";
		public final String SERVICESETTINGS = "servicesettings";
		public final String APPEARANCESETTINGS = "appearancesettings";
		public final String PVRSETTINGS = "pvrsettings";
		public final String TVSETTINGS = "tvsettings";
		public final String SCRIPTS = "scripts";
		public final String VIDEOFILES = "videofiles";
		public final String VIDEOLIBRARY = "videolibrary";
		public final String VIDEOPLAYLIST = "videoplaylist";
		public final String LOGINSCREEN = "loginscreen";
		public final String PROFILES = "profiles";
		public final String SKINSETTINGS = "skinsettings";
		public final String ADDONBROWSER = "addonbrowser";
		public final String YESNODIALOG = "yesnodialog";
		public final String PROGRESSDIALOG = "progressdialog";
		public final String VIRTUALKEYBOARD = "virtualkeyboard";
		public final String VOLUMEBAR = "volumebar";
		public final String SUBMENU = "submenu";
		public final String FAVOURITES = "favourites";
		public final String CONTEXTMENU = "contextmenu";
		public final String INFODIALOG = "infodialog";
		public final String NUMERICINPUT = "numericinput";
		public final String GAMEPADINPUT = "gamepadinput";
		public final String SHUTDOWNMENU = "shutdownmenu";
		public final String MUTEBUG = "mutebug";
		public final String PLAYERCONTROLS = "playercontrols";
		public final String SEEKBAR = "seekbar";
		public final String MUSICOSD = "musicosd";
		public final String ADDONSETTINGS = "addonsettings";
		public final String VISUALISATIONSETTINGS = "visualisationsettings";
		public final String VISUALISATIONPRESETLIST = "visualisationpresetlist";
		public final String OSDVIDEOSETTINGS = "osdvideosettings";
		public final String OSDAUDIOSETTINGS = "osdaudiosettings";
		public final String VIDEOBOOKMARKS = "videobookmarks";
		public final String FILEBROWSER = "filebrowser";
		public final String NETWORKSETUP = "networksetup";
		public final String MEDIASOURCE = "mediasource";
		public final String PROFILESETTINGS = "profilesettings";
		public final String LOCKSETTINGS = "locksettings";
		public final String CONTENTSETTINGS = "contentsettings";
		public final String SONGINFORMATION = "songinformation";
		public final String SMARTPLAYLISTEDITOR = "smartplaylisteditor";
		public final String SMARTPLAYLISTRULE = "smartplaylistrule";
		public final String BUSYDIALOG = "busydialog";
		public final String PICTUREINFO = "pictureinfo";
		public final String ACCESSPOINTS = "accesspoints";
		public final String FULLSCREENINFO = "fullscreeninfo";
		public final String KARAOKESELECTOR = "karaokeselector";
		public final String KARAOKELARGESELECTOR = "karaokelargeselector";
		public final String SLIDERDIALOG = "sliderdialog";
		public final String ADDONINFORMATION = "addoninformation";
		public final String MUSICPLAYLIST = "musicplaylist";
		public final String MUSICFILES = "musicfiles";
		public final String MUSICLIBRARY = "musiclibrary";
		public final String MUSICPLAYLISTEDITOR = "musicplaylisteditor";
		public final String TELETEXT = "teletext";
		public final String SELECTDIALOG = "selectdialog";
		public final String MUSICINFORMATION = "musicinformation";
		public final String OKDIALOG = "okdialog";
		public final String MOVIEINFORMATION = "movieinformation";
		public final String TEXTVIEWER = "textviewer";
		public final String FULLSCREENVIDEO = "fullscreenvideo";
		public final String FULLSCREENLIVETV = "fullscreenlivetv";
		public final String VISUALISATION = "visualisation";
		public final String SLIDESHOW = "slideshow";
		public final String FILESTACKINGDIALOG = "filestackingdialog";
		public final String KARAOKE = "karaoke";
		public final String WEATHER = "weather";
		public final String SCREENSAVER = "screensaver";
		public final String VIDEOOSD = "videoosd";
		public final String VIDEOMENU = "videomenu";
		public final String VIDEOTIMESEEK = "videotimeseek";
		public final String MUSICOVERLAY = "musicoverlay";
		public final String VIDEOOVERLAY = "videooverlay";
		public final String STARTWINDOW = "startwindow";
		public final String STARTUP = "startup";
		public final String PERIPHERALS = "peripherals";
		public final String PERIPHERALSETTINGS = "peripheralsettings";
		public final String EXTENDEDPROGRESSDIALOG = "extendedprogressdialog";
		public final String MEDIAFILTER = "mediafilter";
		public final String ADDON = "addon";

		public final static Set<String> values = new HashSet<String>(Arrays.asList(HOME, PROGRAMS, PICTURES, FILEMANAGER, FILES, SETTINGS, MUSIC, VIDEO, VIDEOS, TV, PVR, PVRGUIDEINFO, PVRRECORDINGINFO, PVRTIMERSETTING, PVRGROUPMANAGER, PVRCHANNELMANAGER, PVRGUIDESEARCH, PVRCHANNELSCAN, PVRUPDATEPROGRESS, PVROSDCHANNELS, PVROSDGUIDE, PVROSDDIRECTOR, PVROSDCUTTER, PVROSDTELETEXT, SYSTEMINFO, TESTPATTERN, SCREENCALIBRATION, GUICALIBRATION, PICTURESSETTINGS, PROGRAMSSETTINGS, WEATHERSETTINGS, MUSICSETTINGS, SYSTEMSETTINGS, VIDEOSSETTINGS, NETWORKSETTINGS, SERVICESETTINGS, APPEARANCESETTINGS, PVRSETTINGS, TVSETTINGS, SCRIPTS, VIDEOFILES, VIDEOLIBRARY, VIDEOPLAYLIST, LOGINSCREEN, PROFILES, SKINSETTINGS, ADDONBROWSER, YESNODIALOG, PROGRESSDIALOG, VIRTUALKEYBOARD, VOLUMEBAR, SUBMENU, FAVOURITES, CONTEXTMENU, INFODIALOG, NUMERICINPUT, GAMEPADINPUT, SHUTDOWNMENU, MUTEBUG, PLAYERCONTROLS, SEEKBAR, MUSICOSD, ADDONSETTINGS, VISUALISATIONSETTINGS, VISUALISATIONPRESETLIST, OSDVIDEOSETTINGS, OSDAUDIOSETTINGS, VIDEOBOOKMARKS, FILEBROWSER, NETWORKSETUP, MEDIASOURCE, PROFILESETTINGS, LOCKSETTINGS, CONTENTSETTINGS, SONGINFORMATION, SMARTPLAYLISTEDITOR, SMARTPLAYLISTRULE, BUSYDIALOG, PICTUREINFO, ACCESSPOINTS, FULLSCREENINFO, KARAOKESELECTOR, KARAOKELARGESELECTOR, SLIDERDIALOG, ADDONINFORMATION, MUSICPLAYLIST, MUSICFILES, MUSICLIBRARY, MUSICPLAYLISTEDITOR, TELETEXT, SELECTDIALOG, MUSICINFORMATION, OKDIALOG, MOVIEINFORMATION, TEXTVIEWER, FULLSCREENVIDEO, FULLSCREENLIVETV, VISUALISATION, SLIDESHOW, FILESTACKINGDIALOG, KARAOKE, WEATHER, SCREENSAVER, VIDEOOSD, VIDEOMENU, VIDEOTIMESEEK, MUSICOVERLAY, VIDEOOVERLAY, STARTWINDOW, STARTUP, PERIPHERALS, PERIPHERALSETTINGS, EXTENDEDPROGRESSDIALOG, MEDIAFILTER, ADDON));
	}
}
