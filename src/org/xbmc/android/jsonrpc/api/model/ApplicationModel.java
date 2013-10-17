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

public final class ApplicationModel {

	/**
	 * API Name: <tt>Application.Property.Value</tt>
	 * <p/>
	 * Note: This class is used as result only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class PropertyValue extends AbstractModel {
		public final static String API_TYPE = "Application.Property.Value";

		// field names
		public static final String MUTED = "muted";
		public static final String NAME = "name";
		public static final String VERSION = "version";
		public static final String VOLUME = "volume";

		// class members
		public final Boolean muted;
		public final String name;
		public final Version version;
		public final Integer volume;

		/**
		 * @param muted
		 * @param name
		 * @param version
		 * @param volume
		 */
		public PropertyValue(Boolean muted, String name, Version version, Integer volume) {
			this.muted = muted;
			this.name = name;
			this.version = version;
			this.volume = volume;
		}

		/**
		 * Construct from JSON object.
		 * @param node JSON object representing a PropertyValue object
		 */
		public PropertyValue(JsonNode node) {
			muted = parseBoolean(node, MUTED);
			name = parseString(node, NAME);
			version = node.has(VERSION) ? new Version(node.get(VERSION)) : null;
			volume = parseInt(node, VOLUME);
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = OM.createObjectNode();
			node.put(MUTED, muted);
			node.put(NAME, name);
			node.put(VERSION, version.toJsonNode());
			node.put(VOLUME, volume);
			return node;
		}

		/**
		 * Extracts a list of {@link PropertyValue} objects from a JSON array.
		 * @param node ObjectNode containing the list of objects.
		 * @param key Key pointing to the node where the list is stored.
		 */
		static List<PropertyValue> getApplicationModelPropertyValueList(JsonNode node, String key) {
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
			parcel.writeInt(muted ? 1 : 0);
			parcel.writeValue(name);
			parcel.writeValue(version);
			parcel.writeValue(volume);
		}

