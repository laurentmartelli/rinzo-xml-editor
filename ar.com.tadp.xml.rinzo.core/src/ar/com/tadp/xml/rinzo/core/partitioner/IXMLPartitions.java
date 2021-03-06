/*****************************************************************************
 * This file is part of Rinzo
 *
 * Author: Claudio Cancinos
 * WWW: https://sourceforge.net/projects/editorxml
 * Copyright (C): 2008, Claudio Cancinos
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; If not, see <http://www.gnu.org/licenses/>
 ****************************************************************************/
package ar.com.tadp.xml.rinzo.core.partitioner;

/**
 * 
 * @author ccancinos
 */
public interface IXMLPartitions {

    public static final String XML_TAG = "XML_TAG";
    public static final String XML_ENDTAG = "XML_END_TAG";
    public static final String XML_INCOMPLETETAG = "XML_INCOMPLETE_TAG";
    public static final String XML_EMPTYTAG = "XML_EMPTY_TAG";
    public static final String XML_TEXT = "XML_TEXT";
    public static final String XML_COMMENT = "XML_COMMENT";
    public static final String XML_UNDEFINED = "XML_UNDEFINED";
    public static final String XML_DECLARATION = "XML_DECLARATION";
    public static final String XML_PI = "XML_PI";
	public static final String XML_CDATA = "XML_CDATA";
}
