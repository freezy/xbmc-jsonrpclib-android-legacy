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

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class InputModel {

	/**
	 * API Name: <tt>Input.Action</tt>
	 */
	public interface Action {

		public final String LEFT = "left";
		public final String RIGHT = "right";
		public final String UP = "up";
		public final String DOWN = "down";
		public final String PAGEUP = "pageup";
		public final String PAGEDOWN = "pagedown";
		public final String SELECT = "select";
		public final String HIGHLIGHT = "highlight";
		public final String PARENTDIR = "parentdir";
		public final String PARENTFOLDER = "parentfolder";
		public final String BACK = "back";
		public final String PREVIOUSMENU = "previousmenu";
		public final String INFO = "info";
		public final String PAUSE = "pause";
		public final String STOP = "stop";
		public final String SKIPNEXT = "skipnext";
		public final String SKIPPREVIOUS = "skipprevious";
		public final String FULLSCREEN = "fullscreen";
		public final String ASPECTRATIO = "aspectratio";
		public final String STEPFORWARD = "stepforward";
		public final String STEPBACK = "stepback";
		public final String BIGSTEPFORWARD = "bigstepforward";
		public final String BIGSTEPBACK = "bigstepback";
		public final String CHAPTERORBIGSTEPFORWARD = "chapterorbigstepforward";
		public final String CHAPTERORBIGSTEPBACK = "chapterorbigstepback";
		public final String OSD = "osd";
		public final String SHOWSUBTITLES = "showsubtitles";
		public final String NEXTSUBTITLE = "nextsubtitle";
		public final String CODECINFO = "codecinfo";
		public final String NEXTPICTURE = "nextpicture";
		public final String PREVIOUSPICTURE = "previouspicture";
		public final String ZOOMOUT = "zoomout";
		public final String ZOOMIN = "zoomin";
		public final String PLAYLIST = "playlist";
		public final String QUEUE = "queue";
		public final String ZOOMNORMAL = "zoomnormal";
		public final String ZOOMLEVEL1 = "zoomlevel1";
		public final String ZOOMLEVEL2 = "zoomlevel2";
		public final String ZOOMLEVEL3 = "zoomlevel3";
		public final String ZOOMLEVEL4 = "zoomlevel4";
		public final String ZOOMLEVEL5 = "zoomlevel5";
		public final String ZOOMLEVEL6 = "zoomlevel6";
		public final String ZOOMLEVEL7 = "zoomlevel7";
		public final String ZOOMLEVEL8 = "zoomlevel8";
		public final String ZOOMLEVEL9 = "zoomlevel9";
		public final String NEXTCALIBRATION = "nextcalibration";
		public final String RESETCALIBRATION = "resetcalibration";
		public final String ANALOGMOVE = "analogmove";
		public final String ROTATE = "rotate";
		public final String ROTATECCW = "rotateccw";
		public final String CLOSE = "close";
		public final String SUBTITLEDELAYMINUS = "subtitledelayminus";
		public final String SUBTITLEDELAY = "subtitledelay";
		public final String SUBTITLEDELAYPLUS = "subtitledelayplus";
		public final String AUDIODELAYMINUS = "audiodelayminus";
		public final String AUDIODELAY = "audiodelay";
		public final String AUDIODELAYPLUS = "audiodelayplus";
		public final String SUBTITLESHIFTUP = "subtitleshiftup";
		public final String SUBTITLESHIFTDOWN = "subtitleshiftdown";
		public final String SUBTITLEALIGN = "subtitlealign";
		public final String AUDIONEXTLANGUAGE = "audionextlanguage";
		public final String VERTICALSHIFTUP = "verticalshiftup";
		public final String VERTICALSHIFTDOWN = "verticalshiftdown";
		public final String NEXTRESOLUTION = "nextresolution";
		public final String AUDIOTOGGLEDIGITAL = "audiotoggledigital";
		public final String NUMBER0 = "number0";
		public final String NUMBER1 = "number1";
		public final String NUMBER2 = "number2";
		public final String NUMBER3 = "number3";
		public final String NUMBER4 = "number4";
		public final String NUMBER5 = "number5";
		public final String NUMBER6 = "number6";
		public final String NUMBER7 = "number7";
		public final String NUMBER8 = "number8";
		public final String NUMBER9 = "number9";
		public final String OSDLEFT = "osdleft";
		public final String OSDRIGHT = "osdright";
		public final String OSDUP = "osdup";
		public final String OSDDOWN = "osddown";
		public final String OSDSELECT = "osdselect";
		public final String OSDVALUEPLUS = "osdvalueplus";
		public final String OSDVALUEMINUS = "osdvalueminus";
		public final String SMALLSTEPBACK = "smallstepback";
		public final String FASTFORWARD = "fastforward";
		public final String REWIND = "rewind";
		public final String PLAY = "play";
		public final String PLAYPAUSE = "playpause";
		public final String SWITCHPLAYER = "switchplayer";
		public final String DELETE = "delete";
		public final String COPY = "copy";
		public final String MOVE = "move";
		public final String MPLAYEROSD = "mplayerosd";
		public final String HIDESUBMENU = "hidesubmenu";
		public final String SCREENSHOT = "screenshot";
		public final String RENAME = "rename";
		public final String TOGGLEWATCHED = "togglewatched";
		public final String SCANITEM = "scanitem";
		public final String RELOADKEYMAPS = "reloadkeymaps";
		public final String VOLUMEUP = "volumeup";
		public final String VOLUMEDOWN = "volumedown";
		public final String MUTE = "mute";
		public final String BACKSPACE = "backspace";
		public final String SCROLLUP = "scrollup";
		public final String SCROLLDOWN = "scrolldown";
		public final String ANALOGFASTFORWARD = "analogfastforward";
		public final String ANALOGREWIND = "analogrewind";
		public final String MOVEITEMUP = "moveitemup";
		public final String MOVEITEMDOWN = "moveitemdown";
		public final String CONTEXTMENU = "contextmenu";
		public final String SHIFT = "shift";
		public final String SYMBOLS = "symbols";
		public final String CURSORLEFT = "cursorleft";
		public final String CURSORRIGHT = "cursorright";
		public final String SHOWTIME = "showtime";
		public final String ANALOGSEEKFORWARD = "analogseekforward";
		public final String ANALOGSEEKBACK = "analogseekback";
		public final String SHOWPRESET = "showpreset";
		public final String PRESETLIST = "presetlist";
		public final String NEXTPRESET = "nextpreset";
		public final String PREVIOUSPRESET = "previouspreset";
		public final String LOCKPRESET = "lockpreset";
		public final String RANDOMPRESET = "randompreset";
		public final String INCREASEVISRATING = "increasevisrating";
		public final String DECREASEVISRATING = "decreasevisrating";
		public final String SHOWVIDEOMENU = "showvideomenu";
		public final String ENTER = "enter";
		public final String INCREASERATING = "increaserating";
		public final String DECREASERATING = "decreaserating";
		public final String TOGGLEFULLSCREEN = "togglefullscreen";
		public final String NEXTSCENE = "nextscene";
		public final String PREVIOUSSCENE = "previousscene";
		public final String NEXTLETTER = "nextletter";
		public final String PREVLETTER = "prevletter";
		public final String JUMPSMS2 = "jumpsms2";
		public final String JUMPSMS3 = "jumpsms3";
		public final String JUMPSMS4 = "jumpsms4";
		public final String JUMPSMS5 = "jumpsms5";
		public final String JUMPSMS6 = "jumpsms6";
		public final String JUMPSMS7 = "jumpsms7";
		public final String JUMPSMS8 = "jumpsms8";
		public final String JUMPSMS9 = "jumpsms9";
		public final String FILTER = "filter";
		public final String FILTERCLEAR = "filterclear";
		public final String FILTERSMS2 = "filtersms2";
		public final String FILTERSMS3 = "filtersms3";
		public final String FILTERSMS4 = "filtersms4";
		public final String FILTERSMS5 = "filtersms5";
		public final String FILTERSMS6 = "filtersms6";
		public final String FILTERSMS7 = "filtersms7";
		public final String FILTERSMS8 = "filtersms8";
		public final String FILTERSMS9 = "filtersms9";
		public final String FIRSTPAGE = "firstpage";
		public final String LASTPAGE = "lastpage";
		public final String GUIPROFILE = "guiprofile";
		public final String RED = "red";
		public final String GREEN = "green";
		public final String YELLOW = "yellow";
		public final String BLUE = "blue";
		public final String INCREASEPAR = "increasepar";
		public final String DECREASEPAR = "decreasepar";
		public final String VOLAMPUP = "volampup";
		public final String VOLAMPDOWN = "volampdown";
		public final String CREATEBOOKMARK = "createbookmark";
		public final String CREATEEPISODEBOOKMARK = "createepisodebookmark";
		public final String SETTINGSRESET = "settingsreset";
		public final String SETTINGSLEVELCHANGE = "settingslevelchange";
		public final String STEREOMODE = "stereomode";
		public final String NEXTSTEREOMODE = "nextstereomode";
		public final String PREVIOUSSTEREOMODE = "previousstereomode";
		public final String TOGGLESTEREOMODE = "togglestereomode";
		public final String STEREOMODETOMONO = "stereomodetomono";
		public final String CHANNELUP = "channelup";
		public final String CHANNELDOWN = "channeldown";
		public final String PREVIOUSCHANNELGROUP = "previouschannelgroup";
		public final String NEXTCHANNELGROUP = "nextchannelgroup";
		public final String PLAYPVR = "playpvr";
		public final String PLAYPVRTV = "playpvrtv";
		public final String PLAYPVRRADIO = "playpvrradio";
		public final String LEFTCLICK = "leftclick";
		public final String RIGHTCLICK = "rightclick";
		public final String MIDDLECLICK = "middleclick";
		public final String DOUBLECLICK = "doubleclick";
		public final String WHEELUP = "wheelup";
		public final String WHEELDOWN = "wheeldown";
		public final String MOUSEDRAG = "mousedrag";
		public final String MOUSEMOVE = "mousemove";
		public final String TAP = "tap";
		public final String LONGPRESS = "longpress";
		public final String PANGESTURE = "pangesture";
		public final String ZOOMGESTURE = "zoomgesture";
		public final String ROTATEGESTURE = "rotategesture";
		public final String SWIPELEFT = "swipeleft";
		public final String SWIPERIGHT = "swiperight";
		public final String SWIPEUP = "swipeup";
		public final String SWIPEDOWN = "swipedown";
		public final String NOOP = "noop";

		public final static Set<String> values = new HashSet<String>(Arrays.asList(LEFT, RIGHT, UP, DOWN, PAGEUP, PAGEDOWN, SELECT, HIGHLIGHT, PARENTDIR, PARENTFOLDER, BACK, PREVIOUSMENU, INFO, PAUSE, STOP, SKIPNEXT, SKIPPREVIOUS, FULLSCREEN, ASPECTRATIO, STEPFORWARD, STEPBACK, BIGSTEPFORWARD, BIGSTEPBACK, CHAPTERORBIGSTEPFORWARD, CHAPTERORBIGSTEPBACK, OSD, SHOWSUBTITLES, NEXTSUBTITLE, CODECINFO, NEXTPICTURE, PREVIOUSPICTURE, ZOOMOUT, ZOOMIN, PLAYLIST, QUEUE, ZOOMNORMAL, ZOOMLEVEL1, ZOOMLEVEL2, ZOOMLEVEL3, ZOOMLEVEL4, ZOOMLEVEL5, ZOOMLEVEL6, ZOOMLEVEL7, ZOOMLEVEL8, ZOOMLEVEL9, NEXTCALIBRATION, RESETCALIBRATION, ANALOGMOVE, ROTATE, ROTATECCW, CLOSE, SUBTITLEDELAYMINUS, SUBTITLEDELAY, SUBTITLEDELAYPLUS, AUDIODELAYMINUS, AUDIODELAY, AUDIODELAYPLUS, SUBTITLESHIFTUP, SUBTITLESHIFTDOWN, SUBTITLEALIGN, AUDIONEXTLANGUAGE, VERTICALSHIFTUP, VERTICALSHIFTDOWN, NEXTRESOLUTION, AUDIOTOGGLEDIGITAL, NUMBER0, NUMBER1, NUMBER2, NUMBER3, NUMBER4, NUMBER5, NUMBER6, NUMBER7, NUMBER8, NUMBER9, OSDLEFT, OSDRIGHT, OSDUP, OSDDOWN, OSDSELECT, OSDVALUEPLUS, OSDVALUEMINUS, SMALLSTEPBACK, FASTFORWARD, REWIND, PLAY, PLAYPAUSE, SWITCHPLAYER, DELETE, COPY, MOVE, MPLAYEROSD, HIDESUBMENU, SCREENSHOT, RENAME, TOGGLEWATCHED, SCANITEM, RELOADKEYMAPS, VOLUMEUP, VOLUMEDOWN, MUTE, BACKSPACE, SCROLLUP, SCROLLDOWN, ANALOGFASTFORWARD, ANALOGREWIND, MOVEITEMUP, MOVEITEMDOWN, CONTEXTMENU, SHIFT, SYMBOLS, CURSORLEFT, CURSORRIGHT, SHOWTIME, ANALOGSEEKFORWARD, ANALOGSEEKBACK, SHOWPRESET, PRESETLIST, NEXTPRESET, PREVIOUSPRESET, LOCKPRESET, RANDOMPRESET, INCREASEVISRATING, DECREASEVISRATING, SHOWVIDEOMENU, ENTER, INCREASERATING, DECREASERATING, TOGGLEFULLSCREEN, NEXTSCENE, PREVIOUSSCENE, NEXTLETTER, PREVLETTER, JUMPSMS2, JUMPSMS3, JUMPSMS4, JUMPSMS5, JUMPSMS6, JUMPSMS7, JUMPSMS8, JUMPSMS9, FILTER, FILTERCLEAR, FILTERSMS2, FILTERSMS3, FILTERSMS4, FILTERSMS5, FILTERSMS6, FILTERSMS7, FILTERSMS8, FILTERSMS9, FIRSTPAGE, LASTPAGE, GUIPROFILE, RED, GREEN, YELLOW, BLUE, INCREASEPAR, DECREASEPAR, VOLAMPUP, VOLAMPDOWN, CREATEBOOKMARK, CREATEEPISODEBOOKMARK, SETTINGSRESET, SETTINGSLEVELCHANGE, STEREOMODE, NEXTSTEREOMODE, PREVIOUSSTEREOMODE, TOGGLESTEREOMODE, STEREOMODETOMONO, CHANNELUP, CHANNELDOWN, PREVIOUSCHANNELGROUP, NEXTCHANNELGROUP, PLAYPVR, PLAYPVRTV, PLAYPVRRADIO, LEFTCLICK, RIGHTCLICK, MIDDLECLICK, DOUBLECLICK, WHEELUP, WHEELDOWN, MOUSEDRAG, MOUSEMOVE, TAP, LONGPRESS, PANGESTURE, ZOOMGESTURE, ROTATEGESTURE, SWIPELEFT, SWIPERIGHT, SWIPEUP, SWIPEDOWN, NOOP));
	}
}
