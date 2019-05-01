# jrmapi
jrmapi is a wrapper over the REST Cloud API for the reMarkable e-paper tablet implemented in Java8. It allows the access to the reMarkable files from a Java application via an easy-to-use API.

# usage
It is currently in an initial stage of development, so, even if it supports mostly all the file API operations, it currently does not yet support authentication. To use it you must generate a user token yourself and put it in the attribute USER_TOKEN in the class Authentication.

```
mput /Papers
```

# api support
- [] authentication
- [x] list documents
- [x] download a pdf (inside a zip)
- [x] download an epub (inside a zip)
- [] extract the document from the downloaded zip file and rename it correctly
- [x] create new directory
- [x] upload a pdf
- [] upload an epub
- [] move a file
- [x] delete an entry (document or directory)
- [] improved error control

# thanks
Many thanks to the incredible https://github.com/juruen/rmapi project, it provides a lot of insight. The documents compiled in https://github.com/splitbrain/ReMarkableAPI are also a must for reMarkable API development.

# disclaimer
The project is provided as-is, without warranty or support. The usage of the reMarkable Cloud API is

The author(s) and contributor(s) are not associated with reMarkable AS, Norway. reMarkable is a registered trademark of reMarkable AS in some countries. Please see https://remarkable.com for their product.