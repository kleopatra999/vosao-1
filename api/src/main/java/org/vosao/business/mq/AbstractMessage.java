/**
 * Vosao CMS. Simple CMS for Google App Engine.
 * Copyright (C) 2009 Vosao development team
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *
 * email: vosao.dev@gmail.com
 */

package org.vosao.business.mq;

import java.io.Serializable;

/**
 * 
 * @author Alexander Oleynik
 *
 */
public abstract class AbstractMessage implements Message, Serializable {

	private String topic;
	private QueueSpeed speed;
	private String commandClassName;

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public QueueSpeed getSpeed() {
		return speed;
	}

	public void setSpeed(QueueSpeed speed) {
		this.speed = speed;
	}

	public String getCommandClassName() {
		return commandClassName;
	}

	public void setCommandClassName(String commandClassName) {
		this.commandClassName = commandClassName;
	}
	
}
