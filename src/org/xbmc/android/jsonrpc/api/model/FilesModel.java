/*
 *      Copyright (C) 2005-2014 Team XBMC
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

public final class FilesModel {

	/**
	 * API Name: <tt>Files.Media</tt>
	 */
	public interface Media {

		public final String VIDEO = "video";
		public final String MUSIC = "music";
		public final String PICTURES = "pictures";
		public final String FILES = "files";
		public final String PROGRAMS = "programs";

		public final static Set<String> values = new HashSet<String>(Arrays.asList(VIDEO, MUSIC, PICTURES, FILES, PROGRAMS));
	}
}
