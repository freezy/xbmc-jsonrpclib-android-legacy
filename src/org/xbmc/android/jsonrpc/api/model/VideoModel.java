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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.ObjectNode;
import org.xbmc.android.jsonrpc.api.AbstractModel;

public final class VideoModel {

	/**
	 * API Name: <tt>null</tt>
	 * <p/>
	 * Note: This class is used as result only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class Cast extends AbstractModel {

		// field names
		public static final String NAME = "name";
		public static final String ROLE = "role";
		public static final String THUMBNAIL = "thumbnail";

		// class members
		public final String name;
		public final String role;
		public final String thumbnail;

		/**
		 * @param name
		 * @param role
		 * @param thumbnail
		 */
		public Cast(String name, String role, String thumbnail) {
			this.name = name;
			this.role = role;
			this.thumbnail = thumbnail;
		}

		/**
		 * Construct from JSON object.
		 * @param node JSON object representing a Cast object
		 */
		public Cast(JsonNode node) {
			name = node.get(NAME).getTextValue(); // required value
			role = node.get(ROLE).getTextValue(); // required value
			thumbnail = parseString(node, THUMBNAIL);
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = OM.createObjectNode();
			node.put(NAME, name);
			node.put(ROLE, role);
			node.put(THUMBNAIL, thumbnail);
			return node;
		}

		/**
		 * Extracts a list of {@link Cast} objects from a JSON array.
		 * @param node ObjectNode containing the list of objects.
		 * @param key Key pointing to the node where the list is stored.
		 */
		static List<Cast> getVideoModelCastList(JsonNode node, String key) {
			if (node.has(key)) {
				final ArrayNode a = (ArrayNode)node.get(key);
				final List<Cast> l = new ArrayList<Cast>(a.size());
				for (int i = 0; i < a.size(); i++) {
					l.add(new Cast((JsonNode)a.get(i)));
				}
				return l;
			}
			return new ArrayList<Cast>(0);
		}

