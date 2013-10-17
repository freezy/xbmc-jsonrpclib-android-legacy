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
import org.codehaus.jackson.node.BooleanNode;
import org.codehaus.jackson.node.DoubleNode;
import org.codehaus.jackson.node.ObjectNode;
import org.xbmc.android.jsonrpc.api.AbstractCall;
import org.xbmc.android.jsonrpc.api.AbstractModel;
import org.xbmc.android.jsonrpc.api.model.GlobalModel;
import org.xbmc.android.jsonrpc.api.model.ListModel;
import org.xbmc.android.jsonrpc.api.model.PlayerModel;
import org.xbmc.android.jsonrpc.api.model.PlaylistModel;

public final class Player {

	/**
	 * Returns all active players.
	 * <p/>
	 * This class represents the API method <tt>Player.GetActivePlayers</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class GetActivePlayers extends AbstractCall<GetActivePlayers.GetActivePlayersResult> {
		public final static String API_TYPE = "Player.GetActivePlayers";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeParcelable(mResult, flags);
		}

		/**
		 * Construct via parcel.
		 */
		protected GetActivePlayers(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<GetActivePlayers> CREATOR = new Parcelable.Creator<GetActivePlayers>() {
			@Override
			public GetActivePlayers createFromParcel(Parcel parcel) {
				return new GetActivePlayers(parcel);
			}
			@Override
			public GetActivePlayers[] newArray(int n) {
				return new GetActivePlayers[n];
			}
		};

		/**
		 * Returns all active players.
		 */
		public GetActivePlayers() {
			super();
		}

		@Override
		protected ArrayList<GetActivePlayersResult> parseMany(JsonNode node) {
			final ArrayNode results = (ArrayNode) node;
			if (results != null) {
				final ArrayList<GetActivePlayersResult> ret = new ArrayList<GetActivePlayersResult>(results.size());
				for (int i = 0; i < results.size(); i++) {
					final ObjectNode item = (ObjectNode)results.get(i);
					ret.add(new GetActivePlayersResult(item));
				}
				return ret;
			} else {
				return new ArrayList<GetActivePlayersResult>(0);
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
		public static class GetActivePlayersResult extends AbstractModel {

			// field names
			public static final String PLAYERID = "playerid";
			public static final String TYPE = "type";

			// class members
			public final Integer playerid;
			public final String type;

			/**
			 * @param playerid
			 * @param type One of: <tt>video</tt>, <tt>audio</tt>, <tt>picture</tt>. See constants at {@link Player.GetActivePlayersResult.Type}.
			 */
			public GetActivePlayersResult(Integer playerid, String type) {
				this.playerid = playerid;
				this.type = type;
			}

			/**
			 * Construct from JSON object.
			 * @param node JSON object representing a GetActivePlayersResult object
			 */
			public GetActivePlayersResult(JsonNode node) {
				playerid = parseInt(node, PLAYERID);
				type = parseString(node, TYPE);
			}

			@Override
			public JsonNode toJsonNode() {
				final ObjectNode node = OM.createObjectNode();
				node.put(PLAYERID, playerid);
				node.put(TYPE, type); // enum
				return node;
			}

			/**
			 * Extracts a list of {@link GetActivePlayersResult} objects from a JSON array.
			 * @param node ObjectNode containing the list of objects.
			 * @param key Key pointing to the node where the list is stored.
			 */
			static List<GetActivePlayersResult> getPlayerGetActivePlayersResultList(JsonNode node, String key) {
				if (node.has(key)) {
					final ArrayNode a = (ArrayNode)node.get(key);
					final List<GetActivePlayersResult> l = new ArrayList<GetActivePlayersResult>(a.size());
					for (int i = 0; i < a.size(); i++) {
						l.add(new GetActivePlayersResult((JsonNode)a.get(i)));
					}
					return l;
				}
				return new ArrayList<GetActivePlayersResult>(0);
			}

			/**
			 * Flatten this object into a Parcel.
			 * @param parcel the Parcel in which the object should be written.
			 * @param flags additional flags about how the object should be written.
			 */
			@Override
			public void writeToParcel(Parcel parcel, int flags) {
				parcel.writeValue(playerid);
				parcel.writeValue(type); // enum
			}

			/**
			 * Construct via parcel.
			 */
			protected GetActivePlayersResult(Parcel parcel) {
				playerid = parcel.readInt();
				type = parcel.readString(); // enum
			}

			/**
			 * Generates instances of this Parcelable class from a Parcel.
			 */
			public static final Parcelable.Creator<GetActivePlayersResult> CREATOR = new Parcelable.Creator<GetActivePlayersResult>() {
				@Override
				public GetActivePlayersResult createFromParcel(Parcel parcel) {
					return new GetActivePlayersResult(parcel);
				}
				@Override
				public GetActivePlayersResult[] newArray(int n) {
					return new GetActivePlayersResult[n];
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

				public final String VIDEO = "video";
				public final String AUDIO = "audio";
				public final String PICTURE = "picture";

				public final static Set<String> values = new HashSet<String>(Arrays.asList(VIDEO, AUDIO, PICTURE));
			}
		}
	}

	/**
	 * Retrieves the currently played item.
	 * <p/>
	 * This class represents the API method <tt>Player.GetItem</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class GetItem extends AbstractCall<ListModel.AllItems> {
		public final static String API_TYPE = "Player.GetItem";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeParcelable(mResult, flags);
		}

		/**
		 * Construct via parcel.
		 */
		protected GetItem(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<GetItem> CREATOR = new Parcelable.Creator<GetItem>() {
			@Override
			public GetItem createFromParcel(Parcel parcel) {
				return new GetItem(parcel);
			}
			@Override
			public GetItem[] newArray(int n) {
				return new GetItem[n];
			}
		};
		public final static String RESULT = "item";

		/**
		 * Retrieves the currently played item.
		 * @param playerid 
		 * @param properties  One or more of: <tt>title</tt>, <tt>artist</tt>, <tt>albumartist</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>album</tt>, <tt>track</tt>, <tt>duration</tt>, <tt>comment</tt>, <tt>lyrics</tt>, <tt>musicbrainztrackid</tt>, <tt>musicbrainzartistid</tt>, <tt>musicbrainzalbumid</tt>, <tt>musicbrainzalbumartistid</tt>, <tt>playcount</tt>, <tt>fanart</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>, <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>writer</tt>, <tt>studio</tt>, <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>premiered</tt>, <tt>productioncode</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>, <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>firstaired</tt>, <tt>season</tt>, <tt>episode</tt>, <tt>showtitle</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>artistid</tt>, <tt>albumid</tt>, <tt>tvshowid</tt>, <tt>setid</tt>, <tt>watchedepisodes</tt>, <tt>disc</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>genreid</tt>, <tt>displayartist</tt>, <tt>albumartistid</tt>, <tt>description</tt>, <tt>theme</tt>, <tt>mood</tt>, <tt>style</tt>, <tt>albumlabel</tt>, <tt>sorttitle</tt>, <tt>episodeguide</tt>, <tt>uniqueid</tt>, <tt>dateadded</tt>, <tt>channel</tt>, <tt>channeltype</tt>, <tt>hidden</tt>, <tt>locked</tt>, <tt>channelnumber</tt>, <tt>starttime</tt>, <tt>endtime</tt>. See constants at {@link ListModel.AllFields}.
		 */
		public GetItem(Integer playerid, String... properties) {
			super();
			addParameter("playerid", playerid);
			addParameter("properties", properties);
		}

		@Override
		protected ListModel.AllItems parseOne(JsonNode node) {
			return new ListModel.AllItems((ObjectNode)node.get(RESULT));
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
	 * This class represents the API method <tt>Player.GetProperties</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class GetProperties extends AbstractCall<PlayerModel.PropertyValue> {
		public final static String API_TYPE = "Player.GetProperties";

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
		 * @param playerid 
		 * @param properties  One or more of: <tt>type</tt>, <tt>partymode</tt>, <tt>speed</tt>, <tt>time</tt>, <tt>percentage</tt>, <tt>totaltime</tt>, <tt>playlistid</tt>, <tt>position</tt>, <tt>repeat</tt>, <tt>shuffled</tt>, <tt>canseek</tt>, <tt>canchangespeed</tt>, <tt>canmove</tt>, <tt>canzoom</tt>, <tt>canrotate</tt>, <tt>canshuffle</tt>, <tt>canrepeat</tt>, <tt>currentaudiostream</tt>, <tt>audiostreams</tt>, <tt>subtitleenabled</tt>, <tt>currentsubtitle</tt>, <tt>subtitles</tt>, <tt>live</tt>. See constants at {@link PlayerModel.PropertyName}.
		 */
		public GetProperties(Integer playerid, String... properties) {
			super();
			addParameter("playerid", playerid);
			addParameter("properties", properties);
		}

		@Override
		protected PlayerModel.PropertyValue parseOne(JsonNode node) {
			return new PlayerModel.PropertyValue(node);
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
	 * Go to previous/next/specific item in the playlist.
	 * <p/>
	 * This class represents the API method <tt>Player.GoTo</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class GoTo extends AbstractCall<String> {
		public final static String API_TYPE = "Player.GoTo";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected GoTo(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<GoTo> CREATOR = new Parcelable.Creator<GoTo>() {
			@Override
			public GoTo createFromParcel(Parcel parcel) {
				return new GoTo(parcel);
			}
			@Override
			public GoTo[] newArray(int n) {
				return new GoTo[n];
			}
		};

		/**
		 * Go to previous/next/specific item in the playlist.
		 * @param playerid 
		 * @param to  One of: <tt>previous</tt>, <tt>next</tt>. See constants at {@link Player.GoTo.To}.
		 */
		public GoTo(Integer playerid, String to) {
			super();
			addParameter("playerid", playerid);
			addParameter("to", to);
		}

		/**
		 * Go to previous/next/specific item in the playlist.
		 * @param playerid 
		 * @param to position in playlist.
		 */
		public GoTo(Integer playerid, Integer to) {
			super();
			addParameter("playerid", playerid);
			addParameter("to", to);
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

		/**
		 * API Name: <tt>to</tt>
		 */
		public interface To {

			public final String PREVIOUS = "previous";
			public final String NEXT = "next";

			public final static Set<String> values = new HashSet<String>(Arrays.asList(PREVIOUS, NEXT));
		}
	}

	/**
	 * If picture is zoomed move viewport left/right/up/down otherwise skip previous/next.
	 * <p/>
	 * This class represents the API method <tt>Player.Move</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class Move extends AbstractCall<String> {
		public final static String API_TYPE = "Player.Move";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected Move(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<Move> CREATOR = new Parcelable.Creator<Move>() {
			@Override
			public Move createFromParcel(Parcel parcel) {
				return new Move(parcel);
			}
			@Override
			public Move[] newArray(int n) {
				return new Move[n];
			}
		};

		/**
		 * If picture is zoomed move viewport left/right/up/down otherwise skip previous/next.
		 * @param playerid 
		 * @param direction  One of: <tt>left</tt>, <tt>right</tt>, <tt>up</tt>, <tt>down</tt>. See constants at {@link Player.Move.Direction}.
		 */
		public Move(Integer playerid, String direction) {
			super();
			addParameter("playerid", playerid);
			addParameter("direction", direction);
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

		/**
		 * API Name: <tt>direction</tt>
		 */
		public interface Direction {

			public final String LEFT = "left";
			public final String RIGHT = "right";
			public final String UP = "up";
			public final String DOWN = "down";

			public final static Set<String> values = new HashSet<String>(Arrays.asList(LEFT, RIGHT, UP, DOWN));
		}
	}

	/**
	 * Start playback of either the playlist with the given ID, a slideshow with the pictures from the given directory or a single file or an item from the database.
	 * <p/>
	 * This class represents the API method <tt>Player.Open</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class Open extends AbstractCall<String> {
		public final static String API_TYPE = "Player.Open";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected Open(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<Open> CREATOR = new Parcelable.Creator<Open>() {
			@Override
			public Open createFromParcel(Parcel parcel) {
				return new Open(parcel);
			}
			@Override
			public Open[] newArray(int n) {
				return new Open[n];
			}
		};

		/**
		 * Start playback of either the playlist with the given ID, a slideshow with the pictures from the given directory or a single file or an item from the database.
		 * @param item 
		 * @param options 
		 */
		public Open(ItemPlaylistIdPosition item, Option options) {
			super();
			addParameter("item", item);
			addParameter("options", options);
		}

		/**
		 * Start playback of either the playlist with the given ID, a slideshow with the pictures from the given directory or a single file or an item from the database.
		 * @param item 
		 * @param options 
		 */
		public Open(PlaylistModel.Item item, Option options) {
			super();
			addParameter("item", item);
			addParameter("options", options);
		}

		/**
		 * Start playback of either the playlist with the given ID, a slideshow with the pictures from the given directory or a single file or an item from the database.
		 * @param item 
		 * @param options 
		 */
		public Open(ItemPathRandomRecursive item, Option options) {
			super();
			addParameter("item", item);
			addParameter("options", options);
		}

		/**
		 * Start playback of either the playlist with the given ID, a slideshow with the pictures from the given directory or a single file or an item from the database.
		 * @param item 
		 * @param options 
		 */
		public Open(ItemPartymode item, Option options) {
			super();
			addParameter("item", item);
			addParameter("options", options);
		}

		/**
		 * Start playback of either the playlist with the given ID, a slideshow with the pictures from the given directory or a single file or an item from the database.
		 * @param item 
		 * @param options 
		 */
		public Open(ItemChannelId item, Option options) {
			super();
			addParameter("item", item);
			addParameter("options", options);
		}

		/**
		 * Start playback of either the playlist with the given ID, a slideshow with the pictures from the given directory or a single file or an item from the database.
		 */
		public Open() {
			super();
		}

		/**
		 * Start playback of either the playlist with the given ID, a slideshow with the pictures from the given directory or a single file or an item from the database.
		 * @param item 
		 */
		public Open(ItemPlaylistIdPosition item) {
			super();
			addParameter("item", item);
		}

		/**
		 * Start playback of either the playlist with the given ID, a slideshow with the pictures from the given directory or a single file or an item from the database.
		 * @param item 
		 */
		public Open(PlaylistModel.Item item) {
			super();
			addParameter("item", item);
		}

		/**
		 * Start playback of either the playlist with the given ID, a slideshow with the pictures from the given directory or a single file or an item from the database.
		 * @param item 
		 */
		public Open(ItemPathRandomRecursive item) {
			super();
			addParameter("item", item);
		}

		/**
		 * Start playback of either the playlist with the given ID, a slideshow with the pictures from the given directory or a single file or an item from the database.
		 * @param item 
		 */
		public Open(ItemPartymode item) {
			super();
			addParameter("item", item);
		}

		/**
		 * Start playback of either the playlist with the given ID, a slideshow with the pictures from the given directory or a single file or an item from the database.
		 * @param item 
		 */
		public Open(ItemChannelId item) {
			super();
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

		/**
		 * Note: This class is used as parameter only.<br/>
		 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
		 */
		public static class ItemPlaylistIdPosition extends AbstractModel {

			// field names
			public static final String PLAYLISTID = "playlistid";
			public static final String POSITION = "position";

			// class members
			public final Integer playlistid;
			public final Integer position;

			/**
			 * @param playlistid
			 * @param position
			 */
			public ItemPlaylistIdPosition(Integer playlistid, Integer position) {
				this.playlistid = playlistid;
				this.position = position;
			}

			@Override
			public JsonNode toJsonNode() {
				final ObjectNode node = OM.createObjectNode();
				node.put(PLAYLISTID, playlistid);
				node.put(POSITION, position);
				return node;
			}

			/**
			 * Flatten this object into a Parcel.
			 * @param parcel the Parcel in which the object should be written.
			 * @param flags additional flags about how the object should be written.
			 */
			@Override
			public void writeToParcel(Parcel parcel, int flags) {
				parcel.writeValue(playlistid);
				parcel.writeValue(position);
			}

			/**
			 * Construct via parcel.
			 */
			protected ItemPlaylistIdPosition(Parcel parcel) {
				playlistid = parcel.readInt();
				position = parcel.readInt();
			}

			/**
			 * Generates instances of this Parcelable class from a Parcel.
			 */
			public static final Parcelable.Creator<ItemPlaylistIdPosition> CREATOR = new Parcelable.Creator<ItemPlaylistIdPosition>() {
				@Override
				public ItemPlaylistIdPosition createFromParcel(Parcel parcel) {
					return new ItemPlaylistIdPosition(parcel);
				}
				@Override
				public ItemPlaylistIdPosition[] newArray(int n) {
					return new ItemPlaylistIdPosition[n];
				}
			};

			@Override
			public int describeContents() {
				return 0;
			}
		}

		/**
		 * Note: This class is used as parameter only.<br/>
		 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
		 */
		public static class ItemPathRandomRecursive extends AbstractModel {

			// field names
			public static final String PATH = "path";
			public static final String RANDOM = "random";
			public static final String RECURSIVE = "recursive";

			// class members
			public final String path;
			public final Boolean random;
			public final Boolean recursive;

			/**
			 * @param path
			 * @param random
			 * @param recursive
			 */
			public ItemPathRandomRecursive(String path, Boolean random, Boolean recursive) {
				this.path = path;
				this.random = random;
				this.recursive = recursive;
			}

			@Override
			public JsonNode toJsonNode() {
				final ObjectNode node = OM.createObjectNode();
				node.put(PATH, path);
				node.put(RANDOM, random);
				node.put(RECURSIVE, recursive);
				return node;
			}

			/**
			 * Flatten this object into a Parcel.
			 * @param parcel the Parcel in which the object should be written.
			 * @param flags additional flags about how the object should be written.
			 */
			@Override
			public void writeToParcel(Parcel parcel, int flags) {
				parcel.writeValue(path);
				parcel.writeInt(random ? 1 : 0);
				parcel.writeInt(recursive ? 1 : 0);
			}

			/**
			 * Construct via parcel.
			 */
			protected ItemPathRandomRecursive(Parcel parcel) {
				path = parcel.readString();
				random = parcel.readInt() == 1;
				recursive = parcel.readInt() == 1;
			}

			/**
			 * Generates instances of this Parcelable class from a Parcel.
			 */
			public static final Parcelable.Creator<ItemPathRandomRecursive> CREATOR = new Parcelable.Creator<ItemPathRandomRecursive>() {
				@Override
				public ItemPathRandomRecursive createFromParcel(Parcel parcel) {
					return new ItemPathRandomRecursive(parcel);
				}
				@Override
				public ItemPathRandomRecursive[] newArray(int n) {
					return new ItemPathRandomRecursive[n];
				}
			};

			@Override
			public int describeContents() {
				return 0;
			}
		}

		/**
		 * Note: This class is used as parameter only.<br/>
		 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
		 */
		public static class ItemPartymode extends AbstractModel {

			// field names
			public static final String PARTYMODE = "partymode";

			// class members
			public final String partymode;

			/**
			 * @param partymode
			 */
			public ItemPartymode(String partymode) {
				this.partymode = partymode;
			}

			@Override
			public JsonNode toJsonNode() {
				final ObjectNode node = OM.createObjectNode();
				node.put(PARTYMODE, partymode);
				return node;
			}

			/**
			 * Flatten this object into a Parcel.
			 * @param parcel the Parcel in which the object should be written.
			 * @param flags additional flags about how the object should be written.
			 */
			@Override
			public void writeToParcel(Parcel parcel, int flags) {
				parcel.writeValue(partymode);
			}

			/**
			 * Construct via parcel.
			 */
			protected ItemPartymode(Parcel parcel) {
				partymode = parcel.readString();
			}

			/**
			 * Generates instances of this Parcelable class from a Parcel.
			 */
			public static final Parcelable.Creator<ItemPartymode> CREATOR = new Parcelable.Creator<ItemPartymode>() {
				@Override
				public ItemPartymode createFromParcel(Parcel parcel) {
					return new ItemPartymode(parcel);
				}
				@Override
				public ItemPartymode[] newArray(int n) {
					return new ItemPartymode[n];
				}
			};

			@Override
			public int describeContents() {
				return 0;
			}
		}

		/**
		 * Note: This class is used as parameter only.<br/>
		 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
		 */
		public static class ItemChannelId extends AbstractModel {

			// field names
			public static final String CHANNELID = "channelid";

			// class members
			public final Integer channelid;

			/**
			 * @param channelid
			 */
			public ItemChannelId(Integer channelid) {
				this.channelid = channelid;
			}

			@Override
			public JsonNode toJsonNode() {
				final ObjectNode node = OM.createObjectNode();
				node.put(CHANNELID, channelid);
				return node;
			}

			/**
			 * Flatten this object into a Parcel.
			 * @param parcel the Parcel in which the object should be written.
			 * @param flags additional flags about how the object should be written.
			 */
			@Override
			public void writeToParcel(Parcel parcel, int flags) {
				parcel.writeValue(channelid);
			}

			/**
			 * Construct via parcel.
			 */
			protected ItemChannelId(Parcel parcel) {
				channelid = parcel.readInt();
			}

			/**
			 * Generates instances of this Parcelable class from a Parcel.
			 */
			public static final Parcelable.Creator<ItemChannelId> CREATOR = new Parcelable.Creator<ItemChannelId>() {
				@Override
				public ItemChannelId createFromParcel(Parcel parcel) {
					return new ItemChannelId(parcel);
				}
				@Override
				public ItemChannelId[] newArray(int n) {
					return new ItemChannelId[n];
				}
			};

			@Override
			public int describeContents() {
				return 0;
			}
		}

		/**
		 * Note: This class is used as parameter only.<br/>
		 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
		 */
		public static class Option extends AbstractModel {

			// field names
			public static final String REPEAT = "repeat";
			public static final String RESUME = "resume";
			public static final String SHUFFLED = "shuffled";

			// class members
			public final String repeat;
			public final Resume resume;
			public final Boolean shuffled;

			/**
			 * @param repeat One of: <tt>off</tt>, <tt>one</tt>, <tt>all</tt>. See constants at {@link PlayerModel.Repeat}.
			 * @param resume
			 * @param shuffled
			 */
			public Option(String repeat, Resume resume, Boolean shuffled) {
				this.repeat = repeat;
				this.resume = resume;
				this.shuffled = shuffled;
			}

			@Override
			public JsonNode toJsonNode() {
				final ObjectNode node = OM.createObjectNode();
				node.put(REPEAT, repeat); // enum
				node.put(RESUME, resume.toJsonNode());
				node.put(SHUFFLED, shuffled);
				return node;
			}

			/**
			 * Flatten this object into a Parcel.
			 * @param parcel the Parcel in which the object should be written.
			 * @param flags additional flags about how the object should be written.
			 */
			@Override
			public void writeToParcel(Parcel parcel, int flags) {
				parcel.writeValue(repeat); // enum
				parcel.writeValue(resume);
				parcel.writeInt(shuffled ? 1 : 0);
			}

			/**
			 * Construct via parcel.
			 */
			protected Option(Parcel parcel) {
				repeat = parcel.readString(); // enum
				resume = parcel.<Resume>readParcelable(Resume.class.getClassLoader());
				shuffled = parcel.readInt() == 1;
			}

			/**
			 * Generates instances of this Parcelable class from a Parcel.
			 */
			public static final Parcelable.Creator<Option> CREATOR = new Parcelable.Creator<Option>() {
				@Override
				public Option createFromParcel(Parcel parcel) {
					return new Option(parcel);
				}
				@Override
				public Option[] newArray(int n) {
					return new Option[n];
				}
			};

			@Override
			public int describeContents() {
				return 0;
			}

			/**
			 * Note: This class is used as parameter only.<br/>
			 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
			 */
			public static class Resume extends AbstractModel {

				// class members
				public final Boolean booleanArg;
				public final Double positionPercentage;
				public final PlayerModel.PositionTime positionTime;

				/**
				 * @param booleanArg
				 */
				public Resume(Boolean booleanArg) {
					this.booleanArg = booleanArg;
					this.positionPercentage = null;
					this.positionTime = null;
				}

				/**
				 * @param positionPercentage
				 */
				public Resume(Double positionPercentage) {
					this.positionPercentage = positionPercentage;
					this.booleanArg = null;
					this.positionTime = null;
				}

				/**
				 * @param positionTime
				 */
				public Resume(PlayerModel.PositionTime positionTime) {
					this.positionTime = positionTime;
					this.booleanArg = null;
					this.positionPercentage = null;
				}

				@Override
				public JsonNode toJsonNode() {
					if (booleanArg != null) {
						return booleanArg ? BooleanNode.TRUE : BooleanNode.FALSE;
					}
					if (positionPercentage != null) {
						return new DoubleNode(positionPercentage);
					}
					if (positionTime != null) {
						return positionTime.toJsonNode();
					}
					return null; // this is completely excluded. theoretically.
				}

				/**
				 * Flatten this object into a Parcel.
				 * @param parcel the Parcel in which the object should be written.
				 * @param flags additional flags about how the object should be written.
				 */
				@Override
				public void writeToParcel(Parcel parcel, int flags) {
					parcel.writeInt(booleanArg ? 1 : 0);
					parcel.writeValue(positionPercentage);
					parcel.writeValue(positionTime);
				}

				/**
				 * Construct via parcel.
				 */
				protected Resume(Parcel parcel) {
					booleanArg = parcel.readInt() == 1;
					positionPercentage = parcel.readDouble();
					positionTime = parcel.<PlayerModel.PositionTime>readParcelable(PlayerModel.PositionTime.class.getClassLoader());
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
		}
	}

	/**
	 * Pauses or unpause playback and returns the new state.
	 * <p/>
	 * This class represents the API method <tt>Player.PlayPause</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class PlayPause extends AbstractCall<PlayerModel.Speed> {
		public final static String API_TYPE = "Player.PlayPause";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeParcelable(mResult, flags);
		}

		/**
		 * Construct via parcel.
		 */
		protected PlayPause(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<PlayPause> CREATOR = new Parcelable.Creator<PlayPause>() {
			@Override
			public PlayPause createFromParcel(Parcel parcel) {
				return new PlayPause(parcel);
			}
			@Override
			public PlayPause[] newArray(int n) {
				return new PlayPause[n];
			}
		};

		/**
		 * Pauses or unpause playback and returns the new state.
		 * @param playerid 
		 * @param play 
		 */
		public PlayPause(Integer playerid, GlobalModel.Toggle play) {
			super();
			addParameter("playerid", playerid);
			addParameter("play", play);
		}

		/**
		 * Pauses or unpause playback and returns the new state.
		 * @param playerid 
		 */
		public PlayPause(Integer playerid) {
			super();
			addParameter("playerid", playerid);
		}

		@Override
		protected PlayerModel.Speed parseOne(JsonNode node) {
			return new PlayerModel.Speed(node);
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
	 * Rotates current picture.
	 * <p/>
	 * This class represents the API method <tt>Player.Rotate</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class Rotate extends AbstractCall<String> {
		public final static String API_TYPE = "Player.Rotate";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected Rotate(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<Rotate> CREATOR = new Parcelable.Creator<Rotate>() {
			@Override
			public Rotate createFromParcel(Parcel parcel) {
				return new Rotate(parcel);
			}
			@Override
			public Rotate[] newArray(int n) {
				return new Rotate[n];
			}
		};

		/**
		 * Rotates current picture.
		 * @param playerid 
		 * @param value  One of: <tt>clockwise</tt>, <tt>counterclockwise</tt>. See constants at {@link Player.Rotate.Value}.
		 */
		public Rotate(Integer playerid, String value) {
			super();
			addParameter("playerid", playerid);
			addParameter("value", value);
		}

		/**
		 * Rotates current picture.
		 * @param playerid 
		 */
		public Rotate(Integer playerid) {
			super();
			addParameter("playerid", playerid);
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

		/**
		 * API Name: <tt>value</tt>
		 */
		public interface Value {

			public final String CLOCKWISE = "clockwise";
			public final String COUNTERCLOCKWISE = "counterclockwise";

			public final static Set<String> values = new HashSet<String>(Arrays.asList(CLOCKWISE, COUNTERCLOCKWISE));
		}
	}

	/**
	 * Seek through the playing item.
	 * <p/>
	 * This class represents the API method <tt>Player.Seek</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class Seek extends AbstractCall<Seek.SeekResult> {
		public final static String API_TYPE = "Player.Seek";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeParcelable(mResult, flags);
		}

		/**
		 * Construct via parcel.
		 */
		protected Seek(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<Seek> CREATOR = new Parcelable.Creator<Seek>() {
			@Override
			public Seek createFromParcel(Parcel parcel) {
				return new Seek(parcel);
			}
			@Override
			public Seek[] newArray(int n) {
				return new Seek[n];
			}
		};

		/**
		 * Seek through the playing item.
		 * @param playerid 
		 * @param value Percentage value to seek to.
		 */
		public Seek(Integer playerid, Double value) {
			super();
			addParameter("playerid", playerid);
			addParameter("value", value);
		}

		/**
		 * Seek through the playing item.
		 * @param playerid 
		 * @param value Time to seek to.
		 */
		public Seek(Integer playerid, PlayerModel.PositionTime value) {
			super();
			addParameter("playerid", playerid);
			addParameter("value", value);
		}

		/**
		 * Seek through the playing item.
		 * @param playerid 
		 * @param value Seek by predefined jumps. One of: <tt>smallforward</tt>, <tt>smallbackward</tt>, <tt>bigforward</tt>, <tt>bigbackward</tt>. See constants at {@link Player.Seek.Value}.
		 */
		public Seek(Integer playerid, String value) {
			super();
			addParameter("playerid", playerid);
			addParameter("value", value);
		}

		@Override
		protected SeekResult parseOne(JsonNode node) {
			return new SeekResult(node);
		}

		@Override
		public String getName() {
			return API_TYPE;
		}

		@Override
		protected boolean returnsList() {
			return false;
		}

		/**
		 * Note: This class is used as result only.<br/>
		 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
		 */
		public static class SeekResult extends AbstractModel {

			// field names
			public static final String PERCENTAGE = "percentage";
			public static final String TIME = "time";
			public static final String TOTALTIME = "totaltime";

			// class members
			public final Double percentage;
			public final GlobalModel.Time time;
			public final GlobalModel.Time totaltime;

			/**
			 * @param percentage
			 * @param time
			 * @param totaltime
			 */
			public SeekResult(Double percentage, GlobalModel.Time time, GlobalModel.Time totaltime) {
				this.percentage = percentage;
				this.time = time;
				this.totaltime = totaltime;
			}

			/**
			 * Construct from JSON object.
			 * @param node JSON object representing a SeekResult object
			 */
			public SeekResult(JsonNode node) {
				percentage = parseDouble(node, PERCENTAGE);
				time = node.has(TIME) ? new GlobalModel.Time(node.get(TIME)) : null;
				totaltime = node.has(TOTALTIME) ? new GlobalModel.Time(node.get(TOTALTIME)) : null;
			}

			@Override
			public JsonNode toJsonNode() {
				final ObjectNode node = OM.createObjectNode();
				node.put(PERCENTAGE, percentage);
				node.put(TIME, time.toJsonNode());
				node.put(TOTALTIME, totaltime.toJsonNode());
				return node;
			}

			/**
			 * Extracts a list of {@link SeekResult} objects from a JSON array.
			 * @param node ObjectNode containing the list of objects.
			 * @param key Key pointing to the node where the list is stored.
			 */
			static List<SeekResult> getPlayerSeekResultList(JsonNode node, String key) {
				if (node.has(key)) {
					final ArrayNode a = (ArrayNode)node.get(key);
					final List<SeekResult> l = new ArrayList<SeekResult>(a.size());
					for (int i = 0; i < a.size(); i++) {
						l.add(new SeekResult((JsonNode)a.get(i)));
					}
					return l;
				}
				return new ArrayList<SeekResult>(0);
			}

			/**
			 * Flatten this object into a Parcel.
			 * @param parcel the Parcel in which the object should be written.
			 * @param flags additional flags about how the object should be written.
			 */
			@Override
			public void writeToParcel(Parcel parcel, int flags) {
				parcel.writeValue(percentage);
				parcel.writeValue(time);
				parcel.writeValue(totaltime);
			}

			/**
			 * Construct via parcel.
			 */
			protected SeekResult(Parcel parcel) {
				percentage = parcel.readDouble();
				time = parcel.<GlobalModel.Time>readParcelable(GlobalModel.Time.class.getClassLoader());
				totaltime = parcel.<GlobalModel.Time>readParcelable(GlobalModel.Time.class.getClassLoader());
			}

			/**
			 * Generates instances of this Parcelable class from a Parcel.
			 */
			public static final Parcelable.Creator<SeekResult> CREATOR = new Parcelable.Creator<SeekResult>() {
				@Override
				public SeekResult createFromParcel(Parcel parcel) {
					return new SeekResult(parcel);
				}
				@Override
				public SeekResult[] newArray(int n) {
					return new SeekResult[n];
				}
			};

			@Override
			public int describeContents() {
				return 0;
			}
		}

		/**
		 * API Name: <tt>value</tt>
		 */
		public interface Value {

			public final String SMALLFORWARD = "smallforward";
			public final String SMALLBACKWARD = "smallbackward";
			public final String BIGFORWARD = "bigforward";
			public final String BIGBACKWARD = "bigbackward";

			public final static Set<String> values = new HashSet<String>(Arrays.asList(SMALLFORWARD, SMALLBACKWARD, BIGFORWARD, BIGBACKWARD));
		}
	}

	/**
	 * Set the audio stream played by the player.
	 * <p/>
	 * This class represents the API method <tt>Player.SetAudioStream</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class SetAudioStream extends AbstractCall<String> {
		public final static String API_TYPE = "Player.SetAudioStream";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected SetAudioStream(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<SetAudioStream> CREATOR = new Parcelable.Creator<SetAudioStream>() {
			@Override
			public SetAudioStream createFromParcel(Parcel parcel) {
				return new SetAudioStream(parcel);
			}
			@Override
			public SetAudioStream[] newArray(int n) {
				return new SetAudioStream[n];
			}
		};

		/**
		 * Set the audio stream played by the player.
		 * @param playerid 
		 * @param stream  One of: <tt>previous</tt>, <tt>next</tt>. See constants at {@link Player.SetAudioStream.Stream}.
		 */
		public SetAudioStream(Integer playerid, String stream) {
			super();
			addParameter("playerid", playerid);
			addParameter("stream", stream);
		}

		/**
		 * Set the audio stream played by the player.
		 * @param playerid 
		 * @param stream Index of the audio stream to play.
		 */
		public SetAudioStream(Integer playerid, Integer stream) {
			super();
			addParameter("playerid", playerid);
			addParameter("stream", stream);
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

		/**
		 * API Name: <tt>stream</tt>
		 */
		public interface Stream {

			public final String PREVIOUS = "previous";
			public final String NEXT = "next";

			public final static Set<String> values = new HashSet<String>(Arrays.asList(PREVIOUS, NEXT));
		}
	}

	/**
	 * Turn partymode on or off.
	 * <p/>
	 * This class represents the API method <tt>Player.SetPartymode</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class SetPartymode extends AbstractCall<String> {
		public final static String API_TYPE = "Player.SetPartymode";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected SetPartymode(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<SetPartymode> CREATOR = new Parcelable.Creator<SetPartymode>() {
			@Override
			public SetPartymode createFromParcel(Parcel parcel) {
				return new SetPartymode(parcel);
			}
			@Override
			public SetPartymode[] newArray(int n) {
				return new SetPartymode[n];
			}
		};

		/**
		 * Turn partymode on or off.
		 * @param playerid 
		 * @param partymode 
		 */
		public SetPartymode(Integer playerid, GlobalModel.Toggle partymode) {
			super();
			addParameter("playerid", playerid);
			addParameter("partymode", partymode);
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
	 * Set the repeat mode of the player.
	 * <p/>
	 * This class represents the API method <tt>Player.SetRepeat</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class SetRepeat extends AbstractCall<String> {
		public final static String API_TYPE = "Player.SetRepeat";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected SetRepeat(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<SetRepeat> CREATOR = new Parcelable.Creator<SetRepeat>() {
			@Override
			public SetRepeat createFromParcel(Parcel parcel) {
				return new SetRepeat(parcel);
			}
			@Override
			public SetRepeat[] newArray(int n) {
				return new SetRepeat[n];
			}
		};

		/**
		 * Set the repeat mode of the player.
		 * @param playerid 
		 * @param repeat 
		 */
		public SetRepeat(Integer playerid, String repeat) {
			super();
			addParameter("playerid", playerid);
			addParameter("repeat", repeat);
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
	 * Shuffle/Unshuffle items in the player.
	 * <p/>
	 * This class represents the API method <tt>Player.SetShuffle</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class SetShuffle extends AbstractCall<String> {
		public final static String API_TYPE = "Player.SetShuffle";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected SetShuffle(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<SetShuffle> CREATOR = new Parcelable.Creator<SetShuffle>() {
			@Override
			public SetShuffle createFromParcel(Parcel parcel) {
				return new SetShuffle(parcel);
			}
			@Override
			public SetShuffle[] newArray(int n) {
				return new SetShuffle[n];
			}
		};

		/**
		 * Shuffle/Unshuffle items in the player.
		 * @param playerid 
		 * @param shuffle 
		 */
		public SetShuffle(Integer playerid, GlobalModel.Toggle shuffle) {
			super();
			addParameter("playerid", playerid);
			addParameter("shuffle", shuffle);
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
	 * Set the speed of the current playback.
	 * <p/>
	 * This class represents the API method <tt>Player.SetSpeed</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class SetSpeed extends AbstractCall<PlayerModel.Speed> {
		public final static String API_TYPE = "Player.SetSpeed";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeParcelable(mResult, flags);
		}

		/**
		 * Construct via parcel.
		 */
		protected SetSpeed(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<SetSpeed> CREATOR = new Parcelable.Creator<SetSpeed>() {
			@Override
			public SetSpeed createFromParcel(Parcel parcel) {
				return new SetSpeed(parcel);
			}
			@Override
			public SetSpeed[] newArray(int n) {
				return new SetSpeed[n];
			}
		};

		/**
		 * Set the speed of the current playback.
		 * @param playerid 
		 * @param speed  One of: <tt>-32</tt>, <tt>-16</tt>, <tt>-8</tt>, <tt>-4</tt>, <tt>-2</tt>, <tt>-1</tt>, <tt>0</tt>, <tt>1</tt>, <tt>2</tt>, <tt>4</tt>, <tt>8</tt>, <tt>16</tt>, <tt>32</tt>. See constants at {@link Player.SetSpeed.Speed}.
		 */
		public SetSpeed(Integer playerid, Integer speed) {
			super();
			addParameter("playerid", playerid);
			addParameter("speed", speed);
		}

		@Override
		protected PlayerModel.Speed parseOne(JsonNode node) {
			return new PlayerModel.Speed(node);
		}

		@Override
		public String getName() {
			return API_TYPE;
		}

		@Override
		protected boolean returnsList() {
			return false;
		}

		/**
		 * API Name: <tt>speed</tt>
		 */
		public interface Speed {

			public final Integer MINUS_32 = -32;
			public final Integer MINUS_16 = -16;
			public final Integer MINUS_8 = -8;
			public final Integer MINUS_4 = -4;
			public final Integer MINUS_2 = -2;
			public final Integer MINUS_1 = -1;
			public final Integer ZERO = 0;
			public final Integer PLUS_1 = 1;
			public final Integer PLUS_2 = 2;
			public final Integer PLUS_4 = 4;
			public final Integer PLUS_8 = 8;
			public final Integer PLUS_16 = 16;
			public final Integer PLUS_32 = 32;

			public final static Set<Integer> values = new HashSet<Integer>(Arrays.asList(MINUS_32, MINUS_16, MINUS_8, MINUS_4, MINUS_2, MINUS_1, ZERO, PLUS_1, PLUS_2, PLUS_4, PLUS_8, PLUS_16, PLUS_32));
		}
	}

	/**
	 * Set the subtitle displayed by the player.
	 * <p/>
	 * This class represents the API method <tt>Player.SetSubtitle</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class SetSubtitle extends AbstractCall<String> {
		public final static String API_TYPE = "Player.SetSubtitle";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected SetSubtitle(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<SetSubtitle> CREATOR = new Parcelable.Creator<SetSubtitle>() {
			@Override
			public SetSubtitle createFromParcel(Parcel parcel) {
				return new SetSubtitle(parcel);
			}
			@Override
			public SetSubtitle[] newArray(int n) {
				return new SetSubtitle[n];
			}
		};

		/**
		 * Set the subtitle displayed by the player.
		 * @param playerid 
		 * @param subtitle  One of: <tt>previous</tt>, <tt>next</tt>, <tt>off</tt>, <tt>on</tt>. See constants at {@link Player.SetSubtitle.Subtitle}.
		 * @param enable Whether to enable subtitles to be displayed after setting the new subtitle.
		 */
		public SetSubtitle(Integer playerid, String subtitle, Boolean enable) {
			super();
			addParameter("playerid", playerid);
			addParameter("subtitle", subtitle);
			addParameter("enable", enable);
		}

		/**
		 * Set the subtitle displayed by the player.
		 * @param playerid 
		 * @param subtitle Index of the subtitle to display.
		 * @param enable Whether to enable subtitles to be displayed after setting the new subtitle.
		 */
		public SetSubtitle(Integer playerid, Integer subtitle, Boolean enable) {
			super();
			addParameter("playerid", playerid);
			addParameter("subtitle", subtitle);
			addParameter("enable", enable);
		}

		/**
		 * Set the subtitle displayed by the player.
		 * @param playerid 
		 * @param subtitle  One of: <tt>previous</tt>, <tt>next</tt>, <tt>off</tt>, <tt>on</tt>. See constants at {@link Player.SetSubtitle.Subtitle}.
		 */
		public SetSubtitle(Integer playerid, String subtitle) {
			super();
			addParameter("playerid", playerid);
			addParameter("subtitle", subtitle);
		}

		/**
		 * Set the subtitle displayed by the player.
		 * @param playerid 
		 * @param subtitle Index of the subtitle to display.
		 */
		public SetSubtitle(Integer playerid, Integer subtitle) {
			super();
			addParameter("playerid", playerid);
			addParameter("subtitle", subtitle);
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

		/**
		 * API Name: <tt>subtitle</tt>
		 */
		public interface Subtitle {

			public final String PREVIOUS = "previous";
			public final String NEXT = "next";
			public final String OFF = "off";
			public final String ON = "on";

			public final static Set<String> values = new HashSet<String>(Arrays.asList(PREVIOUS, NEXT, OFF, ON));
		}
	}

	/**
	 * Stops playback.
	 * <p/>
	 * This class represents the API method <tt>Player.Stop</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class Stop extends AbstractCall<String> {
		public final static String API_TYPE = "Player.Stop";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected Stop(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<Stop> CREATOR = new Parcelable.Creator<Stop>() {
			@Override
			public Stop createFromParcel(Parcel parcel) {
				return new Stop(parcel);
			}
			@Override
			public Stop[] newArray(int n) {
				return new Stop[n];
			}
		};

		/**
		 * Stops playback.
		 * @param playerid 
		 */
		public Stop(Integer playerid) {
			super();
			addParameter("playerid", playerid);
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
	 * Zoom current picture.
	 * <p/>
	 * This class represents the API method <tt>Player.Zoom</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class Zoom extends AbstractCall<String> {
		public final static String API_TYPE = "Player.Zoom";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected Zoom(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<Zoom> CREATOR = new Parcelable.Creator<Zoom>() {
			@Override
			public Zoom createFromParcel(Parcel parcel) {
				return new Zoom(parcel);
			}
			@Override
			public Zoom[] newArray(int n) {
				return new Zoom[n];
			}
		};

		/**
		 * Zoom current picture.
		 * @param playerid 
		 * @param zoom  One of: <tt>in</tt>, <tt>out</tt>. See constants at {@link Player.Zoom.ZoomValue}.
		 */
		public Zoom(Integer playerid, String zoom) {
			super();
			addParameter("playerid", playerid);
			addParameter("zoom", zoom);
		}

		/**
		 * Zoom current picture.
		 * @param playerid 
		 * @param zoom zoom level.
		 */
		public Zoom(Integer playerid, Integer zoom) {
			super();
			addParameter("playerid", playerid);
			addParameter("zoom", zoom);
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

		/**
		 * API Name: <tt>zoom</tt>
		 */
		public interface ZoomValue {

			public final String IN = "in";
			public final String OUT = "out";

			public final static Set<String> values = new HashSet<String>(Arrays.asList(IN, OUT));
		}
	}
}
