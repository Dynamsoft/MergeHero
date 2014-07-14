/*
 * MergeHero: Differing and Merging Folders & Files
 *
 * Copyright © 2004, Dynamsoft, Inc. All rights reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see http://www.opensource.org/licenses/gpl-3.0.html.
 */

package MergeHeroLib;
/*
 * Created on 2005-4-14
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author Falcon Young
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class CFileStatus
{
    public static void main(String[] args)
    {
    }
    
    public long m_ctime;          // creation date/time of file
    public long  m_mtime;          // last modification date/time of file
    public long  m_atime;          // last access date/time of file
    public long m_size;            // logical size of file in bytes
    byte m_attribute;       // logical OR of CFile::Attribute enum values
    byte _m_padding;        // pad the structure to a WORD
    String m_szFullName;  // absolute path name

}
