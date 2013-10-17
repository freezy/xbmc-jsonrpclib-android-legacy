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
import org.codehaus.jackson.node.BooleanNode;
import org.codehaus.jackson.node.ObjectNode;
import org.codehaus.jackson.node.TextNode;
import org.xbmc.android.jsonrpc.api.AbstractModel;

public final class AddonModel {

	/**
	 * API Name: <tt>Addon.Details</tt>
	 * <p/>
	 * Note: This class is used as result only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class Detail extends ItemModel.BaseDetail {
		public final static String API_TYPE = "Addon.Details";

		// field names
		public static final String ADDONID = "addonid";
		public static final String AUTHOR = "author";
		public static final String BROKEN = "broken";
		public static final String DEPENDENCIES = "dependencies";
		public static final String DESCRIPTION = "description";
		public static final String DISCLAIMER = "disclaimer";
		public static final String ENABLED = "enabled";
		public static final String EXTRAINFO = "extrainfo";
		public static final String FANART = "fanart";
		public static final String NAME = "name";
		public static final String PATH = "path";
		public static final String RATING = "rating";
		public static final String SUMMARY = "summary";
		public static final String THUMBNAIL = "thumbnail";
		public static final String TYPE = "type";
		public static final String VERSION = "version";

		// class members
		public final String addonid;
		public final String author;
		public final Broken broken;
		public final List<Dependency> dependencies;
		public final String description;
		public final String disclaimer;
		public final Boolean enabled;
		public final List<Extrainfo> extrainfo;
		public final String fanart;
		public final String name;
		public final String path;
		public final Integer rating;
		public final String summary;
		public final String thumbnail;
		public final String type;
		public final String version;

		/**
		 * Construct from JSON object.
		 * @param node JSON object representing a Detail object
		 */
		public Detail(JsonNode node) {
			super(node);
			addonid = node.get(ADDONID).getTextValue(); // required value
			author = parseString(node, AUTHOR);
			broken = node.has(BROKEN) ? new Broken(node.get(BROKEN)) : null;
			dependencies = Dependency.getAddonModelDependencyList(node, DEPENDENCIES);
			description = parseString(node, DESCRIPTION);
			disclaimer = parseString(node, DISCLAIMER);
			enabled = parseBoolean(node, ENABLED);
			extrainfo = Extrainfo.getAddonModelExtrainfoList(node, EXTRAINFO);
			fanart = parseString(node, FANART);
			name = parseString(node, NAME);
			path = parseString(node, PATH);
			rating = parseInt(node, RATING);
			summary = parseString(node, SUMMARY);
			thumbnail = parseString(node, THUMBNAIL);
			type = parseString(node, TYPE);
			version = parseString(node, VERSION);
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = (ObjectNode)super.toJsonNode();
			node.put(ADDONID, addonid);
			node.put(AUTHOR, author);
			node.put(BROKEN, broken.toJsonNode());
			final ArrayNode dependenciesArray = OM.createArrayNode();
			for (Dependency item : dependencies) {
				dependenciesArray.add(item.toJsonNode());
			}
			node.put(DEPENDENCIES, dependenciesArray);
			node.put(DESCRIPTION, description);
			node.put(DISCLAIMER, disclaimer);
			node.put(ENABLED, enabled);
			final ArrayNode extrainfoArray = OM.createArrayNode();
			for (Extrainfo item : extrainfo) {
				extrainfoArray.add(item.toJsonNode());
			}
			node.put(EXTRAINFO, extrainfoArray);
			node.put(FANART, fanart);
			node.put(NAME, name);
			node.put(PATH, path);
			node.put(RATING, rating);
			node.put(SUMMARY, summary);
			node.put(THUMBNAIL, thumbnail);
			node.put(TYPE, type); // enum
			node.put(VERSION, version);
			return node;
		}

		/**
		 * Extracts a list of {@link Detail} objects from a JSON array.
		 * @param node ObjectNode containing the list of objects.
		 * @param key Key pointing to the node where the list is stored.
		 */
		static List<Detail> getAddonModelDetailList(JsonNode node, String key) {
			if (node.has(key)) {
				final ArrayNode a = (ArrayNode)node.get(key);
				final List<Detail> l = new ArrayList<Detail>(a.size());
				for (int i = 0; i < a.size(); i++) {
					l.add(new Detail((JsonNode)a.get(i)));
				}
				return l;
			}
			return new ArrayList<Detail>(0);
		}

