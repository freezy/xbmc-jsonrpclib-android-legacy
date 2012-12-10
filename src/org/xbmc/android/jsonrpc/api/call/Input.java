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

public final class Input {

	/**
	 * Goes back in GUI.
	 * <p/>
	 * This class represents the API method <tt>Input.Back</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class Back extends AbstractCall<String> {
		public final static String API_TYPE = "Input.Back";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected Back(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<Back> CREATOR = new Parcelable.Creator<Back>() {
			@Override
			public Back createFromParcel(Parcel parcel) {
				return new Back(parcel);
			}
			@Override
			public Back[] newArray(int n) {
				return new Back[n];
			}
		};

		/**
		 * Goes back in GUI.
		 */
		public Back() {
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
	 * Shows the context menu.
	 * <p/>
	 * This class represents the API method <tt>Input.ContextMenu</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class ContextMenu extends AbstractCall<String> {
		public final static String API_TYPE = "Input.ContextMenu";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected ContextMenu(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<ContextMenu> CREATOR = new Parcelable.Creator<ContextMenu>() {
			@Override
			public ContextMenu createFromParcel(Parcel parcel) {
				return new ContextMenu(parcel);
			}
			@Override
			public ContextMenu[] newArray(int n) {
				return new ContextMenu[n];
			}
		};

		/**
		 * Shows the context menu.
		 */
		public ContextMenu() {
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
	 * Navigate down in GUI.
	 * <p/>
	 * This class represents the API method <tt>Input.Down</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class Down extends AbstractCall<String> {
		public final static String API_TYPE = "Input.Down";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected Down(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<Down> CREATOR = new Parcelable.Creator<Down>() {
			@Override
			public Down createFromParcel(Parcel parcel) {
				return new Down(parcel);
			}
			@Override
			public Down[] newArray(int n) {
				return new Down[n];
			}
		};

		/**
		 * Navigate down in GUI.
		 */
		public Down() {
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
	 * Execute a specific action.
	 * <p/>
	 * This class represents the API method <tt>Input.ExecuteAction</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class ExecuteAction extends AbstractCall<String> {
		public final static String API_TYPE = "Input.ExecuteAction";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected ExecuteAction(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<ExecuteAction> CREATOR = new Parcelable.Creator<ExecuteAction>() {
			@Override
			public ExecuteAction createFromParcel(Parcel parcel) {
				return new ExecuteAction(parcel);
			}
			@Override
			public ExecuteAction[] newArray(int n) {
				return new ExecuteAction[n];
			}
		};

		/**
		 * Execute a specific action.
		 * @param action One of: <tt>left</tt>, <tt>right</tt>, <tt>up</tt>, <tt>down</tt>, <tt>pageup</tt>, <tt>pagedown</tt>, <tt>select</tt>, <tt>highlight</tt>, <tt>parentdir</tt>, <tt>parentfolder</tt>, <tt>back</tt>, <tt>previousmenu</tt>, <tt>info</tt>, <tt>pause</tt>, <tt>stop</tt>, <tt>skipnext</tt>, <tt>skipprevious</tt>, <tt>fullscreen</tt>, <tt>aspectratio</tt>, <tt>stepforward</tt>, <tt>stepback</tt>, <tt>bigstepforward</tt>, <tt>bigstepback</tt>, <tt>osd</tt>, <tt>showsubtitles</tt>, <tt>nextsubtitle</tt>, <tt>codecinfo</tt>, <tt>nextpicture</tt>, <tt>previouspicture</tt>, <tt>zoomout</tt>, <tt>zoomin</tt>, <tt>playlist</tt>, <tt>queue</tt>, <tt>zoomnormal</tt>, <tt>zoomlevel1</tt>, <tt>zoomlevel2</tt>, <tt>zoomlevel3</tt>, <tt>zoomlevel4</tt>, <tt>zoomlevel5</tt>, <tt>zoomlevel6</tt>, <tt>zoomlevel7</tt>, <tt>zoomlevel8</tt>, <tt>zoomlevel9</tt>, <tt>nextcalibration</tt>, <tt>resetcalibration</tt>, <tt>analogmove</tt>, <tt>rotate</tt>, <tt>rotateccw</tt>, <tt>close</tt>, <tt>subtitledelayminus</tt>, <tt>subtitledelay</tt>, <tt>subtitledelayplus</tt>, <tt>audiodelayminus</tt>, <tt>audiodelay</tt>, <tt>audiodelayplus</tt>, <tt>subtitleshiftup</tt>, <tt>subtitleshiftdown</tt>, <tt>subtitlealign</tt>, <tt>audionextlanguage</tt>, <tt>verticalshiftup</tt>, <tt>verticalshiftdown</tt>, <tt>nextresolution</tt>, <tt>audiotoggledigital</tt>, <tt>number0</tt>, <tt>number1</tt>, <tt>number2</tt>, <tt>number3</tt>, <tt>number4</tt>, <tt>number5</tt>, <tt>number6</tt>, <tt>number7</tt>, <tt>number8</tt>, <tt>number9</tt>, <tt>osdleft</tt>, <tt>osdright</tt>, <tt>osdup</tt>, <tt>osddown</tt>, <tt>osdselect</tt>, <tt>osdvalueplus</tt>, <tt>osdvalueminus</tt>, <tt>smallstepback</tt>, <tt>fastforward</tt>, <tt>rewind</tt>, <tt>play</tt>, <tt>playpause</tt>, <tt>delete</tt>, <tt>copy</tt>, <tt>move</tt>, <tt>mplayerosd</tt>, <tt>hidesubmenu</tt>, <tt>screenshot</tt>, <tt>rename</tt>, <tt>togglewatched</tt>, <tt>scanitem</tt>, <tt>reloadkeymaps</tt>, <tt>volumeup</tt>, <tt>volumedown</tt>, <tt>mute</tt>, <tt>backspace</tt>, <tt>scrollup</tt>, <tt>scrolldown</tt>, <tt>analogfastforward</tt>, <tt>analogrewind</tt>, <tt>moveitemup</tt>, <tt>moveitemdown</tt>, <tt>contextmenu</tt>, <tt>shift</tt>, <tt>symbols</tt>, <tt>cursorleft</tt>, <tt>cursorright</tt>, <tt>showtime</tt>, <tt>analogseekforward</tt>, <tt>analogseekback</tt>, <tt>showpreset</tt>, <tt>presetlist</tt>, <tt>nextpreset</tt>, <tt>previouspreset</tt>, <tt>lockpreset</tt>, <tt>randompreset</tt>, <tt>increasevisrating</tt>, <tt>decreasevisrating</tt>, <tt>showvideomenu</tt>, <tt>enter</tt>, <tt>increaserating</tt>, <tt>decreaserating</tt>, <tt>togglefullscreen</tt>, <tt>nextscene</tt>, <tt>previousscene</tt>, <tt>nextletter</tt>, <tt>prevletter</tt>, <tt>jumpsms2</tt>, <tt>jumpsms3</tt>, <tt>jumpsms4</tt>, <tt>jumpsms5</tt>, <tt>jumpsms6</tt>, <tt>jumpsms7</tt>, <tt>jumpsms8</tt>, <tt>jumpsms9</tt>, <tt>filter</tt>, <tt>filterclear</tt>, <tt>filtersms2</tt>, <tt>filtersms3</tt>, <tt>filtersms4</tt>, <tt>filtersms5</tt>, <tt>filtersms6</tt>, <tt>filtersms7</tt>, <tt>filtersms8</tt>, <tt>filtersms9</tt>, <tt>firstpage</tt>, <tt>lastpage</tt>, <tt>guiprofile</tt>, <tt>red</tt>, <tt>green</tt>, <tt>yellow</tt>, <tt>blue</tt>, <tt>increasepar</tt>, <tt>decreasepar</tt>, <tt>volampup</tt>, <tt>volampdown</tt>, <tt>channelup</tt>, <tt>channeldown</tt>, <tt>previouschannelgroup</tt>, <tt>nextchannelgroup</tt>, <tt>leftclick</tt>, <tt>rightclick</tt>, <tt>middleclick</tt>, <tt>doubleclick</tt>, <tt>wheelup</tt>, <tt>wheeldown</tt>, <tt>mousedrag</tt>, <tt>mousemove</tt>, <tt>noop</tt>. See constants at {@link InputModel.Action}.
		 */
		public ExecuteAction(String action) {
			super();
			addParameter("action", action);
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
	 * Goes to home window in GUI.
	 * <p/>
	 * This class represents the API method <tt>Input.Home</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class Home extends AbstractCall<String> {
		public final static String API_TYPE = "Input.Home";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected Home(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<Home> CREATOR = new Parcelable.Creator<Home>() {
			@Override
			public Home createFromParcel(Parcel parcel) {
				return new Home(parcel);
			}
			@Override
			public Home[] newArray(int n) {
				return new Home[n];
			}
		};

		/**
		 * Goes to home window in GUI.
		 */
		public Home() {
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
	 * Shows the information dialog.
	 * <p/>
	 * This class represents the API method <tt>Input.Info</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class Info extends AbstractCall<String> {
		public final static String API_TYPE = "Input.Info";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected Info(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<Info> CREATOR = new Parcelable.Creator<Info>() {
			@Override
			public Info createFromParcel(Parcel parcel) {
				return new Info(parcel);
			}
			@Override
			public Info[] newArray(int n) {
				return new Info[n];
			}
		};

		/**
		 * Shows the information dialog.
		 */
		public Info() {
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
	 * Navigate left in GUI.
	 * <p/>
	 * This class represents the API method <tt>Input.Left</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class Left extends AbstractCall<String> {
		public final static String API_TYPE = "Input.Left";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected Left(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<Left> CREATOR = new Parcelable.Creator<Left>() {
			@Override
			public Left createFromParcel(Parcel parcel) {
				return new Left(parcel);
			}
			@Override
			public Left[] newArray(int n) {
				return new Left[n];
			}
		};

		/**
		 * Navigate left in GUI.
		 */
		public Left() {
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
	 * Navigate right in GUI.
	 * <p/>
	 * This class represents the API method <tt>Input.Right</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class Right extends AbstractCall<String> {
		public final static String API_TYPE = "Input.Right";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected Right(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<Right> CREATOR = new Parcelable.Creator<Right>() {
			@Override
			public Right createFromParcel(Parcel parcel) {
				return new Right(parcel);
			}
			@Override
			public Right[] newArray(int n) {
				return new Right[n];
			}
		};

		/**
		 * Navigate right in GUI.
		 */
		public Right() {
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
	 * Select current item in GUI.
	 * <p/>
	 * This class represents the API method <tt>Input.Select</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class Select extends AbstractCall<String> {
		public final static String API_TYPE = "Input.Select";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected Select(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<Select> CREATOR = new Parcelable.Creator<Select>() {
			@Override
			public Select createFromParcel(Parcel parcel) {
				return new Select(parcel);
			}
			@Override
			public Select[] newArray(int n) {
				return new Select[n];
			}
		};

		/**
		 * Select current item in GUI.
		 */
		public Select() {
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
	 * Send a generic (unicode) text.
	 * <p/>
	 * This class represents the API method <tt>Input.SendText</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class SendText extends AbstractCall<String> {
		public final static String API_TYPE = "Input.SendText";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected SendText(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<SendText> CREATOR = new Parcelable.Creator<SendText>() {
			@Override
			public SendText createFromParcel(Parcel parcel) {
				return new SendText(parcel);
			}
			@Override
			public SendText[] newArray(int n) {
				return new SendText[n];
			}
		};

		/**
		 * Send a generic (unicode) text.
		 * @param textUnicode text.
		 * @param doneWhether this is the whole input or not (closes an open input dialog if true).
		 */
		public SendText(String text, Boolean done) {
			super();
			addParameter("text", text);
			addParameter("done", done);
		}

		/**
		 * Send a generic (unicode) text.
		 * @param textUnicode text.
		 */
		public SendText(String text) {
			super();
			addParameter("text", text);
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
	 * Show codec information of the playing item.
	 * <p/>
	 * This class represents the API method <tt>Input.ShowCodec</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class ShowCodec extends AbstractCall<String> {
		public final static String API_TYPE = "Input.ShowCodec";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected ShowCodec(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<ShowCodec> CREATOR = new Parcelable.Creator<ShowCodec>() {
			@Override
			public ShowCodec createFromParcel(Parcel parcel) {
				return new ShowCodec(parcel);
			}
			@Override
			public ShowCodec[] newArray(int n) {
				return new ShowCodec[n];
			}
		};

		/**
		 * Show codec information of the playing item.
		 */
		public ShowCodec() {
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
	 * Show the on-screen display for the current player.
	 * <p/>
	 * This class represents the API method <tt>Input.ShowOSD</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class ShowOSD extends AbstractCall<String> {
		public final static String API_TYPE = "Input.ShowOSD";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected ShowOSD(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<ShowOSD> CREATOR = new Parcelable.Creator<ShowOSD>() {
			@Override
			public ShowOSD createFromParcel(Parcel parcel) {
				return new ShowOSD(parcel);
			}
			@Override
			public ShowOSD[] newArray(int n) {
				return new ShowOSD[n];
			}
		};

		/**
		 * Show the on-screen display for the current player.
		 */
		public ShowOSD() {
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
	 * Navigate up in GUI.
	 * <p/>
	 * This class represents the API method <tt>Input.Up</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class Up extends AbstractCall<String> {
		public final static String API_TYPE = "Input.Up";

		@Override
		public void writeToParcel(Parcel parcel, int flags) {
			super.writeToParcel(parcel, flags);
			parcel.writeValue(mResult);
		}

		/**
		 * Construct via parcel.
		 */
		protected Up(Parcel parcel) {
			super(parcel);
		}

		/**
		 * Generates instances of this Parcelable class from a Parcel.
		 */
		public static final Parcelable.Creator<Up> CREATOR = new Parcelable.Creator<Up>() {
			@Override
			public Up createFromParcel(Parcel parcel) {
				return new Up(parcel);
			}
			@Override
			public Up[] newArray(int n) {
				return new Up[n];
			}
		};

		/**
		 * Navigate up in GUI.
		 */
		public Up() {
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
