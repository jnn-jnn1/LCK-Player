package com.backend.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class CookieController {
    @GetMapping("get")
    public String getCookie(HttpServletResponse response) {
        response.setHeader("Set-Cookie", "ASID=70aca010000001888f87328700000054; Path=/; HttpOnly Domain=.naver.com; SameSite=None; Secure;");
        response.setHeader("Set-Cookie", "BUC=8WinDWeNhdFuOyGzNrzXInkH14gg2HefJnGGQ0vr2jA=; Path=/; HttpOnly Domain=.naver.com; SameSite=None; Secure;");
        response.setHeader("Set-Cookie", "NFS=2; Path=/; HttpOnly Domain=.naver.com; SameSite=None; Secure;");
        response.setHeader("Set-Cookie", "NNB=JQ22YHUGJVXGI; Path=/; HttpOnly Domain=.naver.com; SameSite=None; Secure;");
        response.setHeader("Set-Cookie", "_ga=GA1.2.1001908560.1699938478; Path=/; HttpOnly Domain=.naver.com; SameSite=None; Secure;");
        response.setHeader("Set-Cookie", "_ga_TRZJRRXM9H=GS1.2.1699938478.1.1.1699939607.0.0.0; Path=/; HttpOnly Domain=.naver.com; SameSite=None; Secure;");
        response.setHeader("Set-Cookie", "ba.uuid=2e971d78-7749-4932-ad58-85587f43afde; Path=/; HttpOnly Domain=.naver.com; SameSite=None; Secure;");
        response.setHeader("Set-Cookie", "page_uid=iD37Ldqo1Sosseg+kwCssssstOd-380182; Path=/; HttpOnly Domain=.naver.com; SameSite=None; Secure;");

        return null;
    }
}
