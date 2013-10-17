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
import org.xbmc.android.jsonrpc.api.model.FavouriteModel;

public final class Favourites {

	/**
	 * Add a favourite with the given details.
	 * <p/>
	 * This class represents the API method <tt>Favourites.AddFavourite</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class AddFavourite extends AbstractCall<String> {
		public final static String API_TYPE = "Favourites.AddFavourite";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected AddFavourite(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<AddFavourite> CREATOR = new Parcelable.Creator<AddFavourite>() {
			@Override
			public AddFavourite createFromParcel(Parcel parcel) {
				return new AddFavourite(parcel);
			}
			@Override
			public AddFavourite[] newArray(int n) {
				return new AddFavourite[n];
			}
		};

		/**
		 * Add a favourite with the given details.
		 * @param title 
		 * @param type  One of: <tt>media</tt>, <tt>window</tt>, <tt>script</tt>, <tt>unknown</tt>. See constants at {@link FavouriteModel.Type}.
		 * @param path Required for media and script favourites types.
		 * @param window Required for window favourite type.
		 * @param windowparameter 
		 * @param thumbnail 
		 */
		public AddFavourite(String title, String type, String path, String window, String windowparameter, String thumbnail) {
			super();
			addParameter("title", title);
			addParameter("type", type);
			addParameter("path", path);
			addParameter("window", window);
			addParameter("windowparameter", windowparameter);
			addParameter("thumbnail", thumbnail);
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
	 * Retrieve all favourites.
	 * <p/>
	 * This class represents the API method <tt>Favourites.GetFavourites</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class GetFavourites extends AbstractCall<FavouriteModel.FavouriteDetail> {
		public final static String API_TYPE = "Favourites.GetFavourites";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeParcelable(mResult, flags);
		}

		/**
		 * Construct via parcel.
		 */
		protected GetFavourites(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<GetFavourites> CREATOR = new Parcelable.Creator<GetFavourites>() {
			@Override
			public GetFavourites createFromParcel(Parcel parcel) {
				return new GetFavourites(parcel);
			}
			@Override
			public GetFavourites[] newArray(int n) {
				return new GetFavourites[n];
			}
		};
		public final static String RESULT = "favourites";

		/**
		 * Retrieve all favourites.
		 * @param type  One of: <tt>media</tt>, <tt>window</tt>, <tt>script</tt>, <tt>unknown</tt>. See constants at {@link FavouriteModel.Type}.
		 * @param properties  One or more of: <tt>window</tt>, <tt>windowparameter</tt>, <tt>thumbnail</tt>, <tt>path</tt>. See constants at {@link FavouriteModel.FavouriteFields}.
		 */
		public GetFavourites(String type, String... properties) {
			super();
			addParameter("type", type);
			addParameter("properties", properties);
		}

		@Override
		protected ArrayList<FavouriteModel.FavouriteDetail> parseMany(JsonNode node) {
			final ArrayNode favourites = parseResults(node, RESULT);
			if (favourites != null) {
				final ArrayList<FavouriteModel.FavouriteDetail> ret = new ArrayList<FavouriteModel.FavouriteDetail>(favourites.size());
				for (int i = 0; i < favourites.size(); i++) {
					final ObjectNode item = (ObjectNode)favourites.get(i);
					ret.add(new FavouriteModel.FavouriteDetail(item));
				}
				return ret;
			} else {
				return new ArrayList<FavouriteModel.FavouriteDetail>(0);
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
}
