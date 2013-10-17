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
import org.xbmc.android.jsonrpc.api.model.ListModel;

public final class Files {

	/**
	 * Get the directories and files in the given directory.
	 * <p/>
	 * This class represents the API method <tt>Files.GetDirectory</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class GetDirectory extends AbstractCall<ListModel.FileItem> {
		public final static String API_TYPE = "Files.GetDirectory";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeParcelable(mResult, flags);
		}

		/**
		 * Construct via parcel.
		 */
		protected GetDirectory(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<GetDirectory> CREATOR = new Parcelable.Creator<GetDirectory>() {
			@Override
			public GetDirectory createFromParcel(Parcel parcel) {
				return new GetDirectory(parcel);
			}
			@Override
			public GetDirectory[] newArray(int n) {
				return new GetDirectory[n];
			}
		};
		public final static String RESULT = "files";

		/**
		 * Get the directories and files in the given directory.
		 * @param directory 
		 * @param media  One of: <tt>video</tt>, <tt>music</tt>, <tt>pictures</tt>, <tt>files</tt>, <tt>programs</tt>. See constants at {@link FilesModel.Media}.
		 * @param sort 
		 * @param limits Limits are applied after getting the directory content thus retrieval is not faster when they are applied.
		 * @param properties  One or more of: <tt>title</tt>, <tt>artist</tt>, <tt>albumartist</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>album</tt>, <tt>track</tt>, <tt>duration</tt>, <tt>comment</tt>, <tt>lyrics</tt>, <tt>musicbrainztrackid</tt>, <tt>musicbrainzartistid</tt>, <tt>musicbrainzalbumid</tt>, <tt>musicbrainzalbumartistid</tt>, <tt>playcount</tt>, <tt>fanart</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>, <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>writer</tt>, <tt>studio</tt>, <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>premiered</tt>, <tt>productioncode</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>, <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>firstaired</tt>, <tt>season</tt>, <tt>episode</tt>, <tt>showtitle</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>artistid</tt>, <tt>albumid</tt>, <tt>tvshowid</tt>, <tt>setid</tt>, <tt>watchedepisodes</tt>, <tt>disc</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>genreid</tt>, <tt>displayartist</tt>, <tt>albumartistid</tt>, <tt>description</tt>, <tt>theme</tt>, <tt>mood</tt>, <tt>style</tt>, <tt>albumlabel</tt>, <tt>sorttitle</tt>, <tt>episodeguide</tt>, <tt>uniqueid</tt>, <tt>dateadded</tt>, <tt>size</tt>, <tt>lastmodified</tt>, <tt>mimetype</tt>. See constants at {@link ListModel.FileFields}.
		 */
		public GetDirectory(String directory, String media, ListModel.Sort sort, ListModel.Limits limits, String... properties) {
			super();
			addParameter("directory", directory);
			addParameter("media", media);
			addParameter("sort", sort);
			addParameter("limits", limits);
			addParameter("properties", properties);
		}

		/**
		 * Get the directories and files in the given directory.
		 * @param directory 
		 * @param properties  One or more of: <tt>title</tt>, <tt>artist</tt>, <tt>albumartist</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>album</tt>, <tt>track</tt>, <tt>duration</tt>, <tt>comment</tt>, <tt>lyrics</tt>, <tt>musicbrainztrackid</tt>, <tt>musicbrainzartistid</tt>, <tt>musicbrainzalbumid</tt>, <tt>musicbrainzalbumartistid</tt>, <tt>playcount</tt>, <tt>fanart</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>, <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>writer</tt>, <tt>studio</tt>, <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>premiered</tt>, <tt>productioncode</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>, <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>firstaired</tt>, <tt>season</tt>, <tt>episode</tt>, <tt>showtitle</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>artistid</tt>, <tt>albumid</tt>, <tt>tvshowid</tt>, <tt>setid</tt>, <tt>watchedepisodes</tt>, <tt>disc</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>genreid</tt>, <tt>displayartist</tt>, <tt>albumartistid</tt>, <tt>description</tt>, <tt>theme</tt>, <tt>mood</tt>, <tt>style</tt>, <tt>albumlabel</tt>, <tt>sorttitle</tt>, <tt>episodeguide</tt>, <tt>uniqueid</tt>, <tt>dateadded</tt>, <tt>size</tt>, <tt>lastmodified</tt>, <tt>mimetype</tt>. See constants at {@link ListModel.FileFields}.
		 */
		public GetDirectory(String directory, String... properties) {
			super();
			addParameter("directory", directory);
			addParameter("properties", properties);
		}

		/**
		 * Get the directories and files in the given directory.
		 * @param directory 
		 * @param media  One of: <tt>video</tt>, <tt>music</tt>, <tt>pictures</tt>, <tt>files</tt>, <tt>programs</tt>. See constants at {@link FilesModel.Media}.
		 * @param properties  One or more of: <tt>title</tt>, <tt>artist</tt>, <tt>albumartist</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>album</tt>, <tt>track</tt>, <tt>duration</tt>, <tt>comment</tt>, <tt>lyrics</tt>, <tt>musicbrainztrackid</tt>, <tt>musicbrainzartistid</tt>, <tt>musicbrainzalbumid</tt>, <tt>musicbrainzalbumartistid</tt>, <tt>playcount</tt>, <tt>fanart</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>, <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>writer</tt>, <tt>studio</tt>, <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>premiered</tt>, <tt>productioncode</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>, <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>firstaired</tt>, <tt>season</tt>, <tt>episode</tt>, <tt>showtitle</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>artistid</tt>, <tt>albumid</tt>, <tt>tvshowid</tt>, <tt>setid</tt>, <tt>watchedepisodes</tt>, <tt>disc</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>genreid</tt>, <tt>displayartist</tt>, <tt>albumartistid</tt>, <tt>description</tt>, <tt>theme</tt>, <tt>mood</tt>, <tt>style</tt>, <tt>albumlabel</tt>, <tt>sorttitle</tt>, <tt>episodeguide</tt>, <tt>uniqueid</tt>, <tt>dateadded</tt>, <tt>size</tt>, <tt>lastmodified</tt>, <tt>mimetype</tt>. See constants at {@link ListModel.FileFields}.
		 */
		public GetDirectory(String directory, String media, String... properties) {
			super();
			addParameter("directory", directory);
			addParameter("media", media);
			addParameter("properties", properties);
		}

		/**
		 * Get the directories and files in the given directory.
		 * @param directory 
		 * @param sort 
		 * @param properties  One or more of: <tt>title</tt>, <tt>artist</tt>, <tt>albumartist</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>album</tt>, <tt>track</tt>, <tt>duration</tt>, <tt>comment</tt>, <tt>lyrics</tt>, <tt>musicbrainztrackid</tt>, <tt>musicbrainzartistid</tt>, <tt>musicbrainzalbumid</tt>, <tt>musicbrainzalbumartistid</tt>, <tt>playcount</tt>, <tt>fanart</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>, <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>writer</tt>, <tt>studio</tt>, <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>premiered</tt>, <tt>productioncode</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>, <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>firstaired</tt>, <tt>season</tt>, <tt>episode</tt>, <tt>showtitle</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>artistid</tt>, <tt>albumid</tt>, <tt>tvshowid</tt>, <tt>setid</tt>, <tt>watchedepisodes</tt>, <tt>disc</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>genreid</tt>, <tt>displayartist</tt>, <tt>albumartistid</tt>, <tt>description</tt>, <tt>theme</tt>, <tt>mood</tt>, <tt>style</tt>, <tt>albumlabel</tt>, <tt>sorttitle</tt>, <tt>episodeguide</tt>, <tt>uniqueid</tt>, <tt>dateadded</tt>, <tt>size</tt>, <tt>lastmodified</tt>, <tt>mimetype</tt>. See constants at {@link ListModel.FileFields}.
		 */
		public GetDirectory(String directory, ListModel.Sort sort, String... properties) {
			super();
			addParameter("directory", directory);
			addParameter("sort", sort);
			addParameter("properties", properties);
		}

		/**
		 * Get the directories and files in the given directory.
		 * @param directory 
		 * @param media  One of: <tt>video</tt>, <tt>music</tt>, <tt>pictures</tt>, <tt>files</tt>, <tt>programs</tt>. See constants at {@link FilesModel.Media}.
		 * @param sort 
		 * @param properties  One or more of: <tt>title</tt>, <tt>artist</tt>, <tt>albumartist</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>album</tt>, <tt>track</tt>, <tt>duration</tt>, <tt>comment</tt>, <tt>lyrics</tt>, <tt>musicbrainztrackid</tt>, <tt>musicbrainzartistid</tt>, <tt>musicbrainzalbumid</tt>, <tt>musicbrainzalbumartistid</tt>, <tt>playcount</tt>, <tt>fanart</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>, <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>writer</tt>, <tt>studio</tt>, <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>premiered</tt>, <tt>productioncode</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>, <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>firstaired</tt>, <tt>season</tt>, <tt>episode</tt>, <tt>showtitle</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>artistid</tt>, <tt>albumid</tt>, <tt>tvshowid</tt>, <tt>setid</tt>, <tt>watchedepisodes</tt>, <tt>disc</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>genreid</tt>, <tt>displayartist</tt>, <tt>albumartistid</tt>, <tt>description</tt>, <tt>theme</tt>, <tt>mood</tt>, <tt>style</tt>, <tt>albumlabel</tt>, <tt>sorttitle</tt>, <tt>episodeguide</tt>, <tt>uniqueid</tt>, <tt>dateadded</tt>, <tt>size</tt>, <tt>lastmodified</tt>, <tt>mimetype</tt>. See constants at {@link ListModel.FileFields}.
		 */
		public GetDirectory(String directory, String media, ListModel.Sort sort, String... properties) {
			super();
			addParameter("directory", directory);
			addParameter("media", media);
			addParameter("sort", sort);
			addParameter("properties", properties);
		}

		/**
		 * Get the directories and files in the given directory.
		 * @param directory 
		 * @param limits Limits are applied after getting the directory content thus retrieval is not faster when they are applied.
		 * @param properties  One or more of: <tt>title</tt>, <tt>artist</tt>, <tt>albumartist</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>album</tt>, <tt>track</tt>, <tt>duration</tt>, <tt>comment</tt>, <tt>lyrics</tt>, <tt>musicbrainztrackid</tt>, <tt>musicbrainzartistid</tt>, <tt>musicbrainzalbumid</tt>, <tt>musicbrainzalbumartistid</tt>, <tt>playcount</tt>, <tt>fanart</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>, <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>writer</tt>, <tt>studio</tt>, <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>premiered</tt>, <tt>productioncode</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>, <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>firstaired</tt>, <tt>season</tt>, <tt>episode</tt>, <tt>showtitle</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>artistid</tt>, <tt>albumid</tt>, <tt>tvshowid</tt>, <tt>setid</tt>, <tt>watchedepisodes</tt>, <tt>disc</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>genreid</tt>, <tt>displayartist</tt>, <tt>albumartistid</tt>, <tt>description</tt>, <tt>theme</tt>, <tt>mood</tt>, <tt>style</tt>, <tt>albumlabel</tt>, <tt>sorttitle</tt>, <tt>episodeguide</tt>, <tt>uniqueid</tt>, <tt>dateadded</tt>, <tt>size</tt>, <tt>lastmodified</tt>, <tt>mimetype</tt>. See constants at {@link ListModel.FileFields}.
		 */
		public GetDirectory(String directory, ListModel.Limits limits, String... properties) {
			super();
			addParameter("directory", directory);
			addParameter("limits", limits);
			addParameter("properties", properties);
		}

		/**
		 * Get the directories and files in the given directory.
		 * @param directory 
		 * @param sort 
		 * @param limits Limits are applied after getting the directory content thus retrieval is not faster when they are applied.
		 * @param properties  One or more of: <tt>title</tt>, <tt>artist</tt>, <tt>albumartist</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>album</tt>, <tt>track</tt>, <tt>duration</tt>, <tt>comment</tt>, <tt>lyrics</tt>, <tt>musicbrainztrackid</tt>, <tt>musicbrainzartistid</tt>, <tt>musicbrainzalbumid</tt>, <tt>musicbrainzalbumartistid</tt>, <tt>playcount</tt>, <tt>fanart</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>, <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>writer</tt>, <tt>studio</tt>, <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>premiered</tt>, <tt>productioncode</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>, <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>firstaired</tt>, <tt>season</tt>, <tt>episode</tt>, <tt>showtitle</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>artistid</tt>, <tt>albumid</tt>, <tt>tvshowid</tt>, <tt>setid</tt>, <tt>watchedepisodes</tt>, <tt>disc</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>genreid</tt>, <tt>displayartist</tt>, <tt>albumartistid</tt>, <tt>description</tt>, <tt>theme</tt>, <tt>mood</tt>, <tt>style</tt>, <tt>albumlabel</tt>, <tt>sorttitle</tt>, <tt>episodeguide</tt>, <tt>uniqueid</tt>, <tt>dateadded</tt>, <tt>size</tt>, <tt>lastmodified</tt>, <tt>mimetype</tt>. See constants at {@link ListModel.FileFields}.
		 */
		public GetDirectory(String directory, ListModel.Sort sort, ListModel.Limits limits, String... properties) {
			super();
			addParameter("directory", directory);
			addParameter("sort", sort);
			addParameter("limits", limits);
			addParameter("properties", properties);
		}

		@Override
		protected ArrayList<ListModel.FileItem> parseMany(JsonNode node) {
			final ArrayNode files = parseResults(node, RESULT);
			if (files != null) {
				final ArrayList<ListModel.FileItem> ret = new ArrayList<ListModel.FileItem>(files.size());
				for (int i = 0; i < files.size(); i++) {
					final ObjectNode item = (ObjectNode)files.get(i);
					ret.add(new ListModel.FileItem(item));
				}
				return ret;
			} else {
				return new ArrayList<ListModel.FileItem>(0);
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
	 * Get details for a specific file.
	 * <p/>
	 * This class represents the API method <tt>Files.GetFileDetails</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class GetFileDetails extends AbstractCall<ListModel.FileItem> {
		public final static String API_TYPE = "Files.GetFileDetails";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeParcelable(mResult, flags);
		}

		/**
		 * Construct via parcel.
		 */
		protected GetFileDetails(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<GetFileDetails> CREATOR = new Parcelable.Creator<GetFileDetails>() {
			@Override
			public GetFileDetails createFromParcel(Parcel parcel) {
				return new GetFileDetails(parcel);
			}
			@Override
			public GetFileDetails[] newArray(int n) {
				return new GetFileDetails[n];
			}
		};
		public final static String RESULT = "filedetails";

		/**
		 * Get details for a specific file.
		 * @param file Full path to the file.
		 * @param media  One of: <tt>video</tt>, <tt>music</tt>, <tt>pictures</tt>, <tt>files</tt>, <tt>programs</tt>. See constants at {@link FilesModel.Media}.
		 * @param properties  One or more of: <tt>title</tt>, <tt>artist</tt>, <tt>albumartist</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>album</tt>, <tt>track</tt>, <tt>duration</tt>, <tt>comment</tt>, <tt>lyrics</tt>, <tt>musicbrainztrackid</tt>, <tt>musicbrainzartistid</tt>, <tt>musicbrainzalbumid</tt>, <tt>musicbrainzalbumartistid</tt>, <tt>playcount</tt>, <tt>fanart</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>, <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>writer</tt>, <tt>studio</tt>, <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>premiered</tt>, <tt>productioncode</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>, <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>firstaired</tt>, <tt>season</tt>, <tt>episode</tt>, <tt>showtitle</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>artistid</tt>, <tt>albumid</tt>, <tt>tvshowid</tt>, <tt>setid</tt>, <tt>watchedepisodes</tt>, <tt>disc</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>genreid</tt>, <tt>displayartist</tt>, <tt>albumartistid</tt>, <tt>description</tt>, <tt>theme</tt>, <tt>mood</tt>, <tt>style</tt>, <tt>albumlabel</tt>, <tt>sorttitle</tt>, <tt>episodeguide</tt>, <tt>uniqueid</tt>, <tt>dateadded</tt>, <tt>size</tt>, <tt>lastmodified</tt>, <tt>mimetype</tt>. See constants at {@link ListModel.FileFields}.
		 */
		public GetFileDetails(String file, String media, String... properties) {
			super();
			addParameter("file", file);
			addParameter("media", media);
			addParameter("properties", properties);
		}

		/**
		 * Get details for a specific file.
		 * @param file Full path to the file.
		 * @param properties  One or more of: <tt>title</tt>, <tt>artist</tt>, <tt>albumartist</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>album</tt>, <tt>track</tt>, <tt>duration</tt>, <tt>comment</tt>, <tt>lyrics</tt>, <tt>musicbrainztrackid</tt>, <tt>musicbrainzartistid</tt>, <tt>musicbrainzalbumid</tt>, <tt>musicbrainzalbumartistid</tt>, <tt>playcount</tt>, <tt>fanart</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>, <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>writer</tt>, <tt>studio</tt>, <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>premiered</tt>, <tt>productioncode</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>, <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>firstaired</tt>, <tt>season</tt>, <tt>episode</tt>, <tt>showtitle</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>artistid</tt>, <tt>albumid</tt>, <tt>tvshowid</tt>, <tt>setid</tt>, <tt>watchedepisodes</tt>, <tt>disc</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>genreid</tt>, <tt>displayartist</tt>, <tt>albumartistid</tt>, <tt>description</tt>, <tt>theme</tt>, <tt>mood</tt>, <tt>style</tt>, <tt>albumlabel</tt>, <tt>sorttitle</tt>, <tt>episodeguide</tt>, <tt>uniqueid</tt>, <tt>dateadded</tt>, <tt>size</tt>, <tt>lastmodified</tt>, <tt>mimetype</tt>. See constants at {@link ListModel.FileFields}.
		 */
		public GetFileDetails(String file, String... properties) {
			super();
			addParameter("file", file);
			addParameter("properties", properties);
		}

		@Override
		protected ListModel.FileItem parseOne(JsonNode node) {
			return new ListModel.FileItem((ObjectNode)node.get(RESULT));
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
	 * Get the sources of the media windows.
	 * <p/>
	 * This class represents the API method <tt>Files.GetSources</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class GetSources extends AbstractCall<ListModel.SourceItem> {
		public final static String API_TYPE = "Files.GetSources";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeParcelable(mResult, flags);
		}

		/**
		 * Construct via parcel.
		 */
		protected GetSources(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<GetSources> CREATOR = new Parcelable.Creator<GetSources>() {
			@Override
			public GetSources createFromParcel(Parcel parcel) {
				return new GetSources(parcel);
			}
			@Override
			public GetSources[] newArray(int n) {
				return new GetSources[n];
			}
		};
		public final static String RESULT = "sources";

		/**
		 * Get the sources of the media windows.
		 * @param media  One of: <tt>video</tt>, <tt>music</tt>, <tt>pictures</tt>, <tt>files</tt>, <tt>programs</tt>. See constants at {@link FilesModel.Media}.
		 * @param limits 
		 * @param sort 
		 */
		public GetSources(String media, ListModel.Limits limits, ListModel.Sort sort) {
			super();
			addParameter("media", media);
			addParameter("limits", limits);
			addParameter("sort", sort);
		}

		/**
		 * Get the sources of the media windows.
		 * @param media  One of: <tt>video</tt>, <tt>music</tt>, <tt>pictures</tt>, <tt>files</tt>, <tt>programs</tt>. See constants at {@link FilesModel.Media}.
		 */
		public GetSources(String media) {
			super();
			addParameter("media", media);
		}

		/**
		 * Get the sources of the media windows.
		 * @param media  One of: <tt>video</tt>, <tt>music</tt>, <tt>pictures</tt>, <tt>files</tt>, <tt>programs</tt>. See constants at {@link FilesModel.Media}.
		 * @param limits 
		 */
		public GetSources(String media, ListModel.Limits limits) {
			super();
			addParameter("media", media);
			addParameter("limits", limits);
		}

		@Override
		protected ArrayList<ListModel.SourceItem> parseMany(JsonNode node) {
			final ArrayNode sources = parseResults(node, RESULT);
			if (sources != null) {
				final ArrayList<ListModel.SourceItem> ret = new ArrayList<ListModel.SourceItem>(sources.size());
				for (int i = 0; i < sources.size(); i++) {
					final ObjectNode item = (ObjectNode)sources.get(i);
					ret.add(new ListModel.SourceItem(item));
				}
				return ret;
			} else {
				return new ArrayList<ListModel.SourceItem>(0);
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
	 * Provides a way to download a given file (e.g. providing an URL to the real file location).
	 * <p/>
	 * This class represents the API method <tt>Files.PrepareDownload</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class PrepareDownload extends AbstractCall<PrepareDownload.PrepareDownloadResult> {
		public final static String API_TYPE = "Files.PrepareDownload";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeParcelable(mResult, flags);
		}

		/**
		 * Construct via parcel.
		 */
		protected PrepareDownload(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<PrepareDownload> CREATOR = new Parcelable.Creator<PrepareDownload>() {
			@Override
			public PrepareDownload createFromParcel(Parcel parcel) {
				return new PrepareDownload(parcel);
			}
			@Override
			public PrepareDownload[] newArray(int n) {
				return new PrepareDownload[n];
			}
		};

		/**
		 * Provides a way to download a given file (e.g. providing an URL to the real file location).
		 * @param path 
		 */
		public PrepareDownload(String path) {
			super();
			addParameter("path", path);
		}

		@Override
		protected PrepareDownloadResult parseOne(JsonNode node) {
			return new PrepareDownloadResult(node);
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
		 * Note: This class is used as result only.<br/>
		 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
		 */
		public static class PrepareDownloadResult extends AbstractModel {

			// field names
			public static final String DETAILS = "details";
			public static final String MODE = "mode";
			public static final String PROTOCOL = "protocol";

			// class members
			public final String details;
			public final String mode;
			public final String protocol;

			/**
			 * @param details
			 * @param mode One of: <tt>redirect</tt>, <tt>direct</tt>. See constants at {@link Files.PrepareDownloadResult.Mode}.
			 * @param protocol One of: <tt>http</tt>. See constants at {@link Files.PrepareDownloadResult.Protocol}.
			 */
			public PrepareDownloadResult(String details, String mode, String protocol) {
				this.details = details;
				this.mode = mode;
				this.protocol = protocol;
			}

			/**
			 * Construct from JSON object.
			 * @param node JSON object representing a PrepareDownloadResult object
			 */
			public PrepareDownloadResult(JsonNode node) {
				details = node.get(DETAILS).getTextValue(); // required value
				mode = parseString(node, MODE);
				protocol = parseString(node, PROTOCOL);
			}

			@Override
			public JsonNode toJsonNode() {
				final ObjectNode node = OM.createObjectNode();
				node.put(DETAILS, details);
				node.put(MODE, mode); // enum
				node.put(PROTOCOL, protocol); // enum
				return node;
			}

			/**
			 * Extracts a list of {@link PrepareDownloadResult} objects from a JSON array.
			 * @param node ObjectNode containing the list of objects.
			 * @param key Key pointing to the node where the list is stored.
			 */
			static List<PrepareDownloadResult> getFilesPrepareDownloadResultList(JsonNode node, String key) {
				if (node.has(key)) {
					final ArrayNode a = (ArrayNode)node.get(key);
					final List<PrepareDownloadResult> l = new ArrayList<PrepareDownloadResult>(a.size());
					for (int i = 0; i < a.size(); i++) {
						l.add(new PrepareDownloadResult((JsonNode)a.get(i)));
					}
					return l;
				}
				return new ArrayList<PrepareDownloadResult>(0);
			}

			/**
			 * Flatten this object into a Parcel.
			 * @param parcel the Parcel in which the object should be written.
			 * @param flags additional flags about how the object should be written.
			 */
			@Override
			public void writeToParcel(Parcel parcel, int flags) {
				parcel.writeValue(details);
				parcel.writeValue(mode); // enum
				parcel.writeValue(protocol); // enum
			}

			/**
			 * Construct via parcel.
			 */
			protected PrepareDownloadResult(Parcel parcel) {
				details = parcel.readString();
				mode = parcel.readString(); // enum
				protocol = parcel.readString(); // enum
			}

			/**
			 * Generates instances of this Parcelable class from a Parcel.
			 */
			public static final Parcelable.Creator<PrepareDownloadResult> CREATOR = new Parcelable.Creator<PrepareDownloadResult>() {
				@Override
				public PrepareDownloadResult createFromParcel(Parcel parcel) {
					return new PrepareDownloadResult(parcel);
				}
				@Override
				public PrepareDownloadResult[] newArray(int n) {
					return new PrepareDownloadResult[n];
				}
			};

			@Override
			public int describeContents() {
				return 0;
			}

			/**
			 * API Name: <tt>protocol</tt>
			 */
			public interface Protocol {

				public final String HTTP = "http";

				public final static Set<String> values = new HashSet<String>(Arrays.asList(HTTP));
			}

			/**
			 * API Name: <tt>mode</tt>
			 */
			public interface Mode {

				public final String REDIRECT = "redirect";
				public final String DIRECT = "direct";

				public final static Set<String> values = new HashSet<String>(Arrays.asList(REDIRECT, DIRECT));
			}
		}
	}
}
