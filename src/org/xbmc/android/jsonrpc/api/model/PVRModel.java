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
import org.codehaus.jackson.node.IntNode;
import org.codehaus.jackson.node.ObjectNode;
import org.codehaus.jackson.node.TextNode;
import org.xbmc.android.jsonrpc.api.AbstractModel;

public final class PVRModel {

	/**
	 * API Name: <tt>PVR.ChannelGroup.Id</tt>
	 * <p/>
	 * Note: This class is used as parameter only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class ChannelGroupId extends AbstractModel {
		public final static String API_TYPE = "PVR.ChannelGroup.Id";

		// class members
		public final Integer id;
		public final String stringArg;

		/**
		 * @param id
		 */
		public ChannelGroupId(Integer id) {
			this.id = id;
			this.stringArg = null;
		}

		/**
		 * @param stringArg One of: <tt>alltv</tt>, <tt>allradio</tt>. See constants at {@link PVRModel.ChannelGroupId.StringArg}.
		 */
		public ChannelGroupId(String stringArg) {
			this.stringArg = stringArg;
			this.id = null;
		}

		@Override
		public JsonNode toJsonNode() {
			if (id != null) {
				return new IntNode(id);
			}
			if (stringArg != null) {
				return new TextNode(stringArg); // 3num
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
			parcel.writeValue(id);
			parcel.writeValue(stringArg); // enum
		}

		/**
		 * Construct via parcel.
		 */
		protected ChannelGroupId(Parcel parcel) {
			id = parcel.readInt();
			stringArg = parcel.readString(); // enum
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<ChannelGroupId> CREATOR = new Parcelable.Creator<ChannelGroupId>() {
			@Override
			public ChannelGroupId createFromParcel(Parcel parcel) {
				return new ChannelGroupId(parcel);
			}
			@Override
			public ChannelGroupId[] newArray(int n) {
				return new ChannelGroupId[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}

		/**
		 * API Name: <tt>stringArg</tt>
		 */
		public interface StringArg {

			public final String ALLTV = "alltv";
			public final String ALLRADIO = "allradio";

			public final static Set<String> values = new HashSet<String>(Arrays.asList(ALLTV, ALLRADIO));
		}
	}

	/**
	 * API Name: <tt>PVR.Details.Channel</tt>
	 * <p/>
	 * Note: This class is used as result only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class ChannelDetail extends ItemModel.BaseDetail {
		public final static String API_TYPE = "PVR.Details.Channel";

		// field names
		public static final String CHANNEL = "channel";
		public static final String CHANNELID = "channelid";
		public static final String CHANNELTYPE = "channeltype";
		public static final String HIDDEN = "hidden";
		public static final String LASTPLAYED = "lastplayed";
		public static final String LOCKED = "locked";
		public static final String THUMBNAIL = "thumbnail";

		// class members
		public final String channel;
		public final Integer channelid;
		public final String channeltype;
		public final Boolean hidden;
		public final String lastplayed;
		public final Boolean locked;
		public final String thumbnail;

		/**
		 * Construct from JSON object.
		 * @param node JSON object representing a ChannelDetail object
		 */
		public ChannelDetail(JsonNode node) {
			super(node);
			channel = parseString(node, CHANNEL);
			channelid = parseInt(node, CHANNELID);
			channeltype = parseString(node, CHANNELTYPE);
			hidden = parseBoolean(node, HIDDEN);
			lastplayed = parseString(node, LASTPLAYED);
			locked = parseBoolean(node, LOCKED);
			thumbnail = parseString(node, THUMBNAIL);
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = (ObjectNode)super.toJsonNode();
			node.put(CHANNEL, channel);
			node.put(CHANNELID, channelid);
			node.put(CHANNELTYPE, channeltype); // enum
			node.put(HIDDEN, hidden);
			node.put(LASTPLAYED, lastplayed);
			node.put(LOCKED, locked);
			node.put(THUMBNAIL, thumbnail);
			return node;
		}

		/**
		 * Extracts a list of {@link ChannelDetail} objects from a JSON array.
		 * @param node ObjectNode containing the list of objects.
		 * @param key Key pointing to the node where the list is stored.
		 */
		static List<ChannelDetail> getPVRModelChannelDetailList(JsonNode node, String key) {
			if (node.has(key)) {
				final ArrayNode a = (ArrayNode)node.get(key);
				final List<ChannelDetail> l = new ArrayList<ChannelDetail>(a.size());
				for (int i = 0; i < a.size(); i++) {
					l.add(new ChannelDetail((JsonNode)a.get(i)));
				}
				return l;
			}
			return new ArrayList<ChannelDetail>(0);
		}

		/**
		 * Flatten this object into a Parcel.
		 * @param parcel the Parcel in which the object should be written.
		 * @param flags additional flags about how the object should be written.
		 */
		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(channel);
			parcel.writeValue(channelid);
			parcel.writeValue(channeltype); // enum
			parcel.writeInt(hidden ? 1 : 0);
			parcel.writeValue(lastplayed);
			parcel.writeInt(locked ? 1 : 0);
			parcel.writeValue(thumbnail);
		}

		/**
		 * Construct via parcel.
		 */
		protected ChannelDetail(Parcel parcel) {
			super(parcel);
			channel = parcel.readString();
			channelid = parcel.readInt();
			channeltype = parcel.readString(); // enum
			hidden = parcel.readInt() == 1;
			lastplayed = parcel.readString();
			locked = parcel.readInt() == 1;
			thumbnail = parcel.readString();
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<ChannelDetail> CREATOR = new Parcelable.Creator<ChannelDetail>() {
			@Override
			public ChannelDetail createFromParcel(Parcel parcel) {
				return new ChannelDetail(parcel);
			}
			@Override
			public ChannelDetail[] newArray(int n) {
				return new ChannelDetail[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}

		/**
		 * API Name: <tt>channeltype</tt>
		 */
		public interface Channeltype {

			public final String TV = "tv";
			public final String RADIO = "radio";

			public final static Set<String> values = new HashSet<String>(Arrays.asList(TV, RADIO));
		}
	}

	/**
	 * API Name: <tt>PVR.Details.ChannelGroup</tt>
	 * <p/>
	 * Note: This class is used as result only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class ChannelGroupDetail extends ItemModel.BaseDetail {
		public final static String API_TYPE = "PVR.Details.ChannelGroup";

		// field names
		public static final String CHANNELGROUPID = "channelgroupid";
		public static final String CHANNELTYPE = "channeltype";

		// class members
		public final Integer channelgroupid;
		public final String channeltype;

		/**
		 * Construct from JSON object.
		 * @param node JSON object representing a ChannelGroupDetail object
		 */
		public ChannelGroupDetail(JsonNode node) {
			super(node);
			channelgroupid = parseInt(node, CHANNELGROUPID);
			channeltype = parseString(node, CHANNELTYPE);
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = (ObjectNode)super.toJsonNode();
			node.put(CHANNELGROUPID, channelgroupid);
			node.put(CHANNELTYPE, channeltype); // enum
			return node;
		}

		/**
		 * Extracts a list of {@link ChannelGroupDetail} objects from a JSON array.
		 * @param node ObjectNode containing the list of objects.
		 * @param key Key pointing to the node where the list is stored.
		 */
		static List<ChannelGroupDetail> getPVRModelChannelGroupDetailList(JsonNode node, String key) {
			if (node.has(key)) {
				final ArrayNode a = (ArrayNode)node.get(key);
				final List<ChannelGroupDetail> l = new ArrayList<ChannelGroupDetail>(a.size());
				for (int i = 0; i < a.size(); i++) {
					l.add(new ChannelGroupDetail((JsonNode)a.get(i)));
				}
				return l;
			}
			return new ArrayList<ChannelGroupDetail>(0);
		}

		/**
		 * Flatten this object into a Parcel.
		 * @param parcel the Parcel in which the object should be written.
		 * @param flags additional flags about how the object should be written.
		 */
		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(channelgroupid);
			parcel.writeValue(channeltype); // enum
		}

		/**
		 * Construct via parcel.
		 */
		protected ChannelGroupDetail(Parcel parcel) {
			super(parcel);
			channelgroupid = parcel.readInt();
			channeltype = parcel.readString(); // enum
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<ChannelGroupDetail> CREATOR = new Parcelable.Creator<ChannelGroupDetail>() {
			@Override
			public ChannelGroupDetail createFromParcel(Parcel parcel) {
				return new ChannelGroupDetail(parcel);
			}
			@Override
			public ChannelGroupDetail[] newArray(int n) {
				return new ChannelGroupDetail[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}

		/**
		 * API Name: <tt>channeltype</tt>
		 */
		public interface Channeltype {

			public final String TV = "tv";
			public final String RADIO = "radio";

			public final static Set<String> values = new HashSet<String>(Arrays.asList(TV, RADIO));
		}
	}

	/**
	 * API Name: <tt>PVR.Details.ChannelGroup.Extended</tt>
	 * <p/>
	 * Note: This class is used as result only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class ChannelGroupExtendedDetail extends ChannelGroupDetail {
		public final static String API_TYPE = "PVR.Details.ChannelGroup.Extended";

		// field names
		public static final String CHANNELS = "channels";
		public static final String LIMITS = "limits";

		// class members
		public final List<ChannelDetail> channels;
		public final ListModel.LimitsReturned limits;

		/**
		 * Construct from JSON object.
		 * @param node JSON object representing a ChannelGroupExtendedDetail object
		 */
		public ChannelGroupExtendedDetail(JsonNode node) {
			super(node);
			channels = ChannelDetail.getPVRModelChannelDetailList(node, CHANNELS);
			limits = node.has(LIMITS) ? new ListModel.LimitsReturned(node.get(LIMITS)) : null;
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = (ObjectNode)super.toJsonNode();
			final ArrayNode channelsArray = OM.createArrayNode();
			for (ChannelDetail item : channels) {
				channelsArray.add(item.toJsonNode());
			}
			node.put(CHANNELS, channelsArray);
			node.put(LIMITS, limits.toJsonNode());
			return node;
		}

		/**
		 * Extracts a list of {@link ChannelGroupExtendedDetail} objects from a JSON array.
		 * @param node ObjectNode containing the list of objects.
		 * @param key Key pointing to the node where the list is stored.
		 */
		static List<ChannelGroupExtendedDetail> getPVRModelChannelGroupExtendedDetailList(JsonNode node, String key) {
			if (node.has(key)) {
				final ArrayNode a = (ArrayNode)node.get(key);
				final List<ChannelGroupExtendedDetail> l = new ArrayList<ChannelGroupExtendedDetail>(a.size());
				for (int i = 0; i < a.size(); i++) {
					l.add(new ChannelGroupExtendedDetail((JsonNode)a.get(i)));
				}
				return l;
			}
			return new ArrayList<ChannelGroupExtendedDetail>(0);
		}

		/**
		 * Flatten this object into a Parcel.
		 * @param parcel the Parcel in which the object should be written.
		 * @param flags additional flags about how the object should be written.
		 */
		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeInt(channels.size());
			for (ChannelDetail item : channels) {
				parcel.writeParcelable(item, flags);
			}
			parcel.writeValue(limits);
		}

		/**
		 * Construct via parcel.
		 */
		protected ChannelGroupExtendedDetail(Parcel parcel) {
			super(parcel);
			final int channelsSize = parcel.readInt();
			channels = new ArrayList<ChannelDetail>(channelsSize);
			for (int i = 0; i < channelsSize; i++) {
				channels.add(parcel.<ChannelDetail>readParcelable(ChannelDetail.class.getClassLoader()));
			}
			limits = parcel.<ListModel.LimitsReturned>readParcelable(ListModel.LimitsReturned.class.getClassLoader());
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<ChannelGroupExtendedDetail> CREATOR = new Parcelable.Creator<ChannelGroupExtendedDetail>() {
			@Override
			public ChannelGroupExtendedDetail createFromParcel(Parcel parcel) {
				return new ChannelGroupExtendedDetail(parcel);
			}
			@Override
			public ChannelGroupExtendedDetail[] newArray(int n) {
				return new ChannelGroupExtendedDetail[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}
	}

	/**
	 * API Name: <tt>PVR.Property.Value</tt>
	 * <p/>
	 * Note: This class is used as result only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class PropertyValue extends AbstractModel {
		public final static String API_TYPE = "PVR.Property.Value";

		// field names
		public static final String AVAILABLE = "available";
		public static final String RECORDING = "recording";
		public static final String SCANNING = "scanning";

		// class members
		public final Boolean available;
		public final Boolean recording;
		public final Boolean scanning;

		/**
		 * @param available
		 * @param recording
		 * @param scanning
		 */
		public PropertyValue(Boolean available, Boolean recording, Boolean scanning) {
			this.available = available;
			this.recording = recording;
			this.scanning = scanning;
		}

		/**
		 * Construct from JSON object.
		 * @param node JSON object representing a PropertyValue object
		 */
		public PropertyValue(JsonNode node) {
			available = parseBoolean(node, AVAILABLE);
			recording = parseBoolean(node, RECORDING);
			scanning = parseBoolean(node, SCANNING);
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = OM.createObjectNode();
			node.put(AVAILABLE, available);
			node.put(RECORDING, recording);
			node.put(SCANNING, scanning);
			return node;
		}

		/**
		 * Extracts a list of {@link PropertyValue} objects from a JSON array.
		 * @param node ObjectNode containing the list of objects.
		 * @param key Key pointing to the node where the list is stored.
		 */
		static List<PropertyValue> getPVRModelPropertyValueList(JsonNode node, String key) {
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
			parcel.writeInt(available ? 1 : 0);
			parcel.writeInt(recording ? 1 : 0);
			parcel.writeInt(scanning ? 1 : 0);
		}

		/**
		 * Construct via parcel.
		 */
		protected PropertyValue(Parcel parcel) {
			available = parcel.readInt() == 1;
			recording = parcel.readInt() == 1;
			scanning = parcel.readInt() == 1;
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
	}

	/**
	 * API Name: <tt>PVR.Channel.Type</tt>
	 */
	public interface ChannelType {

		public final String TV = "tv";
		public final String RADIO = "radio";

		public final static Set<String> values = new HashSet<String>(Arrays.asList(TV, RADIO));
	}

	/**
	 * API Name: <tt>PVR.Fields.Channel</tt>
	 */
	public interface ChannelFields {

		public final String THUMBNAIL = "thumbnail";
		public final String CHANNELTYPE = "channeltype";
		public final String HIDDEN = "hidden";
		public final String LOCKED = "locked";
		public final String CHANNEL = "channel";
		public final String LASTPLAYED = "lastplayed";

		public final static Set<String> values = new HashSet<String>(Arrays.asList(THUMBNAIL, CHANNELTYPE, HIDDEN, LOCKED, CHANNEL, LASTPLAYED));
	}

	/**
	 * API Name: <tt>PVR.Property.Name</tt>
	 */
	public interface PropertyName {

		public final String AVAILABLE = "available";
		public final String RECORDING = "recording";
		public final String SCANNING = "scanning";

		public final static Set<String> values = new HashSet<String>(Arrays.asList(AVAILABLE, RECORDING, SCANNING));
	}
}
