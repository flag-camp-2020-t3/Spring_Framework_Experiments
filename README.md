# Spring_Framework_Experiments
Toy Projects Practice Using Spring Framework; Please feel free to fork and create branch of your experiments

## Instruction
https://octoperf.com/blog/2018/03/08/securing-rest-api-spring-security/

## Test in Command Line
```
# command 1: register
curl -XPOST -d 'username=john&password=smith' http://localhost:8080/public/users/register
# output: 8730ff0a-98d6-4ecc-94a2-cf6c96f4bdf9

# command 2: login
curl -XPOST -d 'username=john&password=smith' http://localhost:8080/public/users/login
# output: 4e304186-9e48-4f46-9828-acecaa9dba5b

# command 3: dummy endpoint get current user
curl -H 'Authorization: Bearer 4e304186-9e48-4f46-9828-acecaa9dba5b' http://localhost:8080/users/current
# output: {"id":"4e304186-9e48-4f46-9828-acecaa9dba5b","username":"john","enabled":true}

# command 4: logout
curl -H 'Authorization: Bearer 4e304186-9e48-4f46-9828-acecaa9dba5b' http://localhost:8080/users/logout
# output: true

curl -H 'Authorization: Bearer eded5130-6cb7-41d6-9e5f-f0baef3eacd4 http://localhost:8081/users/logout
```
