/*
 * Copyright 2012 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.gwt.aria.client;
/////////////////////////////////////////////////////////
// This is auto-generated code.  Do not manually edit! //
/////////////////////////////////////////////////////////

import com.google.gwt.dom.client.Element;

/**
 * A type that represents the <a href="http://www.w3.org/TR/wai-aria/roles#range">range</a>
 * role in the ARIA specification.
 *
 * @see Role
 * @see Roles
 */
public interface RangeRole extends WidgetRole {
  String getAriaValuemaxProperty(Element element);

  String getAriaValueminProperty(Element element);

  String getAriaValuenowProperty(Element element);

  String getAriaValuetextProperty(Element element);

  void removeAriaValuemaxProperty(Element element);

  void removeAriaValueminProperty(Element element);

  void removeAriaValuenowProperty(Element element);

  void removeAriaValuetextProperty(Element element);

  void setAriaValuemaxProperty(Element element, Number value);

  void setAriaValueminProperty(Element element, Number value);

  void setAriaValuenowProperty(Element element, Number value);

  void setAriaValuetextProperty(Element element, String value);
}
