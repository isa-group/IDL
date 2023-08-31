---
title: "How to use IDL"
description: "One page summary of how to start a new Doks project."
lead: ""
date: 2020-11-16T13:59:39+01:00
lastmod: 2020-11-16T13:59:39+01:00
draft: false
images: []
menu:
  docs:
    parent: "idl"
weight: 110
toc: true
---

IDL dependencies can be straightforwardly specified in OAS specifications using **IDL4OAS**, an OAS extension. You just need to include the keyword **x-dependencies** at the operation level, and include the list of dependencies as an array. Take a look at this simple example:

```markdown
paths:
  /example/route:
    get:
      operationId: exampleOperation
      parameters:
        - in: query
          type: boolean
          required: false
          name: p1
        - in: query
          type: integer
          required: false
          name: p2
        - in: query
          type: string
          required: false
          name: p3
      x-dependencies:
        - Or(p1, p2, p3);
        - IF p1==true THEN p2;
```
