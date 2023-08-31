# Hyas images

Image render hook + shortcode for Hyas sites.

## Status

[![npm (scoped)](https://img.shields.io/npm/v/@hyas/images?style=flat-square)](https://www.npmjs.com/package/@hyas/images) [![GitHub Workflow Status](https://img.shields.io/github/workflow/status/h-enk/hyas-images/CodeQL?style=flat-square)]((https://github.com/h-enk/hyas-images/actions/workflows/codeql.yml))

## Installation

```bash
npm i @hyas/images -D
```

## Setup

Add to `./config/_default/module.toml`:

```toml
[[mounts]]
  source = "layouts"
  target = "layouts"

[[mounts]]
  source = "node_modules/@hyas/images/layouts"
  target = "layouts"
```

Add to `./config/_default/params.toml`:

```bash
# Images
imageResponsive = true
imageConvertTo = "webp"
imageImageSizes = ["480","720","1080","1280","1600","2048"]
singleSize = false
imageAddClass = "img-fluid lazyload blur-up"
```

## Usage

See the Hyas docs: [Images](https://gethyas.com/docs/recipes/images/)


## Credits

Based on [DFD Hugo image handling module](https://github.com/danielfdickinson/image-handling-mod-hugo-dfd)
