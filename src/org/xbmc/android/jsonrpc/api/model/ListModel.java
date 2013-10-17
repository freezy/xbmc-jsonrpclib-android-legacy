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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.ObjectNode;
import org.codehaus.jackson.node.TextNode;
import org.xbmc.android.jsonrpc.api.AbstractModel;

public final class ListModel {

	/**
	 * API Name: <tt>List.Filter.Albums</tt>
	 * <p/>
	 * Note: This class is used as parameter only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class AlbumFilter extends AbstractModel {
		public final static String API_TYPE = "List.Filter.Albums";

		// class members
		public final And and;
		public final AlbumFilterRule filterRuleAlbums;
		public final Or or;

		/**
		 * @param and
		 */
		public AlbumFilter(And and) {
			this.and = and;
			this.filterRuleAlbums = null;
			this.or = null;
		}

		/**
		 * @param filterRuleAlbums
		 */
		public AlbumFilter(AlbumFilterRule filterRuleAlbums) {
			this.filterRuleAlbums = filterRuleAlbums;
			this.and = null;
			this.or = null;
		}

		/**
		 * @param or
		 */
		public AlbumFilter(Or or) {
			this.or = or;
			this.and = null;
			this.filterRuleAlbums = null;
		}

		@Override
		public JsonNode toJsonNode() {
			if (and != null) {
				return and.toJsonNode();
			}
			if (filterRuleAlbums != null) {
				return filterRuleAlbums.toJsonNode();
			}
			if (or != null) {
				return or.toJsonNode();
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
			parcel.writeValue(and);
			parcel.writeValue(filterRuleAlbums);
			parcel.writeValue(or);
		}

		/**
		 * Construct via parcel.
		 */
		protected AlbumFilter(Parcel parcel) {
			and = parcel.<And>readParcelable(And.class.getClassLoader());
			filterRuleAlbums = parcel.<AlbumFilterRule>readParcelable(AlbumFilterRule.class.getClassLoader());
			or = parcel.<Or>readParcelable(Or.class.getClassLoader());
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<AlbumFilter> CREATOR = new Parcelable.Creator<AlbumFilter>() {
			@Override
			public AlbumFilter createFromParcel(Parcel parcel) {
				return new AlbumFilter(parcel);
			}
			@Override
			public AlbumFilter[] newArray(int n) {
				return new AlbumFilter[n];
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
		public static class And extends AbstractModel {

			// field names
			public static final String AND = "and";

			// class members
			public final List<AlbumFilter> and;

			/**
			 * @param and
			 */
			public And(List<AlbumFilter> and) {
				this.and = and;
			}

			@Override
			public JsonNode toJsonNode() {
				final ObjectNode node = OM.createObjectNode();
				final ArrayNode andArray = OM.createArrayNode();
				for (AlbumFilter item : and) {
					andArray.add(item.toJsonNode());
				}
				node.put(AND, andArray);
				return node;
			}

			/**
			 * Flatten this object into a Parcel.
			 * @param parcel the Parcel in which the object should be written.
			 * @param flags additional flags about how the object should be written.
			 */
			@Override
			public void writeToParcel(Parcel parcel, int flags) {
				parcel.writeInt(and.size());
				for (AlbumFilter item : and) {
					parcel.writeParcelable(item, flags);
				}
			}

			/**
			 * Construct via parcel.
			 */
			protected And(Parcel parcel) {
				final int andSize = parcel.readInt();
				and = new ArrayList<AlbumFilter>(andSize);
				for (int i = 0; i < andSize; i++) {
					and.add(parcel.<AlbumFilter>readParcelable(AlbumFilter.class.getClassLoader()));
				}
			}

			/**
			 * Generates instances of this Parcelable class from a Parcel.
			 */
			public static final Parcelable.Creator<And> CREATOR = new Parcelable.Creator<And>() {
				@Override
				public And createFromParcel(Parcel parcel) {
					return new And(parcel);
				}
				@Override
				public And[] newArray(int n) {
					return new And[n];
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
		public static class Or extends AbstractModel {

			// field names
			public static final String OR = "or";

			// class members
			public final List<AlbumFilter> or;

			/**
			 * @param or
			 */
			public Or(List<AlbumFilter> or) {
				this.or = or;
			}

			@Override
			public JsonNode toJsonNode() {
				final ObjectNode node = OM.createObjectNode();
				final ArrayNode orArray = OM.createArrayNode();
				for (AlbumFilter item : or) {
					orArray.add(item.toJsonNode());
				}
				node.put(OR, orArray);
				return node;
			}

			/**
			 * Flatten this object into a Parcel.
			 * @param parcel the Parcel in which the object should be written.
			 * @param flags additional flags about how the object should be written.
			 */
			@Override
			public void writeToParcel(Parcel parcel, int flags) {
				parcel.writeInt(or.size());
				for (AlbumFilter item : or) {
					parcel.writeParcelable(item, flags);
				}
			}

			/**
			 * Construct via parcel.
			 */
			protected Or(Parcel parcel) {
				final int orSize = parcel.readInt();
				or = new ArrayList<AlbumFilter>(orSize);
				for (int i = 0; i < orSize; i++) {
					or.add(parcel.<AlbumFilter>readParcelable(AlbumFilter.class.getClassLoader()));
				}
			}

			/**
			 * Generates instances of this Parcelable class from a Parcel.
			 */
			public static final Parcelable.Creator<Or> CREATOR = new Parcelable.Creator<Or>() {
				@Override
				public Or createFromParcel(Parcel parcel) {
					return new Or(parcel);
				}
				@Override
				public Or[] newArray(int n) {
					return new Or[n];
				}
			};

			@Override
			public int describeContents() {
				return 0;
			}
		}
	}

	/**
	 * API Name: <tt>List.Filter.Artists</tt>
	 * <p/>
	 * Note: This class is used as parameter only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class ArtistFilter extends AbstractModel {
		public final static String API_TYPE = "List.Filter.Artists";

		// class members
		public final And and;
		public final ArtistFilterRule filterRuleArtists;
		public final Or or;

		/**
		 * @param and
		 */
		public ArtistFilter(And and) {
			this.and = and;
			this.filterRuleArtists = null;
			this.or = null;
		}

		/**
		 * @param filterRuleArtists
		 */
		public ArtistFilter(ArtistFilterRule filterRuleArtists) {
			this.filterRuleArtists = filterRuleArtists;
			this.and = null;
			this.or = null;
		}

		/**
		 * @param or
		 */
		public ArtistFilter(Or or) {
			this.or = or;
			this.and = null;
			this.filterRuleArtists = null;
		}

		@Override
		public JsonNode toJsonNode() {
			if (and != null) {
				return and.toJsonNode();
			}
			if (filterRuleArtists != null) {
				return filterRuleArtists.toJsonNode();
			}
			if (or != null) {
				return or.toJsonNode();
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
			parcel.writeValue(and);
			parcel.writeValue(filterRuleArtists);
			parcel.writeValue(or);
		}

		/**
		 * Construct via parcel.
		 */
		protected ArtistFilter(Parcel parcel) {
			and = parcel.<And>readParcelable(And.class.getClassLoader());
			filterRuleArtists = parcel.<ArtistFilterRule>readParcelable(ArtistFilterRule.class.getClassLoader());
			or = parcel.<Or>readParcelable(Or.class.getClassLoader());
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<ArtistFilter> CREATOR = new Parcelable.Creator<ArtistFilter>() {
			@Override
			public ArtistFilter createFromParcel(Parcel parcel) {
				return new ArtistFilter(parcel);
			}
			@Override
			public ArtistFilter[] newArray(int n) {
				return new ArtistFilter[n];
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
		public static class And extends AbstractModel {

			// field names
			public static final String AND = "and";

			// class members
			public final List<ArtistFilter> and;

			/**
			 * @param and
			 */
			public And(List<ArtistFilter> and) {
				this.and = and;
			}

			@Override
			public JsonNode toJsonNode() {
				final ObjectNode node = OM.createObjectNode();
				final ArrayNode andArray = OM.createArrayNode();
				for (ArtistFilter item : and) {
					andArray.add(item.toJsonNode());
				}
				node.put(AND, andArray);
				return node;
			}

			/**
			 * Flatten this object into a Parcel.
			 * @param parcel the Parcel in which the object should be written.
			 * @param flags additional flags about how the object should be written.
			 */
			@Override
			public void writeToParcel(Parcel parcel, int flags) {
				parcel.writeInt(and.size());
				for (ArtistFilter item : and) {
					parcel.writeParcelable(item, flags);
				}
			}

			/**
			 * Construct via parcel.
			 */
			protected And(Parcel parcel) {
				final int andSize = parcel.readInt();
				and = new ArrayList<ArtistFilter>(andSize);
				for (int i = 0; i < andSize; i++) {
					and.add(parcel.<ArtistFilter>readParcelable(ArtistFilter.class.getClassLoader()));
				}
			}

			/**
			 * Generates instances of this Parcelable class from a Parcel.
			 */
			public static final Parcelable.Creator<And> CREATOR = new Parcelable.Creator<And>() {
				@Override
				public And createFromParcel(Parcel parcel) {
					return new And(parcel);
				}
				@Override
				public And[] newArray(int n) {
					return new And[n];
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
		public static class Or extends AbstractModel {

			// field names
			public static final String OR = "or";

			// class members
			public final List<ArtistFilter> or;

			/**
			 * @param or
			 */
			public Or(List<ArtistFilter> or) {
				this.or = or;
			}

			@Override
			public JsonNode toJsonNode() {
				final ObjectNode node = OM.createObjectNode();
				final ArrayNode orArray = OM.createArrayNode();
				for (ArtistFilter item : or) {
					orArray.add(item.toJsonNode());
				}
				node.put(OR, orArray);
				return node;
			}

			/**
			 * Flatten this object into a Parcel.
			 * @param parcel the Parcel in which the object should be written.
			 * @param flags additional flags about how the object should be written.
			 */
			@Override
			public void writeToParcel(Parcel parcel, int flags) {
				parcel.writeInt(or.size());
				for (ArtistFilter item : or) {
					parcel.writeParcelable(item, flags);
				}
			}

			/**
			 * Construct via parcel.
			 */
			protected Or(Parcel parcel) {
				final int orSize = parcel.readInt();
				or = new ArrayList<ArtistFilter>(orSize);
				for (int i = 0; i < orSize; i++) {
					or.add(parcel.<ArtistFilter>readParcelable(ArtistFilter.class.getClassLoader()));
				}
			}

			/**
			 * Generates instances of this Parcelable class from a Parcel.
			 */
			public static final Parcelable.Creator<Or> CREATOR = new Parcelable.Creator<Or>() {
				@Override
				public Or createFromParcel(Parcel parcel) {
					return new Or(parcel);
				}
				@Override
				public Or[] newArray(int n) {
					return new Or[n];
				}
			};

			@Override
			public int describeContents() {
				return 0;
			}
		}
	}

	/**
	 * API Name: <tt>List.Filter.Episodes</tt>
	 * <p/>
	 * Note: This class is used as parameter only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class EpisodeFilter extends AbstractModel {
		public final static String API_TYPE = "List.Filter.Episodes";

		// class members
		public final And and;
		public final EpisodeFilterRule filterRuleEpisodes;
		public final Or or;

		/**
		 * @param and
		 */
		public EpisodeFilter(And and) {
			this.and = and;
			this.filterRuleEpisodes = null;
			this.or = null;
		}

		/**
		 * @param filterRuleEpisodes
		 */
		public EpisodeFilter(EpisodeFilterRule filterRuleEpisodes) {
			this.filterRuleEpisodes = filterRuleEpisodes;
			this.and = null;
			this.or = null;
		}

		/**
		 * @param or
		 */
		public EpisodeFilter(Or or) {
			this.or = or;
			this.and = null;
			this.filterRuleEpisodes = null;
		}

		@Override
		public JsonNode toJsonNode() {
			if (and != null) {
				return and.toJsonNode();
			}
			if (filterRuleEpisodes != null) {
				return filterRuleEpisodes.toJsonNode();
			}
			if (or != null) {
				return or.toJsonNode();
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
			parcel.writeValue(and);
			parcel.writeValue(filterRuleEpisodes);
			parcel.writeValue(or);
		}

		/**
		 * Construct via parcel.
		 */
		protected EpisodeFilter(Parcel parcel) {
			and = parcel.<And>readParcelable(And.class.getClassLoader());
			filterRuleEpisodes = parcel.<EpisodeFilterRule>readParcelable(EpisodeFilterRule.class.getClassLoader());
			or = parcel.<Or>readParcelable(Or.class.getClassLoader());
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<EpisodeFilter> CREATOR = new Parcelable.Creator<EpisodeFilter>() {
			@Override
			public EpisodeFilter createFromParcel(Parcel parcel) {
				return new EpisodeFilter(parcel);
			}
			@Override
			public EpisodeFilter[] newArray(int n) {
				return new EpisodeFilter[n];
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
		public static class And extends AbstractModel {

			// field names
			public static final String AND = "and";

			// class members
			public final List<EpisodeFilter> and;

			/**
			 * @param and
			 */
			public And(List<EpisodeFilter> and) {
				this.and = and;
			}

			@Override
			public JsonNode toJsonNode() {
				final ObjectNode node = OM.createObjectNode();
				final ArrayNode andArray = OM.createArrayNode();
				for (EpisodeFilter item : and) {
					andArray.add(item.toJsonNode());
				}
				node.put(AND, andArray);
				return node;
			}

			/**
			 * Flatten this object into a Parcel.
			 * @param parcel the Parcel in which the object should be written.
			 * @param flags additional flags about how the object should be written.
			 */
			@Override
			public void writeToParcel(Parcel parcel, int flags) {
				parcel.writeInt(and.size());
				for (EpisodeFilter item : and) {
					parcel.writeParcelable(item, flags);
				}
			}

			/**
			 * Construct via parcel.
			 */
			protected And(Parcel parcel) {
				final int andSize = parcel.readInt();
				and = new ArrayList<EpisodeFilter>(andSize);
				for (int i = 0; i < andSize; i++) {
					and.add(parcel.<EpisodeFilter>readParcelable(EpisodeFilter.class.getClassLoader()));
				}
			}

			/**
			 * Generates instances of this Parcelable class from a Parcel.
			 */
			public static final Parcelable.Creator<And> CREATOR = new Parcelable.Creator<And>() {
				@Override
				public And createFromParcel(Parcel parcel) {
					return new And(parcel);
				}
				@Override
				public And[] newArray(int n) {
					return new And[n];
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
		public static class Or extends AbstractModel {

			// field names
			public static final String OR = "or";

			// class members
			public final List<EpisodeFilter> or;

			/**
			 * @param or
			 */
			public Or(List<EpisodeFilter> or) {
				this.or = or;
			}

			@Override
			public JsonNode toJsonNode() {
				final ObjectNode node = OM.createObjectNode();
				final ArrayNode orArray = OM.createArrayNode();
				for (EpisodeFilter item : or) {
					orArray.add(item.toJsonNode());
				}
				node.put(OR, orArray);
				return node;
			}

			/**
			 * Flatten this object into a Parcel.
			 * @param parcel the Parcel in which the object should be written.
			 * @param flags additional flags about how the object should be written.
			 */
			@Override
			public void writeToParcel(Parcel parcel, int flags) {
				parcel.writeInt(or.size());
				for (EpisodeFilter item : or) {
					parcel.writeParcelable(item, flags);
				}
			}

			/**
			 * Construct via parcel.
			 */
			protected Or(Parcel parcel) {
				final int orSize = parcel.readInt();
				or = new ArrayList<EpisodeFilter>(orSize);
				for (int i = 0; i < orSize; i++) {
					or.add(parcel.<EpisodeFilter>readParcelable(EpisodeFilter.class.getClassLoader()));
				}
			}

			/**
			 * Generates instances of this Parcelable class from a Parcel.
			 */
			public static final Parcelable.Creator<Or> CREATOR = new Parcelable.Creator<Or>() {
				@Override
				public Or createFromParcel(Parcel parcel) {
					return new Or(parcel);
				}
				@Override
				public Or[] newArray(int n) {
					return new Or[n];
				}
			};

			@Override
			public int describeContents() {
				return 0;
			}
		}
	}

	/**
	 * API Name: <tt>List.Filter.Movies</tt>
	 * <p/>
	 * Note: This class is used as parameter only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class MovieFilter extends AbstractModel {
		public final static String API_TYPE = "List.Filter.Movies";

		// class members
		public final And and;
		public final MovieFilterRule filterRuleMovies;
		public final Or or;

		/**
		 * @param and
		 */
		public MovieFilter(And and) {
			this.and = and;
			this.filterRuleMovies = null;
			this.or = null;
		}

		/**
		 * @param filterRuleMovies
		 */
		public MovieFilter(MovieFilterRule filterRuleMovies) {
			this.filterRuleMovies = filterRuleMovies;
			this.and = null;
			this.or = null;
		}

		/**
		 * @param or
		 */
		public MovieFilter(Or or) {
			this.or = or;
			this.and = null;
			this.filterRuleMovies = null;
		}

		@Override
		public JsonNode toJsonNode() {
			if (and != null) {
				return and.toJsonNode();
			}
			if (filterRuleMovies != null) {
				return filterRuleMovies.toJsonNode();
			}
			if (or != null) {
				return or.toJsonNode();
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
			parcel.writeValue(and);
			parcel.writeValue(filterRuleMovies);
			parcel.writeValue(or);
		}

		/**
		 * Construct via parcel.
		 */
		protected MovieFilter(Parcel parcel) {
			and = parcel.<And>readParcelable(And.class.getClassLoader());
			filterRuleMovies = parcel.<MovieFilterRule>readParcelable(MovieFilterRule.class.getClassLoader());
			or = parcel.<Or>readParcelable(Or.class.getClassLoader());
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<MovieFilter> CREATOR = new Parcelable.Creator<MovieFilter>() {
			@Override
			public MovieFilter createFromParcel(Parcel parcel) {
				return new MovieFilter(parcel);
			}
			@Override
			public MovieFilter[] newArray(int n) {
				return new MovieFilter[n];
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
		public static class And extends AbstractModel {

			// field names
			public static final String AND = "and";

			// class members
			public final List<MovieFilter> and;

			/**
			 * @param and
			 */
			public And(List<MovieFilter> and) {
				this.and = and;
			}

			@Override
			public JsonNode toJsonNode() {
				final ObjectNode node = OM.createObjectNode();
				final ArrayNode andArray = OM.createArrayNode();
				for (MovieFilter item : and) {
					andArray.add(item.toJsonNode());
				}
				node.put(AND, andArray);
				return node;
			}

			/**
			 * Flatten this object into a Parcel.
			 * @param parcel the Parcel in which the object should be written.
			 * @param flags additional flags about how the object should be written.
			 */
			@Override
			public void writeToParcel(Parcel parcel, int flags) {
				parcel.writeInt(and.size());
				for (MovieFilter item : and) {
					parcel.writeParcelable(item, flags);
				}
			}

			/**
			 * Construct via parcel.
			 */
			protected And(Parcel parcel) {
				final int andSize = parcel.readInt();
				and = new ArrayList<MovieFilter>(andSize);
				for (int i = 0; i < andSize; i++) {
					and.add(parcel.<MovieFilter>readParcelable(MovieFilter.class.getClassLoader()));
				}
			}

			/**
			 * Generates instances of this Parcelable class from a Parcel.
			 */
			public static final Parcelable.Creator<And> CREATOR = new Parcelable.Creator<And>() {
				@Override
				public And createFromParcel(Parcel parcel) {
					return new And(parcel);
				}
				@Override
				public And[] newArray(int n) {
					return new And[n];
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
		public static class Or extends AbstractModel {

			// field names
			public static final String OR = "or";

			// class members
			public final List<MovieFilter> or;

			/**
			 * @param or
			 */
			public Or(List<MovieFilter> or) {
				this.or = or;
			}

			@Override
			public JsonNode toJsonNode() {
				final ObjectNode node = OM.createObjectNode();
				final ArrayNode orArray = OM.createArrayNode();
				for (MovieFilter item : or) {
					orArray.add(item.toJsonNode());
				}
				node.put(OR, orArray);
				return node;
			}

			/**
			 * Flatten this object into a Parcel.
			 * @param parcel the Parcel in which the object should be written.
			 * @param flags additional flags about how the object should be written.
			 */
			@Override
			public void writeToParcel(Parcel parcel, int flags) {
				parcel.writeInt(or.size());
				for (MovieFilter item : or) {
					parcel.writeParcelable(item, flags);
				}
			}

			/**
			 * Construct via parcel.
			 */
			protected Or(Parcel parcel) {
				final int orSize = parcel.readInt();
				or = new ArrayList<MovieFilter>(orSize);
				for (int i = 0; i < orSize; i++) {
					or.add(parcel.<MovieFilter>readParcelable(MovieFilter.class.getClassLoader()));
				}
			}

			/**
			 * Generates instances of this Parcelable class from a Parcel.
			 */
			public static final Parcelable.Creator<Or> CREATOR = new Parcelable.Creator<Or>() {
				@Override
				public Or createFromParcel(Parcel parcel) {
					return new Or(parcel);
				}
				@Override
				public Or[] newArray(int n) {
					return new Or[n];
				}
			};

			@Override
			public int describeContents() {
				return 0;
			}
		}
	}

	/**
	 * API Name: <tt>List.Filter.MusicVideos</tt>
	 * <p/>
	 * Note: This class is used as parameter only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class MusicVideoFilter extends AbstractModel {
		public final static String API_TYPE = "List.Filter.MusicVideos";

		// class members
		public final And and;
		public final MusicVideoFilterRule filterRuleMusicVideos;
		public final Or or;

		/**
		 * @param and
		 */
		public MusicVideoFilter(And and) {
			this.and = and;
			this.filterRuleMusicVideos = null;
			this.or = null;
		}

		/**
		 * @param filterRuleMusicVideos
		 */
		public MusicVideoFilter(MusicVideoFilterRule filterRuleMusicVideos) {
			this.filterRuleMusicVideos = filterRuleMusicVideos;
			this.and = null;
			this.or = null;
		}

		/**
		 * @param or
		 */
		public MusicVideoFilter(Or or) {
			this.or = or;
			this.and = null;
			this.filterRuleMusicVideos = null;
		}

		@Override
		public JsonNode toJsonNode() {
			if (and != null) {
				return and.toJsonNode();
			}
			if (filterRuleMusicVideos != null) {
				return filterRuleMusicVideos.toJsonNode();
			}
			if (or != null) {
				return or.toJsonNode();
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
			parcel.writeValue(and);
			parcel.writeValue(filterRuleMusicVideos);
			parcel.writeValue(or);
		}

		/**
		 * Construct via parcel.
		 */
		protected MusicVideoFilter(Parcel parcel) {
			and = parcel.<And>readParcelable(And.class.getClassLoader());
			filterRuleMusicVideos = parcel.<MusicVideoFilterRule>readParcelable(MusicVideoFilterRule.class.getClassLoader());
			or = parcel.<Or>readParcelable(Or.class.getClassLoader());
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<MusicVideoFilter> CREATOR = new Parcelable.Creator<MusicVideoFilter>() {
			@Override
			public MusicVideoFilter createFromParcel(Parcel parcel) {
				return new MusicVideoFilter(parcel);
			}
			@Override
			public MusicVideoFilter[] newArray(int n) {
				return new MusicVideoFilter[n];
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
		public static class And extends AbstractModel {

			// field names
			public static final String AND = "and";

			// class members
			public final List<MusicVideoFilter> and;

			/**
			 * @param and
			 */
			public And(List<MusicVideoFilter> and) {
				this.and = and;
			}

			@Override
			public JsonNode toJsonNode() {
				final ObjectNode node = OM.createObjectNode();
				final ArrayNode andArray = OM.createArrayNode();
				for (MusicVideoFilter item : and) {
					andArray.add(item.toJsonNode());
				}
				node.put(AND, andArray);
				return node;
			}

			/**
			 * Flatten this object into a Parcel.
			 * @param parcel the Parcel in which the object should be written.
			 * @param flags additional flags about how the object should be written.
			 */
			@Override
			public void writeToParcel(Parcel parcel, int flags) {
				parcel.writeInt(and.size());
				for (MusicVideoFilter item : and) {
					parcel.writeParcelable(item, flags);
				}
			}

			/**
			 * Construct via parcel.
			 */
			protected And(Parcel parcel) {
				final int andSize = parcel.readInt();
				and = new ArrayList<MusicVideoFilter>(andSize);
				for (int i = 0; i < andSize; i++) {
					and.add(parcel.<MusicVideoFilter>readParcelable(MusicVideoFilter.class.getClassLoader()));
				}
			}

			/**
			 * Generates instances of this Parcelable class from a Parcel.
			 */
			public static final Parcelable.Creator<And> CREATOR = new Parcelable.Creator<And>() {
				@Override
				public And createFromParcel(Parcel parcel) {
					return new And(parcel);
				}
				@Override
				public And[] newArray(int n) {
					return new And[n];
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
		public static class Or extends AbstractModel {

			// field names
			public static final String OR = "or";

			// class members
			public final List<MusicVideoFilter> or;

			/**
			 * @param or
			 */
			public Or(List<MusicVideoFilter> or) {
				this.or = or;
			}

			@Override
			public JsonNode toJsonNode() {
				final ObjectNode node = OM.createObjectNode();
				final ArrayNode orArray = OM.createArrayNode();
				for (MusicVideoFilter item : or) {
					orArray.add(item.toJsonNode());
				}
				node.put(OR, orArray);
				return node;
			}

			/**
			 * Flatten this object into a Parcel.
			 * @param parcel the Parcel in which the object should be written.
			 * @param flags additional flags about how the object should be written.
			 */
			@Override
			public void writeToParcel(Parcel parcel, int flags) {
				parcel.writeInt(or.size());
				for (MusicVideoFilter item : or) {
					parcel.writeParcelable(item, flags);
				}
			}

			/**
			 * Construct via parcel.
			 */
			protected Or(Parcel parcel) {
				final int orSize = parcel.readInt();
				or = new ArrayList<MusicVideoFilter>(orSize);
				for (int i = 0; i < orSize; i++) {
					or.add(parcel.<MusicVideoFilter>readParcelable(MusicVideoFilter.class.getClassLoader()));
				}
			}

			/**
			 * Generates instances of this Parcelable class from a Parcel.
			 */
			public static final Parcelable.Creator<Or> CREATOR = new Parcelable.Creator<Or>() {
				@Override
				public Or createFromParcel(Parcel parcel) {
					return new Or(parcel);
				}
				@Override
				public Or[] newArray(int n) {
					return new Or[n];
				}
			};

			@Override
			public int describeContents() {
				return 0;
			}
		}
	}

	/**
	 * API Name: <tt>List.Filter.Rule</tt>
	 * <p/>
	 * Note: This class is used as parameter only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class FilterRule extends AbstractModel {
		public final static String API_TYPE = "List.Filter.Rule";

		// field names
		public static final String OPERATOR = "operator";
		public static final String VALUE = "value";

		// class members
		public final String operator;
		public final Value value;

		/**
		 * @param operator One of: <tt>contains</tt>, <tt>doesnotcontain</tt>, <tt>is</tt>, <tt>isnot</tt>, <tt>startswith</tt>, <tt>endswith</tt>, <tt>greaterthan</tt>, <tt>lessthan</tt>, <tt>after</tt>, <tt>before</tt>, <tt>inthelast</tt>, <tt>notinthelast</tt>, <tt>true</tt>, <tt>false</tt>, <tt>between</tt>. See constants at {@link ListModel.FilterRule.Operator}.
		 * @param value
		 */
		public FilterRule(String operator, Value value) {
			this.operator = operator;
			this.value = value;
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = OM.createObjectNode();
			node.put(OPERATOR, operator); // enum
			node.put(VALUE, value.toJsonNode());
			return node;
		}

		/**
		 * Flatten this object into a Parcel.
		 * @param parcel the Parcel in which the object should be written.
		 * @param flags additional flags about how the object should be written.
		 */
		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			parcel.writeValue(operator); // enum
			parcel.writeValue(value);
		}

		/**
		 * Construct via parcel.
		 */
		protected FilterRule(Parcel parcel) {
			operator = parcel.readString(); // enum
			value = parcel.<Value>readParcelable(Value.class.getClassLoader());
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<FilterRule> CREATOR = new Parcelable.Creator<FilterRule>() {
			@Override
			public FilterRule createFromParcel(Parcel parcel) {
				return new FilterRule(parcel);
			}
			@Override
			public FilterRule[] newArray(int n) {
				return new FilterRule[n];
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
		public static class Value extends AbstractModel {

			// class members
			public final String stringArg;
			public final List<String> stringArgList;

			/**
			 * @param stringArg
			 */
			public Value(String stringArg) {
				this.stringArg = stringArg;
				this.stringArgList = null;
			}

			/**
			 * @param stringArgList
			 */
			public Value(List<String> stringArgList) {
				this.stringArgList = stringArgList;
				this.stringArg = null;
			}

			@Override
			public JsonNode toJsonNode() {
				if (stringArg != null) {
					return new TextNode(stringArg);
				}
				if (stringArgList != null) {
					final ArrayNode an = OM.createArrayNode();
					for (String item : stringArgList) {
						an.add(item);
					};
					return an;
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
				parcel.writeValue(stringArg);
				parcel.writeInt(stringArgList.size());
				for (String item : stringArgList) {
					parcel.writeValue(item);
				}
			}

			/**
			 * Construct via parcel.
			 */
			protected Value(Parcel parcel) {
				stringArg = parcel.readString();
				final int stringArgListSize = parcel.readInt();
				stringArgList = new ArrayList<String>(stringArgListSize);
				for (int i = 0; i < stringArgListSize; i++) {
					stringArgList.add(parcel.readString());
				}
			}

			/**
			 * Generates instances of this Parcelable class from a Parcel.
			 */
			public static final Parcelable.Creator<Value> CREATOR = new Parcelable.Creator<Value>() {
				@Override
				public Value createFromParcel(Parcel parcel) {
					return new Value(parcel);
				}
				@Override
				public Value[] newArray(int n) {
					return new Value[n];
				}
			};

			@Override
			public int describeContents() {
				return 0;
			}
		}

		/**
		 * API Name: <tt>operator</tt>
		 */
		public interface Operator {

			public final String CONTAINS = "contains";
			public final String DOESNOTCONTAIN = "doesnotcontain";
			public final String IS = "is";
			public final String ISNOT = "isnot";
			public final String STARTSWITH = "startswith";
			public final String ENDSWITH = "endswith";
			public final String GREATERTHAN = "greaterthan";
			public final String LESSTHAN = "lessthan";
			public final String AFTER = "after";
			public final String BEFORE = "before";
			public final String INTHELAST = "inthelast";
			public final String NOTINTHELAST = "notinthelast";
			public final String TRUE = "true";
			public final String FALSE = "false";
			public final String BETWEEN = "between";

			public final static Set<String> values = new HashSet<String>(Arrays.asList(CONTAINS, DOESNOTCONTAIN, IS, ISNOT, STARTSWITH, ENDSWITH, GREATERTHAN, LESSTHAN, AFTER, BEFORE, INTHELAST, NOTINTHELAST, TRUE, FALSE, BETWEEN));
		}
	}

	/**
	 * API Name: <tt>List.Filter.Rule.Albums</tt>
	 * <p/>
	 * Note: This class is used as parameter only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class AlbumFilterRule extends FilterRule {
		public final static String API_TYPE = "List.Filter.Rule.Albums";

		// field names
		public static final String FIELD = "field";

		// class members
		public final String field;

		/**
		 * @param operator One of: <tt>contains</tt>, <tt>doesnotcontain</tt>, <tt>is</tt>, <tt>isnot</tt>, <tt>startswith</tt>, <tt>endswith</tt>, <tt>greaterthan</tt>, <tt>lessthan</tt>, <tt>after</tt>, <tt>before</tt>, <tt>inthelast</tt>, <tt>notinthelast</tt>, <tt>true</tt>, <tt>false</tt>, <tt>between</tt>. See constants at {@link ListModel.FilterRule.Operator}.
		 * @param value
		 * @param field One of: <tt>genre</tt>, <tt>album</tt>, <tt>artist</tt>, <tt>albumartist</tt>, <tt>year</tt>, <tt>review</tt>, <tt>themes</tt>, <tt>moods</tt>, <tt>styles</tt>, <tt>type</tt>, <tt>label</tt>, <tt>rating</tt>, <tt>playcount</tt>, <tt>playlist</tt>, <tt>virtualfolder</tt>. See constants at {@link ListModel.AlbumFilterRule.Field}.
		 */
		public AlbumFilterRule(String operator, Value value, String field) {
			super(operator, value);
			this.field = field;
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = (ObjectNode)super.toJsonNode();
			node.put(FIELD, field); // enum
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
			parcel.writeValue(field); // enum
		}

		/**
		 * Construct via parcel.
		 */
		protected AlbumFilterRule(Parcel parcel) {
			super(parcel);
			field = parcel.readString(); // enum
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<AlbumFilterRule> CREATOR = new Parcelable.Creator<AlbumFilterRule>() {
			@Override
			public AlbumFilterRule createFromParcel(Parcel parcel) {
				return new AlbumFilterRule(parcel);
			}
			@Override
			public AlbumFilterRule[] newArray(int n) {
				return new AlbumFilterRule[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}

		/**
		 * API Name: <tt>field</tt>
		 */
		public interface Field {

			public final String GENRE = "genre";
			public final String ALBUM = "album";
			public final String ARTIST = "artist";
			public final String ALBUMARTIST = "albumartist";
			public final String YEAR = "year";
			public final String REVIEW = "review";
			public final String THEMES = "themes";
			public final String MOODS = "moods";
			public final String STYLES = "styles";
			public final String TYPE = "type";
			public final String LABEL = "label";
			public final String RATING = "rating";
			public final String PLAYCOUNT = "playcount";
			public final String PLAYLIST = "playlist";
			public final String VIRTUALFOLDER = "virtualfolder";

			public final static Set<String> values = new HashSet<String>(Arrays.asList(GENRE, ALBUM, ARTIST, ALBUMARTIST, YEAR, REVIEW, THEMES, MOODS, STYLES, TYPE, LABEL, RATING, PLAYCOUNT, PLAYLIST, VIRTUALFOLDER));
		}
	}

	/**
	 * API Name: <tt>List.Filter.Rule.Artists</tt>
	 * <p/>
	 * Note: This class is used as parameter only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class ArtistFilterRule extends FilterRule {
		public final static String API_TYPE = "List.Filter.Rule.Artists";

		// field names
		public static final String FIELD = "field";

		// class members
		public final String field;

		/**
		 * @param operator One of: <tt>contains</tt>, <tt>doesnotcontain</tt>, <tt>is</tt>, <tt>isnot</tt>, <tt>startswith</tt>, <tt>endswith</tt>, <tt>greaterthan</tt>, <tt>lessthan</tt>, <tt>after</tt>, <tt>before</tt>, <tt>inthelast</tt>, <tt>notinthelast</tt>, <tt>true</tt>, <tt>false</tt>, <tt>between</tt>. See constants at {@link ListModel.FilterRule.Operator}.
		 * @param value
		 * @param field One of: <tt>artist</tt>, <tt>genre</tt>, <tt>moods</tt>, <tt>styles</tt>, <tt>instruments</tt>, <tt>biography</tt>, <tt>born</tt>, <tt>bandformed</tt>, <tt>disbanded</tt>, <tt>died</tt>, <tt>playlist</tt>, <tt>virtualfolder</tt>. See constants at {@link ListModel.ArtistFilterRule.Field}.
		 */
		public ArtistFilterRule(String operator, Value value, String field) {
			super(operator, value);
			this.field = field;
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = (ObjectNode)super.toJsonNode();
			node.put(FIELD, field); // enum
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
			parcel.writeValue(field); // enum
		}

		/**
		 * Construct via parcel.
		 */
		protected ArtistFilterRule(Parcel parcel) {
			super(parcel);
			field = parcel.readString(); // enum
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<ArtistFilterRule> CREATOR = new Parcelable.Creator<ArtistFilterRule>() {
			@Override
			public ArtistFilterRule createFromParcel(Parcel parcel) {
				return new ArtistFilterRule(parcel);
			}
			@Override
			public ArtistFilterRule[] newArray(int n) {
				return new ArtistFilterRule[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}

		/**
		 * API Name: <tt>field</tt>
		 */
		public interface Field {

			public final String ARTIST = "artist";
			public final String GENRE = "genre";
			public final String MOODS = "moods";
			public final String STYLES = "styles";
			public final String INSTRUMENTS = "instruments";
			public final String BIOGRAPHY = "biography";
			public final String BORN = "born";
			public final String BANDFORMED = "bandformed";
			public final String DISBANDED = "disbanded";
			public final String DIED = "died";
			public final String PLAYLIST = "playlist";
			public final String VIRTUALFOLDER = "virtualfolder";

			public final static Set<String> values = new HashSet<String>(Arrays.asList(ARTIST, GENRE, MOODS, STYLES, INSTRUMENTS, BIOGRAPHY, BORN, BANDFORMED, DISBANDED, DIED, PLAYLIST, VIRTUALFOLDER));
		}
	}

	/**
	 * API Name: <tt>List.Filter.Rule.Episodes</tt>
	 * <p/>
	 * Note: This class is used as parameter only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class EpisodeFilterRule extends FilterRule {
		public final static String API_TYPE = "List.Filter.Rule.Episodes";

		// field names
		public static final String FIELD = "field";

		// class members
		public final String field;

		/**
		 * @param operator One of: <tt>contains</tt>, <tt>doesnotcontain</tt>, <tt>is</tt>, <tt>isnot</tt>, <tt>startswith</tt>, <tt>endswith</tt>, <tt>greaterthan</tt>, <tt>lessthan</tt>, <tt>after</tt>, <tt>before</tt>, <tt>inthelast</tt>, <tt>notinthelast</tt>, <tt>true</tt>, <tt>false</tt>, <tt>between</tt>. See constants at {@link ListModel.FilterRule.Operator}.
		 * @param value
		 * @param field One of: <tt>title</tt>, <tt>tvshow</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>time</tt>, <tt>writers</tt>, <tt>airdate</tt>, <tt>playcount</tt>, <tt>lastplayed</tt>, <tt>inprogress</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>director</tt>, <tt>actor</tt>, <tt>episode</tt>, <tt>season</tt>, <tt>filename</tt>, <tt>path</tt>, <tt>studio</tt>, <tt>mpaarating</tt>, <tt>dateadded</tt>, <tt>videoresolution</tt>, <tt>audiochannels</tt>, <tt>videocodec</tt>, <tt>audiocodec</tt>, <tt>audiolanguage</tt>, <tt>subtitlelanguage</tt>, <tt>videoaspect</tt>, <tt>playlist</tt>, <tt>virtualfolder</tt>. See constants at {@link ListModel.EpisodeFilterRule.Field}.
		 */
		public EpisodeFilterRule(String operator, Value value, String field) {
			super(operator, value);
			this.field = field;
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = (ObjectNode)super.toJsonNode();
			node.put(FIELD, field); // enum
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
			parcel.writeValue(field); // enum
		}

		/**
		 * Construct via parcel.
		 */
		protected EpisodeFilterRule(Parcel parcel) {
			super(parcel);
			field = parcel.readString(); // enum
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<EpisodeFilterRule> CREATOR = new Parcelable.Creator<EpisodeFilterRule>() {
			@Override
			public EpisodeFilterRule createFromParcel(Parcel parcel) {
				return new EpisodeFilterRule(parcel);
			}
			@Override
			public EpisodeFilterRule[] newArray(int n) {
				return new EpisodeFilterRule[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}

		/**
		 * API Name: <tt>field</tt>
		 */
		public interface Field {

			public final String TITLE = "title";
			public final String TVSHOW = "tvshow";
			public final String PLOT = "plot";
			public final String VOTES = "votes";
			public final String RATING = "rating";
			public final String TIME = "time";
			public final String WRITERS = "writers";
			public final String AIRDATE = "airdate";
			public final String PLAYCOUNT = "playcount";
			public final String LASTPLAYED = "lastplayed";
			public final String INPROGRESS = "inprogress";
			public final String GENRE = "genre";
			public final String YEAR = "year";
			public final String DIRECTOR = "director";
			public final String ACTOR = "actor";
			public final String EPISODE = "episode";
			public final String SEASON = "season";
			public final String FILENAME = "filename";
			public final String PATH = "path";
			public final String STUDIO = "studio";
			public final String MPAARATING = "mpaarating";
			public final String DATEADDED = "dateadded";
			public final String VIDEORESOLUTION = "videoresolution";
			public final String AUDIOCHANNELS = "audiochannels";
			public final String VIDEOCODEC = "videocodec";
			public final String AUDIOCODEC = "audiocodec";
			public final String AUDIOLANGUAGE = "audiolanguage";
			public final String SUBTITLELANGUAGE = "subtitlelanguage";
			public final String VIDEOASPECT = "videoaspect";
			public final String PLAYLIST = "playlist";
			public final String VIRTUALFOLDER = "virtualfolder";

			public final static Set<String> values = new HashSet<String>(Arrays.asList(TITLE, TVSHOW, PLOT, VOTES, RATING, TIME, WRITERS, AIRDATE, PLAYCOUNT, LASTPLAYED, INPROGRESS, GENRE, YEAR, DIRECTOR, ACTOR, EPISODE, SEASON, FILENAME, PATH, STUDIO, MPAARATING, DATEADDED, VIDEORESOLUTION, AUDIOCHANNELS, VIDEOCODEC, AUDIOCODEC, AUDIOLANGUAGE, SUBTITLELANGUAGE, VIDEOASPECT, PLAYLIST, VIRTUALFOLDER));
		}
	}

	/**
	 * API Name: <tt>List.Filter.Rule.Movies</tt>
	 * <p/>
	 * Note: This class is used as parameter only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class MovieFilterRule extends FilterRule {
		public final static String API_TYPE = "List.Filter.Rule.Movies";

		// field names
		public static final String FIELD = "field";

		// class members
		public final String field;

		/**
		 * @param operator One of: <tt>contains</tt>, <tt>doesnotcontain</tt>, <tt>is</tt>, <tt>isnot</tt>, <tt>startswith</tt>, <tt>endswith</tt>, <tt>greaterthan</tt>, <tt>lessthan</tt>, <tt>after</tt>, <tt>before</tt>, <tt>inthelast</tt>, <tt>notinthelast</tt>, <tt>true</tt>, <tt>false</tt>, <tt>between</tt>. See constants at {@link ListModel.FilterRule.Operator}.
		 * @param value
		 * @param field One of: <tt>title</tt>, <tt>plot</tt>, <tt>plotoutline</tt>, <tt>tagline</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>time</tt>, <tt>writers</tt>, <tt>playcount</tt>, <tt>lastplayed</tt>, <tt>inprogress</tt>, <tt>genre</tt>, <tt>country</tt>, <tt>year</tt>, <tt>director</tt>, <tt>actor</tt>, <tt>mpaarating</tt>, <tt>top250</tt>, <tt>studio</tt>, <tt>hastrailer</tt>, <tt>filename</tt>, <tt>path</tt>, <tt>set</tt>, <tt>tag</tt>, <tt>dateadded</tt>, <tt>videoresolution</tt>, <tt>audiochannels</tt>, <tt>videocodec</tt>, <tt>audiocodec</tt>, <tt>audiolanguage</tt>, <tt>subtitlelanguage</tt>, <tt>videoaspect</tt>, <tt>playlist</tt>, <tt>virtualfolder</tt>. See constants at {@link ListModel.MovieFilterRule.Field}.
		 */
		public MovieFilterRule(String operator, Value value, String field) {
			super(operator, value);
			this.field = field;
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = (ObjectNode)super.toJsonNode();
			node.put(FIELD, field); // enum
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
			parcel.writeValue(field); // enum
		}

		/**
		 * Construct via parcel.
		 */
		protected MovieFilterRule(Parcel parcel) {
			super(parcel);
			field = parcel.readString(); // enum
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<MovieFilterRule> CREATOR = new Parcelable.Creator<MovieFilterRule>() {
			@Override
			public MovieFilterRule createFromParcel(Parcel parcel) {
				return new MovieFilterRule(parcel);
			}
			@Override
			public MovieFilterRule[] newArray(int n) {
				return new MovieFilterRule[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}

		/**
		 * API Name: <tt>field</tt>
		 */
		public interface Field {

			public final String TITLE = "title";
			public final String PLOT = "plot";
			public final String PLOTOUTLINE = "plotoutline";
			public final String TAGLINE = "tagline";
			public final String VOTES = "votes";
			public final String RATING = "rating";
			public final String TIME = "time";
			public final String WRITERS = "writers";
			public final String PLAYCOUNT = "playcount";
			public final String LASTPLAYED = "lastplayed";
			public final String INPROGRESS = "inprogress";
			public final String GENRE = "genre";
			public final String COUNTRY = "country";
			public final String YEAR = "year";
			public final String DIRECTOR = "director";
			public final String ACTOR = "actor";
			public final String MPAARATING = "mpaarating";
			public final String TOP250 = "top250";
			public final String STUDIO = "studio";
			public final String HASTRAILER = "hastrailer";
			public final String FILENAME = "filename";
			public final String PATH = "path";
			public final String SET = "set";
			public final String TAG = "tag";
			public final String DATEADDED = "dateadded";
			public final String VIDEORESOLUTION = "videoresolution";
			public final String AUDIOCHANNELS = "audiochannels";
			public final String VIDEOCODEC = "videocodec";
			public final String AUDIOCODEC = "audiocodec";
			public final String AUDIOLANGUAGE = "audiolanguage";
			public final String SUBTITLELANGUAGE = "subtitlelanguage";
			public final String VIDEOASPECT = "videoaspect";
			public final String PLAYLIST = "playlist";
			public final String VIRTUALFOLDER = "virtualfolder";

			public final static Set<String> values = new HashSet<String>(Arrays.asList(TITLE, PLOT, PLOTOUTLINE, TAGLINE, VOTES, RATING, TIME, WRITERS, PLAYCOUNT, LASTPLAYED, INPROGRESS, GENRE, COUNTRY, YEAR, DIRECTOR, ACTOR, MPAARATING, TOP250, STUDIO, HASTRAILER, FILENAME, PATH, SET, TAG, DATEADDED, VIDEORESOLUTION, AUDIOCHANNELS, VIDEOCODEC, AUDIOCODEC, AUDIOLANGUAGE, SUBTITLELANGUAGE, VIDEOASPECT, PLAYLIST, VIRTUALFOLDER));
		}
	}

	/**
	 * API Name: <tt>List.Filter.Rule.MusicVideos</tt>
	 * <p/>
	 * Note: This class is used as parameter only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class MusicVideoFilterRule extends FilterRule {
		public final static String API_TYPE = "List.Filter.Rule.MusicVideos";

		// field names
		public static final String FIELD = "field";

		// class members
		public final String field;

		/**
		 * @param operator One of: <tt>contains</tt>, <tt>doesnotcontain</tt>, <tt>is</tt>, <tt>isnot</tt>, <tt>startswith</tt>, <tt>endswith</tt>, <tt>greaterthan</tt>, <tt>lessthan</tt>, <tt>after</tt>, <tt>before</tt>, <tt>inthelast</tt>, <tt>notinthelast</tt>, <tt>true</tt>, <tt>false</tt>, <tt>between</tt>. See constants at {@link ListModel.FilterRule.Operator}.
		 * @param value
		 * @param field One of: <tt>title</tt>, <tt>genre</tt>, <tt>album</tt>, <tt>year</tt>, <tt>artist</tt>, <tt>filename</tt>, <tt>path</tt>, <tt>playcount</tt>, <tt>lastplayed</tt>, <tt>time</tt>, <tt>director</tt>, <tt>studio</tt>, <tt>plot</tt>, <tt>tag</tt>, <tt>dateadded</tt>, <tt>videoresolution</tt>, <tt>audiochannels</tt>, <tt>videocodec</tt>, <tt>audiocodec</tt>, <tt>audiolanguage</tt>, <tt>subtitlelanguage</tt>, <tt>videoaspect</tt>, <tt>playlist</tt>, <tt>virtualfolder</tt>. See constants at {@link ListModel.MusicVideoFilterRule.Field}.
		 */
		public MusicVideoFilterRule(String operator, Value value, String field) {
			super(operator, value);
			this.field = field;
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = (ObjectNode)super.toJsonNode();
			node.put(FIELD, field); // enum
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
			parcel.writeValue(field); // enum
		}

		/**
		 * Construct via parcel.
		 */
		protected MusicVideoFilterRule(Parcel parcel) {
			super(parcel);
			field = parcel.readString(); // enum
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<MusicVideoFilterRule> CREATOR = new Parcelable.Creator<MusicVideoFilterRule>() {
			@Override
			public MusicVideoFilterRule createFromParcel(Parcel parcel) {
				return new MusicVideoFilterRule(parcel);
			}
			@Override
			public MusicVideoFilterRule[] newArray(int n) {
				return new MusicVideoFilterRule[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}

		/**
		 * API Name: <tt>field</tt>
		 */
		public interface Field {

			public final String TITLE = "title";
			public final String GENRE = "genre";
			public final String ALBUM = "album";
			public final String YEAR = "year";
			public final String ARTIST = "artist";
			public final String FILENAME = "filename";
			public final String PATH = "path";
			public final String PLAYCOUNT = "playcount";
			public final String LASTPLAYED = "lastplayed";
			public final String TIME = "time";
			public final String DIRECTOR = "director";
			public final String STUDIO = "studio";
			public final String PLOT = "plot";
			public final String TAG = "tag";
			public final String DATEADDED = "dateadded";
			public final String VIDEORESOLUTION = "videoresolution";
			public final String AUDIOCHANNELS = "audiochannels";
			public final String VIDEOCODEC = "videocodec";
			public final String AUDIOCODEC = "audiocodec";
			public final String AUDIOLANGUAGE = "audiolanguage";
			public final String SUBTITLELANGUAGE = "subtitlelanguage";
			public final String VIDEOASPECT = "videoaspect";
			public final String PLAYLIST = "playlist";
			public final String VIRTUALFOLDER = "virtualfolder";

			public final static Set<String> values = new HashSet<String>(Arrays.asList(TITLE, GENRE, ALBUM, YEAR, ARTIST, FILENAME, PATH, PLAYCOUNT, LASTPLAYED, TIME, DIRECTOR, STUDIO, PLOT, TAG, DATEADDED, VIDEORESOLUTION, AUDIOCHANNELS, VIDEOCODEC, AUDIOCODEC, AUDIOLANGUAGE, SUBTITLELANGUAGE, VIDEOASPECT, PLAYLIST, VIRTUALFOLDER));
		}
	}

	/**
	 * API Name: <tt>List.Filter.Rule.Songs</tt>
	 * <p/>
	 * Note: This class is used as parameter only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class SongFilterRule extends FilterRule {
		public final static String API_TYPE = "List.Filter.Rule.Songs";

		// field names
		public static final String FIELD = "field";

		// class members
		public final String field;

		/**
		 * @param operator One of: <tt>contains</tt>, <tt>doesnotcontain</tt>, <tt>is</tt>, <tt>isnot</tt>, <tt>startswith</tt>, <tt>endswith</tt>, <tt>greaterthan</tt>, <tt>lessthan</tt>, <tt>after</tt>, <tt>before</tt>, <tt>inthelast</tt>, <tt>notinthelast</tt>, <tt>true</tt>, <tt>false</tt>, <tt>between</tt>. See constants at {@link ListModel.FilterRule.Operator}.
		 * @param value
		 * @param field One of: <tt>genre</tt>, <tt>album</tt>, <tt>artist</tt>, <tt>albumartist</tt>, <tt>title</tt>, <tt>year</tt>, <tt>time</tt>, <tt>tracknumber</tt>, <tt>filename</tt>, <tt>path</tt>, <tt>playcount</tt>, <tt>lastplayed</tt>, <tt>rating</tt>, <tt>comment</tt>, <tt>playlist</tt>, <tt>virtualfolder</tt>. See constants at {@link ListModel.SongFilterRule.Field}.
		 */
		public SongFilterRule(String operator, Value value, String field) {
			super(operator, value);
			this.field = field;
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = (ObjectNode)super.toJsonNode();
			node.put(FIELD, field); // enum
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
			parcel.writeValue(field); // enum
		}

		/**
		 * Construct via parcel.
		 */
		protected SongFilterRule(Parcel parcel) {
			super(parcel);
			field = parcel.readString(); // enum
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<SongFilterRule> CREATOR = new Parcelable.Creator<SongFilterRule>() {
			@Override
			public SongFilterRule createFromParcel(Parcel parcel) {
				return new SongFilterRule(parcel);
			}
			@Override
			public SongFilterRule[] newArray(int n) {
				return new SongFilterRule[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}

		/**
		 * API Name: <tt>field</tt>
		 */
		public interface Field {

			public final String GENRE = "genre";
			public final String ALBUM = "album";
			public final String ARTIST = "artist";
			public final String ALBUMARTIST = "albumartist";
			public final String TITLE = "title";
			public final String YEAR = "year";
			public final String TIME = "time";
			public final String TRACKNUMBER = "tracknumber";
			public final String FILENAME = "filename";
			public final String PATH = "path";
			public final String PLAYCOUNT = "playcount";
			public final String LASTPLAYED = "lastplayed";
			public final String RATING = "rating";
			public final String COMMENT = "comment";
			public final String PLAYLIST = "playlist";
			public final String VIRTUALFOLDER = "virtualfolder";

			public final static Set<String> values = new HashSet<String>(Arrays.asList(GENRE, ALBUM, ARTIST, ALBUMARTIST, TITLE, YEAR, TIME, TRACKNUMBER, FILENAME, PATH, PLAYCOUNT, LASTPLAYED, RATING, COMMENT, PLAYLIST, VIRTUALFOLDER));
		}
	}

	/**
	 * API Name: <tt>List.Filter.Rule.TVShows</tt>
	 * <p/>
	 * Note: This class is used as parameter only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class TVShowFilterRule extends FilterRule {
		public final static String API_TYPE = "List.Filter.Rule.TVShows";

		// field names
		public static final String FIELD = "field";

		// class members
		public final String field;

		/**
		 * @param operator One of: <tt>contains</tt>, <tt>doesnotcontain</tt>, <tt>is</tt>, <tt>isnot</tt>, <tt>startswith</tt>, <tt>endswith</tt>, <tt>greaterthan</tt>, <tt>lessthan</tt>, <tt>after</tt>, <tt>before</tt>, <tt>inthelast</tt>, <tt>notinthelast</tt>, <tt>true</tt>, <tt>false</tt>, <tt>between</tt>. See constants at {@link ListModel.FilterRule.Operator}.
		 * @param value
		 * @param field One of: <tt>title</tt>, <tt>plot</tt>, <tt>status</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>year</tt>, <tt>genre</tt>, <tt>director</tt>, <tt>actor</tt>, <tt>numepisodes</tt>, <tt>numwatched</tt>, <tt>playcount</tt>, <tt>path</tt>, <tt>studio</tt>, <tt>mpaarating</tt>, <tt>dateadded</tt>, <tt>lastplayed</tt>, <tt>inprogress</tt>, <tt>tag</tt>, <tt>playlist</tt>, <tt>virtualfolder</tt>. See constants at {@link ListModel.TVShowFilterRule.Field}.
		 */
		public TVShowFilterRule(String operator, Value value, String field) {
			super(operator, value);
			this.field = field;
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = (ObjectNode)super.toJsonNode();
			node.put(FIELD, field); // enum
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
			parcel.writeValue(field); // enum
		}

		/**
		 * Construct via parcel.
		 */
		protected TVShowFilterRule(Parcel parcel) {
			super(parcel);
			field = parcel.readString(); // enum
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<TVShowFilterRule> CREATOR = new Parcelable.Creator<TVShowFilterRule>() {
			@Override
			public TVShowFilterRule createFromParcel(Parcel parcel) {
				return new TVShowFilterRule(parcel);
			}
			@Override
			public TVShowFilterRule[] newArray(int n) {
				return new TVShowFilterRule[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}

		/**
		 * API Name: <tt>field</tt>
		 */
		public interface Field {

			public final String TITLE = "title";
			public final String PLOT = "plot";
			public final String STATUS = "status";
			public final String VOTES = "votes";
			public final String RATING = "rating";
			public final String YEAR = "year";
			public final String GENRE = "genre";
			public final String DIRECTOR = "director";
			public final String ACTOR = "actor";
			public final String NUMEPISODES = "numepisodes";
			public final String NUMWATCHED = "numwatched";
			public final String PLAYCOUNT = "playcount";
			public final String PATH = "path";
			public final String STUDIO = "studio";
			public final String MPAARATING = "mpaarating";
			public final String DATEADDED = "dateadded";
			public final String LASTPLAYED = "lastplayed";
			public final String INPROGRESS = "inprogress";
			public final String TAG = "tag";
			public final String PLAYLIST = "playlist";
			public final String VIRTUALFOLDER = "virtualfolder";

			public final static Set<String> values = new HashSet<String>(Arrays.asList(TITLE, PLOT, STATUS, VOTES, RATING, YEAR, GENRE, DIRECTOR, ACTOR, NUMEPISODES, NUMWATCHED, PLAYCOUNT, PATH, STUDIO, MPAARATING, DATEADDED, LASTPLAYED, INPROGRESS, TAG, PLAYLIST, VIRTUALFOLDER));
		}
	}

	/**
	 * API Name: <tt>List.Filter.Songs</tt>
	 * <p/>
	 * Note: This class is used as parameter only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class SongFilter extends AbstractModel {
		public final static String API_TYPE = "List.Filter.Songs";

		// class members
		public final And and;
		public final SongFilterRule filterRuleSongs;
		public final Or or;

		/**
		 * @param and
		 */
		public SongFilter(And and) {
			this.and = and;
			this.filterRuleSongs = null;
			this.or = null;
		}

		/**
		 * @param filterRuleSongs
		 */
		public SongFilter(SongFilterRule filterRuleSongs) {
			this.filterRuleSongs = filterRuleSongs;
			this.and = null;
			this.or = null;
		}

		/**
		 * @param or
		 */
		public SongFilter(Or or) {
			this.or = or;
			this.and = null;
			this.filterRuleSongs = null;
		}

		@Override
		public JsonNode toJsonNode() {
			if (and != null) {
				return and.toJsonNode();
			}
			if (filterRuleSongs != null) {
				return filterRuleSongs.toJsonNode();
			}
			if (or != null) {
				return or.toJsonNode();
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
			parcel.writeValue(and);
			parcel.writeValue(filterRuleSongs);
			parcel.writeValue(or);
		}

		/**
		 * Construct via parcel.
		 */
		protected SongFilter(Parcel parcel) {
			and = parcel.<And>readParcelable(And.class.getClassLoader());
			filterRuleSongs = parcel.<SongFilterRule>readParcelable(SongFilterRule.class.getClassLoader());
			or = parcel.<Or>readParcelable(Or.class.getClassLoader());
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<SongFilter> CREATOR = new Parcelable.Creator<SongFilter>() {
			@Override
			public SongFilter createFromParcel(Parcel parcel) {
				return new SongFilter(parcel);
			}
			@Override
			public SongFilter[] newArray(int n) {
				return new SongFilter[n];
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
		public static class And extends AbstractModel {

			// field names
			public static final String AND = "and";

			// class members
			public final List<SongFilter> and;

			/**
			 * @param and
			 */
			public And(List<SongFilter> and) {
				this.and = and;
			}

			@Override
			public JsonNode toJsonNode() {
				final ObjectNode node = OM.createObjectNode();
				final ArrayNode andArray = OM.createArrayNode();
				for (SongFilter item : and) {
					andArray.add(item.toJsonNode());
				}
				node.put(AND, andArray);
				return node;
			}

			/**
			 * Flatten this object into a Parcel.
			 * @param parcel the Parcel in which the object should be written.
			 * @param flags additional flags about how the object should be written.
			 */
			@Override
			public void writeToParcel(Parcel parcel, int flags) {
				parcel.writeInt(and.size());
				for (SongFilter item : and) {
					parcel.writeParcelable(item, flags);
				}
			}

			/**
			 * Construct via parcel.
			 */
			protected And(Parcel parcel) {
				final int andSize = parcel.readInt();
				and = new ArrayList<SongFilter>(andSize);
				for (int i = 0; i < andSize; i++) {
					and.add(parcel.<SongFilter>readParcelable(SongFilter.class.getClassLoader()));
				}
			}

			/**
			 * Generates instances of this Parcelable class from a Parcel.
			 */
			public static final Parcelable.Creator<And> CREATOR = new Parcelable.Creator<And>() {
				@Override
				public And createFromParcel(Parcel parcel) {
					return new And(parcel);
				}
				@Override
				public And[] newArray(int n) {
					return new And[n];
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
		public static class Or extends AbstractModel {

			// field names
			public static final String OR = "or";

			// class members
			public final List<SongFilter> or;

			/**
			 * @param or
			 */
			public Or(List<SongFilter> or) {
				this.or = or;
			}

			@Override
			public JsonNode toJsonNode() {
				final ObjectNode node = OM.createObjectNode();
				final ArrayNode orArray = OM.createArrayNode();
				for (SongFilter item : or) {
					orArray.add(item.toJsonNode());
				}
				node.put(OR, orArray);
				return node;
			}

			/**
			 * Flatten this object into a Parcel.
			 * @param parcel the Parcel in which the object should be written.
			 * @param flags additional flags about how the object should be written.
			 */
			@Override
			public void writeToParcel(Parcel parcel, int flags) {
				parcel.writeInt(or.size());
				for (SongFilter item : or) {
					parcel.writeParcelable(item, flags);
				}
			}

			/**
			 * Construct via parcel.
			 */
			protected Or(Parcel parcel) {
				final int orSize = parcel.readInt();
				or = new ArrayList<SongFilter>(orSize);
				for (int i = 0; i < orSize; i++) {
					or.add(parcel.<SongFilter>readParcelable(SongFilter.class.getClassLoader()));
				}
			}

			/**
			 * Generates instances of this Parcelable class from a Parcel.
			 */
			public static final Parcelable.Creator<Or> CREATOR = new Parcelable.Creator<Or>() {
				@Override
				public Or createFromParcel(Parcel parcel) {
					return new Or(parcel);
				}
				@Override
				public Or[] newArray(int n) {
					return new Or[n];
				}
			};

			@Override
			public int describeContents() {
				return 0;
			}
		}
	}

	/**
	 * API Name: <tt>List.Filter.TVShows</tt>
	 * <p/>
	 * Note: This class is used as parameter only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class TVShowFilter extends AbstractModel {
		public final static String API_TYPE = "List.Filter.TVShows";

		// class members
		public final And and;
		public final TVShowFilterRule filterRuleTVShows;
		public final Or or;

		/**
		 * @param and
		 */
		public TVShowFilter(And and) {
			this.and = and;
			this.filterRuleTVShows = null;
			this.or = null;
		}

		/**
		 * @param filterRuleTVShows
		 */
		public TVShowFilter(TVShowFilterRule filterRuleTVShows) {
			this.filterRuleTVShows = filterRuleTVShows;
			this.and = null;
			this.or = null;
		}

		/**
		 * @param or
		 */
		public TVShowFilter(Or or) {
			this.or = or;
			this.and = null;
			this.filterRuleTVShows = null;
		}

		@Override
		public JsonNode toJsonNode() {
			if (and != null) {
				return and.toJsonNode();
			}
			if (filterRuleTVShows != null) {
				return filterRuleTVShows.toJsonNode();
			}
			if (or != null) {
				return or.toJsonNode();
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
			parcel.writeValue(and);
			parcel.writeValue(filterRuleTVShows);
			parcel.writeValue(or);
		}

		/**
		 * Construct via parcel.
		 */
		protected TVShowFilter(Parcel parcel) {
			and = parcel.<And>readParcelable(And.class.getClassLoader());
			filterRuleTVShows = parcel.<TVShowFilterRule>readParcelable(TVShowFilterRule.class.getClassLoader());
			or = parcel.<Or>readParcelable(Or.class.getClassLoader());
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<TVShowFilter> CREATOR = new Parcelable.Creator<TVShowFilter>() {
			@Override
			public TVShowFilter createFromParcel(Parcel parcel) {
				return new TVShowFilter(parcel);
			}
			@Override
			public TVShowFilter[] newArray(int n) {
				return new TVShowFilter[n];
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
		public static class And extends AbstractModel {

			// field names
			public static final String AND = "and";

			// class members
			public final List<TVShowFilter> and;

			/**
			 * @param and
			 */
			public And(List<TVShowFilter> and) {
				this.and = and;
			}

			@Override
			public JsonNode toJsonNode() {
				final ObjectNode node = OM.createObjectNode();
				final ArrayNode andArray = OM.createArrayNode();
				for (TVShowFilter item : and) {
					andArray.add(item.toJsonNode());
				}
				node.put(AND, andArray);
				return node;
			}

			/**
			 * Flatten this object into a Parcel.
			 * @param parcel the Parcel in which the object should be written.
			 * @param flags additional flags about how the object should be written.
			 */
			@Override
			public void writeToParcel(Parcel parcel, int flags) {
				parcel.writeInt(and.size());
				for (TVShowFilter item : and) {
					parcel.writeParcelable(item, flags);
				}
			}

			/**
			 * Construct via parcel.
			 */
			protected And(Parcel parcel) {
				final int andSize = parcel.readInt();
				and = new ArrayList<TVShowFilter>(andSize);
				for (int i = 0; i < andSize; i++) {
					and.add(parcel.<TVShowFilter>readParcelable(TVShowFilter.class.getClassLoader()));
				}
			}

			/**
			 * Generates instances of this Parcelable class from a Parcel.
			 */
			public static final Parcelable.Creator<And> CREATOR = new Parcelable.Creator<And>() {
				@Override
				public And createFromParcel(Parcel parcel) {
					return new And(parcel);
				}
				@Override
				public And[] newArray(int n) {
					return new And[n];
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
		public static class Or extends AbstractModel {

			// field names
			public static final String OR = "or";

			// class members
			public final List<TVShowFilter> or;

			/**
			 * @param or
			 */
			public Or(List<TVShowFilter> or) {
				this.or = or;
			}

			@Override
			public JsonNode toJsonNode() {
				final ObjectNode node = OM.createObjectNode();
				final ArrayNode orArray = OM.createArrayNode();
				for (TVShowFilter item : or) {
					orArray.add(item.toJsonNode());
				}
				node.put(OR, orArray);
				return node;
			}

			/**
			 * Flatten this object into a Parcel.
			 * @param parcel the Parcel in which the object should be written.
			 * @param flags additional flags about how the object should be written.
			 */
			@Override
			public void writeToParcel(Parcel parcel, int flags) {
				parcel.writeInt(or.size());
				for (TVShowFilter item : or) {
					parcel.writeParcelable(item, flags);
				}
			}

			/**
			 * Construct via parcel.
			 */
			protected Or(Parcel parcel) {
				final int orSize = parcel.readInt();
				or = new ArrayList<TVShowFilter>(orSize);
				for (int i = 0; i < orSize; i++) {
					or.add(parcel.<TVShowFilter>readParcelable(TVShowFilter.class.getClassLoader()));
				}
			}

			/**
			 * Generates instances of this Parcelable class from a Parcel.
			 */
			public static final Parcelable.Creator<Or> CREATOR = new Parcelable.Creator<Or>() {
				@Override
				public Or createFromParcel(Parcel parcel) {
					return new Or(parcel);
				}
				@Override
				public Or[] newArray(int n) {
					return new Or[n];
				}
			};

			@Override
			public int describeContents() {
				return 0;
			}
		}
	}

	/**
	 * API Name: <tt>List.Item.All</tt>
	 * <p/>
	 * Note: This class is used as result only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class AllItems extends BaseItem {
		public final static String API_TYPE = "List.Item.All";

		// field names
		public static final String CHANNEL = "channel";
		public static final String CHANNELNUMBER = "channelnumber";
		public static final String CHANNELTYPE = "channeltype";
		public static final String ENDTIME = "endtime";
		public static final String HIDDEN = "hidden";
		public static final String LOCKED = "locked";
		public static final String STARTTIME = "starttime";

		// class members
		public final String channel;
		public final Integer channelnumber;
		public final String channeltype;
		public final String endtime;
		public final Boolean hidden;
		public final Boolean locked;
		public final String starttime;

		/**
		 * Construct from JSON object.
		 * @param node JSON object representing a AllItems object
		 */
		public AllItems(JsonNode node) {
			super(node);
			channel = parseString(node, CHANNEL);
			channelnumber = parseInt(node, CHANNELNUMBER);
			channeltype = parseString(node, CHANNELTYPE);
			endtime = parseString(node, ENDTIME);
			hidden = parseBoolean(node, HIDDEN);
			locked = parseBoolean(node, LOCKED);
			starttime = parseString(node, STARTTIME);
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = (ObjectNode)super.toJsonNode();
			node.put(CHANNEL, channel);
			node.put(CHANNELNUMBER, channelnumber);
			node.put(CHANNELTYPE, channeltype); // enum
			node.put(ENDTIME, endtime);
			node.put(HIDDEN, hidden);
			node.put(LOCKED, locked);
			node.put(STARTTIME, starttime);
			return node;
		}

		/**
		 * Extracts a list of {@link AllItems} objects from a JSON array.
		 * @param node ObjectNode containing the list of objects.
		 * @param key Key pointing to the node where the list is stored.
		 */
		static List<AllItems> getListModelAllItemsList(JsonNode node, String key) {
			if (node.has(key)) {
				final ArrayNode a = (ArrayNode)node.get(key);
				final List<AllItems> l = new ArrayList<AllItems>(a.size());
				for (int i = 0; i < a.size(); i++) {
					l.add(new AllItems((JsonNode)a.get(i)));
				}
				return l;
			}
			return new ArrayList<AllItems>(0);
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
			parcel.writeValue(channelnumber);
			parcel.writeValue(channeltype); // enum
			parcel.writeValue(endtime);
			parcel.writeInt(hidden ? 1 : 0);
			parcel.writeInt(locked ? 1 : 0);
			parcel.writeValue(starttime);
		}

		/**
		 * Construct via parcel.
		 */
		protected AllItems(Parcel parcel) {
			super(parcel);
			channel = parcel.readString();
			channelnumber = parcel.readInt();
			channeltype = parcel.readString(); // enum
			endtime = parcel.readString();
			hidden = parcel.readInt() == 1;
			locked = parcel.readInt() == 1;
			starttime = parcel.readString();
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<AllItems> CREATOR = new Parcelable.Creator<AllItems>() {
			@Override
			public AllItems createFromParcel(Parcel parcel) {
				return new AllItems(parcel);
			}
			@Override
			public AllItems[] newArray(int n) {
				return new AllItems[n];
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
	 * API Name: <tt>List.Item.Base</tt>
	 * <p/>
	 * Note: This class is used as result only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class BaseItem extends AbstractModel {
		public final static String API_TYPE = "List.Item.Base";

		// field names
		public static final String ALBUM = "album";
		public static final String ALBUMARTIST = "albumartist";
		public static final String ALBUMARTISTID = "albumartistid";
		public static final String ALBUMID = "albumid";
		public static final String ALBUMLABEL = "albumlabel";
		public static final String ART = "art";
		public static final String ARTIST = "artist";
		public static final String ARTISTID = "artistid";
		public static final String CAST = "cast";
		public static final String COMMENT = "comment";
		public static final String COUNTRY = "country";
		public static final String DATEADDED = "dateadded";
		public static final String DESCRIPTION = "description";
		public static final String DIRECTOR = "director";
		public static final String DISC = "disc";
		public static final String DISPLAYARTIST = "displayartist";
		public static final String DURATION = "duration";
		public static final String EPISODE = "episode";
		public static final String EPISODEGUIDE = "episodeguide";
		public static final String FANART = "fanart";
		public static final String FILE = "file";
		public static final String FIRSTAIRED = "firstaired";
		public static final String GENRE = "genre";
		public static final String GENREID = "genreid";
		public static final String ID = "id";
		public static final String IMDBNUMBER = "imdbnumber";
		public static final String LABEL = "label";
		public static final String LASTPLAYED = "lastplayed";
		public static final String LYRICS = "lyrics";
		public static final String MOOD = "mood";
		public static final String MPAA = "mpaa";
		public static final String MUSICBRAINZALBUMARTISTID = "musicbrainzalbumartistid";
		public static final String MUSICBRAINZALBUMID = "musicbrainzalbumid";
		public static final String MUSICBRAINZARTISTID = "musicbrainzartistid";
		public static final String MUSICBRAINZTRACKID = "musicbrainztrackid";
		public static final String ORIGINALTITLE = "originaltitle";
		public static final String PLAYCOUNT = "playcount";
		public static final String PLOT = "plot";
		public static final String PLOTOUTLINE = "plotoutline";
		public static final String PREMIERED = "premiered";
		public static final String PRODUCTIONCODE = "productioncode";
		public static final String RATING = "rating";
		public static final String RESUME = "resume";
		public static final String RUNTIME = "runtime";
		public static final String SEASON = "season";
		public static final String SET = "set";
		public static final String SETID = "setid";
		public static final String SHOWLINK = "showlink";
		public static final String SHOWTITLE = "showtitle";
		public static final String SORTTITLE = "sorttitle";
		public static final String STREAMDETAILS = "streamdetails";
		public static final String STUDIO = "studio";
		public static final String STYLE = "style";
		public static final String TAG = "tag";
		public static final String TAGLINE = "tagline";
		public static final String THEME = "theme";
		public static final String THUMBNAIL = "thumbnail";
		public static final String TITLE = "title";
		public static final String TOP250 = "top250";
		public static final String TRACK = "track";
		public static final String TRAILER = "trailer";
		public static final String TVSHOWID = "tvshowid";
		public static final String TYPE = "type";
		public static final String UNIQUEID = "uniqueid";
		public static final String VOTES = "votes";
		public static final String WATCHEDEPISODES = "watchedepisodes";
		public static final String WRITER = "writer";
		public static final String YEAR = "year";

		// class members
		public final String album;
		public final List<String> albumartist;
		public final List<Integer> albumartistid;
		public final Integer albumid;
		public final String albumlabel;
		/**
		 * Multiple inheritage: copied from <tt>Video.Details.Base</tt>.
		 */
		public final MediaModel.Artwork art;
		/**
		 * Multiple inheritage: copied from <tt>Audio.Details.Media</tt>.
		 */
		public final List<String> artist;
		/**
		 * Multiple inheritage: copied from <tt>Audio.Details.Media</tt>.
		 */
		public final List<Integer> artistid;
		public final List<VideoModel.Cast> cast;
		public final String comment;
		public final List<String> country;
		/**
		 * Multiple inheritage: copied from <tt>Video.Details.Item</tt>.
		 */
		public final String dateadded;
		public final String description;
		/**
		 * Multiple inheritage: copied from <tt>Video.Details.File</tt>.
		 */
		public final List<String> director;
		public final Integer disc;
		/**
		 * Multiple inheritage: copied from <tt>Audio.Details.Media</tt>.
		 */
		public final String displayartist;
		public final Integer duration;
		public final Integer episode;
		public final String episodeguide;
		/**
		 * Multiple inheritage: copied from <tt>Media.Details.Base</tt>.
		 */
		public final String fanart;
		/**
		 * Multiple inheritage: copied from <tt>Video.Details.Item</tt>.
		 */
		public final String file;
		public final String firstaired;
		/**
		 * Multiple inheritage: copied from <tt>Audio.Details.Base</tt>.
		 */
		public final List<String> genre;
		/**
		 * Multiple inheritage: copied from <tt>Audio.Details.Media</tt>.
		 */
		public final List<Integer> genreid;
		public final Integer id;
		public final String imdbnumber;
		/**
		 * Multiple inheritage: copied from <tt>Item.Details.Base</tt>.
		 */
		public final String label;
		/**
		 * Multiple inheritage: copied from <tt>Video.Details.Item</tt>.
		 */
		public final String lastplayed;
		public final String lyrics;
		public final List<String> mood;
		public final String mpaa;
		/**
		 * Multiple inheritage: copied from <tt>Audio.Details.Media</tt>.
		 */
		public final String musicbrainzalbumartistid;
		/**
		 * Multiple inheritage: copied from <tt>Audio.Details.Media</tt>.
		 */
		public final String musicbrainzalbumid;
		public final String musicbrainzartistid;
		public final String musicbrainztrackid;
		public final String originaltitle;
		/**
		 * Multiple inheritage: copied from <tt>Video.Details.Base</tt>.
		 */
		public final Integer playcount;
		/**
		 * Multiple inheritage: copied from <tt>Video.Details.Item</tt>.
		 */
		public final String plot;
		public final String plotoutline;
		public final String premiered;
		public final String productioncode;
		/**
		 * Multiple inheritage: copied from <tt>Audio.Details.Media</tt>.
		 */
		public final Integer rating;
		/**
		 * Multiple inheritage: copied from <tt>Video.Details.File</tt>.
		 */
		public final VideoModel.Resume resume;
		/**
		 * Multiple inheritage: copied from <tt>Video.Details.File</tt>.
		 */
		public final Integer runtime;
		public final Integer season;
		public final String set;
		public final Integer setid;
		public final List<String> showlink;
		public final String showtitle;
		public final String sorttitle;
		/**
		 * Multiple inheritage: copied from <tt>Video.Details.File</tt>.
		 */
		public final VideoModel.Streams streamdetails;
		public final List<String> studio;
		public final List<String> style;
		public final List<String> tag;
		public final String tagline;
		public final List<String> theme;
		/**
		 * Multiple inheritage: copied from <tt>Media.Details.Base</tt>.
		 */
		public final String thumbnail;
		/**
		 * Multiple inheritage: copied from <tt>Video.Details.Media</tt>.
		 */
		public final String title;
		public final Integer top250;
		public final Integer track;
		public final String trailer;
		public final Integer tvshowid;
		public final String type;
		public final HashMap<String, String> uniqueid;
		public final String votes;
		public final Integer watchedepisodes;
		public final List<String> writer;
		/**
		 * Multiple inheritage: copied from <tt>Audio.Details.Media</tt>.
		 */
		public final Integer year;

		/**
		 * @param album
		 * @param albumartist
		 * @param albumartistid
		 * @param albumid
		 * @param albumlabel
		 * @param art
		 * @param artist
		 * @param artistid
		 * @param cast
		 * @param comment
		 * @param country
		 * @param dateadded
		 * @param description
		 * @param director
		 * @param disc
		 * @param displayartist
		 * @param duration
		 * @param episode
		 * @param episodeguide
		 * @param fanart
		 * @param file
		 * @param firstaired
		 * @param genre
		 * @param genreid
		 * @param id
		 * @param imdbnumber
		 * @param label
		 * @param lastplayed
		 * @param lyrics
		 * @param mood
		 * @param mpaa
		 * @param musicbrainzalbumartistid
		 * @param musicbrainzalbumid
		 * @param musicbrainzartistid
		 * @param musicbrainztrackid
		 * @param originaltitle
		 * @param playcount
		 * @param plot
		 * @param plotoutline
		 * @param premiered
		 * @param productioncode
		 * @param rating
		 * @param resume
		 * @param runtime
		 * @param season
		 * @param set
		 * @param setid
		 * @param showlink
		 * @param showtitle
		 * @param sorttitle
		 * @param streamdetails
		 * @param studio
		 * @param style
		 * @param tag
		 * @param tagline
		 * @param theme
		 * @param thumbnail
		 * @param title
		 * @param top250
		 * @param track
		 * @param trailer
		 * @param tvshowid
		 * @param type One of: <tt>unknown</tt>, <tt>movie</tt>, <tt>episode</tt>, <tt>musicvideo</tt>, <tt>song</tt>, <tt>picture</tt>, <tt>channel</tt>. See constants at {@link ListModel.BaseItem.Type}.
		 * @param uniqueid
		 * @param votes
		 * @param watchedepisodes
		 * @param writer
		 * @param year
		 */
		public BaseItem(String album, List<String> albumartist, List<Integer> albumartistid, Integer albumid, String albumlabel, MediaModel.Artwork art, List<String> artist, List<Integer> artistid, List<VideoModel.Cast> cast, String comment, List<String> country, String dateadded, String description, List<String> director, Integer disc, String displayartist, Integer duration, Integer episode, String episodeguide, String fanart, String file, String firstaired, List<String> genre, List<Integer> genreid, Integer id, String imdbnumber, String label, String lastplayed, String lyrics, List<String> mood, String mpaa, String musicbrainzalbumartistid, String musicbrainzalbumid, String musicbrainzartistid, String musicbrainztrackid, String originaltitle, Integer playcount, String plot, String plotoutline, String premiered, String productioncode, Integer rating, VideoModel.Resume resume, Integer runtime, Integer season, String set, Integer setid, List<String> showlink, String showtitle, String sorttitle, VideoModel.Streams streamdetails, List<String> studio, List<String> style, List<String> tag, String tagline, List<String> theme, String thumbnail, String title, Integer top250, Integer track, String trailer, Integer tvshowid, String type, HashMap<String, String> uniqueid, String votes, Integer watchedepisodes, List<String> writer, Integer year) {
			this.album = album;
			this.albumartist = albumartist;
			this.albumartistid = albumartistid;
			this.albumid = albumid;
			this.albumlabel = albumlabel;
			this.art = art;
			this.artist = artist;
			this.artistid = artistid;
			this.cast = cast;
			this.comment = comment;
			this.country = country;
			this.dateadded = dateadded;
			this.description = description;
			this.director = director;
			this.disc = disc;
			this.displayartist = displayartist;
			this.duration = duration;
			this.episode = episode;
			this.episodeguide = episodeguide;
			this.fanart = fanart;
			this.file = file;
			this.firstaired = firstaired;
			this.genre = genre;
			this.genreid = genreid;
			this.id = id;
			this.imdbnumber = imdbnumber;
			this.label = label;
			this.lastplayed = lastplayed;
			this.lyrics = lyrics;
			this.mood = mood;
			this.mpaa = mpaa;
			this.musicbrainzalbumartistid = musicbrainzalbumartistid;
			this.musicbrainzalbumid = musicbrainzalbumid;
			this.musicbrainzartistid = musicbrainzartistid;
			this.musicbrainztrackid = musicbrainztrackid;
			this.originaltitle = originaltitle;
			this.playcount = playcount;
			this.plot = plot;
			this.plotoutline = plotoutline;
			this.premiered = premiered;
			this.productioncode = productioncode;
			this.rating = rating;
			this.resume = resume;
			this.runtime = runtime;
			this.season = season;
			this.set = set;
			this.setid = setid;
			this.showlink = showlink;
			this.showtitle = showtitle;
			this.sorttitle = sorttitle;
			this.streamdetails = streamdetails;
			this.studio = studio;
			this.style = style;
			this.tag = tag;
			this.tagline = tagline;
			this.theme = theme;
			this.thumbnail = thumbnail;
			this.title = title;
			this.top250 = top250;
			this.track = track;
			this.trailer = trailer;
			this.tvshowid = tvshowid;
			this.type = type;
			this.uniqueid = uniqueid;
			this.votes = votes;
			this.watchedepisodes = watchedepisodes;
			this.writer = writer;
			this.year = year;
		}

		/**
		 * Construct from JSON object.
		 * @param node JSON object representing a BaseItem object
		 */
		public BaseItem(JsonNode node) {
			album = parseString(node, ALBUM);
			albumartist = getStringArray(node, ALBUMARTIST);
			albumartistid = getIntegerArray(node, ALBUMARTISTID);
			albumid = parseInt(node, ALBUMID);
			albumlabel = parseString(node, ALBUMLABEL);
			art = node.has(ART) ? new MediaModel.Artwork(node.get(ART)) : null;
			artist = getStringArray(node, ARTIST);
			artistid = getIntegerArray(node, ARTISTID);
			cast = VideoModel.Cast.getVideoModelCastList(node, CAST);
			comment = parseString(node, COMMENT);
			country = getStringArray(node, COUNTRY);
			dateadded = parseString(node, DATEADDED);
			description = parseString(node, DESCRIPTION);
			director = getStringArray(node, DIRECTOR);
			disc = parseInt(node, DISC);
			displayartist = parseString(node, DISPLAYARTIST);
			duration = parseInt(node, DURATION);
			episode = parseInt(node, EPISODE);
			episodeguide = parseString(node, EPISODEGUIDE);
			fanart = parseString(node, FANART);
			file = parseString(node, FILE);
			firstaired = parseString(node, FIRSTAIRED);
			genre = getStringArray(node, GENRE);
			genreid = getIntegerArray(node, GENREID);
			id = parseInt(node, ID);
			imdbnumber = parseString(node, IMDBNUMBER);
			label = node.get(LABEL).getTextValue(); // required value
			lastplayed = parseString(node, LASTPLAYED);
			lyrics = parseString(node, LYRICS);
			mood = getStringArray(node, MOOD);
			mpaa = parseString(node, MPAA);
			musicbrainzalbumartistid = parseString(node, MUSICBRAINZALBUMARTISTID);
			musicbrainzalbumid = parseString(node, MUSICBRAINZALBUMID);
			musicbrainzartistid = parseString(node, MUSICBRAINZARTISTID);
			musicbrainztrackid = parseString(node, MUSICBRAINZTRACKID);
			originaltitle = parseString(node, ORIGINALTITLE);
			playcount = parseInt(node, PLAYCOUNT);
			plot = parseString(node, PLOT);
			plotoutline = parseString(node, PLOTOUTLINE);
			premiered = parseString(node, PREMIERED);
			productioncode = parseString(node, PRODUCTIONCODE);
			rating = parseInt(node, RATING);
			resume = node.has(RESUME) ? new VideoModel.Resume(node.get(RESUME)) : null;
			runtime = parseInt(node, RUNTIME);
			season = parseInt(node, SEASON);
			set = parseString(node, SET);
			setid = parseInt(node, SETID);
			showlink = getStringArray(node, SHOWLINK);
			showtitle = parseString(node, SHOWTITLE);
			sorttitle = parseString(node, SORTTITLE);
			streamdetails = node.has(STREAMDETAILS) ? new VideoModel.Streams(node.get(STREAMDETAILS)) : null;
			studio = getStringArray(node, STUDIO);
			style = getStringArray(node, STYLE);
			tag = getStringArray(node, TAG);
			tagline = parseString(node, TAGLINE);
			theme = getStringArray(node, THEME);
			thumbnail = parseString(node, THUMBNAIL);
			title = parseString(node, TITLE);
			top250 = parseInt(node, TOP250);
			track = parseInt(node, TRACK);
			trailer = parseString(node, TRAILER);
			tvshowid = parseInt(node, TVSHOWID);
			type = parseString(node, TYPE);
			uniqueid = getStringMap(node, UNIQUEID);
			votes = parseString(node, VOTES);
			watchedepisodes = parseInt(node, WATCHEDEPISODES);
			writer = getStringArray(node, WRITER);
			year = parseInt(node, YEAR);
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = OM.createObjectNode();
			node.put(ALBUM, album);
			final ArrayNode albumartistArray = OM.createArrayNode();
			for (String item : albumartist) {
				albumartistArray.add(item);
			}
			node.put(ALBUMARTIST, albumartistArray);
			final ArrayNode albumartistidArray = OM.createArrayNode();
			for (Integer item : albumartistid) {
				albumartistidArray.add(item);
			}
			node.put(ALBUMARTISTID, albumartistidArray);
			node.put(ALBUMID, albumid);
			node.put(ALBUMLABEL, albumlabel);
			node.put(ART, art.toJsonNode());
			final ArrayNode artistArray = OM.createArrayNode();
			for (String item : artist) {
				artistArray.add(item);
			}
			node.put(ARTIST, artistArray);
			final ArrayNode artistidArray = OM.createArrayNode();
			for (Integer item : artistid) {
				artistidArray.add(item);
			}
			node.put(ARTISTID, artistidArray);
			final ArrayNode castArray = OM.createArrayNode();
			for (VideoModel.Cast item : cast) {
				castArray.add(item.toJsonNode());
			}
			node.put(CAST, castArray);
			node.put(COMMENT, comment);
			final ArrayNode countryArray = OM.createArrayNode();
			for (String item : country) {
				countryArray.add(item);
			}
			node.put(COUNTRY, countryArray);
			node.put(DATEADDED, dateadded);
			node.put(DESCRIPTION, description);
			final ArrayNode directorArray = OM.createArrayNode();
			for (String item : director) {
				directorArray.add(item);
			}
			node.put(DIRECTOR, directorArray);
			node.put(DISC, disc);
			node.put(DISPLAYARTIST, displayartist);
			node.put(DURATION, duration);
			node.put(EPISODE, episode);
			node.put(EPISODEGUIDE, episodeguide);
			node.put(FANART, fanart);
			node.put(FILE, file);
			node.put(FIRSTAIRED, firstaired);
			final ArrayNode genreArray = OM.createArrayNode();
			for (String item : genre) {
				genreArray.add(item);
			}
			node.put(GENRE, genreArray);
			final ArrayNode genreidArray = OM.createArrayNode();
			for (Integer item : genreid) {
				genreidArray.add(item);
			}
			node.put(GENREID, genreidArray);
			node.put(ID, id);
			node.put(IMDBNUMBER, imdbnumber);
			node.put(LABEL, label);
			node.put(LASTPLAYED, lastplayed);
			node.put(LYRICS, lyrics);
			final ArrayNode moodArray = OM.createArrayNode();
			for (String item : mood) {
				moodArray.add(item);
			}
			node.put(MOOD, moodArray);
			node.put(MPAA, mpaa);
			node.put(MUSICBRAINZALBUMARTISTID, musicbrainzalbumartistid);
			node.put(MUSICBRAINZALBUMID, musicbrainzalbumid);
			node.put(MUSICBRAINZARTISTID, musicbrainzartistid);
			node.put(MUSICBRAINZTRACKID, musicbrainztrackid);
			node.put(ORIGINALTITLE, originaltitle);
			node.put(PLAYCOUNT, playcount);
			node.put(PLOT, plot);
			node.put(PLOTOUTLINE, plotoutline);
			node.put(PREMIERED, premiered);
			node.put(PRODUCTIONCODE, productioncode);
			node.put(RATING, rating);
			node.put(RESUME, resume.toJsonNode());
			node.put(RUNTIME, runtime);
			node.put(SEASON, season);
			node.put(SET, set);
			node.put(SETID, setid);
			final ArrayNode showlinkArray = OM.createArrayNode();
			for (String item : showlink) {
				showlinkArray.add(item);
			}
			node.put(SHOWLINK, showlinkArray);
			node.put(SHOWTITLE, showtitle);
			node.put(SORTTITLE, sorttitle);
			node.put(STREAMDETAILS, streamdetails.toJsonNode());
			final ArrayNode studioArray = OM.createArrayNode();
			for (String item : studio) {
				studioArray.add(item);
			}
			node.put(STUDIO, studioArray);
			final ArrayNode styleArray = OM.createArrayNode();
			for (String item : style) {
				styleArray.add(item);
			}
			node.put(STYLE, styleArray);
			final ArrayNode tagArray = OM.createArrayNode();
			for (String item : tag) {
				tagArray.add(item);
			}
			node.put(TAG, tagArray);
			node.put(TAGLINE, tagline);
			final ArrayNode themeArray = OM.createArrayNode();
			for (String item : theme) {
				themeArray.add(item);
			}
			node.put(THEME, themeArray);
			node.put(THUMBNAIL, thumbnail);
			node.put(TITLE, title);
			node.put(TOP250, top250);
			node.put(TRACK, track);
			node.put(TRAILER, trailer);
			node.put(TVSHOWID, tvshowid);
			node.put(TYPE, type); // enum
			final ObjectNode uniqueidMap = OM.createObjectNode();
			for (String key : uniqueid.values()) {
				uniqueidMap.put(key, uniqueid.get(key));
			}
			node.put(UNIQUEID, uniqueidMap);
			node.put(VOTES, votes);
			node.put(WATCHEDEPISODES, watchedepisodes);
			final ArrayNode writerArray = OM.createArrayNode();
			for (String item : writer) {
				writerArray.add(item);
			}
			node.put(WRITER, writerArray);
			node.put(YEAR, year);
			return node;
		}

		/**
		 * Extracts a list of {@link BaseItem} objects from a JSON array.
		 * @param node ObjectNode containing the list of objects.
		 * @param key Key pointing to the node where the list is stored.
		 */
		static List<BaseItem> getListModelBaseItemList(JsonNode node, String key) {
			if (node.has(key)) {
				final ArrayNode a = (ArrayNode)node.get(key);
				final List<BaseItem> l = new ArrayList<BaseItem>(a.size());
				for (int i = 0; i < a.size(); i++) {
					l.add(new BaseItem((JsonNode)a.get(i)));
				}
				return l;
			}
			return new ArrayList<BaseItem>(0);
		}

		/**
		 * Flatten this object into a Parcel.
		 * @param parcel the Parcel in which the object should be written.
		 * @param flags additional flags about how the object should be written.
		 */
		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			parcel.writeValue(album);
			parcel.writeInt(albumartist.size());
			for (String item : albumartist) {
				parcel.writeValue(item);
			}
			parcel.writeInt(albumartistid.size());
			for (Integer item : albumartistid) {
				parcel.writeValue(item);
			}
			parcel.writeValue(albumid);
			parcel.writeValue(albumlabel);
			parcel.writeValue(art);
			parcel.writeInt(artist.size());
			for (String item : artist) {
				parcel.writeValue(item);
			}
			parcel.writeInt(artistid.size());
			for (Integer item : artistid) {
				parcel.writeValue(item);
			}
			parcel.writeInt(cast.size());
			for (VideoModel.Cast item : cast) {
				parcel.writeParcelable(item, flags);
			}
			parcel.writeValue(comment);
			parcel.writeInt(country.size());
			for (String item : country) {
				parcel.writeValue(item);
			}
			parcel.writeValue(dateadded);
			parcel.writeValue(description);
			parcel.writeInt(director.size());
			for (String item : director) {
				parcel.writeValue(item);
			}
			parcel.writeValue(disc);
			parcel.writeValue(displayartist);
			parcel.writeValue(duration);
			parcel.writeValue(episode);
			parcel.writeValue(episodeguide);
			parcel.writeValue(fanart);
			parcel.writeValue(file);
			parcel.writeValue(firstaired);
			parcel.writeInt(genre.size());
			for (String item : genre) {
				parcel.writeValue(item);
			}
			parcel.writeInt(genreid.size());
			for (Integer item : genreid) {
				parcel.writeValue(item);
			}
			parcel.writeValue(id);
			parcel.writeValue(imdbnumber);
			parcel.writeValue(label);
			parcel.writeValue(lastplayed);
			parcel.writeValue(lyrics);
			parcel.writeInt(mood.size());
			for (String item : mood) {
				parcel.writeValue(item);
			}
			parcel.writeValue(mpaa);
			parcel.writeValue(musicbrainzalbumartistid);
			parcel.writeValue(musicbrainzalbumid);
			parcel.writeValue(musicbrainzartistid);
			parcel.writeValue(musicbrainztrackid);
			parcel.writeValue(originaltitle);
			parcel.writeValue(playcount);
			parcel.writeValue(plot);
			parcel.writeValue(plotoutline);
			parcel.writeValue(premiered);
			parcel.writeValue(productioncode);
			parcel.writeValue(rating);
			parcel.writeValue(resume);
			parcel.writeValue(runtime);
			parcel.writeValue(season);
			parcel.writeValue(set);
			parcel.writeValue(setid);
			parcel.writeInt(showlink.size());
			for (String item : showlink) {
				parcel.writeValue(item);
			}
			parcel.writeValue(showtitle);
			parcel.writeValue(sorttitle);
			parcel.writeValue(streamdetails);
			parcel.writeInt(studio.size());
			for (String item : studio) {
				parcel.writeValue(item);
			}
			parcel.writeInt(style.size());
			for (String item : style) {
				parcel.writeValue(item);
			}
			parcel.writeInt(tag.size());
			for (String item : tag) {
				parcel.writeValue(item);
			}
			parcel.writeValue(tagline);
			parcel.writeInt(theme.size());
			for (String item : theme) {
				parcel.writeValue(item);
			}
			parcel.writeValue(thumbnail);
			parcel.writeValue(title);
			parcel.writeValue(top250);
			parcel.writeValue(track);
			parcel.writeValue(trailer);
			parcel.writeValue(tvshowid);
			parcel.writeValue(type); // enum
			parcel.writeInt(uniqueid.size());
			for (String key : uniqueid.values()) {
				parcel.writeValue(key);
				parcel.writeValue(uniqueid.get(key));
			}
			parcel.writeValue(votes);
			parcel.writeValue(watchedepisodes);
			parcel.writeInt(writer.size());
			for (String item : writer) {
				parcel.writeValue(item);
			}
			parcel.writeValue(year);
		}

		/**
		 * Construct via parcel.
		 */
		protected BaseItem(Parcel parcel) {
			album = parcel.readString();
			final int albumartistSize = parcel.readInt();
			albumartist = new ArrayList<String>(albumartistSize);
			for (int i = 0; i < albumartistSize; i++) {
				albumartist.add(parcel.readString());
			}
			final int albumartistidSize = parcel.readInt();
			albumartistid = new ArrayList<Integer>(albumartistidSize);
			for (int i = 0; i < albumartistidSize; i++) {
				albumartistid.add(parcel.readInt());
			}
			albumid = parcel.readInt();
			albumlabel = parcel.readString();
			art = parcel.<MediaModel.Artwork>readParcelable(MediaModel.Artwork.class.getClassLoader());
			final int artistSize = parcel.readInt();
			artist = new ArrayList<String>(artistSize);
			for (int i = 0; i < artistSize; i++) {
				artist.add(parcel.readString());
			}
			final int artistidSize = parcel.readInt();
			artistid = new ArrayList<Integer>(artistidSize);
			for (int i = 0; i < artistidSize; i++) {
				artistid.add(parcel.readInt());
			}
			final int castSize = parcel.readInt();
			cast = new ArrayList<VideoModel.Cast>(castSize);
			for (int i = 0; i < castSize; i++) {
				cast.add(parcel.<VideoModel.Cast>readParcelable(VideoModel.Cast.class.getClassLoader()));
			}
			comment = parcel.readString();
			final int countrySize = parcel.readInt();
			country = new ArrayList<String>(countrySize);
			for (int i = 0; i < countrySize; i++) {
				country.add(parcel.readString());
			}
			dateadded = parcel.readString();
			description = parcel.readString();
			final int directorSize = parcel.readInt();
			director = new ArrayList<String>(directorSize);
			for (int i = 0; i < directorSize; i++) {
				director.add(parcel.readString());
			}
			disc = parcel.readInt();
			displayartist = parcel.readString();
			duration = parcel.readInt();
			episode = parcel.readInt();
			episodeguide = parcel.readString();
			fanart = parcel.readString();
			file = parcel.readString();
			firstaired = parcel.readString();
			final int genreSize = parcel.readInt();
			genre = new ArrayList<String>(genreSize);
			for (int i = 0; i < genreSize; i++) {
				genre.add(parcel.readString());
			}
			final int genreidSize = parcel.readInt();
			genreid = new ArrayList<Integer>(genreidSize);
			for (int i = 0; i < genreidSize; i++) {
				genreid.add(parcel.readInt());
			}
			id = parcel.readInt();
			imdbnumber = parcel.readString();
			label = parcel.readString();
			lastplayed = parcel.readString();
			lyrics = parcel.readString();
			final int moodSize = parcel.readInt();
			mood = new ArrayList<String>(moodSize);
			for (int i = 0; i < moodSize; i++) {
				mood.add(parcel.readString());
			}
			mpaa = parcel.readString();
			musicbrainzalbumartistid = parcel.readString();
			musicbrainzalbumid = parcel.readString();
			musicbrainzartistid = parcel.readString();
			musicbrainztrackid = parcel.readString();
			originaltitle = parcel.readString();
			playcount = parcel.readInt();
			plot = parcel.readString();
			plotoutline = parcel.readString();
			premiered = parcel.readString();
			productioncode = parcel.readString();
			rating = parcel.readInt();
			resume = parcel.<VideoModel.Resume>readParcelable(VideoModel.Resume.class.getClassLoader());
			runtime = parcel.readInt();
			season = parcel.readInt();
			set = parcel.readString();
			setid = parcel.readInt();
			final int showlinkSize = parcel.readInt();
			showlink = new ArrayList<String>(showlinkSize);
			for (int i = 0; i < showlinkSize; i++) {
				showlink.add(parcel.readString());
			}
			showtitle = parcel.readString();
			sorttitle = parcel.readString();
			streamdetails = parcel.<VideoModel.Streams>readParcelable(VideoModel.Streams.class.getClassLoader());
			final int studioSize = parcel.readInt();
			studio = new ArrayList<String>(studioSize);
			for (int i = 0; i < studioSize; i++) {
				studio.add(parcel.readString());
			}
			final int styleSize = parcel.readInt();
			style = new ArrayList<String>(styleSize);
			for (int i = 0; i < styleSize; i++) {
				style.add(parcel.readString());
			}
			final int tagSize = parcel.readInt();
			tag = new ArrayList<String>(tagSize);
			for (int i = 0; i < tagSize; i++) {
				tag.add(parcel.readString());
			}
			tagline = parcel.readString();
			final int themeSize = parcel.readInt();
			theme = new ArrayList<String>(themeSize);
			for (int i = 0; i < themeSize; i++) {
				theme.add(parcel.readString());
			}
			thumbnail = parcel.readString();
			title = parcel.readString();
			top250 = parcel.readInt();
			track = parcel.readInt();
			trailer = parcel.readString();
			tvshowid = parcel.readInt();
			type = parcel.readString(); // enum
			final int uniqueidSize = parcel.readInt();
			uniqueid = new HashMap<String, String>();
			for (int i = 0; i < uniqueidSize; i++) {
				uniqueid.put(parcel.readString(), parcel.readString());
			}
			votes = parcel.readString();
			watchedepisodes = parcel.readInt();
			final int writerSize = parcel.readInt();
			writer = new ArrayList<String>(writerSize);
			for (int i = 0; i < writerSize; i++) {
				writer.add(parcel.readString());
			}
			year = parcel.readInt();
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<BaseItem> CREATOR = new Parcelable.Creator<BaseItem>() {
			@Override
			public BaseItem createFromParcel(Parcel parcel) {
				return new BaseItem(parcel);
			}
			@Override
			public BaseItem[] newArray(int n) {
				return new BaseItem[n];
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

			public final String UNKNOWN = "unknown";
			public final String MOVIE = "movie";
			public final String EPISODE = "episode";
			public final String MUSICVIDEO = "musicvideo";
			public final String SONG = "song";
			public final String PICTURE = "picture";
			public final String CHANNEL = "channel";

			public final static Set<String> values = new HashSet<String>(Arrays.asList(UNKNOWN, MOVIE, EPISODE, MUSICVIDEO, SONG, PICTURE, CHANNEL));
		}
	}

	/**
	 * API Name: <tt>List.Item.File</tt>
	 * <p/>
	 * Note: This class is used as result only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class FileItem extends BaseItem {
		public final static String API_TYPE = "List.Item.File";

		// field names
		public static final String FILE = "file";
		public static final String FILETYPE = "filetype";
		public static final String LASTMODIFIED = "lastmodified";
		public static final String MIMETYPE = "mimetype";
		public static final String SIZE = "size";

		// class members
		public final String file;
		public final String filetype;
		public final String lastmodified;
		public final String mimetype;
		public final Integer size;

		/**
		 * Construct from JSON object.
		 * @param node JSON object representing a FileItem object
		 */
		public FileItem(JsonNode node) {
			super(node);
			file = node.get(FILE).getTextValue(); // required value
			filetype = parseString(node, FILETYPE);
			lastmodified = parseString(node, LASTMODIFIED);
			mimetype = parseString(node, MIMETYPE);
			size = parseInt(node, SIZE);
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = (ObjectNode)super.toJsonNode();
			node.put(FILE, file);
			node.put(FILETYPE, filetype); // enum
			node.put(LASTMODIFIED, lastmodified);
			node.put(MIMETYPE, mimetype);
			node.put(SIZE, size);
			return node;
		}

		/**
		 * Extracts a list of {@link FileItem} objects from a JSON array.
		 * @param node ObjectNode containing the list of objects.
		 * @param key Key pointing to the node where the list is stored.
		 */
		static List<FileItem> getListModelFileItemList(JsonNode node, String key) {
			if (node.has(key)) {
				final ArrayNode a = (ArrayNode)node.get(key);
				final List<FileItem> l = new ArrayList<FileItem>(a.size());
				for (int i = 0; i < a.size(); i++) {
					l.add(new FileItem((JsonNode)a.get(i)));
				}
				return l;
			}
			return new ArrayList<FileItem>(0);
		}

		/**
		 * Flatten this object into a Parcel.
		 * @param parcel the Parcel in which the object should be written.
		 * @param flags additional flags about how the object should be written.
		 */
		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(file);
			parcel.writeValue(filetype); // enum
			parcel.writeValue(lastmodified);
			parcel.writeValue(mimetype);
			parcel.writeValue(size);
		}

		/**
		 * Construct via parcel.
		 */
		protected FileItem(Parcel parcel) {
			super(parcel);
			file = parcel.readString();
			filetype = parcel.readString(); // enum
			lastmodified = parcel.readString();
			mimetype = parcel.readString();
			size = parcel.readInt();
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<FileItem> CREATOR = new Parcelable.Creator<FileItem>() {
			@Override
			public FileItem createFromParcel(Parcel parcel) {
				return new FileItem(parcel);
			}
			@Override
			public FileItem[] newArray(int n) {
				return new FileItem[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}

		/**
		 * API Name: <tt>filetype</tt>
		 */
		public interface Filetype {

			public final String FILE = "file";
			public final String DIRECTORY = "directory";

			public final static Set<String> values = new HashSet<String>(Arrays.asList(FILE, DIRECTORY));
		}
	}

	/**
	 * API Name: <tt>null</tt>
	 * <p/>
	 * Note: This class is used as result only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class SourceItem extends ItemModel.BaseDetail {

		// field names
		public static final String FILE = "file";

		// class members
		public final String file;

		/**
		 * Construct from JSON object.
		 * @param node JSON object representing a SourceItem object
		 */
		public SourceItem(JsonNode node) {
			super(node);
			file = node.get(FILE).getTextValue(); // required value
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = (ObjectNode)super.toJsonNode();
			node.put(FILE, file);
			return node;
		}

		/**
		 * Extracts a list of {@link SourceItem} objects from a JSON array.
		 * @param node ObjectNode containing the list of objects.
		 * @param key Key pointing to the node where the list is stored.
		 */
		static List<SourceItem> getListModelSourceItemList(JsonNode node, String key) {
			if (node.has(key)) {
				final ArrayNode a = (ArrayNode)node.get(key);
				final List<SourceItem> l = new ArrayList<SourceItem>(a.size());
				for (int i = 0; i < a.size(); i++) {
					l.add(new SourceItem((JsonNode)a.get(i)));
				}
				return l;
			}
			return new ArrayList<SourceItem>(0);
		}

		/**
		 * Flatten this object into a Parcel.
		 * @param parcel the Parcel in which the object should be written.
		 * @param flags additional flags about how the object should be written.
		 */
		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(file);
		}

		/**
		 * Construct via parcel.
		 */
		protected SourceItem(Parcel parcel) {
			super(parcel);
			file = parcel.readString();
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<SourceItem> CREATOR = new Parcelable.Creator<SourceItem>() {
			@Override
			public SourceItem createFromParcel(Parcel parcel) {
				return new SourceItem(parcel);
			}
			@Override
			public SourceItem[] newArray(int n) {
				return new SourceItem[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}
	}

	/**
	 * Limits are applied after getting the directory content thus retrieval is not faster when they are applied.
	 * <p/>
	 * API Name: <tt>List.Limits</tt>
	 * <p/>
	 * Note: This class is used as parameter only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class Limits extends AbstractModel {
		public final static String API_TYPE = "List.Limits";

		// field names
		public static final String END = "end";
		public static final String START = "start";

		// class members
		public final Integer end;
		public final Integer start;

		/**
		 * Limits are applied after getting the directory content thus retrieval is not faster when they are applied.
		 * @param end
		 * @param start
		 */
		public Limits(Integer end, Integer start) {
			this.end = end;
			this.start = start;
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = OM.createObjectNode();
			node.put(END, end);
			node.put(START, start);
			return node;
		}

		/**
		 * Flatten this object into a Parcel.
		 * @param parcel the Parcel in which the object should be written.
		 * @param flags additional flags about how the object should be written.
		 */
		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			parcel.writeValue(end);
			parcel.writeValue(start);
		}

		/**
		 * Construct via parcel.
		 */
		protected Limits(Parcel parcel) {
			end = parcel.readInt();
			start = parcel.readInt();
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<Limits> CREATOR = new Parcelable.Creator<Limits>() {
			@Override
			public Limits createFromParcel(Parcel parcel) {
				return new Limits(parcel);
			}
			@Override
			public Limits[] newArray(int n) {
				return new Limits[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}
	}

	/**
	 * API Name: <tt>List.LimitsReturned</tt>
	 * <p/>
	 * Note: This class is used as result only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class LimitsReturned extends AbstractModel {
		public final static String API_TYPE = "List.LimitsReturned";

		// field names
		public static final String END = "end";
		public static final String START = "start";
		public static final String TOTAL = "total";

		// class members
		public final Integer end;
		public final Integer start;
		public final Integer total;

		/**
		 * @param end
		 * @param start
		 * @param total
		 */
		public LimitsReturned(Integer end, Integer start, Integer total) {
			this.end = end;
			this.start = start;
			this.total = total;
		}

		/**
		 * Construct from JSON object.
		 * @param node JSON object representing a LimitsReturned object
		 */
		public LimitsReturned(JsonNode node) {
			end = parseInt(node, END);
			start = parseInt(node, START);
			total = node.get(TOTAL).getIntValue(); // required value
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = OM.createObjectNode();
			node.put(END, end);
			node.put(START, start);
			node.put(TOTAL, total);
			return node;
		}

		/**
		 * Extracts a list of {@link LimitsReturned} objects from a JSON array.
		 * @param node ObjectNode containing the list of objects.
		 * @param key Key pointing to the node where the list is stored.
		 */
		static List<LimitsReturned> getListModelLimitsReturnedList(JsonNode node, String key) {
			if (node.has(key)) {
				final ArrayNode a = (ArrayNode)node.get(key);
				final List<LimitsReturned> l = new ArrayList<LimitsReturned>(a.size());
				for (int i = 0; i < a.size(); i++) {
					l.add(new LimitsReturned((JsonNode)a.get(i)));
				}
				return l;
			}
			return new ArrayList<LimitsReturned>(0);
		}

		/**
		 * Flatten this object into a Parcel.
		 * @param parcel the Parcel in which the object should be written.
		 * @param flags additional flags about how the object should be written.
		 */
		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			parcel.writeValue(end);
			parcel.writeValue(start);
			parcel.writeValue(total);
		}

		/**
		 * Construct via parcel.
		 */
		protected LimitsReturned(Parcel parcel) {
			end = parcel.readInt();
			start = parcel.readInt();
			total = parcel.readInt();
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<LimitsReturned> CREATOR = new Parcelable.Creator<LimitsReturned>() {
			@Override
			public LimitsReturned createFromParcel(Parcel parcel) {
				return new LimitsReturned(parcel);
			}
			@Override
			public LimitsReturned[] newArray(int n) {
				return new LimitsReturned[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}
	}

	/**
	 * API Name: <tt>List.Sort</tt>
	 * <p/>
	 * Note: This class is used as parameter only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class Sort extends AbstractModel {
		public final static String API_TYPE = "List.Sort";

		// field names
		public static final String IGNOREARTICLE = "ignorearticle";
		public static final String METHOD = "method";
		public static final String ORDER = "order";

		// class members
		public final Boolean ignorearticle;
		public final String method;
		public final String order;

		/**
		 * @param ignorearticle
		 * @param method One of: <tt>none</tt>, <tt>label</tt>, <tt>date</tt>, <tt>size</tt>, <tt>file</tt>, <tt>path</tt>, <tt>drivetype</tt>, <tt>title</tt>, <tt>track</tt>, <tt>time</tt>, <tt>artist</tt>, <tt>album</tt>, <tt>albumtype</tt>, <tt>genre</tt>, <tt>country</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>votes</tt>, <tt>top250</tt>, <tt>programcount</tt>, <tt>playlist</tt>, <tt>episode</tt>, <tt>season</tt>, <tt>totalepisodes</tt>, <tt>watchedepisodes</tt>, <tt>tvshowstatus</tt>, <tt>tvshowtitle</tt>, <tt>sorttitle</tt>, <tt>productioncode</tt>, <tt>mpaa</tt>, <tt>studio</tt>, <tt>dateadded</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>listeners</tt>, <tt>bitrate</tt>, <tt>random</tt>. See constants at {@link ListModel.Sort.Method}.
		 * @param order One of: <tt>ascending</tt>, <tt>descending</tt>. See constants at {@link ListModel.Sort.Order}.
		 */
		public Sort(Boolean ignorearticle, String method, String order) {
			this.ignorearticle = ignorearticle;
			this.method = method;
			this.order = order;
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = OM.createObjectNode();
			node.put(IGNOREARTICLE, ignorearticle);
			node.put(METHOD, method); // enum
			node.put(ORDER, order); // enum
			return node;
		}

		/**
		 * Flatten this object into a Parcel.
		 * @param parcel the Parcel in which the object should be written.
		 * @param flags additional flags about how the object should be written.
		 */
		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			parcel.writeInt(ignorearticle ? 1 : 0);
			parcel.writeValue(method); // enum
			parcel.writeValue(order); // enum
		}

		/**
		 * Construct via parcel.
		 */
		protected Sort(Parcel parcel) {
			ignorearticle = parcel.readInt() == 1;
			method = parcel.readString(); // enum
			order = parcel.readString(); // enum
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<Sort> CREATOR = new Parcelable.Creator<Sort>() {
			@Override
			public Sort createFromParcel(Parcel parcel) {
				return new Sort(parcel);
			}
			@Override
			public Sort[] newArray(int n) {
				return new Sort[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}

		/**
		 * API Name: <tt>order</tt>
		 */
		public interface Order {

			public final String ASCENDING = "ascending";
			public final String DESCENDING = "descending";

			public final static Set<String> values = new HashSet<String>(Arrays.asList(ASCENDING, DESCENDING));
		}

		/**
		 * API Name: <tt>method</tt>
		 */
		public interface Method {

			public final String NONE = "none";
			public final String LABEL = "label";
			public final String DATE = "date";
			public final String SIZE = "size";
			public final String FILE = "file";
			public final String PATH = "path";
			public final String DRIVETYPE = "drivetype";
			public final String TITLE = "title";
			public final String TRACK = "track";
			public final String TIME = "time";
			public final String ARTIST = "artist";
			public final String ALBUM = "album";
			public final String ALBUMTYPE = "albumtype";
			public final String GENRE = "genre";
			public final String COUNTRY = "country";
			public final String YEAR = "year";
			public final String RATING = "rating";
			public final String VOTES = "votes";
			public final String TOP250 = "top250";
			public final String PROGRAMCOUNT = "programcount";
			public final String PLAYLIST = "playlist";
			public final String EPISODE = "episode";
			public final String SEASON = "season";
			public final String TOTALEPISODES = "totalepisodes";
			public final String WATCHEDEPISODES = "watchedepisodes";
			public final String TVSHOWSTATUS = "tvshowstatus";
			public final String TVSHOWTITLE = "tvshowtitle";
			public final String SORTTITLE = "sorttitle";
			public final String PRODUCTIONCODE = "productioncode";
			public final String MPAA = "mpaa";
			public final String STUDIO = "studio";
			public final String DATEADDED = "dateadded";
			public final String LASTPLAYED = "lastplayed";
			public final String PLAYCOUNT = "playcount";
			public final String LISTENERS = "listeners";
			public final String BITRATE = "bitrate";
			public final String RANDOM = "random";

			public final static Set<String> values = new HashSet<String>(Arrays.asList(NONE, LABEL, DATE, SIZE, FILE, PATH, DRIVETYPE, TITLE, TRACK, TIME, ARTIST, ALBUM, ALBUMTYPE, GENRE, COUNTRY, YEAR, RATING, VOTES, TOP250, PROGRAMCOUNT, PLAYLIST, EPISODE, SEASON, TOTALEPISODES, WATCHEDEPISODES, TVSHOWSTATUS, TVSHOWTITLE, SORTTITLE, PRODUCTIONCODE, MPAA, STUDIO, DATEADDED, LASTPLAYED, PLAYCOUNT, LISTENERS, BITRATE, RANDOM));
		}
	}

	/**
	 * API Name: <tt>List.Fields.All</tt>
	 */
	public interface AllFields {

		public final String TITLE = "title";
		public final String ARTIST = "artist";
		public final String ALBUMARTIST = "albumartist";
		public final String GENRE = "genre";
		public final String YEAR = "year";
		public final String RATING = "rating";
		public final String ALBUM = "album";
		public final String TRACK = "track";
		public final String DURATION = "duration";
		public final String COMMENT = "comment";
		public final String LYRICS = "lyrics";
		public final String MUSICBRAINZTRACKID = "musicbrainztrackid";
		public final String MUSICBRAINZARTISTID = "musicbrainzartistid";
		public final String MUSICBRAINZALBUMID = "musicbrainzalbumid";
		public final String MUSICBRAINZALBUMARTISTID = "musicbrainzalbumartistid";
		public final String PLAYCOUNT = "playcount";
		public final String FANART = "fanart";
		public final String DIRECTOR = "director";
		public final String TRAILER = "trailer";
		public final String TAGLINE = "tagline";
		public final String PLOT = "plot";
		public final String PLOTOUTLINE = "plotoutline";
		public final String ORIGINALTITLE = "originaltitle";
		public final String LASTPLAYED = "lastplayed";
		public final String WRITER = "writer";
		public final String STUDIO = "studio";
		public final String MPAA = "mpaa";
		public final String CAST = "cast";
		public final String COUNTRY = "country";
		public final String IMDBNUMBER = "imdbnumber";
		public final String PREMIERED = "premiered";
		public final String PRODUCTIONCODE = "productioncode";
		public final String RUNTIME = "runtime";
		public final String SET = "set";
		public final String SHOWLINK = "showlink";
		public final String STREAMDETAILS = "streamdetails";
		public final String TOP250 = "top250";
		public final String VOTES = "votes";
		public final String FIRSTAIRED = "firstaired";
		public final String SEASON = "season";
		public final String EPISODE = "episode";
		public final String SHOWTITLE = "showtitle";
		public final String THUMBNAIL = "thumbnail";
		public final String FILE = "file";
		public final String RESUME = "resume";
		public final String ARTISTID = "artistid";
		public final String ALBUMID = "albumid";
		public final String TVSHOWID = "tvshowid";
		public final String SETID = "setid";
		public final String WATCHEDEPISODES = "watchedepisodes";
		public final String DISC = "disc";
		public final String TAG = "tag";
		public final String ART = "art";
		public final String GENREID = "genreid";
		public final String DISPLAYARTIST = "displayartist";
		public final String ALBUMARTISTID = "albumartistid";
		public final String DESCRIPTION = "description";
		public final String THEME = "theme";
		public final String MOOD = "mood";
		public final String STYLE = "style";
		public final String ALBUMLABEL = "albumlabel";
		public final String SORTTITLE = "sorttitle";
		public final String EPISODEGUIDE = "episodeguide";
		public final String UNIQUEID = "uniqueid";
		public final String DATEADDED = "dateadded";
		public final String CHANNEL = "channel";
		public final String CHANNELTYPE = "channeltype";
		public final String HIDDEN = "hidden";
		public final String LOCKED = "locked";
		public final String CHANNELNUMBER = "channelnumber";
		public final String STARTTIME = "starttime";
		public final String ENDTIME = "endtime";

		public final static Set<String> values = new HashSet<String>(Arrays.asList(TITLE, ARTIST, ALBUMARTIST, GENRE, YEAR, RATING, ALBUM, TRACK, DURATION, COMMENT, LYRICS, MUSICBRAINZTRACKID, MUSICBRAINZARTISTID, MUSICBRAINZALBUMID, MUSICBRAINZALBUMARTISTID, PLAYCOUNT, FANART, DIRECTOR, TRAILER, TAGLINE, PLOT, PLOTOUTLINE, ORIGINALTITLE, LASTPLAYED, WRITER, STUDIO, MPAA, CAST, COUNTRY, IMDBNUMBER, PREMIERED, PRODUCTIONCODE, RUNTIME, SET, SHOWLINK, STREAMDETAILS, TOP250, VOTES, FIRSTAIRED, SEASON, EPISODE, SHOWTITLE, THUMBNAIL, FILE, RESUME, ARTISTID, ALBUMID, TVSHOWID, SETID, WATCHEDEPISODES, DISC, TAG, ART, GENREID, DISPLAYARTIST, ALBUMARTISTID, DESCRIPTION, THEME, MOOD, STYLE, ALBUMLABEL, SORTTITLE, EPISODEGUIDE, UNIQUEID, DATEADDED, CHANNEL, CHANNELTYPE, HIDDEN, LOCKED, CHANNELNUMBER, STARTTIME, ENDTIME));
	}

	/**
	 * API Name: <tt>List.Fields.Files</tt>
	 */
	public interface FileFields {

		public final String TITLE = "title";
		public final String ARTIST = "artist";
		public final String ALBUMARTIST = "albumartist";
		public final String GENRE = "genre";
		public final String YEAR = "year";
		public final String RATING = "rating";
		public final String ALBUM = "album";
		public final String TRACK = "track";
		public final String DURATION = "duration";
		public final String COMMENT = "comment";
		public final String LYRICS = "lyrics";
		public final String MUSICBRAINZTRACKID = "musicbrainztrackid";
		public final String MUSICBRAINZARTISTID = "musicbrainzartistid";
		public final String MUSICBRAINZALBUMID = "musicbrainzalbumid";
		public final String MUSICBRAINZALBUMARTISTID = "musicbrainzalbumartistid";
		public final String PLAYCOUNT = "playcount";
		public final String FANART = "fanart";
		public final String DIRECTOR = "director";
		public final String TRAILER = "trailer";
		public final String TAGLINE = "tagline";
		public final String PLOT = "plot";
		public final String PLOTOUTLINE = "plotoutline";
		public final String ORIGINALTITLE = "originaltitle";
		public final String LASTPLAYED = "lastplayed";
		public final String WRITER = "writer";
		public final String STUDIO = "studio";
		public final String MPAA = "mpaa";
		public final String CAST = "cast";
		public final String COUNTRY = "country";
		public final String IMDBNUMBER = "imdbnumber";
		public final String PREMIERED = "premiered";
		public final String PRODUCTIONCODE = "productioncode";
		public final String RUNTIME = "runtime";
		public final String SET = "set";
		public final String SHOWLINK = "showlink";
		public final String STREAMDETAILS = "streamdetails";
		public final String TOP250 = "top250";
		public final String VOTES = "votes";
		public final String FIRSTAIRED = "firstaired";
		public final String SEASON = "season";
		public final String EPISODE = "episode";
		public final String SHOWTITLE = "showtitle";
		public final String THUMBNAIL = "thumbnail";
		public final String FILE = "file";
		public final String RESUME = "resume";
		public final String ARTISTID = "artistid";
		public final String ALBUMID = "albumid";
		public final String TVSHOWID = "tvshowid";
		public final String SETID = "setid";
		public final String WATCHEDEPISODES = "watchedepisodes";
		public final String DISC = "disc";
		public final String TAG = "tag";
		public final String ART = "art";
		public final String GENREID = "genreid";
		public final String DISPLAYARTIST = "displayartist";
		public final String ALBUMARTISTID = "albumartistid";
		public final String DESCRIPTION = "description";
		public final String THEME = "theme";
		public final String MOOD = "mood";
		public final String STYLE = "style";
		public final String ALBUMLABEL = "albumlabel";
		public final String SORTTITLE = "sorttitle";
		public final String EPISODEGUIDE = "episodeguide";
		public final String UNIQUEID = "uniqueid";
		public final String DATEADDED = "dateadded";
		public final String SIZE = "size";
		public final String LASTMODIFIED = "lastmodified";
		public final String MIMETYPE = "mimetype";

		public final static Set<String> values = new HashSet<String>(Arrays.asList(TITLE, ARTIST, ALBUMARTIST, GENRE, YEAR, RATING, ALBUM, TRACK, DURATION, COMMENT, LYRICS, MUSICBRAINZTRACKID, MUSICBRAINZARTISTID, MUSICBRAINZALBUMID, MUSICBRAINZALBUMARTISTID, PLAYCOUNT, FANART, DIRECTOR, TRAILER, TAGLINE, PLOT, PLOTOUTLINE, ORIGINALTITLE, LASTPLAYED, WRITER, STUDIO, MPAA, CAST, COUNTRY, IMDBNUMBER, PREMIERED, PRODUCTIONCODE, RUNTIME, SET, SHOWLINK, STREAMDETAILS, TOP250, VOTES, FIRSTAIRED, SEASON, EPISODE, SHOWTITLE, THUMBNAIL, FILE, RESUME, ARTISTID, ALBUMID, TVSHOWID, SETID, WATCHEDEPISODES, DISC, TAG, ART, GENREID, DISPLAYARTIST, ALBUMARTISTID, DESCRIPTION, THEME, MOOD, STYLE, ALBUMLABEL, SORTTITLE, EPISODEGUIDE, UNIQUEID, DATEADDED, SIZE, LASTMODIFIED, MIMETYPE));
	}

	/**
	 * API Name: <tt>List.Filter.Fields.Albums</tt>
	 */
	public interface AlbumFilterFields {

		public final String GENRE = "genre";
		public final String ALBUM = "album";
		public final String ARTIST = "artist";
		public final String ALBUMARTIST = "albumartist";
		public final String YEAR = "year";
		public final String REVIEW = "review";
		public final String THEMES = "themes";
		public final String MOODS = "moods";
		public final String STYLES = "styles";
		public final String TYPE = "type";
		public final String LABEL = "label";
		public final String RATING = "rating";
		public final String PLAYCOUNT = "playcount";
		public final String PLAYLIST = "playlist";
		public final String VIRTUALFOLDER = "virtualfolder";

		public final static Set<String> values = new HashSet<String>(Arrays.asList(GENRE, ALBUM, ARTIST, ALBUMARTIST, YEAR, REVIEW, THEMES, MOODS, STYLES, TYPE, LABEL, RATING, PLAYCOUNT, PLAYLIST, VIRTUALFOLDER));
	}

	/**
	 * API Name: <tt>List.Filter.Fields.Artists</tt>
	 */
	public interface ArtistFilterFields {

		public final String ARTIST = "artist";
		public final String GENRE = "genre";
		public final String MOODS = "moods";
		public final String STYLES = "styles";
		public final String INSTRUMENTS = "instruments";
		public final String BIOGRAPHY = "biography";
		public final String BORN = "born";
		public final String BANDFORMED = "bandformed";
		public final String DISBANDED = "disbanded";
		public final String DIED = "died";
		public final String PLAYLIST = "playlist";
		public final String VIRTUALFOLDER = "virtualfolder";

		public final static Set<String> values = new HashSet<String>(Arrays.asList(ARTIST, GENRE, MOODS, STYLES, INSTRUMENTS, BIOGRAPHY, BORN, BANDFORMED, DISBANDED, DIED, PLAYLIST, VIRTUALFOLDER));
	}

	/**
	 * API Name: <tt>List.Filter.Fields.Episodes</tt>
	 */
	public interface EpisodeFilterFields {

		public final String TITLE = "title";
		public final String TVSHOW = "tvshow";
		public final String PLOT = "plot";
		public final String VOTES = "votes";
		public final String RATING = "rating";
		public final String TIME = "time";
		public final String WRITERS = "writers";
		public final String AIRDATE = "airdate";
		public final String PLAYCOUNT = "playcount";
		public final String LASTPLAYED = "lastplayed";
		public final String INPROGRESS = "inprogress";
		public final String GENRE = "genre";
		public final String YEAR = "year";
		public final String DIRECTOR = "director";
		public final String ACTOR = "actor";
		public final String EPISODE = "episode";
		public final String SEASON = "season";
		public final String FILENAME = "filename";
		public final String PATH = "path";
		public final String STUDIO = "studio";
		public final String MPAARATING = "mpaarating";
		public final String DATEADDED = "dateadded";
		public final String VIDEORESOLUTION = "videoresolution";
		public final String AUDIOCHANNELS = "audiochannels";
		public final String VIDEOCODEC = "videocodec";
		public final String AUDIOCODEC = "audiocodec";
		public final String AUDIOLANGUAGE = "audiolanguage";
		public final String SUBTITLELANGUAGE = "subtitlelanguage";
		public final String VIDEOASPECT = "videoaspect";
		public final String PLAYLIST = "playlist";
		public final String VIRTUALFOLDER = "virtualfolder";

		public final static Set<String> values = new HashSet<String>(Arrays.asList(TITLE, TVSHOW, PLOT, VOTES, RATING, TIME, WRITERS, AIRDATE, PLAYCOUNT, LASTPLAYED, INPROGRESS, GENRE, YEAR, DIRECTOR, ACTOR, EPISODE, SEASON, FILENAME, PATH, STUDIO, MPAARATING, DATEADDED, VIDEORESOLUTION, AUDIOCHANNELS, VIDEOCODEC, AUDIOCODEC, AUDIOLANGUAGE, SUBTITLELANGUAGE, VIDEOASPECT, PLAYLIST, VIRTUALFOLDER));
	}

	/**
	 * API Name: <tt>List.Filter.Fields.Movies</tt>
	 */
	public interface MovieFilterFields {

		public final String TITLE = "title";
		public final String PLOT = "plot";
		public final String PLOTOUTLINE = "plotoutline";
		public final String TAGLINE = "tagline";
		public final String VOTES = "votes";
		public final String RATING = "rating";
		public final String TIME = "time";
		public final String WRITERS = "writers";
		public final String PLAYCOUNT = "playcount";
		public final String LASTPLAYED = "lastplayed";
		public final String INPROGRESS = "inprogress";
		public final String GENRE = "genre";
		public final String COUNTRY = "country";
		public final String YEAR = "year";
		public final String DIRECTOR = "director";
		public final String ACTOR = "actor";
		public final String MPAARATING = "mpaarating";
		public final String TOP250 = "top250";
		public final String STUDIO = "studio";
		public final String HASTRAILER = "hastrailer";
		public final String FILENAME = "filename";
		public final String PATH = "path";
		public final String SET = "set";
		public final String TAG = "tag";
		public final String DATEADDED = "dateadded";
		public final String VIDEORESOLUTION = "videoresolution";
		public final String AUDIOCHANNELS = "audiochannels";
		public final String VIDEOCODEC = "videocodec";
		public final String AUDIOCODEC = "audiocodec";
		public final String AUDIOLANGUAGE = "audiolanguage";
		public final String SUBTITLELANGUAGE = "subtitlelanguage";
		public final String VIDEOASPECT = "videoaspect";
		public final String PLAYLIST = "playlist";
		public final String VIRTUALFOLDER = "virtualfolder";

		public final static Set<String> values = new HashSet<String>(Arrays.asList(TITLE, PLOT, PLOTOUTLINE, TAGLINE, VOTES, RATING, TIME, WRITERS, PLAYCOUNT, LASTPLAYED, INPROGRESS, GENRE, COUNTRY, YEAR, DIRECTOR, ACTOR, MPAARATING, TOP250, STUDIO, HASTRAILER, FILENAME, PATH, SET, TAG, DATEADDED, VIDEORESOLUTION, AUDIOCHANNELS, VIDEOCODEC, AUDIOCODEC, AUDIOLANGUAGE, SUBTITLELANGUAGE, VIDEOASPECT, PLAYLIST, VIRTUALFOLDER));
	}

	/**
	 * API Name: <tt>List.Filter.Fields.MusicVideos</tt>
	 */
	public interface MusicVideoFilterFields {

		public final String TITLE = "title";
		public final String GENRE = "genre";
		public final String ALBUM = "album";
		public final String YEAR = "year";
		public final String ARTIST = "artist";
		public final String FILENAME = "filename";
		public final String PATH = "path";
		public final String PLAYCOUNT = "playcount";
		public final String LASTPLAYED = "lastplayed";
		public final String TIME = "time";
		public final String DIRECTOR = "director";
		public final String STUDIO = "studio";
		public final String PLOT = "plot";
		public final String TAG = "tag";
		public final String DATEADDED = "dateadded";
		public final String VIDEORESOLUTION = "videoresolution";
		public final String AUDIOCHANNELS = "audiochannels";
		public final String VIDEOCODEC = "videocodec";
		public final String AUDIOCODEC = "audiocodec";
		public final String AUDIOLANGUAGE = "audiolanguage";
		public final String SUBTITLELANGUAGE = "subtitlelanguage";
		public final String VIDEOASPECT = "videoaspect";
		public final String PLAYLIST = "playlist";
		public final String VIRTUALFOLDER = "virtualfolder";

		public final static Set<String> values = new HashSet<String>(Arrays.asList(TITLE, GENRE, ALBUM, YEAR, ARTIST, FILENAME, PATH, PLAYCOUNT, LASTPLAYED, TIME, DIRECTOR, STUDIO, PLOT, TAG, DATEADDED, VIDEORESOLUTION, AUDIOCHANNELS, VIDEOCODEC, AUDIOCODEC, AUDIOLANGUAGE, SUBTITLELANGUAGE, VIDEOASPECT, PLAYLIST, VIRTUALFOLDER));
	}

	/**
	 * API Name: <tt>List.Filter.Fields.Songs</tt>
	 */
	public interface SongFilterFields {

		public final String GENRE = "genre";
		public final String ALBUM = "album";
		public final String ARTIST = "artist";
		public final String ALBUMARTIST = "albumartist";
		public final String TITLE = "title";
		public final String YEAR = "year";
		public final String TIME = "time";
		public final String TRACKNUMBER = "tracknumber";
		public final String FILENAME = "filename";
		public final String PATH = "path";
		public final String PLAYCOUNT = "playcount";
		public final String LASTPLAYED = "lastplayed";
		public final String RATING = "rating";
		public final String COMMENT = "comment";
		public final String PLAYLIST = "playlist";
		public final String VIRTUALFOLDER = "virtualfolder";

		public final static Set<String> values = new HashSet<String>(Arrays.asList(GENRE, ALBUM, ARTIST, ALBUMARTIST, TITLE, YEAR, TIME, TRACKNUMBER, FILENAME, PATH, PLAYCOUNT, LASTPLAYED, RATING, COMMENT, PLAYLIST, VIRTUALFOLDER));
	}

	/**
	 * API Name: <tt>List.Filter.Fields.TVShows</tt>
	 */
	public interface TVShowFilterFields {

		public final String TITLE = "title";
		public final String PLOT = "plot";
		public final String STATUS = "status";
		public final String VOTES = "votes";
		public final String RATING = "rating";
		public final String YEAR = "year";
		public final String GENRE = "genre";
		public final String DIRECTOR = "director";
		public final String ACTOR = "actor";
		public final String NUMEPISODES = "numepisodes";
		public final String NUMWATCHED = "numwatched";
		public final String PLAYCOUNT = "playcount";
		public final String PATH = "path";
		public final String STUDIO = "studio";
		public final String MPAARATING = "mpaarating";
		public final String DATEADDED = "dateadded";
		public final String LASTPLAYED = "lastplayed";
		public final String INPROGRESS = "inprogress";
		public final String TAG = "tag";
		public final String PLAYLIST = "playlist";
		public final String VIRTUALFOLDER = "virtualfolder";

		public final static Set<String> values = new HashSet<String>(Arrays.asList(TITLE, PLOT, STATUS, VOTES, RATING, YEAR, GENRE, DIRECTOR, ACTOR, NUMEPISODES, NUMWATCHED, PLAYCOUNT, PATH, STUDIO, MPAARATING, DATEADDED, LASTPLAYED, INPROGRESS, TAG, PLAYLIST, VIRTUALFOLDER));
	}

	/**
	 * API Name: <tt>List.Filter.Operators</tt>
	 */
	public interface OperatorFilters {

		public final String CONTAINS = "contains";
		public final String DOESNOTCONTAIN = "doesnotcontain";
		public final String IS = "is";
		public final String ISNOT = "isnot";
		public final String STARTSWITH = "startswith";
		public final String ENDSWITH = "endswith";
		public final String GREATERTHAN = "greaterthan";
		public final String LESSTHAN = "lessthan";
		public final String AFTER = "after";
		public final String BEFORE = "before";
		public final String INTHELAST = "inthelast";
		public final String NOTINTHELAST = "notinthelast";
		public final String TRUE = "true";
		public final String FALSE = "false";
		public final String BETWEEN = "between";

		public final static Set<String> values = new HashSet<String>(Arrays.asList(CONTAINS, DOESNOTCONTAIN, IS, ISNOT, STARTSWITH, ENDSWITH, GREATERTHAN, LESSTHAN, AFTER, BEFORE, INTHELAST, NOTINTHELAST, TRUE, FALSE, BETWEEN));
	}
}
