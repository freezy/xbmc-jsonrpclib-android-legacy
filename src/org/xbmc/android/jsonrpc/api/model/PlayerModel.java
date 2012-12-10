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

public final class PlayerModel {

	/**
	 * API Name: <tt>Player.Audio.Stream</tt>
	 * <p/>
	 * Note: This class is used as result only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class AudioStream extends AbstractModel {
		public final static String API_TYPE = "Player.Audio.Stream";

		// field names
		public static final String INDEX = "index";
		public static final String LANGUAGE = "language";
		public static final String NAME = "name";

		// class members
		public final Integer index;
		public final String language;
		public final String name;

		/**
		 * @param index
		 * @param language
		 * @param name
		 */
		public AudioStream(Integer index, String language, String name) {
			this.index = index;
			this.language = language;
			this.name = name;
		}

		/**
		 * Construct from JSON object.
		 * @param node JSON object representing a AudioStream object
		 */
		public AudioStream(JsonNode node) {
			index = node.get(INDEX).getIntValue(); // required value
			language = node.get(LANGUAGE).getTextValue(); // required value
			name = node.get(NAME).getTextValue(); // required value
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = OM.createObjectNode();
			node.put(INDEX, index);
			node.put(LANGUAGE, language);
			node.put(NAME, name);
			return node;
		}

		/**
		 * Extracts a list of {@link AudioStream} objects from a JSON array.
		 * @param obj ObjectNode containing the list of objects.
		 * @param key Key pointing to the node where the list is stored.
		 */
		static List<AudioStream> getPlayerModelAudioStreamList(JsonNode node, String key) {
			if (node.has(key)) {
				final ArrayNode a = (ArrayNode)node.get(key);
				final List<AudioStream> l = new ArrayList<AudioStream>(a.size());
				for (int i = 0; i < a.size(); i++) {
					l.add(new AudioStream((JsonNode)a.get(i)));
				}
				return l;
			}
			return new ArrayList<AudioStream>(0);
		}

