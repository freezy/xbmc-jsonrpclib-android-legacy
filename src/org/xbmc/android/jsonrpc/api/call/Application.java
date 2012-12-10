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
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.node.ObjectNode;
import org.xbmc.android.jsonrpc.api.AbstractCall;
import org.xbmc.android.jsonrpc.api.model.ApplicationModel;
import org.xbmc.android.jsonrpc.api.model.GlobalModel;

public final class Application {

	/**
	 * Retrieves the values of the given properties.
	 * <p/>
	 * This class represents the API method <tt>Application.GetProperties</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class GetProperties extends AbstractCall<ApplicationModel.PropertyValue> {
		public final static String API_TYPE = "Application.GetProperties";

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
		 * @param properties One or more of: <tt>volume</tt>, <tt>muted</tt>, <tt>name</tt>, <tt>version</tt>. See constants at {@link ApplicationModel.PropertyName}.
		 */
		public GetProperties(String... properties) {
			super();
			addParameter("properties", properties);
		}

		@Override
		protected ApplicationModel.PropertyValue parseOne(JsonNode node) {
			return new ApplicationModel.PropertyValue(node);
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
	 * Quit application.
	 * <p/>
	 * This class represents the API method <tt>Application.Quit</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class Quit extends AbstractCall<String> {
		public final static String API_TYPE = "Application.Quit";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected Quit(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<Quit> CREATOR = new Parcelable.Creator<Quit>() {
			@Override
			public Quit createFromParcel(Parcel parcel) {
				return new Quit(parcel);
			}
			@Override
			public Quit[] newArray(int n) {
				return new Quit[n];
			}
		};

		/**
		 * Quit application.
		 */
		public Quit() {
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

	/**
	 * Toggle mute/unmute.
	 * <p/>
	 * This class represents the API method <tt>Application.SetMute</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class SetMute extends AbstractCall<Boolean> {
		public final static String API_TYPE = "Application.SetMute";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected SetMute(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<SetMute> CREATOR = new Parcelable.Creator<SetMute>() {
			@Override
			public SetMute createFromParcel(Parcel parcel) {
				return new SetMute(parcel);
			}
			@Override
			public SetMute[] newArray(int n) {
				return new SetMute[n];
			}
		};

		/**
		 * Toggle mute/unmute.
		 * @param mute
		 */
		public SetMute(GlobalModel.Toggle mute) {
			super();
			addParameter("mute", mute);
		}

		@Override
		protected Boolean parseOne(JsonNode node) {
			return node.getBooleanValue();
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
	 * Set the current volume.
	 * <p/>
	 * This class represents the API method <tt>Application.SetVolume</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class SetVolume extends AbstractCall<Integer> {
		public final static String API_TYPE = "Application.SetVolume";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected SetVolume(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<SetVolume> CREATOR = new Parcelable.Creator<SetVolume>() {
			@Override
			public SetVolume createFromParcel(Parcel parcel) {
				return new SetVolume(parcel);
			}
			@Override
			public SetVolume[] newArray(int n) {
				return new SetVolume[n];
			}
		};

		/**
		 * Set the current volume.
		 * @param volume
		 */
		public SetVolume(Integer volume) {
			super();
			addParameter("volume", volume);
		}

		/**
		 * Set the current volume.
		 * @param volume One of: <tt>increment</tt>, <tt>decrement</tt>. See constants at {@link GlobalModel.IncrementDecrement}.
		 */
		public SetVolume(String volume) {
			super();
			addParameter("volume", volume);
		}

		@Override
		protected Integer parseOne(JsonNode node) {
			return node.getIntValue();
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
