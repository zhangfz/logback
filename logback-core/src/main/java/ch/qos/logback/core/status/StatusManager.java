/**
 * Logback: the reliable, generic, fast and flexible logging framework.
 * Copyright (C) 1999-2011, QOS.ch. All rights reserved.
 *
 * This program and the accompanying materials are dual-licensed under
 * either the terms of the Eclipse Public License v1.0 as published by
 * the Eclipse Foundation
 *
 *   or (per the licensee's choosing)
 *
 * under the terms of the GNU Lesser General Public License version 2.1
 * as published by the Free Software Foundation.
 */
package ch.qos.logback.core.status;

import java.util.List;

/**
 * Internal error messages (statii) are managed by instances of this interface.
 * 
 * @author Ceki Gulcu
 */
public interface StatusManager {

  /**
   * Add a new status message.
   * 
   * @param status
   */
  public void add(Status status);

  /**
   * Obtain a copy of the status list maintained by this StatusManager.
   * 
   * @return
   */
  public List<Status> getCopyOfStatusList();

  /**
   * Return the highest level of all the statii.
   * 
   * @return
   */
  //public int getLevel();

  /**
   * Return the number of status entries.
   * 
   * @return
   */
  public int getCount();

  /**
   * Add a status listener.
   * @param listener
   */
  public void add(StatusListener listener);
  
  /**
   * Remove a status listener.
   * 
   * @param listener
   */
  public void remove(StatusListener listener);


  /**
   * Clear the list of status messages.
   */
  public void clear();

  
  /**
   * Obtain a copy of the status listener list maintained by this StatusManager
   * 
   * @return
   */
  public List<StatusListener> getCopyOfStatusListenerList();

}