		/**
		 * Construct via parcel.
		 */
		protected PropertyValue(Parcel parcel) {
			muted = parcel.readInt() == 1;
			name = parcel.readString();
			version = parcel.<Version>readParcelable(Version.class.getClassLoader());
			volume = parcel.readInt();
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
		 * Note: This class is used as result only.<br/>
		 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
		 */
		public static class Version extends AbstractModel {

			// field names
			public static final String MAJOR = "major";
			public static final String MINOR = "minor";
			public static final String REVISION = "revision";
			public static final String TAG = "tag";

			// class members
			public final Integer major;
			public final Integer minor;
			public final Revision revision;
			public final String tag;

			/**
			 * @param major
			 * @param minor
			 * @param revision
			 * @param tag One of: <tt>prealpha</tt>, <tt>alpha</tt>, <tt>beta</tt>, <tt>releasecandidate</tt>, <tt>stable</tt>. See constants at {@link ApplicationModel.Version.Tag}.
			 */
			public Version(Integer major, Integer minor, Revision revision, String tag) {
				this.major = major;
				this.minor = minor;
				this.revision = revision;
				this.tag = tag;
			}

			/**
			 * Construct from JSON object.
			 * @param node JSON object representing a Version object
			 */
			public Version(JsonNode node) {
				major = node.get(MAJOR).getIntValue(); // required value
				minor = node.get(MINOR).getIntValue(); // required value
				revision = node.has(REVISION) ? new Revision(node.get(REVISION)) : null;
				tag = parseString(node, TAG);
			}

			@Override
			public JsonNode toJsonNode() {
				final ObjectNode node = OM.createObjectNode();
				node.put(MAJOR, major);
				node.put(MINOR, minor);
				node.put(REVISION, revision.toJsonNode());
				node.put(TAG, tag); // enum
				return node;
			}

			/**
			 * Extracts a list of {@link Version} objects from a JSON array.
			 * @param node ObjectNode containing the list of objects.
			 * @param key Key pointing to the node where the list is stored.
			 */
			static List<Version> getApplicationModelVersionList(JsonNode node, String key) {
				if (node.has(key)) {
					final ArrayNode a = (ArrayNode)node.get(key);
					final List<Version> l = new ArrayList<Version>(a.size());
					for (int i = 0; i < a.size(); i++) {
						l.add(new Version((JsonNode)a.get(i)));
					}
					return l;
				}
				return new ArrayList<Version>(0);
			}

			/**
			 * Flatten this object into a Parcel.
			 * @param parcel the Parcel in which the object should be written.
			 * @param flags additional flags about how the object should be written.
			 */
			@Override
			public void writeToParcel(Parcel parcel, int flags) {
				parcel.writeValue(major);
				parcel.writeValue(minor);
				parcel.writeValue(revision);
				parcel.writeValue(tag); // enum
			}

			/**
			 * Construct via parcel.
			 */
			protected Version(Parcel parcel) {
				major = parcel.readInt();
				minor = parcel.readInt();
				revision = parcel.<Revision>readParcelable(Revision.class.getClassLoader());
				tag = parcel.readString(); // enum
			}

			/**
			 * Generates instances of this Parcelable class from a Parcel.
			 */
			public static final Parcelable.Creator<Version> CREATOR = new Parcelable.Creator<Version>() {
				@Override
				public Version createFromParcel(Parcel parcel) {
					return new Version(parcel);
				}
				@Override
				public Version[] newArray(int n) {
					return new Version[n];
				}
			};

			@Override
			public int describeContents() {
				return 0;
			}

			/**
			 * Note: This class is used as result only.<br/>
			 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
			 */
			public static class Revision extends AbstractModel {

				// class members
				public final Integer integerArg;
				public final String stringArg;

				/**
				 * @param integerArg
				 */
				public Revision(Integer integerArg) {
					this.integerArg = integerArg;
					this.stringArg = null;
				}

				/**
				 * @param stringArg
				 */
				public Revision(String stringArg) {
					this.stringArg = stringArg;
					this.integerArg = null;
				}

				/**
				 * Construct from JSON object.
				 * @param node JSON object representing a Revision object
				 */
				public Revision(JsonNode node) {
					if (node.isInt()) {
						integerArg = node.getIntValue();
						stringArg = null;
					}
					else if (node.isTextual()) {
						stringArg = node.getTextValue();
						integerArg = null;
					}
					else {
						throw new RuntimeException("Weird type for \"revision\", I'm confused!");
					}
				}

				@Override
				public JsonNode toJsonNode() {
					if (integerArg != null) {
						return new IntNode(integerArg);
					}
					if (stringArg != null) {
						return new TextNode(stringArg);
					}
					return null; // this is completely excluded. theoretically.
				}

				/**
				 * Extracts a list of {@link Revision} objects from a JSON array.
				 * @param node ObjectNode containing the list of objects.
				 * @param key Key pointing to the node where the list is stored.
				 */
				static List<Revision> getApplicationModelRevisionList(JsonNode node, String key) {
					if (node.has(key)) {
						final ArrayNode a = (ArrayNode)node.get(key);
						final List<Revision> l = new ArrayList<Revision>(a.size());
						for (int i = 0; i < a.size(); i++) {
							l.add(new Revision((JsonNode)a.get(i)));
						}
						return l;
					}
					return new ArrayList<Revision>(0);
				}

				/**
				 * Flatten this object into a Parcel.
				 * @param parcel the Parcel in which the object should be written.
				 * @param flags additional flags about how the object should be written.
				 */
				@Override
				public void writeToParcel(Parcel parcel, int flags) {
					parcel.writeValue(integerArg);
					parcel.writeValue(stringArg);
				}

				/**
				 * Construct via parcel.
				 */
				protected Revision(Parcel parcel) {
					integerArg = parcel.readInt();
					stringArg = parcel.readString();
				}

				/**
				 * Generates instances of this Parcelable class from a Parcel.
				 */
				public static final Parcelable.Creator<Revision> CREATOR = new Parcelable.Creator<Revision>() {
					@Override
					public Revision createFromParcel(Parcel parcel) {
						return new Revision(parcel);
					}
					@Override
					public Revision[] newArray(int n) {
						return new Revision[n];
					}
				};

				@Override
				public int describeContents() {
					return 0;
				}
			}

			/**
			 * API Name: <tt>tag</tt>
			 */
			public interface Tag {

				public final String PREALPHA = "prealpha";
				public final String ALPHA = "alpha";
				public final String BETA = "beta";
				public final String RELEASECANDIDATE = "releasecandidate";
				public final String STABLE = "stable";

				public final static Set<String> values = new HashSet<String>(Arrays.asList(PREALPHA, ALPHA, BETA, RELEASECANDIDATE, STABLE));
			}
		}
	}

	/**
	 * API Name: <tt>Application.Property.Name</tt>
	 */
	public interface PropertyName {

		public final String VOLUME = "volume";
		public final String MUTED = "muted";
		public final String NAME = "name";
		public final String VERSION = "version";

		public final static Set<String> values = new HashSet<String>(Arrays.asList(VOLUME, MUTED, NAME, VERSION));
	}
}
