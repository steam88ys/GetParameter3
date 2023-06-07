package kr.hs.study.GetParameter3.controller;

import kr.hs.study.GetParameter3.dto.join;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;

@Controller
public class parameterController {

    // HttpServletRequet
//    @PostMapping("/login")
//    public String join(HttpServletRequest req) {
//        String id = req.getParameter("id");
//        String pass = req.getParameter("pass");
//        String name = req.getParameter("name");
//        String email = req.getParameter("email");
//        String tel = req.getParameter("tel");
//        String local = req.getParameter("local");
//        System.out.println("id: "+id);
//        System.out.println("pass: "+pass);
//        System.out.println("name: "+name);
//        System.out.println("email: "+email);
//        System.out.println("tel: "+tel);
//        System.out.println("local: "+local);
//        return "result";
//    }

    // WebRequest
//    @PostMapping("/login")
//    public String join(WebRequest req) {
//        String id = req.getParameter("id");
//        String pass = req.getParameter("pass");
//        String name = req.getParameter("name");
//        String email = req.getParameter("email");
//        String tel = req.getParameter("tel");
//        String local = req.getParameter("local");
//        System.out.println("id: "+id);
//        System.out.println("pass: "+pass);
//        System.out.println("name: "+name);
//        System.out.println("email: "+email);
//        System.out.println("tel: "+tel);
//        System.out.println("local: "+local);
//        return "result";
//    }

    // @RequestParam
//    @PostMapping("/login")
//    public String join(@RequestParam("id") String id,
//                       @RequestParam("pass") String pass,
//                       @RequestParam("name") String name,
//                       @RequestParam("email") String email,
//                       @RequestParam("tel") String tel,
//                       @RequestParam("local") String local) {
//        System.out.println("id: "+id);
//        System.out.println("pass: "+pass);
//        System.out.println("name: "+name);
//        System.out.println("email: "+email);
//        System.out.println("tel: "+tel);
//        System.out.println("local: "+local);
//        return "result";
//    }

    // @ModelAttribute
    @PostMapping("/login")
    public String join(@ModelAttribute join t ){
        System.out.println("id: "+t.getId());
        System.out.println("pass: "+t.getPass());
        System.out.println("name: "+t.getName());
        System.out.println("email: "+t.getEmail());
        System.out.println("tel: "+t.getTel());
        System.out.println("local: "+t.getLocal());
        return "result";
    }
}
