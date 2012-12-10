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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.ObjectNode;
import org.xbmc.android.jsonrpc.api.AbstractCall;
import org.xbmc.android.jsonrpc.api.AbstractModel;
import org.xbmc.android.jsonrpc.api.model.GlobalModel;
import org.xbmc.android.jsonrpc.api.model.ListModel;
import org.xbmc.android.jsonrpc.api.model.PVRModel;

public final class PVR {

	/**
	 * Retrieves the details of a specific channel.
	 * <p/>
	 * This class represents the API method <tt>PVR.GetChannelDetails</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class GetChannelDetails extends AbstractCall<PVRModel.ChannelDetail> {
		public final static String API_TYPE = "PVR.GetChannelDetails";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeParcelable(mResult, flags);
		}

		/**
		 * Construct via parcel.
		 */
		protected GetChannelDetails(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<GetChannelDetails> CREATOR = new Parcelable.Creator<GetChannelDetails>() {
			@Override
			public GetChannelDetails createFromParcel(Parcel parcel) {
				return new GetChannelDetails(parcel);
			}
			@Override
			public GetChannelDetails[] newArray(int n) {
				return new GetChannelDetails[n];
			}
		};
		public final static String RESULT = "channeldetails";

		/**
		 * Retrieves the details of a specific channel.
		 * @param channelid
		 * @param properties One or more of: <tt>thumbnail</tt>, <tt>channeltype</tt>, <tt>hidden</tt>, <tt>locked</tt>, <tt>channel</tt>, <tt>lastplayed</tt>. See constants at {@link PVRModel.ChannelFields}.
		 */
		public GetChannelDetails(Integer channelid, String... properties) {
			super();
			addParameter("channelid", channelid);
			addParameter("properties", properties);
		}

		@Override
		protected PVRModel.ChannelDetail parseOne(JsonNode node) {
			return new PVRModel.ChannelDetail((ObjectNode)node.get(RESULT));
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
	 * Retrieves the details of a specific channel group.
	 * <p/>
	 * This class represents the API method <tt>PVR.GetChannelGroupDetails</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class GetChannelGroupDetails extends AbstractCall<PVRModel.ChannelGroupExtendedDetail> {
		public final static String API_TYPE = "PVR.GetChannelGroupDetails";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeParcelable(mResult, flags);
		}

		/**
		 * Construct via parcel.
		 */
		protected GetChannelGroupDetails(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<GetChannelGroupDetails> CREATOR = new Parcelable.Creator<GetChannelGroupDetails>() {
			@Override
			public GetChannelGroupDetails createFromParcel(Parcel parcel) {
				return new GetChannelGroupDetails(parcel);
			}
			@Override
			public GetChannelGroupDetails[] newArray(int n) {
				return new GetChannelGroupDetails[n];
			}
		};
		public final static String RESULT = "channelgroupdetails";

		/**
		 * Retrieves the details of a specific channel group.
		 * @param channelgroupid
		 * @param channels
		 */
		public GetChannelGroupDetails(PVRModel.ChannelGroupId channelgroupid, Channel channels) {
			super();
			addParameter("channelgroupid", channelgroupid);
			addParameter("channels", channels);
		}

		/**
		 * Retrieves the details of a specific channel group.
		 * @param channelgroupid
		 */
		public GetChannelGroupDetails(PVRModel.ChannelGroupId channelgroupid) {
			super();
			addParameter("channelgroupid", channelgroupid);
		}

		@Override
		protected PVRModel.ChannelGroupExtendedDetail parseOne(JsonNode node) {
			return new PVRModel.ChannelGroupExtendedDetail((ObjectNode)node.get(RESULT));
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
		public static class Channel extends AbstractModel {

			// field names
			public static final String LIMITS = "limits";
			public static final String PROPERTIES = "properties";

			// class members
			public final ListModel.Limits limits;
			public final String properties;

			/**
			 * @param limits
			 * @param properties One or more of: <tt>thumbnail</tt>, <tt>channeltype</tt>, <tt>hidden</tt>, <tt>locked</tt>, <tt>channel</tt>, <tt>lastplayed</tt>. See constants at {@link PVR.Channel.Property}.
			 */
			public Channel(ListModel.Limits limits, String properties) {
				this.limits = limits;
				this.properties = properties;
			}

			@Override
			public JsonNode toJsonNode() {
				final ObjectNode node = OM.createObjectNode();
				node.put(LIMITS, limits.toJsonNode());
				node.put(PROPERTIES, properties); // enum
				return node;
			}

			/**
			 * Flatten this object into a Parcel.
			 * @param parcel the Parcel in which the object should be written.
			 * @param flags additional flags about how the object should be written.
			 */
			@Override
			public void writeToParcel(Parcel parcel, int flags) {
				parcel.writeValue(limits);
				parcel.writeValue(properties); // enum
			}

			/**
			 * Construct via parcel.
			 */
			protected Channel(Parcel parcel) {
				limits = parcel.<ListModel.Limits>readParcelable(ListModel.Limits.class.getClassLoader());
				properties = parcel.readString(); // enum
			}

			/**
			 * Generates instances of this Parcelable class from a Parcel.
			 */
			public static final Parcelable.Creator<Channel> CREATOR = new Parcelable.Creator<Channel>() {
				@Override
				public Channel createFromParcel(Parcel parcel) {
					return new Channel(parcel);
				}
				@Override
				public Channel[] newArray(int n) {
					return new Channel[n];
				}
			};

			@Override
			public int describeContents() {
				return 0;
			}

			/**
			 * API Name: <tt>properties</tt>
			 */
			public interface Property {

				public final String THUMBNAIL = "thumbnail";
				public final String CHANNELTYPE = "channeltype";
				public final String HIDDEN = "hidden";
				public final String LOCKED = "locked";
				public final String CHANNEL = "channel";
				public final String LASTPLAYED = "lastplayed";

				public final static Set<String> values = new HashSet<String>(Arrays.asList(THUMBNAIL, CHANNELTYPE, HIDDEN, LOCKED, CHANNEL, LASTPLAYED));
			}
		}
	}

	/**
	 * Retrieves the channel groups for the specified type.
	 * <p/>
	 * This class represents the API method <tt>PVR.GetChannelGroups</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class GetChannelGroups extends AbstractCall<PVRModel.ChannelGroupDetail> {
		public final static String API_TYPE = "PVR.GetChannelGroups";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeParcelable(mResult, flags);
		}

		/**
		 * Construct via parcel.
		 */
		protected GetChannelGroups(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<GetChannelGroups> CREATOR = new Parcelable.Creator<GetChannelGroups>() {
			@Override
			public GetChannelGroups createFromParcel(Parcel parcel) {
				return new GetChannelGroups(parcel);
			}
			@Override
			public GetChannelGroups[] newArray(int n) {
				return new GetChannelGroups[n];
			}
		};
		public final static String RESULT = "channelgroups";

		/**
		 * Retrieves the channel groups for the specified type.
		 * @param channeltype One of: <tt>tv</tt>, <tt>radio</tt>. See constants at {@link PVRModel.ChannelType}.
		 * @param limits
		 */
		public GetChannelGroups(String channeltype, ListModel.Limits limits) {
			super();
			addParameter("channeltype", channeltype);
			addParameter("limits", limits);
		}

		/**
		 * Retrieves the channel groups for the specified type.
		 * @param channeltype One of: <tt>tv</tt>, <tt>radio</tt>. See constants at {@link PVRModel.ChannelType}.
		 */
		public GetChannelGroups(String channeltype) {
			super();
			addParameter("channeltype", channeltype);
		}

		@Override
		protected ArrayList<PVRModel.ChannelGroupDetail> parseMany(JsonNode node) {
			final ArrayNode channelgroups = parseResults(node, RESULT);
			if (channelgroups != null) {
				final ArrayList<PVRModel.ChannelGroupDetail> ret = new ArrayList<PVRModel.ChannelGroupDetail>(channelgroups.size());
				for (int i = 0; i < channelgroups.size(); i++) {
					final ObjectNode item = (ObjectNode)channelgroups.get(i);
					ret.add(new PVRModel.ChannelGroupDetail(item));
				}
				return ret;
			} else {
				return new ArrayList<PVRModel.ChannelGroupDetail>(0);
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
	 * Retrieves the channel list.
	 * <p/>
	 * This class represents the API method <tt>PVR.GetChannels</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class GetChannels extends AbstractCall<PVRModel.ChannelDetail> {
		public final static String API_TYPE = "PVR.GetChannels";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeParcelable(mResult, flags);
		}

		/**
		 * Construct via parcel.
		 */
		protected GetChannels(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<GetChannels> CREATOR = new Parcelable.Creator<GetChannels>() {
			@Override
			public GetChannels createFromParcel(Parcel parcel) {
				return new GetChannels(parcel);
			}
			@Override
			public GetChannels[] newArray(int n) {
				return new GetChannels[n];
			}
		};
		public final static String RESULT = "channels";

		/**
		 * Retrieves the channel list.
		 * @param channelgroupid
		 * @param limits
		 * @param properties One or more of: <tt>thumbnail</tt>, <tt>channeltype</tt>, <tt>hidden</tt>, <tt>locked</tt>, <tt>channel</tt>, <tt>lastplayed</tt>. See constants at {@link PVRModel.ChannelFields}.
		 */
		public GetChannels(PVRModel.ChannelGroupId channelgroupid, ListModel.Limits limits, String... properties) {
			super();
			addParameter("channelgroupid", channelgroupid);
			addParameter("limits", limits);
			addParameter("properties", properties);
		}

		/**
		 * Retrieves the channel list.
		 * @param channelgroupid
		 * @param properties One or more of: <tt>thumbnail</tt>, <tt>channeltype</tt>, <tt>hidden</tt>, <tt>locked</tt>, <tt>channel</tt>, <tt>lastplayed</tt>. See constants at {@link PVRModel.ChannelFields}.
		 */
		public GetChannels(PVRModel.ChannelGroupId channelgroupid, String... properties) {
			super();
			addParameter("channelgroupid", channelgroupid);
			addParameter("properties", properties);
		}

		@Override
		protected ArrayList<PVRModel.ChannelDetail> parseMany(JsonNode node) {
			final ArrayNode channels = parseResults(node, RESULT);
			if (channels != null) {
				final ArrayList<PVRModel.ChannelDetail> ret = new ArrayList<PVRModel.ChannelDetail>(channels.size());
				for (int i = 0; i < channels.size(); i++) {
					final ObjectNode item = (ObjectNode)channels.get(i);
					ret.add(new PVRModel.ChannelDetail(item));
				}
				return ret;
			} else {
				return new ArrayList<PVRModel.ChannelDetail>(0);
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
	 * Retrieves the values of the given properties.
	 * <p/>
	 * This class represents the API method <tt>PVR.GetProperties</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class GetProperties extends AbstractCall<PVRModel.PropertyValue> {
		public final static String API_TYPE = "PVR.GetProperties";

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
		 * @param properties One or more of: <tt>available</tt>, <tt>recording</tt>, <tt>scanning</tt>. See constants at {@link PVRModel.PropertyName}.
		 */
		public GetProperties(String... properties) {
			super();
			addParameter("properties", properties);
		}

		@Override
		protected PVRModel.PropertyValue parseOne(JsonNode node) {
			return new PVRModel.PropertyValue(node);
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
	 * Toggle recording of a channel.
	 * <p/>
	 * This class represents the API method <tt>PVR.Record</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class Record extends AbstractCall<String> {
		public final static String API_TYPE = "PVR.Record";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected Record(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<Record> CREATOR = new Parcelable.Creator<Record>() {
			@Override
			public Record createFromParcel(Parcel parcel) {
				return new Record(parcel);
			}
			@Override
			public Record[] newArray(int n) {
				return new Record[n];
			}
		};

		/**
		 * Toggle recording of a channel.
		 * @param record
		 * @param channel One of: <tt>current</tt>. See constants at {@link PVR.Record.Channel}.
		 */
		public Record(GlobalModel.Toggle record, String channel) {
			super();
			addParameter("record", record);
			addParameter("channel", channel);
		}

		/**
		 * Toggle recording of a channel.
		 * @param record
		 * @param channel
		 */
		public Record(GlobalModel.Toggle record, Integer channel) {
			super();
			addParameter("record", record);
			addParameter("channel", channel);
		}

		/**
		 * Toggle recording of a channel.
		 */
		public Record() {
			super();
		}

		/**
		 * Toggle recording of a channel.
		 * @param record
		 */
		public Record(GlobalModel.Toggle record) {
			super();
			addParameter("record", record);
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
		 * API Name: <tt>channel</tt>
		 */
		public interface Channel {

			public final String CURRENT = "current";

			public final static Set<String> values = new HashSet<String>(Arrays.asList(CURRENT));
		}
	}

	/**
	 * Starts a channel scan.
	 * <p/>
	 * This class represents the API method <tt>PVR.Scan</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class Scan extends AbstractCall<String> {
		public final static String API_TYPE = "PVR.Scan";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected Scan(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<Scan> CREATOR = new Parcelable.Creator<Scan>() {
			@Override
			public Scan createFromParcel(Parcel parcel) {
				return new Scan(parcel);
			}
			@Override
			public Scan[] newArray(int n) {
				return new Scan[n];
			}
		};

		/**
		 * Starts a channel scan.
		 */
		public Scan() {
			super();
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
