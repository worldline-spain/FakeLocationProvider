# LOCATION GENERATOR

[![Download](https://api.bintray.com/packages/worldline-spain/maven/locationprovider/images/download.svg) ](https://bintray.com/worldline-spain/maven/locationprovider/_latestVersion)

This library provides a random `Location` to be used in Android applications.

Location values have a specific range:

* Latitude: -90 / +90 degrees
* Longitude: -180 / +180 degrees

This can be achieved by:

``` Java
Location location = new Location("");
location.setLatitude(45);
location.setLongitude(3);
```

But you must do this across all app, or create a Helper class for it.

## USAGE ##

Library provides two helper classes for generate `Location`s:

``` Java
Location location = GenerateLocationProvider.getInstance().createLocation();
```

``` Java
double latitude = GenerateLocationValuesProvider.getInstance().generateLatitude();
double latitude = GenerateLocationValuesProvider.getInstance().generateLongitude();
```

## FUTURE ##

* Fake all `Location` attributes
* FakeLocationProvider, to enable MOCK_LOCATION

## LICENSE ##

    Copyright 2015 Wordline Spain

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.