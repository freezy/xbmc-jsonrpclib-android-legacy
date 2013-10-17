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
import java.util.List;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.ObjectNode;
import org.xbmc.android.jsonrpc.api.AbstractModel;

public final class MediaModel {

	/**
	 * API Name: <tt>Media.Artwork</tt>
	 * <p/>
	 * Note: This class is used as parameter as well as result.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class Artwork extends AbstractModel {
		public final static String API_TYPE = "Media.Artwork";

		// field names
		public static final String BANNER = "banner";
		public static final String FANART = "fanart";
		public static final String POSTER = "poster";
		public static final String THUMB = "thumb";

		// class members
		public final String banner;
		public final String fanart;
		public final String poster;
		public final String thumb;

		/**
		 * @param banner
		 * @param fanart
		 * @param poster
		 * @param thumb
		 */
		public Artwork(String banner, String fanart, String poster, String thumb) {
			this.banner = banner;
			this.fanart = fanart;
			this.poster = poster;
			this.thumb = thumb;
		}

		/**
		 * Construct from JSON object.
		 * @param node JSON object representing a Artwork object
		 */
		public Artwork(JsonNode node) {
			banner = parseString(node, BANNER);
			fanart = parseString(node, FANART);
			poster = parseString(node, POSTER);
			thumb = parseString(node, THUMB);
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = OM.createObjectNode();
			node.put(BANNER, banner);
			node.put(FANART, fanart);
			node.put(POSTER, poster);
			node.put(THUMB, thumb);
			return node;
		}

		/**
		 * Extracts a list of {@link Artwork} objects from a JSON array.
		 * @param node ObjectNode containing the list of objects.
		 * @param key Key pointing to the node where the list is stored.
		 */
		static List<Artwork> getMediaModelArtworkList(JsonNode node, String key) {
			if (node.has(key)) {
				final ArrayNode a = (ArrayNode)node.get(key);
				final List<Artwork> l = new ArrayList<Artwork>(a.size());
				for (int i = 0; i < a.size(); i++) {
					l.add(new Artwork((JsonNode)a.get(i)));
				}
				return l;
			}
			return new ArrayList<Artwork>(0);
		}

		/**
		 * Flatten this object into a Parcel.
		 * @param parcel the Parcel in which the object should be written.
		 * @param flags additional flags about how the object should be written.
		 */
		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			parcel.writeValue(banner);
			parcel.writeValue(fanart);
			parcel.writeValue(poster);
			parcel.writeValue(thumb);
		}

		/**
		 * Construct via parcel.
		 */
		protected Artwork(Parcel parcel) {
			banner = parcel.readString();
			fanart = parcel.readString();
			poster = parcel.readString();
			thumb = parcel.readString();
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<Artwork> CREATOR = new Parcelable.Creator<Artwork>() {
			@Override
			public Artwork createFromParcel(Parcel parcel) {
				return new Artwork(parcel);
			}
			@Override
			public Artwork[] newArray(int n) {
				return new Artwork[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}
	}

	/**
	 * API Name: <tt>Media.Details.Base</tt>
	 * <p/>
	 * Note: This class is used as result only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class BaseDetail extends ItemModel.BaseDetail {
		public final static String API_TYPE = "Media.Details.Base";

		// field names
		public static final String FANART = "fanart";
		public static final String THUMBNAIL = "thumbnail";

		// class members
		public final String fanart;
		public final String thumbnail;

		/**
		 * Construct from JSON object.
		 * @param node JSON object representing a BaseDetail object
		 */
		public BaseDetail(JsonNode node) {
			super(node);
			fanart = parseString(node, FANART);
			thumbnail = parseString(node, THUMBNAIL);
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = (ObjectNode)super.toJsonNode();
			node.put(FANART, fanart);
			node.put(THUMBNAIL, thumbnail);
			return node;
		}

		/**
		 * Extracts a list of {@link BaseDetail} objects from a JSON array.
		 * @param node ObjectNode containing the list of objects.
		 * @param key Key pointing to the node where the list is stored.
		 */
		static List<BaseDetail> getMediaModelBaseDetailList(JsonNode node, String key) {
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
			parcel.writeValue(fanart);
			parcel.writeValue(thumbnail);
		}

		/**
		 * Construct via parcel.
		 */
		protected BaseDetail(Parcel parcel) {
			super(parcel);
			fanart = parcel.readString();
			thumbnail = parcel.readString();
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
}