		/**
		 * Flatten this object into a Parcel.
		 * @param parcel the Parcel in which the object should be written.
		 * @param flags additional flags about how the object should be written.
		 */
		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(addonid);
			parcel.writeValue(author);
			parcel.writeValue(broken);
			parcel.writeInt(dependencies.size());
			for (Dependency item : dependencies) {
				parcel.writeParcelable(item, flags);
			}
			parcel.writeValue(description);
			parcel.writeValue(disclaimer);
			parcel.writeInt(enabled ? 1 : 0);
			parcel.writeInt(extrainfo.size());
			for (Extrainfo item : extrainfo) {
				parcel.writeParcelable(item, flags);
			}
			parcel.writeValue(fanart);
			parcel.writeValue(name);
			parcel.writeValue(path);
			parcel.writeValue(rating);
			parcel.writeValue(summary);
			parcel.writeValue(thumbnail);
			parcel.writeValue(type); // enum
			parcel.writeValue(version);
		}

		/**
		 * Construct via parcel.
		 */
		protected Detail(Parcel parcel) {
			super(parcel);
			addonid = parcel.readString();
			author = parcel.readString();
			broken = parcel.<Broken>readParcelable(Broken.class.getClassLoader());
			final int dependenciesSize = parcel.readInt();
			dependencies = new ArrayList<Dependency>(dependenciesSize);
			for (int i = 0; i < dependenciesSize; i++) {
				dependencies.add(parcel.<Dependency>readParcelable(Dependency.class.getClassLoader()));
			}
			description = parcel.readString();
			disclaimer = parcel.readString();
			enabled = parcel.readInt() == 1;
			final int extrainfoSize = parcel.readInt();
			extrainfo = new ArrayList<Extrainfo>(extrainfoSize);
			for (int i = 0; i < extrainfoSize; i++) {
				extrainfo.add(parcel.<Extrainfo>readParcelable(Extrainfo.class.getClassLoader()));
			}
			fanart = parcel.readString();
			name = parcel.readString();
			path = parcel.readString();
			rating = parcel.readInt();
			summary = parcel.readString();
			thumbnail = parcel.readString();
			type = parcel.readString(); // enum
			version = parcel.readString();
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<Detail> CREATOR = new Parcelable.Creator<Detail>() {
			@Override
			public Detail createFromParcel(Parcel parcel) {
				return new Detail(parcel);
			}
			@Override
			public Detail[] newArray(int n) {
				return new Detail[n];
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
		public static class Broken extends AbstractModel {

			// class members
			public final Boolean booleanArg;
			public final String stringArg;

			/**
			 * @param booleanArg
			 */
			public Broken(Boolean booleanArg) {
				this.booleanArg = booleanArg;
				this.stringArg = null;
			}

			/**
			 * @param stringArg
			 */
			public Broken(String stringArg) {
				this.stringArg = stringArg;
				this.booleanArg = null;
			}

			/**
			 * Construct from JSON object.
			 * @param node JSON object representing a Broken object
			 */
			public Broken(JsonNode node) {
				if (node.isBoolean()) {
					booleanArg = node.getBooleanValue();
					stringArg = null;
				}
				else if (node.isTextual()) {
					stringArg = node.getTextValue();
					booleanArg = null;
				}
				else {
					throw new RuntimeException("Weird type for \"broken\", I'm confused!");
				}
			}

			@Override
			public JsonNode toJsonNode() {
				if (booleanArg != null) {
					return booleanArg ? BooleanNode.TRUE : BooleanNode.FALSE;
				}
				if (stringArg != null) {
					return new TextNode(stringArg);
				}
				return null; // this is completely excluded. theoretically.
			}

			/**
			 * Extracts a list of {@link Broken} objects from a JSON array.
			 * @param node ObjectNode containing the list of objects.
			 * @param key Key pointing to the node where the list is stored.
			 */
			static List<Broken> getAddonModelBrokenList(JsonNode node, String key) {
				if (node.has(key)) {
					final ArrayNode a = (ArrayNode)node.get(key);
					final List<Broken> l = new ArrayList<Broken>(a.size());
					for (int i = 0; i < a.size(); i++) {
						l.add(new Broken((JsonNode)a.get(i)));
					}
					return l;
				}
				return new ArrayList<Broken>(0);
			}

			/**
			 * Flatten this object into a Parcel.
			 * @param parcel the Parcel in which the object should be written.
			 * @param flags additional flags about how the object should be written.
			 */
			@Override
			public void writeToParcel(Parcel parcel, int flags) {
				parcel.writeInt(booleanArg ? 1 : 0);
				parcel.writeValue(stringArg);
			}

			/**
			 * Construct via parcel.
			 */
			protected Broken(Parcel parcel) {
				booleanArg = parcel.readInt() == 1;
				stringArg = parcel.readString();
			}

			/**
			 * Generates instances of this Parcelable class from a Parcel.
			 */
			public static final Parcelable.Creator<Broken> CREATOR = new Parcelable.Creator<Broken>() {
				@Override
				public Broken createFromParcel(Parcel parcel) {
					return new Broken(parcel);
				}
				@Override
				public Broken[] newArray(int n) {
					return new Broken[n];
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
		public static class Dependency extends AbstractModel {

			// field names
			public static final String ADDONID = "addonid";
			public static final String OPTIONAL = "optional";
			public static final String VERSION = "version";

			// class members
			public final String addonid;
			public final Boolean optional;
			public final String version;

			/**
			 * @param addonid
			 * @param optional
			 * @param version
			 */
			public Dependency(String addonid, Boolean optional, String version) {
				this.addonid = addonid;
				this.optional = optional;
				this.version = version;
			}

			/**
			 * Construct from JSON object.
			 * @param node JSON object representing a Dependency object
			 */
			public Dependency(JsonNode node) {
				addonid = node.get(ADDONID).getTextValue(); // required value
				optional = node.get(OPTIONAL).getBooleanValue(); // required value
				version = node.get(VERSION).getTextValue(); // required value
			}

			@Override
			public JsonNode toJsonNode() {
				final ObjectNode node = OM.createObjectNode();
				node.put(ADDONID, addonid);
				node.put(OPTIONAL, optional);
				node.put(VERSION, version);
				return node;
			}

			/**
			 * Extracts a list of {@link Dependency} objects from a JSON array.
			 * @param node ObjectNode containing the list of objects.
			 * @param key Key pointing to the node where the list is stored.
			 */
			static List<Dependency> getAddonModelDependencyList(JsonNode node, String key) {
				if (node.has(key)) {
					final ArrayNode a = (ArrayNode)node.get(key);
					final List<Dependency> l = new ArrayList<Dependency>(a.size());
					for (int i = 0; i < a.size(); i++) {
						l.add(new Dependency((JsonNode)a.get(i)));
					}
					return l;
				}
				return new ArrayList<Dependency>(0);
			}

			/**
			 * Flatten this object into a Parcel.
			 * @param parcel the Parcel in which the object should be written.
			 * @param flags additional flags about how the object should be written.
			 */
			@Override
			public void writeToParcel(Parcel parcel, int flags) {
				parcel.writeValue(addonid);
				parcel.writeInt(optional ? 1 : 0);
				parcel.writeValue(version);
			}

			/**
			 * Construct via parcel.
			 */
			protected Dependency(Parcel parcel) {
				addonid = parcel.readString();
				optional = parcel.readInt() == 1;
				version = parcel.readString();
			}

			/**
			 * Generates instances of this Parcelable class from a Parcel.
			 */
			public static final Parcelable.Creator<Dependency> CREATOR = new Parcelable.Creator<Dependency>() {
				@Override
				public Dependency createFromParcel(Parcel parcel) {
					return new Dependency(parcel);
				}
				@Override
				public Dependency[] newArray(int n) {
					return new Dependency[n];
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
		public static class Extrainfo extends AbstractModel {

			// field names
			public static final String KEY = "key";
			public static final String VALUE = "value";

			// class members
			public final String key;
			public final String value;

			/**
			 * @param key
			 * @param value
			 */
			public Extrainfo(String key, String value) {
				this.key = key;
				this.value = value;
			}

			/**
			 * Construct from JSON object.
			 * @param node JSON object representing a Extrainfo object
			 */
			public Extrainfo(JsonNode node) {
				key = node.get(KEY).getTextValue(); // required value
				value = node.get(VALUE).getTextValue(); // required value
			}

			@Override
			public JsonNode toJsonNode() {
				final ObjectNode node = OM.createObjectNode();
				node.put(KEY, key);
				node.put(VALUE, value);
				return node;
			}

			/**
			 * Extracts a list of {@link Extrainfo} objects from a JSON array.
			 * @param node ObjectNode containing the list of objects.
			 * @param key Key pointing to the node where the list is stored.
			 */
			static List<Extrainfo> getAddonModelExtrainfoList(JsonNode node, String key) {
				if (node.has(key)) {
					final ArrayNode a = (ArrayNode)node.get(key);
					final List<Extrainfo> l = new ArrayList<Extrainfo>(a.size());
					for (int i = 0; i < a.size(); i++) {
						l.add(new Extrainfo((JsonNode)a.get(i)));
					}
					return l;
				}
				return new ArrayList<Extrainfo>(0);
			}

			/**
			 * Flatten this object into a Parcel.
			 * @param parcel the Parcel in which the object should be written.
			 * @param flags additional flags about how the object should be written.
			 */
			@Override
			public void writeToParcel(Parcel parcel, int flags) {
				parcel.writeValue(key);
				parcel.writeValue(value);
			}

			/**
			 * Construct via parcel.
			 */
			protected Extrainfo(Parcel parcel) {
				key = parcel.readString();
				value = parcel.readString();
			}

			/**
			 * Generates instances of this Parcelable class from a Parcel.
			 */
			public static final Parcelable.Creator<Extrainfo> CREATOR = new Parcelable.Creator<Extrainfo>() {
				@Override
				public Extrainfo createFromParcel(Parcel parcel) {
					return new Extrainfo(parcel);
				}
				@Override
				public Extrainfo[] newArray(int n) {
					return new Extrainfo[n];
				}
			};

			@Override
			public int describeContents() {
				return 0;
			}
		}

		/**
		 * API Name: <tt>type</tt>
		 */
		public interface Type {

			public final String UNKNOWN = "unknown";
			public final String XBMC_METADATA_SCRAPER_ALBUMS = "xbmc.metadata.scraper.albums";
			public final String XBMC_METADATA_SCRAPER_ARTISTS = "xbmc.metadata.scraper.artists";
			public final String XBMC_METADATA_SCRAPER_MOVIES = "xbmc.metadata.scraper.movies";
			public final String XBMC_METADATA_SCRAPER_MUSICVIDEOS = "xbmc.metadata.scraper.musicvideos";
			public final String XBMC_METADATA_SCRAPER_TVSHOWS = "xbmc.metadata.scraper.tvshows";
			public final String XBMC_UI_SCREENSAVER = "xbmc.ui.screensaver";
			public final String XBMC_PLAYER_MUSICVIZ = "xbmc.player.musicviz";
			public final String XBMC_PYTHON_PLUGINSOURCE = "xbmc.python.pluginsource";
			public final String XBMC_PYTHON_SCRIPT = "xbmc.python.script";
			public final String XBMC_PYTHON_WEATHER = "xbmc.python.weather";
			public final String XBMC_PYTHON_SUBTITLES = "xbmc.python.subtitles";
			public final String XBMC_PYTHON_LYRICS = "xbmc.python.lyrics";
			public final String XBMC_GUI_SKIN = "xbmc.gui.skin";
			public final String XBMC_GUI_WEBINTERFACE = "xbmc.gui.webinterface";
			public final String XBMC_PVRCLIENT = "xbmc.pvrclient";
			public final String XBMC_ADDON_VIDEO = "xbmc.addon.video";
			public final String XBMC_ADDON_AUDIO = "xbmc.addon.audio";
			public final String XBMC_ADDON_IMAGE = "xbmc.addon.image";
			public final String XBMC_ADDON_EXECUTABLE = "xbmc.addon.executable";
			public final String XBMC_SERVICE = "xbmc.service";

			public final static Set<String> values = new HashSet<String>(Arrays.asList(UNKNOWN, XBMC_METADATA_SCRAPER_ALBUMS, XBMC_METADATA_SCRAPER_ARTISTS, XBMC_METADATA_SCRAPER_MOVIES, XBMC_METADATA_SCRAPER_MUSICVIDEOS, XBMC_METADATA_SCRAPER_TVSHOWS, XBMC_UI_SCREENSAVER, XBMC_PLAYER_MUSICVIZ, XBMC_PYTHON_PLUGINSOURCE, XBMC_PYTHON_SCRIPT, XBMC_PYTHON_WEATHER, XBMC_PYTHON_SUBTITLES, XBMC_PYTHON_LYRICS, XBMC_GUI_SKIN, XBMC_GUI_WEBINTERFACE, XBMC_PVRCLIENT, XBMC_ADDON_VIDEO, XBMC_ADDON_AUDIO, XBMC_ADDON_IMAGE, XBMC_ADDON_EXECUTABLE, XBMC_SERVICE));
		}
	}

	/**
	 * API Name: <tt>Addon.Content</tt>
	 */
	public interface Content {

		public final String UNKNOWN = "unknown";
		public final String VIDEO = "video";
		public final String AUDIO = "audio";
		public final String IMAGE = "image";
		public final String EXECUTABLE = "executable";

		public final static Set<String> values = new HashSet<String>(Arrays.asList(UNKNOWN, VIDEO, AUDIO, IMAGE, EXECUTABLE));
	}

	/**
	 * API Name: <tt>Addon.Fields</tt>
	 */
	public interface Fields {

		public final String NAME = "name";
		public final String VERSION = "version";
		public final String SUMMARY = "summary";
		public final String DESCRIPTION = "description";
		public final String PATH = "path";
		public final String AUTHOR = "author";
		public final String THUMBNAIL = "thumbnail";
		public final String DISCLAIMER = "disclaimer";
		public final String FANART = "fanart";
		public final String DEPENDENCIES = "dependencies";
		public final String BROKEN = "broken";
		public final String EXTRAINFO = "extrainfo";
		public final String RATING = "rating";
		public final String ENABLED = "enabled";

		public final static Set<String> values = new HashSet<String>(Arrays.asList(NAME, VERSION, SUMMARY, DESCRIPTION, PATH, AUTHOR, THUMBNAIL, DISCLAIMER, FANART, DEPENDENCIES, BROKEN, EXTRAINFO, RATING, ENABLED));
	}

	/**
	 * API Name: <tt>Addon.Types</tt>
	 */
	public interface Types {

		public final String UNKNOWN = "unknown";
		public final String XBMC_METADATA_SCRAPER_ALBUMS = "xbmc.metadata.scraper.albums";
		public final String XBMC_METADATA_SCRAPER_ARTISTS = "xbmc.metadata.scraper.artists";
		public final String XBMC_METADATA_SCRAPER_MOVIES = "xbmc.metadata.scraper.movies";
		public final String XBMC_METADATA_SCRAPER_MUSICVIDEOS = "xbmc.metadata.scraper.musicvideos";
		public final String XBMC_METADATA_SCRAPER_TVSHOWS = "xbmc.metadata.scraper.tvshows";
		public final String XBMC_UI_SCREENSAVER = "xbmc.ui.screensaver";
		public final String XBMC_PLAYER_MUSICVIZ = "xbmc.player.musicviz";
		public final String XBMC_PYTHON_PLUGINSOURCE = "xbmc.python.pluginsource";
		public final String XBMC_PYTHON_SCRIPT = "xbmc.python.script";
		public final String XBMC_PYTHON_WEATHER = "xbmc.python.weather";
		public final String XBMC_PYTHON_SUBTITLES = "xbmc.python.subtitles";
		public final String XBMC_PYTHON_LYRICS = "xbmc.python.lyrics";
		public final String XBMC_GUI_SKIN = "xbmc.gui.skin";
		public final String XBMC_GUI_WEBINTERFACE = "xbmc.gui.webinterface";
		public final String XBMC_PVRCLIENT = "xbmc.pvrclient";
		public final String XBMC_ADDON_VIDEO = "xbmc.addon.video";
		public final String XBMC_ADDON_AUDIO = "xbmc.addon.audio";
		public final String XBMC_ADDON_IMAGE = "xbmc.addon.image";
		public final String XBMC_ADDON_EXECUTABLE = "xbmc.addon.executable";
		public final String XBMC_SERVICE = "xbmc.service";

		public final static Set<String> values = new HashSet<String>(Arrays.asList(UNKNOWN, XBMC_METADATA_SCRAPER_ALBUMS, XBMC_METADATA_SCRAPER_ARTISTS, XBMC_METADATA_SCRAPER_MOVIES, XBMC_METADATA_SCRAPER_MUSICVIDEOS, XBMC_METADATA_SCRAPER_TVSHOWS, XBMC_UI_SCREENSAVER, XBMC_PLAYER_MUSICVIZ, XBMC_PYTHON_PLUGINSOURCE, XBMC_PYTHON_SCRIPT, XBMC_PYTHON_WEATHER, XBMC_PYTHON_SUBTITLES, XBMC_PYTHON_LYRICS, XBMC_GUI_SKIN, XBMC_GUI_WEBINTERFACE, XBMC_PVRCLIENT, XBMC_ADDON_VIDEO, XBMC_ADDON_AUDIO, XBMC_ADDON_IMAGE, XBMC_ADDON_EXECUTABLE, XBMC_SERVICE));
	}
}
