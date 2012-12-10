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
import org.xbmc.android.jsonrpc.api.model.SystemModel;

public final class System {

	/**
	 * Ejects or closes the optical disc drive (if available).
	 * <p/>
	 * This class represents the API method <tt>System.EjectOpticalDrive</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class EjectOpticalDrive extends AbstractCall<String> {
		public final static String API_TYPE = "System.EjectOpticalDrive";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected EjectOpticalDrive(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<EjectOpticalDrive> CREATOR = new Parcelable.Creator<EjectOpticalDrive>() {
			@Override
			public EjectOpticalDrive createFromParcel(Parcel parcel) {
				return new EjectOpticalDrive(parcel);
			}
			@Override
			public EjectOpticalDrive[] newArray(int n) {
				return new EjectOpticalDrive[n];
			}
		};

		/**
		 * Ejects or closes the optical disc drive (if available).
		 */
		public EjectOpticalDrive() {
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
	 * Retrieves the values of the given properties.
	 * <p/>
	 * This class represents the API method <tt>System.GetProperties</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class GetProperties extends AbstractCall<SystemModel.PropertyValue> {
		public final static String API_TYPE = "System.GetProperties";

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
		 * @param properties One or more of: <tt>canshutdown</tt>, <tt>cansuspend</tt>, <tt>canhibernate</tt>, <tt>canreboot</tt>. See constants at {@link SystemModel.PropertyName}.
		 */
		public GetProperties(String... properties) {
			super();
			addParameter("properties", properties);
		}

		@Override
		protected SystemModel.PropertyValue parseOne(JsonNode node) {
			return new SystemModel.PropertyValue(node);
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
	 * Puts the system running XBMC into hibernate mode.
	 * <p/>
	 * This class represents the API method <tt>System.Hibernate</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class Hibernate extends AbstractCall<String> {
		public final static String API_TYPE = "System.Hibernate";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected Hibernate(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<Hibernate> CREATOR = new Parcelable.Creator<Hibernate>() {
			@Override
			public Hibernate createFromParcel(Parcel parcel) {
				return new Hibernate(parcel);
			}
			@Override
			public Hibernate[] newArray(int n) {
				return new Hibernate[n];
			}
		};

		/**
		 * Puts the system running XBMC into hibernate mode.
		 */
		public Hibernate() {
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
	 * Reboots the system running XBMC.
	 * <p/>
	 * This class represents the API method <tt>System.Reboot</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class Reboot extends AbstractCall<String> {
		public final static String API_TYPE = "System.Reboot";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected Reboot(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<Reboot> CREATOR = new Parcelable.Creator<Reboot>() {
			@Override
			public Reboot createFromParcel(Parcel parcel) {
				return new Reboot(parcel);
			}
			@Override
			public Reboot[] newArray(int n) {
				return new Reboot[n];
			}
		};

		/**
		 * Reboots the system running XBMC.
		 */
		public Reboot() {
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
	 * Shuts the system running XBMC down.
	 * <p/>
	 * This class represents the API method <tt>System.Shutdown</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class Shutdown extends AbstractCall<String> {
		public final static String API_TYPE = "System.Shutdown";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected Shutdown(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<Shutdown> CREATOR = new Parcelable.Creator<Shutdown>() {
			@Override
			public Shutdown createFromParcel(Parcel parcel) {
				return new Shutdown(parcel);
			}
			@Override
			public Shutdown[] newArray(int n) {
				return new Shutdown[n];
			}
		};

		/**
		 * Shuts the system running XBMC down.
		 */
		public Shutdown() {
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
	 * Suspends the system running XBMC.
	 * <p/>
	 * This class represents the API method <tt>System.Suspend</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class Suspend extends AbstractCall<String> {
		public final static String API_TYPE = "System.Suspend";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected Suspend(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<Suspend> CREATOR = new Parcelable.Creator<Suspend>() {
			@Override
			public Suspend createFromParcel(Parcel parcel) {
				return new Suspend(parcel);
			}
			@Override
			public Suspend[] newArray(int n) {
				return new Suspend[n];
			}
		};

		/**
		 * Suspends the system running XBMC.
		 */
		public Suspend() {
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
}
