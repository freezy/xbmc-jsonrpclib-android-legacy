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
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.node.ObjectNode;
import org.xbmc.android.jsonrpc.api.AbstractModel;

public final class ConfigurationModel {

	/**
	 * API Name: <tt>Configuration</tt>
	 * <p/>
	 * Note: Seems this class isn't used yet in the API.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class Configuration extends AbstractModel {
		public final static String API_TYPE = "Configuration";

		// field names
		public static final String NOTIFICATIONS = "notifications";

		// class members
		public final Notifications notifications;

		/**
		 * @param notifications
		 */
		public Configuration(Notifications notifications) {
			this.notifications = notifications;
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = OM.createObjectNode();
			node.put(NOTIFICATIONS, notifications.toJsonNode());
			return node;
		}

		/**
		 * Flatten this object into a Parcel.
		 * @param parcel the Parcel in which the object should be written.
		 * @param flags additional flags about how the object should be written.
		 */
		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			parcel.writeValue(notifications);
		}

		/**
		 * Construct via parcel.
		 */
		protected Configuration(Parcel parcel) {
			notifications = parcel.<Notifications>readParcelable(Notifications.class.getClassLoader());
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<Configuration> CREATOR = new Parcelable.Creator<Configuration>() {
			@Override
			public Configuration createFromParcel(Parcel parcel) {
				return new Configuration(parcel);
			}
			@Override
			public Configuration[] newArray(int n) {
				return new Configuration[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}
	}

	/**
	 * API Name: <tt>Configuration.Notifications</tt>
	 * <p/>
	 * Note: Seems this class isn't used yet in the API.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class Notifications extends AbstractModel {
		public final static String API_TYPE = "Configuration.Notifications";

		// field names
		public static final String APPLICATION = "application";
		public static final String AUDIOLIBRARY = "audiolibrary";
		public static final String GUI = "gui";
		public static final String INPUT = "input";
		public static final String OTHER = "other";
		public static final String PLAYER = "player";
		public static final String PLAYLIST = "playlist";
		public static final String PVR = "pvr";
		public static final String SYSTEM = "system";
		public static final String VIDEOLIBRARY = "videolibrary";

		// class members
		public final Boolean application;
		public final Boolean audiolibrary;
		public final Boolean gui;
		public final Boolean input;
		public final Boolean other;
		public final Boolean player;
		public final Boolean playlist;
		public final Boolean pvr;
		public final Boolean system;
		public final Boolean videolibrary;

		/**
		 * @param application
		 * @param audiolibrary
		 * @param gui
		 * @param input
		 * @param other
		 * @param player
		 * @param playlist
		 * @param pvr
		 * @param system
		 * @param videolibrary
		 */
		public Notifications(Boolean application, Boolean audiolibrary, Boolean gui, Boolean input, Boolean other, Boolean player, Boolean playlist, Boolean pvr, Boolean system, Boolean videolibrary) {
			this.application = application;
			this.audiolibrary = audiolibrary;
			this.gui = gui;
			this.input = input;
			this.other = other;
			this.player = player;
			this.playlist = playlist;
			this.pvr = pvr;
			this.system = system;
			this.videolibrary = videolibrary;
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = OM.createObjectNode();
			node.put(APPLICATION, application);
			node.put(AUDIOLIBRARY, audiolibrary);
			node.put(GUI, gui);
			node.put(INPUT, input);
			node.put(OTHER, other);
			node.put(PLAYER, player);
			node.put(PLAYLIST, playlist);
			node.put(PVR, pvr);
			node.put(SYSTEM, system);
			node.put(VIDEOLIBRARY, videolibrary);
			return node;
		}

		/**
		 * Flatten this object into a Parcel.
		 * @param parcel the Parcel in which the object should be written.
		 * @param flags additional flags about how the object should be written.
		 */
		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			parcel.writeInt(application ? 1 : 0);
			parcel.writeInt(audiolibrary ? 1 : 0);
			parcel.writeInt(gui ? 1 : 0);
			parcel.writeInt(input ? 1 : 0);
			parcel.writeInt(other ? 1 : 0);
			parcel.writeInt(player ? 1 : 0);
			parcel.writeInt(playlist ? 1 : 0);
			parcel.writeInt(pvr ? 1 : 0);
			parcel.writeInt(system ? 1 : 0);
			parcel.writeInt(videolibrary ? 1 : 0);
		}

		/**
		 * Construct via parcel.
		 */
		protected Notifications(Parcel parcel) {
			application = parcel.readInt() == 1;
			audiolibrary = parcel.readInt() == 1;
			gui = parcel.readInt() == 1;
			input = parcel.readInt() == 1;
			other = parcel.readInt() == 1;
			player = parcel.readInt() == 1;
			playlist = parcel.readInt() == 1;
			pvr = parcel.readInt() == 1;
			system = parcel.readInt() == 1;
			videolibrary = parcel.readInt() == 1;
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<Notifications> CREATOR = new Parcelable.Creator<Notifications>() {
			@Override
			public Notifications createFromParcel(Parcel parcel) {
				return new Notifications(parcel);
			}
			@Override
			public Notifications[] newArray(int n) {
				return new Notifications[n];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}
	}
}
