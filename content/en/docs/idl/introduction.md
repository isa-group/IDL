---
title: "Introduction"
description: "Doks is a Hugo theme for building secure, fast, and SEO-ready documentation websites, which you can easily update and customize."
lead:
date: 2020-10-06T08:48:57+00:00
lastmod: 2020-10-06T08:48:57+00:00
draft: false
images: []
menu:
  docs:
    parent: "idl"
weight: 100
toc: true
---

REST APIs often include dependency constraints that restrict how two or more parameters can be combined to form valid API calls. These inter-parameter dependencies make it difficult to automatically interact with the services, since API specification languages offer little or no support for them. We carried out a <a href="https://personales.us.es/sergiosegura/files/papers/martinlopez19-icsoc.pdf" target="_blank">study on 40 industrial APIs</a> and found that 85% of them contain inter-parameter dependencies. More importantly, we classified all the dependencies found (over 600) into seven patterns, serving as the basis for future proposals for modeling and analyzing inter-parameter dependencies automatically.

## Catalogue of inter-parameter dependencies

### 1. Requires

The Requires dependency is the simplest pattern. If a parameter is used (or it has a certain value), then another parameter must be used too (or be set to a certain value).

{{< details "PayPal example" >}}

```markdown
//PayPay-Create invoice 
IF custom.label THEN custom.amount;
IF minimum_amount_due THEN allow_partial_payment==true;
```

{{< /details >}}

{{< details "Google Map example" >}}

```markdown
IF rankby=='distance' THEN NOT radius;
IF rankby=='distance' THEN Or(keyword, name, type);
minprice<=maxprice;
IF radius THEN NOT rankby;
```

{{< /details >}}

{{< details "Github example" >}}

```markdown
//Github - Create deployment status
IF state=='inactive' THEN Accept LIKE '*application/vnd.github.ant-man-preview+json*';
IF state=='in_progress'|'queued' THEN Accept LIKE '*application/vnd.github.flash-preview+json*';
IF log_url THEN Accept LIKE '*application/vnd.github.ant-man-preview+json*';
IF environment THEN Accept LIKE '*application/vnd.github.flash-preview+json*';
IF environment_url THEN Accept LIKE '*application/vnd.github.ant-man-preview+json*';
IF auto_inactive THEN Accept LIKE '*application/vnd.github.ant-man-preview+json*';
```

{{< /details >}}

### 2. Or

Out of two or more parameters, at least one must be used. For example, in the Flickr API, when setting the information of a photo, [the documentation states](https://www.flickr.com/services/api/flickr.photos.setMeta.html): “At least one of `description` or `title` must be set”.

{{< details "IDL example" >}}

```markdown
Or (description, title)
```

{{< /details >}}

### 3. OnlyOne

Out of two or more parameters, one, and only one of them must be used. As an example, in [the Twilio API]([https://](https://www.twilio.com/docs/sms/api/message-resource#create-a-message-resource)), when sending an SMS, only one of `From` or `MessagingServiceSid` must be used: “You must also include either the `From` parameter or `MessagingServiceSid` parameter”.

{{< details "IDL example" >}}

```markdown
OnlyOne (From, MessagingServiceSid)
```

{{< /details >}}

### 4. AllOrNone

Out of two or more parameters, either all of them are used, or none of them. An instance of this dependency can be found in [the GitHub API]([https://](https://docs.github.com/en/rest/users#get-contextual-information-for-a-user--parameters)), between the parameters `subject_id` and `subject_type` of the operation GET /users/{username}/hovercard, as shown in the screenshot below:

<div class="card">
      <img src="https://miro.medium.com/max/1400/1*0pu1fwxCItpmJw7-qD-Dyg.png" alt="AllOrNone" >
</div>

{{< details "IDL example" >}}

```markdown
AllOrNone (subject_id, subject_type)
```

{{< /details >}}

### 5. ZeroOrOne

Out of two or more parameters, either zero or one can be used, but not more. This dependency can also be found in the YouTube search operation mentioned above, involving four input parameters `forContentOwner`, `forDeveloper`, `forMine` and `relatedToVideoId`:

<div class="card">
      <img src="https://miro.medium.com/max/1400/1*6NyO7_-O1wfAw20Nduh_0Q.png" alt="ZeroOrOne" >
</div>

{{< details "IDL example" >}}

```markdown
ZeroOrOne (forContentOwner, forDeveloper, forMine, relatedToVideoId)
```

{{< /details >}}

### 6. Arithmetic/Relational

Two or more parameters are related by means of arithmetic (+, –, ×, ÷) or relational (<, ≤, >, ≥, =, ≠) operators. The most common shape of this dependency pattern is two parameters where one must be greater than or equal to the other, i.e., `p1 ≥ p2`. This happens with dates, times, IDs, prices, etc.

Other patterns are also possible. For example, in [the Yelp API]([https://](https://www.yelp.com/developers/documentation/v3/business_search)), when searching for businesses, the sum of `limit + offset` (parameters for paginating the results) must be less than or equal to 1000, otherwise the API returns an error: “Using the `offset` and `limit` parameters, you can get up to 1000 businesses from this endpoint if there are more than 1000 results. If you request a page out of this 1000 business limit, this endpoint will return an error”.

{{< details "IDL example" >}}

```markdown
limit + offset <= 1000
```

{{< /details >}}

### 7. Complex

This pattern is simply a combination of two or more of the previous patterns. Based on our review, it is typical to see combinations of the Requires and the OnlyOne dependencies. See the following example from the Tumblr API. A post can be of different types, depending on the value of the type parameter. If type='video', then either the embed or the data parameter must be included too.

## Some stats

Some of these dependencies are more common than others. For example, Requires and ZeroOrOne dependencies are very recurrent across the APIs analyzed in our study, while Or and Complex are not so much. See the following charts for a summary.

<div class="card">
      <img src="https://miro.medium.com/max/1400/1*C_JU_DU3V90_ZWNHrhcmLw.png" alt="idl" >
</div>
Frequency of the dependencies according to the number of occurrences and the number of APIs (out of 40) presenting them.

## References

[1] Martin-Lopez, A., Segura, S., Ruiz-Cort´es, A.: A catalogue of inter-parameter dependencies in restful web apis. In: Yangui, S., Bouassida Rodriguez, I., Drira, K., Tari, Z. (eds.) Service-Oriented Computing. pp. 399–414. Springer International
Publishing, Cham (2019)
