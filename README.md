# Run
- run sso-client1 App.java (127.0.0.1:8080)
- run sso-client2 App.java (127.0.0.1:8060)
- run sso-server App.java (127.0.0.1:9999)
- open browser, visit http://127.0.0.1:8060/client2/index.html will requeire login
- login with any username and "123456" as password
- will be able to visit http://127.0.0.1:8080/client1/index.html
