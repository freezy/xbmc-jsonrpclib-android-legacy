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

public final class SystemModel {

	/**
	 * API Name: <tt>System.Property.Value</tt>
	 * <p/>
	 * Note: This class is used as result only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class PropertyValue extends AbstractModel {
		public final static String API_TYPE = "System.Property.Value";

		// field names
		public static final String CANHIBERNATE = "canhibernate";
		public static final String CANREBOOT = "canreboot";
		public static final String CANSHUTDOWN = "canshutdown";
		public static final String CANSUSPEND = "cansuspend";

		// class members
		public final Boolean canhibernate;
		public final Boolean canreboot;
		public final Boolean canshutdown;
		public final Boolean cansuspend;

		/**
		 * @param canhibernate
		 * @param canreboot
		 * @param canshutdown
		 * @param cansuspend
		 */
		public PropertyValue(Boolean canhibernate, Boolean canreboot, Boolean canshutdown, Boolean cansuspend) {
			this.canhibernate = canhibernate;
			this.canreboot = canreboot;
			this.canshutdown = canshutdown;
			this.cansuspend = cansuspend;
		}

		/**
		 * Construct from JSON object.
		 * @param node JSON object representing a PropertyValue object
		 */
		public PropertyValue(JsonNode node) {
			canhibernate = parseBoolean(node, CANHIBERNATE);
			canreboot = parseBoolean(node, CANREBOOT);
			canshutdown = parseBoolean(node, CANSHUTDOWN);
			cansuspend = parseBoolean(node, CANSUSPEND);
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = OM.createObjectNode();
			node.put(CANHIBERNATE, canhibernate);
			node.put(CANREBOOT, canreboot);
			node.put(CANSHUTDOWN, canshutdown);
			node.put(CANSUSPEND, cansuspend);
			return node;
		}

		/**
		 * Extracts a list of {@link PropertyValue} objects from a JSON array.
		 * @param node ObjectNode containing the list of objects.
		 * @param key Key pointing to the node where the list is stored.
		 */
		static List<PropertyValue> getSystemModelPropertyValueList(JsonNode node, String key) {
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
			parcel.writeInt(canhibernate ? 1 : 0);
			parcel.writeInt(canreboot ? 1 : 0);
			parcel.writeInt(canshutdown ? 1 : 0);
			parcel.writeInt(cansuspend ? 1 : 0);
		}

		/**
		 * Construct via parcel.
		 */
		protected PropertyValue(Parcel parcel) {
			canhibernate = parcel.readInt() == 1;
			canreboot = parcel.readInt() == 1;
			canshutdown = parcel.readInt() == 1;
			cansuspend = parcel.readInt() == 1;
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
	 * API Name: <tt>System.Property.Name</tt>
	 */
	public interface PropertyName {

		public final String CANSHUTDOWN = "canshutdown";
		public final String CANSUSPEND = "cansuspend";
		public final String CANHIBERNATE = "canhibernate";
		public final String CANREBOOT = "canreboot";

		public final static Set<String> values = new HashSet<String>(Arrays.asList(CANSHUTDOWN, CANSUSPEND, CANHIBERNATE, CANREBOOT));
	}
}
