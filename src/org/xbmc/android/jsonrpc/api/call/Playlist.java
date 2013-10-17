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
package org.xbmc.android.jsonrpc.api.call;

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
import org.xbmc.android.jsonrpc.api.AbstractCall;
import org.xbmc.android.jsonrpc.api.AbstractModel;
import org.xbmc.android.jsonrpc.api.model.ListModel;
import org.xbmc.android.jsonrpc.api.model.PlaylistModel;

public final class Playlist {

	/**
	 * Add item(s) to playlist.
	 * <p/>
	 * This class represents the API method <tt>Playlist.Add</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class Add extends AbstractCall<String> {
		public final static String API_TYPE = "Playlist.Add";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected Add(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<Add> CREATOR = new Parcelable.Creator<Add>() {
			@Override
			public Add createFromParcel(Parcel parcel) {
				return new Add(parcel);
			}
			@Override
			public Add[] newArray(int n) {
				return new Add[n];
			}
		};

		/**
		 * Add item(s) to playlist.
		 * @param playlistid 
		 * @param item 
		 */
		public Add(Integer playlistid, PlaylistModel.Item item) {
			super();
			addParameter("playlistid", playlistid);
			addParameter("item", item);
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
	 * Clear playlist.
	 * <p/>
	 * This class represents the API method <tt>Playlist.Clear</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class Clear extends AbstractCall<String> {
		public final static String API_TYPE = "Playlist.Clear";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected Clear(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<Clear> CREATOR = new Parcelable.Creator<Clear>() {
			@Override
			public Clear createFromParcel(Parcel parcel) {
				return new Clear(parcel);
			}
			@Override
			public Clear[] newArray(int n) {
				return new Clear[n];
			}
		};

		/**
		 * Clear playlist.
		 * @param playlistid 
		 */
		public Clear(Integer playlistid) {
			super();
			addParameter("playlistid", playlistid);
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
	 * Get all items from playlist.
	 * <p/>
	 * This class represents the API method <tt>Playlist.GetItems</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class GetItems extends AbstractCall<ListModel.AllItems> {
		public final static String API_TYPE = "Playlist.GetItems";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeParcelable(mResult, flags);
		}

		/**
		 * Construct via parcel.
		 */
		protected GetItems(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<GetItems> CREATOR = new Parcelable.Creator<GetItems>() {
			@Override
			public GetItems createFromParcel(Parcel parcel) {
				return new GetItems(parcel);
			}
			@Override
			public GetItems[] newArray(int n) {
				return new GetItems[n];
			}
		};
		public final static String RESULT = "items";

		/**
		 * Get all items from playlist.
		 * @param playlistid 
		 * @param limits 
		 * @param sort 
		 * @param properties  One or more of: <tt>title</tt>, <tt>artist</tt>, <tt>albumartist</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>album</tt>, <tt>track</tt>, <tt>duration</tt>, <tt>comment</tt>, <tt>lyrics</tt>, <tt>musicbrainztrackid</tt>, <tt>musicbrainzartistid</tt>, <tt>musicbrainzalbumid</tt>, <tt>musicbrainzalbumartistid</tt>, <tt>playcount</tt>, <tt>fanart</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>, <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>writer</tt>, <tt>studio</tt>, <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>premiered</tt>, <tt>productioncode</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>, <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>firstaired</tt>, <tt>season</tt>, <tt>episode</tt>, <tt>showtitle</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>artistid</tt>, <tt>albumid</tt>, <tt>tvshowid</tt>, <tt>setid</tt>, <tt>watchedepisodes</tt>, <tt>disc</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>genreid</tt>, <tt>displayartist</tt>, <tt>albumartistid</tt>, <tt>description</tt>, <tt>theme</tt>, <tt>mood</tt>, <tt>style</tt>, <tt>albumlabel</tt>, <tt>sorttitle</tt>, <tt>episodeguide</tt>, <tt>uniqueid</tt>, <tt>dateadded</tt>, <tt>channel</tt>, <tt>channeltype</tt>, <tt>hidden</tt>, <tt>locked</tt>, <tt>channelnumber</tt>, <tt>starttime</tt>, <tt>endtime</tt>. See constants at {@link ListModel.AllFields}.
		 */
		public GetItems(Integer playlistid, ListModel.Limits limits, ListModel.Sort sort, String... properties) {
			super();
			addParameter("playlistid", playlistid);
			addParameter("limits", limits);
			addParameter("sort", sort);
			addParameter("properties", properties);
		}

		/**
		 * Get all items from playlist.
		 * @param playlistid 
		 * @param properties  One or more of: <tt>title</tt>, <tt>artist</tt>, <tt>albumartist</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>album</tt>, <tt>track</tt>, <tt>duration</tt>, <tt>comment</tt>, <tt>lyrics</tt>, <tt>musicbrainztrackid</tt>, <tt>musicbrainzartistid</tt>, <tt>musicbrainzalbumid</tt>, <tt>musicbrainzalbumartistid</tt>, <tt>playcount</tt>, <tt>fanart</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>, <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>writer</tt>, <tt>studio</tt>, <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>premiered</tt>, <tt>productioncode</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>, <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>firstaired</tt>, <tt>season</tt>, <tt>episode</tt>, <tt>showtitle</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>artistid</tt>, <tt>albumid</tt>, <tt>tvshowid</tt>, <tt>setid</tt>, <tt>watchedepisodes</tt>, <tt>disc</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>genreid</tt>, <tt>displayartist</tt>, <tt>albumartistid</tt>, <tt>description</tt>, <tt>theme</tt>, <tt>mood</tt>, <tt>style</tt>, <tt>albumlabel</tt>, <tt>sorttitle</tt>, <tt>episodeguide</tt>, <tt>uniqueid</tt>, <tt>dateadded</tt>, <tt>channel</tt>, <tt>channeltype</tt>, <tt>hidden</tt>, <tt>locked</tt>, <tt>channelnumber</tt>, <tt>starttime</tt>, <tt>endtime</tt>. See constants at {@link ListModel.AllFields}.
		 */
		public GetItems(Integer playlistid, String... properties) {
			super();
			addParameter("playlistid", playlistid);
			addParameter("properties", properties);
		}

		/**
		 * Get all items from playlist.
		 * @param playlistid 
		 * @param limits 
		 * @param properties  One or more of: <tt>title</tt>, <tt>artist</tt>, <tt>albumartist</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>album</tt>, <tt>track</tt>, <tt>duration</tt>, <tt>comment</tt>, <tt>lyrics</tt>, <tt>musicbrainztrackid</tt>, <tt>musicbrainzartistid</tt>, <tt>musicbrainzalbumid</tt>, <tt>musicbrainzalbumartistid</tt>, <tt>playcount</tt>, <tt>fanart</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>, <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>writer</tt>, <tt>studio</tt>, <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>premiered</tt>, <tt>productioncode</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>, <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>firstaired</tt>, <tt>season</tt>, <tt>episode</tt>, <tt>showtitle</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>artistid</tt>, <tt>albumid</tt>, <tt>tvshowid</tt>, <tt>setid</tt>, <tt>watchedepisodes</tt>, <tt>disc</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>genreid</tt>, <tt>displayartist</tt>, <tt>albumartistid</tt>, <tt>description</tt>, <tt>theme</tt>, <tt>mood</tt>, <tt>style</tt>, <tt>albumlabel</tt>, <tt>sorttitle</tt>, <tt>episodeguide</tt>, <tt>uniqueid</tt>, <tt>dateadded</tt>, <tt>channel</tt>, <tt>channeltype</tt>, <tt>hidden</tt>, <tt>locked</tt>, <tt>channelnumber</tt>, <tt>starttime</tt>, <tt>endtime</tt>. See constants at {@link ListModel.AllFields}.
		 */
		public GetItems(Integer playlistid, ListModel.Limits limits, String... properties) {
			super();
			addParameter("playlistid", playlistid);
			addParameter("limits", limits);
			addParameter("properties", properties);
		}

		/**
		 * Get all items from playlist.
		 * @param playlistid 
		 * @param sort 
		 * @param properties  One or more of: <tt>title</tt>, <tt>artist</tt>, <tt>albumartist</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>album</tt>, <tt>track</tt>, <tt>duration</tt>, <tt>comment</tt>, <tt>lyrics</tt>, <tt>musicbrainztrackid</tt>, <tt>musicbrainzartistid</tt>, <tt>musicbrainzalbumid</tt>, <tt>musicbrainzalbumartistid</tt>, <tt>playcount</tt>, <tt>fanart</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>, <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>writer</tt>, <tt>studio</tt>, <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>premiered</tt>, <tt>productioncode</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>, <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>firstaired</tt>, <tt>season</tt>, <tt>episode</tt>, <tt>showtitle</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>artistid</tt>, <tt>albumid</tt>, <tt>tvshowid</tt>, <tt>setid</tt>, <tt>watchedepisodes</tt>, <tt>disc</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>genreid</tt>, <tt>displayartist</tt>, <tt>albumartistid</tt>, <tt>description</tt>, <tt>theme</tt>, <tt>mood</tt>, <tt>style</tt>, <tt>albumlabel</tt>, <tt>sorttitle</tt>, <tt>episodeguide</tt>, <tt>uniqueid</tt>, <tt>dateadded</tt>, <tt>channel</tt>, <tt>channeltype</tt>, <tt>hidden</tt>, <tt>locked</tt>, <tt>channelnumber</tt>, <tt>starttime</tt>, <tt>endtime</tt>. See constants at {@link ListModel.AllFields}.
		 */
		public GetItems(Integer playlistid, ListModel.Sort sort, String... properties) {
			super();
			addParameter("playlistid", playlistid);
			addParameter("sort", sort);
			addParameter("properties", properties);
		}

		@Override
		protected ArrayList<ListModel.AllItems> parseMany(JsonNode node) {
			final ArrayNode items = parseResults(node, RESULT);
			if (items != null) {
				final ArrayList<ListModel.AllItems> ret = new ArrayList<ListModel.AllItems>(items.size());
				for (int i = 0; i < items.size(); i++) {
					final ObjectNode item = (ObjectNode)items.get(i);
					ret.add(new ListModel.AllItems(item));
				}
				return ret;
			} else {
				return new ArrayList<ListModel.AllItems>(0);
			}
		}

		@Override
		public String getName() {
			return API_TYPE;
		}

		@Override
		protected boolean returnsList() {
			return true;
		}
	}

	/**
	 * Returns all existing playlists.
	 * <p/>
	 * This class represents the API method <tt>Playlist.GetPlaylists</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class GetPlaylists extends AbstractCall<GetPlaylists.GetPlaylistsResult> {
		public final static String API_TYPE = "Playlist.GetPlaylists";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeParcelable(mResult, flags);
		}

		/**
		 * Construct via parcel.
		 */
		protected GetPlaylists(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<GetPlaylists> CREATOR = new Parcelable.Creator<GetPlaylists>() {
			@Override
			public GetPlaylists createFromParcel(Parcel parcel) {
				return new GetPlaylists(parcel);
			}
			@Override
			public GetPlaylists[] newArray(int n) {
				return new GetPlaylists[n];
			}
		};

		/**
		 * Returns all existing playlists.
		 */
		public GetPlaylists() {
			super();
		}

		@Override
		protected ArrayList<GetPlaylistsResult> parseMany(JsonNode node) {
			final ArrayNode results = (ArrayNode) node;
			if (results != null) {
				final ArrayList<GetPlaylistsResult> ret = new ArrayList<GetPlaylistsResult>(results.size());
				for (int i = 0; i < results.size(); i++) {
					final ObjectNode item = (ObjectNode)results.get(i);
					ret.add(new GetPlaylistsResult(item));
				}
				return ret;
			} else {
				return new ArrayList<GetPlaylistsResult>(0);
			}
		}

		@Override
		public String getName() {
			return API_TYPE;
		}

		@Override
		protected boolean returnsList() {
			return true;
		}

		/**
		 * Note: This class is used as result only.<br/>
		 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
		 */
		public static class GetPlaylistsResult extends AbstractModel {

			// field names
			public static final String PLAYLISTID = "playlistid";
			public static final String TYPE = "type";

			// class members
			public final Integer playlistid;
			public final String type;

			/**
			 * @param playlistid
			 * @param type One of: <tt>unknown</tt>, <tt>video</tt>, <tt>audio</tt>, <tt>picture</tt>, <tt>mixed</tt>. See constants at {@link Playlist.GetPlaylistsResult.Type}.
			 */
			public GetPlaylistsResult(Integer playlistid, String type) {
				this.playlistid = playlistid;
				this.type = type;
			}

			/**
			 * Construct from JSON object.
			 * @param node JSON object representing a GetPlaylistsResult object
			 */
			public GetPlaylistsResult(JsonNode node) {
				playlistid = parseInt(node, PLAYLISTID);
				type = parseString(node, TYPE);
			}

			@Override
			public JsonNode toJsonNode() {
				final ObjectNode node = OM.createObjectNode();
				node.put(PLAYLISTID, playlistid);
				node.put(TYPE, type); // enum
				return node;
			}

			/**
			 * Extracts a list of {@link GetPlaylistsResult} objects from a JSON array.
			 * @param node ObjectNode containing the list of objects.
			 * @param key Key pointing to the node where the list is stored.
			 */
			static List<GetPlaylistsResult> getPlaylistGetPlaylistsResultList(JsonNode node, String key) {
				if (node.has(key)) {
					final ArrayNode a = (ArrayNode)node.get(key);
					final List<GetPlaylistsResult> l = new ArrayList<GetPlaylistsResult>(a.size());
					for (int i = 0; i < a.size(); i++) {
						l.add(new GetPlaylistsResult((JsonNode)a.get(i)));
					}
					return l;
				}
				return new ArrayList<GetPlaylistsResult>(0);
			}

			/**
			 * Flatten this object into a Parcel.
			 * @param parcel the Parcel in which the object should be written.
			 * @param flags additional flags about how the object should be written.
			 */
			@Override
			public void writeToParcel(Parcel parcel, int flags) {
				parcel.writeValue(playlistid);
				parcel.writeValue(type); // enum
			}

			/**
			 * Construct via parcel.
			 */
			protected GetPlaylistsResult(Parcel parcel) {
				playlistid = parcel.readInt();
				type = parcel.readString(); // enum
			}

			/**
			 * Generates instances of this Parcelable class from a Parcel.
			 */
			public static final Parcelable.Creator<GetPlaylistsResult> CREATOR = new Parcelable.Creator<GetPlaylistsResult>() {
				@Override
				public GetPlaylistsResult createFromParcel(Parcel parcel) {
					return new GetPlaylistsResult(parcel);
				}
				@Override
				public GetPlaylistsResult[] newArray(int n) {
					return new GetPlaylistsResult[n];
				}
			};

			@Override
			public int describeContents() {
				return 0;
			}

			/**
			 * API Name: <tt>type</tt>
			 */
			public interface Type {

				public final String UNKNOWN = "unknown";
				public final String VIDEO = "video";
				public final String AUDIO = "audio";
				public final String PICTURE = "picture";
				public final String MIXED = "mixed";

				public final static Set<String> values = new HashSet<String>(Arrays.asList(UNKNOWN, VIDEO, AUDIO, PICTURE, MIXED));
			}
		}
	}

	/**
	 * Retrieves the values of the given properties.
	 * <p/>
	 * This class represents the API method <tt>Playlist.GetProperties</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class GetProperties extends AbstractCall<PlaylistModel.PropertyValue> {
		public final static String API_TYPE = "Playlist.GetProperties";

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
		 * @param playlistid 
		 * @param properties  One or more of: <tt>type</tt>, <tt>size</tt>. See constants at {@link PlaylistModel.PropertyName}.
		 */
		public GetProperties(Integer playlistid, String... properties) {
			super();
			addParameter("playlistid", playlistid);
			addParameter("properties", properties);
		}

		@Override
		protected PlaylistModel.PropertyValue parseOne(JsonNode node) {
			return new PlaylistModel.PropertyValue(node);
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
	 * Insert item(s) into playlist. Does not work for picture playlists (aka slideshows).
	 * <p/>
	 * This class represents the API method <tt>Playlist.Insert</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class Insert extends AbstractCall<String> {
		public final static String API_TYPE = "Playlist.Insert";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected Insert(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<Insert> CREATOR = new Parcelable.Creator<Insert>() {
			@Override
			public Insert createFromParcel(Parcel parcel) {
				return new Insert(parcel);
			}
			@Override
			public Insert[] newArray(int n) {
				return new Insert[n];
			}
		};

		/**
		 * Insert item(s) into playlist. Does not work for picture playlists (aka slideshows).
		 * @param playlistid 
		 * @param position 
		 * @param item 
		 */
		public Insert(Integer playlistid, Integer position, PlaylistModel.Item item) {
			super();
			addParameter("playlistid", playlistid);
			addParameter("position", position);
			addParameter("item", item);
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
	 * Remove item from playlist. Does not work for picture playlists (aka slideshows).
	 * <p/>
	 * This class represents the API method <tt>Playlist.Remove</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class Remove extends AbstractCall<String> {
		public final static String API_TYPE = "Playlist.Remove";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected Remove(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<Remove> CREATOR = new Parcelable.Creator<Remove>() {
			@Override
			public Remove createFromParcel(Parcel parcel) {
				return new Remove(parcel);
			}
			@Override
			public Remove[] newArray(int n) {
				return new Remove[n];
			}
		};

		/**
		 * Remove item from playlist. Does not work for picture playlists (aka slideshows).
		 * @param playlistid 
		 * @param position 
		 */
		public Remove(Integer playlistid, Integer position) {
			super();
			addParameter("playlistid", playlistid);
			addParameter("position", position);
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
	 * Swap items in the playlist. Does not work for picture playlists (aka slideshows).
	 * <p/>
	 * This class represents the API method <tt>Playlist.Swap</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class Swap extends AbstractCall<String> {
		public final static String API_TYPE = "Playlist.Swap";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected Swap(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<Swap> CREATOR = new Parcelable.Creator<Swap>() {
			@Override
			public Swap createFromParcel(Parcel parcel) {
				return new Swap(parcel);
			}
			@Override
			public Swap[] newArray(int n) {
				return new Swap[n];
			}
		};

		/**
		 * Swap items in the playlist. Does not work for picture playlists (aka slideshows).
		 * @param playlistid 
		 * @param position1 
		 * @param position2 
		 */
		public Swap(Integer playlistid, Integer position1, Integer position2) {
			super();
			addParameter("playlistid", playlistid);
			addParameter("position1", position1);
			addParameter("position2", position2);
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
