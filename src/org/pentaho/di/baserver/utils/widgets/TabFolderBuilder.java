/*
 * This program is free software; you can redistribute it and/or modify it under the
 * terms of the GNU General Public License, version 2 as published by the Free Software
 * Foundation.
 *
 * You should have received a copy of the GNU General Public License along with this
 * program; if not, you can obtain a copy at http://www.gnu.org/licenses/gpl-2.0.html
 * or from the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 *
 * Copyright 2006 - 2015 Pentaho Corporation.  All rights reserved.
 */
package org.pentaho.di.baserver.utils.widgets;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.widgets.Composite;
import org.pentaho.di.ui.core.PropsUI;

public class TabFolderBuilder extends WidgetBuilder<CTabFolder> {

  public TabFolderBuilder( Composite parent, PropsUI props ) {
    super( parent, props );
  }

  @Override
  protected CTabFolder createWidget( Composite parent ) {
    // create tab folder
    CTabFolder tabFolder = createCTabFolder( this.parent, SWT.BORDER );
    return tabFolder;
  }

  protected CTabFolder createCTabFolder( Composite parent, int i ) {
    return new CTabFolder( parent, i );
  }
}
