/*******************************************************************************
 * Copyright (C) 2016 Sam Silverberg sam.silverberg@gmail.com	
 *
 * This file is part of OpenDedupe SDFS.
 *
 * OpenDedupe SDFS is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * OpenDedupe SDFS is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/
package org.opendedup.sdfs.io.events;

public class CloudSyncDLRequest {
	long volumeID;
	boolean updateHashMap;

	public CloudSyncDLRequest(long volumeID,boolean updateHashMap) {
		this.volumeID = volumeID;
		this.updateHashMap = updateHashMap;
	}
	
	public long getVolumeID() {
		return this.volumeID;
	}
	
	public boolean isUpdateHashMap() {
		return this.updateHashMap;
	}
	
}
