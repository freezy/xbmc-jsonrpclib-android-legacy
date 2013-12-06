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

public final class ProfilesModel {

	/**
	 * API Name: <tt>Profiles.Details.Profile</tt>
	 * <p/>
	 * Note: This class is used as result only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class ProfileDetail extends ItemModel.BaseDetail {
		public final static String API_TYPE = "Profiles.Details.Profile";

		// field names
		public static final String LOCKMODE = "lockmode";
		public static final String THUMBNAIL = "thumbnail";

		// class members
		public final Integer lockmode;
		public final String thumbnail;

		/**
		 * Construct from JSON object.
		 * @param node JSON object representing a ProfileDetail object
		 */
		public ProfileDetail(JsonNode node) {
			super(node);
			lockmode = parseInt(node, LOCKMODE);
			thumbnail = parseString(node, THUMBNAIL);
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = (ObjectNode)super.toJsonNode();
			node.put(LOCKMODE, lockmode);
			node.put(THUMBNAIL, thumbnail);
			return node;
		}

		/**
		 * Extracts a list of {@link ProfileDetail} objects from a JSON array.
		 * @param node ObjectNode containing the list of objects.
		 * @param key Key pointing to the node where the list is stored.
		 */
		static List<ProfileDetail> getProfilesModelProfileDetailList(JsonNode node, String key) {
			if (node.has(key)) {
				final ArrayNode a = (ArrayNode)node.get(key);
				final List<ProfileDetail> l = new ArrayList<ProfileDetail>(a.size());
				for (int i = 0; i < a.size(); i++) {
					l.add(new ProfileDetail((JsonNode)a.get(i)));
				}
				return l;
			}
			return new ArrayList<ProfileDetail>(0);
		}

		/**
		 * Flatten this object into a Parcel.
		 * @param parcel the Parcel in which the object should be written.
		 * @param flags additional flags about how the object should be written.
		 */
		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(lockmode);
			parcel.writeValue(thumbnail);
		}

		/**
		 * Construct via parcel.
		 */
		protected ProfileDetail(Parcel parcel) {
			super(parcel);
			lockmode = parcel.readInt();
			thumbnail = parcel.readString();
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<ProfileDetail> CREATOR = new Parcelable.Creator<ProfileDetail>() {
			@Override
			public ProfileDetail createFromParcel(Parcel parcel) {
				return new ProfileDetail(parcel);
			}
			@Override
			public ProfileDetail[] newArray(int n) {
				return new ProfileDetail[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}
	}

	/**
	 * API Name: <tt>Profiles.Password</tt>
	 * <p/>
	 * Note: This class is used as parameter only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class Password extends AbstractModel {
		public final static String API_TYPE = "Profiles.Password";

		// field names
		public static final String ENCRYPTION = "encryption";
		public static final String VALUE = "value";

		// class members
		public final String encryption;
		public final String value;

		/**
		 * @param encryption One of: <tt>none</tt>, <tt>md5</tt>. See constants at {@link ProfilesModel.Password.Encryption}.
		 * @param value
		 */
		public Password(String encryption, String value) {
			this.encryption = encryption;
			this.value = value;
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = OM.createObjectNode();
			node.put(ENCRYPTION, encryption); // enum
			node.put(VALUE, value);
			return node;
		}

		/**
		 * Flatten this object into a Parcel.
		 * @param parcel the Parcel in which the object should be written.
		 * @param flags additional flags about how the object should be written.
		 */
		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			parcel.writeValue(encryption); // enum
			parcel.writeValue(value);
		}

		/**
		 * Construct via parcel.
		 */
		protected Password(Parcel parcel) {
			encryption = parcel.readString(); // enum
			value = parcel.readString();
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<Password> CREATOR = new Parcelable.Creator<Password>() {
			@Override
			public Password createFromParcel(Parcel parcel) {
				return new Password(parcel);
			}
			@Override
			public Password[] newArray(int n) {
				return new Password[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}

		/**
		 * API Name: <tt>encryption</tt>
		 */
		public interface Encryption {

			public final String NONE = "none";
			public final String MD5 = "md5";

			public final static Set<String> values = new HashSet<String>(Arrays.asList(NONE, MD5));
		}
	}

	/**
	 * API Name: <tt>Profiles.Fields.Profile</tt>
	 */
	public interface ProfileFields {

		public final String THUMBNAIL = "thumbnail";
		public final String LOCKMODE = "lockmode";

		public final static Set<String> values = new HashSet<String>(Arrays.asList(THUMBNAIL, LOCKMODE));
	}
}
