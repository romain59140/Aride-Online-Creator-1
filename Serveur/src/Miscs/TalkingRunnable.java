/*	Copyright (C) 2013  BRULTET Antoine
	
	This file is part of Aride Online Creator.

    Aride Online Creator is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Aride Online Creator is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Aride Online Creator.  If not, see <http://www.gnu.org/licenses/>.
*/

package Miscs;

public class TalkingRunnable implements Runnable {

	private Runnable delegate;
	
	public TalkingRunnable(Runnable delegate) {
        this.delegate = delegate;
    }
	
	@Override
	public void run() {
        try {
            delegate.run ();
        } catch (RuntimeException e) {
        	MessageLogger.getInstance().log(e);
        }
	}

}