		/**
		 * Flatten this object into a Parcel.
		 * @param parcel the Parcel in which the object should be written.
		 * @param flags additional flags about how the object should be written.
		 */
		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			parcel.writeValue(name);
			parcel.writeValue(role);
			parcel.writeValue(thumbnail);
		}

		/**
		 * Construct via parcel.
		 */
		protected Cast(Parcel parcel) {
			name = parcel.readString();
			role = parcel.readString();
			thumbnail = parcel.readString();
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<Cast> CREATOR = new Parcelable.Creator<Cast>() {
			@Override
			public Cast createFromParcel(Parcel parcel) {
				return new Cast(parcel);
			}
			@Override
			public Cast[] newArray(int n) {
				return new Cast[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}
	}

	/**
	 * API Name: <tt>Video.Details.Base</tt>
	 * <p/>
	 * Note: This class is used as result only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class BaseDetail extends MediaModel.BaseDetail {
		public final static String API_TYPE = "Video.Details.Base";

		// field names
		public static final String ART = "art";
		public static final String PLAYCOUNT = "playcount";

		// class members
		public final MediaModel.Artwork art;
		public final Integer playcount;

		/**
		 * Construct from JSON object.
		 * @param node JSON object representing a BaseDetail object
		 */
		public BaseDetail(JsonNode node) {
			super(node);
			art = node.has(ART) ? new MediaModel.Artwork(node.get(ART)) : null;
			playcount = parseInt(node, PLAYCOUNT);
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = (ObjectNode)super.toJsonNode();
			node.put(ART, art.toJsonNode());
			node.put(PLAYCOUNT, playcount);
			return node;
		}

		/**
		 * Extracts a list of {@link BaseDetail} objects from a JSON array.
		 * @param node ObjectNode containing the list of objects.
		 * @param key Key pointing to the node where the list is stored.
		 */
		static List<BaseDetail> getVideoModelBaseDetailList(JsonNode node, String key) {
			if (node.has(key)) {
				final ArrayNode a = (ArrayNode)node.get(key);
				final List<BaseDetail> l = new ArrayList<BaseDetail>(a.size());
				for (int i = 0; i < a.size(); i++) {
					l.add(new BaseDetail((JsonNode)a.get(i)));
				}
				return l;
			}
			return new ArrayList<BaseDetail>(0);
		}

		/**
		 * Flatten this object into a Parcel.
		 * @param parcel the Parcel in which the object should be written.
		 * @param flags additional flags about how the object should be written.
		 */
		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(art);
			parcel.writeValue(playcount);
		}

		/**
		 * Construct via parcel.
		 */
		protected BaseDetail(Parcel parcel) {
			super(parcel);
			art = parcel.<MediaModel.Artwork>readParcelable(MediaModel.Artwork.class.getClassLoader());
			playcount = parcel.readInt();
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<BaseDetail> CREATOR = new Parcelable.Creator<BaseDetail>() {
			@Override
			public BaseDetail createFromParcel(Parcel parcel) {
				return new BaseDetail(parcel);
			}
			@Override
			public BaseDetail[] newArray(int n) {
				return new BaseDetail[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}
	}

	/**
	 * API Name: <tt>Video.Details.Episode</tt>
	 * <p/>
	 * Note: This class is used as result only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class EpisodeDetail extends FileDetail {
		public final static String API_TYPE = "Video.Details.Episode";

		// field names
		public static final String CAST = "cast";
		public static final String EPISODE = "episode";
		public static final String EPISODEID = "episodeid";
		public static final String FIRSTAIRED = "firstaired";
		public static final String ORIGINALTITLE = "originaltitle";
		public static final String PRODUCTIONCODE = "productioncode";
		public static final String RATING = "rating";
		public static final String SEASON = "season";
		public static final String SHOWTITLE = "showtitle";
		public static final String TVSHOWID = "tvshowid";
		public static final String UNIQUEID = "uniqueid";
		public static final String VOTES = "votes";
		public static final String WRITER = "writer";

		// class members
		public final List<Cast> cast;
		public final Integer episode;
		public final Integer episodeid;
		public final String firstaired;
		public final String originaltitle;
		public final String productioncode;
		public final Double rating;
		public final Integer season;
		public final String showtitle;
		public final Integer tvshowid;
		public final HashMap<String, String> uniqueid;
		public final String votes;
		public final List<String> writer;

		/**
		 * Construct from JSON object.
		 * @param node JSON object representing a EpisodeDetail object
		 */
		public EpisodeDetail(JsonNode node) {
			super(node);
			cast = Cast.getVideoModelCastList(node, CAST);
			episode = parseInt(node, EPISODE);
			episodeid = parseInt(node, EPISODEID);
			firstaired = parseString(node, FIRSTAIRED);
			originaltitle = parseString(node, ORIGINALTITLE);
			productioncode = parseString(node, PRODUCTIONCODE);
			rating = parseDouble(node, RATING);
			season = parseInt(node, SEASON);
			showtitle = parseString(node, SHOWTITLE);
			tvshowid = parseInt(node, TVSHOWID);
			uniqueid = getStringMap(node, UNIQUEID);
			votes = parseString(node, VOTES);
			writer = getStringArray(node, WRITER);
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = (ObjectNode)super.toJsonNode();
			final ArrayNode castArray = OM.createArrayNode();
			for (Cast item : cast) {
				castArray.add(item.toJsonNode());
			}
			node.put(CAST, castArray);
			node.put(EPISODE, episode);
			node.put(EPISODEID, episodeid);
			node.put(FIRSTAIRED, firstaired);
			node.put(ORIGINALTITLE, originaltitle);
			node.put(PRODUCTIONCODE, productioncode);
			node.put(RATING, rating);
			node.put(SEASON, season);
			node.put(SHOWTITLE, showtitle);
			node.put(TVSHOWID, tvshowid);
			final ObjectNode uniqueidMap = OM.createObjectNode();
			for (String key : uniqueid.values()) {
				uniqueidMap.put(key, uniqueid.get(key));
			}
			node.put(UNIQUEID, uniqueidMap);
			node.put(VOTES, votes);
			final ArrayNode writerArray = OM.createArrayNode();
			for (String item : writer) {
				writerArray.add(item);
			}
			node.put(WRITER, writerArray);
			return node;
		}

		/**
		 * Extracts a list of {@link EpisodeDetail} objects from a JSON array.
		 * @param node ObjectNode containing the list of objects.
		 * @param key Key pointing to the node where the list is stored.
		 */
		static List<EpisodeDetail> getVideoModelEpisodeDetailList(JsonNode node, String key) {
			if (node.has(key)) {
				final ArrayNode a = (ArrayNode)node.get(key);
				final List<EpisodeDetail> l = new ArrayList<EpisodeDetail>(a.size());
				for (int i = 0; i < a.size(); i++) {
					l.add(new EpisodeDetail((JsonNode)a.get(i)));
				}
				return l;
			}
			return new ArrayList<EpisodeDetail>(0);
		}

		/**
		 * Flatten this object into a Parcel.
		 * @param parcel the Parcel in which the object should be written.
		 * @param flags additional flags about how the object should be written.
		 */
		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeInt(cast.size());
			for (Cast item : cast) {
				parcel.writeParcelable(item, flags);
			}
			parcel.writeValue(episode);
			parcel.writeValue(episodeid);
			parcel.writeValue(firstaired);
			parcel.writeValue(originaltitle);
			parcel.writeValue(productioncode);
			parcel.writeValue(rating);
			parcel.writeValue(season);
			parcel.writeValue(showtitle);
			parcel.writeValue(tvshowid);
			parcel.writeInt(uniqueid.size());
			for (String key : uniqueid.values()) {
				parcel.writeValue(key);
				parcel.writeValue(uniqueid.get(key));
			}
			parcel.writeValue(votes);
			parcel.writeInt(writer.size());
			for (String item : writer) {
				parcel.writeValue(item);
			}
		}

		/**
		 * Construct via parcel.
		 */
		protected EpisodeDetail(Parcel parcel) {
			super(parcel);
			final int castSize = parcel.readInt();
			cast = new ArrayList<Cast>(castSize);
			for (int i = 0; i < castSize; i++) {
				cast.add(parcel.<Cast>readParcelable(Cast.class.getClassLoader()));
			}
			episode = parcel.readInt();
			episodeid = parcel.readInt();
			firstaired = parcel.readString();
			originaltitle = parcel.readString();
			productioncode = parcel.readString();
			rating = parcel.readDouble();
			season = parcel.readInt();
			showtitle = parcel.readString();
			tvshowid = parcel.readInt();
			final int uniqueidSize = parcel.readInt();
			uniqueid = new HashMap<String, String>();
			for (int i = 0; i < uniqueidSize; i++) {
				uniqueid.put(parcel.readString(), parcel.readString());
			}
			votes = parcel.readString();
			final int writerSize = parcel.readInt();
			writer = new ArrayList<String>(writerSize);
			for (int i = 0; i < writerSize; i++) {
				writer.add(parcel.readString());
			}
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<EpisodeDetail> CREATOR = new Parcelable.Creator<EpisodeDetail>() {
			@Override
			public EpisodeDetail createFromParcel(Parcel parcel) {
				return new EpisodeDetail(parcel);
			}
			@Override
			public EpisodeDetail[] newArray(int n) {
				return new EpisodeDetail[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}
	}

	/**
	 * API Name: <tt>Video.Details.File</tt>
	 * <p/>
	 * Note: This class is used as result only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class FileDetail extends ItemDetail {
		public final static String API_TYPE = "Video.Details.File";

		// field names
		public static final String DIRECTOR = "director";
		public static final String RESUME = "resume";
		public static final String RUNTIME = "runtime";
		public static final String STREAMDETAILS = "streamdetails";

		// class members
		public final List<String> director;
		public final Resume resume;
		public final Integer runtime;
		public final Streams streamdetails;

		/**
		 * Construct from JSON object.
		 * @param node JSON object representing a FileDetail object
		 */
		public FileDetail(JsonNode node) {
			super(node);
			director = getStringArray(node, DIRECTOR);
			resume = node.has(RESUME) ? new Resume(node.get(RESUME)) : null;
			runtime = parseInt(node, RUNTIME);
			streamdetails = node.has(STREAMDETAILS) ? new Streams(node.get(STREAMDETAILS)) : null;
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = (ObjectNode)super.toJsonNode();
			final ArrayNode directorArray = OM.createArrayNode();
			for (String item : director) {
				directorArray.add(item);
			}
			node.put(DIRECTOR, directorArray);
			node.put(RESUME, resume.toJsonNode());
			node.put(RUNTIME, runtime);
			node.put(STREAMDETAILS, streamdetails.toJsonNode());
			return node;
		}

		/**
		 * Extracts a list of {@link FileDetail} objects from a JSON array.
		 * @param node ObjectNode containing the list of objects.
		 * @param key Key pointing to the node where the list is stored.
		 */
		static List<FileDetail> getVideoModelFileDetailList(JsonNode node, String key) {
			if (node.has(key)) {
				final ArrayNode a = (ArrayNode)node.get(key);
				final List<FileDetail> l = new ArrayList<FileDetail>(a.size());
				for (int i = 0; i < a.size(); i++) {
					l.add(new FileDetail((JsonNode)a.get(i)));
				}
				return l;
			}
			return new ArrayList<FileDetail>(0);
		}

		/**
		 * Flatten this object into a Parcel.
		 * @param parcel the Parcel in which the object should be written.
		 * @param flags additional flags about how the object should be written.
		 */
		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeInt(director.size());
			for (String item : director) {
				parcel.writeValue(item);
			}
			parcel.writeValue(resume);
			parcel.writeValue(runtime);
			parcel.writeValue(streamdetails);
		}

		/**
		 * Construct via parcel.
		 */
		protected FileDetail(Parcel parcel) {
			super(parcel);
			final int directorSize = parcel.readInt();
			director = new ArrayList<String>(directorSize);
			for (int i = 0; i < directorSize; i++) {
				director.add(parcel.readString());
			}
			resume = parcel.<Resume>readParcelable(Resume.class.getClassLoader());
			runtime = parcel.readInt();
			streamdetails = parcel.<Streams>readParcelable(Streams.class.getClassLoader());
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<FileDetail> CREATOR = new Parcelable.Creator<FileDetail>() {
			@Override
			public FileDetail createFromParcel(Parcel parcel) {
				return new FileDetail(parcel);
			}
			@Override
			public FileDetail[] newArray(int n) {
				return new FileDetail[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}
	}

	/**
	 * API Name: <tt>Video.Details.Item</tt>
	 * <p/>
	 * Note: This class is used as result only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class ItemDetail extends MediaDetail {
		public final static String API_TYPE = "Video.Details.Item";

		// field names
		public static final String DATEADDED = "dateadded";
		public static final String FILE = "file";
		public static final String LASTPLAYED = "lastplayed";
		public static final String PLOT = "plot";

		// class members
		public final String dateadded;
		public final String file;
		public final String lastplayed;
		public final String plot;

		/**
		 * Construct from JSON object.
		 * @param node JSON object representing a ItemDetail object
		 */
		public ItemDetail(JsonNode node) {
			super(node);
			dateadded = parseString(node, DATEADDED);
			file = parseString(node, FILE);
			lastplayed = parseString(node, LASTPLAYED);
			plot = parseString(node, PLOT);
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = (ObjectNode)super.toJsonNode();
			node.put(DATEADDED, dateadded);
			node.put(FILE, file);
			node.put(LASTPLAYED, lastplayed);
			node.put(PLOT, plot);
			return node;
		}

		/**
		 * Extracts a list of {@link ItemDetail} objects from a JSON array.
		 * @param node ObjectNode containing the list of objects.
		 * @param key Key pointing to the node where the list is stored.
		 */
		static List<ItemDetail> getVideoModelItemDetailList(JsonNode node, String key) {
			if (node.has(key)) {
				final ArrayNode a = (ArrayNode)node.get(key);
				final List<ItemDetail> l = new ArrayList<ItemDetail>(a.size());
				for (int i = 0; i < a.size(); i++) {
					l.add(new ItemDetail((JsonNode)a.get(i)));
				}
				return l;
			}
			return new ArrayList<ItemDetail>(0);
		}

		/**
		 * Flatten this object into a Parcel.
		 * @param parcel the Parcel in which the object should be written.
		 * @param flags additional flags about how the object should be written.
		 */
		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(dateadded);
			parcel.writeValue(file);
			parcel.writeValue(lastplayed);
			parcel.writeValue(plot);
		}

		/**
		 * Construct via parcel.
		 */
		protected ItemDetail(Parcel parcel) {
			super(parcel);
			dateadded = parcel.readString();
			file = parcel.readString();
			lastplayed = parcel.readString();
			plot = parcel.readString();
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<ItemDetail> CREATOR = new Parcelable.Creator<ItemDetail>() {
			@Override
			public ItemDetail createFromParcel(Parcel parcel) {
				return new ItemDetail(parcel);
			}
			@Override
			public ItemDetail[] newArray(int n) {
				return new ItemDetail[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}
	}

	/**
	 * API Name: <tt>Video.Details.Media</tt>
	 * <p/>
	 * Note: This class is used as result only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class MediaDetail extends BaseDetail {
		public final static String API_TYPE = "Video.Details.Media";

		// field names
		public static final String TITLE = "title";

		// class members
		public final String title;

		/**
		 * Construct from JSON object.
		 * @param node JSON object representing a MediaDetail object
		 */
		public MediaDetail(JsonNode node) {
			super(node);
			title = parseString(node, TITLE);
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = (ObjectNode)super.toJsonNode();
			node.put(TITLE, title);
			return node;
		}

		/**
		 * Extracts a list of {@link MediaDetail} objects from a JSON array.
		 * @param node ObjectNode containing the list of objects.
		 * @param key Key pointing to the node where the list is stored.
		 */
		static List<MediaDetail> getVideoModelMediaDetailList(JsonNode node, String key) {
			if (node.has(key)) {
				final ArrayNode a = (ArrayNode)node.get(key);
				final List<MediaDetail> l = new ArrayList<MediaDetail>(a.size());
				for (int i = 0; i < a.size(); i++) {
					l.add(new MediaDetail((JsonNode)a.get(i)));
				}
				return l;
			}
			return new ArrayList<MediaDetail>(0);
		}

		/**
		 * Flatten this object into a Parcel.
		 * @param parcel the Parcel in which the object should be written.
		 * @param flags additional flags about how the object should be written.
		 */
		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(title);
		}

		/**
		 * Construct via parcel.
		 */
		protected MediaDetail(Parcel parcel) {
			super(parcel);
			title = parcel.readString();
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<MediaDetail> CREATOR = new Parcelable.Creator<MediaDetail>() {
			@Override
			public MediaDetail createFromParcel(Parcel parcel) {
				return new MediaDetail(parcel);
			}
			@Override
			public MediaDetail[] newArray(int n) {
				return new MediaDetail[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}
	}

	/**
	 * API Name: <tt>Video.Details.Movie</tt>
	 * <p/>
	 * Note: This class is used as result only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class MovieDetail extends FileDetail {
		public final static String API_TYPE = "Video.Details.Movie";

		// field names
		public static final String CAST = "cast";
		public static final String COUNTRY = "country";
		public static final String GENRE = "genre";
		public static final String IMDBNUMBER = "imdbnumber";
		public static final String MOVIEID = "movieid";
		public static final String MPAA = "mpaa";
		public static final String ORIGINALTITLE = "originaltitle";
		public static final String PLOTOUTLINE = "plotoutline";
		public static final String RATING = "rating";
		public static final String SET = "set";
		public static final String SETID = "setid";
		public static final String SHOWLINK = "showlink";
		public static final String SORTTITLE = "sorttitle";
		public static final String STUDIO = "studio";
		public static final String TAG = "tag";
		public static final String TAGLINE = "tagline";
		public static final String TOP250 = "top250";
		public static final String TRAILER = "trailer";
		public static final String VOTES = "votes";
		public static final String WRITER = "writer";
		public static final String YEAR = "year";

		// class members
		public final List<Cast> cast;
		public final List<String> country;
		public final List<String> genre;
		public final String imdbnumber;
		public final Integer movieid;
		public final String mpaa;
		public final String originaltitle;
		public final String plotoutline;
		public final Double rating;
		public final String set;
		public final Integer setid;
		public final List<String> showlink;
		public final String sorttitle;
		public final List<String> studio;
		public final List<String> tag;
		public final String tagline;
		public final Integer top250;
		public final String trailer;
		public final String votes;
		public final List<String> writer;
		public final Integer year;

		/**
		 * Construct from JSON object.
		 * @param node JSON object representing a MovieDetail object
		 */
		public MovieDetail(JsonNode node) {
			super(node);
			cast = Cast.getVideoModelCastList(node, CAST);
			country = getStringArray(node, COUNTRY);
			genre = getStringArray(node, GENRE);
			imdbnumber = parseString(node, IMDBNUMBER);
			movieid = parseInt(node, MOVIEID);
			mpaa = parseString(node, MPAA);
			originaltitle = parseString(node, ORIGINALTITLE);
			plotoutline = parseString(node, PLOTOUTLINE);
			rating = parseDouble(node, RATING);
			set = parseString(node, SET);
			setid = parseInt(node, SETID);
			showlink = getStringArray(node, SHOWLINK);
			sorttitle = parseString(node, SORTTITLE);
			studio = getStringArray(node, STUDIO);
			tag = getStringArray(node, TAG);
			tagline = parseString(node, TAGLINE);
			top250 = parseInt(node, TOP250);
			trailer = parseString(node, TRAILER);
			votes = parseString(node, VOTES);
			writer = getStringArray(node, WRITER);
			year = parseInt(node, YEAR);
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = (ObjectNode)super.toJsonNode();
			final ArrayNode castArray = OM.createArrayNode();
			for (Cast item : cast) {
				castArray.add(item.toJsonNode());
			}
			node.put(CAST, castArray);
			final ArrayNode countryArray = OM.createArrayNode();
			for (String item : country) {
				countryArray.add(item);
			}
			node.put(COUNTRY, countryArray);
			final ArrayNode genreArray = OM.createArrayNode();
			for (String item : genre) {
				genreArray.add(item);
			}
			node.put(GENRE, genreArray);
			node.put(IMDBNUMBER, imdbnumber);
			node.put(MOVIEID, movieid);
			node.put(MPAA, mpaa);
			node.put(ORIGINALTITLE, originaltitle);
			node.put(PLOTOUTLINE, plotoutline);
			node.put(RATING, rating);
			node.put(SET, set);
			node.put(SETID, setid);
			final ArrayNode showlinkArray = OM.createArrayNode();
			for (String item : showlink) {
				showlinkArray.add(item);
			}
			node.put(SHOWLINK, showlinkArray);
			node.put(SORTTITLE, sorttitle);
			final ArrayNode studioArray = OM.createArrayNode();
			for (String item : studio) {
				studioArray.add(item);
			}
			node.put(STUDIO, studioArray);
			final ArrayNode tagArray = OM.createArrayNode();
			for (String item : tag) {
				tagArray.add(item);
			}
			node.put(TAG, tagArray);
			node.put(TAGLINE, tagline);
			node.put(TOP250, top250);
			node.put(TRAILER, trailer);
			node.put(VOTES, votes);
			final ArrayNode writerArray = OM.createArrayNode();
			for (String item : writer) {
				writerArray.add(item);
			}
			node.put(WRITER, writerArray);
			node.put(YEAR, year);
			return node;
		}

		/**
		 * Extracts a list of {@link MovieDetail} objects from a JSON array.
		 * @param node ObjectNode containing the list of objects.
		 * @param key Key pointing to the node where the list is stored.
		 */
		static List<MovieDetail> getVideoModelMovieDetailList(JsonNode node, String key) {
			if (node.has(key)) {
				final ArrayNode a = (ArrayNode)node.get(key);
				final List<MovieDetail> l = new ArrayList<MovieDetail>(a.size());
				for (int i = 0; i < a.size(); i++) {
					l.add(new MovieDetail((JsonNode)a.get(i)));
				}
				return l;
			}
			return new ArrayList<MovieDetail>(0);
		}

		/**
		 * Flatten this object into a Parcel.
		 * @param parcel the Parcel in which the object should be written.
		 * @param flags additional flags about how the object should be written.
		 */
		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeInt(cast.size());
			for (Cast item : cast) {
				parcel.writeParcelable(item, flags);
			}
			parcel.writeInt(country.size());
			for (String item : country) {
				parcel.writeValue(item);
			}
			parcel.writeInt(genre.size());
			for (String item : genre) {
				parcel.writeValue(item);
			}
			parcel.writeValue(imdbnumber);
			parcel.writeValue(movieid);
			parcel.writeValue(mpaa);
			parcel.writeValue(originaltitle);
			parcel.writeValue(plotoutline);
			parcel.writeValue(rating);
			parcel.writeValue(set);
			parcel.writeValue(setid);
			parcel.writeInt(showlink.size());
			for (String item : showlink) {
				parcel.writeValue(item);
			}
			parcel.writeValue(sorttitle);
			parcel.writeInt(studio.size());
			for (String item : studio) {
				parcel.writeValue(item);
			}
			parcel.writeInt(tag.size());
			for (String item : tag) {
				parcel.writeValue(item);
			}
			parcel.writeValue(tagline);
			parcel.writeValue(top250);
			parcel.writeValue(trailer);
			parcel.writeValue(votes);
			parcel.writeInt(writer.size());
			for (String item : writer) {
				parcel.writeValue(item);
			}
			parcel.writeValue(year);
		}

		/**
		 * Construct via parcel.
		 */
		protected MovieDetail(Parcel parcel) {
			super(parcel);
			final int castSize = parcel.readInt();
			cast = new ArrayList<Cast>(castSize);
			for (int i = 0; i < castSize; i++) {
				cast.add(parcel.<Cast>readParcelable(Cast.class.getClassLoader()));
			}
			final int countrySize = parcel.readInt();
			country = new ArrayList<String>(countrySize);
			for (int i = 0; i < countrySize; i++) {
				country.add(parcel.readString());
			}
			final int genreSize = parcel.readInt();
			genre = new ArrayList<String>(genreSize);
			for (int i = 0; i < genreSize; i++) {
				genre.add(parcel.readString());
			}
			imdbnumber = parcel.readString();
			movieid = parcel.readInt();
			mpaa = parcel.readString();
			originaltitle = parcel.readString();
			plotoutline = parcel.readString();
			rating = parcel.readDouble();
			set = parcel.readString();
			setid = parcel.readInt();
			final int showlinkSize = parcel.readInt();
			showlink = new ArrayList<String>(showlinkSize);
			for (int i = 0; i < showlinkSize; i++) {
				showlink.add(parcel.readString());
			}
			sorttitle = parcel.readString();
			final int studioSize = parcel.readInt();
			studio = new ArrayList<String>(studioSize);
			for (int i = 0; i < studioSize; i++) {
				studio.add(parcel.readString());
			}
			final int tagSize = parcel.readInt();
			tag = new ArrayList<String>(tagSize);
			for (int i = 0; i < tagSize; i++) {
				tag.add(parcel.readString());
			}
			tagline = parcel.readString();
			top250 = parcel.readInt();
			trailer = parcel.readString();
			votes = parcel.readString();
			final int writerSize = parcel.readInt();
			writer = new ArrayList<String>(writerSize);
			for (int i = 0; i < writerSize; i++) {
				writer.add(parcel.readString());
			}
			year = parcel.readInt();
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<MovieDetail> CREATOR = new Parcelable.Creator<MovieDetail>() {
			@Override
			public MovieDetail createFromParcel(Parcel parcel) {
				return new MovieDetail(parcel);
			}
			@Override
			public MovieDetail[] newArray(int n) {
				return new MovieDetail[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}
	}

	/**
	 * API Name: <tt>Video.Details.MovieSet</tt>
	 * <p/>
	 * Note: This class is used as result only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class MovieSetDetail extends MediaDetail {
		public final static String API_TYPE = "Video.Details.MovieSet";

		// field names
		public static final String SETID = "setid";

		// class members
		public final Integer setid;

		/**
		 * Construct from JSON object.
		 * @param node JSON object representing a MovieSetDetail object
		 */
		public MovieSetDetail(JsonNode node) {
			super(node);
			setid = parseInt(node, SETID);
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = (ObjectNode)super.toJsonNode();
			node.put(SETID, setid);
			return node;
		}

		/**
		 * Extracts a list of {@link MovieSetDetail} objects from a JSON array.
		 * @param node ObjectNode containing the list of objects.
		 * @param key Key pointing to the node where the list is stored.
		 */
		static List<MovieSetDetail> getVideoModelMovieSetDetailList(JsonNode node, String key) {
			if (node.has(key)) {
				final ArrayNode a = (ArrayNode)node.get(key);
				final List<MovieSetDetail> l = new ArrayList<MovieSetDetail>(a.size());
				for (int i = 0; i < a.size(); i++) {
					l.add(new MovieSetDetail((JsonNode)a.get(i)));
				}
				return l;
			}
			return new ArrayList<MovieSetDetail>(0);
		}

		/**
		 * Flatten this object into a Parcel.
		 * @param parcel the Parcel in which the object should be written.
		 * @param flags additional flags about how the object should be written.
		 */
		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(setid);
		}

		/**
		 * Construct via parcel.
		 */
		protected MovieSetDetail(Parcel parcel) {
			super(parcel);
			setid = parcel.readInt();
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<MovieSetDetail> CREATOR = new Parcelable.Creator<MovieSetDetail>() {
			@Override
			public MovieSetDetail createFromParcel(Parcel parcel) {
				return new MovieSetDetail(parcel);
			}
			@Override
			public MovieSetDetail[] newArray(int n) {
				return new MovieSetDetail[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}
	}

	/**
	 * API Name: <tt>Video.Details.MovieSet.Extended</tt>
	 * <p/>
	 * Note: This class is used as result only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class MovieSetExtendedDetail extends MovieSetDetail {
		public final static String API_TYPE = "Video.Details.MovieSet.Extended";

		// field names
		public static final String LIMITS = "limits";
		public static final String MOVIES = "movies";

		// class members
		public final ListModel.LimitsReturned limits;
		public final List<MovieDetail> movies;

		/**
		 * Construct from JSON object.
		 * @param node JSON object representing a MovieSetExtendedDetail object
		 */
		public MovieSetExtendedDetail(JsonNode node) {
			super(node);
			limits = node.has(LIMITS) ? new ListModel.LimitsReturned(node.get(LIMITS)) : null;
			movies = MovieDetail.getVideoModelMovieDetailList(node, MOVIES);
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = (ObjectNode)super.toJsonNode();
			node.put(LIMITS, limits.toJsonNode());
			final ArrayNode moviesArray = OM.createArrayNode();
			for (MovieDetail item : movies) {
				moviesArray.add(item.toJsonNode());
			}
			node.put(MOVIES, moviesArray);
			return node;
		}

		/**
		 * Extracts a list of {@link MovieSetExtendedDetail} objects from a JSON array.
		 * @param node ObjectNode containing the list of objects.
		 * @param key Key pointing to the node where the list is stored.
		 */
		static List<MovieSetExtendedDetail> getVideoModelMovieSetExtendedDetailList(JsonNode node, String key) {
			if (node.has(key)) {
				final ArrayNode a = (ArrayNode)node.get(key);
				final List<MovieSetExtendedDetail> l = new ArrayList<MovieSetExtendedDetail>(a.size());
				for (int i = 0; i < a.size(); i++) {
					l.add(new MovieSetExtendedDetail((JsonNode)a.get(i)));
				}
				return l;
			}
			return new ArrayList<MovieSetExtendedDetail>(0);
		}

		/**
		 * Flatten this object into a Parcel.
		 * @param parcel the Parcel in which the object should be written.
		 * @param flags additional flags about how the object should be written.
		 */
		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(limits);
			parcel.writeInt(movies.size());
			for (MovieDetail item : movies) {
				parcel.writeParcelable(item, flags);
			}
		}

		/**
		 * Construct via parcel.
		 */
		protected MovieSetExtendedDetail(Parcel parcel) {
			super(parcel);
			limits = parcel.<ListModel.LimitsReturned>readParcelable(ListModel.LimitsReturned.class.getClassLoader());
			final int moviesSize = parcel.readInt();
			movies = new ArrayList<MovieDetail>(moviesSize);
			for (int i = 0; i < moviesSize; i++) {
				movies.add(parcel.<MovieDetail>readParcelable(MovieDetail.class.getClassLoader()));
			}
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<MovieSetExtendedDetail> CREATOR = new Parcelable.Creator<MovieSetExtendedDetail>() {
			@Override
			public MovieSetExtendedDetail createFromParcel(Parcel parcel) {
				return new MovieSetExtendedDetail(parcel);
			}
			@Override
			public MovieSetExtendedDetail[] newArray(int n) {
				return new MovieSetExtendedDetail[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}
	}

	/**
	 * API Name: <tt>Video.Details.MusicVideo</tt>
	 * <p/>
	 * Note: This class is used as result only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class MusicVideoDetail extends FileDetail {
		public final static String API_TYPE = "Video.Details.MusicVideo";

		// field names
		public static final String ALBUM = "album";
		public static final String ARTIST = "artist";
		public static final String GENRE = "genre";
		public static final String MUSICVIDEOID = "musicvideoid";
		public static final String STUDIO = "studio";
		public static final String TAG = "tag";
		public static final String TRACK = "track";
		public static final String YEAR = "year";

		// class members
		public final String album;
		public final List<String> artist;
		public final List<String> genre;
		public final Integer musicvideoid;
		public final List<String> studio;
		public final List<String> tag;
		public final Integer track;
		public final Integer year;

		/**
		 * Construct from JSON object.
		 * @param node JSON object representing a MusicVideoDetail object
		 */
		public MusicVideoDetail(JsonNode node) {
			super(node);
			album = parseString(node, ALBUM);
			artist = getStringArray(node, ARTIST);
			genre = getStringArray(node, GENRE);
			musicvideoid = parseInt(node, MUSICVIDEOID);
			studio = getStringArray(node, STUDIO);
			tag = getStringArray(node, TAG);
			track = parseInt(node, TRACK);
			year = parseInt(node, YEAR);
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = (ObjectNode)super.toJsonNode();
			node.put(ALBUM, album);
			final ArrayNode artistArray = OM.createArrayNode();
			for (String item : artist) {
				artistArray.add(item);
			}
			node.put(ARTIST, artistArray);
			final ArrayNode genreArray = OM.createArrayNode();
			for (String item : genre) {
				genreArray.add(item);
			}
			node.put(GENRE, genreArray);
			node.put(MUSICVIDEOID, musicvideoid);
			final ArrayNode studioArray = OM.createArrayNode();
			for (String item : studio) {
				studioArray.add(item);
			}
			node.put(STUDIO, studioArray);
			final ArrayNode tagArray = OM.createArrayNode();
			for (String item : tag) {
				tagArray.add(item);
			}
			node.put(TAG, tagArray);
			node.put(TRACK, track);
			node.put(YEAR, year);
			return node;
		}

		/**
		 * Extracts a list of {@link MusicVideoDetail} objects from a JSON array.
		 * @param node ObjectNode containing the list of objects.
		 * @param key Key pointing to the node where the list is stored.
		 */
		static List<MusicVideoDetail> getVideoModelMusicVideoDetailList(JsonNode node, String key) {
			if (node.has(key)) {
				final ArrayNode a = (ArrayNode)node.get(key);
				final List<MusicVideoDetail> l = new ArrayList<MusicVideoDetail>(a.size());
				for (int i = 0; i < a.size(); i++) {
					l.add(new MusicVideoDetail((JsonNode)a.get(i)));
				}
				return l;
			}
			return new ArrayList<MusicVideoDetail>(0);
		}

		/**
		 * Flatten this object into a Parcel.
		 * @param parcel the Parcel in which the object should be written.
		 * @param flags additional flags about how the object should be written.
		 */
		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(album);
			parcel.writeInt(artist.size());
			for (String item : artist) {
				parcel.writeValue(item);
			}
			parcel.writeInt(genre.size());
			for (String item : genre) {
				parcel.writeValue(item);
			}
			parcel.writeValue(musicvideoid);
			parcel.writeInt(studio.size());
			for (String item : studio) {
				parcel.writeValue(item);
			}
			parcel.writeInt(tag.size());
			for (String item : tag) {
				parcel.writeValue(item);
			}
			parcel.writeValue(track);
			parcel.writeValue(year);
		}

		/**
		 * Construct via parcel.
		 */
		protected MusicVideoDetail(Parcel parcel) {
			super(parcel);
			album = parcel.readString();
			final int artistSize = parcel.readInt();
			artist = new ArrayList<String>(artistSize);
			for (int i = 0; i < artistSize; i++) {
				artist.add(parcel.readString());
			}
			final int genreSize = parcel.readInt();
			genre = new ArrayList<String>(genreSize);
			for (int i = 0; i < genreSize; i++) {
				genre.add(parcel.readString());
			}
			musicvideoid = parcel.readInt();
			final int studioSize = parcel.readInt();
			studio = new ArrayList<String>(studioSize);
			for (int i = 0; i < studioSize; i++) {
				studio.add(parcel.readString());
			}
			final int tagSize = parcel.readInt();
			tag = new ArrayList<String>(tagSize);
			for (int i = 0; i < tagSize; i++) {
				tag.add(parcel.readString());
			}
			track = parcel.readInt();
			year = parcel.readInt();
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<MusicVideoDetail> CREATOR = new Parcelable.Creator<MusicVideoDetail>() {
			@Override
			public MusicVideoDetail createFromParcel(Parcel parcel) {
				return new MusicVideoDetail(parcel);
			}
			@Override
			public MusicVideoDetail[] newArray(int n) {
				return new MusicVideoDetail[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}
	}

	/**
	 * API Name: <tt>Video.Details.Season</tt>
	 * <p/>
	 * Note: This class is used as result only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class SeasonDetail extends BaseDetail {
		public final static String API_TYPE = "Video.Details.Season";

		// field names
		public static final String EPISODE = "episode";
		public static final String SEASON = "season";
		public static final String SHOWTITLE = "showtitle";
		public static final String TVSHOWID = "tvshowid";
		public static final String WATCHEDEPISODES = "watchedepisodes";

		// class members
		public final Integer episode;
		public final Integer season;
		public final String showtitle;
		public final Integer tvshowid;
		public final Integer watchedepisodes;

		/**
		 * Construct from JSON object.
		 * @param node JSON object representing a SeasonDetail object
		 */
		public SeasonDetail(JsonNode node) {
			super(node);
			episode = parseInt(node, EPISODE);
			season = node.get(SEASON).getIntValue(); // required value
			showtitle = parseString(node, SHOWTITLE);
			tvshowid = parseInt(node, TVSHOWID);
			watchedepisodes = parseInt(node, WATCHEDEPISODES);
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = (ObjectNode)super.toJsonNode();
			node.put(EPISODE, episode);
			node.put(SEASON, season);
			node.put(SHOWTITLE, showtitle);
			node.put(TVSHOWID, tvshowid);
			node.put(WATCHEDEPISODES, watchedepisodes);
			return node;
		}

		/**
		 * Extracts a list of {@link SeasonDetail} objects from a JSON array.
		 * @param node ObjectNode containing the list of objects.
		 * @param key Key pointing to the node where the list is stored.
		 */
		static List<SeasonDetail> getVideoModelSeasonDetailList(JsonNode node, String key) {
			if (node.has(key)) {
				final ArrayNode a = (ArrayNode)node.get(key);
				final List<SeasonDetail> l = new ArrayList<SeasonDetail>(a.size());
				for (int i = 0; i < a.size(); i++) {
					l.add(new SeasonDetail((JsonNode)a.get(i)));
				}
				return l;
			}
			return new ArrayList<SeasonDetail>(0);
		}

		/**
		 * Flatten this object into a Parcel.
		 * @param parcel the Parcel in which the object should be written.
		 * @param flags additional flags about how the object should be written.
		 */
		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(episode);
			parcel.writeValue(season);
			parcel.writeValue(showtitle);
			parcel.writeValue(tvshowid);
			parcel.writeValue(watchedepisodes);
		}

		/**
		 * Construct via parcel.
		 */
		protected SeasonDetail(Parcel parcel) {
			super(parcel);
			episode = parcel.readInt();
			season = parcel.readInt();
			showtitle = parcel.readString();
			tvshowid = parcel.readInt();
			watchedepisodes = parcel.readInt();
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<SeasonDetail> CREATOR = new Parcelable.Creator<SeasonDetail>() {
			@Override
			public SeasonDetail createFromParcel(Parcel parcel) {
				return new SeasonDetail(parcel);
			}
			@Override
			public SeasonDetail[] newArray(int n) {
				return new SeasonDetail[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}
	}

	/**
	 * API Name: <tt>Video.Details.TVShow</tt>
	 * <p/>
	 * Note: This class is used as result only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class TVShowDetail extends ItemDetail {
		public final static String API_TYPE = "Video.Details.TVShow";

		// field names
		public static final String CAST = "cast";
		public static final String EPISODE = "episode";
		public static final String EPISODEGUIDE = "episodeguide";
		public static final String GENRE = "genre";
		public static final String IMDBNUMBER = "imdbnumber";
		public static final String MPAA = "mpaa";
		public static final String ORIGINALTITLE = "originaltitle";
		public static final String PREMIERED = "premiered";
		public static final String RATING = "rating";
		public static final String SEASON = "season";
		public static final String SORTTITLE = "sorttitle";
		public static final String STUDIO = "studio";
		public static final String TAG = "tag";
		public static final String TVSHOWID = "tvshowid";
		public static final String VOTES = "votes";
		public static final String WATCHEDEPISODES = "watchedepisodes";
		public static final String YEAR = "year";

		// class members
		public final List<Cast> cast;
		public final Integer episode;
		public final String episodeguide;
		public final List<String> genre;
		public final String imdbnumber;
		public final String mpaa;
		public final String originaltitle;
		public final String premiered;
		public final Double rating;
		public final Integer season;
		public final String sorttitle;
		public final List<String> studio;
		public final List<String> tag;
		public final Integer tvshowid;
		public final String votes;
		public final Integer watchedepisodes;
		public final Integer year;

		/**
		 * Construct from JSON object.
		 * @param node JSON object representing a TVShowDetail object
		 */
		public TVShowDetail(JsonNode node) {
			super(node);
			cast = Cast.getVideoModelCastList(node, CAST);
			episode = parseInt(node, EPISODE);
			episodeguide = parseString(node, EPISODEGUIDE);
			genre = getStringArray(node, GENRE);
			imdbnumber = parseString(node, IMDBNUMBER);
			mpaa = parseString(node, MPAA);
			originaltitle = parseString(node, ORIGINALTITLE);
			premiered = parseString(node, PREMIERED);
			rating = parseDouble(node, RATING);
			season = parseInt(node, SEASON);
			sorttitle = parseString(node, SORTTITLE);
			studio = getStringArray(node, STUDIO);
			tag = getStringArray(node, TAG);
			tvshowid = parseInt(node, TVSHOWID);
			votes = parseString(node, VOTES);
			watchedepisodes = parseInt(node, WATCHEDEPISODES);
			year = parseInt(node, YEAR);
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = (ObjectNode)super.toJsonNode();
			final ArrayNode castArray = OM.createArrayNode();
			for (Cast item : cast) {
				castArray.add(item.toJsonNode());
			}
			node.put(CAST, castArray);
			node.put(EPISODE, episode);
			node.put(EPISODEGUIDE, episodeguide);
			final ArrayNode genreArray = OM.createArrayNode();
			for (String item : genre) {
				genreArray.add(item);
			}
			node.put(GENRE, genreArray);
			node.put(IMDBNUMBER, imdbnumber);
			node.put(MPAA, mpaa);
			node.put(ORIGINALTITLE, originaltitle);
			node.put(PREMIERED, premiered);
			node.put(RATING, rating);
			node.put(SEASON, season);
			node.put(SORTTITLE, sorttitle);
			final ArrayNode studioArray = OM.createArrayNode();
			for (String item : studio) {
				studioArray.add(item);
			}
			node.put(STUDIO, studioArray);
			final ArrayNode tagArray = OM.createArrayNode();
			for (String item : tag) {
				tagArray.add(item);
			}
			node.put(TAG, tagArray);
			node.put(TVSHOWID, tvshowid);
			node.put(VOTES, votes);
			node.put(WATCHEDEPISODES, watchedepisodes);
			node.put(YEAR, year);
			return node;
		}

		/**
		 * Extracts a list of {@link TVShowDetail} objects from a JSON array.
		 * @param node ObjectNode containing the list of objects.
		 * @param key Key pointing to the node where the list is stored.
		 */
		static List<TVShowDetail> getVideoModelTVShowDetailList(JsonNode node, String key) {
			if (node.has(key)) {
				final ArrayNode a = (ArrayNode)node.get(key);
				final List<TVShowDetail> l = new ArrayList<TVShowDetail>(a.size());
				for (int i = 0; i < a.size(); i++) {
					l.add(new TVShowDetail((JsonNode)a.get(i)));
				}
				return l;
			}
			return new ArrayList<TVShowDetail>(0);
		}

		/**
		 * Flatten this object into a Parcel.
		 * @param parcel the Parcel in which the object should be written.
		 * @param flags additional flags about how the object should be written.
		 */
		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeInt(cast.size());
			for (Cast item : cast) {
				parcel.writeParcelable(item, flags);
			}
			parcel.writeValue(episode);
			parcel.writeValue(episodeguide);
			parcel.writeInt(genre.size());
			for (String item : genre) {
				parcel.writeValue(item);
			}
			parcel.writeValue(imdbnumber);
			parcel.writeValue(mpaa);
			parcel.writeValue(originaltitle);
			parcel.writeValue(premiered);
			parcel.writeValue(rating);
			parcel.writeValue(season);
			parcel.writeValue(sorttitle);
			parcel.writeInt(studio.size());
			for (String item : studio) {
				parcel.writeValue(item);
			}
			parcel.writeInt(tag.size());
			for (String item : tag) {
				parcel.writeValue(item);
			}
			parcel.writeValue(tvshowid);
			parcel.writeValue(votes);
			parcel.writeValue(watchedepisodes);
			parcel.writeValue(year);
		}

		/**
		 * Construct via parcel.
		 */
		protected TVShowDetail(Parcel parcel) {
			super(parcel);
			final int castSize = parcel.readInt();
			cast = new ArrayList<Cast>(castSize);
			for (int i = 0; i < castSize; i++) {
				cast.add(parcel.<Cast>readParcelable(Cast.class.getClassLoader()));
			}
			episode = parcel.readInt();
			episodeguide = parcel.readString();
			final int genreSize = parcel.readInt();
			genre = new ArrayList<String>(genreSize);
			for (int i = 0; i < genreSize; i++) {
				genre.add(parcel.readString());
			}
			imdbnumber = parcel.readString();
			mpaa = parcel.readString();
			originaltitle = parcel.readString();
			premiered = parcel.readString();
			rating = parcel.readDouble();
			season = parcel.readInt();
			sorttitle = parcel.readString();
			final int studioSize = parcel.readInt();
			studio = new ArrayList<String>(studioSize);
			for (int i = 0; i < studioSize; i++) {
				studio.add(parcel.readString());
			}
			final int tagSize = parcel.readInt();
			tag = new ArrayList<String>(tagSize);
			for (int i = 0; i < tagSize; i++) {
				tag.add(parcel.readString());
			}
			tvshowid = parcel.readInt();
			votes = parcel.readString();
			watchedepisodes = parcel.readInt();
			year = parcel.readInt();
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<TVShowDetail> CREATOR = new Parcelable.Creator<TVShowDetail>() {
			@Override
			public TVShowDetail createFromParcel(Parcel parcel) {
				return new TVShowDetail(parcel);
			}
			@Override
			public TVShowDetail[] newArray(int n) {
				return new TVShowDetail[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}
	}

	/**
	 * API Name: <tt>Video.Resume</tt>
	 * <p/>
	 * Note: This class is used as parameter as well as result.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class Resume extends AbstractModel {
		public final static String API_TYPE = "Video.Resume";

		// field names
		public static final String POSITION = "position";
		public static final String TOTAL = "total";

		// class members
		public final Double position;
		public final Double total;

		/**
		 * @param position
		 * @param total
		 */
		public Resume(Double position, Double total) {
			this.position = position;
			this.total = total;
		}

		/**
		 * Construct from JSON object.
		 * @param node JSON object representing a Resume object
		 */
		public Resume(JsonNode node) {
			position = parseDouble(node, POSITION);
			total = parseDouble(node, TOTAL);
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = OM.createObjectNode();
			node.put(POSITION, position);
			node.put(TOTAL, total);
			return node;
		}

		/**
		 * Extracts a list of {@link Resume} objects from a JSON array.
		 * @param node ObjectNode containing the list of objects.
		 * @param key Key pointing to the node where the list is stored.
		 */
		static List<Resume> getVideoModelResumeList(JsonNode node, String key) {
			if (node.has(key)) {
				final ArrayNode a = (ArrayNode)node.get(key);
				final List<Resume> l = new ArrayList<Resume>(a.size());
				for (int i = 0; i < a.size(); i++) {
					l.add(new Resume((JsonNode)a.get(i)));
				}
				return l;
			}
			return new ArrayList<Resume>(0);
		}

		/**
		 * Flatten this object into a Parcel.
		 * @param parcel the Parcel in which the object should be written.
		 * @param flags additional flags about how the object should be written.
		 */
		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			parcel.writeValue(position);
			parcel.writeValue(total);
		}

		/**
		 * Construct via parcel.
		 */
		protected Resume(Parcel parcel) {
			position = parcel.readDouble();
			total = parcel.readDouble();
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<Resume> CREATOR = new Parcelable.Creator<Resume>() {
			@Override
			public Resume createFromParcel(Parcel parcel) {
				return new Resume(parcel);
			}
			@Override
			public Resume[] newArray(int n) {
				return new Resume[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}
	}

	/**
	 * API Name: <tt>Video.Streams</tt>
	 * <p/>
	 * Note: This class is used as result only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class Streams extends AbstractModel {
		public final static String API_TYPE = "Video.Streams";

		// field names
		public static final String AUDIO = "audio";
		public static final String SUBTITLE = "subtitle";
		public static final String VIDEO = "video";

		// class members
		public final List<Audio> audio;
		public final List<Subtitle> subtitle;
		public final List<Video> video;

		/**
		 * @param audio
		 * @param subtitle
		 * @param video
		 */
		public Streams(List<Audio> audio, List<Subtitle> subtitle, List<Video> video) {
			this.audio = audio;
			this.subtitle = subtitle;
			this.video = video;
		}

		/**
		 * Construct from JSON object.
		 * @param node JSON object representing a Streams object
		 */
		public Streams(JsonNode node) {
			audio = Audio.getVideoModelAudioList(node, AUDIO);
			subtitle = Subtitle.getVideoModelSubtitleList(node, SUBTITLE);
			video = Video.getVideoModelVideoList(node, VIDEO);
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = OM.createObjectNode();
			final ArrayNode audioArray = OM.createArrayNode();
			for (Audio item : audio) {
				audioArray.add(item.toJsonNode());
			}
			node.put(AUDIO, audioArray);
			final ArrayNode subtitleArray = OM.createArrayNode();
			for (Subtitle item : subtitle) {
				subtitleArray.add(item.toJsonNode());
			}
			node.put(SUBTITLE, subtitleArray);
			final ArrayNode videoArray = OM.createArrayNode();
			for (Video item : video) {
				videoArray.add(item.toJsonNode());
			}
			node.put(VIDEO, videoArray);
			return node;
		}

		/**
		 * Extracts a list of {@link Streams} objects from a JSON array.
		 * @param node ObjectNode containing the list of objects.
		 * @param key Key pointing to the node where the list is stored.
		 */
		static List<Streams> getVideoModelStreamsList(JsonNode node, String key) {
			if (node.has(key)) {
				final ArrayNode a = (ArrayNode)node.get(key);
				final List<Streams> l = new ArrayList<Streams>(a.size());
				for (int i = 0; i < a.size(); i++) {
					l.add(new Streams((JsonNode)a.get(i)));
				}
				return l;
			}
			return new ArrayList<Streams>(0);
		}

		/**
		 * Flatten this object into a Parcel.
		 * @param parcel the Parcel in which the object should be written.
		 * @param flags additional flags about how the object should be written.
		 */
		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			parcel.writeInt(audio.size());
			for (Audio item : audio) {
				parcel.writeParcelable(item, flags);
			}
			parcel.writeInt(subtitle.size());
			for (Subtitle item : subtitle) {
				parcel.writeParcelable(item, flags);
			}
			parcel.writeInt(video.size());
			for (Video item : video) {
				parcel.writeParcelable(item, flags);
			}
		}

		/**
		 * Construct via parcel.
		 */
		protected Streams(Parcel parcel) {
			final int audioSize = parcel.readInt();
			audio = new ArrayList<Audio>(audioSize);
			for (int i = 0; i < audioSize; i++) {
				audio.add(parcel.<Audio>readParcelable(Audio.class.getClassLoader()));
			}
			final int subtitleSize = parcel.readInt();
			subtitle = new ArrayList<Subtitle>(subtitleSize);
			for (int i = 0; i < subtitleSize; i++) {
				subtitle.add(parcel.<Subtitle>readParcelable(Subtitle.class.getClassLoader()));
			}
			final int videoSize = parcel.readInt();
			video = new ArrayList<Video>(videoSize);
			for (int i = 0; i < videoSize; i++) {
				video.add(parcel.<Video>readParcelable(Video.class.getClassLoader()));
			}
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<Streams> CREATOR = new Parcelable.Creator<Streams>() {
			@Override
			public Streams createFromParcel(Parcel parcel) {
				return new Streams(parcel);
			}
			@Override
			public Streams[] newArray(int n) {
				return new Streams[n];
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
		public static class Audio extends AbstractModel {

			// field names
			public static final String CHANNELS = "channels";
			public static final String CODEC = "codec";
			public static final String LANGUAGE = "language";

			// class members
			public final Integer channels;
			public final String codec;
			public final String language;

			/**
			 * @param channels
			 * @param codec
			 * @param language
			 */
			public Audio(Integer channels, String codec, String language) {
				this.channels = channels;
				this.codec = codec;
				this.language = language;
			}

			/**
			 * Construct from JSON object.
			 * @param node JSON object representing a Audio object
			 */
			public Audio(JsonNode node) {
				channels = parseInt(node, CHANNELS);
				codec = parseString(node, CODEC);
				language = parseString(node, LANGUAGE);
			}

			@Override
			public JsonNode toJsonNode() {
				final ObjectNode node = OM.createObjectNode();
				node.put(CHANNELS, channels);
				node.put(CODEC, codec);
				node.put(LANGUAGE, language);
				return node;
			}

			/**
			 * Extracts a list of {@link Audio} objects from a JSON array.
			 * @param node ObjectNode containing the list of objects.
			 * @param key Key pointing to the node where the list is stored.
			 */
			static List<Audio> getVideoModelAudioList(JsonNode node, String key) {
				if (node.has(key)) {
					final ArrayNode a = (ArrayNode)node.get(key);
					final List<Audio> l = new ArrayList<Audio>(a.size());
					for (int i = 0; i < a.size(); i++) {
						l.add(new Audio((JsonNode)a.get(i)));
					}
					return l;
				}
				return new ArrayList<Audio>(0);
			}

			/**
			 * Flatten this object into a Parcel.
			 * @param parcel the Parcel in which the object should be written.
			 * @param flags additional flags about how the object should be written.
			 */
			@Override
			public void writeToParcel(Parcel parcel, int flags) {
				parcel.writeValue(channels);
				parcel.writeValue(codec);
				parcel.writeValue(language);
			}

			/**
			 * Construct via parcel.
			 */
			protected Audio(Parcel parcel) {
				channels = parcel.readInt();
				codec = parcel.readString();
				language = parcel.readString();
			}

			/**
			 * Generates instances of this Parcelable class from a Parcel.
			 */
			public static final Parcelable.Creator<Audio> CREATOR = new Parcelable.Creator<Audio>() {
				@Override
				public Audio createFromParcel(Parcel parcel) {
					return new Audio(parcel);
				}
				@Override
				public Audio[] newArray(int n) {
					return new Audio[n];
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
		public static class Subtitle extends AbstractModel {

			// field names
			public static final String LANGUAGE = "language";

			// class members
			public final String language;

			/**
			 * @param language
			 */
			public Subtitle(String language) {
				this.language = language;
			}

			/**
			 * Construct from JSON object.
			 * @param node JSON object representing a Subtitle object
			 */
			public Subtitle(JsonNode node) {
				language = parseString(node, LANGUAGE);
			}

			@Override
			public JsonNode toJsonNode() {
				final ObjectNode node = OM.createObjectNode();
				node.put(LANGUAGE, language);
				return node;
			}

			/**
			 * Extracts a list of {@link Subtitle} objects from a JSON array.
			 * @param node ObjectNode containing the list of objects.
			 * @param key Key pointing to the node where the list is stored.
			 */
			static List<Subtitle> getVideoModelSubtitleList(JsonNode node, String key) {
				if (node.has(key)) {
					final ArrayNode a = (ArrayNode)node.get(key);
					final List<Subtitle> l = new ArrayList<Subtitle>(a.size());
					for (int i = 0; i < a.size(); i++) {
						l.add(new Subtitle((JsonNode)a.get(i)));
					}
					return l;
				}
				return new ArrayList<Subtitle>(0);
			}

			/**
			 * Flatten this object into a Parcel.
			 * @param parcel the Parcel in which the object should be written.
			 * @param flags additional flags about how the object should be written.
			 */
			@Override
			public void writeToParcel(Parcel parcel, int flags) {
				parcel.writeValue(language);
			}

			/**
			 * Construct via parcel.
			 */
			protected Subtitle(Parcel parcel) {
				language = parcel.readString();
			}

			/**
			 * Generates instances of this Parcelable class from a Parcel.
			 */
			public static final Parcelable.Creator<Subtitle> CREATOR = new Parcelable.Creator<Subtitle>() {
				@Override
				public Subtitle createFromParcel(Parcel parcel) {
					return new Subtitle(parcel);
				}
				@Override
				public Subtitle[] newArray(int n) {
					return new Subtitle[n];
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
		public static class Video extends AbstractModel {

			// field names
			public static final String ASPECT = "aspect";
			public static final String CODEC = "codec";
			public static final String DURATION = "duration";
			public static final String HEIGHT = "height";
			public static final String WIDTH = "width";

			// class members
			public final Double aspect;
			public final String codec;
			public final Integer duration;
			public final Integer height;
			public final Integer width;

			/**
			 * @param aspect
			 * @param codec
			 * @param duration
			 * @param height
			 * @param width
			 */
			public Video(Double aspect, String codec, Integer duration, Integer height, Integer width) {
				this.aspect = aspect;
				this.codec = codec;
				this.duration = duration;
				this.height = height;
				this.width = width;
			}

			/**
			 * Construct from JSON object.
			 * @param node JSON object representing a Video object
			 */
			public Video(JsonNode node) {
				aspect = parseDouble(node, ASPECT);
				codec = parseString(node, CODEC);
				duration = parseInt(node, DURATION);
				height = parseInt(node, HEIGHT);
				width = parseInt(node, WIDTH);
			}

			@Override
			public JsonNode toJsonNode() {
				final ObjectNode node = OM.createObjectNode();
				node.put(ASPECT, aspect);
				node.put(CODEC, codec);
				node.put(DURATION, duration);
				node.put(HEIGHT, height);
				node.put(WIDTH, width);
				return node;
			}

			/**
			 * Extracts a list of {@link Video} objects from a JSON array.
			 * @param node ObjectNode containing the list of objects.
			 * @param key Key pointing to the node where the list is stored.
			 */
			static List<Video> getVideoModelVideoList(JsonNode node, String key) {
				if (node.has(key)) {
					final ArrayNode a = (ArrayNode)node.get(key);
					final List<Video> l = new ArrayList<Video>(a.size());
					for (int i = 0; i < a.size(); i++) {
						l.add(new Video((JsonNode)a.get(i)));
					}
					return l;
				}
				return new ArrayList<Video>(0);
			}

			/**
			 * Flatten this object into a Parcel.
			 * @param parcel the Parcel in which the object should be written.
			 * @param flags additional flags about how the object should be written.
			 */
			@Override
			public void writeToParcel(Parcel parcel, int flags) {
				parcel.writeValue(aspect);
				parcel.writeValue(codec);
				parcel.writeValue(duration);
				parcel.writeValue(height);
				parcel.writeValue(width);
			}

			/**
			 * Construct via parcel.
			 */
			protected Video(Parcel parcel) {
				aspect = parcel.readDouble();
				codec = parcel.readString();
				duration = parcel.readInt();
				height = parcel.readInt();
				width = parcel.readInt();
			}

			/**
			 * Generates instances of this Parcelable class from a Parcel.
			 */
			public static final Parcelable.Creator<Video> CREATOR = new Parcelable.Creator<Video>() {
				@Override
				public Video createFromParcel(Parcel parcel) {
					return new Video(parcel);
				}
				@Override
				public Video[] newArray(int n) {
					return new Video[n];
				}
			};

			@Override
			public int describeContents() {
				return 0;
			}
		}
	}

	/**
	 * API Name: <tt>Video.Fields.Episode</tt>
	 */
	public interface EpisodeFields {

		public final String TITLE = "title";
		public final String PLOT = "plot";
		public final String VOTES = "votes";
		public final String RATING = "rating";
		public final String WRITER = "writer";
		public final String FIRSTAIRED = "firstaired";
		public final String PLAYCOUNT = "playcount";
		public final String RUNTIME = "runtime";
		public final String DIRECTOR = "director";
		public final String PRODUCTIONCODE = "productioncode";
		public final String SEASON = "season";
		public final String EPISODE = "episode";
		public final String ORIGINALTITLE = "originaltitle";
		public final String SHOWTITLE = "showtitle";
		public final String CAST = "cast";
		public final String STREAMDETAILS = "streamdetails";
		public final String LASTPLAYED = "lastplayed";
		public final String FANART = "fanart";
		public final String THUMBNAIL = "thumbnail";
		public final String FILE = "file";
		public final String RESUME = "resume";
		public final String TVSHOWID = "tvshowid";
		public final String DATEADDED = "dateadded";
		public final String UNIQUEID = "uniqueid";
		public final String ART = "art";

		public final static Set<String> values = new HashSet<String>(Arrays.asList(TITLE, PLOT, VOTES, RATING, WRITER, FIRSTAIRED, PLAYCOUNT, RUNTIME, DIRECTOR, PRODUCTIONCODE, SEASON, EPISODE, ORIGINALTITLE, SHOWTITLE, CAST, STREAMDETAILS, LASTPLAYED, FANART, THUMBNAIL, FILE, RESUME, TVSHOWID, DATEADDED, UNIQUEID, ART));
	}

	/**
	 * API Name: <tt>Video.Fields.Movie</tt>
	 */
	public interface MovieFields {

		public final String TITLE = "title";
		public final String GENRE = "genre";
		public final String YEAR = "year";
		public final String RATING = "rating";
		public final String DIRECTOR = "director";
		public final String TRAILER = "trailer";
		public final String TAGLINE = "tagline";
		public final String PLOT = "plot";
		public final String PLOTOUTLINE = "plotoutline";
		public final String ORIGINALTITLE = "originaltitle";
		public final String LASTPLAYED = "lastplayed";
		public final String PLAYCOUNT = "playcount";
		public final String WRITER = "writer";
		public final String STUDIO = "studio";
		public final String MPAA = "mpaa";
		public final String CAST = "cast";
		public final String COUNTRY = "country";
		public final String IMDBNUMBER = "imdbnumber";
		public final String RUNTIME = "runtime";
		public final String SET = "set";
		public final String SHOWLINK = "showlink";
		public final String STREAMDETAILS = "streamdetails";
		public final String TOP250 = "top250";
		public final String VOTES = "votes";
		public final String FANART = "fanart";
		public final String THUMBNAIL = "thumbnail";
		public final String FILE = "file";
		public final String SORTTITLE = "sorttitle";
		public final String RESUME = "resume";
		public final String SETID = "setid";
		public final String DATEADDED = "dateadded";
		public final String TAG = "tag";
		public final String ART = "art";

		public final static Set<String> values = new HashSet<String>(Arrays.asList(TITLE, GENRE, YEAR, RATING, DIRECTOR, TRAILER, TAGLINE, PLOT, PLOTOUTLINE, ORIGINALTITLE, LASTPLAYED, PLAYCOUNT, WRITER, STUDIO, MPAA, CAST, COUNTRY, IMDBNUMBER, RUNTIME, SET, SHOWLINK, STREAMDETAILS, TOP250, VOTES, FANART, THUMBNAIL, FILE, SORTTITLE, RESUME, SETID, DATEADDED, TAG, ART));
	}

	/**
	 * API Name: <tt>Video.Fields.MovieSet</tt>
	 */
	public interface MovieSetFields {

		public final String TITLE = "title";
		public final String PLAYCOUNT = "playcount";
		public final String FANART = "fanart";
		public final String THUMBNAIL = "thumbnail";
		public final String ART = "art";

		public final static Set<String> values = new HashSet<String>(Arrays.asList(TITLE, PLAYCOUNT, FANART, THUMBNAIL, ART));
	}

	/**
	 * API Name: <tt>Video.Fields.MusicVideo</tt>
	 */
	public interface MusicVideoFields {

		public final String TITLE = "title";
		public final String PLAYCOUNT = "playcount";
		public final String RUNTIME = "runtime";
		public final String DIRECTOR = "director";
		public final String STUDIO = "studio";
		public final String YEAR = "year";
		public final String PLOT = "plot";
		public final String ALBUM = "album";
		public final String ARTIST = "artist";
		public final String GENRE = "genre";
		public final String TRACK = "track";
		public final String STREAMDETAILS = "streamdetails";
		public final String LASTPLAYED = "lastplayed";
		public final String FANART = "fanart";
		public final String THUMBNAIL = "thumbnail";
		public final String FILE = "file";
		public final String RESUME = "resume";
		public final String DATEADDED = "dateadded";
		public final String TAG = "tag";
		public final String ART = "art";

		public final static Set<String> values = new HashSet<String>(Arrays.asList(TITLE, PLAYCOUNT, RUNTIME, DIRECTOR, STUDIO, YEAR, PLOT, ALBUM, ARTIST, GENRE, TRACK, STREAMDETAILS, LASTPLAYED, FANART, THUMBNAIL, FILE, RESUME, DATEADDED, TAG, ART));
	}

	/**
	 * API Name: <tt>Video.Fields.Season</tt>
	 */
	public interface SeasonFields {

		public final String SEASON = "season";
		public final String SHOWTITLE = "showtitle";
		public final String PLAYCOUNT = "playcount";
		public final String EPISODE = "episode";
		public final String FANART = "fanart";
		public final String THUMBNAIL = "thumbnail";
		public final String TVSHOWID = "tvshowid";
		public final String WATCHEDEPISODES = "watchedepisodes";
		public final String ART = "art";

		public final static Set<String> values = new HashSet<String>(Arrays.asList(SEASON, SHOWTITLE, PLAYCOUNT, EPISODE, FANART, THUMBNAIL, TVSHOWID, WATCHEDEPISODES, ART));
	}

	/**
	 * API Name: <tt>Video.Fields.TVShow</tt>
	 */
	public interface TVShowFields {

		public final String TITLE = "title";
		public final String GENRE = "genre";
		public final String YEAR = "year";
		public final String RATING = "rating";
		public final String PLOT = "plot";
		public final String STUDIO = "studio";
		public final String MPAA = "mpaa";
		public final String CAST = "cast";
		public final String PLAYCOUNT = "playcount";
		public final String EPISODE = "episode";
		public final String IMDBNUMBER = "imdbnumber";
		public final String PREMIERED = "premiered";
		public final String VOTES = "votes";
		public final String LASTPLAYED = "lastplayed";
		public final String FANART = "fanart";
		public final String THUMBNAIL = "thumbnail";
		public final String FILE = "file";
		public final String ORIGINALTITLE = "originaltitle";
		public final String SORTTITLE = "sorttitle";
		public final String EPISODEGUIDE = "episodeguide";
		public final String SEASON = "season";
		public final String WATCHEDEPISODES = "watchedepisodes";
		public final String DATEADDED = "dateadded";
		public final String TAG = "tag";
		public final String ART = "art";

		public final static Set<String> values = new HashSet<String>(Arrays.asList(TITLE, GENRE, YEAR, RATING, PLOT, STUDIO, MPAA, CAST, PLAYCOUNT, EPISODE, IMDBNUMBER, PREMIERED, VOTES, LASTPLAYED, FANART, THUMBNAIL, FILE, ORIGINALTITLE, SORTTITLE, EPISODEGUIDE, SEASON, WATCHEDEPISODES, DATEADDED, TAG, ART));
	}
}
