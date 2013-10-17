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

public final class FavouriteModel {

	/**
	 * API Name: <tt>Favourite.Details.Favourite</tt>
	 * <p/>
	 * Note: This class is used as result only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class FavouriteDetail extends AbstractModel {
		public final static String API_TYPE = "Favourite.Details.Favourite";

		// field names
		public static final String PATH = "path";
		public static final String THUMBNAIL = "thumbnail";
		public static final String TITLE = "title";
		public static final String TYPE = "type";
		public static final String WINDOW = "window";
		public static final String WINDOWPARAMETER = "windowparameter";

		// class members
		public final String path;
		public final String thumbnail;
		public final String title;
		public final String type;
		public final String window;
		public final String windowparameter;

		/**
		 * @param path
		 * @param thumbnail
		 * @param title
		 * @param type One of: <tt>media</tt>, <tt>window</tt>, <tt>script</tt>, <tt>unknown</tt>. See constants at {@link FavouriteModel.FavouriteDetail.Type}.
		 * @param window
		 * @param windowparameter
		 */
		public FavouriteDetail(String path, String thumbnail, String title, String type, String window, String windowparameter) {
			this.path = path;
			this.thumbnail = thumbnail;
			this.title = title;
			this.type = type;
			this.window = window;
			this.windowparameter = windowparameter;
		}

		/**
		 * Construct from JSON object.
		 * @param node JSON object representing a FavouriteDetail object
		 */
		public FavouriteDetail(JsonNode node) {
			path = parseString(node, PATH);
			thumbnail = parseString(node, THUMBNAIL);
			title = node.get(TITLE).getTextValue(); // required value
			type = parseString(node, TYPE);
			window = parseString(node, WINDOW);
			windowparameter = parseString(node, WINDOWPARAMETER);
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = OM.createObjectNode();
			node.put(PATH, path);
			node.put(THUMBNAIL, thumbnail);
			node.put(TITLE, title);
			node.put(TYPE, type); // enum
			node.put(WINDOW, window);
			node.put(WINDOWPARAMETER, windowparameter);
			return node;
		}

		/**
		 * Extracts a list of {@link FavouriteDetail} objects from a JSON array.
		 * @param node ObjectNode containing the list of objects.
		 * @param key Key pointing to the node where the list is stored.
		 */
		static List<FavouriteDetail> getFavouriteModelFavouriteDetailList(JsonNode node, String key) {
			if (node.has(key)) {
				final ArrayNode a = (ArrayNode)node.get(key);
				final List<FavouriteDetail> l = new ArrayList<FavouriteDetail>(a.size());
				for (int i = 0; i < a.size(); i++) {
					l.add(new FavouriteDetail((JsonNode)a.get(i)));
				}
				return l;
			}
			return new ArrayList<FavouriteDetail>(0);
		}

		/**
		 * Flatten this object into a Parcel.
		 * @param parcel the Parcel in which the object should be written.
		 * @param flags additional flags about how the object should be written.
		 */
		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			parcel.writeValue(path);
			parcel.writeValue(thumbnail);
			parcel.writeValue(title);
			parcel.writeValue(type); // enum
			parcel.writeValue(window);
			parcel.writeValue(windowparameter);
		}

		/**
		 * Construct via parcel.
		 */
		protected FavouriteDetail(Parcel parcel) {
			path = parcel.readString();
			thumbnail = parcel.readString();
			title = parcel.readString();
			type = parcel.readString(); // enum
			window = parcel.readString();
			windowparameter = parcel.readString();
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<FavouriteDetail> CREATOR = new Parcelable.Creator<FavouriteDetail>() {
			@Override
			public FavouriteDetail createFromParcel(Parcel parcel) {
				return new FavouriteDetail(parcel);
			}
			@Override
			public FavouriteDetail[] newArray(int n) {
				return new FavouriteDetail[n];
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

			public final String MEDIA = "media";
			public final String WINDOW = "window";
			public final String SCRIPT = "script";
			public final String UNKNOWN = "unknown";

			public final static Set<String> values = new HashSet<String>(Arrays.asList(MEDIA, WINDOW, SCRIPT, UNKNOWN));
		}
	}

	/**
	 * API Name: <tt>Favourite.Fields.Favourite</tt>
	 */
	public interface FavouriteFields {

		public final String WINDOW = "window";
		public final String WINDOWPARAMETER = "windowparameter";
		public final String THUMBNAIL = "thumbnail";
		public final String PATH = "path";

		public final static Set<String> values = new HashSet<String>(Arrays.asList(WINDOW, WINDOWPARAMETER, THUMBNAIL, PATH));
	}

	/**
	 * API Name: <tt>Favourite.Type</tt>
	 */
	public interface Type {

		public final String MEDIA = "media";
		public final String WINDOW = "window";
		public final String SCRIPT = "script";
		public final String UNKNOWN = "unknown";

		public final static Set<String> values = new HashSet<String>(Arrays.asList(MEDIA, WINDOW, SCRIPT, UNKNOWN));
	}
}
