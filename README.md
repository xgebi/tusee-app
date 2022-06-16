# Tusee App

Tusee project is split into three repositories

1. tusee-auth
    - handles login, registration and other authentication things
2. tusee-app
    - handles every request apart from authentication
3. tusee-fe
   - front-end for back-ends

## Build & Run ##

```sh
$ cd tusee-auth
$ sbt
> jetty:start
> browse
```

If `browse` doesn't launch your browser, manually open [http://localhost:8080/](http://localhost:5000/) in your browser.
