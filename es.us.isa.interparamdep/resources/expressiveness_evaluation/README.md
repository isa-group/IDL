This folder contains the IDL specifications of 31 operations from 23 different web APIs. The APIs are classified into 2 groups:
1. APIs originally included in our review of inter-parameter dependencies in real-world web APIs [[reference](https://personal.us.es/amarlop/wp-content/uploads/2019/10/A-Catalogue-of-Inter-Parameter-Dependencies-in-RESTful-Web-APIs.pdf)] (10 APIs, 11 operations).
2. APIs not included in our initial study (13 APIs, 20 operations).

### 1. APIs included in the study
- [**Bing Web Search**](https://docs.microsoft.com/en-us/rest/api/cognitiveservices-bingsearch/bing-web-api-v7-reference):
  - *Search*. [IDL specification](api-Bing__operation-search.idl). Link to the [API documentation](https://docs.microsoft.com/en-us/rest/api/cognitiveservices-bingsearch/bing-web-api-v7-reference).
- [**Forte**](https://restdocs.forte.net/?version=latest):
  - *Create application*. [IDL specification](api-Forte__operation-createApplication.idl). Link to the [API documentation](https://restdocs.forte.net/?version=latest#9de86ab2-15c1-4531-9657-51bfa797436b).
- [**Foursquare**](https://developer.foursquare.com/places):
  - *Search for venues*. [IDL specification](api-Foursquare__operation-searchVenues.idl). Link to the [API documentation](https://developer.foursquare.com/docs/api/venues/search).
- [**GitHub**](https://developer.github.com/v3/):
  - *Create deployment status*. [IDL specification](api-Github__operation-createDeploymentStatus). Link to the [API documentation](https://developer.github.com/v3/repos/deployments/#create-a-deployment-status).
- [**Google Geocoding**](https://developers.google.com/maps/documentation/geocoding/start):
  - *Geocode request*. [IDL specification](api-GoogleGeocoding__operation-geocode). Link to the [API documentation](https://developers.google.com/maps/documentation/geocoding/start).
- [**Google Maps**](https://developers.google.com/places/web-service/intro):
  - *Searby search*. [IDL specification](api-GoogleMaps__operation-nearbySearch). Link to the [API documentation](https://developers.google.com/places/web-service/search#PlaceSearchRequests).
- [**PayPal**](https://developer.paypal.com/docs/api/invoicing/v1/):
  - *Create invoice*. [IDL specification](api-Paypal__operation-createInvoice). Link to the [API documentation](https://developer.paypal.com/docs/api/invoicing/v1/#invoices_create).
- [**Tumblr**](https://www.tumblr.com/docs/en/api/v2):
  - *Create post*. [IDL specification](api-Tumblr__operation-createPost). Link to the [API documentation](https://www.tumblr.com/docs/en/api/v2#post--create-a-new-blog-post-legacy).
- [**Yelp**](https://www.yelp.com/developers/documentation/v3):
  - *Search businesses*. [IDL specification](api-Yelp__operation-searchBusinesses). Link to the [API documentation](https://www.yelp.com/developers/documentation/v3/business_search).
- [**YouTube**](https://developers.google.com/youtube/v3/getting-started?hl=es):
  - *Get videos*. [IDL specification](api-Youtube__operation-getVideos). Link to the [API documentation](https://developers.google.com/youtube/v3/docs/videos/list).
  - *Search*. [IDL specification](api-Youtube__operation-search). Link to the [API documentation](https://developers.google.com/youtube/v3/docs/search/list).

### 2. APIs not included in the study
- **Napster**:
  - *Get favorites*. [IDL specification](). Link to the [API documentation](https://developer.napster.com/api/v2.2#member-favorites).
- **Shopify**:
  - *Get price rules*. [IDL specification](). Link to the [API documentation](https://help.shopify.com/en/api/reference/discounts/pricerule#index-2020-01).
  - *Create price rule*. [IDL specification](). Link to the [API documentation](https://help.shopify.com/en/api/reference/discounts/pricerule#create-2020-01).
- **Hoiio**:
  - *Make call*. [IDL specification](). Link to the [API documentation](https://openapi.hoiio.com/voice-api/make-call/index.html).
- **CityGrid**:
  - *Get places detail*. [IDL specification](). Link to the [API documentation](https://citygridmedia.atlassian.net/wiki/spaces/citygridv2/pages/4980755/Places+API#PlacesAPI-PlacesDetail).
  - *LatLon search*. [IDL specification](). Link to the [API documentation](https://citygridmedia.atlassian.net/wiki/spaces/citygridv2/pages/4980755/Places+API#PlacesAPI-SearchUsingLatitudeandLongitude).
- **Groupon**:
  - *Get deals*. [IDL specification](). Link to the [API documentation](http://partner-api.groupon.com/help/deal-api).
