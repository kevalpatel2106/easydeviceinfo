/*
 * Copyright (C) 2016 Nishant Srivastava
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package github.nisrulz.easydeviceinfo.common;

/**
 * Easy device info class.
 */
public class EasyDeviceInfo {
  /**
   * The Name.
   */
  public static final String name = "EasyDeviceInfo";

  /**
   * The Not found val.
   */
  public static String NOT_FOUND_VAL = "unknown";

  /**
   * Instantiates a new Easy device info.
   */
  public EasyDeviceInfo() {
  }

  /**
   * Instantiates a new Easy device info.
   *
   * @param notFoundVal
   *     the not found val
   */
  public EasyDeviceInfo(String notFoundVal) {
    NOT_FOUND_VAL = notFoundVal;
  }

  /**
   * Gets library version.
   *
   * @return the library version
   */
  public final String getLibraryVersion() {
    int versionCode = 19;
    String version = "v2.2.0";
    return name + " : " + version + " [build-" + versionCode + "]";
  }
}
