This folder contains the IDL specifications of 31 operations from 22 different web APIs. The APIs are classified into 2 groups:
1. APIs originally included in our review of inter-parameter dependencies in real-world web APIs [[reference](https://personal.us.es/amarlop/wp-content/uploads/2019/10/A-Catalogue-of-Inter-Parameter-Dependencies-in-RESTful-Web-APIs.pdf)] (10 APIs, 11 operations).
2. APIs not included in our initial study (12 APIs, 20 operations).

### 1. APIs included in the study
- [**Bing Web Search**](https://docs.microsoft.com/en-us/rest/api/cognitiveservices-bingsearch/bing-web-api-v7-reference):
  - *Search*. [IDL specification](api-Bing__operation-search.idl). Link to the [API documentation](https://docs.microsoft.com/en-us/rest/api/cognitiveservices-bingsearch/bing-web-api-v7-reference).
- [**Forte**](https://restdocs.forte.net/?version=latest):
  - *Create application*. [IDL specification](api-Forte__operation-createApplication.idl). Link to the [API documentation](https://restdocs.forte.net/?version=latest#9de86ab2-15c1-4531-9657-51bfa797436b).
- [**Foursquare**](https://developer.foursquare.com/places):
  - *Search for venues*. [IDL specification](api-Foursquare__operation-searchVenues.idl). Link to the [API documentation](https://developer.foursquare.com/docs/api/venues/search).
- [**GitHub**](https://developer.github.com/v3/):
  - *Create deployment status*. [IDL specification](api-Github__operation-createDeploymentStatus.idl). Link to the [API documentation](https://developer.github.com/v3/repos/deployments/#create-a-deployment-status).
- [**Google Geocoding**](https://developers.google.com/maps/documentation/geocoding/start):
  - *Geocode request*. [IDL specification](api-GoogleGeocoding__operation-geocode.idl). Link to the [API documentation](https://developers.google.com/maps/documentation/geocoding/start).
- [**Google Maps**](https://developers.google.com/places/web-service/intro):
  - *Nearby search*. [IDL specification](api-GoogleMaps__operation-nearbySearch.idl). Link to the [API documentation](https://developers.google.com/places/web-service/search#PlaceSearchRequests).
- [**PayPal**](https://developer.paypal.com/docs/api/invoicing/v1/):
  - *Create invoice*. [IDL specification](api-Paypal__operation-createInvoice.idl). Link to the [API documentation](https://developer.paypal.com/docs/api/invoicing/v1/#invoices_create).
- [**Tumblr**](https://www.tumblr.com/docs/en/api/v2):
  - *Create post*. [IDL specification](api-Tumblr__operation-createPost.idl). Link to the [API documentation](https://www.tumblr.com/docs/en/api/v2#post--create-a-new-blog-post-legacy).
- [**Yelp**](https://www.yelp.com/developers/documentation/v3):
  - *Search businesses*. [IDL specification](api-Yelp__operation-searchBusinesses.idl). Link to the [API documentation](https://www.yelp.com/developers/documentation/v3/business_search).
- [**YouTube**](https://developers.google.com/youtube/v3/getting-started?hl=es):
  - *Get videos*. [IDL specification](api-Youtube__operation-getVideos.idl). Link to the [API documentation](https://developers.google.com/youtube/v3/docs/videos/list).
  - *Search*. [IDL specification](api-Youtube__operation-search.idl). Link to the [API documentation](https://developers.google.com/youtube/v3/docs/search/list).

### 2. APIs not included in the study
- [**Amazon Product Advertising**](https://docs.aws.amazon.com/AWSECommerceService/latest/DG/Welcome.html):
  - *Add items to cart*. [IDL specification](api-AmazonProductAdvertising__operation-cartAdd.idl). Link to the [API documentation](https://docs.aws.amazon.com/AWSECommerceService/latest/DG/CartAdd.html).
  - *Look up items*. [IDL specification](api-AmazonProductAdvertising__operation-itemLookup.idl). Link to the [API documentation](https://docs.aws.amazon.com/AWSECommerceService/latest/DG/ItemLookup.html).
- [**BitLy**](https://dev.bitly.com/v4_documentation.html):
  - *Get bitlinks by group*. [IDL specification](api-BitLy__operation-getBitlinksByGroup.idl). Link to the [API documentation](https://dev.bitly.com/v4/#operation/getBitlinksByGroup).
- [**Box**](https://developer.box.com/en/reference/):
  - *Get items in folder*. [IDL specification](api-Box__operation-getItemsInFolder.idl). Link to the [API documentation](https://developer.box.com/en/reference/get-folders-id-items/).
  - *Request access token*. [IDL specification](api-Box__operation-requestAccessToken.idl). Link to the [API documentation](https://developer.box.com/en/reference/post-oauth2-token/).
- [**CityGrid**](https://citygridmedia.atlassian.net/wiki/spaces/citygridv2/pages/4980755/Places+API):
  - *LatLon search*. [IDL specification](api-CityGrid__operation-latLonSearch.idl). Link to the [API documentation](https://citygridmedia.atlassian.net/wiki/spaces/citygridv2/pages/4980755/Places+API#PlacesAPI-SearchUsingLatitudeandLongitude).
  - *Get places detail*. [IDL specification](api-CityGrid__operation-placesDetail.idl). Link to the [API documentation](https://citygridmedia.atlassian.net/wiki/spaces/citygridv2/pages/4980755/Places+API#PlacesAPI-PlacesDetail).
- [**Google Calendar**](https://developers.google.com/calendar/v3/reference):
  - *Get instances of recurring event*. [IDL specification](api-GoogleCalendar__operation-getInstancesOfEvent.idl). Link to the [API documentation](https://developers.google.com/calendar/v3/reference/events/instances).
  - *List events*. [IDL specification](api-GoogleCalendar__operation-listEvents.idl). Link to the [API documentation](https://developers.google.com/calendar/v3/reference/events/list).
- [**Groupon**](http://partner-api.groupon.com/help/api-introduction):
  - *Get deals*. [IDL specification](api-Groupon__operation-getDeals.idl). Link to the [API documentation](http://partner-api.groupon.com/help/deal-api).
- [**Hoiio**](https://openapi.hoiio.com/):
  - *Make call*. [IDL specification](api-Hoiio__operation-makeCall.idl). Link to the [API documentation](https://openapi.hoiio.com/voice-api/make-call/index.html).
- [**Napster**](https://developer.napster.com/api/v2.2):
  - *Get favorites*. [IDL specification](api-Napster__operation-getFavorites.idl). Link to the [API documentation](https://developer.napster.com/api/v2.2#member-favorites).
- [**Reddit**](https://www.reddit.com/dev/api):
  - *Search*. [IDL specification](api-Reddit__operation-search.idl). Link to the [API documentation](https://www.reddit.com/dev/api#GET_search).
  - *Upload subreddit image*. [IDL specification](api-Reddit__operation-uploadSrImg.idl). Link to the [API documentation](https://www.reddit.com/dev/api#POST_api_upload_sr_img).
- [**Shopify**](https://help.shopify.com/en/api/reference):
  - *Create price rule*. [IDL specification](api-Shopify__operation-createPriceRule.idl). Link to the [API documentation](https://help.shopify.com/en/api/reference/discounts/pricerule#create-2020-01).
  - *Get price rules*. [IDL specification](api-Shopify__operation-getPriceRules.idl). Link to the [API documentation](https://help.shopify.com/en/api/reference/discounts/pricerule#index-2020-01).
- [**Vimeo**](https://developer.vimeo.com/api/reference):
  - *Edit user*. [IDL specification](api-Vimeo__operation-editUser.idl). Link to the [API documentation](https://developer.vimeo.com/api/reference/users#edit_user).
  - *Get videos uploaded by user*. [IDL specification](api-Vimeo__operation-getVideosUploadedByUser.idl). Link to the [API documentation](https://developer.vimeo.com/api/reference/videos#get_videos).
- [**Weather Company Data**](https://twcservice.mybluemix.net/rest-api/?_ga=2.216780950.1077140740.1578932427-1138945265.1575532646&cm_mc_uid=01540670708715755326464&cm_mc_sid_50200000=50819341578932426703):
  - *Get daily almanac of location*. [IDL specification](api-WeatherCompany__operation-almanacServicesLocationDaily.idl). Link to the [API documentation](https://twcservice.mybluemix.net/rest-api/?_ga=2.216780950.1077140740.1578932427-1138945265.1575532646&cm_mc_uid=01540670708715755326464&cm_mc_sid_50200000=50819341578932426703#!/Almanac_Services/v1pcdailyalmanac).
  - *Search locations*. [IDL specification](api-WeatherCompany__operation-locationServices.idl). Link to the [API documentation](https://twcservice.mybluemix.net/rest-api/?_ga=2.216780950.1077140740.1578932427-1138945265.1575532646&cm_mc_uid=01540670708715755326464&cm_mc_sid_50200000=50819341578932426703#!/Location_Services/v3locSearch).
