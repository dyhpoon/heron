// Copyright 2016 Twitter. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.twitter.heron.spi.scheduler;

/**
 * Thrown to indicate that an error occurred while launching topology
 */
public class LauncherException extends RuntimeException {

  private static final long serialVersionUID = 8518462128140884098L;

  private final String topologyName;

  public LauncherException(String message, String topologyName) {
    super(message);
    this.topologyName = topologyName;
  }

  public LauncherException(String message, String topologyName, Throwable cause) {
    super(message, cause);
    this.topologyName = topologyName;
  }
}