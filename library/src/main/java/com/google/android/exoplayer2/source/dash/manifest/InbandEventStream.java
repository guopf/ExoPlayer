/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.android.exoplayer2.source.dash.manifest;

import com.google.android.exoplayer2.util.Util;

/**
 * Represents a DASH in-band event stream.
 */
public class InbandEventStream {

  public final String schemeIdUri;
  public final String value;

  public InbandEventStream(String schemeIdUri, String value) {
    this.schemeIdUri = schemeIdUri;
    this.value = value;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    InbandEventStream other = (InbandEventStream) obj;
    return Util.areEqual(schemeIdUri, other.schemeIdUri) && Util.areEqual(value, other.value);
  }

  @Override
  public int hashCode() {
    return 31 * (schemeIdUri != null ? schemeIdUri.hashCode() : 0)
        + (value != null ? value.hashCode() : 0);
  }

}
