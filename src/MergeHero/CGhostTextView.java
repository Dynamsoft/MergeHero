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

package MergeHero;
/*
 * Created on 2005-4-25
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
public class CGhostTextView extends CEditTextView
{
    CGhostTextBuffer m_pGhostTextBuffer = null;
    
    public static void main(String[] args)
    {
    }
    
    void ReAttachToBuffer(CTextBuffer  pBuf)
    {
    	if (pBuf == null)
    	{
    		pBuf = LocateTextBuffer();
    	}
    	m_pGhostTextBuffer = (CGhostTextBuffer)(pBuf);
    	//CEditTextView::ReAttachToBuffer(pBuf);
    }

    public void AttachToBuffer(CTextBuffer pBuf)
    {
    	if (pBuf == null)
    	{
    		pBuf = LocateTextBuffer();
    	}
    	m_pGhostTextBuffer = (CGhostTextBuffer)(pBuf);
    	super.AttachToBuffer(pBuf);
    }

    public void DetachFromBuffer()
    {
    	if (m_pGhostTextBuffer != null)
    	{
    		m_pGhostTextBuffer = null;
    	}
    	super.DetachFromBuffer();
    }
    
	int ComputeRealLine(int nApparentLine)
	{
		return m_pGhostTextBuffer.ComputeRealLine(nApparentLine);
	}
}