		/**
		 * Flatten this object into a Parcel.
		 * @param parcel the Parcel in which the object should be written.
		 * @param flags additional flags about how the object should be written.
		 */
		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			parcel.writeValue(index);
			parcel.writeValue(language);
			parcel.writeValue(name);
		}

		/**
		 * Construct via parcel.
		 */
		protected AudioStream(Parcel parcel) {
			index = parcel.readInt();
			language = parcel.readString();
			name = parcel.readString();
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<AudioStream> CREATOR = new Parcelable.Creator<AudioStream>() {
			@Override
			public AudioStream createFromParcel(Parcel parcel) {
				return new AudioStream(parcel);
			}
			@Override
			public AudioStream[] newArray(int n) {
				return new AudioStream[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}
	}

	/**
	 * API Name: <tt>Player.Audio.Stream.Extended</tt>
	 * <p/>
	 * Note: This class is used as result only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class AudioStreamExtended extends AudioStream {
		public final static String API_TYPE = "Player.Audio.Stream.Extended";

		// field names
		public static final String BITRATE = "bitrate";
		public static final String CHANNELS = "channels";
		public static final String CODEC = "codec";

		// class members
		public final Integer bitrate;
		public final Integer channels;
		public final String codec;

		/**
		 * Construct from JSON object.
		 * @param node JSON object representing a AudioStreamExtended object
		 */
		public AudioStreamExtended(JsonNode node) {
			super(node);
			bitrate = node.get(BITRATE).getIntValue(); // required value
			channels = node.get(CHANNELS).getIntValue(); // required value
			codec = node.get(CODEC).getTextValue(); // required value
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = (ObjectNode)super.toJsonNode();
			node.put(BITRATE, bitrate);
			node.put(CHANNELS, channels);
			node.put(CODEC, codec);
			return node;
		}

		/**
		 * Extracts a list of {@link AudioStreamExtended} objects from a JSON array.
		 * @param obj ObjectNode containing the list of objects.
		 * @param key Key pointing to the node where the list is stored.
		 */
		static List<AudioStreamExtended> getPlayerModelAudioStreamExtendedList(JsonNode node, String key) {
			if (node.has(key)) {
				final ArrayNode a = (ArrayNode)node.get(key);
				final List<AudioStreamExtended> l = new ArrayList<AudioStreamExtended>(a.size());
				for (int i = 0; i < a.size(); i++) {
					l.add(new AudioStreamExtended((JsonNode)a.get(i)));
				}
				return l;
			}
			return new ArrayList<AudioStreamExtended>(0);
		}

		/**
		 * Flatten this object into a Parcel.
		 * @param parcel the Parcel in which the object should be written.
		 * @param flags additional flags about how the object should be written.
		 */
		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(bitrate);
			parcel.writeValue(channels);
			parcel.writeValue(codec);
		}

		/**
		 * Construct via parcel.
		 */
		protected AudioStreamExtended(Parcel parcel) {
			super(parcel);
			bitrate = parcel.readInt();
			channels = parcel.readInt();
			codec = parcel.readString();
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<AudioStreamExtended> CREATOR = new Parcelable.Creator<AudioStreamExtended>() {
			@Override
			public AudioStreamExtended createFromParcel(Parcel parcel) {
				return new AudioStreamExtended(parcel);
			}
			@Override
			public AudioStreamExtended[] newArray(int n) {
				return new AudioStreamExtended[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}
	}

	/**
	 * API Name: <tt>Player.Notifications.Data</tt>
	 * <p/>
	 * Note: Seems this class isn't used yet in the API.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class NotificationsData extends AbstractModel {
		public final static String API_TYPE = "Player.Notifications.Data";

		// field names
		public static final String ITEM = "item";
		public static final String PLAYER = "player";

		// class members
		public final NotificationsModel.Item item;
		public final NotificationsPlayer player;

		/**
		 * @param item
		 * @param player
		 */
		public NotificationsData(NotificationsModel.Item item, NotificationsPlayer player) {
			this.item = item;
			this.player = player;
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = OM.createObjectNode();
			node.put(ITEM, item.toJsonNode());
			node.put(PLAYER, player.toJsonNode());
			return node;
		}

		/**
		 * Flatten this object into a Parcel.
		 * @param parcel the Parcel in which the object should be written.
		 * @param flags additional flags about how the object should be written.
		 */
		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			parcel.writeValue(item);
			parcel.writeValue(player);
		}

		/**
		 * Construct via parcel.
		 */
		protected NotificationsData(Parcel parcel) {
			item = parcel.<NotificationsModel.Item>readParcelable(NotificationsModel.Item.class.getClassLoader());
			player = parcel.<NotificationsPlayer>readParcelable(NotificationsPlayer.class.getClassLoader());
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<NotificationsData> CREATOR = new Parcelable.Creator<NotificationsData>() {
			@Override
			public NotificationsData createFromParcel(Parcel parcel) {
				return new NotificationsData(parcel);
			}
			@Override
			public NotificationsData[] newArray(int n) {
				return new NotificationsData[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}
	}

	/**
	 * API Name: <tt>Player.Notifications.Player</tt>
	 * <p/>
	 * Note: Seems this class isn't used yet in the API.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class NotificationsPlayer extends AbstractModel {
		public final static String API_TYPE = "Player.Notifications.Player";

		// field names
		public static final String PLAYERID = "playerid";
		public static final String SPEED = "speed";

		// class members
		public final Integer playerid;
		public final Integer speed;

		/**
		 * @param playerid
		 * @param speed
		 */
		public NotificationsPlayer(Integer playerid, Integer speed) {
			this.playerid = playerid;
			this.speed = speed;
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = OM.createObjectNode();
			node.put(PLAYERID, playerid);
			node.put(SPEED, speed);
			return node;
		}

		/**
		 * Flatten this object into a Parcel.
		 * @param parcel the Parcel in which the object should be written.
		 * @param flags additional flags about how the object should be written.
		 */
		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			parcel.writeValue(playerid);
			parcel.writeValue(speed);
		}

		/**
		 * Construct via parcel.
		 */
		protected NotificationsPlayer(Parcel parcel) {
			playerid = parcel.readInt();
			speed = parcel.readInt();
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<NotificationsPlayer> CREATOR = new Parcelable.Creator<NotificationsPlayer>() {
			@Override
			public NotificationsPlayer createFromParcel(Parcel parcel) {
				return new NotificationsPlayer(parcel);
			}
			@Override
			public NotificationsPlayer[] newArray(int n) {
				return new NotificationsPlayer[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}
	}

	/**
	 * API Name: <tt>Player.Notifications.Player.Seek</tt>
	 * <p/>
	 * Note: Seems this class isn't used yet in the API.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class NotificationsPlayerSeek extends NotificationsPlayer {
		public final static String API_TYPE = "Player.Notifications.Player.Seek";

		// field names
		public static final String SEEKOFFSET = "seekoffset";
		public static final String TIME = "time";

		// class members
		public final GlobalModel.Time seekoffset;
		public final GlobalModel.Time time;

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = (ObjectNode)super.toJsonNode();
			node.put(SEEKOFFSET, seekoffset.toJsonNode());
			node.put(TIME, time.toJsonNode());
			return node;
		}

		/**
		 * Flatten this object into a Parcel.
		 * @param parcel the Parcel in which the object should be written.
		 * @param flags additional flags about how the object should be written.
		 */
		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(seekoffset);
			parcel.writeValue(time);
		}

		/**
		 * Construct via parcel.
		 */
		protected NotificationsPlayerSeek(Parcel parcel) {
			super(parcel);
			seekoffset = parcel.<GlobalModel.Time>readParcelable(GlobalModel.Time.class.getClassLoader());
			time = parcel.<GlobalModel.Time>readParcelable(GlobalModel.Time.class.getClassLoader());
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<NotificationsPlayerSeek> CREATOR = new Parcelable.Creator<NotificationsPlayerSeek>() {
			@Override
			public NotificationsPlayerSeek createFromParcel(Parcel parcel) {
				return new NotificationsPlayerSeek(parcel);
			}
			@Override
			public NotificationsPlayerSeek[] newArray(int n) {
				return new NotificationsPlayerSeek[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}
	}

	/**
	 * Time to seek to.
	 * <p/>
	 * API Name: <tt>Player.Position.Time</tt>
	 * <p/>
	 * Note: This class is used as parameter only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class PositionTime extends AbstractModel {
		public final static String API_TYPE = "Player.Position.Time";

		// field names
		public static final String HOURS = "hours";
		public static final String MILLISECONDS = "milliseconds";
		public static final String MINUTES = "minutes";
		public static final String SECONDS = "seconds";

		// class members
		public final Integer hours;
		public final Integer milliseconds;
		public final Integer minutes;
		public final Integer seconds;

		/**
		 * Time to seek to.
		 * @param hours
		 * @param milliseconds
		 * @param minutes
		 * @param seconds
		 */
		public PositionTime(Integer hours, Integer milliseconds, Integer minutes, Integer seconds) {
			this.hours = hours;
			this.milliseconds = milliseconds;
			this.minutes = minutes;
			this.seconds = seconds;
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = OM.createObjectNode();
			node.put(HOURS, hours);
			node.put(MILLISECONDS, milliseconds);
			node.put(MINUTES, minutes);
			node.put(SECONDS, seconds);
			return node;
		}

		/**
		 * Flatten this object into a Parcel.
		 * @param parcel the Parcel in which the object should be written.
		 * @param flags additional flags about how the object should be written.
		 */
		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			parcel.writeValue(hours);
			parcel.writeValue(milliseconds);
			parcel.writeValue(minutes);
			parcel.writeValue(seconds);
		}

		/**
		 * Construct via parcel.
		 */
		protected PositionTime(Parcel parcel) {
			hours = parcel.readInt();
			milliseconds = parcel.readInt();
			minutes = parcel.readInt();
			seconds = parcel.readInt();
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<PositionTime> CREATOR = new Parcelable.Creator<PositionTime>() {
			@Override
			public PositionTime createFromParcel(Parcel parcel) {
				return new PositionTime(parcel);
			}
			@Override
			public PositionTime[] newArray(int n) {
				return new PositionTime[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}
	}

	/**
	 * API Name: <tt>Player.Property.Value</tt>
	 * <p/>
	 * Note: This class is used as result only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class PropertyValue extends AbstractModel {
		public final static String API_TYPE = "Player.Property.Value";

		// field names
		public static final String AUDIOSTREAMS = "audiostreams";
		public static final String CANCHANGESPEED = "canchangespeed";
		public static final String CANMOVE = "canmove";
		public static final String CANREPEAT = "canrepeat";
		public static final String CANROTATE = "canrotate";
		public static final String CANSEEK = "canseek";
		public static final String CANSHUFFLE = "canshuffle";
		public static final String CANZOOM = "canzoom";
		public static final String CURRENTAUDIOSTREAM = "currentaudiostream";
		public static final String CURRENTSUBTITLE = "currentsubtitle";
		public static final String LIVE = "live";
		public static final String PARTYMODE = "partymode";
		public static final String PERCENTAGE = "percentage";
		public static final String PLAYLISTID = "playlistid";
		public static final String POSITION = "position";
		public static final String REPEAT = "repeat";
		public static final String SHUFFLED = "shuffled";
		public static final String SPEED = "speed";
		public static final String SUBTITLEENABLED = "subtitleenabled";
		public static final String SUBTITLES = "subtitles";
		public static final String TIME = "time";
		public static final String TOTALTIME = "totaltime";
		public static final String TYPE = "type";

		// class members
		public final List<AudioStream> audiostreams;
		public final Boolean canchangespeed;
		public final Boolean canmove;
		public final Boolean canrepeat;
		public final Boolean canrotate;
		public final Boolean canseek;
		public final Boolean canshuffle;
		public final Boolean canzoom;
		public final AudioStreamExtended currentaudiostream;
		public final Subtitle currentsubtitle;
		public final Boolean live;
		public final Boolean partymode;
		public final Double percentage;
		public final Integer playlistid;
		public final Integer position;
		public final String repeat;
		public final Boolean shuffled;
		public final Integer speed;
		public final Boolean subtitleenabled;
		public final List<Subtitle> subtitles;
		public final GlobalModel.Time time;
		public final GlobalModel.Time totaltime;
		public final String type;

		/**
		 * @param audiostreams
		 * @param canchangespeed
		 * @param canmove
		 * @param canrepeat
		 * @param canrotate
		 * @param canseek
		 * @param canshuffle
		 * @param canzoom
		 * @param currentaudiostream
		 * @param currentsubtitle
		 * @param live
		 * @param partymode
		 * @param percentage
		 * @param playlistid
		 * @param position
		 * @param repeat One of: <tt>off</tt>, <tt>one</tt>, <tt>all</tt>. See constants at {@link PlayerModel.PropertyValue.Repeat}.
		 * @param shuffled
		 * @param speed
		 * @param subtitleenabled
		 * @param subtitles
		 * @param time
		 * @param totaltime
		 * @param type One of: <tt>video</tt>, <tt>audio</tt>, <tt>picture</tt>. See constants at {@link PlayerModel.PropertyValue.Type}.
		 */
		public PropertyValue(List<AudioStream> audiostreams, Boolean canchangespeed, Boolean canmove, Boolean canrepeat, Boolean canrotate, Boolean canseek, Boolean canshuffle, Boolean canzoom, AudioStreamExtended currentaudiostream, Subtitle currentsubtitle, Boolean live, Boolean partymode, Double percentage, Integer playlistid, Integer position, String repeat, Boolean shuffled, Integer speed, Boolean subtitleenabled, List<Subtitle> subtitles, GlobalModel.Time time, GlobalModel.Time totaltime, String type) {
			this.audiostreams = audiostreams;
			this.canchangespeed = canchangespeed;
			this.canmove = canmove;
			this.canrepeat = canrepeat;
			this.canrotate = canrotate;
			this.canseek = canseek;
			this.canshuffle = canshuffle;
			this.canzoom = canzoom;
			this.currentaudiostream = currentaudiostream;
			this.currentsubtitle = currentsubtitle;
			this.live = live;
			this.partymode = partymode;
			this.percentage = percentage;
			this.playlistid = playlistid;
			this.position = position;
			this.repeat = repeat;
			this.shuffled = shuffled;
			this.speed = speed;
			this.subtitleenabled = subtitleenabled;
			this.subtitles = subtitles;
			this.time = time;
			this.totaltime = totaltime;
			this.type = type;
		}

		/**
		 * Construct from JSON object.
		 * @param node JSON object representing a PropertyValue object
		 */
		public PropertyValue(JsonNode node) {
			audiostreams = AudioStream.getPlayerModelAudioStreamList(node, AUDIOSTREAMS);
			canchangespeed = parseBoolean(node, CANCHANGESPEED);
			canmove = parseBoolean(node, CANMOVE);
			canrepeat = parseBoolean(node, CANREPEAT);
			canrotate = parseBoolean(node, CANROTATE);
			canseek = parseBoolean(node, CANSEEK);
			canshuffle = parseBoolean(node, CANSHUFFLE);
			canzoom = parseBoolean(node, CANZOOM);
			currentaudiostream = node.has(CURRENTAUDIOSTREAM) ? new AudioStreamExtended(node.get(CURRENTAUDIOSTREAM)) : null;
			currentsubtitle = node.has(CURRENTSUBTITLE) ? new Subtitle(node.get(CURRENTSUBTITLE)) : null;
			live = parseBoolean(node, LIVE);
			partymode = parseBoolean(node, PARTYMODE);
			percentage = parseDouble(node, PERCENTAGE);
			playlistid = parseInt(node, PLAYLISTID);
			position = parseInt(node, POSITION);
			repeat = parseString(node, REPEAT);
			shuffled = parseBoolean(node, SHUFFLED);
			speed = parseInt(node, SPEED);
			subtitleenabled = parseBoolean(node, SUBTITLEENABLED);
			subtitles = Subtitle.getPlayerModelSubtitleList(node, SUBTITLES);
			time = node.has(TIME) ? new GlobalModel.Time(node.get(TIME)) : null;
			totaltime = node.has(TOTALTIME) ? new GlobalModel.Time(node.get(TOTALTIME)) : null;
			type = parseString(node, TYPE);
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = OM.createObjectNode();
			final ArrayNode audiostreamsArray = OM.createArrayNode();
			for (AudioStream item : audiostreams) {
				audiostreamsArray.add(item.toJsonNode());
			}
			node.put(AUDIOSTREAMS, audiostreamsArray);
			node.put(CANCHANGESPEED, canchangespeed);
			node.put(CANMOVE, canmove);
			node.put(CANREPEAT, canrepeat);
			node.put(CANROTATE, canrotate);
			node.put(CANSEEK, canseek);
			node.put(CANSHUFFLE, canshuffle);
			node.put(CANZOOM, canzoom);
			node.put(CURRENTAUDIOSTREAM, currentaudiostream.toJsonNode());
			node.put(CURRENTSUBTITLE, currentsubtitle.toJsonNode());
			node.put(LIVE, live);
			node.put(PARTYMODE, partymode);
			node.put(PERCENTAGE, percentage);
			node.put(PLAYLISTID, playlistid);
			node.put(POSITION, position);
			node.put(REPEAT, repeat); // enum
			node.put(SHUFFLED, shuffled);
			node.put(SPEED, speed);
			node.put(SUBTITLEENABLED, subtitleenabled);
			final ArrayNode subtitlesArray = OM.createArrayNode();
			for (Subtitle item : subtitles) {
				subtitlesArray.add(item.toJsonNode());
			}
			node.put(SUBTITLES, subtitlesArray);
			node.put(TIME, time.toJsonNode());
			node.put(TOTALTIME, totaltime.toJsonNode());
			node.put(TYPE, type); // enum
			return node;
		}

		/**
		 * Extracts a list of {@link PropertyValue} objects from a JSON array.
		 * @param obj ObjectNode containing the list of objects.
		 * @param key Key pointing to the node where the list is stored.
		 */
		static List<PropertyValue> getPlayerModelPropertyValueList(JsonNode node, String key) {
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
			parcel.writeInt(audiostreams.size());
			for (AudioStream item : audiostreams) {
				parcel.writeParcelable(item, flags);
			}
			parcel.writeInt(canchangespeed ? 1 : 0);
			parcel.writeInt(canmove ? 1 : 0);
			parcel.writeInt(canrepeat ? 1 : 0);
			parcel.writeInt(canrotate ? 1 : 0);
			parcel.writeInt(canseek ? 1 : 0);
			parcel.writeInt(canshuffle ? 1 : 0);
			parcel.writeInt(canzoom ? 1 : 0);
			parcel.writeValue(currentaudiostream);
			parcel.writeValue(currentsubtitle);
			parcel.writeInt(live ? 1 : 0);
			parcel.writeInt(partymode ? 1 : 0);
			parcel.writeValue(percentage);
			parcel.writeValue(playlistid);
			parcel.writeValue(position);
			parcel.writeValue(repeat); // enum
			parcel.writeInt(shuffled ? 1 : 0);
			parcel.writeValue(speed);
			parcel.writeInt(subtitleenabled ? 1 : 0);
			parcel.writeInt(subtitles.size());
			for (Subtitle item : subtitles) {
				parcel.writeParcelable(item, flags);
			}
			parcel.writeValue(time);
			parcel.writeValue(totaltime);
			parcel.writeValue(type); // enum
		}

		/**
		 * Construct via parcel.
		 */
		protected PropertyValue(Parcel parcel) {
			final int audiostreamsSize = parcel.readInt();
			audiostreams = new ArrayList<AudioStream>(audiostreamsSize);
			for (int i = 0; i < audiostreamsSize; i++) {
				audiostreams.add(parcel.<AudioStream>readParcelable(AudioStream.class.getClassLoader()));
			}
			canchangespeed = parcel.readInt() == 1;
			canmove = parcel.readInt() == 1;
			canrepeat = parcel.readInt() == 1;
			canrotate = parcel.readInt() == 1;
			canseek = parcel.readInt() == 1;
			canshuffle = parcel.readInt() == 1;
			canzoom = parcel.readInt() == 1;
			currentaudiostream = parcel.<AudioStreamExtended>readParcelable(AudioStreamExtended.class.getClassLoader());
			currentsubtitle = parcel.<Subtitle>readParcelable(Subtitle.class.getClassLoader());
			live = parcel.readInt() == 1;
			partymode = parcel.readInt() == 1;
			percentage = parcel.readDouble();
			playlistid = parcel.readInt();
			position = parcel.readInt();
			repeat = parcel.readString(); // enum
			shuffled = parcel.readInt() == 1;
			speed = parcel.readInt();
			subtitleenabled = parcel.readInt() == 1;
			final int subtitlesSize = parcel.readInt();
			subtitles = new ArrayList<Subtitle>(subtitlesSize);
			for (int i = 0; i < subtitlesSize; i++) {
				subtitles.add(parcel.<Subtitle>readParcelable(Subtitle.class.getClassLoader()));
			}
			time = parcel.<GlobalModel.Time>readParcelable(GlobalModel.Time.class.getClassLoader());
			totaltime = parcel.<GlobalModel.Time>readParcelable(GlobalModel.Time.class.getClassLoader());
			type = parcel.readString(); // enum
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
		 * API Name: <tt>repeat</tt>
		 */
		public interface Repeat {

			public final String OFF = "off";
			public final String ONE = "one";
			public final String ALL = "all";

			public final static Set<String> values = new HashSet<String>(Arrays.asList(OFF, ONE, ALL));
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

	/**
	 * API Name: <tt>Player.Speed</tt>
	 * <p/>
	 * Note: This class is used as result only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class Speed extends AbstractModel {
		public final static String API_TYPE = "Player.Speed";

		// field names
		public static final String SPEED = "speed";

		// class members
		public final Integer speed;

		/**
		 * @param speed
		 */
		public Speed(Integer speed) {
			this.speed = speed;
		}

		/**
		 * Construct from JSON object.
		 * @param node JSON object representing a Speed object
		 */
		public Speed(JsonNode node) {
			speed = parseInt(node, SPEED);
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = OM.createObjectNode();
			node.put(SPEED, speed);
			return node;
		}

		/**
		 * Extracts a list of {@link Speed} objects from a JSON array.
		 * @param obj ObjectNode containing the list of objects.
		 * @param key Key pointing to the node where the list is stored.
		 */
		static List<Speed> getPlayerModelSpeedList(JsonNode node, String key) {
			if (node.has(key)) {
				final ArrayNode a = (ArrayNode)node.get(key);
				final List<Speed> l = new ArrayList<Speed>(a.size());
				for (int i = 0; i < a.size(); i++) {
					l.add(new Speed((JsonNode)a.get(i)));
				}
				return l;
			}
			return new ArrayList<Speed>(0);
		}

		/**
		 * Flatten this object into a Parcel.
		 * @param parcel the Parcel in which the object should be written.
		 * @param flags additional flags about how the object should be written.
		 */
		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			parcel.writeValue(speed);
		}

		/**
		 * Construct via parcel.
		 */
		protected Speed(Parcel parcel) {
			speed = parcel.readInt();
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<Speed> CREATOR = new Parcelable.Creator<Speed>() {
			@Override
			public Speed createFromParcel(Parcel parcel) {
				return new Speed(parcel);
			}
			@Override
			public Speed[] newArray(int n) {
				return new Speed[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}
	}

	/**
	 * API Name: <tt>Player.Subtitle</tt>
	 * <p/>
	 * Note: This class is used as result only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class Subtitle extends AbstractModel {
		public final static String API_TYPE = "Player.Subtitle";

		// field names
		public static final String INDEX = "index";
		public static final String LANGUAGE = "language";
		public static final String NAME = "name";

		// class members
		public final Integer index;
		public final String language;
		public final String name;

		/**
		 * @param index
		 * @param language
		 * @param name
		 */
		public Subtitle(Integer index, String language, String name) {
			this.index = index;
			this.language = language;
			this.name = name;
		}

		/**
		 * Construct from JSON object.
		 * @param node JSON object representing a Subtitle object
		 */
		public Subtitle(JsonNode node) {
			index = node.get(INDEX).getIntValue(); // required value
			language = node.get(LANGUAGE).getTextValue(); // required value
			name = node.get(NAME).getTextValue(); // required value
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = OM.createObjectNode();
			node.put(INDEX, index);
			node.put(LANGUAGE, language);
			node.put(NAME, name);
			return node;
		}

		/**
		 * Extracts a list of {@link Subtitle} objects from a JSON array.
		 * @param obj ObjectNode containing the list of objects.
		 * @param key Key pointing to the node where the list is stored.
		 */
		static List<Subtitle> getPlayerModelSubtitleList(JsonNode node, String key) {
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
			parcel.writeValue(index);
			parcel.writeValue(language);
			parcel.writeValue(name);
		}

		/**
		 * Construct via parcel.
		 */
		protected Subtitle(Parcel parcel) {
			index = parcel.readInt();
			language = parcel.readString();
			name = parcel.readString();
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
	 * API Name: <tt>Player.Property.Name</tt>
	 */
	public interface PropertyName {

		public final String TYPE = "type";
		public final String PARTYMODE = "partymode";
		public final String SPEED = "speed";
		public final String TIME = "time";
		public final String PERCENTAGE = "percentage";
		public final String TOTALTIME = "totaltime";
		public final String PLAYLISTID = "playlistid";
		public final String POSITION = "position";
		public final String REPEAT = "repeat";
		public final String SHUFFLED = "shuffled";
		public final String CANSEEK = "canseek";
		public final String CANCHANGESPEED = "canchangespeed";
		public final String CANMOVE = "canmove";
		public final String CANZOOM = "canzoom";
		public final String CANROTATE = "canrotate";
		public final String CANSHUFFLE = "canshuffle";
		public final String CANREPEAT = "canrepeat";
		public final String CURRENTAUDIOSTREAM = "currentaudiostream";
		public final String AUDIOSTREAMS = "audiostreams";
		public final String SUBTITLEENABLED = "subtitleenabled";
		public final String CURRENTSUBTITLE = "currentsubtitle";
		public final String SUBTITLES = "subtitles";
		public final String LIVE = "live";

		public final static Set<String> values = new HashSet<String>(Arrays.asList(TYPE, PARTYMODE, SPEED, TIME, PERCENTAGE, TOTALTIME, PLAYLISTID, POSITION, REPEAT, SHUFFLED, CANSEEK, CANCHANGESPEED, CANMOVE, CANZOOM, CANROTATE, CANSHUFFLE, CANREPEAT, CURRENTAUDIOSTREAM, AUDIOSTREAMS, SUBTITLEENABLED, CURRENTSUBTITLE, SUBTITLES, LIVE));
	}

	/**
	 * API Name: <tt>Player.Repeat</tt>
	 */
	public interface Repeat {

		public final String OFF = "off";
		public final String ONE = "one";
		public final String ALL = "all";

		public final static Set<String> values = new HashSet<String>(Arrays.asList(OFF, ONE, ALL));
	}

	/**
	 * API Name: <tt>Player.Type</tt>
	 */
	public interface Type {

		public final String VIDEO = "video";
		public final String AUDIO = "audio";
		public final String PICTURE = "picture";

		public final static Set<String> values = new HashSet<String>(Arrays.asList(VIDEO, AUDIO, PICTURE));
	}
}
